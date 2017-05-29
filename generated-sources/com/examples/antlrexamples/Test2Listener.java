// Generated from com/examples/antlrexamples/Test2.g4 by ANTLR 4.7
package com.examples.antlrexamples;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Test2Parser}.
 */
public interface Test2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link Test2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(Test2Parser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link Test2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(Test2Parser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link Test2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen(Test2Parser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link Test2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen(Test2Parser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link Test2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(Test2Parser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link Test2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(Test2Parser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link Test2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(Test2Parser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link Test2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(Test2Parser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pi}
	 * labeled alternative in {@link Test2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPi(Test2Parser.PiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pi}
	 * labeled alternative in {@link Test2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPi(Test2Parser.PiContext ctx);
	/**
	 * Enter a parse tree produced by {@link Test2Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Test2Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Test2Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Test2Parser.NumberContext ctx);
}