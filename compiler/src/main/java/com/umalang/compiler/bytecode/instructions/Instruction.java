package com.umalang.compiler.bytecode.instructions;
// Created by 13dev - 11/10/2020

import org.objectweb.asm.MethodVisitor;

public interface Instruction {
    void apply(MethodVisitor methodVisitor);
}
