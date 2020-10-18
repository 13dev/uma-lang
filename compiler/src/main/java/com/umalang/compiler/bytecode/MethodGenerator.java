package com.umalang.compiler.bytecode;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.classes.Function;
import com.umalang.compiler.domain.scope.Scope;
import com.umalang.compiler.domain.statement.Statement;
import com.umalang.compiler.util.DecriptorFactory;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.Collection;

public class MethodGenerator {

    private ClassWriter classWriter;

    public MethodGenerator(ClassWriter classWriter) {
        this.classWriter = classWriter;
    }

    public void generate(Function function) {
        Scope scope = function.getScope();
        String name = function.getName();
        String description = DecriptorFactory.getMethodDescriptor(function);
        Collection<Statement> instructions = function.getStatements();
        int access = Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC;//(function.getName().equals("main") ? Opcodes.ACC_STATIC : 0);
        MethodVisitor mv = classWriter.visitMethod(access, name, description, null, null);
        mv.visitCode();
        StatementGenerator statementGenerator = new StatementGenerator(mv);
        instructions.forEach(instruction -> statementGenerator.generate(instruction, scope));
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(-1, -1);
        mv.visitEnd();
    }
}
