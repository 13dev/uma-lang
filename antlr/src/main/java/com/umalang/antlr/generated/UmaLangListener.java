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
	 * Enter a parse tree produced by {@link UmaLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull UmaLangParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull UmaLangParser.ValueContext ctx);
}