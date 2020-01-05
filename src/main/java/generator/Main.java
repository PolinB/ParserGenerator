package generator;

import antlr.GrammarForGenerateLexer;
import antlr.GrammarForGenerateParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

public class Main {
    public static void main(String[] args) {
        try {
            GrammarForGenerateLexer lexer = new GrammarForGenerateLexer(CharStreams.fromFileName("/home/polinb/IdeaProjects/MPP/ParserGenerator/CalculatorGrammar"));
            TokenStream tokenStream = new CommonTokenStream(lexer);
            GrammarForGenerateParser parser = new GrammarForGenerateParser(tokenStream);
            Grammar grammar = parser.start().g;
            grammar.constructFirst();
            //grammar.showFirst();
            grammar.constructFollow();
            //grammar.showFollow();
            LexicalAnalyzerGenerator lexicalAnalyzerGenerator = new LexicalAnalyzerGenerator(grammar);
            ParserGenerator parserGenerator = new ParserGenerator(grammar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
