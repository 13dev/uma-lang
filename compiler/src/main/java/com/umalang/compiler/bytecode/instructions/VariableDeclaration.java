package com.umalang.compiler.bytecode.instructions;
// Created by 13dev - 11/10/2020

import com.umalang.antlr.generated.UmaLangLexer;
import com.umalang.compiler.parser.domain.Variable;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class VariableDeclaration implements Instruction, Opcodes {

    private Variable var;

    public VariableDeclaration(Variable var) {
        this.var = var;
    }

    @Override
    public void apply(MethodVisitor methodVisitor) {
        final int type = var.getType();
        if (type == UmaLangLexer.NUMBER) {
            int val = Integer.parseInt(var.getValue());
            methodVisitor.visitIntInsn(BIPUSH, val);
            methodVisitor.visitVarInsn(ISTORE, var.getId());

        } else if (type == UmaLangLexer.STRING) {
            methodVisitor.visitLdcInsn(var.getValue());
            methodVisitor.visitVarInsn(ASTORE, var.getId());
        }
    }
}
