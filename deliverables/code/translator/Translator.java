import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        private final StringBuilder translatedCode = new StringBuilder();
        private final List<String> globalScope = new ArrayList<>();
        private final Block currentBlock = new Block(null);

        @Override
        public void enterSep(EluneParser.SepContext ctx)
        {
            translatedCode.append(LuaRenderer.gen("sep", null)).append("\n");
        }

        @Override
        public void enterGlobalVar(EluneParser.GlobalVarContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            List<String> varList = new ArrayList<>();

            for (int i = 0; i < ctx.varlist().getChildCount(); i++)
            {
                if (!ctx.varlist().getChild(i).getText().equals(","))
                    varList.add(ctx.varlist().getChild(i).getText());
            }

            map.put("names", varList.toArray());

            List<String> valueList = new ArrayList<>();

            for (int i = 0; i < ctx.explist().getChildCount(); i++)
            {
                if (!ctx.explist().getChild(i).getText().equals(","))
                    valueList.add(ctx.explist().getChild(i).getText());
            }

            map.put("values", valueList.toArray());

            translatedCode.append(LuaRenderer.gen("globalVar", map)).append("\n");
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
                String varName = ctx.varlist().getChild(i).getText();

                if (scope.contains(varName.split("\\[")[0]))
                    isDec = false;
                else
                    currentBlock.putVarInScope(varName);

                if (!ctx.varlist().getChild(i).getText().equals(","))
                    varList.add(varName);
            }

            map.put("names", varList.toArray());

            List<String> valueList = new ArrayList<>();

            for (int i = 0; i < ctx.explist().getChildCount(); i++)
            {
                if (!ctx.explist().getChild(i).getText().equals(","))
                    valueList.add(ctx.explist().getChild(i).getText());
            }

            map.put("values", valueList.toArray());

            if (isDec)
                translatedCode.append(LuaRenderer.gen("varDec", map)).append("\n");
            else
                translatedCode.append(LuaRenderer.gen("varAssign", map)).append("\n");
        }

        @Override
        public void enterGlobalFunc(EluneParser.GlobalFuncContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("name", ctx.funcname().getText());

            List<String> args = new ArrayList<>();

            for (int i = 0; i < ctx.funcbody().parlist().namelist().getChildCount(); i++)
            {
                if (!ctx.funcbody().parlist().namelist().getChild(i).getText().equals(","))
                    args.add(ctx.funcbody().parlist().namelist().getChild(i).getText());
            }

            if (ctx.funcbody().parlist().getChildCount() > 1)
                args.add("...");

            map.put("args", args);

            translatedCode.append("\n").append(LuaRenderer.gen("globalFuncDef", map)).append("\n");
            LuaRenderer.increaseTab();
        }

        @Override
        public void exitGlobalFunc(EluneParser.GlobalFuncContext ctx)
        {
            LuaRenderer.decreaseTab();
            translatedCode.append(LuaRenderer.gen("end", null)).append("\n");
        }

        @Override
        public void enterFunc(EluneParser.FuncContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("name", ctx.funcname().getText());

            List<String> args = new ArrayList<>();

            for (int i = 0; i < ctx.funcbody().parlist().namelist().getChildCount(); i++)
            {
                if (!ctx.funcbody().parlist().namelist().getChild(i).getText().equals(","))
                    args.add(ctx.funcbody().parlist().namelist().getChild(i).getText());
            }

            if (ctx.funcbody().parlist().getChildCount() > 1)
                args.add("...");

            map.put("args", args);

            translatedCode.append("\n").append(LuaRenderer.gen("funcDef", map)).append("\n");
            LuaRenderer.increaseTab();
        }

        @Override
        public void exitFunc(EluneParser.FuncContext ctx)
        {
            LuaRenderer.decreaseTab();
            translatedCode.append(LuaRenderer.gen("end", null)).append("\n");
        }

        @Override
        public void enterAddSub(EluneParser.AddSubContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("x", ctx.exp(0).getText());
            map.put("y", ctx.exp(1).getText());
            map.put("symbol", ctx.operatorAddSub().getText());

            translatedCode.append(LuaRenderer.gen("calculation", map)).append("\n");
        }

        @Override
        public void enterMulDivMod(EluneParser.MulDivModContext ctx)
        {
            Map<String, Object> map = new HashMap<>();

            map.put("x", ctx.exp(0).getText());
            map.put("y", ctx.exp(1).getText());
            map.put("symbol", ctx.operatorMulDivMod().getText());

            translatedCode.append(LuaRenderer.gen("calculation", map)).append("\n");
        }

        @Override
        public void enterRetstat(EluneParser.RetstatContext ctx)
        {
            translatedCode.append(LuaRenderer.gen("return", null));
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

    private static class LuaRenderer
    {
        private static final STGroup stf = new STGroupFile("templates/template.stg");
        private static int tabLevel = 0;

        public static String gen(String name, Map<String, Object> varMap)
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

            return "\t".repeat(tabLevel) + st.render().trim();
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
