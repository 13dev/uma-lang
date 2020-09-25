package main.java.parser;
// Created by 13dev - 23/09/2020

import main.java.parser.token.Token;
import main.java.parser.token.TokenType;
import main.java.values.BooleanValue;
import main.java.values.EncapsulatedString;
import main.java.values.NullValue;
import main.java.values.StringValue;

import java.util.ArrayList;

public class Parser {
    public ArrayList<Token> tokens = new ArrayList<Token>();
    private ArrayList<Keyword> keywords = new ArrayList<Keyword>();
    private ArrayList<Symbol> symbols = new ArrayList<Symbol>();
    private String buffer = "";

    public Parser(Configuration config) {
        keywords.addAll(config.getKeywords());
        symbols.addAll(config.getSymbols());
    }

    public ArrayList<Token> parse(String text) {
        String[] lines = text.split("\n");

        for (String line : lines) {
            // ignore comments
            if (line.startsWith("//")) {
                continue;
            }

            parseLine(line);
        }

        return tokens;
    }

    public ArrayList<Token> parseLine(String line) {

        // remove new lines
        line = line.replace("\n", "");


        String[] lineStrings = line.split("");

        // TODO: parse all tokens

        for (String string : lineStrings) {
            parseAllTokens(string);
        }

        parseEncapsulatedStrings();

        parseEquality();

        return tokens;
    }


    private void parseAllTokens(String string) {

        if (buffer.equals(" ")) {
            buffer = "";
        }


        if (isSymbol(string)) {

            if (!buffer.equals("")) {
                parseString(buffer);
                buffer = "";
            }

            tokens.add(toSymbol(string));
        } else if (string.equals(" ")) {
            if (!buffer.equals("")) {
                parseString(buffer);
                buffer = "";
            }
        } else {
            buffer += string;
        }

    }

    private void parseString(String buffer) {
        if (isKeyword(buffer)) {
            tokens.add(toKeyword(buffer));
        } else if (isInteger(buffer)) {
            tokens.add(new Token(TokenType.INTEGER, new NullValue()));
        } else if (buffer.equals("true")) {
            tokens.add(new Token(TokenType.BOOLEAN, new BooleanValue(true)));
        } else if (buffer.equals("false")) {
            tokens.add(new Token(TokenType.BOOLEAN, new BooleanValue(false)));
        } else if (buffer.equals("null")) {
            tokens.add(new Token(TokenType.NULL, new NullValue()));
        } else {
            tokens.add(new Token(TokenType.STRING, new StringValue(buffer)));
        }
    }

    private void parseEncapsulatedStrings() {

        for (int i = 0; i < tokens.size(); i++) {

            Token token = tokens.get(i);

            // Check for a quote
            if (token.getType() == TokenType.QUOTE) {

                int endQuote = getCloseQuote(this.tokens, i);

                ArrayList<Token> stringTokens = slice(tokens, i, endQuote);

                // Turn Tokens into Strings
                ArrayList<StringValue> stringValues = new ArrayList<StringValue>();

                for (Token t : stringTokens) {

                    stringValues.add((StringValue) t.getValue());

                }

                Token string = new Token(TokenType.ENCAPSULATEDSTRING, new EncapsulatedString(stringValues));

                tokens.add(i, string);

                i = 0;
            }

        }
    }

    /**
     * Returns the closest close bracket
     *
     * @param tokens
     * @param openBracket
     * @return
     */
    private int getCloseQuote(ArrayList<Token> tokens, int openBracket) {

        for (int i = openBracket + 1; i < tokens.size(); i++) {
            if (tokens.get(i).getType() == TokenType.QUOTE) {
                return i;
            }
        }

        return -1;

    }

    /*
     * Removes elements between start and end from token array and returns them
     */
    private ArrayList<Token> slice(ArrayList<Token> tokens, int start, int end) {

        ArrayList<Token> result = new ArrayList<Token>();

        for (int i = start; i < end - 1; i++) {
            Token token = tokens.remove(start + 1);
            result.add(token);
        }

        // Get rid of old brackets
        tokens.remove(start);
        tokens.remove(start);

        return result;

    }

    private boolean isInteger(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    private void parseEquality() {

        for (int i = 0; i < tokens.size(); i++) {

            Token token = tokens.get(i);

            // Check for an assignment operator
            if (token.getType() == TokenType.ASSIGNMENT) {

                if (i + 1 < tokens.size()) {

                    if (tokens.get(i + 1).getType() == TokenType.ASSIGNMENT) {

                        tokens.remove(i);
                        tokens.remove(i);
                        tokens.add(i, new Token(TokenType.EQUALITY));

                    }

                }

            }

        }

    }

    private Token toKeyword(String string) {
        for (Keyword keyword : keywords) {
            if (keyword.getKeyword().equals(string)) {
                if (keyword.isSymbol()) {
                    tokens.add(new Token(TokenType.END_STATEMENT));
                }

                return new Token(keyword.getTokenType());
            }
        }

        throw new IllegalArgumentException("Input is not a valid keyword.");
    }

    private boolean isKeyword(String string) {
        try {
            toKeyword(string);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    /**
     * check if input is a valid symbol
     *
     * @param string input
     * @throws IllegalArgumentException IllegalArgumentException
     */
    private Token toSymbol(String string) {

        for (Symbol symbol : this.symbols) {
            if (symbol.getKeyword().equals(string)) {
                return new Token(symbol.getTokenType());
            }
        }

        throw new IllegalArgumentException("Input is not a valid symbol.");
    }

    /**
     * If given input is a symbol
     *
     * @param string string
     * @return if is symbol
     */
    private boolean isSymbol(String string) {

        try {
            toSymbol(string);
            return true;
        } catch (Exception ex) {
            return false;
        }

    }
}
