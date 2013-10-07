package compiler.ast;

import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
//import compiler.parser.*;
import compiler.parser.DecafParser;
import compiler.parser.DecafParserBaseVisitor;

public class AstVisitor extends DecafParserBaseVisitor<Node>{
	@Override
	public Node visitStart(DecafParser.StartContext ctx) {
		Root root = new Root();
		//System.out.println("ingreso a AST->");

		NLista declaraCampos = new NLista();
		List<DecafParser.Field_declContext> lista0 = ctx.field_decl();
		for(DecafParser.Field_declContext e : lista0){
			//System.out.println(e.getText());
			//visit(e);
			declaraCampos.add(visit(e));
		}
		
		NLista declaraMetodos = new NLista();
		List<DecafParser.Method_declContext> lista = ctx.method_decl();
		for(DecafParser.Method_declContext e : lista){
			//System.out.println(e.getText());
			
			//visit(e);
			declaraMetodos.add(visit(e));
		}
		
		root.add(new ClassMain(ctx.ID().getText(), declaraCampos, declaraMetodos));
		//return visitChildren(ctx); 
		return root;		
	}
	
	@Override 
	public Node visitField_decl(DecafParser.Field_declContext ctx) { 
		//System.out.println(ctx);
		int cantVar = ctx.ID().size();
		String vars;
		vars = ctx.ID(0).getText();
		for (int i = 1; i<cantVar; i++){
			vars = vars + ", " + ctx.ID(i).getText();
		}
		return new Variable(ctx.TIPO().getText(), vars); //ctx.ID(0).getText());
		//return visitChildren(ctx); 
	}
	
	@Override 
	public Node visitMethod_decl(DecafParser.Method_declContext ctx) { 
		//System.out.println ("ingreso al visitMethod_decl");
		/*
		System.out.println ("tipo -> " + ctx.TIPO());
		System.out.println ("ID -> " + ctx.ID());
		System.out.println ("void -> " + ctx.VOID());
		System.out.println ("bloque -> " + ctx.block());
		System.out.println ("method_param -> " + ctx.method_param());		
		*/

		Node parametros = ctx.method_param() == null? (new Nulo()) : visit(ctx.method_param());
		Node bloque = ctx.block() == null? (new Nulo()) : visit(ctx.block());
		
		TerminalNode tipo = ctx.TIPO() == null ? ctx.VOID() : ctx.TIPO();
		//return new MethodDcl(tipo.getText(), ctx.ID().getText(), new Identificador("params"), new Identificador("bloque"));
		return new MethodDcl(tipo.getText(), ctx.ID().getText(), parametros, bloque);

		//return visit(ctx.method_param());
		//return visitChildren(ctx); 
	}
	
	@Override 
	public Node visitMethod_param(DecafParser.Method_paramContext ctx) {
		//System.out.println ("ingreso al visitMethod_param" + ctx.ID().size());

		int tamanioLista = ctx.ID().size();
		NLista parametros = new NLista();
		
		for (int i=0;i<tamanioLista; i++){
			//System.out.println("tipo " + ctx.TIPO(i).getText());
			//System.out.println("id " + ctx.ID(i).getText());
			parametros.add(new Parametro(ctx.TIPO(i).getText(), ctx.ID(i).getText()));
			
		}

		return parametros;
	}
	
	@Override 
	public Node visitBlock(DecafParser.BlockContext ctx) { 
		//System.out.println("ingreso a bloque." + ctx.var_decl());
		
		NLista variables = new NLista();
		List<DecafParser.Var_declContext> lista = ctx.var_decl();
		
		for(DecafParser.Var_declContext e : lista){
			//System.out.println(e.getText());
			variables.add(visit(e)); // visitVar_decl
		}

		NLista sentencias = new NLista();
		List<DecafParser.StatementContext> lista2 = ctx.statement();
		
		for(DecafParser.StatementContext e : lista2){
			System.out.println(e.getText() + "sentencia");
			sentencias.add(visit(e)); //
		}

		return new Bloque(variables, sentencias);
	}
	
	@Override 
	public Node visitVar_decl(DecafParser.Var_declContext ctx) { 
		int cantVar = ctx.ID().size();
		String vars;
		vars = ctx.ID(0).getText();
		for (int i = 1; i<cantVar; i++){
			vars = vars + ", " + ctx.ID(i).getText();
		}
		return new Variable(ctx.TIPO().getText(), vars); //ctx.ID(0).getText());
	}

	@Override
	public Node visitSentencia3(DecafParser.Sentencia3Context ctx) { 
		//System.out.println ("condicion " + ctx.expr());
		//System.out.println ("alternativa" + ctx.block(0));
		return new SentenciaIF(new IntLiteral("1"), visit(ctx.block(0)), ctx.block().size() == 1? (new Nulo()) : visit(ctx.block(0)));//visitChildren(ctx); 
	}
	
	
	@Override 
	public Node visitSentencia8(DecafParser.Sentencia8Context ctx) { 
		return visitChildren(ctx); 
	}
	
	/*
	@Override
	public Node visitLine(Lab07Parser.LineContext ctx){
		Root root = new Root();
		List<Lab07Parser.ExpContext> list = ctx.exp();
		
		for(Lab07Parser.ExpContext e : list){
			root.add(visit(e));
		}
		return root;
	}

	@Override
	public Node visitLine2(Lab07Parser.Line2Context ctx){
		Root root = new Root();
		List<Lab07Parser.AsignaContext> list = ctx.asigna();
		
		for(Lab07Parser.AsignaContext e : list){
			root.add(visit(e));
		}
		return root;
	}
	*/
	/*
	@Override
	public Node visitLine3(Lab07Parser.Line3Context ctx){
		Root root = new Root();
		List<Lab07Parser.ExpContext> list = ctx.exp();
		for(Lab07Parser.ExpContext e : list){
			root.add(visit(e));
		}
		
		List<Lab07Parser.AsignaContext> list2 = ctx.asigna();
		for(Lab07Parser.AsignaContext e : list2){
			root.add(visit(e));
		}
		return root;
	}
	
	@Override 
	public Node visitUnica(Lab07Parser.UnicaContext ctx) {
		//System.out.println("signo... " + ctx.IGUAL().getText());
		//System.out.println("VARIABLE... " + ctx.VARIABLE().getText());
		//System.out.println("exp... " + ctx.exp());
		//System.out.println("exp.Text... " + ctx.exp().getText());
		TerminalNode op = ctx.IGUAL();
		//return new BinOp(op.getText(), visit(ctx.VARIABLE()), visit(ctx.exp()));
		return new BinOp(op.getText(), new Variable(ctx.VARIABLE().getText()), visit(ctx.exp()));
		//return null;
	}
	
	@Override
	public Node visitInt(Lab07Parser.IntContext ctx){
		return new IntLiteral(ctx.INTEGER().getText());
	}
	
	@Override
	public Node visitFloat(Lab07Parser.FloatContext ctx){
		return new FloatLiteral(ctx.FLOAT().getText());
	}
	
	
	@Override
	public Node visitVariable(Lab07Parser.VariableContext ctx){
		System.out.print("llego... ");
		System.out.println(ctx.VARIABLE().getText());
		return new Variable(ctx.VARIABLE().getText());
	}
	
	@Override
	public Node visitParen(Lab07Parser.ParenContext ctx){
		return visit(ctx.exp());
	}
	
	@Override
	public Node visitPlusMinus(Lab07Parser.PlusMinusContext ctx){
		System.out.println(ctx.exp());
		System.out.println(ctx.exp(0).getText());
		System.out.println(ctx.exp(1).getText());
		TerminalNode op = ctx.MINUS() == null ? ctx.PLUS() : ctx.MINUS();
		return new BinOp(op.getText(), visit(ctx.exp(0)), visit(ctx.exp(1)));
	}
	
	@Override
	public Node visitTimesDiv(Lab07Parser.TimesDivContext ctx){
		TerminalNode op = ctx.DIV() == null ? ctx.TIMES() : ctx.DIV();
		return new BinOp(op.getText(), visit(ctx.exp(0)), visit(ctx.exp(1)));
	}
	*/
}
