package com.umalang.compiler.domain.scope;
// Created by 13dev - 18/10/2020

import com.google.common.collect.Lists;
import com.umalang.compiler.domain.MetaData;
import com.umalang.compiler.exception.LocalVariableNotFoundException;
import com.umalang.compiler.exception.MethodSignatureNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Scope {
    private List<LocalVariable> localVariables;
    private List<FunctionSignature> functionSignatures;
    private MetaData metaData;

    public Scope(MetaData metaData) {
        this.metaData = metaData;
        localVariables = new ArrayList<>();
        functionSignatures = new ArrayList<>();
    }

    public Scope(Scope scope) {
        metaData = scope.metaData;
        localVariables = new ArrayList<>();
        functionSignatures = Lists.newArrayList(scope.functionSignatures);
    }

    public void addSignature(FunctionSignature signature) {
        functionSignatures.add(signature);
    }

    public FunctionSignature getSignature(String methodName) {


        return functionSignatures.stream()
                .filter(signature -> signature.getName().equals(methodName))
                .findFirst()
                .orElseThrow(() -> new MethodSignatureNotFoundException(this, methodName));
    }

    public void addLocalVariable(LocalVariable localVariable) {
        localVariables.add(localVariable);
    }


    public LocalVariable getLocalVariable(String varName) {

        return localVariables.stream()
                .filter(variable -> variable.getName().equals(varName))
                .findFirst()
                .orElseThrow(() -> new LocalVariableNotFoundException(this, varName));
    }

    public int getLocalVariableIndex(String varName) {
        LocalVariable localVariable = getLocalVariable(varName);
        return localVariables.indexOf(localVariable);
    }

    public String getClassName() {
        return metaData.getClassName();
    }
}
