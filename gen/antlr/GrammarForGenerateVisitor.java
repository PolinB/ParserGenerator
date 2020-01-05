// Generated from /home/polinb/IdeaProjects/MPP/ParserGenerator/src/main/java/antlr/GrammarForGenerate.g4 by ANTLR 4.7.2
package antlr;

import generator.Grammar;
import generator.subclasses.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarForGenerateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarForGenerateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarForGenerateParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammarForGenerateParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGenerateParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarForGenerateParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGenerateParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(GrammarForGenerateParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGenerateParser#tokens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokens(GrammarForGenerateParser.TokensContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGenerateParser#token_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken_line(GrammarForGenerateParser.Token_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGenerateParser#startState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartState(GrammarForGenerateParser.StartStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGenerateParser#skip_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip_attr(GrammarForGenerateParser.Skip_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGenerateParser#states}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStates(GrammarForGenerateParser.StatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGenerateParser#state_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_line(GrammarForGenerateParser.State_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGenerateParser#rule_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_line(GrammarForGenerateParser.Rule_lineContext ctx);
}