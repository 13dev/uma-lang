grammar UmaLang;

@header {
    package com.umalang.antlr;
}

variableType    : 'boolean' ('[' ']')*
                | 'string' ('[' ']')*
                | 'char' ('[' ']')*
                | 'byte' ('[' ']')*
                | 'short' ('[' ']')*
                | 'int' ('[' ']')*
                | 'long' ('[' ']')*
                | 'float' ('[' ']')*
                | 'double' ('[' ']')*
                ;

primitiveType   : variableType | 'void' ('[' ']')*
                ;
// tokens
EQUALS : '=' ;
BOOL : 'true' | 'false' ;
ID : [a-zA-Z0-9]+ ;