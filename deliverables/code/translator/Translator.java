import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

import org.apache.commons.io.FilenameUtils;

public class Translator
{
    private static String targetLanguage;

    public String translate(Path path, boolean importStdLibrary)
    {
        CharStream input = null;

        try
        {
            input = CharStreams.fromPath(path);
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

        EluneLexer lexer = new EluneLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        EluneParser parser = new EluneParser(tokens);

        EluneTranslator translator = new EluneTranslator(false, importStdLibrary);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(translator, parser.root());

        return translator.render();
    }

    private class EluneTranslator extends EluneBaseListener
    {
        private final StringBuilder translatedCode = new StringBuilder();
        private final List<String> globalScope = new ArrayList<>();
        private Block currentBlock = new Block(null);
        private int switchCount = 0;
        private int loopCount = 0;

        private final List<ParserRuleContext> insideTriggers = new ArrayList<>();
        private final boolean innerTranslator;
        private final boolean importStdLibrary;

        private final EluneExprTranslator exprTranslator = new EluneExprTranslator(this);

        public EluneTranslator(boolean innerTranslator)
        {
            this.innerTranslator = innerTranslator;
            this.importStdLibrary = false;
        }

        public EluneTranslator(boolean innerTranslator, boolean importStdLibrary)
        {
            this.innerTranslator = innerTranslator;
            this.importStdLibrary = importStdLibrary;
        }

        public Block getCurrentBlock()
        {
            return currentBlock;
        }

        public void setCurrentBlock(Block newBlock)
        {
            currentBlock = newBlock;
        }

        @Override
        public void enterRoot(EluneParser.RootContext ctx)
        {
            if (importStdLibrary)
            {
                generateFile("./source/lib/std.elu", false);

                Map<String, Object> map = new HashMap<>();

                map.put("name", "std");
                map.put("assign", false);

                if (innerTranslator)
                    translatedCode.append(" ").append(Renderer.gen("importModule", map, true)).append(";");
                else
                    translatedCode.append(Renderer.gen("importModule", map)).append("\n");
            }
        }

        @Override
        public void enterSep(EluneParser.SepContext ctx)
        {
            translatedCode.append(Renderer.gen("sep", null, true));

            if (!innerTranslator)
                translatedCode.append("\n");
        }

        @Override
        public void enterBreak(EluneParser.BreakContext ctx)
        {
            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("break", null, true)).append(";");
            else
                translatedCode.append(Renderer.gen("break", null)).append("\n");
        }

        @Override
        public void enterContinue(EluneParser.ContinueContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("num", loopCount);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("continue", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("continue", map)).append("\n");
        }

        @Override
        public void enterLabel(EluneParser.LabelContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("text", ctx.NAME().getText());

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("label", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("label", map)).append("\n");
        }

        @Override
        public void enterGoto(EluneParser.GotoContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("label", ctx.NAME().getText());

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("goto", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("goto", map)).append("\n");
        }

        @Override
        public void enterGlobalVar(EluneParser.GlobalVarContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            List<String> varList = new ArrayList<>();

            for (int i = 0; i < ctx.varlist().getChildCount(); i++)
            {
                if (!ctx.varlist().getChild(i).getText().equals(","))
                    varList.add(exprTranslator.visit(ctx.varlist().getChild(i)));
            }

            map.put("names", varList.toArray());

            List<String> valueList = new ArrayList<>();

            for (int i = 0; i < ctx.explist().getChildCount(); i++)
            {
                if (!ctx.explist().getChild(i).getText().equals(","))
                    valueList.add(exprTranslator.visit(ctx.explist().getChild(i)));
            }

            map.put("values", valueList.toArray());

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("globalVar", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("globalVar", map)).append("\n");

            globalScope.addAll(varList);
        }

        @Override
        public void enterVar(EluneParser.VarContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();
            boolean isDec = true;
            boolean isElement = false;
            List<String> scope = getScope();

            List<String> varList = new ArrayList<>();

            for (int i = 0; i < ctx.varlist().getChildCount(); i++)
            {
                String varName = ctx.varlist().getChild(i).getText().equals(",") ? "," : exprTranslator.visit(ctx.varlist().getChild(i));

                if (varName.contains("."))
                    isElement = true;

                if (scope.contains(varName.split("\\[")[0]))
                    isDec = false;
                else
                    currentBlock.putVarInScope(varName);

                if (!varName.equals(","))
                    varList.add(varName);
            }

            map.put("names", varList.toArray());

            List<String> valueList = new ArrayList<>();

            for (int i = 0; i < ctx.explist().getChildCount(); i++)
            {
                if (!ctx.explist().getChild(i).getText().equals(","))
                    valueList.add(exprTranslator.visit(ctx.explist().getChild(i)));
            }

            map.put("values", valueList.toArray());

            String templateName;

            if (isElement)
                templateName = "globalVar";
            else if (isDec)
                templateName = "varDec";
            else
                templateName = "varAssign";

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen(templateName, map, true)).append(";");
            else
                translatedCode.append(Renderer.gen(templateName, map)).append("\n");
        }

        @Override
        public void enterGlobalFunc(EluneParser.GlobalFuncContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            map.put("name", ctx.funcname().getText());
            Block newBlock = new Block(currentBlock);

            List<String> args = new ArrayList<>();

            if (ctx.funcbody().parlist() != null)
            {
                if (ctx.funcbody().parlist().namelist() != null)
                {
                    for (int i = 0; i < ctx.funcbody().parlist().namelist().getChildCount(); i++)
                    {
                        if (!ctx.funcbody().parlist().namelist().getChild(i).getText().equals(","))
                        {
                            String arg = exprTranslator.visit(ctx.funcbody().parlist().namelist().getChild(i));
                            args.add(arg);
                            newBlock.putVarInScope(arg);
                            newBlock.addParam(arg);
                        }
                    }

                    if (ctx.funcbody().parlist().getChildCount() > 1)
                    {
                        args.add("...");
                        newBlock.addParam("...");
                    }
                }
                else
                {
                    args.add("...");
                    newBlock.addParam("...");
                }
            }

            map.put("args", args);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("globalFuncDef", map, true));
            else
                translatedCode.append("\n").append(Renderer.gen("globalFuncDef", map)).append("\n");

            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitGlobalFunc(EluneParser.GlobalFuncContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("end", null, true)).append(";");
            else
                translatedCode.append(Renderer.gen("end", null)).append("\n");
        }

        @Override
        public void enterFunc(EluneParser.FuncContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            map.put("name", ctx.NAME().getText());
            Block newBlock = new Block(currentBlock);

            List<String> args = new ArrayList<>();

            if (ctx.funcbody().parlist() != null)
            {
                if (ctx.funcbody().parlist().namelist() != null)
                {
                    for (int i = 0; i < ctx.funcbody().parlist().namelist().getChildCount(); i++)
                    {
                        if (!ctx.funcbody().parlist().namelist().getChild(i).getText().equals(","))
                        {
                            String arg = exprTranslator.visit(ctx.funcbody().parlist().namelist().getChild(i));
                            args.add(arg);
                            newBlock.putVarInScope(arg);
                            newBlock.addParam(arg);
                        }
                    }

                    if (ctx.funcbody().parlist().getChildCount() > 1)
                    {
                        args.add("...");
                        newBlock.addParam("...");
                    }
                }
                else
                {
                    args.add("...");
                    newBlock.addParam("...");
                }
            }

            map.put("args", args);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("funcDef", map, true));
            else
                translatedCode.append("\n").append(Renderer.gen("funcDef", map)).append("\n");

            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitFunc(EluneParser.FuncContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("end", null, true)).append(";");
            else
                translatedCode.append(Renderer.gen("end", null)).append("\n");
        }

        @Override
        public void enterObjFunc(EluneParser.ObjFuncContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            map.put("name", ctx.funcname().getText());
            Block newBlock = new Block(currentBlock);

            List<String> args = new ArrayList<>();

            if (ctx.funcbody().parlist() != null)
            {
                if (ctx.funcbody().parlist().namelist() != null)
                {
                    for (int i = 0; i < ctx.funcbody().parlist().namelist().getChildCount(); i++)
                    {
                        if (!ctx.funcbody().parlist().namelist().getChild(i).getText().equals(","))
                        {
                            String arg = exprTranslator.visit(ctx.funcbody().parlist().namelist().getChild(i));
                            args.add(arg);
                            newBlock.putVarInScope(arg);
                            newBlock.addParam(arg);
                        }
                    }

                    if (ctx.funcbody().parlist().getChildCount() > 1)
                    {
                        args.add("...");
                        newBlock.addParam("...");
                    }
                }
                else
                {
                    args.add("...");
                    newBlock.addParam("...");
                }
            }

            map.put("args", args);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("globalFuncDef", map, true));
            else
                translatedCode.append("\n").append(Renderer.gen("globalFuncDef", map)).append("\n");

            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitObjFunc(EluneParser.ObjFuncContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("end", null, true)).append(";");
            else
                translatedCode.append(Renderer.gen("end", null)).append("\n");
        }

        @Override
        public void exitAnondef(EluneParser.AnondefContext ctx)
        {
            insideTriggers.remove(ctx);
        }

        @Override
        public void enterDo(EluneParser.DoContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Block newBlock = new Block(currentBlock);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("do", null, true));
            else
                translatedCode.append(Renderer.gen("do", null)).append("\n");

            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitDo(EluneParser.DoContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("end", null, true)).append(";");
            else
                translatedCode.append(Renderer.gen("end", null)).append("\n\n");
        }

        @Override
        public void enterDoWhile(EluneParser.DoWhileContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Block newBlock = new Block(currentBlock);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("doWhile", null, true));
            else
                translatedCode.append(Renderer.gen("doWhile", null)).append("\n");

            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitDoWhile(EluneParser.DoWhileContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            map.put("num", loopCount);
            map.put("cond", exprTranslator.visit(ctx.exp()));

            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("doWhileEnd", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("doWhileEnd", map)).append("\n\n");

            loopCount++;
        }

        @Override
        public void enterWhile(EluneParser.WhileContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            map.put("cond", exprTranslator.visit(ctx.exp()));

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("while", map, true));
            else
                translatedCode.append(Renderer.gen("while", map)).append("\n");

            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitWhile(EluneParser.WhileContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;

            Map<String, Object> map = new HashMap<>();
            map.put("num", loopCount);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("loopEnd", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("loopEnd", map)).append("\n\n");

            loopCount++;
        }

        @Override
        public void enterFor(EluneParser.ForContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            map.put("var", ctx.NAME().getText());
            newBlock.putVarInScope(ctx.NAME().getText());

            map.put("start", exprTranslator.visit(ctx.exp(0)));
            map.put("end", exprTranslator.visit(ctx.exp(1)));
            map.put("inc", exprTranslator.visit(ctx.exp(2)));

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("for", map, true));
            else
                translatedCode.append(Renderer.gen("for", map)).append("\n");

            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitFor(EluneParser.ForContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;

            Map<String, Object> map = new HashMap<>();

            map.put("num", loopCount);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("loopEnd", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("loopEnd", map)).append("\n\n");

            loopCount++;
        }

        @Override
        public void enterForeach(EluneParser.ForeachContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            if (ctx.NAME().size() > 1)
            {
                map.put("index", ctx.NAME(0).getText());
                map.put("element", ctx.NAME(1).getText());
            }
            else
            {
                map.put("element", ctx.NAME(0).getText());
            }

            map.put("list", exprTranslator.visit(ctx.explist()));

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("forEach", map, true));
            else
                translatedCode.append(Renderer.gen("forEach", map)).append("\n");

            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitForeach(EluneParser.ForeachContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;

            Map<String, Object> map = new HashMap<>();

            map.put("num", loopCount);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("loopEnd", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("loopEnd", map)).append("\n\n");

            loopCount++;
        }

        @Override
        public void enterIfStmt(EluneParser.IfStmtContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            map.put("cond", exprTranslator.visit(ctx.exp()));

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("if", map, true));
            else
                translatedCode.append(Renderer.gen("if", map)).append("\n");

            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitIfStmt(EluneParser.IfStmtContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;
        }

        @Override
        public void enterElseIfStmt(EluneParser.ElseIfStmtContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            map.put("cond", exprTranslator.visit(ctx.exp()));

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("elseIf", map, true));
            else
                translatedCode.append(Renderer.gen("elseIf", map)).append("\n");

            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitElseIfStmt(EluneParser.ElseIfStmtContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;
        }

        @Override
        public void enterElseStmt(EluneParser.ElseStmtContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Block newBlock = new Block(currentBlock);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("else", null, true));
            else
                translatedCode.append(Renderer.gen("else", null)).append("\n");

            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitElseStmt(EluneParser.ElseStmtContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;
        }

        @Override
        public void exitIfElse(EluneParser.IfElseContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("end", null, true)).append(";");
            else
                translatedCode.append(Renderer.gen("end", null)).append("\n\n");
        }

        @Override
        public void enterSwitch(EluneParser.SwitchContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            insideTriggers.add(ctx);

            List<String> switchCases = new ArrayList<>();

            for (int i = 0; i < ctx.exp().size(); i++)
            {
                map.put("case", exprTranslator.visit(ctx.exp(i)));

                EluneTranslator translator = new EluneTranslator(true);
                translator.currentBlock = newBlock;

                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(translator, ctx.block(i));

                map.put("action", translator.render());

                switchCount += translator.switchCount;
                loopCount += translator.loopCount;

                switchCases.add(Renderer.gen("switchCase", map) + ",");
            }

            map.clear();

            map.put("num", switchCount);
            map.put("var", exprTranslator.visit(ctx.var_()));
            map.put("cases", switchCases);

            if (ctx.block().size() > ctx.exp().size())
            {
                EluneTranslator translator = new EluneTranslator(true);
                translator.currentBlock = newBlock;

                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(translator, ctx.block(ctx.exp().size()));

                switchCount += translator.switchCount;

                map.put("def", translator.render());
            }
            else
            {
                map.put("def", null);
            }

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("switch", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("switch", map)).append("\n\n");
        }

        @Override
        public void exitSwitch(EluneParser.SwitchContext ctx)
        {
            if (insideTriggers.remove(ctx))
                switchCount++;
        }

        @Override
        public void enterTryStmt(EluneParser.TryStmtContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            insideTriggers.add(ctx);

            EluneTranslator translator = new EluneTranslator(true);
            translator.currentBlock = newBlock;

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(translator, ctx.block());

            map.put("block", translator.render());

            map.put("args", getFunctionParams());

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("try", map, true));
            else
                translatedCode.append(Renderer.gen("try", map)).append("\n");
        }

        @Override
        public void exitTryStmt(EluneParser.TryStmtContext ctx)
        {
            insideTriggers.remove(ctx);
        }

        @Override
        public void enterCatchStmt(EluneParser.CatchStmtContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Block newBlock = new Block(currentBlock);

            insideTriggers.add(ctx);

            Renderer.increaseTab();

            for (int i = 0; i < ctx.block().size(); i++)
            {
                Map<String, Object> map = new HashMap<>();

                map.put("exception", ctx.NAME(i).getText());

                EluneTranslator translator = new EluneTranslator(true);
                translator.currentBlock = newBlock;

                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(translator, ctx.block(i));

                map.put("action", translator.render());

                if (innerTranslator)
                    translatedCode.append(" ").append(Renderer.gen("catch", map, true));
                else
                    translatedCode.append(Renderer.gen("catch", map)).append("\n");
            }

            Renderer.decreaseTab();
        }

        @Override
        public void exitCatchStmt(EluneParser.CatchStmtContext ctx)
        {
            insideTriggers.remove(ctx);
        }

        @Override
        public void enterFinallyStmt(EluneParser.FinallyStmtContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Block newBlock = new Block(currentBlock);

            Map<String, Object> map = new HashMap<>();

            insideTriggers.add(ctx);

            EluneTranslator translator = new EluneTranslator(true);
            translator.currentBlock = newBlock;

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(translator, ctx.block());

            map.put("block", translator.render());

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("end", null, true)).append("\n").append(Renderer.gen("finally", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("end", null)).append("\n").append(Renderer.gen("finally", map)).append("\n");
        }

        @Override
        public void exitFinallyStmt(EluneParser.FinallyStmtContext ctx)
        {
            insideTriggers.remove(ctx);
        }

        @Override
        public void exitTryCatch(EluneParser.TryCatchContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            if (innerTranslator)
            {
                if (ctx.finallyStmt() == null)
                    translatedCode.append(" ").append(Renderer.gen("end", null, true)).append(";");
                else
                    translatedCode.append(";");
            }
            else
            {
                if (ctx.finallyStmt() == null)
                    translatedCode.append(" ").append(Renderer.gen("end", null, true)).append("\n\n");
                else
                    translatedCode.append("\n\n");
            }
        }

        @Override
        public void enterException(EluneParser.ExceptionContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            map.put("return", ctx.NAME().getText());

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("exception", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("exception", map)).append("\n");
        }

        @Override
        public void enterFunctioncall(EluneParser.FunctioncallContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            StringBuilder functionCall = new StringBuilder();
            functionCall.append(exprTranslator.visit(ctx.varOrExp()));

            for (int i = 0; i < ctx.nameAndArgs().size(); i++)
            {
                Map<String, Object> map = new HashMap<>();

                if (ctx.nameAndArgs(i).NAME() != null)
                    map.put("name", ctx.nameAndArgs(i).NAME().getText());

                if (ctx.nameAndArgs(i).args() != null)
                    map.put("args", exprTranslator.visit(ctx.nameAndArgs(i).args()));

                functionCall.append(Renderer.gen("prefixExp", map, true));
            }

            if (innerTranslator)
                translatedCode.append(" ").append(functionCall).append(";");
            else
                translatedCode.append(Renderer.getTab()).append(functionCall).append("\n");
        }

        @Override
        public void enterAssign(EluneParser.AssignContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            if (innerTranslator)
                translatedCode.append(" ").append(exprTranslator.visit(ctx)).append(";");
            else
                translatedCode.append(Renderer.getTab()).append(exprTranslator.visit(ctx)).append("\n");
        }

        @Override
        public void enterPrint(EluneParser.PrintContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            map.put("exp", exprTranslator.visit(ctx.exp()));

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("print", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("print", map)).append("\n");
        }

        @Override
        public void enterPrintBrackets(EluneParser.PrintBracketsContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            map.put("exp", exprTranslator.visit(ctx.exp()));

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("print", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("print", map)).append("\n");
        }

        @Override
        public void enterRetstat(EluneParser.RetstatContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();
            List<String> values = new ArrayList<>();

            if (ctx.explist() != null)
            {
                for (int i = 0; i < ctx.explist().getChildCount(); i++)
                {
                    if (!ctx.explist().getChild(i).getText().equals(",") || !ctx.explist().getChild(i).getText().equals(" "))
                        values.add(exprTranslator.visit(ctx.explist().getChild(i)));
                }
            }

            map.put("values", values);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("return", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("return", map)).append("\n");
        }

        @Override
        public void enterImportModule(EluneParser.ImportModuleContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            generateFile("./source/lib/" + ctx.NAME().getText().toLowerCase(Locale.ROOT) + ".elu");

            Map<String, Object> map = new HashMap<>();

            map.put("name", ctx.NAME().getText().toLowerCase(Locale.ROOT));
            map.put("assign", true);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("importModule", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("importModule", map)).append("\n");
        }

        public List<String> getScope()
        {
            List<String> scope = getGlobalScope();
            scope.addAll(Objects.requireNonNull(getLocalScope()));
            return scope;
        }

        public List<String> getGlobalScope()
        {
            return globalScope;
        }

        public List<String> getLocalScope()
        {
            if (currentBlock != null)
                return currentBlock.getScope();
            else
                return null;
        }

        public List<String> getFunctionParams()
        {
            return currentBlock.getParams();
        }

        public String render()
        {
            return translatedCode.toString();
        }
    }

    private static class Block
    {
        private final List<String> blockScope = new ArrayList<>();
        private final Set<String> params = new HashSet<>();
        private final Block parentBlock;

        public Block(Block parentBlock)
        {
            this.parentBlock = parentBlock;
        }

        public void putVarInScope(String varName)
        {
            blockScope.add(varName);
        }

        public void addParam(String parameterName)
        {
            params.add(parameterName);
        }

        public List<String> getScope()
        {
            List<String> scope = new ArrayList<>(blockScope);

            if (parentBlock != null)
                scope.addAll(parentBlock.getScope());

            return scope;
        }

        public List<String> getParams()
        {
            List<String> params = new ArrayList<>(this.params);

            if (parentBlock != null)
                params.addAll(parentBlock.getParams());

            return params;
        }
    }

    private class EluneExprTranslator extends EluneBaseVisitor<String>
    {
        private final EluneTranslator translator;

        public EluneExprTranslator(EluneTranslator translator)
        {
            this.translator = translator;
        }

        @Override
        public String visitName(EluneParser.NameContext ctx)
        {
            return ctx.NAME().getText();
        }

        @Override
        public String visitInt(EluneParser.IntContext ctx)
        {
            return ctx.getText();
        }

        @Override
        public String visitHex(EluneParser.HexContext ctx)
        {
            return ctx.getText();
        }

        @Override
        public String visitFloat(EluneParser.FloatContext ctx)
        {
            return ctx.getText();
        }

        @Override
        public String visitHexFloat(EluneParser.HexFloatContext ctx)
        {
            return ctx.getText();
        }

        @Override
        public String visitString(EluneParser.StringContext ctx)
        {
            return ctx.getText();
        }

        @Override
        public String visitTrue(EluneParser.TrueContext ctx) { return "true"; }

        @Override
        public String visitFalse(EluneParser.FalseContext ctx) { return "false"; }

        @Override
        public String visitNull(EluneParser.NullContext ctx) { return "nil"; }

        @Override
        public String visitBracketsExp(EluneParser.BracketsExpContext ctx)
        {
            return "(" + this.visit(ctx.exp()) + ")";
        }

        @Override
        public String visitVar_(EluneParser.Var_Context ctx)
        {
            StringBuilder var = new StringBuilder();

            if (ctx.NAME() != null)
            {
                var.append(ctx.NAME().getText());
            }
            if (ctx.exp() != null)
            {
                 var.append("(").append(this.visit(ctx.exp())).append(")");
            }
            if (ctx.varSuffix().size() > 0)
            {
                for (int i = 0; i < ctx.varSuffix().size(); i++)
                {
                    var.append(this.visit(ctx.varSuffix(i)));
                }
            }

            return var.toString();
        }

        @Override
        public String visitVarSuffix(EluneParser.VarSuffixContext ctx)
        {
            StringBuilder varSuffix = new StringBuilder();

            if (ctx.nameAndArgs().size() > 0)
            {
                for (int i = 0; i < ctx.nameAndArgs().size(); i++)
                {
                    varSuffix.append(this.visit(ctx.nameAndArgs(i)));
                }
            }
            if (ctx.exp() != null)
            {
                varSuffix.append("[").append(this.visit(ctx.exp())).append("]");
            }
            if (ctx.NAME() != null)
            {
                varSuffix.append(".").append(ctx.NAME().getText());
            }

            return varSuffix.toString();
        }

        @Override
        public String visitNameAndArgs(EluneParser.NameAndArgsContext ctx)
        {
            StringBuilder nameAndArgs = new StringBuilder();

            if (ctx.NAME() != null)
            {
                nameAndArgs.append(":").append(ctx.NAME().getText());
            }
            if (ctx.args() != null)
            {
                nameAndArgs.append(this.visit(ctx.args()));
            }

            return nameAndArgs.toString();
        }

        @Override
        public String visitArray(EluneParser.ArrayContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            List<String> elements = new ArrayList<>();

            if (ctx.explist() != null)
            {
                for (int i = 0; i < ctx.explist().exp().size(); i++)
                {
                    elements.add(this.visit(ctx.explist().exp(i)));
                }
            }

            map.put("elements", elements);

            return Renderer.gen("dictionary", map, true);
        }

        @Override
        public String visitDictionary(EluneParser.DictionaryContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            List<String> elements = new ArrayList<>();

            if (ctx.fieldlist() != null)
            {
                for (int i = 0; i < ctx.fieldlist().field().size(); i++)
                {
                    elements.add(this.visit(ctx.fieldlist().field(i)));
                }
            }

            map.put("elements", elements);

            return Renderer.gen("dictionary", map, true);
        }

        @Override
        public String visitExprField(EluneParser.ExprFieldContext ctx)
        {
            return "[" + this.visit(ctx.exp(0)) + "] = " + this.visit(ctx.exp(1));
        }

        @Override
        public String visitVarField(EluneParser.VarFieldContext ctx)
        {
            return ctx.NAME().getText() + " = " + this.visit(ctx.exp());
        }

        @Override
        public String visitIndexedField(EluneParser.IndexedFieldContext ctx)
        {
            return this.visit(ctx.exp());
        }

        @Override
        public String visitFieldsep(EluneParser.FieldsepContext ctx)
        {
            return ctx.getText() + " ";
        }

        @Override
        public String visitLength(EluneParser.LengthContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("var", this.visit(ctx.exp()));

            return Renderer.gen("len", map, true);
        }

        @Override
        public String visitLengthBrackets(EluneParser.LengthBracketsContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("var", this.visit(ctx.exp()));

            return Renderer.gen("len", map, true);
        }

        @Override
        public String visitPrefixexp(EluneParser.PrefixexpContext ctx)
        {
            StringBuilder functionCall = new StringBuilder();
            functionCall.append(this.visit(ctx.varOrExp()));

            for (int i = 0; i < ctx.nameAndArgs().size(); i++)
            {
                Map<String, Object> map = new HashMap<>();

                if (ctx.nameAndArgs(i).NAME() != null)
                    map.put("name", ctx.nameAndArgs(i).NAME().getText());

                if (ctx.nameAndArgs(i).args() != null)
                    map.put("args", this.visit(ctx.nameAndArgs(i).args()));

                functionCall.append(Renderer.gen("prefixExp", map, true));
            }

            return functionCall.toString();
        }

        @Override
        public String visitAnondef(EluneParser.AnondefContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            EluneTranslator insideTranslator = new EluneTranslator(true);
            Block newBlock = new Block(translator.getCurrentBlock());

            List<String> args = new ArrayList<>();

            for (int i = 0; i < ctx.anonlist().NAME().size(); i++)
            {
                String arg = ctx.anonlist().NAME(i).getText();
                args.add(arg);
                newBlock.putVarInScope(arg);
            }

            map.put("args", args);

            insideTranslator.setCurrentBlock(newBlock);
            translator.insideTriggers.add(ctx);

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(insideTranslator, ctx.block());

            translator.switchCount += insideTranslator.switchCount;
            translator.loopCount += insideTranslator.loopCount;

            return Renderer.gen("anonFuncDef", map, true) + insideTranslator.render() + " " + Renderer.gen("end", null, true);
        }

        @Override
        public String visitExprArgs(EluneParser.ExprArgsContext ctx)
        {
            Map<String, Object> map = new HashMap<>();
            List<String> args = new ArrayList<>();

            if (ctx.explist() != null)
            {
                for (int i = 0; i < ctx.explist().getChildCount(); i++)
                {
                    args.add(this.visit(ctx.explist().getChild(i)));
                }
            }

            map.put("args", args);

            return Renderer.gen("funcCall", map, true);
        }

        @Override
        public String visitAllArgs(EluneParser.AllArgsContext ctx)
        {
            return "...";
        }

        @Override
        public String visitConcat(EluneParser.ConcatContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", "..");

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public String visitAnd(EluneParser.AndContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", "and");

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public String visitOr(EluneParser.OrContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", "or");

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public String visitBitwise(EluneParser.BitwiseContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", ctx.operatorBitwise().getText());

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public String visitAddSub(EluneParser.AddSubContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", ctx.operatorAddSub().getText());

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public String visitMulDivMod(EluneParser.MulDivModContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", ctx.operatorMulDivMod().getText());

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public String visitUnary(EluneParser.UnaryContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("y", this.visit(ctx.exp()));
            map.put("symbol", ctx.operatorUnary().getText());

            return Renderer.gen("unaryOperatorExpr", map, true);
        }

        @Override
        public String visitPower(EluneParser.PowerContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", ctx.operatorPower().getText());

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public String visitCompare(EluneParser.CompareContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", ctx.operatorComparison().getText().equals("!=") ? "~=" :
                    (ctx.operatorComparison().getText().equals("is") ? "==" : ctx.operatorComparison().getText()));

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public String visitAssignexp(EluneParser.AssignexpContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.var_()));
            map.put("y", this.visit(ctx.exp()));
            map.put("symbol", ctx.compoundassign().getText().replace("=", ""));

            return Renderer.gen("compoundAssign", map, true);
        }
    }

    private class EluneExpression
    {
        private final String expression;
        private final EluneType type;

        public EluneExpression(String expression, EluneType type)
        {
            this.expression = expression;
            this.type = type;
        }

        @Override
        public String toString()
        {
            return expression;
        }
    }

    private static class Renderer
    {
        private static final STGroup stf = new STGroupFile("templates/"
                + targetLanguage.substring(0, 1).toUpperCase(Locale.ROOT)
                + targetLanguage.substring(1, targetLanguage.length()).toLowerCase(Locale.ROOT)
                + "Template.stg");
        private static int tabLevel = 0;

        public static String gen(String name, Map<String, Object> varMap)
        {
            return gen(name, varMap, false);
        }

        public static String gen(String name, Map<String, Object> varMap, boolean isExpression)
        {
            final ST st = stf.getInstanceOf(name);

            if (varMap != null)
            {
                for (String varName : varMap.keySet())
                {
                    try
                    {
                        st.add(varName, varMap.get(varName));
                    }
                    catch (NullPointerException ex)
                    {
                        ex.printStackTrace();
                    }
                }
            }

            if (isExpression)
            {
                return st.render().trim();
            }
            else
            {
                StringBuilder output = new StringBuilder();
                String[] lines = st.render().trim().split("(?<=" + System.getProperty("line.separator") + ")");

                for (String line : lines)
                {
                    output.append(getTab()).append(line);
                }

                return output.toString();
            }
        }

        public static String getTab() { return "\t".repeat(tabLevel); }

        public static void increaseTab()
        {
            tabLevel++;
        }

        public static void decreaseTab()
        {
            tabLevel--;
        }
    }

    public static void main(String[] args)
    {
        targetLanguage = args[1];
        generateFile(args[0]);
    }

    public static void generateFile(String pathname) { generateFile(pathname, true); }

    public static void generateFile(String pathname, boolean importStd)
    {
        Path path = new File(pathname).toPath();

        Translator translator = new Translator();

        try
        {
            File outputFile = new File("./source/gen/" + FilenameUtils.removeExtension(path.getFileName().toString()) + "." + targetLanguage.toLowerCase(Locale.ROOT));

            if (outputFile.exists())
                outputFile.delete();

            outputFile.getParentFile().mkdirs();
            outputFile.createNewFile();

            FileWriter writer = new FileWriter(outputFile.getAbsolutePath());
            writer.write(translator.translate(path, importStd));
            writer.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
