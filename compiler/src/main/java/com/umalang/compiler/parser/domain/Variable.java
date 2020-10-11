package com.umalang.compiler.parser.domain;
// Created by 13dev - 11/10/2020

public class Variable {
    private final int id;
    private final int type;
    private final String value;

    public Variable(int id, int type, String value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public int getId() {
        return id;
    }
}
