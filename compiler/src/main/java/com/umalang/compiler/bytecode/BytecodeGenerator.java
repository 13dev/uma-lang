package com.umalang.compiler.bytecode;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.CompilationUnit;
import com.umalang.compiler.bytecode.instructions.ClassDeclaration;

public class BytecodeGenerator {

    public byte[] generate(CompilationUnit compilationUnit) {
        ClassDeclaration classDeclaration = compilationUnit.getClassDeclaration();
        ClassGenerator classGenerator = new ClassGenerator();
        return classGenerator.generate(classDeclaration).toByteArray();
    }

}
