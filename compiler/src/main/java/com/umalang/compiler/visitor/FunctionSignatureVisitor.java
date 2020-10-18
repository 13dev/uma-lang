package com.umalang.compiler.visitor;
// Created by 13dev - 18/10/2020

import com.umalang.antlr.generated.UmaLangBaseVisitor;
import com.umalang.antlr.generated.UmaLangParser;
import com.umalang.compiler.domain.expression.FunctionParameter;
import com.umalang.compiler.domain.scope.FunctionSignature;
import com.umalang.compiler.domain.type.Type;
import com.umalang.compiler.util.ResolverType;

import java.util.ArrayList;
import java.util.List;

public class FunctionSignatureVisitor extends UmaLangBaseVisitor<FunctionSignature> {

    @Override
    public FunctionSignature visitFunctionDeclaration(UmaLangParser.FunctionDeclarationContext ctx) {
        String functionName = ctx.functionName().getText();

        List<UmaLangParser.FunctionArgumentContext> argsCtx = ctx.functionArgument();
        List<FunctionParameter> parameters = new ArrayList<>();

        for (UmaLangParser.FunctionArgumentContext argCtx : argsCtx) {
            String name = argCtx.ID().getText();
            Type type = ResolverType.getFromTypeName(argCtx.type());
            FunctionParameter functionParameter = new FunctionParameter(name, type);
            parameters.add(functionParameter);
        }

        Type returnType = ResolverType.getFromTypeName(ctx.type());
        return new FunctionSignature(functionName, parameters, returnType);
    }
}
