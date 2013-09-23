package compiler.ast;

import java.util.List;
import java.util.LinkedList;

public class MethodDcl extends Node{
	private String tipo;
	private String id;
	private Node params;
	private Node bloque;
	
	public MethodDcl(String t, String i, Node p, Node b){
		tipo = t;
		id = i;
		params = p;
		bloque = b;
	}
	
	public void print(String padding){
		System.out.println(padding + "dcl_metodo");
		System.out.println(padding + "\t" + id);
		params.print(padding + "\t");
		bloque.print(padding + "\t");
	}
} 
