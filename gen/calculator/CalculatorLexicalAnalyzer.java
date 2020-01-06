package calculator;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorLexicalAnalyzer {
	private StringBuilder inputSB;
	private List<TokenItem> tokenPatterns = new ArrayList<>();
	private List<TokenItem> skipTokenPatterns = new ArrayList<>();
	private List<CalculatorToken> tokens = new ArrayList<>();
	private List<String> tokensToString = new ArrayList<>();
	private int currentPosition = 0;

	public CalculatorLexicalAnalyzer(String input) {
		inputSB = new StringBuilder(input);

		tokenPatterns.add(new TokenItem(CalculatorToken.LP,"[(]"));
		tokenPatterns.add(new TokenItem(CalculatorToken.RP,"[)]"));
		tokenPatterns.add(new TokenItem(CalculatorToken.PLUS,"\\+"));
		tokenPatterns.add(new TokenItem(CalculatorToken.MINUS,"-"));
		tokenPatterns.add(new TokenItem(CalculatorToken.MUL,"\\*"));
		tokenPatterns.add(new TokenItem(CalculatorToken.NUMBER,"[1-9]+[0-9]*"));

		skipTokenPatterns.add(new TokenItem(CalculatorToken.SPACE,"[ \n\r]+"));
		getTokens();
	}

	public CalculatorToken getCurrentToken() {
		return tokens.get(currentPosition);
 	}

	public String getCurrentTokenString() {
		return tokensToString.get(currentPosition);
	}

	public CalculatorToken getNextToken() {
		return tokens.get(++currentPosition);
	}

	private void getTokens() {
		while (!(inputSB.length() == 0)) {
			CalculatorToken t = findFirstToken();
			if (t != null) {
				tokens.add(t);
			} else if (!findFirstSkipToken()) {
				System.err.println("Not find matching with tokens.");
				System.exit(-1);
			}
		}
		tokens.add(CalculatorToken._END);
	}

	private boolean findFirstSkipToken() {
		for (TokenItem item : skipTokenPatterns) {
			Matcher m = item.pattern.matcher(inputSB.toString());
			if (m.lookingAt()) {
				inputSB.delete(0, m.end());
				return true;
			}
		}
		return false;
	}

	private CalculatorToken findFirstToken() {
		for (TokenItem item : tokenPatterns) {
			Matcher m = item.pattern.matcher(inputSB.toString());
			if (m.lookingAt()) {
				tokensToString.add(inputSB.substring(0, m.end()));
				inputSB.delete(0, m.end());
				return item.token;
			}
		}
		return null;
	}

	private static class TokenItem {
		CalculatorToken token;
		Pattern pattern;
		TokenItem(CalculatorToken token, String s) {
			this.token = token;
			pattern = Pattern.compile(s);
		}
	}
}
