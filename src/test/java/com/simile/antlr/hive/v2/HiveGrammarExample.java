package com.simile.antlr.hive.v2;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

import com.simile.antlr.hive.v2.grammar.HiveLexer;
import com.simile.antlr.hive.v2.grammar.HiveParser;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.ANTLRInputStream;
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
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

/**
 * @Author yitao
 * @Created 2021/11/25
 */
public class HiveGrammarExample {

    public String loadString(String classpath) {
        URL url = HiveGrammarExample.class.getClassLoader().getResource(classpath);
        try {
            return IOUtils.toString(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testDir() throws IOException {
        URL url = HiveGrammarExample.class.getClassLoader().getResource("hive/v2/");
        File dir = new File(url.getPath());
        for (File file : dir.listFiles()) {
            String sql = FileUtils.readFileToString(file, Charset.defaultCharset());
            System.out.println(file.getName() + " : " + sql);
            List<String> fields = parse(sql);
            System.out.println("===========");
            System.out.println(sql);
            System.out.println("解析结果：");
            System.out.println(String.join(",", fields));
        }
    }

    @Test
    public void testFile() throws IOException {
        String sql = loadString("hive/v2/select6.sql");
        List<String> fields = parse(sql);
        System.out.println("===========");
        System.out.println(sql);
        System.out.println("解析结果：");
        System.out.println(String.join(",", fields));
    }

    public List<String> parse(String content) {
        CodePointCharStream input = CharStreams.fromString(content);
        HiveLexer lexer = new HiveLexer(input);
        //转成token流
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // 语法分析
        HiveParser parser = new HiveParser(tokens);
        System.out.println("getNumberOfSyntaxErrors=" + parser.getNumberOfSyntaxErrors());
        //获取某一个规则树，这里获取的是最外层的规则，也可以通过sql()获取sql规则树......
        System.out.println("---");
        Boolean hasError = false;
        parser.setErrorHandler(new ANTLRErrorStrategy() {
            @Override
            public void reset(Parser recognizer) {
                System.out.println(">>> reset");
            }

            @Override
            public Token recoverInline(Parser recognizer) throws RecognitionException {
                System.out.println(">>> recoverInline");
                return null;
            }

            @Override
            public void recover(Parser recognizer, RecognitionException e) throws RecognitionException {
                System.out.println(">>> recover");
            }

            @Override
            public void sync(Parser recognizer) throws RecognitionException {
                System.out.println(">>> sync");
            }

            @Override
            public boolean inErrorRecoveryMode(Parser recognizer) {
                System.out.println(">>> inErrorRecoveryMode");
                return false;
            }

            @Override
            public void reportMatch(Parser recognizer) {
                System.out.println(">>> reportMatch:"+recognizer.getCurrentToken());
            }

            @Override
            public void reportError(Parser recognizer, RecognitionException e) {
                System.out.println(">>> reportError");
                throw e;
            }
        });
        HiveParser.QueryStatementExpressionContext context = parser.queryStatementExpression();
//打印规则数
        System.out.println();
        System.out.println(context.getChildCount());
        System.out.println(context.toStringTree(parser));
        System.out.println();

        return parseSelectFields(context);
    }

    public List<String> parseSelectFields(HiveParser.QueryStatementExpressionContext context) {
        List<String> fields = new ArrayList<>();
        for (int i = 0; i < context.getChildCount(); i++) {
            ParseTree node = context.getChild(i);
            fields.addAll(parseSelectFieldsCore(node, 1));
        }

        return fields;
    }

    public List<String> parseSelectFieldsCore(ParseTree parent, int level) {
        Object payload = parent.getPayload();
//        System.out.print(level + ">");
//        if (payload instanceof CommonToken) {
//            System.out.println(payload.getClass() + " " + ((CommonToken) payload).getText());
//        } else if (payload instanceof HiveParser.IdentifierContext) {
//            System.out.println(payload.getClass());
//        } else {
//            System.out.println(payload.getClass());
//        }
        if (payload instanceof HiveParser.SelectListContext) {
            return parseFields((HiveParser.SelectListContext) payload);
        }
        if (payload instanceof HiveParser.FromClauseContext) {
            //from 子句后的语句不再解析
            return new ArrayList<>();
        }
        if (payload instanceof HiveParser.WithClauseContext) {
            //with 子句后的语句不再解析
            return new ArrayList<>();
        }
        List<String> fields = new ArrayList<>();
        for (int i = 0; i < parent.getChildCount(); i++) {
            ParseTree node = parent.getChild(i);
            fields.addAll(parseSelectFieldsCore(node, level + 1));
        }
        return fields;
    }

    public List<String> parseFields(HiveParser.SelectListContext context) {
        List<String> fields = new ArrayList<>();
        for (int i = 0; i < context.getChildCount(); i++) {
            ParseTree child = context.getChild(i);
            if (child instanceof HiveParser.SelectItemContext) {
                fields.add(parseField((HiveParser.SelectItemContext) child));
            }
        }
        return fields;
    }

    public String parseField(HiveParser.SelectItemContext context) {
        if (context.getChildCount() == 1) {

            if (context.getChild(0).getChildCount() == 1
                    && context.getChild(0).getChild(0).getChildCount() == 1
                    && context.getChild(0).getChild(0).getChild(0).getChildCount() == 1
                    && context.getChild(0).getChild(0).getChild(0).getChild(0).getChildCount() == 1) {
                //select name from t;
                ParseTree latNode = context.getChild(0).getChild(0).getChild(0).getChild(0).getChild(0);
                if (latNode instanceof TerminalNodeImpl) {
                    return latNode.getText();
                }
            }

            if (context.getChild(0).getChildCount() == 1
                    && context.getChild(0).getChild(0).getChildCount() == 1
                    && context.getChild(0).getChild(0).getChild(0).getChildCount() == 6
            ) {
                //select cast(name as date) from t;
                ParseTree node = context.getChild(0).getChild(0).getChild(0);
                ParseTree fst = node.getChild(0);
                ParseTree mid = node.getChild(2);
                if ("cast".equals(fst.getText())) {
                    ParseTree latNode = mid.getChild(0).getChild(0).getChild(0).getChild(0);
                    return latNode.getText();
                }

            }

            if (context.getChild(0).getChildCount() == 3) {
                //select a.name from a;
                ParseTree mid = context.getChild(0).getChild(1);
                ParseTree lat = context.getChild(0).getChild(2);
                if (".".equals(mid.getText())) {
                    ParseTree latNode = lat.getChild(0);
                    if (latNode instanceof TerminalNodeImpl) {
                        return latNode.getText();
                    }
                }
            }
        }

        if (context.getChildCount() == 3) {
            //select xxx as name from t;
            //select name as name from t;
            //select a.name as name from t;
            //select cast(a.name as string) as name from t;
            //select date(a.name) as name from t;
            //select if(normal_name rlike "(分公司|分行|支行|支公司|委员会|）)$",name,normal_name) as name from t;
            ParseTree mid = context.getChild(1);
            ParseTree lat = context.getChild(2);
            if (mid instanceof TerminalNodeImpl) {
                String txt = ((TerminalNodeImpl) mid).getSymbol().getText();
                if ("as".equals(txt)) {
                    if (lat instanceof HiveParser.IdentifierContext
                            && lat.getChildCount() == 1) {
                        ParseTree latNode = lat.getChild(0);
                        return latNode.getText();
                    }
                }
            }
        }

        return null;
    }


    @Test
    public void test() {
        String[] ss = {"select a from t;"};
        for (String content : ss) {
            //将输入转成antlr的input流
            ANTLRInputStream input = new ANTLRInputStream(content);
            //词法分析
            HiveLexer lexer = new HiveLexer(input);
            //转成token流
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // 语法分析
            HiveParser parser = new HiveParser(tokens);
            //获取某一个规则树，这里获取的是最外层的规则，也可以通过sql()获取sql规则树......
            HiveParser.QueryStatementExpressionContext context = parser.queryStatementExpression();
            //打印规则数
            System.out.println();
            System.out.println(context.toStringTree(parser));
            System.out.println();
        }

    }
}
