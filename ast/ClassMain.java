package compiler.ast;

import java.util.List;
import java.util.LinkedList;

public class ClassMain extends Node{
	private String id;
	private Node field_dcl;
	private Node method_dcl;
	
	public ClassMain(String i, Node fd, Node md){
		id = i;
		field_dcl = fd;
		method_dcl = md;
	}
	
	public void print(String padding){
	/*
		System.out.println(padding + "programa");
		System.out.println(padding + "\t" + id);
		field_dcl.print(padding + "\t");
		method_dcl.print(padding + "\t");
		*/
		
		System.out.println("programa");
		System.out.println("\t" + id);
		field_dcl.print("\t");
		method_dcl.print("\t");

	}
} 
