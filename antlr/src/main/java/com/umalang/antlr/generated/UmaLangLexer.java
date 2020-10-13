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
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		SEMICOLON=17, PRINT=18, EQUALS=19, NUMBER=20, STRING=21, ID=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "SEMICOLON", 
		"PRINT", "EQUALS", "NUMBER", "STRING", "ID", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\6\25\u0087\n\25\r\25\16\25\u0088\3\26\3\26\7"+
		"\26\u008d\n\26\f\26\16\26\u0090\13\26\3\26\3\26\3\27\6\27\u0095\n\27\r"+
		"\27\16\27\u0096\3\30\6\30\u009a\n\30\r\30\16\30\u009b\3\30\3\30\3\u008e"+
		"\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\5\3\2\62;\5\2\62;C\\c|"+
		"\5\2\13\f\17\17\"\"\u00a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\66\3\2\2\2\7>\3\2\2\2\tC\3\2"+
		"\2\2\13I\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21V\3\2\2\2\23X\3\2\2\2\25Z\3"+
		"\2\2\2\27_\3\2\2\2\31a\3\2\2\2\33c\3\2\2\2\35i\3\2\2\2\37p\3\2\2\2!w\3"+
		"\2\2\2#{\3\2\2\2%}\3\2\2\2\'\u0083\3\2\2\2)\u0086\3\2\2\2+\u008a\3\2\2"+
		"\2-\u0094\3\2\2\2/\u0099\3\2\2\2\61\62\7e\2\2\62\63\7j\2\2\63\64\7c\2"+
		"\2\64\65\7t\2\2\65\4\3\2\2\2\66\67\7d\2\2\678\7q\2\289\7q\2\29:\7n\2\2"+
		":;\7g\2\2;<\7c\2\2<=\7p\2\2=\6\3\2\2\2>?\7n\2\2?@\7q\2\2@A\7p\2\2AB\7"+
		"i\2\2B\b\3\2\2\2CD\7h\2\2DE\7n\2\2EF\7q\2\2FG\7c\2\2GH\7v\2\2H\n\3\2\2"+
		"\2IJ\7e\2\2JK\7n\2\2KL\7c\2\2LM\7u\2\2MN\7u\2\2N\f\3\2\2\2OP\7}\2\2P\16"+
		"\3\2\2\2QR\7x\2\2RS\7q\2\2ST\7k\2\2TU\7f\2\2U\20\3\2\2\2VW\7]\2\2W\22"+
		"\3\2\2\2XY\7>\2\2Y\24\3\2\2\2Z[\7d\2\2[\\\7{\2\2\\]\7v\2\2]^\7g\2\2^\26"+
		"\3\2\2\2_`\7\177\2\2`\30\3\2\2\2ab\7_\2\2b\32\3\2\2\2cd\7u\2\2de\7j\2"+
		"\2ef\7q\2\2fg\7t\2\2gh\7v\2\2h\34\3\2\2\2ij\7u\2\2jk\7v\2\2kl\7t\2\2l"+
		"m\7k\2\2mn\7p\2\2no\7i\2\2o\36\3\2\2\2pq\7f\2\2qr\7q\2\2rs\7w\2\2st\7"+
		"d\2\2tu\7n\2\2uv\7g\2\2v \3\2\2\2wx\7k\2\2xy\7p\2\2yz\7v\2\2z\"\3\2\2"+
		"\2{|\7=\2\2|$\3\2\2\2}~\7r\2\2~\177\7t\2\2\177\u0080\7k\2\2\u0080\u0081"+
		"\7p\2\2\u0081\u0082\7v\2\2\u0082&\3\2\2\2\u0083\u0084\7?\2\2\u0084(\3"+
		"\2\2\2\u0085\u0087\t\2\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089*\3\2\2\2\u008a\u008e\7$\2\2\u008b"+
		"\u008d\13\2\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0092\7$\2\2\u0092,\3\2\2\2\u0093\u0095\t\3\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097.\3\2\2\2"+
		"\u0098\u009a\t\4\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\30\2\2"+
		"\u009e\60\3\2\2\2\7\2\u0088\u008e\u0096\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}