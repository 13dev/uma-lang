// Generated from UmaLang.g4 by ANTLR 4.3

    package com.umalang.antlr;

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
		T__2=10, T__1=11, T__0=12, EQUALS=13, BOOL=14, ID=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'short'", "'string'", "'double'", "'char'", "'int'", "'boolean'", 
		"'long'", "'float'", "'void'", "'['", "'byte'", "']'", "'='", "BOOL", 
		"ID"
	};
	public static final int
		RULE_variableType = 0, RULE_primitiveType = 1;
	public static final String[] ruleNames = {
		"variableType", "primitiveType"
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
			setState(76);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(4); match(T__6);
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(5); match(T__2);
					setState(6); match(T__0);
					}
					}
					setState(11);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(12); match(T__10);
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
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(20); match(T__8);
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
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(28); match(T__1);
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
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(36); match(T__11);
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
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(44); match(T__7);
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
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(52); match(T__5);
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
			case T__4:
				enterOuterAlt(_localctx, 8);
				{
				setState(60); match(T__4);
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
			case T__9:
				enterOuterAlt(_localctx, 9);
				{
				setState(68); match(T__9);
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
			setState(87);
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
				setState(78); variableType();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); match(T__3);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(80); match(T__2);
					setState(81); match(T__0);
					}
					}
					setState(86);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\\\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\3\2\3\2\7\2\22\n\2\f\2"+
		"\16\2\25\13\2\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\7\2"+
		"\"\n\2\f\2\16\2%\13\2\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\2"+
		"\7\2\62\n\2\f\2\16\2\65\13\2\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3"+
		"\2\3\2\7\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\5\2"+
		"O\n\2\3\3\3\3\3\3\3\3\7\3U\n\3\f\3\16\3X\13\3\5\3Z\n\3\3\3\2\2\4\2\4\2"+
		"\2l\2N\3\2\2\2\4Y\3\2\2\2\6\13\7\b\2\2\7\b\7\f\2\2\b\n\7\16\2\2\t\7\3"+
		"\2\2\2\n\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\fO\3\2\2\2\r\13\3\2\2\2\16"+
		"\23\7\4\2\2\17\20\7\f\2\2\20\22\7\16\2\2\21\17\3\2\2\2\22\25\3\2\2\2\23"+
		"\21\3\2\2\2\23\24\3\2\2\2\24O\3\2\2\2\25\23\3\2\2\2\26\33\7\6\2\2\27\30"+
		"\7\f\2\2\30\32\7\16\2\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34"+
		"\3\2\2\2\34O\3\2\2\2\35\33\3\2\2\2\36#\7\r\2\2\37 \7\f\2\2 \"\7\16\2\2"+
		"!\37\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$O\3\2\2\2%#\3\2\2\2&+\7\3"+
		"\2\2\'(\7\f\2\2(*\7\16\2\2)\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,O"+
		"\3\2\2\2-+\3\2\2\2.\63\7\7\2\2/\60\7\f\2\2\60\62\7\16\2\2\61/\3\2\2\2"+
		"\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64O\3\2\2\2\65\63\3\2\2\2\66"+
		";\7\t\2\2\678\7\f\2\28:\7\16\2\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2"+
		"\2\2<O\3\2\2\2=;\3\2\2\2>C\7\n\2\2?@\7\f\2\2@B\7\16\2\2A?\3\2\2\2BE\3"+
		"\2\2\2CA\3\2\2\2CD\3\2\2\2DO\3\2\2\2EC\3\2\2\2FK\7\5\2\2GH\7\f\2\2HJ\7"+
		"\16\2\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2N\6"+
		"\3\2\2\2N\16\3\2\2\2N\26\3\2\2\2N\36\3\2\2\2N&\3\2\2\2N.\3\2\2\2N\66\3"+
		"\2\2\2N>\3\2\2\2NF\3\2\2\2O\3\3\2\2\2PZ\5\2\2\2QV\7\13\2\2RS\7\f\2\2S"+
		"U\7\16\2\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2"+
		"YP\3\2\2\2YQ\3\2\2\2Z\5\3\2\2\2\16\13\23\33#+\63;CKNVY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}