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
	 * Visit a parse tree produced by {@link UmaLangParser#classUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassUnit(@NotNull UmaLangParser.ClassUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(@NotNull UmaLangParser.VariableTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull UmaLangParser.PrintContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull UmaLangParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#parentClassName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentClassName(@NotNull UmaLangParser.ParentClassNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull UmaLangParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link UmaLangParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(@NotNull UmaLangParser.ClassNameContext ctx);

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
	 * Visit a parse tree produced by {@link UmaLangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull UmaLangParser.ValueContext ctx);
}