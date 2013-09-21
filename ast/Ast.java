package compiler.ast;
/* Ast.java */
import compiler.parser.*;
import org.antlr.v4.runtime.tree.*;

public class Ast{
/* Campos Ast*/
	DecafParser miParser;
	ParseTree tree;
	String treeString;
/* Construtor Ast*/
	public Ast (CC4Parser archivo)throws Exception  {
		miParser = archivo.Parser();
		//System.out.println(miParser);
		miParser.reset();
		tree = miParser.start();
		treeString = new String(tree.toStringTree(miParser));
		//System.out.println(tree.toStringTree(miParser)); 
		//System.out.println(treeString);
		
		AstVisitor visitor = new AstVisitor();
		
		Root root = (Root)visitor.visit(tree);
		if (root == null){
			System.out.println("No hay nada que imprimir.");
		}else{
			System.out.println(root == null);
			root.print();
		}
	}
/* Metodos Ast */
	public String arbolSTR(){
		return treeString;
	}
}