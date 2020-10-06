package main.java.interpreter.exceptions;

import main.java.values.Value;

public class TypeException extends Exception {

    private final Value value;

    public TypeException(String message, Value value) {
        super(message);
        this.value = value;
    }

    public Value getValue() {
        return value;
    }
}
