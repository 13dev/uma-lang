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
// tokens
EQUALS : '=' ;
BOOL : 'true' | 'false' ;
ID : [a-zA-Z0-9]+ ;
NUMBER : [0-9]+ ; //must consist only of digits
STRING : '"'.*'"' ;