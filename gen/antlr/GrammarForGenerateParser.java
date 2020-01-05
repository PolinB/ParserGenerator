// Generated from /home/polinb/IdeaProjects/MPP/ParserGenerator/src/main/java/antlr/GrammarForGenerate.g4 by ANTLR 4.7.2
package antlr;

import generator.Grammar;
import generator.subclasses.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarForGenerateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NAME=13, REGEX=14, WS=15;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_header = 2, RULE_tokens = 3, RULE_token_line = 4, 
		RULE_startState = 5, RULE_skip_attr = 6, RULE_states = 7, RULE_state_line = 8, 
		RULE_rule_line = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "header", "tokens", "token_line", "startState", "skip_attr", 
			"states", "state_line", "rule_line"
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

	@Override
	public String getGrammarFileName() { return "GrammarForGenerate.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarForGenerateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Grammar g;
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarForGenerateParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);

		    ((StartContext)_localctx).g =  new Grammar();

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			program(_localctx.g);
			setState(21);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public Grammar g;
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TokensContext tokens() {
			return getRuleContext(TokensContext.class,0);
		}
		public StartStateContext startState() {
			return getRuleContext(StartStateContext.class,0);
		}
		public StatesContext states() {
			return getRuleContext(StatesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ProgramContext(ParserRuleContext parent, int invokingState, Grammar g) {
			super(parent, invokingState);
			this.g = g;
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program(Grammar g) throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState(), g);
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			header(_localctx.g);
			setState(24);
			tokens(_localctx.g);
			setState(25);
			startState(_localctx.g);
			setState(26);
			states(_localctx.g);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public Grammar g;
		public Token NAME;
		public TerminalNode NAME() { return getToken(GrammarForGenerateParser.NAME, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public HeaderContext(ParserRuleContext parent, int invokingState, Grammar g) {
			super(parent, invokingState);
			this.g = g;
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header(Grammar g) throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState(), g);
		enterRule(_localctx, 4, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			((HeaderContext)_localctx).NAME = match(NAME);
			setState(30);
			match(T__1);

			    _localctx.g.setName((((HeaderContext)_localctx).NAME!=null?((HeaderContext)_localctx).NAME.getText():null));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokensContext extends ParserRuleContext {
		public Grammar g;
		public List<Token_lineContext> token_line() {
			return getRuleContexts(Token_lineContext.class);
		}
		public Token_lineContext token_line(int i) {
			return getRuleContext(Token_lineContext.class,i);
		}
		public TokensContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TokensContext(ParserRuleContext parent, int invokingState, Grammar g) {
			super(parent, invokingState);
			this.g = g;
		}
		@Override public int getRuleIndex() { return RULE_tokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterTokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitTokens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitTokens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokensContext tokens(Grammar g) throws RecognitionException {
		TokensContext _localctx = new TokensContext(_ctx, getState(), g);
		enterRule(_localctx, 6, RULE_tokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__2);
			setState(34);
			match(T__3);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(35);
				token_line(_localctx.g);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Token_lineContext extends ParserRuleContext {
		public Grammar g;
		public boolean hasSkip;
		public Token NAME;
		public Token REGEX;
		public TerminalNode NAME() { return getToken(GrammarForGenerateParser.NAME, 0); }
		public TerminalNode REGEX() { return getToken(GrammarForGenerateParser.REGEX, 0); }
		public Skip_attrContext skip_attr() {
			return getRuleContext(Skip_attrContext.class,0);
		}
		public Token_lineContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Token_lineContext(ParserRuleContext parent, int invokingState, Grammar g) {
			super(parent, invokingState);
			this.g = g;
		}
		@Override public int getRuleIndex() { return RULE_token_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterToken_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitToken_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitToken_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_lineContext token_line(Grammar g) throws RecognitionException {
		Token_lineContext _localctx = new Token_lineContext(_ctx, getState(), g);
		enterRule(_localctx, 8, RULE_token_line);

		    ((Token_lineContext)_localctx).hasSkip =  false;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			((Token_lineContext)_localctx).NAME = match(NAME);
			setState(44);
			match(T__5);
			setState(45);
			((Token_lineContext)_localctx).REGEX = match(REGEX);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(46);
				skip_attr();
				((Token_lineContext)_localctx).hasSkip =  true;
				}
			}

			setState(51);
			match(T__1);

			    if (_localctx.hasSkip) {
			        _localctx.g.addSkipToken((((Token_lineContext)_localctx).NAME!=null?((Token_lineContext)_localctx).NAME.getText():null), (((Token_lineContext)_localctx).REGEX!=null?((Token_lineContext)_localctx).REGEX.getText():null));
			    } else {
			        _localctx.g.addToken((((Token_lineContext)_localctx).NAME!=null?((Token_lineContext)_localctx).NAME.getText():null), (((Token_lineContext)_localctx).REGEX!=null?((Token_lineContext)_localctx).REGEX.getText():null));
			    }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartStateContext extends ParserRuleContext {
		public Grammar g;
		public Token NAME;
		public TerminalNode NAME() { return getToken(GrammarForGenerateParser.NAME, 0); }
		public StartStateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StartStateContext(ParserRuleContext parent, int invokingState, Grammar g) {
			super(parent, invokingState);
			this.g = g;
		}
		@Override public int getRuleIndex() { return RULE_startState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterStartState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitStartState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitStartState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartStateContext startState(Grammar g) throws RecognitionException {
		StartStateContext _localctx = new StartStateContext(_ctx, getState(), g);
		enterRule(_localctx, 10, RULE_startState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__6);
			setState(55);
			match(T__7);
			setState(56);
			((StartStateContext)_localctx).NAME = match(NAME);
			setState(57);
			match(T__1);

			    _localctx.g.setStartState((((StartStateContext)_localctx).NAME!=null?((StartStateContext)_localctx).NAME.getText():null));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Skip_attrContext extends ParserRuleContext {
		public Skip_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterSkip_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitSkip_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitSkip_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Skip_attrContext skip_attr() throws RecognitionException {
		Skip_attrContext _localctx = new Skip_attrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_skip_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__8);
			setState(61);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatesContext extends ParserRuleContext {
		public Grammar g;
		public State_lineContext state_line;
		public List<State_lineContext> state_line() {
			return getRuleContexts(State_lineContext.class);
		}
		public State_lineContext state_line(int i) {
			return getRuleContext(State_lineContext.class,i);
		}
		public StatesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatesContext(ParserRuleContext parent, int invokingState, Grammar g) {
			super(parent, invokingState);
			this.g = g;
		}
		@Override public int getRuleIndex() { return RULE_states; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterStates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitStates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitStates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatesContext states(Grammar g) throws RecognitionException {
		StatesContext _localctx = new StatesContext(_ctx, getState(), g);
		enterRule(_localctx, 14, RULE_states);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__10);
			setState(64);
			match(T__3);
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				((StatesContext)_localctx).state_line = state_line();
				_localctx.g.addState(((StatesContext)_localctx).state_line.state);
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(72);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class State_lineContext extends ParserRuleContext {
		public State state;
		public Token NAME;
		public Rule_lineContext r1;
		public Rule_lineContext r2;
		public TerminalNode NAME() { return getToken(GrammarForGenerateParser.NAME, 0); }
		public List<Rule_lineContext> rule_line() {
			return getRuleContexts(Rule_lineContext.class);
		}
		public Rule_lineContext rule_line(int i) {
			return getRuleContext(Rule_lineContext.class,i);
		}
		public State_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterState_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitState_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitState_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_lineContext state_line() throws RecognitionException {
		State_lineContext _localctx = new State_lineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_state_line);

		    ((State_lineContext)_localctx).state =  new State();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			((State_lineContext)_localctx).NAME = match(NAME);
			_localctx.state.setName((((State_lineContext)_localctx).NAME!=null?((State_lineContext)_localctx).NAME.getText():null));
			setState(76);
			match(T__5);
			setState(77);
			((State_lineContext)_localctx).r1 = rule_line();
			_localctx.state.addRule(((State_lineContext)_localctx).r1.r);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(79);
				match(T__11);
				setState(80);
				((State_lineContext)_localctx).r2 = rule_line();
				_localctx.state.addRule(((State_lineContext)_localctx).r2.r);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rule_lineContext extends ParserRuleContext {
		public Rule r;
		public Token NAME;
		public List<TerminalNode> NAME() { return getTokens(GrammarForGenerateParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarForGenerateParser.NAME, i);
		}
		public Rule_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterRule_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitRule_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitRule_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_lineContext rule_line() throws RecognitionException {
		Rule_lineContext _localctx = new Rule_lineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rule_line);

		    ((Rule_lineContext)_localctx).r =  new Rule();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				((Rule_lineContext)_localctx).NAME = match(NAME);
				_localctx.r.addItem((((Rule_lineContext)_localctx).NAME!=null?((Rule_lineContext)_localctx).NAME.getText():null));
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5\'\n"+
		"\5\f\5\16\5*\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\64\n\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\6\tG\n\t\r"+
		"\t\16\tH\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nV\n\n\f\n\16\n"+
		"Y\13\n\3\n\3\n\3\13\3\13\6\13_\n\13\r\13\16\13`\3\13\2\2\f\2\4\6\b\n\f"+
		"\16\20\22\24\2\2\2]\2\26\3\2\2\2\4\31\3\2\2\2\6\36\3\2\2\2\b#\3\2\2\2"+
		"\n-\3\2\2\2\f8\3\2\2\2\16>\3\2\2\2\20A\3\2\2\2\22L\3\2\2\2\24^\3\2\2\2"+
		"\26\27\5\4\3\2\27\30\7\2\2\3\30\3\3\2\2\2\31\32\5\6\4\2\32\33\5\b\5\2"+
		"\33\34\5\f\7\2\34\35\5\20\t\2\35\5\3\2\2\2\36\37\7\3\2\2\37 \7\17\2\2"+
		" !\7\4\2\2!\"\b\4\1\2\"\7\3\2\2\2#$\7\5\2\2$(\7\6\2\2%\'\5\n\6\2&%\3\2"+
		"\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\7\2\2,\t\3"+
		"\2\2\2-.\7\17\2\2./\7\b\2\2/\63\7\20\2\2\60\61\5\16\b\2\61\62\b\6\1\2"+
		"\62\64\3\2\2\2\63\60\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\4\2\2"+
		"\66\67\b\6\1\2\67\13\3\2\2\289\7\t\2\29:\7\n\2\2:;\7\17\2\2;<\7\4\2\2"+
		"<=\b\7\1\2=\r\3\2\2\2>?\7\13\2\2?@\7\f\2\2@\17\3\2\2\2AB\7\r\2\2BF\7\6"+
		"\2\2CD\5\22\n\2DE\b\t\1\2EG\3\2\2\2FC\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3"+
		"\2\2\2IJ\3\2\2\2JK\7\7\2\2K\21\3\2\2\2LM\7\17\2\2MN\b\n\1\2NO\7\b\2\2"+
		"OP\5\24\13\2PW\b\n\1\2QR\7\16\2\2RS\5\24\13\2ST\b\n\1\2TV\3\2\2\2UQ\3"+
		"\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7\4\2\2[\23"+
		"\3\2\2\2\\]\7\17\2\2]_\b\13\1\2^\\\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2"+
		"\2a\25\3\2\2\2\7(\63HW`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}