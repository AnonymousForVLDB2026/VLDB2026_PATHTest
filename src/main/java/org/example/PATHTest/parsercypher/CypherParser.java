
package org.example.PATHTest.parsercypher;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CypherParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, ADD_ASSIGN=2, LE=3, GE=4, GT=5, LT=6, NOT_EQUAL=7, EQUAL=8, 
		RANGE=9, SEMI=10, DOT=11, COMMA=12, LPAREN=13, RPAREN=14, LBRACE=15, RBRACE=16, 
		LBRACK=17, RBRACK=18, SUB=19, PLUS=20, DIV=21, MOD=22, CARET=23, MULT=24, 
		ESC=25, COLON=26, STICK=27, DOLLAR=28, CALL=29, YIELD=30, FILTER=31, EXTRACT=32, 
		COUNT=33, EXISTS=34, SIZE=35, ABS=36, SUBSTRING=37, ToIntegerOrNull=38, 
		ToStringOrNull=39, ToBooleanOrNull=40, ToIntegerList=41, ToStringList=42, 
		ToBooleanList=43, NODES=44, RELATIONSHIPS=45, RANGEF=46, KEY=47, TYPE=48, 
		LABELS=49, LENGTH=50, EXISTSF=51, ROUND=52, MIN=53, MAX=54, AVG=55, SUM=56, 
		STARTNODE=57, ENDNODE=58, REDUCE=59, ELEMENTID=60, PROPERTIES=61, ISEMPTY=62, 
		REVERSE=63, COLLECT=64, PERCENTILEDISC=65, STDEVP=66, STDEV=67, ANY=68, 
		NONE=69, SINGLE=70, ALL=71, ASC=72, ASCENDING=73, BY=74, CREATE=75, DELETE=76, 
		DESC=77, DESCENDING=78, DETACH=79, LIMIT=80, MATCH=81, MERGE=82, ON=83, 
		OPTIONAL=84, ORDER=85, REMOVE=86, FOREACH=87, RETURN=88, SET=89, SKIP_W=90, 
		WHERE=91, WITH=92, UNION=93, UNWIND=94, AND=95, AS=96, CONTAINS=97, DISTINCT=98, 
		ENDS=99, IN=100, IS=101, NOT=102, OR=103, STARTS=104, XOR=105, FALSE=106, 
		TRUE=107, NULL_W=108, CONSTRAINT=109, DO=110, FOR=111, REQUIRE=112, UNIQUE=113, 
		CASE=114, WHEN=115, THEN=116, ELSE=117, END=118, MANDATORY=119, SCALAR=120, 
		OF=121, ADD=122, DROP=123, ID=124, ESC_LITERAL=125, CHAR_LITERAL=126, 
		STRING_LITERAL=127, DIGIT=128, FLOAT=129, WS=130, COMMENT=131, LINE_COMMENT=132, 
		ERRCHAR=133, Letter=134;
	public static final int
		RULE_script = 0, RULE_query = 1, RULE_regularQuery = 2, RULE_singleQuery = 3, 
		RULE_returnSt = 4, RULE_withSt = 5, RULE_skipSt = 6, RULE_limitSt = 7, 
		RULE_projectionBody = 8, RULE_projectionItems = 9, RULE_projectionItem = 10, 
		RULE_orderItem = 11, RULE_orderSt = 12, RULE_matchSt = 13, RULE_unwindSt = 14, 
		RULE_readingStatement = 15, RULE_updatingStatement = 16, RULE_deleteSt = 17, 
		RULE_removeSt = 18, RULE_foreachSt = 19, RULE_removeItem = 20, RULE_queryCallSt = 21, 
		RULE_parenExpressionChain = 22, RULE_yieldItems = 23, RULE_yieldItem = 24, 
		RULE_mergeSt = 25, RULE_mergeAction = 26, RULE_setSt = 27, RULE_setItem = 28, 
		RULE_nodeLabels = 29, RULE_createSt = 30, RULE_patternWhere = 31, RULE_where = 32, 
		RULE_pattern = 33, RULE_expression = 34, RULE_xorExpression = 35, RULE_andExpression = 36, 
		RULE_notExpression = 37, RULE_comparisonExpression = 38, RULE_comparisonSigns = 39, 
		RULE_addSubExpression = 40, RULE_multDivExpression = 41, RULE_powerExpression = 42, 
		RULE_unaryAddSubExpression = 43, RULE_atomicExpression = 44, RULE_listExpression = 45, 
		RULE_stringExpression = 46, RULE_stringExpPrefix = 47, RULE_nullExpression = 48, 
		RULE_propertyOrLabelExpression = 49, RULE_propertyExpression = 50, RULE_patternPart = 51, 
		RULE_patternElem = 52, RULE_patternElemChain = 53, RULE_properties = 54, 
		RULE_nodePattern = 55, RULE_atom = 56, RULE_lhs = 57, RULE_relationshipPattern = 58, 
		RULE_relationDetail = 59, RULE_relationshipTypes = 60, RULE_unionSt = 61, 
		RULE_subqueryExist = 62, RULE_subqueryCount = 63, RULE_functionInvocation = 64, 
		RULE_functionname = 65, RULE_parenthesizedExpression = 66, RULE_filterWith = 67, 
		RULE_patternComprehension = 68, RULE_relationshipsChainPattern = 69, RULE_listComprehension = 70, 
		RULE_filterExpression = 71, RULE_countAll = 72, RULE_expressionChain = 73, 
		RULE_caseExpression = 74, RULE_reduceExpression = 75, RULE_parameter = 76, 
		RULE_literal = 77, RULE_rangeLit = 78, RULE_boolLit = 79, RULE_numLit = 80, 
		RULE_stringLit = 81, RULE_charLit = 82, RULE_listLit = 83, RULE_mapLit = 84, 
		RULE_mapPair = 85, RULE_name = 86, RULE_symbol = 87, RULE_reservedWord = 88;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "query", "regularQuery", "singleQuery", "returnSt", "withSt", 
			"skipSt", "limitSt", "projectionBody", "projectionItems", "projectionItem", 
			"orderItem", "orderSt", "matchSt", "unwindSt", "readingStatement", "updatingStatement", 
			"deleteSt", "removeSt", "foreachSt", "removeItem", "queryCallSt", "parenExpressionChain", 
			"yieldItems", "yieldItem", "mergeSt", "mergeAction", "setSt", "setItem", 
			"nodeLabels", "createSt", "patternWhere", "where", "pattern", "expression", 
			"xorExpression", "andExpression", "notExpression", "comparisonExpression", 
			"comparisonSigns", "addSubExpression", "multDivExpression", "powerExpression", 
			"unaryAddSubExpression", "atomicExpression", "listExpression", "stringExpression", 
			"stringExpPrefix", "nullExpression", "propertyOrLabelExpression", "propertyExpression", 
			"patternPart", "patternElem", "patternElemChain", "properties", "nodePattern", 
			"atom", "lhs", "relationshipPattern", "relationDetail", "relationshipTypes", 
			"unionSt", "subqueryExist", "subqueryCount", "functionInvocation", "functionname", 
			"parenthesizedExpression", "filterWith", "patternComprehension", "relationshipsChainPattern", 
			"listComprehension", "filterExpression", "countAll", "expressionChain", 
			"caseExpression", "reduceExpression", "parameter", "literal", "rangeLit", 
			"boolLit", "numLit", "stringLit", "charLit", "listLit", "mapLit", "mapPair", 
			"name", "symbol", "reservedWord"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+='", "'<='", "'>='", "'>'", "'<'", "'<>'", "'=='", "'..'", 
			"';'", "'.'", "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'-'", 
			"'+'", "'/'", "'%'", "'^'", "'*'", "'`'", "':'", "'|'", "'$'", "'CALL'", 
			"'YIELD'", "'FILTER'", "'EXTRACT'", "'COUNT'", "'EXISTS'", "'size'", 
			"'abs'", "'substring'", "'toIntegerOrNull'", "'toStringOrNull'", "'toBooleanOrNull'", 
			"'toIntegerList'", "'toStringList'", "'toBooleanList'", "'nodes'", "'relationships'", 
			"'range'", "'keys'", "'type'", "'labels'", "'length'", "'exists'", "'round'", 
			"'min'", "'max'", "'avg'", "'sum'", "'startNode'", "'endNode'", "'reduce'", 
			"'elementId'", "'properties'", "'isEmpty'", "'reverse'", "'collect'", 
			"'percentileDisc'", "'stDevP'", "'stDev'", "'ANY'", "'NONE'", "'SINGLE'", 
			"'ALL'", "'ASC'", "'ASCENDING'", "'BY'", "'CREATE'", "'DELETE'", "'DESC'", 
			"'DESCENDING'", "'DETACH'", "'LIMIT'", "'MATCH'", "'MERGE'", "'ON'", 
			"'OPTIONAL'", "'ORDER'", "'REMOVE'", "'FOREACH'", "'RETURN'", "'SET'", 
			"'SKIP'", "'WHERE'", "'WITH'", "'UNION'", "'UNWIND'", "'AND'", "'AS'", 
			"'CONTAINS'", "'DISTINCT'", "'ENDS'", "'IN'", "'IS'", "'NOT'", "'OR'", 
			"'STARTS'", "'XOR'", "'FALSE'", "'TRUE'", "'NULL'", "'CONSTRAINT'", "'DO'", 
			"'FOR'", "'REQUIRE'", "'UNIQUE'", "'CASE'", "'WHEN'", "'THEN'", "'ELSE'", 
			"'END'", "'MANDATORY'", "'SCALAR'", "'OF'", "'ADD'", "'DROP'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "ADD_ASSIGN", "LE", "GE", "GT", "LT", "NOT_EQUAL", "EQUAL", 
			"RANGE", "SEMI", "DOT", "COMMA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SUB", "PLUS", "DIV", "MOD", "CARET", "MULT", "ESC", 
			"COLON", "STICK", "DOLLAR", "CALL", "YIELD", "FILTER", "EXTRACT", "COUNT", 
			"EXISTS", "SIZE", "ABS", "SUBSTRING", "ToIntegerOrNull", "ToStringOrNull", 
			"ToBooleanOrNull", "ToIntegerList", "ToStringList", "ToBooleanList", 
			"NODES", "RELATIONSHIPS", "RANGEF", "KEY", "TYPE", "LABELS", "LENGTH", 
			"EXISTSF", "ROUND", "MIN", "MAX", "AVG", "SUM", "STARTNODE", "ENDNODE", 
			"REDUCE", "ELEMENTID", "PROPERTIES", "ISEMPTY", "REVERSE", "COLLECT", 
			"PERCENTILEDISC", "STDEVP", "STDEV", "ANY", "NONE", "SINGLE", "ALL", 
			"ASC", "ASCENDING", "BY", "CREATE", "DELETE", "DESC", "DESCENDING", "DETACH", 
			"LIMIT", "MATCH", "MERGE", "ON", "OPTIONAL", "ORDER", "REMOVE", "FOREACH", 
			"RETURN", "SET", "SKIP_W", "WHERE", "WITH", "UNION", "UNWIND", "AND", 
			"AS", "CONTAINS", "DISTINCT", "ENDS", "IN", "IS", "NOT", "OR", "STARTS", 
			"XOR", "FALSE", "TRUE", "NULL_W", "CONSTRAINT", "DO", "FOR", "REQUIRE", 
			"UNIQUE", "CASE", "WHEN", "THEN", "ELSE", "END", "MANDATORY", "SCALAR", 
			"OF", "ADD", "DROP", "ID", "ESC_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"DIGIT", "FLOAT", "WS", "COMMENT", "LINE_COMMENT", "ERRCHAR", "Letter"
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(178);
			query();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(179);
				match(SEMI);
				}
			}

			setState(182);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public RegularQueryContext regularQuery() {
			return getRuleContext(RegularQueryContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(184);
				regularQuery();
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(187);
			singleQuery();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(188);
				unionSt();
				}
				}
				setState(193);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SingleQueryContext extends ParserRuleContext {
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
		public List<WithStContext> withSt() {
			return getRuleContexts(WithStContext.class);
		}
		public WithStContext withSt(int i) {
			return getRuleContext(WithStContext.class,i);
		}
		public ReturnStContext returnSt() {
			return getRuleContext(ReturnStContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALL || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 678611L) != 0)) {
				{
				setState(197);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CALL:
				case MATCH:
				case OPTIONAL:
				case UNWIND:
					{
					setState(194);
					readingStatement();
					}
					break;
				case CREATE:
				case DELETE:
				case DETACH:
				case MERGE:
				case REMOVE:
				case FOREACH:
				case SET:
					{
					setState(195);
					updatingStatement();
					}
					break;
				case WITH:
					{
					setState(196);
					withSt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(202);
				returnSt();
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 8, RULE_returnSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(RETURN);
			setState(206);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 10, RULE_withSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(WITH);
			setState(209);
			projectionBody();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(210);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 12, RULE_skipSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(SKIP_W);
			setState(214);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 14, RULE_limitSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(LIMIT);
			setState(217);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 16, RULE_projectionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(219);
				match(DISTINCT);
				}
			}

			setState(222);
			projectionItems();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(223);
				orderSt();
				}
			}

			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SKIP_W) {
				{
				setState(226);
				skipSt();
				}
			}

			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(229);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 18, RULE_projectionItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				{
				setState(232);
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
			case EXISTS:
			case SIZE:
			case ABS:
			case SUBSTRING:
			case ToIntegerOrNull:
			case ToStringOrNull:
			case ToBooleanOrNull:
			case ToIntegerList:
			case ToStringList:
			case ToBooleanList:
			case NODES:
			case RELATIONSHIPS:
			case RANGEF:
			case KEY:
			case TYPE:
			case LABELS:
			case LENGTH:
			case EXISTSF:
			case ROUND:
			case MIN:
			case MAX:
			case AVG:
			case SUM:
			case STARTNODE:
			case ENDNODE:
			case REDUCE:
			case ELEMENTID:
			case PROPERTIES:
			case ISEMPTY:
			case REVERSE:
			case COLLECT:
			case PERCENTILEDISC:
			case STDEVP:
			case STDEV:
			case ANY:
			case NONE:
			case SINGLE:
			case ALL:
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
				setState(233);
				projectionItem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(236);
				match(COMMA);
				setState(237);
				projectionItem();
				}
				}
				setState(242);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 20, RULE_projectionItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			expression();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(244);
				match(AS);
				setState(245);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 22, RULE_orderItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			expression();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 99L) != 0)) {
				{
				setState(249);
				_la = _input.LA(1);
				if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 99L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 24, RULE_orderSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(ORDER);
			setState(253);
			match(BY);
			setState(254);
			orderItem();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(255);
				match(COMMA);
				setState(256);
				orderItem();
				}
				}
				setState(261);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 26, RULE_matchSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(262);
				match(OPTIONAL);
				}
			}

			setState(265);
			match(MATCH);
			setState(266);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 28, RULE_unwindSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(UNWIND);
			setState(269);
			expression();
			setState(270);
			match(AS);
			setState(271);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 30, RULE_readingStatement);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATCH:
			case OPTIONAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				matchSt();
				}
				break;
			case UNWIND:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				unwindSt();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
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

	@SuppressWarnings("CheckReturnValue")
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
		public ForeachStContext foreachSt() {
			return getRuleContext(ForeachStContext.class,0);
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
		enterRule(_localctx, 32, RULE_updatingStatement);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				createSt();
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				mergeSt();
				}
				break;
			case DELETE:
			case DETACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				deleteSt();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				setSt();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				removeSt();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				foreachSt();
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 34, RULE_deleteSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DETACH) {
				{
				setState(286);
				match(DETACH);
				}
			}

			setState(289);
			match(DELETE);
			setState(290);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 36, RULE_removeSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(REMOVE);
			setState(293);
			removeItem();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(294);
				match(COMMA);
				setState(295);
				removeItem();
				}
				}
				setState(300);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForeachStContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(CypherParser.FOREACH, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STICK() { return getToken(CypherParser.STICK, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public List<UpdatingStatementContext> updatingStatement() {
			return getRuleContexts(UpdatingStatementContext.class);
		}
		public UpdatingStatementContext updatingStatement(int i) {
			return getRuleContext(UpdatingStatementContext.class,i);
		}
		public ForeachStContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachSt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterForeachSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitForeachSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitForeachSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStContext foreachSt() throws RecognitionException {
		ForeachStContext _localctx = new ForeachStContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_foreachSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(FOREACH);
			setState(302);
			match(LPAREN);
			setState(303);
			symbol();
			setState(304);
			match(IN);
			setState(305);
			expression();
			setState(306);
			match(STICK);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 22675L) != 0)) {
				{
				{
				setState(307);
				updatingStatement();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 40, RULE_removeItem);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				symbol();
				setState(316);
				nodeLabels();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
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

	@SuppressWarnings("CheckReturnValue")
	public static class QueryCallStContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(CypherParser.CALL, 0); }
		public TerminalNode LBRACE() { return getToken(CypherParser.LBRACE, 0); }
		public SingleQueryContext singleQuery() {
			return getRuleContext(SingleQueryContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CypherParser.RBRACE, 0); }
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
		enterRule(_localctx, 42, RULE_queryCallSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(CALL);
			setState(322);
			match(LBRACE);
			setState(323);
			singleQuery();
			setState(324);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 44, RULE_parenExpressionChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(LPAREN);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 576460752303194325L) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 130027633L) != 0)) {
				{
				setState(327);
				expressionChain();
				}
			}

			setState(330);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 46, RULE_yieldItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			yieldItem();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(333);
				match(COMMA);
				setState(334);
				yieldItem();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(340);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 48, RULE_yieldItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(343);
				symbol();
				setState(344);
				match(AS);
				}
				break;
			}
			setState(348);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 50, RULE_mergeSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(MERGE);
			setState(351);
			patternPart();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON) {
				{
				{
				setState(352);
				mergeAction();
				}
				}
				setState(357);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 52, RULE_mergeAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(ON);
			setState(359);
			_la = _input.LA(1);
			if ( !(_la==CREATE || _la==MATCH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(360);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 54, RULE_setSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(SET);
			setState(363);
			setItem();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(364);
				match(COMMA);
				setState(365);
				setItem();
				}
				}
				setState(370);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 56, RULE_setItem);
		int _la;
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				propertyExpression();
				setState(372);
				match(ASSIGN);
				setState(373);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				symbol();
				setState(376);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==ADD_ASSIGN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(377);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				symbol();
				setState(380);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 58, RULE_nodeLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(384);
				match(COLON);
				setState(385);
				name();
				}
				}
				setState(388); 
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 60, RULE_createSt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(CREATE);
			setState(391);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 62, RULE_patternWhere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			pattern();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(394);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 64, RULE_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(WHERE);
			setState(398);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 66, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			patternPart();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(401);
				match(COMMA);
				setState(402);
				patternPart();
				}
				}
				setState(407);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 68, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			xorExpression();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(409);
				match(OR);
				setState(410);
				xorExpression();
				}
				}
				setState(415);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 70, RULE_xorExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			andExpression();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(417);
				match(XOR);
				setState(418);
				andExpression();
				}
				}
				setState(423);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 72, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			notExpression();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(425);
				match(AND);
				setState(426);
				notExpression();
				}
				}
				setState(431);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 74, RULE_notExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(432);
				match(NOT);
				}
			}

			setState(435);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 76, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			addSubExpression();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 506L) != 0)) {
				{
				{
				setState(438);
				comparisonSigns();
				setState(439);
				addSubExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonSignsContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(CypherParser.ASSIGN, 0); }
		public TerminalNode LE() { return getToken(CypherParser.LE, 0); }
		public TerminalNode GE() { return getToken(CypherParser.GE, 0); }
		public TerminalNode GT() { return getToken(CypherParser.GT, 0); }
		public TerminalNode LT() { return getToken(CypherParser.LT, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(CypherParser.NOT_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(CypherParser.EQUAL, 0); }
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
		enterRule(_localctx, 78, RULE_comparisonSigns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 506L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 80, RULE_addSubExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			multDivExpression();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB || _la==PLUS) {
				{
				{
				setState(449);
				_la = _input.LA(1);
				if ( !(_la==SUB || _la==PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(450);
				multDivExpression();
				}
				}
				setState(455);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 82, RULE_multDivExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			powerExpression();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 23068672L) != 0)) {
				{
				{
				setState(457);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 23068672L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(458);
				powerExpression();
				}
				}
				setState(463);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 84, RULE_powerExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			unaryAddSubExpression();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(465);
				match(CARET);
				setState(466);
				unaryAddSubExpression();
				}
				}
				setState(471);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 86, RULE_unaryAddSubExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB || _la==PLUS) {
				{
				setState(472);
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

			setState(475);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 88, RULE_atomicExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			propertyOrLabelExpression();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 157L) != 0)) {
				{
				setState(481);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTAINS:
				case ENDS:
				case STARTS:
					{
					setState(478);
					stringExpression();
					}
					break;
				case LBRACK:
				case IN:
					{
					setState(479);
					listExpression();
					}
					break;
				case IS:
					{
					setState(480);
					nullExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(485);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 90, RULE_listExpression);
		int _la;
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(IN);
				setState(487);
				propertyOrLabelExpression();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(LBRACK);
				setState(497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 576460752303194325L) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 130027633L) != 0)) {
						{
						setState(489);
						expression();
						}
					}

					setState(492);
					match(RANGE);
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 576460752303194325L) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 130027633L) != 0)) {
						{
						setState(493);
						expression();
						}
					}

					}
					break;
				case 2:
					{
					setState(496);
					expression();
					}
					break;
				}
				setState(499);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 92, RULE_stringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			stringExpPrefix();
			setState(503);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 94, RULE_stringExpPrefix);
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STARTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(STARTS);
				setState(506);
				match(WITH);
				}
				break;
			case ENDS:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(ENDS);
				setState(508);
				match(WITH);
				}
				break;
			case CONTAINS:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 96, RULE_nullExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(IS);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(513);
				match(NOT);
				}
			}

			setState(516);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 98, RULE_propertyOrLabelExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			propertyExpression();
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(519);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 100, RULE_propertyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			atom();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(523);
				match(DOT);
				setState(524);
				name();
				}
				}
				setState(529);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 102, RULE_patternPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER || _la==EXTRACT || _la==ID || _la==ESC_LITERAL) {
				{
				setState(530);
				symbol();
				setState(531);
				match(ASSIGN);
				}
			}

			setState(535);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 104, RULE_patternElem);
		int _la;
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				nodePattern();
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LT || _la==SUB) {
					{
					{
					setState(538);
					patternElemChain();
					}
					}
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				match(LPAREN);
				setState(545);
				patternElem();
				setState(546);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 106, RULE_patternElemChain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			relationshipPattern();
			setState(551);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 108, RULE_properties);
		try {
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
			case FILTER:
			case EXTRACT:
			case ID:
			case ESC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				mapLit();
				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 110, RULE_nodePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(LPAREN);
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(558);
				symbol();
				}
				break;
			}
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(561);
				nodeLabels();
				}
			}

			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6710919168L) != 0) || _la==ID || _la==ESC_LITERAL) {
				{
				setState(564);
				properties();
				}
			}

			setState(567);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public ListComprehensionContext listComprehension() {
			return getRuleContext(ListComprehensionContext.class,0);
		}
		public PatternComprehensionContext patternComprehension() {
			return getRuleContext(PatternComprehensionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public ReduceExpressionContext reduceExpression() {
			return getRuleContext(ReduceExpressionContext.class,0);
		}
		public CountAllContext countAll() {
			return getRuleContext(CountAllContext.class,0);
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
		public SubqueryExistContext subqueryExist() {
			return getRuleContext(SubqueryExistContext.class,0);
		}
		public SubqueryCountContext subqueryCount() {
			return getRuleContext(SubqueryCountContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
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
		enterRule(_localctx, 112, RULE_atom);
		try {
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				functionInvocation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				listComprehension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				patternComprehension();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(572);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(573);
				parameter();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(574);
				caseExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(575);
				reduceExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(576);
				countAll();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(577);
				filterWith();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(578);
				relationshipsChainPattern();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(579);
				parenthesizedExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(580);
				subqueryExist();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(581);
				subqueryCount();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(582);
				symbol();
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 114, RULE_lhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			symbol();
			setState(586);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 116, RULE_relationshipPattern);
		int _la;
		try {
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				match(LT);
				setState(589);
				match(SUB);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(590);
					relationDetail();
					}
				}

				setState(593);
				match(SUB);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GT) {
					{
					setState(594);
					match(GT);
					}
				}

				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				match(SUB);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(598);
					relationDetail();
					}
				}

				setState(601);
				match(SUB);
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GT) {
					{
					setState(602);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 118, RULE_relationDetail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(LBRACK);
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(608);
				symbol();
				}
				break;
			}
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(611);
				relationshipTypes();
				}
			}

			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULT) {
				{
				setState(614);
				rangeLit();
				}
			}

			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6710919168L) != 0) || _la==ID || _la==ESC_LITERAL) {
				{
				setState(617);
				properties();
				}
			}

			setState(620);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 120, RULE_relationshipTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(COLON);
			setState(623);
			name();
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STICK) {
				{
				{
				setState(624);
				match(STICK);
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(625);
					match(COLON);
					}
				}

				setState(628);
				name();
				}
				}
				setState(633);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 122, RULE_unionSt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(UNION);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL) {
				{
				setState(635);
				match(ALL);
				}
			}

			setState(638);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryExistContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(CypherParser.EXISTS, 0); }
		public TerminalNode LBRACE() { return getToken(CypherParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CypherParser.RBRACE, 0); }
		public List<ReadingStatementContext> readingStatement() {
			return getRuleContexts(ReadingStatementContext.class);
		}
		public ReadingStatementContext readingStatement(int i) {
			return getRuleContext(ReadingStatementContext.class,i);
		}
		public List<WithStContext> withSt() {
			return getRuleContexts(WithStContext.class);
		}
		public WithStContext withSt(int i) {
			return getRuleContext(WithStContext.class,i);
		}
		public ReturnStContext returnSt() {
			return getRuleContext(ReturnStContext.class,0);
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
		enterRule(_localctx, 124, RULE_subqueryExist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(EXISTS);
			setState(641);
			match(LBRACE);
			{
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALL || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 10249L) != 0)) {
				{
				setState(644);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CALL:
				case MATCH:
				case OPTIONAL:
				case UNWIND:
					{
					setState(642);
					readingStatement();
					}
					break;
				case WITH:
					{
					setState(643);
					withSt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(649);
				returnSt();
				}
			}

			}
			setState(652);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryCountContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(CypherParser.COUNT, 0); }
		public TerminalNode LBRACE() { return getToken(CypherParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CypherParser.RBRACE, 0); }
		public List<ReadingStatementContext> readingStatement() {
			return getRuleContexts(ReadingStatementContext.class);
		}
		public ReadingStatementContext readingStatement(int i) {
			return getRuleContext(ReadingStatementContext.class,i);
		}
		public List<WithStContext> withSt() {
			return getRuleContexts(WithStContext.class);
		}
		public WithStContext withSt(int i) {
			return getRuleContext(WithStContext.class,i);
		}
		public ReturnStContext returnSt() {
			return getRuleContext(ReturnStContext.class,0);
		}
		public SubqueryCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subqueryCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterSubqueryCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitSubqueryCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitSubqueryCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryCountContext subqueryCount() throws RecognitionException {
		SubqueryCountContext _localctx = new SubqueryCountContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_subqueryCount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(COUNT);
			setState(655);
			match(LBRACE);
			{
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALL || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 10249L) != 0)) {
				{
				setState(658);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CALL:
				case MATCH:
				case OPTIONAL:
				case UNWIND:
					{
					setState(656);
					readingStatement();
					}
					break;
				case WITH:
					{
					setState(657);
					withSt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(663);
				returnSt();
				}
			}

			}
			setState(666);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionInvocationContext extends ParserRuleContext {
		public FunctionnameContext functionname() {
			return getRuleContext(FunctionnameContext.class,0);
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
		enterRule(_localctx, 128, RULE_functionInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			functionname();
			setState(669);
			match(LPAREN);
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(670);
				match(DISTINCT);
				}
			}

			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 576460752303194325L) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 130027633L) != 0)) {
				{
				setState(673);
				expressionChain();
				}
			}

			setState(676);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionnameContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(CypherParser.SIZE, 0); }
		public TerminalNode ABS() { return getToken(CypherParser.ABS, 0); }
		public TerminalNode SUBSTRING() { return getToken(CypherParser.SUBSTRING, 0); }
		public TerminalNode ToIntegerOrNull() { return getToken(CypherParser.ToIntegerOrNull, 0); }
		public TerminalNode ToStringOrNull() { return getToken(CypherParser.ToStringOrNull, 0); }
		public TerminalNode ToBooleanOrNull() { return getToken(CypherParser.ToBooleanOrNull, 0); }
		public TerminalNode ToIntegerList() { return getToken(CypherParser.ToIntegerList, 0); }
		public TerminalNode ToStringList() { return getToken(CypherParser.ToStringList, 0); }
		public TerminalNode ToBooleanList() { return getToken(CypherParser.ToBooleanList, 0); }
		public TerminalNode NODES() { return getToken(CypherParser.NODES, 0); }
		public TerminalNode RELATIONSHIPS() { return getToken(CypherParser.RELATIONSHIPS, 0); }
		public TerminalNode RANGEF() { return getToken(CypherParser.RANGEF, 0); }
		public TerminalNode KEY() { return getToken(CypherParser.KEY, 0); }
		public TerminalNode TYPE() { return getToken(CypherParser.TYPE, 0); }
		public TerminalNode LABELS() { return getToken(CypherParser.LABELS, 0); }
		public TerminalNode LENGTH() { return getToken(CypherParser.LENGTH, 0); }
		public TerminalNode EXISTSF() { return getToken(CypherParser.EXISTSF, 0); }
		public TerminalNode ROUND() { return getToken(CypherParser.ROUND, 0); }
		public TerminalNode MIN() { return getToken(CypherParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(CypherParser.MAX, 0); }
		public TerminalNode AVG() { return getToken(CypherParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(CypherParser.SUM, 0); }
		public TerminalNode STARTNODE() { return getToken(CypherParser.STARTNODE, 0); }
		public TerminalNode ENDNODE() { return getToken(CypherParser.ENDNODE, 0); }
		public TerminalNode ELEMENTID() { return getToken(CypherParser.ELEMENTID, 0); }
		public TerminalNode PROPERTIES() { return getToken(CypherParser.PROPERTIES, 0); }
		public TerminalNode ISEMPTY() { return getToken(CypherParser.ISEMPTY, 0); }
		public TerminalNode REVERSE() { return getToken(CypherParser.REVERSE, 0); }
		public TerminalNode COLLECT() { return getToken(CypherParser.COLLECT, 0); }
		public TerminalNode PERCENTILEDISC() { return getToken(CypherParser.PERCENTILEDISC, 0); }
		public TerminalNode STDEVP() { return getToken(CypherParser.STDEVP, 0); }
		public TerminalNode STDEV() { return getToken(CypherParser.STDEV, 0); }
		public FunctionnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterFunctionname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitFunctionname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitFunctionname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionnameContext functionname() throws RecognitionException {
		FunctionnameContext _localctx = new FunctionnameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_functionname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			_la = _input.LA(1);
			if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 8573157375L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 132, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(LPAREN);
			setState(681);
			expression();
			setState(682);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 134, RULE_filterWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 15L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(685);
			match(LPAREN);
			setState(686);
			filterExpression();
			setState(687);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 136, RULE_patternComprehension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(LBRACK);
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER || _la==EXTRACT || _la==ID || _la==ESC_LITERAL) {
				{
				setState(690);
				lhs();
				}
			}

			setState(693);
			relationshipsChainPattern();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(694);
				where();
				}
			}

			setState(697);
			match(STICK);
			setState(698);
			expression();
			setState(699);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 138, RULE_relationshipsChainPattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			nodePattern();
			setState(703); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(702);
					patternElemChain();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(705); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 140, RULE_listComprehension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(LBRACK);
			setState(708);
			filterExpression();
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STICK) {
				{
				setState(709);
				match(STICK);
				setState(710);
				expression();
				}
			}

			setState(713);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 142, RULE_filterExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			symbol();
			setState(716);
			match(IN);
			setState(717);
			expression();
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(718);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 144, RULE_countAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(COUNT);
			setState(722);
			match(LPAREN);
			setState(723);
			match(MULT);
			setState(724);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 146, RULE_expressionChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			expression();
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(727);
				match(COMMA);
				setState(728);
				expression();
				}
				}
				setState(733);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 148, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(CASE);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 576460752303194325L) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 130027633L) != 0)) {
				{
				setState(735);
				expression();
				}
			}

			setState(743); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(738);
				match(WHEN);
				setState(739);
				expression();
				setState(740);
				match(THEN);
				setState(741);
				expression();
				}
				}
				setState(745); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(747);
				match(ELSE);
				setState(748);
				expression();
				}
			}

			setState(751);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReduceExpressionContext extends ParserRuleContext {
		public TerminalNode REDUCE() { return getToken(CypherParser.REDUCE, 0); }
		public TerminalNode LPAREN() { return getToken(CypherParser.LPAREN, 0); }
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CypherParser.COMMA, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode IN() { return getToken(CypherParser.IN, 0); }
		public TerminalNode STICK() { return getToken(CypherParser.STICK, 0); }
		public TerminalNode RPAREN() { return getToken(CypherParser.RPAREN, 0); }
		public ReduceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reduceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).enterReduceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherParserListener ) ((CypherParserListener)listener).exitReduceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherParserVisitor ) return ((CypherParserVisitor<? extends T>)visitor).visitReduceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReduceExpressionContext reduceExpression() throws RecognitionException {
		ReduceExpressionContext _localctx = new ReduceExpressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_reduceExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(REDUCE);
			setState(754);
			match(LPAREN);
			setState(755);
			lhs();
			setState(756);
			expression();
			setState(757);
			match(COMMA);
			setState(758);
			symbol();
			setState(759);
			match(IN);
			setState(760);
			expression();
			setState(761);
			match(STICK);
			setState(762);
			expression();
			setState(763);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 152, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(DOLLAR);
			setState(768);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILTER:
			case EXTRACT:
			case ID:
			case ESC_LITERAL:
				{
				setState(766);
				symbol();
				}
				break;
			case DIGIT:
				{
				setState(767);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public BoolLitContext boolLit() {
			return getRuleContext(BoolLitContext.class,0);
		}
		public CharLitContext charLit() {
			return getRuleContext(CharLitContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public NumLitContext numLit() {
			return getRuleContext(NumLitContext.class,0);
		}
		public TerminalNode NULL_W() { return getToken(CypherParser.NULL_W, 0); }
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
		enterRule(_localctx, 154, RULE_literal);
		try {
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				boolLit();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				charLit();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				stringLit();
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(773);
				numLit();
				}
				break;
			case NULL_W:
				enterOuterAlt(_localctx, 5);
				{
				setState(774);
				match(NULL_W);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 6);
				{
				setState(775);
				listLit();
				}
				break;
			case LBRACE:
			case FILTER:
			case EXTRACT:
			case ID:
			case ESC_LITERAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(776);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 156, RULE_rangeLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(MULT);
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(780);
				numLit();
				}
			}

			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE) {
				{
				setState(783);
				match(RANGE);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIGIT) {
					{
					setState(784);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 158, RULE_boolLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 160, RULE_numLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 162, RULE_stringLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 164, RULE_charLit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 166, RULE_listLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(LBRACK);
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & 576460752303194325L) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & 130027633L) != 0)) {
				{
				setState(798);
				expressionChain();
				}
			}

			setState(801);
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

	@SuppressWarnings("CheckReturnValue")
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
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public TerminalNode DOT() { return getToken(CypherParser.DOT, 0); }
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
		enterRule(_localctx, 168, RULE_mapLit);
		int _la;
		try {
			setState(821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				match(LBRACE);
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 23622320128L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 36028797018898431L) != 0)) {
					{
					setState(804);
					mapPair();
					setState(809);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(805);
						match(COMMA);
						setState(806);
						mapPair();
						}
						}
						setState(811);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(814);
				match(RBRACE);
				}
				break;
			case FILTER:
			case EXTRACT:
			case ID:
			case ESC_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				symbol();
				setState(816);
				match(LBRACE);
				setState(817);
				match(DOT);
				setState(818);
				symbol();
				setState(819);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 170, RULE_mapPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			name();
			setState(824);
			match(COLON);
			setState(825);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 172, RULE_name);
		try {
			setState(829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILTER:
			case EXTRACT:
			case ID:
			case ESC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				symbol();
				}
				break;
			case EXISTS:
			case ALL:
			case ASC:
			case ASCENDING:
			case BY:
			case CREATE:
			case DELETE:
			case DESC:
			case DESCENDING:
			case DETACH:
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
				setState(828);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode ESC_LITERAL() { return getToken(CypherParser.ESC_LITERAL, 0); }
		public TerminalNode ID() { return getToken(CypherParser.ID, 0); }
		public TerminalNode FILTER() { return getToken(CypherParser.FILTER, 0); }
		public TerminalNode EXTRACT() { return getToken(CypherParser.EXTRACT, 0); }
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
		enterRule(_localctx, 174, RULE_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			_la = _input.LA(1);
			if ( !(_la==FILTER || _la==EXTRACT || _la==ID || _la==ESC_LITERAL) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 176, RULE_reservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			_la = _input.LA(1);
			if ( !(_la==EXISTS || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 9007199254675455L) != 0)) ) {
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
		"\u0004\u0001\u0086\u0344\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\u00b5\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0003\u0001\u00ba\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002\u00be\b"+
		"\u0002\n\u0002\f\u0002\u00c1\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u00c6\b\u0003\n\u0003\f\u0003\u00c9\t\u0003\u0001\u0003\u0003"+
		"\u0003\u00cc\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00d4\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0003\b\u00dd\b\b\u0001"+
		"\b\u0001\b\u0003\b\u00e1\b\b\u0001\b\u0003\b\u00e4\b\b\u0001\b\u0003\b"+
		"\u00e7\b\b\u0001\t\u0001\t\u0003\t\u00eb\b\t\u0001\t\u0001\t\u0005\t\u00ef"+
		"\b\t\n\t\f\t\u00f2\t\t\u0001\n\u0001\n\u0001\n\u0003\n\u00f7\b\n\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00fb\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u0102\b\f\n\f\f\f\u0105\t\f\u0001\r\u0003\r\u0108\b"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0115\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u011d\b\u0010\u0001\u0011\u0003\u0011\u0120\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0129\b\u0012\n\u0012\f\u0012\u012c\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0135\b\u0013\n\u0013\f\u0013\u0138\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0140"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0149\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0150\b\u0017\n\u0017\f\u0017"+
		"\u0153\t\u0017\u0001\u0017\u0003\u0017\u0156\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u015b\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0162\b\u0019\n\u0019\f\u0019"+
		"\u0165\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u016f\b\u001b\n\u001b"+
		"\f\u001b\u0172\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u017f\b\u001c\u0001\u001d\u0001\u001d\u0004\u001d"+
		"\u0183\b\u001d\u000b\u001d\f\u001d\u0184\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u018c\b\u001f\u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0005!\u0194\b!\n!\f!\u0197\t!\u0001\"\u0001"+
		"\"\u0001\"\u0005\"\u019c\b\"\n\"\f\"\u019f\t\"\u0001#\u0001#\u0001#\u0005"+
		"#\u01a4\b#\n#\f#\u01a7\t#\u0001$\u0001$\u0001$\u0005$\u01ac\b$\n$\f$\u01af"+
		"\t$\u0001%\u0003%\u01b2\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0005"+
		"&\u01ba\b&\n&\f&\u01bd\t&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0005("+
		"\u01c4\b(\n(\f(\u01c7\t(\u0001)\u0001)\u0001)\u0005)\u01cc\b)\n)\f)\u01cf"+
		"\t)\u0001*\u0001*\u0001*\u0005*\u01d4\b*\n*\f*\u01d7\t*\u0001+\u0003+"+
		"\u01da\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0005,\u01e2\b,\n"+
		",\f,\u01e5\t,\u0001-\u0001-\u0001-\u0001-\u0003-\u01eb\b-\u0001-\u0001"+
		"-\u0003-\u01ef\b-\u0001-\u0003-\u01f2\b-\u0001-\u0003-\u01f5\b-\u0001"+
		".\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u01ff\b/\u0001"+
		"0\u00010\u00030\u0203\b0\u00010\u00010\u00011\u00011\u00031\u0209\b1\u0001"+
		"2\u00012\u00012\u00052\u020e\b2\n2\f2\u0211\t2\u00013\u00013\u00013\u0003"+
		"3\u0216\b3\u00013\u00013\u00014\u00014\u00054\u021c\b4\n4\f4\u021f\t4"+
		"\u00014\u00014\u00014\u00014\u00034\u0225\b4\u00015\u00015\u00015\u0001"+
		"6\u00016\u00036\u022c\b6\u00017\u00017\u00037\u0230\b7\u00017\u00037\u0233"+
		"\b7\u00017\u00037\u0236\b7\u00017\u00017\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0003"+
		"8\u0248\b8\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0003:\u0250\b:\u0001"+
		":\u0001:\u0003:\u0254\b:\u0001:\u0001:\u0003:\u0258\b:\u0001:\u0001:\u0003"+
		":\u025c\b:\u0003:\u025e\b:\u0001;\u0001;\u0003;\u0262\b;\u0001;\u0003"+
		";\u0265\b;\u0001;\u0003;\u0268\b;\u0001;\u0003;\u026b\b;\u0001;\u0001"+
		";\u0001<\u0001<\u0001<\u0001<\u0003<\u0273\b<\u0001<\u0005<\u0276\b<\n"+
		"<\f<\u0279\t<\u0001=\u0001=\u0003=\u027d\b=\u0001=\u0001=\u0001>\u0001"+
		">\u0001>\u0001>\u0005>\u0285\b>\n>\f>\u0288\t>\u0001>\u0003>\u028b\b>"+
		"\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0005?\u0293\b?\n?\f?\u0296"+
		"\t?\u0001?\u0003?\u0299\b?\u0001?\u0001?\u0001@\u0001@\u0001@\u0003@\u02a0"+
		"\b@\u0001@\u0003@\u02a3\b@\u0001@\u0001@\u0001A\u0001A\u0001B\u0001B\u0001"+
		"B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0003D\u02b4"+
		"\bD\u0001D\u0001D\u0003D\u02b8\bD\u0001D\u0001D\u0001D\u0001D\u0001E\u0001"+
		"E\u0004E\u02c0\bE\u000bE\fE\u02c1\u0001F\u0001F\u0001F\u0001F\u0003F\u02c8"+
		"\bF\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0003G\u02d0\bG\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0005I\u02da\bI\nI\fI\u02dd"+
		"\tI\u0001J\u0001J\u0003J\u02e1\bJ\u0001J\u0001J\u0001J\u0001J\u0001J\u0004"+
		"J\u02e8\bJ\u000bJ\fJ\u02e9\u0001J\u0001J\u0003J\u02ee\bJ\u0001J\u0001"+
		"J\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0001L\u0001L\u0001L\u0003L\u0301\bL\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0003M\u030a\bM\u0001N\u0001N\u0003N\u030e"+
		"\bN\u0001N\u0001N\u0003N\u0312\bN\u0003N\u0314\bN\u0001O\u0001O\u0001"+
		"P\u0001P\u0001Q\u0001Q\u0001R\u0001R\u0001S\u0001S\u0003S\u0320\bS\u0001"+
		"S\u0001S\u0001T\u0001T\u0001T\u0001T\u0005T\u0328\bT\nT\fT\u032b\tT\u0003"+
		"T\u032d\bT\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0003T\u0336"+
		"\bT\u0001U\u0001U\u0001U\u0001U\u0001V\u0001V\u0003V\u033e\bV\u0001W\u0001"+
		"W\u0001X\u0001X\u0001X\u0000\u0000Y\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u0000\u000b\u0002\u0000HIMN\u0002"+
		"\u0000KKQQ\u0001\u0000\u0001\u0002\u0002\u0000\u0001\u0001\u0003\b\u0001"+
		"\u0000\u0013\u0014\u0002\u0000\u0015\u0016\u0018\u0018\u0002\u0000#:<"+
		"C\u0001\u0000DG\u0001\u0000jk\u0002\u0000\u001f |}\u0003\u0000\"\"GVX"+
		"{\u0367\u0000\u00b2\u0001\u0000\u0000\u0000\u0002\u00b9\u0001\u0000\u0000"+
		"\u0000\u0004\u00bb\u0001\u0000\u0000\u0000\u0006\u00c7\u0001\u0000\u0000"+
		"\u0000\b\u00cd\u0001\u0000\u0000\u0000\n\u00d0\u0001\u0000\u0000\u0000"+
		"\f\u00d5\u0001\u0000\u0000\u0000\u000e\u00d8\u0001\u0000\u0000\u0000\u0010"+
		"\u00dc\u0001\u0000\u0000\u0000\u0012\u00ea\u0001\u0000\u0000\u0000\u0014"+
		"\u00f3\u0001\u0000\u0000\u0000\u0016\u00f8\u0001\u0000\u0000\u0000\u0018"+
		"\u00fc\u0001\u0000\u0000\u0000\u001a\u0107\u0001\u0000\u0000\u0000\u001c"+
		"\u010c\u0001\u0000\u0000\u0000\u001e\u0114\u0001\u0000\u0000\u0000 \u011c"+
		"\u0001\u0000\u0000\u0000\"\u011f\u0001\u0000\u0000\u0000$\u0124\u0001"+
		"\u0000\u0000\u0000&\u012d\u0001\u0000\u0000\u0000(\u013f\u0001\u0000\u0000"+
		"\u0000*\u0141\u0001\u0000\u0000\u0000,\u0146\u0001\u0000\u0000\u0000."+
		"\u014c\u0001\u0000\u0000\u00000\u015a\u0001\u0000\u0000\u00002\u015e\u0001"+
		"\u0000\u0000\u00004\u0166\u0001\u0000\u0000\u00006\u016a\u0001\u0000\u0000"+
		"\u00008\u017e\u0001\u0000\u0000\u0000:\u0182\u0001\u0000\u0000\u0000<"+
		"\u0186\u0001\u0000\u0000\u0000>\u0189\u0001\u0000\u0000\u0000@\u018d\u0001"+
		"\u0000\u0000\u0000B\u0190\u0001\u0000\u0000\u0000D\u0198\u0001\u0000\u0000"+
		"\u0000F\u01a0\u0001\u0000\u0000\u0000H\u01a8\u0001\u0000\u0000\u0000J"+
		"\u01b1\u0001\u0000\u0000\u0000L\u01b5\u0001\u0000\u0000\u0000N\u01be\u0001"+
		"\u0000\u0000\u0000P\u01c0\u0001\u0000\u0000\u0000R\u01c8\u0001\u0000\u0000"+
		"\u0000T\u01d0\u0001\u0000\u0000\u0000V\u01d9\u0001\u0000\u0000\u0000X"+
		"\u01dd\u0001\u0000\u0000\u0000Z\u01f4\u0001\u0000\u0000\u0000\\\u01f6"+
		"\u0001\u0000\u0000\u0000^\u01fe\u0001\u0000\u0000\u0000`\u0200\u0001\u0000"+
		"\u0000\u0000b\u0206\u0001\u0000\u0000\u0000d\u020a\u0001\u0000\u0000\u0000"+
		"f\u0215\u0001\u0000\u0000\u0000h\u0224\u0001\u0000\u0000\u0000j\u0226"+
		"\u0001\u0000\u0000\u0000l\u022b\u0001\u0000\u0000\u0000n\u022d\u0001\u0000"+
		"\u0000\u0000p\u0247\u0001\u0000\u0000\u0000r\u0249\u0001\u0000\u0000\u0000"+
		"t\u025d\u0001\u0000\u0000\u0000v\u025f\u0001\u0000\u0000\u0000x\u026e"+
		"\u0001\u0000\u0000\u0000z\u027a\u0001\u0000\u0000\u0000|\u0280\u0001\u0000"+
		"\u0000\u0000~\u028e\u0001\u0000\u0000\u0000\u0080\u029c\u0001\u0000\u0000"+
		"\u0000\u0082\u02a6\u0001\u0000\u0000\u0000\u0084\u02a8\u0001\u0000\u0000"+
		"\u0000\u0086\u02ac\u0001\u0000\u0000\u0000\u0088\u02b1\u0001\u0000\u0000"+
		"\u0000\u008a\u02bd\u0001\u0000\u0000\u0000\u008c\u02c3\u0001\u0000\u0000"+
		"\u0000\u008e\u02cb\u0001\u0000\u0000\u0000\u0090\u02d1\u0001\u0000\u0000"+
		"\u0000\u0092\u02d6\u0001\u0000\u0000\u0000\u0094\u02de\u0001\u0000\u0000"+
		"\u0000\u0096\u02f1\u0001\u0000\u0000\u0000\u0098\u02fd\u0001\u0000\u0000"+
		"\u0000\u009a\u0309\u0001\u0000\u0000\u0000\u009c\u030b\u0001\u0000\u0000"+
		"\u0000\u009e\u0315\u0001\u0000\u0000\u0000\u00a0\u0317\u0001\u0000\u0000"+
		"\u0000\u00a2\u0319\u0001\u0000\u0000\u0000\u00a4\u031b\u0001\u0000\u0000"+
		"\u0000\u00a6\u031d\u0001\u0000\u0000\u0000\u00a8\u0335\u0001\u0000\u0000"+
		"\u0000\u00aa\u0337\u0001\u0000\u0000\u0000\u00ac\u033d\u0001\u0000\u0000"+
		"\u0000\u00ae\u033f\u0001\u0000\u0000\u0000\u00b0\u0341\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b4\u0003\u0002\u0001\u0000\u00b3\u00b5\u0005\n\u0000\u0000"+
		"\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0000\u0000\u0001"+
		"\u00b7\u0001\u0001\u0000\u0000\u0000\u00b8\u00ba\u0003\u0004\u0002\u0000"+
		"\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ba\u0003\u0001\u0000\u0000\u0000\u00bb\u00bf\u0003\u0006\u0003\u0000"+
		"\u00bc\u00be\u0003z=\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u0005\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c6\u0003\u001e\u000f\u0000\u00c3\u00c6"+
		"\u0003 \u0010\u0000\u00c4\u00c6\u0003\n\u0005\u0000\u00c5\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003"+
		"\b\u0004\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u0007\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005X\u0000"+
		"\u0000\u00ce\u00cf\u0003\u0010\b\u0000\u00cf\t\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0005\\\u0000\u0000\u00d1\u00d3\u0003\u0010\b\u0000\u00d2"+
		"\u00d4\u0003@ \u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u000b\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		"Z\u0000\u0000\u00d6\u00d7\u0003D\"\u0000\u00d7\r\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0005P\u0000\u0000\u00d9\u00da\u0003D\"\u0000\u00da\u000f"+
		"\u0001\u0000\u0000\u0000\u00db\u00dd\u0005b\u0000\u0000\u00dc\u00db\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u00e0\u0003\u0012\t\u0000\u00df\u00e1\u0003\u0018"+
		"\f\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00e4\u0003\f\u0006\u0000"+
		"\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e7\u0003\u000e\u0007\u0000"+
		"\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e7\u0011\u0001\u0000\u0000\u0000\u00e8\u00eb\u0005\u0018\u0000\u0000"+
		"\u00e9\u00eb\u0003\u0014\n\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00f0\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0005\f\u0000\u0000\u00ed\u00ef\u0003\u0014\n\u0000\u00ee\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u0013"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f6"+
		"\u0003D\"\u0000\u00f4\u00f5\u0005`\u0000\u0000\u00f5\u00f7\u0003\u00ae"+
		"W\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u0015\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003D\"\u0000"+
		"\u00f9\u00fb\u0007\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u0017\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0005U\u0000\u0000\u00fd\u00fe\u0005J\u0000\u0000\u00fe\u0103"+
		"\u0003\u0016\u000b\u0000\u00ff\u0100\u0005\f\u0000\u0000\u0100\u0102\u0003"+
		"\u0016\u000b\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0105\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u0104\u0019\u0001\u0000\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0106\u0108\u0005T\u0000\u0000\u0107\u0106\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0005Q\u0000\u0000\u010a\u010b\u0003>\u001f\u0000"+
		"\u010b\u001b\u0001\u0000\u0000\u0000\u010c\u010d\u0005^\u0000\u0000\u010d"+
		"\u010e\u0003D\"\u0000\u010e\u010f\u0005`\u0000\u0000\u010f\u0110\u0003"+
		"\u00aeW\u0000\u0110\u001d\u0001\u0000\u0000\u0000\u0111\u0115\u0003\u001a"+
		"\r\u0000\u0112\u0115\u0003\u001c\u000e\u0000\u0113\u0115\u0003*\u0015"+
		"\u0000\u0114\u0111\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000"+
		"\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u001f\u0001\u0000\u0000"+
		"\u0000\u0116\u011d\u0003<\u001e\u0000\u0117\u011d\u00032\u0019\u0000\u0118"+
		"\u011d\u0003\"\u0011\u0000\u0119\u011d\u00036\u001b\u0000\u011a\u011d"+
		"\u0003$\u0012\u0000\u011b\u011d\u0003&\u0013\u0000\u011c\u0116\u0001\u0000"+
		"\u0000\u0000\u011c\u0117\u0001\u0000\u0000\u0000\u011c\u0118\u0001\u0000"+
		"\u0000\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d!\u0001\u0000\u0000"+
		"\u0000\u011e\u0120\u0005O\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0005L\u0000\u0000\u0122\u0123\u0003\u0092I\u0000\u0123#"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0005V\u0000\u0000\u0125\u012a\u0003"+
		"(\u0014\u0000\u0126\u0127\u0005\f\u0000\u0000\u0127\u0129\u0003(\u0014"+
		"\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000"+
		"\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012b%\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0005W\u0000\u0000\u012e\u012f\u0005\r\u0000\u0000\u012f"+
		"\u0130\u0003\u00aeW\u0000\u0130\u0131\u0005d\u0000\u0000\u0131\u0132\u0003"+
		"D\"\u0000\u0132\u0136\u0005\u001b\u0000\u0000\u0133\u0135\u0003 \u0010"+
		"\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000"+
		"\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000"+
		"\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0005\u000e\u0000\u0000\u013a\'\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0003\u00aeW\u0000\u013c\u013d\u0003:\u001d\u0000\u013d\u0140"+
		"\u0001\u0000\u0000\u0000\u013e\u0140\u0003d2\u0000\u013f\u013b\u0001\u0000"+
		"\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140)\u0001\u0000\u0000"+
		"\u0000\u0141\u0142\u0005\u001d\u0000\u0000\u0142\u0143\u0005\u000f\u0000"+
		"\u0000\u0143\u0144\u0003\u0006\u0003\u0000\u0144\u0145\u0005\u0010\u0000"+
		"\u0000\u0145+\u0001\u0000\u0000\u0000\u0146\u0148\u0005\r\u0000\u0000"+
		"\u0147\u0149\u0003\u0092I\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0005\u000e\u0000\u0000\u014b-\u0001\u0000\u0000\u0000\u014c\u0151"+
		"\u00030\u0018\u0000\u014d\u014e\u0005\f\u0000\u0000\u014e\u0150\u0003"+
		"0\u0018\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000"+
		"\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000"+
		"\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000"+
		"\u0000\u0000\u0154\u0156\u0003@ \u0000\u0155\u0154\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156/\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u0003\u00aeW\u0000\u0158\u0159\u0005`\u0000\u0000\u0159\u015b\u0001"+
		"\u0000\u0000\u0000\u015a\u0157\u0001\u0000\u0000\u0000\u015a\u015b\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015d\u0003"+
		"\u00aeW\u0000\u015d1\u0001\u0000\u0000\u0000\u015e\u015f\u0005R\u0000"+
		"\u0000\u015f\u0163\u0003f3\u0000\u0160\u0162\u00034\u001a\u0000\u0161"+
		"\u0160\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164"+
		"3\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0005S\u0000\u0000\u0167\u0168\u0007\u0001\u0000\u0000\u0168\u0169\u0003"+
		"6\u001b\u0000\u01695\u0001\u0000\u0000\u0000\u016a\u016b\u0005Y\u0000"+
		"\u0000\u016b\u0170\u00038\u001c\u0000\u016c\u016d\u0005\f\u0000\u0000"+
		"\u016d\u016f\u00038\u001c\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f"+
		"\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0001\u0000\u0000\u0000\u01717\u0001\u0000\u0000\u0000\u0172\u0170"+
		"\u0001\u0000\u0000\u0000\u0173\u0174\u0003d2\u0000\u0174\u0175\u0005\u0001"+
		"\u0000\u0000\u0175\u0176\u0003D\"\u0000\u0176\u017f\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0003\u00aeW\u0000\u0178\u0179\u0007\u0002\u0000\u0000"+
		"\u0179\u017a\u0003D\"\u0000\u017a\u017f\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0003\u00aeW\u0000\u017c\u017d\u0003:\u001d\u0000\u017d\u017f\u0001"+
		"\u0000\u0000\u0000\u017e\u0173\u0001\u0000\u0000\u0000\u017e\u0177\u0001"+
		"\u0000\u0000\u0000\u017e\u017b\u0001\u0000\u0000\u0000\u017f9\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0005\u001a\u0000\u0000\u0181\u0183\u0003\u00ac"+
		"V\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000"+
		"\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000"+
		"\u0000\u0185;\u0001\u0000\u0000\u0000\u0186\u0187\u0005K\u0000\u0000\u0187"+
		"\u0188\u0003B!\u0000\u0188=\u0001\u0000\u0000\u0000\u0189\u018b\u0003"+
		"B!\u0000\u018a\u018c\u0003@ \u0000\u018b\u018a\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0001\u0000\u0000\u0000\u018c?\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0005[\u0000\u0000\u018e\u018f\u0003D\"\u0000\u018fA\u0001\u0000"+
		"\u0000\u0000\u0190\u0195\u0003f3\u0000\u0191\u0192\u0005\f\u0000\u0000"+
		"\u0192\u0194\u0003f3\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0197"+
		"\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0001\u0000\u0000\u0000\u0196C\u0001\u0000\u0000\u0000\u0197\u0195\u0001"+
		"\u0000\u0000\u0000\u0198\u019d\u0003F#\u0000\u0199\u019a\u0005g\u0000"+
		"\u0000\u019a\u019c\u0003F#\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c"+
		"\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d"+
		"\u019e\u0001\u0000\u0000\u0000\u019eE\u0001\u0000\u0000\u0000\u019f\u019d"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a5\u0003H$\u0000\u01a1\u01a2\u0005i"+
		"\u0000\u0000\u01a2\u01a4\u0003H$\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6G\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ad\u0003J%\u0000\u01a9\u01aa\u0005"+
		"_\u0000\u0000\u01aa\u01ac\u0003J%\u0000\u01ab\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01aeI\u0001\u0000\u0000\u0000"+
		"\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b2\u0005f\u0000\u0000\u01b1"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u0003L&\u0000\u01b4K\u0001"+
		"\u0000\u0000\u0000\u01b5\u01bb\u0003P(\u0000\u01b6\u01b7\u0003N\'\u0000"+
		"\u01b7\u01b8\u0003P(\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01b6"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bcM\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01bf\u0007"+
		"\u0003\u0000\u0000\u01bfO\u0001\u0000\u0000\u0000\u01c0\u01c5\u0003R)"+
		"\u0000\u01c1\u01c2\u0007\u0004\u0000\u0000\u01c2\u01c4\u0003R)\u0000\u01c3"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6"+
		"Q\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u01cd"+
		"\u0003T*\u0000\u01c9\u01ca\u0007\u0005\u0000\u0000\u01ca\u01cc\u0003T"+
		"*\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000"+
		"\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000"+
		"\u0000\u01ceS\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000"+
		"\u01d0\u01d5\u0003V+\u0000\u01d1\u01d2\u0005\u0017\u0000\u0000\u01d2\u01d4"+
		"\u0003V+\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d6U\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d8\u01da\u0007\u0004\u0000\u0000\u01d9\u01d8\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000"+
		"\u0000\u01db\u01dc\u0003X,\u0000\u01dcW\u0001\u0000\u0000\u0000\u01dd"+
		"\u01e3\u0003b1\u0000\u01de\u01e2\u0003\\.\u0000\u01df\u01e2\u0003Z-\u0000"+
		"\u01e0\u01e2\u0003`0\u0000\u01e1\u01de\u0001\u0000\u0000\u0000\u01e1\u01df"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e4Y\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e7\u0005d\u0000\u0000\u01e7\u01f5\u0003b1"+
		"\u0000\u01e8\u01f1\u0005\u0011\u0000\u0000\u01e9\u01eb\u0003D\"\u0000"+
		"\u01ea\u01e9\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ee\u0005\t\u0000\u0000\u01ed"+
		"\u01ef\u0003D\"\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f2\u0001\u0000\u0000\u0000\u01f0\u01f2"+
		"\u0003D\"\u0000\u01f1\u01ea\u0001\u0000\u0000\u0000\u01f1\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f5\u0005"+
		"\u0012\u0000\u0000\u01f4\u01e6\u0001\u0000\u0000\u0000\u01f4\u01e8\u0001"+
		"\u0000\u0000\u0000\u01f5[\u0001\u0000\u0000\u0000\u01f6\u01f7\u0003^/"+
		"\u0000\u01f7\u01f8\u0003b1\u0000\u01f8]\u0001\u0000\u0000\u0000\u01f9"+
		"\u01fa\u0005h\u0000\u0000\u01fa\u01ff\u0005\\\u0000\u0000\u01fb\u01fc"+
		"\u0005c\u0000\u0000\u01fc\u01ff\u0005\\\u0000\u0000\u01fd\u01ff\u0005"+
		"a\u0000\u0000\u01fe\u01f9\u0001\u0000\u0000\u0000\u01fe\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01ff_\u0001\u0000\u0000"+
		"\u0000\u0200\u0202\u0005e\u0000\u0000\u0201\u0203\u0005f\u0000\u0000\u0202"+
		"\u0201\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203"+
		"\u0204\u0001\u0000\u0000\u0000\u0204\u0205\u0005l\u0000\u0000\u0205a\u0001"+
		"\u0000\u0000\u0000\u0206\u0208\u0003d2\u0000\u0207\u0209\u0003:\u001d"+
		"\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000"+
		"\u0000\u0209c\u0001\u0000\u0000\u0000\u020a\u020f\u0003p8\u0000\u020b"+
		"\u020c\u0005\u000b\u0000\u0000\u020c\u020e\u0003\u00acV\u0000\u020d\u020b"+
		"\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000\u0000\u0000\u020f\u020d"+
		"\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210e\u0001"+
		"\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0212\u0213\u0003"+
		"\u00aeW\u0000\u0213\u0214\u0005\u0001\u0000\u0000\u0214\u0216\u0001\u0000"+
		"\u0000\u0000\u0215\u0212\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0218\u0003h4\u0000"+
		"\u0218g\u0001\u0000\u0000\u0000\u0219\u021d\u0003n7\u0000\u021a\u021c"+
		"\u0003j5\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021c\u021f\u0001\u0000"+
		"\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000"+
		"\u0000\u0000\u021e\u0225\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000"+
		"\u0000\u0000\u0220\u0221\u0005\r\u0000\u0000\u0221\u0222\u0003h4\u0000"+
		"\u0222\u0223\u0005\u000e\u0000\u0000\u0223\u0225\u0001\u0000\u0000\u0000"+
		"\u0224\u0219\u0001\u0000\u0000\u0000\u0224\u0220\u0001\u0000\u0000\u0000"+
		"\u0225i\u0001\u0000\u0000\u0000\u0226\u0227\u0003t:\u0000\u0227\u0228"+
		"\u0003n7\u0000\u0228k\u0001\u0000\u0000\u0000\u0229\u022c\u0003\u00a8"+
		"T\u0000\u022a\u022c\u0003\u0098L\u0000\u022b\u0229\u0001\u0000\u0000\u0000"+
		"\u022b\u022a\u0001\u0000\u0000\u0000\u022cm\u0001\u0000\u0000\u0000\u022d"+
		"\u022f\u0005\r\u0000\u0000\u022e\u0230\u0003\u00aeW\u0000\u022f\u022e"+
		"\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0232"+
		"\u0001\u0000\u0000\u0000\u0231\u0233\u0003:\u001d\u0000\u0232\u0231\u0001"+
		"\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0235\u0001"+
		"\u0000\u0000\u0000\u0234\u0236\u0003l6\u0000\u0235\u0234\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000"+
		"\u0000\u0237\u0238\u0005\u000e\u0000\u0000\u0238o\u0001\u0000\u0000\u0000"+
		"\u0239\u0248\u0003\u0080@\u0000\u023a\u0248\u0003\u008cF\u0000\u023b\u0248"+
		"\u0003\u0088D\u0000\u023c\u0248\u0003\u009aM\u0000\u023d\u0248\u0003\u0098"+
		"L\u0000\u023e\u0248\u0003\u0094J\u0000\u023f\u0248\u0003\u0096K\u0000"+
		"\u0240\u0248\u0003\u0090H\u0000\u0241\u0248\u0003\u0086C\u0000\u0242\u0248"+
		"\u0003\u008aE\u0000\u0243\u0248\u0003\u0084B\u0000\u0244\u0248\u0003|"+
		">\u0000\u0245\u0248\u0003~?\u0000\u0246\u0248\u0003\u00aeW\u0000\u0247"+
		"\u0239\u0001\u0000\u0000\u0000\u0247\u023a\u0001\u0000\u0000\u0000\u0247"+
		"\u023b\u0001\u0000\u0000\u0000\u0247\u023c\u0001\u0000\u0000\u0000\u0247"+
		"\u023d\u0001\u0000\u0000\u0000\u0247\u023e\u0001\u0000\u0000\u0000\u0247"+
		"\u023f\u0001\u0000\u0000\u0000\u0247\u0240\u0001\u0000\u0000\u0000\u0247"+
		"\u0241\u0001\u0000\u0000\u0000\u0247\u0242\u0001\u0000\u0000\u0000\u0247"+
		"\u0243\u0001\u0000\u0000\u0000\u0247\u0244\u0001\u0000\u0000\u0000\u0247"+
		"\u0245\u0001\u0000\u0000\u0000\u0247\u0246\u0001\u0000\u0000\u0000\u0248"+
		"q\u0001\u0000\u0000\u0000\u0249\u024a\u0003\u00aeW\u0000\u024a\u024b\u0005"+
		"\u0001\u0000\u0000\u024bs\u0001\u0000\u0000\u0000\u024c\u024d\u0005\u0006"+
		"\u0000\u0000\u024d\u024f\u0005\u0013\u0000\u0000\u024e\u0250\u0003v;\u0000"+
		"\u024f\u024e\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000"+
		"\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0253\u0005\u0013\u0000\u0000"+
		"\u0252\u0254\u0005\u0005\u0000\u0000\u0253\u0252\u0001\u0000\u0000\u0000"+
		"\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u025e\u0001\u0000\u0000\u0000"+
		"\u0255\u0257\u0005\u0013\u0000\u0000\u0256\u0258\u0003v;\u0000\u0257\u0256"+
		"\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u0259"+
		"\u0001\u0000\u0000\u0000\u0259\u025b\u0005\u0013\u0000\u0000\u025a\u025c"+
		"\u0005\u0005\u0000\u0000\u025b\u025a\u0001\u0000\u0000\u0000\u025b\u025c"+
		"\u0001\u0000\u0000\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d\u024c"+
		"\u0001\u0000\u0000\u0000\u025d\u0255\u0001\u0000\u0000\u0000\u025eu\u0001"+
		"\u0000\u0000\u0000\u025f\u0261\u0005\u0011\u0000\u0000\u0260\u0262\u0003"+
		"\u00aeW\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000"+
		"\u0000\u0000\u0262\u0264\u0001\u0000\u0000\u0000\u0263\u0265\u0003x<\u0000"+
		"\u0264\u0263\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000"+
		"\u0265\u0267\u0001\u0000\u0000\u0000\u0266\u0268\u0003\u009cN\u0000\u0267"+
		"\u0266\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268"+
		"\u026a\u0001\u0000\u0000\u0000\u0269\u026b\u0003l6\u0000\u026a\u0269\u0001"+
		"\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c\u0001"+
		"\u0000\u0000\u0000\u026c\u026d\u0005\u0012\u0000\u0000\u026dw\u0001\u0000"+
		"\u0000\u0000\u026e\u026f\u0005\u001a\u0000\u0000\u026f\u0277\u0003\u00ac"+
		"V\u0000\u0270\u0272\u0005\u001b\u0000\u0000\u0271\u0273\u0005\u001a\u0000"+
		"\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000"+
		"\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0276\u0003\u00acV\u0000"+
		"\u0275\u0270\u0001\u0000\u0000\u0000\u0276\u0279\u0001\u0000\u0000\u0000"+
		"\u0277\u0275\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000"+
		"\u0278y\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u027a"+
		"\u027c\u0005]\u0000\u0000\u027b\u027d\u0005G\u0000\u0000\u027c\u027b\u0001"+
		"\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027d\u027e\u0001"+
		"\u0000\u0000\u0000\u027e\u027f\u0003\u0006\u0003\u0000\u027f{\u0001\u0000"+
		"\u0000\u0000\u0280\u0281\u0005\"\u0000\u0000\u0281\u0286\u0005\u000f\u0000"+
		"\u0000\u0282\u0285\u0003\u001e\u000f\u0000\u0283\u0285\u0003\n\u0005\u0000"+
		"\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0283\u0001\u0000\u0000\u0000"+
		"\u0285\u0288\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000"+
		"\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u028a\u0001\u0000\u0000\u0000"+
		"\u0288\u0286\u0001\u0000\u0000\u0000\u0289\u028b\u0003\b\u0004\u0000\u028a"+
		"\u0289\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b"+
		"\u028c\u0001\u0000\u0000\u0000\u028c\u028d\u0005\u0010\u0000\u0000\u028d"+
		"}\u0001\u0000\u0000\u0000\u028e\u028f\u0005!\u0000\u0000\u028f\u0294\u0005"+
		"\u000f\u0000\u0000\u0290\u0293\u0003\u001e\u000f\u0000\u0291\u0293\u0003"+
		"\n\u0005\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0292\u0291\u0001\u0000"+
		"\u0000\u0000\u0293\u0296\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000"+
		"\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u0298\u0001\u0000"+
		"\u0000\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0297\u0299\u0003\b\u0004"+
		"\u0000\u0298\u0297\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000"+
		"\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0005\u0010\u0000"+
		"\u0000\u029b\u007f\u0001\u0000\u0000\u0000\u029c\u029d\u0003\u0082A\u0000"+
		"\u029d\u029f\u0005\r\u0000\u0000\u029e\u02a0\u0005b\u0000\u0000\u029f"+
		"\u029e\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a1\u02a3\u0003\u0092I\u0000\u02a2\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a4"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a5\u0005\u000e\u0000\u0000\u02a5\u0081"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a7\u0007\u0006\u0000\u0000\u02a7\u0083"+
		"\u0001\u0000\u0000\u0000\u02a8\u02a9\u0005\r\u0000\u0000\u02a9\u02aa\u0003"+
		"D\"\u0000\u02aa\u02ab\u0005\u000e\u0000\u0000\u02ab\u0085\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ad\u0007\u0007\u0000\u0000\u02ad\u02ae\u0005\r\u0000"+
		"\u0000\u02ae\u02af\u0003\u008eG\u0000\u02af\u02b0\u0005\u000e\u0000\u0000"+
		"\u02b0\u0087\u0001\u0000\u0000\u0000\u02b1\u02b3\u0005\u0011\u0000\u0000"+
		"\u02b2\u02b4\u0003r9\u0000\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b3\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b7"+
		"\u0003\u008aE\u0000\u02b6\u02b8\u0003@ \u0000\u02b7\u02b6\u0001\u0000"+
		"\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000"+
		"\u0000\u0000\u02b9\u02ba\u0005\u001b\u0000\u0000\u02ba\u02bb\u0003D\""+
		"\u0000\u02bb\u02bc\u0005\u0012\u0000\u0000\u02bc\u0089\u0001\u0000\u0000"+
		"\u0000\u02bd\u02bf\u0003n7\u0000\u02be\u02c0\u0003j5\u0000\u02bf\u02be"+
		"\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u02bf"+
		"\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u008b"+
		"\u0001\u0000\u0000\u0000\u02c3\u02c4\u0005\u0011\u0000\u0000\u02c4\u02c7"+
		"\u0003\u008eG\u0000\u02c5\u02c6\u0005\u001b\u0000\u0000\u02c6\u02c8\u0003"+
		"D\"\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000"+
		"\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9\u02ca\u0005\u0012"+
		"\u0000\u0000\u02ca\u008d\u0001\u0000\u0000\u0000\u02cb\u02cc\u0003\u00ae"+
		"W\u0000\u02cc\u02cd\u0005d\u0000\u0000\u02cd\u02cf\u0003D\"\u0000\u02ce"+
		"\u02d0\u0003@ \u0000\u02cf\u02ce\u0001\u0000\u0000\u0000\u02cf\u02d0\u0001"+
		"\u0000\u0000\u0000\u02d0\u008f\u0001\u0000\u0000\u0000\u02d1\u02d2\u0005"+
		"!\u0000\u0000\u02d2\u02d3\u0005\r\u0000\u0000\u02d3\u02d4\u0005\u0018"+
		"\u0000\u0000\u02d4\u02d5\u0005\u000e\u0000\u0000\u02d5\u0091\u0001\u0000"+
		"\u0000\u0000\u02d6\u02db\u0003D\"\u0000\u02d7\u02d8\u0005\f\u0000\u0000"+
		"\u02d8\u02da\u0003D\"\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02da"+
		"\u02dd\u0001\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02db"+
		"\u02dc\u0001\u0000\u0000\u0000\u02dc\u0093\u0001\u0000\u0000\u0000\u02dd"+
		"\u02db\u0001\u0000\u0000\u0000\u02de\u02e0\u0005r\u0000\u0000\u02df\u02e1"+
		"\u0003D\"\u0000\u02e0\u02df\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e7\u0001\u0000\u0000\u0000\u02e2\u02e3\u0005"+
		"s\u0000\u0000\u02e3\u02e4\u0003D\"\u0000\u02e4\u02e5\u0005t\u0000\u0000"+
		"\u02e5\u02e6\u0003D\"\u0000\u02e6\u02e8\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e2\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9"+
		"\u02e7\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea"+
		"\u02ed\u0001\u0000\u0000\u0000\u02eb\u02ec\u0005u\u0000\u0000\u02ec\u02ee"+
		"\u0003D\"\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001"+
		"\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f0\u0005"+
		"v\u0000\u0000\u02f0\u0095\u0001\u0000\u0000\u0000\u02f1\u02f2\u0005;\u0000"+
		"\u0000\u02f2\u02f3\u0005\r\u0000\u0000\u02f3\u02f4\u0003r9\u0000\u02f4"+
		"\u02f5\u0003D\"\u0000\u02f5\u02f6\u0005\f\u0000\u0000\u02f6\u02f7\u0003"+
		"\u00aeW\u0000\u02f7\u02f8\u0005d\u0000\u0000\u02f8\u02f9\u0003D\"\u0000"+
		"\u02f9\u02fa\u0005\u001b\u0000\u0000\u02fa\u02fb\u0003D\"\u0000\u02fb"+
		"\u02fc\u0005\u000e\u0000\u0000\u02fc\u0097\u0001\u0000\u0000\u0000\u02fd"+
		"\u0300\u0005\u001c\u0000\u0000\u02fe\u0301\u0003\u00aeW\u0000\u02ff\u0301"+
		"\u0003\u00a0P\u0000\u0300\u02fe\u0001\u0000\u0000\u0000\u0300\u02ff\u0001"+
		"\u0000\u0000\u0000\u0301\u0099\u0001\u0000\u0000\u0000\u0302\u030a\u0003"+
		"\u009eO\u0000\u0303\u030a\u0003\u00a4R\u0000\u0304\u030a\u0003\u00a2Q"+
		"\u0000\u0305\u030a\u0003\u00a0P\u0000\u0306\u030a\u0005l\u0000\u0000\u0307"+
		"\u030a\u0003\u00a6S\u0000\u0308\u030a\u0003\u00a8T\u0000\u0309\u0302\u0001"+
		"\u0000\u0000\u0000\u0309\u0303\u0001\u0000\u0000\u0000\u0309\u0304\u0001"+
		"\u0000\u0000\u0000\u0309\u0305\u0001\u0000\u0000\u0000\u0309\u0306\u0001"+
		"\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000\u0309\u0308\u0001"+
		"\u0000\u0000\u0000\u030a\u009b\u0001\u0000\u0000\u0000\u030b\u030d\u0005"+
		"\u0018\u0000\u0000\u030c\u030e\u0003\u00a0P\u0000\u030d\u030c\u0001\u0000"+
		"\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u0313\u0001\u0000"+
		"\u0000\u0000\u030f\u0311\u0005\t\u0000\u0000\u0310\u0312\u0003\u00a0P"+
		"\u0000\u0311\u0310\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000"+
		"\u0000\u0312\u0314\u0001\u0000\u0000\u0000\u0313\u030f\u0001\u0000\u0000"+
		"\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u009d\u0001\u0000\u0000"+
		"\u0000\u0315\u0316\u0007\b\u0000\u0000\u0316\u009f\u0001\u0000\u0000\u0000"+
		"\u0317\u0318\u0005\u0080\u0000\u0000\u0318\u00a1\u0001\u0000\u0000\u0000"+
		"\u0319\u031a\u0005\u007f\u0000\u0000\u031a\u00a3\u0001\u0000\u0000\u0000"+
		"\u031b\u031c\u0005~\u0000\u0000\u031c\u00a5\u0001\u0000\u0000\u0000\u031d"+
		"\u031f\u0005\u0011\u0000\u0000\u031e\u0320\u0003\u0092I\u0000\u031f\u031e"+
		"\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320\u0321"+
		"\u0001\u0000\u0000\u0000\u0321\u0322\u0005\u0012\u0000\u0000\u0322\u00a7"+
		"\u0001\u0000\u0000\u0000\u0323\u032c\u0005\u000f\u0000\u0000\u0324\u0329"+
		"\u0003\u00aaU\u0000\u0325\u0326\u0005\f\u0000\u0000\u0326\u0328\u0003"+
		"\u00aaU\u0000\u0327\u0325\u0001\u0000\u0000\u0000\u0328\u032b\u0001\u0000"+
		"\u0000\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000"+
		"\u0000\u0000\u032a\u032d\u0001\u0000\u0000\u0000\u032b\u0329\u0001\u0000"+
		"\u0000\u0000\u032c\u0324\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000"+
		"\u0000\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u0336\u0005\u0010"+
		"\u0000\u0000\u032f\u0330\u0003\u00aeW\u0000\u0330\u0331\u0005\u000f\u0000"+
		"\u0000\u0331\u0332\u0005\u000b\u0000\u0000\u0332\u0333\u0003\u00aeW\u0000"+
		"\u0333\u0334\u0005\u0010\u0000\u0000\u0334\u0336\u0001\u0000\u0000\u0000"+
		"\u0335\u0323\u0001\u0000\u0000\u0000\u0335\u032f\u0001\u0000\u0000\u0000"+
		"\u0336\u00a9\u0001\u0000\u0000\u0000\u0337\u0338\u0003\u00acV\u0000\u0338"+
		"\u0339\u0005\u001a\u0000\u0000\u0339\u033a\u0003D\"\u0000\u033a\u00ab"+
		"\u0001\u0000\u0000\u0000\u033b\u033e\u0003\u00aeW\u0000\u033c\u033e\u0003"+
		"\u00b0X\u0000\u033d\u033b\u0001\u0000\u0000\u0000\u033d\u033c\u0001\u0000"+
		"\u0000\u0000\u033e\u00ad\u0001\u0000\u0000\u0000\u033f\u0340\u0007\t\u0000"+
		"\u0000\u0340\u00af\u0001\u0000\u0000\u0000\u0341\u0342\u0007\n\u0000\u0000"+
		"\u0342\u00b1\u0001\u0000\u0000\u0000c\u00b4\u00b9\u00bf\u00c5\u00c7\u00cb"+
		"\u00d3\u00dc\u00e0\u00e3\u00e6\u00ea\u00f0\u00f6\u00fa\u0103\u0107\u0114"+
		"\u011c\u011f\u012a\u0136\u013f\u0148\u0151\u0155\u015a\u0163\u0170\u017e"+
		"\u0184\u018b\u0195\u019d\u01a5\u01ad\u01b1\u01bb\u01c5\u01cd\u01d5\u01d9"+
		"\u01e1\u01e3\u01ea\u01ee\u01f1\u01f4\u01fe\u0202\u0208\u020f\u0215\u021d"+
		"\u0224\u022b\u022f\u0232\u0235\u0247\u024f\u0253\u0257\u025b\u025d\u0261"+
		"\u0264\u0267\u026a\u0272\u0277\u027c\u0284\u0286\u028a\u0292\u0294\u0298"+
		"\u029f\u02a2\u02b3\u02b7\u02c1\u02c7\u02cf\u02db\u02e0\u02e9\u02ed\u0300"+
		"\u0309\u030d\u0311\u0313\u031f\u0329\u032c\u0335\u033d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}