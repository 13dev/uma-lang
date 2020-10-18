// Generated from UmaLang.g4 by ANTLR 4.3
package com.umalang.antlr.generated;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UmaLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UmaLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UmaLangParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull UmaLangParser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull UmaLangParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(@NotNull UmaLangParser.FunctionNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#parentClassName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentClassName(@NotNull UmaLangParser.ParentClassNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#variableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReference(@NotNull UmaLangParser.VariableReferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(@NotNull UmaLangParser.ClassNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull UmaLangParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull UmaLangParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(@NotNull UmaLangParser.VariableTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#functionDefaultParamValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefaultParamValue(@NotNull UmaLangParser.FunctionDefaultParamValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull UmaLangParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull UmaLangParser.PrintContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#functionCallNoSemi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallNoSemi(@NotNull UmaLangParser.FunctionCallNoSemiContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull UmaLangParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#functionArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgument(@NotNull UmaLangParser.FunctionArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull UmaLangParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull UmaLangParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull UmaLangParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull UmaLangParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull UmaLangParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull UmaLangParser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull UmaLangParser.FunctionDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull UmaLangParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(@NotNull UmaLangParser.ClassTypeContext ctx);
}