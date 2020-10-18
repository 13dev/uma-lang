package com.umalang.compiler;

import com.umalang.compiler.bytecode.instructions.ClassDeclaration;
import org.objectweb.asm.Opcodes;

public class CompilationUnit implements Opcodes {

    private ClassDeclaration classDeclaration;

    public CompilationUnit(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }


    public String getClassName() {
        return classDeclaration.getName();
    }
}
