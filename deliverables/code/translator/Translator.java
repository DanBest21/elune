import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

import org.apache.commons.io.FilenameUtils;

public class Translator
{
    public String translate(Path path)
    {
        CharStream input = null;

        try
        {
            input = CharStreams.fromPath(path);
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }

        EluneLexer lexer = new EluneLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EluneParser parser = new EluneParser(tokens);

        EluneTranslator translator = new EluneTranslator(false);
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

        private boolean insideBlock = false;
        private ParserRuleContext insideTrigger = null;
        private final boolean innerTranslator;

        private final EluneExprTranslator<String> exprTranslator = new EluneExprTranslator<>(this);

        public EluneTranslator(boolean innerTranslator)
        {
            this.innerTranslator = innerTranslator;
        }

        public Block getCurrentBlock()
        {
            return currentBlock;
        }

        public void setCurrentBlock(Block newBlock)
        {
            currentBlock = newBlock;
        }

        public void toggleInsideBlock() { insideBlock = !insideBlock; }

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
                translatedCode.append(Renderer.gen("break", null, true)).append(";");
            else
                translatedCode.append(Renderer.gen("break", null)).append("\n");
        }

        @Override
        public void enterContinue(EluneParser.ContinueContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("num", loopCount);

            if (innerTranslator)
                translatedCode.append(Renderer.gen("continue", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("continue", map)).append("\n");
        }

        @Override
        public void enterLabel(EluneParser.LabelContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("text", ctx.NAME().getText());

            if (innerTranslator)
                translatedCode.append(Renderer.gen("label", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("label", map)).append("\n");
        }

        @Override
        public void enterGoto(EluneParser.GotoContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("label", ctx.NAME().getText());

            if (innerTranslator)
                translatedCode.append(Renderer.gen("goto", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("goto", map)).append("\n");
        }

        @Override
        public void enterGlobalVar(EluneParser.GlobalVarContext ctx)
        {
            if (insideBlock)
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
            if (insideBlock)
                return;

            Map<String, Object> map = new HashMap<>();
            boolean isDec = true;
            List<String> scope = getScope();

            List<String> varList = new ArrayList<>();

            for (int i = 0; i < ctx.varlist().getChildCount(); i++)
            {
                String varName = ctx.varlist().getChild(i).getText().equals(",") ? "," : exprTranslator.visit(ctx.varlist().getChild(i));

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

            if (isDec)
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
            if (insideBlock)
                return;

            Map<String, Object> map = new HashMap<>();

            map.put("name", ctx.funcname().getText());
            Block newBlock = new Block(currentBlock);

            List<String> args = new ArrayList<>();

            for (int i = 0; i < ctx.funcbody().parlist().namelist().getChildCount(); i++)
            {
                if (!ctx.funcbody().parlist().namelist().getChild(i).getText().equals(","))
                {
                    String arg = exprTranslator.visit(ctx.funcbody().parlist().namelist().getChild(i));
                    args.add(arg);
                    newBlock.putVarInScope(arg);
                }
            }

            if (ctx.funcbody().parlist().getChildCount() > 1)
                args.add("...");

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
            if (insideBlock)
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
            if (insideBlock)
                return;

            Map<String, Object> map = new HashMap<>();

            map.put("name", ctx.NAME().getText());
            Block newBlock = new Block(currentBlock);

            List<String> args = new ArrayList<>();

            for (int i = 0; i < ctx.funcbody().parlist().namelist().getChildCount(); i++)
            {
                if (!ctx.funcbody().parlist().namelist().getChild(i).getText().equals(","))
                {
                    String arg = exprTranslator.visit(ctx.funcbody().parlist().namelist().getChild(i));
                    args.add(arg);
                    newBlock.putVarInScope(arg);
                }
            }

            if (ctx.funcbody().parlist().getChildCount() > 1)
                args.add("...");

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
            if (insideBlock)
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
            if (insideBlock)
                return;

            Map<String, Object> map = new HashMap<>();

            map.put("name", ctx.funcname().getText());
            Block newBlock = new Block(currentBlock);

            List<String> args = new ArrayList<>();

            for (int i = 0; i < ctx.funcbody().parlist().namelist().getChildCount(); i++)
            {
                if (!ctx.funcbody().parlist().namelist().getChild(i).getText().equals(","))
                {
                    String arg = exprTranslator.visit(ctx.funcbody().parlist().namelist().getChild(i));
                    args.add(arg);
                    newBlock.putVarInScope(arg);
                }
            }

            if (ctx.funcbody().parlist().getChildCount() > 1)
                args.add("...");

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
            if (insideBlock)
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
            if (insideTrigger.equals(ctx))
            {
                toggleInsideBlock();
                insideTrigger = null;
            }
        }

        @Override
        public void enterDo(EluneParser.DoContext ctx)
        {
            if (insideBlock)
                return;

            Block newBlock = new Block(currentBlock);

            if (innerTranslator)
                translatedCode.append(Renderer.gen("do", null, true));
            else
                translatedCode.append(Renderer.gen("do", null)).append("\n");

            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitDo(EluneParser.DoContext ctx)
        {
            if (insideBlock)
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
            if (insideBlock)
                return;

            Block newBlock = new Block(currentBlock);

            if (innerTranslator)
                translatedCode.append(Renderer.gen("doWhile", null, true));
            else
                translatedCode.append(Renderer.gen("doWhile", null)).append("\n");

            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitDoWhile(EluneParser.DoWhileContext ctx)
        {
            if (insideBlock)
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
            if (insideBlock)
                return;

            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            map.put("cond", exprTranslator.visit(ctx.exp()));

            if (innerTranslator)
                translatedCode.append(Renderer.gen("while", map, true));
            else
                translatedCode.append(Renderer.gen("while", map)).append("\n");

            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitWhile(EluneParser.WhileContext ctx)
        {
            if (insideBlock)
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
            if (insideBlock)
                return;

            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            map.put("var", ctx.NAME().getText());
            newBlock.putVarInScope(ctx.NAME().getText());

            map.put("start", exprTranslator.visit(ctx.exp(0)));
            map.put("end", exprTranslator.visit(ctx.exp(1)));
            map.put("inc", exprTranslator.visit(ctx.exp(2)));

            if (innerTranslator)
                translatedCode.append(Renderer.gen("for", map, true));
            else
                translatedCode.append(Renderer.gen("for", map)).append("\n");

            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitFor(EluneParser.ForContext ctx)
        {
            if (insideBlock)
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
            if (insideBlock)
                return;

            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            map.put("element", ctx.NAME().getText());
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
            if (insideBlock)
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
            if (insideBlock)
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
            if (insideBlock)
                return;

            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;
        }

        @Override
        public void enterElseIfStmt(EluneParser.ElseIfStmtContext ctx)
        {
            if (insideBlock)
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
            if (insideBlock)
                return;

            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;
        }

        @Override
        public void enterElseStmt(EluneParser.ElseStmtContext ctx)
        {
            if (insideBlock)
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
            if (insideBlock)
                return;

            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;
        }

        @Override
        public void exitIfElse(EluneParser.IfElseContext ctx)
        {
            if (insideBlock)
                return;

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("end", null, true)).append(";");
            else
                translatedCode.append(Renderer.gen("end", null)).append("\n\n");
        }

        @Override
        public void enterSwitch(EluneParser.SwitchContext ctx)
        {
            if (insideBlock)
                return;

            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            toggleInsideBlock();
            insideTrigger = ctx;

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
                translatedCode.append(Renderer.gen("switch", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("switch", map)).append("\n\n");
        }

        @Override
        public void exitSwitch(EluneParser.SwitchContext ctx)
        {
            if (insideTrigger.equals(ctx))
            {
                toggleInsideBlock();
                insideTrigger = null;
                switchCount++;
            }
        }

        @Override
        public void enterTryStmt(EluneParser.TryStmtContext ctx)
        {
            if (insideBlock)
                return;

            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            toggleInsideBlock();
            insideTrigger = ctx;

            EluneTranslator translator = new EluneTranslator(true);
            translator.currentBlock = newBlock;

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(translator, ctx.block());

            map.put("block", translator.render());

            if (innerTranslator)
                translatedCode.append(Renderer.gen("try", map, true));
            else
                translatedCode.append(Renderer.gen("try", map)).append("\n");
        }

        @Override
        public void exitTryStmt(EluneParser.TryStmtContext ctx)
        {
            if (insideTrigger.equals(ctx))
            {
                toggleInsideBlock();
                insideTrigger = null;
            }
        }

        @Override
        public void enterCatchStmt(EluneParser.CatchStmtContext ctx)
        {
            if (insideBlock)
                return;

            Block newBlock = new Block(currentBlock);

            toggleInsideBlock();
            insideTrigger = ctx;

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
                    translatedCode.append(Renderer.gen("catch", map, true));
                else
                    translatedCode.append(Renderer.gen("catch", map)).append("\n");
            }

            Renderer.decreaseTab();
        }

        @Override
        public void exitCatchStmt(EluneParser.CatchStmtContext ctx)
        {
            if (insideTrigger.equals(ctx))
            {
                toggleInsideBlock();
                insideTrigger = null;
            }
        }

        @Override
        public void enterFinallyStmt(EluneParser.FinallyStmtContext ctx)
        {
            if (insideBlock)
                return;

            Block newBlock = new Block(currentBlock);

            Map<String, Object> map = new HashMap<>();

            toggleInsideBlock();
            insideTrigger = ctx;

            EluneTranslator translator = new EluneTranslator(true);
            translator.currentBlock = newBlock;

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(translator, ctx.block());

            map.put("block", translator.render());

            if (innerTranslator)
                translatedCode.append(Renderer.gen("end", null, true)).append("\n").append(Renderer.gen("finally", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("end", null)).append("\n").append(Renderer.gen("finally", map)).append("\n");
        }

        @Override
        public void exitFinallyStmt(EluneParser.FinallyStmtContext ctx)
        {
            if (insideTrigger.equals(ctx))
            {
                toggleInsideBlock();
                insideTrigger = null;
            }
        }

        @Override
        public void exitTryCatch(EluneParser.TryCatchContext ctx)
        {
            if (insideBlock)
                return;

            if (innerTranslator)
            {
                if (ctx.finallyStmt() == null)
                    translatedCode.append(Renderer.gen("end", null, true)).append(";");
                else
                    translatedCode.append(";");
            }
            else
            {
                if (ctx.finallyStmt() == null)
                    translatedCode.append(Renderer.gen("end", null, true)).append("\n\n");
                else
                    translatedCode.append("\n\n");
            }
        }

        @Override
        public void enterException(EluneParser.ExceptionContext ctx)
        {
            if (insideBlock)
                return;

            Map<String, Object> map = new HashMap<>();

            map.put("return", ctx.NAME().getText());

            if (innerTranslator)
                translatedCode.append(Renderer.gen("exception", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("exception", map)).append("\n");
        }

        @Override
        public void enterFunctioncall(EluneParser.FunctioncallContext ctx)
        {
            if (insideBlock)
                return;

            StringBuilder functionCall = new StringBuilder();
            functionCall.append(exprTranslator.visit(ctx.varOrExp()));

            for (int i = 0; i < ctx.nameAndArgs().size(); i++)
            {
                Map<java.lang.String, Object> map = new HashMap<>();
                List<java.lang.String> args = new ArrayList<>();

                if (ctx.nameAndArgs(i).NAME() != null)
                    map.put("name", ":" + exprTranslator.visit(ctx.nameAndArgs(i).NAME()));

                for (int j = 0; j < ctx.nameAndArgs(i).getChildCount(); j++)
                {
                    args.add(exprTranslator.visit(ctx.nameAndArgs(i).args()));
                }

                map.put("args", args);

                if (innerTranslator)
                    functionCall.append(Renderer.gen("prefixExp", map, true));
                else
                    functionCall.append(Renderer.gen("prefixExp", map));
            }

            if (innerTranslator)
                translatedCode.append(" ").append(functionCall).append(";");
            else
                translatedCode.append(functionCall).append("\n");
        }

        @Override
        public void enterAssign(EluneParser.AssignContext ctx)
        {
            if (insideBlock)
                return;

            if (innerTranslator)
                translatedCode.append(" ").append(exprTranslator.visit(ctx)).append(";");
            else
                translatedCode.append(Renderer.getTab()).append(exprTranslator.visit(ctx)).append("\n");
        }

        @Override
        public void enterPrint(EluneParser.PrintContext ctx)
        {
            if (insideBlock)
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
            if (insideBlock)
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
            if (insideBlock)
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
            if (insideBlock)
                return;

            generateFile("./source/lib/" + ctx.NAME().getText().toLowerCase(Locale.ROOT) + ".elu");

            Map<String, Object> map = new HashMap<>();

            map.put("name", ctx.NAME().getText().toLowerCase(Locale.ROOT));

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("importModule", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("importModule", map)).append("\n");
        }

        public List<String> getScope()
        {
            List<String> scope = new ArrayList<>(globalScope);

            if (currentBlock != null)
                scope.addAll(currentBlock.getScope());

            return scope;
        }

        public String render()
        {
            return translatedCode.toString();
        }
    }

    private static class Block
    {
        private final List<String> blockScope = new ArrayList<>();
        private final Block parentBlock;

        public Block(Block parentBlock)
        {
            this.parentBlock = parentBlock;
        }

        public void putVarInScope(String varName)
        {
            blockScope.add(varName);
        }

        public List<String> getScope()
        {
            List<String> scope = new ArrayList<>(blockScope);

            if (parentBlock != null)
                scope.addAll(parentBlock.getScope());

            return scope;
        }
    }

    private class EluneExprTranslator<String> extends EluneBaseVisitor<java.lang.String>
    {
        private final EluneTranslator translator;

        public EluneExprTranslator(EluneTranslator translator)
        {
            this.translator = translator;
        }

        @Override
        public java.lang.String visitName(EluneParser.NameContext ctx)
        {
            return ctx.NAME().getText();
        }

        @Override
        public java.lang.String visitNumber(EluneParser.NumberContext ctx)
        {
            return ctx.getText();
        }

        @Override
        public java.lang.String visitString(EluneParser.StringContext ctx)
        {
            return ctx.getText();
        }

        @Override
        public java.lang.String visitTrue(EluneParser.TrueContext ctx) { return "true"; }

        @Override
        public java.lang.String visitFalse(EluneParser.FalseContext ctx) { return "false"; }

        @Override
        public java.lang.String visitNull(EluneParser.NullContext ctx) { return "nil"; }

        @Override
        public java.lang.String visitVar_(EluneParser.Var_Context ctx)
        {
            StringBuilder var = new StringBuilder();

            if (ctx.NAME() != null)
            {
                var.append(ctx.NAME().getText());
            }
            if (ctx.exp() != null)
            {
                 var.append(this.visit(ctx.exp()));
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
        public java.lang.String visitVarSuffix(EluneParser.VarSuffixContext ctx)
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
        public java.lang.String visitNameAndArgs(EluneParser.NameAndArgsContext ctx)
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
        public java.lang.String visitTableconstructor(EluneParser.TableconstructorContext ctx)
        {
            if (ctx.fieldlist() != null)
                return "{" + this.visit(ctx.fieldlist()) + "}";
            else
                return "{}";
        }

        @Override
        public java.lang.String visitFieldlist(EluneParser.FieldlistContext ctx)
        {
            StringBuilder fieldList = new StringBuilder();

            for (int i = 0; i < ctx.getChildCount(); i++)
            {
                fieldList.append(this.visit(ctx.getChild(i)));
            }

            return fieldList.toString();
        }

        @Override
        public java.lang.String visitExprField(EluneParser.ExprFieldContext ctx)
        {
            return "[" + this.visit(ctx.exp(0)) + "] = " + this.visit(ctx.exp(1));
        }

        @Override
        public java.lang.String visitVarField(EluneParser.VarFieldContext ctx)
        {
            return ctx.NAME().getText() + " = " + this.visit(ctx.exp());
        }

        @Override
        public java.lang.String visitIndexedField(EluneParser.IndexedFieldContext ctx)
        {
            return this.visit(ctx.exp());
        }

        @Override
        public java.lang.String visitFieldsep(EluneParser.FieldsepContext ctx)
        {
            return ctx.getText() + " ";
        }

        @Override
        public java.lang.String visitLength(EluneParser.LengthContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();

            map.put("var", this.visit(ctx.exp()));

            return Renderer.gen("len", map, true);
        }

        @Override
        public java.lang.String visitLengthBrackets(EluneParser.LengthBracketsContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();

            map.put("var", this.visit(ctx.exp()));

            return Renderer.gen("len", map, true);
        }

        @Override
        public java.lang.String visitPrefixexp(EluneParser.PrefixexpContext ctx)
        {
            StringBuilder functionCall = new StringBuilder();
            functionCall.append(this.visit(ctx.varOrExp()));

            for (int i = 0; i < ctx.nameAndArgs().size(); i++)
            {
                Map<java.lang.String, Object> map = new HashMap<>();
                List<java.lang.String> args = new ArrayList<>();

                if (ctx.nameAndArgs(i).NAME() != null)
                    map.put("name", ":" + this.visit(ctx.nameAndArgs(i).NAME()));

                for (int j = 0; j < ctx.nameAndArgs(i).getChildCount(); j++)
                {
                    args.add(this.visit(ctx.nameAndArgs(i).args()));
                }

                map.put("args", args);

                functionCall.append(Renderer.gen("prefixExp", map, true));
            }

            return functionCall.toString();
        }

        @Override
        public java.lang.String visitAnondef(EluneParser.AnondefContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();

            EluneTranslator insideTranslator = new EluneTranslator(true);
            Block newBlock = new Block(translator.getCurrentBlock());

            List<java.lang.String> args = new ArrayList<>();

            for (int i = 0; i < ctx.anonlist().NAME().size(); i++)
            {
                java.lang.String arg = ctx.anonlist().NAME(i).getText();
                args.add(arg);
                newBlock.putVarInScope(arg);
            }

            map.put("args", args);

            insideTranslator.setCurrentBlock(newBlock);
            translator.toggleInsideBlock();
            translator.insideTrigger = ctx;

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(insideTranslator, ctx.block());

            translator.switchCount += insideTranslator.switchCount;
            translator.loopCount += insideTranslator.loopCount;

            return Renderer.gen("anonFuncDef", map, true) + insideTranslator.render() + " " + Renderer.gen("end", null, true);
        }

        @Override
        public java.lang.String visitExprArgs(EluneParser.ExprArgsContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();
            List<java.lang.String> args = new ArrayList<>();

            for (int i = 0; i < ctx.explist().getChildCount(); i++)
            {
                args.add(this.visit(ctx.explist().getChild(i)));
            }

            map.put("args", args);

            return Renderer.gen("funcCall", map, true);
        }

        @Override
        public java.lang.String visitConcat(EluneParser.ConcatContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", "..");

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public java.lang.String visitAnd(EluneParser.AndContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", "and");

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public java.lang.String visitOr(EluneParser.OrContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", "or");

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public java.lang.String visitBitwise(EluneParser.BitwiseContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", ctx.operatorBitwise().getText());

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public java.lang.String visitAddSub(EluneParser.AddSubContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", ctx.operatorAddSub().getText());

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public java.lang.String visitMulDivMod(EluneParser.MulDivModContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", ctx.operatorMulDivMod().getText());

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public java.lang.String visitUnary(EluneParser.UnaryContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();

            map.put("y", this.visit(ctx.exp()));
            map.put("symbol", ctx.operatorUnary().getText());

            return Renderer.gen("unaryOperatorExpr", map, true);
        }

        @Override
        public java.lang.String visitPower(EluneParser.PowerContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", ctx.operatorPower().getText());

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public java.lang.String visitCompare(EluneParser.CompareContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", ctx.operatorComparison().getText().equals("!=") ? "~=" :
                    (ctx.operatorComparison().getText().equals("is") ? "==" : ctx.operatorComparison().getText()));

            return Renderer.gen("operatorExpr", map, true);
        }

        @Override
        public java.lang.String visitAssignexp(EluneParser.AssignexpContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.var_()));
            map.put("y", this.visit(ctx.exp()));
            map.put("symbol", ctx.compoundassign().getText().replace("=", ""));

            return Renderer.gen("compoundAssign", map, true);
        }
    }

    private static class Renderer
    {
        private static final STGroup stf = new STGroupFile("templates/LuaTemplate.stg");
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
        generateFile(args[0]);
    }

    public static void generateFile(String pathname)
    {
        Path path = new File(pathname).toPath();

        Translator translator = new Translator();

        try
        {
            File outputFile = new File("./source/gen/" + FilenameUtils.removeExtension(path.getFileName().toString()) + ".lua");

            if (outputFile.exists())
                outputFile.delete();

            outputFile.getParentFile().mkdirs();
            outputFile.createNewFile();

            FileWriter writer = new FileWriter(outputFile.getAbsolutePath());
            writer.write(translator.translate(path));
            writer.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
