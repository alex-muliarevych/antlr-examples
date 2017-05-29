package com.example.antlrexamples;

import com.examples.antlrexamples.Test1Lexer;
import com.examples.antlrexamples.Test1Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

public class Test1Example {
    public static void main(String args[]) {
        CharStream charStream = CharStreams.fromString("1 * (3     + pi)");
        Test1Lexer lexer = new Test1Lexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        Test1Parser parser = new Test1Parser(tokenStream);
        Test1Parser.ExprContext exprParseTree = parser.expr();
        System.out.println(exprParseTree.toStringTree());
    }
}
