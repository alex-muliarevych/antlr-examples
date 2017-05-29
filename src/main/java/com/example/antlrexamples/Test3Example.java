package com.example.antlrexamples;

import com.examples.antlrexamples.Test2BaseListener;
import com.examples.antlrexamples.Test2Lexer;
import com.examples.antlrexamples.Test2Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Stack;

public class Test3Example {
    public static void main(String args[]) {
        CharStream charStream = CharStreams.fromString("1 * (3     + pi)");
        Test2Lexer lexer = new Test2Lexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        Test2Parser parser = new Test2Parser(tokenStream);
        Test2Parser.ExprContext exprParseTree = parser.expr();
        System.out.println(exprParseTree.toStringTree());
        System.out.println(evaluate(exprParseTree));
    }

    private static double evaluate(Test2Parser.ExprContext exprParseTree) {
        ParseTreeWalker walker = new ParseTreeWalker();
        Evaluator evaluator = new Evaluator();
        walker.walk(evaluator, exprParseTree);
        return evaluator.stack.peek();
    }

    static class Evaluator extends Test2BaseListener {
        Stack<Double> stack = new Stack<Double>();

        @Override
        public void exitNum(Test2Parser.NumContext ctx) {
            stack.push(Double.parseDouble(ctx.getText()));
        }

        @Override
        public void exitAdd(Test2Parser.AddContext ctx) {
            double a = stack.pop();
            double b = stack.pop();
            stack.push(a + b);
        }

        @Override
        public void exitMul(Test2Parser.MulContext ctx) {
            double a = stack.pop();
            double b = stack.pop();
            stack.push(a * b);
        }

        @Override
        public void exitPi(Test2Parser.PiContext ctx) {
            stack.push(3.14159);
        }
    }
}
