package compiler.ast;

public class CharLiteral extends Node{
	private String value;
	
	public CharLiteral(String v){
		value = v;
	}
	
	public void print(String padding){
		System.out.println(padding + value);
	}
}
