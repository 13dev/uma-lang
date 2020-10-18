package com.umalang.compiler.util;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.classes.Function;
import com.umalang.compiler.domain.expression.FunctionParameter;
import com.umalang.compiler.domain.scope.FunctionSignature;
import com.umalang.compiler.domain.type.Type;

import java.util.Collection;
import java.util.stream.Collectors;

public class DecriptorFactory {
    public static String getMethodDescriptor(Function function) {
        Collection<FunctionParameter> arguments = function.getArguments();
        Type returnType = function.getType();
        return getMethodDescriptor(arguments, returnType);
    }

    public static String getMethodDescriptor(FunctionSignature signature) {
        Collection<FunctionParameter> arguments = signature.getArguments();
        Type returnType = signature.getReturnType();
        return getMethodDescriptor(arguments, returnType);
    }

    private static String getMethodDescriptor(Collection<FunctionParameter> argumanets, Type returnType) {
        String argumentDescriptor = argumanets.stream()
                .map(argument -> argument.getType().getDescriptor())
                .collect(Collectors.joining("", "(", ")"));
        String returnDescriptor = returnType.getDescriptor();
        return argumentDescriptor + returnDescriptor;
    }
}
