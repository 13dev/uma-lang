package com.umalang.compiler.exception;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.expression.FunctionCall;
import com.umalang.compiler.domain.scope.Scope;

public class CalledFunctionDoesNotExistException extends CompilationException {

    FunctionCall functionCall;

    public CalledFunctionDoesNotExistException(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public CalledFunctionDoesNotExistException(FunctionCall functionCall, ReflectiveOperationException e) {
        this(functionCall);
    }

    public CalledFunctionDoesNotExistException(FunctionCall functionCall, Scope scope) {
        this(functionCall);
    }

    @Override
    public String getMessage() {
        return "Function call" + functionCall.toString() + "does not exists.";
    }
}
