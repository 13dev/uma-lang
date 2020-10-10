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
		T__2=10, T__1=11, T__0=12, EQUALS=13, BOOL=14, ID=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "EQUALS", "BOOL", "ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17k\n\17\3\20\6\20n\n\20\r\20\16\20o\2\2\21\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\3\5\2\62"+
		";C\\c|r\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2"+
		"\5\'\3\2\2\2\7.\3\2\2\2\t\65\3\2\2\2\13:\3\2\2\2\r>\3\2\2\2\17F\3\2\2"+
		"\2\21K\3\2\2\2\23Q\3\2\2\2\25V\3\2\2\2\27X\3\2\2\2\31]\3\2\2\2\33_\3\2"+
		"\2\2\35j\3\2\2\2\37m\3\2\2\2!\"\7u\2\2\"#\7j\2\2#$\7q\2\2$%\7t\2\2%&\7"+
		"v\2\2&\4\3\2\2\2\'(\7u\2\2()\7v\2\2)*\7t\2\2*+\7k\2\2+,\7p\2\2,-\7i\2"+
		"\2-\6\3\2\2\2./\7f\2\2/\60\7q\2\2\60\61\7w\2\2\61\62\7d\2\2\62\63\7n\2"+
		"\2\63\64\7g\2\2\64\b\3\2\2\2\65\66\7e\2\2\66\67\7j\2\2\678\7c\2\289\7"+
		"t\2\29\n\3\2\2\2:;\7k\2\2;<\7p\2\2<=\7v\2\2=\f\3\2\2\2>?\7d\2\2?@\7q\2"+
		"\2@A\7q\2\2AB\7n\2\2BC\7g\2\2CD\7c\2\2DE\7p\2\2E\16\3\2\2\2FG\7n\2\2G"+
		"H\7q\2\2HI\7p\2\2IJ\7i\2\2J\20\3\2\2\2KL\7h\2\2LM\7n\2\2MN\7q\2\2NO\7"+
		"c\2\2OP\7v\2\2P\22\3\2\2\2QR\7x\2\2RS\7q\2\2ST\7k\2\2TU\7f\2\2U\24\3\2"+
		"\2\2VW\7]\2\2W\26\3\2\2\2XY\7d\2\2YZ\7{\2\2Z[\7v\2\2[\\\7g\2\2\\\30\3"+
		"\2\2\2]^\7_\2\2^\32\3\2\2\2_`\7?\2\2`\34\3\2\2\2ab\7v\2\2bc\7t\2\2cd\7"+
		"w\2\2dk\7g\2\2ef\7h\2\2fg\7c\2\2gh\7n\2\2hi\7u\2\2ik\7g\2\2ja\3\2\2\2"+
		"je\3\2\2\2k\36\3\2\2\2ln\t\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2"+
		"\2p \3\2\2\2\5\2jo\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}