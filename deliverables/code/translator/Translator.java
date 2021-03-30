import org.antlr.v4.runtime.*;

import java.io.File;
import java.nio.file.Path;

public class Translator
{
    public static void main(String[] args) throws Exception
    {
        Path path = new File("./source/test_1.elu").toPath();
        CharStream input = CharStreams.fromPath(path);

        EluneLexer lexer = new EluneLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        EluneParser parser = new EluneParser(tokens);

        parser.start();
    }
}
