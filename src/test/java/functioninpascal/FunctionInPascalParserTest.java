package functioninpascal;

import org.junit.Test;

public class FunctionInPascalParserTest {
    @Test
    public void testSimpleProcedure() {
        try {
            FunctionInPascalLexicalAnalyzer analyzer = new FunctionInPascalLexicalAnalyzer("procedure t();");
            FunctionInPascalParser parser = new FunctionInPascalParser(analyzer);
            parser.printTree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSimpleFunction() {
        try {
            FunctionInPascalLexicalAnalyzer analyzer = new FunctionInPascalLexicalAnalyzer("function t() : integer;");
            FunctionInPascalParser parser = new FunctionInPascalParser(analyzer);
            parser.printTree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testProcedureWithOneArgument() {
        try {
            FunctionInPascalLexicalAnalyzer analyzer = new FunctionInPascalLexicalAnalyzer("procedure t(a : integer);");
            FunctionInPascalParser parser = new FunctionInPascalParser(analyzer);
            parser.printTree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testProcedureWithAnyArgumentOneType() {
        try {
            FunctionInPascalLexicalAnalyzer analyzer = new FunctionInPascalLexicalAnalyzer("procedure t(a, b, c: integer);");
            FunctionInPascalParser parser = new FunctionInPascalParser(analyzer);
            parser.printTree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testProcedureWithTwoBlockOneArgument() {
        try {
            FunctionInPascalLexicalAnalyzer analyzer = new FunctionInPascalLexicalAnalyzer("procedure t(a : integer; c : real);");
            FunctionInPascalParser parser = new FunctionInPascalParser(analyzer);
            parser.printTree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testProcedureWithAnyBlockAnyArgument() {
        try {
            FunctionInPascalLexicalAnalyzer analyzer = new FunctionInPascalLexicalAnalyzer("procedure t(a, b, k : integer; c : real; s, f : string);");
            FunctionInPascalParser parser = new FunctionInPascalParser(analyzer);
            parser.printTree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = Exception.class)
    public void testLexicalAnalyzerException() throws Exception {
        FunctionInPascalLexicalAnalyzer analyzer = new  FunctionInPascalLexicalAnalyzer("procedure t(7 : integer);");
    }

    @Test(expected = Exception.class)
    public void testParserException() throws Exception {
        FunctionInPascalLexicalAnalyzer analyzer = new  FunctionInPascalLexicalAnalyzer("procedure t(a : integer; an);");
        FunctionInPascalParser parser = new FunctionInPascalParser(analyzer);
    }
}
