package main.java.parser;
// Created by 13dev - 23/09/2020

import main.java.parser.token.TokenType;

public class Symbol extends Keyword {
    public Symbol(String keyword, TokenType tokenType) {
        super(keyword, tokenType, true);
    }
}
