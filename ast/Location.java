package compiler.ast;

public class Location extends Node{
	private String id;
	private Node expr;
	
	public Location(String i, Node e){
		id = i;
		expr = e;
	}
	
	public void print(String padding){
		System.out.println(padding + "location");
		System.out.println(padding + "\t" + id);	
		expr.print(padding + "\t");
	}
}
