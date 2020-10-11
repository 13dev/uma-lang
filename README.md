# Umalang (JVM based language)
UMALang is a programming language based on java. 

### Why i choose JVM:
 - JVM is very documented;
 - Uma lang will have ability to use Java libs;
 - ASM awesome lib to manipulate bytecode;
 - java is a good language but umalang will be directed towards teaching;


### Libraries used:
- [ANTLR 4](https://github.com/antlr/antlr4)
- [ASM 5.1](https://mvnrepository.com/artifact/org.ow2.asm/asm/5.1)
- [COMMONS-LANG3](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3)

### Structure:
[To finish]

`com.umalang.antlr.generated/` - generated lexer and parser from antrlr file

`antlr/antlr/` - contains lexer and parser rules

`compiler/bytecode/` - All class and files related to bytecode manipulation

````
umalang/
├─ antlr/
│  ├─ com.umalang.antlr.generated/
│  ├─ antlr/
├─ compiler/
│  ├─ bytecode/
│  │  ├─ instructions/
│  ├─ parser/
````

### Bytecode doc:

[Field Discriptors]: docs/bytecode1.png
