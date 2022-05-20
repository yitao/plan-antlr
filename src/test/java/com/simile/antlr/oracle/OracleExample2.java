package com.simile.antlr.oracle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.simile.antlr.BaseExample;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * @Author yitao
 * @Created 2022/04/07
 */
public class OracleExample2 extends BaseExample {

    @Test
    public void testParseProducer() {
        String content = loadString("oracle/simple3.sql");
        content = toUpperCase(content);
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


    static String toUpperCase(String content) {
        Map<String, String> tempValue = new HashMap<>();
        String result = content;
        Pattern p = Pattern.compile("'(.*?)'", Pattern.DOTALL);
        Matcher m = p.matcher(result);
        int valueIndex = 0;
        while (m.find()) {
            String value = m.group(1);
            String key = "'" + value + "'";
            if (tempValue.containsKey(key)) {
                continue;
            }
            String newValue = "'VALUE_" + (valueIndex++) + "'";
            result = StringUtils.replace(result, key, newValue);
            tempValue.put(newValue, key);
        }
        result = result.toUpperCase();
        for (String key : tempValue.keySet()) {
            result = StringUtils.replace(result, key, tempValue.get(key));
        }
        return result;
    }

    static class PlSqlListener extends PlSqlParserBaseListener {
        PlSqlParser parser;

        public PlSqlListener(PlSqlParser parser) {
            this.parser = parser;
        }

        @Override
        public void enterTrigger_block(PlSqlParser.Trigger_blockContext ctx) {
            super.enterTrigger_block(ctx);
        }

        @Override
        public void enterFunction_call(PlSqlParser.Function_callContext ctx) {
            super.enterFunction_call(ctx);
        }

        @Override
        public void enterProcedure_call(PlSqlParser.Procedure_callContext ctx) {
            super.enterProcedure_call(ctx);
        }

        @Override
        public void enterAnonymous_block(PlSqlParser.Anonymous_blockContext ctx) {
            super.enterAnonymous_block(ctx);
            for (int i = 0; i < ctx.getChildCount(); i++) {
                if (ctx.getChild(i) instanceof PlSqlParser.Seq_of_statementsContext) {
                    PlSqlParser.Seq_of_statementsContext seqStates = (PlSqlParser.Seq_of_statementsContext) ctx.getChild(i);
                    for (int i1 = 0; i1 < seqStates.getChildCount(); i1++) {
                        if (seqStates.getChild(i1) instanceof PlSqlParser.StatementContext) {
                            PlSqlParser.StatementContext state = (PlSqlParser.StatementContext) seqStates.getChild(i1);
                            for (int i2 = 0; i2 < state.getChildCount(); i2++) {
                                if (state.getChild(i2) instanceof PlSqlParser.Function_callContext) {
                                    PlSqlParser.Function_callContext funcCtx = (PlSqlParser.Function_callContext) state.getChild(i2);
                                    ParseTree pname = funcCtx.getChild(0).getChild(0);

                                    List<String> params = new ArrayList<>();
                                    PlSqlParser.Function_argumentContext argCtx = (PlSqlParser.Function_argumentContext) funcCtx.getChild(1);
                                    for (int i3 = 0; i3 < argCtx.getChildCount(); i3++) {
                                        if (argCtx.getChild(i3) instanceof PlSqlParser.ArgumentContext) {
                                            ParseTree arg = argCtx.getChild(i3).getChild(0);
                                            params.add(arg.getText());
                                        }
                                    }
                                    System.out.println(pname.getText() + " : " + String.join(",", params));
                                }
                            }
                        }
                    }
                }
            }
        }


        @Override
        public void enterComment_on_column(PlSqlParser.Comment_on_columnContext ctx) {
            super.enterComment_on_column(ctx);
        }

        @Override
        public void enterComment_on_table(PlSqlParser.Comment_on_tableContext ctx) {
            super.enterComment_on_table(ctx);
        }
    }
}
