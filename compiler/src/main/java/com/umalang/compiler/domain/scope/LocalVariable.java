package com.umalang.compiler.domain.scope;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.expression.Expression;
import com.umalang.compiler.domain.type.Type;

public class LocalVariable extends Expression {

    private String name;

    public LocalVariable(String name, Type type) {
        super(type);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
