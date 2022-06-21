package com.simile.antlr.spark;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.IntervalSet;

/**
 * @Author yitao
 * @Created 2022/06/09
 */
public class ErrorHandler extends DefaultErrorStrategy {

    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        TokenStream tokens = recognizer.getInputStream();
        String input;
        if (tokens != null) {
            if (e.getStartToken().getType() == -1) {
                input = "<EOF>";
            } else {
                input = tokens.getText(e.getStartToken(), e.getOffendingToken());
            }
        } else {
            input = "<unknown input>";
        }

        String msg = "在输入时没有可替代方案 " + this.escapeWSAndQuote(input);
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    protected void reportUnwantedToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            String tokenName = this.getTokenErrorDisplay(t);
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "无关的输入 " + tokenName + " 期望 " + expecting.toString(recognizer.getVocabulary());
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);
        }
    }

    protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        String msg = "语法不匹配 " + this.getTokenErrorDisplay(e.getOffendingToken()) + " 期望 " + e.getExpectedTokens().toString(recognizer.getVocabulary());
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    protected void reportMissingToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "缺失 " + expecting.toString(recognizer.getVocabulary()) + " 在 " + this.getTokenErrorDisplay(t);
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);
        }
    }
}
