// Generated from C:/Users/Dan/university-git/Year 3/COMP3200 - Individual Research Project/research-project/deliverables/code/parser\Elune.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EluneParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, NAME=78, NORMALSTRING=79, CHARSTRING=80, 
		LONGSTRING=81, INT=82, HEX=83, FLOAT=84, HEX_FLOAT=85, COMMENT=86, LINE_COMMENT=87, 
		WS=88, SHEBANG=89;
	public static final int
		RULE_root = 0, RULE_block = 1, RULE_stat = 2, RULE_importdef = 3, RULE_assignexp = 4, 
		RULE_compoundassign = 5, RULE_attnamelist = 6, RULE_attrib = 7, RULE_retstat = 8, 
		RULE_label = 9, RULE_funcname = 10, RULE_varlist = 11, RULE_namelist = 12, 
		RULE_explist = 13, RULE_ifStmt = 14, RULE_elseIfStmt = 15, RULE_elseStmt = 16, 
		RULE_tryStmt = 17, RULE_catchStmt = 18, RULE_finallyStmt = 19, RULE_exp = 20, 
		RULE_prefixexp = 21, RULE_functioncall = 22, RULE_varOrExp = 23, RULE_var_ = 24, 
		RULE_varSuffix = 25, RULE_nameAndArgs = 26, RULE_args = 27, RULE_anondef = 28, 
		RULE_anonlist = 29, RULE_anonOrName = 30, RULE_funcbody = 31, RULE_parlist = 32, 
		RULE_tableconstructor = 33, RULE_fieldlist = 34, RULE_field = 35, RULE_fieldsep = 36, 
		RULE_operatorOr = 37, RULE_operatorAnd = 38, RULE_operatorComparison = 39, 
		RULE_operatorStrcat = 40, RULE_operatorAddSub = 41, RULE_operatorMulDivMod = 42, 
		RULE_operatorBitwise = 43, RULE_operatorUnary = 44, RULE_operatorPower = 45, 
		RULE_number = 46, RULE_string = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "block", "stat", "importdef", "assignexp", "compoundassign", 
			"attnamelist", "attrib", "retstat", "label", "funcname", "varlist", "namelist", 
			"explist", "ifStmt", "elseIfStmt", "elseStmt", "tryStmt", "catchStmt", 
			"finallyStmt", "exp", "prefixexp", "functioncall", "varOrExp", "var_", 
			"varSuffix", "nameAndArgs", "args", "anondef", "anonlist", "anonOrName", 
			"funcbody", "parlist", "tableconstructor", "fieldlist", "field", "fieldsep", 
			"operatorOr", "operatorAnd", "operatorComparison", "operatorStrcat", 
			"operatorAddSub", "operatorMulDivMod", "operatorBitwise", "operatorUnary", 
			"operatorPower", "number", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'global'", "'='", "'break'", "'continue'", "'goto'", "'do'", 
			"'{'", "'}'", "'while'", "'for'", "','", "'foreach'", "'in'", "'def'", 
			"'switch'", "'case'", "'default'", "'throw'", "'print'", "'('", "')'", 
			"'import'", "'+='", "'-='", "'*='", "'/='", "'^='", "'%='", "'&='", "'|='", 
			"'<<='", "'>>='", "'//='", "'<'", "'>'", "'return'", "'::'", "'.'", "':'", 
			"'if'", "'elseif'", "'else'", "'try'", "'catch'", "'finally'", "'null'", 
			"'false'", "'true'", "'...'", "'length'", "'['", "']'", "'lambda'", "'or'", 
			"'||'", "'and'", "'&&'", "'<='", "'>='", "'!='", "'=='", "'is'", "'++'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'//'", "'&'", "'|'", "'~'", "'<<'", 
			"'>>'", "'not'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "NAME", "NORMALSTRING", "CHARSTRING", 
			"LONGSTRING", "INT", "HEX", "FLOAT", "HEX_FLOAT", "COMMENT", "LINE_COMMENT", 
			"WS", "SHEBANG"
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
	public String getGrammarFileName() { return "Elune.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EluneParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(EluneParser.EOF, 0); }
		public List<ImportdefContext> importdef() {
			return getRuleContexts(ImportdefContext.class);
		}
		public ImportdefContext importdef(int i) {
			return getRuleContext(ImportdefContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(96);
				importdef();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			block();
			setState(103);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public RetstatContext retstat() {
			return getRuleContext(RetstatContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__37) | (1L << T__40) | (1L << T__43))) != 0) || _la==NAME) {
				{
				{
				setState(105);
				stat();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(111);
				retstat();
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttContext extends StatContext {
		public AttnamelistContext attnamelist() {
			return getRuleContext(AttnamelistContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public AttContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterAtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitAtt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitAtt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExceptionContext extends StatContext {
		public TerminalNode NAME() { return getToken(EluneParser.NAME, 0); }
		public ExceptionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterException(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitException(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitException(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakContext extends StatContext {
		public BreakContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends StatContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public VarContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TryCatchContext extends StatContext {
		public TryStmtContext tryStmt() {
			return getRuleContext(TryStmtContext.class,0);
		}
		public CatchStmtContext catchStmt() {
			return getRuleContext(CatchStmtContext.class,0);
		}
		public FinallyStmtContext finallyStmt() {
			return getRuleContext(FinallyStmtContext.class,0);
		}
		public TryCatchContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterTryCatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitTryCatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitTryCatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StatContext {
		public TerminalNode NAME() { return getToken(EluneParser.NAME, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DoContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitDo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GlobalFuncContext extends StatContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public GlobalFuncContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterGlobalFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitGlobalFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitGlobalFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchContext extends StatContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public SwitchContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Functioncall_Context extends StatContext {
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public Functioncall_Context(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterFunctioncall_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitFunctioncall_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitFunctioncall_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatLabelContext extends StatContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StatLabelContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterStatLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitStatLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitStatLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForeachContext extends StatContext {
		public List<TerminalNode> NAME() { return getTokens(EluneParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EluneParser.NAME, i);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForeachContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitForeach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitForeach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends StatContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GotoContext extends StatContext {
		public TerminalNode NAME() { return getToken(EluneParser.NAME, 0); }
		public GotoContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterGoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitGoto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitGoto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncContext extends StatContext {
		public TerminalNode NAME() { return getToken(EluneParser.NAME, 0); }
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FuncContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintBracketsContext extends StatContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintBracketsContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterPrintBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitPrintBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitPrintBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DoWhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueContext extends StatContext {
		public ContinueContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GlobalVarContext extends StatContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public GlobalVarContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterGlobalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitGlobalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitGlobalVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseContext extends StatContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public List<ElseIfStmtContext> elseIfStmt() {
			return getRuleContexts(ElseIfStmtContext.class);
		}
		public ElseIfStmtContext elseIfStmt(int i) {
			return getRuleContext(ElseIfStmtContext.class,i);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfElseContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjFuncContext extends StatContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public ObjFuncContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterObjFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitObjFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitObjFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SepContext extends StatContext {
		public SepContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitSep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitSep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatContext {
		public AssignexpContext assignexp() {
			return getRuleContext(AssignexpContext.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new SepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new GlobalVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(T__1);
				setState(116);
				varlist();
				setState(117);
				match(T__2);
				setState(118);
				explist();
				}
				break;
			case 3:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				varlist();
				setState(121);
				match(T__2);
				setState(122);
				explist();
				}
				break;
			case 4:
				_localctx = new Functioncall_Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				functioncall();
				}
				break;
			case 5:
				_localctx = new StatLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				label();
				}
				break;
			case 6:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(127);
				match(T__4);
				}
				break;
			case 8:
				_localctx = new GotoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				match(T__5);
				setState(129);
				match(NAME);
				}
				break;
			case 9:
				_localctx = new DoContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(130);
				match(T__6);
				setState(131);
				match(T__7);
				setState(132);
				block();
				setState(133);
				match(T__8);
				}
				break;
			case 10:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(135);
				match(T__9);
				setState(136);
				exp(0);
				setState(137);
				match(T__7);
				setState(138);
				block();
				setState(139);
				match(T__8);
				}
				break;
			case 11:
				_localctx = new DoWhileContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(141);
				match(T__6);
				setState(142);
				match(T__7);
				setState(143);
				block();
				setState(144);
				match(T__8);
				setState(145);
				match(T__9);
				setState(146);
				exp(0);
				}
				break;
			case 12:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(148);
				ifStmt();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__41) {
					{
					{
					setState(149);
					elseIfStmt();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__42) {
					{
					setState(155);
					elseStmt();
					}
				}

				}
				break;
			case 13:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(158);
				match(T__10);
				setState(159);
				match(NAME);
				setState(160);
				match(T__2);
				setState(161);
				exp(0);
				setState(162);
				match(T__11);
				setState(163);
				exp(0);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(164);
					match(T__11);
					setState(165);
					exp(0);
					}
				}

				setState(168);
				match(T__7);
				setState(169);
				block();
				setState(170);
				match(T__8);
				}
				break;
			case 14:
				_localctx = new ForeachContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(172);
				match(T__12);
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(173);
					match(NAME);
					setState(174);
					match(T__11);
					}
					break;
				}
				setState(177);
				match(NAME);
				setState(178);
				match(T__13);
				setState(179);
				explist();
				setState(180);
				match(T__7);
				setState(181);
				block();
				setState(182);
				match(T__8);
				}
				break;
			case 15:
				_localctx = new GlobalFuncContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(184);
				match(T__1);
				setState(185);
				match(T__14);
				setState(186);
				funcname();
				setState(187);
				funcbody();
				}
				break;
			case 16:
				_localctx = new FuncContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(189);
				match(T__14);
				setState(190);
				match(NAME);
				setState(191);
				funcbody();
				}
				break;
			case 17:
				_localctx = new ObjFuncContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(192);
				match(T__14);
				setState(193);
				funcname();
				setState(194);
				funcbody();
				}
				break;
			case 18:
				_localctx = new AttContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(196);
				attnamelist();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(197);
					match(T__2);
					setState(198);
					explist();
					}
				}

				}
				break;
			case 19:
				_localctx = new SwitchContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(201);
				match(T__15);
				setState(202);
				exp(0);
				setState(203);
				match(T__7);
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(204);
					match(T__16);
					setState(205);
					exp(0);
					setState(206);
					match(T__7);
					setState(207);
					block();
					setState(208);
					match(T__8);
					}
					}
					setState(212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__16 );
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(214);
					match(T__17);
					setState(215);
					match(T__7);
					setState(216);
					block();
					setState(217);
					match(T__8);
					}
				}

				setState(221);
				match(T__8);
				}
				break;
			case 20:
				_localctx = new TryCatchContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(223);
				tryStmt();
				setState(224);
				catchStmt();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(225);
					finallyStmt();
					}
				}

				}
				break;
			case 21:
				_localctx = new ExceptionContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(228);
				match(T__18);
				setState(229);
				match(NAME);
				}
				break;
			case 22:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(230);
				assignexp();
				}
				break;
			case 23:
				_localctx = new PrintBracketsContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(231);
				match(T__19);
				setState(232);
				match(T__20);
				setState(233);
				exp(0);
				setState(234);
				match(T__21);
				}
				break;
			case 24:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(236);
				match(T__19);
				setState(237);
				exp(0);
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

	public static class ImportdefContext extends ParserRuleContext {
		public ImportdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importdef; }
	 
		public ImportdefContext() { }
		public void copyFrom(ImportdefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImportModuleContext extends ImportdefContext {
		public TerminalNode NAME() { return getToken(EluneParser.NAME, 0); }
		public ImportModuleContext(ImportdefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterImportModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitImportModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitImportModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportdefContext importdef() throws RecognitionException {
		ImportdefContext _localctx = new ImportdefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importdef);
		try {
			_localctx = new ImportModuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__22);
			setState(241);
			match(NAME);
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

	public static class AssignexpContext extends ParserRuleContext {
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public CompoundassignContext compoundassign() {
			return getRuleContext(CompoundassignContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterAssignexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitAssignexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitAssignexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignexpContext assignexp() throws RecognitionException {
		AssignexpContext _localctx = new AssignexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			var_();
			setState(244);
			compoundassign();
			setState(245);
			exp(0);
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

	public static class CompoundassignContext extends ParserRuleContext {
		public CompoundassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterCompoundassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitCompoundassign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitCompoundassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundassignContext compoundassign() throws RecognitionException {
		CompoundassignContext _localctx = new CompoundassignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compoundassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
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

	public static class AttnamelistContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(EluneParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EluneParser.NAME, i);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public AttribContext attrib(int i) {
			return getRuleContext(AttribContext.class,i);
		}
		public AttnamelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attnamelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterAttnamelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitAttnamelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitAttnamelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttnamelistContext attnamelist() throws RecognitionException {
		AttnamelistContext _localctx = new AttnamelistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attnamelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(NAME);
			setState(250);
			attrib();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(251);
				match(T__11);
				setState(252);
				match(NAME);
				setState(253);
				attrib();
				}
				}
				setState(258);
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

	public static class AttribContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EluneParser.NAME, 0); }
		public AttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitAttrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(259);
				match(T__34);
				setState(260);
				match(NAME);
				setState(261);
				match(T__35);
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

	public static class RetstatContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public RetstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterRetstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitRetstat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitRetstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetstatContext retstat() throws RecognitionException {
		RetstatContext _localctx = new RetstatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_retstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__36);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__20) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__72 - 66)) | (1L << (T__75 - 66)) | (1L << (NAME - 66)) | (1L << (NORMALSTRING - 66)) | (1L << (CHARSTRING - 66)) | (1L << (LONGSTRING - 66)) | (1L << (INT - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT - 66)) | (1L << (HEX_FLOAT - 66)))) != 0)) {
				{
				setState(265);
				explist();
				}
			}

			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(268);
				match(T__0);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EluneParser.NAME, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__37);
			setState(272);
			match(NAME);
			setState(273);
			match(T__37);
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

	public static class FuncnameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(EluneParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EluneParser.NAME, i);
		}
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitFuncname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(NAME);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(276);
				match(T__38);
				setState(277);
				match(NAME);
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(283);
				match(T__39);
				setState(284);
				match(NAME);
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

	public static class VarlistContext extends ParserRuleContext {
		public List<Var_Context> var_() {
			return getRuleContexts(Var_Context.class);
		}
		public Var_Context var_(int i) {
			return getRuleContext(Var_Context.class,i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			var_();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(288);
				match(T__11);
				setState(289);
				var_();
				}
				}
				setState(294);
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

	public static class NamelistContext extends ParserRuleContext {
		public List<AnonOrNameContext> anonOrName() {
			return getRuleContexts(AnonOrNameContext.class);
		}
		public AnonOrNameContext anonOrName(int i) {
			return getRuleContext(AnonOrNameContext.class,i);
		}
		public NamelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterNamelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitNamelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitNamelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamelistContext namelist() throws RecognitionException {
		NamelistContext _localctx = new NamelistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_namelist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			anonOrName();
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					match(T__11);
					setState(297);
					anonOrName();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class ExplistContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_explist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			exp(0);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(304);
				match(T__11);
				setState(305);
				exp(0);
				}
				}
				setState(310);
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

	public static class IfStmtContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__40);
			setState(312);
			exp(0);
			setState(313);
			match(T__7);
			setState(314);
			block();
			setState(315);
			match(T__8);
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

	public static class ElseIfStmtContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterElseIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitElseIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitElseIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStmtContext elseIfStmt() throws RecognitionException {
		ElseIfStmtContext _localctx = new ElseIfStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseIfStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__41);
			setState(318);
			exp(0);
			setState(319);
			match(T__7);
			setState(320);
			block();
			setState(321);
			match(T__8);
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

	public static class ElseStmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__42);
			setState(324);
			match(T__7);
			setState(325);
			block();
			setState(326);
			match(T__8);
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

	public static class TryStmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TryStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterTryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitTryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitTryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStmtContext tryStmt() throws RecognitionException {
		TryStmtContext _localctx = new TryStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tryStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__43);
			setState(329);
			match(T__7);
			setState(330);
			block();
			setState(331);
			match(T__8);
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

	public static class CatchStmtContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(EluneParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EluneParser.NAME, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CatchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterCatchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitCatchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitCatchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchStmtContext catchStmt() throws RecognitionException {
		CatchStmtContext _localctx = new CatchStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_catchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(333);
				match(T__44);
				setState(334);
				match(NAME);
				setState(335);
				match(T__7);
				setState(336);
				block();
				setState(337);
				match(T__8);
				}
				}
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__44 );
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

	public static class FinallyStmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterFinallyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitFinallyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitFinallyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyStmtContext finallyStmt() throws RecognitionException {
		FinallyStmtContext _localctx = new FinallyStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_finallyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__45);
			setState(344);
			match(T__7);
			setState(345);
			block();
			setState(346);
			match(T__8);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Anondef_Context extends ExpContext {
		public AnondefContext anondef() {
			return getRuleContext(AnondefContext.class,0);
		}
		public Anondef_Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterAnondef_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitAnondef_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitAnondef_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivModContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorMulDivModContext operatorMulDivMod() {
			return getRuleContext(OperatorMulDivModContext.class,0);
		}
		public MulDivModContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorComparisonContext operatorComparison() {
			return getRuleContext(OperatorComparisonContext.class,0);
		}
		public CompareContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorOrContext operatorOr() {
			return getRuleContext(OperatorOrContext.class,0);
		}
		public OrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllArgsContext extends ExpContext {
		public AllArgsContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterAllArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitAllArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitAllArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends ExpContext {
		public FalseContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LengthContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LengthContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorAddSubContext operatorAddSub() {
			return getRuleContext(OperatorAddSubContext.class,0);
		}
		public AddSubContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryContext extends ExpContext {
		public OperatorUnaryContext operatorUnary() {
			return getRuleContext(OperatorUnaryContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnaryContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorStrcatContext operatorStrcat() {
			return getRuleContext(OperatorStrcatContext.class,0);
		}
		public ConcatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Prefixexp_Context extends ExpContext {
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public Prefixexp_Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterPrefixexp_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitPrefixexp_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitPrefixexp_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullContext extends ExpContext {
		public NullContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Number_Context extends ExpContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Number_Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterNumber_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitNumber_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitNumber_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tableconstructor_Context extends ExpContext {
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public Tableconstructor_Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterTableconstructor_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitTableconstructor_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitTableconstructor_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorAndContext operatorAnd() {
			return getRuleContext(OperatorAndContext.class,0);
		}
		public AndContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends ExpContext {
		public TrueContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class String_Context extends ExpContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public String_Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterString_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitString_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitString_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorBitwiseContext operatorBitwise() {
			return getRuleContext(OperatorBitwiseContext.class,0);
		}
		public BitwiseContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterBitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitBitwise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitBitwise(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assignexp_Context extends ExpContext {
		public AssignexpContext assignexp() {
			return getRuleContext(AssignexpContext.class,0);
		}
		public Assignexp_Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterAssignexp_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitAssignexp_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitAssignexp_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorPowerContext operatorPower() {
			return getRuleContext(OperatorPowerContext.class,0);
		}
		public PowerContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LengthBracketsContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public LengthBracketsContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterLengthBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitLengthBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitLengthBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new NullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(349);
				match(T__46);
				}
				break;
			case 2:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(350);
				match(T__47);
				}
				break;
			case 3:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(351);
				match(T__48);
				}
				break;
			case 4:
				{
				_localctx = new Number_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(352);
				number();
				}
				break;
			case 5:
				{
				_localctx = new String_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353);
				string();
				}
				break;
			case 6:
				{
				_localctx = new AllArgsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				match(T__49);
				}
				break;
			case 7:
				{
				_localctx = new Anondef_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(355);
				anondef();
				}
				break;
			case 8:
				{
				_localctx = new Prefixexp_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356);
				prefixexp();
				}
				break;
			case 9:
				{
				_localctx = new Tableconstructor_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(357);
				tableconstructor();
				}
				break;
			case 10:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(358);
				operatorUnary();
				setState(359);
				exp(11);
				}
				break;
			case 11:
				{
				_localctx = new LengthBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361);
				match(T__50);
				setState(362);
				match(T__20);
				setState(363);
				exp(0);
				setState(364);
				match(T__21);
				}
				break;
			case 12:
				{
				_localctx = new LengthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				match(T__50);
				setState(367);
				exp(9);
				}
				break;
			case 13:
				{
				_localctx = new Assignexp_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(368);
				assignexp();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(403);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(371);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(372);
						operatorPower();
						setState(373);
						exp(12);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(375);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(376);
						operatorMulDivMod();
						setState(377);
						exp(9);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(379);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(380);
						operatorAddSub();
						setState(381);
						exp(8);
						}
						break;
					case 4:
						{
						_localctx = new ConcatContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(383);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(384);
						operatorStrcat();
						setState(385);
						exp(6);
						}
						break;
					case 5:
						{
						_localctx = new CompareContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(387);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(388);
						operatorComparison();
						setState(389);
						exp(6);
						}
						break;
					case 6:
						{
						_localctx = new AndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(391);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(392);
						operatorAnd();
						setState(393);
						exp(5);
						}
						break;
					case 7:
						{
						_localctx = new OrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(395);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(396);
						operatorOr();
						setState(397);
						exp(4);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(399);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(400);
						operatorBitwise();
						setState(401);
						exp(3);
						}
						break;
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class PrefixexpContext extends ParserRuleContext {
		public VarOrExpContext varOrExp() {
			return getRuleContext(VarOrExpContext.class,0);
		}
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public PrefixexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterPrefixexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitPrefixexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitPrefixexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixexpContext prefixexp() throws RecognitionException {
		PrefixexpContext _localctx = new PrefixexpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_prefixexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			varOrExp();
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(409);
					nameAndArgs();
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class FunctioncallContext extends ParserRuleContext {
		public VarOrExpContext varOrExp() {
			return getRuleContext(VarOrExpContext.class,0);
		}
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functioncall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			varOrExp();
			setState(417); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(416);
					nameAndArgs();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(419); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class VarOrExpContext extends ParserRuleContext {
		public VarOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrExp; }
	 
		public VarOrExpContext() { }
		public void copyFrom(VarOrExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Var__Context extends VarOrExpContext {
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public Var__Context(VarOrExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterVar__(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitVar__(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitVar__(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsExpContext extends VarOrExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BracketsExpContext(VarOrExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterBracketsExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitBracketsExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitBracketsExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarOrExpContext varOrExp() throws RecognitionException {
		VarOrExpContext _localctx = new VarOrExpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_varOrExp);
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new Var__Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				var_();
				}
				break;
			case 2:
				_localctx = new BracketsExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(T__20);
				setState(423);
				exp(0);
				setState(424);
				match(T__21);
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

	public static class Var_Context extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EluneParser.NAME, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<VarSuffixContext> varSuffix() {
			return getRuleContexts(VarSuffixContext.class);
		}
		public VarSuffixContext varSuffix(int i) {
			return getRuleContext(VarSuffixContext.class,i);
		}
		public Var_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterVar_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitVar_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitVar_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_Context var_() throws RecognitionException {
		Var_Context _localctx = new Var_Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_var_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(428);
				match(NAME);
				}
				break;
			case T__20:
				{
				setState(429);
				match(T__20);
				setState(430);
				exp(0);
				setState(431);
				match(T__21);
				setState(432);
				varSuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(436);
					varSuffix();
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
			exitRule();
		}
		return _localctx;
	}

	public static class VarSuffixContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NAME() { return getToken(EluneParser.NAME, 0); }
		public List<NameAndArgsContext> nameAndArgs() {
			return getRuleContexts(NameAndArgsContext.class);
		}
		public NameAndArgsContext nameAndArgs(int i) {
			return getRuleContext(NameAndArgsContext.class,i);
		}
		public VarSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterVarSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitVarSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitVarSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSuffixContext varSuffix() throws RecognitionException {
		VarSuffixContext _localctx = new VarSuffixContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_varSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__39 - 21)) | (1L << (NORMALSTRING - 21)) | (1L << (CHARSTRING - 21)) | (1L << (LONGSTRING - 21)))) != 0)) {
				{
				{
				setState(442);
				nameAndArgs();
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
				{
				setState(448);
				match(T__51);
				setState(449);
				exp(0);
				setState(450);
				match(T__52);
				}
				break;
			case T__38:
				{
				setState(452);
				match(T__38);
				setState(453);
				match(NAME);
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

	public static class NameAndArgsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode NAME() { return getToken(EluneParser.NAME, 0); }
		public NameAndArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameAndArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterNameAndArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitNameAndArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitNameAndArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameAndArgsContext nameAndArgs() throws RecognitionException {
		NameAndArgsContext _localctx = new NameAndArgsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nameAndArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(456);
				match(T__39);
				setState(457);
				match(NAME);
				}
			}

			setState(460);
			args();
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

	public static class ArgsContext extends ParserRuleContext {
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	 
		public ArgsContext() { }
		public void copyFrom(ArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprArgsContext extends ArgsContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExprArgsContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterExprArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitExprArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitExprArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringArgsContext extends ArgsContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringArgsContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterStringArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitStringArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitStringArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_args);
		int _la;
		try {
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new ExprArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				match(T__20);
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__20) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__72 - 66)) | (1L << (T__75 - 66)) | (1L << (NAME - 66)) | (1L << (NORMALSTRING - 66)) | (1L << (CHARSTRING - 66)) | (1L << (LONGSTRING - 66)) | (1L << (INT - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT - 66)) | (1L << (HEX_FLOAT - 66)))) != 0)) {
					{
					setState(463);
					explist();
					}
				}

				setState(466);
				match(T__21);
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				_localctx = new StringArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				string();
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

	public static class AnondefContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AnonlistContext anonlist() {
			return getRuleContext(AnonlistContext.class,0);
		}
		public AnondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anondef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterAnondef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitAnondef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitAnondef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnondefContext anondef() throws RecognitionException {
		AnondefContext _localctx = new AnondefContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_anondef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(T__53);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(471);
				anonlist();
				}
			}

			setState(474);
			match(T__7);
			setState(475);
			block();
			setState(476);
			match(T__8);
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

	public static class AnonlistContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(EluneParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EluneParser.NAME, i);
		}
		public AnonlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterAnonlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitAnonlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitAnonlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonlistContext anonlist() throws RecognitionException {
		AnonlistContext _localctx = new AnonlistContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_anonlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(478);
				match(NAME);
				}
				}
				setState(481); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__49) {
				{
				setState(483);
				match(T__49);
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

	public static class AnonOrNameContext extends ParserRuleContext {
		public AnonOrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonOrName; }
	 
		public AnonOrNameContext() { }
		public void copyFrom(AnonOrNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Anondef__Context extends AnonOrNameContext {
		public AnondefContext anondef() {
			return getRuleContext(AnondefContext.class,0);
		}
		public Anondef__Context(AnonOrNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterAnondef__(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitAnondef__(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitAnondef__(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameContext extends AnonOrNameContext {
		public TerminalNode NAME() { return getToken(EluneParser.NAME, 0); }
		public NameContext(AnonOrNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonOrNameContext anonOrName() throws RecognitionException {
		AnonOrNameContext _localctx = new AnonOrNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_anonOrName);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new NameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(NAME);
				}
				break;
			case T__53:
				_localctx = new Anondef__Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				anondef();
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

	public static class FuncbodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParlistContext parlist() {
			return getRuleContext(ParlistContext.class,0);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterFuncbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitFuncbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitFuncbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__20);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (T__49 - 50)) | (1L << (T__53 - 50)) | (1L << (NAME - 50)))) != 0)) {
				{
				setState(491);
				parlist();
				}
			}

			setState(494);
			match(T__21);
			setState(495);
			match(T__7);
			setState(496);
			block();
			setState(497);
			match(T__8);
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

	public static class ParlistContext extends ParserRuleContext {
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public ParlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterParlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitParlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitParlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParlistContext parlist() throws RecognitionException {
		ParlistContext _localctx = new ParlistContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parlist);
		int _la;
		try {
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				namelist();
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(500);
					match(T__11);
					setState(501);
					match(T__49);
					}
				}

				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				match(T__49);
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

	public static class TableconstructorContext extends ParserRuleContext {
		public TableconstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableconstructor; }
	 
		public TableconstructorContext() { }
		public void copyFrom(TableconstructorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DictionaryContext extends TableconstructorContext {
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public DictionaryContext(TableconstructorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterDictionary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitDictionary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitDictionary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayContext extends TableconstructorContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ArrayContext(TableconstructorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableconstructorContext tableconstructor() throws RecognitionException {
		TableconstructorContext _localctx = new TableconstructorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tableconstructor);
		int _la;
		try {
			setState(517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				match(T__51);
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__20) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__72 - 66)) | (1L << (T__75 - 66)) | (1L << (NAME - 66)) | (1L << (NORMALSTRING - 66)) | (1L << (CHARSTRING - 66)) | (1L << (LONGSTRING - 66)) | (1L << (INT - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT - 66)) | (1L << (HEX_FLOAT - 66)))) != 0)) {
					{
					setState(508);
					explist();
					}
				}

				setState(511);
				match(T__52);
				}
				break;
			case T__7:
				_localctx = new DictionaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				match(T__7);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__20) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__72 - 66)) | (1L << (T__75 - 66)) | (1L << (NAME - 66)) | (1L << (NORMALSTRING - 66)) | (1L << (CHARSTRING - 66)) | (1L << (LONGSTRING - 66)) | (1L << (INT - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT - 66)) | (1L << (HEX_FLOAT - 66)))) != 0)) {
					{
					setState(513);
					fieldlist();
					}
				}

				setState(516);
				match(T__8);
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

	public static class FieldlistContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<FieldsepContext> fieldsep() {
			return getRuleContexts(FieldsepContext.class);
		}
		public FieldsepContext fieldsep(int i) {
			return getRuleContext(FieldsepContext.class,i);
		}
		public FieldlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterFieldlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitFieldlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitFieldlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldlistContext fieldlist() throws RecognitionException {
		FieldlistContext _localctx = new FieldlistContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fieldlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			field();
			setState(525);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(520);
					fieldsep();
					setState(521);
					field();
					}
					} 
				}
				setState(527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__11) {
				{
				setState(528);
				fieldsep();
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

	public static class FieldContext extends ParserRuleContext {
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	 
		public FieldContext() { }
		public void copyFrom(FieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarFieldContext extends FieldContext {
		public TerminalNode NAME() { return getToken(EluneParser.NAME, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarFieldContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterVarField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitVarField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitVarField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexedFieldContext extends FieldContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IndexedFieldContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterIndexedField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitIndexedField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitIndexedField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprFieldContext extends FieldContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExprFieldContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterExprField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitExprField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitExprField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_field);
		try {
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new ExprFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				match(T__20);
				setState(532);
				exp(0);
				setState(533);
				match(T__21);
				setState(534);
				match(T__2);
				setState(535);
				exp(0);
				}
				break;
			case 2:
				_localctx = new VarFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				match(NAME);
				setState(538);
				match(T__2);
				setState(539);
				exp(0);
				}
				break;
			case 3:
				_localctx = new IndexedFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				exp(0);
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

	public static class FieldsepContext extends ParserRuleContext {
		public FieldsepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldsep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterFieldsep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitFieldsep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitFieldsep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsepContext fieldsep() throws RecognitionException {
		FieldsepContext _localctx = new FieldsepContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_fieldsep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__11) ) {
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

	public static class OperatorOrContext extends ParserRuleContext {
		public OperatorOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterOperatorOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitOperatorOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitOperatorOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorOrContext operatorOr() throws RecognitionException {
		OperatorOrContext _localctx = new OperatorOrContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_operatorOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_la = _input.LA(1);
			if ( !(_la==T__54 || _la==T__55) ) {
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

	public static class OperatorAndContext extends ParserRuleContext {
		public OperatorAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterOperatorAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitOperatorAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitOperatorAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorAndContext operatorAnd() throws RecognitionException {
		OperatorAndContext _localctx = new OperatorAndContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_operatorAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_la = _input.LA(1);
			if ( !(_la==T__56 || _la==T__57) ) {
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

	public static class OperatorComparisonContext extends ParserRuleContext {
		public OperatorComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterOperatorComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitOperatorComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitOperatorComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorComparisonContext operatorComparison() throws RecognitionException {
		OperatorComparisonContext _localctx = new OperatorComparisonContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_operatorComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0)) ) {
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

	public static class OperatorStrcatContext extends ParserRuleContext {
		public OperatorStrcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorStrcat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterOperatorStrcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitOperatorStrcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitOperatorStrcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorStrcatContext operatorStrcat() throws RecognitionException {
		OperatorStrcatContext _localctx = new OperatorStrcatContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_operatorStrcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(T__63);
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

	public static class OperatorAddSubContext extends ParserRuleContext {
		public OperatorAddSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAddSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterOperatorAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitOperatorAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitOperatorAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorAddSubContext operatorAddSub() throws RecognitionException {
		OperatorAddSubContext _localctx = new OperatorAddSubContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operatorAddSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_la = _input.LA(1);
			if ( !(_la==T__64 || _la==T__65) ) {
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

	public static class OperatorMulDivModContext extends ParserRuleContext {
		public OperatorMulDivModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorMulDivMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterOperatorMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitOperatorMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitOperatorMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorMulDivModContext operatorMulDivMod() throws RecognitionException {
		OperatorMulDivModContext _localctx = new OperatorMulDivModContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_operatorMulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)))) != 0)) ) {
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

	public static class OperatorBitwiseContext extends ParserRuleContext {
		public OperatorBitwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorBitwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterOperatorBitwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitOperatorBitwise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitOperatorBitwise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorBitwiseContext operatorBitwise() throws RecognitionException {
		OperatorBitwiseContext _localctx = new OperatorBitwiseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_operatorBitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)) | (1L << (T__73 - 71)) | (1L << (T__74 - 71)))) != 0)) ) {
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

	public static class OperatorUnaryContext extends ParserRuleContext {
		public OperatorUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterOperatorUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitOperatorUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitOperatorUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorUnaryContext operatorUnary() throws RecognitionException {
		OperatorUnaryContext _localctx = new OperatorUnaryContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_operatorUnary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__72 - 66)) | (1L << (T__75 - 66)))) != 0)) ) {
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

	public static class OperatorPowerContext extends ParserRuleContext {
		public OperatorPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorPower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterOperatorPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitOperatorPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitOperatorPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorPowerContext operatorPower() throws RecognitionException {
		OperatorPowerContext _localctx = new OperatorPowerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_operatorPower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(T__76);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HexFloatContext extends NumberContext {
		public TerminalNode HEX_FLOAT() { return getToken(EluneParser.HEX_FLOAT, 0); }
		public HexFloatContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterHexFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitHexFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitHexFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HexContext extends NumberContext {
		public TerminalNode HEX() { return getToken(EluneParser.HEX, 0); }
		public HexContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitHex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends NumberContext {
		public TerminalNode FLOAT() { return getToken(EluneParser.FLOAT, 0); }
		public FloatContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends NumberContext {
		public TerminalNode INT() { return getToken(EluneParser.INT, 0); }
		public IntContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_number);
		try {
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(INT);
				}
				break;
			case HEX:
				_localctx = new HexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				match(HEX);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(565);
				match(FLOAT);
				}
				break;
			case HEX_FLOAT:
				_localctx = new HexFloatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(566);
				match(HEX_FLOAT);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode NORMALSTRING() { return getToken(EluneParser.NORMALSTRING, 0); }
		public TerminalNode CHARSTRING() { return getToken(EluneParser.CHARSTRING, 0); }
		public TerminalNode LONGSTRING() { return getToken(EluneParser.LONGSTRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (NORMALSTRING - 79)) | (1L << (CHARSTRING - 79)) | (1L << (LONGSTRING - 79)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3[\u023e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\7\2d\n\2\f\2\16\2g\13\2"+
		"\3\2\3\2\3\2\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\5\3s\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0099\n"+
		"\4\f\4\16\4\u009c\13\4\3\4\5\4\u009f\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u00a9\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b2\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\u00ca\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4\u00d5\n\4"+
		"\r\4\16\4\u00d6\3\4\3\4\3\4\3\4\3\4\5\4\u00de\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\u00e5\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00f1\n\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u0101\n\b\f"+
		"\b\16\b\u0104\13\b\3\t\3\t\3\t\5\t\u0109\n\t\3\n\3\n\5\n\u010d\n\n\3\n"+
		"\5\n\u0110\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u0119\n\f\f\f\16\f"+
		"\u011c\13\f\3\f\3\f\5\f\u0120\n\f\3\r\3\r\3\r\7\r\u0125\n\r\f\r\16\r\u0128"+
		"\13\r\3\16\3\16\3\16\7\16\u012d\n\16\f\16\16\16\u0130\13\16\3\17\3\17"+
		"\3\17\7\17\u0135\n\17\f\17\16\17\u0138\13\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\6\24\u0156\n\24\r\24\16"+
		"\24\u0157\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0174\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0196\n\26\f\26\16\26\u0199\13"+
		"\26\3\27\3\27\7\27\u019d\n\27\f\27\16\27\u01a0\13\27\3\30\3\30\6\30\u01a4"+
		"\n\30\r\30\16\30\u01a5\3\31\3\31\3\31\3\31\3\31\5\31\u01ad\n\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\5\32\u01b5\n\32\3\32\7\32\u01b8\n\32\f\32\16\32"+
		"\u01bb\13\32\3\33\7\33\u01be\n\33\f\33\16\33\u01c1\13\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u01c9\n\33\3\34\3\34\5\34\u01cd\n\34\3\34\3\34\3"+
		"\35\3\35\5\35\u01d3\n\35\3\35\3\35\5\35\u01d7\n\35\3\36\3\36\5\36\u01db"+
		"\n\36\3\36\3\36\3\36\3\36\3\37\6\37\u01e2\n\37\r\37\16\37\u01e3\3\37\5"+
		"\37\u01e7\n\37\3 \3 \5 \u01eb\n \3!\3!\5!\u01ef\n!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\5\"\u01f9\n\"\3\"\5\"\u01fc\n\"\3#\3#\5#\u0200\n#\3#\3#\3#\5"+
		"#\u0205\n#\3#\5#\u0208\n#\3$\3$\3$\3$\7$\u020e\n$\f$\16$\u0211\13$\3$"+
		"\5$\u0214\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0220\n%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\5\60"+
		"\u023a\n\60\3\61\3\61\3\61\2\3*\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\f\3\2\32$\4\2\3\3\16"+
		"\16\3\29:\3\2;<\4\2%&=A\3\2CD\3\2EH\3\2IM\5\2DDKKNN\3\2QS\2\u0268\2e\3"+
		"\2\2\2\4n\3\2\2\2\6\u00f0\3\2\2\2\b\u00f2\3\2\2\2\n\u00f5\3\2\2\2\f\u00f9"+
		"\3\2\2\2\16\u00fb\3\2\2\2\20\u0108\3\2\2\2\22\u010a\3\2\2\2\24\u0111\3"+
		"\2\2\2\26\u0115\3\2\2\2\30\u0121\3\2\2\2\32\u0129\3\2\2\2\34\u0131\3\2"+
		"\2\2\36\u0139\3\2\2\2 \u013f\3\2\2\2\"\u0145\3\2\2\2$\u014a\3\2\2\2&\u0155"+
		"\3\2\2\2(\u0159\3\2\2\2*\u0173\3\2\2\2,\u019a\3\2\2\2.\u01a1\3\2\2\2\60"+
		"\u01ac\3\2\2\2\62\u01b4\3\2\2\2\64\u01bf\3\2\2\2\66\u01cc\3\2\2\28\u01d6"+
		"\3\2\2\2:\u01d8\3\2\2\2<\u01e1\3\2\2\2>\u01ea\3\2\2\2@\u01ec\3\2\2\2B"+
		"\u01fb\3\2\2\2D\u0207\3\2\2\2F\u0209\3\2\2\2H\u021f\3\2\2\2J\u0221\3\2"+
		"\2\2L\u0223\3\2\2\2N\u0225\3\2\2\2P\u0227\3\2\2\2R\u0229\3\2\2\2T\u022b"+
		"\3\2\2\2V\u022d\3\2\2\2X\u022f\3\2\2\2Z\u0231\3\2\2\2\\\u0233\3\2\2\2"+
		"^\u0239\3\2\2\2`\u023b\3\2\2\2bd\5\b\5\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2"+
		"ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\5\4\3\2ij\7\2\2\3j\3\3\2\2\2km\5\6\4"+
		"\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qs\5\22"+
		"\n\2rq\3\2\2\2rs\3\2\2\2s\5\3\2\2\2t\u00f1\7\3\2\2uv\7\4\2\2vw\5\30\r"+
		"\2wx\7\5\2\2xy\5\34\17\2y\u00f1\3\2\2\2z{\5\30\r\2{|\7\5\2\2|}\5\34\17"+
		"\2}\u00f1\3\2\2\2~\u00f1\5.\30\2\177\u00f1\5\24\13\2\u0080\u00f1\7\6\2"+
		"\2\u0081\u00f1\7\7\2\2\u0082\u0083\7\b\2\2\u0083\u00f1\7P\2\2\u0084\u0085"+
		"\7\t\2\2\u0085\u0086\7\n\2\2\u0086\u0087\5\4\3\2\u0087\u0088\7\13\2\2"+
		"\u0088\u00f1\3\2\2\2\u0089\u008a\7\f\2\2\u008a\u008b\5*\26\2\u008b\u008c"+
		"\7\n\2\2\u008c\u008d\5\4\3\2\u008d\u008e\7\13\2\2\u008e\u00f1\3\2\2\2"+
		"\u008f\u0090\7\t\2\2\u0090\u0091\7\n\2\2\u0091\u0092\5\4\3\2\u0092\u0093"+
		"\7\13\2\2\u0093\u0094\7\f\2\2\u0094\u0095\5*\26\2\u0095\u00f1\3\2\2\2"+
		"\u0096\u009a\5\36\20\2\u0097\u0099\5 \21\2\u0098\u0097\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009f\5\"\22\2\u009e\u009d\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u00f1\3\2\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00a2\7P\2\2\u00a2"+
		"\u00a3\7\5\2\2\u00a3\u00a4\5*\26\2\u00a4\u00a5\7\16\2\2\u00a5\u00a8\5"+
		"*\26\2\u00a6\u00a7\7\16\2\2\u00a7\u00a9\5*\26\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\n\2\2\u00ab\u00ac\5\4"+
		"\3\2\u00ac\u00ad\7\13\2\2\u00ad\u00f1\3\2\2\2\u00ae\u00b1\7\17\2\2\u00af"+
		"\u00b0\7P\2\2\u00b0\u00b2\7\16\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7P\2\2\u00b4\u00b5\7\20\2\2\u00b5"+
		"\u00b6\5\34\17\2\u00b6\u00b7\7\n\2\2\u00b7\u00b8\5\4\3\2\u00b8\u00b9\7"+
		"\13\2\2\u00b9\u00f1\3\2\2\2\u00ba\u00bb\7\4\2\2\u00bb\u00bc\7\21\2\2\u00bc"+
		"\u00bd\5\26\f\2\u00bd\u00be\5@!\2\u00be\u00f1\3\2\2\2\u00bf\u00c0\7\21"+
		"\2\2\u00c0\u00c1\7P\2\2\u00c1\u00f1\5@!\2\u00c2\u00c3\7\21\2\2\u00c3\u00c4"+
		"\5\26\f\2\u00c4\u00c5\5@!\2\u00c5\u00f1\3\2\2\2\u00c6\u00c9\5\16\b\2\u00c7"+
		"\u00c8\7\5\2\2\u00c8\u00ca\5\34\17\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3"+
		"\2\2\2\u00ca\u00f1\3\2\2\2\u00cb\u00cc\7\22\2\2\u00cc\u00cd\5*\26\2\u00cd"+
		"\u00d4\7\n\2\2\u00ce\u00cf\7\23\2\2\u00cf\u00d0\5*\26\2\u00d0\u00d1\7"+
		"\n\2\2\u00d1\u00d2\5\4\3\2\u00d2\u00d3\7\13\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00ce\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00dd\3\2\2\2\u00d8\u00d9\7\24\2\2\u00d9\u00da\7\n\2\2\u00da"+
		"\u00db\5\4\3\2\u00db\u00dc\7\13\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d8\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7\13\2\2\u00e0"+
		"\u00f1\3\2\2\2\u00e1\u00e2\5$\23\2\u00e2\u00e4\5&\24\2\u00e3\u00e5\5("+
		"\25\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00f1\3\2\2\2\u00e6"+
		"\u00e7\7\25\2\2\u00e7\u00f1\7P\2\2\u00e8\u00f1\5\n\6\2\u00e9\u00ea\7\26"+
		"\2\2\u00ea\u00eb\7\27\2\2\u00eb\u00ec\5*\26\2\u00ec\u00ed\7\30\2\2\u00ed"+
		"\u00f1\3\2\2\2\u00ee\u00ef\7\26\2\2\u00ef\u00f1\5*\26\2\u00f0t\3\2\2\2"+
		"\u00f0u\3\2\2\2\u00f0z\3\2\2\2\u00f0~\3\2\2\2\u00f0\177\3\2\2\2\u00f0"+
		"\u0080\3\2\2\2\u00f0\u0081\3\2\2\2\u00f0\u0082\3\2\2\2\u00f0\u0084\3\2"+
		"\2\2\u00f0\u0089\3\2\2\2\u00f0\u008f\3\2\2\2\u00f0\u0096\3\2\2\2\u00f0"+
		"\u00a0\3\2\2\2\u00f0\u00ae\3\2\2\2\u00f0\u00ba\3\2\2\2\u00f0\u00bf\3\2"+
		"\2\2\u00f0\u00c2\3\2\2\2\u00f0\u00c6\3\2\2\2\u00f0\u00cb\3\2\2\2\u00f0"+
		"\u00e1\3\2\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00e9\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f1\7\3\2\2\2\u00f2\u00f3\7\31\2\2\u00f3\u00f4"+
		"\7P\2\2\u00f4\t\3\2\2\2\u00f5\u00f6\5\62\32\2\u00f6\u00f7\5\f\7\2\u00f7"+
		"\u00f8\5*\26\2\u00f8\13\3\2\2\2\u00f9\u00fa\t\2\2\2\u00fa\r\3\2\2\2\u00fb"+
		"\u00fc\7P\2\2\u00fc\u0102\5\20\t\2\u00fd\u00fe\7\16\2\2\u00fe\u00ff\7"+
		"P\2\2\u00ff\u0101\5\20\t\2\u0100\u00fd\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\17\3\2\2\2\u0104\u0102\3\2\2"+
		"\2\u0105\u0106\7%\2\2\u0106\u0107\7P\2\2\u0107\u0109\7&\2\2\u0108\u0105"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\21\3\2\2\2\u010a\u010c\7\'\2\2\u010b"+
		"\u010d\5\34\17\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3"+
		"\2\2\2\u010e\u0110\7\3\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\23\3\2\2\2\u0111\u0112\7(\2\2\u0112\u0113\7P\2\2\u0113\u0114\7(\2\2\u0114"+
		"\25\3\2\2\2\u0115\u011a\7P\2\2\u0116\u0117\7)\2\2\u0117\u0119\7P\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011f\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7*\2\2\u011e"+
		"\u0120\7P\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\27\3\2\2\2"+
		"\u0121\u0126\5\62\32\2\u0122\u0123\7\16\2\2\u0123\u0125\5\62\32\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\31\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012e\5> \2\u012a\u012b"+
		"\7\16\2\2\u012b\u012d\5> \2\u012c\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\33\3\2\2\2\u0130\u012e\3\2\2"+
		"\2\u0131\u0136\5*\26\2\u0132\u0133\7\16\2\2\u0133\u0135\5*\26\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\35\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7+\2\2\u013a\u013b"+
		"\5*\26\2\u013b\u013c\7\n\2\2\u013c\u013d\5\4\3\2\u013d\u013e\7\13\2\2"+
		"\u013e\37\3\2\2\2\u013f\u0140\7,\2\2\u0140\u0141\5*\26\2\u0141\u0142\7"+
		"\n\2\2\u0142\u0143\5\4\3\2\u0143\u0144\7\13\2\2\u0144!\3\2\2\2\u0145\u0146"+
		"\7-\2\2\u0146\u0147\7\n\2\2\u0147\u0148\5\4\3\2\u0148\u0149\7\13\2\2\u0149"+
		"#\3\2\2\2\u014a\u014b\7.\2\2\u014b\u014c\7\n\2\2\u014c\u014d\5\4\3\2\u014d"+
		"\u014e\7\13\2\2\u014e%\3\2\2\2\u014f\u0150\7/\2\2\u0150\u0151\7P\2\2\u0151"+
		"\u0152\7\n\2\2\u0152\u0153\5\4\3\2\u0153\u0154\7\13\2\2\u0154\u0156\3"+
		"\2\2\2\u0155\u014f\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\'\3\2\2\2\u0159\u015a\7\60\2\2\u015a\u015b\7\n\2"+
		"\2\u015b\u015c\5\4\3\2\u015c\u015d\7\13\2\2\u015d)\3\2\2\2\u015e\u015f"+
		"\b\26\1\2\u015f\u0174\7\61\2\2\u0160\u0174\7\62\2\2\u0161\u0174\7\63\2"+
		"\2\u0162\u0174\5^\60\2\u0163\u0174\5`\61\2\u0164\u0174\7\64\2\2\u0165"+
		"\u0174\5:\36\2\u0166\u0174\5,\27\2\u0167\u0174\5D#\2\u0168\u0169\5Z.\2"+
		"\u0169\u016a\5*\26\r\u016a\u0174\3\2\2\2\u016b\u016c\7\65\2\2\u016c\u016d"+
		"\7\27\2\2\u016d\u016e\5*\26\2\u016e\u016f\7\30\2\2\u016f\u0174\3\2\2\2"+
		"\u0170\u0171\7\65\2\2\u0171\u0174\5*\26\13\u0172\u0174\5\n\6\2\u0173\u015e"+
		"\3\2\2\2\u0173\u0160\3\2\2\2\u0173\u0161\3\2\2\2\u0173\u0162\3\2\2\2\u0173"+
		"\u0163\3\2\2\2\u0173\u0164\3\2\2\2\u0173\u0165\3\2\2\2\u0173\u0166\3\2"+
		"\2\2\u0173\u0167\3\2\2\2\u0173\u0168\3\2\2\2\u0173\u016b\3\2\2\2\u0173"+
		"\u0170\3\2\2\2\u0173\u0172\3\2\2\2\u0174\u0197\3\2\2\2\u0175\u0176\f\16"+
		"\2\2\u0176\u0177\5\\/\2\u0177\u0178\5*\26\16\u0178\u0196\3\2\2\2\u0179"+
		"\u017a\f\n\2\2\u017a\u017b\5V,\2\u017b\u017c\5*\26\13\u017c\u0196\3\2"+
		"\2\2\u017d\u017e\f\t\2\2\u017e\u017f\5T+\2\u017f\u0180\5*\26\n\u0180\u0196"+
		"\3\2\2\2\u0181\u0182\f\b\2\2\u0182\u0183\5R*\2\u0183\u0184\5*\26\b\u0184"+
		"\u0196\3\2\2\2\u0185\u0186\f\7\2\2\u0186\u0187\5P)\2\u0187\u0188\5*\26"+
		"\b\u0188\u0196\3\2\2\2\u0189\u018a\f\6\2\2\u018a\u018b\5N(\2\u018b\u018c"+
		"\5*\26\7\u018c\u0196\3\2\2\2\u018d\u018e\f\5\2\2\u018e\u018f\5L\'\2\u018f"+
		"\u0190\5*\26\6\u0190\u0196\3\2\2\2\u0191\u0192\f\4\2\2\u0192\u0193\5X"+
		"-\2\u0193\u0194\5*\26\5\u0194\u0196\3\2\2\2\u0195\u0175\3\2\2\2\u0195"+
		"\u0179\3\2\2\2\u0195\u017d\3\2\2\2\u0195\u0181\3\2\2\2\u0195\u0185\3\2"+
		"\2\2\u0195\u0189\3\2\2\2\u0195\u018d\3\2\2\2\u0195\u0191\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198+\3\2\2\2"+
		"\u0199\u0197\3\2\2\2\u019a\u019e\5\60\31\2\u019b\u019d\5\66\34\2\u019c"+
		"\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f-\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\5\60\31\2\u01a2\u01a4"+
		"\5\66\34\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a3\3\2\2\2"+
		"\u01a5\u01a6\3\2\2\2\u01a6/\3\2\2\2\u01a7\u01ad\5\62\32\2\u01a8\u01a9"+
		"\7\27\2\2\u01a9\u01aa\5*\26\2\u01aa\u01ab\7\30\2\2\u01ab\u01ad\3\2\2\2"+
		"\u01ac\u01a7\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ad\61\3\2\2\2\u01ae\u01b5"+
		"\7P\2\2\u01af\u01b0\7\27\2\2\u01b0\u01b1\5*\26\2\u01b1\u01b2\7\30\2\2"+
		"\u01b2\u01b3\5\64\33\2\u01b3\u01b5\3\2\2\2\u01b4\u01ae\3\2\2\2\u01b4\u01af"+
		"\3\2\2\2\u01b5\u01b9\3\2\2\2\u01b6\u01b8\5\64\33\2\u01b7\u01b6\3\2\2\2"+
		"\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\63"+
		"\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01be\5\66\34\2\u01bd\u01bc\3\2\2\2"+
		"\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c8"+
		"\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7\66\2\2\u01c3\u01c4\5*\26\2"+
		"\u01c4\u01c5\7\67\2\2\u01c5\u01c9\3\2\2\2\u01c6\u01c7\7)\2\2\u01c7\u01c9"+
		"\7P\2\2\u01c8\u01c2\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\65\3\2\2\2\u01ca"+
		"\u01cb\7*\2\2\u01cb\u01cd\7P\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2"+
		"\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\58\35\2\u01cf\67\3\2\2\2\u01d0\u01d2"+
		"\7\27\2\2\u01d1\u01d3\5\34\17\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2"+
		"\2\u01d3\u01d4\3\2\2\2\u01d4\u01d7\7\30\2\2\u01d5\u01d7\5`\61\2\u01d6"+
		"\u01d0\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d79\3\2\2\2\u01d8\u01da\78\2\2\u01d9"+
		"\u01db\5<\37\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dc\u01dd\7\n\2\2\u01dd\u01de\5\4\3\2\u01de\u01df\7\13\2\2\u01df"+
		";\3\2\2\2\u01e0\u01e2\7P\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e7\7\64"+
		"\2\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7=\3\2\2\2\u01e8\u01eb"+
		"\7P\2\2\u01e9\u01eb\5:\36\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb"+
		"?\3\2\2\2\u01ec\u01ee\7\27\2\2\u01ed\u01ef\5B\"\2\u01ee\u01ed\3\2\2\2"+
		"\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\7\30\2\2\u01f1\u01f2"+
		"\7\n\2\2\u01f2\u01f3\5\4\3\2\u01f3\u01f4\7\13\2\2\u01f4A\3\2\2\2\u01f5"+
		"\u01f8\5\32\16\2\u01f6\u01f7\7\16\2\2\u01f7\u01f9\7\64\2\2\u01f8\u01f6"+
		"\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01fc\7\64\2\2"+
		"\u01fb\u01f5\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fcC\3\2\2\2\u01fd\u01ff\7"+
		"\66\2\2\u01fe\u0200\5\34\17\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2"+
		"\u0200\u0201\3\2\2\2\u0201\u0208\7\67\2\2\u0202\u0204\7\n\2\2\u0203\u0205"+
		"\5F$\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0208\7\13\2\2\u0207\u01fd\3\2\2\2\u0207\u0202\3\2\2\2\u0208E\3\2\2\2"+
		"\u0209\u020f\5H%\2\u020a\u020b\5J&\2\u020b\u020c\5H%\2\u020c\u020e\3\2"+
		"\2\2\u020d\u020a\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0214\5J"+
		"&\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214G\3\2\2\2\u0215\u0216"+
		"\7\27\2\2\u0216\u0217\5*\26\2\u0217\u0218\7\30\2\2\u0218\u0219\7\5\2\2"+
		"\u0219\u021a\5*\26\2\u021a\u0220\3\2\2\2\u021b\u021c\7P\2\2\u021c\u021d"+
		"\7\5\2\2\u021d\u0220\5*\26\2\u021e\u0220\5*\26\2\u021f\u0215\3\2\2\2\u021f"+
		"\u021b\3\2\2\2\u021f\u021e\3\2\2\2\u0220I\3\2\2\2\u0221\u0222\t\3\2\2"+
		"\u0222K\3\2\2\2\u0223\u0224\t\4\2\2\u0224M\3\2\2\2\u0225\u0226\t\5\2\2"+
		"\u0226O\3\2\2\2\u0227\u0228\t\6\2\2\u0228Q\3\2\2\2\u0229\u022a\7B\2\2"+
		"\u022aS\3\2\2\2\u022b\u022c\t\7\2\2\u022cU\3\2\2\2\u022d\u022e\t\b\2\2"+
		"\u022eW\3\2\2\2\u022f\u0230\t\t\2\2\u0230Y\3\2\2\2\u0231\u0232\t\n\2\2"+
		"\u0232[\3\2\2\2\u0233\u0234\7O\2\2\u0234]\3\2\2\2\u0235\u023a\7T\2\2\u0236"+
		"\u023a\7U\2\2\u0237\u023a\7V\2\2\u0238\u023a\7W\2\2\u0239\u0235\3\2\2"+
		"\2\u0239\u0236\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023a_"+
		"\3\2\2\2\u023b\u023c\t\13\2\2\u023ca\3\2\2\2\63enr\u009a\u009e\u00a8\u00b1"+
		"\u00c9\u00d6\u00dd\u00e4\u00f0\u0102\u0108\u010c\u010f\u011a\u011f\u0126"+
		"\u012e\u0136\u0157\u0173\u0195\u0197\u019e\u01a5\u01ac\u01b4\u01b9\u01bf"+
		"\u01c8\u01cc\u01d2\u01d6\u01da\u01e3\u01e6\u01ea\u01ee\u01f8\u01fb\u01ff"+
		"\u0204\u0207\u020f\u0213\u021f\u0239";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}