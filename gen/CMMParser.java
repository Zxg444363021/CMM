// Generated from C:/Users/Administrator/IdeaProjects/CMM/src\CMM.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMMParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_varDecl = 2, RULE_ifStmt = 3, RULE_whileStmt = 4, 
		RULE_breakStmt = 5, RULE_assignStmt = 6, RULE_readStmt = 7, RULE_writeStmt = 8, 
		RULE_stmtBlock = 9, RULE_selfOpStmt = 10, RULE_type = 11, RULE_varList = 12, 
		RULE_value = 13, RULE_constant = 14, RULE_expr = 15, RULE_words = 16;
	public static final String[] ruleNames = {
		"program", "stmt", "varDecl", "ifStmt", "whileStmt", "breakStmt", "assignStmt", 
		"readStmt", "writeStmt", "stmtBlock", "selfOpStmt", "type", "varList", 
		"value", "constant", "expr", "words"
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

	@Override
	public String getGrammarFileName() { return "CMM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(34);
			stmt();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeyInt) | (1L << KeyDouble) | (1L << KeyIf) | (1L << KeyWhile) | (1L << KeyBreak) | (1L << KeyRead) | (1L << KeyWrite) | (1L << LB) | (1L << ID))) != 0)) {
				{
				{
				setState(35);
				stmt();
				}
				}
				setState(40);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SbreakContext extends StmtContext {
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public SbreakContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterSbreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitSbreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitSbreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SblockContext extends StmtContext {
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public SblockContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterSblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitSblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitSblock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SifContext extends StmtContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public SifContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterSif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitSif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitSif(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SvarContext extends StmtContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public SvarContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterSvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitSvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitSvar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SassignContext extends StmtContext {
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public SassignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterSassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitSassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitSassign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwriteContext extends StmtContext {
		public WriteStmtContext writeStmt() {
			return getRuleContext(WriteStmtContext.class,0);
		}
		public SwriteContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterSwrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitSwrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitSwrite(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwhileContext extends StmtContext {
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public SwhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterSwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitSwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitSwhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SreadContext extends StmtContext {
		public ReadStmtContext readStmt() {
			return getRuleContext(ReadStmtContext.class,0);
		}
		public SreadContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterSread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitSread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitSread(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(49);
			switch (_input.LA(1)) {
			case KeyInt:
			case KeyDouble:
				_localctx = new SvarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				varDecl();
				}
				break;
			case KeyBreak:
				_localctx = new SbreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				breakStmt();
				}
				break;
			case ID:
				_localctx = new SassignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				assignStmt();
				}
				break;
			case KeyRead:
				_localctx = new SreadContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				readStmt();
				}
				break;
			case KeyWrite:
				_localctx = new SwriteContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				writeStmt();
				}
				break;
			case KeyIf:
				_localctx = new SifContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				ifStmt();
				}
				break;
			case KeyWhile:
				_localctx = new SwhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				whileStmt();
				}
				break;
			case LB:
				_localctx = new SblockContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(48);
				stmtBlock();
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

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			type();
			setState(52);
			varList();
			setState(53);
			match(SEM);
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

	public static class IfStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(KeyIf);
			setState(56);
			match(LRB);
			setState(57);
			expr(0);
			setState(58);
			match(RRB);
			setState(59);
			stmt();
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(60);
				match(KeyElse);
				setState(61);
				stmt();
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

	public static class WhileStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(KeyWhile);
			setState(65);
			match(LRB);
			setState(66);
			expr(0);
			setState(67);
			match(RRB);
			setState(68);
			stmt();
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

	public static class BreakStmtContext extends ParserRuleContext {
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(KeyBreak);
			setState(71);
			match(SEM);
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

	public static class AssignStmtContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			value();
			setState(74);
			match(ASS);
			setState(75);
			expr(0);
			setState(76);
			match(SEM);
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

	public static class ReadStmtContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReadStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterReadStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitReadStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitReadStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStmtContext readStmt() throws RecognitionException {
		ReadStmtContext _localctx = new ReadStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_readStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(KeyRead);
			setState(79);
			match(LRB);
			setState(80);
			value();
			setState(81);
			match(RRB);
			setState(82);
			match(SEM);
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

	public static class WriteStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterWriteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitWriteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitWriteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStmtContext writeStmt() throws RecognitionException {
		WriteStmtContext _localctx = new WriteStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_writeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(KeyWrite);
			setState(85);
			match(LRB);
			setState(86);
			expr(0);
			setState(87);
			match(RRB);
			setState(88);
			match(SEM);
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

	public static class StmtBlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterStmtBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitStmtBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStmtBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtBlockContext stmtBlock() throws RecognitionException {
		StmtBlockContext _localctx = new StmtBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmtBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(LB);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeyInt) | (1L << KeyDouble) | (1L << KeyIf) | (1L << KeyWhile) | (1L << KeyBreak) | (1L << KeyRead) | (1L << KeyWrite) | (1L << LB) | (1L << ID))) != 0)) {
				{
				{
				setState(91);
				stmt();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(RB);
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

	public static class SelfOpStmtContext extends ParserRuleContext {
		public SelfOpStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfOpStmt; }
	 
		public SelfOpStmtContext() { }
		public void copyFrom(SelfOpStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BeforeContext extends SelfOpStmtContext {
		public Token op;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BeforeContext(SelfOpStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterBefore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitBefore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitBefore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AfterContext extends SelfOpStmtContext {
		public Token op;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AfterContext(SelfOpStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterAfter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitAfter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitAfter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfOpStmtContext selfOpStmt() throws RecognitionException {
		SelfOpStmtContext _localctx = new SelfOpStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selfOpStmt);
		int _la;
		try {
			setState(104);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new BeforeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				value();
				setState(100);
				((BeforeContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
					((BeforeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T__0:
			case T__1:
				_localctx = new AfterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				((AfterContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
					((AfterContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(103);
				value();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoubleArrContext extends TypeContext {
		public TerminalNode INT() { return getToken(CMMParser.INT, 0); }
		public DoubleArrContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterDoubleArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitDoubleArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitDoubleArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleTypeContext extends TypeContext {
		public DoubleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntArrContext extends TypeContext {
		public TerminalNode INT() { return getToken(CMMParser.INT, 0); }
		public IntArrContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterIntArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitIntArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitIntArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(KeyInt);
				}
				break;
			case 2:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(KeyDouble);
				}
				break;
			case 3:
				_localctx = new IntArrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(KeyInt);
				setState(109);
				match(LSB);
				setState(110);
				match(INT);
				setState(111);
				match(RSB);
				}
				break;
			case 4:
				_localctx = new DoubleArrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				match(KeyDouble);
				setState(113);
				match(LSB);
				setState(114);
				match(INT);
				setState(115);
				match(RSB);
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

	public static class VarListContext extends ParserRuleContext {
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
	 
		public VarListContext() { }
		public void copyFrom(VarListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoValueContext extends VarListContext {
		public List<TerminalNode> ID() { return getTokens(CMMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMMParser.ID, i);
		}
		public NoValueContext(VarListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterNoValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitNoValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitNoValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HasValueContext extends VarListContext {
		public List<TerminalNode> ID() { return getTokens(CMMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMMParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public HasValueContext(VarListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterHasValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitHasValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitHasValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varList);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new HasValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(ID);
				setState(119);
				match(ASS);
				setState(120);
				expr(0);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COM) {
					{
					{
					setState(121);
					match(COM);
					setState(122);
					match(ID);
					setState(123);
					match(ASS);
					setState(124);
					expr(0);
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new NoValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(ID);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COM) {
					{
					{
					setState(131);
					match(COM);
					setState(132);
					match(ID);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdContext extends ValueContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public IdContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AryIdContext extends ValueContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AryIdContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterAryId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitAryId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitAryId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new AryIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(ID);
				setState(141);
				match(LSB);
				setState(142);
				expr(0);
				setState(143);
				match(RSB);
				}
				break;
			case 2:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(ID);
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
	public static class DoubleConContext extends ConstantContext {
		public TerminalNode DOUBLE() { return getToken(CMMParser.DOUBLE, 0); }
		public DoubleConContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterDoubleCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitDoubleCon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitDoubleCon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntConContext extends ConstantContext {
		public TerminalNode INT() { return getToken(CMMParser.INT, 0); }
		public IntConContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterIntCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitIntCon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitIntCon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends ConstantContext {
		public TrueContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends ConstantContext {
		public FalseContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constant);
		try {
			setState(152);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntConContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleConContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(DOUBLE);
				}
				break;
			case KeyTrue:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(KeyTrue);
				}
				break;
			case KeyFalse:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(KeyFalse);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegContext extends ExprContext {
		public TerminalNode SUB() { return getToken(CMMParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivModContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicNotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogicNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterLogicNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitLogicNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitLogicNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstContext extends ExprContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicCompContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogicCompContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterLogicComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitLogicComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitLogicComp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			switch (_input.LA(1)) {
			case LRB:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(155);
				match(LRB);
				setState(156);
				expr(0);
				setState(157);
				match(RRB);
				}
				break;
			case SUB:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(SUB);
				setState(160);
				expr(8);
				}
				break;
			case LogNot:
				{
				_localctx = new LogicNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(LogNot);
				setState(162);
				expr(7);
				}
				break;
			case ID:
				{
				_localctx = new ValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				value();
				}
				break;
			case KeyTrue:
			case KeyFalse:
			case INT:
			case DOUBLE:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(168);
						((MulDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << REM))) != 0)) ) {
							((MulDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(169);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(171);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(172);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new CompContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(174);
						((CompContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQU) | (1L << NEQU) | (1L << GREATER) | (1L << LESS) | (1L << GOE) | (1L << LOE))) != 0)) ) {
							((CompContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(175);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new LogicCompContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(177);
						((LogicCompContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LogAnds) | (1L << LogOrs) | (1L << LogAnd) | (1L << LogOr))) != 0)) ) {
							((LogicCompContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(178);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class WordsContext extends ParserRuleContext {
		public List<TerminalNode> KeyInt() { return getTokens(CMMParser.KeyInt); }
		public TerminalNode KeyInt(int i) {
			return getToken(CMMParser.KeyInt, i);
		}
		public List<TerminalNode> KeyDouble() { return getTokens(CMMParser.KeyDouble); }
		public TerminalNode KeyDouble(int i) {
			return getToken(CMMParser.KeyDouble, i);
		}
		public List<TerminalNode> KeyIf() { return getTokens(CMMParser.KeyIf); }
		public TerminalNode KeyIf(int i) {
			return getToken(CMMParser.KeyIf, i);
		}
		public List<TerminalNode> KeyElse() { return getTokens(CMMParser.KeyElse); }
		public TerminalNode KeyElse(int i) {
			return getToken(CMMParser.KeyElse, i);
		}
		public List<TerminalNode> KeyWhile() { return getTokens(CMMParser.KeyWhile); }
		public TerminalNode KeyWhile(int i) {
			return getToken(CMMParser.KeyWhile, i);
		}
		public List<TerminalNode> KeyBreak() { return getTokens(CMMParser.KeyBreak); }
		public TerminalNode KeyBreak(int i) {
			return getToken(CMMParser.KeyBreak, i);
		}
		public List<TerminalNode> KeyRead() { return getTokens(CMMParser.KeyRead); }
		public TerminalNode KeyRead(int i) {
			return getToken(CMMParser.KeyRead, i);
		}
		public List<TerminalNode> KeyWrite() { return getTokens(CMMParser.KeyWrite); }
		public TerminalNode KeyWrite(int i) {
			return getToken(CMMParser.KeyWrite, i);
		}
		public List<TerminalNode> KeyTrue() { return getTokens(CMMParser.KeyTrue); }
		public TerminalNode KeyTrue(int i) {
			return getToken(CMMParser.KeyTrue, i);
		}
		public List<TerminalNode> KeyFalse() { return getTokens(CMMParser.KeyFalse); }
		public TerminalNode KeyFalse(int i) {
			return getToken(CMMParser.KeyFalse, i);
		}
		public List<TerminalNode> LSB() { return getTokens(CMMParser.LSB); }
		public TerminalNode LSB(int i) {
			return getToken(CMMParser.LSB, i);
		}
		public List<TerminalNode> RSB() { return getTokens(CMMParser.RSB); }
		public TerminalNode RSB(int i) {
			return getToken(CMMParser.RSB, i);
		}
		public List<TerminalNode> LRB() { return getTokens(CMMParser.LRB); }
		public TerminalNode LRB(int i) {
			return getToken(CMMParser.LRB, i);
		}
		public List<TerminalNode> RRB() { return getTokens(CMMParser.RRB); }
		public TerminalNode RRB(int i) {
			return getToken(CMMParser.RRB, i);
		}
		public List<TerminalNode> LB() { return getTokens(CMMParser.LB); }
		public TerminalNode LB(int i) {
			return getToken(CMMParser.LB, i);
		}
		public List<TerminalNode> RB() { return getTokens(CMMParser.RB); }
		public TerminalNode RB(int i) {
			return getToken(CMMParser.RB, i);
		}
		public List<TerminalNode> ADD() { return getTokens(CMMParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(CMMParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(CMMParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(CMMParser.SUB, i);
		}
		public List<TerminalNode> MUL() { return getTokens(CMMParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(CMMParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CMMParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CMMParser.DIV, i);
		}
		public List<TerminalNode> REM() { return getTokens(CMMParser.REM); }
		public TerminalNode REM(int i) {
			return getToken(CMMParser.REM, i);
		}
		public List<TerminalNode> EQU() { return getTokens(CMMParser.EQU); }
		public TerminalNode EQU(int i) {
			return getToken(CMMParser.EQU, i);
		}
		public List<TerminalNode> ASS() { return getTokens(CMMParser.ASS); }
		public TerminalNode ASS(int i) {
			return getToken(CMMParser.ASS, i);
		}
		public List<TerminalNode> NEQU() { return getTokens(CMMParser.NEQU); }
		public TerminalNode NEQU(int i) {
			return getToken(CMMParser.NEQU, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(CMMParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(CMMParser.GREATER, i);
		}
		public List<TerminalNode> LESS() { return getTokens(CMMParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(CMMParser.LESS, i);
		}
		public List<TerminalNode> GOE() { return getTokens(CMMParser.GOE); }
		public TerminalNode GOE(int i) {
			return getToken(CMMParser.GOE, i);
		}
		public List<TerminalNode> LOE() { return getTokens(CMMParser.LOE); }
		public TerminalNode LOE(int i) {
			return getToken(CMMParser.LOE, i);
		}
		public List<TerminalNode> SEM() { return getTokens(CMMParser.SEM); }
		public TerminalNode SEM(int i) {
			return getToken(CMMParser.SEM, i);
		}
		public List<TerminalNode> COM() { return getTokens(CMMParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(CMMParser.COM, i);
		}
		public List<TerminalNode> INT() { return getTokens(CMMParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CMMParser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(CMMParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(CMMParser.DOUBLE, i);
		}
		public List<TerminalNode> ID() { return getTokens(CMMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMMParser.ID, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(CMMParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(CMMParser.COMMENT, i);
		}
		public WordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).enterWords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMMListener ) ((CMMListener)listener).exitWords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitWords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordsContext words() throws RecognitionException {
		WordsContext _localctx = new WordsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeyInt) | (1L << KeyDouble) | (1L << KeyIf) | (1L << KeyElse) | (1L << KeyWhile) | (1L << KeyBreak) | (1L << KeyRead) | (1L << KeyWrite) | (1L << KeyTrue) | (1L << KeyFalse) | (1L << LSB) | (1L << RSB) | (1L << LRB) | (1L << RRB) | (1L << LB) | (1L << RB) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << REM) | (1L << EQU) | (1L << ASS) | (1L << NEQU) | (1L << GREATER) | (1L << LESS) | (1L << GOE) | (1L << LOE) | (1L << SEM) | (1L << COM) | (1L << INT) | (1L << DOUBLE) | (1L << ID) | (1L << COMMENT))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KeyInt) | (1L << KeyDouble) | (1L << KeyIf) | (1L << KeyElse) | (1L << KeyWhile) | (1L << KeyBreak) | (1L << KeyRead) | (1L << KeyWrite) | (1L << KeyTrue) | (1L << KeyFalse) | (1L << LSB) | (1L << RSB) | (1L << LRB) | (1L << RRB) | (1L << LB) | (1L << RB) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << REM) | (1L << EQU) | (1L << ASS) | (1L << NEQU) | (1L << GREATER) | (1L << LESS) | (1L << GOE) | (1L << LOE) | (1L << SEM) | (1L << COM) | (1L << INT) | (1L << DOUBLE) | (1L << ID) | (1L << COMMENT))) != 0) );
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
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u00c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\64\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\7\13_\n\13\f\13\16\13b\13\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\5\fk\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\rw\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0080\n\16\f\16\16"+
		"\16\u0083\13\16\3\16\3\16\3\16\7\16\u0088\n\16\f\16\16\16\u008b\13\16"+
		"\5\16\u008d\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0095\n\17\3\20\3"+
		"\20\3\20\3\20\5\20\u009b\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00a8\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u00b6\n\21\f\21\16\21\u00b9\13\21\3\22\6\22"+
		"\u00bc\n\22\r\22\16\22\u00bd\3\22\2\3 \23\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"\2\b\3\2\3\4\3\2\27\31\3\2\25\26\4\2\32\32\34 \3\2$\'\5\2"+
		"\5\"))+-\u00cc\2$\3\2\2\2\4\63\3\2\2\2\6\65\3\2\2\2\b9\3\2\2\2\nB\3\2"+
		"\2\2\fH\3\2\2\2\16K\3\2\2\2\20P\3\2\2\2\22V\3\2\2\2\24\\\3\2\2\2\26j\3"+
		"\2\2\2\30v\3\2\2\2\32\u008c\3\2\2\2\34\u0094\3\2\2\2\36\u009a\3\2\2\2"+
		" \u00a7\3\2\2\2\"\u00bb\3\2\2\2$(\5\4\3\2%\'\5\4\3\2&%\3\2\2\2\'*\3\2"+
		"\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*(\3\2\2\2+\64\5\6\4\2,\64\5\f\7\2"+
		"-\64\5\16\b\2.\64\5\20\t\2/\64\5\22\n\2\60\64\5\b\5\2\61\64\5\n\6\2\62"+
		"\64\5\24\13\2\63+\3\2\2\2\63,\3\2\2\2\63-\3\2\2\2\63.\3\2\2\2\63/\3\2"+
		"\2\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\5\3\2\2\2\65\66\5\30"+
		"\r\2\66\67\5\32\16\2\678\7!\2\28\7\3\2\2\29:\7\7\2\2:;\7\21\2\2;<\5 \21"+
		"\2<=\7\22\2\2=@\5\4\3\2>?\7\b\2\2?A\5\4\3\2@>\3\2\2\2@A\3\2\2\2A\t\3\2"+
		"\2\2BC\7\t\2\2CD\7\21\2\2DE\5 \21\2EF\7\22\2\2FG\5\4\3\2G\13\3\2\2\2H"+
		"I\7\n\2\2IJ\7!\2\2J\r\3\2\2\2KL\5\34\17\2LM\7\33\2\2MN\5 \21\2NO\7!\2"+
		"\2O\17\3\2\2\2PQ\7\13\2\2QR\7\21\2\2RS\5\34\17\2ST\7\22\2\2TU\7!\2\2U"+
		"\21\3\2\2\2VW\7\f\2\2WX\7\21\2\2XY\5 \21\2YZ\7\22\2\2Z[\7!\2\2[\23\3\2"+
		"\2\2\\`\7\23\2\2]_\5\4\3\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3"+
		"\2\2\2b`\3\2\2\2cd\7\24\2\2d\25\3\2\2\2ef\5\34\17\2fg\t\2\2\2gk\3\2\2"+
		"\2hi\t\2\2\2ik\5\34\17\2je\3\2\2\2jh\3\2\2\2k\27\3\2\2\2lw\7\5\2\2mw\7"+
		"\6\2\2no\7\5\2\2op\7\17\2\2pq\7)\2\2qw\7\20\2\2rs\7\6\2\2st\7\17\2\2t"+
		"u\7)\2\2uw\7\20\2\2vl\3\2\2\2vm\3\2\2\2vn\3\2\2\2vr\3\2\2\2w\31\3\2\2"+
		"\2xy\7,\2\2yz\7\33\2\2z\u0081\5 \21\2{|\7\"\2\2|}\7,\2\2}~\7\33\2\2~\u0080"+
		"\5 \21\2\177{\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u008d\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0089\7,\2\2\u0085"+
		"\u0086\7\"\2\2\u0086\u0088\7,\2\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008cx\3\2\2\2\u008c\u0084\3\2\2\2\u008d\33\3\2\2\2\u008e"+
		"\u008f\7,\2\2\u008f\u0090\7\17\2\2\u0090\u0091\5 \21\2\u0091\u0092\7\20"+
		"\2\2\u0092\u0095\3\2\2\2\u0093\u0095\7,\2\2\u0094\u008e\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\35\3\2\2\2\u0096\u009b\7)\2\2\u0097\u009b\7+\2\2"+
		"\u0098\u009b\7\r\2\2\u0099\u009b\7\16\2\2\u009a\u0096\3\2\2\2\u009a\u0097"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\37\3\2\2\2\u009c"+
		"\u009d\b\21\1\2\u009d\u009e\7\21\2\2\u009e\u009f\5 \21\2\u009f\u00a0\7"+
		"\22\2\2\u00a0\u00a8\3\2\2\2\u00a1\u00a2\7\26\2\2\u00a2\u00a8\5 \21\n\u00a3"+
		"\u00a4\7(\2\2\u00a4\u00a8\5 \21\t\u00a5\u00a8\5\34\17\2\u00a6\u00a8\5"+
		"\36\20\2\u00a7\u009c\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00b7\3\2\2\2\u00a9\u00aa\f\b"+
		"\2\2\u00aa\u00ab\t\3\2\2\u00ab\u00b6\5 \21\t\u00ac\u00ad\f\7\2\2\u00ad"+
		"\u00ae\t\4\2\2\u00ae\u00b6\5 \21\b\u00af\u00b0\f\6\2\2\u00b0\u00b1\t\5"+
		"\2\2\u00b1\u00b6\5 \21\7\u00b2\u00b3\f\5\2\2\u00b3\u00b4\t\6\2\2\u00b4"+
		"\u00b6\5 \21\6\u00b5\u00a9\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00af\3\2"+
		"\2\2\u00b5\u00b2\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8!\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\t\7\2\2"+
		"\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be#\3\2\2\2\21(\63@`jv\u0081\u0089\u008c\u0094\u009a\u00a7"+
		"\u00b5\u00b7\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}