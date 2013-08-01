lexer grammar ScannerCLI;

@header{
	package compiler.scanner;
}

PROGRAM : ('int'|'boolean') { System.out.println("palabra reservada");};
ENTERO : ('-')?('0'..'9')+ {System.out.println("entero");};