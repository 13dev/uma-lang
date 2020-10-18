package com.umalang.compiler.visitor;
// Created by 13dev - 18/10/2020

import com.umalang.antlr.generated.UmaLangBaseVisitor;
import com.umalang.antlr.generated.UmaLangParser;
import com.umalang.compiler.domain.expression.*;
import com.umalang.compiler.domain.scope.FunctionSignature;
import com.umalang.compiler.domain.scope.LocalVariable;
import com.umalang.compiler.domain.scope.Scope;
import com.umalang.compiler.domain.type.Type;
import com.umalang.compiler.util.ResolverType;

import java.util.List;
import java.util.stream.Collectors;

public class ExpressionVisitor extends UmaLangBaseVisitor<Expression> {
    private final Scope scope;

    public ExpressionVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Expression visitVariableReference(UmaLangParser.VariableReferenceContext ctx) {
        String varName = ctx.getText();
        LocalVariable localVariable = scope.getLocalVariable(varName);
        return new VariableReference(varName, localVariable.getType());
    }


    @Override
    public Expression visitValue(UmaLangParser.ValueContext ctx) {
        String value = ctx.getText();
        return new Value(ResolverType.getFromValue(value), value);
    }


    @Override
    public Expression visitFunctionCall(UmaLangParser.FunctionCallContext ctx) {
        String funName = ctx.functionName().getText();
        FunctionSignature signature = scope.getSignature(funName);

        List<FunctionParameter> signatureParameters = signature.getArguments();
        List<UmaLangParser.ExpressionContext> calledParameters = ctx.expressionList().expression();
        List<Expression> arguments = calledParameters.stream()
                .map(expressionContext -> expressionContext.accept(new ExpressionVisitor(scope)))
                .collect(Collectors.toList());
        Type returnType = signature.getReturnType();

        return new FunctionCall(signature, arguments, null);

    }
}

