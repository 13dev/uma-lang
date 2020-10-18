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
                | classType;

primitiveType   : variableType | 'void' ('[' ']')*
                ;



// Class Functions
function : functionDeclaration '{' (blockStatement)* '}' ;
functionName : ID ;
functionDeclaration : (type)? functionName '(' (functionArgument)* (',' functionArgument)* ')' ;
functionDefaultParamValue : '=' expression ;
functionArgument : type ID functionDefaultParamValue? ;
type    : primitiveType
        | classType
        ;


functionCall : functionName '(' expressionList ')' SEMICOLON;
functionCallNoSemi : functionName '(' expressionList ')';

// Classes
classType : CLASS_NAME ('[' ']')* ;
className : ID ;
parentClassName : '<' className ;
classDeclaration : 'class' className parentClassName* '{' classBody '}' ;
classBody : function* ;


expressionList  : (expression)* (',' expression)*
                ;

blockStatement  : variable
                | print
                | functionCall
                ;

compilationUnit : classDeclaration EOF ;
block : (variable | print)* ;


expression  : variableReference
            | value
            | functionCallNoSemi
            ;

variableReference : ID ;
variable : variableType ID EQUALS expression SEMICOLON ;
print : PRINT expression SEMICOLON ;
value : NUMBER
      | STRING
      ;

//lexer rules (tokens)
CLASS_NAME : ID ('.' ID)+ ;
SEMICOLON : ';' ;
PRINT : 'print' ;
EQUALS : '=' ; //must be '='
NUMBER : [0-9]+ ; //must consist only of digits
STRING : '"'.*?'"' ; //must be anything in qutoes
ID : [a-zA-Z0-9]+ ; //must be any alphanumeric value
WS: [ \t\n\r]+ -> skip ; //special TOKEN for skipping whitespaces