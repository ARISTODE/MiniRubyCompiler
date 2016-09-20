// Generated from Ry.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITERAL=1, COMMA=2, SEMICOLON=3, CRLF=4, END=5, IF=6, ELSE=7, ELSIF=8, 
		UNLESS=9, WHILE=10, RETRY=11, BREAK=12, FOR=13, TRUE=14, FALSE=15, PLUS=16, 
		MINUS=17, MUL=18, DIV=19, MOD=20, EXP=21, ASSIGN=22, PLUS_ASSIGN=23, MINUS_ASSIGN=24, 
		MUL_ASSIGN=25, DIV_ASSIGN=26, MOD_ASSIGN=27, EXP_ASSIGN=28, EQUAL=29, 
		NOT_EQUAL=30, GREATER=31, LESS=32, LESS_EQUAL=33, GREATER_EQUAL=34, AND=35, 
		OR=36, NOT=37, IN=38, DOTS=39, LEFT_RBRACKET=40, RIGHT_RBRACKET=41, LEFT_SBRACKET=42, 
		RIGHT_SBRACKET=43, NIL=44, SL_COMMENT=45, ML_COMMENT=46, WS=47, INT=48, 
		FLOAT=49, ID=50;
	public static final int
		RULE_prog = 0, RULE_expression_list = 1, RULE_expression = 2, RULE_all_result = 3, 
		RULE_while_statement = 4, RULE_for_statement = 5, RULE_elsif_statement = 6, 
		RULE_if_elsif_statement = 7, RULE_if_statement = 8, RULE_all_assignment = 9, 
		RULE_cond_expression = 10, RULE_statement_body = 11, RULE_statement_expression_list = 12, 
		RULE_assignment = 13, RULE_dynamic_assignment = 14, RULE_int_assignment = 15, 
		RULE_float_assignment = 16, RULE_string_assignment = 17, RULE_dynamic_result = 18, 
		RULE_dynamic = 19, RULE_int_result = 20, RULE_float_result = 21, RULE_string_result = 22, 
		RULE_comparison_list = 23, RULE_comparison = 24, RULE_comp_var = 25, RULE_lvalue = 26, 
		RULE_rvalue = 27, RULE_literal_t = 28, RULE_float_t = 29, RULE_int_t = 30, 
		RULE_bool_t = 31, RULE_nil_t = 32, RULE_id = 33, RULE_terminator = 34, 
		RULE_else_token = 35, RULE_crlf = 36;
	public static final String[] ruleNames = {
		"prog", "expression_list", "expression", "all_result", "while_statement", 
		"for_statement", "elsif_statement", "if_elsif_statement", "if_statement", 
		"all_assignment", "cond_expression", "statement_body", "statement_expression_list", 
		"assignment", "dynamic_assignment", "int_assignment", "float_assignment", 
		"string_assignment", "dynamic_result", "dynamic", "int_result", "float_result", 
		"string_result", "comparison_list", "comparison", "comp_var", "lvalue", 
		"rvalue", "literal_t", "float_t", "int_t", "bool_t", "nil_t", "id", "terminator", 
		"else_token", "crlf"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "','", "';'", "'\n'", "'end'", "'if'", "'else'", "'elsif'", 
		"'unless'", "'while'", "'retry'", "'break'", "'for'", "'true'", "'false'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'='", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'**='", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", 
		null, null, null, "'in'", "'..'", "'('", "')'", "'['", "']'", "'nil'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "END", "IF", "ELSE", "ELSIF", 
		"UNLESS", "WHILE", "RETRY", "BREAK", "FOR", "TRUE", "FALSE", "PLUS", "MINUS", 
		"MUL", "DIV", "MOD", "EXP", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "EQUAL", "NOT_EQUAL", "GREATER", 
		"LESS", "LESS_EQUAL", "GREATER_EQUAL", "AND", "OR", "NOT", "IN", "DOTS", 
		"LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", 
		"NIL", "SL_COMMENT", "ML_COMMENT", "WS", "INT", "FLOAT", "ID"
	};
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
	public String getGrammarFileName() { return "Ry.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			expression_list(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitExpression_list(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		return expression_list(0);
	}

	private Expression_listContext expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_listContext _localctx = new Expression_listContext(_ctx, _parentState);
		Expression_listContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			switch (_input.LA(1)) {
			case LITERAL:
			case IF:
			case WHILE:
			case FOR:
			case TRUE:
			case FALSE:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
				{
				setState(77);
				expression();
				setState(78);
				terminator(0);
				}
				break;
			case SEMICOLON:
			case CRLF:
				{
				setState(80);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(83);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(84);
					expression();
					setState(85);
					terminator(0);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				for_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				while_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				comparison_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				rvalue(0);
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

	public static class All_resultContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public All_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterAll_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitAll_result(this);
		}
	}

	public final All_resultContext all_result() throws RecognitionException {
		All_resultContext _localctx = new All_resultContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_all_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(99);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(100);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(101);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(102);
				dynamic_result(0);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RyParser.WHILE, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RyParser.END, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(WHILE);
			setState(106);
			cond_expression();
			setState(107);
			crlf();
			setState(108);
			statement_body();
			setState(109);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(RyParser.FOR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode IN() { return getToken(RyParser.IN, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RyParser.LEFT_RBRACKET, 0); }
		public List<Int_tContext> int_t() {
			return getRuleContexts(Int_tContext.class);
		}
		public Int_tContext int_t(int i) {
			return getRuleContext(Int_tContext.class,i);
		}
		public TerminalNode DOTS() { return getToken(RyParser.DOTS, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RyParser.RIGHT_RBRACKET, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RyParser.END, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(FOR);
			setState(112);
			id();
			setState(113);
			match(IN);
			setState(114);
			match(LEFT_RBRACKET);
			setState(115);
			int_t();
			setState(116);
			match(DOTS);
			setState(117);
			int_t();
			setState(118);
			match(RIGHT_RBRACKET);
			setState(119);
			crlf();
			setState(120);
			statement_body();
			setState(121);
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

	public static class Elsif_statementContext extends ParserRuleContext {
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public Elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterElsif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitElsif_statement(this);
		}
	}

	public final Elsif_statementContext elsif_statement() throws RecognitionException {
		Elsif_statementContext _localctx = new Elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elsif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			if_elsif_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_elsif_statementContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(RyParser.ELSIF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public If_elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_elsif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterIf_elsif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitIf_elsif_statement(this);
		}
	}

	public final If_elsif_statementContext if_elsif_statement() throws RecognitionException {
		If_elsif_statementContext _localctx = new If_elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_elsif_statement);
		try {
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(ELSIF);
				setState(126);
				cond_expression();
				setState(127);
				crlf();
				setState(128);
				statement_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(ELSIF);
				setState(131);
				cond_expression();
				setState(132);
				crlf();
				setState(133);
				statement_body();
				setState(134);
				else_token();
				setState(135);
				crlf();
				setState(136);
				statement_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(ELSIF);
				setState(139);
				cond_expression();
				setState(140);
				crlf();
				setState(141);
				statement_body();
				setState(142);
				if_elsif_statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RyParser.IF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(RyParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_statement);
		try {
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(IF);
				setState(147);
				cond_expression();
				setState(148);
				crlf();
				setState(149);
				statement_body();
				setState(150);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(IF);
				setState(153);
				cond_expression();
				setState(154);
				crlf();
				setState(155);
				statement_body();
				setState(156);
				else_token();
				setState(157);
				crlf();
				setState(158);
				statement_body();
				setState(159);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(IF);
				setState(162);
				cond_expression();
				setState(163);
				crlf();
				setState(164);
				statement_body();
				setState(165);
				elsif_statement();
				setState(166);
				match(END);
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

	public static class All_assignmentContext extends ParserRuleContext {
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public All_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterAll_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitAll_assignment(this);
		}
	}

	public final All_assignmentContext all_assignment() throws RecognitionException {
		All_assignmentContext _localctx = new All_assignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_all_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(170);
				int_assignment();
				}
				break;
			case 2:
				{
				setState(171);
				float_assignment();
				}
				break;
			case 3:
				{
				setState(172);
				string_assignment();
				}
				break;
			case 4:
				{
				setState(173);
				dynamic_assignment();
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

	public static class Cond_expressionContext extends ParserRuleContext {
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public Cond_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterCond_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitCond_expression(this);
		}
	}

	public final Cond_expressionContext cond_expression() throws RecognitionException {
		Cond_expressionContext _localctx = new Cond_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cond_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			comparison_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_bodyContext extends ParserRuleContext {
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterStatement_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitStatement_body(this);
		}
	}

	public final Statement_bodyContext statement_body() throws RecognitionException {
		Statement_bodyContext _localctx = new Statement_bodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			statement_expression_list(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterStatement_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitStatement_expression_list(this);
		}
	}

	public final Statement_expression_listContext statement_expression_list() throws RecognitionException {
		return statement_expression_list(0);
	}

	private Statement_expression_listContext statement_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_expression_listContext _localctx = new Statement_expression_listContext(_ctx, _parentState);
		Statement_expression_listContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_statement_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(181);
			expression();
			setState(182);
			terminator(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Statement_expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
					setState(184);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(185);
					expression();
					setState(186);
					terminator(0);
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RyParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RyParser.EXP_ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		int _la;
		try {
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(194);
				((AssignmentContext)_localctx).op = match(ASSIGN);
				setState(195);
				rvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(198);
				((AssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((AssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(199);
				rvalue(0);
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

	public static class Dynamic_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RyParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RyParser.EXP_ASSIGN, 0); }
		public Dynamic_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterDynamic_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitDynamic_assignment(this);
		}
	}

	public final Dynamic_assignmentContext dynamic_assignment() throws RecognitionException {
		Dynamic_assignmentContext _localctx = new Dynamic_assignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dynamic_assignment);
		int _la;
		try {
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(204);
				((Dynamic_assignmentContext)_localctx).op = match(ASSIGN);
				setState(205);
				dynamic_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(208);
				((Dynamic_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Dynamic_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(209);
				dynamic_result(0);
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

	public static class Int_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RyParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RyParser.EXP_ASSIGN, 0); }
		public Int_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterInt_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitInt_assignment(this);
		}
	}

	public final Int_assignmentContext int_assignment() throws RecognitionException {
		Int_assignmentContext _localctx = new Int_assignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_int_assignment);
		int _la;
		try {
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(214);
				((Int_assignmentContext)_localctx).op = match(ASSIGN);
				setState(215);
				int_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(218);
				((Int_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Int_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(219);
				int_result(0);
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

	public static class Float_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RyParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RyParser.EXP_ASSIGN, 0); }
		public Float_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterFloat_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitFloat_assignment(this);
		}
	}

	public final Float_assignmentContext float_assignment() throws RecognitionException {
		Float_assignmentContext _localctx = new Float_assignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_float_assignment);
		int _la;
		try {
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(224);
				((Float_assignmentContext)_localctx).op = match(ASSIGN);
				setState(225);
				float_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(228);
				((Float_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Float_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(229);
				float_result(0);
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

	public static class String_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RyParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RyParser.PLUS_ASSIGN, 0); }
		public String_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterString_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitString_assignment(this);
		}
	}

	public final String_assignmentContext string_assignment() throws RecognitionException {
		String_assignmentContext _localctx = new String_assignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_string_assignment);
		try {
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(234);
				((String_assignmentContext)_localctx).op = match(ASSIGN);
				setState(235);
				string_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(238);
				((String_assignmentContext)_localctx).op = match(PLUS_ASSIGN);
				setState(239);
				string_result(0);
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

	public static class Dynamic_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Dynamic_resultContext> dynamic_result() {
			return getRuleContexts(Dynamic_resultContext.class);
		}
		public Dynamic_resultContext dynamic_result(int i) {
			return getRuleContext(Dynamic_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RyParser.MOD, 0); }
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(RyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RyParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RyParser.RIGHT_RBRACKET, 0); }
		public DynamicContext dynamic() {
			return getRuleContext(DynamicContext.class,0);
		}
		public Dynamic_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterDynamic_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitDynamic_result(this);
		}
	}

	public final Dynamic_resultContext dynamic_result() throws RecognitionException {
		return dynamic_result(0);
	}

	private Dynamic_resultContext dynamic_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dynamic_resultContext _localctx = new Dynamic_resultContext(_ctx, _parentState);
		Dynamic_resultContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_dynamic_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(244);
				int_result(0);
				setState(245);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(246);
				dynamic_result(13);
				}
				break;
			case 2:
				{
				setState(248);
				float_result(0);
				setState(249);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(250);
				dynamic_result(11);
				}
				break;
			case 3:
				{
				setState(252);
				string_result(0);
				setState(253);
				((Dynamic_resultContext)_localctx).op = match(MUL);
				setState(254);
				dynamic_result(8);
				}
				break;
			case 4:
				{
				setState(256);
				int_result(0);
				setState(257);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(258);
				dynamic_result(6);
				}
				break;
			case 5:
				{
				setState(260);
				float_result(0);
				setState(261);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(262);
				dynamic_result(4);
				}
				break;
			case 6:
				{
				setState(264);
				match(LEFT_RBRACKET);
				setState(265);
				dynamic_result(0);
				setState(266);
				match(RIGHT_RBRACKET);
				}
				break;
			case 7:
				{
				setState(268);
				dynamic();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(292);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(271);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(272);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(273);
						dynamic_result(11);
						}
						break;
					case 2:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(274);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(275);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(276);
						dynamic_result(4);
						}
						break;
					case 3:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(277);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(278);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(279);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(280);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(281);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(282);
						float_result(0);
						}
						break;
					case 5:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(283);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(284);
						((Dynamic_resultContext)_localctx).op = match(MUL);
						setState(285);
						string_result(0);
						}
						break;
					case 6:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(286);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(287);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(288);
						int_result(0);
						}
						break;
					case 7:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(289);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(290);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(291);
						float_result(0);
						}
						break;
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class DynamicContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DynamicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterDynamic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitDynamic(this);
		}
	}

	public final DynamicContext dynamic() throws RecognitionException {
		DynamicContext _localctx = new DynamicContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dynamic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_resultContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LEFT_RBRACKET() { return getToken(RyParser.LEFT_RBRACKET, 0); }
		public List<Int_resultContext> int_result() {
			return getRuleContexts(Int_resultContext.class);
		}
		public Int_resultContext int_result(int i) {
			return getRuleContext(Int_resultContext.class,i);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RyParser.RIGHT_RBRACKET, 0); }
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public TerminalNode MUL() { return getToken(RyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RyParser.MINUS, 0); }
		public Int_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterInt_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitInt_result(this);
		}
	}

	public final Int_resultContext int_result() throws RecognitionException {
		return int_result(0);
	}

	private Int_resultContext int_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Int_resultContext _localctx = new Int_resultContext(_ctx, _parentState);
		Int_resultContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_int_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
				{
				setState(300);
				match(LEFT_RBRACKET);
				setState(301);
				int_result(0);
				setState(302);
				match(RIGHT_RBRACKET);
				}
				break;
			case INT:
				{
				setState(304);
				int_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(313);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(307);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(308);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(309);
						int_result(5);
						}
						break;
					case 2:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(310);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(311);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(312);
						int_result(4);
						}
						break;
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class Float_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Float_resultContext> float_result() {
			return getRuleContexts(Float_resultContext.class);
		}
		public Float_resultContext float_result(int i) {
			return getRuleContext(Float_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RyParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RyParser.RIGHT_RBRACKET, 0); }
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Float_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterFloat_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitFloat_result(this);
		}
	}

	public final Float_resultContext float_result() throws RecognitionException {
		return float_result(0);
	}

	private Float_resultContext float_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Float_resultContext _localctx = new Float_resultContext(_ctx, _parentState);
		Float_resultContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_float_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(319);
				int_result(0);
				setState(320);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(321);
				float_result(7);
				}
				break;
			case 2:
				{
				setState(323);
				int_result(0);
				setState(324);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(325);
				float_result(4);
				}
				break;
			case 3:
				{
				setState(327);
				match(LEFT_RBRACKET);
				setState(328);
				float_result(0);
				setState(329);
				match(RIGHT_RBRACKET);
				}
				break;
			case 4:
				{
				setState(331);
				float_t();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(346);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(334);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(335);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(336);
						float_result(9);
						}
						break;
					case 2:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(337);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(338);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(339);
						float_result(6);
						}
						break;
					case 3:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(340);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(341);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(342);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(343);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(344);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(345);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class String_resultContext extends ParserRuleContext {
		public Token op;
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public List<String_resultContext> string_result() {
			return getRuleContexts(String_resultContext.class);
		}
		public String_resultContext string_result(int i) {
			return getRuleContext(String_resultContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(RyParser.PLUS, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public TerminalNode MUL() { return getToken(RyParser.MUL, 0); }
		public String_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterString_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitString_result(this);
		}
	}

	public final String_resultContext string_result() throws RecognitionException {
		return string_result(0);
	}

	private String_resultContext string_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_resultContext _localctx = new String_resultContext(_ctx, _parentState);
		String_resultContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_string_result, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(352);
			literal_t();
			}
			_ctx.stop = _input.LT(-1);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(360);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(354);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(355);
						((String_resultContext)_localctx).op = match(PLUS);
						setState(356);
						string_result(3);
						}
						break;
					case 2:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(357);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(358);
						((String_resultContext)_localctx).op = match(MUL);
						setState(359);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Comparison_listContext extends ParserRuleContext {
		public ComparisonContext left;
		public Token op;
		public Comparison_listContext right;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode AND() { return getToken(RyParser.AND, 0); }
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public TerminalNode OR() { return getToken(RyParser.OR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RyParser.RIGHT_RBRACKET, 0); }
		public Comparison_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterComparison_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitComparison_list(this);
		}
	}

	public final Comparison_listContext comparison_list() throws RecognitionException {
		Comparison_listContext _localctx = new Comparison_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparison_list);
		try {
			setState(378);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				((Comparison_listContext)_localctx).left = comparison();
				setState(366);
				((Comparison_listContext)_localctx).op = match(AND);
				setState(367);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				((Comparison_listContext)_localctx).left = comparison();
				setState(370);
				((Comparison_listContext)_localctx).op = match(OR);
				setState(371);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				match(LEFT_RBRACKET);
				setState(374);
				comparison_list();
				setState(375);
				match(RIGHT_RBRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public Comp_varContext left;
		public Token op;
		public Comp_varContext right;
		public List<Comp_varContext> comp_var() {
			return getRuleContexts(Comp_varContext.class);
		}
		public Comp_varContext comp_var(int i) {
			return getRuleContext(Comp_varContext.class,i);
		}
		public TerminalNode LESS() { return getToken(RyParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(RyParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(RyParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(RyParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(RyParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(RyParser.NOT_EQUAL, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comparison);
		int _la;
		try {
			setState(388);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				((ComparisonContext)_localctx).left = comp_var();
				setState(381);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(382);
				((ComparisonContext)_localctx).right = comp_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				((ComparisonContext)_localctx).left = comp_var();
				setState(385);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(386);
				((ComparisonContext)_localctx).right = comp_var();
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

	public static class Comp_varContext extends ParserRuleContext {
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Comp_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterComp_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitComp_var(this);
		}
	}

	public final Comp_varContext comp_var() throws RecognitionException {
		Comp_varContext _localctx = new Comp_varContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comp_var);
		try {
			setState(392);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				all_result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				id();
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

	public static class LvalueContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RvalueContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(RyParser.NOT, 0); }
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Bool_tContext bool_t() {
			return getRuleContext(Bool_tContext.class,0);
		}
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public Nil_tContext nil_t() {
			return getRuleContext(Nil_tContext.class,0);
		}
		public TerminalNode LEFT_RBRACKET() { return getToken(RyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RyParser.RIGHT_RBRACKET, 0); }
		public TerminalNode EXP() { return getToken(RyParser.EXP, 0); }
		public TerminalNode MUL() { return getToken(RyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RyParser.MINUS, 0); }
		public TerminalNode LESS() { return getToken(RyParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(RyParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(RyParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(RyParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(RyParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(RyParser.NOT_EQUAL, 0); }
		public TerminalNode OR() { return getToken(RyParser.OR, 0); }
		public TerminalNode AND() { return getToken(RyParser.AND, 0); }
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterRvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitRvalue(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		return rvalue(0);
	}

	private RvalueContext rvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RvalueContext _localctx = new RvalueContext(_ctx, _parentState);
		RvalueContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_rvalue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(397);
				match(NOT);
				setState(398);
				rvalue(7);
				}
				break;
			case 2:
				{
				setState(399);
				lvalue();
				}
				break;
			case 3:
				{
				setState(400);
				int_result(0);
				}
				break;
			case 4:
				{
				setState(401);
				float_result(0);
				}
				break;
			case 5:
				{
				setState(402);
				string_result(0);
				}
				break;
			case 6:
				{
				setState(403);
				dynamic_assignment();
				}
				break;
			case 7:
				{
				setState(404);
				string_assignment();
				}
				break;
			case 8:
				{
				setState(405);
				float_assignment();
				}
				break;
			case 9:
				{
				setState(406);
				int_assignment();
				}
				break;
			case 10:
				{
				setState(407);
				assignment();
				}
				break;
			case 11:
				{
				setState(408);
				literal_t();
				}
				break;
			case 12:
				{
				setState(409);
				bool_t();
				}
				break;
			case 13:
				{
				setState(410);
				float_t();
				}
				break;
			case 14:
				{
				setState(411);
				int_t();
				}
				break;
			case 15:
				{
				setState(412);
				nil_t();
				}
				break;
			case 16:
				{
				setState(413);
				match(LEFT_RBRACKET);
				setState(414);
				rvalue(0);
				setState(415);
				match(RIGHT_RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(437);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(419);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(420);
						match(EXP);
						setState(421);
						rvalue(9);
						}
						break;
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(422);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(423);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(424);
						rvalue(7);
						}
						break;
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(425);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(426);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(427);
						rvalue(6);
						}
						break;
					case 4:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(428);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(429);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(430);
						rvalue(5);
						}
						break;
					case 5:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(431);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(432);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(433);
						rvalue(4);
						}
						break;
					case 6:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(434);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(435);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(436);
						rvalue(3);
						}
						break;
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Literal_tContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(RyParser.LITERAL, 0); }
		public Literal_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterLiteral_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitLiteral_t(this);
		}
	}

	public final Literal_tContext literal_t() throws RecognitionException {
		Literal_tContext _localctx = new Literal_tContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_literal_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_tContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(RyParser.FLOAT, 0); }
		public Float_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterFloat_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitFloat_t(this);
		}
	}

	public final Float_tContext float_t() throws RecognitionException {
		Float_tContext _localctx = new Float_tContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_float_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_tContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RyParser.INT, 0); }
		public Int_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterInt_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitInt_t(this);
		}
	}

	public final Int_tContext int_t() throws RecognitionException {
		Int_tContext _localctx = new Int_tContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_int_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_tContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(RyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RyParser.FALSE, 0); }
		public Bool_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterBool_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitBool_t(this);
		}
	}

	public final Bool_tContext bool_t() throws RecognitionException {
		Bool_tContext _localctx = new Bool_tContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bool_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Nil_tContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(RyParser.NIL, 0); }
		public Nil_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterNil_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitNil_t(this);
		}
	}

	public final Nil_tContext nil_t() throws RecognitionException {
		Nil_tContext _localctx = new Nil_tContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_nil_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(NIL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RyParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(RyParser.SEMICOLON, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitTerminator(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		return terminator(0);
	}

	private TerminatorContext terminator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TerminatorContext _localctx = new TerminatorContext(_ctx, _parentState);
		TerminatorContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_terminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(455);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				{
				setState(456);
				crlf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(463);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(459);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(460);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(461);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(462);
						crlf();
						}
						break;
					}
					} 
				}
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class Else_tokenContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(RyParser.ELSE, 0); }
		public Else_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterElse_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitElse_token(this);
		}
	}

	public final Else_tokenContext else_token() throws RecognitionException {
		Else_tokenContext _localctx = new Else_tokenContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_else_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(ELSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrlfContext extends ParserRuleContext {
		public TerminalNode CRLF() { return getToken(RyParser.CRLF, 0); }
		public CrlfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crlf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).enterCrlf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RyListener ) ((RyListener)listener).exitCrlf(this);
		}
	}

	public final CrlfContext crlf() throws RecognitionException {
		CrlfContext _localctx = new CrlfContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_crlf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(CRLF);
			}
		}
		catch (RecognitionException re) {
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
		case 1:
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 12:
			return statement_expression_list_sempred((Statement_expression_listContext)_localctx, predIndex);
		case 18:
			return dynamic_result_sempred((Dynamic_resultContext)_localctx, predIndex);
		case 20:
			return int_result_sempred((Int_resultContext)_localctx, predIndex);
		case 21:
			return float_result_sempred((Float_resultContext)_localctx, predIndex);
		case 22:
			return string_result_sempred((String_resultContext)_localctx, predIndex);
		case 27:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		case 34:
			return terminator_sempred((TerminatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statement_expression_list_sempred(Statement_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dynamic_result_sempred(Dynamic_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean int_result_sempred(Int_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean float_result_sempred(Float_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 6);
		case 14:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean string_result_sempred(String_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean rvalue_sempred(RvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 8);
		case 18:
			return precpred(_ctx, 6);
		case 19:
			return precpred(_ctx, 5);
		case 20:
			return precpred(_ctx, 4);
		case 21:
			return precpred(_ctx, 3);
		case 22:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 4);
		case 24:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u01db\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3T\n"+
		"\3\3\3\3\3\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\4\3\4\3\4\3\4\3\4\5\4d\n"+
		"\4\3\5\3\5\3\5\3\5\5\5j\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0093\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00ab\n\n\3\13\3\13\3\13\3\13\5\13\u00b1\n\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00bf\n\16\f\16\16\16"+
		"\u00c2\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cc\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d6\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00e0\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00ea\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00f4\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0110\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0127\n\24\f\24"+
		"\16\24\u012a\13\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0134"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u013c\n\26\f\26\16\26\u013f\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\5\27\u014f\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u015d\n\27\f\27\16\27\u0160\13\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u016b\n\30\f\30\16\30\u016e\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u017d"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0187\n\32\3\33\3\33"+
		"\5\33\u018b\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01a4"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u01b8\n\35\f\35\16\35\u01bb\13\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\5$\u01cc\n$\3$\3$\3"+
		"$\3$\7$\u01d2\n$\f$\16$\u01d5\13$\3%\3%\3&\3&\3&\2\n\4\32&*,.8F\'\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\t"+
		"\3\2\31\36\3\2\24\26\3\2\22\23\3\2!$\3\2\37 \3\2%&\3\2\20\21\u0201\2L"+
		"\3\2\2\2\4S\3\2\2\2\6c\3\2\2\2\bi\3\2\2\2\nk\3\2\2\2\fq\3\2\2\2\16}\3"+
		"\2\2\2\20\u0092\3\2\2\2\22\u00aa\3\2\2\2\24\u00b0\3\2\2\2\26\u00b2\3\2"+
		"\2\2\30\u00b4\3\2\2\2\32\u00b6\3\2\2\2\34\u00cb\3\2\2\2\36\u00d5\3\2\2"+
		"\2 \u00df\3\2\2\2\"\u00e9\3\2\2\2$\u00f3\3\2\2\2&\u010f\3\2\2\2(\u012b"+
		"\3\2\2\2*\u0133\3\2\2\2,\u014e\3\2\2\2.\u0161\3\2\2\2\60\u017c\3\2\2\2"+
		"\62\u0186\3\2\2\2\64\u018a\3\2\2\2\66\u018c\3\2\2\28\u01a3\3\2\2\2:\u01bc"+
		"\3\2\2\2<\u01be\3\2\2\2>\u01c0\3\2\2\2@\u01c2\3\2\2\2B\u01c4\3\2\2\2D"+
		"\u01c6\3\2\2\2F\u01cb\3\2\2\2H\u01d6\3\2\2\2J\u01d8\3\2\2\2LM\5\4\3\2"+
		"M\3\3\2\2\2NO\b\3\1\2OP\5\6\4\2PQ\5F$\2QT\3\2\2\2RT\5F$\2SN\3\2\2\2SR"+
		"\3\2\2\2T[\3\2\2\2UV\f\4\2\2VW\5\6\4\2WX\5F$\2XZ\3\2\2\2YU\3\2\2\2Z]\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\5\3\2\2\2][\3\2\2\2^d\5\f\7\2_d\5\n\6\2"+
		"`d\5\22\n\2ad\5\60\31\2bd\58\35\2c^\3\2\2\2c_\3\2\2\2c`\3\2\2\2ca\3\2"+
		"\2\2cb\3\2\2\2d\7\3\2\2\2ej\5*\26\2fj\5,\27\2gj\5.\30\2hj\5&\24\2ie\3"+
		"\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\t\3\2\2\2kl\7\f\2\2lm\5\26\f\2m"+
		"n\5J&\2no\5\30\r\2op\7\7\2\2p\13\3\2\2\2qr\7\17\2\2rs\5D#\2st\7(\2\2t"+
		"u\7*\2\2uv\5> \2vw\7)\2\2wx\5> \2xy\7+\2\2yz\5J&\2z{\5\30\r\2{|\7\7\2"+
		"\2|\r\3\2\2\2}~\5\20\t\2~\17\3\2\2\2\177\u0080\7\n\2\2\u0080\u0081\5\26"+
		"\f\2\u0081\u0082\5J&\2\u0082\u0083\5\30\r\2\u0083\u0093\3\2\2\2\u0084"+
		"\u0085\7\n\2\2\u0085\u0086\5\26\f\2\u0086\u0087\5J&\2\u0087\u0088\5\30"+
		"\r\2\u0088\u0089\5H%\2\u0089\u008a\5J&\2\u008a\u008b\5\30\r\2\u008b\u0093"+
		"\3\2\2\2\u008c\u008d\7\n\2\2\u008d\u008e\5\26\f\2\u008e\u008f\5J&\2\u008f"+
		"\u0090\5\30\r\2\u0090\u0091\5\20\t\2\u0091\u0093\3\2\2\2\u0092\177\3\2"+
		"\2\2\u0092\u0084\3\2\2\2\u0092\u008c\3\2\2\2\u0093\21\3\2\2\2\u0094\u0095"+
		"\7\b\2\2\u0095\u0096\5\26\f\2\u0096\u0097\5J&\2\u0097\u0098\5\30\r\2\u0098"+
		"\u0099\7\7\2\2\u0099\u00ab\3\2\2\2\u009a\u009b\7\b\2\2\u009b\u009c\5\26"+
		"\f\2\u009c\u009d\5J&\2\u009d\u009e\5\30\r\2\u009e\u009f\5H%\2\u009f\u00a0"+
		"\5J&\2\u00a0\u00a1\5\30\r\2\u00a1\u00a2\7\7\2\2\u00a2\u00ab\3\2\2\2\u00a3"+
		"\u00a4\7\b\2\2\u00a4\u00a5\5\26\f\2\u00a5\u00a6\5J&\2\u00a6\u00a7\5\30"+
		"\r\2\u00a7\u00a8\5\16\b\2\u00a8\u00a9\7\7\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u0094\3\2\2\2\u00aa\u009a\3\2\2\2\u00aa\u00a3\3\2\2\2\u00ab\23\3\2\2"+
		"\2\u00ac\u00b1\5 \21\2\u00ad\u00b1\5\"\22\2\u00ae\u00b1\5$\23\2\u00af"+
		"\u00b1\5\36\20\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3"+
		"\2\2\2\u00b0\u00af\3\2\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\5\60\31\2\u00b3"+
		"\27\3\2\2\2\u00b4\u00b5\5\32\16\2\u00b5\31\3\2\2\2\u00b6\u00b7\b\16\1"+
		"\2\u00b7\u00b8\5\6\4\2\u00b8\u00b9\5F$\2\u00b9\u00c0\3\2\2\2\u00ba\u00bb"+
		"\f\3\2\2\u00bb\u00bc\5\6\4\2\u00bc\u00bd\5F$\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00ba\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\33\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\5\66\34\2\u00c4"+
		"\u00c5\7\30\2\2\u00c5\u00c6\58\35\2\u00c6\u00cc\3\2\2\2\u00c7\u00c8\5"+
		"\66\34\2\u00c8\u00c9\t\2\2\2\u00c9\u00ca\58\35\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c3\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc\35\3\2\2\2\u00cd\u00ce\5\66\34"+
		"\2\u00ce\u00cf\7\30\2\2\u00cf\u00d0\5&\24\2\u00d0\u00d6\3\2\2\2\u00d1"+
		"\u00d2\5\66\34\2\u00d2\u00d3\t\2\2\2\u00d3\u00d4\5&\24\2\u00d4\u00d6\3"+
		"\2\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d6\37\3\2\2\2\u00d7"+
		"\u00d8\5\66\34\2\u00d8\u00d9\7\30\2\2\u00d9\u00da\5*\26\2\u00da\u00e0"+
		"\3\2\2\2\u00db\u00dc\5\66\34\2\u00dc\u00dd\t\2\2\2\u00dd\u00de\5*\26\2"+
		"\u00de\u00e0\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00db\3\2\2\2\u00e0!\3"+
		"\2\2\2\u00e1\u00e2\5\66\34\2\u00e2\u00e3\7\30\2\2\u00e3\u00e4\5,\27\2"+
		"\u00e4\u00ea\3\2\2\2\u00e5\u00e6\5\66\34\2\u00e6\u00e7\t\2\2\2\u00e7\u00e8"+
		"\5,\27\2\u00e8\u00ea\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e5\3\2\2\2\u00ea"+
		"#\3\2\2\2\u00eb\u00ec\5\66\34\2\u00ec\u00ed\7\30\2\2\u00ed\u00ee\5.\30"+
		"\2\u00ee\u00f4\3\2\2\2\u00ef\u00f0\5\66\34\2\u00f0\u00f1\7\31\2\2\u00f1"+
		"\u00f2\5.\30\2\u00f2\u00f4\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00ef\3\2"+
		"\2\2\u00f4%\3\2\2\2\u00f5\u00f6\b\24\1\2\u00f6\u00f7\5*\26\2\u00f7\u00f8"+
		"\t\3\2\2\u00f8\u00f9\5&\24\17\u00f9\u0110\3\2\2\2\u00fa\u00fb\5,\27\2"+
		"\u00fb\u00fc\t\3\2\2\u00fc\u00fd\5&\24\r\u00fd\u0110\3\2\2\2\u00fe\u00ff"+
		"\5.\30\2\u00ff\u0100\7\24\2\2\u0100\u0101\5&\24\n\u0101\u0110\3\2\2\2"+
		"\u0102\u0103\5*\26\2\u0103\u0104\t\4\2\2\u0104\u0105\5&\24\b\u0105\u0110"+
		"\3\2\2\2\u0106\u0107\5,\27\2\u0107\u0108\t\4\2\2\u0108\u0109\5&\24\6\u0109"+
		"\u0110\3\2\2\2\u010a\u010b\7*\2\2\u010b\u010c\5&\24\2\u010c\u010d\7+\2"+
		"\2\u010d\u0110\3\2\2\2\u010e\u0110\5(\25\2\u010f\u00f5\3\2\2\2\u010f\u00fa"+
		"\3\2\2\2\u010f\u00fe\3\2\2\2\u010f\u0102\3\2\2\2\u010f\u0106\3\2\2\2\u010f"+
		"\u010a\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0128\3\2\2\2\u0111\u0112\f\f"+
		"\2\2\u0112\u0113\t\3\2\2\u0113\u0127\5&\24\r\u0114\u0115\f\5\2\2\u0115"+
		"\u0116\t\4\2\2\u0116\u0127\5&\24\6\u0117\u0118\f\20\2\2\u0118\u0119\t"+
		"\3\2\2\u0119\u0127\5*\26\2\u011a\u011b\f\16\2\2\u011b\u011c\t\3\2\2\u011c"+
		"\u0127\5,\27\2\u011d\u011e\f\13\2\2\u011e\u011f\7\24\2\2\u011f\u0127\5"+
		".\30\2\u0120\u0121\f\t\2\2\u0121\u0122\t\4\2\2\u0122\u0127\5*\26\2\u0123"+
		"\u0124\f\7\2\2\u0124\u0125\t\4\2\2\u0125\u0127\5,\27\2\u0126\u0111\3\2"+
		"\2\2\u0126\u0114\3\2\2\2\u0126\u0117\3\2\2\2\u0126\u011a\3\2\2\2\u0126"+
		"\u011d\3\2\2\2\u0126\u0120\3\2\2\2\u0126\u0123\3\2\2\2\u0127\u012a\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\'\3\2\2\2\u012a\u0128"+
		"\3\2\2\2\u012b\u012c\5D#\2\u012c)\3\2\2\2\u012d\u012e\b\26\1\2\u012e\u012f"+
		"\7*\2\2\u012f\u0130\5*\26\2\u0130\u0131\7+\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0134\5> \2\u0133\u012d\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u013d\3\2\2"+
		"\2\u0135\u0136\f\6\2\2\u0136\u0137\t\3\2\2\u0137\u013c\5*\26\7\u0138\u0139"+
		"\f\5\2\2\u0139\u013a\t\4\2\2\u013a\u013c\5*\26\6\u013b\u0135\3\2\2\2\u013b"+
		"\u0138\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e+\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\b\27\1\2\u0141\u0142"+
		"\5*\26\2\u0142\u0143\t\3\2\2\u0143\u0144\5,\27\t\u0144\u014f\3\2\2\2\u0145"+
		"\u0146\5*\26\2\u0146\u0147\t\4\2\2\u0147\u0148\5,\27\6\u0148\u014f\3\2"+
		"\2\2\u0149\u014a\7*\2\2\u014a\u014b\5,\27\2\u014b\u014c\7+\2\2\u014c\u014f"+
		"\3\2\2\2\u014d\u014f\5<\37\2\u014e\u0140\3\2\2\2\u014e\u0145\3\2\2\2\u014e"+
		"\u0149\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u015e\3\2\2\2\u0150\u0151\f\n"+
		"\2\2\u0151\u0152\t\3\2\2\u0152\u015d\5,\27\13\u0153\u0154\f\7\2\2\u0154"+
		"\u0155\t\4\2\2\u0155\u015d\5,\27\b\u0156\u0157\f\b\2\2\u0157\u0158\t\3"+
		"\2\2\u0158\u015d\5*\26\2\u0159\u015a\f\5\2\2\u015a\u015b\t\4\2\2\u015b"+
		"\u015d\5*\26\2\u015c\u0150\3\2\2\2\u015c\u0153\3\2\2\2\u015c\u0156\3\2"+
		"\2\2\u015c\u0159\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f-\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\b\30\1\2"+
		"\u0162\u0163\5:\36\2\u0163\u016c\3\2\2\2\u0164\u0165\f\4\2\2\u0165\u0166"+
		"\7\22\2\2\u0166\u016b\5.\30\5\u0167\u0168\f\5\2\2\u0168\u0169\7\24\2\2"+
		"\u0169\u016b\5*\26\2\u016a\u0164\3\2\2\2\u016a\u0167\3\2\2\2\u016b\u016e"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d/\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016f\u0170\5\62\32\2\u0170\u0171\7%\2\2\u0171\u0172\5"+
		"\60\31\2\u0172\u017d\3\2\2\2\u0173\u0174\5\62\32\2\u0174\u0175\7&\2\2"+
		"\u0175\u0176\5\60\31\2\u0176\u017d\3\2\2\2\u0177\u0178\7*\2\2\u0178\u0179"+
		"\5\60\31\2\u0179\u017a\7+\2\2\u017a\u017d\3\2\2\2\u017b\u017d\5\62\32"+
		"\2\u017c\u016f\3\2\2\2\u017c\u0173\3\2\2\2\u017c\u0177\3\2\2\2\u017c\u017b"+
		"\3\2\2\2\u017d\61\3\2\2\2\u017e\u017f\5\64\33\2\u017f\u0180\t\5\2\2\u0180"+
		"\u0181\5\64\33\2\u0181\u0187\3\2\2\2\u0182\u0183\5\64\33\2\u0183\u0184"+
		"\t\6\2\2\u0184\u0185\5\64\33\2\u0185\u0187\3\2\2\2\u0186\u017e\3\2\2\2"+
		"\u0186\u0182\3\2\2\2\u0187\63\3\2\2\2\u0188\u018b\5\b\5\2\u0189\u018b"+
		"\5D#\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b\65\3\2\2\2\u018c"+
		"\u018d\5D#\2\u018d\67\3\2\2\2\u018e\u018f\b\35\1\2\u018f\u0190\7\'\2\2"+
		"\u0190\u01a4\58\35\t\u0191\u01a4\5\66\34\2\u0192\u01a4\5*\26\2\u0193\u01a4"+
		"\5,\27\2\u0194\u01a4\5.\30\2\u0195\u01a4\5\36\20\2\u0196\u01a4\5$\23\2"+
		"\u0197\u01a4\5\"\22\2\u0198\u01a4\5 \21\2\u0199\u01a4\5\34\17\2\u019a"+
		"\u01a4\5:\36\2\u019b\u01a4\5@!\2\u019c\u01a4\5<\37\2\u019d\u01a4\5> \2"+
		"\u019e\u01a4\5B\"\2\u019f\u01a0\7*\2\2\u01a0\u01a1\58\35\2\u01a1\u01a2"+
		"\7+\2\2\u01a2\u01a4\3\2\2\2\u01a3\u018e\3\2\2\2\u01a3\u0191\3\2\2\2\u01a3"+
		"\u0192\3\2\2\2\u01a3\u0193\3\2\2\2\u01a3\u0194\3\2\2\2\u01a3\u0195\3\2"+
		"\2\2\u01a3\u0196\3\2\2\2\u01a3\u0197\3\2\2\2\u01a3\u0198\3\2\2\2\u01a3"+
		"\u0199\3\2\2\2\u01a3\u019a\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u019c\3\2"+
		"\2\2\u01a3\u019d\3\2\2\2\u01a3\u019e\3\2\2\2\u01a3\u019f\3\2\2\2\u01a4"+
		"\u01b9\3\2\2\2\u01a5\u01a6\f\n\2\2\u01a6\u01a7\7\27\2\2\u01a7\u01b8\5"+
		"8\35\13\u01a8\u01a9\f\b\2\2\u01a9\u01aa\t\3\2\2\u01aa\u01b8\58\35\t\u01ab"+
		"\u01ac\f\7\2\2\u01ac\u01ad\t\4\2\2\u01ad\u01b8\58\35\b\u01ae\u01af\f\6"+
		"\2\2\u01af\u01b0\t\5\2\2\u01b0\u01b8\58\35\7\u01b1\u01b2\f\5\2\2\u01b2"+
		"\u01b3\t\6\2\2\u01b3\u01b8\58\35\6\u01b4\u01b5\f\4\2\2\u01b5\u01b6\t\7"+
		"\2\2\u01b6\u01b8\58\35\5\u01b7\u01a5\3\2\2\2\u01b7\u01a8\3\2\2\2\u01b7"+
		"\u01ab\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b7\u01b1\3\2\2\2\u01b7\u01b4\3\2"+
		"\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"9\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\7\3\2\2\u01bd;\3\2\2\2\u01be"+
		"\u01bf\7\63\2\2\u01bf=\3\2\2\2\u01c0\u01c1\7\62\2\2\u01c1?\3\2\2\2\u01c2"+
		"\u01c3\t\b\2\2\u01c3A\3\2\2\2\u01c4\u01c5\7.\2\2\u01c5C\3\2\2\2\u01c6"+
		"\u01c7\7\64\2\2\u01c7E\3\2\2\2\u01c8\u01c9\b$\1\2\u01c9\u01cc\7\5\2\2"+
		"\u01ca\u01cc\5J&\2\u01cb\u01c8\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01d3"+
		"\3\2\2\2\u01cd\u01ce\f\6\2\2\u01ce\u01d2\7\5\2\2\u01cf\u01d0\f\5\2\2\u01d0"+
		"\u01d2\5J&\2\u01d1\u01cd\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5\3\2\2"+
		"\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4G\3\2\2\2\u01d5\u01d3"+
		"\3\2\2\2\u01d6\u01d7\7\t\2\2\u01d7I\3\2\2\2\u01d8\u01d9\7\6\2\2\u01d9"+
		"K\3\2\2\2#S[ci\u0092\u00aa\u00b0\u00c0\u00cb\u00d5\u00df\u00e9\u00f3\u010f"+
		"\u0126\u0128\u0133\u013b\u013d\u014e\u015c\u015e\u016a\u016c\u017c\u0186"+
		"\u018a\u01a3\u01b7\u01b9\u01cb\u01d1\u01d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}