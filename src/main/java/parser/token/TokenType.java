package main.java.parser.token;
// Created by 13dev - 23/09/2020

public enum TokenType {
    FUNCTION_DECLARE,

    ASSIGNMENT,

    ADD,
    SUBTRACT,
    DIVIDE,
    MULTIPLY,

    EQUALITY,

    OPENBRAKET,
    CLOSEBRAKET,

    OPENBRACES,
    CLOSEBRACES,

    COMMA,
    COLON,
    DOT,

    INTEGER,
    STRING,
    ENCAPSULATEDSTRING,

    QUOTE,

    END_STATEMENT,
    UNDEFINED,

    NULL,
    BOOLEAN,
    RETURN,
    USERFUNC,
    OBJECT,

    AND,
    OR,
    IF,
    ELSEIF,
    ELSE,

    PRINT
}
