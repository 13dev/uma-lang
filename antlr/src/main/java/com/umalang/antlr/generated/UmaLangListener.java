// Generated from UmaLang.g4 by ANTLR 4.3
package com.umalang.antlr.generated;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UmaLangParser}.
 */
public interface UmaLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UmaLangParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull UmaLangParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull UmaLangParser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull UmaLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull UmaLangParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(@NotNull UmaLangParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(@NotNull UmaLangParser.FunctionNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#parentClassName}.
	 * @param ctx the parse tree
	 */
	void enterParentClassName(@NotNull UmaLangParser.ParentClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#parentClassName}.
	 * @param ctx the parse tree
	 */
	void exitParentClassName(@NotNull UmaLangParser.ParentClassNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void enterVariableReference(@NotNull UmaLangParser.VariableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#variableReference}.
	 * @param ctx the parse tree
	 */
	void exitVariableReference(@NotNull UmaLangParser.VariableReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(@NotNull UmaLangParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(@NotNull UmaLangParser.ClassNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#classUnit}.
	 * @param ctx the parse tree
	 */
	void enterClassUnit(@NotNull UmaLangParser.ClassUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#classUnit}.
	 * @param ctx the parse tree
	 */
	void exitClassUnit(@NotNull UmaLangParser.ClassUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(@NotNull UmaLangParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(@NotNull UmaLangParser.VariableTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#functionDefaultParamValue}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefaultParamValue(@NotNull UmaLangParser.FunctionDefaultParamValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#functionDefaultParamValue}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefaultParamValue(@NotNull UmaLangParser.FunctionDefaultParamValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull UmaLangParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull UmaLangParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull UmaLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull UmaLangParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull UmaLangParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull UmaLangParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#functionArgument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgument(@NotNull UmaLangParser.FunctionArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#functionArgument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgument(@NotNull UmaLangParser.FunctionArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull UmaLangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull UmaLangParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull UmaLangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull UmaLangParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull UmaLangParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull UmaLangParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull UmaLangParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull UmaLangParser.ClassBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull UmaLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull UmaLangParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(@NotNull UmaLangParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(@NotNull UmaLangParser.FunctionTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull UmaLangParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull UmaLangParser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(@NotNull UmaLangParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(@NotNull UmaLangParser.FunctionDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull UmaLangParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull UmaLangParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link UmaLangParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(@NotNull UmaLangParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(@NotNull UmaLangParser.ClassTypeContext ctx);
}