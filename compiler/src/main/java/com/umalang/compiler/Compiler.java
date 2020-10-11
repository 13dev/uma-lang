package com.umalang.compiler;
// Created by 13dev - 11/10/2020

import com.umalang.compiler.util.ArgumentErrorEnum;
import org.apache.commons.lang3.StringUtils;
import org.stringtemplate.v4.compiler.Bytecode;
import org.stringtemplate.v4.compiler.Bytecode.Instruction;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Queue;

public class Compiler {
    public static void main(String[] args) {

    }

    public void compile(String[] args) throws IOException {
        final ArgumentErrorEnum argsErrors = getArgumentValidationErrors(args);

        // get argument errors
        if(argsErrors != ArgumentErrorEnum.NONE) {
            System.out.println(argsErrors.getMessage());
            return;
        }

        // get argument file
        final File umaFile = new File(args[0]);

        String umaClassName = StringUtils.remove(umaFile.getName(), ".uma");

        final Queue<Instruction> instructionsQueue = new SyntaxTreeTraverser().getInstructions(fileAbsolutePath);
        final byte[] byteCode = new BytecodeGenerator().generateBytecode(instructionsQueue, className);

        OutputStream os = new FileOutputStream(fileName + ".class");
        os.write(byteCode);
        os.close();

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