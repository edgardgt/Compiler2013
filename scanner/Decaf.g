lexer grammar Decaf;

@header{
    package compiler.scanner;
}


// OTROS
//-----------------------------------------------
WS          : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
COMMA       : ',';
COLON		: ':';
SEMI        : ';';
DIGITO	    : '0'..'9';
ALFA        : ('a'..'z' | 'A'..'Z' | '_' );

//PALABRAS RESERVADAS
//-----------------------------------------------
CLASE		:  'class';
VOID		:  'void';
BOOLEAN     :  'boolean';
TRUE		:  'true';
FALSE		:  'false';
INT         :  'int';
//FLOAT       :  'float';
IF			:  'if';
ELSE		:  'else';
FOR			:  'for';
RETURN		:  'return';
BREAK		:  'break';
CONTINUE	:  'continue';
CALLOUT		:  'callout';



// OPERADORES ARITMETICOS
//-----------------------------------------------
MAS			:  '+';
MENOS		:  '-';
PROD		:  '*';
DIV			:  '/';
MOD			:  '%';


// OPERADORES RELACIONALES
//-----------------------------------------------
MENORQ 		:  '<';
MAYORQ 		:  '>'; 
MENORIGQ 	:  '<=';  
MAYORIGQ 	:  '>=';


// OPERADORES DE COMPARACION
//-----------------------------------------------
IGUAL 		:  '==';
DIFERENTE	:  '!=';

// OPERADORES LOGICOS
//-----------------------------------------------
AND 		:  '&&';
OR 			:  '||';
NOT 		:  '!';

// OPERADORES DE ASIGNACION
//-----------------------------------------------
ASIGNACION	:  '=';
INCREMENTA  :  '+=';
DECREMENTA  :  '-=';


// LITERALES
//-----------------------------------------------
HEXA        :  ('0x'|'0X') (DIGITO | 'A'..'F' | 'a'..'f' )+ ;
NATURAL		:  (DIGITO)+ ;
REAL		:  (DIGITO)+ '.' DIGITO+ ;
CHAR        :  ('\'')('\u0020'..'\u007E')('\'') ;
STRING      :  ('"') ('\u0020'..'\u007E')('\u0020'..'\u007E')* ('"') ;


  
// AGRUPADORES
//-----------------------------------------------
LBRACE      :  '{' ;
RBRACE      :  '}' ;
LBRACKET    :  '[' ;
RBRACKET    :  ']' ;
LPARENTH    :  '(' ;
RPARENTH    :  ')' ;


// IDENTIFICADOR
//-----------------------------------------------
ID          : (ALFA)(ALFA|DIGITO)*;

