package compiler.semantic;
/* Semantic.java */
import compiler.ast.*;
import java.util.List;
public class Semantic{
/* Campos Semantic*/

/* Construtor Semantic*/
	public Semantic (Ast archivo)throws Exception  {
		System.out.println("Ingreso al semantic");
		ClassMain programa = (ClassMain) archivo.arbolAST().retList().get(0);
		
		System.out.println("Primer nodo(nombre):" + programa.retId());
		NLista declaraciones = (NLista) programa.retField_dcl();
		//private List<Node> list retList()
		
		List<Node> listaCampos = declaraciones.retList();
		
		//System.out.println("listaCampos: " + listaCampos(0));
		
		//programa.print();
		
		// System.out.println(archivo.arbolAST().retList().get(0));
	}
/* Metodos Semantic */

	boolean checkDeclarations(){
		return true;
	}
}