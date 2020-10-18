package com.umalang.compiler.bytecode.instructions;

import com.umalang.compiler.domain.classes.Function;

import java.util.*;

public class ClassDeclaration {

    private String name;
    private Collection<Function> methods;

    public ClassDeclaration(String name, Collection<Function> methods) {
        this.name = name;
        this.methods = methods;
    }

    public String getName() {
        return name;
    }

    public List<Function> getMethods() {
        return new ArrayList<>(methods);
    }
}
