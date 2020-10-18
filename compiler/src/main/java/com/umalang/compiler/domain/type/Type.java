package com.umalang.compiler.domain.type;
// Created by 13dev - 18/10/2020

public interface Type {

    String getName();

    Class<?> getTypeClass();

    String getDescriptor();

    String getInternalName();
}
