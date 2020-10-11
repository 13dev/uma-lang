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

compilationUnit : ( variable | print )* EOF
                ; // our code consist consist only of variables and prints

variable    : ID EQUALS value
            ; // token followed by ID token followed by EQUALS TOKEN

print   : PRINT ID
        ; //print statement must consist of 'print' keyword and ID

value : op=NUMBER
      | op=STRING
      ; //NUMBER | STRING

// tokens
PRINT : 'print' ;
EQUALS : '=' ;
BOOL : 'true' | 'false' ;
ID : [a-zA-Z0-9]+ ;
NUMBER : [0-9]+ ; //must consist only of digits
STRING : '"'.*'"' ;