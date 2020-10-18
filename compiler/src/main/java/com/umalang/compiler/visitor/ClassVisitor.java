package com.umalang.compiler.visitor;
// Created by 13dev - 18/10/2020

import com.umalang.antlr.generated.UmaLangBaseVisitor;
import com.umalang.antlr.generated.UmaLangParser;
import com.umalang.compiler.bytecode.instructions.ClassDeclaration;
import com.umalang.compiler.domain.MetaData;
import com.umalang.compiler.domain.classes.Function;
import com.umalang.compiler.domain.scope.FunctionSignature;
import com.umalang.compiler.domain.scope.Scope;

import java.util.List;
import java.util.stream.Collectors;

public class ClassVisitor extends UmaLangBaseVisitor<ClassDeclaration> {
    private Scope scope;

    @Override
    public ClassDeclaration visitClassDeclaration(UmaLangParser.ClassDeclarationContext ctx) {
        String name = ctx.className().getText();
        FunctionSignatureVisitor functionSignatureVisitor = new FunctionSignatureVisitor();
        List<UmaLangParser.FunctionContext> methodCtx = ctx.classBody().function();

        MetaData metaData = new MetaData(ctx.className().getText());
        scope = new Scope(metaData);
        List<FunctionSignature> signatures = methodCtx.stream()
                .map(method -> method.functionDeclaration().accept(functionSignatureVisitor))
                .peek(scope::addSignature)
                .collect(Collectors.toList());
        List<Function> methods = methodCtx.stream()
                .map(method -> method.accept(new FunctionVisitor(scope)))
                .collect(Collectors.toList());
        return new ClassDeclaration(name, methods);
    }

    //    @Override
//    public ClassDeclaration visitClassDeclaration(UmaLangParser.ClassUnitContext ctx) {
//
//    }
}
