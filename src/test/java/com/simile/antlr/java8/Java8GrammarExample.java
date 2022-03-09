package com.simile.antlr.java8;

import java.io.IOException;
import java.net.URL;
import java.util.BitSet;

import com.simile.antlr.hive.v2.HiveGrammarExample;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
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
        parser.addErrorListener(new ANTLRErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.out.println("syntaxError>>>>> ");
                if(offendingSymbol instanceof CommonToken){
                    CommonToken commonToken = (CommonToken) offendingSymbol;
                    if(commonToken.getType() == Java8Lexer.COMMENT){
                        System.out.println("comment: "+commonToken.getText());
                    }
                    if(commonToken.getType() == Java8Lexer.LINE_COMMENT){
                        System.out.println("line comment: "+commonToken.getText());
                    }
                }

            }

            @Override
            public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
            }

            @Override
            public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
            }

            @Override
            public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
            }
        });
//        parser.setErrorHandler(new ANTLRErrorStrategy() {
//            @Override
//            public void reset(Parser recognizer) {
////                System.out.println(">>> reset");
//            }
//
//            @Override
//            public Token recoverInline(Parser recognizer) throws RecognitionException {
////                System.out.println(">>> recoverInline");
//                return recognizer.getCurrentToken();
//            }
//
//            @Override
//            public void recover(Parser recognizer, RecognitionException e) throws RecognitionException {
//                System.out.println(">>> recover");
//            }
//
//            @Override
//            public void sync(Parser recognizer) throws RecognitionException {
//                System.out.println(">>> sync");
//            }
//
//            @Override
//            public boolean inErrorRecoveryMode(Parser recognizer) {
//                System.out.println(">>> inErrorRecoveryMode");
//                return false;
//            }
//
//            @Override
//            public void reportMatch(Parser recognizer) {
//                System.out.println(">>> reportMatch:"+recognizer.getCurrentToken());
//            }
//
//            @Override
//            public void reportError(Parser recognizer, RecognitionException e) {
//                System.out.println(">>> reportError");
//                throw e;
//            }
//        });

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
//            for (int i = 0; i < ctx.getChildCount(); i++) {
//                System.out.println(ctx.getChild(i).getText());
//            }
            System.out.println("pkge:"+ctx.getText());
            super.enterPackageDeclaration(ctx);
        }

        @Override
        public void enterClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
//            for (int i = 0; i < ctx.getChildCount(); i++) {
//                System.out.println(ctx.getChild(i).getText());
//            }
//            System.out.println("class:"+ctx.getText());
            super.enterClassDeclaration(ctx);
        }

        @Override
        public void enterAnnotation(Java8Parser.AnnotationContext ctx) {
            System.out.println("anno:"+ctx.getText());
            super.enterAnnotation(ctx);
        }

    }

}
