// Generated from custom_grammar.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class custom_grammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELIF=2, ELSE=3, WHILE=4, FOR=5, PRINTER=6, INT=7, BOOL=8, ASSIGN=9, 
		PLUS=10, MINUS=11, MULT=12, DIV=13, MOD=14, AND=15, OR=16, NOT=17, LESS=18, 
		GEQ=19, EQ=20, NEQ=21, L_ROUND=22, R_ROUND=23, L_SQ=24, R_SQ=25, ENDLINE=26, 
		COMMA=27, COMMENT=28, ID=29, NUMBER=30, STRING=31, BOOL_VALUE=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELIF", "ELSE", "WHILE", "FOR", "PRINTER", "INT", "BOOL", "ASSIGN", 
			"PLUS", "MINUS", "MULT", "DIV", "MOD", "AND", "OR", "NOT", "LESS", "GEQ", 
			"EQ", "NEQ", "L_ROUND", "R_ROUND", "L_SQ", "R_SQ", "ENDLINE", "COMMA", 
			"COMMENT", "ID", "NUMBER", "STRING", "BOOL_VALUE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'elif'", "'else'", "'while'", "'for'", "'printer'", "'integer'", 
			"'boolean'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", 
			"'!'", "'<'", "'>='", "'=='", "'!='", "'('", "')'", "'{'", "'}'", "';'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELIF", "ELSE", "WHILE", "FOR", "PRINTER", "INT", "BOOL", 
			"ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "MOD", "AND", "OR", "NOT", 
			"LESS", "GEQ", "EQ", "NEQ", "L_ROUND", "R_ROUND", "L_SQ", "R_SQ", "ENDLINE", 
			"COMMA", "COMMENT", "ID", "NUMBER", "STRING", "BOOL_VALUE", "WS"
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


	public custom_grammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "custom_grammar.g4"; }

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
		"\u0004\u0000!\u00d0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u00a2\b\u001b\n\u001b\f\u001b\u00a5\t\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u00ac\b\u001c\n\u001c\f\u001c"+
		"\u00af\t\u001c\u0001\u001d\u0004\u001d\u00b2\b\u001d\u000b\u001d\f\u001d"+
		"\u00b3\u0001\u001e\u0001\u001e\u0005\u001e\u00b8\b\u001e\n\u001e\f\u001e"+
		"\u00bb\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u00c8\b\u001f\u0001 \u0004 \u00cb\b \u000b \f \u00cc\u0001"+
		" \u0001 \u0001\u00a3\u0000!\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!\u0001\u0000\u0005\u0003\u0000AZ__az\u0004\u000009A"+
		"Z__az\u0001\u000009\u0001\u0000\"\"\u0003\u0000\t\n\r\r  \u00d5\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0001C\u0001\u0000\u0000\u0000\u0003F\u0001\u0000\u0000\u0000"+
		"\u0005K\u0001\u0000\u0000\u0000\u0007P\u0001\u0000\u0000\u0000\tV\u0001"+
		"\u0000\u0000\u0000\u000bZ\u0001\u0000\u0000\u0000\rb\u0001\u0000\u0000"+
		"\u0000\u000fj\u0001\u0000\u0000\u0000\u0011r\u0001\u0000\u0000\u0000\u0013"+
		"t\u0001\u0000\u0000\u0000\u0015v\u0001\u0000\u0000\u0000\u0017x\u0001"+
		"\u0000\u0000\u0000\u0019z\u0001\u0000\u0000\u0000\u001b|\u0001\u0000\u0000"+
		"\u0000\u001d~\u0001\u0000\u0000\u0000\u001f\u0081\u0001\u0000\u0000\u0000"+
		"!\u0084\u0001\u0000\u0000\u0000#\u0086\u0001\u0000\u0000\u0000%\u0088"+
		"\u0001\u0000\u0000\u0000\'\u008b\u0001\u0000\u0000\u0000)\u008e\u0001"+
		"\u0000\u0000\u0000+\u0091\u0001\u0000\u0000\u0000-\u0093\u0001\u0000\u0000"+
		"\u0000/\u0095\u0001\u0000\u0000\u00001\u0097\u0001\u0000\u0000\u00003"+
		"\u0099\u0001\u0000\u0000\u00005\u009b\u0001\u0000\u0000\u00007\u009d\u0001"+
		"\u0000\u0000\u00009\u00a9\u0001\u0000\u0000\u0000;\u00b1\u0001\u0000\u0000"+
		"\u0000=\u00b5\u0001\u0000\u0000\u0000?\u00c7\u0001\u0000\u0000\u0000A"+
		"\u00ca\u0001\u0000\u0000\u0000CD\u0005i\u0000\u0000DE\u0005f\u0000\u0000"+
		"E\u0002\u0001\u0000\u0000\u0000FG\u0005e\u0000\u0000GH\u0005l\u0000\u0000"+
		"HI\u0005i\u0000\u0000IJ\u0005f\u0000\u0000J\u0004\u0001\u0000\u0000\u0000"+
		"KL\u0005e\u0000\u0000LM\u0005l\u0000\u0000MN\u0005s\u0000\u0000NO\u0005"+
		"e\u0000\u0000O\u0006\u0001\u0000\u0000\u0000PQ\u0005w\u0000\u0000QR\u0005"+
		"h\u0000\u0000RS\u0005i\u0000\u0000ST\u0005l\u0000\u0000TU\u0005e\u0000"+
		"\u0000U\b\u0001\u0000\u0000\u0000VW\u0005f\u0000\u0000WX\u0005o\u0000"+
		"\u0000XY\u0005r\u0000\u0000Y\n\u0001\u0000\u0000\u0000Z[\u0005p\u0000"+
		"\u0000[\\\u0005r\u0000\u0000\\]\u0005i\u0000\u0000]^\u0005n\u0000\u0000"+
		"^_\u0005t\u0000\u0000_`\u0005e\u0000\u0000`a\u0005r\u0000\u0000a\f\u0001"+
		"\u0000\u0000\u0000bc\u0005i\u0000\u0000cd\u0005n\u0000\u0000de\u0005t"+
		"\u0000\u0000ef\u0005e\u0000\u0000fg\u0005g\u0000\u0000gh\u0005e\u0000"+
		"\u0000hi\u0005r\u0000\u0000i\u000e\u0001\u0000\u0000\u0000jk\u0005b\u0000"+
		"\u0000kl\u0005o\u0000\u0000lm\u0005o\u0000\u0000mn\u0005l\u0000\u0000"+
		"no\u0005e\u0000\u0000op\u0005a\u0000\u0000pq\u0005n\u0000\u0000q\u0010"+
		"\u0001\u0000\u0000\u0000rs\u0005=\u0000\u0000s\u0012\u0001\u0000\u0000"+
		"\u0000tu\u0005+\u0000\u0000u\u0014\u0001\u0000\u0000\u0000vw\u0005-\u0000"+
		"\u0000w\u0016\u0001\u0000\u0000\u0000xy\u0005*\u0000\u0000y\u0018\u0001"+
		"\u0000\u0000\u0000z{\u0005/\u0000\u0000{\u001a\u0001\u0000\u0000\u0000"+
		"|}\u0005%\u0000\u0000}\u001c\u0001\u0000\u0000\u0000~\u007f\u0005&\u0000"+
		"\u0000\u007f\u0080\u0005&\u0000\u0000\u0080\u001e\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005|\u0000\u0000\u0082\u0083\u0005|\u0000\u0000\u0083 "+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005!\u0000\u0000\u0085\"\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005<\u0000\u0000\u0087$\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005>\u0000\u0000\u0089\u008a\u0005=\u0000\u0000\u008a"+
		"&\u0001\u0000\u0000\u0000\u008b\u008c\u0005=\u0000\u0000\u008c\u008d\u0005"+
		"=\u0000\u0000\u008d(\u0001\u0000\u0000\u0000\u008e\u008f\u0005!\u0000"+
		"\u0000\u008f\u0090\u0005=\u0000\u0000\u0090*\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005(\u0000\u0000\u0092,\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		")\u0000\u0000\u0094.\u0001\u0000\u0000\u0000\u0095\u0096\u0005{\u0000"+
		"\u0000\u00960\u0001\u0000\u0000\u0000\u0097\u0098\u0005}\u0000\u0000\u0098"+
		"2\u0001\u0000\u0000\u0000\u0099\u009a\u0005;\u0000\u0000\u009a4\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005,\u0000\u0000\u009c6\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005/\u0000\u0000\u009e\u009f\u0005*\u0000\u0000\u009f"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a0\u00a2\t\u0000\u0000\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005*\u0000\u0000\u00a7\u00a8\u0005/\u0000\u0000\u00a88\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ad\u0007\u0000\u0000\u0000\u00aa\u00ac\u0007\u0001"+
		"\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae:\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b2\u0007\u0002\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4<\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b9\u0005\"\u0000\u0000\u00b6\u00b8\b\u0003\u0000\u0000\u00b7"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005\"\u0000\u0000\u00bd>\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0005t\u0000\u0000\u00bf\u00c0\u0005r\u0000\u0000\u00c0\u00c1\u0005u"+
		"\u0000\u0000\u00c1\u00c8\u0005e\u0000\u0000\u00c2\u00c3\u0005f\u0000\u0000"+
		"\u00c3\u00c4\u0005a\u0000\u0000\u00c4\u00c5\u0005l\u0000\u0000\u00c5\u00c6"+
		"\u0005s\u0000\u0000\u00c6\u00c8\u0005e\u0000\u0000\u00c7\u00be\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c2\u0001\u0000\u0000\u0000\u00c8@\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cb\u0007\u0004\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0006 \u0000\u0000\u00cfB\u0001\u0000\u0000\u0000\u0007"+
		"\u0000\u00a3\u00ad\u00b3\u00b9\u00c7\u00cc\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}