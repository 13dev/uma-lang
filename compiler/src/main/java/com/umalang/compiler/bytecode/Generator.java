package com.umalang.compiler.bytecode;
// Created by 13dev - 11/10/2020

import com.umalang.compiler.bytecode.instructions.Instruction;
import com.umalang.compiler.bytecode.instructions.VariableDeclaration;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.Queue;

public class Generator implements Opcodes {

    public byte[] generateBytecode(Queue<Instruction> instructionQueue, String name) {
        ClassWriter classWriter = new ClassWriter(0);
        MethodVisitor methodVisitor;

        //version , acess, name, signature, base class (Object), interface
        classWriter.visit(52, ACC_PUBLIC + ACC_SUPER + ACC_FINAL, name, null, "java/lang/Object", null);

        //declare static void main (parameters...)
        methodVisitor = classWriter.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);

        // count how many local vars have in queue.
        final long localVariablesCount = instructionQueue.stream()
                .filter(instruction -> instruction instanceof VariableDeclaration)
                .count();

        //apply instructions generated from traversing parse tree!
        for (Instruction instruction : instructionQueue) {
            instruction.apply(methodVisitor);
        }

        methodVisitor.visitInsn(RETURN); //add return instruction
        methodVisitor.visitMaxs(100, (int) localVariablesCount); //set max stack and max local variables
        methodVisitor.visitEnd();


        classWriter.visitEnd();
        return classWriter.toByteArray();
    }
}
