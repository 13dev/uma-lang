package com.umalang.compiler.bytecode.instructions;

import java.util.ArrayDeque;
import java.util.Queue;

public class ClassDeclaration {

    private Queue<ClassScopeInstruction> instructions = new ArrayDeque<>();
    private String name;

    public ClassDeclaration(Queue<ClassScopeInstruction> instructions, String name) {
        this.instructions = instructions;
        this.name = name;
    }


    public Queue<ClassScopeInstruction> getClassScopeInstructions() {
        return instructions;
    }

    public String getName() {
        return name;
    }
}
