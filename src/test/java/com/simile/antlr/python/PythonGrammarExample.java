package com.simile.antlr.python;

import java.io.File;
import java.io.IOException;

import com.simile.antlr.python.grammar.Python3Parser;
import org.junit.Test;

/**
 * @Author yitao
 * @Created 2021/09/01
 */
public class PythonGrammarExample {

	@Test
	public void test() throws IOException {
		ParserFacade parserFacade = new ParserFacade();
		AstPrinter astPrinter = new AstPrinter();
		File file = new File("examples/python/simple.py");
		Python3Parser.File_inputContext context = parserFacade.parse(file);
		astPrinter.print(context);
	}
}
