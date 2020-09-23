package main.java.parser;
// Created by 13dev - 23/09/2020

import main.java.parser.token.Token;

import java.util.ArrayList;

public class Parser {
    public ArrayList<Token> tokens = new ArrayList<Token>();
    private ArrayList<Keyword> keywords = new ArrayList<Keyword>();
    private ArrayList<Symbol> symbols = new ArrayList<Symbol>();

    public Parser(Configuration configuration) {
        // TODO: load all from configuration, symbols, and keywords.
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

        // TODO: search for encapsulated strings

        // TODO: search for equality ops.
    }
}
