// Generated from /home/polinb/IdeaProjects/MPP/ParserGenerator/src/main/java/antlr/GrammarForGenerate.g4 by ANTLR 4.7.2
package antlr;

import generator.Grammar;
import generator.subclasses.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarForGenerateParser}.
 */
public interface GrammarForGenerateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarForGenerateParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarForGenerateParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarForGenerateParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarForGenerateParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(GrammarForGenerateParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(GrammarForGenerateParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#tokens}.
	 * @param ctx the parse tree
	 */
	void enterTokens(GrammarForGenerateParser.TokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#tokens}.
	 * @param ctx the parse tree
	 */
	void exitTokens(GrammarForGenerateParser.TokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#token_line}.
	 * @param ctx the parse tree
	 */
	void enterToken_line(GrammarForGenerateParser.Token_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#token_line}.
	 * @param ctx the parse tree
	 */
	void exitToken_line(GrammarForGenerateParser.Token_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#startState}.
	 * @param ctx the parse tree
	 */
	void enterStartState(GrammarForGenerateParser.StartStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#startState}.
	 * @param ctx the parse tree
	 */
	void exitStartState(GrammarForGenerateParser.StartStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#skip_attr}.
	 * @param ctx the parse tree
	 */
	void enterSkip_attr(GrammarForGenerateParser.Skip_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#skip_attr}.
	 * @param ctx the parse tree
	 */
	void exitSkip_attr(GrammarForGenerateParser.Skip_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#states}.
	 * @param ctx the parse tree
	 */
	void enterStates(GrammarForGenerateParser.StatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#states}.
	 * @param ctx the parse tree
	 */
	void exitStates(GrammarForGenerateParser.StatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#state_line}.
	 * @param ctx the parse tree
	 */
	void enterState_line(GrammarForGenerateParser.State_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#state_line}.
	 * @param ctx the parse tree
	 */
	void exitState_line(GrammarForGenerateParser.State_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGenerateParser#rule_line}.
	 * @param ctx the parse tree
	 */
	void enterRule_line(GrammarForGenerateParser.Rule_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGenerateParser#rule_line}.
	 * @param ctx the parse tree
	 */
	void exitRule_line(GrammarForGenerateParser.Rule_lineContext ctx);
}