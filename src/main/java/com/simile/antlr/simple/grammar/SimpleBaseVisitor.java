// Generated from /Users/haizhi/Documents/workspace/work/plan-antlr/src/main/resources/antlr/Simple.g4 by ANTLR 4.9.1
package com.simile.antlr.simple.grammar;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link SimpleVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class SimpleBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements SimpleVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitField_def(SimpleParser.Field_defContext ctx) { return visitChildren(ctx); }
}