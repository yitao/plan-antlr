package com.simile.antlr.oracle;

import java.util.ArrayList;
import java.util.List;

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
public class OracleExample3 extends BaseExample {

    @Test
    public void testParseProducer() {
        String content = loadString("oracle/simple2.sql");
        content = content.toUpperCase();
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
        public void enterCreate_table(PlSqlParser.Create_tableContext ctx) {
            super.enterCreate_table(ctx);
            //tableview_name.identifier
            String tableName = ctx.getChild(2).getChild(0).getText();
            List<String> columns = new ArrayList<>();
            //relational_table
            for (int i = 0; i < ctx.getChild(3).getChildCount(); i++) {
                if (ctx.getChild(3).getChild(i) instanceof PlSqlParser.Relational_propertyContext) {
                    PlSqlParser.Relational_propertyContext propCtx = (PlSqlParser.Relational_propertyContext) ctx.getChild(3).getChild(i);
                    //column_definition
                    PlSqlParser.Column_definitionContext colDefCtx = (PlSqlParser.Column_definitionContext) propCtx.getChild(0);
                    //column_name
                    PlSqlParser.Column_nameContext colNameCtx = (PlSqlParser.Column_nameContext) colDefCtx.getChild(0);
                    String colName = colNameCtx.getText();
                    //datatype
                    PlSqlParser.DatatypeContext datatypeCtx = (PlSqlParser.DatatypeContext) colDefCtx.getChild(1);
                    String dataType = datatypeCtx.getText();
                    //inline_constraint
                    PlSqlParser.Inline_constraintContext constrCtx = (PlSqlParser.Inline_constraintContext) colDefCtx.getChild(2);
                    boolean nullable = true;
                    if (constrCtx != null) {
                        for (int i1 = 0; i1 < constrCtx.getChildCount(); i1++) {
                            if ("null".equalsIgnoreCase(constrCtx.getChild(i1).getText())) {
                                if (i1 == 0) {
                                    //null出现在第一位
                                    nullable = true;
                                } else {
                                    if ("not".equalsIgnoreCase(constrCtx.getChild(i1 - 1).getText())) {
                                        //not null
                                        nullable = false;
                                    } else {
                                        nullable = true;
                                    }
                                }
                            }
                        }
                    }
                    columns.add(colName + ":" + dataType + ":" + nullable);
                }
            }
            System.out.println("----");
            System.out.println(tableName);
            System.out.println(String.join(System.lineSeparator(), columns));
            System.out.println("----");
        }

        @Override
        public void enterCreate_type(PlSqlParser.Create_typeContext ctx) {
            super.enterCreate_type(ctx);
        }
    }
}
