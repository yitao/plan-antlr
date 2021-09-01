// Generated from /Users/haizhi/Documents/workspace/work/plan-antlr/src/main/resources/antlr/Simple.g4 by ANTLR 4.9.1
package com.simile.antlr.simple.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleParser#field_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_def(SimpleParser.Field_defContext ctx);
}