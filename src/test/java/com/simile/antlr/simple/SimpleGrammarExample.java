package com.simile.antlr.simple;

import com.simile.antlr.simple.grammar.SimpleLexer;
import com.simile.antlr.simple.grammar.SimpleParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

/**
 * @Author yitao
 * @Created 2021/09/01
 */
public class SimpleGrammarExample {

	@Test
	public void test() {
		String content = "var a;";
		//将输入转成antlr的input流
		ANTLRInputStream input = new ANTLRInputStream(content);
		//词法分析
		SimpleLexer lexer = new SimpleLexer(input);
		//转成token流
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// 语法分析
		SimpleParser parser = new SimpleParser(tokens);
		//获取某一个规则树，这里获取的是最外层的规则，也可以通过sql()获取sql规则树......
		SimpleParser.Field_defContext tree = parser.field_def();
		//打印规则数
		System.out.println(tree.toStringTree(parser));
	}
}
