// Generated from /Users/haizhi/Documents/workspace/work/plan-antlr/src/main/resources/antlr/cypher/CypherParser.g4 by ANTLR 4.10.1
package com.simile.antlr.cypher;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CypherParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, ADD_ASSIGN=2, LE=3, GE=4, GT=5, LT=6, NOT_EQUAL=7, RANGE=8, 
		SEMI=9, DOT=10, COMMA=11, LPAREN=12, RPAREN=13, LBRACE=14, RBRACE=15, 
		LBRACK=16, RBRACK=17, SUB=18, PLUS=19, DIV=20, MOD=21, CARET=22, MULT=23, 
		ESC=24, COLON=25, STICK=26, DOLLAR=27, CALL=28, YIELD=29, FILTER=30, EXTRACT=31, 
		COUNT=32, ANY=33, NONE=34, SINGLE=35, ALL=36, ASC=37, ASCENDING=38, BY=39, 
		CREATE=40, DELETE=41, DESC=42, DESCENDING=43, DETACH=44, EXISTS=45, LIMIT=46, 
		MATCH=47, MERGE=48, ON=49, OPTIONAL=50, ORDER=51, REMOVE=52, RETURN=53, 
		SET=54, SKIP_W=55, WHERE=56, WITH=57, UNION=58, UNWIND=59, AND=60, AS=61, 
		CONTAINS=62, DISTINCT=63, ENDS=64, IN=65, IS=66, NOT=67, OR=68, STARTS=69, 
		XOR=70, FALSE=71, TRUE=72, NULL_W=73, CONSTRAINT=74, DO=75, FOR=76, REQUIRE=77, 
		UNIQUE=78, CASE=79, WHEN=80, THEN=81, ELSE=82, END=83, MANDATORY=84, SCALAR=85, 
		OF=86, ADD=87, DROP=88, ID=89, ESC_LITERAL=90, CHAR_LITERAL=91, STRING_LITERAL=92, 
		DIGIT=93, FLOAT=94, WS=95, COMMENT=96, LINE_COMMENT=97, ERRCHAR=98, Letter=99;
	public static final int
		RULE_script = 0, RULE_query = 1, RULE_regularQuery = 2, RULE_singleQuery = 3, 
		RULE_standaloneCall = 4, RULE_subCall = 5, RULE_returnSt = 6, RULE_withSt = 7, 
		RULE_skipSt = 8, RULE_limitSt = 9, RULE_projectionBody = 10, RULE_projectionItems = 11, 
		RULE_projectionItem = 12, RULE_orderItem = 13, RULE_orderSt = 14, RULE_singlePartQ = 15, 
		RULE_multiPartQ = 16, RULE_matchSt = 17, RULE_unwindSt = 18, RULE_readingStatement = 19, 
		RULE_updatingStatement = 20, RULE_deleteSt = 21, RULE_removeSt = 22, RULE_removeItem = 23, 
		RULE_queryCallSt = 24, RULE_parenExpressionChain = 25, RULE_yieldItems = 26, 
		RULE_yieldItem = 27, RULE_mergeSt = 28, RULE_mergeAction = 29, RULE_setSt = 30, 
		RULE_setItem = 31, RULE_nodeLabels = 32, RULE_createSt = 33, RULE_patternWhere = 34, 
		RULE_where = 35, RULE_pattern = 36, RULE_expression = 37, RULE_xorExpression = 38, 
		RULE_andExpression = 39, RULE_notExpression = 40, RULE_comparisonExpression = 41, 
		RULE_comparisonSigns = 42, RULE_addSubExpression = 43, RULE_multDivExpression = 44, 
		RULE_powerExpression = 45, RULE_unaryAddSubExpression = 46, RULE_atomicExpression = 47, 
		RULE_listExpression = 48, RULE_stringExpression = 49, RULE_stringExpPrefix = 50, 
		RULE_nullExpression = 51, RULE_propertyOrLabelExpression = 52, RULE_propertyExpression = 53, 
		RULE_patternPart = 54, RULE_patternElem = 55, RULE_patternElemChain = 56, 
		RULE_properties = 57, RULE_nodePattern = 58, RULE_atom = 59, RULE_lhs = 60, 
		RULE_relationshipPattern = 61, RULE_relationDetail = 62, RULE_relationshipTypes = 63, 
		RULE_unionSt = 64, RULE_subqueryExist = 65, RULE_invocationName = 66, 
		RULE_functionInvocation = 67, RULE_parenthesizedExpression = 68, RULE_filterWith = 69, 
		RULE_patternComprehension = 70, RULE_relationshipsChainPattern = 71, RULE_listComprehension = 72, 
		RULE_filterExpression = 73, RULE_countAll = 74, RULE_expressionChain = 75, 
		RULE_caseExpression = 76, RULE_parameter = 77, RULE_literal = 78, RULE_rangeLit = 79, 
		RULE_boolLit = 80, RULE_numLit = 81, RULE_stringLit = 82, RULE_charLit = 83, 
		RULE_listLit = 84, RULE_mapLit = 85, RULE_mapPair = 86, RULE_name = 87, 
		RULE_symbol = 88, RULE_reservedWord = 89;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "query", "regularQuery", "singleQuery", "standaloneCall", "subCall", 
			"returnSt", "withSt", "skipSt", "limitSt", "projectionBody", "projectionItems", 
			"projectionItem", "orderItem", "orderSt", "singlePartQ", "multiPartQ", 
			"matchSt", "unwindSt", "readingStatement", "updatingStatement", "deleteSt", 
			"removeSt", "removeItem", "queryCallSt", "parenExpressionChain", "yieldItems", 
			"yieldItem", "mergeSt", "mergeAction", "setSt", "setItem", "nodeLabels", 
			"createSt", "patternWhere", "where", "pattern", "expression", "xorExpression", 
			"andExpression", "notExpression", "comparisonExpression", "comparisonSigns", 
			"addSubExpression", "multDivExpression", "powerExpression", "unaryAddSubExpression", 
			"atomicExpression", "listExpression", "stringExpression", "stringExpPrefix", 
			"nullExpression", "propertyOrLabelExpression", "propertyExpression", 
			"patternPart", "patternElem", "patternElemChain", "properties", "nodePattern", 
			"atom", "lhs", "relationshipPattern", "relationDetail", "relationshipTypes", 
			"unionSt", "subqueryExist", "invocationName", "functionInvocation", "parenthesizedExpression", 
			"filterWith", "patternComprehension", "relationshipsChainPattern", "listComprehension", 
			"filterExpression", "countAll", "expressionChain", "caseExpression", 
			"parameter", "literal", "rangeLit", "boolLit", "numLit", "stringLit", 
			"charLit", "listLit", "mapLit", "mapPair", "name", "symbol", "reservedWord"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+='", "'<='", "'>='", "'>'", "'<'", "'<>'", "'..'", "';'", 
			"'.'", "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'-'", "'+'", 
			"'/'", "'%'", "'^'", "'*'", "'`'", "':'", "'|'", "'$'", "'CALL'", "'YIELD'", 
			"'FILTER'", "'EXTRACT'", "'COUNT'", "'ANY'", "'NONE'", "'SINGLE'", "'ALL'", 
			"'ASC'", "'ASCENDING'", "'BY'", "'CREATE'", "'DELETE'", "'DESC'", "'DESCENDING'", 
			"'DETACH'", "'EXISTS'", "'LIMIT'", "'MATCH'", "'MERGE'", "'ON'", "'OPTIONAL'", 
			"'ORDER'", "'REMOVE'", "'RETURN'", "'SET'", "'SKIP'", "'WHERE'", "'WITH'", 
			"'UNION'", "'UNWIND'", "'AND'", "'AS'", "'CONTAINS'", "'DISTINCT'", "'ENDS'", 
			"'IN'", "'IS'", "'NOT'", "'OR'", "'STARTS'", "'XOR'", "'FALSE'", "'TRUE'", 
			"'NULL'", "'CONSTRAINT'", "'DO'", "'FOR'", "'REQUIRE'", "'UNIQUE'", "'CASE'", 
			"'WHEN'", "'THEN'", "'ELSE'", "'END'", "'MANDATORY'", "'SCALAR'", "'OF'", 
			"'ADD'", "'DROP'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "ADD_ASSIGN", "LE", "GE", "GT", "LT", "NOT_EQUAL", "RANGE", 
			"SEMI", "DOT", "COMMA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "SUB", "PLUS", "DIV", "MOD", "CARET", "MULT", "ESC", "COLON", 
			"STICK", "DOLLAR", "CALL", "YIELD", "FILTER", "EXTRACT", "COUNT", "ANY", 
			"NONE", "SINGLE", "ALL", "ASC", "ASCENDING", "BY", "CREATE", "DELETE", 
			"DESC", "DESCENDING", "DETACH", "EXISTS", "LIMIT", "MATCH", "MERGE", 
			"ON", "OPTIONAL", "ORDER", "REMOVE", "RETURN", "SET", "SKIP_W", "WHERE", 
			"WITH", "UNION", "UNWIND", "AND", "AS", "CONTAINS", "DISTINCT", "ENDS", 
			"IN", "IS", "NOT", "OR", "STARTS", "XOR", "FALSE", "TRUE", "NULL_W", 
			"CONSTRAINT", "DO", "FOR", "REQUIRE", "UNIQUE", "CASE", "WHEN", "THEN", 
			"ELSE", "END", "MANDATORY", "SCALAR", "OF", "ADD", "DROP", "ID", "ESC_LITERAL", 
			"CHAR_LITERAL", "STRING_LITERAL", "DIGIT", "FLOAT", "WS", "COMMENT", 
			"LINE_COMMENT", "ERRCHAR", "Letter"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CypherParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CypherParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ScriptContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CypherParser.EOF, 0); }
		public TerminalNode SEMI() { return getToken(CypherParser.SEMI, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			query();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(181);
				match(SEMI);
				}
			}

			setState(184);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public RegularQueryContext regularQuery() {
			return getRuleContext(RegularQueryContext.class,0);
		}
		public StandaloneCallContext standaloneCall() {
			return getRuleContext(StandaloneCallContext.class,0);
		}
		public SubCallContext subCall() {
			return getRuleContext(SubCallContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				regularQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				standaloneCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				subCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularQueryContext extends ParserRuleContext {
		public SingleQueryContext singleQuery() {
			return getRuleContext(SingleQueryContext.class,0);
		}
		public List<UnionStContext> unionSt() {
			return getRuleContexts(UnionStContext.class);
		}
		public UnionStContext unionSt(int i) {
			return getRuleContext(UnionStContext.class,i);
		}
		public RegularQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRegularQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRegularQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRegularQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularQueryContext regularQuery() throws RecognitionException {
		RegularQueryContext _localctx = new RegularQueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_regularQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			singleQuery();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(192);
				unionSt();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleQueryContext extends ParserRuleContext {
		public SinglePartQContext singlePartQ() {
			return getRuleContext(SinglePartQContext.class,0);
		}
		public MultiPartQContext multiPartQ() {
			return getRuleContext(MultiPartQContext.class,0);
		}
		public SingleQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSingleQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSingleQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSingleQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleQueryContext singleQuery() throws RecognitionException {
		SingleQueryContext _localctx = new SingleQueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleQuery);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				singlePartQ();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				multiPartQ();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StandaloneCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(CypherParser.CALL, 0); }
		public InvocationNameContext invocationName() {
			return getRuleContext(InvocationNameContext.class,0);
		}
		public ParenExpressionChainContext parenExpressionChain() {
			return getRuleContext(ParenExpressionChainContext.class,0);
		}
		public TerminalNode YIELD() { return getToken(CypherParser.YIELD, 0); }
		public TerminalNode MULT() { return getToken(CypherParser.MULT, 0); }
		public YieldItemsContext yieldItems() {
			return getRuleContext(YieldItemsContext.class,0);
		}
		public StandaloneCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterStandaloneCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitStandaloneCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitStandaloneCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneCallContext standaloneCall() throws RecognitionException {
		StandaloneCallContext _localctx = new StandaloneCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_standaloneCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(CALL);
			setState(203);
			invocationName();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(204);
				parenExpressionChain();
				}
			}

			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YIELD) {
				{
				setState(207);
				match(YIELD);
				setState(210);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(208);
					match(MULT);
					}
					break;
				case FILTER:
				case EXTRACT:
				case COUNT:
				case ANY:
				case NONE:
				case SINGLE:
				case ID:
				case ESC_LITERAL:
					{
					setState(209);
					yieldItems();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(CypherParser.CALL, 0); }
		public TerminalNode LBRACE() { return getToken(CypherParser.LBRACE, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(CypherParser.RBRACE, 0); }
		public SubCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSubCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSubCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSubCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubCallContext subCall() throws RecognitionException {
		SubCallContext _localctx = new SubCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(CALL);
			setState(215);
			match(LBRACE);
			setState(216);
			query();
			setState(217);
			match(RBRACE);
			setState(218);
			query();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CypherParser.RETURN, 0); }
		public ProjectionBodyContext projectionBody() {
			return getRuleContext(ProjectionBodyContext.class,0);
		}
		public ReturnStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterReturnSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitReturnSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitReturnSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStContext returnSt() throws RecognitionException {
		ReturnStContext _localctx = new ReturnStContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(RETURN);
			setState(221);
			projectionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithStContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(CypherParser.WITH, 0); }
		public ProjectionBodyContext projectionBody() {
			return getRuleContext(ProjectionBodyContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public WithStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterWithSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitWithSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitWithSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithStContext withSt() throws RecognitionException {
		WithStContext _localctx = new WithStContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_withSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(WITH);
			setState(224);
			projectionBody();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(225);
				where();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkipStContext extends ParserRuleContext {
		public TerminalNode SKIP_W() { return getToken(CypherParser.SKIP_W, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SkipStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSkipSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSkipSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSkipSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipStContext skipSt() throws RecognitionException {
		SkipStContext _localctx = new SkipStContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_skipSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(SKIP_W);
			setState(229);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitStContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(CypherParser.LIMIT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LimitStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterLimitSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitLimitSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitLimitSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitStContext limitSt() throws RecognitionException {
		LimitStContext _localctx = new LimitStContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_limitSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(LIMIT);
			setState(232);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProjectionBodyContext extends ParserRuleContext {
		public ProjectionItemsContext projectionItems() {
			return getRuleContext(ProjectionItemsContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(CypherParser.DISTINCT, 0); }
		public OrderStContext orderSt() {
			return getRuleContext(OrderStContext.class,0);
		}
		public SkipStContext skipSt() {
			return getRuleContext(SkipStContext.class,0);
		}
		public LimitStContext limitSt() {
			return getRuleContext(LimitStContext.class,0);
		}
		public ProjectionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterProjectionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitProjectionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitProjectionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionBodyContext projectionBody() throws RecognitionException {
		ProjectionBodyContext _localctx = new ProjectionBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_projectionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(234);
				match(DISTINCT);
				}
			}

			setState(237);
			projectionItems();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(238);
				orderSt();
				}
			}

			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SKIP_W) {
				{
				setState(241);
				skipSt();
				}
			}

			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(244);
				limitSt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProjectionItemsContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(CypherParser.MULT, 0); }
		public List<ProjectionItemContext> projectionItem() {
			return getRuleContexts(ProjectionItemContext.class);
		}
		public ProjectionItemContext projectionItem(int i) {
			return getRuleContext(ProjectionItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public ProjectionItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterProjectionItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitProjectionItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitProjectionItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionItemsContext projectionItems() throws RecognitionException {
		ProjectionItemsContext _localctx = new ProjectionItemsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_projectionItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				{
				setState(247);
				match(MULT);
				}
				break;
			case LPAREN:
			case LBRACE:
			case LBRACK:
			case SUB:
			case PLUS:
			case DOLLAR:
			case FILTER:
			case EXTRACT:
			case COUNT:
			case ANY:
			case NONE:
			case SINGLE:
			case ALL:
			case EXISTS:
			case NOT:
			case FALSE:
			case TRUE:
			case NULL_W:
			case CASE:
			case ID:
			case ESC_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case DIGIT:
				{
				setState(248);
				projectionItem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(251);
				match(COMMA);
				setState(252);
				projectionItem();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProjectionItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ProjectionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterProjectionItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitProjectionItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitProjectionItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectionItemContext projectionItem() throws RecognitionException {
		ProjectionItemContext _localctx = new ProjectionItemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_projectionItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			expression();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(259);
				match(AS);
				setState(260);
				symbol();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASCENDING() { return getToken(CypherParser.ASCENDING, 0); }
		public TerminalNode ASC() { return getToken(CypherParser.ASC, 0); }
		public TerminalNode DESCENDING() { return getToken(CypherParser.DESCENDING, 0); }
		public TerminalNode DESC() { return getToken(CypherParser.DESC, 0); }
		public OrderItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterOrderItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitOrderItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitOrderItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderItemContext orderItem() throws RecognitionException {
		OrderItemContext _localctx = new OrderItemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_orderItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			expression();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASC) | (1L << ASCENDING) | (1L << DESC) | (1L << DESCENDING))) != 0)) {
				{
				setState(264);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASC) | (1L << ASCENDING) | (1L << DESC) | (1L << DESCENDING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderStContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(CypherParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(CypherParser.BY, 0); }
		public List<OrderItemContext> orderItem() {
			return getRuleContexts(OrderItemContext.class);
		}
		public OrderItemContext orderItem(int i) {
			return getRuleContext(OrderItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public OrderStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterOrderSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitOrderSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitOrderSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderStContext orderSt() throws RecognitionException {
		OrderStContext _localctx = new OrderStContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_orderSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(ORDER);
			setState(268);
			match(BY);
			setState(269);
			orderItem();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(270);
				match(COMMA);
				setState(271);
				orderItem();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinglePartQContext extends ParserRuleContext {
		public ReturnStContext returnSt() {
			return getRuleContext(ReturnStContext.class,0);
		}
		public List<ReadingStatementContext> readingStatement() {
			return getRuleContexts(ReadingStatementContext.class);
		}
		public ReadingStatementContext readingStatement(int i) {
			return getRuleContext(ReadingStatementContext.class,i);
		}
		public List<UpdatingStatementContext> updatingStatement() {
			return getRuleContexts(UpdatingStatementContext.class);
		}
		public UpdatingStatementContext updatingStatement(int i) {
			return getRuleContext(UpdatingStatementContext.class,i);
		}
		public SinglePartQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlePartQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSinglePartQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSinglePartQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSinglePartQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglePartQContext singlePartQ() throws RecognitionException {
		SinglePartQContext _localctx = new SinglePartQContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_singlePartQ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << MATCH) | (1L << OPTIONAL) | (1L << UNWIND))) != 0)) {
				{
				{
				setState(277);
				readingStatement();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(283);
				returnSt();
				}
				break;
			case CREATE:
			case DELETE:
			case DETACH:
			case MERGE:
			case REMOVE:
			case SET:
				{
				setState(285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(284);
					updatingStatement();
					}
					}
					setState(287); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << DELETE) | (1L << DETACH) | (1L << MERGE) | (1L << REMOVE) | (1L << SET))) != 0) );
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(289);
					returnSt();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiPartQContext extends ParserRuleContext {
		public SinglePartQContext singlePartQ() {
			return getRuleContext(SinglePartQContext.class,0);
		}
		public List<WithStContext> withSt() {
			return getRuleContexts(WithStContext.class);
		}
		public WithStContext withSt(int i) {
			return getRuleContext(WithStContext.class,i);
		}
		public List<ReadingStatementContext> readingStatement() {
			return getRuleContexts(ReadingStatementContext.class);
		}
		public ReadingStatementContext readingStatement(int i) {
			return getRuleContext(ReadingStatementContext.class,i);
		}
		public List<UpdatingStatementContext> updatingStatement() {
			return getRuleContexts(UpdatingStatementContext.class);
		}
		public UpdatingStatementContext updatingStatement(int i) {
			return getRuleContext(UpdatingStatementContext.class,i);
		}
		public MultiPartQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiPartQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterMultiPartQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitMultiPartQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitMultiPartQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiPartQContext multiPartQ() throws RecognitionException {
		MultiPartQContext _localctx = new MultiPartQContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multiPartQ);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << MATCH) | (1L << OPTIONAL) | (1L << UNWIND))) != 0)) {
						{
						{
						setState(294);
						readingStatement();
						}
						}
						setState(299);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << DELETE) | (1L << DETACH) | (1L << MERGE) | (1L << REMOVE) | (1L << SET))) != 0)) {
						{
						{
						setState(300);
						updatingStatement();
						}
						}
						setState(305);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(306);
					withSt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(309); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(311);
			singlePartQ();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchStContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(CypherParser.MATCH, 0); }
		public PatternWhereContext patternWhere() {
			return getRuleContext(PatternWhereContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(CypherParser.OPTIONAL, 0); }
		public MatchStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterMatchSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitMatchSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitMatchSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchStContext matchSt() throws RecognitionException {
		MatchStContext _localctx = new MatchStContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_matchSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(313);
				match(OPTIONAL);
				}
			}

			setState(316);
			match(MATCH);
			setState(317);
			patternWhere();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnwindStContext extends ParserRuleContext {
		public TerminalNode UNWIND() { return getToken(CypherParser.UNWIND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public UnwindStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unwindSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterUnwindSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitUnwindSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitUnwindSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnwindStContext unwindSt() throws RecognitionException {
		UnwindStContext _localctx = new UnwindStContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unwindSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(UNWIND);
			setState(320);
			expression();
			setState(321);
			match(AS);
			setState(322);
			symbol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadingStatementContext extends ParserRuleContext {
		public MatchStContext matchSt() {
			return getRuleContext(MatchStContext.class,0);
		}
		public UnwindStContext unwindSt() {
			return getRuleContext(UnwindStContext.class,0);
		}
		public QueryCallStContext queryCallSt() {
			return getRuleContext(QueryCallStContext.class,0);
		}
		public ReadingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readingStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterReadingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitReadingStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitReadingStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadingStatementContext readingStatement() throws RecognitionException {
		ReadingStatementContext _localctx = new ReadingStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_readingStatement);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATCH:
			case OPTIONAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				matchSt();
				}
				break;
			case UNWIND:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				unwindSt();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				queryCallSt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdatingStatementContext extends ParserRuleContext {
		public CreateStContext createSt() {
			return getRuleContext(CreateStContext.class,0);
		}
		public MergeStContext mergeSt() {
			return getRuleContext(MergeStContext.class,0);
		}
		public DeleteStContext deleteSt() {
			return getRuleContext(DeleteStContext.class,0);
		}
		public SetStContext setSt() {
			return getRuleContext(SetStContext.class,0);
		}
		public RemoveStContext removeSt() {
			return getRuleContext(RemoveStContext.class,0);
		}
		public UpdatingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updatingStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterUpdatingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitUpdatingStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitUpdatingStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdatingStatementContext updatingStatement() throws RecognitionException {
		UpdatingStatementContext _localctx = new UpdatingStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_updatingStatement);
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				createSt();
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				mergeSt();
				}
				break;
			case DELETE:
			case DETACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				deleteSt();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				setSt();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
				removeSt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteStContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(CypherParser.DELETE, 0); }
		public ExpressionChainContext expressionChain() {
			return getRuleContext(ExpressionChainContext.class,0);
		}
		public TerminalNode DETACH() { return getToken(CypherParser.DETACH, 0); }
		public DeleteStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterDeleteSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitDeleteSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitDeleteSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStContext deleteSt() throws RecognitionException {
		DeleteStContext _localctx = new DeleteStContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_deleteSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DETACH) {
				{
				setState(336);
				match(DETACH);
				}
			}

			setState(339);
			match(DELETE);
			setState(340);
			expressionChain();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemoveStContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(CypherParser.REMOVE, 0); }
		public List<RemoveItemContext> removeItem() {
			return getRuleContexts(RemoveItemContext.class);
		}
		public RemoveItemContext removeItem(int i) {
			return getRuleContext(RemoveItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public RemoveStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRemoveSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRemoveSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRemoveSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemoveStContext removeSt() throws RecognitionException {
		RemoveStContext _localctx = new RemoveStContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_removeSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(REMOVE);
			setState(343);
			removeItem();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(344);
				match(COMMA);
				setState(345);
				removeItem();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemoveItemContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public NodeLabelsContext nodeLabels() {
			return getRuleContext(NodeLabelsContext.class,0);
		}
		public PropertyExpressionContext propertyExpression() {
			return getRuleContext(PropertyExpressionContext.class,0);
		}
		public RemoveItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removeItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRemoveItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRemoveItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRemoveItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemoveItemContext removeItem() throws RecognitionException {
		RemoveItemContext _localctx = new RemoveItemContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_removeItem);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				symbol();
				setState(352);
				nodeLabels();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				propertyExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryCallStContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(CypherParser.CALL, 0); }
		public InvocationNameContext invocationName() {
			return getRuleContext(InvocationNameContext.class,0);
		}
		public ParenExpressionChainContext parenExpressionChain() {
			return getRuleContext(ParenExpressionChainContext.class,0);
		}
		public TerminalNode YIELD() { return getToken(CypherParser.YIELD, 0); }
		public YieldItemsContext yieldItems() {
			return getRuleContext(YieldItemsContext.class,0);
		}
		public QueryCallStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryCallSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterQueryCallSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitQueryCallSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitQueryCallSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryCallStContext queryCallSt() throws RecognitionException {
		QueryCallStContext _localctx = new QueryCallStContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_queryCallSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(CALL);
			setState(358);
			invocationName();
			setState(359);
			parenExpressionChain();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YIELD) {
				{
				setState(360);
				match(YIELD);
				setState(361);
				yieldItems();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenExpressionChainContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public ExpressionChainContext expressionChain() {
			return getRuleContext(ExpressionChainContext.class,0);
		}
		public ParenExpressionChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenExpressionChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterParenExpressionChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitParenExpressionChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitParenExpressionChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenExpressionChainContext parenExpressionChain() throws RecognitionException {
		ParenExpressionChainContext _localctx = new ParenExpressionChainContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parenExpressionChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(LPAREN);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SUB) | (1L << PLUS) | (1L << DOLLAR) | (1L << FILTER) | (1L << EXTRACT) | (1L << COUNT) | (1L << ANY) | (1L << NONE) | (1L << SINGLE) | (1L << ALL) | (1L << EXISTS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NOT - 67)) | (1L << (FALSE - 67)) | (1L << (TRUE - 67)) | (1L << (NULL_W - 67)) | (1L << (CASE - 67)) | (1L << (ID - 67)) | (1L << (ESC_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (DIGIT - 67)))) != 0)) {
				{
				setState(365);
				expressionChain();
				}
			}

			setState(368);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YieldItemsContext extends ParserRuleContext {
		public List<YieldItemContext> yieldItem() {
			return getRuleContexts(YieldItemContext.class);
		}
		public YieldItemContext yieldItem(int i) {
			return getRuleContext(YieldItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public YieldItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterYieldItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitYieldItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitYieldItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldItemsContext yieldItems() throws RecognitionException {
		YieldItemsContext _localctx = new YieldItemsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_yieldItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			yieldItem();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(371);
				match(COMMA);
				setState(372);
				yieldItem();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(378);
				where();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YieldItemContext extends ParserRuleContext {
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public YieldItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterYieldItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitYieldItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitYieldItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldItemContext yieldItem() throws RecognitionException {
		YieldItemContext _localctx = new YieldItemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_yieldItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(381);
				symbol();
				setState(382);
				match(AS);
				}
				break;
			}
			setState(386);
			symbol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MergeStContext extends ParserRuleContext {
		public TerminalNode MERGE() { return getToken(CypherParser.MERGE, 0); }
		public PatternPartContext patternPart() {
			return getRuleContext(PatternPartContext.class,0);
		}
		public List<MergeActionContext> mergeAction() {
			return getRuleContexts(MergeActionContext.class);
		}
		public MergeActionContext mergeAction(int i) {
			return getRuleContext(MergeActionContext.class,i);
		}
		public MergeStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterMergeSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitMergeSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitMergeSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeStContext mergeSt() throws RecognitionException {
		MergeStContext _localctx = new MergeStContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mergeSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(MERGE);
			setState(389);
			patternPart();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON) {
				{
				{
				setState(390);
				mergeAction();
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MergeActionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public SetStContext setSt() {
			return getRuleContext(SetStContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(CypherParser.MATCH, 0); }
		public TerminalNode CREATE() { return getToken(CypherParser.CREATE, 0); }
		public MergeActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterMergeAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitMergeAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitMergeAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeActionContext mergeAction() throws RecognitionException {
		MergeActionContext _localctx = new MergeActionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mergeAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(ON);
			setState(397);
			_la = _input.LA(1);
			if ( !(_la==CREATE || _la==MATCH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(398);
			setSt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetStContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CypherParser.SET, 0); }
		public List<SetItemContext> setItem() {
			return getRuleContexts(SetItemContext.class);
		}
		public SetItemContext setItem(int i) {
			return getRuleContext(SetItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public SetStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSetSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSetSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSetSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStContext setSt() throws RecognitionException {
		SetStContext _localctx = new SetStContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_setSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(SET);
			setState(401);
			setItem();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(402);
				match(COMMA);
				setState(403);
				setItem();
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetItemContext extends ParserRuleContext {
		public PropertyExpressionContext propertyExpression() {
			return getRuleContext(PropertyExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CypherParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode ADD_ASSIGN() { return getToken(CypherParser.ADD_ASSIGN, 0); }
		public NodeLabelsContext nodeLabels() {
			return getRuleContext(NodeLabelsContext.class,0);
		}
		public SetItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSetItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSetItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSetItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetItemContext setItem() throws RecognitionException {
		SetItemContext _localctx = new SetItemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_setItem);
		int _la;
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				propertyExpression();
				setState(410);
				match(ASSIGN);
				setState(411);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				symbol();
				setState(414);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ADD_ASSIGN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(415);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				symbol();
				setState(418);
				nodeLabels();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeLabelsContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(CypherParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CypherParser.COLON, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public NodeLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterNodeLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitNodeLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitNodeLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeLabelsContext nodeLabels() throws RecognitionException {
		NodeLabelsContext _localctx = new NodeLabelsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_nodeLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(422);
				match(COLON);
				setState(423);
				name();
				}
				}
				setState(426); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLON );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateStContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(CypherParser.CREATE, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public CreateStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterCreateSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitCreateSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitCreateSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStContext createSt() throws RecognitionException {
		CreateStContext _localctx = new CreateStContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_createSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(CREATE);
			setState(429);
			pattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternWhereContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public PatternWhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternWhere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPatternWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPatternWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPatternWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternWhereContext patternWhere() throws RecognitionException {
		PatternWhereContext _localctx = new PatternWhereContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_patternWhere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			pattern();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(432);
				where();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(WHERE);
			setState(436);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public List<PatternPartContext> patternPart() {
			return getRuleContexts(PatternPartContext.class);
		}
		public PatternPartContext patternPart(int i) {
			return getRuleContext(PatternPartContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			patternPart();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(439);
				match(COMMA);
				setState(440);
				patternPart();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<XorExpressionContext> xorExpression() {
			return getRuleContexts(XorExpressionContext.class);
		}
		public XorExpressionContext xorExpression(int i) {
			return getRuleContext(XorExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CypherParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CypherParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			xorExpression();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(447);
				match(OR);
				setState(448);
				xorExpression();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XorExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> XOR() { return getTokens(CypherParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(CypherParser.XOR, i);
		}
		public XorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XorExpressionContext xorExpression() throws RecognitionException {
		XorExpressionContext _localctx = new XorExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_xorExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			andExpression();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(455);
				match(XOR);
				setState(456);
				andExpression();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public List<NotExpressionContext> notExpression() {
			return getRuleContexts(NotExpressionContext.class);
		}
		public NotExpressionContext notExpression(int i) {
			return getRuleContext(NotExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CypherParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CypherParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			notExpression();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(463);
				match(AND);
				setState(464);
				notExpression();
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_notExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(470);
				match(NOT);
				}
			}

			setState(473);
			comparisonExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<AddSubExpressionContext> addSubExpression() {
			return getRuleContexts(AddSubExpressionContext.class);
		}
		public AddSubExpressionContext addSubExpression(int i) {
			return getRuleContext(AddSubExpressionContext.class,i);
		}
		public List<ComparisonSignsContext> comparisonSigns() {
			return getRuleContexts(ComparisonSignsContext.class);
		}
		public ComparisonSignsContext comparisonSigns(int i) {
			return getRuleContext(ComparisonSignsContext.class,i);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			addSubExpression();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << LT) | (1L << NOT_EQUAL))) != 0)) {
				{
				{
				setState(476);
				comparisonSigns();
				setState(477);
				addSubExpression();
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonSignsContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(CypherParser.ASSIGN, 0); }
		public TerminalNode LE() { return getToken(CypherParser.LE, 0); }
		public TerminalNode GE() { return getToken(CypherParser.GE, 0); }
		public TerminalNode GT() { return getToken(CypherParser.GT, 0); }
		public TerminalNode LT() { return getToken(CypherParser.LT, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(CypherParser.NOT_EQUAL, 0); }
		public ComparisonSignsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonSigns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterComparisonSigns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitComparisonSigns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitComparisonSigns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonSignsContext comparisonSigns() throws RecognitionException {
		ComparisonSignsContext _localctx = new ComparisonSignsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_comparisonSigns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << LT) | (1L << NOT_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddSubExpressionContext extends ParserRuleContext {
		public List<MultDivExpressionContext> multDivExpression() {
			return getRuleContexts(MultDivExpressionContext.class);
		}
		public MultDivExpressionContext multDivExpression(int i) {
			return getRuleContext(MultDivExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CypherParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CypherParser.PLUS, i);
		}
		public List<TerminalNode> SUB() { return getTokens(CypherParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(CypherParser.SUB, i);
		}
		public AddSubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubExpressionContext addSubExpression() throws RecognitionException {
		AddSubExpressionContext _localctx = new AddSubExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_addSubExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			multDivExpression();
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB || _la==PLUS) {
				{
				{
				setState(487);
				_la = _input.LA(1);
				if ( !(_la==SUB || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(488);
				multDivExpression();
				}
				}
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultDivExpressionContext extends ParserRuleContext {
		public List<PowerExpressionContext> powerExpression() {
			return getRuleContexts(PowerExpressionContext.class);
		}
		public PowerExpressionContext powerExpression(int i) {
			return getRuleContext(PowerExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CypherParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CypherParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CypherParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CypherParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(CypherParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(CypherParser.MOD, i);
		}
		public MultDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multDivExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterMultDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitMultDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitMultDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultDivExpressionContext multDivExpression() throws RecognitionException {
		MultDivExpressionContext _localctx = new MultDivExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_multDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			powerExpression();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << MULT))) != 0)) {
				{
				{
				setState(495);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << MULT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(496);
				powerExpression();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowerExpressionContext extends ParserRuleContext {
		public List<UnaryAddSubExpressionContext> unaryAddSubExpression() {
			return getRuleContexts(UnaryAddSubExpressionContext.class);
		}
		public UnaryAddSubExpressionContext unaryAddSubExpression(int i) {
			return getRuleContext(UnaryAddSubExpressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(CypherParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(CypherParser.CARET, i);
		}
		public PowerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerExpressionContext powerExpression() throws RecognitionException {
		PowerExpressionContext _localctx = new PowerExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_powerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			unaryAddSubExpression();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(503);
				match(CARET);
				setState(504);
				unaryAddSubExpression();
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryAddSubExpressionContext extends ParserRuleContext {
		public AtomicExpressionContext atomicExpression() {
			return getRuleContext(AtomicExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CypherParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(CypherParser.SUB, 0); }
		public UnaryAddSubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryAddSubExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterUnaryAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitUnaryAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitUnaryAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryAddSubExpressionContext unaryAddSubExpression() throws RecognitionException {
		UnaryAddSubExpressionContext _localctx = new UnaryAddSubExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unaryAddSubExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB || _la==PLUS) {
				{
				setState(510);
				_la = _input.LA(1);
				if ( !(_la==SUB || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(513);
			atomicExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicExpressionContext extends ParserRuleContext {
		public PropertyOrLabelExpressionContext propertyOrLabelExpression() {
			return getRuleContext(PropertyOrLabelExpressionContext.class,0);
		}
		public List<StringExpressionContext> stringExpression() {
			return getRuleContexts(StringExpressionContext.class);
		}
		public StringExpressionContext stringExpression(int i) {
			return getRuleContext(StringExpressionContext.class,i);
		}
		public List<ListExpressionContext> listExpression() {
			return getRuleContexts(ListExpressionContext.class);
		}
		public ListExpressionContext listExpression(int i) {
			return getRuleContext(ListExpressionContext.class,i);
		}
		public List<NullExpressionContext> nullExpression() {
			return getRuleContexts(NullExpressionContext.class);
		}
		public NullExpressionContext nullExpression(int i) {
			return getRuleContext(NullExpressionContext.class,i);
		}
		public AtomicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterAtomicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitAtomicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitAtomicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicExpressionContext atomicExpression() throws RecognitionException {
		AtomicExpressionContext _localctx = new AtomicExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_atomicExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			propertyOrLabelExpression();
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (LBRACK - 16)) | (1L << (CONTAINS - 16)) | (1L << (ENDS - 16)) | (1L << (IN - 16)) | (1L << (IS - 16)) | (1L << (STARTS - 16)))) != 0)) {
				{
				setState(519);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTAINS:
				case ENDS:
				case STARTS:
					{
					setState(516);
					stringExpression();
					}
					break;
				case LBRACK:
				case IN:
					{
					setState(517);
					listExpression();
					}
					break;
				case IS:
					{
					setState(518);
					nullExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListExpressionContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public PropertyOrLabelExpressionContext propertyOrLabelExpression() {
			return getRuleContext(PropertyOrLabelExpressionContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(CypherParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CypherParser.RBRACK, 0); }
		public TerminalNode RANGE() { return getToken(CypherParser.RANGE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExpressionContext listExpression() throws RecognitionException {
		ListExpressionContext _localctx = new ListExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_listExpression);
		int _la;
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(IN);
				setState(525);
				propertyOrLabelExpression();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				match(LBRACK);
				setState(535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(528);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SUB) | (1L << PLUS) | (1L << DOLLAR) | (1L << FILTER) | (1L << EXTRACT) | (1L << COUNT) | (1L << ANY) | (1L << NONE) | (1L << SINGLE) | (1L << ALL) | (1L << EXISTS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NOT - 67)) | (1L << (FALSE - 67)) | (1L << (TRUE - 67)) | (1L << (NULL_W - 67)) | (1L << (CASE - 67)) | (1L << (ID - 67)) | (1L << (ESC_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (DIGIT - 67)))) != 0)) {
						{
						setState(527);
						expression();
						}
					}

					setState(530);
					match(RANGE);
					setState(532);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SUB) | (1L << PLUS) | (1L << DOLLAR) | (1L << FILTER) | (1L << EXTRACT) | (1L << COUNT) | (1L << ANY) | (1L << NONE) | (1L << SINGLE) | (1L << ALL) | (1L << EXISTS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NOT - 67)) | (1L << (FALSE - 67)) | (1L << (TRUE - 67)) | (1L << (NULL_W - 67)) | (1L << (CASE - 67)) | (1L << (ID - 67)) | (1L << (ESC_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (DIGIT - 67)))) != 0)) {
						{
						setState(531);
						expression();
						}
					}

					}
					break;
				case 2:
					{
					setState(534);
					expression();
					}
					break;
				}
				setState(537);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringExpressionContext extends ParserRuleContext {
		public StringExpPrefixContext stringExpPrefix() {
			return getRuleContext(StringExpPrefixContext.class,0);
		}
		public PropertyOrLabelExpressionContext propertyOrLabelExpression() {
			return getRuleContext(PropertyOrLabelExpressionContext.class,0);
		}
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_stringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			stringExpPrefix();
			setState(541);
			propertyOrLabelExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringExpPrefixContext extends ParserRuleContext {
		public TerminalNode STARTS() { return getToken(CypherParser.STARTS, 0); }
		public TerminalNode WITH() { return getToken(CypherParser.WITH, 0); }
		public TerminalNode ENDS() { return getToken(CypherParser.ENDS, 0); }
		public TerminalNode CONTAINS() { return getToken(CypherParser.CONTAINS, 0); }
		public StringExpPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterStringExpPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitStringExpPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitStringExpPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExpPrefixContext stringExpPrefix() throws RecognitionException {
		StringExpPrefixContext _localctx = new StringExpPrefixContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_stringExpPrefix);
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STARTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				match(STARTS);
				setState(544);
				match(WITH);
				}
				break;
			case ENDS:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				match(ENDS);
				setState(546);
				match(WITH);
				}
				break;
			case CONTAINS:
				enterOuterAlt(_localctx, 3);
				{
				setState(547);
				match(CONTAINS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullExpressionContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(CypherParser.IS, 0); }
		public TerminalNode NULL_W() { return getToken(CypherParser.NULL_W, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public NullExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullExpressionContext nullExpression() throws RecognitionException {
		NullExpressionContext _localctx = new NullExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_nullExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(IS);
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(551);
				match(NOT);
				}
			}

			setState(554);
			match(NULL_W);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyOrLabelExpressionContext extends ParserRuleContext {
		public PropertyExpressionContext propertyExpression() {
			return getRuleContext(PropertyExpressionContext.class,0);
		}
		public NodeLabelsContext nodeLabels() {
			return getRuleContext(NodeLabelsContext.class,0);
		}
		public PropertyOrLabelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyOrLabelExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPropertyOrLabelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPropertyOrLabelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPropertyOrLabelExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyOrLabelExpressionContext propertyOrLabelExpression() throws RecognitionException {
		PropertyOrLabelExpressionContext _localctx = new PropertyOrLabelExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_propertyOrLabelExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			propertyExpression();
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(557);
				nodeLabels();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyExpressionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(CypherParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CypherParser.DOT, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public PropertyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPropertyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPropertyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPropertyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyExpressionContext propertyExpression() throws RecognitionException {
		PropertyExpressionContext _localctx = new PropertyExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_propertyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			atom();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(561);
				match(DOT);
				setState(562);
				name();
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternPartContext extends ParserRuleContext {
		public PatternElemContext patternElem() {
			return getRuleContext(PatternElemContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CypherParser.ASSIGN, 0); }
		public PatternPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPatternPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPatternPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPatternPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternPartContext patternPart() throws RecognitionException {
		PatternPartContext _localctx = new PatternPartContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_patternPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (FILTER - 30)) | (1L << (EXTRACT - 30)) | (1L << (COUNT - 30)) | (1L << (ANY - 30)) | (1L << (NONE - 30)) | (1L << (SINGLE - 30)) | (1L << (ID - 30)) | (1L << (ESC_LITERAL - 30)))) != 0)) {
				{
				setState(568);
				symbol();
				setState(569);
				match(ASSIGN);
				}
			}

			setState(573);
			patternElem();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternElemContext extends ParserRuleContext {
		public NodePatternContext nodePattern() {
			return getRuleContext(NodePatternContext.class,0);
		}
		public List<PatternElemChainContext> patternElemChain() {
			return getRuleContexts(PatternElemChainContext.class);
		}
		public PatternElemChainContext patternElemChain(int i) {
			return getRuleContext(PatternElemChainContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public PatternElemContext patternElem() {
			return getRuleContext(PatternElemContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public PatternElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternElem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPatternElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPatternElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPatternElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternElemContext patternElem() throws RecognitionException {
		PatternElemContext _localctx = new PatternElemContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_patternElem);
		int _la;
		try {
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				nodePattern();
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LT || _la==SUB) {
					{
					{
					setState(576);
					patternElemChain();
					}
					}
					setState(581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				match(LPAREN);
				setState(583);
				patternElem();
				setState(584);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternElemChainContext extends ParserRuleContext {
		public RelationshipPatternContext relationshipPattern() {
			return getRuleContext(RelationshipPatternContext.class,0);
		}
		public NodePatternContext nodePattern() {
			return getRuleContext(NodePatternContext.class,0);
		}
		public PatternElemChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternElemChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPatternElemChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPatternElemChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPatternElemChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternElemChainContext patternElemChain() throws RecognitionException {
		PatternElemChainContext _localctx = new PatternElemChainContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_patternElemChain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			relationshipPattern();
			setState(589);
			nodePattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertiesContext extends ParserRuleContext {
		public MapLitContext mapLit() {
			return getRuleContext(MapLitContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_properties);
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				mapLit();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				parameter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodePatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public NodeLabelsContext nodeLabels() {
			return getRuleContext(NodeLabelsContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public NodePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterNodePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitNodePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitNodePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodePatternContext nodePattern() throws RecognitionException {
		NodePatternContext _localctx = new NodePatternContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_nodePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(LPAREN);
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (FILTER - 30)) | (1L << (EXTRACT - 30)) | (1L << (COUNT - 30)) | (1L << (ANY - 30)) | (1L << (NONE - 30)) | (1L << (SINGLE - 30)) | (1L << (ID - 30)) | (1L << (ESC_LITERAL - 30)))) != 0)) {
				{
				setState(596);
				symbol();
				}
			}

			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(599);
				nodeLabels();
				}
			}

			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE || _la==DOLLAR) {
				{
				setState(602);
				properties();
				}
			}

			setState(605);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public CountAllContext countAll() {
			return getRuleContext(CountAllContext.class,0);
		}
		public ListComprehensionContext listComprehension() {
			return getRuleContext(ListComprehensionContext.class,0);
		}
		public PatternComprehensionContext patternComprehension() {
			return getRuleContext(PatternComprehensionContext.class,0);
		}
		public FilterWithContext filterWith() {
			return getRuleContext(FilterWithContext.class,0);
		}
		public RelationshipsChainPatternContext relationshipsChainPattern() {
			return getRuleContext(RelationshipsChainPatternContext.class,0);
		}
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SubqueryExistContext subqueryExist() {
			return getRuleContext(SubqueryExistContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_atom);
		try {
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				parameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
				caseExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(610);
				countAll();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(611);
				listComprehension();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(612);
				patternComprehension();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(613);
				filterWith();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(614);
				relationshipsChainPattern();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(615);
				parenthesizedExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(616);
				functionInvocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(617);
				symbol();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(618);
				subqueryExist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LhsContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CypherParser.ASSIGN, 0); }
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitLhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitLhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_lhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			symbol();
			setState(622);
			match(ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationshipPatternContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CypherParser.LT, 0); }
		public List<TerminalNode> SUB() { return getTokens(CypherParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(CypherParser.SUB, i);
		}
		public RelationDetailContext relationDetail() {
			return getRuleContext(RelationDetailContext.class,0);
		}
		public TerminalNode GT() { return getToken(CypherParser.GT, 0); }
		public RelationshipPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationshipPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRelationshipPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRelationshipPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRelationshipPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipPatternContext relationshipPattern() throws RecognitionException {
		RelationshipPatternContext _localctx = new RelationshipPatternContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_relationshipPattern);
		int _la;
		try {
			setState(641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				match(LT);
				setState(625);
				match(SUB);
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(626);
					relationDetail();
					}
				}

				setState(629);
				match(SUB);
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GT) {
					{
					setState(630);
					match(GT);
					}
				}

				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(SUB);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(634);
					relationDetail();
					}
				}

				setState(637);
				match(SUB);
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GT) {
					{
					setState(638);
					match(GT);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationDetailContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(CypherParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CypherParser.RBRACK, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public RelationshipTypesContext relationshipTypes() {
			return getRuleContext(RelationshipTypesContext.class,0);
		}
		public RangeLitContext rangeLit() {
			return getRuleContext(RangeLitContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public RelationDetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationDetail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRelationDetail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRelationDetail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRelationDetail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationDetailContext relationDetail() throws RecognitionException {
		RelationDetailContext _localctx = new RelationDetailContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_relationDetail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(LBRACK);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (FILTER - 30)) | (1L << (EXTRACT - 30)) | (1L << (COUNT - 30)) | (1L << (ANY - 30)) | (1L << (NONE - 30)) | (1L << (SINGLE - 30)) | (1L << (ID - 30)) | (1L << (ESC_LITERAL - 30)))) != 0)) {
				{
				setState(644);
				symbol();
				}
			}

			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(647);
				relationshipTypes();
				}
			}

			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULT) {
				{
				setState(650);
				rangeLit();
				}
			}

			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE || _la==DOLLAR) {
				{
				setState(653);
				properties();
				}
			}

			setState(656);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationshipTypesContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(CypherParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CypherParser.COLON, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> STICK() { return getTokens(CypherParser.STICK); }
		public TerminalNode STICK(int i) {
			return getToken(CypherParser.STICK, i);
		}
		public RelationshipTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationshipTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRelationshipTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRelationshipTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRelationshipTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipTypesContext relationshipTypes() throws RecognitionException {
		RelationshipTypesContext _localctx = new RelationshipTypesContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_relationshipTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(COLON);
			setState(659);
			name();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STICK) {
				{
				{
				setState(660);
				match(STICK);
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(661);
					match(COLON);
					}
				}

				setState(664);
				name();
				}
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(CypherParser.UNION, 0); }
		public SingleQueryContext singleQuery() {
			return getRuleContext(SingleQueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(CypherParser.ALL, 0); }
		public UnionStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterUnionSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitUnionSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitUnionSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionStContext unionSt() throws RecognitionException {
		UnionStContext _localctx = new UnionStContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unionSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(UNION);
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL) {
				{
				setState(671);
				match(ALL);
				}
			}

			setState(674);
			singleQuery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryExistContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public TerminalNode LBRACE() { return getToken(CypherParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CypherParser.RBRACE, 0); }
		public RegularQueryContext regularQuery() {
			return getRuleContext(RegularQueryContext.class,0);
		}
		public PatternWhereContext patternWhere() {
			return getRuleContext(PatternWhereContext.class,0);
		}
		public SubqueryExistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryExist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSubqueryExist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSubqueryExist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSubqueryExist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryExistContext subqueryExist() throws RecognitionException {
		SubqueryExistContext _localctx = new SubqueryExistContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_subqueryExist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(EXISTS);
			setState(677);
			match(LBRACE);
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case CREATE:
			case DELETE:
			case DETACH:
			case MATCH:
			case MERGE:
			case OPTIONAL:
			case REMOVE:
			case RETURN:
			case SET:
			case WITH:
			case UNWIND:
				{
				setState(678);
				regularQuery();
				}
				break;
			case LPAREN:
			case FILTER:
			case EXTRACT:
			case COUNT:
			case ANY:
			case NONE:
			case SINGLE:
			case ID:
			case ESC_LITERAL:
				{
				setState(679);
				patternWhere();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(682);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvocationNameContext extends ParserRuleContext {
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(CypherParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CypherParser.DOT, i);
		}
		public InvocationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterInvocationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitInvocationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitInvocationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvocationNameContext invocationName() throws RecognitionException {
		InvocationNameContext _localctx = new InvocationNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_invocationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			symbol();
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(685);
				match(DOT);
				setState(686);
				symbol();
				}
				}
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionInvocationContext extends ParserRuleContext {
		public InvocationNameContext invocationName() {
			return getRuleContext(InvocationNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode DISTINCT() { return getToken(CypherParser.DISTINCT, 0); }
		public ExpressionChainContext expressionChain() {
			return getRuleContext(ExpressionChainContext.class,0);
		}
		public FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterFunctionInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitFunctionInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitFunctionInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInvocationContext functionInvocation() throws RecognitionException {
		FunctionInvocationContext _localctx = new FunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_functionInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			invocationName();
			setState(693);
			match(LPAREN);
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(694);
				match(DISTINCT);
				}
			}

			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SUB) | (1L << PLUS) | (1L << DOLLAR) | (1L << FILTER) | (1L << EXTRACT) | (1L << COUNT) | (1L << ANY) | (1L << NONE) | (1L << SINGLE) | (1L << ALL) | (1L << EXISTS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NOT - 67)) | (1L << (FALSE - 67)) | (1L << (TRUE - 67)) | (1L << (NULL_W - 67)) | (1L << (CASE - 67)) | (1L << (ID - 67)) | (1L << (ESC_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (DIGIT - 67)))) != 0)) {
				{
				setState(697);
				expressionChain();
				}
			}

			setState(700);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(LPAREN);
			setState(703);
			expression();
			setState(704);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterWithContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public FilterExpressionContext filterExpression() {
			return getRuleContext(FilterExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public TerminalNode ALL() { return getToken(CypherParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(CypherParser.ANY, 0); }
		public TerminalNode NONE() { return getToken(CypherParser.NONE, 0); }
		public TerminalNode SINGLE() { return getToken(CypherParser.SINGLE, 0); }
		public FilterWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterFilterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitFilterWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitFilterWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterWithContext filterWith() throws RecognitionException {
		FilterWithContext _localctx = new FilterWithContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_filterWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << NONE) | (1L << SINGLE) | (1L << ALL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(707);
			match(LPAREN);
			setState(708);
			filterExpression();
			setState(709);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternComprehensionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(CypherParser.LBRACK, 0); }
		public RelationshipsChainPatternContext relationshipsChainPattern() {
			return getRuleContext(RelationshipsChainPatternContext.class,0);
		}
		public TerminalNode STICK() { return getToken(CypherParser.STICK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(CypherParser.RBRACK, 0); }
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public PatternComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterPatternComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitPatternComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitPatternComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternComprehensionContext patternComprehension() throws RecognitionException {
		PatternComprehensionContext _localctx = new PatternComprehensionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_patternComprehension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(LBRACK);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (FILTER - 30)) | (1L << (EXTRACT - 30)) | (1L << (COUNT - 30)) | (1L << (ANY - 30)) | (1L << (NONE - 30)) | (1L << (SINGLE - 30)) | (1L << (ID - 30)) | (1L << (ESC_LITERAL - 30)))) != 0)) {
				{
				setState(712);
				lhs();
				}
			}

			setState(715);
			relationshipsChainPattern();
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(716);
				where();
				}
			}

			setState(719);
			match(STICK);
			setState(720);
			expression();
			setState(721);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationshipsChainPatternContext extends ParserRuleContext {
		public NodePatternContext nodePattern() {
			return getRuleContext(NodePatternContext.class,0);
		}
		public List<PatternElemChainContext> patternElemChain() {
			return getRuleContexts(PatternElemChainContext.class);
		}
		public PatternElemChainContext patternElemChain(int i) {
			return getRuleContext(PatternElemChainContext.class,i);
		}
		public RelationshipsChainPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationshipsChainPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRelationshipsChainPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRelationshipsChainPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRelationshipsChainPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipsChainPatternContext relationshipsChainPattern() throws RecognitionException {
		RelationshipsChainPatternContext _localctx = new RelationshipsChainPatternContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_relationshipsChainPattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			nodePattern();
			setState(725); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(724);
					patternElemChain();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(727); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListComprehensionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(CypherParser.LBRACK, 0); }
		public FilterExpressionContext filterExpression() {
			return getRuleContext(FilterExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(CypherParser.RBRACK, 0); }
		public TerminalNode STICK() { return getToken(CypherParser.STICK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterListComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitListComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitListComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListComprehensionContext listComprehension() throws RecognitionException {
		ListComprehensionContext _localctx = new ListComprehensionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_listComprehension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(LBRACK);
			setState(730);
			filterExpression();
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STICK) {
				{
				setState(731);
				match(STICK);
				setState(732);
				expression();
				}
			}

			setState(735);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterExpressionContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public FilterExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterFilterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitFilterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitFilterExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterExpressionContext filterExpression() throws RecognitionException {
		FilterExpressionContext _localctx = new FilterExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_filterExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			symbol();
			setState(738);
			match(IN);
			setState(739);
			expression();
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(740);
				where();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CountAllContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(CypherParser.COUNT, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public TerminalNode MULT() { return getToken(CypherParser.MULT, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public CountAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countAll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterCountAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitCountAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitCountAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountAllContext countAll() throws RecognitionException {
		CountAllContext _localctx = new CountAllContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_countAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(COUNT);
			setState(744);
			match(LPAREN);
			setState(745);
			match(MULT);
			setState(746);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionChainContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public ExpressionChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterExpressionChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitExpressionChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitExpressionChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionChainContext expressionChain() throws RecognitionException {
		ExpressionChainContext _localctx = new ExpressionChainContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_expressionChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			expression();
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(749);
				match(COMMA);
				setState(750);
				expression();
				}
				}
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CypherParser.CASE, 0); }
		public TerminalNode END() { return getToken(CypherParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> WHEN() { return getTokens(CypherParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(CypherParser.WHEN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(CypherParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(CypherParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(CypherParser.ELSE, 0); }
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitCaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(CASE);
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SUB) | (1L << PLUS) | (1L << DOLLAR) | (1L << FILTER) | (1L << EXTRACT) | (1L << COUNT) | (1L << ANY) | (1L << NONE) | (1L << SINGLE) | (1L << ALL) | (1L << EXISTS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NOT - 67)) | (1L << (FALSE - 67)) | (1L << (TRUE - 67)) | (1L << (NULL_W - 67)) | (1L << (CASE - 67)) | (1L << (ID - 67)) | (1L << (ESC_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (DIGIT - 67)))) != 0)) {
				{
				setState(757);
				expression();
				}
			}

			setState(765); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(760);
				match(WHEN);
				setState(761);
				expression();
				setState(762);
				match(THEN);
				setState(763);
				expression();
				}
				}
				setState(767); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(769);
				match(ELSE);
				setState(770);
				expression();
				}
			}

			setState(773);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(CypherParser.DOLLAR, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public NumLitContext numLit() {
			return getRuleContext(NumLitContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(DOLLAR);
			setState(778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILTER:
			case EXTRACT:
			case COUNT:
			case ANY:
			case NONE:
			case SINGLE:
			case ID:
			case ESC_LITERAL:
				{
				setState(776);
				symbol();
				}
				break;
			case DIGIT:
				{
				setState(777);
				numLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public BoolLitContext boolLit() {
			return getRuleContext(BoolLitContext.class,0);
		}
		public NumLitContext numLit() {
			return getRuleContext(NumLitContext.class,0);
		}
		public TerminalNode NULL_W() { return getToken(CypherParser.NULL_W, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public CharLitContext charLit() {
			return getRuleContext(CharLitContext.class,0);
		}
		public ListLitContext listLit() {
			return getRuleContext(ListLitContext.class,0);
		}
		public MapLitContext mapLit() {
			return getRuleContext(MapLitContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_literal);
		try {
			setState(787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				boolLit();
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				numLit();
				}
				break;
			case NULL_W:
				enterOuterAlt(_localctx, 3);
				{
				setState(782);
				match(NULL_W);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(783);
				stringLit();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(784);
				charLit();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 6);
				{
				setState(785);
				listLit();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(786);
				mapLit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeLitContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(CypherParser.MULT, 0); }
		public List<NumLitContext> numLit() {
			return getRuleContexts(NumLitContext.class);
		}
		public NumLitContext numLit(int i) {
			return getRuleContext(NumLitContext.class,i);
		}
		public TerminalNode RANGE() { return getToken(CypherParser.RANGE, 0); }
		public RangeLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterRangeLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitRangeLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitRangeLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeLitContext rangeLit() throws RecognitionException {
		RangeLitContext _localctx = new RangeLitContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_rangeLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(MULT);
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(790);
				numLit();
				}
			}

			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE) {
				{
				setState(793);
				match(RANGE);
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIGIT) {
					{
					setState(794);
					numLit();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolLitContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CypherParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CypherParser.FALSE, 0); }
		public BoolLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterBoolLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitBoolLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitBoolLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLitContext boolLit() throws RecognitionException {
		BoolLitContext _localctx = new BoolLitContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_boolLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumLitContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(CypherParser.DIGIT, 0); }
		public NumLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterNumLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitNumLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitNumLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumLitContext numLit() throws RecognitionException {
		NumLitContext _localctx = new NumLitContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_numLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLitContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(CypherParser.STRING_LITERAL, 0); }
		public StringLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterStringLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitStringLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitStringLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLitContext stringLit() throws RecognitionException {
		StringLitContext _localctx = new StringLitContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_stringLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharLitContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(CypherParser.CHAR_LITERAL, 0); }
		public CharLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterCharLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitCharLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitCharLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharLitContext charLit() throws RecognitionException {
		CharLitContext _localctx = new CharLitContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_charLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(CHAR_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListLitContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(CypherParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CypherParser.RBRACK, 0); }
		public ExpressionChainContext expressionChain() {
			return getRuleContext(ExpressionChainContext.class,0);
		}
		public ListLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterListLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitListLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitListLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLitContext listLit() throws RecognitionException {
		ListLitContext _localctx = new ListLitContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_listLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(LBRACK);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << SUB) | (1L << PLUS) | (1L << DOLLAR) | (1L << FILTER) | (1L << EXTRACT) | (1L << COUNT) | (1L << ANY) | (1L << NONE) | (1L << SINGLE) | (1L << ALL) | (1L << EXISTS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (NOT - 67)) | (1L << (FALSE - 67)) | (1L << (TRUE - 67)) | (1L << (NULL_W - 67)) | (1L << (CASE - 67)) | (1L << (ID - 67)) | (1L << (ESC_LITERAL - 67)) | (1L << (CHAR_LITERAL - 67)) | (1L << (STRING_LITERAL - 67)) | (1L << (DIGIT - 67)))) != 0)) {
				{
				setState(808);
				expressionChain();
				}
			}

			setState(811);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapLitContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CypherParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CypherParser.RBRACE, 0); }
		public List<MapPairContext> mapPair() {
			return getRuleContexts(MapPairContext.class);
		}
		public MapPairContext mapPair(int i) {
			return getRuleContext(MapPairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public MapLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterMapLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitMapLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitMapLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapLitContext mapLit() throws RecognitionException {
		MapLitContext _localctx = new MapLitContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_mapLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(LBRACE);
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (FILTER - 30)) | (1L << (EXTRACT - 30)) | (1L << (COUNT - 30)) | (1L << (ANY - 30)) | (1L << (NONE - 30)) | (1L << (SINGLE - 30)) | (1L << (ALL - 30)) | (1L << (ASC - 30)) | (1L << (ASCENDING - 30)) | (1L << (BY - 30)) | (1L << (CREATE - 30)) | (1L << (DELETE - 30)) | (1L << (DESC - 30)) | (1L << (DESCENDING - 30)) | (1L << (DETACH - 30)) | (1L << (EXISTS - 30)) | (1L << (LIMIT - 30)) | (1L << (MATCH - 30)) | (1L << (MERGE - 30)) | (1L << (ON - 30)) | (1L << (OPTIONAL - 30)) | (1L << (ORDER - 30)) | (1L << (REMOVE - 30)) | (1L << (RETURN - 30)) | (1L << (SET - 30)) | (1L << (SKIP_W - 30)) | (1L << (WHERE - 30)) | (1L << (WITH - 30)) | (1L << (UNION - 30)) | (1L << (UNWIND - 30)) | (1L << (AND - 30)) | (1L << (AS - 30)) | (1L << (CONTAINS - 30)) | (1L << (DISTINCT - 30)) | (1L << (ENDS - 30)) | (1L << (IN - 30)) | (1L << (IS - 30)) | (1L << (NOT - 30)) | (1L << (OR - 30)) | (1L << (STARTS - 30)) | (1L << (XOR - 30)) | (1L << (FALSE - 30)) | (1L << (TRUE - 30)) | (1L << (NULL_W - 30)) | (1L << (CONSTRAINT - 30)) | (1L << (DO - 30)) | (1L << (FOR - 30)) | (1L << (REQUIRE - 30)) | (1L << (UNIQUE - 30)) | (1L << (CASE - 30)) | (1L << (WHEN - 30)) | (1L << (THEN - 30)) | (1L << (ELSE - 30)) | (1L << (END - 30)) | (1L << (MANDATORY - 30)) | (1L << (SCALAR - 30)) | (1L << (OF - 30)) | (1L << (ADD - 30)) | (1L << (DROP - 30)) | (1L << (ID - 30)) | (1L << (ESC_LITERAL - 30)))) != 0)) {
				{
				setState(814);
				mapPair();
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(815);
					match(COMMA);
					setState(816);
					mapPair();
					}
					}
					setState(821);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(824);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapPairContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CypherParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MapPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterMapPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitMapPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitMapPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapPairContext mapPair() throws RecognitionException {
		MapPairContext _localctx = new MapPairContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_mapPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			name();
			setState(827);
			match(COLON);
			setState(828);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_name);
		try {
			setState(832);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILTER:
			case EXTRACT:
			case COUNT:
			case ANY:
			case NONE:
			case SINGLE:
			case ID:
			case ESC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				symbol();
				}
				break;
			case ALL:
			case ASC:
			case ASCENDING:
			case BY:
			case CREATE:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DETACH:
			case EXISTS:
			case LIMIT:
			case MATCH:
			case MERGE:
			case ON:
			case OPTIONAL:
			case ORDER:
			case REMOVE:
			case RETURN:
			case SET:
			case SKIP_W:
			case WHERE:
			case WITH:
			case UNION:
			case UNWIND:
			case AND:
			case AS:
			case CONTAINS:
			case DISTINCT:
			case ENDS:
			case IN:
			case IS:
			case NOT:
			case OR:
			case STARTS:
			case XOR:
			case FALSE:
			case TRUE:
			case NULL_W:
			case CONSTRAINT:
			case DO:
			case FOR:
			case REQUIRE:
			case UNIQUE:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case MANDATORY:
			case SCALAR:
			case OF:
			case ADD:
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				reservedWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode ESC_LITERAL() { return getToken(CypherParser.ESC_LITERAL, 0); }
		public TerminalNode ID() { return getToken(CypherParser.ID, 0); }
		public TerminalNode COUNT() { return getToken(CypherParser.COUNT, 0); }
		public TerminalNode FILTER() { return getToken(CypherParser.FILTER, 0); }
		public TerminalNode EXTRACT() { return getToken(CypherParser.EXTRACT, 0); }
		public TerminalNode ANY() { return getToken(CypherParser.ANY, 0); }
		public TerminalNode NONE() { return getToken(CypherParser.NONE, 0); }
		public TerminalNode SINGLE() { return getToken(CypherParser.SINGLE, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			_la = _input.LA(1);
			if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (FILTER - 30)) | (1L << (EXTRACT - 30)) | (1L << (COUNT - 30)) | (1L << (ANY - 30)) | (1L << (NONE - 30)) | (1L << (SINGLE - 30)) | (1L << (ID - 30)) | (1L << (ESC_LITERAL - 30)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReservedWordContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(CypherParser.ALL, 0); }
		public TerminalNode ASC() { return getToken(CypherParser.ASC, 0); }
		public TerminalNode ASCENDING() { return getToken(CypherParser.ASCENDING, 0); }
		public TerminalNode BY() { return getToken(CypherParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(CypherParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(CypherParser.DELETE, 0); }
		public TerminalNode DESC() { return getToken(CypherParser.DESC, 0); }
		public TerminalNode DESCENDING() { return getToken(CypherParser.DESCENDING, 0); }
		public TerminalNode DETACH() { return getToken(CypherParser.DETACH, 0); }
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public TerminalNode LIMIT() { return getToken(CypherParser.LIMIT, 0); }
		public TerminalNode MATCH() { return getToken(CypherParser.MATCH, 0); }
		public TerminalNode MERGE() { return getToken(CypherParser.MERGE, 0); }
		public TerminalNode ON() { return getToken(CypherParser.ON, 0); }
		public TerminalNode OPTIONAL() { return getToken(CypherParser.OPTIONAL, 0); }
		public TerminalNode ORDER() { return getToken(CypherParser.ORDER, 0); }
		public TerminalNode REMOVE() { return getToken(CypherParser.REMOVE, 0); }
		public TerminalNode RETURN() { return getToken(CypherParser.RETURN, 0); }
		public TerminalNode SET() { return getToken(CypherParser.SET, 0); }
		public TerminalNode SKIP_W() { return getToken(CypherParser.SKIP_W, 0); }
		public TerminalNode WHERE() { return getToken(CypherParser.WHERE, 0); }
		public TerminalNode WITH() { return getToken(CypherParser.WITH, 0); }
		public TerminalNode UNION() { return getToken(CypherParser.UNION, 0); }
		public TerminalNode UNWIND() { return getToken(CypherParser.UNWIND, 0); }
		public TerminalNode AND() { return getToken(CypherParser.AND, 0); }
		public TerminalNode AS() { return getToken(CypherParser.AS, 0); }
		public TerminalNode CONTAINS() { return getToken(CypherParser.CONTAINS, 0); }
		public TerminalNode DISTINCT() { return getToken(CypherParser.DISTINCT, 0); }
		public TerminalNode ENDS() { return getToken(CypherParser.ENDS, 0); }
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public TerminalNode IS() { return getToken(CypherParser.IS, 0); }
		public TerminalNode NOT() { return getToken(CypherParser.NOT, 0); }
		public TerminalNode OR() { return getToken(CypherParser.OR, 0); }
		public TerminalNode STARTS() { return getToken(CypherParser.STARTS, 0); }
		public TerminalNode XOR() { return getToken(CypherParser.XOR, 0); }
		public TerminalNode FALSE() { return getToken(CypherParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(CypherParser.TRUE, 0); }
		public TerminalNode NULL_W() { return getToken(CypherParser.NULL_W, 0); }
		public TerminalNode CONSTRAINT() { return getToken(CypherParser.CONSTRAINT, 0); }
		public TerminalNode DO() { return getToken(CypherParser.DO, 0); }
		public TerminalNode FOR() { return getToken(CypherParser.FOR, 0); }
		public TerminalNode REQUIRE() { return getToken(CypherParser.REQUIRE, 0); }
		public TerminalNode UNIQUE() { return getToken(CypherParser.UNIQUE, 0); }
		public TerminalNode CASE() { return getToken(CypherParser.CASE, 0); }
		public TerminalNode WHEN() { return getToken(CypherParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(CypherParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(CypherParser.ELSE, 0); }
		public TerminalNode END() { return getToken(CypherParser.END, 0); }
		public TerminalNode MANDATORY() { return getToken(CypherParser.MANDATORY, 0); }
		public TerminalNode SCALAR() { return getToken(CypherParser.SCALAR, 0); }
		public TerminalNode OF() { return getToken(CypherParser.OF, 0); }
		public TerminalNode ADD() { return getToken(CypherParser.ADD, 0); }
		public TerminalNode DROP() { return getToken(CypherParser.DROP, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitReservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_reservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ALL - 36)) | (1L << (ASC - 36)) | (1L << (ASCENDING - 36)) | (1L << (BY - 36)) | (1L << (CREATE - 36)) | (1L << (DELETE - 36)) | (1L << (DESC - 36)) | (1L << (DESCENDING - 36)) | (1L << (DETACH - 36)) | (1L << (EXISTS - 36)) | (1L << (LIMIT - 36)) | (1L << (MATCH - 36)) | (1L << (MERGE - 36)) | (1L << (ON - 36)) | (1L << (OPTIONAL - 36)) | (1L << (ORDER - 36)) | (1L << (REMOVE - 36)) | (1L << (RETURN - 36)) | (1L << (SET - 36)) | (1L << (SKIP_W - 36)) | (1L << (WHERE - 36)) | (1L << (WITH - 36)) | (1L << (UNION - 36)) | (1L << (UNWIND - 36)) | (1L << (AND - 36)) | (1L << (AS - 36)) | (1L << (CONTAINS - 36)) | (1L << (DISTINCT - 36)) | (1L << (ENDS - 36)) | (1L << (IN - 36)) | (1L << (IS - 36)) | (1L << (NOT - 36)) | (1L << (OR - 36)) | (1L << (STARTS - 36)) | (1L << (XOR - 36)) | (1L << (FALSE - 36)) | (1L << (TRUE - 36)) | (1L << (NULL_W - 36)) | (1L << (CONSTRAINT - 36)) | (1L << (DO - 36)) | (1L << (FOR - 36)) | (1L << (REQUIRE - 36)) | (1L << (UNIQUE - 36)) | (1L << (CASE - 36)) | (1L << (WHEN - 36)) | (1L << (THEN - 36)) | (1L << (ELSE - 36)) | (1L << (END - 36)) | (1L << (MANDATORY - 36)) | (1L << (SCALAR - 36)) | (1L << (OF - 36)) | (1L << (ADD - 36)) | (1L << (DROP - 36)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001c\u0347\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u00b7\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00be\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u00c2\b\u0002\n\u0002\f\u0002\u00c5\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00c9\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00ce\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00d3\b\u0004\u0003\u0004\u00d5\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00e3\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0003\n\u00ec\b\n\u0001"+
		"\n\u0001\n\u0003\n\u00f0\b\n\u0001\n\u0003\n\u00f3\b\n\u0001\n\u0003\n"+
		"\u00f6\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u00fa\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00fe\b\u000b\n\u000b\f\u000b\u0101\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0106\b\f\u0001\r\u0001\r\u0003\r\u010a\b\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0111\b\u000e\n\u000e\f\u000e\u0114\t\u000e\u0001\u000f\u0005\u000f\u0117"+
		"\b\u000f\n\u000f\f\u000f\u011a\t\u000f\u0001\u000f\u0001\u000f\u0004\u000f"+
		"\u011e\b\u000f\u000b\u000f\f\u000f\u011f\u0001\u000f\u0003\u000f\u0123"+
		"\b\u000f\u0003\u000f\u0125\b\u000f\u0001\u0010\u0005\u0010\u0128\b\u0010"+
		"\n\u0010\f\u0010\u012b\t\u0010\u0001\u0010\u0005\u0010\u012e\b\u0010\n"+
		"\u0010\f\u0010\u0131\t\u0010\u0001\u0010\u0004\u0010\u0134\b\u0010\u000b"+
		"\u0010\f\u0010\u0135\u0001\u0010\u0001\u0010\u0001\u0011\u0003\u0011\u013b"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0148\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u014f\b\u0014\u0001\u0015\u0003\u0015\u0152\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u015b\b\u0016\n\u0016\f\u0016\u015e\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0164\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u016b"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u016f\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0176\b\u001a"+
		"\n\u001a\f\u001a\u0179\t\u001a\u0001\u001a\u0003\u001a\u017c\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0181\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0188\b\u001c\n"+
		"\u001c\f\u001c\u018b\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0195"+
		"\b\u001e\n\u001e\f\u001e\u0198\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u01a5\b\u001f\u0001 \u0001 \u0004"+
		" \u01a9\b \u000b \f \u01aa\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0003"+
		"\"\u01b2\b\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u01ba\b"+
		"$\n$\f$\u01bd\t$\u0001%\u0001%\u0001%\u0005%\u01c2\b%\n%\f%\u01c5\t%\u0001"+
		"&\u0001&\u0001&\u0005&\u01ca\b&\n&\f&\u01cd\t&\u0001\'\u0001\'\u0001\'"+
		"\u0005\'\u01d2\b\'\n\'\f\'\u01d5\t\'\u0001(\u0003(\u01d8\b(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0005)\u01e0\b)\n)\f)\u01e3\t)\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0005+\u01ea\b+\n+\f+\u01ed\t+\u0001,\u0001,\u0001"+
		",\u0005,\u01f2\b,\n,\f,\u01f5\t,\u0001-\u0001-\u0001-\u0005-\u01fa\b-"+
		"\n-\f-\u01fd\t-\u0001.\u0003.\u0200\b.\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0001/\u0005/\u0208\b/\n/\f/\u020b\t/\u00010\u00010\u00010\u00010\u0003"+
		"0\u0211\b0\u00010\u00010\u00030\u0215\b0\u00010\u00030\u0218\b0\u0001"+
		"0\u00030\u021b\b0\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u0225\b2\u00013\u00013\u00033\u0229\b3\u00013\u00013\u00014\u0001"+
		"4\u00034\u022f\b4\u00015\u00015\u00015\u00055\u0234\b5\n5\f5\u0237\t5"+
		"\u00016\u00016\u00016\u00036\u023c\b6\u00016\u00016\u00017\u00017\u0005"+
		"7\u0242\b7\n7\f7\u0245\t7\u00017\u00017\u00017\u00017\u00037\u024b\b7"+
		"\u00018\u00018\u00018\u00019\u00019\u00039\u0252\b9\u0001:\u0001:\u0003"+
		":\u0256\b:\u0001:\u0003:\u0259\b:\u0001:\u0003:\u025c\b:\u0001:\u0001"+
		":\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0003;\u026c\b;\u0001<\u0001<\u0001<\u0001=\u0001=\u0001"+
		"=\u0003=\u0274\b=\u0001=\u0001=\u0003=\u0278\b=\u0001=\u0001=\u0003=\u027c"+
		"\b=\u0001=\u0001=\u0003=\u0280\b=\u0003=\u0282\b=\u0001>\u0001>\u0003"+
		">\u0286\b>\u0001>\u0003>\u0289\b>\u0001>\u0003>\u028c\b>\u0001>\u0003"+
		">\u028f\b>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0003?\u0297\b?\u0001"+
		"?\u0005?\u029a\b?\n?\f?\u029d\t?\u0001@\u0001@\u0003@\u02a1\b@\u0001@"+
		"\u0001@\u0001A\u0001A\u0001A\u0001A\u0003A\u02a9\bA\u0001A\u0001A\u0001"+
		"B\u0001B\u0001B\u0005B\u02b0\bB\nB\fB\u02b3\tB\u0001C\u0001C\u0001C\u0003"+
		"C\u02b8\bC\u0001C\u0003C\u02bb\bC\u0001C\u0001C\u0001D\u0001D\u0001D\u0001"+
		"D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0003F\u02ca\bF\u0001"+
		"F\u0001F\u0003F\u02ce\bF\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0004"+
		"G\u02d6\bG\u000bG\fG\u02d7\u0001H\u0001H\u0001H\u0001H\u0003H\u02de\b"+
		"H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0003I\u02e6\bI\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0005K\u02f0\bK\nK\fK\u02f3"+
		"\tK\u0001L\u0001L\u0003L\u02f7\bL\u0001L\u0001L\u0001L\u0001L\u0001L\u0004"+
		"L\u02fe\bL\u000bL\fL\u02ff\u0001L\u0001L\u0003L\u0304\bL\u0001L\u0001"+
		"L\u0001M\u0001M\u0001M\u0003M\u030b\bM\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001N\u0003N\u0314\bN\u0001O\u0001O\u0003O\u0318\bO\u0001O\u0001"+
		"O\u0003O\u031c\bO\u0003O\u031e\bO\u0001P\u0001P\u0001Q\u0001Q\u0001R\u0001"+
		"R\u0001S\u0001S\u0001T\u0001T\u0003T\u032a\bT\u0001T\u0001T\u0001U\u0001"+
		"U\u0001U\u0001U\u0005U\u0332\bU\nU\fU\u0335\tU\u0003U\u0337\bU\u0001U"+
		"\u0001U\u0001V\u0001V\u0001V\u0001V\u0001W\u0001W\u0003W\u0341\bW\u0001"+
		"X\u0001X\u0001Y\u0001Y\u0001Y\u0000\u0000Z\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u0000\n\u0002\u0000%"+
		"&*+\u0002\u0000((//\u0001\u0000\u0001\u0002\u0002\u0000\u0001\u0001\u0003"+
		"\u0007\u0001\u0000\u0012\u0013\u0002\u0000\u0014\u0015\u0017\u0017\u0001"+
		"\u0000!$\u0001\u0000GH\u0002\u0000\u001e#YZ\u0001\u0000$X\u0369\u0000"+
		"\u00b4\u0001\u0000\u0000\u0000\u0002\u00bd\u0001\u0000\u0000\u0000\u0004"+
		"\u00bf\u0001\u0000\u0000\u0000\u0006\u00c8\u0001\u0000\u0000\u0000\b\u00ca"+
		"\u0001\u0000\u0000\u0000\n\u00d6\u0001\u0000\u0000\u0000\f\u00dc\u0001"+
		"\u0000\u0000\u0000\u000e\u00df\u0001\u0000\u0000\u0000\u0010\u00e4\u0001"+
		"\u0000\u0000\u0000\u0012\u00e7\u0001\u0000\u0000\u0000\u0014\u00eb\u0001"+
		"\u0000\u0000\u0000\u0016\u00f9\u0001\u0000\u0000\u0000\u0018\u0102\u0001"+
		"\u0000\u0000\u0000\u001a\u0107\u0001\u0000\u0000\u0000\u001c\u010b\u0001"+
		"\u0000\u0000\u0000\u001e\u0118\u0001\u0000\u0000\u0000 \u0133\u0001\u0000"+
		"\u0000\u0000\"\u013a\u0001\u0000\u0000\u0000$\u013f\u0001\u0000\u0000"+
		"\u0000&\u0147\u0001\u0000\u0000\u0000(\u014e\u0001\u0000\u0000\u0000*"+
		"\u0151\u0001\u0000\u0000\u0000,\u0156\u0001\u0000\u0000\u0000.\u0163\u0001"+
		"\u0000\u0000\u00000\u0165\u0001\u0000\u0000\u00002\u016c\u0001\u0000\u0000"+
		"\u00004\u0172\u0001\u0000\u0000\u00006\u0180\u0001\u0000\u0000\u00008"+
		"\u0184\u0001\u0000\u0000\u0000:\u018c\u0001\u0000\u0000\u0000<\u0190\u0001"+
		"\u0000\u0000\u0000>\u01a4\u0001\u0000\u0000\u0000@\u01a8\u0001\u0000\u0000"+
		"\u0000B\u01ac\u0001\u0000\u0000\u0000D\u01af\u0001\u0000\u0000\u0000F"+
		"\u01b3\u0001\u0000\u0000\u0000H\u01b6\u0001\u0000\u0000\u0000J\u01be\u0001"+
		"\u0000\u0000\u0000L\u01c6\u0001\u0000\u0000\u0000N\u01ce\u0001\u0000\u0000"+
		"\u0000P\u01d7\u0001\u0000\u0000\u0000R\u01db\u0001\u0000\u0000\u0000T"+
		"\u01e4\u0001\u0000\u0000\u0000V\u01e6\u0001\u0000\u0000\u0000X\u01ee\u0001"+
		"\u0000\u0000\u0000Z\u01f6\u0001\u0000\u0000\u0000\\\u01ff\u0001\u0000"+
		"\u0000\u0000^\u0203\u0001\u0000\u0000\u0000`\u021a\u0001\u0000\u0000\u0000"+
		"b\u021c\u0001\u0000\u0000\u0000d\u0224\u0001\u0000\u0000\u0000f\u0226"+
		"\u0001\u0000\u0000\u0000h\u022c\u0001\u0000\u0000\u0000j\u0230\u0001\u0000"+
		"\u0000\u0000l\u023b\u0001\u0000\u0000\u0000n\u024a\u0001\u0000\u0000\u0000"+
		"p\u024c\u0001\u0000\u0000\u0000r\u0251\u0001\u0000\u0000\u0000t\u0253"+
		"\u0001\u0000\u0000\u0000v\u026b\u0001\u0000\u0000\u0000x\u026d\u0001\u0000"+
		"\u0000\u0000z\u0281\u0001\u0000\u0000\u0000|\u0283\u0001\u0000\u0000\u0000"+
		"~\u0292\u0001\u0000\u0000\u0000\u0080\u029e\u0001\u0000\u0000\u0000\u0082"+
		"\u02a4\u0001\u0000\u0000\u0000\u0084\u02ac\u0001\u0000\u0000\u0000\u0086"+
		"\u02b4\u0001\u0000\u0000\u0000\u0088\u02be\u0001\u0000\u0000\u0000\u008a"+
		"\u02c2\u0001\u0000\u0000\u0000\u008c\u02c7\u0001\u0000\u0000\u0000\u008e"+
		"\u02d3\u0001\u0000\u0000\u0000\u0090\u02d9\u0001\u0000\u0000\u0000\u0092"+
		"\u02e1\u0001\u0000\u0000\u0000\u0094\u02e7\u0001\u0000\u0000\u0000\u0096"+
		"\u02ec\u0001\u0000\u0000\u0000\u0098\u02f4\u0001\u0000\u0000\u0000\u009a"+
		"\u0307\u0001\u0000\u0000\u0000\u009c\u0313\u0001\u0000\u0000\u0000\u009e"+
		"\u0315\u0001\u0000\u0000\u0000\u00a0\u031f\u0001\u0000\u0000\u0000\u00a2"+
		"\u0321\u0001\u0000\u0000\u0000\u00a4\u0323\u0001\u0000\u0000\u0000\u00a6"+
		"\u0325\u0001\u0000\u0000\u0000\u00a8\u0327\u0001\u0000\u0000\u0000\u00aa"+
		"\u032d\u0001\u0000\u0000\u0000\u00ac\u033a\u0001\u0000\u0000\u0000\u00ae"+
		"\u0340\u0001\u0000\u0000\u0000\u00b0\u0342\u0001\u0000\u0000\u0000\u00b2"+
		"\u0344\u0001\u0000\u0000\u0000\u00b4\u00b6\u0003\u0002\u0001\u0000\u00b5"+
		"\u00b7\u0005\t\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0005\u0000\u0000\u0001\u00b9\u0001\u0001\u0000\u0000\u0000\u00ba\u00be"+
		"\u0003\u0004\u0002\u0000\u00bb\u00be\u0003\b\u0004\u0000\u00bc\u00be\u0003"+
		"\n\u0005\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u0003\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c3\u0003\u0006\u0003\u0000\u00c0\u00c2\u0003\u0080"+
		"@\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u0005\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c9\u0003\u001e\u000f\u0000\u00c7\u00c9\u0003 \u0010\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c9\u0007\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u001c\u0000\u0000"+
		"\u00cb\u00cd\u0003\u0084B\u0000\u00cc\u00ce\u00032\u0019\u0000\u00cd\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d4"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d2\u0005\u001d\u0000\u0000\u00d0\u00d3"+
		"\u0005\u0017\u0000\u0000\u00d1\u00d3\u00034\u001a\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d5\t\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u001c"+
		"\u0000\u0000\u00d7\u00d8\u0005\u000e\u0000\u0000\u00d8\u00d9\u0003\u0002"+
		"\u0001\u0000\u00d9\u00da\u0005\u000f\u0000\u0000\u00da\u00db\u0003\u0002"+
		"\u0001\u0000\u00db\u000b\u0001\u0000\u0000\u0000\u00dc\u00dd\u00055\u0000"+
		"\u0000\u00dd\u00de\u0003\u0014\n\u0000\u00de\r\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u00059\u0000\u0000\u00e0\u00e2\u0003\u0014\n\u0000\u00e1"+
		"\u00e3\u0003F#\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e3\u000f\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"7\u0000\u0000\u00e5\u00e6\u0003J%\u0000\u00e6\u0011\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0005.\u0000\u0000\u00e8\u00e9\u0003J%\u0000\u00e9"+
		"\u0013\u0001\u0000\u0000\u0000\u00ea\u00ec\u0005?\u0000\u0000\u00eb\u00ea"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ef\u0003\u0016\u000b\u0000\u00ee\u00f0"+
		"\u0003\u001c\u000e\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00f3"+
		"\u0003\u0010\b\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f6\u0003"+
		"\u0012\t\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u0015\u0001\u0000\u0000\u0000\u00f7\u00fa\u0005\u0017"+
		"\u0000\u0000\u00f8\u00fa\u0003\u0018\f\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00ff\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0005\u000b\u0000\u0000\u00fc\u00fe\u0003\u0018\f\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000"+
		"\u0100\u0017\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000"+
		"\u0102\u0105\u0003J%\u0000\u0103\u0104\u0005=\u0000\u0000\u0104\u0106"+
		"\u0003\u00b0X\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001"+
		"\u0000\u0000\u0000\u0106\u0019\u0001\u0000\u0000\u0000\u0107\u0109\u0003"+
		"J%\u0000\u0108\u010a\u0007\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u001b\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u00053\u0000\u0000\u010c\u010d\u0005\'\u0000\u0000"+
		"\u010d\u0112\u0003\u001a\r\u0000\u010e\u010f\u0005\u000b\u0000\u0000\u010f"+
		"\u0111\u0003\u001a\r\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0114"+
		"\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u001d\u0001\u0000\u0000\u0000\u0114\u0112"+
		"\u0001\u0000\u0000\u0000\u0115\u0117\u0003&\u0013\u0000\u0116\u0115\u0001"+
		"\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u0124\u0001"+
		"\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u0125\u0003"+
		"\f\u0006\u0000\u011c\u011e\u0003(\u0014\u0000\u011d\u011c\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0122\u0001\u0000"+
		"\u0000\u0000\u0121\u0123\u0003\f\u0006\u0000\u0122\u0121\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0125\u0001\u0000\u0000"+
		"\u0000\u0124\u011b\u0001\u0000\u0000\u0000\u0124\u011d\u0001\u0000\u0000"+
		"\u0000\u0125\u001f\u0001\u0000\u0000\u0000\u0126\u0128\u0003&\u0013\u0000"+
		"\u0127\u0126\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000"+
		"\u012a\u012f\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000"+
		"\u012c\u012e\u0003(\u0014\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012e"+
		"\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131"+
		"\u012f\u0001\u0000\u0000\u0000\u0132\u0134\u0003\u000e\u0007\u0000\u0133"+
		"\u0129\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135"+
		"\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0003\u001e\u000f\u0000\u0138"+
		"!\u0001\u0000\u0000\u0000\u0139\u013b\u00052\u0000\u0000\u013a\u0139\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0005/\u0000\u0000\u013d\u013e\u0003D\""+
		"\u0000\u013e#\u0001\u0000\u0000\u0000\u013f\u0140\u0005;\u0000\u0000\u0140"+
		"\u0141\u0003J%\u0000\u0141\u0142\u0005=\u0000\u0000\u0142\u0143\u0003"+
		"\u00b0X\u0000\u0143%\u0001\u0000\u0000\u0000\u0144\u0148\u0003\"\u0011"+
		"\u0000\u0145\u0148\u0003$\u0012\u0000\u0146\u0148\u00030\u0018\u0000\u0147"+
		"\u0144\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147"+
		"\u0146\u0001\u0000\u0000\u0000\u0148\'\u0001\u0000\u0000\u0000\u0149\u014f"+
		"\u0003B!\u0000\u014a\u014f\u00038\u001c\u0000\u014b\u014f\u0003*\u0015"+
		"\u0000\u014c\u014f\u0003<\u001e\u0000\u014d\u014f\u0003,\u0016\u0000\u014e"+
		"\u0149\u0001\u0000\u0000\u0000\u014e\u014a\u0001\u0000\u0000\u0000\u014e"+
		"\u014b\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e"+
		"\u014d\u0001\u0000\u0000\u0000\u014f)\u0001\u0000\u0000\u0000\u0150\u0152"+
		"\u0005,\u0000\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0151\u0152\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0005"+
		")\u0000\u0000\u0154\u0155\u0003\u0096K\u0000\u0155+\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u00054\u0000\u0000\u0157\u015c\u0003.\u0017\u0000\u0158"+
		"\u0159\u0005\u000b\u0000\u0000\u0159\u015b\u0003.\u0017\u0000\u015a\u0158"+
		"\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a"+
		"\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d-\u0001"+
		"\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0160\u0003"+
		"\u00b0X\u0000\u0160\u0161\u0003@ \u0000\u0161\u0164\u0001\u0000\u0000"+
		"\u0000\u0162\u0164\u0003j5\u0000\u0163\u015f\u0001\u0000\u0000\u0000\u0163"+
		"\u0162\u0001\u0000\u0000\u0000\u0164/\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0005\u001c\u0000\u0000\u0166\u0167\u0003\u0084B\u0000\u0167\u016a\u0003"+
		"2\u0019\u0000\u0168\u0169\u0005\u001d\u0000\u0000\u0169\u016b\u00034\u001a"+
		"\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000"+
		"\u0000\u016b1\u0001\u0000\u0000\u0000\u016c\u016e\u0005\f\u0000\u0000"+
		"\u016d\u016f\u0003\u0096K\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0005\r\u0000\u0000\u01713\u0001\u0000\u0000\u0000\u0172\u0177"+
		"\u00036\u001b\u0000\u0173\u0174\u0005\u000b\u0000\u0000\u0174\u0176\u0003"+
		"6\u001b\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000"+
		"\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u017a\u017c\u0003F#\u0000\u017b\u017a\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u0001\u0000\u0000\u0000\u017c5\u0001\u0000\u0000\u0000\u017d"+
		"\u017e\u0003\u00b0X\u0000\u017e\u017f\u0005=\u0000\u0000\u017f\u0181\u0001"+
		"\u0000\u0000\u0000\u0180\u017d\u0001\u0000\u0000\u0000\u0180\u0181\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0003"+
		"\u00b0X\u0000\u01837\u0001\u0000\u0000\u0000\u0184\u0185\u00050\u0000"+
		"\u0000\u0185\u0189\u0003l6\u0000\u0186\u0188\u0003:\u001d\u0000\u0187"+
		"\u0186\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189"+
		"\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a"+
		"9\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u00051\u0000\u0000\u018d\u018e\u0007\u0001\u0000\u0000\u018e\u018f\u0003"+
		"<\u001e\u0000\u018f;\u0001\u0000\u0000\u0000\u0190\u0191\u00056\u0000"+
		"\u0000\u0191\u0196\u0003>\u001f\u0000\u0192\u0193\u0005\u000b\u0000\u0000"+
		"\u0193\u0195\u0003>\u001f\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195"+
		"\u0198\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196"+
		"\u0197\u0001\u0000\u0000\u0000\u0197=\u0001\u0000\u0000\u0000\u0198\u0196"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0003j5\u0000\u019a\u019b\u0005\u0001"+
		"\u0000\u0000\u019b\u019c\u0003J%\u0000\u019c\u01a5\u0001\u0000\u0000\u0000"+
		"\u019d\u019e\u0003\u00b0X\u0000\u019e\u019f\u0007\u0002\u0000\u0000\u019f"+
		"\u01a0\u0003J%\u0000\u01a0\u01a5\u0001\u0000\u0000\u0000\u01a1\u01a2\u0003"+
		"\u00b0X\u0000\u01a2\u01a3\u0003@ \u0000\u01a3\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a4\u0199\u0001\u0000\u0000\u0000\u01a4\u019d\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a1\u0001\u0000\u0000\u0000\u01a5?\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0005\u0019\u0000\u0000\u01a7\u01a9\u0003\u00aeW\u0000\u01a8"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab"+
		"A\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005(\u0000\u0000\u01ad\u01ae\u0003"+
		"H$\u0000\u01aeC\u0001\u0000\u0000\u0000\u01af\u01b1\u0003H$\u0000\u01b0"+
		"\u01b2\u0003F#\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b2E\u0001\u0000\u0000\u0000\u01b3\u01b4\u00058\u0000"+
		"\u0000\u01b4\u01b5\u0003J%\u0000\u01b5G\u0001\u0000\u0000\u0000\u01b6"+
		"\u01bb\u0003l6\u0000\u01b7\u01b8\u0005\u000b\u0000\u0000\u01b8\u01ba\u0003"+
		"l6\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bcI\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000"+
		"\u01be\u01c3\u0003L&\u0000\u01bf\u01c0\u0005D\u0000\u0000\u01c0\u01c2"+
		"\u0003L&\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c4K\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c6\u01cb\u0003N\'\u0000\u01c7\u01c8\u0005F\u0000\u0000\u01c8"+
		"\u01ca\u0003N\'\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc"+
		"\u0001\u0000\u0000\u0000\u01ccM\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001"+
		"\u0000\u0000\u0000\u01ce\u01d3\u0003P(\u0000\u01cf\u01d0\u0005<\u0000"+
		"\u0000\u01d0\u01d2\u0003P(\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d4O\u0001\u0000\u0000\u0000\u01d5\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d8\u0005C\u0000\u0000\u01d7\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d9\u01da\u0003R)\u0000\u01daQ\u0001\u0000\u0000"+
		"\u0000\u01db\u01e1\u0003V+\u0000\u01dc\u01dd\u0003T*\u0000\u01dd\u01de"+
		"\u0003V+\u0000\u01de\u01e0\u0001\u0000\u0000\u0000\u01df\u01dc\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2S\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e4\u01e5\u0007\u0003\u0000"+
		"\u0000\u01e5U\u0001\u0000\u0000\u0000\u01e6\u01eb\u0003X,\u0000\u01e7"+
		"\u01e8\u0007\u0004\u0000\u0000\u01e8\u01ea\u0003X,\u0000\u01e9\u01e7\u0001"+
		"\u0000\u0000\u0000\u01ea\u01ed\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ecW\u0001\u0000"+
		"\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ee\u01f3\u0003Z-\u0000"+
		"\u01ef\u01f0\u0007\u0005\u0000\u0000\u01f0\u01f2\u0003Z-\u0000\u01f1\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4Y\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01fb\u0003"+
		"\\.\u0000\u01f7\u01f8\u0005\u0016\u0000\u0000\u01f8\u01fa\u0003\\.\u0000"+
		"\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000"+
		"\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fc[\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe"+
		"\u0200\u0007\u0004\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201"+
		"\u0202\u0003^/\u0000\u0202]\u0001\u0000\u0000\u0000\u0203\u0209\u0003"+
		"h4\u0000\u0204\u0208\u0003b1\u0000\u0205\u0208\u0003`0\u0000\u0206\u0208"+
		"\u0003f3\u0000\u0207\u0204\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000"+
		"\u0000\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000"+
		"\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000"+
		"\u0000\u0000\u020a_\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000"+
		"\u0000\u020c\u020d\u0005A\u0000\u0000\u020d\u021b\u0003h4\u0000\u020e"+
		"\u0217\u0005\u0010\u0000\u0000\u020f\u0211\u0003J%\u0000\u0210\u020f\u0001"+
		"\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0212\u0001"+
		"\u0000\u0000\u0000\u0212\u0214\u0005\b\u0000\u0000\u0213\u0215\u0003J"+
		"%\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000"+
		"\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216\u0218\u0003J%\u0000\u0217"+
		"\u0210\u0001\u0000\u0000\u0000\u0217\u0216\u0001\u0000\u0000\u0000\u0218"+
		"\u0219\u0001\u0000\u0000\u0000\u0219\u021b\u0005\u0011\u0000\u0000\u021a"+
		"\u020c\u0001\u0000\u0000\u0000\u021a\u020e\u0001\u0000\u0000\u0000\u021b"+
		"a\u0001\u0000\u0000\u0000\u021c\u021d\u0003d2\u0000\u021d\u021e\u0003"+
		"h4\u0000\u021ec\u0001\u0000\u0000\u0000\u021f\u0220\u0005E\u0000\u0000"+
		"\u0220\u0225\u00059\u0000\u0000\u0221\u0222\u0005@\u0000\u0000\u0222\u0225"+
		"\u00059\u0000\u0000\u0223\u0225\u0005>\u0000\u0000\u0224\u021f\u0001\u0000"+
		"\u0000\u0000\u0224\u0221\u0001\u0000\u0000\u0000\u0224\u0223\u0001\u0000"+
		"\u0000\u0000\u0225e\u0001\u0000\u0000\u0000\u0226\u0228\u0005B\u0000\u0000"+
		"\u0227\u0229\u0005C\u0000\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0001\u0000\u0000\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a"+
		"\u022b\u0005I\u0000\u0000\u022bg\u0001\u0000\u0000\u0000\u022c\u022e\u0003"+
		"j5\u0000\u022d\u022f\u0003@ \u0000\u022e\u022d\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0001\u0000\u0000\u0000\u022fi\u0001\u0000\u0000\u0000\u0230"+
		"\u0235\u0003v;\u0000\u0231\u0232\u0005\n\u0000\u0000\u0232\u0234\u0003"+
		"\u00aeW\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0234\u0237\u0001\u0000"+
		"\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000"+
		"\u0000\u0000\u0236k\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000"+
		"\u0000\u0238\u0239\u0003\u00b0X\u0000\u0239\u023a\u0005\u0001\u0000\u0000"+
		"\u023a\u023c\u0001\u0000\u0000\u0000\u023b\u0238\u0001\u0000\u0000\u0000"+
		"\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000"+
		"\u023d\u023e\u0003n7\u0000\u023em\u0001\u0000\u0000\u0000\u023f\u0243"+
		"\u0003t:\u0000\u0240\u0242\u0003p8\u0000\u0241\u0240\u0001\u0000\u0000"+
		"\u0000\u0242\u0245\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000"+
		"\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u024b\u0001\u0000\u0000"+
		"\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0246\u0247\u0005\f\u0000\u0000"+
		"\u0247\u0248\u0003n7\u0000\u0248\u0249\u0005\r\u0000\u0000\u0249\u024b"+
		"\u0001\u0000\u0000\u0000\u024a\u023f\u0001\u0000\u0000\u0000\u024a\u0246"+
		"\u0001\u0000\u0000\u0000\u024bo\u0001\u0000\u0000\u0000\u024c\u024d\u0003"+
		"z=\u0000\u024d\u024e\u0003t:\u0000\u024eq\u0001\u0000\u0000\u0000\u024f"+
		"\u0252\u0003\u00aaU\u0000\u0250\u0252\u0003\u009aM\u0000\u0251\u024f\u0001"+
		"\u0000\u0000\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0252s\u0001\u0000"+
		"\u0000\u0000\u0253\u0255\u0005\f\u0000\u0000\u0254\u0256\u0003\u00b0X"+
		"\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000"+
		"\u0000\u0256\u0258\u0001\u0000\u0000\u0000\u0257\u0259\u0003@ \u0000\u0258"+
		"\u0257\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259"+
		"\u025b\u0001\u0000\u0000\u0000\u025a\u025c\u0003r9\u0000\u025b\u025a\u0001"+
		"\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025d\u0001"+
		"\u0000\u0000\u0000\u025d\u025e\u0005\r\u0000\u0000\u025eu\u0001\u0000"+
		"\u0000\u0000\u025f\u026c\u0003\u009cN\u0000\u0260\u026c\u0003\u009aM\u0000"+
		"\u0261\u026c\u0003\u0098L\u0000\u0262\u026c\u0003\u0094J\u0000\u0263\u026c"+
		"\u0003\u0090H\u0000\u0264\u026c\u0003\u008cF\u0000\u0265\u026c\u0003\u008a"+
		"E\u0000\u0266\u026c\u0003\u008eG\u0000\u0267\u026c\u0003\u0088D\u0000"+
		"\u0268\u026c\u0003\u0086C\u0000\u0269\u026c\u0003\u00b0X\u0000\u026a\u026c"+
		"\u0003\u0082A\u0000\u026b\u025f\u0001\u0000\u0000\u0000\u026b\u0260\u0001"+
		"\u0000\u0000\u0000\u026b\u0261\u0001\u0000\u0000\u0000\u026b\u0262\u0001"+
		"\u0000\u0000\u0000\u026b\u0263\u0001\u0000\u0000\u0000\u026b\u0264\u0001"+
		"\u0000\u0000\u0000\u026b\u0265\u0001\u0000\u0000\u0000\u026b\u0266\u0001"+
		"\u0000\u0000\u0000\u026b\u0267\u0001\u0000\u0000\u0000\u026b\u0268\u0001"+
		"\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026b\u026a\u0001"+
		"\u0000\u0000\u0000\u026cw\u0001\u0000\u0000\u0000\u026d\u026e\u0003\u00b0"+
		"X\u0000\u026e\u026f\u0005\u0001\u0000\u0000\u026fy\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0005\u0006\u0000\u0000\u0271\u0273\u0005\u0012\u0000\u0000"+
		"\u0272\u0274\u0003|>\u0000\u0273\u0272\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0277"+
		"\u0005\u0012\u0000\u0000\u0276\u0278\u0005\u0005\u0000\u0000\u0277\u0276"+
		"\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0282"+
		"\u0001\u0000\u0000\u0000\u0279\u027b\u0005\u0012\u0000\u0000\u027a\u027c"+
		"\u0003|>\u0000\u027b\u027a\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000"+
		"\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u027f\u0005\u0012"+
		"\u0000\u0000\u027e\u0280\u0005\u0005\u0000\u0000\u027f\u027e\u0001\u0000"+
		"\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280\u0282\u0001\u0000"+
		"\u0000\u0000\u0281\u0270\u0001\u0000\u0000\u0000\u0281\u0279\u0001\u0000"+
		"\u0000\u0000\u0282{\u0001\u0000\u0000\u0000\u0283\u0285\u0005\u0010\u0000"+
		"\u0000\u0284\u0286\u0003\u00b0X\u0000\u0285\u0284\u0001\u0000\u0000\u0000"+
		"\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0288\u0001\u0000\u0000\u0000"+
		"\u0287\u0289\u0003~?\u0000\u0288\u0287\u0001\u0000\u0000\u0000\u0288\u0289"+
		"\u0001\u0000\u0000\u0000\u0289\u028b\u0001\u0000\u0000\u0000\u028a\u028c"+
		"\u0003\u009eO\u0000\u028b\u028a\u0001\u0000\u0000\u0000\u028b\u028c\u0001"+
		"\u0000\u0000\u0000\u028c\u028e\u0001\u0000\u0000\u0000\u028d\u028f\u0003"+
		"r9\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000"+
		"\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0291\u0005\u0011\u0000"+
		"\u0000\u0291}\u0001\u0000\u0000\u0000\u0292\u0293\u0005\u0019\u0000\u0000"+
		"\u0293\u029b\u0003\u00aeW\u0000\u0294\u0296\u0005\u001a\u0000\u0000\u0295"+
		"\u0297\u0005\u0019\u0000\u0000\u0296\u0295\u0001\u0000\u0000\u0000\u0296"+
		"\u0297\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298"+
		"\u029a\u0003\u00aeW\u0000\u0299\u0294\u0001\u0000\u0000\u0000\u029a\u029d"+
		"\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029b\u029c"+
		"\u0001\u0000\u0000\u0000\u029c\u007f\u0001\u0000\u0000\u0000\u029d\u029b"+
		"\u0001\u0000\u0000\u0000\u029e\u02a0\u0005:\u0000\u0000\u029f\u02a1\u0005"+
		"$\u0000\u0000\u02a0\u029f\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000"+
		"\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a3\u0003\u0006"+
		"\u0003\u0000\u02a3\u0081\u0001\u0000\u0000\u0000\u02a4\u02a5\u0005-\u0000"+
		"\u0000\u02a5\u02a8\u0005\u000e\u0000\u0000\u02a6\u02a9\u0003\u0004\u0002"+
		"\u0000\u02a7\u02a9\u0003D\"\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a8\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000"+
		"\u02aa\u02ab\u0005\u000f\u0000\u0000\u02ab\u0083\u0001\u0000\u0000\u0000"+
		"\u02ac\u02b1\u0003\u00b0X\u0000\u02ad\u02ae\u0005\n\u0000\u0000\u02ae"+
		"\u02b0\u0003\u00b0X\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02b0\u02b3"+
		"\u0001\u0000\u0000\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b1\u02b2"+
		"\u0001\u0000\u0000\u0000\u02b2\u0085\u0001\u0000\u0000\u0000\u02b3\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b4\u02b5\u0003\u0084B\u0000\u02b5\u02b7\u0005"+
		"\f\u0000\u0000\u02b6\u02b8\u0005?\u0000\u0000\u02b7\u02b6\u0001\u0000"+
		"\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02ba\u0001\u0000"+
		"\u0000\u0000\u02b9\u02bb\u0003\u0096K\u0000\u02ba\u02b9\u0001\u0000\u0000"+
		"\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000"+
		"\u0000\u02bc\u02bd\u0005\r\u0000\u0000\u02bd\u0087\u0001\u0000\u0000\u0000"+
		"\u02be\u02bf\u0005\f\u0000\u0000\u02bf\u02c0\u0003J%\u0000\u02c0\u02c1"+
		"\u0005\r\u0000\u0000\u02c1\u0089\u0001\u0000\u0000\u0000\u02c2\u02c3\u0007"+
		"\u0006\u0000\u0000\u02c3\u02c4\u0005\f\u0000\u0000\u02c4\u02c5\u0003\u0092"+
		"I\u0000\u02c5\u02c6\u0005\r\u0000\u0000\u02c6\u008b\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c9\u0005\u0010\u0000\u0000\u02c8\u02ca\u0003x<\u0000\u02c9"+
		"\u02c8\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca"+
		"\u02cb\u0001\u0000\u0000\u0000\u02cb\u02cd\u0003\u008eG\u0000\u02cc\u02ce"+
		"\u0003F#\u0000\u02cd\u02cc\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000"+
		"\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005\u001a"+
		"\u0000\u0000\u02d0\u02d1\u0003J%\u0000\u02d1\u02d2\u0005\u0011\u0000\u0000"+
		"\u02d2\u008d\u0001\u0000\u0000\u0000\u02d3\u02d5\u0003t:\u0000\u02d4\u02d6"+
		"\u0003p8\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000"+
		"\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000"+
		"\u0000\u0000\u02d8\u008f\u0001\u0000\u0000\u0000\u02d9\u02da\u0005\u0010"+
		"\u0000\u0000\u02da\u02dd\u0003\u0092I\u0000\u02db\u02dc\u0005\u001a\u0000"+
		"\u0000\u02dc\u02de\u0003J%\u0000\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd"+
		"\u02de\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000\u0000\u02df"+
		"\u02e0\u0005\u0011\u0000\u0000\u02e0\u0091\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e2\u0003\u00b0X\u0000\u02e2\u02e3\u0005A\u0000\u0000\u02e3\u02e5\u0003"+
		"J%\u0000\u02e4\u02e6\u0003F#\u0000\u02e5\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6\u0093\u0001\u0000\u0000\u0000"+
		"\u02e7\u02e8\u0005 \u0000\u0000\u02e8\u02e9\u0005\f\u0000\u0000\u02e9"+
		"\u02ea\u0005\u0017\u0000\u0000\u02ea\u02eb\u0005\r\u0000\u0000\u02eb\u0095"+
		"\u0001\u0000\u0000\u0000\u02ec\u02f1\u0003J%\u0000\u02ed\u02ee\u0005\u000b"+
		"\u0000\u0000\u02ee\u02f0\u0003J%\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000"+
		"\u02f0\u02f3\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000"+
		"\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u0097\u0001\u0000\u0000\u0000"+
		"\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f4\u02f6\u0005O\u0000\u0000\u02f5"+
		"\u02f7\u0003J%\u0000\u02f6\u02f5\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001"+
		"\u0000\u0000\u0000\u02f7\u02fd\u0001\u0000\u0000\u0000\u02f8\u02f9\u0005"+
		"P\u0000\u0000\u02f9\u02fa\u0003J%\u0000\u02fa\u02fb\u0005Q\u0000\u0000"+
		"\u02fb\u02fc\u0003J%\u0000\u02fc\u02fe\u0001\u0000\u0000\u0000\u02fd\u02f8"+
		"\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\u02fd"+
		"\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0303"+
		"\u0001\u0000\u0000\u0000\u0301\u0302\u0005R\u0000\u0000\u0302\u0304\u0003"+
		"J%\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0303\u0304\u0001\u0000\u0000"+
		"\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305\u0306\u0005S\u0000\u0000"+
		"\u0306\u0099\u0001\u0000\u0000\u0000\u0307\u030a\u0005\u001b\u0000\u0000"+
		"\u0308\u030b\u0003\u00b0X\u0000\u0309\u030b\u0003\u00a2Q\u0000\u030a\u0308"+
		"\u0001\u0000\u0000\u0000\u030a\u0309\u0001\u0000\u0000\u0000\u030b\u009b"+
		"\u0001\u0000\u0000\u0000\u030c\u0314\u0003\u00a0P\u0000\u030d\u0314\u0003"+
		"\u00a2Q\u0000\u030e\u0314\u0005I\u0000\u0000\u030f\u0314\u0003\u00a4R"+
		"\u0000\u0310\u0314\u0003\u00a6S\u0000\u0311\u0314\u0003\u00a8T\u0000\u0312"+
		"\u0314\u0003\u00aaU\u0000\u0313\u030c\u0001\u0000\u0000\u0000\u0313\u030d"+
		"\u0001\u0000\u0000\u0000\u0313\u030e\u0001\u0000\u0000\u0000\u0313\u030f"+
		"\u0001\u0000\u0000\u0000\u0313\u0310\u0001\u0000\u0000\u0000\u0313\u0311"+
		"\u0001\u0000\u0000\u0000\u0313\u0312\u0001\u0000\u0000\u0000\u0314\u009d"+
		"\u0001\u0000\u0000\u0000\u0315\u0317\u0005\u0017\u0000\u0000\u0316\u0318"+
		"\u0003\u00a2Q\u0000\u0317\u0316\u0001\u0000\u0000\u0000\u0317\u0318\u0001"+
		"\u0000\u0000\u0000\u0318\u031d\u0001\u0000\u0000\u0000\u0319\u031b\u0005"+
		"\b\u0000\u0000\u031a\u031c\u0003\u00a2Q\u0000\u031b\u031a\u0001\u0000"+
		"\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u031e\u0001\u0000"+
		"\u0000\u0000\u031d\u0319\u0001\u0000\u0000\u0000\u031d\u031e\u0001\u0000"+
		"\u0000\u0000\u031e\u009f\u0001\u0000\u0000\u0000\u031f\u0320\u0007\u0007"+
		"\u0000\u0000\u0320\u00a1\u0001\u0000\u0000\u0000\u0321\u0322\u0005]\u0000"+
		"\u0000\u0322\u00a3\u0001\u0000\u0000\u0000\u0323\u0324\u0005\\\u0000\u0000"+
		"\u0324\u00a5\u0001\u0000\u0000\u0000\u0325\u0326\u0005[\u0000\u0000\u0326"+
		"\u00a7\u0001\u0000\u0000\u0000\u0327\u0329\u0005\u0010\u0000\u0000\u0328"+
		"\u032a\u0003\u0096K\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u0329\u032a"+
		"\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032c"+
		"\u0005\u0011\u0000\u0000\u032c\u00a9\u0001\u0000\u0000\u0000\u032d\u0336"+
		"\u0005\u000e\u0000\u0000\u032e\u0333\u0003\u00acV\u0000\u032f\u0330\u0005"+
		"\u000b\u0000\u0000\u0330\u0332\u0003\u00acV\u0000\u0331\u032f\u0001\u0000"+
		"\u0000\u0000\u0332\u0335\u0001\u0000\u0000\u0000\u0333\u0331\u0001\u0000"+
		"\u0000\u0000\u0333\u0334\u0001\u0000\u0000\u0000\u0334\u0337\u0001\u0000"+
		"\u0000\u0000\u0335\u0333\u0001\u0000\u0000\u0000\u0336\u032e\u0001\u0000"+
		"\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000"+
		"\u0000\u0000\u0338\u0339\u0005\u000f\u0000\u0000\u0339\u00ab\u0001\u0000"+
		"\u0000\u0000\u033a\u033b\u0003\u00aeW\u0000\u033b\u033c\u0005\u0019\u0000"+
		"\u0000\u033c\u033d\u0003J%\u0000\u033d\u00ad\u0001\u0000\u0000\u0000\u033e"+
		"\u0341\u0003\u00b0X\u0000\u033f\u0341\u0003\u00b2Y\u0000\u0340\u033e\u0001"+
		"\u0000\u0000\u0000\u0340\u033f\u0001\u0000\u0000\u0000\u0341\u00af\u0001"+
		"\u0000\u0000\u0000\u0342\u0343\u0007\b\u0000\u0000\u0343\u00b1\u0001\u0000"+
		"\u0000\u0000\u0344\u0345\u0007\t\u0000\u0000\u0345\u00b3\u0001\u0000\u0000"+
		"\u0000f\u00b6\u00bd\u00c3\u00c8\u00cd\u00d2\u00d4\u00e2\u00eb\u00ef\u00f2"+
		"\u00f5\u00f9\u00ff\u0105\u0109\u0112\u0118\u011f\u0122\u0124\u0129\u012f"+
		"\u0135\u013a\u0147\u014e\u0151\u015c\u0163\u016a\u016e\u0177\u017b\u0180"+
		"\u0189\u0196\u01a4\u01aa\u01b1\u01bb\u01c3\u01cb\u01d3\u01d7\u01e1\u01eb"+
		"\u01f3\u01fb\u01ff\u0207\u0209\u0210\u0214\u0217\u021a\u0224\u0228\u022e"+
		"\u0235\u023b\u0243\u024a\u0251\u0255\u0258\u025b\u026b\u0273\u0277\u027b"+
		"\u027f\u0281\u0285\u0288\u028b\u028e\u0296\u029b\u02a0\u02a8\u02b1\u02b7"+
		"\u02ba\u02c9\u02cd\u02d7\u02dd\u02e5\u02f1\u02f6\u02ff\u0303\u030a\u0313"+
		"\u0317\u031b\u031d\u0329\u0333\u0336\u0340";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}