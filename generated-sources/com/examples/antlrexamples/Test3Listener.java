// Generated from com/examples/antlrexamples/Test3.g4 by ANTLR 4.7
package com.examples.antlrexamples;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Test3Parser}.
 */
public interface Test3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Test3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Test3Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Test3Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Test3Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Test3Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Test3Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Test3Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test3Parser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(Test3Parser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test3Parser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(Test3Parser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(Test3Parser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(Test3Parser.AtomContext ctx);
}