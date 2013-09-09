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
	}
/* Metodos Ast */
	public String arbolSTR(){
		return treeString;
	}
}