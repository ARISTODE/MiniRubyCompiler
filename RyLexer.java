// Generated from Ry.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITERAL=1, COMMA=2, SEMICOLON=3, CRLF=4, END=5, DEF=6, IF=7, ELSE=8, ELSIF=9, 
		UNLESS=10, WHILE=11, RETRY=12, BREAK=13, FOR=14, TRUE=15, FALSE=16, PLUS=17, 
		MINUS=18, MUL=19, DIV=20, MOD=21, EXP=22, ASSIGN=23, PLUS_ASSIGN=24, MINUS_ASSIGN=25, 
		MUL_ASSIGN=26, DIV_ASSIGN=27, MOD_ASSIGN=28, EXP_ASSIGN=29, EQUAL=30, 
		NOT_EQUAL=31, GREATER=32, LESS=33, LESS_EQUAL=34, GREATER_EQUAL=35, AND=36, 
		OR=37, NOT=38, IN=39, DOTS=40, LEFT_RBRACKET=41, RIGHT_RBRACKET=42, LEFT_SBRACKET=43, 
		RIGHT_SBRACKET=44, NIL=45, RETURN=46, SL_COMMENT=47, ML_COMMENT=48, WS=49, 
		INT=50, FLOAT=51, ID=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ESCAPED_QUOTE", "LITERAL", "COMMA", "SEMICOLON", "CRLF", "END", "DEF", 
		"IF", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", "FOR", "TRUE", 
		"FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", "ASSIGN", "PLUS_ASSIGN", 
		"MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", 
		"EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", 
		"AND", "OR", "NOT", "IN", "DOTS", "LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", 
		"RIGHT_SBRACKET", "NIL", "RETURN", "SL_COMMENT", "ML_COMMENT", "WS", "INT", 
		"FLOAT", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "','", "';'", "'\n'", "'end'", "'def'", "'if'", "'else'", 
		"'elsif'", "'unless'", "'while'", "'retry'", "'break'", "'for'", "'true'", 
		"'false'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'='", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'**='", "'=='", "'!='", "'>'", "'<'", "'<='", 
		"'>='", null, null, null, "'in'", "'..'", "'('", "')'", "'['", "']'", 
		"'nil'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "END", "DEF", "IF", "ELSE", 
		"ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", "FOR", "TRUE", "FALSE", 
		"PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", "ASSIGN", "PLUS_ASSIGN", 
		"MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", 
		"EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", 
		"AND", "OR", "NOT", "IN", "DOTS", "LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", 
		"RIGHT_SBRACKET", "NIL", "RETURN", "SL_COMMENT", "ML_COMMENT", "WS", "INT", 
		"FLOAT", "ID"
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


	public RyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ry.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u0165\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\3\3\3\3\3\7\3t\n\3\f\3\16\3w\13"+
		"\3\3\3\3\3\3\3\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\3\5\3\u0083\n\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\5&\u0100\n&\3\'\3\'\3\'"+
		"\3\'\5\'\u0106\n\'\3(\3(\3(\3(\5(\u010c\n(\3)\3)\3)\3*\3*\3*\3+\3+\3,"+
		"\3,\3-\3-\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\7\61\u0129\n\61\f\61\16\61\u012c\13\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u013a\n\62\f\62\16\62\u013d\13"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\6\63\u0148\n\63\r\63"+
		"\16\63\u0149\3\63\3\63\3\64\6\64\u014f\n\64\r\64\16\64\u0150\3\65\7\65"+
		"\u0154\n\65\f\65\16\65\u0157\13\65\3\65\3\65\6\65\u015b\n\65\r\65\16\65"+
		"\u015c\3\66\3\66\7\66\u0161\n\66\f\66\16\66\u0164\13\66\5u~\u013b\2\67"+
		"\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37"+
		"\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36="+
		"\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66\3\2"+
		"\7\4\2\f\f\17\17\4\2\13\13\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\u0172"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5\u0082\3"+
		"\2\2\2\7\u0084\3\2\2\2\t\u0086\3\2\2\2\13\u0088\3\2\2\2\r\u008a\3\2\2"+
		"\2\17\u008e\3\2\2\2\21\u0092\3\2\2\2\23\u0095\3\2\2\2\25\u009a\3\2\2\2"+
		"\27\u00a0\3\2\2\2\31\u00a7\3\2\2\2\33\u00ad\3\2\2\2\35\u00b3\3\2\2\2\37"+
		"\u00b9\3\2\2\2!\u00bd\3\2\2\2#\u00c2\3\2\2\2%\u00c8\3\2\2\2\'\u00ca\3"+
		"\2\2\2)\u00cc\3\2\2\2+\u00ce\3\2\2\2-\u00d0\3\2\2\2/\u00d2\3\2\2\2\61"+
		"\u00d5\3\2\2\2\63\u00d7\3\2\2\2\65\u00da\3\2\2\2\67\u00dd\3\2\2\29\u00e0"+
		"\3\2\2\2;\u00e3\3\2\2\2=\u00e6\3\2\2\2?\u00ea\3\2\2\2A\u00ed\3\2\2\2C"+
		"\u00f0\3\2\2\2E\u00f2\3\2\2\2G\u00f4\3\2\2\2I\u00f7\3\2\2\2K\u00ff\3\2"+
		"\2\2M\u0105\3\2\2\2O\u010b\3\2\2\2Q\u010d\3\2\2\2S\u0110\3\2\2\2U\u0113"+
		"\3\2\2\2W\u0115\3\2\2\2Y\u0117\3\2\2\2[\u0119\3\2\2\2]\u011b\3\2\2\2_"+
		"\u011f\3\2\2\2a\u0126\3\2\2\2c\u0131\3\2\2\2e\u0147\3\2\2\2g\u014e\3\2"+
		"\2\2i\u0155\3\2\2\2k\u015e\3\2\2\2mn\7^\2\2no\7$\2\2o\4\3\2\2\2pu\7$\2"+
		"\2qt\5\3\2\2rt\n\2\2\2sq\3\2\2\2sr\3\2\2\2tw\3\2\2\2uv\3\2\2\2us\3\2\2"+
		"\2vx\3\2\2\2wu\3\2\2\2x\u0083\7$\2\2y~\7)\2\2z}\5\3\2\2{}\n\2\2\2|z\3"+
		"\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~\177\3\2\2\2~|\3\2\2\2\177\u0081\3\2\2"+
		"\2\u0080~\3\2\2\2\u0081\u0083\7)\2\2\u0082p\3\2\2\2\u0082y\3\2\2\2\u0083"+
		"\6\3\2\2\2\u0084\u0085\7.\2\2\u0085\b\3\2\2\2\u0086\u0087\7=\2\2\u0087"+
		"\n\3\2\2\2\u0088\u0089\7\f\2\2\u0089\f\3\2\2\2\u008a\u008b\7g\2\2\u008b"+
		"\u008c\7p\2\2\u008c\u008d\7f\2\2\u008d\16\3\2\2\2\u008e\u008f\7f\2\2\u008f"+
		"\u0090\7g\2\2\u0090\u0091\7h\2\2\u0091\20\3\2\2\2\u0092\u0093\7k\2\2\u0093"+
		"\u0094\7h\2\2\u0094\22\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097\7n\2\2\u0097"+
		"\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099\24\3\2\2\2\u009a\u009b\7g\2\2\u009b"+
		"\u009c\7n\2\2\u009c\u009d\7u\2\2\u009d\u009e\7k\2\2\u009e\u009f\7h\2\2"+
		"\u009f\26\3\2\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7"+
		"n\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7u\2\2\u00a6\30"+
		"\3\2\2\2\u00a7\u00a8\7y\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa\7k\2\2\u00aa"+
		"\u00ab\7n\2\2\u00ab\u00ac\7g\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7t\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7{\2\2"+
		"\u00b2\34\3\2\2\2\u00b3\u00b4\7d\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7"+
		"g\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7m\2\2\u00b8\36\3\2\2\2\u00b9\u00ba"+
		"\7h\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7t\2\2\u00bc \3\2\2\2\u00bd\u00be"+
		"\7v\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\"\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7n\2\2\u00c5"+
		"\u00c6\7u\2\2\u00c6\u00c7\7g\2\2\u00c7$\3\2\2\2\u00c8\u00c9\7-\2\2\u00c9"+
		"&\3\2\2\2\u00ca\u00cb\7/\2\2\u00cb(\3\2\2\2\u00cc\u00cd\7,\2\2\u00cd*"+
		"\3\2\2\2\u00ce\u00cf\7\61\2\2\u00cf,\3\2\2\2\u00d0\u00d1\7\'\2\2\u00d1"+
		".\3\2\2\2\u00d2\u00d3\7,\2\2\u00d3\u00d4\7,\2\2\u00d4\60\3\2\2\2\u00d5"+
		"\u00d6\7?\2\2\u00d6\62\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8\u00d9\7?\2\2\u00d9"+
		"\64\3\2\2\2\u00da\u00db\7/\2\2\u00db\u00dc\7?\2\2\u00dc\66\3\2\2\2\u00dd"+
		"\u00de\7,\2\2\u00de\u00df\7?\2\2\u00df8\3\2\2\2\u00e0\u00e1\7\61\2\2\u00e1"+
		"\u00e2\7?\2\2\u00e2:\3\2\2\2\u00e3\u00e4\7\'\2\2\u00e4\u00e5\7?\2\2\u00e5"+
		"<\3\2\2\2\u00e6\u00e7\7,\2\2\u00e7\u00e8\7,\2\2\u00e8\u00e9\7?\2\2\u00e9"+
		">\3\2\2\2\u00ea\u00eb\7?\2\2\u00eb\u00ec\7?\2\2\u00ec@\3\2\2\2\u00ed\u00ee"+
		"\7#\2\2\u00ee\u00ef\7?\2\2\u00efB\3\2\2\2\u00f0\u00f1\7@\2\2\u00f1D\3"+
		"\2\2\2\u00f2\u00f3\7>\2\2\u00f3F\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6H\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8\u00f9\7?\2\2\u00f9J\3"+
		"\2\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7p\2\2\u00fc\u0100\7f\2\2\u00fd"+
		"\u00fe\7(\2\2\u00fe\u0100\7(\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fd\3\2\2"+
		"\2\u0100L\3\2\2\2\u0101\u0102\7q\2\2\u0102\u0106\7t\2\2\u0103\u0104\7"+
		"~\2\2\u0104\u0106\7~\2\2\u0105\u0101\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"N\3\2\2\2\u0107\u0108\7p\2\2\u0108\u0109\7q\2\2\u0109\u010c\7v\2\2\u010a"+
		"\u010c\7#\2\2\u010b\u0107\3\2\2\2\u010b\u010a\3\2\2\2\u010cP\3\2\2\2\u010d"+
		"\u010e\7k\2\2\u010e\u010f\7p\2\2\u010fR\3\2\2\2\u0110\u0111\7\60\2\2\u0111"+
		"\u0112\7\60\2\2\u0112T\3\2\2\2\u0113\u0114\7*\2\2\u0114V\3\2\2\2\u0115"+
		"\u0116\7+\2\2\u0116X\3\2\2\2\u0117\u0118\7]\2\2\u0118Z\3\2\2\2\u0119\u011a"+
		"\7_\2\2\u011a\\\3\2\2\2\u011b\u011c\7p\2\2\u011c\u011d\7k\2\2\u011d\u011e"+
		"\7n\2\2\u011e^\3\2\2\2\u011f\u0120\7t\2\2\u0120\u0121\7g\2\2\u0121\u0122"+
		"\7v\2\2\u0122\u0123\7w\2\2\u0123\u0124\7t\2\2\u0124\u0125\7p\2\2\u0125"+
		"`\3\2\2\2\u0126\u012a\7%\2\2\u0127\u0129\n\2\2\2\u0128\u0127\3\2\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\f\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\b\61\2\2\u0130b\3\2\2\2\u0131\u0132\7?\2\2\u0132\u0133\7d\2\2\u0133"+
		"\u0134\7g\2\2\u0134\u0135\7i\2\2\u0135\u0136\7k\2\2\u0136\u0137\7p\2\2"+
		"\u0137\u013b\3\2\2\2\u0138\u013a\13\2\2\2\u0139\u0138\3\2\2\2\u013a\u013d"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013e\u013f\7?\2\2\u013f\u0140\7g\2\2\u0140\u0141\7p\2"+
		"\2\u0141\u0142\7f\2\2\u0142\u0143\7\f\2\2\u0143\u0144\3\2\2\2\u0144\u0145"+
		"\b\62\2\2\u0145d\3\2\2\2\u0146\u0148\t\3\2\2\u0147\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014c\b\63\2\2\u014cf\3\2\2\2\u014d\u014f\t\4\2\2\u014e\u014d"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"h\3\2\2\2\u0152\u0154\t\4\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2"+
		"\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0158\u015a\7\60\2\2\u0159\u015b\t\4\2\2\u015a\u0159\3\2\2\2"+
		"\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015dj\3"+
		"\2\2\2\u015e\u0162\t\5\2\2\u015f\u0161\t\6\2\2\u0160\u015f\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163l\3\2\2\2"+
		"\u0164\u0162\3\2\2\2\22\2su|~\u0082\u00ff\u0105\u010b\u012a\u013b\u0149"+
		"\u0150\u0155\u015c\u0162\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}