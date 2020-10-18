package com.umalang.compiler;
// Created by 13dev - 11/10/2020

import com.umalang.compiler.bytecode.BytecodeGenerator;
import com.umalang.compiler.util.ArgumentErrorEnum;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Compiler {

    public static void main(String[] args) throws IOException {
        new Compiler().compile(args);
    }

    public void compile(String[] args) throws IOException {
        final ArgumentErrorEnum argsErrors = getArgumentValidationErrors(args);
        BytecodeGenerator bytecodeGenerator = new BytecodeGenerator();


        // get argument errors
        if (argsErrors != ArgumentErrorEnum.NONE) {
            System.out.println(argsErrors.getMessage());
            return;
        }

        // get argument file
        final File umaFile = new File(args[0]);

        String umaClassName = StringUtils.remove(umaFile.getName(), ".uma");

        final CompilationUnit compilationUnit = new Parser().getCompilationUnit(
                umaFile.getAbsolutePath()
        );

        OutputStream os = new FileOutputStream(compilationUnit.getClassName() + ".class");

        final byte[] byteCode = bytecodeGenerator.generate(compilationUnit);

        IOUtils.write(byteCode, os);

    }

    private ArgumentErrorEnum getArgumentValidationErrors(String[] args) {
        if (args.length != 1) {
            return ArgumentErrorEnum.NO_FILE;
        }

        String filePath = args[0];
        if (!filePath.endsWith(".uma")) {
            return ArgumentErrorEnum.BAD_FILE_EXTENSION;
        }

        return ArgumentErrorEnum.NONE;
    }


}
