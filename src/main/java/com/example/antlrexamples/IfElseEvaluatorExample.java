package com.example.antlrexamples;

import com.examples.antlrexamples.IfElseEvaluatorLexer;
import com.examples.antlrexamples.IfElseEvaluatorParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

/**
 * Try next output:
        if (condition)
        {
        return true
        }
        else if (condition)
        {
        return false
        }
        else
        {
        if (condition)
        {
        return true
        }
        return false
        }
 */
public class IfElseEvaluatorExample {

    public static void main(String args[]) {
        CharStream charStream = CharStreams.fromString("if (a <= 7)\n" +
                "    {\n" +
                "        return true\n" +
                "    }\n" +
                "else \n" +
                "    if (xyz <= 99)\n" +
                "    {\n" +
                "        return false\n" +
                "    }\n" +
                "    else incor@#!$rect\n" +
                "    {\n" +
                "        if (b <= a)\n" +
                "        {\n" +
                "            return true\n" +
                "        }\n" +
                "        return false\n" +
                "    }");
        IfElseEvaluatorLexer lexer = new IfElseEvaluatorLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        IfElseEvaluatorParser parser = new IfElseEvaluatorParser(tokenStream);
        IfElseEvaluatorParser.ExpressionContext exprParseTree = parser.expression();
        System.out.println(exprParseTree.toStringTree());
    }
}
