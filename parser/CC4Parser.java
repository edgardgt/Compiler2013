package compiler.parser;/* CC4Parser.java */import compiler.scanner.*;import org.antlr.v4.runtime.*;import java.util.LinkedList;public class CC4Parser{/* Campos CC4Parser*/	private DecafParser miParser;	private LinkedList<String> miListadeReglas = new LinkedList<String>();	/* Construtor CC4Parser*/	public CC4Parser (Scanner lexerp)throws Exception  {			//System.out.println("entrada: " + lexerp.entrada());				miParser = new DecafParser(new CommonTokenStream(lexerp.lexer())); //inicializando miParser        miParser.start();		//recorrer el parser		int tamanio = miParser.arbol.size();		int c = 0;		while (c < tamanio){			String regla = (String)miParser.arbol.get(c);			//System.out.println("Regla de parser: " + regla);			miListadeReglas.add("Regla de parser: " + regla);			c++;		}				//Decaf lexer = new Decaf(new ANTLRFileStream(lexerp.entrada()));		//while (lexer.nextToken().getType() != Token.EOF);	}/* Metodos CC4Parser */	public LinkedList<String> ListaDeReglas(){		return miListadeReglas;	}}