package compiler.ast;

import java.util.List;
import java.util.LinkedList;

public class Asignacion extends Node{
	private Node location;
	private String operator;
	private Node expr;
	
	public Asignacion(Node l, String o, Node e){
		location = l;
		operator = o;
		expr = e;
	}
	
	public void print(String padding){
		System.out.println(padding + operator);
		location.print(padding + "\t");
		expr.print(padding + "\t");
	}
} 
