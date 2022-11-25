package com.simile.antlr.spark;

import java.util.BitSet;
import java.util.List;

import com.simile.plan.antlr.spark.SparkSqlLexer;
import com.simile.plan.antlr.spark.SparkSqlParser;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * @Author yitao
 * @Created 2022/05/30
 */
public class Example {

    public static void main(String[] args) {
        String sql = "-- 公司实体标识\n" +
                "create or replace temp view \n" +
                "entity as\n" +
                "select2 \n" +
                "split(_from,_from2,_to, \"/\") as f, `_key`, name, group_name as company_group_beta, capital capital1\n" +
                "from2 (\n" +
                "  select \n" +
                "  distinct a._key, a.name, a.group_name, a.capital\n" +
                "  from (\n" +
                "    select \n" +
                "    split(_from, \"/\")[1] as _key, src_name as name, group_name, src_capital as capital\n" +
                "    from \n" +
                "    db1.t1 as t11 \n" +
                "    where split(_from, \"/\")[0] = \"Company\"\n" +
                "    union all\n" +
                "    select \n" +
                "    split(_to, \"/\")[1] as _key, dst_name as name, group_name, dst_capital as capital\n" +
                "    from \n" +
                "    db2.t2 \n" +
                "    where split(_to, \"/\")[0] = \"Company\"\n" +
                "  ) a ) b;\n" +
                "\n" +
                "select distinct _key, name, capital, \"true\" as is_company_group_beta, company_group_beta from entity;";
        String content = sql
//                .toUpperCase()
//                .replaceAll("`","")
                ;
        content = "select from t1;";
        content = "select from from t1;";
        content = "select name fromm t1;";
        content = "select name from t1;\n select key, name from";
        content = "select `_key`, name from t1;\nselect `_key`, name from ";
//        content = "select age , name from ";
//        content = "select name fromm ;";
//        content = "select name , gg fromm t1;";
//        System.out.println(content);
        CodePointCharStream input = CharStreams.fromString(content);
        SparkSqlLexer lexer = new SparkSqlLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ANTLRErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
                System.out.println(200);
            }

            @Override
            public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
                System.out.println(201);
            }

            @Override
            public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {
//                System.out.println(202);
            }

            @Override
            public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
//                System.out.println(203);
            }
        });
        //转成token流
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        SparkSqlParser parser = new SparkSqlParser(tokens);
        parser.removeErrorListeners();
//        parser.setErrorHandler(new ANTLRErrorStrategy() {
//            @Override
//            public void reset(Parser parser) {
//                System.out.println(101);
//            }
//
//            @Override
//            public Token recoverInline(Parser parser) throws RecognitionException {
//                System.out.println(102);
//                return null;
//            }
//
//            @Override
//            public void recover(Parser parser, RecognitionException e) throws RecognitionException {
//                System.out.println(103);
//            }
//
//            @Override
//            public void sync(Parser parser) throws RecognitionException {
//                System.out.println(104);
//            }
//
//            @Override
//            public boolean inErrorRecoveryMode(Parser parser) {
//                System.out.println(105);
//                return false;
//            }
//
//            @Override
//            public void reportMatch(Parser parser) {
//                System.out.println(106);
//            }
//
//            @Override
//            public void reportError(Parser parser, RecognitionException e) {
//                System.out.println(107);
//            }
//        });

        parser.setErrorHandler(new ErrorHandler());

        parser.addErrorListener(new ANTLRErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
                System.out.println(200);
                System.out.println(s);
            }

            @Override
            public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
                System.out.println(201);
            }

            @Override
            public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {
//                System.out.println(202);
            }

            @Override
            public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
//                System.out.println(203);
            }
        });
        parser.setBuildParseTree(true);
        ParseTree context = parser.multiStatement();


        System.out.println("getNumberOfSyntaxErrors=" + parser.getNumberOfSyntaxErrors());
//        System.out.println(context.toStringTree(parser));
        SparkSqlListener listener = new SparkSqlListener();
        ParseTreeWalker.DEFAULT.walk(listener, context);

        List<TableView> tableViews = listener.getTableViews();
        System.out.println(tableViews.size());
        List<TableView> views = listener.getViews();
        System.out.println(views.size());
        System.out.println("---");
    }

}
