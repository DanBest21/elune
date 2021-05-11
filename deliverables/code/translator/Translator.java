import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

import org.apache.commons.io.FilenameUtils;

public class Translator
{
    private static String targetLanguage;

    public EluneTranslator translate(Path path, boolean importStdLibrary, boolean disableContinue, boolean disableImports)
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

        EluneTranslator translator = new EluneTranslator(FilenameUtils.removeExtension(path.getFileName().toString()),
                false, importStdLibrary, disableContinue, disableImports);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(translator, parser.root());

        return translator;
    }

    private class EluneTranslator extends EluneBaseListener
    {
        private final StringBuilder translatedCode = new StringBuilder();
        private final Set<EluneExpression> globalScope = new HashSet<>();
        private Block currentBlock = new Block(null);
        private int switchCount = 0;
        private int loopCount = 0;

        private final List<ParserRuleContext> insideTriggers = new ArrayList<>();
        private final boolean innerTranslator;
        private final boolean importStdLibrary;
        private final boolean disableContinue;
        private final boolean disableImports;
        private final String moduleName;

        private final EluneExprTranslator exprTranslator = new EluneExprTranslator(this);

        public EluneTranslator(String moduleName, boolean innerTranslator, boolean importStdLibrary, boolean disableContinue, boolean disableImports)
        {
            this.innerTranslator = innerTranslator;
            this.importStdLibrary = importStdLibrary;
            this.moduleName = moduleName;
            this.disableContinue = disableContinue;
            this.disableImports = disableImports;
        }

        public EluneTranslator(EluneTranslator outerTranslator, boolean disableContinue, boolean disableImports)
        {
            this.innerTranslator = true;
            this.importStdLibrary = false;
            this.disableContinue = disableContinue;
            this.disableImports = disableImports;

            moduleName = outerTranslator.moduleName;
            globalScope.addAll(outerTranslator.getGlobalScope());
            currentBlock.blockScope.addAll(Objects.requireNonNull(outerTranslator.getLocalScope()));
            currentBlock.params.addAll(outerTranslator.getFunctionParams());
            switchCount = outerTranslator.switchCount;
            loopCount = outerTranslator.loopCount;
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
            if (targetLanguage.equals("lua"))
            {
                globalScope.add(new EluneExpression("arg", EluneType.ARRAY));
            }

            if (importStdLibrary)
            {
                EluneTranslator translation = generateFile("./source/lib/std.elu", false, disableContinue, disableImports);

                if (disableImports)
                {
                    globalScope.addAll(translation.getScope());
                    return;
                }

                Map<String, Object> map = new HashMap<>();

                map.put("name", "std");
                map.put("assign", false);

                if (innerTranslator)
                    translatedCode.append(" ").append(Renderer.gen("importModule", map, true)).append(";");
                else
                    translatedCode.append(Renderer.gen("importModule", map)).append("\n");

                globalScope.addAll(translation.getScope());
            }
        }

        @Override
        public void enterSep(EluneParser.SepContext ctx)
        {
            String seperator = Renderer.gen("sep", null, true);

            translatedCode.append(translatedCode.toString().endsWith(seperator) ? "" : seperator);

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

            List<EluneExpression> varList = new ArrayList<>();

            for (int i = 0; i < ctx.varlist().var_().size(); i++)
            {
                varList.add(exprTranslator.visit(ctx.varlist().var_(i)));
            }

            map.put("names", varList.toArray());

            List<EluneExpression> valueList = new ArrayList<>();

            for (int i = 0; i < ctx.explist().exp().size(); i++)
            {
                valueList.add(exprTranslator.visit(ctx.explist().exp(i)));
            }

            map.put("values", valueList.toArray());

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("globalVar", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("globalVar", map)).append("\n");

            for (int i = 0; i < varList.size(); i++)
            {
                if (varList.get(i).expression.equals("_"))
                    continue;

                if (varList.size() != valueList.size())
                {
                    if (valueList.size() == 1 && valueList.get(0).type == EluneType.FUNCTION)
                    {
                        currentBlock.putVarInScope(new EluneExpression(varList.get(i).expression, null));
                    }
                    else
                    {
                        System.err.println("Variable Declaration Error: The number of value assignments is not the same as the number of variables declared.");
                        System.exit(1);
                    }
                }

                globalScope.add(new EluneExpression(varList.get(i).expression, valueList.get(i).type));
            }
        }

        @Override
        public void enterVar(EluneParser.VarContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();
            boolean isDec = true;
            boolean isElement = false;
            Set<EluneExpression> scope = getScope();

            List<EluneExpression> varList = new ArrayList<>();

            for (int i = 0; i < ctx.varlist().var_().size(); i++)
            {
                EluneExpression varExpression = exprTranslator.visit(ctx.varlist().var_(i));

                if (varExpression.expression.contains("."))
                    isElement = true;

                for (EluneExpression declaredVarExpression : scope)
                {
                    if (declaredVarExpression.expression.equals(varExpression.expression.split("\\[")[0]))
                    {
                        isDec = false;
                        break;
                    }
                }

                varList.add(varExpression);
            }

            map.put("names", varList.toArray());

            List<EluneExpression> valueList = new ArrayList<>();

            for (int i = 0; i < ctx.explist().exp().size(); i++)
            {
                 valueList.add(exprTranslator.visit(ctx.explist().exp(i)));
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

            if (isDec)
            {
                for (int i = 0; i < varList.size(); i++)
                {
                    if (varList.get(i).expression.equals("_"))
                        continue;

                    if (varList.size() != valueList.size())
                    {
                        if (valueList.size() == 1 && valueList.get(0).expression.endsWith(")"))
                        {
                            currentBlock.putVarInScope(new EluneExpression(varList.get(i).expression, null));
                        }
                        else
                        {
                            System.err.println("Variable Declaration Error: The number of value assignments is not the same as the number of variables declared.");
                            System.exit(1);
                        }
                    }
                    else
                    {
                        currentBlock.putVarInScope(new EluneExpression(varList.get(i).expression, valueList.get(i).type));
                    }
                }
            }
        }

        @Override
        public void enterGlobalFunc(EluneParser.GlobalFuncContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            map.put("name", ctx.funcname().getText());
            globalScope.add(new EluneExpression(map.get("name").toString(), EluneType.FUNCTION));
            Block newBlock = new Block(currentBlock);

            List<EluneExpression> args = new ArrayList<>();

            if (ctx.funcbody().parlist() != null)
            {
                if (ctx.funcbody().parlist().namelist() != null)
                {
                    for (int i = 0; i < ctx.funcbody().parlist().namelist().anonOrName().size(); i++)
                    {
                        EluneExpression arg = exprTranslator.visit(ctx.funcbody().parlist().namelist().anonOrName(i));
                        args.add(arg);
                        newBlock.putVarInScope(arg);
                        newBlock.addParam(arg);
                    }

                    if (ctx.funcbody().parlist().getChildCount() > 1)
                    {
                        EluneExpression additionalParamsExpression = new EluneExpression("...", null);
                        args.add(additionalParamsExpression);
                        newBlock.addParam(additionalParamsExpression);
                    }
                }
                else
                {
                    EluneExpression additionalParamsExpression = new EluneExpression("...", null);
                    args.add(additionalParamsExpression);
                    newBlock.addParam(additionalParamsExpression);
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
            currentBlock.putVarInScope(new EluneExpression(map.get("name").toString(), EluneType.FUNCTION));
            Block newBlock = new Block(currentBlock);

            List<EluneExpression> args = new ArrayList<>();

            if (ctx.funcbody().parlist() != null)
            {
                if (ctx.funcbody().parlist().namelist() != null)
                {
                    for (int i = 0; i < ctx.funcbody().parlist().namelist().anonOrName().size(); i++)
                    {
                        EluneExpression arg = exprTranslator.visit(ctx.funcbody().parlist().namelist().anonOrName(i));
                        args.add(arg);
                        newBlock.putVarInScope(arg);
                        newBlock.addParam(arg);
                    }

                    if (ctx.funcbody().parlist().getChildCount() > 1)
                    {
                        EluneExpression additionalParamsExpression = new EluneExpression("...", null);
                        args.add(additionalParamsExpression);
                        newBlock.addParam(additionalParamsExpression);
                    }
                }
                else
                {
                    EluneExpression additionalParamsExpression = new EluneExpression("...", null);
                    args.add(additionalParamsExpression);
                    newBlock.addParam(additionalParamsExpression);
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
            currentBlock.putVarInScope(new EluneExpression(map.get("name").toString(), EluneType.FUNCTION));
            Block newBlock = new Block(currentBlock);

            List<EluneExpression> args = new ArrayList<>();

            if (ctx.funcbody().parlist() != null)
            {
                if (ctx.funcbody().parlist().namelist() != null)
                {
                    for (int i = 0; i < ctx.funcbody().parlist().namelist().getChildCount(); i++)
                    {
                        if (!ctx.funcbody().parlist().namelist().getChild(i).getText().equals(","))
                        {
                            EluneExpression arg = exprTranslator.visit(ctx.funcbody().parlist().namelist().anonOrName(i));
                            args.add(arg);
                            newBlock.putVarInScope(arg);
                            newBlock.addParam(arg);
                        }
                    }

                    if (ctx.funcbody().parlist().getChildCount() > 1)
                    {
                        EluneExpression additionalParamsExpression = new EluneExpression("...", null);
                        args.add(additionalParamsExpression);
                        newBlock.addParam(additionalParamsExpression);
                    }
                }
                else
                {
                    EluneExpression additionalParamsExpression = new EluneExpression("...", null);
                    args.add(additionalParamsExpression);
                    newBlock.addParam(additionalParamsExpression);
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

            if (!disableContinue)
                map.put("num", loopCount);

            EluneExpression conditionExpression = exprTranslator.visit(ctx.exp());
            checkType(conditionExpression.expression, conditionExpression.type, EluneType.BOOLEAN);
            map.put("cond", conditionExpression);

            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("doWhileEnd", map, true)).append(";");
            else
                translatedCode.append("\t").append(Renderer.gen("doWhileEnd", map)).append("\n\n");

            loopCount++;
        }

        @Override
        public void enterWhile(EluneParser.WhileContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            EluneExpression conditionExpression = exprTranslator.visit(ctx.exp());
            checkType(conditionExpression.expression, conditionExpression.type, EluneType.BOOLEAN);
            map.put("cond", conditionExpression);

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

            Map<String, Object> map = new HashMap<>();

            if (!disableContinue)
                map.put("num", loopCount);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("loopEnd", map, true)).append(";");
            else
                translatedCode.append("\t").append(Renderer.gen("loopEnd", map)).append("\n\n");

            currentBlock = currentBlock.parentBlock;
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
            newBlock.putVarInScope(new EluneExpression(ctx.NAME().getText(), EluneType.INT));

            currentBlock = newBlock;

            EluneExpression startExpression = exprTranslator.visit(ctx.exp(0));
            checkType(startExpression.expression, startExpression.type, EluneType.INT);
            map.put("start", startExpression);

            EluneExpression endExpression = exprTranslator.visit(ctx.exp(1));
            checkType(endExpression.expression, endExpression.type, EluneType.BOOLEAN);
            map.put("end", endExpression);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("for", map, true));
            else
                translatedCode.append(Renderer.gen("for", map)).append("\n");

            Renderer.increaseTab();
        }

        @Override
        public void exitFor(EluneParser.ForContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Renderer.decreaseTab();

            Map<String, Object> map = new HashMap<>();

            if (!disableContinue)
                map.put("num", loopCount);

            EluneExpression incrementExpression = exprTranslator.visit(ctx.exp(2));
            checkType(incrementExpression.expression, incrementExpression.type, EluneType.INT);
            map.put("inc", incrementExpression);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("forEnd", map, true)).append(";");
            else
                translatedCode.append("\t").append(Renderer.gen("forEnd", map)).append("\n\n");

            currentBlock = currentBlock.parentBlock;
            loopCount++;
        }

        @Override
        public void enterForeach(EluneParser.ForeachContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            EluneExpression listExpression = exprTranslator.visit(ctx.explist());

            String templateName = "forEach";

            if (ctx.getChild(1).getText().equals("|") || ctx.getChild(3).getText().equals("|"))
                templateName = "forEachIterator";

            if (ctx.NAME().size() > 1)
            {
                map.put("index", ctx.NAME(0).getText());
                newBlock.putVarInScope(new EluneExpression(map.get("index").toString(), null));

                map.put("element", ctx.NAME(1).getText());
                newBlock.putVarInScope(new EluneExpression(map.get("element").toString(), null));

                currentBlock = newBlock;

                checkType(listExpression.expression, listExpression.type, EluneType.OBJECT);
            }
            else
            {
                map.put("element", ctx.NAME(0).getText());
                newBlock.putVarInScope(new EluneExpression(map.get("element").toString(), null));

                currentBlock = newBlock;

                checkType(listExpression.expression, listExpression.type, Arrays.asList(EluneType.ARRAY, EluneType.OBJECT));
            }

            map.put("list", listExpression);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen(templateName, map, true));
            else
                translatedCode.append(Renderer.gen(templateName, map)).append("\n");

            Renderer.increaseTab();
        }

        @Override
        public void exitForeach(EluneParser.ForeachContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Renderer.decreaseTab();

            Map<String, Object> map = new HashMap<>();

            if (!disableContinue)
                map.put("num", loopCount);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("loopEnd", map, true)).append(";");
            else
                translatedCode.append("\t").append(Renderer.gen("loopEnd", map)).append("\n\n");

            currentBlock = currentBlock.parentBlock;
            loopCount++;
        }

        @Override
        public void enterIfStmt(EluneParser.IfStmtContext ctx)
        {
            if (!insideTriggers.isEmpty())
                return;

            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            EluneExpression conditionExpression = exprTranslator.visit(ctx.exp());
            checkType(conditionExpression.expression, conditionExpression.type, EluneType.BOOLEAN);
            map.put("cond", conditionExpression);

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

            EluneExpression conditionExpression = exprTranslator.visit(ctx.exp());
            checkType(conditionExpression.expression, conditionExpression.type, EluneType.BOOLEAN);
            map.put("cond", conditionExpression);

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

            insideTriggers.add(ctx);

            List<String> switchCases = new ArrayList<>();

            EluneExpression varExpression = exprTranslator.visit(ctx.exp(0));
            EluneType varExpressionType = getType(varExpression.expression);

            for (int i = 1; i < ctx.exp().size(); i++)
            {
                EluneExpression caseExpression = exprTranslator.visit(ctx.exp(i));
                checkType(caseExpression.expression, caseExpression.type, varExpressionType);
                map.put("case", caseExpression);

                EluneTranslator translator = new EluneTranslator(this, disableContinue, disableImports);

                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(translator, ctx.block(i - 1));

                map.put("action", translator.render());

                switchCount = translator.switchCount;
                loopCount = translator.loopCount;

                switchCases.add(Renderer.gen("switchCase", map) + ",");
            }

            map.clear();

            map.put("num", switchCount);
            map.put("var", varExpression);
            map.put("cases", switchCases);

            if (ctx.block().size() > ctx.exp().size() - 1)
            {
                EluneTranslator translator = new EluneTranslator(this, disableContinue, disableImports);

                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(translator, ctx.block(ctx.exp().size() - 1));

                switchCount = translator.switchCount;
                loopCount = translator.loopCount;

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

            insideTriggers.add(ctx);

            EluneTranslator translator = new EluneTranslator(this, disableContinue, disableImports);

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(translator, ctx.block());

            switchCount = translator.switchCount;
            loopCount = translator.loopCount;

            map.put("block", translator.render());

            List<EluneExpression> params = getFunctionParams().stream().filter(p -> !p.expression.equals("...")).collect(Collectors.toList());
            params.add(new EluneExpression("...", null));
            map.put("args", params);

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

            insideTriggers.add(ctx);

            Renderer.increaseTab();

            for (int i = 0; i < ctx.block().size(); i++)
            {
                Map<String, Object> map = new HashMap<>();

                map.put("exception", ctx.NAME(i).getText());

                EluneTranslator translator = new EluneTranslator(this, disableContinue, disableImports);

                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(translator, ctx.block(i));

                switchCount = translator.switchCount;
                loopCount = translator.loopCount;

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

            Map<String, Object> map = new HashMap<>();

            insideTriggers.add(ctx);

            EluneTranslator translator = new EluneTranslator(this, disableContinue, disableImports);

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(translator, ctx.block());

            switchCount = translator.switchCount;
            loopCount = translator.loopCount;

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
            EluneExpression functionExpression = exprTranslator.visit(ctx.varOrExp());
            functionCall.append(functionExpression);

            for (int i = 0; i < ctx.nameAndArgs().size(); i++)
            {
                Map<String, Object> map = new HashMap<>();

                if (ctx.nameAndArgs(i).NAME() != null)
                {
                    map.put("name", ctx.nameAndArgs(i).NAME().getText());
                    String functionName = functionExpression.expression + ":" + ctx.nameAndArgs(i).NAME().getText();
                    checkType(functionName, getType(functionName, true), EluneType.FUNCTION);
                }
                else
                {
                    checkType(functionExpression.expression, functionExpression.type, EluneType.FUNCTION);
                }

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

            EluneExpression printExpression = exprTranslator.visit(ctx.exp());
            checkType(printExpression.expression, printExpression.type, Arrays.asList(EluneType.STRING, EluneType.INT, EluneType.FLOAT, EluneType.BOOLEAN, EluneType.NULL));
            map.put("exp", printExpression);

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

            EluneExpression printExpression = exprTranslator.visit(ctx.exp());
            checkType(printExpression.expression, printExpression.type, Arrays.asList(EluneType.STRING, EluneType.INT, EluneType.FLOAT, EluneType.BOOLEAN, EluneType.NULL));
            map.put("exp", printExpression);

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
            List<EluneExpression> values = new ArrayList<>();

            if (ctx.explist() != null)
            {
                for (int i = 0; i < ctx.explist().exp().size(); i++)
                {
                    values.add(exprTranslator.visit(ctx.explist().exp(i)));
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

            if (moduleName.equals(ctx.NAME().getText().toLowerCase(Locale.ROOT)))
            {
                System.err.println("Import error: Module '" + moduleName + "' cannot import itself.");
                System.exit(1);
            }

            EluneTranslator translation = generateFile("./source/lib/" + ctx.NAME().getText().toLowerCase(Locale.ROOT) + ".elu", true, disableContinue, disableImports);

            if (disableImports)
            {
                globalScope.addAll(translation.getScope());
                return;
            }

            Map<String, Object> map = new HashMap<>();

            map.put("name", ctx.NAME().getText().toLowerCase(Locale.ROOT));
            map.put("assign", true);

            if (innerTranslator)
                translatedCode.append(" ").append(Renderer.gen("importModule", map, true)).append(";");
            else
                translatedCode.append(Renderer.gen("importModule", map)).append("\n");

             globalScope.addAll(translation.getScope());
        }

        public Set<EluneExpression> getScope()
        {
            Set<EluneExpression> scope = new HashSet<>();
            scope.addAll(getGlobalScope());
            scope.addAll(Objects.requireNonNull(getLocalScope()));
            return scope;
        }

        public Set<EluneExpression> getGlobalScope()
        {
            return globalScope;
        }

        public Set<EluneExpression> getLocalScope()
        {
            if (currentBlock != null)
                return currentBlock.getScope();
            else
                return null;
        }

        public Set<EluneExpression> getFunctionParams()
        {
            return currentBlock.getParams();
        }

        public EluneType getType(String varName)
        {
            return getType(varName, false);
        }

        public EluneType getType(String varName, boolean acceptUnknownType)
        {
            if (varName.contains("(") || varName.contains("["))
                return null;

            try
            {
                for (EluneExpression var : getScope())
                {
                    if (var.expression.equals(varName))
                    {
                        return var.type;
                    }
                }

                if (varName.contains("."))
                {
                    for (EluneExpression var : getScope())
                    {
                        if (var.expression.equals(varName.split("\\.")[0]))
                        {
                            return null;
                        }
                    }
                }

                if (varName.contains(":"))
                {
                    for (EluneExpression var : getScope())
                    {
                        if (var.expression.equals(varName.split(":")[0]))
                        {
                            return EluneType.FUNCTION;
                        }
                    }
                }

                if (acceptUnknownType)
                    return null;

                throw new EluneTypeException("Variable '" + varName + "' was not found in the current scope.");
            }
            catch (EluneTypeException ex)
            {
                ex.printStackTrace();
                System.exit(1);
            }

            return null;
        }

        public void checkType(String value, EluneType actualType, EluneType expectedType)
        {
            checkType(value, actualType, expectedType, false, true);
        }

        public void checkType(String value, EluneType actualType, EluneType expectedType, boolean allowUnknown)
        {
            checkType(value, actualType, expectedType, false, allowUnknown);
        }

        public boolean checkType(String value, EluneType actualType, EluneType expectedType, boolean multipleChoice, boolean allowUnknown)
        {
            if (actualType == null)
                actualType = getType(value, allowUnknown);

            // This means this is a function parameter and we therefore don't know the type.
            if (actualType == null || expectedType == null)
                return true;

            try
            {
                if (actualType != expectedType && !multipleChoice)
                {
                    throw new EluneTypeException("The value of the variable '" +
                            value +
                            "' is type of '" +
                            actualType.name().toLowerCase(Locale.ROOT) +
                            "', but was expected to be of type '" +
                            expectedType.name().toLowerCase(Locale.ROOT) + "'.");
                }
                else if (actualType != expectedType)
                {
                    return false;
                }
            }
            catch (EluneTypeException ex)
            {
                ex.printStackTrace();
                System.exit(1);
            }

            return true;
        }

        public void checkType(String value, EluneType actualType, List<EluneType> allowedTypes)
        {
            if (actualType == null)
                actualType = getType(value, true);

            try
            {
                for (EluneType allowedType : allowedTypes)
                {
                    if (checkType(value, actualType, allowedType, true, true))
                        return;
                }

                StringJoiner allowedTypeString = new StringJoiner("', '");
                allowedTypes.forEach(x -> allowedTypeString.add(x.name().toLowerCase(Locale.ROOT)));

                throw new EluneTypeException("The value of the variable '" +
                        value +
                        "' is type of '" +
                        actualType.name().toLowerCase(Locale.ROOT) +
                        "', but was expected to be of one of the following types: '" +
                        allowedTypeString + "'.");
            }
            catch (EluneTypeException ex)
            {
                ex.printStackTrace();
                System.exit(1);
            }
        }

        public String render()
        {
            return translatedCode.toString();
        }
    }

    private static class Block
    {
        private final Set<EluneExpression> blockScope = new HashSet<>();
        private final Set<EluneExpression> params = new HashSet<>();
        private final Block parentBlock;

        public Block(Block parentBlock)
        {
            this.parentBlock = parentBlock;
        }

        public void putVarInScope(EluneExpression varName)
        {
            blockScope.add(varName);
        }

        public void addParam(EluneExpression parameterName)
        {
            params.add(parameterName);
        }

        public Set<EluneExpression> getScope()
        {
            Set<EluneExpression> scope = new HashSet<>(blockScope);

            if (parentBlock != null)
                scope.addAll(parentBlock.getScope());

            return scope;
        }

        public Set<EluneExpression> getParams()
        {
            Set<EluneExpression> params = new HashSet<>(this.params);

            if (parentBlock != null)
                params.addAll(parentBlock.getParams());

            return params;
        }
    }

    private class EluneExprTranslator extends EluneBaseVisitor<EluneExpression>
    {
        private final EluneTranslator translator;
        private boolean insideObject = false;

        public EluneExprTranslator(EluneTranslator translator)
        {
            this.translator = translator;
        }

        @Override
        public EluneExpression visitName(EluneParser.NameContext ctx)
        {
            return new EluneExpression(ctx.NAME().getText(), null);
        }

        @Override
        public EluneExpression visitInt(EluneParser.IntContext ctx)
        {
            return new EluneExpression(ctx.getText(), EluneType.INT);
        }

        @Override
        public EluneExpression visitHex(EluneParser.HexContext ctx)
        {
            return new EluneExpression(ctx.getText(), EluneType.INT);
        }

        @Override
        public EluneExpression visitFloat(EluneParser.FloatContext ctx)
        {
            return new EluneExpression(ctx.getText(), EluneType.FLOAT);
        }

        @Override
        public EluneExpression visitHexFloat(EluneParser.HexFloatContext ctx)
        {
            return new EluneExpression(ctx.getText(), EluneType.FLOAT);
        }

        @Override
        public EluneExpression visitString(EluneParser.StringContext ctx)
        {
            return new EluneExpression(ctx.getText(), EluneType.STRING);
        }

        @Override
        public EluneExpression visitTrue(EluneParser.TrueContext ctx)
        {
            return new EluneExpression("true", EluneType.BOOLEAN);
        }

        @Override
        public EluneExpression visitFalse(EluneParser.FalseContext ctx)
        {
            return new EluneExpression("false", EluneType.BOOLEAN);
        }

        @Override
        public EluneExpression visitNull(EluneParser.NullContext ctx)
        {
            return new EluneExpression("nil", EluneType.BOOLEAN);
        }

        @Override
        public EluneExpression visitBracketsExp(EluneParser.BracketsExpContext ctx)
        {
            EluneExpression expression = this.visit(ctx.exp());
            return new EluneExpression("(" + expression + ")", expression.type);
        }

        @Override
        public EluneExpression visitVar_(EluneParser.Var_Context ctx)
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
                if (translator.getType(var.toString(), true) == EluneType.OBJECT)
                    insideObject = true;

                for (int i = 0; i < ctx.varSuffix().size(); i++)
                {
                    var.append(this.visit(ctx.varSuffix(i)));
                }

                insideObject = false;
            }

            return new EluneExpression(var.toString(), null);
        }

        @Override
        public EluneExpression visitVarSuffix(EluneParser.VarSuffixContext ctx)
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
                EluneExpression indexExpression = this.visit(ctx.exp());
                
                if (indexExpression.type == null)
                    indexExpression = new EluneExpression(indexExpression.expression, translator.getType(indexExpression.expression));

                if ((indexExpression.type == EluneType.INT) && !insideObject)
                    indexExpression = new EluneExpression(indexExpression.expression + " + 1", indexExpression.type);

                varSuffix.append("[").append(indexExpression).append("]");
            }
            if (ctx.NAME() != null)
            {
                varSuffix.append(".").append(ctx.NAME().getText());
            }

            return new EluneExpression(varSuffix.toString(), null);
        }

        @Override
        public EluneExpression visitNameAndArgs(EluneParser.NameAndArgsContext ctx)
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

            return new EluneExpression(nameAndArgs.toString(), null);
        }

        @Override
        public EluneExpression visitArray(EluneParser.ArrayContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            List<String> elements = new ArrayList<>();

            if (ctx.explist() != null)
            {
                for (int i = 0; i < ctx.explist().exp().size(); i++)
                {
                    elements.add(this.visit(ctx.explist().exp(i)).toString());
                }
            }

            map.put("elements", elements);

            return new EluneExpression(Renderer.gen("dictionary", map, true), EluneType.ARRAY);
        }

        @Override
        public EluneExpression visitDictionary(EluneParser.DictionaryContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            List<String> elements = new ArrayList<>();

            if (ctx.fieldlist() != null)
            {
                for (int i = 0; i < ctx.fieldlist().field().size(); i++)
                {
                    elements.add(this.visit(ctx.fieldlist().field(i)).toString());
                }
            }

            map.put("elements", elements);

            return new EluneExpression(Renderer.gen("dictionary", map, true), EluneType.OBJECT);
        }

        @Override
        public EluneExpression visitExprField(EluneParser.ExprFieldContext ctx)
        {
            EluneExpression valueExpression = this.visit(ctx.exp(1));
            return new EluneExpression("[" + this.visit(ctx.exp(0)) + "] = " + valueExpression, valueExpression.type);
        }

        @Override
        public EluneExpression visitVarField(EluneParser.VarFieldContext ctx)
        {
            EluneExpression valueExpression = this.visit(ctx.exp());
            return new EluneExpression(ctx.NAME().getText() + " = " + valueExpression, valueExpression.type);
        }

        @Override
        public EluneExpression visitIndexedField(EluneParser.IndexedFieldContext ctx)
        {
            EluneExpression valueExpression = this.visit(ctx.exp());
            return new EluneExpression(valueExpression.toString(), valueExpression.type);
        }

        @Override
        public EluneExpression visitFieldsep(EluneParser.FieldsepContext ctx)
        {
            return new EluneExpression(ctx.getText() + " ", null);
        }

        @Override
        public EluneExpression visitLength(EluneParser.LengthContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("var", this.visit(ctx.exp()));

            return new EluneExpression(Renderer.gen("len", map, true), EluneType.INT);
        }

        @Override
        public EluneExpression visitLengthBrackets(EluneParser.LengthBracketsContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("var", this.visit(ctx.exp()));

            return new EluneExpression(Renderer.gen("len", map, true), EluneType.INT);
        }

        @Override
        public EluneExpression visitPrefixexp(EluneParser.PrefixexpContext ctx)
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

            return new EluneExpression(functionCall.toString(), null);
        }

        @Override
        public EluneExpression visitAnondef(EluneParser.AnondefContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(translator.currentBlock);

            EluneTranslator insideTranslator = new EluneTranslator(translator, translator.disableContinue, translator.disableImports);

            List<EluneExpression> args = new ArrayList<>();

            if (ctx.anonlist() != null)
            {
                for (int i = 0; i < ctx.anonlist().NAME().size(); i++)
                {
                    EluneExpression arg = new EluneExpression(ctx.anonlist().NAME(i).getText(), null);
                    args.add(arg);
                    newBlock.putVarInScope(arg);
                    newBlock.addParam(arg);
                }

                if (ctx.anonlist().getChildCount() > ctx.anonlist().NAME().size())
                {
                    EluneExpression additionalParamsExpression = new EluneExpression("...", null);
                    args.add(additionalParamsExpression);
                    newBlock.putVarInScope(additionalParamsExpression);
                }
            }

            map.put("args", args);

            insideTranslator.setCurrentBlock(newBlock);
            translator.insideTriggers.add(ctx);

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(insideTranslator, ctx.block());

            translator.switchCount = insideTranslator.switchCount;
            translator.loopCount = insideTranslator.loopCount;

            return new EluneExpression(Renderer.gen("anonFuncDef", map, true) + insideTranslator.render() + " " + Renderer.gen("end", null, true), EluneType.FUNCTION);
        }

        @Override
        public EluneExpression visitExprArgs(EluneParser.ExprArgsContext ctx)
        {
            Map<String, Object> map = new HashMap<>();
            List<String> args = new ArrayList<>();

            if (ctx.explist() != null)
            {
                for (int i = 0; i < ctx.explist().exp().size(); i++)
                {
                    args.add(this.visit(ctx.explist().exp(i)).toString());
                }
            }

            map.put("args", args);

            return new EluneExpression(Renderer.gen("funcCall", map, true), null);
        }

        @Override
        public EluneExpression visitAllArgs(EluneParser.AllArgsContext ctx)
        {
            return new EluneExpression("...", null);
        }

        @Override
        public EluneExpression visitConcat(EluneParser.ConcatContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            EluneExpression expressionX = this.visit(ctx.exp(0));
            translator.checkType(expressionX.toString(), expressionX.type, Arrays.asList(EluneType.STRING, EluneType.INT, EluneType.FLOAT, EluneType.BOOLEAN));
            map.put("x", expressionX);

            EluneExpression expressionY = this.visit(ctx.exp(1));
            translator.checkType(expressionY.toString(), expressionY.type, Arrays.asList(EluneType.STRING, EluneType.INT, EluneType.FLOAT, EluneType.BOOLEAN));
            map.put("y", expressionY);

            map.put("symbol", "..");

            return new EluneExpression(Renderer.gen("operatorExpr", map, true), EluneType.STRING);
        }

        @Override
        public EluneExpression visitAnd(EluneParser.AndContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            EluneExpression expressionX = this.visit(ctx.exp(0));
            translator.checkType(expressionX.toString(), expressionX.type, EluneType.BOOLEAN);
            map.put("x", expressionX);

            EluneExpression expressionY = this.visit(ctx.exp(1));
            translator.checkType(expressionY.toString(), expressionY.type, EluneType.BOOLEAN);
            map.put("y", expressionY);

            map.put("symbol", "and");

            return new EluneExpression(Renderer.gen("operatorExpr", map, true), EluneType.BOOLEAN);
        }

        @Override
        public EluneExpression visitOr(EluneParser.OrContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            EluneExpression expressionX = this.visit(ctx.exp(0));
            translator.checkType(expressionX.toString(), expressionX.type, EluneType.BOOLEAN);
            map.put("x", expressionX);

            EluneExpression expressionY = this.visit(ctx.exp(1));
            translator.checkType(expressionY.toString(), expressionY.type, EluneType.BOOLEAN);
            map.put("y", expressionY);

            map.put("symbol", "or");

            return new EluneExpression(Renderer.gen("operatorExpr", map, true), EluneType.BOOLEAN);
        }

        @Override
        public EluneExpression visitBitwise(EluneParser.BitwiseContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            EluneExpression expressionX = this.visit(ctx.exp(0));
            translator.checkType(expressionX.toString(), expressionX.type, Arrays.asList(EluneType.INT, EluneType.FLOAT));
            map.put("x", expressionX);

            EluneExpression expressionY = this.visit(ctx.exp(1));
            translator.checkType(expressionY.toString(), expressionY.type, expressionX.type);
            map.put("y", expressionY);

            map.put("symbol", ctx.operatorBitwise().getText());

            return new EluneExpression(Renderer.gen("operatorExpr", map, true), expressionX.type);
        }

        @Override
        public EluneExpression visitAddSub(EluneParser.AddSubContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            EluneExpression expressionX = this.visit(ctx.exp(0));
            translator.checkType(expressionX.toString(), expressionX.type, Arrays.asList(EluneType.INT, EluneType.FLOAT));
            map.put("x", expressionX);

            EluneExpression expressionY = this.visit(ctx.exp(1));
            translator.checkType(expressionY.toString(), expressionY.type, Arrays.asList(EluneType.INT, EluneType.FLOAT));
            map.put("y", expressionY);

            map.put("symbol", ctx.operatorAddSub().getText());

            return new EluneExpression(Renderer.gen("operatorExpr", map, true),
                    (expressionX.type == EluneType.FLOAT || expressionY.type == EluneType.FLOAT) ?
                            EluneType.FLOAT : EluneType.INT);
        }

        @Override
        public EluneExpression visitMulDivMod(EluneParser.MulDivModContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("symbol", ctx.operatorMulDivMod().getText());

            EluneExpression expressionX = this.visit(ctx.exp(0));
            if (map.get("symbol").toString().equals("//"))
                translator.checkType(expressionX.toString(), expressionX.type, EluneType.INT);
            else
                translator.checkType(expressionX.toString(), expressionX.type, Arrays.asList(EluneType.INT, EluneType.FLOAT));
            map.put("x", expressionX);

            EluneExpression expressionY = this.visit(ctx.exp(1));
            if (map.get("symbol").toString().equals("//"))
                translator.checkType(expressionY.toString(), expressionY.type, EluneType.INT);
            else
                translator.checkType(expressionY.toString(), expressionY.type, Arrays.asList(EluneType.INT, EluneType.FLOAT));
            map.put("y", expressionY);

            if (map.get("symbol").toString().equals("//"))
                map.put("symbol", "/");

            return new EluneExpression(Renderer.gen("operatorExpr", map, true),
                    (expressionX.type == EluneType.FLOAT || expressionY.type == EluneType.FLOAT) ?
                            EluneType.FLOAT : EluneType.INT);
        }

        @Override
        public EluneExpression visitUnary(EluneParser.UnaryContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("symbol", ctx.operatorUnary().getText());

            List<EluneType> acceptedTypes;

            if (map.get("symbol").toString().equals("~"))
                acceptedTypes = Arrays.asList(EluneType.INT, EluneType.FLOAT, EluneType.BOOLEAN, EluneType.NULL);
            else if (map.get("symbol").toString().equals("-"))
                acceptedTypes = Arrays.asList(EluneType.INT, EluneType.FLOAT);
            else
                acceptedTypes = Arrays.asList(EluneType.BOOLEAN, EluneType.NULL);

            EluneExpression expressionY = this.visit(ctx.exp());
            translator.checkType(expressionY.toString(), expressionY.type, acceptedTypes);
            map.put("y", expressionY);

            return new EluneExpression(Renderer.gen("unaryOperatorExpr", map, true),
                    expressionY.type == EluneType.NULL ? EluneType.BOOLEAN : expressionY.type);
        }

        @Override
        public EluneExpression visitPower(EluneParser.PowerContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            EluneExpression expressionX = this.visit(ctx.exp(0));
            translator.checkType(expressionX.toString(), expressionX.type, Arrays.asList(EluneType.INT, EluneType.FLOAT));
            map.put("x", expressionX);

            EluneExpression expressionY = this.visit(ctx.exp(1));
            translator.checkType(expressionY.toString(), expressionY.type, Arrays.asList(EluneType.INT, EluneType.FLOAT));
            map.put("y", expressionY);

            map.put("symbol", ctx.operatorPower().getText());

            return new EluneExpression(Renderer.gen("operatorExpr", map, true), EluneType.FLOAT);
        }

        @Override
        public EluneExpression visitCompare(EluneParser.CompareContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("symbol", ctx.operatorComparison().getText().equals("!=") ? "~=" :
                    (ctx.operatorComparison().getText().equals("is") ? "==" : ctx.operatorComparison().getText()));

            List<EluneType> acceptedTypes;

            if (map.get("symbol").toString().contains("<") || map.get("symbol").toString().contains(">"))
                acceptedTypes = Arrays.asList(EluneType.INT, EluneType.FLOAT);
            else
                acceptedTypes = null;

            EluneExpression expressionX = this.visit(ctx.exp(0));
            if (acceptedTypes != null)
                translator.checkType(expressionX.toString(), expressionX.type, acceptedTypes);
            map.put("x", expressionX);

            EluneExpression expressionY = this.visit(ctx.exp(1));
            if (acceptedTypes != null)
                translator.checkType(expressionY.toString(), expressionY.type, acceptedTypes);
            else
                translator.checkType(expressionY.toString(), expressionY.type, expressionX.type);
            map.put("y", expressionY);

            return new EluneExpression(Renderer.gen("operatorExpr", map, true), EluneType.BOOLEAN);
        }

        @Override
        public EluneExpression visitAssignexp(EluneParser.AssignexpContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("symbol", ctx.compoundassign().getText().replace("=", ""));

            EluneExpression expressionX = this.visit(ctx.var_());
            if (map.get("symbol").toString().equals("//"))
                translator.checkType(expressionX.toString(), expressionX.type, EluneType.INT);
            else
                translator.checkType(expressionX.toString(), expressionX.type, Arrays.asList(EluneType.INT, EluneType.FLOAT));
            map.put("x", expressionX);

            EluneExpression expressionY = this.visit(ctx.exp());
            if (map.get("symbol").toString().equals("//"))
                translator.checkType(expressionY.toString(), expressionY.type, EluneType.INT);
            else
                translator.checkType(expressionY.toString(), expressionY.type, Arrays.asList(EluneType.INT, EluneType.FLOAT));
            map.put("y", expressionY);

            if (map.get("symbol").toString().equals("//"))
                map.put("symbol", "/");

            return new EluneExpression(Renderer.gen("compoundAssign", map, true),
                    expressionX.type == EluneType.FLOAT || expressionY.type == EluneType.FLOAT
                            ? EluneType.FLOAT : EluneType.INT);
        }
    }

    private static class EluneExpression
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

        @Override
        public boolean equals(Object comparsion)
        {
            if (!(comparsion instanceof EluneExpression))
                return false;

            EluneExpression comparisonExpression = (EluneExpression)comparsion;
            return comparisonExpression.expression.equals(this.expression);
        }

        @Override
        public int hashCode()
        {
            return expression.hashCode();
        }
    }

    private static class Renderer
    {
        private static final STGroup stf = new STGroupFile("templates/"
                + capitalise(targetLanguage)
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

    public static class EluneTypeException extends Exception
    {
        public EluneTypeException(String errorMessage)
        {
            super(errorMessage);
        }
    }

    public static String capitalise(String value)
    {
        return value.substring(0, 1).toUpperCase(Locale.ROOT) + value.substring(1).toLowerCase(Locale.ROOT);
    }

    public static void main(String[] args)
    {
        targetLanguage = args[1];

        boolean disableContinue = args.length > 2 && args[2].equals("off");
        boolean disableImports = args.length > 3 && args[3].equals("off");

        generateFile(args[0], disableContinue, disableImports);
    }

    public static EluneTranslator generateFile(String pathname, String translationLanguage)
    {
        targetLanguage = translationLanguage;
        return generateFile(pathname, false, false, false);
    }

    public static EluneTranslator generateFile(String pathname, boolean disableContinue, boolean disableImports) { return generateFile(pathname, true, disableContinue, disableImports); }

    public static EluneTranslator generateFile(String pathname, boolean importStd, boolean disableContinue, boolean disableImports)
    {
        Path path = new File(pathname).toPath();

        Translator translator = new Translator();
        EluneTranslator translation = null;

        try
        {
            File outputFile = new File("./source/gen/" + FilenameUtils.removeExtension(path.getFileName().toString()) + "." + targetLanguage.toLowerCase(Locale.ROOT));

            if (outputFile.exists())
                outputFile.delete();

            outputFile.getParentFile().mkdirs();
            outputFile.createNewFile();

            FileWriter writer = new FileWriter(outputFile.getAbsolutePath());
            translation = translator.translate(path, importStd, disableContinue, disableImports);
            writer.write(translation.render());
            writer.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

        return translation;
    }
}
