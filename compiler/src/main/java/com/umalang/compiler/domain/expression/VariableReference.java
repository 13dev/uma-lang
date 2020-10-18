package com.umalang.compiler.domain.expression;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.type.Type;

public class VariableReference extends Expression {

    private String varName;

    public VariableReference(String varName, Type type) {
        super(type);
        this.varName = varName;
    }

    public String getVarName() {
        return varName;
    }

}
