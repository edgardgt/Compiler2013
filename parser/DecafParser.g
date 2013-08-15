parser grammar DecafParser;

@header{
    package compiler.parser;
	import compiler.scanner.*;
}


start      : program;
program    : CLASS PROGRAM LBRACE RBRACE;