package compiler.ast;

import java.util.List;
import java.util.LinkedList;

public class Bloque extends Node{
	private Node var_decl;
	private Node sentencia;
	
	public Bloque(Node vd, Node st){
		var_decl = vd;
		sentencia = st;
	}
	
	public void print(String padding){
		System.out.println(padding + "bloque");
		var_decl.print(padding + "\t");
		sentencia.print(padding + "\t");
	}
} 
