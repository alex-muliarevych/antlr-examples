package com.example.antlrexamples;

import com.examples.antlrexamples.ExpressionEvaluatorLexer;
import com.examples.antlrexamples.ExpressionEvaluatorParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

/**
 * Can be used to investigate evaluation and debug returns values for expressions.
 */
public class ExpressionEvaluatorExample {
    public static void main(String args[]) {
        CharStream charStream = CharStreams.fromString("2+3*4");
        ExpressionEvaluatorLexer lexer = new ExpressionEvaluatorLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        ExpressionEvaluatorParser parser = new ExpressionEvaluatorParser(tokenStream);
        ExpressionEvaluatorParser.ExprContext exprParseTree = parser.expr();
        System.out.println(exprParseTree.toStringTree());
        System.out.println(exprParseTree.value);
    }
}
