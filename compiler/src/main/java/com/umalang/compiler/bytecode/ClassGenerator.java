package com.umalang.compiler.bytecode;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.bytecode.instructions.ClassDeclaration;
import com.umalang.compiler.domain.classes.Function;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.util.List;

public class ClassGenerator {

    private static final int CLASS_VERSION = 52;
    private ClassWriter classWriter;

    public ClassGenerator() {
        classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES + ClassWriter.COMPUTE_MAXS);
    }

    public ClassWriter generate(ClassDeclaration classDeclaration) {
        String name = classDeclaration.getName();
        classWriter.visit(
                CLASS_VERSION,
                Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER,
                name,
                null,
                "java/lang/Object",
                null
        );
        List<Function> methods = classDeclaration.getMethods();
        methods.forEach(function -> new MethodGenerator(classWriter).generate(function));
        classWriter.visitEnd();
        return classWriter;
    }
}
