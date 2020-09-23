package main.java;
// Created by 13dev - 23/09/2020

import main.java.parser.Configuration;
import main.java.parser.Parser;
import main.java.parser.token.Token;
import main.java.parser.token.TokenType;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class UmaLang {

    public static void main(String[] args) throws IOException {
        Parser parser = new Parser(getParserConfig());

        try {

            String text = readFile("./src/main/java/file.uma");
            text = cleanCode(text);

            ArrayList<Token> tokens = parser.parse(text);

            System.out.println(tokens);

        } catch (Exception ex) {
            throw ex;
        }
    }

    private static String readFile(String path) throws IOException {
        FileInputStream stream = new FileInputStream(new File(path));
        try {
            FileChannel fc = stream.getChannel();
            MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
            /* Instead of using default, pass in a decoder. */
            return Charset.defaultCharset().decode(bb).toString();
        } finally {
            stream.close();
        }
    }


    public static String cleanCode(String text) {

        while (true) {

            int returnIndex = text.indexOf("\r");
            int tabIndex = text.indexOf("\t");

            int index;
            if (returnIndex != -1) {
                index = returnIndex;
            } else if (tabIndex != -1) {
                index = tabIndex;
            } else {
                break;
            }

            text = text.substring(0, index) + "\n" + text.substring(index + "\r".length());
        }

        return text;

    }

    public static Configuration getParserConfig() {
        Configuration parserConfig = new Configuration();

        // Basic Keywords
        parserConfig.addKeyword("function", TokenType.FUNCTION_DECLARE);
        parserConfig.addKeyword("return", TokenType.RETURN, true);
        parserConfig.addKeyword("if", TokenType.IF, true);
        parserConfig.addKeyword("else", TokenType.ELSE);
        parserConfig.addKeyword("print", TokenType.PRINT, true);

        // Comon Symbols
        parserConfig.addSymbol(".", TokenType.DOT);
        parserConfig.addSymbol(":", TokenType.COLON);
        parserConfig.addSymbol(";", TokenType.END_STATEMENT);
        parserConfig.addSymbol("\"", TokenType.QUOTE);
        parserConfig.addSymbol(",", TokenType.COMMA);

        // General Operators
        parserConfig.addSymbol("+", TokenType.ADD);
        parserConfig.addSymbol("-", TokenType.SUBTRACT);
        parserConfig.addSymbol("*", TokenType.MULTIPLY);
        parserConfig.addSymbol("/", TokenType.DIVIDE);
        parserConfig.addSymbol("=", TokenType.ASSIGNMENT);

        // Equality Operators
        parserConfig.addSymbol("==", TokenType.EQUALITY);
        parserConfig.addSymbol("&&", TokenType.AND);
        parserConfig.addSymbol("&", TokenType.AND);
        parserConfig.addKeyword("AND", TokenType.AND);
        parserConfig.addSymbol("||", TokenType.OR);
        parserConfig.addSymbol("|", TokenType.OR);
        parserConfig.addKeyword("OR", TokenType.OR);

        // Structural Symbols
        parserConfig.addSymbol("(", TokenType.OPENBRACKET);
        parserConfig.addSymbol(")", TokenType.CLOSEBRACKET);
        parserConfig.addSymbol("{", TokenType.OPENBRACES);
        parserConfig.addSymbol("}", TokenType.CLOSEBRACES);

        // Extra
        parserConfig.addKeyword("create", TokenType.FUNCTION_DECLARE);
        parserConfig.addKeyword("equals", TokenType.ASSIGNMENT);
        parserConfig.addKeyword("equal", TokenType.ASSIGNMENT);
        parserConfig.addKeyword("plus", TokenType.ADD);
        parserConfig.addKeyword("minus", TokenType.SUBTRACT);
        parserConfig.addKeyword("times", TokenType.MULTIPLY);
        parserConfig.addKeyword("els", TokenType.ELSE);

        return parserConfig;
    }
}
