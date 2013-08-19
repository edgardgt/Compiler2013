parser grammar DecafParser;

options {
    tokenVocab=Decaf;
}

@header{
    package compiler.parser;
	import java.util.LinkedList;
}

@members {
LinkedList memory = new LinkedList();
int pos = 0;
}
start		:   CLASE ID LBRACE (field_decl)* (method_decl)* RBRACE     { pos++; memory.add("Inicio "+pos);} ;
field_decl	:	type ( ID | ID  LBRACKET int_literal RBRACKET )+ SEMI   { pos++; memory.add("Declarar Variables "+pos);} ;
method_decl	:	(type | VOID) ID LPARENTH (type ID)* RPARENTH block     { pos++; memory.add("Declarar Metodos "+pos);} ;
block		:	LBRACE (var_decl)* (statement)* RBRACE                  { pos++; memory.add("Bloque "+pos);} ;
var_decl	:	type (ID)+ SEMI                                         { pos++; memory.add("Variable "+pos);} ;
type		:	INT | BOOLEAN | FLOAT                                   { pos++; memory.add("Tipo "+pos);} ;
int_literal : 	NATURAL                                                 { pos++; memory.add("Literal "+pos);} ;
statement   :   block                                                   { pos++; memory.add("Declaracion "+pos);} ;
