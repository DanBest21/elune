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
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, NAME=73, NORMALSTRING=74, 
		CHARSTRING=75, LONGSTRING=76, INT=77, HEX=78, FLOAT=79, HEX_FLOAT=80, 
		COMMENT=81, LINE_COMMENT=82, WS=83, SHEBANG=84;
	public static final int
		RULE_chunk = 0, RULE_block = 1, RULE_stat = 2, RULE_importdef = 3, RULE_libname = 4, 
		RULE_assignexp = 5, RULE_compoundassign = 6, RULE_attnamelist = 7, RULE_attrib = 8, 
		RULE_retstat = 9, RULE_label = 10, RULE_funcname = 11, RULE_varlist = 12, 
		RULE_namelist = 13, RULE_explist = 14, RULE_exp = 15, RULE_prefixexp = 16, 
		RULE_functioncall = 17, RULE_varOrExp = 18, RULE_var_ = 19, RULE_varSuffix = 20, 
		RULE_nameAndArgs = 21, RULE_args = 22, RULE_functiondef = 23, RULE_funcbody = 24, 
		RULE_parlist = 25, RULE_tableconstructor = 26, RULE_fieldlist = 27, RULE_field = 28, 
		RULE_fieldsep = 29, RULE_operatorOr = 30, RULE_operatorAnd = 31, RULE_operatorComparison = 32, 
		RULE_operatorStrcat = 33, RULE_operatorAddSub = 34, RULE_operatorMulDivMod = 35, 
		RULE_operatorBitwise = 36, RULE_operatorUnary = 37, RULE_operatorPower = 38, 
		RULE_number = 39, RULE_string = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"chunk", "block", "stat", "importdef", "libname", "assignexp", "compoundassign", 
			"attnamelist", "attrib", "retstat", "label", "funcname", "varlist", "namelist", 
			"explist", "exp", "prefixexp", "functioncall", "varOrExp", "var_", "varSuffix", 
			"nameAndArgs", "args", "functiondef", "funcbody", "parlist", "tableconstructor", 
			"fieldlist", "field", "fieldsep", "operatorOr", "operatorAnd", "operatorComparison", 
			"operatorStrcat", "operatorAddSub", "operatorMulDivMod", "operatorBitwise", 
			"operatorUnary", "operatorPower", "number", "string"
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
			"'null'", "'false'", "'true'", "'...'", "'('", "')'", "'['", "']'", "'lambda'", 
			"'{'", "'}'", "'or'", "'and'", "'<='", "'>='", "'~='", "'=='", "'is'", 
			"'++'", "'+'", "'-'", "'*'", "'/'", "'%'", "'//'", "'&'", "'|'", "'~'", 
			"'<<'", "'>>'", "'not'", "'#'", "'^'"
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
			null, "NAME", "NORMALSTRING", "CHARSTRING", "LONGSTRING", "INT", "HEX", 
			"FLOAT", "HEX_FLOAT", "COMMENT", "LINE_COMMENT", "WS", "SHEBANG"
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
		enterRule(_localctx, 0, RULE_chunk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(82);
				importdef();
				}
			}

			setState(85);
			block();
			setState(86);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					stat();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(94);
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
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(T__1);
				setState(99);
				varlist();
				setState(100);
				match(T__2);
				setState(101);
				explist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				functioncall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				label();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				match(T__5);
				setState(108);
				match(NAME);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				match(T__6);
				setState(110);
				match(T__7);
				setState(111);
				block();
				setState(112);
				match(T__0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(114);
				match(T__8);
				setState(115);
				exp(0);
				setState(116);
				match(T__7);
				setState(117);
				block();
				setState(118);
				match(T__0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(120);
				match(T__6);
				setState(121);
				match(T__7);
				setState(122);
				block();
				setState(123);
				match(T__8);
				setState(124);
				exp(0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(126);
				match(T__9);
				setState(127);
				exp(0);
				setState(128);
				match(T__7);
				setState(129);
				block();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(130);
					match(T__10);
					setState(131);
					exp(0);
					setState(132);
					match(T__7);
					setState(133);
					block();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(140);
					match(T__11);
					setState(141);
					match(T__7);
					setState(142);
					block();
					}
				}

				setState(145);
				match(T__0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(147);
				match(T__12);
				setState(148);
				match(NAME);
				setState(149);
				match(T__2);
				setState(150);
				exp(0);
				setState(151);
				match(T__13);
				setState(152);
				exp(0);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(153);
					match(T__13);
					setState(154);
					exp(0);
					}
				}

				setState(157);
				match(T__7);
				setState(158);
				block();
				setState(159);
				match(T__0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(161);
				match(T__14);
				setState(162);
				namelist();
				setState(163);
				match(T__15);
				setState(164);
				explist();
				setState(165);
				match(T__7);
				setState(166);
				block();
				setState(167);
				match(T__0);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(169);
				match(T__1);
				setState(170);
				match(T__16);
				setState(171);
				funcname();
				setState(172);
				match(T__7);
				setState(173);
				funcbody();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(175);
				match(T__16);
				setState(176);
				match(NAME);
				setState(177);
				match(T__7);
				setState(178);
				funcbody();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(179);
				attnamelist();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(180);
					match(T__2);
					setState(181);
					explist();
					}
				}

				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(184);
				match(T__17);
				setState(185);
				match(T__7);
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(186);
					match(T__18);
					setState(187);
					exp(0);
					setState(188);
					match(T__7);
					setState(189);
					block();
					}
					}
					setState(193); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__18 );
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(195);
					match(T__19);
					setState(196);
					match(T__7);
					setState(197);
					block();
					}
				}

				setState(200);
				match(T__0);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(202);
				match(T__20);
				setState(203);
				match(T__7);
				setState(204);
				block();
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(205);
					match(T__21);
					setState(206);
					exp(0);
					setState(207);
					match(T__7);
					setState(208);
					block();
					}
					}
					setState(212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__21 );
				setState(214);
				match(T__0);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(216);
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
		enterRule(_localctx, 6, RULE_importdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				match(T__22);
				setState(220);
				libname();
				}
				}
				setState(223); 
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
		enterRule(_localctx, 8, RULE_libname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(NAME);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(226);
				match(T__23);
				setState(227);
				match(NAME);
				}
				}
				setState(232);
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
		enterRule(_localctx, 10, RULE_assignexp);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				var_();
				setState(234);
				compoundassign();
				setState(235);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(NAME);
				setState(238);
				attrib();
				setState(239);
				compoundassign();
				setState(240);
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
		enterRule(_localctx, 12, RULE_compoundassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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
		enterRule(_localctx, 14, RULE_attnamelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(NAME);
			setState(247);
			attrib();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(248);
				match(T__13);
				setState(249);
				match(NAME);
				setState(250);
				attrib();
				}
				}
				setState(255);
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
		enterRule(_localctx, 16, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(256);
				match(T__35);
				setState(257);
				match(NAME);
				setState(258);
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
		enterRule(_localctx, 18, RULE_retstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__37);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (T__39 - 40)) | (1L << (T__40 - 40)) | (1L << (T__41 - 40)) | (1L << (T__42 - 40)) | (1L << (T__43 - 40)) | (1L << (T__47 - 40)) | (1L << (T__48 - 40)) | (1L << (T__59 - 40)) | (1L << (T__66 - 40)) | (1L << (T__69 - 40)) | (1L << (T__70 - 40)) | (1L << (NAME - 40)) | (1L << (NORMALSTRING - 40)) | (1L << (CHARSTRING - 40)) | (1L << (LONGSTRING - 40)) | (1L << (INT - 40)) | (1L << (HEX - 40)) | (1L << (FLOAT - 40)) | (1L << (HEX_FLOAT - 40)))) != 0)) {
				{
				setState(262);
				explist();
				}
			}

			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(265);
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
		enterRule(_localctx, 20, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__38);
			setState(269);
			match(NAME);
			setState(270);
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
		enterRule(_localctx, 22, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(NAME);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(273);
				match(T__23);
				setState(274);
				match(NAME);
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(280);
				match(T__7);
				setState(281);
				match(NAME);
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
		enterRule(_localctx, 24, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			var_();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(285);
				match(T__13);
				setState(286);
				var_();
				}
				}
				setState(291);
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
		enterRule(_localctx, 26, RULE_namelist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(NAME);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(293);
					match(T__13);
					setState(294);
					match(NAME);
					}
					} 
				}
				setState(299);
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
		enterRule(_localctx, 28, RULE_explist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			exp(0);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(301);
				match(T__13);
				setState(302);
				exp(0);
				}
				}
				setState(307);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				{
				setState(309);
				match(T__39);
				}
				break;
			case T__40:
				{
				setState(310);
				match(T__40);
				}
				break;
			case T__41:
				{
				setState(311);
				match(T__41);
				}
				break;
			case INT:
			case HEX:
			case FLOAT:
			case HEX_FLOAT:
				{
				setState(312);
				number();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				{
				setState(313);
				string();
				}
				break;
			case T__42:
				{
				setState(314);
				match(T__42);
				}
				break;
			case T__47:
				{
				setState(315);
				functiondef();
				}
				break;
			case T__43:
			case NAME:
				{
				setState(316);
				prefixexp();
				}
				break;
			case T__48:
				{
				setState(317);
				tableconstructor();
				}
				break;
			case T__59:
			case T__66:
			case T__69:
			case T__70:
				{
				setState(318);
				operatorUnary();
				setState(319);
				exp(8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(355);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(323);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(324);
						operatorPower();
						setState(325);
						exp(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(327);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(328);
						operatorMulDivMod();
						setState(329);
						exp(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(331);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(332);
						operatorAddSub();
						setState(333);
						exp(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(335);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(336);
						operatorStrcat();
						setState(337);
						exp(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(339);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(340);
						operatorComparison();
						setState(341);
						exp(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(343);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(344);
						operatorAnd();
						setState(345);
						exp(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(347);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(348);
						operatorOr();
						setState(349);
						exp(3);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(351);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(352);
						operatorBitwise();
						setState(353);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(359);
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
		enterRule(_localctx, 32, RULE_prefixexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			varOrExp();
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(361);
					nameAndArgs();
					}
					} 
				}
				setState(366);
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
		enterRule(_localctx, 34, RULE_functioncall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			varOrExp();
			setState(369); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(368);
					nameAndArgs();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(371); 
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
		enterRule(_localctx, 36, RULE_varOrExp);
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				var_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(T__43);
				setState(375);
				exp(0);
				setState(376);
				match(T__44);
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
		enterRule(_localctx, 38, RULE_var_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(380);
				match(NAME);
				}
				break;
			case T__43:
				{
				setState(381);
				match(T__43);
				setState(382);
				exp(0);
				setState(383);
				match(T__44);
				setState(384);
				varSuffix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388);
					varSuffix();
					}
					} 
				}
				setState(393);
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
		enterRule(_localctx, 40, RULE_varSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__43) | (1L << T__48))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (NORMALSTRING - 74)) | (1L << (CHARSTRING - 74)) | (1L << (LONGSTRING - 74)))) != 0)) {
				{
				{
				setState(394);
				nameAndArgs();
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				{
				setState(400);
				match(T__45);
				setState(401);
				exp(0);
				setState(402);
				match(T__46);
				}
				break;
			case T__23:
				{
				setState(404);
				match(T__23);
				setState(405);
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
		enterRule(_localctx, 42, RULE_nameAndArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(408);
				match(T__7);
				setState(409);
				match(NAME);
				}
			}

			setState(412);
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
		enterRule(_localctx, 44, RULE_args);
		int _la;
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(T__43);
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (T__39 - 40)) | (1L << (T__40 - 40)) | (1L << (T__41 - 40)) | (1L << (T__42 - 40)) | (1L << (T__43 - 40)) | (1L << (T__47 - 40)) | (1L << (T__48 - 40)) | (1L << (T__59 - 40)) | (1L << (T__66 - 40)) | (1L << (T__69 - 40)) | (1L << (T__70 - 40)) | (1L << (NAME - 40)) | (1L << (NORMALSTRING - 40)) | (1L << (CHARSTRING - 40)) | (1L << (LONGSTRING - 40)) | (1L << (INT - 40)) | (1L << (HEX - 40)) | (1L << (FLOAT - 40)) | (1L << (HEX_FLOAT - 40)))) != 0)) {
					{
					setState(415);
					explist();
					}
				}

				setState(418);
				match(T__44);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				tableconstructor();
				}
				break;
			case NORMALSTRING:
			case CHARSTRING:
			case LONGSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
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
		enterRule(_localctx, 46, RULE_functiondef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(T__47);
			setState(424);
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
		enterRule(_localctx, 48, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42 || _la==NAME) {
				{
				setState(426);
				parlist();
				}
			}

			setState(429);
			match(T__7);
			setState(430);
			block();
			setState(431);
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
		enterRule(_localctx, 50, RULE_parlist);
		int _la;
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				namelist();
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(434);
					match(T__13);
					setState(435);
					match(T__42);
					}
				}

				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
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
		enterRule(_localctx, 52, RULE_tableconstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(T__48);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (T__39 - 40)) | (1L << (T__40 - 40)) | (1L << (T__41 - 40)) | (1L << (T__42 - 40)) | (1L << (T__43 - 40)) | (1L << (T__45 - 40)) | (1L << (T__47 - 40)) | (1L << (T__48 - 40)) | (1L << (T__59 - 40)) | (1L << (T__66 - 40)) | (1L << (T__69 - 40)) | (1L << (T__70 - 40)) | (1L << (NAME - 40)) | (1L << (NORMALSTRING - 40)) | (1L << (CHARSTRING - 40)) | (1L << (LONGSTRING - 40)) | (1L << (INT - 40)) | (1L << (HEX - 40)) | (1L << (FLOAT - 40)) | (1L << (HEX_FLOAT - 40)))) != 0)) {
				{
				setState(442);
				fieldlist();
				}
			}

			setState(445);
			match(T__49);
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
		enterRule(_localctx, 54, RULE_fieldlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			field();
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(448);
					fieldsep();
					setState(449);
					field();
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__13) {
				{
				setState(456);
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
		enterRule(_localctx, 56, RULE_field);
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(T__45);
				setState(460);
				exp(0);
				setState(461);
				match(T__46);
				setState(462);
				match(T__2);
				setState(463);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(NAME);
				setState(466);
				match(T__2);
				setState(467);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
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
		enterRule(_localctx, 58, RULE_fieldsep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
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
		enterRule(_localctx, 60, RULE_operatorOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
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
		enterRule(_localctx, 62, RULE_operatorAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
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
		enterRule(_localctx, 64, RULE_operatorComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
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
		enterRule(_localctx, 66, RULE_operatorStrcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
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
		enterRule(_localctx, 68, RULE_operatorAddSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
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
		enterRule(_localctx, 70, RULE_operatorMulDivMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
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
		enterRule(_localctx, 72, RULE_operatorBitwise);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
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
		enterRule(_localctx, 74, RULE_operatorUnary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (T__59 - 60)) | (1L << (T__66 - 60)) | (1L << (T__69 - 60)) | (1L << (T__70 - 60)))) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_operatorPower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(T__71);
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
		enterRule(_localctx, 78, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (INT - 77)) | (1L << (HEX - 77)) | (1L << (FLOAT - 77)) | (1L << (HEX_FLOAT - 77)))) != 0)) ) {
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
		enterRule(_localctx, 80, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (NORMALSTRING - 74)) | (1L << (CHARSTRING - 74)) | (1L << (LONGSTRING - 74)))) != 0)) ) {
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
		case 15:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3V\u01f2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\5\2"+
		"V\n\2\3\2\3\2\3\2\3\3\7\3\\\n\3\f\3\16\3_\13\3\3\3\5\3b\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4\u008a\n\4\f\4\16\4\u008d\13\4\3\4\3\4\3\4\5\4\u0092\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u009e\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\u00b9\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4\u00c2\n\4\r\4\16"+
		"\4\u00c3\3\4\3\4\3\4\5\4\u00c9\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\6\4\u00d5\n\4\r\4\16\4\u00d6\3\4\3\4\3\4\5\4\u00dc\n\4\3\5\3\5\6"+
		"\5\u00e0\n\5\r\5\16\5\u00e1\3\6\3\6\3\6\7\6\u00e7\n\6\f\6\16\6\u00ea\13"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00f5\n\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u00fe\n\t\f\t\16\t\u0101\13\t\3\n\3\n\3\n\5\n\u0106\n\n"+
		"\3\13\3\13\5\13\u010a\n\13\3\13\5\13\u010d\n\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\7\r\u0116\n\r\f\r\16\r\u0119\13\r\3\r\3\r\5\r\u011d\n\r\3\16\3"+
		"\16\3\16\7\16\u0122\n\16\f\16\16\16\u0125\13\16\3\17\3\17\3\17\7\17\u012a"+
		"\n\17\f\17\16\17\u012d\13\17\3\20\3\20\3\20\7\20\u0132\n\20\f\20\16\20"+
		"\u0135\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u0144\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0166\n\21\f\21\16"+
		"\21\u0169\13\21\3\22\3\22\7\22\u016d\n\22\f\22\16\22\u0170\13\22\3\23"+
		"\3\23\6\23\u0174\n\23\r\23\16\23\u0175\3\24\3\24\3\24\3\24\3\24\5\24\u017d"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0185\n\25\3\25\7\25\u0188\n"+
		"\25\f\25\16\25\u018b\13\25\3\26\7\26\u018e\n\26\f\26\16\26\u0191\13\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0199\n\26\3\27\3\27\5\27\u019d\n"+
		"\27\3\27\3\27\3\30\3\30\5\30\u01a3\n\30\3\30\3\30\3\30\5\30\u01a8\n\30"+
		"\3\31\3\31\3\31\3\32\5\32\u01ae\n\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\5\33\u01b7\n\33\3\33\5\33\u01ba\n\33\3\34\3\34\5\34\u01be\n\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\7\35\u01c6\n\35\f\35\16\35\u01c9\13\35\3\35\5"+
		"\35\u01cc\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u01d8\n\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3*\2\3 +\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\13\3\2\33%\4\2\3\3\20\20\4\2&\'"+
		"\67;\3\2=>\3\2?B\3\2CG\5\2>>EEHI\3\2OR\3\2LN\2\u0214\2U\3\2\2\2\4]\3\2"+
		"\2\2\6\u00db\3\2\2\2\b\u00df\3\2\2\2\n\u00e3\3\2\2\2\f\u00f4\3\2\2\2\16"+
		"\u00f6\3\2\2\2\20\u00f8\3\2\2\2\22\u0105\3\2\2\2\24\u0107\3\2\2\2\26\u010e"+
		"\3\2\2\2\30\u0112\3\2\2\2\32\u011e\3\2\2\2\34\u0126\3\2\2\2\36\u012e\3"+
		"\2\2\2 \u0143\3\2\2\2\"\u016a\3\2\2\2$\u0171\3\2\2\2&\u017c\3\2\2\2(\u0184"+
		"\3\2\2\2*\u018f\3\2\2\2,\u019c\3\2\2\2.\u01a7\3\2\2\2\60\u01a9\3\2\2\2"+
		"\62\u01ad\3\2\2\2\64\u01b9\3\2\2\2\66\u01bb\3\2\2\28\u01c1\3\2\2\2:\u01d7"+
		"\3\2\2\2<\u01d9\3\2\2\2>\u01db\3\2\2\2@\u01dd\3\2\2\2B\u01df\3\2\2\2D"+
		"\u01e1\3\2\2\2F\u01e3\3\2\2\2H\u01e5\3\2\2\2J\u01e7\3\2\2\2L\u01e9\3\2"+
		"\2\2N\u01eb\3\2\2\2P\u01ed\3\2\2\2R\u01ef\3\2\2\2TV\5\b\5\2UT\3\2\2\2"+
		"UV\3\2\2\2VW\3\2\2\2WX\5\4\3\2XY\7\2\2\3Y\3\3\2\2\2Z\\\5\6\4\2[Z\3\2\2"+
		"\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`b\5\24\13\2a`\3"+
		"\2\2\2ab\3\2\2\2b\5\3\2\2\2c\u00dc\7\3\2\2de\7\4\2\2ef\5\32\16\2fg\7\5"+
		"\2\2gh\5\36\20\2h\u00dc\3\2\2\2i\u00dc\5$\23\2j\u00dc\5\26\f\2k\u00dc"+
		"\7\6\2\2l\u00dc\7\7\2\2mn\7\b\2\2n\u00dc\7K\2\2op\7\t\2\2pq\7\n\2\2qr"+
		"\5\4\3\2rs\7\3\2\2s\u00dc\3\2\2\2tu\7\13\2\2uv\5 \21\2vw\7\n\2\2wx\5\4"+
		"\3\2xy\7\3\2\2y\u00dc\3\2\2\2z{\7\t\2\2{|\7\n\2\2|}\5\4\3\2}~\7\13\2\2"+
		"~\177\5 \21\2\177\u00dc\3\2\2\2\u0080\u0081\7\f\2\2\u0081\u0082\5 \21"+
		"\2\u0082\u0083\7\n\2\2\u0083\u008b\5\4\3\2\u0084\u0085\7\r\2\2\u0085\u0086"+
		"\5 \21\2\u0086\u0087\7\n\2\2\u0087\u0088\5\4\3\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0084\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u0091\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\16\2\2\u008f"+
		"\u0090\7\n\2\2\u0090\u0092\5\4\3\2\u0091\u008e\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\3\2\2\u0094\u00dc\3\2\2\2\u0095"+
		"\u0096\7\17\2\2\u0096\u0097\7K\2\2\u0097\u0098\7\5\2\2\u0098\u0099\5 "+
		"\21\2\u0099\u009a\7\20\2\2\u009a\u009d\5 \21\2\u009b\u009c\7\20\2\2\u009c"+
		"\u009e\5 \21\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a0\7\n\2\2\u00a0\u00a1\5\4\3\2\u00a1\u00a2\7\3\2\2\u00a2"+
		"\u00dc\3\2\2\2\u00a3\u00a4\7\21\2\2\u00a4\u00a5\5\34\17\2\u00a5\u00a6"+
		"\7\22\2\2\u00a6\u00a7\5\36\20\2\u00a7\u00a8\7\n\2\2\u00a8\u00a9\5\4\3"+
		"\2\u00a9\u00aa\7\3\2\2\u00aa\u00dc\3\2\2\2\u00ab\u00ac\7\4\2\2\u00ac\u00ad"+
		"\7\23\2\2\u00ad\u00ae\5\30\r\2\u00ae\u00af\7\n\2\2\u00af\u00b0\5\62\32"+
		"\2\u00b0\u00dc\3\2\2\2\u00b1\u00b2\7\23\2\2\u00b2\u00b3\7K\2\2\u00b3\u00b4"+
		"\7\n\2\2\u00b4\u00dc\5\62\32\2\u00b5\u00b8\5\20\t\2\u00b6\u00b7\7\5\2"+
		"\2\u00b7\u00b9\5\36\20\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00dc\3\2\2\2\u00ba\u00bb\7\24\2\2\u00bb\u00c1\7\n\2\2\u00bc\u00bd\7"+
		"\25\2\2\u00bd\u00be\5 \21\2\u00be\u00bf\7\n\2\2\u00bf\u00c0\5\4\3\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c8\3\2\2\2\u00c5\u00c6\7\26\2\2\u00c6"+
		"\u00c7\7\n\2\2\u00c7\u00c9\5\4\3\2\u00c8\u00c5\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\3\2\2\u00cb\u00dc\3\2\2\2\u00cc"+
		"\u00cd\7\27\2\2\u00cd\u00ce\7\n\2\2\u00ce\u00d4\5\4\3\2\u00cf\u00d0\7"+
		"\30\2\2\u00d0\u00d1\5 \21\2\u00d1\u00d2\7\n\2\2\u00d2\u00d3\5\4\3\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\3\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00dc\5\f\7\2\u00dbc\3\2\2\2\u00dbd\3\2\2\2\u00db"+
		"i\3\2\2\2\u00dbj\3\2\2\2\u00dbk\3\2\2\2\u00dbl\3\2\2\2\u00dbm\3\2\2\2"+
		"\u00dbo\3\2\2\2\u00dbt\3\2\2\2\u00dbz\3\2\2\2\u00db\u0080\3\2\2\2\u00db"+
		"\u0095\3\2\2\2\u00db\u00a3\3\2\2\2\u00db\u00ab\3\2\2\2\u00db\u00b1\3\2"+
		"\2\2\u00db\u00b5\3\2\2\2\u00db\u00ba\3\2\2\2\u00db\u00cc\3\2\2\2\u00db"+
		"\u00da\3\2\2\2\u00dc\7\3\2\2\2\u00dd\u00de\7\31\2\2\u00de\u00e0\5\n\6"+
		"\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\t\3\2\2\2\u00e3\u00e8\7K\2\2\u00e4\u00e5\7\32\2\2\u00e5"+
		"\u00e7\7K\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\13\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec"+
		"\5(\25\2\u00ec\u00ed\5\16\b\2\u00ed\u00ee\5 \21\2\u00ee\u00f5\3\2\2\2"+
		"\u00ef\u00f0\7K\2\2\u00f0\u00f1\5\22\n\2\u00f1\u00f2\5\16\b\2\u00f2\u00f3"+
		"\5 \21\2\u00f3\u00f5\3\2\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f5"+
		"\r\3\2\2\2\u00f6\u00f7\t\2\2\2\u00f7\17\3\2\2\2\u00f8\u00f9\7K\2\2\u00f9"+
		"\u00ff\5\22\n\2\u00fa\u00fb\7\20\2\2\u00fb\u00fc\7K\2\2\u00fc\u00fe\5"+
		"\22\n\2\u00fd\u00fa\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\21\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7&\2\2"+
		"\u0103\u0104\7K\2\2\u0104\u0106\7\'\2\2\u0105\u0102\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\23\3\2\2\2\u0107\u0109\7(\2\2\u0108\u010a\5\36\20\2\u0109"+
		"\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u010d\7\3"+
		"\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\25\3\2\2\2\u010e\u010f"+
		"\7)\2\2\u010f\u0110\7K\2\2\u0110\u0111\7)\2\2\u0111\27\3\2\2\2\u0112\u0117"+
		"\7K\2\2\u0113\u0114\7\32\2\2\u0114\u0116\7K\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011c\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7\n\2\2\u011b\u011d\7K\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\31\3\2\2\2\u011e\u0123\5(\25"+
		"\2\u011f\u0120\7\20\2\2\u0120\u0122\5(\25\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\33\3\2\2"+
		"\2\u0125\u0123\3\2\2\2\u0126\u012b\7K\2\2\u0127\u0128\7\20\2\2\u0128\u012a"+
		"\7K\2\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\35\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0133\5 \21"+
		"\2\u012f\u0130\7\20\2\2\u0130\u0132\5 \21\2\u0131\u012f\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\37\3\2\2"+
		"\2\u0135\u0133\3\2\2\2\u0136\u0137\b\21\1\2\u0137\u0144\7*\2\2\u0138\u0144"+
		"\7+\2\2\u0139\u0144\7,\2\2\u013a\u0144\5P)\2\u013b\u0144\5R*\2\u013c\u0144"+
		"\7-\2\2\u013d\u0144\5\60\31\2\u013e\u0144\5\"\22\2\u013f\u0144\5\66\34"+
		"\2\u0140\u0141\5L\'\2\u0141\u0142\5 \21\n\u0142\u0144\3\2\2\2\u0143\u0136"+
		"\3\2\2\2\u0143\u0138\3\2\2\2\u0143\u0139\3\2\2\2\u0143\u013a\3\2\2\2\u0143"+
		"\u013b\3\2\2\2\u0143\u013c\3\2\2\2\u0143\u013d\3\2\2\2\u0143\u013e\3\2"+
		"\2\2\u0143\u013f\3\2\2\2\u0143\u0140\3\2\2\2\u0144\u0167\3\2\2\2\u0145"+
		"\u0146\f\13\2\2\u0146\u0147\5N(\2\u0147\u0148\5 \21\13\u0148\u0166\3\2"+
		"\2\2\u0149\u014a\f\t\2\2\u014a\u014b\5H%\2\u014b\u014c\5 \21\n\u014c\u0166"+
		"\3\2\2\2\u014d\u014e\f\b\2\2\u014e\u014f\5F$\2\u014f\u0150\5 \21\t\u0150"+
		"\u0166\3\2\2\2\u0151\u0152\f\7\2\2\u0152\u0153\5D#\2\u0153\u0154\5 \21"+
		"\7\u0154\u0166\3\2\2\2\u0155\u0156\f\6\2\2\u0156\u0157\5B\"\2\u0157\u0158"+
		"\5 \21\7\u0158\u0166\3\2\2\2\u0159\u015a\f\5\2\2\u015a\u015b\5@!\2\u015b"+
		"\u015c\5 \21\6\u015c\u0166\3\2\2\2\u015d\u015e\f\4\2\2\u015e\u015f\5>"+
		" \2\u015f\u0160\5 \21\5\u0160\u0166\3\2\2\2\u0161\u0162\f\3\2\2\u0162"+
		"\u0163\5J&\2\u0163\u0164\5 \21\4\u0164\u0166\3\2\2\2\u0165\u0145\3\2\2"+
		"\2\u0165\u0149\3\2\2\2\u0165\u014d\3\2\2\2\u0165\u0151\3\2\2\2\u0165\u0155"+
		"\3\2\2\2\u0165\u0159\3\2\2\2\u0165\u015d\3\2\2\2\u0165\u0161\3\2\2\2\u0166"+
		"\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168!\3\2\2\2"+
		"\u0169\u0167\3\2\2\2\u016a\u016e\5&\24\2\u016b\u016d\5,\27\2\u016c\u016b"+
		"\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"#\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173\5&\24\2\u0172\u0174\5,\27\2"+
		"\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176%\3\2\2\2\u0177\u017d\5(\25\2\u0178\u0179\7.\2\2\u0179\u017a"+
		"\5 \21\2\u017a\u017b\7/\2\2\u017b\u017d\3\2\2\2\u017c\u0177\3\2\2\2\u017c"+
		"\u0178\3\2\2\2\u017d\'\3\2\2\2\u017e\u0185\7K\2\2\u017f\u0180\7.\2\2\u0180"+
		"\u0181\5 \21\2\u0181\u0182\7/\2\2\u0182\u0183\5*\26\2\u0183\u0185\3\2"+
		"\2\2\u0184\u017e\3\2\2\2\u0184\u017f\3\2\2\2\u0185\u0189\3\2\2\2\u0186"+
		"\u0188\5*\26\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a)\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e"+
		"\5,\27\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0198\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\7\60"+
		"\2\2\u0193\u0194\5 \21\2\u0194\u0195\7\61\2\2\u0195\u0199\3\2\2\2\u0196"+
		"\u0197\7\32\2\2\u0197\u0199\7K\2\2\u0198\u0192\3\2\2\2\u0198\u0196\3\2"+
		"\2\2\u0199+\3\2\2\2\u019a\u019b\7\n\2\2\u019b\u019d\7K\2\2\u019c\u019a"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\5.\30\2\u019f"+
		"-\3\2\2\2\u01a0\u01a2\7.\2\2\u01a1\u01a3\5\36\20\2\u01a2\u01a1\3\2\2\2"+
		"\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a8\7/\2\2\u01a5\u01a8"+
		"\5\66\34\2\u01a6\u01a8\5R*\2\u01a7\u01a0\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7"+
		"\u01a6\3\2\2\2\u01a8/\3\2\2\2\u01a9\u01aa\7\62\2\2\u01aa\u01ab\5\62\32"+
		"\2\u01ab\61\3\2\2\2\u01ac\u01ae\5\64\33\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\7\n\2\2\u01b0\u01b1\5\4\3\2\u01b1"+
		"\u01b2\7\3\2\2\u01b2\63\3\2\2\2\u01b3\u01b6\5\34\17\2\u01b4\u01b5\7\20"+
		"\2\2\u01b5\u01b7\7-\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01ba\3\2\2\2\u01b8\u01ba\7-\2\2\u01b9\u01b3\3\2\2\2\u01b9\u01b8\3\2"+
		"\2\2\u01ba\65\3\2\2\2\u01bb\u01bd\7\63\2\2\u01bc\u01be\58\35\2\u01bd\u01bc"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\7\64\2\2"+
		"\u01c0\67\3\2\2\2\u01c1\u01c7\5:\36\2\u01c2\u01c3\5<\37\2\u01c3\u01c4"+
		"\5:\36\2\u01c4\u01c6\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01ca\u01cc\5<\37\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"9\3\2\2\2\u01cd\u01ce\7\60\2\2\u01ce\u01cf\5 \21\2\u01cf\u01d0\7\61\2"+
		"\2\u01d0\u01d1\7\5\2\2\u01d1\u01d2\5 \21\2\u01d2\u01d8\3\2\2\2\u01d3\u01d4"+
		"\7K\2\2\u01d4\u01d5\7\5\2\2\u01d5\u01d8\5 \21\2\u01d6\u01d8\5 \21\2\u01d7"+
		"\u01cd\3\2\2\2\u01d7\u01d3\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8;\3\2\2\2"+
		"\u01d9\u01da\t\3\2\2\u01da=\3\2\2\2\u01db\u01dc\7\65\2\2\u01dc?\3\2\2"+
		"\2\u01dd\u01de\7\66\2\2\u01deA\3\2\2\2\u01df\u01e0\t\4\2\2\u01e0C\3\2"+
		"\2\2\u01e1\u01e2\7<\2\2\u01e2E\3\2\2\2\u01e3\u01e4\t\5\2\2\u01e4G\3\2"+
		"\2\2\u01e5\u01e6\t\6\2\2\u01e6I\3\2\2\2\u01e7\u01e8\t\7\2\2\u01e8K\3\2"+
		"\2\2\u01e9\u01ea\t\b\2\2\u01eaM\3\2\2\2\u01eb\u01ec\7J\2\2\u01ecO\3\2"+
		"\2\2\u01ed\u01ee\t\t\2\2\u01eeQ\3\2\2\2\u01ef\u01f0\t\n\2\2\u01f0S\3\2"+
		"\2\2-U]a\u008b\u0091\u009d\u00b8\u00c3\u00c8\u00d6\u00db\u00e1\u00e8\u00f4"+
		"\u00ff\u0105\u0109\u010c\u0117\u011c\u0123\u012b\u0133\u0143\u0165\u0167"+
		"\u016e\u0175\u017c\u0184\u0189\u018f\u0198\u019c\u01a2\u01a7\u01ad\u01b6"+
		"\u01b9\u01bd\u01c7\u01cb\u01d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}