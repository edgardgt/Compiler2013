parser grammar DecafParser;

options {
    tokenVocab=Decaf;
}

@header{
    package compiler.parser;
    import java.util.LinkedList;
}

@members {
LinkedList arbol = new LinkedList();
int linea = 0;
}
start       : CLASE ID LBRACE (field_decl)* (method_decl)* RBRACE             { linea++; arbol.add("Inicio "+linea);} ;

field_decl  : TIPO ( ID | ID LBRACKET INT_LITERAL RBRACKET ) 
                     (COMMA ( ID | ID LBRACKET INT_LITERAL RBRACKET ))* SEMI  { linea++; arbol.add("Declara Campos " + linea);} ;

method_decl : (TIPO | VOID) ID LPARENTH (TIPO ID (COMMA TIPO ID)*)? 
                     RPARENTH block                                           { linea++; arbol.add("Declarar Metodos " + linea);} ;

block       : LBRACE (var_decl)* (statement)* RBRACE                          { linea++; arbol.add("Bloque "+linea);} ;

var_decl    : TIPO (ID) (COMMA ID)* SEMI                                      { linea++; arbol.add("Declara Variable " + linea);} ;

statement   : (location assign_op expr SEMI
            |  method_call SEMI
            |  IF LPARENTH expr RPARENTH block (ELSE block)?
            |  FOR ID ASIGNACION expr COMMA expr block 
            |  RETURN (expr)? SEMI
            |  BREAK SEMI
            |  CONTINUE SEMI
            |  block)                                                         { linea++; arbol.add("Statement "+linea);} ;

assign_op   : (ASIGNACION
            |  INCREMENTA
            |  DECREMENTA)                                                    { linea++; arbol.add("ASSIGN_Op "+linea);} ;

method_call : (method_name LPARENTH expr (COMMA expr)* RPARENTH
            |  CALLOUT LPARENTH STRING_LITERAL COMMA 
                     callout_arg (COMMA callout_arg)* RPARENTH)               { linea++; arbol.add("Method_Call "+linea);} ;

method_name : ID                                                              { linea++; arbol.add("Method_name "+linea);} ;

location    : ID
            | ID LBRACKET INT_LITERAL RBRACKET                                { linea++; arbol.add("Location "+linea);} ;

expr        : location 
            |  method_call 
            |  literal 
            |  expr bin_op expr
            |  MENOS expr
            |  NOT expr 
            |  LPARENTH expr RPARENTH                                         { linea++; arbol.add("Expr "+linea);} ;

callout_arg : expr 
            | STRING_LITERAL                                                  { linea++; arbol.add("String_Literal "+linea);} ;

bin_op      : (ARITH_OP 
            |  REL_OP 
			|  EQ_OP 
			|  COND_OP)                                                       ;

literal     : (INT_LITERAL 
            |  CHAR_LITERAL 
            |  BOOL_LITERAL)                                                  { linea++; arbol.add("Literal "+linea);} ;

