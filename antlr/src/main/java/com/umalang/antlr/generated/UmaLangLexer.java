// Generated from UmaLang.g4 by ANTLR 4.3
package com.umalang.antlr.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UmaLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, EQUALS=13, BOOL=14, ID=15, NUMBER=16, STRING=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "EQUALS", "BOOL", "ID", "NUMBER", "STRING"
	};


	public UmaLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UmaLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17o\n\17\3\20\6\20r\n\20\r\20\16\20s"+
		"\3\21\6\21w\n\21\r\21\16\21x\3\22\3\22\7\22}\n\22\f\22\16\22\u0080\13"+
		"\22\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23\3\2\4\5\2\62;C\\c|\3\2\62;\u0086\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\3%\3\2\2\2\5+\3\2\2\2\7\62\3\2\2\2\t9\3\2\2\2\13>\3\2\2\2\rB\3\2\2"+
		"\2\17J\3\2\2\2\21O\3\2\2\2\23U\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2\31a\3"+
		"\2\2\2\33c\3\2\2\2\35n\3\2\2\2\37q\3\2\2\2!v\3\2\2\2#z\3\2\2\2%&\7u\2"+
		"\2&\'\7j\2\2\'(\7q\2\2()\7t\2\2)*\7v\2\2*\4\3\2\2\2+,\7u\2\2,-\7v\2\2"+
		"-.\7t\2\2./\7k\2\2/\60\7p\2\2\60\61\7i\2\2\61\6\3\2\2\2\62\63\7f\2\2\63"+
		"\64\7q\2\2\64\65\7w\2\2\65\66\7d\2\2\66\67\7n\2\2\678\7g\2\28\b\3\2\2"+
		"\29:\7e\2\2:;\7j\2\2;<\7c\2\2<=\7t\2\2=\n\3\2\2\2>?\7k\2\2?@\7p\2\2@A"+
		"\7v\2\2A\f\3\2\2\2BC\7d\2\2CD\7q\2\2DE\7q\2\2EF\7n\2\2FG\7g\2\2GH\7c\2"+
		"\2HI\7p\2\2I\16\3\2\2\2JK\7n\2\2KL\7q\2\2LM\7p\2\2MN\7i\2\2N\20\3\2\2"+
		"\2OP\7h\2\2PQ\7n\2\2QR\7q\2\2RS\7c\2\2ST\7v\2\2T\22\3\2\2\2UV\7x\2\2V"+
		"W\7q\2\2WX\7k\2\2XY\7f\2\2Y\24\3\2\2\2Z[\7]\2\2[\26\3\2\2\2\\]\7d\2\2"+
		"]^\7{\2\2^_\7v\2\2_`\7g\2\2`\30\3\2\2\2ab\7_\2\2b\32\3\2\2\2cd\7?\2\2"+
		"d\34\3\2\2\2ef\7v\2\2fg\7t\2\2gh\7w\2\2ho\7g\2\2ij\7h\2\2jk\7c\2\2kl\7"+
		"n\2\2lm\7u\2\2mo\7g\2\2ne\3\2\2\2ni\3\2\2\2o\36\3\2\2\2pr\t\2\2\2qp\3"+
		"\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t \3\2\2\2uw\t\3\2\2vu\3\2\2\2wx\3"+
		"\2\2\2xv\3\2\2\2xy\3\2\2\2y\"\3\2\2\2z~\7$\2\2{}\13\2\2\2|{\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\u0082\7$\2\2\u0082$\3\2\2\2\7\2nsx~\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}