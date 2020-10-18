package com.umalang.compiler.bytecode;
// Created by 13dev - 18/10/2020


import com.umalang.compiler.domain.expression.*;
import com.umalang.compiler.domain.scope.LocalVariable;
import com.umalang.compiler.domain.scope.Scope;
import com.umalang.compiler.domain.type.ClassType;
import com.umalang.compiler.domain.type.InternalType;
import com.umalang.compiler.domain.type.Type;
import com.umalang.compiler.exception.CalledFunctionDoesNotExistException;
import com.umalang.compiler.parser.domain.Variable;
import com.umalang.compiler.util.DecriptorFactory;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Optional;

public class ExpressionGenerator {

    private MethodVisitor methodVisitor;

    public ExpressionGenerator(MethodVisitor methodVisitor) {
        this.methodVisitor = methodVisitor;
    }


    public void generate(Expression expression, Scope scope) {
        if (expression instanceof VariableReference) {
            VariableReference varReference = (VariableReference) expression;
            generate(varReference, scope);
        }
        if (expression instanceof Value) {
            Value value = (Value) expression;
            generate(value, scope);
        } else if (expression instanceof FunctionCall) {
            FunctionCall functionCall = (FunctionCall) expression;
            generate(functionCall, scope);
        } else if (expression instanceof FunctionParameter) {
            FunctionParameter parameter = (FunctionParameter) expression;
            generate(parameter, scope);
        }
    }

    public void generate(VariableReference varReference, Scope scope) {
        String varName = varReference.getVarName();
        int index = scope.getLocalVariableIndex(varName);
        LocalVariable localVariable = scope.getLocalVariable(varName);
        Type type = localVariable.getType();
        if (type == InternalType.INT) {
            methodVisitor.visitVarInsn(Opcodes.ILOAD, index);
        } else if (type == InternalType.STRING) {
            methodVisitor.visitVarInsn(Opcodes.ALOAD, index);
        }
    }

    public void generate(FunctionParameter parameter, Scope scope) {
        Type type = parameter.getType();
        int index = scope.getLocalVariableIndex(parameter.getName());
        if (type == InternalType.INT) {
            methodVisitor.visitVarInsn(Opcodes.ILOAD, index);
        } else if (type == InternalType.STRING) {
            methodVisitor.visitVarInsn(Opcodes.ALOAD, index);
        }
    }


    public void generate(Value value, Scope scope) {
        Type type = value.getType();
        String stringValue = value.getValue();
        if (type == InternalType.INT) {
            int intValue = Integer.parseInt(stringValue);
            methodVisitor.visitIntInsn(Opcodes.BIPUSH, intValue);
        } else if (type == InternalType.STRING) {
            methodVisitor.visitLdcInsn(stringValue);
        }
    }


    public void generate(FunctionCall functionCall, Scope scope) {
        Collection<Expression> parameters = functionCall.getParameters();
        parameters.forEach(param -> generate(param, scope));
        Type owner = functionCall.getOwner().orElse(new ClassType(scope.getClassName()));
        String methodDescriptor = getFunctionDescriptor(functionCall, scope);
        String ownerDescriptor = owner.getInternalName();
        String functionName = functionCall.getFunctionName();
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, ownerDescriptor, functionName, methodDescriptor, false);
    }

    public String getFunctionDescriptor(FunctionCall functionCall, Scope scope) {
        return Optional.of(getDescriptorForFunctionInScope(functionCall, scope))
                .orElse(getDescriptorForFunctionOnClasspath(functionCall, scope))
                .orElseThrow(() -> new CalledFunctionDoesNotExistException(functionCall, scope));
    }

    private Optional<String> getDescriptorForFunctionInScope(FunctionCall functionCall, Scope scope) {
        return Optional.of(
                DecriptorFactory.getMethodDescriptor(functionCall.getSignature())
        );
    }

    private Optional<String> getDescriptorForFunctionOnClasspath(FunctionCall functionCall, Scope scope) {
        try {
            String functionName = functionCall.getFunctionName();
            Collection<Expression> parameters = functionCall.getParameters();
            Optional<Type> owner = functionCall.getOwner();
            String className = owner.isPresent() ? owner.get().getName() : scope.getClassName();
            Class<?> aClass = Class.forName(className);
            Method method = aClass.getMethod(functionName);
            String methodDescriptor = org.objectweb.asm.Type.getMethodDescriptor(method);
            return Optional.of(methodDescriptor);
        } catch (ReflectiveOperationException e) {
            return Optional.empty();
        }
    }
}
