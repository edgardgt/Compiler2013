// Generated from Decaf.g by ANTLR 4.1

    package compiler.scanner;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Decaf extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASE=1, VOID=2, BOOLEAN=3, TRUE=4, FALSE=5, INT=6, FLOAT=7, IF=8, ELSE=9, 
		FOR=10, RETURN=11, BREAK=12, CONTINUE=13, CALLOUT=14, MAS=15, MENOS=16, 
		PROD=17, DIV=18, MOD=19, MENORQ=20, MAYORQ=21, MENORIGQ=22, MAYORIGQ=23, 
		IGUAL=24, DIFERENTE=25, AND=26, OR=27, NOT=28, ASIGNACION=29, INCREMENTA=30, 
		DECREMENTA=31, HEXA=32, NATURAL=33, REAL=34, CHAR=35, STRING=36, LBRACE=37, 
		RBRACE=38, LBRACKET=39, RBRACKET=40, LPARENTH=41, RPARENTH=42, ID=43, 
		WS=44, COMMA=45, COLON=46, SEMI=47, DIGITO=48, ALFA=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'class'", "'void'", "'boolean'", "'true'", "'false'", "'int'", "'float'", 
		"'if'", "'else'", "'for'", "'return'", "'break'", "'continue'", "'callout'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", 
		"'!='", "'&&'", "'||'", "'!'", "'='", "'+='", "'-='", "HEXA", "NATURAL", 
		"REAL", "CHAR", "STRING", "'{'", "'}'", "'['", "']'", "'('", "')'", "ID", 
		"WS", "','", "':'", "';'", "DIGITO", "ALFA"
	};
	public static final String[] ruleNames = {
		"CLASE", "VOID", "BOOLEAN", "TRUE", "FALSE", "INT", "FLOAT", "IF", "ELSE", 
		"FOR", "RETURN", "BREAK", "CONTINUE", "CALLOUT", "MAS", "MENOS", "PROD", 
		"DIV", "MOD", "MENORQ", "MAYORQ", "MENORIGQ", "MAYORIGQ", "IGUAL", "DIFERENTE", 
		"AND", "OR", "NOT", "ASIGNACION", "INCREMENTA", "DECREMENTA", "HEXA", 
		"NATURAL", "REAL", "CHAR", "STRING", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
		"LPARENTH", "RPARENTH", "ID", "WS", "COMMA", "COLON", "SEMI", "DIGITO", 
		"ALFA"
	};


	public Decaf(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Decaf.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: CLASE_action((RuleContext)_localctx, actionIndex); break;

		case 1: VOID_action((RuleContext)_localctx, actionIndex); break;

		case 2: BOOLEAN_action((RuleContext)_localctx, actionIndex); break;

		case 3: TRUE_action((RuleContext)_localctx, actionIndex); break;

		case 4: FALSE_action((RuleContext)_localctx, actionIndex); break;

		case 5: INT_action((RuleContext)_localctx, actionIndex); break;

		case 6: FLOAT_action((RuleContext)_localctx, actionIndex); break;

		case 7: IF_action((RuleContext)_localctx, actionIndex); break;

		case 8: ELSE_action((RuleContext)_localctx, actionIndex); break;

		case 9: FOR_action((RuleContext)_localctx, actionIndex); break;

		case 10: RETURN_action((RuleContext)_localctx, actionIndex); break;

		case 11: BREAK_action((RuleContext)_localctx, actionIndex); break;

		case 12: CONTINUE_action((RuleContext)_localctx, actionIndex); break;

		case 13: CALLOUT_action((RuleContext)_localctx, actionIndex); break;

		case 14: MAS_action((RuleContext)_localctx, actionIndex); break;

		case 15: MENOS_action((RuleContext)_localctx, actionIndex); break;

		case 16: PROD_action((RuleContext)_localctx, actionIndex); break;

		case 17: DIV_action((RuleContext)_localctx, actionIndex); break;

		case 18: MOD_action((RuleContext)_localctx, actionIndex); break;

		case 19: MENORQ_action((RuleContext)_localctx, actionIndex); break;

		case 20: MAYORQ_action((RuleContext)_localctx, actionIndex); break;

		case 21: MENORIGQ_action((RuleContext)_localctx, actionIndex); break;

		case 22: MAYORIGQ_action((RuleContext)_localctx, actionIndex); break;

		case 23: IGUAL_action((RuleContext)_localctx, actionIndex); break;

		case 24: DIFERENTE_action((RuleContext)_localctx, actionIndex); break;

		case 25: AND_action((RuleContext)_localctx, actionIndex); break;

		case 26: OR_action((RuleContext)_localctx, actionIndex); break;

		case 27: NOT_action((RuleContext)_localctx, actionIndex); break;

		case 28: ASIGNACION_action((RuleContext)_localctx, actionIndex); break;

		case 29: INCREMENTA_action((RuleContext)_localctx, actionIndex); break;

		case 30: DECREMENTA_action((RuleContext)_localctx, actionIndex); break;

		case 31: HEXA_action((RuleContext)_localctx, actionIndex); break;

		case 32: NATURAL_action((RuleContext)_localctx, actionIndex); break;

		case 33: REAL_action((RuleContext)_localctx, actionIndex); break;

		case 34: CHAR_action((RuleContext)_localctx, actionIndex); break;

		case 35: STRING_action((RuleContext)_localctx, actionIndex); break;

		case 36: LBRACE_action((RuleContext)_localctx, actionIndex); break;

		case 37: RBRACE_action((RuleContext)_localctx, actionIndex); break;

		case 38: LBRACKET_action((RuleContext)_localctx, actionIndex); break;

		case 39: RBRACKET_action((RuleContext)_localctx, actionIndex); break;

		case 40: LPARENTH_action((RuleContext)_localctx, actionIndex); break;

		case 41: RPARENTH_action((RuleContext)_localctx, actionIndex); break;

		case 42: ID_action((RuleContext)_localctx, actionIndex); break;

		case 43: WS_action((RuleContext)_localctx, actionIndex); break;

		case 44: COMMA_action((RuleContext)_localctx, actionIndex); break;

		case 45: COLON_action((RuleContext)_localctx, actionIndex); break;

		case 46: SEMI_action((RuleContext)_localctx, actionIndex); break;

		case 47: DIGITO_action((RuleContext)_localctx, actionIndex); break;

		case 48: ALFA_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void RBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 37: System.out.println("LLAVE D"); break;
		}
	}
	private void HEXA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31: System.out.println("LITERAL HEXA"); break;
		}
	}
	private void DIGITO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 46: System.out.println("DIGITO"); break;
		}
	}
	private void MENOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15: System.out.println("MENOS"); break;
		}
	}
	private void MOD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18: System.out.println("MOD"); break;
		}
	}
	private void LBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 36: System.out.println("LLAVE I"); break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: System.out.println("ELSE"); break;
		}
	}
	private void ASIGNACION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28: System.out.println("ASIGNACION"); break;
		}
	}
	private void MENORIGQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21: System.out.println("MENORIGQ"); break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34: System.out.println("LITERAL CHAR"); break;
		}
	}
	private void CLASE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("CLASE"); break;
		}
	}
	private void DIFERENTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24: System.out.println("DIFERENTE"); break;
		}
	}
	private void FOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: System.out.println("FOR"); break;
		}
	}
	private void FLOAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: System.out.println("FLOAT"); break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: System.out.println("INT"); break;
		}
	}
	private void NOT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27: System.out.println("NOT"); break;
		}
	}
	private void ALFA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 47: System.out.println("ALFA"); break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 42: System.out.println("ID"); break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25: System.out.println("AND"); break;
		}
	}
	private void DECREMENTA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30: System.out.println("DECREMENTA"); break;
		}
	}
	private void SEMI_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 45: System.out.println("PUNTO Y COMMA"); break;
		}
	}
	private void TRUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: System.out.println("TRUE"); break;
		}
	}
	private void BREAK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: System.out.println("BREAK"); break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: System.out.println("IF"); break;
		}
	}
	private void MAYORQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20: System.out.println("MAYORQ"); break;
		}
	}
	private void COLON_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 44: System.out.println("COLON"); break;
		}
	}
	private void LBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 38: System.out.println("CORCHETE I"); break;
		}
	}
	private void RPARENTH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 41: System.out.println("PARENT D"); break;
		}
	}
	private void REAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33: System.out.println("LITERAL REAL"); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 48: skip();  break;
		}
	}
	private void BOOLEAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: System.out.println("BOOLEAN"); break;
		}
	}
	private void LPARENTH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 40: System.out.println("PARENT I"); break;
		}
	}
	private void CONTINUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: System.out.println("CONTINUE"); break;
		}
	}
	private void COMMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 43: System.out.println("COMMA"); break;
		}
	}
	private void MAS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14: System.out.println("MAS"); break;
		}
	}
	private void INCREMENTA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29: System.out.println("INCREMENTA"); break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26: System.out.println("OR"); break;
		}
	}
	private void PROD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16: System.out.println("PROD"); break;
		}
	}
	private void RETURN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: System.out.println("RETURN"); break;
		}
	}
	private void MAYORIGQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22: System.out.println("MAYORIGQ"); break;
		}
	}
	private void VOID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: System.out.println("VOID"); break;
		}
	}
	private void NATURAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32: System.out.println("LITERAL NATURAL"); break;
		}
	}
	private void IGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23: System.out.println("IGUAL"); break;
		}
	}
	private void RBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 39: System.out.println("CORCHETE D"); break;
		}
	}
	private void DIV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17: System.out.println("DIV"); break;
		}
	}
	private void FALSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: System.out.println("FALSE"); break;
		}
	}
	private void MENORQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19: System.out.println("MENORQ"); break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35: System.out.println("LITERAL STR"); break;
		}
	}
	private void CALLOUT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: System.out.println("CALLOUT"); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\63\u017a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\5!\u011b\n!\3!\3!\6!\u011f\n!\r!\16!\u0120\3!\3"+
		"!\3\"\6\"\u0126\n\"\r\"\16\"\u0127\3\"\3\"\3#\6#\u012d\n#\r#\16#\u012e"+
		"\3#\3#\6#\u0133\n#\r#\16#\u0134\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\7%\u0141"+
		"\n%\f%\16%\u0144\13%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\3,\3,\3,\7,\u015e\n,\f,\16,\u0161\13,\3,\3,\3-\6-\u0166"+
		"\n-\r-\16-\u0167\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\2\63\3\3\2\5\4\3\7\5\4\t\6\5\13\7\6\r\b\7\17\t\b\21\n"+
		"\t\23\13\n\25\f\13\27\r\f\31\16\r\33\17\16\35\20\17\37\21\20!\22\21#\23"+
		"\22%\24\23\'\25\24)\26\25+\27\26-\30\27/\31\30\61\32\31\63\33\32\65\34"+
		"\33\67\35\349\36\35;\37\36= \37?! A\"!C#\"E$#G%$I&%K\'&M(\'O)(Q*)S+*U"+
		",+W-,Y.\62[/-]\60._\61/a\62\60c\63\61\3\2\5\4\2CHch\5\2\13\f\17\17\"\""+
		"\5\2C\\aac|\u0183\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5m\3\2\2\2\7t\3\2\2\2\t~"+
		"\3\2\2\2\13\u0085\3\2\2\2\r\u008d\3\2\2\2\17\u0093\3\2\2\2\21\u009b\3"+
		"\2\2\2\23\u00a0\3\2\2\2\25\u00a7\3\2\2\2\27\u00ad\3\2\2\2\31\u00b6\3\2"+
		"\2\2\33\u00be\3\2\2\2\35\u00c9\3\2\2\2\37\u00d3\3\2\2\2!\u00d6\3\2\2\2"+
		"#\u00d9\3\2\2\2%\u00dc\3\2\2\2\'\u00df\3\2\2\2)\u00e2\3\2\2\2+\u00e5\3"+
		"\2\2\2-\u00e8\3\2\2\2/\u00ed\3\2\2\2\61\u00f2\3\2\2\2\63\u00f7\3\2\2\2"+
		"\65\u00fc\3\2\2\2\67\u0101\3\2\2\29\u0106\3\2\2\2;\u0109\3\2\2\2=\u010c"+
		"\3\2\2\2?\u0111\3\2\2\2A\u011a\3\2\2\2C\u0125\3\2\2\2E\u012c\3\2\2\2G"+
		"\u0138\3\2\2\2I\u013d\3\2\2\2K\u0148\3\2\2\2M\u014b\3\2\2\2O\u014e\3\2"+
		"\2\2Q\u0151\3\2\2\2S\u0154\3\2\2\2U\u0157\3\2\2\2W\u015a\3\2\2\2Y\u0165"+
		"\3\2\2\2[\u016b\3\2\2\2]\u016e\3\2\2\2_\u0171\3\2\2\2a\u0174\3\2\2\2c"+
		"\u0177\3\2\2\2ef\7e\2\2fg\7n\2\2gh\7c\2\2hi\7u\2\2ij\7u\2\2jk\3\2\2\2"+
		"kl\b\2\2\2l\4\3\2\2\2mn\7x\2\2no\7q\2\2op\7k\2\2pq\7f\2\2qr\3\2\2\2rs"+
		"\b\3\3\2s\6\3\2\2\2tu\7d\2\2uv\7q\2\2vw\7q\2\2wx\7n\2\2xy\7g\2\2yz\7c"+
		"\2\2z{\7p\2\2{|\3\2\2\2|}\b\4\4\2}\b\3\2\2\2~\177\7v\2\2\177\u0080\7t"+
		"\2\2\u0080\u0081\7w\2\2\u0081\u0082\7g\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\b\5\5\2\u0084\n\3\2\2\2\u0085\u0086\7h\2\2\u0086\u0087\7c\2\2\u0087\u0088"+
		"\7n\2\2\u0088\u0089\7u\2\2\u0089\u008a\7g\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\b\6\6\2\u008c\f\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f"+
		"\u0090\7v\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\7\7\2\u0092\16\3\2\2\2"+
		"\u0093\u0094\7h\2\2\u0094\u0095\7n\2\2\u0095\u0096\7q\2\2\u0096\u0097"+
		"\7c\2\2\u0097\u0098\7v\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\b\b\2\u009a"+
		"\20\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d\7h\2\2\u009d\u009e\3\2\2\2"+
		"\u009e\u009f\b\t\t\2\u009f\22\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7"+
		"n\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\b\n\n\2\u00a6\24\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7q\2\2"+
		"\u00a9\u00aa\7t\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\13\13\2\u00ac\26"+
		"\3\2\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7v\2\2\u00b0"+
		"\u00b1\7w\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\3\2\2"+
		"\2\u00b4\u00b5\b\f\f\2\u00b5\30\3\2\2\2\u00b6\u00b7\7d\2\2\u00b7\u00b8"+
		"\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7m\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\b\r\r\2\u00bd\32\3\2\2\2\u00be\u00bf\7e\2\2"+
		"\u00bf\u00c0\7q\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3"+
		"\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\b\16\16\2\u00c8\34\3\2\2\2\u00c9\u00ca\7e\2"+
		"\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce"+
		"\7q\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\b\17\17\2\u00d2\36\3\2\2\2\u00d3\u00d4\7-\2\2\u00d4\u00d5\b\20"+
		"\20\2\u00d5 \3\2\2\2\u00d6\u00d7\7/\2\2\u00d7\u00d8\b\21\21\2\u00d8\""+
		"\3\2\2\2\u00d9\u00da\7,\2\2\u00da\u00db\b\22\22\2\u00db$\3\2\2\2\u00dc"+
		"\u00dd\7\61\2\2\u00dd\u00de\b\23\23\2\u00de&\3\2\2\2\u00df\u00e0\7\'\2"+
		"\2\u00e0\u00e1\b\24\24\2\u00e1(\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3\u00e4"+
		"\b\25\25\2\u00e4*\3\2\2\2\u00e5\u00e6\7@\2\2\u00e6\u00e7\b\26\26\2\u00e7"+
		",\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9\u00ea\7?\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ec\b\27\27\2\u00ec.\3\2\2\2\u00ed\u00ee\7@\2\2\u00ee\u00ef\7?\2\2"+
		"\u00ef\u00f0\3\2\2\2\u00f0\u00f1\b\30\30\2\u00f1\60\3\2\2\2\u00f2\u00f3"+
		"\7?\2\2\u00f3\u00f4\7?\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\31\31\2\u00f6"+
		"\62\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8\u00f9\7?\2\2\u00f9\u00fa\3\2\2\2"+
		"\u00fa\u00fb\b\32\32\2\u00fb\64\3\2\2\2\u00fc\u00fd\7(\2\2\u00fd\u00fe"+
		"\7(\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\b\33\33\2\u0100\66\3\2\2\2\u0101"+
		"\u0102\7~\2\2\u0102\u0103\7~\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b\34"+
		"\34\2\u01058\3\2\2\2\u0106\u0107\7#\2\2\u0107\u0108\b\35\35\2\u0108:\3"+
		"\2\2\2\u0109\u010a\7?\2\2\u010a\u010b\b\36\36\2\u010b<\3\2\2\2\u010c\u010d"+
		"\7-\2\2\u010d\u010e\7?\2\2\u010e\u010f\3\2\2\2\u010f\u0110\b\37\37\2\u0110"+
		">\3\2\2\2\u0111\u0112\7/\2\2\u0112\u0113\7?\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\b  \2\u0115@\3\2\2\2\u0116\u0117\7\62\2\2\u0117\u011b\7z\2\2\u0118"+
		"\u0119\7\62\2\2\u0119\u011b\7Z\2\2\u011a\u0116\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011b\u011e\3\2\2\2\u011c\u011f\5a\61\2\u011d\u011f\t\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b!!\2\u0123B"+
		"\3\2\2\2\u0124\u0126\5a\61\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b\""+
		"\"\2\u012aD\3\2\2\2\u012b\u012d\5a\61\2\u012c\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0132\7\60\2\2\u0131\u0133\5a\61\2\u0132\u0131\3\2\2\2\u0133\u0134\3"+
		"\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\b##\2\u0137F\3\2\2\2\u0138\u0139\7)\2\2\u0139\u013a\4\"\u0080\2"+
		"\u013a\u013b\7)\2\2\u013b\u013c\b$$\2\u013cH\3\2\2\2\u013d\u013e\7$\2"+
		"\2\u013e\u0142\4\"\u0080\2\u013f\u0141\4\"\u0080\2\u0140\u013f\3\2\2\2"+
		"\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7$\2\2\u0146\u0147\b%%\2\u0147"+
		"J\3\2\2\2\u0148\u0149\7}\2\2\u0149\u014a\b&&\2\u014aL\3\2\2\2\u014b\u014c"+
		"\7\177\2\2\u014c\u014d\b\'\'\2\u014dN\3\2\2\2\u014e\u014f\7]\2\2\u014f"+
		"\u0150\b((\2\u0150P\3\2\2\2\u0151\u0152\7_\2\2\u0152\u0153\b))\2\u0153"+
		"R\3\2\2\2\u0154\u0155\7*\2\2\u0155\u0156\b**\2\u0156T\3\2\2\2\u0157\u0158"+
		"\7+\2\2\u0158\u0159\b++\2\u0159V\3\2\2\2\u015a\u015f\5c\62\2\u015b\u015e"+
		"\5c\62\2\u015c\u015e\5a\61\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e"+
		"\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2"+
		"\2\2\u0161\u015f\3\2\2\2\u0162\u0163\b,,\2\u0163X\3\2\2\2\u0164\u0166"+
		"\t\3\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\b-\62\2\u016aZ\3\2\2\2"+
		"\u016b\u016c\7.\2\2\u016c\u016d\b.-\2\u016d\\\3\2\2\2\u016e\u016f\7<\2"+
		"\2\u016f\u0170\b/.\2\u0170^\3\2\2\2\u0171\u0172\7=\2\2\u0172\u0173\b\60"+
		"/\2\u0173`\3\2\2\2\u0174\u0175\4\62;\2\u0175\u0176\b\61\60\2\u0176b\3"+
		"\2\2\2\u0177\u0178\t\4\2\2\u0178\u0179\b\62\61\2\u0179d\3\2\2\2\r\2\u011a"+
		"\u011e\u0120\u0127\u012e\u0134\u0142\u015d\u015f\u0167";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}