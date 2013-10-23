package compiler.semantic;
/* Semantic.java */
import compiler.ast.*;
import java.util.List;
import java.util.ArrayList;
public class Semantic{
/* Campos Semantic*/

/* Construtor Semantic*/
	public Semantic (Ast archivo)throws Exception  {
		System.out.println("Ingreso al semantic");
		ClassMain programa = (ClassMain) archivo.arbolAST().retList().get(0);
		
		System.out.println("Primer scope(nombre):" + programa.retId());
		NLista declaraciones = (NLista) programa.retField_dcl();
	
		List<Node> listaCampos = declaraciones.retList();
		//System.out.println("declaraciones: " + declaraciones);
		//declaraciones.print();

		//System.out.println("cant parametros: " + listaCampos.size());
		NLista tempNodo;
		Variable tempVariable;
		
		List<Simbolo> tablaSimbolos = new ArrayList<Simbolo>();
		for (int i=0; i< listaCampos.size(); i++){
			//System.out.println("contenido: " + (listaCampos.get(i) instanceof NLista));
			tempNodo = (NLista) listaCampos.get(i);
			tempVariable = (Variable) tempNodo.retList().get(0);
			
			tablaSimbolos.add(new Simbolo(tempVariable.retID(), "campo", tempVariable.retTipo(), 0, " ", 0, programa.retId()));
										//String s, String tS, String tD, int valorI, String valorB, int tam
			//System.out.println("ID: " + tempVariable.retID() + " tipo: > " + tempVariable.retTipo() );
		}
		//programa.print();
		
		System.out.println(tablaSimbolos);
		// System.out.println(archivo.arbolAST().retList().get(0));
	}
/* Metodos Semantic */

	boolean checkDeclarations(){
		return true;
	}
}