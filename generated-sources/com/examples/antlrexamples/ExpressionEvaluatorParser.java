// Generated from com/examples/antlrexamples/ExpressionEvaluator.g4 by ANTLR 4.7
package com.examples.antlrexamples;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionEvaluatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ID=7, INT=8, NEWLINE=9, 
		WS=10;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_multExpr = 3, RULE_atom = 4;
	public static final String[] ruleNames = {
		"prog", "stat", "expr", "multExpr", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'+'", "'-'", "'*'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "ID", "INT", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "ExpressionEvaluator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();

	public ExpressionEvaluatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionEvaluatorListener ) ((ExpressionEvaluatorListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionEvaluatorListener ) ((ExpressionEvaluatorListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				stat();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << ID) | (1L << INT) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public ExprContext expr;
		public Token ID;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ExpressionEvaluatorParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(ExpressionEvaluatorParser.ID, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionEvaluatorListener ) ((ExpressionEvaluatorListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionEvaluatorListener ) ((ExpressionEvaluatorListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				((StatContext)_localctx).expr = expr();
				setState(16);
				match(NEWLINE);
				System.out.println(((StatContext)_localctx).expr.value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				((StatContext)_localctx).ID = match(ID);
				setState(20);
				match(T__0);
				setState(21);
				((StatContext)_localctx).expr = expr();
				setState(22);
				match(NEWLINE);
				memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), new Integer(((StatContext)_localctx).expr.value));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				match(NEWLINE);
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

	public static class ExprContext extends ParserRuleContext {
		public int value;
		public MultExprContext e;
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionEvaluatorListener ) ((ExpressionEvaluatorListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionEvaluatorListener ) ((ExpressionEvaluatorListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((ExprContext)_localctx).e = multExpr();
			((ExprContext)_localctx).value =  ((ExprContext)_localctx).e.value;
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__2) {
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(30);
					match(T__1);
					setState(31);
					((ExprContext)_localctx).e = multExpr();
					_localctx.value += ((ExprContext)_localctx).e.value;
					}
					break;
				case T__2:
					{
					setState(34);
					match(T__2);
					setState(35);
					((ExprContext)_localctx).e = multExpr();
					_localctx.value -= ((ExprContext)_localctx).e.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42);
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

	public static class MultExprContext extends ParserRuleContext {
		public int value;
		public AtomContext e;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionEvaluatorListener ) ((ExpressionEvaluatorListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionEvaluatorListener ) ((ExpressionEvaluatorListener)listener).exitMultExpr(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			((MultExprContext)_localctx).e = atom();
			((MultExprContext)_localctx).value =  ((MultExprContext)_localctx).e.value;
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(45);
				match(T__3);
				setState(46);
				((MultExprContext)_localctx).e = atom();
				_localctx.value *= ((MultExprContext)_localctx).e.value;
				}
				}
				setState(53);
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

	public static class AtomContext extends ParserRuleContext {
		public int value;
		public Token INT;
		public Token ID;
		public ExprContext e;
		public TerminalNode INT() { return getToken(ExpressionEvaluatorParser.INT, 0); }
		public TerminalNode ID() { return getToken(ExpressionEvaluatorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionEvaluatorListener ) ((ExpressionEvaluatorListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionEvaluatorListener ) ((ExpressionEvaluatorListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				((AtomContext)_localctx).INT = match(INT);
				((AtomContext)_localctx).value =  Integer.parseInt((((AtomContext)_localctx).INT!=null?((AtomContext)_localctx).INT.getText():null));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				((AtomContext)_localctx).ID = match(ID);

				        Integer v = (Integer)memory.get((((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				        if ( v!=null ) ((AtomContext)_localctx).value =  v.intValue();
				        else System.err.println("undefined variable "+(((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				        
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(T__4);
				setState(59);
				((AtomContext)_localctx).e = expr();
				setState(60);
				match(T__5);
				((AtomContext)_localctx).value =  ((AtomContext)_localctx).e.value;
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\fD\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\64\n\5"+
		"\f\5\16\5\67\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\6\2\2"+
		"\7\2\4\6\b\n\2\2\2F\2\r\3\2\2\2\4\34\3\2\2\2\6\36\3\2\2\2\b-\3\2\2\2\n"+
		"A\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3"+
		"\2\2\2\20\3\3\2\2\2\21\22\5\6\4\2\22\23\7\13\2\2\23\24\b\3\1\2\24\35\3"+
		"\2\2\2\25\26\7\t\2\2\26\27\7\3\2\2\27\30\5\6\4\2\30\31\7\13\2\2\31\32"+
		"\b\3\1\2\32\35\3\2\2\2\33\35\7\13\2\2\34\21\3\2\2\2\34\25\3\2\2\2\34\33"+
		"\3\2\2\2\35\5\3\2\2\2\36\37\5\b\5\2\37*\b\4\1\2 !\7\4\2\2!\"\5\b\5\2\""+
		"#\b\4\1\2#)\3\2\2\2$%\7\5\2\2%&\5\b\5\2&\'\b\4\1\2\')\3\2\2\2( \3\2\2"+
		"\2($\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\7\3\2\2\2,*\3\2\2\2-.\5\n"+
		"\6\2.\65\b\5\1\2/\60\7\6\2\2\60\61\5\n\6\2\61\62\b\5\1\2\62\64\3\2\2\2"+
		"\63/\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\t\3\2\2\2\67"+
		"\65\3\2\2\289\7\n\2\29B\b\6\1\2:;\7\t\2\2;B\b\6\1\2<=\7\7\2\2=>\5\6\4"+
		"\2>?\7\b\2\2?@\b\6\1\2@B\3\2\2\2A8\3\2\2\2A:\3\2\2\2A<\3\2\2\2B\13\3\2"+
		"\2\2\b\17\34(*\65A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}