package main.java.parser;
// Created by 13dev - 23/09/2020

import main.java.parser.token.TokenType;

import java.util.ArrayList;

public class Configuration {

    private final ArrayList<Keyword> keywords = new ArrayList<>();
    private final ArrayList<Symbol> symbols = new ArrayList<>();

    public void addKeyword(Keyword keyword) {
        keywords.add(keyword);
    }

    public void addKeyword(String search, TokenType token) {
        keywords.add(new Keyword(search, token, false));
    }

    public void addKeyword(String search, TokenType token, boolean breaking) {
        keywords.add(new Keyword(search, token, breaking));
    }

    public ArrayList<Keyword> getKeywords() {
        return keywords;
    }

    public void addSymbol(Symbol symbol) {
        symbols.add(symbol);
    }

    public void addSymbol(String search, TokenType token) {
        Symbol symbol = new Symbol(search, token);
        symbols.add(symbol);
    }

    public ArrayList<Symbol> getSymbols() {
        return symbols;
    }
}
