package main.java.parser.token;

import main.java.values.NullValue;
import main.java.values.Value;

// This class will handle the token, each token has type and value.
public class Token {

    private final TokenType type;
    private final Value value;

    public Token(TokenType type) {
        this.type = type;
        this.value = new NullValue();
    }

    public Token(TokenType type, Value value) {
        this.type = type;
        this.value = value;
    }

    public TokenType getType() {
        return type;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {

        if (getValue().toString().isEmpty()) {
            return getType().toString();
        }

        return "(" + getType().toString().toLowerCase() + ") " + getValue().toString();
    }
}
