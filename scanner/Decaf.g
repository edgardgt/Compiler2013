lexer grammar Decaf;

@header{
    package compiler.scanner;
}


//PALABRAS RESERVADAS
//-----------------------------------------------
CLASE		:  'class' {System.out.println("CLASE");};
VOID		:  'void' {System.out.println("VOID");};
BOOLEAN     :  'boolean' {System.out.println("BOOLEAN");};
TRUE		:  'true' {System.out.println("TRUE");};
FALSE		:  'false' {System.out.println("FALSE");};
INT         :  'int' {System.out.println("INT");};
FLOAT       :  'float' {System.out.println("FLOAT");};
IF			:  'if' {System.out.println("IF");};
ELSE		:  'else' {System.out.println("ELSE");};
FOR			:  'for' {System.out.println("FOR");};
RETURN		:  'return' {System.out.println("RETURN");};
BREAK		:  'break' {System.out.println("BREAK");};
CONTINUE	:  'continue' {System.out.println("CONTINUE");};
CALLOUT		:  'callout' {System.out.println("CALLOUT");};




// OPERADORES ARITMETICOS
//-----------------------------------------------
MAS			:  '+' {System.out.println("MAS");};
MENOS		:  '-' {System.out.println("MENOS");};
PROD		:  '*' {System.out.println("PROD");};
DIV			:  '/' {System.out.println("DIV");};
MOD			:  '%' {System.out.println("MOD");};


// OPERADORES RELACIONALES
//-----------------------------------------------
MENORQ 		:  '<' {System.out.println("MENORQ");};
MAYORQ 		:  '>' {System.out.println("MAYORQ");}; 
MENORIGQ 	:  '<=' {System.out.println("MENORIGQ");};  
MAYORIGQ 	:  '>=' {System.out.println("MAYORIGQ");};
