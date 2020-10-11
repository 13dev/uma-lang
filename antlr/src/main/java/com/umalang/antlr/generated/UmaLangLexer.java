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
		T__2=10, T__1=11, T__0=12, PRINT=13, EQUALS=14, BOOL=15, ID=16, NUMBER=17, 
		STRING=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "PRINT", "EQUALS", "BOOL", "ID", "NUMBER", "STRING"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20w\n\20\3\21\6\21z\n\21\r\21\16\21{\3\22\6\22\177\n\22\r\22\16\22"+
		"\u0080\3\23\3\23\7\23\u0085\n\23\f\23\16\23\u0088\13\23\3\23\3\23\2\2"+
		"\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\3\2\4\5\2\62;C\\c|\3\2\62;\u008e\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3"+
		"\'\3\2\2\2\5-\3\2\2\2\7\64\3\2\2\2\t;\3\2\2\2\13@\3\2\2\2\rD\3\2\2\2\17"+
		"L\3\2\2\2\21Q\3\2\2\2\23W\3\2\2\2\25\\\3\2\2\2\27^\3\2\2\2\31c\3\2\2\2"+
		"\33e\3\2\2\2\35k\3\2\2\2\37v\3\2\2\2!y\3\2\2\2#~\3\2\2\2%\u0082\3\2\2"+
		"\2\'(\7u\2\2()\7j\2\2)*\7q\2\2*+\7t\2\2+,\7v\2\2,\4\3\2\2\2-.\7u\2\2."+
		"/\7v\2\2/\60\7t\2\2\60\61\7k\2\2\61\62\7p\2\2\62\63\7i\2\2\63\6\3\2\2"+
		"\2\64\65\7f\2\2\65\66\7q\2\2\66\67\7w\2\2\678\7d\2\289\7n\2\29:\7g\2\2"+
		":\b\3\2\2\2;<\7e\2\2<=\7j\2\2=>\7c\2\2>?\7t\2\2?\n\3\2\2\2@A\7k\2\2AB"+
		"\7p\2\2BC\7v\2\2C\f\3\2\2\2DE\7d\2\2EF\7q\2\2FG\7q\2\2GH\7n\2\2HI\7g\2"+
		"\2IJ\7c\2\2JK\7p\2\2K\16\3\2\2\2LM\7n\2\2MN\7q\2\2NO\7p\2\2OP\7i\2\2P"+
		"\20\3\2\2\2QR\7h\2\2RS\7n\2\2ST\7q\2\2TU\7c\2\2UV\7v\2\2V\22\3\2\2\2W"+
		"X\7x\2\2XY\7q\2\2YZ\7k\2\2Z[\7f\2\2[\24\3\2\2\2\\]\7]\2\2]\26\3\2\2\2"+
		"^_\7d\2\2_`\7{\2\2`a\7v\2\2ab\7g\2\2b\30\3\2\2\2cd\7_\2\2d\32\3\2\2\2"+
		"ef\7r\2\2fg\7t\2\2gh\7k\2\2hi\7p\2\2ij\7v\2\2j\34\3\2\2\2kl\7?\2\2l\36"+
		"\3\2\2\2mn\7v\2\2no\7t\2\2op\7w\2\2pw\7g\2\2qr\7h\2\2rs\7c\2\2st\7n\2"+
		"\2tu\7u\2\2uw\7g\2\2vm\3\2\2\2vq\3\2\2\2w \3\2\2\2xz\t\2\2\2yx\3\2\2\2"+
		"z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\"\3\2\2\2}\177\t\3\2\2~}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081$\3\2\2\2\u0082\u0086"+
		"\7$\2\2\u0083\u0085\13\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0089\u008a\7$\2\2\u008a&\3\2\2\2\7\2v{\u0080\u0086\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}