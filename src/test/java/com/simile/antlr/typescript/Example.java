package com.simile.antlr.typescript;

import com.simile.antlr.BaseExample;
import com.simile.plan.antlr.typescript.TypeScriptLexer;
import com.simile.plan.antlr.typescript.TypeScriptParser;
import com.simile.plan.antlr.typescript.TypeScriptParserBaseListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

/**
 * @Author yitao
 * @Created 2022/06/09
 */
public class Example extends BaseExample {

    @Test
    public void name() {
        String content = loadString("typescript/1.ts");
        parse(content);
    }

    public void parse(String content) {
        content = content == null ? "import Vue from 'vue'\n" +
                "import App from './App.vue'\n" +
                "\n" +
                "Vue.config.productionTip = false \n" +
                "\n" +
                "new Vue({\n" +
                "  render: h => h(App),\n" +
                "}).$mount('#app')\n" : content;
        CodePointCharStream input = CharStreams.fromString(content);
        TypeScriptLexer lexer = new TypeScriptLexer(input);
        //转成token流
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        TypeScriptParser parser = new TypeScriptParser(tokens);
        parser.setBuildParseTree(true);
        RuleContext context = parser.program();
        System.out.println("getNumberOfSyntaxErrors=" + parser.getNumberOfSyntaxErrors());
//        System.out.println(context.toStringTree(parser));
        CustListener listener = new CustListener();
        ParseTreeWalker.DEFAULT.walk(listener, context);
    }

    public static class CustListener extends TypeScriptParserBaseListener {

    }
}
