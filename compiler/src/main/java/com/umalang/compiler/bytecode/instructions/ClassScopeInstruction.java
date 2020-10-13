package com.umalang.compiler.bytecode.instructions;

import org.objectweb.asm.MethodVisitor;

public interface ClassScopeInstruction {

    void apply(MethodVisitor methodVisitor);
}
