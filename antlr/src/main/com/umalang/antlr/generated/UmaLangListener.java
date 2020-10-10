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
	 * Enter a parse tree produced by {@link UmaLangParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull UmaLangParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UmaLangParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull UmaLangParser.PrimitiveTypeContext ctx);
}