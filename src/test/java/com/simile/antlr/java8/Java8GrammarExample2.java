package com.simile.antlr.java8;

import java.io.IOException;
import java.net.URL;

import com.simile.antlr.hive.v2.HiveGrammarExample;
import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

/**
 * @Author yitao
 * @Created 2022/02/11
 */
public class Java8GrammarExample2 {

    @Test
    public void testFile() throws IOException {
        String content = loadString("java8/SysOrgController.java");
        CodePointCharStream input = CharStreams.fromString(content);
        Java8Lexer lexer = new Java8Lexer(input);

        //转成token流
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Java8Parser parser = new Java8Parser(tokens);
        parser.setErrorHandler(new ANTLRErrorStrategy() {
            @Override
            public void reset(Parser recognizer) {
//                System.out.println(">>> reset");
            }

            @Override
            public Token recoverInline(Parser recognizer) throws RecognitionException {
//                System.out.println(">>> recoverInline");
                return null;
            }

            @Override
            public void recover(Parser recognizer, RecognitionException e) throws RecognitionException {
//                System.out.println(">>> recover");
            }

            @Override
            public void sync(Parser recognizer) throws RecognitionException {
//                System.out.println(">>> sync");
            }

            @Override
            public boolean inErrorRecoveryMode(Parser recognizer) {
//                System.out.println(">>> inErrorRecoveryMode");
                return false;
            }

            @Override
            public void reportMatch(Parser recognizer) {
//                System.out.println(">>> reportMatch:"+recognizer.getCurrentToken());
            }

            @Override
            public void reportError(Parser recognizer, RecognitionException e) {
                System.out.println(">>> reportError");
//                throw e;
            }
        });

        Java8Parser.CompilationUnitContext tree = parser.compilationUnit();

        ParserVisitor visitor  = new ParserVisitor();
        visitor.visit(tree);

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

    static class ParserVisitor extends Java8ParserBaseVisitor {

    }

}
