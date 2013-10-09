package compiler.ast;

public class Variable extends Node{
	private String tipo;
	private String id;
	private int tamanio;

	public Variable(String t, String i){
		tipo = t;
		id = i;
		tamanio = 0;
	}
	public Variable(String t, String i, String s){
		tipo = t;
		id = i;
		tamanio = Integer.parseInt(s);
	}
	
	public void print(String padding){
		if (tamanio>0){
			System.out.println(padding + "array");
			System.out.println(padding + "\t" + tipo);
			System.out.println(padding + "\t" + id);
			System.out.println(padding + "\t" + tamanio);
		}else{
			System.out.println(padding + "var");
			System.out.println(padding + "\t" + tipo);
			System.out.println(padding + "\t" + id);
		}
	}
} 
