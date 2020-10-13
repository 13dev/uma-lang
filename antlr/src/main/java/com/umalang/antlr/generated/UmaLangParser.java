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
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		SEMICOLON=17, PRINT=18, EQUALS=19, NUMBER=20, STRING=21, ID=22, WS=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'char'", "'boolean'", "'long'", "'float'", "'class'", "'{'", 
		"'void'", "'['", "'<'", "'byte'", "'}'", "']'", "'short'", "'string'", 
		"'double'", "'int'", "';'", "'print'", "'='", "NUMBER", "STRING", "ID", 
		"WS"
	};
	public static final int
		RULE_variableType = 0, RULE_primitiveType = 1, RULE_compilationUnit = 2, 
		RULE_className = 3, RULE_parentClassName = 4, RULE_classUnit = 5, RULE_block = 6, 
		RULE_variable = 7, RULE_print = 8, RULE_value = 9;
	public static final String[] ruleNames = {
		"variableType", "primitiveType", "compilationUnit", "className", "parentClassName", 
		"classUnit", "block", "variable", "print", "value"
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
			setState(92);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(20); match(T__14);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(21); match(T__8);
					setState(22); match(T__4);
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28); match(T__2);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(29); match(T__8);
					setState(30); match(T__4);
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(36); match(T__15);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(37); match(T__8);
					setState(38); match(T__4);
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(44); match(T__6);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(45); match(T__8);
					setState(46); match(T__4);
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(52); match(T__3);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(53); match(T__8);
					setState(54); match(T__4);
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(60); match(T__0);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(61); match(T__8);
					setState(62); match(T__4);
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(68); match(T__13);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(69); match(T__8);
					setState(70); match(T__4);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 8);
				{
				setState(76); match(T__12);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(77); match(T__8);
					setState(78); match(T__4);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 9);
				{
				setState(84); match(T__1);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(85); match(T__8);
					setState(86); match(T__4);
					}
					}
					setState(91);
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
			setState(103);
			switch (_input.LA(1)) {
			case T__15:
			case T__14:
			case T__13:
			case T__12:
			case T__6:
			case T__3:
			case T__2:
			case T__1:
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); variableType();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); match(T__9);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(96); match(T__8);
					setState(97); match(T__4);
					}
					}
					setState(102);
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
		public ClassUnitContext classUnit() {
			return getRuleContext(ClassUnitContext.class,0);
		}
		public TerminalNode EOF() { return getToken(UmaLangParser.EOF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); classUnit();
			setState(106); match(EOF);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UmaLangParser.ID, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(ID);
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

	public static class ParentClassNameContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ParentClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentClassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterParentClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitParentClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitParentClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentClassNameContext parentClassName() throws RecognitionException {
		ParentClassNameContext _localctx = new ParentClassNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parentClassName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(T__7);
			setState(111); className();
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

	public static class ClassUnitContext extends ParserRuleContext {
		public List<ParentClassNameContext> parentClassName() {
			return getRuleContexts(ParentClassNameContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParentClassNameContext parentClassName(int i) {
			return getRuleContext(ParentClassNameContext.class,i);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterClassUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitClassUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitClassUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassUnitContext classUnit() throws RecognitionException {
		ClassUnitContext _localctx = new ClassUnitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(T__11);
			setState(114); className();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(115); parentClassName();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121); match(T__10);
			setState(122); block();
			setState(123); match(T__5);
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

	public static class BlockContext extends ParserRuleContext {
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__6) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << PRINT))) != 0)) {
				{
				setState(127);
				switch (_input.LA(1)) {
				case T__15:
				case T__14:
				case T__13:
				case T__12:
				case T__6:
				case T__3:
				case T__2:
				case T__1:
				case T__0:
					{
					setState(125); variable();
					}
					break;
				case PRINT:
					{
					setState(126); print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 14, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); variableType();
			setState(133); match(ID);
			setState(134); match(EQUALS);
			setState(135); value();
			setState(136); match(SEMICOLON);
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
		enterRule(_localctx, 16, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(PRINT);
			setState(139); match(ID);
			setState(140); match(SEMICOLON);
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
		enterRule(_localctx, 18, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0093\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\7\2\"\n\2\f"+
		"\2\16\2%\13\2\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\2\7\2\62\n"+
		"\2\f\2\16\2\65\13\2\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\2\7"+
		"\2B\n\2\f\2\16\2E\13\2\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\2"+
		"\7\2R\n\2\f\2\16\2U\13\2\3\2\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\5\2_\n\2"+
		"\3\3\3\3\3\3\3\3\7\3e\n\3\f\3\16\3h\13\3\5\3j\n\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\7\b\u0082\n\b\f\b\16\b\u0085\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\26\27\u009e"+
		"\2^\3\2\2\2\4i\3\2\2\2\6k\3\2\2\2\bn\3\2\2\2\np\3\2\2\2\fs\3\2\2\2\16"+
		"\u0083\3\2\2\2\20\u0086\3\2\2\2\22\u008c\3\2\2\2\24\u0090\3\2\2\2\26\33"+
		"\7\4\2\2\27\30\7\n\2\2\30\32\7\16\2\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31"+
		"\3\2\2\2\33\34\3\2\2\2\34_\3\2\2\2\35\33\3\2\2\2\36#\7\20\2\2\37 \7\n"+
		"\2\2 \"\7\16\2\2!\37\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$_\3\2\2\2"+
		"%#\3\2\2\2&+\7\3\2\2\'(\7\n\2\2(*\7\16\2\2)\'\3\2\2\2*-\3\2\2\2+)\3\2"+
		"\2\2+,\3\2\2\2,_\3\2\2\2-+\3\2\2\2.\63\7\f\2\2/\60\7\n\2\2\60\62\7\16"+
		"\2\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64_\3\2\2\2"+
		"\65\63\3\2\2\2\66;\7\17\2\2\678\7\n\2\28:\7\16\2\29\67\3\2\2\2:=\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<_\3\2\2\2=;\3\2\2\2>C\7\22\2\2?@\7\n\2\2@B\7\16"+
		"\2\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D_\3\2\2\2EC\3\2\2\2FK\7\5"+
		"\2\2GH\7\n\2\2HJ\7\16\2\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L_\3"+
		"\2\2\2MK\3\2\2\2NS\7\6\2\2OP\7\n\2\2PR\7\16\2\2QO\3\2\2\2RU\3\2\2\2SQ"+
		"\3\2\2\2ST\3\2\2\2T_\3\2\2\2US\3\2\2\2V[\7\21\2\2WX\7\n\2\2XZ\7\16\2\2"+
		"YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^\26\3\2"+
		"\2\2^\36\3\2\2\2^&\3\2\2\2^.\3\2\2\2^\66\3\2\2\2^>\3\2\2\2^F\3\2\2\2^"+
		"N\3\2\2\2^V\3\2\2\2_\3\3\2\2\2`j\5\2\2\2af\7\t\2\2bc\7\n\2\2ce\7\16\2"+
		"\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2i`\3\2\2"+
		"\2ia\3\2\2\2j\5\3\2\2\2kl\5\f\7\2lm\7\2\2\3m\7\3\2\2\2no\7\30\2\2o\t\3"+
		"\2\2\2pq\7\13\2\2qr\5\b\5\2r\13\3\2\2\2st\7\7\2\2tx\5\b\5\2uw\5\n\6\2"+
		"vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\b\2\2"+
		"|}\5\16\b\2}~\7\r\2\2~\r\3\2\2\2\177\u0082\5\20\t\2\u0080\u0082\5\22\n"+
		"\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\17\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0087\5\2\2\2\u0087\u0088\7\30\2\2\u0088\u0089\7\25\2\2\u0089\u008a\5"+
		"\24\13\2\u008a\u008b\7\23\2\2\u008b\21\3\2\2\2\u008c\u008d\7\24\2\2\u008d"+
		"\u008e\7\30\2\2\u008e\u008f\7\23\2\2\u008f\23\3\2\2\2\u0090\u0091\t\2"+
		"\2\2\u0091\25\3\2\2\2\21\33#+\63;CKS[^fix\u0081\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}