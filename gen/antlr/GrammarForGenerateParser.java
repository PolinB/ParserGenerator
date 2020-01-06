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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, WS=19, NAME=20, REGEX=21, CODE_TEXT=22;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_header = 2, RULE_imports = 3, RULE_import_line = 4, 
		RULE_import_name = 5, RULE_tokens = 6, RULE_token_line = 7, RULE_startState = 8, 
		RULE_skip_attr = 9, RULE_states = 10, RULE_state_line = 11, RULE_parameters_state = 12, 
		RULE_rule_line = 13, RULE_parameters_rule = 14, RULE_code_block = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "header", "imports", "import_line", "import_name", 
			"tokens", "token_line", "startState", "skip_attr", "states", "state_line", 
			"parameters_state", "rule_line", "parameters_rule", "code_block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "';'", "'@imp'", "'{'", "'}'", "'import'", "'.'", 
			"'@tokens'", "':'", "'@start'", "'='", "'->'", "'skip'", "'@states'", 
			"'['", "']'", "'|'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "WS", "NAME", "REGEX", "CODE_TEXT"
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
			setState(32);
			program(_localctx.g);
			setState(33);
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
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
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
			setState(35);
			header(_localctx.g);
			setState(36);
			imports(_localctx.g);
			setState(37);
			tokens(_localctx.g);
			setState(38);
			startState(_localctx.g);
			setState(39);
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
			setState(41);
			match(T__0);
			setState(42);
			((HeaderContext)_localctx).NAME = match(NAME);
			setState(43);
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

	public static class ImportsContext extends ParserRuleContext {
		public Grammar g;
		public List<Import_lineContext> import_line() {
			return getRuleContexts(Import_lineContext.class);
		}
		public Import_lineContext import_line(int i) {
			return getRuleContext(Import_lineContext.class,i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ImportsContext(ParserRuleContext parent, int invokingState, Grammar g) {
			super(parent, invokingState);
			this.g = g;
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports(Grammar g) throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState(), g);
		enterRule(_localctx, 6, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__2);
			setState(47);
			match(T__3);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(48);
				import_line(_localctx.g);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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

	public static class Import_lineContext extends ParserRuleContext {
		public Grammar g;
		public Import_nameContext import_name;
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public Import_lineContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Import_lineContext(ParserRuleContext parent, int invokingState, Grammar g) {
			super(parent, invokingState);
			this.g = g;
		}
		@Override public int getRuleIndex() { return RULE_import_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterImport_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitImport_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitImport_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_lineContext import_line(Grammar g) throws RecognitionException {
		Import_lineContext _localctx = new Import_lineContext(_ctx, getState(), g);
		enterRule(_localctx, 8, RULE_import_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			match(T__5);
			setState(57);
			((Import_lineContext)_localctx).import_name = import_name();
			_localctx.g.addImport(((Import_lineContext)_localctx).import_name.name.toString());
			setState(59);
			match(T__1);
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

	public static class Import_nameContext extends ParserRuleContext {
		public StringBuilder name;
		public Token n1;
		public Token n2;
		public List<TerminalNode> NAME() { return getTokens(GrammarForGenerateParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarForGenerateParser.NAME, i);
		}
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterImport_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitImport_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitImport_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_import_name);

		((Import_nameContext)_localctx).name =  new StringBuilder();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			((Import_nameContext)_localctx).n1 = match(NAME);
			_localctx.name.append((((Import_nameContext)_localctx).n1!=null?((Import_nameContext)_localctx).n1.getText():null));
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(63);
				match(T__6);
				setState(64);
				((Import_nameContext)_localctx).n2 = match(NAME);
				_localctx.name.append('.').append((((Import_nameContext)_localctx).n2!=null?((Import_nameContext)_localctx).n2.getText():null));
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 12, RULE_tokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__7);
			setState(72);
			match(T__3);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(73);
				token_line(_localctx.g);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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
		enterRule(_localctx, 14, RULE_token_line);

		    ((Token_lineContext)_localctx).hasSkip =  false;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			((Token_lineContext)_localctx).NAME = match(NAME);
			setState(82);
			match(T__8);
			setState(83);
			((Token_lineContext)_localctx).REGEX = match(REGEX);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(84);
				skip_attr();
				((Token_lineContext)_localctx).hasSkip =  true;
				}
			}

			setState(89);
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
		enterRule(_localctx, 16, RULE_startState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__9);
			setState(93);
			match(T__10);
			setState(94);
			((StartStateContext)_localctx).NAME = match(NAME);
			setState(95);
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
		enterRule(_localctx, 18, RULE_skip_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__11);
			setState(99);
			match(T__12);
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
		enterRule(_localctx, 20, RULE_states);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__13);
			setState(102);
			match(T__3);
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				((StatesContext)_localctx).state_line = state_line();
				_localctx.g.addState(((StatesContext)_localctx).state_line.state);
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(110);
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
		public Parameters_stateContext parameters_state() {
			return getRuleContext(Parameters_stateContext.class,0);
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
		enterRule(_localctx, 22, RULE_state_line);

		    ((State_lineContext)_localctx).state =  new State();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((State_lineContext)_localctx).NAME = match(NAME);
			_localctx.state.setName((((State_lineContext)_localctx).NAME!=null?((State_lineContext)_localctx).NAME.getText():null));
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(114);
				match(T__14);
				setState(115);
				parameters_state(_localctx.state);
				setState(116);
				match(T__15);
				}
			}

			setState(120);
			match(T__8);
			setState(121);
			((State_lineContext)_localctx).r1 = rule_line();
			_localctx.state.addRule(((State_lineContext)_localctx).r1.r);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(123);
				match(T__16);
				setState(124);
				((State_lineContext)_localctx).r2 = rule_line();
				_localctx.state.addRule(((State_lineContext)_localctx).r2.r);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
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

	public static class Parameters_stateContext extends ParserRuleContext {
		public State state;
		public Token type1;
		public Token name1;
		public Token type2;
		public Token name2;
		public List<TerminalNode> NAME() { return getTokens(GrammarForGenerateParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarForGenerateParser.NAME, i);
		}
		public Parameters_stateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Parameters_stateContext(ParserRuleContext parent, int invokingState, State state) {
			super(parent, invokingState);
			this.state = state;
		}
		@Override public int getRuleIndex() { return RULE_parameters_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterParameters_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitParameters_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitParameters_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameters_stateContext parameters_state(State state) throws RecognitionException {
		Parameters_stateContext _localctx = new Parameters_stateContext(_ctx, getState(), state);
		enterRule(_localctx, 24, RULE_parameters_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((Parameters_stateContext)_localctx).type1 = match(NAME);
			setState(135);
			((Parameters_stateContext)_localctx).name1 = match(NAME);
			_localctx.state.addParameter((((Parameters_stateContext)_localctx).type1!=null?((Parameters_stateContext)_localctx).type1.getText():null), (((Parameters_stateContext)_localctx).name1!=null?((Parameters_stateContext)_localctx).name1.getText():null));
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(137);
				match(T__17);
				setState(138);
				((Parameters_stateContext)_localctx).type2 = match(NAME);
				setState(139);
				((Parameters_stateContext)_localctx).name2 = match(NAME);
				_localctx.state.addParameter((((Parameters_stateContext)_localctx).type2!=null?((Parameters_stateContext)_localctx).type2.getText():null), (((Parameters_stateContext)_localctx).name2!=null?((Parameters_stateContext)_localctx).name2.getText():null));
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Rule_lineContext extends ParserRuleContext {
		public Rule r;
		public StringBuilder parameters;
		public StringBuilder code;
		public Token NAME;
		public List<TerminalNode> NAME() { return getTokens(GrammarForGenerateParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarForGenerateParser.NAME, i);
		}
		public List<Parameters_ruleContext> parameters_rule() {
			return getRuleContexts(Parameters_ruleContext.class);
		}
		public Parameters_ruleContext parameters_rule(int i) {
			return getRuleContext(Parameters_ruleContext.class,i);
		}
		public List<Code_blockContext> code_block() {
			return getRuleContexts(Code_blockContext.class);
		}
		public Code_blockContext code_block(int i) {
			return getRuleContext(Code_blockContext.class,i);
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
		enterRule(_localctx, 26, RULE_rule_line);

		    ((Rule_lineContext)_localctx).r =  new Rule();
		    ((Rule_lineContext)_localctx).parameters =  new StringBuilder();
		    ((Rule_lineContext)_localctx).code =  new StringBuilder();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				((Rule_lineContext)_localctx).NAME = match(NAME);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(147);
					parameters_rule(_localctx.parameters);
					}
				}

				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE_TEXT) {
					{
					setState(150);
					code_block(_localctx.code);
					}
				}

				_localctx.r.addItem((((Rule_lineContext)_localctx).NAME!=null?((Rule_lineContext)_localctx).NAME.getText():null), _localctx.parameters.toString(), _localctx.code.toString());
				}
				}
				setState(156); 
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

	public static class Parameters_ruleContext extends ParserRuleContext {
		public StringBuilder s;
		public Token n1;
		public Token n2;
		public List<TerminalNode> NAME() { return getTokens(GrammarForGenerateParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarForGenerateParser.NAME, i);
		}
		public Parameters_ruleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Parameters_ruleContext(ParserRuleContext parent, int invokingState, StringBuilder s) {
			super(parent, invokingState);
			this.s = s;
		}
		@Override public int getRuleIndex() { return RULE_parameters_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterParameters_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitParameters_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitParameters_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameters_ruleContext parameters_rule(StringBuilder s) throws RecognitionException {
		Parameters_ruleContext _localctx = new Parameters_ruleContext(_ctx, getState(), s);
		enterRule(_localctx, 28, RULE_parameters_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__14);
			setState(159);
			((Parameters_ruleContext)_localctx).n1 = match(NAME);
			_localctx.s.append((((Parameters_ruleContext)_localctx).n1!=null?((Parameters_ruleContext)_localctx).n1.getText():null));
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(161);
				match(T__17);
				setState(162);
				((Parameters_ruleContext)_localctx).n2 = match(NAME);
				_localctx.s.append(", ").append((((Parameters_ruleContext)_localctx).n2!=null?((Parameters_ruleContext)_localctx).n2.getText():null));
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(T__15);
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

	public static class Code_blockContext extends ParserRuleContext {
		public StringBuilder s;
		public Token CODE_TEXT;
		public TerminalNode CODE_TEXT() { return getToken(GrammarForGenerateParser.CODE_TEXT, 0); }
		public Code_blockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Code_blockContext(ParserRuleContext parent, int invokingState, StringBuilder s) {
			super(parent, invokingState);
			this.s = s;
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGenerateListener ) ((GrammarForGenerateListener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGenerateVisitor ) return ((GrammarForGenerateVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block(StringBuilder s) throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState(), s);
		enterRule(_localctx, 30, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			((Code_blockContext)_localctx).CODE_TEXT = match(CODE_TEXT);

			        _localctx.s.append((((Code_blockContext)_localctx).CODE_TEXT!=null?((Code_blockContext)_localctx).CODE_TEXT.getText():null));
			        _localctx.s.deleteCharAt(0);
			        _localctx.s.deleteCharAt(_localctx.s.length() - 1);
			    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u00b1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5\64\n"+
		"\5\f\5\16\5\67\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7"+
		"\7E\n\7\f\7\16\7H\13\7\3\b\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\tZ\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\6\fm\n\f\r\f\16\fn\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\ry\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0082\n\r\f\r\16"+
		"\r\u0085\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0090\n"+
		"\16\f\16\16\16\u0093\13\16\3\17\3\17\5\17\u0097\n\17\3\17\5\17\u009a\n"+
		"\17\3\17\6\17\u009d\n\17\r\17\16\17\u009e\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00a7\n\20\f\20\16\20\u00aa\13\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u00ac\2\"\3\2\2"+
		"\2\4%\3\2\2\2\6+\3\2\2\2\b\60\3\2\2\2\n:\3\2\2\2\f?\3\2\2\2\16I\3\2\2"+
		"\2\20S\3\2\2\2\22^\3\2\2\2\24d\3\2\2\2\26g\3\2\2\2\30r\3\2\2\2\32\u0088"+
		"\3\2\2\2\34\u009c\3\2\2\2\36\u00a0\3\2\2\2 \u00ad\3\2\2\2\"#\5\4\3\2#"+
		"$\7\2\2\3$\3\3\2\2\2%&\5\6\4\2&\'\5\b\5\2\'(\5\16\b\2()\5\22\n\2)*\5\26"+
		"\f\2*\5\3\2\2\2+,\7\3\2\2,-\7\26\2\2-.\7\4\2\2./\b\4\1\2/\7\3\2\2\2\60"+
		"\61\7\5\2\2\61\65\7\6\2\2\62\64\5\n\6\2\63\62\3\2\2\2\64\67\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\7\2\29\t\3\2\2"+
		"\2:;\7\b\2\2;<\5\f\7\2<=\b\6\1\2=>\7\4\2\2>\13\3\2\2\2?@\7\26\2\2@F\b"+
		"\7\1\2AB\7\t\2\2BC\7\26\2\2CE\b\7\1\2DA\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG"+
		"\3\2\2\2G\r\3\2\2\2HF\3\2\2\2IJ\7\n\2\2JN\7\6\2\2KM\5\20\t\2LK\3\2\2\2"+
		"MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\7\2\2R\17\3\2\2"+
		"\2ST\7\26\2\2TU\7\13\2\2UY\7\27\2\2VW\5\24\13\2WX\b\t\1\2XZ\3\2\2\2YV"+
		"\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\4\2\2\\]\b\t\1\2]\21\3\2\2\2^_\7\f\2"+
		"\2_`\7\r\2\2`a\7\26\2\2ab\7\4\2\2bc\b\n\1\2c\23\3\2\2\2de\7\16\2\2ef\7"+
		"\17\2\2f\25\3\2\2\2gh\7\20\2\2hl\7\6\2\2ij\5\30\r\2jk\b\f\1\2km\3\2\2"+
		"\2li\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\7\2\2q\27\3\2"+
		"\2\2rs\7\26\2\2sx\b\r\1\2tu\7\21\2\2uv\5\32\16\2vw\7\22\2\2wy\3\2\2\2"+
		"xt\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\13\2\2{|\5\34\17\2|\u0083\b\r\1\2}"+
		"~\7\23\2\2~\177\5\34\17\2\177\u0080\b\r\1\2\u0080\u0082\3\2\2\2\u0081"+
		"}\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\4\2\2\u0087\31"+
		"\3\2\2\2\u0088\u0089\7\26\2\2\u0089\u008a\7\26\2\2\u008a\u0091\b\16\1"+
		"\2\u008b\u008c\7\24\2\2\u008c\u008d\7\26\2\2\u008d\u008e\7\26\2\2\u008e"+
		"\u0090\b\16\1\2\u008f\u008b\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\33\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0096\7\26\2\2\u0095\u0097\5\36\20\2\u0096\u0095\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a\5 \21\2\u0099\u0098\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\b\17\1\2\u009c\u0094\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\35\3\2\2\2\u00a0\u00a1\7\21\2\2\u00a1\u00a2\7\26\2\2\u00a2\u00a8\b\20"+
		"\1\2\u00a3\u00a4\7\24\2\2\u00a4\u00a5\7\26\2\2\u00a5\u00a7\b\20\1\2\u00a6"+
		"\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\22\2\2\u00ac"+
		"\37\3\2\2\2\u00ad\u00ae\7\30\2\2\u00ae\u00af\b\21\1\2\u00af!\3\2\2\2\16"+
		"\65FNYnx\u0083\u0091\u0096\u0099\u009e\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}