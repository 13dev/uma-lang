package main.java.values;
// Created by 13dev - 23/09/2020

import main.java.parser.token.Token;
import main.java.parser.token.TokenType;

public final class NullValue extends Value {
    @Override
    public ValueType getType() {
        return ValueType.NULL;
    }

    @Override
    public Token toToken() {
        return new Token(TokenType.NULL);
    }
}
