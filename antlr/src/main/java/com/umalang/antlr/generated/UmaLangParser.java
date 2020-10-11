// Generated from UmaLang.g4 by ANTLR 4.3
package com.umalang.antlr.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UmaLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, SEMICOLON=13, PRINT=14, EQUALS=15, NUMBER=16, 
		STRING=17, ID=18, WS=19;
	public static final String[] tokenNames = {
		"<INVALID>", "'short'", "'string'", "'double'", "'char'", "'int'", "'boolean'", 
		"'long'", "'float'", "'void'", "'['", "'byte'", "']'", "';'", "'print'", 
		"'='", "NUMBER", "STRING", "ID", "WS"
	};
	public static final int
		RULE_variableType = 0, RULE_primitiveType = 1, RULE_compilationUnit = 2, 
		RULE_variable = 3, RULE_print = 4, RULE_value = 5;
	public static final String[] ruleNames = {
		"variableType", "primitiveType", "compilationUnit", "variable", "print", 
		"value"
	};

	@Override
	public String getGrammarFileName() { return "UmaLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UmaLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VariableTypeContext extends ParserRuleContext {
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitVariableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitVariableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_variableType);
		int _la;
		try {
			setState(84);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(12); match(T__6);
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(13); match(T__2);
					setState(14); match(T__0);
					}
					}
					setState(19);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(20); match(T__10);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(21); match(T__2);
					setState(22); match(T__0);
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(28); match(T__8);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(29); match(T__2);
					setState(30); match(T__0);
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(36); match(T__1);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(37); match(T__2);
					setState(38); match(T__0);
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(44); match(T__11);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(45); match(T__2);
					setState(46); match(T__0);
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(52); match(T__7);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(53); match(T__2);
					setState(54); match(T__0);
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(60); match(T__5);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(61); match(T__2);
					setState(62); match(T__0);
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 8);
				{
				setState(68); match(T__4);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(69); match(T__2);
					setState(70); match(T__0);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 9);
				{
				setState(76); match(T__9);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(77); match(T__2);
					setState(78); match(T__0);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primitiveType);
		int _la;
		try {
			setState(95);
			switch (_input.LA(1)) {
			case T__11:
			case T__10:
			case T__9:
			case T__8:
			case T__7:
			case T__6:
			case T__5:
			case T__4:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); variableType();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); match(T__3);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(88); match(T__2);
					setState(89); match(T__0);
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public TerminalNode EOF() { return getToken(UmaLangParser.EOF, 0); }
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__1) | (1L << PRINT))) != 0)) {
				{
				setState(99);
				switch (_input.LA(1)) {
				case T__11:
				case T__10:
				case T__9:
				case T__8:
				case T__7:
				case T__6:
				case T__5:
				case T__4:
				case T__1:
					{
					setState(97); variable();
					}
					break;
				case PRINT:
					{
					setState(98); print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UmaLangParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(UmaLangParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(UmaLangParser.SEMICOLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); variableType();
			setState(107); match(ID);
			setState(108); match(EQUALS);
			setState(109); value();
			setState(110); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UmaLangParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(UmaLangParser.SEMICOLON, 0); }
		public TerminalNode PRINT() { return getToken(UmaLangParser.PRINT, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(PRINT);
			setState(113); match(ID);
			setState(114); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UmaLangParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(UmaLangParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\7\2\"\n\2\f"+
		"\2\16\2%\13\2\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\2\7\2\62\n"+
		"\2\f\2\16\2\65\13\2\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\2\7"+
		"\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\2"+
		"\7\2R\n\2\f\2\16\2U\13\2\5\2W\n\2\3\3\3\3\3\3\3\3\7\3]\n\3\f\3\16\3`\13"+
		"\3\5\3b\n\3\3\4\3\4\7\4f\n\4\f\4\16\4i\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\22\23\u0087"+
		"\2V\3\2\2\2\4a\3\2\2\2\6g\3\2\2\2\bl\3\2\2\2\nr\3\2\2\2\fv\3\2\2\2\16"+
		"\23\7\b\2\2\17\20\7\f\2\2\20\22\7\16\2\2\21\17\3\2\2\2\22\25\3\2\2\2\23"+
		"\21\3\2\2\2\23\24\3\2\2\2\24W\3\2\2\2\25\23\3\2\2\2\26\33\7\4\2\2\27\30"+
		"\7\f\2\2\30\32\7\16\2\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34"+
		"\3\2\2\2\34W\3\2\2\2\35\33\3\2\2\2\36#\7\6\2\2\37 \7\f\2\2 \"\7\16\2\2"+
		"!\37\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$W\3\2\2\2%#\3\2\2\2&+\7\r"+
		"\2\2\'(\7\f\2\2(*\7\16\2\2)\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,W"+
		"\3\2\2\2-+\3\2\2\2.\63\7\3\2\2/\60\7\f\2\2\60\62\7\16\2\2\61/\3\2\2\2"+
		"\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64W\3\2\2\2\65\63\3\2\2\2\66"+
		";\7\7\2\2\678\7\f\2\28:\7\16\2\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2"+
		"\2\2<W\3\2\2\2=;\3\2\2\2>C\7\t\2\2?@\7\f\2\2@B\7\16\2\2A?\3\2\2\2BE\3"+
		"\2\2\2CA\3\2\2\2CD\3\2\2\2DW\3\2\2\2EC\3\2\2\2FK\7\n\2\2GH\7\f\2\2HJ\7"+
		"\16\2\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LW\3\2\2\2MK\3\2\2\2NS"+
		"\7\5\2\2OP\7\f\2\2PR\7\16\2\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TW\3\2\2\2US\3\2\2\2V\16\3\2\2\2V\26\3\2\2\2V\36\3\2\2\2V&\3\2\2\2V.\3"+
		"\2\2\2V\66\3\2\2\2V>\3\2\2\2VF\3\2\2\2VN\3\2\2\2W\3\3\2\2\2Xb\5\2\2\2"+
		"Y^\7\13\2\2Z[\7\f\2\2[]\7\16\2\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2"+
		"\2\2_b\3\2\2\2`^\3\2\2\2aX\3\2\2\2aY\3\2\2\2b\5\3\2\2\2cf\5\b\5\2df\5"+
		"\n\6\2ec\3\2\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3"+
		"\2\2\2jk\7\2\2\3k\7\3\2\2\2lm\5\2\2\2mn\7\24\2\2no\7\21\2\2op\5\f\7\2"+
		"pq\7\17\2\2q\t\3\2\2\2rs\7\20\2\2st\7\24\2\2tu\7\17\2\2u\13\3\2\2\2vw"+
		"\t\2\2\2w\r\3\2\2\2\20\23\33#+\63;CKSV^aeg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}