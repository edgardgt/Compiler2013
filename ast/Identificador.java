package compiler.ast;

public class Identificador extends Node{
	private String value;
	
	public Identificador(String v){
		value = v;
	}
	
	public void print(String padding){
		System.out.println(padding + value);
	}
}
