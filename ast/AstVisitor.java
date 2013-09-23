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
		System.out.println("ingreso a AST->");
		
		List<DecafParser.Method_declContext> lista = ctx.method_decl();
		for(DecafParser.Method_declContext e : lista){
			//System.out.println(e.getText());
			
			//visit(e);
			root.add(visit(e));
		}
		
		//return visitChildren(ctx); 
		return root;		
	}
	
	@Override 
	public Node visitMethod_decl(DecafParser.Method_declContext ctx) { 
		System.out.println ("ingreso al visitMethod_decl");
		/*
		System.out.println ("tipo -> " + ctx.TIPO());
		System.out.println ("ID -> " + ctx.ID());
		System.out.println ("void -> " + ctx.VOID());
		System.out.println ("bloque -> " + ctx.block());
		System.out.println ("method_param -> " + ctx.method_param());		
		*/

		Node parametros = ctx.method_param() == null? (new Nulo()) : visit(ctx.method_param());
		
		TerminalNode tipo = ctx.TIPO() == null ? ctx.VOID() : ctx.TIPO();
		//return new MethodDcl(tipo.getText(), ctx.ID().getText(), new Identificador("params"), new Identificador("bloque"));
		return new MethodDcl(tipo.getText(), ctx.ID().getText(), parametros, new Identificador("bloque"));

		//return visit(ctx.method_param());
		//return visitChildren(ctx); 
	}
	
	@Override 
	public Node visitMethod_param(DecafParser.Method_paramContext ctx) {
		System.out.println ("ingreso al visitMethod_param" + ctx.ID().size());

		//List<TerminalNode> lista = ctx.ID();
		
		//List<TerminalNode> lista2 = ctx.TIPO();
		
		//for(TerminalNode e : lista, TerminalNode e2 : lista2){
		//	System.out.println(e.getText()+ "<-->" + e2.getText());
		//	//root.add(visit(e));
		//}
		
		//return visitChildren(ctx);
		System.out.println("ID-> " + ctx.TIPO(0).getText() + ", TIPO-> " +ctx.ID(0).getText());
		return new Parametro(ctx.TIPO(0).getText(), ctx.ID(0).getText());

		//return visitChildren(ctx); 
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
