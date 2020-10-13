grammar UmaLang;

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
compilationUnit : classUnit EOF ;
className : ID ;
parentClassName : '<' className ;
classUnit : 'class' className parentClassName* '{' block '}' ;
block : (variable | print)* ;


variable : variableType ID EQUALS value SEMICOLON;
print : PRINT ID SEMICOLON ;
value : NUMBER
      | STRING ;

//lexer rules (tokens)
SEMICOLON : ';' ;
PRINT : 'print' ;
EQUALS : '=' ; //must be '='
NUMBER : [0-9]+ ; //must consist only of digits
STRING : '"'.*?'"' ; //must be anything in qutoes
ID : [a-zA-Z0-9]+ ; //must be any alphanumeric value
WS: [ \t\n\r]+ -> skip ; //special TOKEN for skipping whitespaces