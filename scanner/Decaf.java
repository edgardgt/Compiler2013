// Generated from scanner\Decaf.g by ANTLR 4.1

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
		CLASE=1, VOID=2, TRUE=3, FALSE=4, IF=5, ELSE=6, FOR=7, RETURN=8, BREAK=9, 
		CONTINUE=10, CALLOUT=11, TIPO=12, CHAR_LITERAL=13, STRING_LITERAL=14, 
		BOOL_LITERAL=15, INT_LITERAL=16, HEXA=17, MENOS=18, ARITH_OP=19, REL_OP=20, 
		EQ_OP=21, NOT=22, COND_OP=23, ASIGNACION=24, INCREMENTA=25, DECREMENTA=26, 
		LBRACE=27, RBRACE=28, LBRACKET=29, RBRACKET=30, LPARENTH=31, RPARENTH=32, 
		ID=33, WS=34, COMMA=35, COLON=36, SEMI=37, COMMENTLIN=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'class'", "'void'", "'true'", "'false'", "'if'", "'else'", "'for'", "'return'", 
		"'break'", "'continue'", "'callout'", "TIPO", "CHAR_LITERAL", "STRING_LITERAL", 
		"BOOL_LITERAL", "INT_LITERAL", "HEXA", "'-'", "ARITH_OP", "REL_OP", "EQ_OP", 
		"'!'", "COND_OP", "'='", "'+='", "'-='", "'{'", "'}'", "'['", "']'", "'('", 
		"')'", "ID", "WS", "','", "':'", "';'", "COMMENTLIN"
	};
	public static final String[] ruleNames = {
		"CLASE", "VOID", "TRUE", "FALSE", "IF", "ELSE", "FOR", "RETURN", "BREAK", 
		"CONTINUE", "CALLOUT", "TIPO", "CHAR_LITERAL", "STRING_LITERAL", "BOOL_LITERAL", 
		"INT_LITERAL", "HEXA", "MENOS", "ARITH_OP", "REL_OP", "EQ_OP", "NOT", 
		"COND_OP", "ASIGNACION", "INCREMENTA", "DECREMENTA", "LBRACE", "RBRACE", 
		"LBRACKET", "RBRACKET", "LPARENTH", "RPARENTH", "ID", "WS", "COMMA", "COLON", 
		"SEMI", "COMMENTLIN", "DIGITO", "ALFA", "BOOLEAN", "INT", "DECIMAL", "MAS", 
		"PROD", "DIV", "MOD", "MENORQ", "MAYORQ", "MENORIGQ", "MAYORIGQ", "IGUAL", 
		"DIFERENTE", "AND", "OR"
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
		case 33: WS_action((RuleContext)_localctx, actionIndex); break;

		case 37: COMMENTLIN_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMMENTLIN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2(\u015a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u00b4\n\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\7\17\u00bd\n\17\f\17\16\17\u00c0\13\17\3\17\3\17\3\20\3"+
		"\20\5\20\u00c6\n\20\3\21\3\21\5\21\u00ca\n\21\3\22\3\22\3\22\3\22\5\22"+
		"\u00d0\n\22\3\22\3\22\6\22\u00d4\n\22\r\22\16\22\u00d5\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00df\n\24\3\25\3\25\3\25\3\25\5\25\u00e5\n"+
		"\25\3\26\3\26\5\26\u00e9\n\26\3\27\3\27\3\30\3\30\3\30\5\30\u00f0\n\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\7\"\u0109\n\"\f\"\16\"\u010c\13\"\3"+
		"#\6#\u010f\n#\r#\16#\u0110\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\7\'"+
		"\u011f\n\'\f\'\16\'\u0122\13\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3,\3,\7,\u0138\n,\f,\16,\u013b\13,\3-\3-\3.\3.\3/\3/"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\29\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35"+
		"\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1"+
		"\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\3G%\1I&\1K\'\1"+
		"M(\2O\2\1Q\2\1S\2\1U\2\1W\2\1Y\2\1[\2\1]\2\1_\2\1a\2\1c\2\1e\2\1g\2\1"+
		"i\2\1k\2\1m\2\1o\2\1\3\2\6\4\2CHch\5\2\13\f\17\17\"\"\4\2\f\f\17\17\5"+
		"\2C\\aac|\u015e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3q\3\2\2\2\5w\3\2\2"+
		"\2\7|\3\2\2\2\t\u0081\3\2\2\2\13\u0087\3\2\2\2\r\u008a\3\2\2\2\17\u008f"+
		"\3\2\2\2\21\u0093\3\2\2\2\23\u009a\3\2\2\2\25\u00a0\3\2\2\2\27\u00a9\3"+
		"\2\2\2\31\u00b3\3\2\2\2\33\u00b5\3\2\2\2\35\u00b9\3\2\2\2\37\u00c5\3\2"+
		"\2\2!\u00c9\3\2\2\2#\u00cf\3\2\2\2%\u00d7\3\2\2\2\'\u00de\3\2\2\2)\u00e4"+
		"\3\2\2\2+\u00e8\3\2\2\2-\u00ea\3\2\2\2/\u00ef\3\2\2\2\61\u00f1\3\2\2\2"+
		"\63\u00f3\3\2\2\2\65\u00f6\3\2\2\2\67\u00f9\3\2\2\29\u00fb\3\2\2\2;\u00fd"+
		"\3\2\2\2=\u00ff\3\2\2\2?\u0101\3\2\2\2A\u0103\3\2\2\2C\u0105\3\2\2\2E"+
		"\u010e\3\2\2\2G\u0114\3\2\2\2I\u0116\3\2\2\2K\u0118\3\2\2\2M\u011a\3\2"+
		"\2\2O\u0125\3\2\2\2Q\u0127\3\2\2\2S\u0129\3\2\2\2U\u0131\3\2\2\2W\u0135"+
		"\3\2\2\2Y\u013c\3\2\2\2[\u013e\3\2\2\2]\u0140\3\2\2\2_\u0142\3\2\2\2a"+
		"\u0144\3\2\2\2c\u0146\3\2\2\2e\u0148\3\2\2\2g\u014b\3\2\2\2i\u014e\3\2"+
		"\2\2k\u0151\3\2\2\2m\u0154\3\2\2\2o\u0157\3\2\2\2qr\7e\2\2rs\7n\2\2st"+
		"\7c\2\2tu\7u\2\2uv\7u\2\2v\4\3\2\2\2wx\7x\2\2xy\7q\2\2yz\7k\2\2z{\7f\2"+
		"\2{\6\3\2\2\2|}\7v\2\2}~\7t\2\2~\177\7w\2\2\177\u0080\7g\2\2\u0080\b\3"+
		"\2\2\2\u0081\u0082\7h\2\2\u0082\u0083\7c\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7u\2\2\u0085\u0086\7g\2\2\u0086\n\3\2\2\2\u0087\u0088\7k\2\2\u0088"+
		"\u0089\7h\2\2\u0089\f\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7n\2\2\u008c"+
		"\u008d\7u\2\2\u008d\u008e\7g\2\2\u008e\16\3\2\2\2\u008f\u0090\7h\2\2\u0090"+
		"\u0091\7q\2\2\u0091\u0092\7t\2\2\u0092\20\3\2\2\2\u0093\u0094\7t\2\2\u0094"+
		"\u0095\7g\2\2\u0095\u0096\7v\2\2\u0096\u0097\7w\2\2\u0097\u0098\7t\2\2"+
		"\u0098\u0099\7p\2\2\u0099\22\3\2\2\2\u009a\u009b\7d\2\2\u009b\u009c\7"+
		"t\2\2\u009c\u009d\7g\2\2\u009d\u009e\7c\2\2\u009e\u009f\7m\2\2\u009f\24"+
		"\3\2\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7p\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7w\2\2"+
		"\u00a7\u00a8\7g\2\2\u00a8\26\3\2\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab\7"+
		"c\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af"+
		"\7w\2\2\u00af\u00b0\7v\2\2\u00b0\30\3\2\2\2\u00b1\u00b4\5U+\2\u00b2\u00b4"+
		"\5S*\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\32\3\2\2\2\u00b5"+
		"\u00b6\7)\2\2\u00b6\u00b7\4\"\u0080\2\u00b7\u00b8\7)\2\2\u00b8\34\3\2"+
		"\2\2\u00b9\u00ba\7$\2\2\u00ba\u00be\4\"\u0080\2\u00bb\u00bd\4\"\u0080"+
		"\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7$\2\2\u00c2"+
		"\36\3\2\2\2\u00c3\u00c6\5\7\4\2\u00c4\u00c6\5\t\5\2\u00c5\u00c3\3\2\2"+
		"\2\u00c5\u00c4\3\2\2\2\u00c6 \3\2\2\2\u00c7\u00ca\5W,\2\u00c8\u00ca\5"+
		"#\22\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\"\3\2\2\2\u00cb\u00cc"+
		"\7\62\2\2\u00cc\u00d0\7z\2\2\u00cd\u00ce\7\62\2\2\u00ce\u00d0\7Z\2\2\u00cf"+
		"\u00cb\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d4\5O"+
		"(\2\u00d2\u00d4\t\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6$\3\2\2\2"+
		"\u00d7\u00d8\7/\2\2\u00d8&\3\2\2\2\u00d9\u00df\5Y-\2\u00da\u00df\5%\23"+
		"\2\u00db\u00df\5[.\2\u00dc\u00df\5]/\2\u00dd\u00df\5_\60\2\u00de\u00d9"+
		"\3\2\2\2\u00de\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df(\3\2\2\2\u00e0\u00e5\5a\61\2\u00e1\u00e5\5c\62\2"+
		"\u00e2\u00e5\5e\63\2\u00e3\u00e5\5g\64\2\u00e4\u00e0\3\2\2\2\u00e4\u00e1"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5*\3\2\2\2\u00e6"+
		"\u00e9\5i\65\2\u00e7\u00e9\5k\66\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9,\3\2\2\2\u00ea\u00eb\7#\2\2\u00eb.\3\2\2\2\u00ec\u00f0\5m\67"+
		"\2\u00ed\u00f0\5o8\2\u00ee\u00f0\5-\27\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\60\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2"+
		"\62\3\2\2\2\u00f3\u00f4\7-\2\2\u00f4\u00f5\7?\2\2\u00f5\64\3\2\2\2\u00f6"+
		"\u00f7\7/\2\2\u00f7\u00f8\7?\2\2\u00f8\66\3\2\2\2\u00f9\u00fa\7}\2\2\u00fa"+
		"8\3\2\2\2\u00fb\u00fc\7\177\2\2\u00fc:\3\2\2\2\u00fd\u00fe\7]\2\2\u00fe"+
		"<\3\2\2\2\u00ff\u0100\7_\2\2\u0100>\3\2\2\2\u0101\u0102\7*\2\2\u0102@"+
		"\3\2\2\2\u0103\u0104\7+\2\2\u0104B\3\2\2\2\u0105\u010a\5Q)\2\u0106\u0109"+
		"\5Q)\2\u0107\u0109\5O(\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010bD\3\2\2\2"+
		"\u010c\u010a\3\2\2\2\u010d\u010f\t\3\2\2\u010e\u010d\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\b#\3\2\u0113F\3\2\2\2\u0114\u0115\7.\2\2\u0115H\3\2\2\2\u0116\u0117"+
		"\7<\2\2\u0117J\3\2\2\2\u0118\u0119\7=\2\2\u0119L\3\2\2\2\u011a\u011b\7"+
		"\61\2\2\u011b\u011c\7\61\2\2\u011c\u0120\3\2\2\2\u011d\u011f\n\4\2\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\b\'\2\2\u0124"+
		"N\3\2\2\2\u0125\u0126\4\62;\2\u0126P\3\2\2\2\u0127\u0128\t\5\2\2\u0128"+
		"R\3\2\2\2\u0129\u012a\7d\2\2\u012a\u012b\7q\2\2\u012b\u012c\7q\2\2\u012c"+
		"\u012d\7n\2\2\u012d\u012e\7g\2\2\u012e\u012f\7c\2\2\u012f\u0130\7p\2\2"+
		"\u0130T\3\2\2\2\u0131\u0132\7k\2\2\u0132\u0133\7p\2\2\u0133\u0134\7v\2"+
		"\2\u0134V\3\2\2\2\u0135\u0139\5O(\2\u0136\u0138\5O(\2\u0137\u0136\3\2"+
		"\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"X\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7-\2\2\u013dZ\3\2\2\2\u013e"+
		"\u013f\7,\2\2\u013f\\\3\2\2\2\u0140\u0141\7\61\2\2\u0141^\3\2\2\2\u0142"+
		"\u0143\7\'\2\2\u0143`\3\2\2\2\u0144\u0145\7>\2\2\u0145b\3\2\2\2\u0146"+
		"\u0147\7@\2\2\u0147d\3\2\2\2\u0148\u0149\7>\2\2\u0149\u014a\7?\2\2\u014a"+
		"f\3\2\2\2\u014b\u014c\7@\2\2\u014c\u014d\7?\2\2\u014dh\3\2\2\2\u014e\u014f"+
		"\7?\2\2\u014f\u0150\7?\2\2\u0150j\3\2\2\2\u0151\u0152\7#\2\2\u0152\u0153"+
		"\7?\2\2\u0153l\3\2\2\2\u0154\u0155\7(\2\2\u0155\u0156\7(\2\2\u0156n\3"+
		"\2\2\2\u0157\u0158\7~\2\2\u0158\u0159\7~\2\2\u0159p\3\2\2\2\23\2\u00b3"+
		"\u00be\u00c5\u00c9\u00cf\u00d3\u00d5\u00de\u00e4\u00e8\u00ef\u0108\u010a"+
		"\u0110\u0120\u0139";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}