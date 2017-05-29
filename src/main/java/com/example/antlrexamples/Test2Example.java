package com.example.antlrexamples;

import com.examples.antlrexamples.Test2Lexer;
import com.examples.antlrexamples.Test2Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

public class Test2Example {
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
        if (exprParseTree instanceof Test2Parser.NumContext) {
            return evaluate(((Test2Parser.NumContext) exprParseTree).number());
        }
        if (exprParseTree instanceof Test2Parser.AddContext) {
            Test2Parser.AddContext addContext = (Test2Parser.AddContext) exprParseTree;
            return evaluate(addContext.expr(0)) + evaluate(addContext.expr(1));
        }
        if (exprParseTree instanceof Test2Parser.MulContext) {
            Test2Parser.MulContext mulContext = (Test2Parser.MulContext) exprParseTree;
            return evaluate(mulContext.expr(0)) * evaluate(mulContext.expr(1));
        }
        if (exprParseTree instanceof Test2Parser.ParenContext) {
            return evaluate(((Test2Parser.ParenContext) exprParseTree).expr());
        }
        if (exprParseTree instanceof Test2Parser.PiContext) {
            return 3.14159;
        }
        throw new RuntimeException("Unexpected parse tree");
    }

    private static double evaluate(Test2Parser.NumberContext number) {
        return Double.parseDouble(number.getText());
    }
}
