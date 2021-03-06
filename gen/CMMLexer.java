// Generated from C:/Users/Administrator/IdeaProjects/CMM/src\CMM.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMMLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, KeyInt=3, KeyDouble=4, KeyIf=5, KeyElse=6, KeyWhile=7, 
		KeyBreak=8, KeyRead=9, KeyWrite=10, KeyTrue=11, KeyFalse=12, LSB=13, RSB=14, 
		LRB=15, RRB=16, LB=17, RB=18, ADD=19, SUB=20, MUL=21, DIV=22, REM=23, 
		EQU=24, ASS=25, NEQU=26, GREATER=27, LESS=28, GOE=29, LOE=30, SEM=31, 
		COM=32, UNDERLINE=33, LogAnds=34, LogOrs=35, LogAnd=36, LogOr=37, LogNot=38, 
		INT=39, INT1=40, DOUBLE=41, ID=42, COMMENT=43, WS=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "KeyInt", "KeyDouble", "KeyIf", "KeyElse", "KeyWhile", 
		"KeyBreak", "KeyRead", "KeyWrite", "KeyTrue", "KeyFalse", "LSB", "RSB", 
		"LRB", "RRB", "LB", "RB", "ADD", "SUB", "MUL", "DIV", "REM", "EQU", "ASS", 
		"NEQU", "GREATER", "LESS", "GOE", "LOE", "SEM", "COM", "UNDERLINE", "LogAnds", 
		"LogOrs", "LogAnd", "LogOr", "LogNot", "DIGIT", "ALPHA", "INT", "INT1", 
		"DOUBLE", "ID", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'++'", "'--'", "'int'", "'double'", "'if'", "'else'", "'while'", 
		"'break'", "'read'", "'write'", "'true'", "'false'", "'['", "']'", "'('", 
		"')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'='", 
		"'!='", "'>'", "'<'", "'>='", "'<='", "';'", "','", "'_'", "'&&'", "'||'", 
		"'&'", "'|'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "KeyInt", "KeyDouble", "KeyIf", "KeyElse", "KeyWhile", 
		"KeyBreak", "KeyRead", "KeyWrite", "KeyTrue", "KeyFalse", "LSB", "RSB", 
		"LRB", "RRB", "LB", "RB", "ADD", "SUB", "MUL", "DIV", "REM", "EQU", "ASS", 
		"NEQU", "GREATER", "LESS", "GOE", "LOE", "SEM", "COM", "UNDERLINE", "LogAnds", 
		"LogOrs", "LogAnd", "LogOr", "LogNot", "INT", "INT1", "DOUBLE", "ID", 
		"COMMENT", "WS"
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


	public CMMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CMM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u0139\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\6*\u00dc\n*\r*"+
		"\16*\u00dd\3*\3*\3*\6*\u00e3\n*\r*\16*\u00e4\5*\u00e7\n*\3+\3+\3+\6+\u00ec"+
		"\n+\r+\16+\u00ed\5+\u00f0\n+\3,\6,\u00f3\n,\r,\16,\u00f4\3,\3,\7,\u00f9"+
		"\n,\f,\16,\u00fc\13,\3,\3,\3,\6,\u0101\n,\r,\16,\u0102\3,\3,\7,\u0107"+
		"\n,\f,\16,\u010a\13,\5,\u010c\n,\3-\3-\7-\u0110\n-\f-\16-\u0113\13-\3"+
		"-\7-\u0116\n-\f-\16-\u0119\13-\3.\3.\3.\3.\7.\u011f\n.\f.\16.\u0122\13"+
		".\3.\3.\3.\3.\3.\3.\7.\u012a\n.\f.\16.\u012d\13.\5.\u012f\n.\3.\3.\3/"+
		"\6/\u0134\n/\r/\16/\u0135\3/\3/\3\u0120\2\60\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2"+
		"S)U*W+Y,[-].\3\2\f\3\2\62;\4\2C\\c|\4\2ZZzz\4\2\62;CH\3\2\63;\4\2\62;"+
		"C\\\6\2\62;C\\aac|\5\2\62;C\\c|\4\2\13\f\17\17\5\2\13\f\17\17\"\"\u0147"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5b\3\2\2\2\7e\3\2\2\2\ti\3"+
		"\2\2\2\13p\3\2\2\2\rs\3\2\2\2\17x\3\2\2\2\21~\3\2\2\2\23\u0084\3\2\2\2"+
		"\25\u0089\3\2\2\2\27\u008f\3\2\2\2\31\u0094\3\2\2\2\33\u009a\3\2\2\2\35"+
		"\u009c\3\2\2\2\37\u009e\3\2\2\2!\u00a0\3\2\2\2#\u00a2\3\2\2\2%\u00a4\3"+
		"\2\2\2\'\u00a6\3\2\2\2)\u00a8\3\2\2\2+\u00aa\3\2\2\2-\u00ac\3\2\2\2/\u00ae"+
		"\3\2\2\2\61\u00b0\3\2\2\2\63\u00b3\3\2\2\2\65\u00b5\3\2\2\2\67\u00b8\3"+
		"\2\2\29\u00ba\3\2\2\2;\u00bc\3\2\2\2=\u00bf\3\2\2\2?\u00c2\3\2\2\2A\u00c4"+
		"\3\2\2\2C\u00c6\3\2\2\2E\u00c8\3\2\2\2G\u00cb\3\2\2\2I\u00ce\3\2\2\2K"+
		"\u00d0\3\2\2\2M\u00d2\3\2\2\2O\u00d4\3\2\2\2Q\u00d6\3\2\2\2S\u00e6\3\2"+
		"\2\2U\u00ef\3\2\2\2W\u010b\3\2\2\2Y\u010d\3\2\2\2[\u012e\3\2\2\2]\u0133"+
		"\3\2\2\2_`\7-\2\2`a\7-\2\2a\4\3\2\2\2bc\7/\2\2cd\7/\2\2d\6\3\2\2\2ef\7"+
		"k\2\2fg\7p\2\2gh\7v\2\2h\b\3\2\2\2ij\7f\2\2jk\7q\2\2kl\7w\2\2lm\7d\2\2"+
		"mn\7n\2\2no\7g\2\2o\n\3\2\2\2pq\7k\2\2qr\7h\2\2r\f\3\2\2\2st\7g\2\2tu"+
		"\7n\2\2uv\7u\2\2vw\7g\2\2w\16\3\2\2\2xy\7y\2\2yz\7j\2\2z{\7k\2\2{|\7n"+
		"\2\2|}\7g\2\2}\20\3\2\2\2~\177\7d\2\2\177\u0080\7t\2\2\u0080\u0081\7g"+
		"\2\2\u0081\u0082\7c\2\2\u0082\u0083\7m\2\2\u0083\22\3\2\2\2\u0084\u0085"+
		"\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087\7c\2\2\u0087\u0088\7f\2\2\u0088"+
		"\24\3\2\2\2\u0089\u008a\7y\2\2\u008a\u008b\7t\2\2\u008b\u008c\7k\2\2\u008c"+
		"\u008d\7v\2\2\u008d\u008e\7g\2\2\u008e\26\3\2\2\2\u008f\u0090\7v\2\2\u0090"+
		"\u0091\7t\2\2\u0091\u0092\7w\2\2\u0092\u0093\7g\2\2\u0093\30\3\2\2\2\u0094"+
		"\u0095\7h\2\2\u0095\u0096\7c\2\2\u0096\u0097\7n\2\2\u0097\u0098\7u\2\2"+
		"\u0098\u0099\7g\2\2\u0099\32\3\2\2\2\u009a\u009b\7]\2\2\u009b\34\3\2\2"+
		"\2\u009c\u009d\7_\2\2\u009d\36\3\2\2\2\u009e\u009f\7*\2\2\u009f \3\2\2"+
		"\2\u00a0\u00a1\7+\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7}\2\2\u00a3$\3\2\2"+
		"\2\u00a4\u00a5\7\177\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7-\2\2\u00a7(\3\2"+
		"\2\2\u00a8\u00a9\7/\2\2\u00a9*\3\2\2\2\u00aa\u00ab\7,\2\2\u00ab,\3\2\2"+
		"\2\u00ac\u00ad\7\61\2\2\u00ad.\3\2\2\2\u00ae\u00af\7\'\2\2\u00af\60\3"+
		"\2\2\2\u00b0\u00b1\7?\2\2\u00b1\u00b2\7?\2\2\u00b2\62\3\2\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4\64\3\2\2\2\u00b5\u00b6\7#\2\2\u00b6\u00b7\7?\2\2\u00b7\66"+
		"\3\2\2\2\u00b8\u00b9\7@\2\2\u00b98\3\2\2\2\u00ba\u00bb\7>\2\2\u00bb:\3"+
		"\2\2\2\u00bc\u00bd\7@\2\2\u00bd\u00be\7?\2\2\u00be<\3\2\2\2\u00bf\u00c0"+
		"\7>\2\2\u00c0\u00c1\7?\2\2\u00c1>\3\2\2\2\u00c2\u00c3\7=\2\2\u00c3@\3"+
		"\2\2\2\u00c4\u00c5\7.\2\2\u00c5B\3\2\2\2\u00c6\u00c7\7a\2\2\u00c7D\3\2"+
		"\2\2\u00c8\u00c9\7(\2\2\u00c9\u00ca\7(\2\2\u00caF\3\2\2\2\u00cb\u00cc"+
		"\7~\2\2\u00cc\u00cd\7~\2\2\u00cdH\3\2\2\2\u00ce\u00cf\7(\2\2\u00cfJ\3"+
		"\2\2\2\u00d0\u00d1\7~\2\2\u00d1L\3\2\2\2\u00d2\u00d3\7#\2\2\u00d3N\3\2"+
		"\2\2\u00d4\u00d5\t\2\2\2\u00d5P\3\2\2\2\u00d6\u00d7\t\3\2\2\u00d7R\3\2"+
		"\2\2\u00d8\u00e7\5O(\2\u00d9\u00db\5O(\2\u00da\u00dc\t\2\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e7\3\2\2\2\u00df\u00e0\7Q\2\2\u00e0\u00e2\t\4\2\2\u00e1\u00e3\t\5"+
		"\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00d8\3\2\2\2\u00e6\u00d9\3\2"+
		"\2\2\u00e6\u00df\3\2\2\2\u00e7T\3\2\2\2\u00e8\u00f0\t\6\2\2\u00e9\u00eb"+
		"\t\6\2\2\u00ea\u00ec\t\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00e8\3\2"+
		"\2\2\u00ef\u00e9\3\2\2\2\u00f0V\3\2\2\2\u00f1\u00f3\t\2\2\2\u00f2\u00f1"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00fa\7\60\2\2\u00f7\u00f9\t\2\2\2\u00f8\u00f7\3"+
		"\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u010c\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7Q\2\2\u00fe\u0100\t\4"+
		"\2\2\u00ff\u0101\t\7\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0108\7\60"+
		"\2\2\u0105\u0107\t\7\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010b\u00f2\3\2\2\2\u010b\u00fd\3\2\2\2\u010cX\3\2\2\2\u010d\u0117"+
		"\t\3\2\2\u010e\u0110\t\b\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0116\t\t\2\2\u0115\u0111\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118Z\3\2\2\2\u0119\u0117\3\2\2\2"+
		"\u011a\u011b\7\61\2\2\u011b\u011c\7,\2\2\u011c\u0120\3\2\2\2\u011d\u011f"+
		"\13\2\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u0121\3\2\2\2"+
		"\u0120\u011e\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124"+
		"\7,\2\2\u0124\u012f\7\61\2\2\u0125\u0126\7\61\2\2\u0126\u0127\7\61\2\2"+
		"\u0127\u012b\3\2\2\2\u0128\u012a\n\n\2\2\u0129\u0128\3\2\2\2\u012a\u012d"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u011a\3\2\2\2\u012e\u0125\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0131\b.\2\2\u0131\\\3\2\2\2\u0132\u0134\t\13\2\2\u0133\u0132"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\b/\3\2\u0138^\3\2\2\2\23\2\u00dd\u00e4\u00e6"+
		"\u00ed\u00ef\u00f4\u00fa\u0102\u0108\u010b\u0111\u0117\u0120\u012b\u012e"+
		"\u0135\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}