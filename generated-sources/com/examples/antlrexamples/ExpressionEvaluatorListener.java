// Generated from com/examples/antlrexamples/ExpressionEvaluator.g4 by ANTLR 4.7
package com.examples.antlrexamples;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionEvaluatorParser}.
 */
public interface ExpressionEvaluatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionEvaluatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExpressionEvaluatorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionEvaluatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExpressionEvaluatorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionEvaluatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ExpressionEvaluatorParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionEvaluatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ExpressionEvaluatorParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionEvaluatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExpressionEvaluatorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionEvaluatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExpressionEvaluatorParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionEvaluatorParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(ExpressionEvaluatorParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionEvaluatorParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(ExpressionEvaluatorParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionEvaluatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ExpressionEvaluatorParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionEvaluatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ExpressionEvaluatorParser.AtomContext ctx);
}