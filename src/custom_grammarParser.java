// Generated from custom_grammar.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class custom_grammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELIF=2, ELSE=3, WHILE=4, FOR=5, PRINTER=6, INT=7, BOOL=8, ASSIGN=9, 
		PLUS=10, MINUS=11, MULT=12, DIV=13, MOD=14, POW=15, AND=16, OR=17, NOT=18, 
		LESS=19, LEQ=20, GREATER=21, GEQ=22, EQ=23, NEQ=24, L_ROUND=25, R_ROUND=26, 
		L_SQ=27, R_SQ=28, ENDLINE=29, COMMA=30, COMMENT=31, ID=32, NUMBER=33, 
		STRING=34, BOOL_VALUE=35, WS=36;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_var_decl = 2, RULE_assign = 3, 
		RULE_if_state = 4, RULE_while_loop = 5, RULE_for_loop = 6, RULE_f_block = 7, 
		RULE_printer = 8, RULE_printer_argument = 9, RULE_expression = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "var_decl", "assign", "if_state", "while_loop", 
			"for_loop", "f_block", "printer", "printer_argument", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'elif'", "'else'", "'while'", "'for'", "'printer'", "'integer'", 
			"'boolean'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&&'", 
			"'||'", "'!'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'('", "')'", 
			"'{'", "'}'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELIF", "ELSE", "WHILE", "FOR", "PRINTER", "INT", "BOOL", 
			"ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "MOD", "POW", "AND", "OR", 
			"NOT", "LESS", "LEQ", "GREATER", "GEQ", "EQ", "NEQ", "L_ROUND", "R_ROUND", 
			"L_SQ", "R_SQ", "ENDLINE", "COMMA", "COMMENT", "ID", "NUMBER", "STRING", 
			"BOOL_VALUE", "WS"
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
	public String getGrammarFileName() { return "custom_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public custom_grammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(custom_grammarParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof custom_grammarVisitor ) return ((custom_grammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294967794L) != 0)) {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
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
	public static class StatementContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public If_stateContext if_state() {
			return getRuleContext(If_stateContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public PrinterContext printer() {
			return getRuleContext(PrinterContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof custom_grammarVisitor ) return ((custom_grammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				var_decl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				assign();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				if_state();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				while_loop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				for_loop();
				}
				break;
			case PRINTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				printer();
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
	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(custom_grammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(custom_grammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(custom_grammarParser.ENDLINE, 0); }
		public TerminalNode INT() { return getToken(custom_grammarParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(custom_grammarParser.BOOL, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof custom_grammarVisitor ) return ((custom_grammarVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(39);
			match(ID);
			setState(40);
			match(ASSIGN);
			setState(41);
			expression(0);
			setState(42);
			match(ENDLINE);
			}
		}
		catch (RecognitionException re) {
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(custom_grammarParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(custom_grammarParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(custom_grammarParser.ENDLINE, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof custom_grammarVisitor ) return ((custom_grammarVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(ID);
			setState(45);
			match(ASSIGN);
			setState(46);
			expression(0);
			setState(47);
			match(ENDLINE);
			}
		}
		catch (RecognitionException re) {
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
	public static class If_stateContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(custom_grammarParser.IF, 0); }
		public List<TerminalNode> L_ROUND() { return getTokens(custom_grammarParser.L_ROUND); }
		public TerminalNode L_ROUND(int i) {
			return getToken(custom_grammarParser.L_ROUND, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> R_ROUND() { return getTokens(custom_grammarParser.R_ROUND); }
		public TerminalNode R_ROUND(int i) {
			return getToken(custom_grammarParser.R_ROUND, i);
		}
		public List<F_blockContext> f_block() {
			return getRuleContexts(F_blockContext.class);
		}
		public F_blockContext f_block(int i) {
			return getRuleContext(F_blockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(custom_grammarParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(custom_grammarParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(custom_grammarParser.ELSE, 0); }
		public If_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).enterIf_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).exitIf_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof custom_grammarVisitor ) return ((custom_grammarVisitor<? extends T>)visitor).visitIf_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stateContext if_state() throws RecognitionException {
		If_stateContext _localctx = new If_stateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(IF);
			setState(50);
			match(L_ROUND);
			setState(51);
			expression(0);
			setState(52);
			match(R_ROUND);
			setState(53);
			f_block();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(54);
				match(ELIF);
				setState(55);
				match(L_ROUND);
				setState(56);
				expression(0);
				setState(57);
				match(R_ROUND);
				setState(58);
				f_block();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(65);
				match(ELSE);
				setState(66);
				f_block();
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
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(custom_grammarParser.WHILE, 0); }
		public TerminalNode L_ROUND() { return getToken(custom_grammarParser.L_ROUND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_ROUND() { return getToken(custom_grammarParser.R_ROUND, 0); }
		public F_blockContext f_block() {
			return getRuleContext(F_blockContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof custom_grammarVisitor ) return ((custom_grammarVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(WHILE);
			setState(70);
			match(L_ROUND);
			setState(71);
			expression(0);
			setState(72);
			match(R_ROUND);
			setState(73);
			f_block();
			}
		}
		catch (RecognitionException re) {
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
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(custom_grammarParser.FOR, 0); }
		public TerminalNode L_ROUND() { return getToken(custom_grammarParser.L_ROUND, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(custom_grammarParser.ENDLINE, 0); }
		public TerminalNode R_ROUND() { return getToken(custom_grammarParser.R_ROUND, 0); }
		public F_blockContext f_block() {
			return getRuleContext(F_blockContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof custom_grammarVisitor ) return ((custom_grammarVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(FOR);
			setState(76);
			match(L_ROUND);
			setState(77);
			assign();
			setState(78);
			expression(0);
			setState(79);
			match(ENDLINE);
			setState(80);
			assign();
			setState(81);
			match(R_ROUND);
			setState(82);
			f_block();
			}
		}
		catch (RecognitionException re) {
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
	public static class F_blockContext extends ParserRuleContext {
		public TerminalNode L_SQ() { return getToken(custom_grammarParser.L_SQ, 0); }
		public TerminalNode R_SQ() { return getToken(custom_grammarParser.R_SQ, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public F_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).enterF_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).exitF_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof custom_grammarVisitor ) return ((custom_grammarVisitor<? extends T>)visitor).visitF_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final F_blockContext f_block() throws RecognitionException {
		F_blockContext _localctx = new F_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_f_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(L_SQ);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294967794L) != 0)) {
				{
				{
				setState(85);
				statement();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(R_SQ);
			}
		}
		catch (RecognitionException re) {
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
	public static class PrinterContext extends ParserRuleContext {
		public TerminalNode PRINTER() { return getToken(custom_grammarParser.PRINTER, 0); }
		public TerminalNode L_ROUND() { return getToken(custom_grammarParser.L_ROUND, 0); }
		public List<Printer_argumentContext> printer_argument() {
			return getRuleContexts(Printer_argumentContext.class);
		}
		public Printer_argumentContext printer_argument(int i) {
			return getRuleContext(Printer_argumentContext.class,i);
		}
		public TerminalNode R_ROUND() { return getToken(custom_grammarParser.R_ROUND, 0); }
		public TerminalNode ENDLINE() { return getToken(custom_grammarParser.ENDLINE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(custom_grammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(custom_grammarParser.COMMA, i);
		}
		public PrinterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).enterPrinter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).exitPrinter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof custom_grammarVisitor ) return ((custom_grammarVisitor<? extends T>)visitor).visitPrinter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrinterContext printer() throws RecognitionException {
		PrinterContext _localctx = new PrinterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_printer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(PRINTER);
			setState(94);
			match(L_ROUND);
			setState(95);
			printer_argument();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(96);
				match(COMMA);
				setState(97);
				printer_argument();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(R_ROUND);
			setState(104);
			match(ENDLINE);
			}
		}
		catch (RecognitionException re) {
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
	public static class Printer_argumentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(custom_grammarParser.STRING, 0); }
		public TerminalNode ID() { return getToken(custom_grammarParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(custom_grammarParser.NUMBER, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(custom_grammarParser.BOOL_VALUE, 0); }
		public Printer_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printer_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).enterPrinter_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).exitPrinter_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof custom_grammarVisitor ) return ((custom_grammarVisitor<? extends T>)visitor).visitPrinter_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Printer_argumentContext printer_argument() throws RecognitionException {
		Printer_argumentContext _localctx = new Printer_argumentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printer_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64424509440L) != 0)) ) {
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(custom_grammarParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode L_ROUND() { return getToken(custom_grammarParser.L_ROUND, 0); }
		public TerminalNode R_ROUND() { return getToken(custom_grammarParser.R_ROUND, 0); }
		public TerminalNode ID() { return getToken(custom_grammarParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(custom_grammarParser.NUMBER, 0); }
		public TerminalNode BOOL_VALUE() { return getToken(custom_grammarParser.BOOL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(custom_grammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(custom_grammarParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(custom_grammarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(custom_grammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(custom_grammarParser.MOD, 0); }
		public TerminalNode POW() { return getToken(custom_grammarParser.POW, 0); }
		public TerminalNode LESS() { return getToken(custom_grammarParser.LESS, 0); }
		public TerminalNode LEQ() { return getToken(custom_grammarParser.LEQ, 0); }
		public TerminalNode GREATER() { return getToken(custom_grammarParser.GREATER, 0); }
		public TerminalNode GEQ() { return getToken(custom_grammarParser.GEQ, 0); }
		public TerminalNode EQ() { return getToken(custom_grammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(custom_grammarParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(custom_grammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(custom_grammarParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof custom_grammarListener ) ((custom_grammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof custom_grammarVisitor ) return ((custom_grammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(109);
				match(NOT);
				setState(110);
				expression(5);
				}
				break;
			case L_ROUND:
				{
				setState(111);
				match(L_ROUND);
				setState(112);
				expression(0);
				setState(113);
				match(R_ROUND);
				}
				break;
			case ID:
				{
				setState(115);
				match(ID);
				}
				break;
			case NUMBER:
				{
				setState(116);
				match(NUMBER);
				}
				break;
			case BOOL_VALUE:
				{
				setState(117);
				match(BOOL_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(121);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64512L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(122);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(124);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33030144L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(127);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(128);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u0087\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"=\b\u0004\n\u0004\f\u0004@\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"D\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0005\u0007W\b\u0007\n\u0007\f\u0007Z\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bc\b\b\n\b\f\bf\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nw\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0082"+
		"\b\n\n\n\f\n\u0085\t\n\u0001\n\u0000\u0001\u0014\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0005\u0001\u0000\u0007\b\u0001"+
		"\u0000 #\u0001\u0000\n\u000f\u0001\u0000\u0013\u0018\u0001\u0000\u0010"+
		"\u0011\u008c\u0000\u0019\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000"+
		"\u0000\u0004&\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b"+
		"1\u0001\u0000\u0000\u0000\nE\u0001\u0000\u0000\u0000\fK\u0001\u0000\u0000"+
		"\u0000\u000eT\u0001\u0000\u0000\u0000\u0010]\u0001\u0000\u0000\u0000\u0012"+
		"j\u0001\u0000\u0000\u0000\u0014v\u0001\u0000\u0000\u0000\u0016\u0018\u0003"+
		"\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001"+
		"\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0005\u0000\u0000\u0001\u001d\u0001\u0001"+
		"\u0000\u0000\u0000\u001e%\u0003\u0004\u0002\u0000\u001f%\u0003\u0006\u0003"+
		"\u0000 %\u0003\b\u0004\u0000!%\u0003\n\u0005\u0000\"%\u0003\f\u0006\u0000"+
		"#%\u0003\u0010\b\u0000$\u001e\u0001\u0000\u0000\u0000$\u001f\u0001\u0000"+
		"\u0000\u0000$ \u0001\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000"+
		"\u0000&\'\u0007\u0000\u0000\u0000\'(\u0005 \u0000\u0000()\u0005\t\u0000"+
		"\u0000)*\u0003\u0014\n\u0000*+\u0005\u001d\u0000\u0000+\u0005\u0001\u0000"+
		"\u0000\u0000,-\u0005 \u0000\u0000-.\u0005\t\u0000\u0000./\u0003\u0014"+
		"\n\u0000/0\u0005\u001d\u0000\u00000\u0007\u0001\u0000\u0000\u000012\u0005"+
		"\u0001\u0000\u000023\u0005\u0019\u0000\u000034\u0003\u0014\n\u000045\u0005"+
		"\u001a\u0000\u00005>\u0003\u000e\u0007\u000067\u0005\u0002\u0000\u0000"+
		"78\u0005\u0019\u0000\u000089\u0003\u0014\n\u00009:\u0005\u001a\u0000\u0000"+
		":;\u0003\u000e\u0007\u0000;=\u0001\u0000\u0000\u0000<6\u0001\u0000\u0000"+
		"\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?C\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005"+
		"\u0003\u0000\u0000BD\u0003\u000e\u0007\u0000CA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000D\t\u0001\u0000\u0000\u0000EF\u0005\u0004\u0000"+
		"\u0000FG\u0005\u0019\u0000\u0000GH\u0003\u0014\n\u0000HI\u0005\u001a\u0000"+
		"\u0000IJ\u0003\u000e\u0007\u0000J\u000b\u0001\u0000\u0000\u0000KL\u0005"+
		"\u0005\u0000\u0000LM\u0005\u0019\u0000\u0000MN\u0003\u0006\u0003\u0000"+
		"NO\u0003\u0014\n\u0000OP\u0005\u001d\u0000\u0000PQ\u0003\u0006\u0003\u0000"+
		"QR\u0005\u001a\u0000\u0000RS\u0003\u000e\u0007\u0000S\r\u0001\u0000\u0000"+
		"\u0000TX\u0005\u001b\u0000\u0000UW\u0003\u0002\u0001\u0000VU\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u001c\u0000\u0000\\\u000f\u0001\u0000\u0000\u0000]^\u0005\u0006"+
		"\u0000\u0000^_\u0005\u0019\u0000\u0000_d\u0003\u0012\t\u0000`a\u0005\u001e"+
		"\u0000\u0000ac\u0003\u0012\t\u0000b`\u0001\u0000\u0000\u0000cf\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0005\u001a\u0000\u0000"+
		"hi\u0005\u001d\u0000\u0000i\u0011\u0001\u0000\u0000\u0000jk\u0007\u0001"+
		"\u0000\u0000k\u0013\u0001\u0000\u0000\u0000lm\u0006\n\uffff\uffff\u0000"+
		"mn\u0005\u0012\u0000\u0000nw\u0003\u0014\n\u0005op\u0005\u0019\u0000\u0000"+
		"pq\u0003\u0014\n\u0000qr\u0005\u001a\u0000\u0000rw\u0001\u0000\u0000\u0000"+
		"sw\u0005 \u0000\u0000tw\u0005!\u0000\u0000uw\u0005#\u0000\u0000vl\u0001"+
		"\u0000\u0000\u0000vo\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000w\u0083\u0001\u0000"+
		"\u0000\u0000xy\n\b\u0000\u0000yz\u0007\u0002\u0000\u0000z\u0082\u0003"+
		"\u0014\n\t{|\n\u0007\u0000\u0000|}\u0007\u0003\u0000\u0000}\u0082\u0003"+
		"\u0014\n\b~\u007f\n\u0006\u0000\u0000\u007f\u0080\u0007\u0004\u0000\u0000"+
		"\u0080\u0082\u0003\u0014\n\u0007\u0081x\u0001\u0000\u0000\u0000\u0081"+
		"{\u0001\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0082\u0085\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0015\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\t\u0019$>CXdv\u0081\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}