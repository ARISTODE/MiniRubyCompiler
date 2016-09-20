// Generated from Ry.g4 by ANTLR 4.5
package src.compiler;
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
		LITERAL=1, COMMA=2, SEMICOLON=3, CRLF=4, END=5, IF=6, ELSE=7, ELSIF=8, 
		UNLESS=9, WHILE=10, RETRY=11, BREAK=12, FOR=13, TRUE=14, FALSE=15, PLUS=16, 
		MINUS=17, MUL=18, DIV=19, MOD=20, EXP=21, ASSIGN=22, PLUS_ASSIGN=23, MINUS_ASSIGN=24, 
		MUL_ASSIGN=25, DIV_ASSIGN=26, MOD_ASSIGN=27, EXP_ASSIGN=28, EQUAL=29, 
		NOT_EQUAL=30, GREATER=31, LESS=32, LESS_EQUAL=33, GREATER_EQUAL=34, AND=35, 
		OR=36, NOT=37, IN=38, DOTS=39, LEFT_RBRACKET=40, RIGHT_RBRACKET=41, LEFT_SBRACKET=42, 
		RIGHT_SBRACKET=43, NIL=44, SL_COMMENT=45, ML_COMMENT=46, WS=47, INT=48, 
		FLOAT=49, ID=50;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ESCAPED_QUOTE", "LITERAL", "COMMA", "SEMICOLON", "CRLF", "END", "IF", 
		"ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", "FOR", "TRUE", "FALSE", 
		"PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", "ASSIGN", "PLUS_ASSIGN", 
		"MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", 
		"EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", 
		"AND", "OR", "NOT", "IN", "DOTS", "LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", 
		"RIGHT_SBRACKET", "NIL", "SL_COMMENT", "ML_COMMENT", "WS", "INT", "FLOAT", 
		"ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\64\u0156\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\3\3\3\3\3\7\3p\n\3\f\3\16\3s\13\3\3\3\3\3\3\3\3\3"+
		"\7\3y\n\3\f\3\16\3|\13\3\3\3\5\3\177\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\5%\u00f8\n%\3&\3&\3&\3&\5&\u00fe\n&\3\'\3\'\3\'\3\'\5\'\u0104\n\'"+
		"\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3/\3/\7/\u011a"+
		"\n/\f/\16/\u011d\13/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\7\60\u012b\n\60\f\60\16\60\u012e\13\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\61\6\61\u0139\n\61\r\61\16\61\u013a\3\61\3\61\3\62\6\62"+
		"\u0140\n\62\r\62\16\62\u0141\3\63\7\63\u0145\n\63\f\63\16\63\u0148\13"+
		"\63\3\63\3\63\6\63\u014c\n\63\r\63\16\63\u014d\3\64\3\64\7\64\u0152\n"+
		"\64\f\64\16\64\u0155\13\64\5qz\u012c\2\65\3\2\5\3\7\4\t\5\13\6\r\7\17"+
		"\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26"+
		"-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U"+
		"+W,Y-[.]/_\60a\61c\62e\63g\64\3\2\7\4\2\f\f\17\17\4\2\13\13\"\"\3\2\62"+
		";\5\2C\\aac|\6\2\62;C\\aac|\u0163\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2"+
		"\2\5~\3\2\2\2\7\u0080\3\2\2\2\t\u0082\3\2\2\2\13\u0084\3\2\2\2\r\u0086"+
		"\3\2\2\2\17\u008a\3\2\2\2\21\u008d\3\2\2\2\23\u0092\3\2\2\2\25\u0098\3"+
		"\2\2\2\27\u009f\3\2\2\2\31\u00a5\3\2\2\2\33\u00ab\3\2\2\2\35\u00b1\3\2"+
		"\2\2\37\u00b5\3\2\2\2!\u00ba\3\2\2\2#\u00c0\3\2\2\2%\u00c2\3\2\2\2\'\u00c4"+
		"\3\2\2\2)\u00c6\3\2\2\2+\u00c8\3\2\2\2-\u00ca\3\2\2\2/\u00cd\3\2\2\2\61"+
		"\u00cf\3\2\2\2\63\u00d2\3\2\2\2\65\u00d5\3\2\2\2\67\u00d8\3\2\2\29\u00db"+
		"\3\2\2\2;\u00de\3\2\2\2=\u00e2\3\2\2\2?\u00e5\3\2\2\2A\u00e8\3\2\2\2C"+
		"\u00ea\3\2\2\2E\u00ec\3\2\2\2G\u00ef\3\2\2\2I\u00f7\3\2\2\2K\u00fd\3\2"+
		"\2\2M\u0103\3\2\2\2O\u0105\3\2\2\2Q\u0108\3\2\2\2S\u010b\3\2\2\2U\u010d"+
		"\3\2\2\2W\u010f\3\2\2\2Y\u0111\3\2\2\2[\u0113\3\2\2\2]\u0117\3\2\2\2_"+
		"\u0122\3\2\2\2a\u0138\3\2\2\2c\u013f\3\2\2\2e\u0146\3\2\2\2g\u014f\3\2"+
		"\2\2ij\7^\2\2jk\7$\2\2k\4\3\2\2\2lq\7$\2\2mp\5\3\2\2np\n\2\2\2om\3\2\2"+
		"\2on\3\2\2\2ps\3\2\2\2qr\3\2\2\2qo\3\2\2\2rt\3\2\2\2sq\3\2\2\2t\177\7"+
		"$\2\2uz\7)\2\2vy\5\3\2\2wy\n\2\2\2xv\3\2\2\2xw\3\2\2\2y|\3\2\2\2z{\3\2"+
		"\2\2zx\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\177\7)\2\2~l\3\2\2\2~u\3\2\2\2\177"+
		"\6\3\2\2\2\u0080\u0081\7.\2\2\u0081\b\3\2\2\2\u0082\u0083\7=\2\2\u0083"+
		"\n\3\2\2\2\u0084\u0085\7\f\2\2\u0085\f\3\2\2\2\u0086\u0087\7g\2\2\u0087"+
		"\u0088\7p\2\2\u0088\u0089\7f\2\2\u0089\16\3\2\2\2\u008a\u008b\7k\2\2\u008b"+
		"\u008c\7h\2\2\u008c\20\3\2\2\2\u008d\u008e\7g\2\2\u008e\u008f\7n\2\2\u008f"+
		"\u0090\7u\2\2\u0090\u0091\7g\2\2\u0091\22\3\2\2\2\u0092\u0093\7g\2\2\u0093"+
		"\u0094\7n\2\2\u0094\u0095\7u\2\2\u0095\u0096\7k\2\2\u0096\u0097\7h\2\2"+
		"\u0097\24\3\2\2\2\u0098\u0099\7w\2\2\u0099\u009a\7p\2\2\u009a\u009b\7"+
		"n\2\2\u009b\u009c\7g\2\2\u009c\u009d\7u\2\2\u009d\u009e\7u\2\2\u009e\26"+
		"\3\2\2\2\u009f\u00a0\7y\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\u00a3\7n\2\2\u00a3\u00a4\7g\2\2\u00a4\30\3\2\2\2\u00a5\u00a6\7t\2\2\u00a6"+
		"\u00a7\7g\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7{\2\2"+
		"\u00aa\32\3\2\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7"+
		"g\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7m\2\2\u00b0\34\3\2\2\2\u00b1\u00b2"+
		"\7h\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7t\2\2\u00b4\36\3\2\2\2\u00b5\u00b6"+
		"\7v\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		" \3\2\2\2\u00ba\u00bb\7h\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7n\2\2\u00bd"+
		"\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf\"\3\2\2\2\u00c0\u00c1\7-\2\2\u00c1"+
		"$\3\2\2\2\u00c2\u00c3\7/\2\2\u00c3&\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5("+
		"\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7*\3\2\2\2\u00c8\u00c9\7\'\2\2\u00c9"+
		",\3\2\2\2\u00ca\u00cb\7,\2\2\u00cb\u00cc\7,\2\2\u00cc.\3\2\2\2\u00cd\u00ce"+
		"\7?\2\2\u00ce\60\3\2\2\2\u00cf\u00d0\7-\2\2\u00d0\u00d1\7?\2\2\u00d1\62"+
		"\3\2\2\2\u00d2\u00d3\7/\2\2\u00d3\u00d4\7?\2\2\u00d4\64\3\2\2\2\u00d5"+
		"\u00d6\7,\2\2\u00d6\u00d7\7?\2\2\u00d7\66\3\2\2\2\u00d8\u00d9\7\61\2\2"+
		"\u00d9\u00da\7?\2\2\u00da8\3\2\2\2\u00db\u00dc\7\'\2\2\u00dc\u00dd\7?"+
		"\2\2\u00dd:\3\2\2\2\u00de\u00df\7,\2\2\u00df\u00e0\7,\2\2\u00e0\u00e1"+
		"\7?\2\2\u00e1<\3\2\2\2\u00e2\u00e3\7?\2\2\u00e3\u00e4\7?\2\2\u00e4>\3"+
		"\2\2\2\u00e5\u00e6\7#\2\2\u00e6\u00e7\7?\2\2\u00e7@\3\2\2\2\u00e8\u00e9"+
		"\7@\2\2\u00e9B\3\2\2\2\u00ea\u00eb\7>\2\2\u00ebD\3\2\2\2\u00ec\u00ed\7"+
		">\2\2\u00ed\u00ee\7?\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7@\2\2\u00f0\u00f1"+
		"\7?\2\2\u00f1H\3\2\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f8"+
		"\7f\2\2\u00f5\u00f6\7(\2\2\u00f6\u00f8\7(\2\2\u00f7\u00f2\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8J\3\2\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fe\7t\2\2\u00fb"+
		"\u00fc\7~\2\2\u00fc\u00fe\7~\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fb\3\2\2"+
		"\2\u00feL\3\2\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7q\2\2\u0101\u0104\7"+
		"v\2\2\u0102\u0104\7#\2\2\u0103\u00ff\3\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"N\3\2\2\2\u0105\u0106\7k\2\2\u0106\u0107\7p\2\2\u0107P\3\2\2\2\u0108\u0109"+
		"\7\60\2\2\u0109\u010a\7\60\2\2\u010aR\3\2\2\2\u010b\u010c\7*\2\2\u010c"+
		"T\3\2\2\2\u010d\u010e\7+\2\2\u010eV\3\2\2\2\u010f\u0110\7]\2\2\u0110X"+
		"\3\2\2\2\u0111\u0112\7_\2\2\u0112Z\3\2\2\2\u0113\u0114\7p\2\2\u0114\u0115"+
		"\7k\2\2\u0115\u0116\7n\2\2\u0116\\\3\2\2\2\u0117\u011b\7%\2\2\u0118\u011a"+
		"\n\2\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7\f"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\b/\2\2\u0121^\3\2\2\2\u0122\u0123"+
		"\7?\2\2\u0123\u0124\7d\2\2\u0124\u0125\7g\2\2\u0125\u0126\7i\2\2\u0126"+
		"\u0127\7k\2\2\u0127\u0128\7p\2\2\u0128\u012c\3\2\2\2\u0129\u012b\13\2"+
		"\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012d\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7?"+
		"\2\2\u0130\u0131\7g\2\2\u0131\u0132\7p\2\2\u0132\u0133\7f\2\2\u0133\u0134"+
		"\7\f\2\2\u0134\u0135\3\2\2\2\u0135\u0136\b\60\2\2\u0136`\3\2\2\2\u0137"+
		"\u0139\t\3\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\b\61\2\2\u013d"+
		"b\3\2\2\2\u013e\u0140\t\4\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2"+
		"\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142d\3\2\2\2\u0143\u0145\t"+
		"\4\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014b\7\60"+
		"\2\2\u014a\u014c\t\4\2\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014ef\3\2\2\2\u014f\u0153\t\5\2\2"+
		"\u0150\u0152\t\6\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154h\3\2\2\2\u0155\u0153\3\2\2\2\22\2o"+
		"qxz~\u00f7\u00fd\u0103\u011b\u012c\u013a\u0141\u0146\u014d\u0153\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}