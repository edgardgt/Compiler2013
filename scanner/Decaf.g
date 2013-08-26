lexer grammar Decaf;

@header{
    package compiler.scanner;
}




//PALABRAS RESERVADAS
//-----------------------------------------------
CLASE		:  'class';
VOID		:  'void';
TRUE		:  'true';
FALSE		:  'false';
IF			:  'if';
ELSE		:  'else';
FOR		    :  'for';
RETURN		:  'return';
BREAK		:  'break';
CONTINUE	:  'continue';
CALLOUT	    :  'callout';
fragment BOOLEAN     :  'boolean';
fragment INT         :  'int';


TIPO        :  INT | BOOLEAN ;

// LITERALES
//-----------------------------------------------
CHAR_LITERAL        : ('\'')('\u0020'..'\u007E')('\'') ;
STRING_LITERAL      : ('"') ('\u0020'..'\u007E')('\u0020'..'\u007E')* ('"') ;
BOOL_LITERAL        : TRUE | FALSE;
INT_LITERAL         : DECIMAL | HEXA;
HEXA                : ('0x'|'0X') (DIGITO | 'A'..'F' | 'a'..'f' )+ ;
fragment DECIMAL    : (DIGITO) (DIGITO)* ;


// OPERADORES ARITMETICOS
//-----------------------------------------------
fragment MAS		:  '+';
MENOS				:  '-';
fragment PROD		:  '*';
fragment DIV		:  '/';
fragment MOD		:  '%';

ARITH_OP    : MAS | MENOS | PROD | DIV | MOD;


// OPERADORES RELACIONALES
//-----------------------------------------------
fragment MENORQ 		:  '<';
fragment MAYORQ 		:  '>'; 
fragment MENORIGQ 	:  '<=';  
fragment MAYORIGQ 	:  '>=';

REL_OP      : MENORQ | MAYORQ | MENORIGQ | MAYORIGQ;

// OPERADORES DE COMPARACION
//-----------------------------------------------
fragment IGUAL 		:  '==';
fragment DIFERENTE	:  '!=';

EQ_OP       : IGUAL | DIFERENTE;

// OPERADORES LOGICOS
//-----------------------------------------------
fragment AND :  '&&';
fragment OR  :  '||';
NOT :  '!';

COND_OP     : AND | OR | NOT;

// OPERADORES DE ASIGNACION
//-----------------------------------------------
ASIGNACION	:  '=';
INCREMENTA  :  '+=';
DECREMENTA  :  '-=';




  
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

// OTROS
//-----------------------------------------------
WS          : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
COMMA       : ',';
COLON		: ':';
SEMI        : ';';
fragment DIGITO	    : '0'..'9';
fragment ALFA        : ('a'..'z' | 'A'..'Z' | '_' );

COMMENTLIN: '//' (~('\n'| '\r'))* {skip();};
COMMENTTEX: '/*' ( options { greedy = false; } : .* ) '*/' {skip();};


