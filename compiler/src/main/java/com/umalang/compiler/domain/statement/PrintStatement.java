package com.umalang.compiler.domain.statement;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.expression.Expression;

public class PrintStatement implements Statement {

    private Expression expression;

    public PrintStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}
