package com.umalang.compiler.domain.expression;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.type.Type;

public class FunctionParameter extends Expression {
    private final String name;

    public FunctionParameter(String name, Type type) {
        super(type);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
