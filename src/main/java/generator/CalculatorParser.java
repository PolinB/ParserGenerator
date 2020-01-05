package generator;

import java.util.ArrayList;
import java.util.List;

public class CalculatorParser {
    public static class Node {
        private String name;
        private List<Node> children = new ArrayList<>();

        Node(String s) {
            name = s;
        }

        public void addChild(Node node) {
            children.add(node);
        }

        public String getName() {
            return name;
        }

        StringBuilder treeToString(ArrayList<Boolean> mask) {
            StringBuilder sb = new StringBuilder();
            if (!mask.isEmpty()) {
                sb.append("|__");
            }
            sb.append("'").append(name).append("'").append("\n");
            for (int curChild = 0; curChild < children.size(); ++curChild) {
                for (boolean b : mask) {
                    if (b) {
                        sb.append("|  ");
                    } else {
                        sb.append("   ");
                    }
                }
                mask.add(curChild != children.size() - 1);
                sb.append(children.get(curChild).treeToString(mask));
                mask.remove(mask.size() - 1);
            }
            return sb;
        }
    }

    private CalculatorLexicalAnalyzer lexicalAnalyzer;

    public CalculatorParser(CalculatorLexicalAnalyzer lexicalAnalyzer) {
        this.lexicalAnalyzer = lexicalAnalyzer;
        Node tree = buildTree();
        System.out.println(tree.treeToString(new ArrayList<>()));
    }

    private Node buildTree() {
        Node res = _E(); // Тут StartState()
        if (lexicalAnalyzer.getCurrentToken() != CalculatorToken._end) {
            System.err.println("Cur token is " + lexicalAnalyzer.getCurrentToken().toString() + " but expected END.");
            System.exit(-1);
        }
        return res;
    }

    private Node _E() {
        Node res = new Node("E");
        switch (lexicalAnalyzer.getCurrentToken()) {
            ///case
        }
        return res;
    }

    private Node G() {
        return null;
    }

    private Node T() {
        return null;
    }

    private Node H() {
        return null;
    }

    private Node F() {
        return null;
    }

    private void consume(CalculatorToken token) {
        if (lexicalAnalyzer.getCurrentToken() != token) {
            System.err.println("Expected another token.");
            System.exit(-1);
        } else {
            lexicalAnalyzer.getNextToken();
        }
    }
}
