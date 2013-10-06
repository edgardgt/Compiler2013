package compiler.ast;

public class Variable extends Node{
	private String tipo;
	private String id;
	
	public Variable(String t, String i){
		tipo = t;
		id = i;
	}
	
	public void print(String padding){
		System.out.println(padding + "var");
		System.out.println(padding + "\t" + tipo);
		System.out.println(padding + "\t" + id);
	}
} 
