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

classBody : function* ;

// Class Functions
function : functionDeclaration '{' (blockStatement)* '}' ;
functionName : ID ;
functionDeclaration    :
                    functionType functionName '(' (functionArgument)* (',' functionArgument)* ')'
                    ;
functionDefaultParamValue : '=' expression ;
functionArgument : variableType ID functionDefaultParamValue? ;
functionType : primitiveType | classType;
functionCall : functionName '(' expressionList ')';

// Classes
classType : CLASS_NAME ('[' ']')* ;
className : ID ;
parentClassName : '<' className ;
classUnit : 'class' className parentClassName* '{' block '}' ;


expressionList  : (expression)* (',' expression)*
                ;

blockStatement  : variable
                | print
                | functionCall
                ;

compilationUnit : classUnit EOF ;
block : (variable | print)* ;


expression  : variableReference
            | value
            | functionCall
            ;

variableReference : ID ;
variable : variableType ID EQUALS value SEMICOLON ;
print : PRINT ID SEMICOLON ;
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