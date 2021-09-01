// Generated from /Users/haizhi/Documents/workspace/work/plan-antlr/src/main/resources/antlr/Simple.g4 by ANTLR 4.9.1
package com.simile.antlr.simple.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#field_def}.
	 * @param ctx the parse tree
	 */
	void enterField_def(SimpleParser.Field_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#field_def}.
	 * @param ctx the parse tree
	 */
	void exitField_def(SimpleParser.Field_defContext ctx);
}