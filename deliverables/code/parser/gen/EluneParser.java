// Generated from C:/Users/dbest/university/research-project/deliverables/code/parser\Elune.g4 by ANTLR 4.9.1
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
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, NAME=72, NORMALSTRING=73, 
		CHARSTRING=74, LONGSTRING=75, INT=76, HEX=77, FLOAT=78, HEX_FLOAT=79, 
		COMMENT=80, LINE_COMMENT=81, WS=82, SHEBANG=83;
	public static final int
		RULE_start = 0, RULE_chunk = 1, RULE_block = 2, RULE_stat = 3, RULE_importdef = 4, 
		RULE_libname = 5, RULE_assignexp = 6, RULE_compoundassign = 7, RULE_attnamelist = 8, 
		RULE_attrib = 9, RULE_retstat = 10, RULE_label = 11, RULE_funcname = 12, 
		RULE_varlist = 13, RULE_namelist = 14, RULE_explist = 15, RULE_exp = 16, 
		RULE_prefixexp = 17, RULE_functioncall = 18, RULE_varOrExp = 19, RULE_var_ = 20, 
		RULE_varSuffix = 21, RULE_nameAndArgs = 22, RULE_args = 23, RULE_functiondef = 24, 
		RULE_funcbody = 25, RULE_parlist = 26, RULE_tableconstructor = 27, RULE_fieldlist = 28, 
		RULE_field = 29, RULE_fieldsep = 30, RULE_operatorOr = 31, RULE_operatorAnd = 32, 
		RULE_operatorComparison = 33, RULE_operatorStrcat = 34, RULE_operatorAddSub = 35, 
		RULE_operatorMulDivMod = 36, RULE_operatorBitwise = 37, RULE_operatorUnary = 38, 
		RULE_operatorPower = 39, RULE_number = 40, RULE_string = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "chunk", "block", "stat", "importdef", "libname", "assignexp", 
			"compoundassign", "attnamelist", "attrib", "retstat", "label", "funcname", 
			"varlist", "namelist", "explist", "exp", "prefixexp", "functioncall", 
			"varOrExp", "var_", "varSuffix", "nameAndArgs", "args", "functiondef", 
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
			"':'", "'while'", "'if'", "'elseif'", "'else'", "'for'", "','", "'foreach'", 
			"'in'", "'def'", "'switch'", "'case'", "'default'", "'try'", "'catch'", 
			"'import'", "'.'", "'+='", "'-='", "'*='", "'/='", "'^='", "'%='", "'&='", 
			"'|='", "'<<='", "'>>='", "'//='", "'<'", "'>'", "'return'", "'::'", 
			"'null'", "'false'", "'true'", "'...'", "'length'", "'print'", "'('", 
			"')'", "'['", "']'", "'lambda'", "'or'", "'and'", "'<='", "'>='", "'~='", 
			"'=='", "'is'", "'++'", "'+'", "'-'", "'*'", "'/'", "'%'", "'//'", "'&'", 
			"'|'", "'~'", "'<<'", "'>>'", "'not'", "'^'"
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
			"NAME", "NORMALSTRING", "CHARSTRING", "LONGSTRING", "INT", "HEX", "FLOAT", 
			"HEX_FLOAT", "COMMENT", "LINE_COMMENT", "WS", "SHEBANG"
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

	public static class StartContext extends ParserRuleContext {
		public ChunkContext chunk() {
			return getRuleContext(ChunkContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			chunk();
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

	public static class ChunkContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(EluneParser.EOF, 0); }
		public ImportdefContext importdef() {
			return getRuleContext(ImportdefContext.class,0);
		}
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_chunk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(86);
				importdef();
				}
			}

			setState(89);
			block();
			setState(90);
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
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					stat();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(98);
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
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode NAME() { return getToken(EluneParser.NAME, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public NamelistContext namelist() {
			return getRuleContext(NamelistContext.class,0);
		}
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public AttnamelistContext attnamelist() {
			return getRuleContext(AttnamelistContext.class,0);
		}
		public AssignexpContext assignexp() {
			return getRuleContext(AssignexpContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(T__1);
				setState(103);
				varlist();
				setState(104);
				match(T__2);
				setState(105);
				explist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				label();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				match(T__5);
				setState(112);
				match(NAME);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
				match(T__6);
				setState(114);
				match(T__7);
				setState(115);
				block();
				setState(116);
				match(T__0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				match(T__8);
				setState(119);
				exp(0);
				setState(120);
				match(T__7);
				setState(121);
				block();
				setState(122);
				match(T__0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(124);
				match(T__6);
				setState(125);
				match(T__7);
				setState(126);
				block();
				setState(127);
				match(T__8);
				setState(128);
				exp(0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(130);
				match(T__9);
				setState(131);
				exp(0);
				setState(132);
				match(T__7);
				setState(133);
				block();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(134);
					match(T__10);
					setState(135);
					exp(0);
					setState(136);
					match(T__7);
					setState(137);
					block();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(144);
					match(T__11);
					setState(145);
					match(T__7);
					setState(146);
					block();
					}
				}

				setState(149);
				match(T__0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(151);
				match(T__12);
				setState(152);
				match(NAME);
				setState(153);
				match(T__2);
				setState(154);
				exp(0);
				setState(155);
				match(T__13);
				setState(156);
				exp(0);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(157);
					match(T__13);
					setState(158);
					exp(0);
					}
				}

				setState(161);
				match(T__7);
				setState(162);
				block();
				setState(163);
				match(T__0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(165);
				match(T__14);
				setState(166);
				namelist();
				setState(167);
				match(T__15);
				setState(168);
				explist();
				setState(169);
				match(T__7);
				setState(170);
				block();
				setState(171);
				match(T__0);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(173);
				match(T__1);
				setState(174);
				match(T__16);
				setState(175);
				funcname();
				setState(176);
				funcbody();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(178);
				match(T__16);
				setState(179);
				match(NAME);
				setState(180);
				funcbody();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(181);
				attnamelist();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(182);
					match(T__2);
					setState(183);
					explist();
					}
				}

				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(186);
				match(T__17);
				setState(187);
				match(T__7);
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(188);
					match(T__18);
					setState(189);
					exp(0);
					setState(190);
					match(T__7);
					setState(191);
					block();
					}
					}
					setState(195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__18 );
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(197);
					match(T__19);
					setState(198);
					match(T__7);
					setState(199);
					block();
					}
				}

				setState(202);
				match(T__0);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(204);
				match(T__20);
				setState(205);
				match(T__7);
				setState(206);
				block();
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(207);
					match(T__21);
					setState(208);
					exp(0);
					setState(209);
					match(T__7);
					setState(210);
					block();
					}
					}
					setState(214); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__21 );
				setState(216);
				match(T__0);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(218);
				assignexp();
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
		public List<LibnameContext> libname() {
			return getRuleContexts(LibnameContext.class);
		}
		public LibnameContext libname(int i) {
			return getRuleContext(LibnameContext.class,i);
		}
		public ImportdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterImportdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitImportdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitImportdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportdefContext importdef() throws RecognitionException {
		ImportdefContext _localctx = new ImportdefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				match(T__22);
				setState(222);
				libname();
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 );
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

	public static class LibnameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(EluneParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EluneParser.NAME, i);
		}
		public LibnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterLibname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitLibname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitLibname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibnameContext libname() throws RecognitionException {
		LibnameContext _localctx = new LibnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_libname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(NAME);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(228);
				match(T__23);
				setState(229);
				match(NAME);
				}
				}
				setState(234);
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
		public TerminalNode NAME() { return getToken(EluneParser.NAME, 0); }
		public AttribContext attrib() {
			return getRuleContext(AttribContext.class,0);
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
		enterRule(_localctx, 12, RULE_assignexp);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				var_();
				setState(236);
				compoundassign();
				setState(237);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(NAME);
				setState(240);
				attrib();
				setState(241);
				compoundassign();
				setState(242);
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
		enterRule(_localctx, 14, RULE_compoundassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_attnamelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(NAME);
			setState(249);
			attrib();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(250);
				match(T__13);
				setState(251);
				match(NAME);
				setState(252);
				attrib();
				}
				}
				setState(257);
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
		enterRule(_localctx, 18, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(258);
				match(T__35);
				setState(259);
				match(NAME);
				setState(260);
				match(T__36);
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
		enterRule(_localctx, 20, RULE_retstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__37);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (T__39 - 40)) | (1L << (T__40 - 40)) | (1L << (T__41 - 40)) | (1L << (T__42 - 40)) | (1L << (T__43 - 40)) | (1L << (T__44 - 40)) | (1L << (T__45 - 40)) | (1L << (T__47 - 40)) | (1L << (T__49 - 40)) | (1L << (T__59 - 40)) | (1L << (T__66 - 40)) | (1L << (T__69 - 40)) | (1L << (NAME - 40)) | (1L << (NORMALSTRING - 40)) | (1L << (CHARSTRING - 40)) | (1L << (LONGSTRING - 40)) | (1L << (INT - 40)) | (1L << (HEX - 40)) | (1L << (FLOAT - 40)) | (1L << (HEX_FLOAT - 40)))) != 0)) {
				{
				setState(264);
				explist();
				}
			}

			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(267);
				match(T__0);
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
		enterRule(_localctx, 22, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__38);
			setState(271);
			match(NAME);
			setState(272);
			match(T__38);
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
		enterRule(_localctx, 24, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(NAME);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(275);
				match(T__23);
				setState(276);
				match(NAME);
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(282);
				match(T__7);
				setState(283);
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
		enterRule(_localctx, 26, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			var_();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(287);
				match(T__13);
				setState(288);
				var_();
				}
				}
				setState(293);
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
		public List<TerminalNode> NAME() { return getTokens(EluneParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EluneParser.NAME, i);
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
		enterRule(_localctx, 28, RULE_namelist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(NAME);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295);
					match(T__13);
					setState(296);
					match(NAME);
					}
					} 
				}
				setState(301);
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
		enterRule(_localctx, 30, RULE_explist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			exp(0);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(303);
				match(T__13);
				setState(304);
				exp(0);
				}
				}
				setState(309);
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

	public static class ExpContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public FunctiondefContext functiondef() {
			return getRuleContext(FunctiondefContext.class,0);
		}
		public PrefixexpContext prefixexp() {
			return getRuleContext(PrefixexpContext.class,0);
		}
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public OperatorUnaryContext operatorUnary() {
			return getRuleContext(OperatorUnaryContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperatorPowerContext operatorPower() {
			return getRuleContext(OperatorPowerContext.class,0);
		}
		public OperatorMulDivModContext operatorMulDivMod() {
			return getRuleContext(OperatorMulDivModContext.class,0);
		}
		public OperatorAddSubContext operatorAddSub() {
			return getRuleContext(OperatorAddSubContext.class,0);
		}
		public OperatorStrcatContext operatorStrcat() {
			return getRuleContext(OperatorStrcatContext.class,0);
		}
		public OperatorComparisonContext operatorComparison() {
			return getRuleContext(OperatorComparisonContext.class,0);
		}
		public OperatorAndContext operatorAnd() {
			return getRuleContext(OperatorAndContext.class,0);
		}
		public OperatorOrContext operatorOr() {
			return getRuleContext(OperatorOrContext.class,0);
		}
		public OperatorBitwiseContext operatorBitwise() {
			return getRuleContext(OperatorBitwiseContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitExp(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				{
				setState(311);
				match(T__39);
				}
				break;
			case T__40:
				{
				setState(312);
				match(T__40);
				}
				break;
			case T__41:
				{
				setState(313);
				match(T__41);
				}
				break;
			case INT:
			case HEX:
			case FLOAT:
			case HEX_FLOAT:
				{
				setState(314);
				number();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				{
				setState(315);
				string();
				}
				break;
			case T__42:
				{
				setState(316);
				match(T__42);
				}
				break;
			case T__49:
				{
				setState(317);
				functiondef();
				}
				break;
			case T__45:
			case NAME:
				{
				setState(318);
				prefixexp();
				}
				break;
			case T__47:
				{
				setState(319);
				tableconstructor();
				}
				break;
			case T__59:
			case T__66:
			case T__69:
				{
				setState(320);
				operatorUnary();
				setState(321);
				exp(10);
				}
				break;
			case T__43:
				{
				setState(323);
				match(T__43);
				setState(324);
				exp(9);
				}
				break;
			case T__44:
				{
				setState(325);
				match(T__44);
				setState(326);
				exp(8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(361);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(329);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(330);
						operatorPower();
						setState(331);
						exp(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(333);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(334);
						operatorMulDivMod();
						setState(335);
						exp(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(337);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(338);
						operatorAddSub();
						setState(339);
						exp(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(341);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(342);
						operatorStrcat();
						setState(343);
						exp(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(345);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(346);
						operatorComparison();
						setState(347);
						exp(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(349);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(350);
						operatorAnd();
						setState(351);
						exp(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(353);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(354);
						operatorOr();
						setState(355);
						exp(3);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(357);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(358);
						operatorBitwise();
						setState(359);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(365);
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
		enterRule(_localctx, 34, RULE_prefixexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			varOrExp();
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(367);
					nameAndArgs();
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 36, RULE_functioncall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			varOrExp();
			setState(375); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(374);
					nameAndArgs();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(377); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varOrExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterVarOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitVarOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitVarOrExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarOrExpContext varOrExp() throws RecognitionException {
		VarOrExpContext _localctx = new VarOrExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_varOrExp);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				var_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(T__45);
				setState(381);
				exp(0);
				setState(382);
				match(T__46);
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
		enterRule(_localctx, 40, RULE_var_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(386);
				match(NAME);
				}
				break;
			case T__45:
				{
				setState(387);
				match(T__45);
				setState(388);
				exp(0);
				setState(389);
				match(T__46);
				setState(390);
				varSuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(394);
					varSuffix();
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 42, RULE_varSuffix);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(400);
					nameAndArgs();
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				{
				setState(406);
				match(T__47);
				setState(407);
				exp(0);
				setState(408);
				match(T__48);
				}
				break;
			case T__23:
				{
				setState(410);
				match(T__23);
				setState(411);
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
		enterRule(_localctx, 44, RULE_nameAndArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(414);
				match(T__7);
				setState(415);
				match(NAME);
				}
			}

			setState(418);
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
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TableconstructorContext tableconstructor() {
			return getRuleContext(TableconstructorContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_args);
		int _la;
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(T__45);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (T__39 - 40)) | (1L << (T__40 - 40)) | (1L << (T__41 - 40)) | (1L << (T__42 - 40)) | (1L << (T__43 - 40)) | (1L << (T__44 - 40)) | (1L << (T__45 - 40)) | (1L << (T__47 - 40)) | (1L << (T__49 - 40)) | (1L << (T__59 - 40)) | (1L << (T__66 - 40)) | (1L << (T__69 - 40)) | (1L << (NAME - 40)) | (1L << (NORMALSTRING - 40)) | (1L << (CHARSTRING - 40)) | (1L << (LONGSTRING - 40)) | (1L << (INT - 40)) | (1L << (HEX - 40)) | (1L << (FLOAT - 40)) | (1L << (HEX_FLOAT - 40)))) != 0)) {
					{
					setState(421);
					explist();
					}
				}

				setState(424);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				tableconstructor();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
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

	public static class FunctiondefContext extends ParserRuleContext {
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FunctiondefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterFunctiondef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitFunctiondef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitFunctiondef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondefContext functiondef() throws RecognitionException {
		FunctiondefContext _localctx = new FunctiondefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functiondef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__49);
			setState(430);
			funcbody();
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
		enterRule(_localctx, 50, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(T__45);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42 || _la==NAME) {
				{
				setState(433);
				parlist();
				}
			}

			setState(436);
			match(T__46);
			setState(437);
			match(T__7);
			setState(438);
			block();
			setState(439);
			match(T__0);
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
		enterRule(_localctx, 52, RULE_parlist);
		int _la;
		try {
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				namelist();
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(442);
					match(T__13);
					setState(443);
					match(T__42);
					}
				}

				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(T__42);
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
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public TableconstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableconstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterTableconstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitTableconstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitTableconstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableconstructorContext tableconstructor() throws RecognitionException {
		TableconstructorContext _localctx = new TableconstructorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tableconstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(T__47);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (T__39 - 40)) | (1L << (T__40 - 40)) | (1L << (T__41 - 40)) | (1L << (T__42 - 40)) | (1L << (T__43 - 40)) | (1L << (T__44 - 40)) | (1L << (T__45 - 40)) | (1L << (T__47 - 40)) | (1L << (T__49 - 40)) | (1L << (T__59 - 40)) | (1L << (T__66 - 40)) | (1L << (T__69 - 40)) | (1L << (NAME - 40)) | (1L << (NORMALSTRING - 40)) | (1L << (CHARSTRING - 40)) | (1L << (LONGSTRING - 40)) | (1L << (INT - 40)) | (1L << (HEX - 40)) | (1L << (FLOAT - 40)) | (1L << (HEX_FLOAT - 40)))) != 0)) {
				{
				setState(450);
				fieldlist();
				}
			}

			setState(453);
			match(T__48);
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
		enterRule(_localctx, 56, RULE_fieldlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			field();
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(456);
					fieldsep();
					setState(457);
					field();
					}
					} 
				}
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__13) {
				{
				setState(464);
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
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NAME() { return getToken(EluneParser.NAME, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_field);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(T__47);
				setState(468);
				exp(0);
				setState(469);
				match(T__48);
				setState(470);
				match(T__2);
				setState(471);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(NAME);
				setState(474);
				match(T__2);
				setState(475);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
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
		enterRule(_localctx, 60, RULE_fieldsep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__13) ) {
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
		enterRule(_localctx, 62, RULE_operatorOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(T__50);
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
		enterRule(_localctx, 64, RULE_operatorAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(T__51);
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
		enterRule(_localctx, 66, RULE_operatorComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) ) {
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
		enterRule(_localctx, 68, RULE_operatorStrcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(T__57);
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
		enterRule(_localctx, 70, RULE_operatorAddSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_la = _input.LA(1);
			if ( !(_la==T__58 || _la==T__59) ) {
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
		enterRule(_localctx, 72, RULE_operatorMulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (T__60 - 61)) | (1L << (T__61 - 61)) | (1L << (T__62 - 61)) | (1L << (T__63 - 61)))) != 0)) ) {
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
		enterRule(_localctx, 74, RULE_operatorBitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)))) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_operatorUnary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (T__59 - 60)) | (1L << (T__66 - 60)) | (1L << (T__69 - 60)))) != 0)) ) {
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
		enterRule(_localctx, 78, RULE_operatorPower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(T__70);
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
		public TerminalNode INT() { return getToken(EluneParser.INT, 0); }
		public TerminalNode HEX() { return getToken(EluneParser.HEX, 0); }
		public TerminalNode FLOAT() { return getToken(EluneParser.FLOAT, 0); }
		public TerminalNode HEX_FLOAT() { return getToken(EluneParser.HEX_FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EluneListener ) ((EluneListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EluneVisitor ) return ((EluneVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (INT - 76)) | (1L << (HEX - 76)) | (1L << (FLOAT - 76)) | (1L << (HEX_FLOAT - 76)))) != 0)) ) {
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
		enterRule(_localctx, 82, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (NORMALSTRING - 73)) | (1L << (CHARSTRING - 73)) | (1L << (LONGSTRING - 73)))) != 0)) ) {
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
		case 16:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3U\u01fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\5\3Z\n\3\3\3\3\3\3\3\3\4\7\4`\n\4\f\4\16\4c\13\4\3\4\5\4f\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5\u008e\n\5\f\5\16\5\u0091\13\5\3\5\3\5\3\5\5\5\u0096"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a2\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u00bb\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u00c4\n\5\r\5"+
		"\16\5\u00c5\3\5\3\5\3\5\5\5\u00cb\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\6\5\u00d7\n\5\r\5\16\5\u00d8\3\5\3\5\3\5\5\5\u00de\n\5\3\6\3"+
		"\6\6\6\u00e2\n\6\r\6\16\6\u00e3\3\7\3\7\3\7\7\7\u00e9\n\7\f\7\16\7\u00ec"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00f7\n\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u0100\n\n\f\n\16\n\u0103\13\n\3\13\3\13\3\13\5\13\u0108"+
		"\n\13\3\f\3\f\5\f\u010c\n\f\3\f\5\f\u010f\n\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\7\16\u0118\n\16\f\16\16\16\u011b\13\16\3\16\3\16\5\16\u011f\n\16"+
		"\3\17\3\17\3\17\7\17\u0124\n\17\f\17\16\17\u0127\13\17\3\20\3\20\3\20"+
		"\7\20\u012c\n\20\f\20\16\20\u012f\13\20\3\21\3\21\3\21\7\21\u0134\n\21"+
		"\f\21\16\21\u0137\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014a\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u016c\n\22\f\22\16\22\u016f\13\22\3\23\3\23\7\23\u0173\n\23"+
		"\f\23\16\23\u0176\13\23\3\24\3\24\6\24\u017a\n\24\r\24\16\24\u017b\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0183\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u018b\n\26\3\26\7\26\u018e\n\26\f\26\16\26\u0191\13\26\3\27\7\27\u0194"+
		"\n\27\f\27\16\27\u0197\13\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u019f"+
		"\n\27\3\30\3\30\5\30\u01a3\n\30\3\30\3\30\3\31\3\31\5\31\u01a9\n\31\3"+
		"\31\3\31\3\31\5\31\u01ae\n\31\3\32\3\32\3\32\3\33\3\33\5\33\u01b5\n\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u01bf\n\34\3\34\5\34\u01c2"+
		"\n\34\3\35\3\35\5\35\u01c6\n\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u01ce"+
		"\n\36\f\36\16\36\u01d1\13\36\3\36\5\36\u01d4\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01e0\n\37\3 \3 \3!\3!\3\"\3\"\3#"+
		"\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\2\3\",\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"\2\13\3\2\33%\4\2\3\3\20\20\4\2&\'\67;\3\2=>\3\2?B\3\2CG\5\2>>EEHH\3\2"+
		"NQ\3\2KM\2\u021d\2V\3\2\2\2\4Y\3\2\2\2\6a\3\2\2\2\b\u00dd\3\2\2\2\n\u00e1"+
		"\3\2\2\2\f\u00e5\3\2\2\2\16\u00f6\3\2\2\2\20\u00f8\3\2\2\2\22\u00fa\3"+
		"\2\2\2\24\u0107\3\2\2\2\26\u0109\3\2\2\2\30\u0110\3\2\2\2\32\u0114\3\2"+
		"\2\2\34\u0120\3\2\2\2\36\u0128\3\2\2\2 \u0130\3\2\2\2\"\u0149\3\2\2\2"+
		"$\u0170\3\2\2\2&\u0177\3\2\2\2(\u0182\3\2\2\2*\u018a\3\2\2\2,\u0195\3"+
		"\2\2\2.\u01a2\3\2\2\2\60\u01ad\3\2\2\2\62\u01af\3\2\2\2\64\u01b2\3\2\2"+
		"\2\66\u01c1\3\2\2\28\u01c3\3\2\2\2:\u01c9\3\2\2\2<\u01df\3\2\2\2>\u01e1"+
		"\3\2\2\2@\u01e3\3\2\2\2B\u01e5\3\2\2\2D\u01e7\3\2\2\2F\u01e9\3\2\2\2H"+
		"\u01eb\3\2\2\2J\u01ed\3\2\2\2L\u01ef\3\2\2\2N\u01f1\3\2\2\2P\u01f3\3\2"+
		"\2\2R\u01f5\3\2\2\2T\u01f7\3\2\2\2VW\5\4\3\2W\3\3\2\2\2XZ\5\n\6\2YX\3"+
		"\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\5\6\4\2\\]\7\2\2\3]\5\3\2\2\2^`\5\b\5\2"+
		"_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2df\5\26\f"+
		"\2ed\3\2\2\2ef\3\2\2\2f\7\3\2\2\2g\u00de\7\3\2\2hi\7\4\2\2ij\5\34\17\2"+
		"jk\7\5\2\2kl\5 \21\2l\u00de\3\2\2\2m\u00de\5&\24\2n\u00de\5\30\r\2o\u00de"+
		"\7\6\2\2p\u00de\7\7\2\2qr\7\b\2\2r\u00de\7J\2\2st\7\t\2\2tu\7\n\2\2uv"+
		"\5\6\4\2vw\7\3\2\2w\u00de\3\2\2\2xy\7\13\2\2yz\5\"\22\2z{\7\n\2\2{|\5"+
		"\6\4\2|}\7\3\2\2}\u00de\3\2\2\2~\177\7\t\2\2\177\u0080\7\n\2\2\u0080\u0081"+
		"\5\6\4\2\u0081\u0082\7\13\2\2\u0082\u0083\5\"\22\2\u0083\u00de\3\2\2\2"+
		"\u0084\u0085\7\f\2\2\u0085\u0086\5\"\22\2\u0086\u0087\7\n\2\2\u0087\u008f"+
		"\5\6\4\2\u0088\u0089\7\r\2\2\u0089\u008a\5\"\22\2\u008a\u008b\7\n\2\2"+
		"\u008b\u008c\5\6\4\2\u008c\u008e\3\2\2\2\u008d\u0088\3\2\2\2\u008e\u0091"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0095\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0093\7\16\2\2\u0093\u0094\7\n\2\2\u0094\u0096\5"+
		"\6\4\2\u0095\u0092\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\7\3\2\2\u0098\u00de\3\2\2\2\u0099\u009a\7\17\2\2\u009a\u009b\7"+
		"J\2\2\u009b\u009c\7\5\2\2\u009c\u009d\5\"\22\2\u009d\u009e\7\20\2\2\u009e"+
		"\u00a1\5\"\22\2\u009f\u00a0\7\20\2\2\u00a0\u00a2\5\"\22\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\n\2\2\u00a4"+
		"\u00a5\5\6\4\2\u00a5\u00a6\7\3\2\2\u00a6\u00de\3\2\2\2\u00a7\u00a8\7\21"+
		"\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\5 \21\2\u00ab"+
		"\u00ac\7\n\2\2\u00ac\u00ad\5\6\4\2\u00ad\u00ae\7\3\2\2\u00ae\u00de\3\2"+
		"\2\2\u00af\u00b0\7\4\2\2\u00b0\u00b1\7\23\2\2\u00b1\u00b2\5\32\16\2\u00b2"+
		"\u00b3\5\64\33\2\u00b3\u00de\3\2\2\2\u00b4\u00b5\7\23\2\2\u00b5\u00b6"+
		"\7J\2\2\u00b6\u00de\5\64\33\2\u00b7\u00ba\5\22\n\2\u00b8\u00b9\7\5\2\2"+
		"\u00b9\u00bb\5 \21\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00de"+
		"\3\2\2\2\u00bc\u00bd\7\24\2\2\u00bd\u00c3\7\n\2\2\u00be\u00bf\7\25\2\2"+
		"\u00bf\u00c0\5\"\22\2\u00c0\u00c1\7\n\2\2\u00c1\u00c2\5\6\4\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00be\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00c8\7\26\2\2\u00c8\u00c9\7"+
		"\n\2\2\u00c9\u00cb\5\6\4\2\u00ca\u00c7\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\7\3\2\2\u00cd\u00de\3\2\2\2\u00ce\u00cf\7\27"+
		"\2\2\u00cf\u00d0\7\n\2\2\u00d0\u00d6\5\6\4\2\u00d1\u00d2\7\30\2\2\u00d2"+
		"\u00d3\5\"\22\2\u00d3\u00d4\7\n\2\2\u00d4\u00d5\5\6\4\2\u00d5\u00d7\3"+
		"\2\2\2\u00d6\u00d1\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\3\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00de\5\16\b\2\u00ddg\3\2\2\2\u00ddh\3\2\2\2\u00ddm\3\2\2\2"+
		"\u00ddn\3\2\2\2\u00ddo\3\2\2\2\u00ddp\3\2\2\2\u00ddq\3\2\2\2\u00dds\3"+
		"\2\2\2\u00ddx\3\2\2\2\u00dd~\3\2\2\2\u00dd\u0084\3\2\2\2\u00dd\u0099\3"+
		"\2\2\2\u00dd\u00a7\3\2\2\2\u00dd\u00af\3\2\2\2\u00dd\u00b4\3\2\2\2\u00dd"+
		"\u00b7\3\2\2\2\u00dd\u00bc\3\2\2\2\u00dd\u00ce\3\2\2\2\u00dd\u00dc\3\2"+
		"\2\2\u00de\t\3\2\2\2\u00df\u00e0\7\31\2\2\u00e0\u00e2\5\f\7\2\u00e1\u00df"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\13\3\2\2\2\u00e5\u00ea\7J\2\2\u00e6\u00e7\7\32\2\2\u00e7\u00e9\7J\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\r\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\5*\26\2\u00ee"+
		"\u00ef\5\20\t\2\u00ef\u00f0\5\"\22\2\u00f0\u00f7\3\2\2\2\u00f1\u00f2\7"+
		"J\2\2\u00f2\u00f3\5\24\13\2\u00f3\u00f4\5\20\t\2\u00f4\u00f5\5\"\22\2"+
		"\u00f5\u00f7\3\2\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f7\17"+
		"\3\2\2\2\u00f8\u00f9\t\2\2\2\u00f9\21\3\2\2\2\u00fa\u00fb\7J\2\2\u00fb"+
		"\u0101\5\24\13\2\u00fc\u00fd\7\20\2\2\u00fd\u00fe\7J\2\2\u00fe\u0100\5"+
		"\24\13\2\u00ff\u00fc\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\23\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7&\2\2"+
		"\u0105\u0106\7J\2\2\u0106\u0108\7\'\2\2\u0107\u0104\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\25\3\2\2\2\u0109\u010b\7(\2\2\u010a\u010c\5 \21\2\u010b"+
		"\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010f\7\3"+
		"\2\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\27\3\2\2\2\u0110\u0111"+
		"\7)\2\2\u0111\u0112\7J\2\2\u0112\u0113\7)\2\2\u0113\31\3\2\2\2\u0114\u0119"+
		"\7J\2\2\u0115\u0116\7\32\2\2\u0116\u0118\7J\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011e\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\n\2\2\u011d\u011f\7J\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\33\3\2\2\2\u0120\u0125\5*\26"+
		"\2\u0121\u0122\7\20\2\2\u0122\u0124\5*\26\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\35\3\2\2"+
		"\2\u0127\u0125\3\2\2\2\u0128\u012d\7J\2\2\u0129\u012a\7\20\2\2\u012a\u012c"+
		"\7J\2\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\37\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0135\5\"\22"+
		"\2\u0131\u0132\7\20\2\2\u0132\u0134\5\"\22\2\u0133\u0131\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136!\3\2\2\2"+
		"\u0137\u0135\3\2\2\2\u0138\u0139\b\22\1\2\u0139\u014a\7*\2\2\u013a\u014a"+
		"\7+\2\2\u013b\u014a\7,\2\2\u013c\u014a\5R*\2\u013d\u014a\5T+\2\u013e\u014a"+
		"\7-\2\2\u013f\u014a\5\62\32\2\u0140\u014a\5$\23\2\u0141\u014a\58\35\2"+
		"\u0142\u0143\5N(\2\u0143\u0144\5\"\22\f\u0144\u014a\3\2\2\2\u0145\u0146"+
		"\7.\2\2\u0146\u014a\5\"\22\13\u0147\u0148\7/\2\2\u0148\u014a\5\"\22\n"+
		"\u0149\u0138\3\2\2\2\u0149\u013a\3\2\2\2\u0149\u013b\3\2\2\2\u0149\u013c"+
		"\3\2\2\2\u0149\u013d\3\2\2\2\u0149\u013e\3\2\2\2\u0149\u013f\3\2\2\2\u0149"+
		"\u0140\3\2\2\2\u0149\u0141\3\2\2\2\u0149\u0142\3\2\2\2\u0149\u0145\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u014a\u016d\3\2\2\2\u014b\u014c\f\r\2\2\u014c"+
		"\u014d\5P)\2\u014d\u014e\5\"\22\r\u014e\u016c\3\2\2\2\u014f\u0150\f\t"+
		"\2\2\u0150\u0151\5J&\2\u0151\u0152\5\"\22\n\u0152\u016c\3\2\2\2\u0153"+
		"\u0154\f\b\2\2\u0154\u0155\5H%\2\u0155\u0156\5\"\22\t\u0156\u016c\3\2"+
		"\2\2\u0157\u0158\f\7\2\2\u0158\u0159\5F$\2\u0159\u015a\5\"\22\7\u015a"+
		"\u016c\3\2\2\2\u015b\u015c\f\6\2\2\u015c\u015d\5D#\2\u015d\u015e\5\"\22"+
		"\7\u015e\u016c\3\2\2\2\u015f\u0160\f\5\2\2\u0160\u0161\5B\"\2\u0161\u0162"+
		"\5\"\22\6\u0162\u016c\3\2\2\2\u0163\u0164\f\4\2\2\u0164\u0165\5@!\2\u0165"+
		"\u0166\5\"\22\5\u0166\u016c\3\2\2\2\u0167\u0168\f\3\2\2\u0168\u0169\5"+
		"L\'\2\u0169\u016a\5\"\22\4\u016a\u016c\3\2\2\2\u016b\u014b\3\2\2\2\u016b"+
		"\u014f\3\2\2\2\u016b\u0153\3\2\2\2\u016b\u0157\3\2\2\2\u016b\u015b\3\2"+
		"\2\2\u016b\u015f\3\2\2\2\u016b\u0163\3\2\2\2\u016b\u0167\3\2\2\2\u016c"+
		"\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e#\3\2\2\2"+
		"\u016f\u016d\3\2\2\2\u0170\u0174\5(\25\2\u0171\u0173\5.\30\2\u0172\u0171"+
		"\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"%\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0179\5(\25\2\u0178\u017a\5.\30\2"+
		"\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\'\3\2\2\2\u017d\u0183\5*\26\2\u017e\u017f\7\60\2\2\u017f"+
		"\u0180\5\"\22\2\u0180\u0181\7\61\2\2\u0181\u0183\3\2\2\2\u0182\u017d\3"+
		"\2\2\2\u0182\u017e\3\2\2\2\u0183)\3\2\2\2\u0184\u018b\7J\2\2\u0185\u0186"+
		"\7\60\2\2\u0186\u0187\5\"\22\2\u0187\u0188\7\61\2\2\u0188\u0189\5,\27"+
		"\2\u0189\u018b\3\2\2\2\u018a\u0184\3\2\2\2\u018a\u0185\3\2\2\2\u018b\u018f"+
		"\3\2\2\2\u018c\u018e\5,\27\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190+\3\2\2\2\u0191\u018f\3\2\2\2"+
		"\u0192\u0194\5.\30\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u019e\3\2\2\2\u0197\u0195\3\2\2\2\u0198"+
		"\u0199\7\62\2\2\u0199\u019a\5\"\22\2\u019a\u019b\7\63\2\2\u019b\u019f"+
		"\3\2\2\2\u019c\u019d\7\32\2\2\u019d\u019f\7J\2\2\u019e\u0198\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019f-\3\2\2\2\u01a0\u01a1\7\n\2\2\u01a1\u01a3\7J\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\5\60"+
		"\31\2\u01a5/\3\2\2\2\u01a6\u01a8\7\60\2\2\u01a7\u01a9\5 \21\2\u01a8\u01a7"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ae\7\61\2\2"+
		"\u01ab\u01ae\58\35\2\u01ac\u01ae\5T+\2\u01ad\u01a6\3\2\2\2\u01ad\u01ab"+
		"\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\61\3\2\2\2\u01af\u01b0\7\64\2\2\u01b0"+
		"\u01b1\5\64\33\2\u01b1\63\3\2\2\2\u01b2\u01b4\7\60\2\2\u01b3\u01b5\5\66"+
		"\34\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\7\61\2\2\u01b7\u01b8\7\n\2\2\u01b8\u01b9\5\6\4\2\u01b9\u01ba\7"+
		"\3\2\2\u01ba\65\3\2\2\2\u01bb\u01be\5\36\20\2\u01bc\u01bd\7\20\2\2\u01bd"+
		"\u01bf\7-\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c2\3\2"+
		"\2\2\u01c0\u01c2\7-\2\2\u01c1\u01bb\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2"+
		"\67\3\2\2\2\u01c3\u01c5\7\62\2\2\u01c4\u01c6\5:\36\2\u01c5\u01c4\3\2\2"+
		"\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7\63\2\2\u01c8"+
		"9\3\2\2\2\u01c9\u01cf\5<\37\2\u01ca\u01cb\5> \2\u01cb\u01cc\5<\37\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01ca\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2"+
		"\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2"+
		"\u01d4\5> \2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4;\3\2\2\2\u01d5"+
		"\u01d6\7\62\2\2\u01d6\u01d7\5\"\22\2\u01d7\u01d8\7\63\2\2\u01d8\u01d9"+
		"\7\5\2\2\u01d9\u01da\5\"\22\2\u01da\u01e0\3\2\2\2\u01db\u01dc\7J\2\2\u01dc"+
		"\u01dd\7\5\2\2\u01dd\u01e0\5\"\22\2\u01de\u01e0\5\"\22\2\u01df\u01d5\3"+
		"\2\2\2\u01df\u01db\3\2\2\2\u01df\u01de\3\2\2\2\u01e0=\3\2\2\2\u01e1\u01e2"+
		"\t\3\2\2\u01e2?\3\2\2\2\u01e3\u01e4\7\65\2\2\u01e4A\3\2\2\2\u01e5\u01e6"+
		"\7\66\2\2\u01e6C\3\2\2\2\u01e7\u01e8\t\4\2\2\u01e8E\3\2\2\2\u01e9\u01ea"+
		"\7<\2\2\u01eaG\3\2\2\2\u01eb\u01ec\t\5\2\2\u01ecI\3\2\2\2\u01ed\u01ee"+
		"\t\6\2\2\u01eeK\3\2\2\2\u01ef\u01f0\t\7\2\2\u01f0M\3\2\2\2\u01f1\u01f2"+
		"\t\b\2\2\u01f2O\3\2\2\2\u01f3\u01f4\7I\2\2\u01f4Q\3\2\2\2\u01f5\u01f6"+
		"\t\t\2\2\u01f6S\3\2\2\2\u01f7\u01f8\t\n\2\2\u01f8U\3\2\2\2-Yae\u008f\u0095"+
		"\u00a1\u00ba\u00c5\u00ca\u00d8\u00dd\u00e3\u00ea\u00f6\u0101\u0107\u010b"+
		"\u010e\u0119\u011e\u0125\u012d\u0135\u0149\u016b\u016d\u0174\u017b\u0182"+
		"\u018a\u018f\u0195\u019e\u01a2\u01a8\u01ad\u01b4\u01be\u01c1\u01c5\u01cf"+
		"\u01d3\u01df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}