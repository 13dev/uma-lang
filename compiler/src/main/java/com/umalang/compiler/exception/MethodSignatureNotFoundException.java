package com.umalang.compiler.exception;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.scope.Scope;

public class MethodSignatureNotFoundException extends RuntimeException {

    public MethodSignatureNotFoundException(Scope scope, String methodName) {
        super("No method found: " + methodName);
    }
}
