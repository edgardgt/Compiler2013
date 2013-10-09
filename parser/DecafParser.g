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

field_decl  : TIPO ( ID | array ) 
                     (COMMA ( ID | array ))* SEMI  { linea++; arbol.add("Declara Campos " + linea);} ;

array		: ID LBRACKET INT_LITERAL RBRACKET;
					 
method_decl : (TIPO | VOID) ID LPARENTH (method_param)? 
                     RPARENTH block                                         { linea++; arbol.add("Declarar Metodos " + linea);} ;

method_param : TIPO ID (COMMA TIPO ID)*
					 ;
					 
block       : LBRACE (var_decl)* (statement)* RBRACE                          { linea++; arbol.add("Bloque "+linea);} ;

var_decl    : TIPO (ID) (COMMA ID)* SEMI                                      { linea++; arbol.add("Declara Variable " + linea);} ;

statement   : location assign_op expr SEMI									#sentencia1
            |  method_call SEMI												#sentencia2
            |  IF LPARENTH expr RPARENTH block (ELSE block)?				#sentencia3
            |  FOR ID ASIGNACION expr COMMA expr block	 					#sentencia4
            |  RETURN (expr)? SEMI											#sentencia5
            |  BREAK SEMI													#sentencia6
            |  CONTINUE SEMI												#sentencia7
            |  block                                                       	#sentencia8
			;
			//{ linea++; arbol.add("Statement "+linea);};

assign_op   : ASIGNACION													#asignacion
            |  INCREMENTA													#incremento
            |  DECREMENTA                                                   #decremento
			;
			//{ linea++; arbol.add("ASSIGN_Op "+linea);} ;

method_call : method_name LPARENTH (expr (COMMA expr)*)? RPARENTH			#method_call1
            |  CALLOUT LPARENTH STRING_LITERAL COMMA
                     (callout_arg (COMMA callout_arg)*)? RPARENTH			#method_call2
			;
			//{ linea++; arbol.add("Method_Call "+linea);} ;

method_name : ID                                                              { linea++; arbol.add("Method_name "+linea);} ;

location    : ID															#id1
            | ID LBRACKET expr RBRACKET                                		#id2
			;
			//{ linea++; arbol.add("Location "+linea);} ;

expr     :  location														#expr_location
            |  method_call 													#expr_methodCall
			|  literal														#expr_literal
			|  expr bin_op expr												#expr_binOp
			|  MENOS expr													#expr_menosExp
			|  NOT expr 													#expr_notExp
			|  LPARENTH expr RPARENTH                                		#expr_expr
			;
			//{ linea++; arbol.add("Expr   "+linea);} ;

callout_arg : expr 															#call_expr
            | STRING_LITERAL                                                #call_strlit
			;
			//{ linea++; arbol.add("String_Literal "+linea);} ;

bin_op  :  ARITH_OP 
            |  REL_OP 
			|  EQ_OP 
			|  COND_OP
			|  MENOS                                                                { linea++; arbol.add("Bin_Op "+linea);} ;

literal     : INT_LITERAL 													#literal_int
            |  CHAR_LITERAL 												#literal_char
            |  BOOL_LITERAL                                                 #literal_boolean
			;
			//{ linea++; arbol.add("Literal "+linea);} ;

