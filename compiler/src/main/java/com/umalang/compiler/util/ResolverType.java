package com.umalang.compiler.util;
// Created by 13dev - 18/10/2020

import com.umalang.antlr.generated.UmaLangParser;
import com.umalang.compiler.domain.type.ClassType;
import com.umalang.compiler.domain.type.InternalType;
import com.umalang.compiler.domain.type.Type;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Optional;

public class ResolverType {
    public static Type getFromTypeName(UmaLangParser.TypeContext typeContext) {

        if (typeContext == null) {
            return InternalType.VOID;
        }

        String typeName = typeContext.getText();
        Optional<? extends Type> internalType = getInternalType(typeName);

        if (internalType.isPresent()) {
            return internalType.get();
        }

        return new ClassType(typeName);
    }

    public static Type getFromValue(String value) {

        if (StringUtils.isEmpty(value)) return InternalType.VOID;

        if (StringUtils.isNumeric(value)) {
            return InternalType.INT;
        }

        return InternalType.STRING;
    }


    private static Optional<InternalType> getInternalType(String typeName) {
        return Arrays.stream(InternalType.values())
                .filter(type -> type.getName().equals(typeName))
                .findFirst();
    }
}
