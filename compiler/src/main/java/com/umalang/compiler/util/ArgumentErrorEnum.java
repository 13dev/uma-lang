package com.umalang.compiler.util;
// Created by 13dev - 11/10/2020

public enum ArgumentErrorEnum {
    NONE(""),
    NO_FILE("No file for compilation."),
    BAD_FILE_EXTENSION("File has to end with .uma extension.");

    private String message;

    ArgumentErrorEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
