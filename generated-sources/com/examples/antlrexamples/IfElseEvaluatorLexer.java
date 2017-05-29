// Generated from com/examples/antlrexamples/IfElseEvaluator.g4 by ANTLR 4.7
package com.examples.antlrexamples;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IfElseEvaluatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, INT=12, WS=13, ErrChar=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "ID", "INT", "WS", "ErrChar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'{'", "'}'", "'return'", "'true'", "'false'", 
		"'<='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "ID", 
		"INT", "WS", "ErrChar"
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


	public IfElseEvaluatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IfElseEvaluator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20h\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\7\fG\n\f\f"+
		"\f\16\fJ\13\f\3\f\6\fM\n\f\r\f\16\fN\3\f\6\fR\n\f\r\f\16\fS\3\f\7\fW\n"+
		"\f\f\f\16\fZ\13\f\5\f\\\n\f\3\r\6\r_\n\r\r\r\16\r`\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\3\2\7\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\5\2C\\aac|\5\2\13"+
		"\f\17\17\"\"\2m\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5\""+
		"\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r\62\3\2\2\2\17\67\3\2\2\2"+
		"\21=\3\2\2\2\23@\3\2\2\2\25B\3\2\2\2\27[\3\2\2\2\31^\3\2\2\2\33b\3\2\2"+
		"\2\35f\3\2\2\2\37 \7k\2\2 !\7h\2\2!\4\3\2\2\2\"#\7g\2\2#$\7n\2\2$%\7u"+
		"\2\2%&\7g\2\2&\6\3\2\2\2\'(\7}\2\2(\b\3\2\2\2)*\7\177\2\2*\n\3\2\2\2+"+
		",\7t\2\2,-\7g\2\2-.\7v\2\2./\7w\2\2/\60\7t\2\2\60\61\7p\2\2\61\f\3\2\2"+
		"\2\62\63\7v\2\2\63\64\7t\2\2\64\65\7w\2\2\65\66\7g\2\2\66\16\3\2\2\2\67"+
		"8\7h\2\289\7c\2\29:\7n\2\2:;\7u\2\2;<\7g\2\2<\20\3\2\2\2=>\7>\2\2>?\7"+
		"?\2\2?\22\3\2\2\2@A\7*\2\2A\24\3\2\2\2BC\7+\2\2C\26\3\2\2\2DH\t\2\2\2"+
		"EG\t\3\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\\\3\2\2\2JH\3\2\2"+
		"\2KM\t\4\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\t\5\2"+
		"\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TX\3\2\2\2UW\t\3\2\2VU\3\2\2"+
		"\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[D\3\2\2\2[L\3\2"+
		"\2\2\\\30\3\2\2\2]_\t\4\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\32"+
		"\3\2\2\2bc\t\6\2\2cd\3\2\2\2de\b\16\2\2e\34\3\2\2\2fg\13\2\2\2g\36\3\2"+
		"\2\2\t\2HNSX[`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}