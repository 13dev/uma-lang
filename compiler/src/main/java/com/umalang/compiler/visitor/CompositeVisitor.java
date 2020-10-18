package com.umalang.compiler.visitor;
// Created by 13dev - 18/10/2020

import com.umalang.antlr.generated.UmaLangBaseVisitor;
import com.umalang.compiler.exception.NoVisitorReturnedValueException;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Arrays;
import java.util.Objects;

public class CompositeVisitor<T> {

    private final UmaLangBaseVisitor<? extends T>[] visitors;

    public CompositeVisitor(UmaLangBaseVisitor<? extends T>... visitors) {
        this.visitors = visitors;
    }

    public T accept(ParserRuleContext context) {
        return Arrays.stream(visitors)
                .map(context::accept)
                .filter(Objects::nonNull)
                .findFirst()
                .orElseThrow(NoVisitorReturnedValueException::new);
    }
}
