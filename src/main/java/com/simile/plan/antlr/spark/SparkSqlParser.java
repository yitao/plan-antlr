// Generated from /Users/haizhi/Documents/workspace/work/plan-antlr/src/main/resources/antlr/spark/SparkSql.g4 by ANTLR 4.10.1
package com.simile.plan.antlr.spark;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparkSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, SELECT=12, FROM=13, ADD=14, AS=15, ALL=16, ANY=17, 
		DISTINCT=18, WHERE=19, GROUP=20, BY=21, GROUPING=22, SETS=23, CUBE=24, 
		ROLLUP=25, ORDER=26, HAVING=27, LIMIT=28, AT=29, OR=30, AND=31, IN=32, 
		NOT=33, NO=34, EXISTS=35, BETWEEN=36, LIKE=37, RLIKE=38, IS=39, NULL=40, 
		TRUE=41, FALSE=42, NULLS=43, ASC=44, DESC=45, FOR=46, INTERVAL=47, CASE=48, 
		WHEN=49, THEN=50, ELSE=51, END=52, JOIN=53, CROSS=54, OUTER=55, INNER=56, 
		LEFT=57, SEMI=58, RIGHT=59, FULL=60, NATURAL=61, ON=62, PIVOT=63, LATERAL=64, 
		WINDOW=65, OVER=66, PARTITION=67, RANGE=68, ROWS=69, UNBOUNDED=70, PRECEDING=71, 
		FOLLOWING=72, CURRENT=73, FIRST=74, AFTER=75, LAST=76, ROW=77, WITH=78, 
		VALUES=79, CREATE=80, TABLE=81, DIRECTORY=82, VIEW=83, REPLACE=84, INSERT=85, 
		DELETE=86, INTO=87, DESCRIBE=88, EXPLAIN=89, FORMAT=90, LOGICAL=91, CODEGEN=92, 
		COST=93, CAST=94, SHOW=95, TABLES=96, COLUMNS=97, COLUMN=98, USE=99, PARTITIONS=100, 
		FUNCTIONS=101, DROP=102, UNION=103, EXCEPT=104, SETMINUS=105, INTERSECT=106, 
		TO=107, TABLESAMPLE=108, STRATIFY=109, ALTER=110, RENAME=111, ARRAY=112, 
		MAP=113, STRUCT=114, COMMENT=115, SET=116, RESET=117, DATA=118, START=119, 
		TRANSACTION=120, COMMIT=121, ROLLBACK=122, MACRO=123, IGNORE=124, BOTH=125, 
		LEADING=126, TRAILING=127, IF=128, POSITION=129, EXTRACT=130, EQ=131, 
		NSEQ=132, NEQ=133, NEQJ=134, LT=135, LTE=136, GT=137, GTE=138, PLUS=139, 
		MINUS=140, ASTERISK=141, SLASH=142, PERCENT=143, DIV=144, TILDE=145, AMPERSAND=146, 
		PIPE=147, CONCAT_PIPE=148, HAT=149, PERCENTLIT=150, BUCKET=151, OUT=152, 
		OF=153, SORT=154, CLUSTER=155, DISTRIBUTE=156, OVERWRITE=157, TRANSFORM=158, 
		REDUCE=159, USING=160, SERDE=161, SERDEPROPERTIES=162, RECORDREADER=163, 
		RECORDWRITER=164, DELIMITED=165, FIELDS=166, TERMINATED=167, COLLECTION=168, 
		ITEMS=169, KEYS=170, ESCAPED=171, LINES=172, SEPARATED=173, FUNCTION=174, 
		EXTENDED=175, REFRESH=176, CLEAR=177, CACHE=178, UNCACHE=179, LAZY=180, 
		FORMATTED=181, GLOBAL=182, TEMPORARY=183, OPTIONS=184, UNSET=185, TBLPROPERTIES=186, 
		DBPROPERTIES=187, BUCKETS=188, SKEWED=189, STORED=190, DIRECTORIES=191, 
		LOCATION=192, EXCHANGE=193, ARCHIVE=194, UNARCHIVE=195, FILEFORMAT=196, 
		TOUCH=197, COMPACT=198, CONCATENATE=199, CHANGE=200, CASCADE=201, RESTRICT=202, 
		CLUSTERED=203, SORTED=204, PURGE=205, INPUTFORMAT=206, OUTPUTFORMAT=207, 
		DATABASE=208, DATABASES=209, DFS=210, TRUNCATE=211, ANALYZE=212, COMPUTE=213, 
		LIST=214, STATISTICS=215, PARTITIONED=216, EXTERNAL=217, DEFINED=218, 
		REVOKE=219, GRANT=220, LOCK=221, UNLOCK=222, MSCK=223, REPAIR=224, RECOVER=225, 
		EXPORT=226, IMPORT=227, LOAD=228, ROLE=229, ROLES=230, COMPACTIONS=231, 
		PRINCIPALS=232, TRANSACTIONS=233, INDEX=234, INDEXES=235, LOCKS=236, OPTION=237, 
		ANTI=238, LOCAL=239, INPATH=240, STRING=241, BIGINT_LITERAL=242, SMALLINT_LITERAL=243, 
		TINYINT_LITERAL=244, INTEGER_VALUE=245, DECIMAL_VALUE=246, DOUBLE_LITERAL=247, 
		BIGDECIMAL_LITERAL=248, IDENTIFIER=249, BACKQUOTED_IDENTIFIER=250, SIMPLE_COMMENT=251, 
		BRACKETED_EMPTY_COMMENT=252, BRACKETED_COMMENT=253, WS=254, UNRECOGNIZED=255;
	public static final int
		RULE_multiStatement = 0, RULE_singleStatement = 1, RULE_singleExpression = 2, 
		RULE_singleTableIdentifier = 3, RULE_singleFunctionIdentifier = 4, RULE_singleDataType = 5, 
		RULE_singleTableSchema = 6, RULE_statement = 7, RULE_unsupportedHiveNativeCommands = 8, 
		RULE_createTableHeader = 9, RULE_bucketSpec = 10, RULE_skewSpec = 11, 
		RULE_locationSpec = 12, RULE_query = 13, RULE_insertInto = 14, RULE_partitionSpecLocation = 15, 
		RULE_partitionSpec = 16, RULE_partitionVal = 17, RULE_describeFuncName = 18, 
		RULE_describeColName = 19, RULE_ctes = 20, RULE_namedQuery = 21, RULE_tableProvider = 22, 
		RULE_tablePropertyList = 23, RULE_tableProperty = 24, RULE_tablePropertyKey = 25, 
		RULE_tablePropertyValue = 26, RULE_constantList = 27, RULE_nestedConstantList = 28, 
		RULE_createFileFormat = 29, RULE_fileFormat = 30, RULE_storageHandler = 31, 
		RULE_resource = 32, RULE_queryNoWith = 33, RULE_queryOrganization = 34, 
		RULE_multiInsertQueryBody = 35, RULE_queryTerm = 36, RULE_queryPrimary = 37, 
		RULE_sortItem = 38, RULE_querySpecification = 39, RULE_hint = 40, RULE_hintStatement = 41, 
		RULE_fromClause = 42, RULE_aggregation = 43, RULE_groupingSet = 44, RULE_pivotClause = 45, 
		RULE_pivotColumn = 46, RULE_pivotValue = 47, RULE_lateralView = 48, RULE_setQuantifier = 49, 
		RULE_relation = 50, RULE_joinRelation = 51, RULE_joinType = 52, RULE_joinCriteria = 53, 
		RULE_sample = 54, RULE_sampleMethod = 55, RULE_identifierList = 56, RULE_identifierSeq = 57, 
		RULE_orderedIdentifierList = 58, RULE_orderedIdentifier = 59, RULE_identifierCommentList = 60, 
		RULE_identifierComment = 61, RULE_relationPrimary = 62, RULE_inlineTable = 63, 
		RULE_functionTable = 64, RULE_tableAlias = 65, RULE_rowFormat = 66, RULE_tableIdentifier = 67, 
		RULE_functionIdentifier = 68, RULE_namedExpression = 69, RULE_namedExpressionSeq = 70, 
		RULE_expression = 71, RULE_booleanExpression = 72, RULE_predicate = 73, 
		RULE_valueExpression = 74, RULE_primaryExpression = 75, RULE_constant = 76, 
		RULE_comparisonOperator = 77, RULE_arithmeticOperator = 78, RULE_predicateOperator = 79, 
		RULE_booleanValue = 80, RULE_interval = 81, RULE_intervalField = 82, RULE_intervalValue = 83, 
		RULE_colPosition = 84, RULE_dataType = 85, RULE_colTypeList = 86, RULE_colType = 87, 
		RULE_complexColTypeList = 88, RULE_complexColType = 89, RULE_whenClause = 90, 
		RULE_windows = 91, RULE_namedWindow = 92, RULE_windowSpec = 93, RULE_windowFrame = 94, 
		RULE_frameBound = 95, RULE_qualifiedName = 96, RULE_identifier = 97, RULE_strictIdentifier = 98, 
		RULE_quotedIdentifier = 99, RULE_number = 100, RULE_nonReserved = 101;
	private static String[] makeRuleNames() {
		return new String[] {
			"multiStatement", "singleStatement", "singleExpression", "singleTableIdentifier", 
			"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "statement", 
			"unsupportedHiveNativeCommands", "createTableHeader", "bucketSpec", "skewSpec", 
			"locationSpec", "query", "insertInto", "partitionSpecLocation", "partitionSpec", 
			"partitionVal", "describeFuncName", "describeColName", "ctes", "namedQuery", 
			"tableProvider", "tablePropertyList", "tableProperty", "tablePropertyKey", 
			"tablePropertyValue", "constantList", "nestedConstantList", "createFileFormat", 
			"fileFormat", "storageHandler", "resource", "queryNoWith", "queryOrganization", 
			"multiInsertQueryBody", "queryTerm", "queryPrimary", "sortItem", "querySpecification", 
			"hint", "hintStatement", "fromClause", "aggregation", "groupingSet", 
			"pivotClause", "pivotColumn", "pivotValue", "lateralView", "setQuantifier", 
			"relation", "joinRelation", "joinType", "joinCriteria", "sample", "sampleMethod", 
			"identifierList", "identifierSeq", "orderedIdentifierList", "orderedIdentifier", 
			"identifierCommentList", "identifierComment", "relationPrimary", "inlineTable", 
			"functionTable", "tableAlias", "rowFormat", "tableIdentifier", "functionIdentifier", 
			"namedExpression", "namedExpressionSeq", "expression", "booleanExpression", 
			"predicate", "valueExpression", "primaryExpression", "constant", "comparisonOperator", 
			"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
			"intervalField", "intervalValue", "colPosition", "dataType", "colTypeList", 
			"colType", "complexColTypeList", "complexColType", "whenClause", "windows", 
			"namedWindow", "windowSpec", "windowFrame", "frameBound", "qualifiedName", 
			"identifier", "strictIdentifier", "quotedIdentifier", "number", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", 
			"']'", "':'", "'SELECT'", "'FROM'", "'ADD'", "'AS'", "'ALL'", "'ANY'", 
			"'DISTINCT'", "'WHERE'", "'GROUP'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", 
			"'ROLLUP'", "'ORDER'", "'HAVING'", "'LIMIT'", "'AT'", "'OR'", "'AND'", 
			"'IN'", null, "'NO'", "'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", 
			"'NULL'", "'TRUE'", "'FALSE'", "'NULLS'", "'ASC'", "'DESC'", "'FOR'", 
			"'INTERVAL'", "'CASE'", "'WHEN'", "'THEN'", "'ELSE'", "'END'", "'JOIN'", 
			"'CROSS'", "'OUTER'", "'INNER'", "'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", 
			"'NATURAL'", "'ON'", "'PIVOT'", "'LATERAL'", "'WINDOW'", "'OVER'", "'PARTITION'", 
			"'RANGE'", "'ROWS'", "'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", 
			"'FIRST'", "'AFTER'", "'LAST'", "'ROW'", "'WITH'", "'VALUES'", "'CREATE'", 
			"'TABLE'", "'DIRECTORY'", "'VIEW'", "'REPLACE'", "'INSERT'", "'DELETE'", 
			"'INTO'", "'DESCRIBE'", "'EXPLAIN'", "'FORMAT'", "'LOGICAL'", "'CODEGEN'", 
			"'COST'", "'CAST'", "'SHOW'", "'TABLES'", "'COLUMNS'", "'COLUMN'", "'USE'", 
			"'PARTITIONS'", "'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'", "'MINUS'", 
			"'INTERSECT'", "'TO'", "'TABLESAMPLE'", "'STRATIFY'", "'ALTER'", "'RENAME'", 
			"'ARRAY'", "'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", "'RESET'", "'DATA'", 
			"'START'", "'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'MACRO'", "'IGNORE'", 
			"'BOTH'", "'LEADING'", "'TRAILING'", "'IF'", "'POSITION'", "'EXTRACT'", 
			null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", "'||'", "'^'", "'PERCENT'", 
			"'BUCKET'", "'OUT'", "'OF'", "'SORT'", "'CLUSTER'", "'DISTRIBUTE'", "'OVERWRITE'", 
			"'TRANSFORM'", "'REDUCE'", "'USING'", "'SERDE'", "'SERDEPROPERTIES'", 
			"'RECORDREADER'", "'RECORDWRITER'", "'DELIMITED'", "'FIELDS'", "'TERMINATED'", 
			"'COLLECTION'", "'ITEMS'", "'KEYS'", "'ESCAPED'", "'LINES'", "'SEPARATED'", 
			"'FUNCTION'", "'EXTENDED'", "'REFRESH'", "'CLEAR'", "'CACHE'", "'UNCACHE'", 
			"'LAZY'", "'FORMATTED'", "'GLOBAL'", null, "'OPTIONS'", "'UNSET'", "'TBLPROPERTIES'", 
			"'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", "'STORED'", "'DIRECTORIES'", 
			"'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", "'UNARCHIVE'", "'FILEFORMAT'", 
			"'TOUCH'", "'COMPACT'", "'CONCATENATE'", "'CHANGE'", "'CASCADE'", "'RESTRICT'", 
			"'CLUSTERED'", "'SORTED'", "'PURGE'", "'INPUTFORMAT'", "'OUTPUTFORMAT'", 
			null, null, "'DFS'", "'TRUNCATE'", "'ANALYZE'", "'COMPUTE'", "'LIST'", 
			"'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", "'DEFINED'", "'REVOKE'", 
			"'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", "'RECOVER'", "'EXPORT'", 
			"'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", "'PRINCIPALS'", 
			"'TRANSACTIONS'", "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", "'ANTI'", 
			"'LOCAL'", "'INPATH'", null, null, null, null, null, null, null, null, 
			null, null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"SELECT", "FROM", "ADD", "AS", "ALL", "ANY", "DISTINCT", "WHERE", "GROUP", 
			"BY", "GROUPING", "SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", 
			"AT", "OR", "AND", "IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", 
			"IS", "NULL", "TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", 
			"CASE", "WHEN", "THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", 
			"LEFT", "SEMI", "RIGHT", "FULL", "NATURAL", "ON", "PIVOT", "LATERAL", 
			"WINDOW", "OVER", "PARTITION", "RANGE", "ROWS", "UNBOUNDED", "PRECEDING", 
			"FOLLOWING", "CURRENT", "FIRST", "AFTER", "LAST", "ROW", "WITH", "VALUES", 
			"CREATE", "TABLE", "DIRECTORY", "VIEW", "REPLACE", "INSERT", "DELETE", 
			"INTO", "DESCRIBE", "EXPLAIN", "FORMAT", "LOGICAL", "CODEGEN", "COST", 
			"CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", "PARTITIONS", "FUNCTIONS", 
			"DROP", "UNION", "EXCEPT", "SETMINUS", "INTERSECT", "TO", "TABLESAMPLE", 
			"STRATIFY", "ALTER", "RENAME", "ARRAY", "MAP", "STRUCT", "COMMENT", "SET", 
			"RESET", "DATA", "START", "TRANSACTION", "COMMIT", "ROLLBACK", "MACRO", 
			"IGNORE", "BOTH", "LEADING", "TRAILING", "IF", "POSITION", "EXTRACT", 
			"EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
			"ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", 
			"CONCAT_PIPE", "HAT", "PERCENTLIT", "BUCKET", "OUT", "OF", "SORT", "CLUSTER", 
			"DISTRIBUTE", "OVERWRITE", "TRANSFORM", "REDUCE", "USING", "SERDE", "SERDEPROPERTIES", 
			"RECORDREADER", "RECORDWRITER", "DELIMITED", "FIELDS", "TERMINATED", 
			"COLLECTION", "ITEMS", "KEYS", "ESCAPED", "LINES", "SEPARATED", "FUNCTION", 
			"EXTENDED", "REFRESH", "CLEAR", "CACHE", "UNCACHE", "LAZY", "FORMATTED", 
			"GLOBAL", "TEMPORARY", "OPTIONS", "UNSET", "TBLPROPERTIES", "DBPROPERTIES", 
			"BUCKETS", "SKEWED", "STORED", "DIRECTORIES", "LOCATION", "EXCHANGE", 
			"ARCHIVE", "UNARCHIVE", "FILEFORMAT", "TOUCH", "COMPACT", "CONCATENATE", 
			"CHANGE", "CASCADE", "RESTRICT", "CLUSTERED", "SORTED", "PURGE", "INPUTFORMAT", 
			"OUTPUTFORMAT", "DATABASE", "DATABASES", "DFS", "TRUNCATE", "ANALYZE", 
			"COMPUTE", "LIST", "STATISTICS", "PARTITIONED", "EXTERNAL", "DEFINED", 
			"REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", "RECOVER", "EXPORT", 
			"IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", "PRINCIPALS", "TRANSACTIONS", 
			"INDEX", "INDEXES", "LOCKS", "OPTION", "ANTI", "LOCAL", "INPATH", "STRING", 
			"BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", 
			"DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
			"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
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
	public String getGrammarFileName() { return "SparkSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enbled = false;

	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	public SparkSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MultiStatementContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SparkSqlParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MultiStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterMultiStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitMultiStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitMultiStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiStatementContext multiStatement() throws RecognitionException {
		MultiStatementContext _localctx = new MultiStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_multiStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				statement();
				setState(205);
				match(T__0);
				}
				}
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << DESC))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (WITH - 78)) | (1L << (VALUES - 78)) | (1L << (CREATE - 78)) | (1L << (TABLE - 78)) | (1L << (INSERT - 78)) | (1L << (DELETE - 78)) | (1L << (DESCRIBE - 78)) | (1L << (EXPLAIN - 78)) | (1L << (SHOW - 78)) | (1L << (USE - 78)) | (1L << (DROP - 78)) | (1L << (ALTER - 78)) | (1L << (MAP - 78)) | (1L << (SET - 78)) | (1L << (RESET - 78)) | (1L << (START - 78)) | (1L << (COMMIT - 78)) | (1L << (ROLLBACK - 78)))) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & ((1L << (REDUCE - 159)) | (1L << (REFRESH - 159)) | (1L << (CLEAR - 159)) | (1L << (CACHE - 159)) | (1L << (UNCACHE - 159)) | (1L << (DFS - 159)) | (1L << (TRUNCATE - 159)) | (1L << (ANALYZE - 159)) | (1L << (LIST - 159)) | (1L << (REVOKE - 159)) | (1L << (GRANT - 159)) | (1L << (LOCK - 159)) | (1L << (UNLOCK - 159)))) != 0) || ((((_la - 223)) & ~0x3f) == 0 && ((1L << (_la - 223)) & ((1L << (MSCK - 223)) | (1L << (EXPORT - 223)) | (1L << (IMPORT - 223)) | (1L << (LOAD - 223)))) != 0) );
			setState(211);
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

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			statement();
			setState(214);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			namedExpression();
			setState(217);
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

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			tableIdentifier();
			setState(220);
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

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			functionIdentifier();
			setState(223);
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

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			dataType();
			setState(226);
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

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			colTypeList();
			setState(229);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SparkSqlParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SparkSqlParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkSqlParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkSqlParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SparkSqlParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropDatabaseContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkSqlParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkSqlParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SparkSqlParser.CASCADE, 0); }
		public DropDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitDropDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SparkSqlParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeDatabaseContext extends StatementContext {
		public TerminalNode DATABASE() { return getToken(SparkSqlParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkSqlParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlParser.EXTENDED, 0); }
		public DescribeDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterDescribeDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitDescribeDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitDescribeDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode USE() { return getToken(SparkSqlParser.USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SparkSqlParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SparkSqlParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SparkSqlParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkSqlParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public TableIdentifierContext from;
		public TableIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SparkSqlParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SparkSqlParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SparkSqlParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlParser.VIEW, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SparkSqlParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SparkSqlParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SparkSqlParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SparkSqlParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SparkSqlParser.TABLES, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkSqlParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SparkSqlParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkSqlParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SparkSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SparkSqlParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SparkSqlParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(SparkSqlParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SparkSqlParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SparkSqlParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SparkSqlParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SparkSqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode SHOW() { return getToken(SparkSqlParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlParser.COLUMNS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(SparkSqlParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SparkSqlParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SparkSqlParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SparkSqlParser.IN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkSqlParser.ADD, 0); }
		public TerminalNode IF() { return getToken(SparkSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public TerminalNode VIEW() { return getToken(SparkSqlParser.VIEW, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SparkSqlParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkSqlParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SparkSqlParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDatabaseContext extends StatementContext {
		public Token comment;
		public TerminalNode CREATE() { return getToken(SparkSqlParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SparkSqlParser.COMMENT, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SparkSqlParser.WITH, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkSqlParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public CreateDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitCreateDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SparkSqlParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SparkSqlParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkSqlParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SparkSqlParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateHiveTableContext extends StatementContext {
		public ColTypeListContext columns;
		public Token comment;
		public ColTypeListContext partitionColumns;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SparkSqlParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SparkSqlParser.COMMENT, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SparkSqlParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SparkSqlParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SparkSqlParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SparkSqlParser.TBLPROPERTIES, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SparkSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlParser.STRING, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public CreateHiveTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterCreateHiveTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitCreateHiveTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitCreateHiveTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SparkSqlParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkSqlParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SparkSqlParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SparkSqlParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkSqlParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkSqlParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterShowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitShowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitShowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetDatabasePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkSqlParser.SET, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkSqlParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetDatabasePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSetDatabaseProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSetDatabaseProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSetDatabaseProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TablePropertyListContext options;
		public IdentifierListContext partitionColumnNames;
		public Token comment;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SparkSqlParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SparkSqlParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SparkSqlParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SparkSqlParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlParser.BY, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SparkSqlParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SparkSqlParser.COMMENT, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SparkSqlParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SparkSqlParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SparkSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlParser.STRING, i);
		}
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeTableContext extends StatementContext {
		public Token option;
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkSqlParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SparkSqlParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkSqlParser.FORMATTED, 0); }
		public DescribeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterDescribeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitDescribeTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitDescribeTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TerminalNode CREATE() { return getToken(SparkSqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SparkSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlParser.EXISTS, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SparkSqlParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkSqlParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkSqlParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SparkSqlParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SparkSqlParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SparkSqlParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SparkSqlParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SparkSqlParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SparkSqlParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SparkSqlParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkSqlParser.PARTITIONS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SparkSqlParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkSqlParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChangeColumnContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(SparkSqlParser.CHANGE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SparkSqlParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public ChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SparkSqlParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkSqlParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SparkSqlParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SparkSqlParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkSqlParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SparkSqlParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SparkSqlParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkSqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkSqlParser.PARTITIONED, 0); }
		public TerminalNode ON() { return getToken(SparkSqlParser.ON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(SparkSqlParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SparkSqlParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode IF() { return getToken(SparkSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SparkSqlParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlParser.VIEW, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SparkSqlParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkSqlParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SparkSqlParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlParser.VIEW, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDatabasesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SparkSqlParser.DATABASES, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlParser.LIKE, 0); }
		public ShowDatabasesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterShowDatabases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitShowDatabases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitShowDatabases(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public TableIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SparkSqlParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlParser.TBLPROPERTIES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SparkSqlParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SparkSqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkSqlParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkSqlParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SparkSqlParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TerminalNode CACHE() { return getToken(SparkSqlParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SparkSqlParser.LAZY, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public ColTypeListContext columns;
		public TerminalNode ALTER() { return getToken(SparkSqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkSqlParser.ADD, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlParser.COLUMNS, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkSqlParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(USE);
				setState(233);
				((UseContext)_localctx).db = identifier();
				}
				break;
			case 3:
				_localctx = new CreateDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(CREATE);
				setState(235);
				match(DATABASE);
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(236);
					match(IF);
					setState(237);
					match(NOT);
					setState(238);
					match(EXISTS);
					}
					break;
				}
				setState(241);
				identifier();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(242);
					match(COMMENT);
					setState(243);
					((CreateDatabaseContext)_localctx).comment = match(STRING);
					}
				}

				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(246);
					locationSpec();
					}
				}

				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(249);
					match(WITH);
					setState(250);
					match(DBPROPERTIES);
					setState(251);
					tablePropertyList();
					}
				}

				}
				break;
			case 4:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				match(ALTER);
				setState(255);
				match(DATABASE);
				setState(256);
				identifier();
				setState(257);
				match(SET);
				setState(258);
				match(DBPROPERTIES);
				setState(259);
				tablePropertyList();
				}
				break;
			case 5:
				_localctx = new DropDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				match(DROP);
				setState(262);
				match(DATABASE);
				setState(265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(263);
					match(IF);
					setState(264);
					match(EXISTS);
					}
					break;
				}
				setState(267);
				identifier();
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(268);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
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
				break;
			case 6:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(271);
				createTableHeader();
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(272);
					match(T__1);
					setState(273);
					colTypeList();
					setState(274);
					match(T__2);
					}
				}

				setState(278);
				tableProvider();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (OPTIONS - 184)) | (1L << (TBLPROPERTIES - 184)) | (1L << (LOCATION - 184)) | (1L << (CLUSTERED - 184)) | (1L << (PARTITIONED - 184)))) != 0)) {
					{
					setState(290);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPTIONS:
						{
						{
						setState(279);
						match(OPTIONS);
						setState(280);
						((CreateTableContext)_localctx).options = tablePropertyList();
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(281);
						match(PARTITIONED);
						setState(282);
						match(BY);
						setState(283);
						((CreateTableContext)_localctx).partitionColumnNames = identifierList();
						}
						}
						break;
					case CLUSTERED:
						{
						setState(284);
						bucketSpec();
						}
						break;
					case LOCATION:
						{
						setState(285);
						locationSpec();
						}
						break;
					case COMMENT:
						{
						{
						setState(286);
						match(COMMENT);
						setState(287);
						((CreateTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(288);
						match(TBLPROPERTIES);
						setState(289);
						((CreateTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (WITH - 78)) | (1L << (VALUES - 78)) | (1L << (TABLE - 78)) | (1L << (INSERT - 78)) | (1L << (MAP - 78)))) != 0) || _la==REDUCE) {
					{
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(295);
						match(AS);
						}
					}

					setState(298);
					query();
					}
				}

				}
				break;
			case 7:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(301);
				createTableHeader();
				setState(306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(302);
					match(T__1);
					setState(303);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(304);
					match(T__2);
					}
					break;
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ROW || _la==COMMENT || ((((_la - 186)) & ~0x3f) == 0 && ((1L << (_la - 186)) & ((1L << (TBLPROPERTIES - 186)) | (1L << (SKEWED - 186)) | (1L << (STORED - 186)) | (1L << (LOCATION - 186)) | (1L << (CLUSTERED - 186)) | (1L << (PARTITIONED - 186)))) != 0)) {
					{
					setState(323);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(308);
						match(COMMENT);
						setState(309);
						((CreateHiveTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(310);
						match(PARTITIONED);
						setState(311);
						match(BY);
						setState(312);
						match(T__1);
						setState(313);
						((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
						setState(314);
						match(T__2);
						}
						}
						break;
					case CLUSTERED:
						{
						setState(316);
						bucketSpec();
						}
						break;
					case SKEWED:
						{
						setState(317);
						skewSpec();
						}
						break;
					case ROW:
						{
						setState(318);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(319);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(320);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(321);
						match(TBLPROPERTIES);
						setState(322);
						((CreateHiveTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (WITH - 78)) | (1L << (VALUES - 78)) | (1L << (TABLE - 78)) | (1L << (INSERT - 78)) | (1L << (MAP - 78)))) != 0) || _la==REDUCE) {
					{
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(328);
						match(AS);
						}
					}

					setState(331);
					query();
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(334);
				match(CREATE);
				setState(335);
				match(TABLE);
				setState(339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(336);
					match(IF);
					setState(337);
					match(NOT);
					setState(338);
					match(EXISTS);
					}
					break;
				}
				setState(341);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(342);
				match(LIKE);
				setState(343);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(344);
					locationSpec();
					}
				}

				}
				break;
			case 9:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(347);
				match(ANALYZE);
				setState(348);
				match(TABLE);
				setState(349);
				tableIdentifier();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(350);
					partitionSpec();
					}
				}

				setState(353);
				match(COMPUTE);
				setState(354);
				match(STATISTICS);
				setState(359);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(355);
					identifier();
					}
					break;
				case 2:
					{
					setState(356);
					match(FOR);
					setState(357);
					match(COLUMNS);
					setState(358);
					identifierSeq();
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(361);
				match(ALTER);
				setState(362);
				match(TABLE);
				setState(363);
				tableIdentifier();
				setState(364);
				match(ADD);
				setState(365);
				match(COLUMNS);
				setState(366);
				match(T__1);
				setState(367);
				((AddTableColumnsContext)_localctx).columns = colTypeList();
				setState(368);
				match(T__2);
				}
				break;
			case 11:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(370);
				match(ALTER);
				setState(371);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(372);
				((RenameTableContext)_localctx).from = tableIdentifier();
				setState(373);
				match(RENAME);
				setState(374);
				match(TO);
				setState(375);
				((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;
			case 12:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(377);
				match(ALTER);
				setState(378);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(379);
				tableIdentifier();
				setState(380);
				match(SET);
				setState(381);
				match(TBLPROPERTIES);
				setState(382);
				tablePropertyList();
				}
				break;
			case 13:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(384);
				match(ALTER);
				setState(385);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(386);
				tableIdentifier();
				setState(387);
				match(UNSET);
				setState(388);
				match(TBLPROPERTIES);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(389);
					match(IF);
					setState(390);
					match(EXISTS);
					}
				}

				setState(393);
				tablePropertyList();
				}
				break;
			case 14:
				_localctx = new ChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(395);
				match(ALTER);
				setState(396);
				match(TABLE);
				setState(397);
				tableIdentifier();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(398);
					partitionSpec();
					}
				}

				setState(401);
				match(CHANGE);
				setState(403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(402);
					match(COLUMN);
					}
					break;
				}
				setState(405);
				identifier();
				setState(406);
				colType();
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FIRST || _la==AFTER) {
					{
					setState(407);
					colPosition();
					}
				}

				}
				break;
			case 15:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(410);
				match(ALTER);
				setState(411);
				match(TABLE);
				setState(412);
				tableIdentifier();
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(413);
					partitionSpec();
					}
				}

				setState(416);
				match(SET);
				setState(417);
				match(SERDE);
				setState(418);
				match(STRING);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(419);
					match(WITH);
					setState(420);
					match(SERDEPROPERTIES);
					setState(421);
					tablePropertyList();
					}
				}

				}
				break;
			case 16:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(424);
				match(ALTER);
				setState(425);
				match(TABLE);
				setState(426);
				tableIdentifier();
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(427);
					partitionSpec();
					}
				}

				setState(430);
				match(SET);
				setState(431);
				match(SERDEPROPERTIES);
				setState(432);
				tablePropertyList();
				}
				break;
			case 17:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(434);
				match(ALTER);
				setState(435);
				match(TABLE);
				setState(436);
				tableIdentifier();
				setState(437);
				match(ADD);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(438);
					match(IF);
					setState(439);
					match(NOT);
					setState(440);
					match(EXISTS);
					}
				}

				setState(444); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(443);
					partitionSpecLocation();
					}
					}
					setState(446); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 18:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(448);
				match(ALTER);
				setState(449);
				match(VIEW);
				setState(450);
				tableIdentifier();
				setState(451);
				match(ADD);
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(452);
					match(IF);
					setState(453);
					match(NOT);
					setState(454);
					match(EXISTS);
					}
				}

				setState(458); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(457);
					partitionSpec();
					}
					}
					setState(460); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 19:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(462);
				match(ALTER);
				setState(463);
				match(TABLE);
				setState(464);
				tableIdentifier();
				setState(465);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(466);
				match(RENAME);
				setState(467);
				match(TO);
				setState(468);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 20:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(470);
				match(ALTER);
				setState(471);
				match(TABLE);
				setState(472);
				tableIdentifier();
				setState(473);
				match(DROP);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(474);
					match(IF);
					setState(475);
					match(EXISTS);
					}
				}

				setState(478);
				partitionSpec();
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(479);
					match(T__3);
					setState(480);
					partitionSpec();
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(486);
					match(PURGE);
					}
				}

				}
				break;
			case 21:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(489);
				match(ALTER);
				setState(490);
				match(VIEW);
				setState(491);
				tableIdentifier();
				setState(492);
				match(DROP);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(493);
					match(IF);
					setState(494);
					match(EXISTS);
					}
				}

				setState(497);
				partitionSpec();
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(498);
					match(T__3);
					setState(499);
					partitionSpec();
					}
					}
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 22:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(505);
				match(ALTER);
				setState(506);
				match(TABLE);
				setState(507);
				tableIdentifier();
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(508);
					partitionSpec();
					}
				}

				setState(511);
				match(SET);
				setState(512);
				locationSpec();
				}
				break;
			case 23:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(514);
				match(ALTER);
				setState(515);
				match(TABLE);
				setState(516);
				tableIdentifier();
				setState(517);
				match(RECOVER);
				setState(518);
				match(PARTITIONS);
				}
				break;
			case 24:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(520);
				match(DROP);
				setState(521);
				match(TABLE);
				setState(524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(522);
					match(IF);
					setState(523);
					match(EXISTS);
					}
					break;
				}
				setState(526);
				tableIdentifier();
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(527);
					match(PURGE);
					}
				}

				}
				break;
			case 25:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(530);
				match(DROP);
				setState(531);
				match(VIEW);
				setState(534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(532);
					match(IF);
					setState(533);
					match(EXISTS);
					}
					break;
				}
				setState(536);
				tableIdentifier();
				}
				break;
			case 26:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(537);
				match(CREATE);
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(538);
					match(OR);
					setState(539);
					match(REPLACE);
					}
				}

				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(542);
						match(GLOBAL);
						}
					}

					setState(545);
					match(TEMPORARY);
					}
				}

				setState(548);
				match(VIEW);
				setState(552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(549);
					match(IF);
					setState(550);
					match(NOT);
					setState(551);
					match(EXISTS);
					}
					break;
				}
				setState(554);
				tableIdentifier();
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(555);
					identifierCommentList();
					}
				}

				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(558);
					match(COMMENT);
					setState(559);
					match(STRING);
					}
				}

				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(562);
					match(PARTITIONED);
					setState(563);
					match(ON);
					setState(564);
					identifierList();
					}
				}

				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(567);
					match(TBLPROPERTIES);
					setState(568);
					tablePropertyList();
					}
				}

				setState(571);
				match(AS);
				setState(572);
				query();
				}
				break;
			case 27:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(574);
				match(CREATE);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(575);
					match(OR);
					setState(576);
					match(REPLACE);
					}
				}

				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(579);
					match(GLOBAL);
					}
				}

				setState(582);
				match(TEMPORARY);
				setState(583);
				match(VIEW);
				setState(584);
				tableIdentifier();
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(585);
					match(T__1);
					setState(586);
					colTypeList();
					setState(587);
					match(T__2);
					}
				}

				setState(591);
				tableProvider();
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(592);
					match(OPTIONS);
					setState(593);
					tablePropertyList();
					}
				}

				}
				break;
			case 28:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(596);
				match(ALTER);
				setState(597);
				match(VIEW);
				setState(598);
				tableIdentifier();
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(599);
					match(AS);
					}
				}

				setState(602);
				query();
				}
				break;
			case 29:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(604);
				match(CREATE);
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(605);
					match(OR);
					setState(606);
					match(REPLACE);
					}
				}

				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(609);
					match(TEMPORARY);
					}
				}

				setState(612);
				match(FUNCTION);
				setState(616);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(613);
					match(IF);
					setState(614);
					match(NOT);
					setState(615);
					match(EXISTS);
					}
					break;
				}
				setState(618);
				qualifiedName();
				setState(619);
				match(AS);
				setState(620);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(621);
					match(USING);
					setState(622);
					resource();
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(623);
						match(T__3);
						setState(624);
						resource();
						}
						}
						setState(629);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 30:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(632);
				match(DROP);
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(633);
					match(TEMPORARY);
					}
				}

				setState(636);
				match(FUNCTION);
				setState(639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(637);
					match(IF);
					setState(638);
					match(EXISTS);
					}
					break;
				}
				setState(641);
				qualifiedName();
				}
				break;
			case 31:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(642);
				match(EXPLAIN);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (LOGICAL - 91)) | (1L << (CODEGEN - 91)) | (1L << (COST - 91)))) != 0) || _la==EXTENDED || _la==FORMATTED) {
					{
					setState(643);
					_la = _input.LA(1);
					if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (LOGICAL - 91)) | (1L << (CODEGEN - 91)) | (1L << (COST - 91)))) != 0) || _la==EXTENDED || _la==FORMATTED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(646);
				statement();
				}
				break;
			case 32:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(647);
				match(SHOW);
				setState(648);
				match(TABLES);
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(649);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(650);
					((ShowTablesContext)_localctx).db = identifier();
					}
				}

				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(653);
						match(LIKE);
						}
					}

					setState(656);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 33:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(659);
				match(SHOW);
				setState(660);
				match(TABLE);
				setState(661);
				match(EXTENDED);
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(662);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(663);
					((ShowTableContext)_localctx).db = identifier();
					}
				}

				setState(666);
				match(LIKE);
				setState(667);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(668);
					partitionSpec();
					}
				}

				}
				break;
			case 34:
				_localctx = new ShowDatabasesContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(671);
				match(SHOW);
				setState(672);
				match(DATABASES);
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(674);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(673);
						match(LIKE);
						}
					}

					setState(676);
					((ShowDatabasesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 35:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(679);
				match(SHOW);
				setState(680);
				match(TBLPROPERTIES);
				setState(681);
				((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(682);
					match(T__1);
					setState(683);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(684);
					match(T__2);
					}
				}

				}
				break;
			case 36:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(688);
				match(SHOW);
				setState(689);
				match(COLUMNS);
				setState(690);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(691);
				tableIdentifier();
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(692);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(693);
					((ShowColumnsContext)_localctx).db = identifier();
					}
				}

				}
				break;
			case 37:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(696);
				match(SHOW);
				setState(697);
				match(PARTITIONS);
				setState(698);
				tableIdentifier();
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(699);
					partitionSpec();
					}
				}

				}
				break;
			case 38:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(702);
				match(SHOW);
				setState(704);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(703);
					identifier();
					}
					break;
				}
				setState(706);
				match(FUNCTIONS);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(708);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(707);
						match(LIKE);
						}
						break;
					}
					setState(712);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SELECT:
					case FROM:
					case ADD:
					case AS:
					case ALL:
					case ANY:
					case DISTINCT:
					case WHERE:
					case GROUP:
					case BY:
					case GROUPING:
					case SETS:
					case CUBE:
					case ROLLUP:
					case ORDER:
					case HAVING:
					case LIMIT:
					case AT:
					case OR:
					case AND:
					case IN:
					case NOT:
					case NO:
					case EXISTS:
					case BETWEEN:
					case LIKE:
					case RLIKE:
					case IS:
					case NULL:
					case TRUE:
					case FALSE:
					case NULLS:
					case ASC:
					case DESC:
					case FOR:
					case INTERVAL:
					case CASE:
					case WHEN:
					case THEN:
					case ELSE:
					case END:
					case JOIN:
					case CROSS:
					case OUTER:
					case INNER:
					case LEFT:
					case SEMI:
					case RIGHT:
					case FULL:
					case NATURAL:
					case ON:
					case PIVOT:
					case LATERAL:
					case WINDOW:
					case OVER:
					case PARTITION:
					case RANGE:
					case ROWS:
					case UNBOUNDED:
					case PRECEDING:
					case FOLLOWING:
					case CURRENT:
					case FIRST:
					case AFTER:
					case LAST:
					case ROW:
					case WITH:
					case VALUES:
					case CREATE:
					case TABLE:
					case DIRECTORY:
					case VIEW:
					case REPLACE:
					case INSERT:
					case DELETE:
					case INTO:
					case DESCRIBE:
					case EXPLAIN:
					case FORMAT:
					case LOGICAL:
					case CODEGEN:
					case COST:
					case CAST:
					case SHOW:
					case TABLES:
					case COLUMNS:
					case COLUMN:
					case USE:
					case PARTITIONS:
					case FUNCTIONS:
					case DROP:
					case UNION:
					case EXCEPT:
					case SETMINUS:
					case INTERSECT:
					case TO:
					case TABLESAMPLE:
					case STRATIFY:
					case ALTER:
					case RENAME:
					case ARRAY:
					case MAP:
					case STRUCT:
					case COMMENT:
					case SET:
					case RESET:
					case DATA:
					case START:
					case TRANSACTION:
					case COMMIT:
					case ROLLBACK:
					case MACRO:
					case IGNORE:
					case BOTH:
					case LEADING:
					case TRAILING:
					case IF:
					case POSITION:
					case EXTRACT:
					case DIV:
					case PERCENTLIT:
					case BUCKET:
					case OUT:
					case OF:
					case SORT:
					case CLUSTER:
					case DISTRIBUTE:
					case OVERWRITE:
					case TRANSFORM:
					case REDUCE:
					case SERDE:
					case SERDEPROPERTIES:
					case RECORDREADER:
					case RECORDWRITER:
					case DELIMITED:
					case FIELDS:
					case TERMINATED:
					case COLLECTION:
					case ITEMS:
					case KEYS:
					case ESCAPED:
					case LINES:
					case SEPARATED:
					case FUNCTION:
					case EXTENDED:
					case REFRESH:
					case CLEAR:
					case CACHE:
					case UNCACHE:
					case LAZY:
					case FORMATTED:
					case GLOBAL:
					case TEMPORARY:
					case OPTIONS:
					case UNSET:
					case TBLPROPERTIES:
					case DBPROPERTIES:
					case BUCKETS:
					case SKEWED:
					case STORED:
					case DIRECTORIES:
					case LOCATION:
					case EXCHANGE:
					case ARCHIVE:
					case UNARCHIVE:
					case FILEFORMAT:
					case TOUCH:
					case COMPACT:
					case CONCATENATE:
					case CHANGE:
					case CASCADE:
					case RESTRICT:
					case CLUSTERED:
					case SORTED:
					case PURGE:
					case INPUTFORMAT:
					case OUTPUTFORMAT:
					case DATABASE:
					case DATABASES:
					case DFS:
					case TRUNCATE:
					case ANALYZE:
					case COMPUTE:
					case LIST:
					case STATISTICS:
					case PARTITIONED:
					case EXTERNAL:
					case DEFINED:
					case REVOKE:
					case GRANT:
					case LOCK:
					case UNLOCK:
					case MSCK:
					case REPAIR:
					case RECOVER:
					case EXPORT:
					case IMPORT:
					case LOAD:
					case ROLE:
					case ROLES:
					case COMPACTIONS:
					case PRINCIPALS:
					case TRANSACTIONS:
					case INDEX:
					case INDEXES:
					case LOCKS:
					case OPTION:
					case ANTI:
					case LOCAL:
					case INPATH:
					case IDENTIFIER:
					case BACKQUOTED_IDENTIFIER:
						{
						setState(710);
						qualifiedName();
						}
						break;
					case STRING:
						{
						setState(711);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 39:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(716);
				match(SHOW);
				setState(717);
				match(CREATE);
				setState(718);
				match(TABLE);
				setState(719);
				tableIdentifier();
				}
				break;
			case 40:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(720);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(721);
				match(FUNCTION);
				setState(723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(722);
					match(EXTENDED);
					}
					break;
				}
				setState(725);
				describeFuncName();
				}
				break;
			case 41:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(726);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(727);
				match(DATABASE);
				setState(729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(728);
					match(EXTENDED);
					}
					break;
				}
				setState(731);
				identifier();
				}
				break;
			case 42:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(732);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(734);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(733);
					match(TABLE);
					}
					break;
				}
				setState(737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(736);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(739);
				tableIdentifier();
				setState(741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(740);
					partitionSpec();
					}
					break;
				}
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(743);
					describeColName();
					}
				}

				}
				break;
			case 43:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(746);
				match(REFRESH);
				setState(747);
				match(TABLE);
				setState(748);
				tableIdentifier();
				}
				break;
			case 44:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(749);
				match(REFRESH);
				setState(757);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(750);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(754);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(751);
							matchWildcard();
							}
							} 
						}
						setState(756);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 45:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(759);
				match(CACHE);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(760);
					match(LAZY);
					}
				}

				setState(763);
				match(TABLE);
				setState(764);
				tableIdentifier();
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (WITH - 78)) | (1L << (VALUES - 78)) | (1L << (TABLE - 78)) | (1L << (INSERT - 78)) | (1L << (MAP - 78)))) != 0) || _la==REDUCE) {
					{
					setState(766);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(765);
						match(AS);
						}
					}

					setState(768);
					query();
					}
				}

				}
				break;
			case 46:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(771);
				match(UNCACHE);
				setState(772);
				match(TABLE);
				setState(775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(773);
					match(IF);
					setState(774);
					match(EXISTS);
					}
					break;
				}
				setState(777);
				tableIdentifier();
				}
				break;
			case 47:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(778);
				match(CLEAR);
				setState(779);
				match(CACHE);
				}
				break;
			case 48:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(780);
				match(LOAD);
				setState(781);
				match(DATA);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(782);
					match(LOCAL);
					}
				}

				setState(785);
				match(INPATH);
				setState(786);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(787);
					match(OVERWRITE);
					}
				}

				setState(790);
				match(INTO);
				setState(791);
				match(TABLE);
				setState(792);
				tableIdentifier();
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(793);
					partitionSpec();
					}
				}

				}
				break;
			case 49:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(796);
				match(TRUNCATE);
				setState(797);
				match(TABLE);
				setState(798);
				tableIdentifier();
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(799);
					partitionSpec();
					}
				}

				}
				break;
			case 50:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(802);
				match(MSCK);
				setState(803);
				match(REPAIR);
				setState(804);
				match(TABLE);
				setState(805);
				tableIdentifier();
				}
				break;
			case 51:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(806);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(807);
				identifier();
				setState(811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(808);
						matchWildcard();
						}
						} 
					}
					setState(813);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				}
				break;
			case 52:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(814);
				match(SET);
				setState(815);
				match(ROLE);
				setState(819);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(816);
						matchWildcard();
						}
						} 
					}
					setState(821);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				}
				break;
			case 53:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(822);
				match(SET);
				setState(826);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(823);
						matchWildcard();
						}
						} 
					}
					setState(828);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				}
				break;
			case 54:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(829);
				match(RESET);
				}
				break;
			case 55:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(830);
				unsupportedHiveNativeCommands();
				setState(834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(831);
						matchWildcard();
						}
						} 
					}
					setState(836);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
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

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SparkSqlParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SparkSqlParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SparkSqlParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SparkSqlParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SparkSqlParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SparkSqlParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkSqlParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SparkSqlParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SparkSqlParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SparkSqlParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SparkSqlParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkSqlParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkSqlParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SparkSqlParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SparkSqlParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SparkSqlParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SparkSqlParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SparkSqlParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkSqlParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SparkSqlParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkSqlParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkSqlParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SparkSqlParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SparkSqlParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SparkSqlParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SparkSqlParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkSqlParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SparkSqlParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SparkSqlParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkSqlParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SparkSqlParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkSqlParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkSqlParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SparkSqlParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SparkSqlParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SparkSqlParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkSqlParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SparkSqlParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkSqlParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SparkSqlParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkSqlParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SparkSqlParser.DFS, 0); }
		public TerminalNode DELETE() { return getToken(SparkSqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlParser.FROM, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(840);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(842);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(843);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(845);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(844);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(847);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(849);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(848);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(851);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(852);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(853);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(854);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(855);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(858);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(859);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(860);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(861);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(862);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(863);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(864);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(865);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(866);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(867);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(868);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(869);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(870);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(871);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(872);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(873);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(874);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(875);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(876);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(877);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(878);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(879);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(880);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(881);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(882);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(883);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(884);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(885);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(886);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(887);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(888);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(889);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(890);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(891);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(892);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(893);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(894);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(895);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(896);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(897);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(898);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(899);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(900);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(901);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(902);
				tableIdentifier();
				setState(903);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(904);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(906);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(907);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(908);
				tableIdentifier();
				setState(909);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(910);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(912);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(913);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(914);
				tableIdentifier();
				setState(915);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(916);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(918);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(919);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(920);
				tableIdentifier();
				setState(921);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(922);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(924);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(925);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(926);
				tableIdentifier();
				setState(927);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(928);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(930);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(931);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(932);
				tableIdentifier();
				setState(933);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(934);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(935);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(936);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(938);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(939);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(940);
				tableIdentifier();
				setState(941);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(942);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(943);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(945);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(946);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(947);
				tableIdentifier();
				setState(948);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(949);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(951);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(952);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(953);
				tableIdentifier();
				setState(954);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(955);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(957);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(958);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(959);
				tableIdentifier();
				setState(960);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(961);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(963);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(964);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(965);
				tableIdentifier();
				setState(966);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(968);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(969);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(970);
				tableIdentifier();
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(971);
					partitionSpec();
					}
				}

				setState(974);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(976);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(977);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(978);
				tableIdentifier();
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(979);
					partitionSpec();
					}
				}

				setState(982);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(984);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(985);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(986);
				tableIdentifier();
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(987);
					partitionSpec();
					}
				}

				setState(990);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(991);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(993);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(994);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(995);
				tableIdentifier();
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(996);
					partitionSpec();
					}
				}

				setState(999);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1000);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1002);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1003);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1004);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1005);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1006);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(1007);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(1008);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
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

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SparkSqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SparkSqlParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkSqlParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SparkSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			match(CREATE);
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1012);
				match(TEMPORARY);
				}
			}

			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1015);
				match(EXTERNAL);
				}
			}

			setState(1018);
			match(TABLE);
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1019);
				match(IF);
				setState(1020);
				match(NOT);
				setState(1021);
				match(EXISTS);
				}
				break;
			}
			setState(1024);
			tableIdentifier();
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

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SparkSqlParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SparkSqlParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkSqlParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SparkSqlParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(CLUSTERED);
			setState(1027);
			match(BY);
			setState(1028);
			identifierList();
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1029);
				match(SORTED);
				setState(1030);
				match(BY);
				setState(1031);
				orderedIdentifierList();
				}
			}

			setState(1034);
			match(INTO);
			setState(1035);
			match(INTEGER_VALUE);
			setState(1036);
			match(BUCKETS);
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

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SparkSqlParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SparkSqlParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SparkSqlParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SparkSqlParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkSqlParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(SKEWED);
			setState(1039);
			match(BY);
			setState(1040);
			identifierList();
			setState(1041);
			match(ON);
			setState(1044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1042);
				constantList();
				}
				break;
			case 2:
				{
				setState(1043);
				nestedConstantList();
				}
				break;
			}
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1046);
				match(STORED);
				setState(1047);
				match(AS);
				setState(1048);
				match(DIRECTORIES);
				}
				break;
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

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SparkSqlParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(LOCATION);
			setState(1052);
			match(STRING);
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
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1054);
				ctes();
				}
			}

			setState(1057);
			queryNoWith();
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

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SparkSqlParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkSqlParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SparkSqlParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(SparkSqlParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkSqlParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SparkSqlParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkSqlParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SparkSqlParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SparkSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SparkSqlParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_insertInto);
		int _la;
		try {
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				match(INSERT);
				setState(1060);
				match(OVERWRITE);
				setState(1061);
				match(TABLE);
				setState(1062);
				tableIdentifier();
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1063);
					partitionSpec();
					setState(1067);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1064);
						match(IF);
						setState(1065);
						match(NOT);
						setState(1066);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				match(INSERT);
				setState(1072);
				match(INTO);
				setState(1074);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1073);
					match(TABLE);
					}
					break;
				}
				setState(1076);
				tableIdentifier();
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1077);
					partitionSpec();
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1080);
				match(INSERT);
				setState(1081);
				match(OVERWRITE);
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1082);
					match(LOCAL);
					}
				}

				setState(1085);
				match(DIRECTORY);
				setState(1086);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1087);
					rowFormat();
					}
				}

				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1090);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1093);
				match(INSERT);
				setState(1094);
				match(OVERWRITE);
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1095);
					match(LOCAL);
					}
				}

				setState(1098);
				match(DIRECTORY);
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1099);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1102);
				tableProvider();
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1103);
					match(OPTIONS);
					setState(1104);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
				}

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

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			partitionSpec();
			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1110);
				locationSpec();
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

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SparkSqlParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113);
			match(PARTITION);
			setState(1114);
			match(T__1);
			setState(1115);
			partitionVal();
			setState(1120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1116);
				match(T__3);
				setState(1117);
				partitionVal();
				}
				}
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1123);
			match(T__2);
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

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkSqlParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			identifier();
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1126);
				match(EQ);
				setState(1127);
				constant();
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

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_describeFuncName);
		try {
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1132);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1133);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1134);
				predicateOperator();
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

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1138);
				match(T__4);
				setState(1139);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1144);
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

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SparkSqlParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			match(WITH);
			setState(1146);
			namedQuery();
			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1147);
				match(T__3);
				setState(1148);
				namedQuery();
				}
				}
				setState(1153);
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

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1155);
				match(AS);
				}
			}

			setState(1158);
			match(T__1);
			setState(1159);
			query();
			setState(1160);
			match(T__2);
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

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SparkSqlParser.USING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(USING);
			setState(1163);
			qualifiedName();
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

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(T__1);
			setState(1166);
			tableProperty();
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1167);
				match(T__3);
				setState(1168);
				tableProperty();
				}
				}
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1174);
			match(T__2);
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

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkSqlParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 241)) & ~0x3f) == 0 && ((1L << (_la - 241)) & ((1L << (STRING - 241)) | (1L << (INTEGER_VALUE - 241)) | (1L << (DECIMAL_VALUE - 241)))) != 0)) {
				{
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1177);
					match(EQ);
					}
				}

				setState(1180);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
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

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183);
				identifier();
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1184);
					match(T__4);
					setState(1185);
					identifier();
					}
					}
					setState(1190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1191);
				match(STRING);
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

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkSqlParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tablePropertyValue);
		try {
			setState(1198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1194);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1195);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1196);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1197);
				match(STRING);
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

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(T__1);
			setState(1201);
			constant();
			setState(1206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1202);
				match(T__3);
				setState(1203);
				constant();
				}
				}
				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1209);
			match(T__2);
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

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(T__1);
			setState(1212);
			constantList();
			setState(1217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1213);
				match(T__3);
				setState(1214);
				constantList();
				}
				}
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1220);
			match(T__2);
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

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SparkSqlParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SparkSqlParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_createFileFormat);
		try {
			setState(1228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				match(STORED);
				setState(1223);
				match(AS);
				setState(1224);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1225);
				match(STORED);
				setState(1226);
				match(BY);
				setState(1227);
				storageHandler();
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

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SparkSqlParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkSqlParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fileFormat);
		try {
			setState(1235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1230);
				match(INPUTFORMAT);
				setState(1231);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1232);
				match(OUTPUTFORMAT);
				setState(1233);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1234);
				identifier();
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

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SparkSqlParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkSqlParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			match(STRING);
			setState(1241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1238);
				match(WITH);
				setState(1239);
				match(SERDEPROPERTIES);
				setState(1240);
				tablePropertyList();
				}
				break;
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

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			identifier();
			setState(1244);
			match(STRING);
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

	public static class QueryNoWithContext extends ParserRuleContext {
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	 
		public QueryNoWithContext() { }
		public void copyFrom(QueryNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleInsertQueryContext extends QueryNoWithContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends QueryNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_queryNoWith);
		int _la;
		try {
			setState(1258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(1246);
					insertInto();
					}
				}

				setState(1249);
				queryTerm(0);
				setState(1250);
				queryOrganization();
				}
				break;
			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1252);
				fromClause();
				setState(1254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1253);
					multiInsertQueryBody();
					}
					}
					setState(1256); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SELECT || _la==FROM || _la==INSERT || _la==MAP || _la==REDUCE );
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

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SparkSqlParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SparkSqlParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkSqlParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SparkSqlParser.SORT, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SparkSqlParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SparkSqlParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1260);
				match(ORDER);
				setState(1261);
				match(BY);
				setState(1262);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1263);
					match(T__3);
					setState(1264);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(1272);
				match(CLUSTER);
				setState(1273);
				match(BY);
				setState(1274);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1275);
					match(T__3);
					setState(1276);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(1284);
				match(DISTRIBUTE);
				setState(1285);
				match(BY);
				setState(1286);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1287);
					match(T__3);
					setState(1288);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1296);
				match(SORT);
				setState(1297);
				match(BY);
				setState(1298);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1299);
					match(T__3);
					setState(1300);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1308);
				windows();
				}
			}

			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1311);
				match(LIMIT);
				setState(1314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1312);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1313);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
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

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_multiInsertQueryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(1318);
				insertInto();
				}
			}

			setState(1321);
			querySpecification();
			setState(1322);
			queryOrganization();
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

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SparkSqlParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SparkSqlParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SparkSqlParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SparkSqlParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1325);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1327);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1328);
						if (!(legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enbled");
						setState(1329);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (UNION - 103)) | (1L << (EXCEPT - 103)) | (1L << (SETMINUS - 103)) | (1L << (INTERSECT - 103)))) != 0)) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1331);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1330);
							setQuantifier();
							}
						}

						setState(1333);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1334);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1335);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1336);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1338);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1337);
							setQuantifier();
							}
						}

						setState(1340);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1341);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1342);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1343);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (UNION - 103)) | (1L << (EXCEPT - 103)) | (1L << (SETMINUS - 103)))) != 0)) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1345);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1344);
							setQuantifier();
							}
						}

						setState(1347);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_queryPrimary);
		try {
			setState(1361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1353);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1354);
				match(TABLE);
				setState(1355);
				tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1356);
				inlineTable();
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1357);
				match(T__1);
				setState(1358);
				queryNoWith();
				setState(1359);
				match(T__2);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SparkSqlParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SparkSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SparkSqlParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SparkSqlParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			expression();
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1364);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1367);
				match(NULLS);
				setState(1368);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public BooleanExpressionContext where;
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public BooleanExpressionContext having;
		public TerminalNode USING() { return getToken(SparkSqlParser.USING, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(SparkSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlParser.STRING, i);
		}
		public TerminalNode RECORDWRITER() { return getToken(SparkSqlParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkSqlParser.RECORDREADER, 0); }
		public TerminalNode WHERE() { return getToken(SparkSqlParser.WHERE, 0); }
		public TerminalNode SELECT() { return getToken(SparkSqlParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode TRANSFORM() { return getToken(SparkSqlParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SparkSqlParser.REDUCE, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SparkSqlParser.HAVING, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			setState(1461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1381);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1371);
					match(SELECT);
					setState(1372);
					((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(1373);
					match(T__1);
					setState(1374);
					namedExpressionSeq();
					setState(1375);
					match(T__2);
					}
					break;
				case MAP:
					{
					setState(1377);
					((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(1378);
					namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(1379);
					((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(1380);
					namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1383);
					((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(1386);
					match(RECORDWRITER);
					setState(1387);
					((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(1390);
				match(USING);
				setState(1391);
				((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(1404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1392);
					match(AS);
					setState(1402);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
					case 1:
						{
						setState(1393);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1394);
						colTypeList();
						}
						break;
					case 3:
						{
						{
						setState(1395);
						match(T__1);
						setState(1398);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
						case 1:
							{
							setState(1396);
							identifierSeq();
							}
							break;
						case 2:
							{
							setState(1397);
							colTypeList();
							}
							break;
						}
						setState(1400);
						match(T__2);
						}
						}
						break;
					}
					}
				}

				setState(1407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1406);
					((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
				}

				setState(1411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECORDREADER) {
					{
					setState(1409);
					match(RECORDREADER);
					setState(1410);
					((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
				}

				setState(1413);
				fromClause();
				setState(1416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1414);
					match(WHERE);
					setState(1415);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1439);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1418);
					((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(1422);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(1419);
						((QuerySpecificationContext)_localctx).hint = hint();
						((QuerySpecificationContext)_localctx).hints.add(((QuerySpecificationContext)_localctx).hint);
						}
						}
						setState(1424);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1426);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
					case 1:
						{
						setState(1425);
						setQuantifier();
						}
						break;
					}
					setState(1428);
					namedExpressionSeq();
					setState(1429);
					fromClause();
					}
					break;
				case FROM:
					{
					setState(1431);
					fromClause();
					setState(1437);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						setState(1432);
						((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(1434);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
						case 1:
							{
							setState(1433);
							setQuantifier();
							}
							break;
						}
						setState(1436);
						namedExpressionSeq();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1441);
						lateralView();
						}
						} 
					}
					setState(1446);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
				}
				setState(1449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1447);
					match(WHERE);
					setState(1448);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				setState(1452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1451);
					aggregation();
					}
					break;
				}
				setState(1456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1454);
					match(HAVING);
					setState(1455);
					((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					}
					break;
				}
				setState(1459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1458);
					windows();
					}
					break;
				}
				}
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

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			match(T__5);
			setState(1464);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				{
				setState(1466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(1465);
					match(T__3);
					}
				}

				setState(1468);
				((HintContext)_localctx).hintStatement = hintStatement();
				((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
				}
				}
				setState(1473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1474);
			match(T__6);
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

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_hintStatement);
		int _la;
		try {
			setState(1489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1476);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1477);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1478);
				match(T__1);
				setState(1479);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1480);
					match(T__3);
					setState(1481);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1487);
				match(T__2);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SparkSqlParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			match(FROM);
			setState(1492);
			relation();
			setState(1497);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1493);
					match(T__3);
					setState(1494);
					relation();
					}
					} 
				}
				setState(1499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			}
			setState(1503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1500);
					lateralView();
					}
					} 
				}
				setState(1505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			}
			setState(1507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1506);
				pivotClause();
				}
				break;
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

	public static class AggregationContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SparkSqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SparkSqlParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SparkSqlParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SparkSqlParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SparkSqlParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SparkSqlParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SparkSqlParser.GROUPING, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_aggregation);
		int _la;
		try {
			int _alt;
			setState(1553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1509);
				match(GROUP);
				setState(1510);
				match(BY);
				setState(1511);
				((AggregationContext)_localctx).expression = expression();
				((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
				setState(1516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1512);
						match(T__3);
						setState(1513);
						((AggregationContext)_localctx).expression = expression();
						((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
						}
						} 
					}
					setState(1518);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				}
				setState(1536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1519);
					match(WITH);
					setState(1520);
					((AggregationContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1521);
					match(WITH);
					setState(1522);
					((AggregationContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1523);
					((AggregationContext)_localctx).kind = match(GROUPING);
					setState(1524);
					match(SETS);
					setState(1525);
					match(T__1);
					setState(1526);
					groupingSet();
					setState(1531);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1527);
						match(T__3);
						setState(1528);
						groupingSet();
						}
						}
						setState(1533);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1534);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1538);
				match(GROUP);
				setState(1539);
				match(BY);
				setState(1540);
				((AggregationContext)_localctx).kind = match(GROUPING);
				setState(1541);
				match(SETS);
				setState(1542);
				match(T__1);
				setState(1543);
				groupingSet();
				setState(1548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1544);
					match(T__3);
					setState(1545);
					groupingSet();
					}
					}
					setState(1550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1551);
				match(T__2);
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

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_groupingSet);
		int _la;
		try {
			setState(1568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1555);
				match(T__1);
				setState(1564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(1556);
					expression();
					setState(1561);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1557);
						match(T__3);
						setState(1558);
						expression();
						}
						}
						setState(1563);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1566);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1567);
				expression();
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

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SparkSqlParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(SparkSqlParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SparkSqlParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			match(PIVOT);
			setState(1571);
			match(T__1);
			setState(1572);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(1573);
			match(FOR);
			setState(1574);
			pivotColumn();
			setState(1575);
			match(IN);
			setState(1576);
			match(T__1);
			setState(1577);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1578);
				match(T__3);
				setState(1579);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(1584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1585);
			match(T__2);
			setState(1586);
			match(T__2);
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

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_pivotColumn);
		int _la;
		try {
			setState(1600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1588);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(1589);
				match(T__1);
				setState(1590);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(1595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1591);
					match(T__3);
					setState(1592);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(1597);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1598);
				match(T__2);
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

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_pivotValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			expression();
			setState(1607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1604);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1603);
					match(AS);
					}
					break;
				}
				setState(1606);
				identifier();
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

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SparkSqlParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SparkSqlParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			match(LATERAL);
			setState(1610);
			match(VIEW);
			setState(1612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1611);
				match(OUTER);
				}
				break;
			}
			setState(1614);
			qualifiedName();
			setState(1615);
			match(T__1);
			setState(1624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1616);
				expression();
				setState(1621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1617);
					match(T__3);
					setState(1618);
					expression();
					}
					}
					setState(1623);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1626);
			match(T__2);
			setState(1627);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1628);
					match(AS);
					}
					break;
				}
				setState(1631);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1632);
						match(T__3);
						setState(1633);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1638);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
				}
				}
				break;
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SparkSqlParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SparkSqlParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
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

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
			relationPrimary();
			setState(1647);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1644);
					joinRelation();
					}
					} 
				}
				setState(1649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
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

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SparkSqlParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SparkSqlParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_joinRelation);
		try {
			setState(1661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case CROSS:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case ANTI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1650);
				joinType();
				}
				setState(1651);
				match(JOIN);
				setState(1652);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1654);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1653);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1656);
				match(NATURAL);
				setState(1657);
				joinType();
				setState(1658);
				match(JOIN);
				setState(1659);
				((JoinRelationContext)_localctx).right = relationPrimary();
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SparkSqlParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SparkSqlParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SparkSqlParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SparkSqlParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SparkSqlParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SparkSqlParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SparkSqlParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SparkSqlParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_joinType);
		int _la;
		try {
			setState(1685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1663);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1666);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1667);
				match(LEFT);
				setState(1669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1668);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1671);
				match(LEFT);
				setState(1672);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1673);
				match(RIGHT);
				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1674);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1677);
				match(FULL);
				setState(1679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1678);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1681);
					match(LEFT);
					}
				}

				setState(1684);
				match(ANTI);
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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SparkSqlParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SparkSqlParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_joinCriteria);
		int _la;
		try {
			setState(1701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1687);
				match(ON);
				setState(1688);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1689);
				match(USING);
				setState(1690);
				match(T__1);
				setState(1691);
				identifier();
				setState(1696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1692);
					match(T__3);
					setState(1693);
					identifier();
					}
					}
					setState(1698);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1699);
				match(T__2);
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

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(SparkSqlParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			match(TABLESAMPLE);
			setState(1704);
			match(T__1);
			setState(1706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1705);
				sampleMethod();
				}
			}

			setState(1708);
			match(T__2);
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

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SparkSqlParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SparkSqlParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkSqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SparkSqlParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SparkSqlParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SparkSqlParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SparkSqlParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SparkSqlParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SparkSqlParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_sampleMethod);
		int _la;
		try {
			setState(1734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1710);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(1713);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1714);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1715);
				expression();
				setState(1716);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1718);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(1719);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1720);
				match(OUT);
				setState(1721);
				match(OF);
				setState(1722);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1723);
					match(ON);
					setState(1729);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
					case 1:
						{
						setState(1724);
						identifier();
						}
						break;
					case 2:
						{
						setState(1725);
						qualifiedName();
						setState(1726);
						match(T__1);
						setState(1727);
						match(T__2);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1733);
				((SampleByBytesContext)_localctx).bytes = expression();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			match(T__1);
			setState(1737);
			identifierSeq();
			setState(1738);
			match(T__2);
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

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_identifierSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			identifier();
			setState(1745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1741);
				match(T__3);
				setState(1742);
				identifier();
				}
				}
				setState(1747);
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

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			match(T__1);
			setState(1749);
			orderedIdentifier();
			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1750);
				match(T__3);
				setState(1751);
				orderedIdentifier();
				}
				}
				setState(1756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1757);
			match(T__2);
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

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public Token ordering;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SparkSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			identifier();
			setState(1761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1760);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
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

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			match(T__1);
			setState(1764);
			identifierComment();
			setState(1769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1765);
				match(T__3);
				setState(1766);
				identifierComment();
				}
				}
				setState(1771);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1772);
			match(T__2);
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

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkSqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			identifier();
			setState(1777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1775);
				match(COMMENT);
				setState(1776);
				match(STRING);
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_relationPrimary);
		try {
			setState(1803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1779);
				tableIdentifier();
				setState(1781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1780);
					sample();
					}
					break;
				}
				setState(1783);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1785);
				match(T__1);
				setState(1786);
				queryNoWith();
				setState(1787);
				match(T__2);
				setState(1789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1788);
					sample();
					}
					break;
				}
				setState(1791);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1793);
				match(T__1);
				setState(1794);
				relation();
				setState(1795);
				match(T__2);
				setState(1797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1796);
					sample();
					}
					break;
				}
				setState(1799);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1801);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1802);
				functionTable();
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

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SparkSqlParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1805);
			match(VALUES);
			setState(1806);
			expression();
			setState(1811);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1807);
					match(T__3);
					setState(1808);
					expression();
					}
					} 
				}
				setState(1813);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			}
			setState(1814);
			tableAlias();
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

	public static class FunctionTableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			identifier();
			setState(1817);
			match(T__1);
			setState(1826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
				{
				setState(1818);
				expression();
				setState(1823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1819);
					match(T__3);
					setState(1820);
					expression();
					}
					}
					setState(1825);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1828);
			match(T__2);
			setState(1829);
			tableAlias();
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

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(1832);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1831);
					match(AS);
					}
					break;
				}
				setState(1834);
				strictIdentifier();
				setState(1836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1835);
					identifierList();
					}
					break;
				}
				}
				break;
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

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SparkSqlParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SparkSqlParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SparkSqlParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SparkSqlParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkSqlParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SparkSqlParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SparkSqlParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkSqlParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SparkSqlParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SparkSqlParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SparkSqlParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SparkSqlParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SparkSqlParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SparkSqlParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SparkSqlParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SparkSqlParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SparkSqlParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_rowFormat);
		int _la;
		try {
			setState(1889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1840);
				match(ROW);
				setState(1841);
				match(FORMAT);
				setState(1842);
				match(SERDE);
				setState(1843);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1844);
					match(WITH);
					setState(1845);
					match(SERDEPROPERTIES);
					setState(1846);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1849);
				match(ROW);
				setState(1850);
				match(FORMAT);
				setState(1851);
				match(DELIMITED);
				setState(1861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FIELDS) {
					{
					setState(1852);
					match(FIELDS);
					setState(1853);
					match(TERMINATED);
					setState(1854);
					match(BY);
					setState(1855);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1859);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPED) {
						{
						setState(1856);
						match(ESCAPED);
						setState(1857);
						match(BY);
						setState(1858);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
					}

					}
				}

				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLECTION) {
					{
					setState(1863);
					match(COLLECTION);
					setState(1864);
					match(ITEMS);
					setState(1865);
					match(TERMINATED);
					setState(1866);
					match(BY);
					setState(1867);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
				}

				setState(1875);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1870);
					match(MAP);
					setState(1871);
					match(KEYS);
					setState(1872);
					match(TERMINATED);
					setState(1873);
					match(BY);
					setState(1874);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES) {
					{
					setState(1877);
					match(LINES);
					setState(1878);
					match(TERMINATED);
					setState(1879);
					match(BY);
					setState(1880);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
				}

				setState(1887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL) {
					{
					setState(1883);
					match(NULL);
					setState(1884);
					match(DEFINED);
					setState(1885);
					match(AS);
					setState(1886);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
				}

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

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(1891);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(1892);
				match(T__4);
				}
				break;
			}
			setState(1896);
			((TableIdentifierContext)_localctx).table = identifier();
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

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext function;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(1898);
				((FunctionIdentifierContext)_localctx).db = identifier();
				setState(1899);
				match(T__4);
				}
				break;
			}
			setState(1903);
			((FunctionIdentifierContext)_localctx).function = identifier();
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

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1905);
			expression();
			setState(1913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(1907);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(1906);
					match(AS);
					}
					break;
				}
				setState(1911);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case ANY:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case PIVOT:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case FIRST:
				case AFTER:
				case LAST:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case DIRECTORY:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case COST:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IGNORE:
				case BOTH:
				case LEADING:
				case TRAILING:
				case IF:
				case POSITION:
				case EXTRACT:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case GLOBAL:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case RECOVER:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1909);
					identifier();
					}
					break;
				case T__1:
					{
					setState(1910);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1915);
			namedExpression();
			setState(1920);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1916);
					match(T__3);
					setState(1917);
					namedExpression();
					}
					} 
				}
				setState(1922);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,254,_ctx);
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
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			booleanExpression(0);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SparkSqlParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SparkSqlParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SparkSqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(SparkSqlParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1926);
				match(NOT);
				setState(1927);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1928);
				match(EXISTS);
				setState(1929);
				match(T__1);
				setState(1930);
				query();
				setState(1931);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1933);
				valueExpression(0);
				setState(1935);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1934);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1947);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1945);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1939);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1940);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1941);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1942);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1943);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1944);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1949);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SparkSqlParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkSqlParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SparkSqlParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SparkSqlParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SparkSqlParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(SparkSqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlParser.NULL, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SparkSqlParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_predicate);
		int _la;
		try {
			setState(1998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1950);
					match(NOT);
					}
				}

				setState(1953);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(1954);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1955);
				match(AND);
				setState(1956);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1958);
					match(NOT);
					}
				}

				setState(1961);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1962);
				match(T__1);
				setState(1963);
				expression();
				setState(1968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1964);
					match(T__3);
					setState(1965);
					expression();
					}
					}
					setState(1970);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1971);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1973);
					match(NOT);
					}
				}

				setState(1976);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1977);
				match(T__1);
				setState(1978);
				query();
				setState(1979);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1981);
					match(NOT);
					}
				}

				setState(1984);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1985);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1986);
				match(IS);
				setState(1988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1987);
					match(NOT);
					}
				}

				setState(1990);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1991);
				match(IS);
				setState(1993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1992);
					match(NOT);
					}
				}

				setState(1995);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(1996);
				match(FROM);
				setState(1997);
				((PredicateContext)_localctx).right = valueExpression(0);
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SparkSqlParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SparkSqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SparkSqlParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SparkSqlParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SparkSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SparkSqlParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SparkSqlParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SparkSqlParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SparkSqlParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SparkSqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SparkSqlParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SparkSqlParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 148;
		enterRecursionRule(_localctx, 148, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2001);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2002);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (PLUS - 139)) | (1L << (MINUS - 139)) | (1L << (TILDE - 139)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2003);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2027);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2025);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2006);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2007);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ASTERISK - 141)) | (1L << (SLASH - 141)) | (1L << (PERCENT - 141)) | (1L << (DIV - 141)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2008);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2009);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2010);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (PLUS - 139)) | (1L << (MINUS - 139)) | (1L << (CONCAT_PIPE - 139)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2011);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2012);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2013);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2014);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2015);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2016);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2017);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2018);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2019);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2020);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2021);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2022);
						comparisonOperator();
						setState(2023);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2029);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SparkSqlParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SparkSqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(SparkSqlParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SparkSqlParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SparkSqlParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SparkSqlParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SparkSqlParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SparkSqlParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SparkSqlParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SparkSqlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SparkSqlParser.IDENTIFIER, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SparkSqlParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public Token trimOption;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode OVER() { return getToken(SparkSqlParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkSqlParser.FROM, 0); }
		public TerminalNode BOTH() { return getToken(SparkSqlParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SparkSqlParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SparkSqlParser.TRAILING, 0); }
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SparkSqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(SparkSqlParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SparkSqlParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SparkSqlParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(SparkSqlParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SparkSqlParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SparkSqlParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SparkSqlParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 150;
		enterRecursionRule(_localctx, 150, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2031);
				match(CASE);
				setState(2033); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2032);
					whenClause();
					}
					}
					setState(2035); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2037);
					match(ELSE);
					setState(2038);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2041);
				match(END);
				}
				break;
			case 2:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2043);
				match(CASE);
				setState(2044);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2046); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2045);
					whenClause();
					}
					}
					setState(2048); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2050);
					match(ELSE);
					setState(2051);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2054);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2056);
				match(CAST);
				setState(2057);
				match(T__1);
				setState(2058);
				expression();
				setState(2059);
				match(AS);
				setState(2060);
				dataType();
				setState(2061);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2063);
				match(STRUCT);
				setState(2064);
				match(T__1);
				setState(2073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(2065);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2070);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2066);
						match(T__3);
						setState(2067);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2072);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2075);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2076);
				match(FIRST);
				setState(2077);
				match(T__1);
				setState(2078);
				expression();
				setState(2081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2079);
					match(IGNORE);
					setState(2080);
					match(NULLS);
					}
				}

				setState(2083);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2085);
				match(LAST);
				setState(2086);
				match(T__1);
				setState(2087);
				expression();
				setState(2090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2088);
					match(IGNORE);
					setState(2089);
					match(NULLS);
					}
				}

				setState(2092);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2094);
				match(POSITION);
				setState(2095);
				match(T__1);
				setState(2096);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2097);
				match(IN);
				setState(2098);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2099);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2101);
				constant();
				}
				break;
			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2102);
				match(ASTERISK);
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2103);
				qualifiedName();
				setState(2104);
				match(T__4);
				setState(2105);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2107);
				match(T__1);
				setState(2108);
				namedExpression();
				setState(2111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2109);
					match(T__3);
					setState(2110);
					namedExpression();
					}
					}
					setState(2113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2115);
				match(T__2);
				}
				break;
			case 12:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2117);
				match(T__1);
				setState(2118);
				query();
				setState(2119);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2121);
				qualifiedName();
				setState(2122);
				match(T__1);
				setState(2134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(2124);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
					case 1:
						{
						setState(2123);
						setQuantifier();
						}
						break;
					}
					setState(2126);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2127);
						match(T__3);
						setState(2128);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2133);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2136);
				match(T__2);
				setState(2139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2137);
					match(OVER);
					setState(2138);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2141);
				qualifiedName();
				setState(2142);
				match(T__1);
				setState(2143);
				((FunctionCallContext)_localctx).trimOption = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (BOTH - 125)) | (1L << (LEADING - 125)) | (1L << (TRAILING - 125)))) != 0)) ) {
					((FunctionCallContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2144);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2145);
				match(FROM);
				setState(2146);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2147);
				match(T__2);
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2149);
				match(IDENTIFIER);
				setState(2150);
				match(T__7);
				setState(2151);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2152);
				match(T__1);
				setState(2153);
				match(IDENTIFIER);
				setState(2156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2154);
					match(T__3);
					setState(2155);
					match(IDENTIFIER);
					}
					}
					setState(2158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2160);
				match(T__2);
				setState(2161);
				match(T__7);
				setState(2162);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2163);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2164);
				match(T__1);
				setState(2165);
				expression();
				setState(2166);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2168);
				match(EXTRACT);
				setState(2169);
				match(T__1);
				setState(2170);
				((ExtractContext)_localctx).field = identifier();
				setState(2171);
				match(FROM);
				setState(2172);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2173);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2177);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2178);
						match(T__8);
						setState(2179);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2180);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2182);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2183);
						match(T__4);
						setState(2184);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SparkSqlParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SparkSqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_constant);
		try {
			int _alt;
			setState(2202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2190);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2191);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2192);
				identifier();
				setState(2193);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2195);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2196);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2198); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2197);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2200); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SparkSqlParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SparkSqlParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SparkSqlParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SparkSqlParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SparkSqlParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SparkSqlParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SparkSqlParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SparkSqlParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
			_la = _input.LA(1);
			if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (EQ - 131)) | (1L << (NSEQ - 131)) | (1L << (NEQ - 131)) | (1L << (NEQJ - 131)) | (1L << (LT - 131)) | (1L << (LTE - 131)) | (1L << (GT - 131)) | (1L << (GTE - 131)))) != 0)) ) {
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SparkSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SparkSqlParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SparkSqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SparkSqlParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SparkSqlParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SparkSqlParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SparkSqlParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SparkSqlParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SparkSqlParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SparkSqlParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2206);
			_la = _input.LA(1);
			if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (PLUS - 139)) | (1L << (MINUS - 139)) | (1L << (ASTERISK - 139)) | (1L << (SLASH - 139)) | (1L << (PERCENT - 139)) | (1L << (DIV - 139)) | (1L << (TILDE - 139)) | (1L << (AMPERSAND - 139)) | (1L << (PIPE - 139)) | (1L << (CONCAT_PIPE - 139)) | (1L << (HAT - 139)))) != 0)) ) {
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

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SparkSqlParser.OR, 0); }
		public TerminalNode AND() { return getToken(SparkSqlParser.AND, 0); }
		public TerminalNode IN() { return getToken(SparkSqlParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SparkSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SparkSqlParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2210);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SparkSqlParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2212);
			match(INTERVAL);
			setState(2216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2213);
					intervalField();
					}
					} 
				}
				setState(2218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(SparkSqlParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2219);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(2220);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(2223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2221);
				match(TO);
				setState(2222);
				((IntervalFieldContext)_localctx).to = identifier();
				}
				break;
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

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkSqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SparkSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_intervalValue);
		int _la;
		try {
			setState(2230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2225);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2228);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2229);
				match(STRING);
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

	public static class ColPositionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(SparkSqlParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SparkSqlParser.AFTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_colPosition);
		try {
			setState(2235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2232);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2233);
				match(AFTER);
				setState(2234);
				identifier();
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(SparkSqlParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SparkSqlParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(SparkSqlParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SparkSqlParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SparkSqlParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SparkSqlParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SparkSqlParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_dataType);
		int _la;
		try {
			setState(2271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2237);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2238);
				match(LT);
				setState(2239);
				dataType();
				setState(2240);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2242);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2243);
				match(LT);
				setState(2244);
				dataType();
				setState(2245);
				match(T__3);
				setState(2246);
				dataType();
				setState(2247);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2249);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2256);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2250);
					match(LT);
					setState(2252);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
						{
						setState(2251);
						complexColTypeList();
						}
					}

					setState(2254);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2255);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2258);
				identifier();
				setState(2269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(2259);
					match(T__1);
					setState(2260);
					match(INTEGER_VALUE);
					setState(2265);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2261);
						match(T__3);
						setState(2262);
						match(INTEGER_VALUE);
						}
						}
						setState(2267);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2268);
					match(T__2);
					}
				}

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

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_colTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2273);
			colType();
			setState(2278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2274);
				match(T__3);
				setState(2275);
				colType();
				}
				}
				setState(2280);
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

	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkSqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_colType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2281);
			identifier();
			setState(2282);
			dataType();
			setState(2285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2283);
				match(COMMENT);
				setState(2284);
				match(STRING);
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

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2287);
			complexColType();
			setState(2292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2288);
				match(T__3);
				setState(2289);
				complexColType();
				}
				}
				setState(2294);
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

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkSqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2295);
			identifier();
			setState(2296);
			match(T__10);
			setState(2297);
			dataType();
			setState(2300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2298);
				match(COMMENT);
				setState(2299);
				match(STRING);
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SparkSqlParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SparkSqlParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2302);
			match(WHEN);
			setState(2303);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2304);
			match(THEN);
			setState(2305);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class WindowsContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SparkSqlParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterWindows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitWindows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitWindows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowsContext windows() throws RecognitionException {
		WindowsContext _localctx = new WindowsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_windows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2307);
			match(WINDOW);
			setState(2308);
			namedWindow();
			setState(2313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2309);
					match(T__3);
					setState(2310);
					namedWindow();
					}
					} 
				}
				setState(2315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
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

	public static class NamedWindowContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2316);
			identifier();
			setState(2317);
			match(AS);
			setState(2318);
			windowSpec();
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

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SparkSqlParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkSqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SparkSqlParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkSqlParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SparkSqlParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SparkSqlParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_windowSpec);
		int _la;
		try {
			setState(2366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2320);
				((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2321);
				match(T__1);
				setState(2322);
				((WindowRefContext)_localctx).name = identifier();
				setState(2323);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2325);
				match(T__1);
				setState(2360);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2326);
					match(CLUSTER);
					setState(2327);
					match(BY);
					setState(2328);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2333);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2329);
						match(T__3);
						setState(2330);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2335);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__2:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
				case DISTRIBUTE:
					{
					setState(2346);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(2336);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2337);
						match(BY);
						setState(2338);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2343);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2339);
							match(T__3);
							setState(2340);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2345);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2358);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2348);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2349);
						match(BY);
						setState(2350);
						sortItem();
						setState(2355);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2351);
							match(T__3);
							setState(2352);
							sortItem();
							}
							}
							setState(2357);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2362);
					windowFrame();
					}
				}

				setState(2365);
				match(T__2);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SparkSqlParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SparkSqlParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkSqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SparkSqlParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_windowFrame);
		try {
			setState(2384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2368);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2369);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2370);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2371);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2372);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2373);
				match(BETWEEN);
				setState(2374);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2375);
				match(AND);
				setState(2376);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2378);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2379);
				match(BETWEEN);
				setState(2380);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2381);
				match(AND);
				setState(2382);
				((WindowFrameContext)_localctx).end = frameBound();
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

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SparkSqlParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkSqlParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkSqlParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SparkSqlParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SparkSqlParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_frameBound);
		int _la;
		try {
			setState(2393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2386);
				match(UNBOUNDED);
				setState(2387);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2388);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2389);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2390);
				expression();
				setState(2391);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2395);
			identifier();
			setState(2400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2396);
					match(T__4);
					setState(2397);
					identifier();
					}
					} 
				}
				setState(2402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode ANTI() { return getToken(SparkSqlParser.ANTI, 0); }
		public TerminalNode FULL() { return getToken(SparkSqlParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SparkSqlParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SparkSqlParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(SparkSqlParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SparkSqlParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(SparkSqlParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(SparkSqlParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(SparkSqlParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(SparkSqlParser.ON, 0); }
		public TerminalNode UNION() { return getToken(SparkSqlParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(SparkSqlParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(SparkSqlParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SparkSqlParser.SETMINUS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_identifier);
		try {
			setState(2418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2403);
				strictIdentifier();
				}
				break;
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2404);
				match(ANTI);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2405);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2406);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2407);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(2408);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2409);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2410);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2411);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 10);
				{
				setState(2412);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 11);
				{
				setState(2413);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 12);
				{
				setState(2414);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 13);
				{
				setState(2415);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 14);
				{
				setState(2416);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(2417);
				match(SETMINUS);
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

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SparkSqlParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_strictIdentifier);
		try {
			setState(2423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2420);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2421);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2422);
				nonReserved();
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

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SparkSqlParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2425);
			match(BACKQUOTED_IDENTIFIER);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkSqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SparkSqlParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SparkSqlParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SparkSqlParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SparkSqlParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SparkSqlParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_number);
		int _la;
		try {
			setState(2455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2427);
					match(MINUS);
					}
				}

				setState(2430);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2431);
					match(MINUS);
					}
				}

				setState(2434);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2435);
					match(MINUS);
					}
				}

				setState(2438);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2439);
					match(MINUS);
					}
				}

				setState(2442);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2443);
					match(MINUS);
					}
				}

				setState(2446);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2447);
					match(MINUS);
					}
				}

				setState(2450);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2451);
					match(MINUS);
					}
				}

				setState(2454);
				match(BIGDECIMAL_LITERAL);
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SparkSqlParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SparkSqlParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(SparkSqlParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkSqlParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkSqlParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(SparkSqlParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(SparkSqlParser.ADD, 0); }
		public TerminalNode OVER() { return getToken(SparkSqlParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SparkSqlParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(SparkSqlParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(SparkSqlParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkSqlParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkSqlParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(SparkSqlParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SparkSqlParser.ROW, 0); }
		public TerminalNode LAST() { return getToken(SparkSqlParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SparkSqlParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SparkSqlParser.AFTER, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(SparkSqlParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(SparkSqlParser.STRUCT, 0); }
		public TerminalNode PIVOT() { return getToken(SparkSqlParser.PIVOT, 0); }
		public TerminalNode LATERAL() { return getToken(SparkSqlParser.LATERAL, 0); }
		public TerminalNode WINDOW() { return getToken(SparkSqlParser.WINDOW, 0); }
		public TerminalNode REDUCE() { return getToken(SparkSqlParser.REDUCE, 0); }
		public TerminalNode TRANSFORM() { return getToken(SparkSqlParser.TRANSFORM, 0); }
		public TerminalNode SERDE() { return getToken(SparkSqlParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkSqlParser.SERDEPROPERTIES, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkSqlParser.RECORDREADER, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkSqlParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SparkSqlParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(SparkSqlParser.TERMINATED, 0); }
		public TerminalNode COLLECTION() { return getToken(SparkSqlParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SparkSqlParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SparkSqlParser.KEYS, 0); }
		public TerminalNode ESCAPED() { return getToken(SparkSqlParser.ESCAPED, 0); }
		public TerminalNode LINES() { return getToken(SparkSqlParser.LINES, 0); }
		public TerminalNode SEPARATED() { return getToken(SparkSqlParser.SEPARATED, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlParser.EXTENDED, 0); }
		public TerminalNode REFRESH() { return getToken(SparkSqlParser.REFRESH, 0); }
		public TerminalNode CLEAR() { return getToken(SparkSqlParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SparkSqlParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(SparkSqlParser.UNCACHE, 0); }
		public TerminalNode LAZY() { return getToken(SparkSqlParser.LAZY, 0); }
		public TerminalNode GLOBAL() { return getToken(SparkSqlParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlParser.TEMPORARY, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkSqlParser.OPTIONS, 0); }
		public TerminalNode GROUPING() { return getToken(SparkSqlParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(SparkSqlParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(SparkSqlParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(SparkSqlParser.EXPLAIN, 0); }
		public TerminalNode FORMAT() { return getToken(SparkSqlParser.FORMAT, 0); }
		public TerminalNode LOGICAL() { return getToken(SparkSqlParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkSqlParser.FORMATTED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkSqlParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SparkSqlParser.COST, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SparkSqlParser.TABLESAMPLE, 0); }
		public TerminalNode USE() { return getToken(SparkSqlParser.USE, 0); }
		public TerminalNode TO() { return getToken(SparkSqlParser.TO, 0); }
		public TerminalNode BUCKET() { return getToken(SparkSqlParser.BUCKET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SparkSqlParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(SparkSqlParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SparkSqlParser.OF, 0); }
		public TerminalNode SET() { return getToken(SparkSqlParser.SET, 0); }
		public TerminalNode RESET() { return getToken(SparkSqlParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(SparkSqlParser.IF, 0); }
		public TerminalNode POSITION() { return getToken(SparkSqlParser.POSITION, 0); }
		public TerminalNode EXTRACT() { return getToken(SparkSqlParser.EXTRACT, 0); }
		public TerminalNode NO() { return getToken(SparkSqlParser.NO, 0); }
		public TerminalNode DATA() { return getToken(SparkSqlParser.DATA, 0); }
		public TerminalNode START() { return getToken(SparkSqlParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkSqlParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SparkSqlParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkSqlParser.ROLLBACK, 0); }
		public TerminalNode IGNORE() { return getToken(SparkSqlParser.IGNORE, 0); }
		public TerminalNode SORT() { return getToken(SparkSqlParser.SORT, 0); }
		public TerminalNode CLUSTER() { return getToken(SparkSqlParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkSqlParser.DISTRIBUTE, 0); }
		public TerminalNode UNSET() { return getToken(SparkSqlParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlParser.TBLPROPERTIES, 0); }
		public TerminalNode SKEWED() { return getToken(SparkSqlParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SparkSqlParser.STORED, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkSqlParser.DIRECTORIES, 0); }
		public TerminalNode LOCATION() { return getToken(SparkSqlParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkSqlParser.EXCHANGE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkSqlParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkSqlParser.UNARCHIVE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkSqlParser.FILEFORMAT, 0); }
		public TerminalNode TOUCH() { return getToken(SparkSqlParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SparkSqlParser.COMPACT, 0); }
		public TerminalNode CONCATENATE() { return getToken(SparkSqlParser.CONCATENATE, 0); }
		public TerminalNode CHANGE() { return getToken(SparkSqlParser.CHANGE, 0); }
		public TerminalNode CASCADE() { return getToken(SparkSqlParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkSqlParser.RESTRICT, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkSqlParser.BUCKETS, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkSqlParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(SparkSqlParser.SORTED, 0); }
		public TerminalNode PURGE() { return getToken(SparkSqlParser.PURGE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SparkSqlParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkSqlParser.OUTPUTFORMAT, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkSqlParser.DBPROPERTIES, 0); }
		public TerminalNode DFS() { return getToken(SparkSqlParser.DFS, 0); }
		public TerminalNode TRUNCATE() { return getToken(SparkSqlParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(SparkSqlParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(SparkSqlParser.LIST, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkSqlParser.STATISTICS, 0); }
		public TerminalNode ANALYZE() { return getToken(SparkSqlParser.ANALYZE, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkSqlParser.PARTITIONED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkSqlParser.EXTERNAL, 0); }
		public TerminalNode DEFINED() { return getToken(SparkSqlParser.DEFINED, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SparkSqlParser.RECORDWRITER, 0); }
		public TerminalNode REVOKE() { return getToken(SparkSqlParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(SparkSqlParser.GRANT, 0); }
		public TerminalNode LOCK() { return getToken(SparkSqlParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkSqlParser.UNLOCK, 0); }
		public TerminalNode MSCK() { return getToken(SparkSqlParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SparkSqlParser.REPAIR, 0); }
		public TerminalNode RECOVER() { return getToken(SparkSqlParser.RECOVER, 0); }
		public TerminalNode EXPORT() { return getToken(SparkSqlParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(SparkSqlParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(SparkSqlParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(SparkSqlParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(SparkSqlParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(SparkSqlParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SparkSqlParser.ROLES, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkSqlParser.COMPACTIONS, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkSqlParser.PRINCIPALS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkSqlParser.TRANSACTIONS, 0); }
		public TerminalNode INDEX() { return getToken(SparkSqlParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SparkSqlParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SparkSqlParser.LOCKS, 0); }
		public TerminalNode OPTION() { return getToken(SparkSqlParser.OPTION, 0); }
		public TerminalNode LOCAL() { return getToken(SparkSqlParser.LOCAL, 0); }
		public TerminalNode INPATH() { return getToken(SparkSqlParser.INPATH, 0); }
		public TerminalNode ASC() { return getToken(SparkSqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(SparkSqlParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(SparkSqlParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(SparkSqlParser.SETS, 0); }
		public TerminalNode AT() { return getToken(SparkSqlParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(SparkSqlParser.NULLS, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlParser.OVERWRITE, 0); }
		public TerminalNode ALL() { return getToken(SparkSqlParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(SparkSqlParser.ANY, 0); }
		public TerminalNode ALTER() { return getToken(SparkSqlParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(SparkSqlParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkSqlParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(SparkSqlParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(SparkSqlParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(SparkSqlParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(SparkSqlParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(SparkSqlParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(SparkSqlParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(SparkSqlParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(SparkSqlParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(SparkSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SparkSqlParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SparkSqlParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(SparkSqlParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(SparkSqlParser.OUTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlParser.TABLE, 0); }
		public TerminalNode TRUE() { return getToken(SparkSqlParser.TRUE, 0); }
		public TerminalNode WITH() { return getToken(SparkSqlParser.WITH, 0); }
		public TerminalNode RLIKE() { return getToken(SparkSqlParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(SparkSqlParser.AND, 0); }
		public TerminalNode CASE() { return getToken(SparkSqlParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SparkSqlParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(SparkSqlParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(SparkSqlParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(SparkSqlParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SparkSqlParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkSqlParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(SparkSqlParser.INTERVAL, 0); }
		public TerminalNode MACRO() { return getToken(SparkSqlParser.MACRO, 0); }
		public TerminalNode OR() { return getToken(SparkSqlParser.OR, 0); }
		public TerminalNode STRATIFY() { return getToken(SparkSqlParser.STRATIFY, 0); }
		public TerminalNode THEN() { return getToken(SparkSqlParser.THEN, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SparkSqlParser.UNBOUNDED, 0); }
		public TerminalNode WHEN() { return getToken(SparkSqlParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(SparkSqlParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(SparkSqlParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(SparkSqlParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlParser.NOT, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkSqlParser.DIRECTORY, 0); }
		public TerminalNode BOTH() { return getToken(SparkSqlParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SparkSqlParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SparkSqlParser.TRAILING, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlListener ) ((SparkSqlListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlVisitor ) return ((SparkSqlVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2457);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER) | (1L << PIVOT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)) | (1L << (BUCKETS - 128)) | (1L << (SKEWED - 128)) | (1L << (STORED - 128)) | (1L << (DIRECTORIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 36:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 72:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 74:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 75:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enbled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enbled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enbled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u00ff\u099c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0001\u0000\u0001\u0000\u0001\u0000\u0004"+
		"\u0000\u00d0\b\u0000\u000b\u0000\f\u0000\u00d1\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00f0\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00f5\b\u0007\u0001\u0007\u0003\u0007\u00f8\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00fd\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u010a"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u010e\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0115\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0123\b\u0007\n\u0007\f\u0007\u0126\t\u0007\u0001\u0007\u0003"+
		"\u0007\u0129\b\u0007\u0001\u0007\u0003\u0007\u012c\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0133\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0144\b\u0007\n\u0007"+
		"\f\u0007\u0147\t\u0007\u0001\u0007\u0003\u0007\u014a\b\u0007\u0001\u0007"+
		"\u0003\u0007\u014d\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0154\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u015a\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0160\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0168\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0188\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0190\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0194\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0199\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u019f"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u01a7\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u01ad\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u01ba\b\u0007\u0001\u0007\u0004\u0007\u01bd"+
		"\b\u0007\u000b\u0007\f\u0007\u01be\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u01c8\b\u0007"+
		"\u0001\u0007\u0004\u0007\u01cb\b\u0007\u000b\u0007\f\u0007\u01cc\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u01dd\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u01e2\b\u0007\n\u0007\f\u0007\u01e5\t\u0007\u0001\u0007"+
		"\u0003\u0007\u01e8\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u01f0\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u01f5\b\u0007\n\u0007\f\u0007\u01f8\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u01fe\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u020d\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0211"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0217"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u021d"+
		"\b\u0007\u0001\u0007\u0003\u0007\u0220\b\u0007\u0001\u0007\u0003\u0007"+
		"\u0223\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0229\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u022d\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0231\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0236\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u023a"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0242\b\u0007\u0001\u0007\u0003\u0007\u0245\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u024e\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0253\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0259\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0260\b\u0007\u0001\u0007\u0003\u0007\u0263\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0269"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0272\b\u0007\n\u0007\f\u0007\u0275\t\u0007"+
		"\u0003\u0007\u0277\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u027b\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0280\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0285\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u028c\b\u0007\u0001"+
		"\u0007\u0003\u0007\u028f\b\u0007\u0001\u0007\u0003\u0007\u0292\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0299\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u029e\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02a3\b\u0007\u0001"+
		"\u0007\u0003\u0007\u02a6\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02af\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u02b7\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u02bd\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02c1\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u02c5\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u02c9\b\u0007\u0003\u0007\u02cb\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u02d4\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u02da\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02df"+
		"\b\u0007\u0001\u0007\u0003\u0007\u02e2\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u02e6\b\u0007\u0001\u0007\u0003\u0007\u02e9\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u02f1\b\u0007\n\u0007\f\u0007\u02f4\t\u0007\u0003\u0007\u02f6\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u02fa\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u02ff\b\u0007\u0001\u0007\u0003\u0007\u0302"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0308"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0310\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0315\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u031b\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0321\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u032a\b\u0007\n\u0007\f\u0007"+
		"\u032d\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0332\b"+
		"\u0007\n\u0007\f\u0007\u0335\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0339\b\u0007\n\u0007\f\u0007\u033c\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u0341\b\u0007\n\u0007\f\u0007\u0344\t\u0007\u0003\u0007"+
		"\u0346\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u034e\b\b\u0001\b\u0001\b\u0003\b\u0352\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0359\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u03cd\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u03d5\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u03dd"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u03e6"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u03f2\b\b\u0001\t\u0001\t\u0003\t\u03f6\b\t\u0001\t"+
		"\u0003\t\u03f9\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u03ff\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0409"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0415\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u041a\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0003\r\u0420\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u042c\b\u000e\u0003\u000e\u042e\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0433\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0437\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u043c\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0441\b\u000e\u0001"+
		"\u000e\u0003\u000e\u0444\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0449\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u044d\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0452\b\u000e\u0003\u000e"+
		"\u0454\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u0458\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u045f"+
		"\b\u0010\n\u0010\f\u0010\u0462\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0469\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0470\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0475\b\u0013\n\u0013\f\u0013\u0478"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u047e"+
		"\b\u0014\n\u0014\f\u0014\u0481\t\u0014\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0485\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u0492\b\u0017\n\u0017\f\u0017\u0495\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u049b\b\u0018\u0001\u0018\u0003"+
		"\u0018\u049e\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u04a3"+
		"\b\u0019\n\u0019\f\u0019\u04a6\t\u0019\u0001\u0019\u0003\u0019\u04a9\b"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u04af"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u04b5"+
		"\b\u001b\n\u001b\f\u001b\u04b8\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u04c0\b\u001c\n\u001c"+
		"\f\u001c\u04c3\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u04cd\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u04d4\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u04da\b\u001f\u0001 \u0001 \u0001 \u0001!\u0003!\u04e0\b!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0004!\u04e7\b!\u000b!\f!\u04e8\u0003!\u04eb\b"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u04f2\b\"\n\"\f\"\u04f5"+
		"\t\"\u0003\"\u04f7\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\""+
		"\u04fe\b\"\n\"\f\"\u0501\t\"\u0003\"\u0503\b\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0005\"\u050a\b\"\n\"\f\"\u050d\t\"\u0003\"\u050f\b\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0516\b\"\n\"\f\"\u0519"+
		"\t\"\u0003\"\u051b\b\"\u0001\"\u0003\"\u051e\b\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u0523\b\"\u0003\"\u0525\b\"\u0001#\u0003#\u0528\b#\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0534"+
		"\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u053b\b$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u0542\b$\u0001$\u0005$\u0545\b$\n$\f$\u0548\t$"+
		"\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0552"+
		"\b%\u0001&\u0001&\u0003&\u0556\b&\u0001&\u0001&\u0003&\u055a\b&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u0566\b\'\u0001\'\u0003\'\u0569\b\'\u0001\'\u0001\'\u0003\'"+
		"\u056d\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u0577\b\'\u0001\'\u0001\'\u0003\'\u057b\b\'\u0003\'\u057d\b"+
		"\'\u0001\'\u0003\'\u0580\b\'\u0001\'\u0001\'\u0003\'\u0584\b\'\u0001\'"+
		"\u0001\'\u0001\'\u0003\'\u0589\b\'\u0001\'\u0001\'\u0005\'\u058d\b\'\n"+
		"\'\f\'\u0590\t\'\u0001\'\u0003\'\u0593\b\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u059b\b\'\u0001\'\u0003\'\u059e\b\'\u0003\'"+
		"\u05a0\b\'\u0001\'\u0005\'\u05a3\b\'\n\'\f\'\u05a6\t\'\u0001\'\u0001\'"+
		"\u0003\'\u05aa\b\'\u0001\'\u0003\'\u05ad\b\'\u0001\'\u0001\'\u0003\'\u05b1"+
		"\b\'\u0001\'\u0003\'\u05b4\b\'\u0003\'\u05b6\b\'\u0001(\u0001(\u0001("+
		"\u0003(\u05bb\b(\u0001(\u0005(\u05be\b(\n(\f(\u05c1\t(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u05cb\b)\n)\f)\u05ce\t)\u0001"+
		")\u0001)\u0003)\u05d2\b)\u0001*\u0001*\u0001*\u0001*\u0005*\u05d8\b*\n"+
		"*\f*\u05db\t*\u0001*\u0005*\u05de\b*\n*\f*\u05e1\t*\u0001*\u0003*\u05e4"+
		"\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u05eb\b+\n+\f+\u05ee\t+"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0005+\u05fa\b+\n+\f+\u05fd\t+\u0001+\u0001+\u0003+\u0601\b+\u0001+"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u060b\b+\n+\f"+
		"+\u060e\t+\u0001+\u0001+\u0003+\u0612\b+\u0001,\u0001,\u0001,\u0001,\u0005"+
		",\u0618\b,\n,\f,\u061b\t,\u0003,\u061d\b,\u0001,\u0001,\u0003,\u0621\b"+
		",\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0005-\u062d\b-\n-\f-\u0630\t-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0005.\u063a\b.\n.\f.\u063d\t.\u0001.\u0001.\u0003.\u0641"+
		"\b.\u0001/\u0001/\u0003/\u0645\b/\u0001/\u0003/\u0648\b/\u00010\u0001"+
		"0\u00010\u00030\u064d\b0\u00010\u00010\u00010\u00010\u00010\u00050\u0654"+
		"\b0\n0\f0\u0657\t0\u00030\u0659\b0\u00010\u00010\u00010\u00030\u065e\b"+
		"0\u00010\u00010\u00010\u00050\u0663\b0\n0\f0\u0666\t0\u00030\u0668\b0"+
		"\u00011\u00011\u00012\u00012\u00052\u066e\b2\n2\f2\u0671\t2\u00013\u0001"+
		"3\u00013\u00013\u00033\u0677\b3\u00013\u00013\u00013\u00013\u00013\u0003"+
		"3\u067e\b3\u00014\u00034\u0681\b4\u00014\u00014\u00014\u00034\u0686\b"+
		"4\u00014\u00014\u00014\u00014\u00034\u068c\b4\u00014\u00014\u00034\u0690"+
		"\b4\u00014\u00034\u0693\b4\u00014\u00034\u0696\b4\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00055\u069f\b5\n5\f5\u06a2\t5\u00015\u0001"+
		"5\u00035\u06a6\b5\u00016\u00016\u00016\u00036\u06ab\b6\u00016\u00016\u0001"+
		"7\u00037\u06b0\b7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u06c2"+
		"\b7\u00037\u06c4\b7\u00017\u00037\u06c7\b7\u00018\u00018\u00018\u0001"+
		"8\u00019\u00019\u00019\u00059\u06d0\b9\n9\f9\u06d3\t9\u0001:\u0001:\u0001"+
		":\u0001:\u0005:\u06d9\b:\n:\f:\u06dc\t:\u0001:\u0001:\u0001;\u0001;\u0003"+
		";\u06e2\b;\u0001<\u0001<\u0001<\u0001<\u0005<\u06e8\b<\n<\f<\u06eb\t<"+
		"\u0001<\u0001<\u0001=\u0001=\u0001=\u0003=\u06f2\b=\u0001>\u0001>\u0003"+
		">\u06f6\b>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u06fe\b>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u0706\b>\u0001>\u0001>\u0001"+
		">\u0001>\u0003>\u070c\b>\u0001?\u0001?\u0001?\u0001?\u0005?\u0712\b?\n"+
		"?\f?\u0715\t?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0005@"+
		"\u071e\b@\n@\f@\u0721\t@\u0003@\u0723\b@\u0001@\u0001@\u0001@\u0001A\u0003"+
		"A\u0729\bA\u0001A\u0001A\u0003A\u072d\bA\u0003A\u072f\bA\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u0738\bB\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u0744\bB\u0003"+
		"B\u0746\bB\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u074d\bB\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0003B\u0754\bB\u0001B\u0001B\u0001B\u0001B\u0003"+
		"B\u075a\bB\u0001B\u0001B\u0001B\u0001B\u0003B\u0760\bB\u0003B\u0762\b"+
		"B\u0001C\u0001C\u0001C\u0003C\u0767\bC\u0001C\u0001C\u0001D\u0001D\u0001"+
		"D\u0003D\u076e\bD\u0001D\u0001D\u0001E\u0001E\u0003E\u0774\bE\u0001E\u0001"+
		"E\u0003E\u0778\bE\u0003E\u077a\bE\u0001F\u0001F\u0001F\u0005F\u077f\b"+
		"F\nF\fF\u0782\tF\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0003H\u0790\bH\u0003H\u0792\bH\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0005H\u079a\bH\nH\fH\u079d\tH\u0001I\u0003"+
		"I\u07a0\bI\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003I\u07a8\bI\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0005I\u07af\bI\nI\fI\u07b2\tI\u0001I\u0001"+
		"I\u0001I\u0003I\u07b7\bI\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003"+
		"I\u07bf\bI\u0001I\u0001I\u0001I\u0001I\u0003I\u07c5\bI\u0001I\u0001I\u0001"+
		"I\u0003I\u07ca\bI\u0001I\u0001I\u0001I\u0003I\u07cf\bI\u0001J\u0001J\u0001"+
		"J\u0001J\u0003J\u07d5\bJ\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0005J\u07ea\bJ\nJ\fJ\u07ed\tJ\u0001K\u0001K\u0001K\u0004"+
		"K\u07f2\bK\u000bK\fK\u07f3\u0001K\u0001K\u0003K\u07f8\bK\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0004K\u07ff\bK\u000bK\fK\u0800\u0001K\u0001K\u0003"+
		"K\u0805\bK\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0005K\u0815\bK\nK\fK\u0818\tK\u0003"+
		"K\u081a\bK\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u0822\bK\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u082b\bK\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0004K\u0840\bK\u000b"+
		"K\fK\u0841\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0003K\u084d\bK\u0001K\u0001K\u0001K\u0005K\u0852\bK\nK\fK\u0855\tK"+
		"\u0003K\u0857\bK\u0001K\u0001K\u0001K\u0003K\u085c\bK\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0004K\u086d\bK\u000bK\fK\u086e\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0003K\u0880\bK\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0005K\u088a\bK\nK\fK\u088d\tK\u0001L\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001L\u0004L\u0897\bL\u000bL\fL\u0898\u0003L\u089b\b"+
		"L\u0001M\u0001M\u0001N\u0001N\u0001O\u0001O\u0001P\u0001P\u0001Q\u0001"+
		"Q\u0005Q\u08a7\bQ\nQ\fQ\u08aa\tQ\u0001R\u0001R\u0001R\u0001R\u0003R\u08b0"+
		"\bR\u0001S\u0003S\u08b3\bS\u0001S\u0001S\u0003S\u08b7\bS\u0001T\u0001"+
		"T\u0001T\u0003T\u08bc\bT\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0003U\u08cd"+
		"\bU\u0001U\u0001U\u0003U\u08d1\bU\u0001U\u0001U\u0001U\u0001U\u0001U\u0005"+
		"U\u08d8\bU\nU\fU\u08db\tU\u0001U\u0003U\u08de\bU\u0003U\u08e0\bU\u0001"+
		"V\u0001V\u0001V\u0005V\u08e5\bV\nV\fV\u08e8\tV\u0001W\u0001W\u0001W\u0001"+
		"W\u0003W\u08ee\bW\u0001X\u0001X\u0001X\u0005X\u08f3\bX\nX\fX\u08f6\tX"+
		"\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0003Y\u08fd\bY\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001[\u0005[\u0908\b[\n[\f[\u090b"+
		"\t[\u0001\\\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0005]\u091c\b]\n]\f]\u091f"+
		"\t]\u0001]\u0001]\u0001]\u0001]\u0001]\u0005]\u0926\b]\n]\f]\u0929\t]"+
		"\u0003]\u092b\b]\u0001]\u0001]\u0001]\u0001]\u0001]\u0005]\u0932\b]\n"+
		"]\f]\u0935\t]\u0003]\u0937\b]\u0003]\u0939\b]\u0001]\u0003]\u093c\b]\u0001"+
		"]\u0003]\u093f\b]\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u0951"+
		"\b^\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0003_\u095a\b_\u0001"+
		"`\u0001`\u0001`\u0005`\u095f\b`\n`\f`\u0962\t`\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0003a\u0973\ba\u0001b\u0001b\u0001b\u0003b\u0978\bb\u0001c\u0001"+
		"c\u0001d\u0003d\u097d\bd\u0001d\u0001d\u0003d\u0981\bd\u0001d\u0001d\u0003"+
		"d\u0985\bd\u0001d\u0001d\u0003d\u0989\bd\u0001d\u0001d\u0003d\u098d\b"+
		"d\u0001d\u0001d\u0003d\u0991\bd\u0001d\u0001d\u0003d\u0995\bd\u0001d\u0003"+
		"d\u0998\bd\u0001e\u0001e\u0001e\u0005\u02f2\u032b\u0333\u033a\u0342\u0004"+
		"H\u0090\u0094\u0096f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u0000\u001b\u0001\u0000\u00c9\u00ca\u0002\u0000"+
		"QQSS\u0003\u0000[]\u00af\u00af\u00b5\u00b5\u0002\u0000\r\r  \u0002\u0000"+
		"--XX\u0002\u0000\u00af\u00af\u00b5\u00b5\u0002\u0000\u000e\u000e\u00d6"+
		"\u00d6\u0001\u0000gj\u0001\u0000gi\u0001\u0000,-\u0002\u0000JJLL\u0002"+
		"\u0000\u0010\u0010\u0012\u0012\u0001\u0000\u00f5\u00f6\u0001\u0000%&\u0002"+
		"\u0000\u008b\u008c\u0091\u0091\u0001\u0000\u008d\u0090\u0002\u0000\u008b"+
		"\u008c\u0094\u0094\u0001\u0000}\u007f\u0001\u0000\u0083\u008a\u0001\u0000"+
		"\u008b\u0095\u0001\u0000\u001e!\u0001\u0000)*\u0001\u0000\u008b\u008c"+
		"\u0002\u0000CC\u009c\u009c\u0002\u0000\u001a\u001a\u009a\u009a\u0001\u0000"+
		"GH\b\u0000\f477?fk\u0082\u0090\u0090\u0096\u009f\u00a1\u00ed\u00ef\u00f0"+
		"\u0b34\u0000\u00cf\u0001\u0000\u0000\u0000\u0002\u00d5\u0001\u0000\u0000"+
		"\u0000\u0004\u00d8\u0001\u0000\u0000\u0000\u0006\u00db\u0001\u0000\u0000"+
		"\u0000\b\u00de\u0001\u0000\u0000\u0000\n\u00e1\u0001\u0000\u0000\u0000"+
		"\f\u00e4\u0001\u0000\u0000\u0000\u000e\u0345\u0001\u0000\u0000\u0000\u0010"+
		"\u03f1\u0001\u0000\u0000\u0000\u0012\u03f3\u0001\u0000\u0000\u0000\u0014"+
		"\u0402\u0001\u0000\u0000\u0000\u0016\u040e\u0001\u0000\u0000\u0000\u0018"+
		"\u041b\u0001\u0000\u0000\u0000\u001a\u041f\u0001\u0000\u0000\u0000\u001c"+
		"\u0453\u0001\u0000\u0000\u0000\u001e\u0455\u0001\u0000\u0000\u0000 \u0459"+
		"\u0001\u0000\u0000\u0000\"\u0465\u0001\u0000\u0000\u0000$\u046f\u0001"+
		"\u0000\u0000\u0000&\u0471\u0001\u0000\u0000\u0000(\u0479\u0001\u0000\u0000"+
		"\u0000*\u0482\u0001\u0000\u0000\u0000,\u048a\u0001\u0000\u0000\u0000."+
		"\u048d\u0001\u0000\u0000\u00000\u0498\u0001\u0000\u0000\u00002\u04a8\u0001"+
		"\u0000\u0000\u00004\u04ae\u0001\u0000\u0000\u00006\u04b0\u0001\u0000\u0000"+
		"\u00008\u04bb\u0001\u0000\u0000\u0000:\u04cc\u0001\u0000\u0000\u0000<"+
		"\u04d3\u0001\u0000\u0000\u0000>\u04d5\u0001\u0000\u0000\u0000@\u04db\u0001"+
		"\u0000\u0000\u0000B\u04ea\u0001\u0000\u0000\u0000D\u04f6\u0001\u0000\u0000"+
		"\u0000F\u0527\u0001\u0000\u0000\u0000H\u052c\u0001\u0000\u0000\u0000J"+
		"\u0551\u0001\u0000\u0000\u0000L\u0553\u0001\u0000\u0000\u0000N\u05b5\u0001"+
		"\u0000\u0000\u0000P\u05b7\u0001\u0000\u0000\u0000R\u05d1\u0001\u0000\u0000"+
		"\u0000T\u05d3\u0001\u0000\u0000\u0000V\u0611\u0001\u0000\u0000\u0000X"+
		"\u0620\u0001\u0000\u0000\u0000Z\u0622\u0001\u0000\u0000\u0000\\\u0640"+
		"\u0001\u0000\u0000\u0000^\u0642\u0001\u0000\u0000\u0000`\u0649\u0001\u0000"+
		"\u0000\u0000b\u0669\u0001\u0000\u0000\u0000d\u066b\u0001\u0000\u0000\u0000"+
		"f\u067d\u0001\u0000\u0000\u0000h\u0695\u0001\u0000\u0000\u0000j\u06a5"+
		"\u0001\u0000\u0000\u0000l\u06a7\u0001\u0000\u0000\u0000n\u06c6\u0001\u0000"+
		"\u0000\u0000p\u06c8\u0001\u0000\u0000\u0000r\u06cc\u0001\u0000\u0000\u0000"+
		"t\u06d4\u0001\u0000\u0000\u0000v\u06df\u0001\u0000\u0000\u0000x\u06e3"+
		"\u0001\u0000\u0000\u0000z\u06ee\u0001\u0000\u0000\u0000|\u070b\u0001\u0000"+
		"\u0000\u0000~\u070d\u0001\u0000\u0000\u0000\u0080\u0718\u0001\u0000\u0000"+
		"\u0000\u0082\u072e\u0001\u0000\u0000\u0000\u0084\u0761\u0001\u0000\u0000"+
		"\u0000\u0086\u0766\u0001\u0000\u0000\u0000\u0088\u076d\u0001\u0000\u0000"+
		"\u0000\u008a\u0771\u0001\u0000\u0000\u0000\u008c\u077b\u0001\u0000\u0000"+
		"\u0000\u008e\u0783\u0001\u0000\u0000\u0000\u0090\u0791\u0001\u0000\u0000"+
		"\u0000\u0092\u07ce\u0001\u0000\u0000\u0000\u0094\u07d4\u0001\u0000\u0000"+
		"\u0000\u0096\u087f\u0001\u0000\u0000\u0000\u0098\u089a\u0001\u0000\u0000"+
		"\u0000\u009a\u089c\u0001\u0000\u0000\u0000\u009c\u089e\u0001\u0000\u0000"+
		"\u0000\u009e\u08a0\u0001\u0000\u0000\u0000\u00a0\u08a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u08a4\u0001\u0000\u0000\u0000\u00a4\u08ab\u0001\u0000\u0000"+
		"\u0000\u00a6\u08b6\u0001\u0000\u0000\u0000\u00a8\u08bb\u0001\u0000\u0000"+
		"\u0000\u00aa\u08df\u0001\u0000\u0000\u0000\u00ac\u08e1\u0001\u0000\u0000"+
		"\u0000\u00ae\u08e9\u0001\u0000\u0000\u0000\u00b0\u08ef\u0001\u0000\u0000"+
		"\u0000\u00b2\u08f7\u0001\u0000\u0000\u0000\u00b4\u08fe\u0001\u0000\u0000"+
		"\u0000\u00b6\u0903\u0001\u0000\u0000\u0000\u00b8\u090c\u0001\u0000\u0000"+
		"\u0000\u00ba\u093e\u0001\u0000\u0000\u0000\u00bc\u0950\u0001\u0000\u0000"+
		"\u0000\u00be\u0959\u0001\u0000\u0000\u0000\u00c0\u095b\u0001\u0000\u0000"+
		"\u0000\u00c2\u0972\u0001\u0000\u0000\u0000\u00c4\u0977\u0001\u0000\u0000"+
		"\u0000\u00c6\u0979\u0001\u0000\u0000\u0000\u00c8\u0997\u0001\u0000\u0000"+
		"\u0000\u00ca\u0999\u0001\u0000\u0000\u0000\u00cc\u00cd\u0003\u000e\u0007"+
		"\u0000\u00cd\u00ce\u0005\u0001\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0000\u0000"+
		"\u0001\u00d4\u0001\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003\u000e\u0007"+
		"\u0000\u00d6\u00d7\u0005\u0000\u0000\u0001\u00d7\u0003\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0003\u008aE\u0000\u00d9\u00da\u0005\u0000\u0000\u0001"+
		"\u00da\u0005\u0001\u0000\u0000\u0000\u00db\u00dc\u0003\u0086C\u0000\u00dc"+
		"\u00dd\u0005\u0000\u0000\u0001\u00dd\u0007\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0003\u0088D\u0000\u00df\u00e0\u0005\u0000\u0000\u0001\u00e0\t"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003\u00aaU\u0000\u00e2\u00e3\u0005"+
		"\u0000\u0000\u0001\u00e3\u000b\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003"+
		"\u00acV\u0000\u00e5\u00e6\u0005\u0000\u0000\u0001\u00e6\r\u0001\u0000"+
		"\u0000\u0000\u00e7\u0346\u0003\u001a\r\u0000\u00e8\u00e9\u0005c\u0000"+
		"\u0000\u00e9\u0346\u0003\u00c2a\u0000\u00ea\u00eb\u0005P\u0000\u0000\u00eb"+
		"\u00ef\u0005\u00d0\u0000\u0000\u00ec\u00ed\u0005\u0080\u0000\u0000\u00ed"+
		"\u00ee\u0005!\u0000\u0000\u00ee\u00f0\u0005#\u0000\u0000\u00ef\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f4\u0003\u00c2a\u0000\u00f2\u00f3\u0005s\u0000"+
		"\u0000\u00f3\u00f5\u0005\u00f1\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f8\u0003\u0018\f\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fc\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0005N\u0000\u0000\u00fa\u00fb\u0005\u00bb\u0000\u0000\u00fb"+
		"\u00fd\u0003.\u0017\u0000\u00fc\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fd\u0346\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0005n\u0000\u0000\u00ff\u0100\u0005\u00d0\u0000\u0000\u0100\u0101\u0003"+
		"\u00c2a\u0000\u0101\u0102\u0005t\u0000\u0000\u0102\u0103\u0005\u00bb\u0000"+
		"\u0000\u0103\u0104\u0003.\u0017\u0000\u0104\u0346\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0005f\u0000\u0000\u0106\u0109\u0005\u00d0\u0000\u0000\u0107"+
		"\u0108\u0005\u0080\u0000\u0000\u0108\u010a\u0005#\u0000\u0000\u0109\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0001\u0000\u0000\u0000\u010b\u010d\u0003\u00c2a\u0000\u010c\u010e\u0007"+
		"\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010d\u010e\u0001"+
		"\u0000\u0000\u0000\u010e\u0346\u0001\u0000\u0000\u0000\u010f\u0114\u0003"+
		"\u0012\t\u0000\u0110\u0111\u0005\u0002\u0000\u0000\u0111\u0112\u0003\u00ac"+
		"V\u0000\u0112\u0113\u0005\u0003\u0000\u0000\u0113\u0115\u0001\u0000\u0000"+
		"\u0000\u0114\u0110\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0124\u0003,\u0016\u0000"+
		"\u0117\u0118\u0005\u00b8\u0000\u0000\u0118\u0123\u0003.\u0017\u0000\u0119"+
		"\u011a\u0005\u00d8\u0000\u0000\u011a\u011b\u0005\u0015\u0000\u0000\u011b"+
		"\u0123\u0003p8\u0000\u011c\u0123\u0003\u0014\n\u0000\u011d\u0123\u0003"+
		"\u0018\f\u0000\u011e\u011f\u0005s\u0000\u0000\u011f\u0123\u0005\u00f1"+
		"\u0000\u0000\u0120\u0121\u0005\u00ba\u0000\u0000\u0121\u0123\u0003.\u0017"+
		"\u0000\u0122\u0117\u0001\u0000\u0000\u0000\u0122\u0119\u0001\u0000\u0000"+
		"\u0000\u0122\u011c\u0001\u0000\u0000\u0000\u0122\u011d\u0001\u0000\u0000"+
		"\u0000\u0122\u011e\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000"+
		"\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u012b\u0001\u0000\u0000"+
		"\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0129\u0005\u000f\u0000"+
		"\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0003\u001a\r\u0000"+
		"\u012b\u0128\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
		"\u012c\u0346\u0001\u0000\u0000\u0000\u012d\u0132\u0003\u0012\t\u0000\u012e"+
		"\u012f\u0005\u0002\u0000\u0000\u012f\u0130\u0003\u00acV\u0000\u0130\u0131"+
		"\u0005\u0003\u0000\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u012e"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0145"+
		"\u0001\u0000\u0000\u0000\u0134\u0135\u0005s\u0000\u0000\u0135\u0144\u0005"+
		"\u00f1\u0000\u0000\u0136\u0137\u0005\u00d8\u0000\u0000\u0137\u0138\u0005"+
		"\u0015\u0000\u0000\u0138\u0139\u0005\u0002\u0000\u0000\u0139\u013a\u0003"+
		"\u00acV\u0000\u013a\u013b\u0005\u0003\u0000\u0000\u013b\u0144\u0001\u0000"+
		"\u0000\u0000\u013c\u0144\u0003\u0014\n\u0000\u013d\u0144\u0003\u0016\u000b"+
		"\u0000\u013e\u0144\u0003\u0084B\u0000\u013f\u0144\u0003:\u001d\u0000\u0140"+
		"\u0144\u0003\u0018\f\u0000\u0141\u0142\u0005\u00ba\u0000\u0000\u0142\u0144"+
		"\u0003.\u0017\u0000\u0143\u0134\u0001\u0000\u0000\u0000\u0143\u0136\u0001"+
		"\u0000\u0000\u0000\u0143\u013c\u0001\u0000\u0000\u0000\u0143\u013d\u0001"+
		"\u0000\u0000\u0000\u0143\u013e\u0001\u0000\u0000\u0000\u0143\u013f\u0001"+
		"\u0000\u0000\u0000\u0143\u0140\u0001\u0000\u0000\u0000\u0143\u0141\u0001"+
		"\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u014c\u0001"+
		"\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u014a\u0005"+
		"\u000f\u0000\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u0149\u014a\u0001"+
		"\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014d\u0003"+
		"\u001a\r\u0000\u014c\u0149\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d\u0346\u0001\u0000\u0000\u0000\u014e\u014f\u0005P\u0000"+
		"\u0000\u014f\u0153\u0005Q\u0000\u0000\u0150\u0151\u0005\u0080\u0000\u0000"+
		"\u0151\u0152\u0005!\u0000\u0000\u0152\u0154\u0005#\u0000\u0000\u0153\u0150"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0003\u0086C\u0000\u0156\u0157\u0005"+
		"%\u0000\u0000\u0157\u0159\u0003\u0086C\u0000\u0158\u015a\u0003\u0018\f"+
		"\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000"+
		"\u0000\u015a\u0346\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u00d4\u0000"+
		"\u0000\u015c\u015d\u0005Q\u0000\u0000\u015d\u015f\u0003\u0086C\u0000\u015e"+
		"\u0160\u0003 \u0010\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0005\u00d5\u0000\u0000\u0162\u0167\u0005\u00d7\u0000\u0000\u0163\u0168"+
		"\u0003\u00c2a\u0000\u0164\u0165\u0005.\u0000\u0000\u0165\u0166\u0005a"+
		"\u0000\u0000\u0166\u0168\u0003r9\u0000\u0167\u0163\u0001\u0000\u0000\u0000"+
		"\u0167\u0164\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000"+
		"\u0168\u0346\u0001\u0000\u0000\u0000\u0169\u016a\u0005n\u0000\u0000\u016a"+
		"\u016b\u0005Q\u0000\u0000\u016b\u016c\u0003\u0086C\u0000\u016c\u016d\u0005"+
		"\u000e\u0000\u0000\u016d\u016e\u0005a\u0000\u0000\u016e\u016f\u0005\u0002"+
		"\u0000\u0000\u016f\u0170\u0003\u00acV\u0000\u0170\u0171\u0005\u0003\u0000"+
		"\u0000\u0171\u0346\u0001\u0000\u0000\u0000\u0172\u0173\u0005n\u0000\u0000"+
		"\u0173\u0174\u0007\u0001\u0000\u0000\u0174\u0175\u0003\u0086C\u0000\u0175"+
		"\u0176\u0005o\u0000\u0000\u0176\u0177\u0005k\u0000\u0000\u0177\u0178\u0003"+
		"\u0086C\u0000\u0178\u0346\u0001\u0000\u0000\u0000\u0179\u017a\u0005n\u0000"+
		"\u0000\u017a\u017b\u0007\u0001\u0000\u0000\u017b\u017c\u0003\u0086C\u0000"+
		"\u017c\u017d\u0005t\u0000\u0000\u017d\u017e\u0005\u00ba\u0000\u0000\u017e"+
		"\u017f\u0003.\u0017\u0000\u017f\u0346\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0005n\u0000\u0000\u0181\u0182\u0007\u0001\u0000\u0000\u0182\u0183\u0003"+
		"\u0086C\u0000\u0183\u0184\u0005\u00b9\u0000\u0000\u0184\u0187\u0005\u00ba"+
		"\u0000\u0000\u0185\u0186\u0005\u0080\u0000\u0000\u0186\u0188\u0005#\u0000"+
		"\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0003.\u0017\u0000"+
		"\u018a\u0346\u0001\u0000\u0000\u0000\u018b\u018c\u0005n\u0000\u0000\u018c"+
		"\u018d\u0005Q\u0000\u0000\u018d\u018f\u0003\u0086C\u0000\u018e\u0190\u0003"+
		" \u0010\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0193\u0005\u00c8"+
		"\u0000\u0000\u0192\u0194\u0005b\u0000\u0000\u0193\u0192\u0001\u0000\u0000"+
		"\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0003\u00c2a\u0000\u0196\u0198\u0003\u00aeW\u0000\u0197"+
		"\u0199\u0003\u00a8T\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0001\u0000\u0000\u0000\u0199\u0346\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0005n\u0000\u0000\u019b\u019c\u0005Q\u0000\u0000\u019c\u019e\u0003\u0086"+
		"C\u0000\u019d\u019f\u0003 \u0010\u0000\u019e\u019d\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0005t\u0000\u0000\u01a1\u01a2\u0005\u00a1\u0000\u0000\u01a2"+
		"\u01a6\u0005\u00f1\u0000\u0000\u01a3\u01a4\u0005N\u0000\u0000\u01a4\u01a5"+
		"\u0005\u00a2\u0000\u0000\u01a5\u01a7\u0003.\u0017\u0000\u01a6\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u0346\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a9\u0005n\u0000\u0000\u01a9\u01aa\u0005Q\u0000"+
		"\u0000\u01aa\u01ac\u0003\u0086C\u0000\u01ab\u01ad\u0003 \u0010\u0000\u01ac"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0005t\u0000\u0000\u01af\u01b0"+
		"\u0005\u00a2\u0000\u0000\u01b0\u01b1\u0003.\u0017\u0000\u01b1\u0346\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b3\u0005n\u0000\u0000\u01b3\u01b4\u0005Q\u0000"+
		"\u0000\u01b4\u01b5\u0003\u0086C\u0000\u01b5\u01b9\u0005\u000e\u0000\u0000"+
		"\u01b6\u01b7\u0005\u0080\u0000\u0000\u01b7\u01b8\u0005!\u0000\u0000\u01b8"+
		"\u01ba\u0005#\u0000\u0000\u01b9\u01b6\u0001\u0000\u0000\u0000\u01b9\u01ba"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb\u01bd"+
		"\u0003\u001e\u000f\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0001\u0000\u0000\u0000\u01bf\u0346\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0005n\u0000\u0000\u01c1\u01c2\u0005S\u0000\u0000\u01c2\u01c3\u0003\u0086"+
		"C\u0000\u01c3\u01c7\u0005\u000e\u0000\u0000\u01c4\u01c5\u0005\u0080\u0000"+
		"\u0000\u01c5\u01c6\u0005!\u0000\u0000\u01c6\u01c8\u0005#\u0000\u0000\u01c7"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8"+
		"\u01ca\u0001\u0000\u0000\u0000\u01c9\u01cb\u0003 \u0010\u0000\u01ca\u01c9"+
		"\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u0346"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005n\u0000\u0000\u01cf\u01d0\u0005"+
		"Q\u0000\u0000\u01d0\u01d1\u0003\u0086C\u0000\u01d1\u01d2\u0003 \u0010"+
		"\u0000\u01d2\u01d3\u0005o\u0000\u0000\u01d3\u01d4\u0005k\u0000\u0000\u01d4"+
		"\u01d5\u0003 \u0010\u0000\u01d5\u0346\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0005n\u0000\u0000\u01d7\u01d8\u0005Q\u0000\u0000\u01d8\u01d9\u0003\u0086"+
		"C\u0000\u01d9\u01dc\u0005f\u0000\u0000\u01da\u01db\u0005\u0080\u0000\u0000"+
		"\u01db\u01dd\u0005#\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc"+
		"\u01dd\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de"+
		"\u01e3\u0003 \u0010\u0000\u01df\u01e0\u0005\u0004\u0000\u0000\u01e0\u01e2"+
		"\u0003 \u0010\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e8\u0005\u00cd\u0000\u0000\u01e7\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u0346\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ea\u0005n\u0000\u0000\u01ea\u01eb\u0005S\u0000"+
		"\u0000\u01eb\u01ec\u0003\u0086C\u0000\u01ec\u01ef\u0005f\u0000\u0000\u01ed"+
		"\u01ee\u0005\u0080\u0000\u0000\u01ee\u01f0\u0005#\u0000\u0000\u01ef\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f6\u0003 \u0010\u0000\u01f2\u01f3\u0005"+
		"\u0004\u0000\u0000\u01f3\u01f5\u0003 \u0010\u0000\u01f4\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f8\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u0346\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005n\u0000"+
		"\u0000\u01fa\u01fb\u0005Q\u0000\u0000\u01fb\u01fd\u0003\u0086C\u0000\u01fc"+
		"\u01fe\u0003 \u0010\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0005t\u0000\u0000\u0200\u0201\u0003\u0018\f\u0000\u0201\u0346\u0001"+
		"\u0000\u0000\u0000\u0202\u0203\u0005n\u0000\u0000\u0203\u0204\u0005Q\u0000"+
		"\u0000\u0204\u0205\u0003\u0086C\u0000\u0205\u0206\u0005\u00e1\u0000\u0000"+
		"\u0206\u0207\u0005d\u0000\u0000\u0207\u0346\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0005f\u0000\u0000\u0209\u020c\u0005Q\u0000\u0000\u020a\u020b\u0005"+
		"\u0080\u0000\u0000\u020b\u020d\u0005#\u0000\u0000\u020c\u020a\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000"+
		"\u0000\u0000\u020e\u0210\u0003\u0086C\u0000\u020f\u0211\u0005\u00cd\u0000"+
		"\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000"+
		"\u0000\u0211\u0346\u0001\u0000\u0000\u0000\u0212\u0213\u0005f\u0000\u0000"+
		"\u0213\u0216\u0005S\u0000\u0000\u0214\u0215\u0005\u0080\u0000\u0000\u0215"+
		"\u0217\u0005#\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0216\u0217"+
		"\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0346"+
		"\u0003\u0086C\u0000\u0219\u021c\u0005P\u0000\u0000\u021a\u021b\u0005\u001e"+
		"\u0000\u0000\u021b\u021d\u0005T\u0000\u0000\u021c\u021a\u0001\u0000\u0000"+
		"\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u0222\u0001\u0000\u0000"+
		"\u0000\u021e\u0220\u0005\u00b6\u0000\u0000\u021f\u021e\u0001\u0000\u0000"+
		"\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000"+
		"\u0000\u0221\u0223\u0005\u00b7\u0000\u0000\u0222\u021f\u0001\u0000\u0000"+
		"\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000"+
		"\u0000\u0224\u0228\u0005S\u0000\u0000\u0225\u0226\u0005\u0080\u0000\u0000"+
		"\u0226\u0227\u0005!\u0000\u0000\u0227\u0229\u0005#\u0000\u0000\u0228\u0225"+
		"\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022a"+
		"\u0001\u0000\u0000\u0000\u022a\u022c\u0003\u0086C\u0000\u022b\u022d\u0003"+
		"x<\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000"+
		"\u0000\u022d\u0230\u0001\u0000\u0000\u0000\u022e\u022f\u0005s\u0000\u0000"+
		"\u022f\u0231\u0005\u00f1\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000"+
		"\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0235\u0001\u0000\u0000\u0000"+
		"\u0232\u0233\u0005\u00d8\u0000\u0000\u0233\u0234\u0005>\u0000\u0000\u0234"+
		"\u0236\u0003p8\u0000\u0235\u0232\u0001\u0000\u0000\u0000\u0235\u0236\u0001"+
		"\u0000\u0000\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0238\u0005"+
		"\u00ba\u0000\u0000\u0238\u023a\u0003.\u0017\u0000\u0239\u0237\u0001\u0000"+
		"\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000"+
		"\u0000\u0000\u023b\u023c\u0005\u000f\u0000\u0000\u023c\u023d\u0003\u001a"+
		"\r\u0000\u023d\u0346\u0001\u0000\u0000\u0000\u023e\u0241\u0005P\u0000"+
		"\u0000\u023f\u0240\u0005\u001e\u0000\u0000\u0240\u0242\u0005T\u0000\u0000"+
		"\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000"+
		"\u0242\u0244\u0001\u0000\u0000\u0000\u0243\u0245\u0005\u00b6\u0000\u0000"+
		"\u0244\u0243\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000"+
		"\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0005\u00b7\u0000\u0000"+
		"\u0247\u0248\u0005S\u0000\u0000\u0248\u024d\u0003\u0086C\u0000\u0249\u024a"+
		"\u0005\u0002\u0000\u0000\u024a\u024b\u0003\u00acV\u0000\u024b\u024c\u0005"+
		"\u0003\u0000\u0000\u024c\u024e\u0001\u0000\u0000\u0000\u024d\u0249\u0001"+
		"\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u024f\u0001"+
		"\u0000\u0000\u0000\u024f\u0252\u0003,\u0016\u0000\u0250\u0251\u0005\u00b8"+
		"\u0000\u0000\u0251\u0253\u0003.\u0017\u0000\u0252\u0250\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0346\u0001\u0000\u0000"+
		"\u0000\u0254\u0255\u0005n\u0000\u0000\u0255\u0256\u0005S\u0000\u0000\u0256"+
		"\u0258\u0003\u0086C\u0000\u0257\u0259\u0005\u000f\u0000\u0000\u0258\u0257"+
		"\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025a"+
		"\u0001\u0000\u0000\u0000\u025a\u025b\u0003\u001a\r\u0000\u025b\u0346\u0001"+
		"\u0000\u0000\u0000\u025c\u025f\u0005P\u0000\u0000\u025d\u025e\u0005\u001e"+
		"\u0000\u0000\u025e\u0260\u0005T\u0000\u0000\u025f\u025d\u0001\u0000\u0000"+
		"\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0262\u0001\u0000\u0000"+
		"\u0000\u0261\u0263\u0005\u00b7\u0000\u0000\u0262\u0261\u0001\u0000\u0000"+
		"\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000"+
		"\u0000\u0264\u0268\u0005\u00ae\u0000\u0000\u0265\u0266\u0005\u0080\u0000"+
		"\u0000\u0266\u0267\u0005!\u0000\u0000\u0267\u0269\u0005#\u0000\u0000\u0268"+
		"\u0265\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269"+
		"\u026a\u0001\u0000\u0000\u0000\u026a\u026b\u0003\u00c0`\u0000\u026b\u026c"+
		"\u0005\u000f\u0000\u0000\u026c\u0276\u0005\u00f1\u0000\u0000\u026d\u026e"+
		"\u0005\u00a0\u0000\u0000\u026e\u0273\u0003@ \u0000\u026f\u0270\u0005\u0004"+
		"\u0000\u0000\u0270\u0272\u0003@ \u0000\u0271\u026f\u0001\u0000\u0000\u0000"+
		"\u0272\u0275\u0001\u0000\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000"+
		"\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0277\u0001\u0000\u0000\u0000"+
		"\u0275\u0273\u0001\u0000\u0000\u0000\u0276\u026d\u0001\u0000\u0000\u0000"+
		"\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0346\u0001\u0000\u0000\u0000"+
		"\u0278\u027a\u0005f\u0000\u0000\u0279\u027b\u0005\u00b7\u0000\u0000\u027a"+
		"\u0279\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b"+
		"\u027c\u0001\u0000\u0000\u0000\u027c\u027f\u0005\u00ae\u0000\u0000\u027d"+
		"\u027e\u0005\u0080\u0000\u0000\u027e\u0280\u0005#\u0000\u0000\u027f\u027d"+
		"\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280\u0281"+
		"\u0001\u0000\u0000\u0000\u0281\u0346\u0003\u00c0`\u0000\u0282\u0284\u0005"+
		"Y\u0000\u0000\u0283\u0285\u0007\u0002\u0000\u0000\u0284\u0283\u0001\u0000"+
		"\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000"+
		"\u0000\u0000\u0286\u0346\u0003\u000e\u0007\u0000\u0287\u0288\u0005_\u0000"+
		"\u0000\u0288\u028b\u0005`\u0000\u0000\u0289\u028a\u0007\u0003\u0000\u0000"+
		"\u028a\u028c\u0003\u00c2a\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028b"+
		"\u028c\u0001\u0000\u0000\u0000\u028c\u0291\u0001\u0000\u0000\u0000\u028d"+
		"\u028f\u0005%\u0000\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028e\u028f"+
		"\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0292"+
		"\u0005\u00f1\u0000\u0000\u0291\u028e\u0001\u0000\u0000\u0000\u0291\u0292"+
		"\u0001\u0000\u0000\u0000\u0292\u0346\u0001\u0000\u0000\u0000\u0293\u0294"+
		"\u0005_\u0000\u0000\u0294\u0295\u0005Q\u0000\u0000\u0295\u0298\u0005\u00af"+
		"\u0000\u0000\u0296\u0297\u0007\u0003\u0000\u0000\u0297\u0299\u0003\u00c2"+
		"a\u0000\u0298\u0296\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000"+
		"\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0005%\u0000\u0000"+
		"\u029b\u029d\u0005\u00f1\u0000\u0000\u029c\u029e\u0003 \u0010\u0000\u029d"+
		"\u029c\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e"+
		"\u0346\u0001\u0000\u0000\u0000\u029f\u02a0\u0005_\u0000\u0000\u02a0\u02a5"+
		"\u0005\u00d1\u0000\u0000\u02a1\u02a3\u0005%\u0000\u0000\u02a2\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a6\u0005\u00f1\u0000\u0000\u02a5\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u0346\u0001"+
		"\u0000\u0000\u0000\u02a7\u02a8\u0005_\u0000\u0000\u02a8\u02a9\u0005\u00ba"+
		"\u0000\u0000\u02a9\u02ae\u0003\u0086C\u0000\u02aa\u02ab\u0005\u0002\u0000"+
		"\u0000\u02ab\u02ac\u00032\u0019\u0000\u02ac\u02ad\u0005\u0003\u0000\u0000"+
		"\u02ad\u02af\u0001\u0000\u0000\u0000\u02ae\u02aa\u0001\u0000\u0000\u0000"+
		"\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u0346\u0001\u0000\u0000\u0000"+
		"\u02b0\u02b1\u0005_\u0000\u0000\u02b1\u02b2\u0005a\u0000\u0000\u02b2\u02b3"+
		"\u0007\u0003\u0000\u0000\u02b3\u02b6\u0003\u0086C\u0000\u02b4\u02b5\u0007"+
		"\u0003\u0000\u0000\u02b5\u02b7\u0003\u00c2a\u0000\u02b6\u02b4\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u0346\u0001\u0000"+
		"\u0000\u0000\u02b8\u02b9\u0005_\u0000\u0000\u02b9\u02ba\u0005d\u0000\u0000"+
		"\u02ba\u02bc\u0003\u0086C\u0000\u02bb\u02bd\u0003 \u0010\u0000\u02bc\u02bb"+
		"\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u0346"+
		"\u0001\u0000\u0000\u0000\u02be\u02c0\u0005_\u0000\u0000\u02bf\u02c1\u0003"+
		"\u00c2a\u0000\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02ca\u0005e\u0000"+
		"\u0000\u02c3\u02c5\u0005%\u0000\u0000\u02c4\u02c3\u0001\u0000\u0000\u0000"+
		"\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c8\u0001\u0000\u0000\u0000"+
		"\u02c6\u02c9\u0003\u00c0`\u0000\u02c7\u02c9\u0005\u00f1\u0000\u0000\u02c8"+
		"\u02c6\u0001\u0000\u0000\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c9"+
		"\u02cb\u0001\u0000\u0000\u0000\u02ca\u02c4\u0001\u0000\u0000\u0000\u02ca"+
		"\u02cb\u0001\u0000\u0000\u0000\u02cb\u0346\u0001\u0000\u0000\u0000\u02cc"+
		"\u02cd\u0005_\u0000\u0000\u02cd\u02ce\u0005P\u0000\u0000\u02ce\u02cf\u0005"+
		"Q\u0000\u0000\u02cf\u0346\u0003\u0086C\u0000\u02d0\u02d1\u0007\u0004\u0000"+
		"\u0000\u02d1\u02d3\u0005\u00ae\u0000\u0000\u02d2\u02d4\u0005\u00af\u0000"+
		"\u0000\u02d3\u02d2\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u0346\u0003$\u0012\u0000"+
		"\u02d6\u02d7\u0007\u0004\u0000\u0000\u02d7\u02d9\u0005\u00d0\u0000\u0000"+
		"\u02d8\u02da\u0005\u00af\u0000\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000"+
		"\u02d9\u02da\u0001\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000"+
		"\u02db\u0346\u0003\u00c2a\u0000\u02dc\u02de\u0007\u0004\u0000\u0000\u02dd"+
		"\u02df\u0005Q\u0000\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02de\u02df"+
		"\u0001\u0000\u0000\u0000\u02df\u02e1\u0001\u0000\u0000\u0000\u02e0\u02e2"+
		"\u0007\u0005\u0000\u0000\u02e1\u02e0\u0001\u0000\u0000\u0000\u02e1\u02e2"+
		"\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e5"+
		"\u0003\u0086C\u0000\u02e4\u02e6\u0003 \u0010\u0000\u02e5\u02e4\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6\u02e8\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e9\u0003&\u0013\u0000\u02e8\u02e7\u0001\u0000\u0000"+
		"\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\u0346\u0001\u0000\u0000"+
		"\u0000\u02ea\u02eb\u0005\u00b0\u0000\u0000\u02eb\u02ec\u0005Q\u0000\u0000"+
		"\u02ec\u0346\u0003\u0086C\u0000\u02ed\u02f5\u0005\u00b0\u0000\u0000\u02ee"+
		"\u02f6\u0005\u00f1\u0000\u0000\u02ef\u02f1\t\u0000\u0000\u0000\u02f0\u02ef"+
		"\u0001\u0000\u0000\u0000\u02f1\u02f4\u0001\u0000\u0000\u0000\u02f2\u02f3"+
		"\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f3\u02f6"+
		"\u0001\u0000\u0000\u0000\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f5\u02ee"+
		"\u0001\u0000\u0000\u0000\u02f5\u02f2\u0001\u0000\u0000\u0000\u02f6\u0346"+
		"\u0001\u0000\u0000\u0000\u02f7\u02f9\u0005\u00b2\u0000\u0000\u02f8\u02fa"+
		"\u0005\u00b4\u0000\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000\u02f9\u02fa"+
		"\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fc"+
		"\u0005Q\u0000\u0000\u02fc\u0301\u0003\u0086C\u0000\u02fd\u02ff\u0005\u000f"+
		"\u0000\u0000\u02fe\u02fd\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000"+
		"\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0302\u0003\u001a"+
		"\r\u0000\u0301\u02fe\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000"+
		"\u0000\u0302\u0346\u0001\u0000\u0000\u0000\u0303\u0304\u0005\u00b3\u0000"+
		"\u0000\u0304\u0307\u0005Q\u0000\u0000\u0305\u0306\u0005\u0080\u0000\u0000"+
		"\u0306\u0308\u0005#\u0000\u0000\u0307\u0305\u0001\u0000\u0000\u0000\u0307"+
		"\u0308\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309"+
		"\u0346\u0003\u0086C\u0000\u030a\u030b\u0005\u00b1\u0000\u0000\u030b\u0346"+
		"\u0005\u00b2\u0000\u0000\u030c\u030d\u0005\u00e4\u0000\u0000\u030d\u030f"+
		"\u0005v\u0000\u0000\u030e\u0310\u0005\u00ef\u0000\u0000\u030f\u030e\u0001"+
		"\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310\u0311\u0001"+
		"\u0000\u0000\u0000\u0311\u0312\u0005\u00f0\u0000\u0000\u0312\u0314\u0005"+
		"\u00f1\u0000\u0000\u0313\u0315\u0005\u009d\u0000\u0000\u0314\u0313\u0001"+
		"\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0316\u0001"+
		"\u0000\u0000\u0000\u0316\u0317\u0005W\u0000\u0000\u0317\u0318\u0005Q\u0000"+
		"\u0000\u0318\u031a\u0003\u0086C\u0000\u0319\u031b\u0003 \u0010\u0000\u031a"+
		"\u0319\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b"+
		"\u0346\u0001\u0000\u0000\u0000\u031c\u031d\u0005\u00d3\u0000\u0000\u031d"+
		"\u031e\u0005Q\u0000\u0000\u031e\u0320\u0003\u0086C\u0000\u031f\u0321\u0003"+
		" \u0010\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000"+
		"\u0000\u0000\u0321\u0346\u0001\u0000\u0000\u0000\u0322\u0323\u0005\u00df"+
		"\u0000\u0000\u0323\u0324\u0005\u00e0\u0000\u0000\u0324\u0325\u0005Q\u0000"+
		"\u0000\u0325\u0346\u0003\u0086C\u0000\u0326\u0327\u0007\u0006\u0000\u0000"+
		"\u0327\u032b\u0003\u00c2a\u0000\u0328\u032a\t\u0000\u0000\u0000\u0329"+
		"\u0328\u0001\u0000\u0000\u0000\u032a\u032d\u0001\u0000\u0000\u0000\u032b"+
		"\u032c\u0001\u0000\u0000\u0000\u032b\u0329\u0001\u0000\u0000\u0000\u032c"+
		"\u0346\u0001\u0000\u0000\u0000\u032d\u032b\u0001\u0000\u0000\u0000\u032e"+
		"\u032f\u0005t\u0000\u0000\u032f\u0333\u0005\u00e5\u0000\u0000\u0330\u0332"+
		"\t\u0000\u0000\u0000\u0331\u0330\u0001\u0000\u0000\u0000\u0332\u0335\u0001"+
		"\u0000\u0000\u0000\u0333\u0334\u0001\u0000\u0000\u0000\u0333\u0331\u0001"+
		"\u0000\u0000\u0000\u0334\u0346\u0001\u0000\u0000\u0000\u0335\u0333\u0001"+
		"\u0000\u0000\u0000\u0336\u033a\u0005t\u0000\u0000\u0337\u0339\t\u0000"+
		"\u0000\u0000\u0338\u0337\u0001\u0000\u0000\u0000\u0339\u033c\u0001\u0000"+
		"\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033a\u0338\u0001\u0000"+
		"\u0000\u0000\u033b\u0346\u0001\u0000\u0000\u0000\u033c\u033a\u0001\u0000"+
		"\u0000\u0000\u033d\u0346\u0005u\u0000\u0000\u033e\u0342\u0003\u0010\b"+
		"\u0000\u033f\u0341\t\u0000\u0000\u0000\u0340\u033f\u0001\u0000\u0000\u0000"+
		"\u0341\u0344\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000"+
		"\u0342\u0340\u0001\u0000\u0000\u0000\u0343\u0346\u0001\u0000\u0000\u0000"+
		"\u0344\u0342\u0001\u0000\u0000\u0000\u0345\u00e7\u0001\u0000\u0000\u0000"+
		"\u0345\u00e8\u0001\u0000\u0000\u0000\u0345\u00ea\u0001\u0000\u0000\u0000"+
		"\u0345\u00fe\u0001\u0000\u0000\u0000\u0345\u0105\u0001\u0000\u0000\u0000"+
		"\u0345\u010f\u0001\u0000\u0000\u0000\u0345\u012d\u0001\u0000\u0000\u0000"+
		"\u0345\u014e\u0001\u0000\u0000\u0000\u0345\u015b\u0001\u0000\u0000\u0000"+
		"\u0345\u0169\u0001\u0000\u0000\u0000\u0345\u0172\u0001\u0000\u0000\u0000"+
		"\u0345\u0179\u0001\u0000\u0000\u0000\u0345\u0180\u0001\u0000\u0000\u0000"+
		"\u0345\u018b\u0001\u0000\u0000\u0000\u0345\u019a\u0001\u0000\u0000\u0000"+
		"\u0345\u01a8\u0001\u0000\u0000\u0000\u0345\u01b2\u0001\u0000\u0000\u0000"+
		"\u0345\u01c0\u0001\u0000\u0000\u0000\u0345\u01ce\u0001\u0000\u0000\u0000"+
		"\u0345\u01d6\u0001\u0000\u0000\u0000\u0345\u01e9\u0001\u0000\u0000\u0000"+
		"\u0345\u01f9\u0001\u0000\u0000\u0000\u0345\u0202\u0001\u0000\u0000\u0000"+
		"\u0345\u0208\u0001\u0000\u0000\u0000\u0345\u0212\u0001\u0000\u0000\u0000"+
		"\u0345\u0219\u0001\u0000\u0000\u0000\u0345\u023e\u0001\u0000\u0000\u0000"+
		"\u0345\u0254\u0001\u0000\u0000\u0000\u0345\u025c\u0001\u0000\u0000\u0000"+
		"\u0345\u0278\u0001\u0000\u0000\u0000\u0345\u0282\u0001\u0000\u0000\u0000"+
		"\u0345\u0287\u0001\u0000\u0000\u0000\u0345\u0293\u0001\u0000\u0000\u0000"+
		"\u0345\u029f\u0001\u0000\u0000\u0000\u0345\u02a7\u0001\u0000\u0000\u0000"+
		"\u0345\u02b0\u0001\u0000\u0000\u0000\u0345\u02b8\u0001\u0000\u0000\u0000"+
		"\u0345\u02be\u0001\u0000\u0000\u0000\u0345\u02cc\u0001\u0000\u0000\u0000"+
		"\u0345\u02d0\u0001\u0000\u0000\u0000\u0345\u02d6\u0001\u0000\u0000\u0000"+
		"\u0345\u02dc\u0001\u0000\u0000\u0000\u0345\u02ea\u0001\u0000\u0000\u0000"+
		"\u0345\u02ed\u0001\u0000\u0000\u0000\u0345\u02f7\u0001\u0000\u0000\u0000"+
		"\u0345\u0303\u0001\u0000\u0000\u0000\u0345\u030a\u0001\u0000\u0000\u0000"+
		"\u0345\u030c\u0001\u0000\u0000\u0000\u0345\u031c\u0001\u0000\u0000\u0000"+
		"\u0345\u0322\u0001\u0000\u0000\u0000\u0345\u0326\u0001\u0000\u0000\u0000"+
		"\u0345\u032e\u0001\u0000\u0000\u0000\u0345\u0336\u0001\u0000\u0000\u0000"+
		"\u0345\u033d\u0001\u0000\u0000\u0000\u0345\u033e\u0001\u0000\u0000\u0000"+
		"\u0346\u000f\u0001\u0000\u0000\u0000\u0347\u0348\u0005P\u0000\u0000\u0348"+
		"\u03f2\u0005\u00e5\u0000\u0000\u0349\u034a\u0005f\u0000\u0000\u034a\u03f2"+
		"\u0005\u00e5\u0000\u0000\u034b\u034d\u0005\u00dc\u0000\u0000\u034c\u034e"+
		"\u0005\u00e5\u0000\u0000\u034d\u034c\u0001\u0000\u0000\u0000\u034d\u034e"+
		"\u0001\u0000\u0000\u0000\u034e\u03f2\u0001\u0000\u0000\u0000\u034f\u0351"+
		"\u0005\u00db\u0000\u0000\u0350\u0352\u0005\u00e5\u0000\u0000\u0351\u0350"+
		"\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000\u0000\u0000\u0352\u03f2"+
		"\u0001\u0000\u0000\u0000\u0353\u0354\u0005_\u0000\u0000\u0354\u03f2\u0005"+
		"\u00dc\u0000\u0000\u0355\u0356\u0005_\u0000\u0000\u0356\u0358\u0005\u00e5"+
		"\u0000\u0000\u0357\u0359\u0005\u00dc\u0000\u0000\u0358\u0357\u0001\u0000"+
		"\u0000\u0000\u0358\u0359\u0001\u0000\u0000\u0000\u0359\u03f2\u0001\u0000"+
		"\u0000\u0000\u035a\u035b\u0005_\u0000\u0000\u035b\u03f2\u0005\u00e8\u0000"+
		"\u0000\u035c\u035d\u0005_\u0000\u0000\u035d\u03f2\u0005\u00e6\u0000\u0000"+
		"\u035e\u035f\u0005_\u0000\u0000\u035f\u0360\u0005I\u0000\u0000\u0360\u03f2"+
		"\u0005\u00e6\u0000\u0000\u0361\u0362\u0005\u00e2\u0000\u0000\u0362\u03f2"+
		"\u0005Q\u0000\u0000\u0363\u0364\u0005\u00e3\u0000\u0000\u0364\u03f2\u0005"+
		"Q\u0000\u0000\u0365\u0366\u0005_\u0000\u0000\u0366\u03f2\u0005\u00e7\u0000"+
		"\u0000\u0367\u0368\u0005_\u0000\u0000\u0368\u0369\u0005P\u0000\u0000\u0369"+
		"\u03f2\u0005Q\u0000\u0000\u036a\u036b\u0005_\u0000\u0000\u036b\u03f2\u0005"+
		"\u00e9\u0000\u0000\u036c\u036d\u0005_\u0000\u0000\u036d\u03f2\u0005\u00eb"+
		"\u0000\u0000\u036e\u036f\u0005_\u0000\u0000\u036f\u03f2\u0005\u00ec\u0000"+
		"\u0000\u0370\u0371\u0005P\u0000\u0000\u0371\u03f2\u0005\u00ea\u0000\u0000"+
		"\u0372\u0373\u0005f\u0000\u0000\u0373\u03f2\u0005\u00ea\u0000\u0000\u0374"+
		"\u0375\u0005n\u0000\u0000\u0375\u03f2\u0005\u00ea\u0000\u0000\u0376\u0377"+
		"\u0005\u00dd\u0000\u0000\u0377\u03f2\u0005Q\u0000\u0000\u0378\u0379\u0005"+
		"\u00dd\u0000\u0000\u0379\u03f2\u0005\u00d0\u0000\u0000\u037a\u037b\u0005"+
		"\u00de\u0000\u0000\u037b\u03f2\u0005Q\u0000\u0000\u037c\u037d\u0005\u00de"+
		"\u0000\u0000\u037d\u03f2\u0005\u00d0\u0000\u0000\u037e\u037f\u0005P\u0000"+
		"\u0000\u037f\u0380\u0005\u00b7\u0000\u0000\u0380\u03f2\u0005{\u0000\u0000"+
		"\u0381\u0382\u0005f\u0000\u0000\u0382\u0383\u0005\u00b7\u0000\u0000\u0383"+
		"\u03f2\u0005{\u0000\u0000\u0384\u0385\u0005n\u0000\u0000\u0385\u0386\u0005"+
		"Q\u0000\u0000\u0386\u0387\u0003\u0086C\u0000\u0387\u0388\u0005!\u0000"+
		"\u0000\u0388\u0389\u0005\u00cb\u0000\u0000\u0389\u03f2\u0001\u0000\u0000"+
		"\u0000\u038a\u038b\u0005n\u0000\u0000\u038b\u038c\u0005Q\u0000\u0000\u038c"+
		"\u038d\u0003\u0086C\u0000\u038d\u038e\u0005\u00cb\u0000\u0000\u038e\u038f"+
		"\u0005\u0015\u0000\u0000\u038f\u03f2\u0001\u0000\u0000\u0000\u0390\u0391"+
		"\u0005n\u0000\u0000\u0391\u0392\u0005Q\u0000\u0000\u0392\u0393\u0003\u0086"+
		"C\u0000\u0393\u0394\u0005!\u0000\u0000\u0394\u0395\u0005\u00cc\u0000\u0000"+
		"\u0395\u03f2\u0001\u0000\u0000\u0000\u0396\u0397\u0005n\u0000\u0000\u0397"+
		"\u0398\u0005Q\u0000\u0000\u0398\u0399\u0003\u0086C\u0000\u0399\u039a\u0005"+
		"\u00bd\u0000\u0000\u039a\u039b\u0005\u0015\u0000\u0000\u039b\u03f2\u0001"+
		"\u0000\u0000\u0000\u039c\u039d\u0005n\u0000\u0000\u039d\u039e\u0005Q\u0000"+
		"\u0000\u039e\u039f\u0003\u0086C\u0000\u039f\u03a0\u0005!\u0000\u0000\u03a0"+
		"\u03a1\u0005\u00bd\u0000\u0000\u03a1\u03f2\u0001\u0000\u0000\u0000\u03a2"+
		"\u03a3\u0005n\u0000\u0000\u03a3\u03a4\u0005Q\u0000\u0000\u03a4\u03a5\u0003"+
		"\u0086C\u0000\u03a5\u03a6\u0005!\u0000\u0000\u03a6\u03a7\u0005\u00be\u0000"+
		"\u0000\u03a7\u03a8\u0005\u000f\u0000\u0000\u03a8\u03a9\u0005\u00bf\u0000"+
		"\u0000\u03a9\u03f2\u0001\u0000\u0000\u0000\u03aa\u03ab\u0005n\u0000\u0000"+
		"\u03ab\u03ac\u0005Q\u0000\u0000\u03ac\u03ad\u0003\u0086C\u0000\u03ad\u03ae"+
		"\u0005t\u0000\u0000\u03ae\u03af\u0005\u00bd\u0000\u0000\u03af\u03b0\u0005"+
		"\u00c0\u0000\u0000\u03b0\u03f2\u0001\u0000\u0000\u0000\u03b1\u03b2\u0005"+
		"n\u0000\u0000\u03b2\u03b3\u0005Q\u0000\u0000\u03b3\u03b4\u0003\u0086C"+
		"\u0000\u03b4\u03b5\u0005\u00c1\u0000\u0000\u03b5\u03b6\u0005C\u0000\u0000"+
		"\u03b6\u03f2\u0001\u0000\u0000\u0000\u03b7\u03b8\u0005n\u0000\u0000\u03b8"+
		"\u03b9\u0005Q\u0000\u0000\u03b9\u03ba\u0003\u0086C\u0000\u03ba\u03bb\u0005"+
		"\u00c2\u0000\u0000\u03bb\u03bc\u0005C\u0000\u0000\u03bc\u03f2\u0001\u0000"+
		"\u0000\u0000\u03bd\u03be\u0005n\u0000\u0000\u03be\u03bf\u0005Q\u0000\u0000"+
		"\u03bf\u03c0\u0003\u0086C\u0000\u03c0\u03c1\u0005\u00c3\u0000\u0000\u03c1"+
		"\u03c2\u0005C\u0000\u0000\u03c2\u03f2\u0001\u0000\u0000\u0000\u03c3\u03c4"+
		"\u0005n\u0000\u0000\u03c4\u03c5\u0005Q\u0000\u0000\u03c5\u03c6\u0003\u0086"+
		"C\u0000\u03c6\u03c7\u0005\u00c5\u0000\u0000\u03c7\u03f2\u0001\u0000\u0000"+
		"\u0000\u03c8\u03c9\u0005n\u0000\u0000\u03c9\u03ca\u0005Q\u0000\u0000\u03ca"+
		"\u03cc\u0003\u0086C\u0000\u03cb\u03cd\u0003 \u0010\u0000\u03cc\u03cb\u0001"+
		"\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd\u03ce\u0001"+
		"\u0000\u0000\u0000\u03ce\u03cf\u0005\u00c6\u0000\u0000\u03cf\u03f2\u0001"+
		"\u0000\u0000\u0000\u03d0\u03d1\u0005n\u0000\u0000\u03d1\u03d2\u0005Q\u0000"+
		"\u0000\u03d2\u03d4\u0003\u0086C\u0000\u03d3\u03d5\u0003 \u0010\u0000\u03d4"+
		"\u03d3\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5"+
		"\u03d6\u0001\u0000\u0000\u0000\u03d6\u03d7\u0005\u00c7\u0000\u0000\u03d7"+
		"\u03f2\u0001\u0000\u0000\u0000\u03d8\u03d9\u0005n\u0000\u0000\u03d9\u03da"+
		"\u0005Q\u0000\u0000\u03da\u03dc\u0003\u0086C\u0000\u03db\u03dd\u0003 "+
		"\u0010\u0000\u03dc\u03db\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001\u0000"+
		"\u0000\u0000\u03dd\u03de\u0001\u0000\u0000\u0000\u03de\u03df\u0005t\u0000"+
		"\u0000\u03df\u03e0\u0005\u00c4\u0000\u0000\u03e0\u03f2\u0001\u0000\u0000"+
		"\u0000\u03e1\u03e2\u0005n\u0000\u0000\u03e2\u03e3\u0005Q\u0000\u0000\u03e3"+
		"\u03e5\u0003\u0086C\u0000\u03e4\u03e6\u0003 \u0010\u0000\u03e5\u03e4\u0001"+
		"\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000\u0000\u0000\u03e6\u03e7\u0001"+
		"\u0000\u0000\u0000\u03e7\u03e8\u0005T\u0000\u0000\u03e8\u03e9\u0005a\u0000"+
		"\u0000\u03e9\u03f2\u0001\u0000\u0000\u0000\u03ea\u03eb\u0005w\u0000\u0000"+
		"\u03eb\u03f2\u0005x\u0000\u0000\u03ec\u03f2\u0005y\u0000\u0000\u03ed\u03f2"+
		"\u0005z\u0000\u0000\u03ee\u03f2\u0005\u00d2\u0000\u0000\u03ef\u03f0\u0005"+
		"V\u0000\u0000\u03f0\u03f2\u0005\r\u0000\u0000\u03f1\u0347\u0001\u0000"+
		"\u0000\u0000\u03f1\u0349\u0001\u0000\u0000\u0000\u03f1\u034b\u0001\u0000"+
		"\u0000\u0000\u03f1\u034f\u0001\u0000\u0000\u0000\u03f1\u0353\u0001\u0000"+
		"\u0000\u0000\u03f1\u0355\u0001\u0000\u0000\u0000\u03f1\u035a\u0001\u0000"+
		"\u0000\u0000\u03f1\u035c\u0001\u0000\u0000\u0000\u03f1\u035e\u0001\u0000"+
		"\u0000\u0000\u03f1\u0361\u0001\u0000\u0000\u0000\u03f1\u0363\u0001\u0000"+
		"\u0000\u0000\u03f1\u0365\u0001\u0000\u0000\u0000\u03f1\u0367\u0001\u0000"+
		"\u0000\u0000\u03f1\u036a\u0001\u0000\u0000\u0000\u03f1\u036c\u0001\u0000"+
		"\u0000\u0000\u03f1\u036e\u0001\u0000\u0000\u0000\u03f1\u0370\u0001\u0000"+
		"\u0000\u0000\u03f1\u0372\u0001\u0000\u0000\u0000\u03f1\u0374\u0001\u0000"+
		"\u0000\u0000\u03f1\u0376\u0001\u0000\u0000\u0000\u03f1\u0378\u0001\u0000"+
		"\u0000\u0000\u03f1\u037a\u0001\u0000\u0000\u0000\u03f1\u037c\u0001\u0000"+
		"\u0000\u0000\u03f1\u037e\u0001\u0000\u0000\u0000\u03f1\u0381\u0001\u0000"+
		"\u0000\u0000\u03f1\u0384\u0001\u0000\u0000\u0000\u03f1\u038a\u0001\u0000"+
		"\u0000\u0000\u03f1\u0390\u0001\u0000\u0000\u0000\u03f1\u0396\u0001\u0000"+
		"\u0000\u0000\u03f1\u039c\u0001\u0000\u0000\u0000\u03f1\u03a2\u0001\u0000"+
		"\u0000\u0000\u03f1\u03aa\u0001\u0000\u0000\u0000\u03f1\u03b1\u0001\u0000"+
		"\u0000\u0000\u03f1\u03b7\u0001\u0000\u0000\u0000\u03f1\u03bd\u0001\u0000"+
		"\u0000\u0000\u03f1\u03c3\u0001\u0000\u0000\u0000\u03f1\u03c8\u0001\u0000"+
		"\u0000\u0000\u03f1\u03d0\u0001\u0000\u0000\u0000\u03f1\u03d8\u0001\u0000"+
		"\u0000\u0000\u03f1\u03e1\u0001\u0000\u0000\u0000\u03f1\u03ea\u0001\u0000"+
		"\u0000\u0000\u03f1\u03ec\u0001\u0000\u0000\u0000\u03f1\u03ed\u0001\u0000"+
		"\u0000\u0000\u03f1\u03ee\u0001\u0000\u0000\u0000\u03f1\u03ef\u0001\u0000"+
		"\u0000\u0000\u03f2\u0011\u0001\u0000\u0000\u0000\u03f3\u03f5\u0005P\u0000"+
		"\u0000\u03f4\u03f6\u0005\u00b7\u0000\u0000\u03f5\u03f4\u0001\u0000\u0000"+
		"\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f6\u03f8\u0001\u0000\u0000"+
		"\u0000\u03f7\u03f9\u0005\u00d9\u0000\u0000\u03f8\u03f7\u0001\u0000\u0000"+
		"\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000"+
		"\u0000\u03fa\u03fe\u0005Q\u0000\u0000\u03fb\u03fc\u0005\u0080\u0000\u0000"+
		"\u03fc\u03fd\u0005!\u0000\u0000\u03fd\u03ff\u0005#\u0000\u0000\u03fe\u03fb"+
		"\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0400"+
		"\u0001\u0000\u0000\u0000\u0400\u0401\u0003\u0086C\u0000\u0401\u0013\u0001"+
		"\u0000\u0000\u0000\u0402\u0403\u0005\u00cb\u0000\u0000\u0403\u0404\u0005"+
		"\u0015\u0000\u0000\u0404\u0408\u0003p8\u0000\u0405\u0406\u0005\u00cc\u0000"+
		"\u0000\u0406\u0407\u0005\u0015\u0000\u0000\u0407\u0409\u0003t:\u0000\u0408"+
		"\u0405\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000\u0000\u0000\u0409"+
		"\u040a\u0001\u0000\u0000\u0000\u040a\u040b\u0005W\u0000\u0000\u040b\u040c"+
		"\u0005\u00f5\u0000\u0000\u040c\u040d\u0005\u00bc\u0000\u0000\u040d\u0015"+
		"\u0001\u0000\u0000\u0000\u040e\u040f\u0005\u00bd\u0000\u0000\u040f\u0410"+
		"\u0005\u0015\u0000\u0000\u0410\u0411\u0003p8\u0000\u0411\u0414\u0005>"+
		"\u0000\u0000\u0412\u0415\u00036\u001b\u0000\u0413\u0415\u00038\u001c\u0000"+
		"\u0414\u0412\u0001\u0000\u0000\u0000\u0414\u0413\u0001\u0000\u0000\u0000"+
		"\u0415\u0419\u0001\u0000\u0000\u0000\u0416\u0417\u0005\u00be\u0000\u0000"+
		"\u0417\u0418\u0005\u000f\u0000\u0000\u0418\u041a\u0005\u00bf\u0000\u0000"+
		"\u0419\u0416\u0001\u0000\u0000\u0000\u0419\u041a\u0001\u0000\u0000\u0000"+
		"\u041a\u0017\u0001\u0000\u0000\u0000\u041b\u041c\u0005\u00c0\u0000\u0000"+
		"\u041c\u041d\u0005\u00f1\u0000\u0000\u041d\u0019\u0001\u0000\u0000\u0000"+
		"\u041e\u0420\u0003(\u0014\u0000\u041f\u041e\u0001\u0000\u0000\u0000\u041f"+
		"\u0420\u0001\u0000\u0000\u0000\u0420\u0421\u0001\u0000\u0000\u0000\u0421"+
		"\u0422\u0003B!\u0000\u0422\u001b\u0001\u0000\u0000\u0000\u0423\u0424\u0005"+
		"U\u0000\u0000\u0424\u0425\u0005\u009d\u0000\u0000\u0425\u0426\u0005Q\u0000"+
		"\u0000\u0426\u042d\u0003\u0086C\u0000\u0427\u042b\u0003 \u0010\u0000\u0428"+
		"\u0429\u0005\u0080\u0000\u0000\u0429\u042a\u0005!\u0000\u0000\u042a\u042c"+
		"\u0005#\u0000\u0000\u042b\u0428\u0001\u0000\u0000\u0000\u042b\u042c\u0001"+
		"\u0000\u0000\u0000\u042c\u042e\u0001\u0000\u0000\u0000\u042d\u0427\u0001"+
		"\u0000\u0000\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e\u0454\u0001"+
		"\u0000\u0000\u0000\u042f\u0430\u0005U\u0000\u0000\u0430\u0432\u0005W\u0000"+
		"\u0000\u0431\u0433\u0005Q\u0000\u0000\u0432\u0431\u0001\u0000\u0000\u0000"+
		"\u0432\u0433\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000\u0000"+
		"\u0434\u0436\u0003\u0086C\u0000\u0435\u0437\u0003 \u0010\u0000\u0436\u0435"+
		"\u0001\u0000\u0000\u0000\u0436\u0437\u0001\u0000\u0000\u0000\u0437\u0454"+
		"\u0001\u0000\u0000\u0000\u0438\u0439\u0005U\u0000\u0000\u0439\u043b\u0005"+
		"\u009d\u0000\u0000\u043a\u043c\u0005\u00ef\u0000\u0000\u043b\u043a\u0001"+
		"\u0000\u0000\u0000\u043b\u043c\u0001\u0000\u0000\u0000\u043c\u043d\u0001"+
		"\u0000\u0000\u0000\u043d\u043e\u0005R\u0000\u0000\u043e\u0440\u0005\u00f1"+
		"\u0000\u0000\u043f\u0441\u0003\u0084B\u0000\u0440\u043f\u0001\u0000\u0000"+
		"\u0000\u0440\u0441\u0001\u0000\u0000\u0000\u0441\u0443\u0001\u0000\u0000"+
		"\u0000\u0442\u0444\u0003:\u001d\u0000\u0443\u0442\u0001\u0000\u0000\u0000"+
		"\u0443\u0444\u0001\u0000\u0000\u0000\u0444\u0454\u0001\u0000\u0000\u0000"+
		"\u0445\u0446\u0005U\u0000\u0000\u0446\u0448\u0005\u009d\u0000\u0000\u0447"+
		"\u0449\u0005\u00ef\u0000\u0000\u0448\u0447\u0001\u0000\u0000\u0000\u0448"+
		"\u0449\u0001\u0000\u0000\u0000\u0449\u044a\u0001\u0000\u0000\u0000\u044a"+
		"\u044c\u0005R\u0000\u0000\u044b\u044d\u0005\u00f1\u0000\u0000\u044c\u044b"+
		"\u0001\u0000\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000\u044d\u044e"+
		"\u0001\u0000\u0000\u0000\u044e\u0451\u0003,\u0016\u0000\u044f\u0450\u0005"+
		"\u00b8\u0000\u0000\u0450\u0452\u0003.\u0017\u0000\u0451\u044f\u0001\u0000"+
		"\u0000\u0000\u0451\u0452\u0001\u0000\u0000\u0000\u0452\u0454\u0001\u0000"+
		"\u0000\u0000\u0453\u0423\u0001\u0000\u0000\u0000\u0453\u042f\u0001\u0000"+
		"\u0000\u0000\u0453\u0438\u0001\u0000\u0000\u0000\u0453\u0445\u0001\u0000"+
		"\u0000\u0000\u0454\u001d\u0001\u0000\u0000\u0000\u0455\u0457\u0003 \u0010"+
		"\u0000\u0456\u0458\u0003\u0018\f\u0000\u0457\u0456\u0001\u0000\u0000\u0000"+
		"\u0457\u0458\u0001\u0000\u0000\u0000\u0458\u001f\u0001\u0000\u0000\u0000"+
		"\u0459\u045a\u0005C\u0000\u0000\u045a\u045b\u0005\u0002\u0000\u0000\u045b"+
		"\u0460\u0003\"\u0011\u0000\u045c\u045d\u0005\u0004\u0000\u0000\u045d\u045f"+
		"\u0003\"\u0011\u0000\u045e\u045c\u0001\u0000\u0000\u0000\u045f\u0462\u0001"+
		"\u0000\u0000\u0000\u0460\u045e\u0001\u0000\u0000\u0000\u0460\u0461\u0001"+
		"\u0000\u0000\u0000\u0461\u0463\u0001\u0000\u0000\u0000\u0462\u0460\u0001"+
		"\u0000\u0000\u0000\u0463\u0464\u0005\u0003\u0000\u0000\u0464!\u0001\u0000"+
		"\u0000\u0000\u0465\u0468\u0003\u00c2a\u0000\u0466\u0467\u0005\u0083\u0000"+
		"\u0000\u0467\u0469\u0003\u0098L\u0000\u0468\u0466\u0001\u0000\u0000\u0000"+
		"\u0468\u0469\u0001\u0000\u0000\u0000\u0469#\u0001\u0000\u0000\u0000\u046a"+
		"\u0470\u0003\u00c0`\u0000\u046b\u0470\u0005\u00f1\u0000\u0000\u046c\u0470"+
		"\u0003\u009aM\u0000\u046d\u0470\u0003\u009cN\u0000\u046e\u0470\u0003\u009e"+
		"O\u0000\u046f\u046a\u0001\u0000\u0000\u0000\u046f\u046b\u0001\u0000\u0000"+
		"\u0000\u046f\u046c\u0001\u0000\u0000\u0000\u046f\u046d\u0001\u0000\u0000"+
		"\u0000\u046f\u046e\u0001\u0000\u0000\u0000\u0470%\u0001\u0000\u0000\u0000"+
		"\u0471\u0476\u0003\u00c2a\u0000\u0472\u0473\u0005\u0005\u0000\u0000\u0473"+
		"\u0475\u0003\u00c2a\u0000\u0474\u0472\u0001\u0000\u0000\u0000\u0475\u0478"+
		"\u0001\u0000\u0000\u0000\u0476\u0474\u0001\u0000\u0000\u0000\u0476\u0477"+
		"\u0001\u0000\u0000\u0000\u0477\'\u0001\u0000\u0000\u0000\u0478\u0476\u0001"+
		"\u0000\u0000\u0000\u0479\u047a\u0005N\u0000\u0000\u047a\u047f\u0003*\u0015"+
		"\u0000\u047b\u047c\u0005\u0004\u0000\u0000\u047c\u047e\u0003*\u0015\u0000"+
		"\u047d\u047b\u0001\u0000\u0000\u0000\u047e\u0481\u0001\u0000\u0000\u0000"+
		"\u047f\u047d\u0001\u0000\u0000\u0000\u047f\u0480\u0001\u0000\u0000\u0000"+
		"\u0480)\u0001\u0000\u0000\u0000\u0481\u047f\u0001\u0000\u0000\u0000\u0482"+
		"\u0484\u0003\u00c2a\u0000\u0483\u0485\u0005\u000f\u0000\u0000\u0484\u0483"+
		"\u0001\u0000\u0000\u0000\u0484\u0485\u0001\u0000\u0000\u0000\u0485\u0486"+
		"\u0001\u0000\u0000\u0000\u0486\u0487\u0005\u0002\u0000\u0000\u0487\u0488"+
		"\u0003\u001a\r\u0000\u0488\u0489\u0005\u0003\u0000\u0000\u0489+\u0001"+
		"\u0000\u0000\u0000\u048a\u048b\u0005\u00a0\u0000\u0000\u048b\u048c\u0003"+
		"\u00c0`\u0000\u048c-\u0001\u0000\u0000\u0000\u048d\u048e\u0005\u0002\u0000"+
		"\u0000\u048e\u0493\u00030\u0018\u0000\u048f\u0490\u0005\u0004\u0000\u0000"+
		"\u0490\u0492\u00030\u0018\u0000\u0491\u048f\u0001\u0000\u0000\u0000\u0492"+
		"\u0495\u0001\u0000\u0000\u0000\u0493\u0491\u0001\u0000\u0000\u0000\u0493"+
		"\u0494\u0001\u0000\u0000\u0000\u0494\u0496\u0001\u0000\u0000\u0000\u0495"+
		"\u0493\u0001\u0000\u0000\u0000\u0496\u0497\u0005\u0003\u0000\u0000\u0497"+
		"/\u0001\u0000\u0000\u0000\u0498\u049d\u00032\u0019\u0000\u0499\u049b\u0005"+
		"\u0083\u0000\u0000\u049a\u0499\u0001\u0000\u0000\u0000\u049a\u049b\u0001"+
		"\u0000\u0000\u0000\u049b\u049c\u0001\u0000\u0000\u0000\u049c\u049e\u0003"+
		"4\u001a\u0000\u049d\u049a\u0001\u0000\u0000\u0000\u049d\u049e\u0001\u0000"+
		"\u0000\u0000\u049e1\u0001\u0000\u0000\u0000\u049f\u04a4\u0003\u00c2a\u0000"+
		"\u04a0\u04a1\u0005\u0005\u0000\u0000\u04a1\u04a3\u0003\u00c2a\u0000\u04a2"+
		"\u04a0\u0001\u0000\u0000\u0000\u04a3\u04a6\u0001\u0000\u0000\u0000\u04a4"+
		"\u04a2\u0001\u0000\u0000\u0000\u04a4\u04a5\u0001\u0000\u0000\u0000\u04a5"+
		"\u04a9\u0001\u0000\u0000\u0000\u04a6\u04a4\u0001\u0000\u0000\u0000\u04a7"+
		"\u04a9\u0005\u00f1\u0000\u0000\u04a8\u049f\u0001\u0000\u0000\u0000\u04a8"+
		"\u04a7\u0001\u0000\u0000\u0000\u04a93\u0001\u0000\u0000\u0000\u04aa\u04af"+
		"\u0005\u00f5\u0000\u0000\u04ab\u04af\u0005\u00f6\u0000\u0000\u04ac\u04af"+
		"\u0003\u00a0P\u0000\u04ad\u04af\u0005\u00f1\u0000\u0000\u04ae\u04aa\u0001"+
		"\u0000\u0000\u0000\u04ae\u04ab\u0001\u0000\u0000\u0000\u04ae\u04ac\u0001"+
		"\u0000\u0000\u0000\u04ae\u04ad\u0001\u0000\u0000\u0000\u04af5\u0001\u0000"+
		"\u0000\u0000\u04b0\u04b1\u0005\u0002\u0000\u0000\u04b1\u04b6\u0003\u0098"+
		"L\u0000\u04b2\u04b3\u0005\u0004\u0000\u0000\u04b3\u04b5\u0003\u0098L\u0000"+
		"\u04b4\u04b2\u0001\u0000\u0000\u0000\u04b5\u04b8\u0001\u0000\u0000\u0000"+
		"\u04b6\u04b4\u0001\u0000\u0000\u0000\u04b6\u04b7\u0001\u0000\u0000\u0000"+
		"\u04b7\u04b9\u0001\u0000\u0000\u0000\u04b8\u04b6\u0001\u0000\u0000\u0000"+
		"\u04b9\u04ba\u0005\u0003\u0000\u0000\u04ba7\u0001\u0000\u0000\u0000\u04bb"+
		"\u04bc\u0005\u0002\u0000\u0000\u04bc\u04c1\u00036\u001b\u0000\u04bd\u04be"+
		"\u0005\u0004\u0000\u0000\u04be\u04c0\u00036\u001b\u0000\u04bf\u04bd\u0001"+
		"\u0000\u0000\u0000\u04c0\u04c3\u0001\u0000\u0000\u0000\u04c1\u04bf\u0001"+
		"\u0000\u0000\u0000\u04c1\u04c2\u0001\u0000\u0000\u0000\u04c2\u04c4\u0001"+
		"\u0000\u0000\u0000\u04c3\u04c1\u0001\u0000\u0000\u0000\u04c4\u04c5\u0005"+
		"\u0003\u0000\u0000\u04c59\u0001\u0000\u0000\u0000\u04c6\u04c7\u0005\u00be"+
		"\u0000\u0000\u04c7\u04c8\u0005\u000f\u0000\u0000\u04c8\u04cd\u0003<\u001e"+
		"\u0000\u04c9\u04ca\u0005\u00be\u0000\u0000\u04ca\u04cb\u0005\u0015\u0000"+
		"\u0000\u04cb\u04cd\u0003>\u001f\u0000\u04cc\u04c6\u0001\u0000\u0000\u0000"+
		"\u04cc\u04c9\u0001\u0000\u0000\u0000\u04cd;\u0001\u0000\u0000\u0000\u04ce"+
		"\u04cf\u0005\u00ce\u0000\u0000\u04cf\u04d0\u0005\u00f1\u0000\u0000\u04d0"+
		"\u04d1\u0005\u00cf\u0000\u0000\u04d1\u04d4\u0005\u00f1\u0000\u0000\u04d2"+
		"\u04d4\u0003\u00c2a\u0000\u04d3\u04ce\u0001\u0000\u0000\u0000\u04d3\u04d2"+
		"\u0001\u0000\u0000\u0000\u04d4=\u0001\u0000\u0000\u0000\u04d5\u04d9\u0005"+
		"\u00f1\u0000\u0000\u04d6\u04d7\u0005N\u0000\u0000\u04d7\u04d8\u0005\u00a2"+
		"\u0000\u0000\u04d8\u04da\u0003.\u0017\u0000\u04d9\u04d6\u0001\u0000\u0000"+
		"\u0000\u04d9\u04da\u0001\u0000\u0000\u0000\u04da?\u0001\u0000\u0000\u0000"+
		"\u04db\u04dc\u0003\u00c2a\u0000\u04dc\u04dd\u0005\u00f1\u0000\u0000\u04dd"+
		"A\u0001\u0000\u0000\u0000\u04de\u04e0\u0003\u001c\u000e\u0000\u04df\u04de"+
		"\u0001\u0000\u0000\u0000\u04df\u04e0\u0001\u0000\u0000\u0000\u04e0\u04e1"+
		"\u0001\u0000\u0000\u0000\u04e1\u04e2\u0003H$\u0000\u04e2\u04e3\u0003D"+
		"\"\u0000\u04e3\u04eb\u0001\u0000\u0000\u0000\u04e4\u04e6\u0003T*\u0000"+
		"\u04e5\u04e7\u0003F#\u0000\u04e6\u04e5\u0001\u0000\u0000\u0000\u04e7\u04e8"+
		"\u0001\u0000\u0000\u0000\u04e8\u04e6\u0001\u0000\u0000\u0000\u04e8\u04e9"+
		"\u0001\u0000\u0000\u0000\u04e9\u04eb\u0001\u0000\u0000\u0000\u04ea\u04df"+
		"\u0001\u0000\u0000\u0000\u04ea\u04e4\u0001\u0000\u0000\u0000\u04ebC\u0001"+
		"\u0000\u0000\u0000\u04ec\u04ed\u0005\u001a\u0000\u0000\u04ed\u04ee\u0005"+
		"\u0015\u0000\u0000\u04ee\u04f3\u0003L&\u0000\u04ef\u04f0\u0005\u0004\u0000"+
		"\u0000\u04f0\u04f2\u0003L&\u0000\u04f1\u04ef\u0001\u0000\u0000\u0000\u04f2"+
		"\u04f5\u0001\u0000\u0000\u0000\u04f3\u04f1\u0001\u0000\u0000\u0000\u04f3"+
		"\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f7\u0001\u0000\u0000\u0000\u04f5"+
		"\u04f3\u0001\u0000\u0000\u0000\u04f6\u04ec\u0001\u0000\u0000\u0000\u04f6"+
		"\u04f7\u0001\u0000\u0000\u0000\u04f7\u0502\u0001\u0000\u0000\u0000\u04f8"+
		"\u04f9\u0005\u009b\u0000\u0000\u04f9\u04fa\u0005\u0015\u0000\u0000\u04fa"+
		"\u04ff\u0003\u008eG\u0000\u04fb\u04fc\u0005\u0004\u0000\u0000\u04fc\u04fe"+
		"\u0003\u008eG\u0000\u04fd\u04fb\u0001\u0000\u0000\u0000\u04fe\u0501\u0001"+
		"\u0000\u0000\u0000\u04ff\u04fd\u0001\u0000\u0000\u0000\u04ff\u0500\u0001"+
		"\u0000\u0000\u0000\u0500\u0503\u0001\u0000\u0000\u0000\u0501\u04ff\u0001"+
		"\u0000\u0000\u0000\u0502\u04f8\u0001\u0000\u0000\u0000\u0502\u0503\u0001"+
		"\u0000\u0000\u0000\u0503\u050e\u0001\u0000\u0000\u0000\u0504\u0505\u0005"+
		"\u009c\u0000\u0000\u0505\u0506\u0005\u0015\u0000\u0000\u0506\u050b\u0003"+
		"\u008eG\u0000\u0507\u0508\u0005\u0004\u0000\u0000\u0508\u050a\u0003\u008e"+
		"G\u0000\u0509\u0507\u0001\u0000\u0000\u0000\u050a\u050d\u0001\u0000\u0000"+
		"\u0000\u050b\u0509\u0001\u0000\u0000\u0000\u050b\u050c\u0001\u0000\u0000"+
		"\u0000\u050c\u050f\u0001\u0000\u0000\u0000\u050d\u050b\u0001\u0000\u0000"+
		"\u0000\u050e\u0504\u0001\u0000\u0000\u0000\u050e\u050f\u0001\u0000\u0000"+
		"\u0000\u050f\u051a\u0001\u0000\u0000\u0000\u0510\u0511\u0005\u009a\u0000"+
		"\u0000\u0511\u0512\u0005\u0015\u0000\u0000\u0512\u0517\u0003L&\u0000\u0513"+
		"\u0514\u0005\u0004\u0000\u0000\u0514\u0516\u0003L&\u0000\u0515\u0513\u0001"+
		"\u0000\u0000\u0000\u0516\u0519\u0001\u0000\u0000\u0000\u0517\u0515\u0001"+
		"\u0000\u0000\u0000\u0517\u0518\u0001\u0000\u0000\u0000\u0518\u051b\u0001"+
		"\u0000\u0000\u0000\u0519\u0517\u0001\u0000\u0000\u0000\u051a\u0510\u0001"+
		"\u0000\u0000\u0000\u051a\u051b\u0001\u0000\u0000\u0000\u051b\u051d\u0001"+
		"\u0000\u0000\u0000\u051c\u051e\u0003\u00b6[\u0000\u051d\u051c\u0001\u0000"+
		"\u0000\u0000\u051d\u051e\u0001\u0000\u0000\u0000\u051e\u0524\u0001\u0000"+
		"\u0000\u0000\u051f\u0522\u0005\u001c\u0000\u0000\u0520\u0523\u0005\u0010"+
		"\u0000\u0000\u0521\u0523\u0003\u008eG\u0000\u0522\u0520\u0001\u0000\u0000"+
		"\u0000\u0522\u0521\u0001\u0000\u0000\u0000\u0523\u0525\u0001\u0000\u0000"+
		"\u0000\u0524\u051f\u0001\u0000\u0000\u0000\u0524\u0525\u0001\u0000\u0000"+
		"\u0000\u0525E\u0001\u0000\u0000\u0000\u0526\u0528\u0003\u001c\u000e\u0000"+
		"\u0527\u0526\u0001\u0000\u0000\u0000\u0527\u0528\u0001\u0000\u0000\u0000"+
		"\u0528\u0529\u0001\u0000\u0000\u0000\u0529\u052a\u0003N\'\u0000\u052a"+
		"\u052b\u0003D\"\u0000\u052bG\u0001\u0000\u0000\u0000\u052c\u052d\u0006"+
		"$\uffff\uffff\u0000\u052d\u052e\u0003J%\u0000\u052e\u0546\u0001\u0000"+
		"\u0000\u0000\u052f\u0530\n\u0003\u0000\u0000\u0530\u0531\u0004$\u0001"+
		"\u0000\u0531\u0533\u0007\u0007\u0000\u0000\u0532\u0534\u0003b1\u0000\u0533"+
		"\u0532\u0001\u0000\u0000\u0000\u0533\u0534\u0001\u0000\u0000\u0000\u0534"+
		"\u0535\u0001\u0000\u0000\u0000\u0535\u0545\u0003H$\u0004\u0536\u0537\n"+
		"\u0002\u0000\u0000\u0537\u0538\u0004$\u0003\u0000\u0538\u053a\u0005j\u0000"+
		"\u0000\u0539\u053b\u0003b1\u0000\u053a\u0539\u0001\u0000\u0000\u0000\u053a"+
		"\u053b\u0001\u0000\u0000\u0000\u053b\u053c\u0001\u0000\u0000\u0000\u053c"+
		"\u0545\u0003H$\u0003\u053d\u053e\n\u0001\u0000\u0000\u053e\u053f\u0004"+
		"$\u0005\u0000\u053f\u0541\u0007\b\u0000\u0000\u0540\u0542\u0003b1\u0000"+
		"\u0541\u0540\u0001\u0000\u0000\u0000\u0541\u0542\u0001\u0000\u0000\u0000"+
		"\u0542\u0543\u0001\u0000\u0000\u0000\u0543\u0545\u0003H$\u0002\u0544\u052f"+
		"\u0001\u0000\u0000\u0000\u0544\u0536\u0001\u0000\u0000\u0000\u0544\u053d"+
		"\u0001\u0000\u0000\u0000\u0545\u0548\u0001\u0000\u0000\u0000\u0546\u0544"+
		"\u0001\u0000\u0000\u0000\u0546\u0547\u0001\u0000\u0000\u0000\u0547I\u0001"+
		"\u0000\u0000\u0000\u0548\u0546\u0001\u0000\u0000\u0000\u0549\u0552\u0003"+
		"N\'\u0000\u054a\u054b\u0005Q\u0000\u0000\u054b\u0552\u0003\u0086C\u0000"+
		"\u054c\u0552\u0003~?\u0000\u054d\u054e\u0005\u0002\u0000\u0000\u054e\u054f"+
		"\u0003B!\u0000\u054f\u0550\u0005\u0003\u0000\u0000\u0550\u0552\u0001\u0000"+
		"\u0000\u0000\u0551\u0549\u0001\u0000\u0000\u0000\u0551\u054a\u0001\u0000"+
		"\u0000\u0000\u0551\u054c\u0001\u0000\u0000\u0000\u0551\u054d\u0001\u0000"+
		"\u0000\u0000\u0552K\u0001\u0000\u0000\u0000\u0553\u0555\u0003\u008eG\u0000"+
		"\u0554\u0556\u0007\t\u0000\u0000\u0555\u0554\u0001\u0000\u0000\u0000\u0555"+
		"\u0556\u0001\u0000\u0000\u0000\u0556\u0559\u0001\u0000\u0000\u0000\u0557"+
		"\u0558\u0005+\u0000\u0000\u0558\u055a\u0007\n\u0000\u0000\u0559\u0557"+
		"\u0001\u0000\u0000\u0000\u0559\u055a\u0001\u0000\u0000\u0000\u055aM\u0001"+
		"\u0000\u0000\u0000\u055b\u055c\u0005\f\u0000\u0000\u055c\u055d\u0005\u009e"+
		"\u0000\u0000\u055d\u055e\u0005\u0002\u0000\u0000\u055e\u055f\u0003\u008c"+
		"F\u0000\u055f\u0560\u0005\u0003\u0000\u0000\u0560\u0566\u0001\u0000\u0000"+
		"\u0000\u0561\u0562\u0005q\u0000\u0000\u0562\u0566\u0003\u008cF\u0000\u0563"+
		"\u0564\u0005\u009f\u0000\u0000\u0564\u0566\u0003\u008cF\u0000\u0565\u055b"+
		"\u0001\u0000\u0000\u0000\u0565\u0561\u0001\u0000\u0000\u0000\u0565\u0563"+
		"\u0001\u0000\u0000\u0000\u0566\u0568\u0001\u0000\u0000\u0000\u0567\u0569"+
		"\u0003\u0084B\u0000\u0568\u0567\u0001\u0000\u0000\u0000\u0568\u0569\u0001"+
		"\u0000\u0000\u0000\u0569\u056c\u0001\u0000\u0000\u0000\u056a\u056b\u0005"+
		"\u00a4\u0000\u0000\u056b\u056d\u0005\u00f1\u0000\u0000\u056c\u056a\u0001"+
		"\u0000\u0000\u0000\u056c\u056d\u0001\u0000\u0000\u0000\u056d\u056e\u0001"+
		"\u0000\u0000\u0000\u056e\u056f\u0005\u00a0\u0000\u0000\u056f\u057c\u0005"+
		"\u00f1\u0000\u0000\u0570\u057a\u0005\u000f\u0000\u0000\u0571\u057b\u0003"+
		"r9\u0000\u0572\u057b\u0003\u00acV\u0000\u0573\u0576\u0005\u0002\u0000"+
		"\u0000\u0574\u0577\u0003r9\u0000\u0575\u0577\u0003\u00acV\u0000\u0576"+
		"\u0574\u0001\u0000\u0000\u0000\u0576\u0575\u0001\u0000\u0000\u0000\u0577"+
		"\u0578\u0001\u0000\u0000\u0000\u0578\u0579\u0005\u0003\u0000\u0000\u0579"+
		"\u057b\u0001\u0000\u0000\u0000\u057a\u0571\u0001\u0000\u0000\u0000\u057a"+
		"\u0572\u0001\u0000\u0000\u0000\u057a\u0573\u0001\u0000\u0000\u0000\u057b"+
		"\u057d\u0001\u0000\u0000\u0000\u057c\u0570\u0001\u0000\u0000\u0000\u057c"+
		"\u057d\u0001\u0000\u0000\u0000\u057d\u057f\u0001\u0000\u0000\u0000\u057e"+
		"\u0580\u0003\u0084B\u0000\u057f\u057e\u0001\u0000\u0000\u0000\u057f\u0580"+
		"\u0001\u0000\u0000\u0000\u0580\u0583\u0001\u0000\u0000\u0000\u0581\u0582"+
		"\u0005\u00a3\u0000\u0000\u0582\u0584\u0005\u00f1\u0000\u0000\u0583\u0581"+
		"\u0001\u0000\u0000\u0000\u0583\u0584\u0001\u0000\u0000\u0000\u0584\u0585"+
		"\u0001\u0000\u0000\u0000\u0585\u0588\u0003T*\u0000\u0586\u0587\u0005\u0013"+
		"\u0000\u0000\u0587\u0589\u0003\u0090H\u0000\u0588\u0586\u0001\u0000\u0000"+
		"\u0000\u0588\u0589\u0001\u0000\u0000\u0000\u0589\u05b6\u0001\u0000\u0000"+
		"\u0000\u058a\u058e\u0005\f\u0000\u0000\u058b\u058d\u0003P(\u0000\u058c"+
		"\u058b\u0001\u0000\u0000\u0000\u058d\u0590\u0001\u0000\u0000\u0000\u058e"+
		"\u058c\u0001\u0000\u0000\u0000\u058e\u058f\u0001\u0000\u0000\u0000\u058f"+
		"\u0592\u0001\u0000\u0000\u0000\u0590\u058e\u0001\u0000\u0000\u0000\u0591"+
		"\u0593\u0003b1\u0000\u0592\u0591\u0001\u0000\u0000\u0000\u0592\u0593\u0001"+
		"\u0000\u0000\u0000\u0593\u0594\u0001\u0000\u0000\u0000\u0594\u0595\u0003"+
		"\u008cF\u0000\u0595\u0596\u0003T*\u0000\u0596\u05a0\u0001\u0000\u0000"+
		"\u0000\u0597\u059d\u0003T*\u0000\u0598\u059a\u0005\f\u0000\u0000\u0599"+
		"\u059b\u0003b1\u0000\u059a\u0599\u0001\u0000\u0000\u0000\u059a\u059b\u0001"+
		"\u0000\u0000\u0000\u059b\u059c\u0001\u0000\u0000\u0000\u059c\u059e\u0003"+
		"\u008cF\u0000\u059d\u0598\u0001\u0000\u0000\u0000\u059d\u059e\u0001\u0000"+
		"\u0000\u0000\u059e\u05a0\u0001\u0000\u0000\u0000\u059f\u058a\u0001\u0000"+
		"\u0000\u0000\u059f\u0597\u0001\u0000\u0000\u0000\u05a0\u05a4\u0001\u0000"+
		"\u0000\u0000\u05a1\u05a3\u0003`0\u0000\u05a2\u05a1\u0001\u0000\u0000\u0000"+
		"\u05a3\u05a6\u0001\u0000\u0000\u0000\u05a4\u05a2\u0001\u0000\u0000\u0000"+
		"\u05a4\u05a5\u0001\u0000\u0000\u0000\u05a5\u05a9\u0001\u0000\u0000\u0000"+
		"\u05a6\u05a4\u0001\u0000\u0000\u0000\u05a7\u05a8\u0005\u0013\u0000\u0000"+
		"\u05a8\u05aa\u0003\u0090H\u0000\u05a9\u05a7\u0001\u0000\u0000\u0000\u05a9"+
		"\u05aa\u0001\u0000\u0000\u0000\u05aa\u05ac\u0001\u0000\u0000\u0000\u05ab"+
		"\u05ad\u0003V+\u0000\u05ac\u05ab\u0001\u0000\u0000\u0000\u05ac\u05ad\u0001"+
		"\u0000\u0000\u0000\u05ad\u05b0\u0001\u0000\u0000\u0000\u05ae\u05af\u0005"+
		"\u001b\u0000\u0000\u05af\u05b1\u0003\u0090H\u0000\u05b0\u05ae\u0001\u0000"+
		"\u0000\u0000\u05b0\u05b1\u0001\u0000\u0000\u0000\u05b1\u05b3\u0001\u0000"+
		"\u0000\u0000\u05b2\u05b4\u0003\u00b6[\u0000\u05b3\u05b2\u0001\u0000\u0000"+
		"\u0000\u05b3\u05b4\u0001\u0000\u0000\u0000\u05b4\u05b6\u0001\u0000\u0000"+
		"\u0000\u05b5\u0565\u0001\u0000\u0000\u0000\u05b5\u059f\u0001\u0000\u0000"+
		"\u0000\u05b6O\u0001\u0000\u0000\u0000\u05b7\u05b8\u0005\u0006\u0000\u0000"+
		"\u05b8\u05bf\u0003R)\u0000\u05b9\u05bb\u0005\u0004\u0000\u0000\u05ba\u05b9"+
		"\u0001\u0000\u0000\u0000\u05ba\u05bb\u0001\u0000\u0000\u0000\u05bb\u05bc"+
		"\u0001\u0000\u0000\u0000\u05bc\u05be\u0003R)\u0000\u05bd\u05ba\u0001\u0000"+
		"\u0000\u0000\u05be\u05c1\u0001\u0000\u0000\u0000\u05bf\u05bd\u0001\u0000"+
		"\u0000\u0000\u05bf\u05c0\u0001\u0000\u0000\u0000\u05c0\u05c2\u0001\u0000"+
		"\u0000\u0000\u05c1\u05bf\u0001\u0000\u0000\u0000\u05c2\u05c3\u0005\u0007"+
		"\u0000\u0000\u05c3Q\u0001\u0000\u0000\u0000\u05c4\u05d2\u0003\u00c2a\u0000"+
		"\u05c5\u05c6\u0003\u00c2a\u0000\u05c6\u05c7\u0005\u0002\u0000\u0000\u05c7"+
		"\u05cc\u0003\u0096K\u0000\u05c8\u05c9\u0005\u0004\u0000\u0000\u05c9\u05cb"+
		"\u0003\u0096K\u0000\u05ca\u05c8\u0001\u0000\u0000\u0000\u05cb\u05ce\u0001"+
		"\u0000\u0000\u0000\u05cc\u05ca\u0001\u0000\u0000\u0000\u05cc\u05cd\u0001"+
		"\u0000\u0000\u0000\u05cd\u05cf\u0001\u0000\u0000\u0000\u05ce\u05cc\u0001"+
		"\u0000\u0000\u0000\u05cf\u05d0\u0005\u0003\u0000\u0000\u05d0\u05d2\u0001"+
		"\u0000\u0000\u0000\u05d1\u05c4\u0001\u0000\u0000\u0000\u05d1\u05c5\u0001"+
		"\u0000\u0000\u0000\u05d2S\u0001\u0000\u0000\u0000\u05d3\u05d4\u0005\r"+
		"\u0000\u0000\u05d4\u05d9\u0003d2\u0000\u05d5\u05d6\u0005\u0004\u0000\u0000"+
		"\u05d6\u05d8\u0003d2\u0000\u05d7\u05d5\u0001\u0000\u0000\u0000\u05d8\u05db"+
		"\u0001\u0000\u0000\u0000\u05d9\u05d7\u0001\u0000\u0000\u0000\u05d9\u05da"+
		"\u0001\u0000\u0000\u0000\u05da\u05df\u0001\u0000\u0000\u0000\u05db\u05d9"+
		"\u0001\u0000\u0000\u0000\u05dc\u05de\u0003`0\u0000\u05dd\u05dc\u0001\u0000"+
		"\u0000\u0000\u05de\u05e1\u0001\u0000\u0000\u0000\u05df\u05dd\u0001\u0000"+
		"\u0000\u0000\u05df\u05e0\u0001\u0000\u0000\u0000\u05e0\u05e3\u0001\u0000"+
		"\u0000\u0000\u05e1\u05df\u0001\u0000\u0000\u0000\u05e2\u05e4\u0003Z-\u0000"+
		"\u05e3\u05e2\u0001\u0000\u0000\u0000\u05e3\u05e4\u0001\u0000\u0000\u0000"+
		"\u05e4U\u0001\u0000\u0000\u0000\u05e5\u05e6\u0005\u0014\u0000\u0000\u05e6"+
		"\u05e7\u0005\u0015\u0000\u0000\u05e7\u05ec\u0003\u008eG\u0000\u05e8\u05e9"+
		"\u0005\u0004\u0000\u0000\u05e9\u05eb\u0003\u008eG\u0000\u05ea\u05e8\u0001"+
		"\u0000\u0000\u0000\u05eb\u05ee\u0001\u0000\u0000\u0000\u05ec\u05ea\u0001"+
		"\u0000\u0000\u0000\u05ec\u05ed\u0001\u0000\u0000\u0000\u05ed\u0600\u0001"+
		"\u0000\u0000\u0000\u05ee\u05ec\u0001\u0000\u0000\u0000\u05ef\u05f0\u0005"+
		"N\u0000\u0000\u05f0\u0601\u0005\u0019\u0000\u0000\u05f1\u05f2\u0005N\u0000"+
		"\u0000\u05f2\u0601\u0005\u0018\u0000\u0000\u05f3\u05f4\u0005\u0016\u0000"+
		"\u0000\u05f4\u05f5\u0005\u0017\u0000\u0000\u05f5\u05f6\u0005\u0002\u0000"+
		"\u0000\u05f6\u05fb\u0003X,\u0000\u05f7\u05f8\u0005\u0004\u0000\u0000\u05f8"+
		"\u05fa\u0003X,\u0000\u05f9\u05f7\u0001\u0000\u0000\u0000\u05fa\u05fd\u0001"+
		"\u0000\u0000\u0000\u05fb\u05f9\u0001\u0000\u0000\u0000\u05fb\u05fc\u0001"+
		"\u0000\u0000\u0000\u05fc\u05fe\u0001\u0000\u0000\u0000\u05fd\u05fb\u0001"+
		"\u0000\u0000\u0000\u05fe\u05ff\u0005\u0003\u0000\u0000\u05ff\u0601\u0001"+
		"\u0000\u0000\u0000\u0600\u05ef\u0001\u0000\u0000\u0000\u0600\u05f1\u0001"+
		"\u0000\u0000\u0000\u0600\u05f3\u0001\u0000\u0000\u0000\u0600\u0601\u0001"+
		"\u0000\u0000\u0000\u0601\u0612\u0001\u0000\u0000\u0000\u0602\u0603\u0005"+
		"\u0014\u0000\u0000\u0603\u0604\u0005\u0015\u0000\u0000\u0604\u0605\u0005"+
		"\u0016\u0000\u0000\u0605\u0606\u0005\u0017\u0000\u0000\u0606\u0607\u0005"+
		"\u0002\u0000\u0000\u0607\u060c\u0003X,\u0000\u0608\u0609\u0005\u0004\u0000"+
		"\u0000\u0609\u060b\u0003X,\u0000\u060a\u0608\u0001\u0000\u0000\u0000\u060b"+
		"\u060e\u0001\u0000\u0000\u0000\u060c\u060a\u0001\u0000\u0000\u0000\u060c"+
		"\u060d\u0001\u0000\u0000\u0000\u060d\u060f\u0001\u0000\u0000\u0000\u060e"+
		"\u060c\u0001\u0000\u0000\u0000\u060f\u0610\u0005\u0003\u0000\u0000\u0610"+
		"\u0612\u0001\u0000\u0000\u0000\u0611\u05e5\u0001\u0000\u0000\u0000\u0611"+
		"\u0602\u0001\u0000\u0000\u0000\u0612W\u0001\u0000\u0000\u0000\u0613\u061c"+
		"\u0005\u0002\u0000\u0000\u0614\u0619\u0003\u008eG\u0000\u0615\u0616\u0005"+
		"\u0004\u0000\u0000\u0616\u0618\u0003\u008eG\u0000\u0617\u0615\u0001\u0000"+
		"\u0000\u0000\u0618\u061b\u0001\u0000\u0000\u0000\u0619\u0617\u0001\u0000"+
		"\u0000\u0000\u0619\u061a\u0001\u0000\u0000\u0000\u061a\u061d\u0001\u0000"+
		"\u0000\u0000\u061b\u0619\u0001\u0000\u0000\u0000\u061c\u0614\u0001\u0000"+
		"\u0000\u0000\u061c\u061d\u0001\u0000\u0000\u0000\u061d\u061e\u0001\u0000"+
		"\u0000\u0000\u061e\u0621\u0005\u0003\u0000\u0000\u061f\u0621\u0003\u008e"+
		"G\u0000\u0620\u0613\u0001\u0000\u0000\u0000\u0620\u061f\u0001\u0000\u0000"+
		"\u0000\u0621Y\u0001\u0000\u0000\u0000\u0622\u0623\u0005?\u0000\u0000\u0623"+
		"\u0624\u0005\u0002\u0000\u0000\u0624\u0625\u0003\u008cF\u0000\u0625\u0626"+
		"\u0005.\u0000\u0000\u0626\u0627\u0003\\.\u0000\u0627\u0628\u0005 \u0000"+
		"\u0000\u0628\u0629\u0005\u0002\u0000\u0000\u0629\u062e\u0003^/\u0000\u062a"+
		"\u062b\u0005\u0004\u0000\u0000\u062b\u062d\u0003^/\u0000\u062c\u062a\u0001"+
		"\u0000\u0000\u0000\u062d\u0630\u0001\u0000\u0000\u0000\u062e\u062c\u0001"+
		"\u0000\u0000\u0000\u062e\u062f\u0001\u0000\u0000\u0000\u062f\u0631\u0001"+
		"\u0000\u0000\u0000\u0630\u062e\u0001\u0000\u0000\u0000\u0631\u0632\u0005"+
		"\u0003\u0000\u0000\u0632\u0633\u0005\u0003\u0000\u0000\u0633[\u0001\u0000"+
		"\u0000\u0000\u0634\u0641\u0003\u00c2a\u0000\u0635\u0636\u0005\u0002\u0000"+
		"\u0000\u0636\u063b\u0003\u00c2a\u0000\u0637\u0638\u0005\u0004\u0000\u0000"+
		"\u0638\u063a\u0003\u00c2a\u0000\u0639\u0637\u0001\u0000\u0000\u0000\u063a"+
		"\u063d\u0001\u0000\u0000\u0000\u063b\u0639\u0001\u0000\u0000\u0000\u063b"+
		"\u063c\u0001\u0000\u0000\u0000\u063c\u063e\u0001\u0000\u0000\u0000\u063d"+
		"\u063b\u0001\u0000\u0000\u0000\u063e\u063f\u0005\u0003\u0000\u0000\u063f"+
		"\u0641\u0001\u0000\u0000\u0000\u0640\u0634\u0001\u0000\u0000\u0000\u0640"+
		"\u0635\u0001\u0000\u0000\u0000\u0641]\u0001\u0000\u0000\u0000\u0642\u0647"+
		"\u0003\u008eG\u0000\u0643\u0645\u0005\u000f\u0000\u0000\u0644\u0643\u0001"+
		"\u0000\u0000\u0000\u0644\u0645\u0001\u0000\u0000\u0000\u0645\u0646\u0001"+
		"\u0000\u0000\u0000\u0646\u0648\u0003\u00c2a\u0000\u0647\u0644\u0001\u0000"+
		"\u0000\u0000\u0647\u0648\u0001\u0000\u0000\u0000\u0648_\u0001\u0000\u0000"+
		"\u0000\u0649\u064a\u0005@\u0000\u0000\u064a\u064c\u0005S\u0000\u0000\u064b"+
		"\u064d\u00057\u0000\u0000\u064c\u064b\u0001\u0000\u0000\u0000\u064c\u064d"+
		"\u0001\u0000\u0000\u0000\u064d\u064e\u0001\u0000\u0000\u0000\u064e\u064f"+
		"\u0003\u00c0`\u0000\u064f\u0658\u0005\u0002\u0000\u0000\u0650\u0655\u0003"+
		"\u008eG\u0000\u0651\u0652\u0005\u0004\u0000\u0000\u0652\u0654\u0003\u008e"+
		"G\u0000\u0653\u0651\u0001\u0000\u0000\u0000\u0654\u0657\u0001\u0000\u0000"+
		"\u0000\u0655\u0653\u0001\u0000\u0000\u0000\u0655\u0656\u0001\u0000\u0000"+
		"\u0000\u0656\u0659\u0001\u0000\u0000\u0000\u0657\u0655\u0001\u0000\u0000"+
		"\u0000\u0658\u0650\u0001\u0000\u0000\u0000\u0658\u0659\u0001\u0000\u0000"+
		"\u0000\u0659\u065a\u0001\u0000\u0000\u0000\u065a\u065b\u0005\u0003\u0000"+
		"\u0000\u065b\u0667\u0003\u00c2a\u0000\u065c\u065e\u0005\u000f\u0000\u0000"+
		"\u065d\u065c\u0001\u0000\u0000\u0000\u065d\u065e\u0001\u0000\u0000\u0000"+
		"\u065e\u065f\u0001\u0000\u0000\u0000\u065f\u0664\u0003\u00c2a\u0000\u0660"+
		"\u0661\u0005\u0004\u0000\u0000\u0661\u0663\u0003\u00c2a\u0000\u0662\u0660"+
		"\u0001\u0000\u0000\u0000\u0663\u0666\u0001\u0000\u0000\u0000\u0664\u0662"+
		"\u0001\u0000\u0000\u0000\u0664\u0665\u0001\u0000\u0000\u0000\u0665\u0668"+
		"\u0001\u0000\u0000\u0000\u0666\u0664\u0001\u0000\u0000\u0000\u0667\u065d"+
		"\u0001\u0000\u0000\u0000\u0667\u0668\u0001\u0000\u0000\u0000\u0668a\u0001"+
		"\u0000\u0000\u0000\u0669\u066a\u0007\u000b\u0000\u0000\u066ac\u0001\u0000"+
		"\u0000\u0000\u066b\u066f\u0003|>\u0000\u066c\u066e\u0003f3\u0000\u066d"+
		"\u066c\u0001\u0000\u0000\u0000\u066e\u0671\u0001\u0000\u0000\u0000\u066f"+
		"\u066d\u0001\u0000\u0000\u0000\u066f\u0670\u0001\u0000\u0000\u0000\u0670"+
		"e\u0001\u0000\u0000\u0000\u0671\u066f\u0001\u0000\u0000\u0000\u0672\u0673"+
		"\u0003h4\u0000\u0673\u0674\u00055\u0000\u0000\u0674\u0676\u0003|>\u0000"+
		"\u0675\u0677\u0003j5\u0000\u0676\u0675\u0001\u0000\u0000\u0000\u0676\u0677"+
		"\u0001\u0000\u0000\u0000\u0677\u067e\u0001\u0000\u0000\u0000\u0678\u0679"+
		"\u0005=\u0000\u0000\u0679\u067a\u0003h4\u0000\u067a\u067b\u00055\u0000"+
		"\u0000\u067b\u067c\u0003|>\u0000\u067c\u067e\u0001\u0000\u0000\u0000\u067d"+
		"\u0672\u0001\u0000\u0000\u0000\u067d\u0678\u0001\u0000\u0000\u0000\u067e"+
		"g\u0001\u0000\u0000\u0000\u067f\u0681\u00058\u0000\u0000\u0680\u067f\u0001"+
		"\u0000\u0000\u0000\u0680\u0681\u0001\u0000\u0000\u0000\u0681\u0696\u0001"+
		"\u0000\u0000\u0000\u0682\u0696\u00056\u0000\u0000\u0683\u0685\u00059\u0000"+
		"\u0000\u0684\u0686\u00057\u0000\u0000\u0685\u0684\u0001\u0000\u0000\u0000"+
		"\u0685\u0686\u0001\u0000\u0000\u0000\u0686\u0696\u0001\u0000\u0000\u0000"+
		"\u0687\u0688\u00059\u0000\u0000\u0688\u0696\u0005:\u0000\u0000\u0689\u068b"+
		"\u0005;\u0000\u0000\u068a\u068c\u00057\u0000\u0000\u068b\u068a\u0001\u0000"+
		"\u0000\u0000\u068b\u068c\u0001\u0000\u0000\u0000\u068c\u0696\u0001\u0000"+
		"\u0000\u0000\u068d\u068f\u0005<\u0000\u0000\u068e\u0690\u00057\u0000\u0000"+
		"\u068f\u068e\u0001\u0000\u0000\u0000\u068f\u0690\u0001\u0000\u0000\u0000"+
		"\u0690\u0696\u0001\u0000\u0000\u0000\u0691\u0693\u00059\u0000\u0000\u0692"+
		"\u0691\u0001\u0000\u0000\u0000\u0692\u0693\u0001\u0000\u0000\u0000\u0693"+
		"\u0694\u0001\u0000\u0000\u0000\u0694\u0696\u0005\u00ee\u0000\u0000\u0695"+
		"\u0680\u0001\u0000\u0000\u0000\u0695\u0682\u0001\u0000\u0000\u0000\u0695"+
		"\u0683\u0001\u0000\u0000\u0000\u0695\u0687\u0001\u0000\u0000\u0000\u0695"+
		"\u0689\u0001\u0000\u0000\u0000\u0695\u068d\u0001\u0000\u0000\u0000\u0695"+
		"\u0692\u0001\u0000\u0000\u0000\u0696i\u0001\u0000\u0000\u0000\u0697\u0698"+
		"\u0005>\u0000\u0000\u0698\u06a6\u0003\u0090H\u0000\u0699\u069a\u0005\u00a0"+
		"\u0000\u0000\u069a\u069b\u0005\u0002\u0000\u0000\u069b\u06a0\u0003\u00c2"+
		"a\u0000\u069c\u069d\u0005\u0004\u0000\u0000\u069d\u069f\u0003\u00c2a\u0000"+
		"\u069e\u069c\u0001\u0000\u0000\u0000\u069f\u06a2\u0001\u0000\u0000\u0000"+
		"\u06a0\u069e\u0001\u0000\u0000\u0000\u06a0\u06a1\u0001\u0000\u0000\u0000"+
		"\u06a1\u06a3\u0001\u0000\u0000\u0000\u06a2\u06a0\u0001\u0000\u0000\u0000"+
		"\u06a3\u06a4\u0005\u0003\u0000\u0000\u06a4\u06a6\u0001\u0000\u0000\u0000"+
		"\u06a5\u0697\u0001\u0000\u0000\u0000\u06a5\u0699\u0001\u0000\u0000\u0000"+
		"\u06a6k\u0001\u0000\u0000\u0000\u06a7\u06a8\u0005l\u0000\u0000\u06a8\u06aa"+
		"\u0005\u0002\u0000\u0000\u06a9\u06ab\u0003n7\u0000\u06aa\u06a9\u0001\u0000"+
		"\u0000\u0000\u06aa\u06ab\u0001\u0000\u0000\u0000\u06ab\u06ac\u0001\u0000"+
		"\u0000\u0000\u06ac\u06ad\u0005\u0003\u0000\u0000\u06adm\u0001\u0000\u0000"+
		"\u0000\u06ae\u06b0\u0005\u008c\u0000\u0000\u06af\u06ae\u0001\u0000\u0000"+
		"\u0000\u06af\u06b0\u0001\u0000\u0000\u0000\u06b0\u06b1\u0001\u0000\u0000"+
		"\u0000\u06b1\u06b2\u0007\f\u0000\u0000\u06b2\u06c7\u0005\u0096\u0000\u0000"+
		"\u06b3\u06b4\u0003\u008eG\u0000\u06b4\u06b5\u0005E\u0000\u0000\u06b5\u06c7"+
		"\u0001\u0000\u0000\u0000\u06b6\u06b7\u0005\u0097\u0000\u0000\u06b7\u06b8"+
		"\u0005\u00f5\u0000\u0000\u06b8\u06b9\u0005\u0098\u0000\u0000\u06b9\u06ba"+
		"\u0005\u0099\u0000\u0000\u06ba\u06c3\u0005\u00f5\u0000\u0000\u06bb\u06c1"+
		"\u0005>\u0000\u0000\u06bc\u06c2\u0003\u00c2a\u0000\u06bd\u06be\u0003\u00c0"+
		"`\u0000\u06be\u06bf\u0005\u0002\u0000\u0000\u06bf\u06c0\u0005\u0003\u0000"+
		"\u0000\u06c0\u06c2\u0001\u0000\u0000\u0000\u06c1\u06bc\u0001\u0000\u0000"+
		"\u0000\u06c1\u06bd\u0001\u0000\u0000\u0000\u06c2\u06c4\u0001\u0000\u0000"+
		"\u0000\u06c3\u06bb\u0001\u0000\u0000\u0000\u06c3\u06c4\u0001\u0000\u0000"+
		"\u0000\u06c4\u06c7\u0001\u0000\u0000\u0000\u06c5\u06c7\u0003\u008eG\u0000"+
		"\u06c6\u06af\u0001\u0000\u0000\u0000\u06c6\u06b3\u0001\u0000\u0000\u0000"+
		"\u06c6\u06b6\u0001\u0000\u0000\u0000\u06c6\u06c5\u0001\u0000\u0000\u0000"+
		"\u06c7o\u0001\u0000\u0000\u0000\u06c8\u06c9\u0005\u0002\u0000\u0000\u06c9"+
		"\u06ca\u0003r9\u0000\u06ca\u06cb\u0005\u0003\u0000\u0000\u06cbq\u0001"+
		"\u0000\u0000\u0000\u06cc\u06d1\u0003\u00c2a\u0000\u06cd\u06ce\u0005\u0004"+
		"\u0000\u0000\u06ce\u06d0\u0003\u00c2a\u0000\u06cf\u06cd\u0001\u0000\u0000"+
		"\u0000\u06d0\u06d3\u0001\u0000\u0000\u0000\u06d1\u06cf\u0001\u0000\u0000"+
		"\u0000\u06d1\u06d2\u0001\u0000\u0000\u0000\u06d2s\u0001\u0000\u0000\u0000"+
		"\u06d3\u06d1\u0001\u0000\u0000\u0000\u06d4\u06d5\u0005\u0002\u0000\u0000"+
		"\u06d5\u06da\u0003v;\u0000\u06d6\u06d7\u0005\u0004\u0000\u0000\u06d7\u06d9"+
		"\u0003v;\u0000\u06d8\u06d6\u0001\u0000\u0000\u0000\u06d9\u06dc\u0001\u0000"+
		"\u0000\u0000\u06da\u06d8\u0001\u0000\u0000\u0000\u06da\u06db\u0001\u0000"+
		"\u0000\u0000\u06db\u06dd\u0001\u0000\u0000\u0000\u06dc\u06da\u0001\u0000"+
		"\u0000\u0000\u06dd\u06de\u0005\u0003\u0000\u0000\u06deu\u0001\u0000\u0000"+
		"\u0000\u06df\u06e1\u0003\u00c2a\u0000\u06e0\u06e2\u0007\t\u0000\u0000"+
		"\u06e1\u06e0\u0001\u0000\u0000\u0000\u06e1\u06e2\u0001\u0000\u0000\u0000"+
		"\u06e2w\u0001\u0000\u0000\u0000\u06e3\u06e4\u0005\u0002\u0000\u0000\u06e4"+
		"\u06e9\u0003z=\u0000\u06e5\u06e6\u0005\u0004\u0000\u0000\u06e6\u06e8\u0003"+
		"z=\u0000\u06e7\u06e5\u0001\u0000\u0000\u0000\u06e8\u06eb\u0001\u0000\u0000"+
		"\u0000\u06e9\u06e7\u0001\u0000\u0000\u0000\u06e9\u06ea\u0001\u0000\u0000"+
		"\u0000\u06ea\u06ec\u0001\u0000\u0000\u0000\u06eb\u06e9\u0001\u0000\u0000"+
		"\u0000\u06ec\u06ed\u0005\u0003\u0000\u0000\u06edy\u0001\u0000\u0000\u0000"+
		"\u06ee\u06f1\u0003\u00c2a\u0000\u06ef\u06f0\u0005s\u0000\u0000\u06f0\u06f2"+
		"\u0005\u00f1\u0000\u0000\u06f1\u06ef\u0001\u0000\u0000\u0000\u06f1\u06f2"+
		"\u0001\u0000\u0000\u0000\u06f2{\u0001\u0000\u0000\u0000\u06f3\u06f5\u0003"+
		"\u0086C\u0000\u06f4\u06f6\u0003l6\u0000\u06f5\u06f4\u0001\u0000\u0000"+
		"\u0000\u06f5\u06f6\u0001\u0000\u0000\u0000\u06f6\u06f7\u0001\u0000\u0000"+
		"\u0000\u06f7\u06f8\u0003\u0082A\u0000\u06f8\u070c\u0001\u0000\u0000\u0000"+
		"\u06f9\u06fa\u0005\u0002\u0000\u0000\u06fa\u06fb\u0003B!\u0000\u06fb\u06fd"+
		"\u0005\u0003\u0000\u0000\u06fc\u06fe\u0003l6\u0000\u06fd\u06fc\u0001\u0000"+
		"\u0000\u0000\u06fd\u06fe\u0001\u0000\u0000\u0000\u06fe\u06ff\u0001\u0000"+
		"\u0000\u0000\u06ff\u0700\u0003\u0082A\u0000\u0700\u070c\u0001\u0000\u0000"+
		"\u0000\u0701\u0702\u0005\u0002\u0000\u0000\u0702\u0703\u0003d2\u0000\u0703"+
		"\u0705\u0005\u0003\u0000\u0000\u0704\u0706\u0003l6\u0000\u0705\u0704\u0001"+
		"\u0000\u0000\u0000\u0705\u0706\u0001\u0000\u0000\u0000\u0706\u0707\u0001"+
		"\u0000\u0000\u0000\u0707\u0708\u0003\u0082A\u0000\u0708\u070c\u0001\u0000"+
		"\u0000\u0000\u0709\u070c\u0003~?\u0000\u070a\u070c\u0003\u0080@\u0000"+
		"\u070b\u06f3\u0001\u0000\u0000\u0000\u070b\u06f9\u0001\u0000\u0000\u0000"+
		"\u070b\u0701\u0001\u0000\u0000\u0000\u070b\u0709\u0001\u0000\u0000\u0000"+
		"\u070b\u070a\u0001\u0000\u0000\u0000\u070c}\u0001\u0000\u0000\u0000\u070d"+
		"\u070e\u0005O\u0000\u0000\u070e\u0713\u0003\u008eG\u0000\u070f\u0710\u0005"+
		"\u0004\u0000\u0000\u0710\u0712\u0003\u008eG\u0000\u0711\u070f\u0001\u0000"+
		"\u0000\u0000\u0712\u0715\u0001\u0000\u0000\u0000\u0713\u0711\u0001\u0000"+
		"\u0000\u0000\u0713\u0714\u0001\u0000\u0000\u0000\u0714\u0716\u0001\u0000"+
		"\u0000\u0000\u0715\u0713\u0001\u0000\u0000\u0000\u0716\u0717\u0003\u0082"+
		"A\u0000\u0717\u007f\u0001\u0000\u0000\u0000\u0718\u0719\u0003\u00c2a\u0000"+
		"\u0719\u0722\u0005\u0002\u0000\u0000\u071a\u071f\u0003\u008eG\u0000\u071b"+
		"\u071c\u0005\u0004\u0000\u0000\u071c\u071e\u0003\u008eG\u0000\u071d\u071b"+
		"\u0001\u0000\u0000\u0000\u071e\u0721\u0001\u0000\u0000\u0000\u071f\u071d"+
		"\u0001\u0000\u0000\u0000\u071f\u0720\u0001\u0000\u0000\u0000\u0720\u0723"+
		"\u0001\u0000\u0000\u0000\u0721\u071f\u0001\u0000\u0000\u0000\u0722\u071a"+
		"\u0001\u0000\u0000\u0000\u0722\u0723\u0001\u0000\u0000\u0000\u0723\u0724"+
		"\u0001\u0000\u0000\u0000\u0724\u0725\u0005\u0003\u0000\u0000\u0725\u0726"+
		"\u0003\u0082A\u0000\u0726\u0081\u0001\u0000\u0000\u0000\u0727\u0729\u0005"+
		"\u000f\u0000\u0000\u0728\u0727\u0001\u0000\u0000\u0000\u0728\u0729\u0001"+
		"\u0000\u0000\u0000\u0729\u072a\u0001\u0000\u0000\u0000\u072a\u072c\u0003"+
		"\u00c4b\u0000\u072b\u072d\u0003p8\u0000\u072c\u072b\u0001\u0000\u0000"+
		"\u0000\u072c\u072d\u0001\u0000\u0000\u0000\u072d\u072f\u0001\u0000\u0000"+
		"\u0000\u072e\u0728\u0001\u0000\u0000\u0000\u072e\u072f\u0001\u0000\u0000"+
		"\u0000\u072f\u0083\u0001\u0000\u0000\u0000\u0730\u0731\u0005M\u0000\u0000"+
		"\u0731\u0732\u0005Z\u0000\u0000\u0732\u0733\u0005\u00a1\u0000\u0000\u0733"+
		"\u0737\u0005\u00f1\u0000\u0000\u0734\u0735\u0005N\u0000\u0000\u0735\u0736"+
		"\u0005\u00a2\u0000\u0000\u0736\u0738\u0003.\u0017\u0000\u0737\u0734\u0001"+
		"\u0000\u0000\u0000\u0737\u0738\u0001\u0000\u0000\u0000\u0738\u0762\u0001"+
		"\u0000\u0000\u0000\u0739\u073a\u0005M\u0000\u0000\u073a\u073b\u0005Z\u0000"+
		"\u0000\u073b\u0745\u0005\u00a5\u0000\u0000\u073c\u073d\u0005\u00a6\u0000"+
		"\u0000\u073d\u073e\u0005\u00a7\u0000\u0000\u073e\u073f\u0005\u0015\u0000"+
		"\u0000\u073f\u0743\u0005\u00f1\u0000\u0000\u0740\u0741\u0005\u00ab\u0000"+
		"\u0000\u0741\u0742\u0005\u0015\u0000\u0000\u0742\u0744\u0005\u00f1\u0000"+
		"\u0000\u0743\u0740\u0001\u0000\u0000\u0000\u0743\u0744\u0001\u0000\u0000"+
		"\u0000\u0744\u0746\u0001\u0000\u0000\u0000\u0745\u073c\u0001\u0000\u0000"+
		"\u0000\u0745\u0746\u0001\u0000\u0000\u0000\u0746\u074c\u0001\u0000\u0000"+
		"\u0000\u0747\u0748\u0005\u00a8\u0000\u0000\u0748\u0749\u0005\u00a9\u0000"+
		"\u0000\u0749\u074a\u0005\u00a7\u0000\u0000\u074a\u074b\u0005\u0015\u0000"+
		"\u0000\u074b\u074d\u0005\u00f1\u0000\u0000\u074c\u0747\u0001\u0000\u0000"+
		"\u0000\u074c\u074d\u0001\u0000\u0000\u0000\u074d\u0753\u0001\u0000\u0000"+
		"\u0000\u074e\u074f\u0005q\u0000\u0000\u074f\u0750\u0005\u00aa\u0000\u0000"+
		"\u0750\u0751\u0005\u00a7\u0000\u0000\u0751\u0752\u0005\u0015\u0000\u0000"+
		"\u0752\u0754\u0005\u00f1\u0000\u0000\u0753\u074e\u0001\u0000\u0000\u0000"+
		"\u0753\u0754\u0001\u0000\u0000\u0000\u0754\u0759\u0001\u0000\u0000\u0000"+
		"\u0755\u0756\u0005\u00ac\u0000\u0000\u0756\u0757\u0005\u00a7\u0000\u0000"+
		"\u0757\u0758\u0005\u0015\u0000\u0000\u0758\u075a\u0005\u00f1\u0000\u0000"+
		"\u0759\u0755\u0001\u0000\u0000\u0000\u0759\u075a\u0001\u0000\u0000\u0000"+
		"\u075a\u075f\u0001\u0000\u0000\u0000\u075b\u075c\u0005(\u0000\u0000\u075c"+
		"\u075d\u0005\u00da\u0000\u0000\u075d\u075e\u0005\u000f\u0000\u0000\u075e"+
		"\u0760\u0005\u00f1\u0000\u0000\u075f\u075b\u0001\u0000\u0000\u0000\u075f"+
		"\u0760\u0001\u0000\u0000\u0000\u0760\u0762\u0001\u0000\u0000\u0000\u0761"+
		"\u0730\u0001\u0000\u0000\u0000\u0761\u0739\u0001\u0000\u0000\u0000\u0762"+
		"\u0085\u0001\u0000\u0000\u0000\u0763\u0764\u0003\u00c2a\u0000\u0764\u0765"+
		"\u0005\u0005\u0000\u0000\u0765\u0767\u0001\u0000\u0000\u0000\u0766\u0763"+
		"\u0001\u0000\u0000\u0000\u0766\u0767\u0001\u0000\u0000\u0000\u0767\u0768"+
		"\u0001\u0000\u0000\u0000\u0768\u0769\u0003\u00c2a\u0000\u0769\u0087\u0001"+
		"\u0000\u0000\u0000\u076a\u076b\u0003\u00c2a\u0000\u076b\u076c\u0005\u0005"+
		"\u0000\u0000\u076c\u076e\u0001\u0000\u0000\u0000\u076d\u076a\u0001\u0000"+
		"\u0000\u0000\u076d\u076e\u0001\u0000\u0000\u0000\u076e\u076f\u0001\u0000"+
		"\u0000\u0000\u076f\u0770\u0003\u00c2a\u0000\u0770\u0089\u0001\u0000\u0000"+
		"\u0000\u0771\u0779\u0003\u008eG\u0000\u0772\u0774\u0005\u000f\u0000\u0000"+
		"\u0773\u0772\u0001\u0000\u0000\u0000\u0773\u0774\u0001\u0000\u0000\u0000"+
		"\u0774\u0777\u0001\u0000\u0000\u0000\u0775\u0778\u0003\u00c2a\u0000\u0776"+
		"\u0778\u0003p8\u0000\u0777\u0775\u0001\u0000\u0000\u0000\u0777\u0776\u0001"+
		"\u0000\u0000\u0000\u0778\u077a\u0001\u0000\u0000\u0000\u0779\u0773\u0001"+
		"\u0000\u0000\u0000\u0779\u077a\u0001\u0000\u0000\u0000\u077a\u008b\u0001"+
		"\u0000\u0000\u0000\u077b\u0780\u0003\u008aE\u0000\u077c\u077d\u0005\u0004"+
		"\u0000\u0000\u077d\u077f\u0003\u008aE\u0000\u077e\u077c\u0001\u0000\u0000"+
		"\u0000\u077f\u0782\u0001\u0000\u0000\u0000\u0780\u077e\u0001\u0000\u0000"+
		"\u0000\u0780\u0781\u0001\u0000\u0000\u0000\u0781\u008d\u0001\u0000\u0000"+
		"\u0000\u0782\u0780\u0001\u0000\u0000\u0000\u0783\u0784\u0003\u0090H\u0000"+
		"\u0784\u008f\u0001\u0000\u0000\u0000\u0785\u0786\u0006H\uffff\uffff\u0000"+
		"\u0786\u0787\u0005!\u0000\u0000\u0787\u0792\u0003\u0090H\u0005\u0788\u0789"+
		"\u0005#\u0000\u0000\u0789\u078a\u0005\u0002\u0000\u0000\u078a\u078b\u0003"+
		"\u001a\r\u0000\u078b\u078c\u0005\u0003\u0000\u0000\u078c\u0792\u0001\u0000"+
		"\u0000\u0000\u078d\u078f\u0003\u0094J\u0000\u078e\u0790\u0003\u0092I\u0000"+
		"\u078f\u078e\u0001\u0000\u0000\u0000\u078f\u0790\u0001\u0000\u0000\u0000"+
		"\u0790\u0792\u0001\u0000\u0000\u0000\u0791\u0785\u0001\u0000\u0000\u0000"+
		"\u0791\u0788\u0001\u0000\u0000\u0000\u0791\u078d\u0001\u0000\u0000\u0000"+
		"\u0792\u079b\u0001\u0000\u0000\u0000\u0793\u0794\n\u0002\u0000\u0000\u0794"+
		"\u0795\u0005\u001f\u0000\u0000\u0795\u079a\u0003\u0090H\u0003\u0796\u0797"+
		"\n\u0001\u0000\u0000\u0797\u0798\u0005\u001e\u0000\u0000\u0798\u079a\u0003"+
		"\u0090H\u0002\u0799\u0793\u0001\u0000\u0000\u0000\u0799\u0796\u0001\u0000"+
		"\u0000\u0000\u079a\u079d\u0001\u0000\u0000\u0000\u079b\u0799\u0001\u0000"+
		"\u0000\u0000\u079b\u079c\u0001\u0000\u0000\u0000\u079c\u0091\u0001\u0000"+
		"\u0000\u0000\u079d\u079b\u0001\u0000\u0000\u0000\u079e\u07a0\u0005!\u0000"+
		"\u0000\u079f\u079e\u0001\u0000\u0000\u0000\u079f\u07a0\u0001\u0000\u0000"+
		"\u0000\u07a0\u07a1\u0001\u0000\u0000\u0000\u07a1\u07a2\u0005$\u0000\u0000"+
		"\u07a2\u07a3\u0003\u0094J\u0000\u07a3\u07a4\u0005\u001f\u0000\u0000\u07a4"+
		"\u07a5\u0003\u0094J\u0000\u07a5\u07cf\u0001\u0000\u0000\u0000\u07a6\u07a8"+
		"\u0005!\u0000\u0000\u07a7\u07a6\u0001\u0000\u0000\u0000\u07a7\u07a8\u0001"+
		"\u0000\u0000\u0000\u07a8\u07a9\u0001\u0000\u0000\u0000\u07a9\u07aa\u0005"+
		" \u0000\u0000\u07aa\u07ab\u0005\u0002\u0000\u0000\u07ab\u07b0\u0003\u008e"+
		"G\u0000\u07ac\u07ad\u0005\u0004\u0000\u0000\u07ad\u07af\u0003\u008eG\u0000"+
		"\u07ae\u07ac\u0001\u0000\u0000\u0000\u07af\u07b2\u0001\u0000\u0000\u0000"+
		"\u07b0\u07ae\u0001\u0000\u0000\u0000\u07b0\u07b1\u0001\u0000\u0000\u0000"+
		"\u07b1\u07b3\u0001\u0000\u0000\u0000\u07b2\u07b0\u0001\u0000\u0000\u0000"+
		"\u07b3\u07b4\u0005\u0003\u0000\u0000\u07b4\u07cf\u0001\u0000\u0000\u0000"+
		"\u07b5\u07b7\u0005!\u0000\u0000\u07b6\u07b5\u0001\u0000\u0000\u0000\u07b6"+
		"\u07b7\u0001\u0000\u0000\u0000\u07b7\u07b8\u0001\u0000\u0000\u0000\u07b8"+
		"\u07b9\u0005 \u0000\u0000\u07b9\u07ba\u0005\u0002\u0000\u0000\u07ba\u07bb"+
		"\u0003\u001a\r\u0000\u07bb\u07bc\u0005\u0003\u0000\u0000\u07bc\u07cf\u0001"+
		"\u0000\u0000\u0000\u07bd\u07bf\u0005!\u0000\u0000\u07be\u07bd\u0001\u0000"+
		"\u0000\u0000\u07be\u07bf\u0001\u0000\u0000\u0000\u07bf\u07c0\u0001\u0000"+
		"\u0000\u0000\u07c0\u07c1\u0007\r\u0000\u0000\u07c1\u07cf\u0003\u0094J"+
		"\u0000\u07c2\u07c4\u0005\'\u0000\u0000\u07c3\u07c5\u0005!\u0000\u0000"+
		"\u07c4\u07c3\u0001\u0000\u0000\u0000\u07c4\u07c5\u0001\u0000\u0000\u0000"+
		"\u07c5\u07c6\u0001\u0000\u0000\u0000\u07c6\u07cf\u0005(\u0000\u0000\u07c7"+
		"\u07c9\u0005\'\u0000\u0000\u07c8\u07ca\u0005!\u0000\u0000\u07c9\u07c8"+
		"\u0001\u0000\u0000\u0000\u07c9\u07ca\u0001\u0000\u0000\u0000\u07ca\u07cb"+
		"\u0001\u0000\u0000\u0000\u07cb\u07cc\u0005\u0012\u0000\u0000\u07cc\u07cd"+
		"\u0005\r\u0000\u0000\u07cd\u07cf\u0003\u0094J\u0000\u07ce\u079f\u0001"+
		"\u0000\u0000\u0000\u07ce\u07a7\u0001\u0000\u0000\u0000\u07ce\u07b6\u0001"+
		"\u0000\u0000\u0000\u07ce\u07be\u0001\u0000\u0000\u0000\u07ce\u07c2\u0001"+
		"\u0000\u0000\u0000\u07ce\u07c7\u0001\u0000\u0000\u0000\u07cf\u0093\u0001"+
		"\u0000\u0000\u0000\u07d0\u07d1\u0006J\uffff\uffff\u0000\u07d1\u07d5\u0003"+
		"\u0096K\u0000\u07d2\u07d3\u0007\u000e\u0000\u0000\u07d3\u07d5\u0003\u0094"+
		"J\u0007\u07d4\u07d0\u0001\u0000\u0000\u0000\u07d4\u07d2\u0001\u0000\u0000"+
		"\u0000\u07d5\u07eb\u0001\u0000\u0000\u0000\u07d6\u07d7\n\u0006\u0000\u0000"+
		"\u07d7\u07d8\u0007\u000f\u0000\u0000\u07d8\u07ea\u0003\u0094J\u0007\u07d9"+
		"\u07da\n\u0005\u0000\u0000\u07da\u07db\u0007\u0010\u0000\u0000\u07db\u07ea"+
		"\u0003\u0094J\u0006\u07dc\u07dd\n\u0004\u0000\u0000\u07dd\u07de\u0005"+
		"\u0092\u0000\u0000\u07de\u07ea\u0003\u0094J\u0005\u07df\u07e0\n\u0003"+
		"\u0000\u0000\u07e0\u07e1\u0005\u0095\u0000\u0000\u07e1\u07ea\u0003\u0094"+
		"J\u0004\u07e2\u07e3\n\u0002\u0000\u0000\u07e3\u07e4\u0005\u0093\u0000"+
		"\u0000\u07e4\u07ea\u0003\u0094J\u0003\u07e5\u07e6\n\u0001\u0000\u0000"+
		"\u07e6\u07e7\u0003\u009aM\u0000\u07e7\u07e8\u0003\u0094J\u0002\u07e8\u07ea"+
		"\u0001\u0000\u0000\u0000\u07e9\u07d6\u0001\u0000\u0000\u0000\u07e9\u07d9"+
		"\u0001\u0000\u0000\u0000\u07e9\u07dc\u0001\u0000\u0000\u0000\u07e9\u07df"+
		"\u0001\u0000\u0000\u0000\u07e9\u07e2\u0001\u0000\u0000\u0000\u07e9\u07e5"+
		"\u0001\u0000\u0000\u0000\u07ea\u07ed\u0001\u0000\u0000\u0000\u07eb\u07e9"+
		"\u0001\u0000\u0000\u0000\u07eb\u07ec\u0001\u0000\u0000\u0000\u07ec\u0095"+
		"\u0001\u0000\u0000\u0000\u07ed\u07eb\u0001\u0000\u0000\u0000\u07ee\u07ef"+
		"\u0006K\uffff\uffff\u0000\u07ef\u07f1\u00050\u0000\u0000\u07f0\u07f2\u0003"+
		"\u00b4Z\u0000\u07f1\u07f0\u0001\u0000\u0000\u0000\u07f2\u07f3\u0001\u0000"+
		"\u0000\u0000\u07f3\u07f1\u0001\u0000\u0000\u0000\u07f3\u07f4\u0001\u0000"+
		"\u0000\u0000\u07f4\u07f7\u0001\u0000\u0000\u0000\u07f5\u07f6\u00053\u0000"+
		"\u0000\u07f6\u07f8\u0003\u008eG\u0000\u07f7\u07f5\u0001\u0000\u0000\u0000"+
		"\u07f7\u07f8\u0001\u0000\u0000\u0000\u07f8\u07f9\u0001\u0000\u0000\u0000"+
		"\u07f9\u07fa\u00054\u0000\u0000\u07fa\u0880\u0001\u0000\u0000\u0000\u07fb"+
		"\u07fc\u00050\u0000\u0000\u07fc\u07fe\u0003\u008eG\u0000\u07fd\u07ff\u0003"+
		"\u00b4Z\u0000\u07fe\u07fd\u0001\u0000\u0000\u0000\u07ff\u0800\u0001\u0000"+
		"\u0000\u0000\u0800\u07fe\u0001\u0000\u0000\u0000\u0800\u0801\u0001\u0000"+
		"\u0000\u0000\u0801\u0804\u0001\u0000\u0000\u0000\u0802\u0803\u00053\u0000"+
		"\u0000\u0803\u0805\u0003\u008eG\u0000\u0804\u0802\u0001\u0000\u0000\u0000"+
		"\u0804\u0805\u0001\u0000\u0000\u0000\u0805\u0806\u0001\u0000\u0000\u0000"+
		"\u0806\u0807\u00054\u0000\u0000\u0807\u0880\u0001\u0000\u0000\u0000\u0808"+
		"\u0809\u0005^\u0000\u0000\u0809\u080a\u0005\u0002\u0000\u0000\u080a\u080b"+
		"\u0003\u008eG\u0000\u080b\u080c\u0005\u000f\u0000\u0000\u080c\u080d\u0003"+
		"\u00aaU\u0000\u080d\u080e\u0005\u0003\u0000\u0000\u080e\u0880\u0001\u0000"+
		"\u0000\u0000\u080f\u0810\u0005r\u0000\u0000\u0810\u0819\u0005\u0002\u0000"+
		"\u0000\u0811\u0816\u0003\u008aE\u0000\u0812\u0813\u0005\u0004\u0000\u0000"+
		"\u0813\u0815\u0003\u008aE\u0000\u0814\u0812\u0001\u0000\u0000\u0000\u0815"+
		"\u0818\u0001\u0000\u0000\u0000\u0816\u0814\u0001\u0000\u0000\u0000\u0816"+
		"\u0817\u0001\u0000\u0000\u0000\u0817\u081a\u0001\u0000\u0000\u0000\u0818"+
		"\u0816\u0001\u0000\u0000\u0000\u0819\u0811\u0001\u0000\u0000\u0000\u0819"+
		"\u081a\u0001\u0000\u0000\u0000\u081a\u081b\u0001\u0000\u0000\u0000\u081b"+
		"\u0880\u0005\u0003\u0000\u0000\u081c\u081d\u0005J\u0000\u0000\u081d\u081e"+
		"\u0005\u0002\u0000\u0000\u081e\u0821\u0003\u008eG\u0000\u081f\u0820\u0005"+
		"|\u0000\u0000\u0820\u0822\u0005+\u0000\u0000\u0821\u081f\u0001\u0000\u0000"+
		"\u0000\u0821\u0822\u0001\u0000\u0000\u0000\u0822\u0823\u0001\u0000\u0000"+
		"\u0000\u0823\u0824\u0005\u0003\u0000\u0000\u0824\u0880\u0001\u0000\u0000"+
		"\u0000\u0825\u0826\u0005L\u0000\u0000\u0826\u0827\u0005\u0002\u0000\u0000"+
		"\u0827\u082a\u0003\u008eG\u0000\u0828\u0829\u0005|\u0000\u0000\u0829\u082b"+
		"\u0005+\u0000\u0000\u082a\u0828\u0001\u0000\u0000\u0000\u082a\u082b\u0001"+
		"\u0000\u0000\u0000\u082b\u082c\u0001\u0000\u0000\u0000\u082c\u082d\u0005"+
		"\u0003\u0000\u0000\u082d\u0880\u0001\u0000\u0000\u0000\u082e\u082f\u0005"+
		"\u0081\u0000\u0000\u082f\u0830\u0005\u0002\u0000\u0000\u0830\u0831\u0003"+
		"\u0094J\u0000\u0831\u0832\u0005 \u0000\u0000\u0832\u0833\u0003\u0094J"+
		"\u0000\u0833\u0834\u0005\u0003\u0000\u0000\u0834\u0880\u0001\u0000\u0000"+
		"\u0000\u0835\u0880\u0003\u0098L\u0000\u0836\u0880\u0005\u008d\u0000\u0000"+
		"\u0837\u0838\u0003\u00c0`\u0000\u0838\u0839\u0005\u0005\u0000\u0000\u0839"+
		"\u083a\u0005\u008d\u0000\u0000\u083a\u0880\u0001\u0000\u0000\u0000\u083b"+
		"\u083c\u0005\u0002\u0000\u0000\u083c\u083f\u0003\u008aE\u0000\u083d\u083e"+
		"\u0005\u0004\u0000\u0000\u083e\u0840\u0003\u008aE\u0000\u083f\u083d\u0001"+
		"\u0000\u0000\u0000\u0840\u0841\u0001\u0000\u0000\u0000\u0841\u083f\u0001"+
		"\u0000\u0000\u0000\u0841\u0842\u0001\u0000\u0000\u0000\u0842\u0843\u0001"+
		"\u0000\u0000\u0000\u0843\u0844\u0005\u0003\u0000\u0000\u0844\u0880\u0001"+
		"\u0000\u0000\u0000\u0845\u0846\u0005\u0002\u0000\u0000\u0846\u0847\u0003"+
		"\u001a\r\u0000\u0847\u0848\u0005\u0003\u0000\u0000\u0848\u0880\u0001\u0000"+
		"\u0000\u0000\u0849\u084a\u0003\u00c0`\u0000\u084a\u0856\u0005\u0002\u0000"+
		"\u0000\u084b\u084d\u0003b1\u0000\u084c\u084b\u0001\u0000\u0000\u0000\u084c"+
		"\u084d\u0001\u0000\u0000\u0000\u084d\u084e\u0001\u0000\u0000\u0000\u084e"+
		"\u0853\u0003\u008eG\u0000\u084f\u0850\u0005\u0004\u0000\u0000\u0850\u0852"+
		"\u0003\u008eG\u0000\u0851\u084f\u0001\u0000\u0000\u0000\u0852\u0855\u0001"+
		"\u0000\u0000\u0000\u0853\u0851\u0001\u0000\u0000\u0000\u0853\u0854\u0001"+
		"\u0000\u0000\u0000\u0854\u0857\u0001\u0000\u0000\u0000\u0855\u0853\u0001"+
		"\u0000\u0000\u0000\u0856\u084c\u0001\u0000\u0000\u0000\u0856\u0857\u0001"+
		"\u0000\u0000\u0000\u0857\u0858\u0001\u0000\u0000\u0000\u0858\u085b\u0005"+
		"\u0003\u0000\u0000\u0859\u085a\u0005B\u0000\u0000\u085a\u085c\u0003\u00ba"+
		"]\u0000\u085b\u0859\u0001\u0000\u0000\u0000\u085b\u085c\u0001\u0000\u0000"+
		"\u0000\u085c\u0880\u0001\u0000\u0000\u0000\u085d\u085e\u0003\u00c0`\u0000"+
		"\u085e\u085f\u0005\u0002\u0000\u0000\u085f\u0860\u0007\u0011\u0000\u0000"+
		"\u0860\u0861\u0003\u008eG\u0000\u0861\u0862\u0005\r\u0000\u0000\u0862"+
		"\u0863\u0003\u008eG\u0000\u0863\u0864\u0005\u0003\u0000\u0000\u0864\u0880"+
		"\u0001\u0000\u0000\u0000\u0865\u0866\u0005\u00f9\u0000\u0000\u0866\u0867"+
		"\u0005\b\u0000\u0000\u0867\u0880\u0003\u008eG\u0000\u0868\u0869\u0005"+
		"\u0002\u0000\u0000\u0869\u086c\u0005\u00f9\u0000\u0000\u086a\u086b\u0005"+
		"\u0004\u0000\u0000\u086b\u086d\u0005\u00f9\u0000\u0000\u086c\u086a\u0001"+
		"\u0000\u0000\u0000\u086d\u086e\u0001\u0000\u0000\u0000\u086e\u086c\u0001"+
		"\u0000\u0000\u0000\u086e\u086f\u0001\u0000\u0000\u0000\u086f\u0870\u0001"+
		"\u0000\u0000\u0000\u0870\u0871\u0005\u0003\u0000\u0000\u0871\u0872\u0005"+
		"\b\u0000\u0000\u0872\u0880\u0003\u008eG\u0000\u0873\u0880\u0003\u00c2"+
		"a\u0000\u0874\u0875\u0005\u0002\u0000\u0000\u0875\u0876\u0003\u008eG\u0000"+
		"\u0876\u0877\u0005\u0003\u0000\u0000\u0877\u0880\u0001\u0000\u0000\u0000"+
		"\u0878\u0879\u0005\u0082\u0000\u0000\u0879\u087a\u0005\u0002\u0000\u0000"+
		"\u087a\u087b\u0003\u00c2a\u0000\u087b\u087c\u0005\r\u0000\u0000\u087c"+
		"\u087d\u0003\u0094J\u0000\u087d\u087e\u0005\u0003\u0000\u0000\u087e\u0880"+
		"\u0001\u0000\u0000\u0000\u087f\u07ee\u0001\u0000\u0000\u0000\u087f\u07fb"+
		"\u0001\u0000\u0000\u0000\u087f\u0808\u0001\u0000\u0000\u0000\u087f\u080f"+
		"\u0001\u0000\u0000\u0000\u087f\u081c\u0001\u0000\u0000\u0000\u087f\u0825"+
		"\u0001\u0000\u0000\u0000\u087f\u082e\u0001\u0000\u0000\u0000\u087f\u0835"+
		"\u0001\u0000\u0000\u0000\u087f\u0836\u0001\u0000\u0000\u0000\u087f\u0837"+
		"\u0001\u0000\u0000\u0000\u087f\u083b\u0001\u0000\u0000\u0000\u087f\u0845"+
		"\u0001\u0000\u0000\u0000\u087f\u0849\u0001\u0000\u0000\u0000\u087f\u085d"+
		"\u0001\u0000\u0000\u0000\u087f\u0865\u0001\u0000\u0000\u0000\u087f\u0868"+
		"\u0001\u0000\u0000\u0000\u087f\u0873\u0001\u0000\u0000\u0000\u087f\u0874"+
		"\u0001\u0000\u0000\u0000\u087f\u0878\u0001\u0000\u0000\u0000\u0880\u088b"+
		"\u0001\u0000\u0000\u0000\u0881\u0882\n\u0005\u0000\u0000\u0882\u0883\u0005"+
		"\t\u0000\u0000\u0883\u0884\u0003\u0094J\u0000\u0884\u0885\u0005\n\u0000"+
		"\u0000\u0885\u088a\u0001\u0000\u0000\u0000\u0886\u0887\n\u0003\u0000\u0000"+
		"\u0887\u0888\u0005\u0005\u0000\u0000\u0888\u088a\u0003\u00c2a\u0000\u0889"+
		"\u0881\u0001\u0000\u0000\u0000\u0889\u0886\u0001\u0000\u0000\u0000\u088a"+
		"\u088d\u0001\u0000\u0000\u0000\u088b\u0889\u0001\u0000\u0000\u0000\u088b"+
		"\u088c\u0001\u0000\u0000\u0000\u088c\u0097\u0001\u0000\u0000\u0000\u088d"+
		"\u088b\u0001\u0000\u0000\u0000\u088e\u089b\u0005(\u0000\u0000\u088f\u089b"+
		"\u0003\u00a2Q\u0000\u0890\u0891\u0003\u00c2a\u0000\u0891\u0892\u0005\u00f1"+
		"\u0000\u0000\u0892\u089b\u0001\u0000\u0000\u0000\u0893\u089b\u0003\u00c8"+
		"d\u0000\u0894\u089b\u0003\u00a0P\u0000\u0895\u0897\u0005\u00f1\u0000\u0000"+
		"\u0896\u0895\u0001\u0000\u0000\u0000\u0897\u0898\u0001\u0000\u0000\u0000"+
		"\u0898\u0896\u0001\u0000\u0000\u0000\u0898\u0899\u0001\u0000\u0000\u0000"+
		"\u0899\u089b\u0001\u0000\u0000\u0000\u089a\u088e\u0001\u0000\u0000\u0000"+
		"\u089a\u088f\u0001\u0000\u0000\u0000\u089a\u0890\u0001\u0000\u0000\u0000"+
		"\u089a\u0893\u0001\u0000\u0000\u0000\u089a\u0894\u0001\u0000\u0000\u0000"+
		"\u089a\u0896\u0001\u0000\u0000\u0000\u089b\u0099\u0001\u0000\u0000\u0000"+
		"\u089c\u089d\u0007\u0012\u0000\u0000\u089d\u009b\u0001\u0000\u0000\u0000"+
		"\u089e\u089f\u0007\u0013\u0000\u0000\u089f\u009d\u0001\u0000\u0000\u0000"+
		"\u08a0\u08a1\u0007\u0014\u0000\u0000\u08a1\u009f\u0001\u0000\u0000\u0000"+
		"\u08a2\u08a3\u0007\u0015\u0000\u0000\u08a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u08a4\u08a8\u0005/\u0000\u0000\u08a5\u08a7\u0003\u00a4R\u0000\u08a6\u08a5"+
		"\u0001\u0000\u0000\u0000\u08a7\u08aa\u0001\u0000\u0000\u0000\u08a8\u08a6"+
		"\u0001\u0000\u0000\u0000\u08a8\u08a9\u0001\u0000\u0000\u0000\u08a9\u00a3"+
		"\u0001\u0000\u0000\u0000\u08aa\u08a8\u0001\u0000\u0000\u0000\u08ab\u08ac"+
		"\u0003\u00a6S\u0000\u08ac\u08af\u0003\u00c2a\u0000\u08ad\u08ae\u0005k"+
		"\u0000\u0000\u08ae\u08b0\u0003\u00c2a\u0000\u08af\u08ad\u0001\u0000\u0000"+
		"\u0000\u08af\u08b0\u0001\u0000\u0000\u0000\u08b0\u00a5\u0001\u0000\u0000"+
		"\u0000\u08b1\u08b3\u0007\u0016\u0000\u0000\u08b2\u08b1\u0001\u0000\u0000"+
		"\u0000\u08b2\u08b3\u0001\u0000\u0000\u0000\u08b3\u08b4\u0001\u0000\u0000"+
		"\u0000\u08b4\u08b7\u0007\f\u0000\u0000\u08b5\u08b7\u0005\u00f1\u0000\u0000"+
		"\u08b6\u08b2\u0001\u0000\u0000\u0000\u08b6\u08b5\u0001\u0000\u0000\u0000"+
		"\u08b7\u00a7\u0001\u0000\u0000\u0000\u08b8\u08bc\u0005J\u0000\u0000\u08b9"+
		"\u08ba\u0005K\u0000\u0000\u08ba\u08bc\u0003\u00c2a\u0000\u08bb\u08b8\u0001"+
		"\u0000\u0000\u0000\u08bb\u08b9\u0001\u0000\u0000\u0000\u08bc\u00a9\u0001"+
		"\u0000\u0000\u0000\u08bd\u08be\u0005p\u0000\u0000\u08be\u08bf\u0005\u0087"+
		"\u0000\u0000\u08bf\u08c0\u0003\u00aaU\u0000\u08c0\u08c1\u0005\u0089\u0000"+
		"\u0000\u08c1\u08e0\u0001\u0000\u0000\u0000\u08c2\u08c3\u0005q\u0000\u0000"+
		"\u08c3\u08c4\u0005\u0087\u0000\u0000\u08c4\u08c5\u0003\u00aaU\u0000\u08c5"+
		"\u08c6\u0005\u0004\u0000\u0000\u08c6\u08c7\u0003\u00aaU\u0000\u08c7\u08c8"+
		"\u0005\u0089\u0000\u0000\u08c8\u08e0\u0001\u0000\u0000\u0000\u08c9\u08d0"+
		"\u0005r\u0000\u0000\u08ca\u08cc\u0005\u0087\u0000\u0000\u08cb\u08cd\u0003"+
		"\u00b0X\u0000\u08cc\u08cb\u0001\u0000\u0000\u0000\u08cc\u08cd\u0001\u0000"+
		"\u0000\u0000\u08cd\u08ce\u0001\u0000\u0000\u0000\u08ce\u08d1\u0005\u0089"+
		"\u0000\u0000\u08cf\u08d1\u0005\u0085\u0000\u0000\u08d0\u08ca\u0001\u0000"+
		"\u0000\u0000\u08d0\u08cf\u0001\u0000\u0000\u0000\u08d1\u08e0\u0001\u0000"+
		"\u0000\u0000\u08d2\u08dd\u0003\u00c2a\u0000\u08d3\u08d4\u0005\u0002\u0000"+
		"\u0000\u08d4\u08d9\u0005\u00f5\u0000\u0000\u08d5\u08d6\u0005\u0004\u0000"+
		"\u0000\u08d6\u08d8\u0005\u00f5\u0000\u0000\u08d7\u08d5\u0001\u0000\u0000"+
		"\u0000\u08d8\u08db\u0001\u0000\u0000\u0000\u08d9\u08d7\u0001\u0000\u0000"+
		"\u0000\u08d9\u08da\u0001\u0000\u0000\u0000\u08da\u08dc\u0001\u0000\u0000"+
		"\u0000\u08db\u08d9\u0001\u0000\u0000\u0000\u08dc\u08de\u0005\u0003\u0000"+
		"\u0000\u08dd\u08d3\u0001\u0000\u0000\u0000\u08dd\u08de\u0001\u0000\u0000"+
		"\u0000\u08de\u08e0\u0001\u0000\u0000\u0000\u08df\u08bd\u0001\u0000\u0000"+
		"\u0000\u08df\u08c2\u0001\u0000\u0000\u0000\u08df\u08c9\u0001\u0000\u0000"+
		"\u0000\u08df\u08d2\u0001\u0000\u0000\u0000\u08e0\u00ab\u0001\u0000\u0000"+
		"\u0000\u08e1\u08e6\u0003\u00aeW\u0000\u08e2\u08e3\u0005\u0004\u0000\u0000"+
		"\u08e3\u08e5\u0003\u00aeW\u0000\u08e4\u08e2\u0001\u0000\u0000\u0000\u08e5"+
		"\u08e8\u0001\u0000\u0000\u0000\u08e6\u08e4\u0001\u0000\u0000\u0000\u08e6"+
		"\u08e7\u0001\u0000\u0000\u0000\u08e7\u00ad\u0001\u0000\u0000\u0000\u08e8"+
		"\u08e6\u0001\u0000\u0000\u0000\u08e9\u08ea\u0003\u00c2a\u0000\u08ea\u08ed"+
		"\u0003\u00aaU\u0000\u08eb\u08ec\u0005s\u0000\u0000\u08ec\u08ee\u0005\u00f1"+
		"\u0000\u0000\u08ed\u08eb\u0001\u0000\u0000\u0000\u08ed\u08ee\u0001\u0000"+
		"\u0000\u0000\u08ee\u00af\u0001\u0000\u0000\u0000\u08ef\u08f4\u0003\u00b2"+
		"Y\u0000\u08f0\u08f1\u0005\u0004\u0000\u0000\u08f1\u08f3\u0003\u00b2Y\u0000"+
		"\u08f2\u08f0\u0001\u0000\u0000\u0000\u08f3\u08f6\u0001\u0000\u0000\u0000"+
		"\u08f4\u08f2\u0001\u0000\u0000\u0000\u08f4\u08f5\u0001\u0000\u0000\u0000"+
		"\u08f5\u00b1\u0001\u0000\u0000\u0000\u08f6\u08f4\u0001\u0000\u0000\u0000"+
		"\u08f7\u08f8\u0003\u00c2a\u0000\u08f8\u08f9\u0005\u000b\u0000\u0000\u08f9"+
		"\u08fc\u0003\u00aaU\u0000\u08fa\u08fb\u0005s\u0000\u0000\u08fb\u08fd\u0005"+
		"\u00f1\u0000\u0000\u08fc\u08fa\u0001\u0000\u0000\u0000\u08fc\u08fd\u0001"+
		"\u0000\u0000\u0000\u08fd\u00b3\u0001\u0000\u0000\u0000\u08fe\u08ff\u0005"+
		"1\u0000\u0000\u08ff\u0900\u0003\u008eG\u0000\u0900\u0901\u00052\u0000"+
		"\u0000\u0901\u0902\u0003\u008eG\u0000\u0902\u00b5\u0001\u0000\u0000\u0000"+
		"\u0903\u0904\u0005A\u0000\u0000\u0904\u0909\u0003\u00b8\\\u0000\u0905"+
		"\u0906\u0005\u0004\u0000\u0000\u0906\u0908\u0003\u00b8\\\u0000\u0907\u0905"+
		"\u0001\u0000\u0000\u0000\u0908\u090b\u0001\u0000\u0000\u0000\u0909\u0907"+
		"\u0001\u0000\u0000\u0000\u0909\u090a\u0001\u0000\u0000\u0000\u090a\u00b7"+
		"\u0001\u0000\u0000\u0000\u090b\u0909\u0001\u0000\u0000\u0000\u090c\u090d"+
		"\u0003\u00c2a\u0000\u090d\u090e\u0005\u000f\u0000\u0000\u090e\u090f\u0003"+
		"\u00ba]\u0000\u090f\u00b9\u0001\u0000\u0000\u0000\u0910\u093f\u0003\u00c2"+
		"a\u0000\u0911\u0912\u0005\u0002\u0000\u0000\u0912\u0913\u0003\u00c2a\u0000"+
		"\u0913\u0914\u0005\u0003\u0000\u0000\u0914\u093f\u0001\u0000\u0000\u0000"+
		"\u0915\u0938\u0005\u0002\u0000\u0000\u0916\u0917\u0005\u009b\u0000\u0000"+
		"\u0917\u0918\u0005\u0015\u0000\u0000\u0918\u091d\u0003\u008eG\u0000\u0919"+
		"\u091a\u0005\u0004\u0000\u0000\u091a\u091c\u0003\u008eG\u0000\u091b\u0919"+
		"\u0001\u0000\u0000\u0000\u091c\u091f\u0001\u0000\u0000\u0000\u091d\u091b"+
		"\u0001\u0000\u0000\u0000\u091d\u091e\u0001\u0000\u0000\u0000\u091e\u0939"+
		"\u0001\u0000\u0000\u0000\u091f\u091d\u0001\u0000\u0000\u0000\u0920\u0921"+
		"\u0007\u0017\u0000\u0000\u0921\u0922\u0005\u0015\u0000\u0000\u0922\u0927"+
		"\u0003\u008eG\u0000\u0923\u0924\u0005\u0004\u0000\u0000\u0924\u0926\u0003"+
		"\u008eG\u0000\u0925\u0923\u0001\u0000\u0000\u0000\u0926\u0929\u0001\u0000"+
		"\u0000\u0000\u0927\u0925\u0001\u0000\u0000\u0000\u0927\u0928\u0001\u0000"+
		"\u0000";
	private static final String _serializedATNSegment1 =
		"\u0000\u0928\u092b\u0001\u0000\u0000\u0000\u0929\u0927\u0001\u0000\u0000"+
		"\u0000\u092a\u0920\u0001\u0000\u0000\u0000\u092a\u092b\u0001\u0000\u0000"+
		"\u0000\u092b\u0936\u0001\u0000\u0000\u0000\u092c\u092d\u0007\u0018\u0000"+
		"\u0000\u092d\u092e\u0005\u0015\u0000\u0000\u092e\u0933\u0003L&\u0000\u092f"+
		"\u0930\u0005\u0004\u0000\u0000\u0930\u0932\u0003L&\u0000\u0931\u092f\u0001"+
		"\u0000\u0000\u0000\u0932\u0935\u0001\u0000\u0000\u0000\u0933\u0931\u0001"+
		"\u0000\u0000\u0000\u0933\u0934\u0001\u0000\u0000\u0000\u0934\u0937\u0001"+
		"\u0000\u0000\u0000\u0935\u0933\u0001\u0000\u0000\u0000\u0936\u092c\u0001"+
		"\u0000\u0000\u0000\u0936\u0937\u0001\u0000\u0000\u0000\u0937\u0939\u0001"+
		"\u0000\u0000\u0000\u0938\u0916\u0001\u0000\u0000\u0000\u0938\u092a\u0001"+
		"\u0000\u0000\u0000\u0939\u093b\u0001\u0000\u0000\u0000\u093a\u093c\u0003"+
		"\u00bc^\u0000\u093b\u093a\u0001\u0000\u0000\u0000\u093b\u093c\u0001\u0000"+
		"\u0000\u0000\u093c\u093d\u0001\u0000\u0000\u0000\u093d\u093f\u0005\u0003"+
		"\u0000\u0000\u093e\u0910\u0001\u0000\u0000\u0000\u093e\u0911\u0001\u0000"+
		"\u0000\u0000\u093e\u0915\u0001\u0000\u0000\u0000\u093f\u00bb\u0001\u0000"+
		"\u0000\u0000\u0940\u0941\u0005D\u0000\u0000\u0941\u0951\u0003\u00be_\u0000"+
		"\u0942\u0943\u0005E\u0000\u0000\u0943\u0951\u0003\u00be_\u0000\u0944\u0945"+
		"\u0005D\u0000\u0000\u0945\u0946\u0005$\u0000\u0000\u0946\u0947\u0003\u00be"+
		"_\u0000\u0947\u0948\u0005\u001f\u0000\u0000\u0948\u0949\u0003\u00be_\u0000"+
		"\u0949\u0951\u0001\u0000\u0000\u0000\u094a\u094b\u0005E\u0000\u0000\u094b"+
		"\u094c\u0005$\u0000\u0000\u094c\u094d\u0003\u00be_\u0000\u094d\u094e\u0005"+
		"\u001f\u0000\u0000\u094e\u094f\u0003\u00be_\u0000\u094f\u0951\u0001\u0000"+
		"\u0000\u0000\u0950\u0940\u0001\u0000\u0000\u0000\u0950\u0942\u0001\u0000"+
		"\u0000\u0000\u0950\u0944\u0001\u0000\u0000\u0000\u0950\u094a\u0001\u0000"+
		"\u0000\u0000\u0951\u00bd\u0001\u0000\u0000\u0000\u0952\u0953\u0005F\u0000"+
		"\u0000\u0953\u095a\u0007\u0019\u0000\u0000\u0954\u0955\u0005I\u0000\u0000"+
		"\u0955\u095a\u0005M\u0000\u0000\u0956\u0957\u0003\u008eG\u0000\u0957\u0958"+
		"\u0007\u0019\u0000\u0000\u0958\u095a\u0001\u0000\u0000\u0000\u0959\u0952"+
		"\u0001\u0000\u0000\u0000\u0959\u0954\u0001\u0000\u0000\u0000\u0959\u0956"+
		"\u0001\u0000\u0000\u0000\u095a\u00bf\u0001\u0000\u0000\u0000\u095b\u0960"+
		"\u0003\u00c2a\u0000\u095c\u095d\u0005\u0005\u0000\u0000\u095d\u095f\u0003"+
		"\u00c2a\u0000\u095e\u095c\u0001\u0000\u0000\u0000\u095f\u0962\u0001\u0000"+
		"\u0000\u0000\u0960\u095e\u0001\u0000\u0000\u0000\u0960\u0961\u0001\u0000"+
		"\u0000\u0000\u0961\u00c1\u0001\u0000\u0000\u0000\u0962\u0960\u0001\u0000"+
		"\u0000\u0000\u0963\u0973\u0003\u00c4b\u0000\u0964\u0973\u0005\u00ee\u0000"+
		"\u0000\u0965\u0973\u0005<\u0000\u0000\u0966\u0973\u00058\u0000\u0000\u0967"+
		"\u0973\u00059\u0000\u0000\u0968\u0973\u0005:\u0000\u0000\u0969\u0973\u0005"+
		";\u0000\u0000\u096a\u0973\u0005=\u0000\u0000\u096b\u0973\u00055\u0000"+
		"\u0000\u096c\u0973\u00056\u0000\u0000\u096d\u0973\u0005>\u0000\u0000\u096e"+
		"\u0973\u0005g\u0000\u0000\u096f\u0973\u0005j\u0000\u0000\u0970\u0973\u0005"+
		"h\u0000\u0000\u0971\u0973\u0005i\u0000\u0000\u0972\u0963\u0001\u0000\u0000"+
		"\u0000\u0972\u0964\u0001\u0000\u0000\u0000\u0972\u0965\u0001\u0000\u0000"+
		"\u0000\u0972\u0966\u0001\u0000\u0000\u0000\u0972\u0967\u0001\u0000\u0000"+
		"\u0000\u0972\u0968\u0001\u0000\u0000\u0000\u0972\u0969\u0001\u0000\u0000"+
		"\u0000\u0972\u096a\u0001\u0000\u0000\u0000\u0972\u096b\u0001\u0000\u0000"+
		"\u0000\u0972\u096c\u0001\u0000\u0000\u0000\u0972\u096d\u0001\u0000\u0000"+
		"\u0000\u0972\u096e\u0001\u0000\u0000\u0000\u0972\u096f\u0001\u0000\u0000"+
		"\u0000\u0972\u0970\u0001\u0000\u0000\u0000\u0972\u0971\u0001\u0000\u0000"+
		"\u0000\u0973\u00c3\u0001\u0000\u0000\u0000\u0974\u0978\u0005\u00f9\u0000"+
		"\u0000\u0975\u0978\u0003\u00c6c\u0000\u0976\u0978\u0003\u00cae\u0000\u0977"+
		"\u0974\u0001\u0000\u0000\u0000\u0977\u0975\u0001\u0000\u0000\u0000\u0977"+
		"\u0976\u0001\u0000\u0000\u0000\u0978\u00c5\u0001\u0000\u0000\u0000\u0979"+
		"\u097a\u0005\u00fa\u0000\u0000\u097a\u00c7\u0001\u0000\u0000\u0000\u097b"+
		"\u097d\u0005\u008c\u0000\u0000\u097c\u097b\u0001\u0000\u0000\u0000\u097c"+
		"\u097d\u0001\u0000\u0000\u0000\u097d\u097e\u0001\u0000\u0000\u0000\u097e"+
		"\u0998\u0005\u00f6\u0000\u0000\u097f\u0981\u0005\u008c\u0000\u0000\u0980"+
		"\u097f\u0001\u0000\u0000\u0000\u0980\u0981\u0001\u0000\u0000\u0000\u0981"+
		"\u0982\u0001\u0000\u0000\u0000\u0982\u0998\u0005\u00f5\u0000\u0000\u0983"+
		"\u0985\u0005\u008c\u0000\u0000\u0984\u0983\u0001\u0000\u0000\u0000\u0984"+
		"\u0985\u0001\u0000\u0000\u0000\u0985\u0986\u0001\u0000\u0000\u0000\u0986"+
		"\u0998\u0005\u00f2\u0000\u0000\u0987\u0989\u0005\u008c\u0000\u0000\u0988"+
		"\u0987\u0001\u0000\u0000\u0000\u0988\u0989\u0001\u0000\u0000\u0000\u0989"+
		"\u098a\u0001\u0000\u0000\u0000\u098a\u0998\u0005\u00f3\u0000\u0000\u098b"+
		"\u098d\u0005\u008c\u0000\u0000\u098c\u098b\u0001\u0000\u0000\u0000\u098c"+
		"\u098d\u0001\u0000\u0000\u0000\u098d\u098e\u0001\u0000\u0000\u0000\u098e"+
		"\u0998\u0005\u00f4\u0000\u0000\u098f\u0991\u0005\u008c\u0000\u0000\u0990"+
		"\u098f\u0001\u0000\u0000\u0000\u0990\u0991\u0001\u0000\u0000\u0000\u0991"+
		"\u0992\u0001\u0000\u0000\u0000\u0992\u0998\u0005\u00f7\u0000\u0000\u0993"+
		"\u0995\u0005\u008c\u0000\u0000\u0994\u0993\u0001\u0000\u0000\u0000\u0994"+
		"\u0995\u0001\u0000\u0000\u0000\u0995\u0996\u0001\u0000\u0000\u0000\u0996"+
		"\u0998\u0005\u00f8\u0000\u0000\u0997\u097c\u0001\u0000\u0000\u0000\u0997"+
		"\u0980\u0001\u0000\u0000\u0000\u0997\u0984\u0001\u0000\u0000\u0000\u0997"+
		"\u0988\u0001\u0000\u0000\u0000\u0997\u098c\u0001\u0000\u0000\u0000\u0997"+
		"\u0990\u0001\u0000\u0000\u0000\u0997\u0994\u0001\u0000\u0000\u0000\u0998"+
		"\u00c9\u0001\u0000\u0000\u0000\u0999\u099a\u0007\u001a\u0000\u0000\u099a"+
		"\u00cb\u0001\u0000\u0000\u0000\u0145\u00d1\u00ef\u00f4\u00f7\u00fc\u0109"+
		"\u010d\u0114\u0122\u0124\u0128\u012b\u0132\u0143\u0145\u0149\u014c\u0153"+
		"\u0159\u015f\u0167\u0187\u018f\u0193\u0198\u019e\u01a6\u01ac\u01b9\u01be"+
		"\u01c7\u01cc\u01dc\u01e3\u01e7\u01ef\u01f6\u01fd\u020c\u0210\u0216\u021c"+
		"\u021f\u0222\u0228\u022c\u0230\u0235\u0239\u0241\u0244\u024d\u0252\u0258"+
		"\u025f\u0262\u0268\u0273\u0276\u027a\u027f\u0284\u028b\u028e\u0291\u0298"+
		"\u029d\u02a2\u02a5\u02ae\u02b6\u02bc\u02c0\u02c4\u02c8\u02ca\u02d3\u02d9"+
		"\u02de\u02e1\u02e5\u02e8\u02f2\u02f5\u02f9\u02fe\u0301\u0307\u030f\u0314"+
		"\u031a\u0320\u032b\u0333\u033a\u0342\u0345\u034d\u0351\u0358\u03cc\u03d4"+
		"\u03dc\u03e5\u03f1\u03f5\u03f8\u03fe\u0408\u0414\u0419\u041f\u042b\u042d"+
		"\u0432\u0436\u043b\u0440\u0443\u0448\u044c\u0451\u0453\u0457\u0460\u0468"+
		"\u046f\u0476\u047f\u0484\u0493\u049a\u049d\u04a4\u04a8\u04ae\u04b6\u04c1"+
		"\u04cc\u04d3\u04d9\u04df\u04e8\u04ea\u04f3\u04f6\u04ff\u0502\u050b\u050e"+
		"\u0517\u051a\u051d\u0522\u0524\u0527\u0533\u053a\u0541\u0544\u0546\u0551"+
		"\u0555\u0559\u0565\u0568\u056c\u0576\u057a\u057c\u057f\u0583\u0588\u058e"+
		"\u0592\u059a\u059d\u059f\u05a4\u05a9\u05ac\u05b0\u05b3\u05b5\u05ba\u05bf"+
		"\u05cc\u05d1\u05d9\u05df\u05e3\u05ec\u05fb\u0600\u060c\u0611\u0619\u061c"+
		"\u0620\u062e\u063b\u0640\u0644\u0647\u064c\u0655\u0658\u065d\u0664\u0667"+
		"\u066f\u0676\u067d\u0680\u0685\u068b\u068f\u0692\u0695\u06a0\u06a5\u06aa"+
		"\u06af\u06c1\u06c3\u06c6\u06d1\u06da\u06e1\u06e9\u06f1\u06f5\u06fd\u0705"+
		"\u070b\u0713\u071f\u0722\u0728\u072c\u072e\u0737\u0743\u0745\u074c\u0753"+
		"\u0759\u075f\u0761\u0766\u076d\u0773\u0777\u0779\u0780\u078f\u0791\u0799"+
		"\u079b\u079f\u07a7\u07b0\u07b6\u07be\u07c4\u07c9\u07ce\u07d4\u07e9\u07eb"+
		"\u07f3\u07f7\u0800\u0804\u0816\u0819\u0821\u082a\u0841\u084c\u0853\u0856"+
		"\u085b\u086e\u087f\u0889\u088b\u0898\u089a\u08a8\u08af\u08b2\u08b6\u08bb"+
		"\u08cc\u08d0\u08d9\u08dd\u08df\u08e6\u08ed\u08f4\u08fc\u0909\u091d\u0927"+
		"\u092a\u0933\u0936\u0938\u093b\u093e\u0950\u0959\u0960\u0972\u0977\u097c"+
		"\u0980\u0984\u0988\u098c\u0990\u0994\u0997";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}