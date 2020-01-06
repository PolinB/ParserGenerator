package calculator;

import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;

public class CalculatorParser {
	public Node tree;
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

	public class Node_MinusOp extends Node {
		Node_MinusOp() {
			super("MinusOp");
		}
		public int v;
	}

	public class Node_T extends Node {
		Node_T() {
			super("T");
		}
		public int v;
	}

	public class Node_E extends Node {
		Node_E() {
			super("E");
		}
		public int v;
	}

	public class Node_F extends Node {
		Node_F() {
			super("F");
		}
		public int v;
	}

	public class Node_MulOp extends Node {
		Node_MulOp() {
			super("MulOp");
		}
		public int v;
	}

	public class Node_G extends Node {
		Node_G() {
			super("G");
		}
		public int v;
	}

	public class Node_PlusOp extends Node {
		Node_PlusOp() {
			super("PlusOp");
		}
		public int v;
	}

	public class Node_H extends Node {
		Node_H() {
			super("H");
		}
		public int v;
	}

	private CalculatorLexicalAnalyzer lexicalAnalyzer;

	public CalculatorParser(CalculatorLexicalAnalyzer lexicalAnalyzer) throws Exception {
		this.lexicalAnalyzer = lexicalAnalyzer;
		buildTree();
	}

	private void buildTree() throws Exception {
		tree = _E();
		if (lexicalAnalyzer.getCurrentToken() != CalculatorToken._END) {
			throw new Exception("Cur token is " + lexicalAnalyzer.getCurrentToken().toString() + " but expected END.");
		}
	}

	public void printTree() {
		System.out.println(tree.treeToString(new ArrayList<>()));
	}

	public int getv() {
		return ((Node_E)tree).v;
	}

	private void consume(CalculatorToken token) throws Exception{
		if (lexicalAnalyzer.getCurrentToken() != token) {
			throw new Exception("Expected another token.");
		}
	}

	private Node_MinusOp _MinusOp(int a, int b) throws Exception {
		Node_MinusOp res = new Node_MinusOp();
		switch (lexicalAnalyzer.getCurrentToken()) {
			case _END :
			case RP :
			case PLUS :
			case MINUS :
			{
				res.v = a - b;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_T _T() throws Exception {
		Node_T res = new Node_T();
		switch (lexicalAnalyzer.getCurrentToken()) {
			case NUMBER :
			case LP :
			case MINUS :
			{
				Node_F n0 = _F();
				res.addChild(n0);
				int u = n0.v;
				Node_H n1 = _H(u);
				res.addChild(n1);
				res.v = n1.v;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_E _E() throws Exception {
		Node_E res = new Node_E();
		switch (lexicalAnalyzer.getCurrentToken()) {
			case NUMBER :
			case LP :
			case MINUS :
			{
				Node_T n0 = _T();
				res.addChild(n0);
				int u = n0.v;
				Node_G n1 = _G(u);
				res.addChild(n1);
				res.v = n1.v;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_F _F() throws Exception {
		Node_F res = new Node_F();
		switch (lexicalAnalyzer.getCurrentToken()) {
			case NUMBER :
			{
				consume(CalculatorToken.NUMBER);
				res.addChild(new Node("NUMBER"));
				res.v = Integer.parseInt(lexicalAnalyzer.getCurrentTokenString());
				lexicalAnalyzer.getNextToken();
				return res;
			}
			case MINUS :
			{
				consume(CalculatorToken.MINUS);
				res.addChild(new Node("MINUS"));
				
				lexicalAnalyzer.getNextToken();
				Node_F n0 = _F();
				res.addChild(n0);
				res.v = -(n0.v);
				return res;
			}
			case LP :
			{
				consume(CalculatorToken.LP);
				res.addChild(new Node("LP"));
				
				lexicalAnalyzer.getNextToken();
				Node_E n0 = _E();
				res.addChild(n0);
				res.v = n0.v;
				consume(CalculatorToken.RP);
				res.addChild(new Node("RP"));
				
				lexicalAnalyzer.getNextToken();
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_MulOp _MulOp(int a, int b) throws Exception {
		Node_MulOp res = new Node_MulOp();
		switch (lexicalAnalyzer.getCurrentToken()) {
			case _END :
			case MUL :
			case RP :
			case PLUS :
			case MINUS :
			{
				res.v = a * b;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_G _G(int a) throws Exception {
		Node_G res = new Node_G();
		switch (lexicalAnalyzer.getCurrentToken()) {
			case _END :
			case RP :
			{
				res.v = a;
				return res;
			}
			case PLUS :
			{
				consume(CalculatorToken.PLUS);
				res.addChild(new Node("PLUS"));
				
				lexicalAnalyzer.getNextToken();
				Node_T n0 = _T();
				res.addChild(n0);
				int u = n0.v;
				Node_PlusOp n1 = _PlusOp(a, u);
				res.addChild(n1);
				int acc = n1.v;
				Node_G n2 = _G(acc);
				res.addChild(n2);
				res.v = n2.v;
				return res;
			}
			case MINUS :
			{
				consume(CalculatorToken.MINUS);
				res.addChild(new Node("MINUS"));
				
				lexicalAnalyzer.getNextToken();
				Node_T n0 = _T();
				res.addChild(n0);
				int u = n0.v;
				Node_MinusOp n1 = _MinusOp(a, u);
				res.addChild(n1);
				int acc = n1.v;
				Node_G n2 = _G(acc);
				res.addChild(n2);
				res.v = n2.v;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_PlusOp _PlusOp(int a, int b) throws Exception {
		Node_PlusOp res = new Node_PlusOp();
		switch (lexicalAnalyzer.getCurrentToken()) {
			case _END :
			case RP :
			case PLUS :
			case MINUS :
			{
				res.v = a + b;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

	private Node_H _H(int a) throws Exception {
		Node_H res = new Node_H();
		switch (lexicalAnalyzer.getCurrentToken()) {
			case _END :
			case RP :
			case PLUS :
			case MINUS :
			{
				res.v = a;
				return res;
			}
			case MUL :
			{
				consume(CalculatorToken.MUL);
				res.addChild(new Node("MUL"));
				
				lexicalAnalyzer.getNextToken();
				Node_F n0 = _F();
				res.addChild(n0);
				int u = n0.v;
				Node_MulOp n1 = _MulOp(a, u);
				res.addChild(n1);
				int acc = n1.v;
				Node_H n2 = _H(acc);
				res.addChild(n2);
				res.v = n2.v;
				return res;
			}
			default : 
				throw new Exception("Unexpected token.");
		}
	}

}
