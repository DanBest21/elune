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

        EluneTranslator translator = new EluneTranslator();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(translator, parser.root());

        return translator.render();
    }

    private static class EluneTranslator extends EluneBaseListener
    {
        private static final StringBuilder translatedCode = new StringBuilder();
        private static final List<String> globalScope = new ArrayList<>();
        private static Block currentBlock = new Block(null);

        private final static EluneExprTranslator<String> exprTranslator = new EluneExprTranslator<>();

        public static Block getCurrentBlock()
        {
            return currentBlock;
        }

        public static void setCurrentBlock(Block newBlock)
        {
            currentBlock = newBlock;
        }

        @Override
        public void enterSep(EluneParser.SepContext ctx)
        {
            translatedCode.append(Renderer.gen("sep", null)).append("\n");
        }

        @Override
        public void enterGlobalVar(EluneParser.GlobalVarContext ctx)
        {
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

            translatedCode.append(Renderer.gen("globalVar", map)).append("\n");
            globalScope.addAll(varList);
        }

        @Override
        public void enterVar(EluneParser.VarContext ctx)
        {
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

            if (isDec)
                translatedCode.append(Renderer.gen("varDec", map)).append("\n");
            else
                translatedCode.append(Renderer.gen("varAssign", map)).append("\n");
        }

        @Override
        public void enterGlobalFunc(EluneParser.GlobalFuncContext ctx)
        {
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

            translatedCode.append("\n").append(Renderer.gen("globalFuncDef", map)).append("\n");
            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitGlobalFunc(EluneParser.GlobalFuncContext ctx)
        {
            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;
            translatedCode.append(Renderer.gen("end", null)).append("\n");
        }

        @Override
        public void enterFunc(EluneParser.FuncContext ctx)
        {
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

            translatedCode.append("\n").append(Renderer.gen("funcDef", map)).append("\n");
            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitFunc(EluneParser.FuncContext ctx)
        {
            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;
            translatedCode.append(Renderer.gen("end", null)).append("\n");
        }

        @Override
        public void enterObjFunc(EluneParser.ObjFuncContext ctx)
        {
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

            translatedCode.append("\n").append(Renderer.gen("globalFuncDef", map)).append("\n");
            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitObjFunc(EluneParser.ObjFuncContext ctx)
        {
            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;
            translatedCode.append(Renderer.gen("end", null)).append("\n");
        }

        @Override
        public void exitAnondef(EluneParser.AnondefContext ctx)
        {
            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;
            translatedCode.append(Renderer.gen("end", null)).append("\n");
        }

        @Override
        public void enterFor(EluneParser.ForContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            map.put("var", ctx.NAME().getText());
            newBlock.putVarInScope(ctx.NAME().getText());

            map.put("start", exprTranslator.visit(ctx.exp(0)));
            map.put("end", exprTranslator.visit(ctx.exp(1)));
            map.put("inc", exprTranslator.visit(ctx.exp(2)));

            translatedCode.append(Renderer.gen("for", map)).append("\n");
            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitFor(EluneParser.ForContext ctx)
        {
            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;
            translatedCode.append(Renderer.gen("end", null)).append("\n\n");
        }

        @Override
        public void enterForeach(EluneParser.ForeachContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            map.put("element", ctx.NAME().getText());
            map.put("list", exprTranslator.visit(ctx.explist()));

            translatedCode.append(Renderer.gen("forEach", map)).append("\n");
            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        @Override
        public void exitForeach(EluneParser.ForeachContext ctx)
        {
            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;
            translatedCode.append(Renderer.gen("end", null)).append("\n\n");
        }

        @Override
        public void enterIfStmt(EluneParser.IfStmtContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            map.put("cond", exprTranslator.visit(ctx.exp()));

            translatedCode.append(Renderer.gen("if", map)).append("\n");
            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        public void exitIfStmt(EluneParser.IfStmtContext ctx)
        {
            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;
            translatedCode.append(Renderer.gen("end", null)).append("\n\n");
        }

        @Override
        public void enterElseIfStmt(EluneParser.ElseIfStmtContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            Block newBlock = new Block(currentBlock);

            map.put("cond", exprTranslator.visit(ctx.exp()));

            translatedCode.append(Renderer.gen("elseIf", map)).append("\n");
            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        public void exitElseIfStmt(EluneParser.ElseIfStmtContext ctx)
        {
            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;
            translatedCode.append(Renderer.gen("end", null)).append("\n\n");
        }

        @Override
        public void enterElseStmt(EluneParser.ElseStmtContext ctx)
        {
            Block newBlock = new Block(currentBlock);

            translatedCode.append(Renderer.gen("else", null)).append("\n");
            Renderer.increaseTab();
            currentBlock = newBlock;
        }

        public void exitElseStmt(EluneParser.ElseStmtContext ctx)
        {
            Renderer.decreaseTab();
            currentBlock = currentBlock.parentBlock;
            translatedCode.append(Renderer.gen("end", null)).append("\n\n");
        }

        @Override
        public void enterFunctioncall(EluneParser.FunctioncallContext ctx)
        {
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

                functionCall.append(Renderer.gen("prefixExp", map));
            }

            translatedCode.append(functionCall).append("\n");
        }

        @Override
        public void enterPrint(EluneParser.PrintContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("exp", exprTranslator.visit(ctx.exp()));

            translatedCode.append(Renderer.gen("print", map)).append("\n");
        }

        @Override
        public void enterPrintBrackets(EluneParser.PrintBracketsContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("exp", exprTranslator.visit(ctx.exp()));

            translatedCode.append(Renderer.gen("print", map)).append("\n");
        }

        @Override
        public void enterRetstat(EluneParser.RetstatContext ctx)
        {
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

            translatedCode.append(Renderer.gen("return", map)).append("\n");
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
    }

    private static class EluneExprTranslator<String> extends EluneBaseVisitor<java.lang.String>
    {
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
        public java.lang.String visitVar_(EluneParser.Var_Context ctx)
        {
            return ctx.getText();
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

        // TODO: Fix anonymous functions since they are horrendously broken right now.
        @Override
        public java.lang.String visitAnondef(EluneParser.AnondefContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();

            EluneTranslator.Block newBlock = new EluneTranslator.Block(EluneTranslator.getCurrentBlock());

            List<java.lang.String> args = new ArrayList<>();

            for (int i = 0; i < ctx.anonlist().NAME().size(); i++)
            {
                java.lang.String arg = ctx.anonlist().NAME(i).getText();
                args.add(arg);
                newBlock.putVarInScope(arg);
            }

            map.put("args", args);

            Renderer.increaseTab();
            EluneTranslator.setCurrentBlock(newBlock);

            return Renderer.gen("anonFuncDef", map,true);
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
        public java.lang.String visitCompare(EluneParser.CompareContext ctx)
        {
            Map<java.lang.String, Object> map = new HashMap<>();

            map.put("x", this.visit(ctx.exp(0)));
            map.put("y", this.visit(ctx.exp(1)));
            map.put("symbol", ctx.operatorComparison().getText());

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
                List<String> lines = Arrays.asList(st.render().trim().split("(?<=" + System.getProperty("line.separator") + ")"));

                for (String line : lines)
                {
                    output.append("\t".repeat(tabLevel)).append(line);
                }

                return output.toString();
            }
        }

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
        Path path = new File("./source/test_1.elu").toPath();

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
