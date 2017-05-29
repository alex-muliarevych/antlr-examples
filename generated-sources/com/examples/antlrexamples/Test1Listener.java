// Generated from com/examples/antlrexamples/Test1.g4 by ANTLR 4.7
package com.examples.antlrexamples;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Test1Parser}.
 */
public interface Test1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Test1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Test1Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Test1Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test1Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Test1Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test1Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Test1Parser.NumberContext ctx);
}