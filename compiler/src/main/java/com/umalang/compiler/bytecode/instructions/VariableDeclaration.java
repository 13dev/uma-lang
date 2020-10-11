package com.umalang.compiler.bytecode.instructions;
// Created by 13dev - 11/10/2020

import com.umalang.antlr.generated.UmaLangLexer;
import com.umalang.compiler.parser.domain.Variable;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class VariableDeclaration implements Instruction, Opcodes {

    private final Variable var;

    public VariableDeclaration(Variable var) {
        this.var = var;
    }

    @Override
    public void apply(MethodVisitor methodVisitor) {
        switch (var.getType()) {
            case UmaLangLexer.NUMBER:
            {
                methodVisitor.visitIntInsn(BIPUSH, Integer.parseInt(var.getValue()));
                methodVisitor.visitVarInsn(ISTORE, var.getId());
            }
            case UmaLangLexer.STRING:
            {
                methodVisitor.visitLdcInsn(var.getValue());
                methodVisitor.visitVarInsn(ASTORE, var.getId());
            }

        }
    }
}
