package com.umalang.compiler.bytecode.instructions;
// Created by 13dev - 11/10/2020

import com.umalang.antlr.generated.UmaLangLexer;
import com.umalang.compiler.parser.domain.Variable;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class PrintVariable implements Instruction, Opcodes {

    private final Variable variable;

    public PrintVariable(Variable variable) {

        this.variable = variable;
    }

    @Override
    public void apply(MethodVisitor methodVisitor) {
        final int id = variable.getId();
        final int type = variable.getType();

        methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");

        switch (type) {
            case UmaLangLexer.NUMBER:
            {
                methodVisitor.visitVarInsn(ILOAD, id);
                methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false);
            }
            case UmaLangLexer.STRING:
            {
                methodVisitor.visitVarInsn(ALOAD, id);
                methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
            }
        }
    }


}
