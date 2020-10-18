package com.umalang.compiler.domain.expression;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.type.Type;

public class Value extends Expression {
    private String value;

    public Value(Type type, String value) {
        super(type);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
