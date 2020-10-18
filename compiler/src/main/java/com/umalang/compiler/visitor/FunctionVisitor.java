package com.umalang.compiler.visitor;
// Created by 13dev - 18/10/2020

import com.umalang.antlr.generated.UmaLangBaseVisitor;
import com.umalang.antlr.generated.UmaLangParser;

import com.umalang.compiler.domain.classes.Function;
import com.umalang.compiler.domain.expression.FunctionParameter;
import com.umalang.compiler.domain.scope.LocalVariable;
import com.umalang.compiler.domain.scope.Scope;
import com.umalang.compiler.domain.statement.Statement;
import com.umalang.compiler.domain.type.Type;
import com.umalang.compiler.util.ResolverType;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionVisitor extends UmaLangBaseVisitor<Function> {

    private Scope scope;

    public FunctionVisitor(Scope scope) {
        this.scope = new Scope(scope);
    }

    @Override
    public Function visitFunction(@NotNull UmaLangParser.FunctionContext ctx) {
        String name = getName(ctx);
        Type returnType = getReturnType(ctx);
        List<FunctionParameter> arguments = getArguments(ctx);
        List<Statement> instructions = getStatements(ctx);
        return new Function(scope, name, returnType, arguments, instructions);
    }

    private String getName(UmaLangParser.FunctionContext functionDeclarationContext) {
        return functionDeclarationContext.functionDeclaration().functionName().getText();
    }

    private Type getReturnType(UmaLangParser.FunctionContext functionDeclarationContext) {
        UmaLangParser.TypeContext typeCtx = functionDeclarationContext.functionDeclaration().type();
        return ResolverType.getFromTypeName(typeCtx);
    }

    private List<FunctionParameter> getArguments(UmaLangParser.FunctionContext functionDeclarationContext) {
        List<UmaLangParser.FunctionArgumentContext> argsCtx = functionDeclarationContext.functionDeclaration().functionArgument();
        List<FunctionParameter> parameters = argsCtx.stream()
                .map(paramCtx -> new FunctionParameter(paramCtx.ID().getText(), ResolverType.getFromTypeName(paramCtx.type())))
                .peek(param -> scope.addLocalVariable(new LocalVariable(param.getName(), param.getType())))
                .collect(Collectors.toList());
        return parameters;
    }

    private List<Statement> getStatements(@NotNull UmaLangParser.FunctionContext ctx) {
        StatementVisitor statementVisitor = new StatementVisitor(scope);
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(scope);
        CompositeVisitor<Statement> compositeVisitor = new CompositeVisitor<>(statementVisitor, expressionVisitor);
        return ctx.blockStatement().stream()
                .map(compositeVisitor::accept)
                .collect(Collectors.toList());
    }
}

