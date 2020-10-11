package com.umalang.compiler.parser;
// Created by 13dev - 11/10/2020

import com.umalang.antlr.generated.UmaLangLexer;
import com.umalang.antlr.generated.UmaLangParser;
import com.umalang.compiler.bytecode.instructions.Instruction;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.Queue;

public class SyntaxTreeTraverser {

    public Queue<Instruction> getInstructions(String filePath) throws IOException {
        // file that contain the .uma code
        CharStream charStream = new ANTLRFileStream(filePath);
        UmaLangLexer lexer = new UmaLangLexer(charStream);
        UmaLangParser parser = new UmaLangParser(
                new CommonTokenStream(lexer)
        );

        UmaLangTreeWalkListener listener = new UmaLangTreeWalkListener();

        parser.addErrorListener(new UmaLangTreeWalkErrorListener());
        parser.addParseListener(listener);
        parser.compilationUnit();

        return listener.getInstructionsQueue();

    }
}
