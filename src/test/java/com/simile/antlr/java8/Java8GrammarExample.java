package com.simile.antlr.java8;

import java.io.IOException;
import java.net.URL;

import com.simile.antlr.hive.v2.HiveGrammarExample;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

/**
 * @Author yitao
 * @Created 2022/02/11
 */
public class Java8GrammarExample {

    @Test
    public void testFile() throws IOException {
        String content = loadString("java8/SysOrgController.java");
        CodePointCharStream input = CharStreams.fromString(content);
        Java8Lexer lexer = new Java8Lexer(input);

        //转成token流
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Java8Parser parser = new Java8Parser(tokens);

        Java8Parser.CompilationUnitContext tree = parser.compilationUnit();


        ParserListener extractor = new ParserListener();
        ParseTreeWalker.DEFAULT.walk(extractor, tree); // initiate walk of tree with listener in use of default walker

        System.out.println("getNumberOfSyntaxErrors=" + parser.getNumberOfSyntaxErrors());
    }


    public String loadString(String classpath) {
        URL url = HiveGrammarExample.class.getClassLoader().getResource(classpath);
        try {
            return IOUtils.toString(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static class ParserListener extends Java8ParserBaseListener {

        @Override
        public void enterPackageDeclaration(Java8Parser.PackageDeclarationContext ctx) {
            for (int i = 0; i < ctx.getChildCount(); i++) {
                System.out.println(ctx.getChild(i).getText());
            }
            System.out.println("pkge:"+ctx.getText());
            super.enterPackageDeclaration(ctx);
        }

        @Override
        public void enterClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
            for (int i = 0; i < ctx.getChildCount(); i++) {
                System.out.println(ctx.getChild(i).getText());
            }
            System.out.println("class:"+ctx.getText());
            super.enterClassDeclaration(ctx);
        }

        @Override
        public void enterAnnotation(Java8Parser.AnnotationContext ctx) {
            System.out.println("anno:"+ctx.getText());
            super.enterAnnotation(ctx);
        }


    }

}
