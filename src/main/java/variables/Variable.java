package main.java.variables;

import main.java.values.Value;

public class Variable {
    private final String name;
    private Value value;

    public Variable(String name, Value value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }
}
