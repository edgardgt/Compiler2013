parser grammar Decaf;

@header{
    package compiler.parser;
	import compiler.scanner.*;
}


WS         : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

DIGITO     : ('0'..'9')  {System.out.println("ENTERO");};
ENTPOS     : DIGITO+ {System.out.println("ENTERO");};
ENTERO     : ('-')?  ENTPOS {System.out.println("ENTERO");};
FLOTAN     : ENTERO ('.' ENTPOS)? {System.out.println("FLOTANTE");};

STRING     : ('"') ('\u0020'..'\u007E')('\u0020'..'\u007E')* ('"') {System.out.println("LITERAL STRING");};
VARIABLE   : STRING (DIGITO)*  {System.out.println("VARIABLE");};

// OPERADORES
MAS        : '+'  {System.out.println("MAS");};
MENOS      : '-'  {System.out.println("MENOS");};
MULT       : '*'  {System.out.println("MULTIPLICACION");};
DIVI       : '/'  {System.out.println("DIVISION");};
