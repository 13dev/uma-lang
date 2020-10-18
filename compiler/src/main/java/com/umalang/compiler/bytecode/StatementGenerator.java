package com.umalang.compiler.bytecode;
// Created by 13dev - 18/10/2020

import com.umalang.compiler.domain.expression.Expression;
import com.umalang.compiler.domain.expression.Value;
import com.umalang.compiler.domain.scope.LocalVariable;
import com.umalang.compiler.domain.scope.Scope;
import com.umalang.compiler.domain.statement.PrintStatement;
import com.umalang.compiler.domain.statement.Statement;
import com.umalang.compiler.domain.statement.VariableDeclarationStatement;
import com.umalang.compiler.domain.type.ClassType;
import com.umalang.compiler.domain.type.InternalType;
import com.umalang.compiler.domain.type.Type;
import org.apache.commons.lang3.StringUtils;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class StatementGenerator {
    private MethodVisitor methodVisitor;
    private ExpressionGenerator expressionGenerator;

    public StatementGenerator(MethodVisitor methodVisitor) {
        this.methodVisitor = methodVisitor;
        expressionGenerator = new ExpressionGenerator(methodVisitor);
    }

    public void generate(Statement expression, Scope scope) {

        if (expression instanceof PrintStatement) {
            PrintStatement printStatement = (PrintStatement) expression;
            generate(printStatement, scope);
        } else if (expression instanceof VariableDeclarationStatement) {
            VariableDeclarationStatement variableDeclarationStatement = (VariableDeclarationStatement) expression;
            generate(variableDeclarationStatement, scope);
        } else if (expression instanceof Expression) {
            expressionGenerator.generate((Expression) expression, scope);
        }
    }


    public void generate(PrintStatement printStatement, Scope scope) {
        ExpressionGenerator expressionGenrator = new ExpressionGenerator(methodVisitor);
        Expression expression = printStatement.getExpression();
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        expressionGenrator.generate(expression, scope);
        Type type = expression.getType();
        String descriptor = "(" + type.getDescriptor() + ")V";
        ClassType owner = new ClassType("java.io.PrintStream");
        String fieldDescriptor = owner.getDescriptor();
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, fieldDescriptor, "println", descriptor, false);
    }

    public void generate(VariableDeclarationStatement variableDeclarationStatement, Scope scope) {
        Expression expression = variableDeclarationStatement.getExpression();
        String name = variableDeclarationStatement.getName();
        int index = scope.getLocalVariableIndex(name);
        if (expression instanceof Value) {
            Value value = (Value) expression;
            Type type = value.getType();
            String stringValue = value.getValue();
            if (type == InternalType.INT) {
                int val = Integer.parseInt(stringValue);
                methodVisitor.visitIntInsn(Opcodes.BIPUSH, val);
                methodVisitor.visitVarInsn(Opcodes.ISTORE, index);
            } else if (type == InternalType.STRING) {

                stringValue = StringUtils.removeStart(stringValue, "\"");
                stringValue = StringUtils.removeEnd(stringValue, "\"");

                methodVisitor.visitLdcInsn(stringValue);
                methodVisitor.visitVarInsn(Opcodes.ASTORE, index);
            }
        }
        scope.addLocalVariable(
                new LocalVariable(name, expression.getType())
        );
    }

}
