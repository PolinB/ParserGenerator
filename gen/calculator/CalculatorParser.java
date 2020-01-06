package calculator;

import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;

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

	public class Node_T extends Node {
		Node_T() {
			super("T");
		}
		public int z;
	}

	public class Node_E extends Node {
		Node_E() {
			super("E");
		}
		public int x;
	}

	public class Node_F extends Node {
		Node_F() {
			super("F");
		}
	}

	public class Node_G extends Node {
		Node_G() {
			super("G");
		}
		public int y;
		public long k;
	}

	public class Node_H extends Node {
		Node_H() {
			super("H");
		}
		public int f;
		public int e;
	}

	private CalculatorLexicalAnalyzer lexicalAnalyzer;

	public CalculatorParser(CalculatorLexicalAnalyzer lexicalAnalyzer) {
		this.lexicalAnalyzer = lexicalAnalyzer;
		Node tree = buildTree();
		System.out.println(tree.treeToString(new ArrayList<>()));
	}

	private Node buildTree() {
		Node res = _E();
		if (lexicalAnalyzer.getCurrentToken() != CalculatorToken._END) {
			System.err.println("Cur token is " + lexicalAnalyzer.getCurrentToken().toString() + " but expected END.");
			System.exit(-1);
		}
		return res;
	}

	private void consume(CalculatorToken token) {
		if (lexicalAnalyzer.getCurrentToken() != token) {
			System.err.println("Expected another token.");
			System.exit(-1);
		} else {
			lexicalAnalyzer.getNextToken();
		}
	}

	private Node _T() {
		Node res = new Node_T();
		switch (lexicalAnalyzer.getCurrentToken()) {
			case NUMBER :
			case LP :
			case MINUS :
			{
				Node t0 = _F();
				res.addChild(t0);
				Node t1 = _H();
				res.addChild(t1);
				return res;
			}
			default : 
				System.err.println("Unexpected token.");
				System.exit(-1);
		}
		return res;
	}

	private Node _E() {
		Node res = new Node_E();
		switch (lexicalAnalyzer.getCurrentToken()) {
			case NUMBER :
			case LP :
			case MINUS :
			{
				Node t0 = _T();
				res.addChild(t0);
				Node t1 = _G();
				res.addChild(t1);
				return res;
			}
			default : 
				System.err.println("Unexpected token.");
				System.exit(-1);
		}
		return res;
	}

	private Node _F() {
		Node res = new Node_F();
		switch (lexicalAnalyzer.getCurrentToken()) {
			case NUMBER :
			{
				consume(CalculatorToken.NUMBER);
				res.addChild(new Node("NUMBER"));
				return res;
			}
			case MINUS :
			{
				consume(CalculatorToken.MINUS);
				res.addChild(new Node("MINUS"));
				Node t0 = _F();
				res.addChild(t0);
				return res;
			}
			case LP :
			{
				consume(CalculatorToken.LP);
				res.addChild(new Node("LP"));
				Node t0 = _E();
				res.addChild(t0);
				consume(CalculatorToken.RP);
				res.addChild(new Node("RP"));
				return res;
			}
			default : 
				System.err.println("Unexpected token.");
				System.exit(-1);
		}
		return res;
	}

	private Node _G() {
		Node res = new Node_G();
		switch (lexicalAnalyzer.getCurrentToken()) {
			case PLUS :
			{
				consume(CalculatorToken.PLUS);
				res.addChild(new Node("PLUS"));
				Node t0 = _T();
				res.addChild(t0);
				Node t1 = _G();
				res.addChild(t1);
				return res;
			}
			case MINUS :
			{
				consume(CalculatorToken.MINUS);
				res.addChild(new Node("MINUS"));
				Node t0 = _T();
				res.addChild(t0);
				Node t1 = _G();
				res.addChild(t1);
				return res;
			}
			case _END :
			case RP :
			{
				res.addChild(new Node("EPS"));
				return res;
			}
			default : 
				System.err.println("Unexpected token.");
				System.exit(-1);
		}
		return res;
	}

	private Node _H() {
		Node res = new Node_H();
		switch (lexicalAnalyzer.getCurrentToken()) {
			case MUL :
			{
				consume(CalculatorToken.MUL);
				res.addChild(new Node("MUL"));
				Node t0 = _F();
				res.addChild(t0);
				Node t1 = _H();
				res.addChild(t1);
				return res;
			}
			case _END :
			case RP :
			case PLUS :
			case MINUS :
			{
				res.addChild(new Node("EPS"));
				return res;
			}
			default : 
				System.err.println("Unexpected token.");
				System.exit(-1);
		}
		return res;
	}

}
