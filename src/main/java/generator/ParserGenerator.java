package generator;

import generator.subclasses.Rule;
import generator.subclasses.State;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;

public class ParserGenerator {
    private Grammar grammar;
    private boolean existEpsilonInRules = false;

    ParserGenerator(Grammar grammar) throws IOException {
        this.grammar = grammar;
        Path pathDir = Paths.get("/home/polinb/IdeaProjects/MPP/ParserGenerator");
        pathDir = pathDir.resolve("gen").resolve(grammar.grammarName.toLowerCase());
        Files.createDirectories(pathDir);
        String fileName = grammar.grammarName + "Parser.java";
        PrintWriter printWriter = new PrintWriter(new File(pathDir.toString(), fileName));
        printWriter.write(fileText().toString());
        printWriter.close();
        //System.out.println(fileText());
    }

    private StringBuilder fileText() {
        StringBuilder sb = new StringBuilder();
        // header
        sb.append(printString("package " + grammar.grammarName.toLowerCase() + ";\n" +
                "\n" +
                "import java.util.ArrayList;\n" +
                "import java.util.List;", 0));

        for (String imp : grammar.imports) {
            sb.append(printString("import " + imp + ";", 0));
        }

        sb.append("\n");
        // class
        sb.append(printString(
                "public class " + grammar.grammarName + "Parser {\n" +
                "\tpublic static class Node {\n" +
                "\t\tprivate String name;\n" +
                "\t\tprivate List<Node> children = new ArrayList<>();\n" +
                "\n" +
                "\t\tNode(String s) {\n" +
                "\t\t\tname = s;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\tpublic void addChild(Node node) {\n" +
                "\t\t\tchildren.add(node);\n" +
                "\t\t}\n" +
                "\n" +
                "\t\tpublic String getName() {\n" +
                "\t\t\treturn name;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\tStringBuilder treeToString(ArrayList<Boolean> mask) {\n" +
                "\t\t\tStringBuilder sb = new StringBuilder();\n" +
                "\t\t\tif (!mask.isEmpty()) {\n" +
                "\t\t\t\tsb.append(\"|__\");\n" +
                "\t\t\t}\n" +
                "\t\t\tsb.append(\"'\").append(name).append(\"'\").append(\"\\n\");\n" +
                "\t\t\tfor (int curChild = 0; curChild < children.size(); ++curChild) {\n" +
                "\t\t\t\tfor (boolean b : mask) {\n" +
                "\t\t\t\t\tif (b) {\n" +
                "\t\t\t\t\t\tsb.append(\"|  \");\n" +
                "\t\t\t\t\t} else {\n" +
                "\t\t\t\t\t\tsb.append(\"   \");\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\tmask.add(curChild != children.size() - 1);\n" +
                "\t\t\t\tsb.append(children.get(curChild).treeToString(mask));\n" +
                "\t\t\t\tmask.remove(mask.size() - 1);\n" +
                "\t\t\t}\n" +
                "\t\t\treturn sb;\n" +
                "\t\t}\n"+
                "\t}", 0));

        sb.append("\n");

        for (State state : grammar.states.values()) {
            sb.append(printStateNode(state));
            sb.append("\n");
        }

        sb.append(printString("private CalculatorLexicalAnalyzer lexicalAnalyzer;", 1));

        sb.append("\n");

        // constructor
        sb.append(printString(
                "\tpublic CalculatorParser(CalculatorLexicalAnalyzer lexicalAnalyzer) {\n" +
                "\t\tthis.lexicalAnalyzer = lexicalAnalyzer;\n" +
                "\t\tNode tree = buildTree();\n" +
                "\t\tSystem.out.println(tree.treeToString(new ArrayList<>()));\n" +
                "\t}", 0));

        sb.append("\n");

        sb.append(printString("" +
                "\tprivate Node buildTree() {\n" +
                "\t\tNode res = _" + grammar.startState + "();\n" +
                "\t\tif (lexicalAnalyzer.getCurrentToken() != " + grammar.grammarName + "Token._END) {\n" +
                "\t\t\tSystem.err.println(\"Cur token is \" + lexicalAnalyzer.getCurrentToken().toString() + \" but expected END.\");\n" +
                "\t\t\tSystem.exit(-1);\n" +
                "\t\t}\n" +
                "\t\treturn res;\n" +
                "\t}",0));

        sb.append("\n");

        // consume
        sb.append(printString("" +
                "\tprivate void consume("+ grammar.grammarName +"Token token) {\n" +
                "\t\tif (lexicalAnalyzer.getCurrentToken() != token) {\n" +
                "\t\t\tSystem.err.println(\"Expected another token.\");\n" +
                "\t\t\tSystem.exit(-1);\n" +
                "\t\t} else {\n" +
                "\t\t\tlexicalAnalyzer.getNextToken();\n" +
                "\t\t}\n" +
                "\t}", 0));

        sb.append("\n");

        // states
        for (State s : grammar.states.values()) {
            sb.append(printState(s));
            sb.append("\n");
        }

        sb.append(printString("}", 0));

        return sb;
    }

    private StringBuilder printStateNode(State s) {
        StringBuilder sb = new StringBuilder();
        sb.append(printString("public class Node_" + s.getName() + " extends Node {", 1));
        sb.append(printString("Node_" + s.getName() + "() {", 2));
        sb.append(printString("super(\"" + s.getName() + "\");", 3));
        sb.append(printString("}", 2));
        for (String str : s.getParameters()) {
            sb.append(printString("public " + str + ";", 2));
        }
        sb.append(printString("}", 1));
        return sb;
    }

    private StringBuilder printState(State s) {
        existEpsilonInRules = false;
        StringBuilder sb = new StringBuilder();

        sb.append(printString("private Node _" + s.getName() + "() {", 1));
        sb.append(printString("Node res = new Node_" + s.getName() + "();", 2));
        sb.append(printString("switch (lexicalAnalyzer.getCurrentToken()) {", 2));

        for (Rule rule : s.rules) {
            sb.append(printRule(rule));
        }

        if (existEpsilonInRules) {
            sb.append(printFollowCase(s));
        }

        sb.append(printString("default : ", 3));
        sb.append(printString("System.err.println(\"Unexpected token.\");", 4));
        sb.append(printString("System.exit(-1);", 4));

        sb.append(printString("}", 2));
        sb.append(printString("return res;", 2));
        sb.append(printString("}", 1));
        return sb;
    }

    private StringBuilder printFollowCase(State s) {
        StringBuilder sb = new StringBuilder();
        for (String item : s.getFollow()) {
            sb.append(printString("case " + item + " :", 3));
        }
        if (sb.length() == 0) {
            return sb;
        }
        sb.append(printString("{", 3));
        sb.append(printString("res.addChild(new Node(\"EPS\"));", 4));
        sb.append(printString("return res;", 4));
        sb.append(printString("}", 3));
        return sb;
    }

    private StringBuilder printRule(Rule rule) {
        StringBuilder sb = new StringBuilder();
        HashSet<String> first = grammar.firstForRule(rule);
        if (first.contains("EPS")) {
            existEpsilonInRules = true;
        }
        for (String token : first) {
            if (!token.equals("EPS")) {
                sb.append(printString("case " + token + " :", 3));
            }
        }
        if (sb.length() == 0) {
            return sb;
        }

        sb.append(printString("{", 3));

        int index = 0;
        for (String item : rule.items) {
            if (grammar.tokenItems.containsKey(item)) {
                sb.append(printString("consume(" + grammar.grammarName + "Token." + item +");", 4));
                sb.append(printString("res.addChild(new Node(\"" + item + "\"));" , 4));
            } else if (grammar.states.containsKey(item)) {
                sb.append(printString("Node t" + index + " = _" + item + "();", 4));
                sb.append(printString("res.addChild(t" + index +");", 4));
                ++index;
            } else {
                System.err.println("Not in token & states. " + item);
                System.exit(-1);
            }
        }
        sb.append(printString("return res;", 4));
        sb.append(printString("}", 3));
        return sb;
    }

    private StringBuilder printString(String text, int tabs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tabs; ++i) {
            stringBuilder.append("\t");
        }
        stringBuilder.append(text);
        stringBuilder.append("\n");
        return stringBuilder;
    }
}
