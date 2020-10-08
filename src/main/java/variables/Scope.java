package main.java.variables;

import main.java.values.Value;

import java.util.ArrayList;

public class Scope {

    public ArrayList<Variable> variables = new ArrayList<>();

    public void addVariable(String string, Value value) {
        variables.add(
                new Variable(string, value)
        );
    }


    public void removeVariable(int value) {
        for (int index = 0; index < variables.size(); index++) {
            if (variables.get(index).getName().equals(value)) {
                variables.remove(index);
                return;
            }
        }
    }
}
