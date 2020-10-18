package com.umalang.compiler.domain.classes;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.expression.Expression;
import com.umalang.compiler.domain.expression.FunctionParameter;
import com.umalang.compiler.domain.scope.Scope;
import com.umalang.compiler.domain.statement.Statement;
import com.umalang.compiler.domain.type.Type;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Function extends Expression {
    private String name;
    private List<FunctionParameter> arguments;
    private List<Statement> statements;
    private Scope scope;

    public Function(Scope scope, String name, Type returnType, List<FunctionParameter> arguments, List<Statement> statements) {
        super(returnType);
        this.scope = scope;
        this.name = name;
        this.arguments = arguments;
        this.statements = statements;
    }

    public String getName() {
        return name;
    }

    public List<FunctionParameter> getArguments() {
        return Collections.unmodifiableList(arguments);
    }

    public Collection<Statement> getStatements() {
        return Collections.unmodifiableCollection(statements);
    }

    public Scope getScope() {
        return scope;
    }
}
