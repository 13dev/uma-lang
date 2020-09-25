package main.java.values;
// Created by 13dev - 23/09/2020

import main.java.parser.token.Token;
import main.java.parser.token.TokenType;

public class StringValue extends Value {
    private String value;

    public StringValue(String string) {
        this.value = string;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public ValueType getType() {
        return ValueType.STRING;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @Override
    public Token toToken() {
        return new Token(TokenType.STRING, this);
    }
}
