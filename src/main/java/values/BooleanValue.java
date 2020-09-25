package main.java.values;
// Created by 13dev - 23/09/2020

import main.java.parser.token.Token;
import main.java.parser.token.TokenType;

public final class BooleanValue extends Value {
    private final boolean value;

    public BooleanValue(boolean value) {
        this.value = value;
    }

    @Override
    public ValueType getType() {
        return ValueType.BOOLEAN;
    }

    @Override
    public Token toToken() {
        return new Token(TokenType.BOOLEAN, this);
    }
}
