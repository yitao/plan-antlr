package com.simile.antlr.mysql;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

/**
 * @Author yitao
 * @Created 2022/05/20
 */
public class MysqlExample1 {

    @Test
    public void testCreateTable() {
        String sql =
                "/*! 111 */\n" +
                "CREATE TEMPORARY TABLE `COLUMNS` (\n" +
                "  `TABLE_CATALOG` varchar(512) NOT NULL DEFAULT '',\n" +
                "  `TABLE_SCHEMA` varchar(64) NOT NULL DEFAULT '',\n" +
                "  `TABLE_NAME` varchar(64) NOT NULL DEFAULT '',\n" +
                "  `COLUMN_NAME` varchar(64) NOT NULL DEFAULT '',\n" +
                "  `ORDINAL_POSITION` bigint(21) unsigned NOT NULL DEFAULT '0',\n" +
                "  `COLUMN_DEFAULT` longtext,\n" +
                "  `IS_NULLABLE` varchar(3) NOT NULL DEFAULT '',\n" +
                "  `DATA_TYPE` varchar(64) NOT NULL DEFAULT '',\n" +
                "  `CHARACTER_MAXIMUM_LENGTH` bigint(21) unsigned DEFAULT NULL,\n" +
                "  `CHARACTER_OCTET_LENGTH` bigint(21) unsigned DEFAULT NULL,\n" +
                "  `NUMERIC_PRECISION` bigint(21) unsigned DEFAULT NULL,\n" +
                "  `NUMERIC_SCALE` bigint(21) unsigned DEFAULT NULL,\n" +
                "  `DATETIME_PRECISION` bigint(21) unsigned DEFAULT NULL,\n" +
                "  `CHARACTER_SET_NAME` varchar(32) DEFAULT NULL,\n" +
                "  `COLLATION_NAME` varchar(32) DEFAULT NULL,\n" +
                "  `COLUMN_TYPE` longtext NOT NULL,\n" +
                "  `COLUMN_KEY` varchar(3) NOT NULL DEFAULT '',\n" +
                "  `EXTRA` varchar(30) NOT NULL DEFAULT '',\n" +
                "  `PRIVILEGES` varchar(80) NOT NULL DEFAULT '',\n" +
                "  `COLUMN_COMMENT` varchar(1024) NOT NULL DEFAULT '',\n" +
                "  `GENERATION_EXPRESSION` longtext NOT NULL\n" +
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8";

        String content = sql
//                .toUpperCase()
//                .replaceAll("`","")
                ;
//        System.out.println(content);
        CodePointCharStream input = CharStreams.fromString(content);
        MySqlLexer lexer = new MySqlLexer(input);
        //转成token流
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MySqlParser parser = new MySqlParser(tokens);
        parser.setBuildParseTree(true);
        RuleContext context = parser.root();
        System.out.println("getNumberOfSyntaxErrors=" + parser.getNumberOfSyntaxErrors());
//        System.out.println(context.toStringTree(parser));
        MysqlListener listener = new MysqlListener(parser);
        ParseTreeWalker.DEFAULT.walk(listener, context);
    }

    static class MysqlListener extends MySqlParserBaseListener {
        MySqlParser parser;

        public MysqlListener(MySqlParser parser) {
            this.parser = parser;
        }

        @Override
        public void enterColumnCreateTable(MySqlParser.ColumnCreateTableContext ctx) {
            super.enterColumnCreateTable(ctx);
        }
    }
}
