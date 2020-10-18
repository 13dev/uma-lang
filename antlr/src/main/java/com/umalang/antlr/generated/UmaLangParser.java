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
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, CLASS_NAME=20, SEMICOLON=21, PRINT=22, EQUALS=23, 
		NUMBER=24, STRING=25, ID=26, WS=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'char'", "'boolean'", "'long'", "'float'", "'class'", "'{'", 
		"'void'", "'['", "'<'", "'byte'", "'}'", "']'", "'short'", "'string'", 
		"'double'", "'int'", "'('", "')'", "','", "CLASS_NAME", "';'", "'print'", 
		"'='", "NUMBER", "STRING", "ID", "WS"
	};
	public static final int
		RULE_variableType = 0, RULE_primitiveType = 1, RULE_function = 2, RULE_functionName = 3, 
		RULE_functionDeclaration = 4, RULE_functionDefaultParamValue = 5, RULE_functionArgument = 6, 
		RULE_type = 7, RULE_functionCall = 8, RULE_functionCallNoSemi = 9, RULE_classType = 10, 
		RULE_className = 11, RULE_parentClassName = 12, RULE_classDeclaration = 13, 
		RULE_classBody = 14, RULE_expressionList = 15, RULE_blockStatement = 16, 
		RULE_compilationUnit = 17, RULE_block = 18, RULE_expression = 19, RULE_variableReference = 20, 
		RULE_variable = 21, RULE_print = 22, RULE_value = 23;
	public static final String[] ruleNames = {
		"variableType", "primitiveType", "function", "functionName", "functionDeclaration", 
		"functionDefaultParamValue", "functionArgument", "type", "functionCall", 
		"functionCallNoSemi", "classType", "className", "parentClassName", "classDeclaration", 
		"classBody", "expressionList", "blockStatement", "compilationUnit", "block", 
		"expression", "variableReference", "variable", "print", "value"
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
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
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
			setState(121);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); match(T__17);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(49); match(T__11);
					setState(50); match(T__7);
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); match(T__5);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(57); match(T__11);
					setState(58); match(T__7);
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(64); match(T__18);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(65); match(T__11);
					setState(66); match(T__7);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(72); match(T__9);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(73); match(T__11);
					setState(74); match(T__7);
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(80); match(T__6);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(81); match(T__11);
					setState(82); match(T__7);
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 6);
				{
				setState(88); match(T__3);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(89); match(T__11);
					setState(90); match(T__7);
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 7);
				{
				setState(96); match(T__16);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(97); match(T__11);
					setState(98); match(T__7);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 8);
				{
				setState(104); match(T__15);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(105); match(T__11);
					setState(106); match(T__7);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 9);
				{
				setState(112); match(T__4);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(113); match(T__11);
					setState(114); match(T__7);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CLASS_NAME:
				enterOuterAlt(_localctx, 10);
				{
				setState(120); classType();
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
			setState(132);
			switch (_input.LA(1)) {
			case T__18:
			case T__17:
			case T__16:
			case T__15:
			case T__9:
			case T__6:
			case T__5:
			case T__4:
			case T__3:
			case CLASS_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); variableType();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); match(T__12);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(125); match(T__11);
					setState(126); match(T__7);
					}
					}
					setState(131);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); functionDeclaration();
			setState(135); match(T__13);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__9) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << CLASS_NAME) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(136); blockStatement();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142); match(T__8);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UmaLangParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(ID);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<FunctionArgumentContext> functionArgument() {
			return getRuleContexts(FunctionArgumentContext.class);
		}
		public FunctionArgumentContext functionArgument(int i) {
			return getRuleContext(FunctionArgumentContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__12) | (1L << T__9) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << CLASS_NAME))) != 0)) {
				{
				setState(146); type();
				}
			}

			setState(149); functionName();
			setState(150); match(T__2);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__12) | (1L << T__9) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << CLASS_NAME))) != 0)) {
				{
				{
				setState(151); functionArgument();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(157); match(T__0);
				setState(158); functionArgument();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164); match(T__1);
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

	public static class FunctionDefaultParamValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionDefaultParamValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefaultParamValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterFunctionDefaultParamValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitFunctionDefaultParamValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitFunctionDefaultParamValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefaultParamValueContext functionDefaultParamValue() throws RecognitionException {
		FunctionDefaultParamValueContext _localctx = new FunctionDefaultParamValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDefaultParamValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(EQUALS);
			setState(167); expression();
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

	public static class FunctionArgumentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UmaLangParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionDefaultParamValueContext functionDefaultParamValue() {
			return getRuleContext(FunctionDefaultParamValueContext.class,0);
		}
		public FunctionArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterFunctionArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitFunctionArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitFunctionArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentContext functionArgument() throws RecognitionException {
		FunctionArgumentContext _localctx = new FunctionArgumentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); type();
			setState(170); match(ID);
			setState(172);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(171); functionDefaultParamValue();
				}
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174); primitiveType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175); classType();
				}
				break;
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UmaLangParser.SEMICOLON, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); functionName();
			setState(179); match(T__2);
			setState(180); expressionList();
			setState(181); match(T__1);
			setState(182); match(SEMICOLON);
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

	public static class FunctionCallNoSemiContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallNoSemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallNoSemi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterFunctionCallNoSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitFunctionCallNoSemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitFunctionCallNoSemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallNoSemiContext functionCallNoSemi() throws RecognitionException {
		FunctionCallNoSemiContext _localctx = new FunctionCallNoSemiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCallNoSemi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); functionName();
			setState(185); match(T__2);
			setState(186); expressionList();
			setState(187); match(T__1);
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

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode CLASS_NAME() { return getToken(UmaLangParser.CLASS_NAME, 0); }
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(CLASS_NAME);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(190); match(T__11);
				setState(191); match(T__7);
				}
				}
				setState(196);
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
		enterRule(_localctx, 22, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(ID);
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
		enterRule(_localctx, 24, RULE_parentClassName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(T__10);
			setState(200); className();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<ParentClassNameContext> parentClassName() {
			return getRuleContexts(ParentClassNameContext.class);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ParentClassNameContext parentClassName(int i) {
			return getRuleContext(ParentClassNameContext.class,i);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(T__14);
			setState(203); className();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(204); parentClassName();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210); match(T__13);
			setState(211); classBody();
			setState(212); match(T__8);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__12) | (1L << T__9) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << CLASS_NAME) | (1L << ID))) != 0)) {
				{
				{
				setState(214); function();
				}
				}
				setState(219);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(220); expression();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(226); match(T__0);
				setState(227); expression();
				}
				}
				setState(232);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blockStatement);
		try {
			setState(236);
			switch (_input.LA(1)) {
			case T__18:
			case T__17:
			case T__16:
			case T__15:
			case T__9:
			case T__6:
			case T__5:
			case T__4:
			case T__3:
			case CLASS_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); variable();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(234); print();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(235); functionCall();
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
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
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
		enterRule(_localctx, 34, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); classDeclaration();
			setState(239); match(EOF);
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
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__9) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << CLASS_NAME) | (1L << PRINT))) != 0)) {
				{
				setState(243);
				switch (_input.LA(1)) {
				case T__18:
				case T__17:
				case T__16:
				case T__15:
				case T__9:
				case T__6:
				case T__5:
				case T__4:
				case T__3:
				case CLASS_NAME:
					{
					setState(241); variable();
					}
					break;
				case PRINT:
					{
					setState(242); print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(247);
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

	public static class ExpressionContext extends ParserRuleContext {
		public FunctionCallNoSemiContext functionCallNoSemi() {
			return getRuleContext(FunctionCallNoSemiContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			setState(251);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); variableReference();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249); value();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250); functionCallNoSemi();
				}
				break;
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

	public static class VariableReferenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UmaLangParser.ID, 0); }
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); match(ID);
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
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 42, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); variableType();
			setState(256); match(ID);
			setState(257); match(EQUALS);
			setState(258); expression();
			setState(259); match(SEMICOLON);
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
		public TerminalNode SEMICOLON() { return getToken(UmaLangParser.SEMICOLON, 0); }
		public TerminalNode PRINT() { return getToken(UmaLangParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(PRINT);
			setState(262); expression();
			setState(263); match(SEMICOLON);
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
		enterRule(_localctx, 46, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u010e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\2\7\2>\n\2\f\2\16\2A"+
		"\13\2\3\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\2\7\2N\n\2\f\2\16"+
		"\2Q\13\2\3\2\3\2\3\2\7\2V\n\2\f\2\16\2Y\13\2\3\2\3\2\3\2\7\2^\n\2\f\2"+
		"\16\2a\13\2\3\2\3\2\3\2\7\2f\n\2\f\2\16\2i\13\2\3\2\3\2\3\2\7\2n\n\2\f"+
		"\2\16\2q\13\2\3\2\3\2\3\2\7\2v\n\2\f\2\16\2y\13\2\3\2\5\2|\n\2\3\3\3\3"+
		"\3\3\3\3\7\3\u0082\n\3\f\3\16\3\u0085\13\3\5\3\u0087\n\3\3\4\3\4\3\4\7"+
		"\4\u008c\n\4\f\4\16\4\u008f\13\4\3\4\3\4\3\5\3\5\3\6\5\6\u0096\n\6\3\6"+
		"\3\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3\6\3\6\7\6\u00a2\n\6\f\6\16"+
		"\6\u00a5\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u00af\n\b\3\t\3\t\5"+
		"\t\u00b3\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\7\f\u00c3\n\f\f\f\16\f\u00c6\13\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\7\17\u00d0\n\17\f\17\16\17\u00d3\13\17\3\17\3\17\3\17\3\17\3\20"+
		"\7\20\u00da\n\20\f\20\16\20\u00dd\13\20\3\21\7\21\u00e0\n\21\f\21\16\21"+
		"\u00e3\13\21\3\21\3\21\7\21\u00e7\n\21\f\21\16\21\u00ea\13\21\3\22\3\22"+
		"\3\22\5\22\u00ef\n\22\3\23\3\23\3\23\3\24\3\24\7\24\u00f6\n\24\f\24\16"+
		"\24\u00f9\13\24\3\25\3\25\3\25\5\25\u00fe\n\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\3\3\2\32\33\u011a\2{\3\2\2\2"+
		"\4\u0086\3\2\2\2\6\u0088\3\2\2\2\b\u0092\3\2\2\2\n\u0095\3\2\2\2\f\u00a8"+
		"\3\2\2\2\16\u00ab\3\2\2\2\20\u00b2\3\2\2\2\22\u00b4\3\2\2\2\24\u00ba\3"+
		"\2\2\2\26\u00bf\3\2\2\2\30\u00c7\3\2\2\2\32\u00c9\3\2\2\2\34\u00cc\3\2"+
		"\2\2\36\u00db\3\2\2\2 \u00e1\3\2\2\2\"\u00ee\3\2\2\2$\u00f0\3\2\2\2&\u00f7"+
		"\3\2\2\2(\u00fd\3\2\2\2*\u00ff\3\2\2\2,\u0101\3\2\2\2.\u0107\3\2\2\2\60"+
		"\u010b\3\2\2\2\62\67\7\4\2\2\63\64\7\n\2\2\64\66\7\16\2\2\65\63\3\2\2"+
		"\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28|\3\2\2\29\67\3\2\2\2:?\7\20"+
		"\2\2;<\7\n\2\2<>\7\16\2\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@|\3"+
		"\2\2\2A?\3\2\2\2BG\7\3\2\2CD\7\n\2\2DF\7\16\2\2EC\3\2\2\2FI\3\2\2\2GE"+
		"\3\2\2\2GH\3\2\2\2H|\3\2\2\2IG\3\2\2\2JO\7\f\2\2KL\7\n\2\2LN\7\16\2\2"+
		"MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P|\3\2\2\2QO\3\2\2\2RW\7\17\2"+
		"\2ST\7\n\2\2TV\7\16\2\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X|\3\2"+
		"\2\2YW\3\2\2\2Z_\7\22\2\2[\\\7\n\2\2\\^\7\16\2\2][\3\2\2\2^a\3\2\2\2_"+
		"]\3\2\2\2_`\3\2\2\2`|\3\2\2\2a_\3\2\2\2bg\7\5\2\2cd\7\n\2\2df\7\16\2\2"+
		"ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h|\3\2\2\2ig\3\2\2\2jo\7\6\2\2"+
		"kl\7\n\2\2ln\7\16\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p|\3\2\2"+
		"\2qo\3\2\2\2rw\7\21\2\2st\7\n\2\2tv\7\16\2\2us\3\2\2\2vy\3\2\2\2wu\3\2"+
		"\2\2wx\3\2\2\2x|\3\2\2\2yw\3\2\2\2z|\5\26\f\2{\62\3\2\2\2{:\3\2\2\2{B"+
		"\3\2\2\2{J\3\2\2\2{R\3\2\2\2{Z\3\2\2\2{b\3\2\2\2{j\3\2\2\2{r\3\2\2\2{"+
		"z\3\2\2\2|\3\3\2\2\2}\u0087\5\2\2\2~\u0083\7\t\2\2\177\u0080\7\n\2\2\u0080"+
		"\u0082\7\16\2\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"}\3\2\2\2\u0086~\3\2\2\2\u0087\5\3\2\2\2\u0088\u0089\5\n\6\2\u0089\u008d"+
		"\7\b\2\2\u008a\u008c\5\"\22\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0091\7\r\2\2\u0091\7\3\2\2\2\u0092\u0093\7\34\2\2\u0093"+
		"\t\3\2\2\2\u0094\u0096\5\20\t\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2"+
		"\2\u0096\u0097\3\2\2\2\u0097\u0098\5\b\5\2\u0098\u009c\7\23\2\2\u0099"+
		"\u009b\5\16\b\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a3\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\7\25\2\2\u00a0\u00a2\5\16\b\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a7\7\24\2\2\u00a7\13\3\2\2\2\u00a8\u00a9\7\31"+
		"\2\2\u00a9\u00aa\5(\25\2\u00aa\r\3\2\2\2\u00ab\u00ac\5\20\t\2\u00ac\u00ae"+
		"\7\34\2\2\u00ad\u00af\5\f\7\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2"+
		"\u00af\17\3\2\2\2\u00b0\u00b3\5\4\3\2\u00b1\u00b3\5\26\f\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\21\3\2\2\2\u00b4\u00b5\5\b\5\2\u00b5"+
		"\u00b6\7\23\2\2\u00b6\u00b7\5 \21\2\u00b7\u00b8\7\24\2\2\u00b8\u00b9\7"+
		"\27\2\2\u00b9\23\3\2\2\2\u00ba\u00bb\5\b\5\2\u00bb\u00bc\7\23\2\2\u00bc"+
		"\u00bd\5 \21\2\u00bd\u00be\7\24\2\2\u00be\25\3\2\2\2\u00bf\u00c4\7\26"+
		"\2\2\u00c0\u00c1\7\n\2\2\u00c1\u00c3\7\16\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\27\3\2\2"+
		"\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\34\2\2\u00c8\31\3\2\2\2\u00c9\u00ca"+
		"\7\13\2\2\u00ca\u00cb\5\30\r\2\u00cb\33\3\2\2\2\u00cc\u00cd\7\7\2\2\u00cd"+
		"\u00d1\5\30\r\2\u00ce\u00d0\5\32\16\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d5\7\b\2\2\u00d5\u00d6\5\36\20\2\u00d6\u00d7\7"+
		"\r\2\2\u00d7\35\3\2\2\2\u00d8\u00da\5\6\4\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\37\3\2\2"+
		"\2\u00dd\u00db\3\2\2\2\u00de\u00e0\5(\25\2\u00df\u00de\3\2\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e8\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e5\7\25\2\2\u00e5\u00e7\5(\25\2\u00e6\u00e4\3"+
		"\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"!\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ef\5,\27\2\u00ec\u00ef\5.\30\2"+
		"\u00ed\u00ef\5\22\n\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef#\3\2\2\2\u00f0\u00f1\5\34\17\2\u00f1\u00f2\7\2\2\3\u00f2"+
		"%\3\2\2\2\u00f3\u00f6\5,\27\2\u00f4\u00f6\5.\30\2\u00f5\u00f3\3\2\2\2"+
		"\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\'\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fe\5*\26\2\u00fb"+
		"\u00fe\5\60\31\2\u00fc\u00fe\5\24\13\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe)\3\2\2\2\u00ff\u0100\7\34\2\2\u0100"+
		"+\3\2\2\2\u0101\u0102\5\2\2\2\u0102\u0103\7\34\2\2\u0103\u0104\7\31\2"+
		"\2\u0104\u0105\5(\25\2\u0105\u0106\7\27\2\2\u0106-\3\2\2\2\u0107\u0108"+
		"\7\30\2\2\u0108\u0109\5(\25\2\u0109\u010a\7\27\2\2\u010a/\3\2\2\2\u010b"+
		"\u010c\t\2\2\2\u010c\61\3\2\2\2\35\67?GOW_gow{\u0083\u0086\u008d\u0095"+
		"\u009c\u00a3\u00ae\u00b2\u00c4\u00d1\u00db\u00e1\u00e8\u00ee\u00f5\u00f7"+
		"\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}