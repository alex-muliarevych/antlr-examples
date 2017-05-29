// Generated from com/examples/antlrexamples/IfElseEvaluator.g4 by ANTLR 4.7
package com.examples.antlrexamples;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IfElseEvaluatorParser}.
 */
public interface IfElseEvaluatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IfElseEvaluatorParser#a_grammar}.
	 * @param ctx the parse tree
	 */
	void enterA_grammar(IfElseEvaluatorParser.A_grammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseEvaluatorParser#a_grammar}.
	 * @param ctx the parse tree
	 */
	void exitA_grammar(IfElseEvaluatorParser.A_grammarContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseEvaluatorParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(IfElseEvaluatorParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseEvaluatorParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(IfElseEvaluatorParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseEvaluatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(IfElseEvaluatorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseEvaluatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(IfElseEvaluatorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseEvaluatorParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(IfElseEvaluatorParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseEvaluatorParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(IfElseEvaluatorParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseEvaluatorParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(IfElseEvaluatorParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseEvaluatorParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(IfElseEvaluatorParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(IfElseEvaluatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseEvaluatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(IfElseEvaluatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfElseEvaluatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(IfElseEvaluatorParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfElseEvaluatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(IfElseEvaluatorParser.AtomContext ctx);
}