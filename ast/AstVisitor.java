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
			System.out.println(e.getText());
			//root.add(visit(e));
		}
		
		//return visitChildren(ctx); 
		return root;		
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
