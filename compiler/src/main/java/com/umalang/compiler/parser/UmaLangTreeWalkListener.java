package com.umalang.compiler.parser;
// Created by 13dev - 11/10/2020

import com.umalang.antlr.generated.UmaLangBaseListener;
import com.umalang.antlr.generated.UmaLangParser;
import com.umalang.compiler.bytecode.CompilationUnit;
import com.umalang.compiler.bytecode.instructions.*;
import com.umalang.compiler.parser.domain.Variable;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class UmaLangTreeWalkListener extends UmaLangBaseListener {

    Queue<ClassScopeInstruction> classScopeInstructions = new ArrayDeque<>();
    Map<String, Variable> variables = new HashMap<>();
    private CompilationUnit compilationUnit;
    private ClassDeclaration classDeclaration;

    public Queue<ClassScopeInstruction> getClassScopeInstructions() {
        return classScopeInstructions;
    }

    @Override
    public void exitVariable(@NotNull UmaLangParser.VariableContext ctx) {
        final TerminalNode varName = ctx.ID();
        final UmaLangParser.ValueContext varValue = ctx.value();
        final int varType = varValue.getStart().getType();
        final int varIndex = variables.size();
        final String varTextValue = varValue.getText();

        Variable var = new Variable(varIndex, varType, varTextValue);

        variables.put(varName.getText(), var);
        classScopeInstructions.add(new VariableDeclaration(var));

        logVariableDeclarationStatementFound(varName, varValue);
    }


    @Override
    public void exitPrint(@NotNull UmaLangParser.PrintContext ctx) {

        final TerminalNode varName = ctx.ID();

        // var exists?
        if (!variables.containsKey(varName.getText())) {
            System.err.printf("ERROR: You are trying to print var '%s' which has not been declared!", varName.getText());
            return;
        }

        final Variable variable = variables.get(varName.getText());

        classScopeInstructions.add(new PrintVariable(variable));
        logPrintStatementFound(varName, variable);
    }

    @Override
    public void exitCompilationUnit(UmaLangParser.CompilationUnitContext ctx) {
        super.exitCompilationUnit(ctx);
        compilationUnit = new CompilationUnit(classDeclaration);
    }

    @Override
    public void exitClassUnit(UmaLangParser.ClassUnitContext ctx) {
        super.exitClassUnit(ctx);
        final String className = ctx.className().getText();
        classDeclaration = new ClassDeclaration(classScopeInstructions, className);
    }

    private void logPrintStatementFound(TerminalNode varName, Variable variable) {
        System.out.printf(
                "OK: You instructed to print variable '%s' which has value of '%s' at line '%s'.'\n",
                variable.getId(),
                variable.getValue(),
                varName.getSymbol().getLine()
        );
    }

    private void logVariableDeclarationStatementFound(TerminalNode varName, UmaLangParser.ValueContext varValue) {
        System.out.printf(
                "OK: You declared variable named '%s' with value of '%s' at line '%s'.\n",
                varName,
                varValue.getText(),
                varName.getSymbol().getLine()
        );
    }

    public CompilationUnit getCompilationUnit() {
        return compilationUnit;
    }
}
