package compiler.semantic;

public class Simbolo{
	//campos
	private String simbolo;	
	private String tipoSimbolo;
	private String tipoDato;
	private int valorInt;
	private String valorBoolean;
	private int tamanio;
	private String scope;
	//private list<Parametro> listaParametros;
	
	//constructor
	public Simbolo(String s, String tS, String tD, int valorI, String valorB, int tam, String sc){
		simbolo = s;	
		tipoSimbolo = tS;
		tipoDato = tD;
		valorInt = valorI;
		valorBoolean = valorB;
		tamanio = tam;
		scope = sc;
	}
	
	public Simbolo(String s, String tS, String tD, int tam, String sc){
		simbolo = s;	
		tipoSimbolo = tS;
		tipoDato = tD;
		tamanio = tam;
		scope = sc;
	}
	//metodos
	public String retSimbolo(){
		return simbolo;	
	}
	/*
	private String tipoSimbolo;
	private String tipoDato;
	private int valorInt;
	private String valorBoolean;
	private int tamanio;	
*/
	public String toString(){
		return "simbolo: " + simbolo + ", tipoSimbolo: " + tipoSimbolo + ", tipoDato: " + tipoDato + ", tamanio: " + tamanio + ", scope: " +scope + "\n";
	}

} 
