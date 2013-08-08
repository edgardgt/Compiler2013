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
		WS=1, DIGITO=2, ENTPOS=3, ENTERO=4, FLOTAN=5, STRING=6, VARIABLE=7, MAS=8, 
		MENOS=9, MULT=10, DIVI=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WS", "DIGITO", "ENTPOS", "ENTERO", "FLOTAN", "STRING", "VARIABLE", "'+'", 
		"'-'", "'*'", "'/'"
	};
	public static final String[] ruleNames = {
		"WS", "DIGITO", "ENTPOS", "ENTERO", "FLOTAN", "STRING", "VARIABLE", "MAS", 
		"MENOS", "MULT", "DIVI"
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
		case 0: WS_action((RuleContext)_localctx, actionIndex); break;

		case 1: DIGITO_action((RuleContext)_localctx, actionIndex); break;

		case 2: ENTPOS_action((RuleContext)_localctx, actionIndex); break;

		case 3: ENTERO_action((RuleContext)_localctx, actionIndex); break;

		case 4: FLOTAN_action((RuleContext)_localctx, actionIndex); break;

		case 5: STRING_action((RuleContext)_localctx, actionIndex); break;

		case 6: VARIABLE_action((RuleContext)_localctx, actionIndex); break;

		case 7: MAS_action((RuleContext)_localctx, actionIndex); break;

		case 8: MENOS_action((RuleContext)_localctx, actionIndex); break;

		case 9: MULT_action((RuleContext)_localctx, actionIndex); break;

		case 10: DIVI_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ENTERO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: System.out.println("ENTERO"); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: skip();  break;
		}
	}
	private void FLOTAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: System.out.println("FLOTANTE"); break;
		}
	}
	private void VARIABLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: System.out.println("VARIABLE"); break;
		}
	}
	private void MULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: System.out.println("MULTIPLICACION"); break;
		}
	}
	private void DIGITO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("ENTERO"); break;
		}
	}
	private void MENOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: System.out.println("MENOS"); break;
		}
	}
	private void DIVI_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: System.out.println("DIVISION"); break;
		}
	}
	private void MAS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: System.out.println("MAS"); break;
		}
	}
	private void ENTPOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: System.out.println("ENTERO"); break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: System.out.println("LITERAL STRING"); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\rW\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\6\2\33\n\2\r\2\16\2\34\3\2\3\2\3\3\3\3\3\3\3\4\6\4%\n"+
		"\4\r\4\16\4&\3\4\3\4\3\5\5\5,\n\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\64\n\6\3"+
		"\6\3\6\3\7\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\7\3\7\3\7\3\b\3\b\7\bE\n"+
		"\b\f\b\16\bH\13\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\2\r\3\3\f\5\4\2\7\5\3\t\6\4\13\7\5\r\b\6\17\t\7\21\n\b\23\13\t"+
		"\25\f\n\27\r\13\3\2\3\5\2\13\f\17\17\"\"\\\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\32\3\2\2\2\5 \3\2\2\2\7$\3"+
		"\2\2\2\t+\3\2\2\2\13\60\3\2\2\2\r\67\3\2\2\2\17B\3\2\2\2\21K\3\2\2\2\23"+
		"N\3\2\2\2\25Q\3\2\2\2\27T\3\2\2\2\31\33\t\2\2\2\32\31\3\2\2\2\33\34\3"+
		"\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37\b\2\f\2\37\4\3"+
		"\2\2\2 !\4\62;\2!\"\b\3\2\2\"\6\3\2\2\2#%\5\5\3\2$#\3\2\2\2%&\3\2\2\2"+
		"&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\b\4\3\2)\b\3\2\2\2*,\7/\2\2+*\3\2\2"+
		"\2+,\3\2\2\2,-\3\2\2\2-.\5\7\4\2./\b\5\4\2/\n\3\2\2\2\60\63\5\t\5\2\61"+
		"\62\7\60\2\2\62\64\5\7\4\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65"+
		"\66\b\6\5\2\66\f\3\2\2\2\678\7$\2\28<\4\"\u0080\29;\4\"\u0080\2:9\3\2"+
		"\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7$\2\2@A\b\7"+
		"\6\2A\16\3\2\2\2BF\5\r\7\2CE\5\5\3\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3"+
		"\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\b\b\7\2J\20\3\2\2\2KL\7-\2\2LM\b\t\b\2M\22"+
		"\3\2\2\2NO\7/\2\2OP\b\n\t\2P\24\3\2\2\2QR\7,\2\2RS\b\13\n\2S\26\3\2\2"+
		"\2TU\7\61\2\2UV\b\f\13\2V\30\3\2\2\2\t\2\34&+\63<F";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}