package compiler.ast;

public class Parametro extends Node{
	private String tipo;
	private String id;
	
	public Parametro(String t, String i){
		tipo = t;
		id = i;
	}
	
	public void print(String padding){
		System.out.println(padding + "param");
		System.out.println(padding + "\t" + tipo);
		System.out.println(padding + "\t" + id);
	}
} 
