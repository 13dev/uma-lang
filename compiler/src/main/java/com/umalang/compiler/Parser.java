package com.umalang.compiler;
// Created by 13dev - 18/10/2020

import com.umalang.antlr.generated.UmaLangLexer;
import com.umalang.antlr.generated.UmaLangParser;
import com.umalang.compiler.parser.UmaLangTreeWalkErrorListener;
import com.umalang.compiler.visitor.CompilationUnitVisitor;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Parser {

    public CompilationUnit getCompilationUnit(String fileAbsolutePath) throws IOException {
        CharStream charStream = new ANTLRFileStream(fileAbsolutePath);
        UmaLangLexer lexer = new UmaLangLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        UmaLangParser parser = new UmaLangParser(tokenStream);

        ANTLRErrorListener errorListener = new UmaLangTreeWalkErrorListener();
        parser.addErrorListener(errorListener);

        CompilationUnitVisitor compilationUnitVisitor = new CompilationUnitVisitor();
        return parser.compilationUnit().accept(compilationUnitVisitor);
    }
}
