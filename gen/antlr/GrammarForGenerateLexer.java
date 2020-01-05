// Generated from /home/polinb/IdeaProjects/MPP/ParserGenerator/src/main/java/antlr/GrammarForGenerate.g4 by ANTLR 4.7.2
package antlr;

import generator.Grammar;
import generator.subclasses.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarForGenerateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NAME=13, REGEX=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "NAME", "REGEX", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "';'", "'@tokens'", "'{'", "'}'", "':'", "'@start'", 
			"'='", "'->'", "'skip'", "'@states'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NAME", "REGEX", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public GrammarForGenerateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarForGenerate.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21k\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\7\16W\n\16"+
		"\f\16\16\16Z\13\16\3\17\3\17\7\17^\n\17\f\17\16\17a\13\17\3\17\3\17\3"+
		"\20\6\20f\n\20\r\20\16\20g\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\6\4\2C\\c|\6\2\62"+
		";C\\aac|\3\2$$\4\2\13\f\"\"\2m\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\3!\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2"+
		"\2\r\67\3\2\2\2\179\3\2\2\2\21@\3\2\2\2\23B\3\2\2\2\25E\3\2\2\2\27J\3"+
		"\2\2\2\31R\3\2\2\2\33T\3\2\2\2\35[\3\2\2\2\37e\3\2\2\2!\"\7i\2\2\"#\7"+
		"t\2\2#$\7c\2\2$%\7o\2\2%&\7o\2\2&\'\7c\2\2\'(\7t\2\2(\4\3\2\2\2)*\7=\2"+
		"\2*\6\3\2\2\2+,\7B\2\2,-\7v\2\2-.\7q\2\2./\7m\2\2/\60\7g\2\2\60\61\7p"+
		"\2\2\61\62\7u\2\2\62\b\3\2\2\2\63\64\7}\2\2\64\n\3\2\2\2\65\66\7\177\2"+
		"\2\66\f\3\2\2\2\678\7<\2\28\16\3\2\2\29:\7B\2\2:;\7u\2\2;<\7v\2\2<=\7"+
		"c\2\2=>\7t\2\2>?\7v\2\2?\20\3\2\2\2@A\7?\2\2A\22\3\2\2\2BC\7/\2\2CD\7"+
		"@\2\2D\24\3\2\2\2EF\7u\2\2FG\7m\2\2GH\7k\2\2HI\7r\2\2I\26\3\2\2\2JK\7"+
		"B\2\2KL\7u\2\2LM\7v\2\2MN\7c\2\2NO\7v\2\2OP\7g\2\2PQ\7u\2\2Q\30\3\2\2"+
		"\2RS\7~\2\2S\32\3\2\2\2TX\t\2\2\2UW\t\3\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2"+
		"\2\2XY\3\2\2\2Y\34\3\2\2\2ZX\3\2\2\2[_\7$\2\2\\^\n\4\2\2]\\\3\2\2\2^a"+
		"\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7$\2\2c\36\3\2\2\2"+
		"df\t\5\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\20\2"+
		"\2j \3\2\2\2\6\2X_g\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}