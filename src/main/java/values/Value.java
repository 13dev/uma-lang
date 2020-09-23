package main.java.values;
// Created by 13dev - 23/09/2020

import main.java.parser.token.Token;

public abstract class Value {

    public abstract ValueType getType();

    public abstract Token toToken();

    @Override
    public String toString() {
        return getType() + "";
    }
}
