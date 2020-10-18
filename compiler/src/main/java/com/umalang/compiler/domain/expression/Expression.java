package com.umalang.compiler.domain.expression;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.statement.Statement;
import com.umalang.compiler.domain.type.Type;

public abstract class Expression implements Statement {
    private final Type type;

    public Expression(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

}
