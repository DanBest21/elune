import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class EluneTest
{
    @Test
    void testHelloWorld()
    {
        testLuaScript("testHelloWorld", "Hello World");
    }

    @Test
    void testMapAnonymousFunction()
    {
        testLuaScript("testMapAnonymousFunction",
                "10\n" +
                "20\n" +
                "30\n" +
                "40\n" +
                "50");
    }

    @Test
    void testFilterAnonymousFunction()
    {
        testLuaScript("testFilterAnonymousFunction",
                "2\n" +
                "4\n" +
                "6\n" +
                "8\n" +
                "10");
    }

    @Test
    void testMapGlobalFunction()
    {
        testLuaScript("testMapGlobalFunction",
                "7\n" +
                "14\n" +
                "21\n" +
                "28\n" +
                "35");
    }

    @Test
    void testFilterSkip()
    {
        testLuaScript("testFilterSkip",
                "1\n" +
                "2\n" +
                "4\n" +
                "5\n" +
                "7\n" +
                "8\n" +
                "10");
    }

    @Test
    void testSplitAt()
    {
        testLuaScript("testSplitAt",
                "First half:\n" +
                "10\n" +
                "20\n" +
                "30\n" +
                "40\n" +
                "50\n" +
                "Second half:\n" +
                "60\n" +
                "70\n" +
                "80\n" +
                "90\n" +
                "100");
    }

    @Test
    void testPalindromeCorrect()
    {
        testLuaScript("testPalindromeCorrect", "ref");
    }

    @Test
    void testPalindromeWrong()
    {
        testLuaScript("testPalindromeWrong", "dogma");
    }

    @Test
    void testDoWhile()
    {
        testLuaScript("testDoWhile",
                "This will be true twice.\n" +
                "This will be true twice.");
    }

    @Test
    void testOperators()
    {
        testLuaScript("testOperators",
                "27.0\n" +
                "3\n" +
                "-100\n" +
                "false");
    }

    @Test
    void testBitwiseOperators()
    {
        testLuaScript("testBitwiseOperators",
                "1\n" +
                "7\n" +
                "6\n" +
                "3\n" +
                "14\n" +
                "-8");
    }

    @Test
    void testSwitch()
    {
        testLuaScript("testSwitch", "It works!");
    }

    @Test
    void testLoops()
    {
        testLuaScript("testLoops", "25");
    }

    @Test
    void testTryCatch()
    {
        testLuaScript("testTryCatch",
                "It does exist!\n" +
                "Cheese Gromit! Cheese!\n" +
                "Not even Wensleydale?");
    }

    @Test
    void testInnerAnonymousFunction()
    {
        testLuaScript("testInnerAnonymousFunction", "30\n" +
                "60");
    }

    @Test
    void testUnaryOperatorBrackets()
    {
        testLuaScript("testUnaryOperatorBrackets", "100");
    }

    @Test
    void testEnum()
    {
        testLuaScript("testEnum", "It is Wednesday my dude.");
    }

    @Test
    void testFoldl()
    {
        testLuaScript("testFoldl", "81.0");
    }

    @Test
    void testPrintRange()
    {
        testLuaScript("testPrintRange",
                "0\n"+
                "1\n"+
                "2\n"+
                "3\n"+
                "4",
                Collections.singletonList("maths"));
    }

    @Test
    void testPrintIntervalRange()
    {
        testLuaScript("testPrintIntervalRange",
                "2\n" +
                        "3\n" +
                        "4",
                Collections.singletonList("maths"));
    }

    @Test
    void testPrintMultipleStepRange()
    {
        testLuaScript("testPrintMultipleStepRange",
                "2\n" +
                        "4\n" +
                        "6\n" +
                        "8\n" +
                        "10",
                Collections.singletonList("maths"));
    }

    @Test
    void testPrintNegativeStepRange()
    {
        testLuaScript("testPrintNegativeStepRange",
                "10\n" +
                        "8\n" +
                        "6\n" +
                        "4\n" +
                        "2",
                Collections.singletonList("maths"));
    }

    @Test
    void testGetDescription()
    {
       testLuaScript("testGetDescription", "Declines the invitation to the currently open event.",
               Arrays.asList("gameTest", "wowTest"));
    }

    @Test
    void testGetCategories()
    {
        testLuaScript("testGetCategories",
                "achievements\n" +
                "calendar\n" +
                "chat\n" +
                "combat\n" +
                "groups\n" +
                "instances\n" +
                "spells\n" +
                "ui\n" +
                "unit",
                Arrays.asList("gameTest", "wowTest"),
                true);
    }

    @Test
    void testGetRecordsOnType()
    {
        testLuaScript("testGetRecordsOnType",
                "GetCurrentEventInfo\n" +
                "GetNextAchievement\n" +
                "GetRewardItemID\n" +
                "GetSupercedingAchievements",
                Arrays.asList("gameTest", "wowTest"),
                true);
    }

    @Test
    void testGenericCheck()
    {
        testLuaScript("testGenericCheck", "Yes. Yes it is.", Arrays.asList("gameTest", "wowTest"));
    }

    @Test
    void testGenericGet()
    {
        testLuaScript("testGenericGet", "Supercede this.", Arrays.asList("gameTest", "wowTest"));
    }

    private void testLuaScript(String fileName, String expectedOutput)
    {
        testLuaScript(fileName, expectedOutput, null, false);
    }

    private void testLuaScript(String fileName, String expectedOutput, List<String> libraries)
    {
        testLuaScript(fileName, expectedOutput, libraries, false);
    }

    private void testLuaScript(String fileName, String expectedOutput, List<String> libraries, boolean orderResult)
    {
        if (libraries != null)
        {
            for (String library : libraries)
            {
                Translator.generateFile("./source/lib/" + library + ".elu", "lua");
            }
        }

        Translator.generateFile("./source/test/" + fileName + ".elu", "lua");
        assertEquals(expectedOutput, runLuaScript(fileName, libraries, orderResult));
    }

    private String runLuaScript(String fileName, List<String> libraries, boolean orderResult)
    {
        try
        {
            StringBuilder importStatement = new StringBuilder();
            importStatement.append("-l std");

            if (libraries != null)
            {
                for (String library : libraries)
                {
                    importStatement.append(" -l ").append(library);
                }
            }

            Process process = Runtime.getRuntime().exec("lua " + "-e \"package.path = package.path .. ';./source/gen/?.lua'\" " + importStatement + " ./source/gen/" + fileName + ".lua");

            BufferedReader console = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            List<String> output = new ArrayList<>();

            while ((line = console.readLine()) != null)
            {
                output.add(line + "\n");
            }

            if (orderResult)
                Collections.sort(output);

            StringBuilder returnValue = new StringBuilder();

            for (String value : output)
            {
                returnValue.append(value);
            }

            if (returnValue.length() == 0)
                return returnValue.toString();

            return returnValue.substring(0, returnValue.length() - 1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}