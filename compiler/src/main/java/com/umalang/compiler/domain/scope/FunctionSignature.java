package com.umalang.compiler.domain.scope;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.expression.FunctionParameter;
import com.umalang.compiler.domain.type.Type;

import java.util.List;

public class FunctionSignature {

    private String name;
    private List<FunctionParameter> arguments;
    private Type returnType;

    public FunctionSignature(String name, List<FunctionParameter> args, Type returnType) {
        this.name = name;
        this.arguments = args;
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public List<FunctionParameter> getArguments() {
        return arguments;
    }

    public Type getReturnType() {
        return returnType;
    }
}
