package compiler.semantic;

public class Parametro{
	//campos
	private String parametro;	
	private String tipoDato;

	//constructor
	public Parametro(String p, String t){
		parametro = p;	
		tipoDato = t;
	}
	
	//metodos
	public String retParametro(){
		return parametro;
	}

	public String retTipoDato(){
		return tipoDato;
	}
	
} 
