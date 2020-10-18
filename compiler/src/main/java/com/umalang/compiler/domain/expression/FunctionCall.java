package com.umalang.compiler.domain.expression;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.scope.FunctionSignature;
import com.umalang.compiler.domain.type.Type;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

public class FunctionCall extends Expression {

    private Type owner;
    private FunctionSignature functionSignature;
    private Collection<Expression> params;

    public FunctionCall(FunctionSignature functionSignature, Collection<Expression> params, Type type) {
        super(functionSignature.getReturnType());

        this.functionSignature = functionSignature;
        this.params = params;
        this.owner = owner;
    }

    public String getFunctionName() {
        return functionSignature.getName();
    }

    public FunctionSignature getSignature() {
        return functionSignature;
    }

    public Optional<Type> getOwner() {
        return Optional.ofNullable(owner);
    }

    public Collection<Expression> getParameters() {
        return Collections.unmodifiableCollection(params);
    }
}
