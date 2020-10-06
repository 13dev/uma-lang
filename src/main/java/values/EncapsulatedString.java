package main.java.values;
// Created by 13dev - 23/09/2020

import main.java.parser.token.Token;
import main.java.parser.token.TokenType;

import java.util.ArrayList;

public class EncapsulatedString extends Value {

    protected ArrayList<StringValue> strings = new ArrayList<>();

    public EncapsulatedString(String string) {
        this.strings.add(new StringValue(string));
    }

    public EncapsulatedString(ArrayList<StringValue> strings) {
        this.strings.addAll(strings);
    }

    public String getValue() {
        return getFull();
    }

    public void add(StringValue string) {
        this.strings.add(string);
    }

    public void add(String string) {
        this.strings.add(new StringValue(string));
    }

    private String getFull() {
        StringBuilder output = new StringBuilder();

        for (StringValue string : this.strings) {
            output.append(string.getValue()).append(" ");
        }

        return output.toString().trim();
    }

    @Override
    public ValueType getType() {
        return ValueType.ENCAPSULATEDSTRING;
    }

    @Override
    public String toString() {
        return getFull();
    }

    @Override
    public Token toToken() {
        return new Token(TokenType.ENCAPSULATEDSTRING, this);
    }

}