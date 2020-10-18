package com.umalang.compiler.visitor;
// Created by 13dev - 18/10/2020

import com.umalang.antlr.generated.UmaLangBaseVisitor;
import com.umalang.antlr.generated.UmaLangParser;
import com.umalang.compiler.CompilationUnit;
import com.umalang.compiler.bytecode.instructions.ClassDeclaration;

public class CompilationUnitVisitor extends UmaLangBaseVisitor<CompilationUnit> {

    @Override
    public CompilationUnit visitCompilationUnit(UmaLangParser.CompilationUnitContext ctx) {
        ClassVisitor classVisitor = new ClassVisitor();
        UmaLangParser.ClassDeclarationContext classDeclarationContext = ctx.classDeclaration();
        ClassDeclaration classDeclaration = classDeclarationContext.accept(classVisitor);
        return new CompilationUnit(classDeclaration);
    }

}
