package main.java.interpreter.exceptions;

import main.java.parser.token.Token;

import java.util.ArrayList;

public class SyntaxException extends Exception {
    private final ArrayList<Token> tokens;

    public SyntaxException(String message, ArrayList<Token> tokens) {
        super(message);
        this.tokens = tokens;
    }

    public ArrayList<Token> getTokens() {
        return tokens;
    }
}
