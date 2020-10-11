package com.umalang.compiler.parser;
// Created by 13dev - 11/10/2020

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class UmaLangTreeWalkErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {

        System.err.printf("Sytanx error at line %d, char %d. Details: \n %s %n", line, charPositionInLine, msg);

        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
    }
}
