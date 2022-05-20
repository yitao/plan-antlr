package com.simile.antlr.oracle;

import com.simile.antlr.BaseExample;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

/**
 * @Author yitao
 * @Created 2022/04/07
 */
public class OracleExample1 extends BaseExample {

    @Test
    public void testParseProducer() {
        String content = loadString("oracle/oracle_init_procedure.SQL");
//        System.out.println(content);
        CodePointCharStream input = CharStreams.fromString(content);
        PlSqlLexer lexer = new PlSqlLexer(input);

        //转成token流
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        PlSqlParser parser = new PlSqlParser(tokens);
        parser.setBuildParseTree(true);
        RuleContext context = parser.sql_script();
        System.out.println("getNumberOfSyntaxErrors=" + parser.getNumberOfSyntaxErrors());
//        System.out.println(context.toStringTree(parser));
        PlSqlListener listener = new PlSqlListener(parser);
        ParseTreeWalker.DEFAULT.walk(listener, context);
    }

    static class PlSqlListener extends PlSqlParserBaseListener {
        PlSqlParser parser;

        public PlSqlListener(PlSqlParser parser) {
            this.parser = parser;
        }

        @Override
        public void enterCreate_procedure_body(PlSqlParser.Create_procedure_bodyContext ctx) {
            System.out.println();
            //检查每个context下是不是有ErrorNodeImpl，如果有，则说明解析异常。有些异常直接导致context为null，有些则会导致奇怪的解析结果。
            System.out.println(ctx.procedure_name().getText());
            System.out.println(ctx.body() == null ? null : ctx.body().getText());
            System.out.println(ctx.toStringTree(parser));
        }
    }
}
