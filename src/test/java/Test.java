import calculator.CalculatorLexicalAnalyzer;
import calculator.CalculatorParser;

public class Test {
    public static void main(String[] args) {
        CalculatorLexicalAnalyzer lexicalAnalyzer = new CalculatorLexicalAnalyzer("1 + 3 - 7 * 8");
        CalculatorParser parser = new CalculatorParser(lexicalAnalyzer);
        parser.printTree();
        System.out.println(parser.getv());
    }
}

