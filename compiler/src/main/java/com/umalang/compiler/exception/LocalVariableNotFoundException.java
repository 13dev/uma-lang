package com.umalang.compiler.exception;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.scope.Scope;

public class LocalVariableNotFoundException extends RuntimeException {
    public LocalVariableNotFoundException(Scope scope, String variableName) {
        super("Local Variable (" + variableName + ") not found in scope: " + scope);
    }
}
