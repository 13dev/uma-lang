package main.java.parser;
// Created by 13dev - 23/09/2020

import main.java.parser.token.TokenType;

public class Keyword {
    private final String keyword;
    private final TokenType tokenType;
    private final boolean symbol;

    public Keyword(String keyword, TokenType tokenType, boolean symbol) {
        this.keyword = keyword;
        this.tokenType = tokenType;
        this.symbol = symbol;
    }

    public TokenType getTokenType() {
        return tokenType;
    }

    public String getKeyword() {
        return keyword;
    }

    public boolean isSymbol() {
        return symbol;
    }
}
