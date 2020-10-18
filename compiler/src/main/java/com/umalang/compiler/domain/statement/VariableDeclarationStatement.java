package com.umalang.compiler.domain.statement;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.expression.Expression;

public class VariableDeclarationStatement implements Statement {
    private String name;
    private Expression expression;

    public VariableDeclarationStatement(String name, Expression expression) {
        this.name = name;
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public Expression getExpression() {
        return expression;
    }
}
