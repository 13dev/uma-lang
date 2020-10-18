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
		RULE_variableType = 0, RULE_primitiveType = 1, RULE_classBody = 2, RULE_function = 3, 
		RULE_functionName = 4, RULE_functionDeclaration = 5, RULE_functionDefaultParamValue = 6, 
		RULE_functionArgument = 7, RULE_functionType = 8, RULE_functionCall = 9, 
		RULE_classType = 10, RULE_className = 11, RULE_parentClassName = 12, RULE_classUnit = 13, 
		RULE_expressionList = 14, RULE_blockStatement = 15, RULE_compilationUnit = 16, 
		RULE_block = 17, RULE_expression = 18, RULE_variableReference = 19, RULE_variable = 20, 
		RULE_print = 21, RULE_value = 22;
	public static final String[] ruleNames = {
		"variableType", "primitiveType", "classBody", "function", "functionName", 
		"functionDeclaration", "functionDefaultParamValue", "functionArgument", 
		"functionType", "functionCall", "classType", "className", "parentClassName", 
		"classUnit", "expressionList", "blockStatement", "compilationUnit", "block", 
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
			setState(119);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(46); match(T__17);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(47); match(T__11);
					setState(48); match(T__7);
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); match(T__5);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(55); match(T__11);
					setState(56); match(T__7);
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(62); match(T__18);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(63); match(T__11);
					setState(64); match(T__7);
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(70); match(T__9);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(71); match(T__11);
					setState(72); match(T__7);
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(78); match(T__6);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(79); match(T__11);
					setState(80); match(T__7);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 6);
				{
				setState(86); match(T__3);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(87); match(T__11);
					setState(88); match(T__7);
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 7);
				{
				setState(94); match(T__16);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(95); match(T__11);
					setState(96); match(T__7);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 8);
				{
				setState(102); match(T__15);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(103); match(T__11);
					setState(104); match(T__7);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 9);
				{
				setState(110); match(T__4);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(111); match(T__11);
					setState(112); match(T__7);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CLASS_NAME:
				enterOuterAlt(_localctx, 10);
				{
				setState(118); classType();
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
			setState(130);
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
				setState(121); variableType();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); match(T__12);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(123); match(T__11);
					setState(124); match(T__7);
					}
					}
					setState(129);
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
		enterRule(_localctx, 4, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__12) | (1L << T__9) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << CLASS_NAME))) != 0)) {
				{
				{
				setState(132); function();
				}
				}
				setState(137);
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
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); functionDeclaration();
			setState(139); match(T__13);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__9) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << CLASS_NAME) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(140); blockStatement();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146); match(T__8);
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
		enterRule(_localctx, 8, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(ID);
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
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
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
		enterRule(_localctx, 10, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); functionType();
			setState(151); functionName();
			setState(152); match(T__2);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__9) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << CLASS_NAME))) != 0)) {
				{
				{
				setState(153); functionArgument();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(159); match(T__0);
				setState(160); functionArgument();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166); match(T__1);
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
		enterRule(_localctx, 12, RULE_functionDefaultParamValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(EQUALS);
			setState(169); expression();
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
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
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
		enterRule(_localctx, 14, RULE_functionArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); variableType();
			setState(172); match(ID);
			setState(174);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(173); functionDefaultParamValue();
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UmaLangListener ) ((UmaLangListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UmaLangVisitor ) return ((UmaLangVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionType);
		try {
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176); primitiveType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); classType();
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
		enterRule(_localctx, 18, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); functionName();
			setState(181); match(T__2);
			setState(182); expressionList();
			setState(183); match(T__1);
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
			setState(185); match(CLASS_NAME);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(186); match(T__11);
				setState(187); match(T__7);
				}
				}
				setState(192);
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
			setState(193); match(ID);
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
			setState(195); match(T__10);
			setState(196); className();
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
		enterRule(_localctx, 26, RULE_classUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); match(T__14);
			setState(199); className();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(200); parentClassName();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206); match(T__13);
			setState(207); block();
			setState(208); match(T__8);
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
		enterRule(_localctx, 28, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(210); expression();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(216); match(T__0);
				setState(217); expression();
				}
				}
				setState(222);
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
		enterRule(_localctx, 30, RULE_blockStatement);
		try {
			setState(226);
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
				setState(223); variable();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(224); print();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(225); functionCall();
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
		enterRule(_localctx, 32, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); classUnit();
			setState(229); match(EOF);
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
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__9) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << CLASS_NAME) | (1L << PRINT))) != 0)) {
				{
				setState(233);
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
					setState(231); variable();
					}
					break;
				case PRINT:
					{
					setState(232); print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(237);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 36, RULE_expression);
		try {
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238); variableReference();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); value();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240); functionCall();
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
		enterRule(_localctx, 38, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(ID);
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
		enterRule(_localctx, 40, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); variableType();
			setState(246); match(ID);
			setState(247); match(EQUALS);
			setState(248); value();
			setState(249); match(SEMICOLON);
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
		enterRule(_localctx, 42, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); match(PRINT);
			setState(252); match(ID);
			setState(253); match(SEMICOLON);
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
		enterRule(_localctx, 44, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u0104\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2"+
		"\3\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3"+
		"\2\3\2\3\2\7\2T\n\2\f\2\16\2W\13\2\3\2\3\2\3\2\7\2\\\n\2\f\2\16\2_\13"+
		"\2\3\2\3\2\3\2\7\2d\n\2\f\2\16\2g\13\2\3\2\3\2\3\2\7\2l\n\2\f\2\16\2o"+
		"\13\2\3\2\3\2\3\2\7\2t\n\2\f\2\16\2w\13\2\3\2\5\2z\n\2\3\3\3\3\3\3\3\3"+
		"\7\3\u0080\n\3\f\3\16\3\u0083\13\3\5\3\u0085\n\3\3\4\7\4\u0088\n\4\f\4"+
		"\16\4\u008b\13\4\3\5\3\5\3\5\7\5\u0090\n\5\f\5\16\5\u0093\13\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u009d\n\7\f\7\16\7\u00a0\13\7\3\7\3\7\7\7"+
		"\u00a4\n\7\f\7\16\7\u00a7\13\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u00b1"+
		"\n\t\3\n\3\n\5\n\u00b5\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00bf"+
		"\n\f\f\f\16\f\u00c2\13\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00cc"+
		"\n\17\f\17\16\17\u00cf\13\17\3\17\3\17\3\17\3\17\3\20\7\20\u00d6\n\20"+
		"\f\20\16\20\u00d9\13\20\3\20\3\20\7\20\u00dd\n\20\f\20\16\20\u00e0\13"+
		"\20\3\21\3\21\3\21\5\21\u00e5\n\21\3\22\3\22\3\22\3\23\3\23\7\23\u00ec"+
		"\n\23\f\23\16\23\u00ef\13\23\3\24\3\24\3\24\5\24\u00f4\n\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\2\2"+
		"\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2\32\33\u0110"+
		"\2y\3\2\2\2\4\u0084\3\2\2\2\6\u0089\3\2\2\2\b\u008c\3\2\2\2\n\u0096\3"+
		"\2\2\2\f\u0098\3\2\2\2\16\u00aa\3\2\2\2\20\u00ad\3\2\2\2\22\u00b4\3\2"+
		"\2\2\24\u00b6\3\2\2\2\26\u00bb\3\2\2\2\30\u00c3\3\2\2\2\32\u00c5\3\2\2"+
		"\2\34\u00c8\3\2\2\2\36\u00d7\3\2\2\2 \u00e4\3\2\2\2\"\u00e6\3\2\2\2$\u00ed"+
		"\3\2\2\2&\u00f3\3\2\2\2(\u00f5\3\2\2\2*\u00f7\3\2\2\2,\u00fd\3\2\2\2."+
		"\u0101\3\2\2\2\60\65\7\4\2\2\61\62\7\n\2\2\62\64\7\16\2\2\63\61\3\2\2"+
		"\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66z\3\2\2\2\67\65\3\2\2\2"+
		"8=\7\20\2\29:\7\n\2\2:<\7\16\2\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2"+
		"\2>z\3\2\2\2?=\3\2\2\2@E\7\3\2\2AB\7\n\2\2BD\7\16\2\2CA\3\2\2\2DG\3\2"+
		"\2\2EC\3\2\2\2EF\3\2\2\2Fz\3\2\2\2GE\3\2\2\2HM\7\f\2\2IJ\7\n\2\2JL\7\16"+
		"\2\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2Nz\3\2\2\2OM\3\2\2\2PU\7\17"+
		"\2\2QR\7\n\2\2RT\7\16\2\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2Vz\3"+
		"\2\2\2WU\3\2\2\2X]\7\22\2\2YZ\7\n\2\2Z\\\7\16\2\2[Y\3\2\2\2\\_\3\2\2\2"+
		"][\3\2\2\2]^\3\2\2\2^z\3\2\2\2_]\3\2\2\2`e\7\5\2\2ab\7\n\2\2bd\7\16\2"+
		"\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fz\3\2\2\2ge\3\2\2\2hm\7\6\2"+
		"\2ij\7\n\2\2jl\7\16\2\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nz\3\2"+
		"\2\2om\3\2\2\2pu\7\21\2\2qr\7\n\2\2rt\7\16\2\2sq\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2vz\3\2\2\2wu\3\2\2\2xz\5\26\f\2y\60\3\2\2\2y8\3\2\2\2"+
		"y@\3\2\2\2yH\3\2\2\2yP\3\2\2\2yX\3\2\2\2y`\3\2\2\2yh\3\2\2\2yp\3\2\2\2"+
		"yx\3\2\2\2z\3\3\2\2\2{\u0085\5\2\2\2|\u0081\7\t\2\2}~\7\n\2\2~\u0080\7"+
		"\16\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084{\3\2\2\2\u0084"+
		"|\3\2\2\2\u0085\5\3\2\2\2\u0086\u0088\5\b\5\2\u0087\u0086\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\7\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008c\u008d\5\f\7\2\u008d\u0091\7\b\2\2\u008e\u0090"+
		"\5 \21\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\r"+
		"\2\2\u0095\t\3\2\2\2\u0096\u0097\7\34\2\2\u0097\13\3\2\2\2\u0098\u0099"+
		"\5\22\n\2\u0099\u009a\5\n\6\2\u009a\u009e\7\23\2\2\u009b\u009d\5\20\t"+
		"\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a5\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\25\2\2"+
		"\u00a2\u00a4\5\20\t\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7\24\2\2\u00a9\r\3\2\2\2\u00aa\u00ab\7\31\2\2\u00ab\u00ac\5&\24"+
		"\2\u00ac\17\3\2\2\2\u00ad\u00ae\5\2\2\2\u00ae\u00b0\7\34\2\2\u00af\u00b1"+
		"\5\16\b\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\21\3\2\2\2\u00b2"+
		"\u00b5\5\4\3\2\u00b3\u00b5\5\26\f\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3"+
		"\2\2\2\u00b5\23\3\2\2\2\u00b6\u00b7\5\n\6\2\u00b7\u00b8\7\23\2\2\u00b8"+
		"\u00b9\5\36\20\2\u00b9\u00ba\7\24\2\2\u00ba\25\3\2\2\2\u00bb\u00c0\7\26"+
		"\2\2\u00bc\u00bd\7\n\2\2\u00bd\u00bf\7\16\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\27\3\2\2"+
		"\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\34\2\2\u00c4\31\3\2\2\2\u00c5\u00c6"+
		"\7\13\2\2\u00c6\u00c7\5\30\r\2\u00c7\33\3\2\2\2\u00c8\u00c9\7\7\2\2\u00c9"+
		"\u00cd\5\30\r\2\u00ca\u00cc\5\32\16\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d1\7\b\2\2\u00d1\u00d2\5$\23\2\u00d2\u00d3\7\r"+
		"\2\2\u00d3\35\3\2\2\2\u00d4\u00d6\5&\24\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00de\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\7\25\2\2\u00db\u00dd\5&\24\2\u00dc\u00da\3"+
		"\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\37\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e5\5*\26\2\u00e2\u00e5\5,\27"+
		"\2\u00e3\u00e5\5\24\13\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5!\3\2\2\2\u00e6\u00e7\5\34\17\2\u00e7\u00e8\7\2\2"+
		"\3\u00e8#\3\2\2\2\u00e9\u00ec\5*\26\2\u00ea\u00ec\5,\27\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee%\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f4\5(\25\2"+
		"\u00f1\u00f4\5.\30\2\u00f2\u00f4\5\24\13\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\'\3\2\2\2\u00f5\u00f6\7\34\2\2\u00f6"+
		")\3\2\2\2\u00f7\u00f8\5\2\2\2\u00f8\u00f9\7\34\2\2\u00f9\u00fa\7\31\2"+
		"\2\u00fa\u00fb\5.\30\2\u00fb\u00fc\7\27\2\2\u00fc+\3\2\2\2\u00fd\u00fe"+
		"\7\30\2\2\u00fe\u00ff\7\34\2\2\u00ff\u0100\7\27\2\2\u0100-\3\2\2\2\u0101"+
		"\u0102\t\2\2\2\u0102/\3\2\2\2\34\65=EMU]emuy\u0081\u0084\u0089\u0091\u009e"+
		"\u00a5\u00b0\u00b4\u00c0\u00cd\u00d7\u00de\u00e4\u00eb\u00ed\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}