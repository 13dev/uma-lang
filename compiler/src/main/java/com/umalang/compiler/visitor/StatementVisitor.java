package com.umalang.compiler.visitor;
// Created by 13dev - 18/10/2020

import com.umalang.antlr.generated.UmaLangBaseVisitor;
import com.umalang.antlr.generated.UmaLangParser;
import com.umalang.compiler.bytecode.instructions.ClassScopeInstruction;
import com.umalang.compiler.domain.expression.Expression;
import com.umalang.compiler.domain.scope.LocalVariable;
import com.umalang.compiler.domain.scope.Scope;
import com.umalang.compiler.domain.statement.PrintStatement;
import com.umalang.compiler.domain.statement.Statement;
import com.umalang.compiler.domain.statement.VariableDeclarationStatement;
import com.umalang.compiler.parser.domain.Variable;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class StatementVisitor extends UmaLangBaseVisitor<Statement> {
    private Queue<ClassScopeInstruction> classScopeInstructions = new ArrayDeque<>();
    private Map<String, Variable> variables = new HashMap<>();
    private Scope scope;

    public StatementVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Statement visitVariable(UmaLangParser.VariableContext ctx) {
        UmaLangParser.ExpressionContext expressionContext = ctx.expression();
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(scope);
        Expression expression = expressionContext.accept(expressionVisitor);
        return new PrintStatement(expression);
    }

    @Override
    public Statement visitPrint(UmaLangParser.PrintContext ctx) {
        UmaLangParser.ExpressionContext expressionContext = ctx.expression();
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(scope);
        Expression expression = expressionContext.accept(expressionVisitor);
        return new PrintStatement(expression);
    }

    private void logVariableDeclarationStatementFound(TerminalNode varName, UmaLangParser.ValueContext varValue) {
        final int line = varName.getSymbol().getLine();
        final String format = "OK: You declared variable named '%s' with value of '%s' at line '%s'.\n";
        System.out.printf(format, varName, varValue.getText(), line);
    }

    private void logPrintStatementFound(TerminalNode varName, Variable variable) {
        final int line = varName.getSymbol().getLine();
        final String format = "OK: You instructed to print variable '%s' which has value of '%s' at line '%s'.'\n";
        System.out.printf(format, variable.getId(), variable.getValue(), line);
    }

    public Queue<ClassScopeInstruction> getClassScopeInstruction() {
        return classScopeInstructions;
    }

}
