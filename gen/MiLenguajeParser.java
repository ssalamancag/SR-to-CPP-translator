// Generated from C:/Users/sebastian/Desktop/Estudio/universidad/2019-2/lenguajes/test2/grammar\MiLenguaje.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiLenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, TK_ASSIGN=6, TK_SEPARATOR=7, TK_LBRACKET=8, 
		TK_RBRACKET=9, TK_LBRACE=10, TK_RBRACE=11, TK_LPAREN=12, TK_RPAREN=13, 
		TK_COMMA=14, TK_ASTER=15, TK_COLON=16, TK_EQ=17, TK_GLOBAL=18, TK_BODY=19, 
		TK_PROC=20, TK_TYPE=21, TK_VAL=22, TK_VAR=23, TK_RES=24, TK_REF=25, TK_SEPARATE=26, 
		TK_BOOL=27, TK_INT=28, TK_CHAR=29, TK_REAL=30, TK_FILE=31, TK_STRING=32, 
		TK_EXTEND=33, TK_IMPORT=34, TK_CONST=35, TK_ENUM=36, TK_ID=37, ID=38, 
		ESP=39;
	public static final int
		RULE_intit_component = 0, RULE_componet = 1, RULE_global = 2, RULE_resource_specification = 3, 
		RULE_resource_body = 4, RULE_proc = 5, RULE_spec_stmt = 6, RULE_spec_body = 7, 
		RULE_maybe_params = 8, RULE_spec_stmt_ls = 9, RULE_spec_stmt_ls_1 = 10, 
		RULE_comp_params = 11, RULE_parameters = 12, RULE_param_spec_ls = 13, 
		RULE_param_spec_lp = 14, RULE_param_spec = 15, RULE_common_stmt = 16, 
		RULE_extend_clause = 17, RULE_import_clause = 18, RULE_import_list = 19, 
		RULE_decl = 20, RULE_type_decl = 21, RULE_type_restriction = 22, RULE_type = 23, 
		RULE_unsub_type = 24, RULE_basic_type = 25, RULE_param_kind_opt = 26, 
		RULE_string_def = 27, RULE_string_lim = 28, RULE_obj_decl = 29, RULE_enum_def = 30, 
		RULE_var_or_const = 31, RULE_var_def_lp = 32, RULE_var_def = 33, RULE_var_att = 34, 
		RULE_id_subs_lp = 35, RULE_id_subs = 36, RULE_subscripts = 37, RULE_bracketed_list = 38, 
		RULE_bound_lp = 39, RULE_bounds = 40, RULE_bound = 41, RULE_id_lp = 42, 
		RULE_expr = 43, RULE_block = 44, RULE_falta = 45, RULE_vacio = 46, RULE_otro = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"intit_component", "componet", "global", "resource_specification", "resource_body", 
			"proc", "spec_stmt", "spec_body", "maybe_params", "spec_stmt_ls", "spec_stmt_ls_1", 
			"comp_params", "parameters", "param_spec_ls", "param_spec_lp", "param_spec", 
			"common_stmt", "extend_clause", "import_clause", "import_list", "decl", 
			"type_decl", "type_restriction", "type", "unsub_type", "basic_type", 
			"param_kind_opt", "string_def", "string_lim", "obj_decl", "enum_def", 
			"var_or_const", "var_def_lp", "var_def", "var_att", "id_subs_lp", "id_subs", 
			"subscripts", "bracketed_list", "bound_lp", "bounds", "bound", "id_lp", 
			"expr", "block", "falta", "vacio", "otro"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'end'", "'expresion'", "'falta implementar'", "'y'", "'t'", "':='", 
			"';'", "'['", "']'", "'{'", "'}'", "'('", "')'", "','", "'*'", "':'", 
			"'='", "'global'", "'body'", "'proc'", "'type'", "'val'", "'var'", "'res'", 
			"'ref'", "'separate'", "'bool'", "'int'", "'char'", "'real'", "'file'", 
			"'string'", "'extend'", "'import'", "'const'", "'enum'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "TK_ASSIGN", "TK_SEPARATOR", "TK_LBRACKET", 
			"TK_RBRACKET", "TK_LBRACE", "TK_RBRACE", "TK_LPAREN", "TK_RPAREN", "TK_COMMA", 
			"TK_ASTER", "TK_COLON", "TK_EQ", "TK_GLOBAL", "TK_BODY", "TK_PROC", "TK_TYPE", 
			"TK_VAL", "TK_VAR", "TK_RES", "TK_REF", "TK_SEPARATE", "TK_BOOL", "TK_INT", 
			"TK_CHAR", "TK_REAL", "TK_FILE", "TK_STRING", "TK_EXTEND", "TK_IMPORT", 
			"TK_CONST", "TK_ENUM", "TK_ID", "ID", "ESP"
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
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiLenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Intit_componentContext extends ParserRuleContext {
		public ComponetContext componet() {
			return getRuleContext(ComponetContext.class,0);
		}
		public Intit_componentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intit_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIntit_component(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIntit_component(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitIntit_component(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Intit_componentContext intit_component() throws RecognitionException {
		Intit_componentContext _localctx = new Intit_componentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_intit_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			componet();
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

	public static class ComponetContext extends ParserRuleContext {
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public Resource_specificationContext resource_specification() {
			return getRuleContext(Resource_specificationContext.class,0);
		}
		public Resource_bodyContext resource_body() {
			return getRuleContext(Resource_bodyContext.class,0);
		}
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ComponetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterComponet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitComponet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitComponet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponetContext componet() throws RecognitionException {
		ComponetContext _localctx = new ComponetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_componet);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				global();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				resource_specification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				resource_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				proc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				block();
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

	public static class GlobalContext extends ParserRuleContext {
		public TerminalNode TK_GLOBAL() { return getToken(MiLenguajeParser.TK_GLOBAL, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public Spec_stmt_lsContext spec_stmt_ls() {
			return getRuleContext(Spec_stmt_lsContext.class,0);
		}
		public Spec_bodyContext spec_body() {
			return getRuleContext(Spec_bodyContext.class,0);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(TK_GLOBAL);
			setState(106);
			match(ID);
			setState(107);
			spec_stmt_ls();
			setState(108);
			spec_body();
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

	public static class Resource_specificationContext extends ParserRuleContext {
		public FaltaContext falta() {
			return getRuleContext(FaltaContext.class,0);
		}
		public Resource_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterResource_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitResource_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitResource_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resource_specificationContext resource_specification() throws RecognitionException {
		Resource_specificationContext _localctx = new Resource_specificationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_resource_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			falta();
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

	public static class Resource_bodyContext extends ParserRuleContext {
		public FaltaContext falta() {
			return getRuleContext(FaltaContext.class,0);
		}
		public Resource_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterResource_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitResource_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitResource_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resource_bodyContext resource_body() throws RecognitionException {
		Resource_bodyContext _localctx = new Resource_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_resource_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			falta();
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

	public static class ProcContext extends ParserRuleContext {
		public TerminalNode TK_PROC() { return getToken(MiLenguajeParser.TK_PROC, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public List<FaltaContext> falta() {
			return getRuleContexts(FaltaContext.class);
		}
		public FaltaContext falta(int i) {
			return getRuleContext(FaltaContext.class,i);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(TK_PROC);
			setState(115);
			match(ID);
			setState(116);
			match(TK_LPAREN);
			setState(117);
			falta();
			setState(118);
			match(TK_RPAREN);
			setState(119);
			falta();
			setState(120);
			block();
			setState(121);
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

	public static class Spec_stmtContext extends ParserRuleContext {
		public Common_stmtContext common_stmt() {
			return getRuleContext(Common_stmtContext.class,0);
		}
		public Extend_clauseContext extend_clause() {
			return getRuleContext(Extend_clauseContext.class,0);
		}
		public Spec_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSpec_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSpec_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSpec_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_stmtContext spec_stmt() throws RecognitionException {
		Spec_stmtContext _localctx = new Spec_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_spec_stmt);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SEPARATOR:
			case TK_TYPE:
			case TK_VAR:
			case TK_IMPORT:
			case TK_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				common_stmt();
				}
				break;
			case TK_EXTEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				extend_clause();
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

	public static class Spec_bodyContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_BODY() { return getToken(MiLenguajeParser.TK_BODY, 0); }
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Maybe_paramsContext maybe_params() {
			return getRuleContext(Maybe_paramsContext.class,0);
		}
		public TerminalNode TK_SEPARATE() { return getToken(MiLenguajeParser.TK_SEPARATE, 0); }
		public Spec_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSpec_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSpec_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSpec_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_bodyContext spec_body() throws RecognitionException {
		Spec_bodyContext _localctx = new Spec_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_spec_body);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(TK_BODY);
				setState(129);
				match(TK_ID);
				setState(130);
				maybe_params();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(TK_BODY);
				setState(132);
				match(TK_ID);
				setState(133);
				maybe_params();
				setState(134);
				match(TK_SEPARATE);
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

	public static class Maybe_paramsContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public Comp_paramsContext comp_params() {
			return getRuleContext(Comp_paramsContext.class,0);
		}
		public Maybe_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybe_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterMaybe_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitMaybe_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitMaybe_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Maybe_paramsContext maybe_params() throws RecognitionException {
		Maybe_paramsContext _localctx = new Maybe_paramsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_maybe_params);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case TK_SEPARATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				vacio();
				}
				break;
			case TK_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				comp_params();
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

	public static class Spec_stmt_lsContext extends ParserRuleContext {
		public Spec_stmtContext spec_stmt() {
			return getRuleContext(Spec_stmtContext.class,0);
		}
		public Spec_stmt_ls_1Context spec_stmt_ls_1() {
			return getRuleContext(Spec_stmt_ls_1Context.class,0);
		}
		public Spec_stmt_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_stmt_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSpec_stmt_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSpec_stmt_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSpec_stmt_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_stmt_lsContext spec_stmt_ls() throws RecognitionException {
		Spec_stmt_lsContext _localctx = new Spec_stmt_lsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_spec_stmt_ls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			spec_stmt();
			setState(143);
			spec_stmt_ls_1();
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

	public static class Spec_stmt_ls_1Context extends ParserRuleContext {
		public TerminalNode TK_SEPARATOR() { return getToken(MiLenguajeParser.TK_SEPARATOR, 0); }
		public Spec_stmtContext spec_stmt() {
			return getRuleContext(Spec_stmtContext.class,0);
		}
		public Spec_stmt_ls_1Context spec_stmt_ls_1() {
			return getRuleContext(Spec_stmt_ls_1Context.class,0);
		}
		public Spec_stmt_ls_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_stmt_ls_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSpec_stmt_ls_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSpec_stmt_ls_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSpec_stmt_ls_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_stmt_ls_1Context spec_stmt_ls_1() throws RecognitionException {
		Spec_stmt_ls_1Context _localctx = new Spec_stmt_ls_1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_spec_stmt_ls_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(TK_SEPARATOR);
			setState(146);
			spec_stmt();
			setState(147);
			spec_stmt_ls_1();
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

	public static class Comp_paramsContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Comp_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterComp_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitComp_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitComp_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_paramsContext comp_params() throws RecognitionException {
		Comp_paramsContext _localctx = new Comp_paramsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comp_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			parameters();
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

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public Param_spec_lsContext param_spec_ls() {
			return getRuleContext(Param_spec_lsContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(TK_LPAREN);
			setState(152);
			param_spec_ls();
			setState(153);
			match(TK_RPAREN);
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

	public static class Param_spec_lsContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public Param_spec_lpContext param_spec_lp() {
			return getRuleContext(Param_spec_lpContext.class,0);
		}
		public Param_spec_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_spec_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParam_spec_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParam_spec_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParam_spec_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_spec_lsContext param_spec_ls() throws RecognitionException {
		Param_spec_lsContext _localctx = new Param_spec_lsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param_spec_ls);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				vacio();
				}
				break;
			case TK_LBRACKET:
			case TK_VAL:
			case TK_VAR:
			case TK_RES:
			case TK_REF:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
			case TK_STRING:
			case TK_ENUM:
			case TK_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				param_spec_lp();
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

	public static class Param_spec_lpContext extends ParserRuleContext {
		public Param_specContext param_spec() {
			return getRuleContext(Param_specContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(MiLenguajeParser.TK_SEPARATOR, 0); }
		public Param_spec_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_spec_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParam_spec_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParam_spec_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParam_spec_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_spec_lpContext param_spec_lp() throws RecognitionException {
		Param_spec_lpContext _localctx = new Param_spec_lpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_param_spec_lp);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				param_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				param_spec();
				setState(161);
				match(TK_SEPARATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				param_spec();
				setState(164);
				match(TK_SEPARATOR);
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

	public static class Param_specContext extends ParserRuleContext {
		public Param_kind_optContext param_kind_opt() {
			return getRuleContext(Param_kind_optContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public Param_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParam_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParam_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParam_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_specContext param_spec() throws RecognitionException {
		Param_specContext _localctx = new Param_specContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_param_spec);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				param_kind_opt();
				setState(169);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				param_kind_opt();
				setState(172);
				id_subs_lp(0);
				setState(173);
				match(TK_COLON);
				setState(174);
				type();
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

	public static class Common_stmtContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Import_clauseContext import_clause() {
			return getRuleContext(Import_clauseContext.class,0);
		}
		public Common_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterCommon_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitCommon_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitCommon_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_stmtContext common_stmt() throws RecognitionException {
		Common_stmtContext _localctx = new Common_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_common_stmt);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SEPARATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				vacio();
				}
				break;
			case TK_TYPE:
			case TK_VAR:
			case TK_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				decl();
				}
				break;
			case TK_IMPORT:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				import_clause();
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

	public static class Extend_clauseContext extends ParserRuleContext {
		public TerminalNode TK_EXTEND() { return getToken(MiLenguajeParser.TK_EXTEND, 0); }
		public Import_listContext import_list() {
			return getRuleContext(Import_listContext.class,0);
		}
		public Extend_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extend_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExtend_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExtend_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExtend_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extend_clauseContext extend_clause() throws RecognitionException {
		Extend_clauseContext _localctx = new Extend_clauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_extend_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(TK_EXTEND);
			setState(184);
			import_list(0);
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

	public static class Import_clauseContext extends ParserRuleContext {
		public TerminalNode TK_IMPORT() { return getToken(MiLenguajeParser.TK_IMPORT, 0); }
		public Import_listContext import_list() {
			return getRuleContext(Import_listContext.class,0);
		}
		public Import_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterImport_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitImport_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitImport_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_clauseContext import_clause() throws RecognitionException {
		Import_clauseContext _localctx = new Import_clauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_import_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(TK_IMPORT);
			setState(187);
			import_list(0);
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

	public static class Import_listContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Import_listContext import_list() {
			return getRuleContext(Import_listContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(MiLenguajeParser.TK_COMMA, 0); }
		public Import_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterImport_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitImport_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitImport_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_listContext import_list() throws RecognitionException {
		return import_list(0);
	}

	private Import_listContext import_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Import_listContext _localctx = new Import_listContext(_ctx, _parentState);
		Import_listContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_import_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(190);
			match(TK_ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Import_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_import_list);
					setState(192);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(193);
					match(TK_COMMA);
					setState(194);
					match(TK_ID);
					}
					} 
				}
				setState(199);
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

	public static class DeclContext extends ParserRuleContext {
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public Obj_declContext obj_decl() {
			return getRuleContext(Obj_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_decl);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				type_decl();
				}
				break;
			case TK_VAR:
			case TK_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				obj_decl();
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

	public static class Type_declContext extends ParserRuleContext {
		public TerminalNode TK_TYPE() { return getToken(MiLenguajeParser.TK_TYPE, 0); }
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public TerminalNode TK_EQ() { return getToken(MiLenguajeParser.TK_EQ, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_restrictionContext type_restriction() {
			return getRuleContext(Type_restrictionContext.class,0);
		}
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterType_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitType_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitType_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(TK_TYPE);
			setState(205);
			match(TK_ID);
			setState(206);
			match(TK_EQ);
			setState(207);
			type();
			setState(208);
			type_restriction();
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

	public static class Type_restrictionContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_LBRACE() { return getToken(MiLenguajeParser.TK_LBRACE, 0); }
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public TerminalNode TK_RBRACE() { return getToken(MiLenguajeParser.TK_RBRACE, 0); }
		public Type_restrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_restriction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterType_restriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitType_restriction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitType_restriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_restrictionContext type_restriction() throws RecognitionException {
		Type_restrictionContext _localctx = new Type_restrictionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type_restriction);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SEPARATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				vacio();
				}
				break;
			case TK_LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(TK_LBRACE);
				setState(212);
				match(TK_ID);
				setState(213);
				match(TK_RBRACE);
				 WARN("type restriction ignored"); 
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
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public Unsub_typeContext unsub_type() {
			return getRuleContext(Unsub_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				subscripts();
				setState(218);
				unsub_type();
				}
				break;
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
			case TK_STRING:
			case TK_ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				unsub_type();
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

	public static class Unsub_typeContext extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public String_defContext string_def() {
			return getRuleContext(String_defContext.class,0);
		}
		public Enum_defContext enum_def() {
			return getRuleContext(Enum_defContext.class,0);
		}
		public Unsub_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsub_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterUnsub_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitUnsub_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitUnsub_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsub_typeContext unsub_type() throws RecognitionException {
		Unsub_typeContext _localctx = new Unsub_typeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unsub_type);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				basic_type();
				}
				break;
			case TK_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				string_def();
				}
				break;
			case TK_ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				enum_def();
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

	public static class Basic_typeContext extends ParserRuleContext {
		public TerminalNode TK_BOOL() { return getToken(MiLenguajeParser.TK_BOOL, 0); }
		public TerminalNode TK_CHAR() { return getToken(MiLenguajeParser.TK_CHAR, 0); }
		public TerminalNode TK_INT() { return getToken(MiLenguajeParser.TK_INT, 0); }
		public TerminalNode TK_FILE() { return getToken(MiLenguajeParser.TK_FILE, 0); }
		public TerminalNode TK_REAL() { return getToken(MiLenguajeParser.TK_REAL, 0); }
		public Basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBasic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBasic_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBasic_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_basic_type);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(TK_BOOL);
				 $$ = newnode (O_BOOL); 
				}
				break;
			case TK_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(TK_CHAR);
				 $$ = newnode (O_CHAR); 
				}
				break;
			case TK_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(TK_INT);
				 $$ = newnode (O_INT); 
				}
				break;
			case TK_FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(TK_FILE);
				 $$ = newnode (O_FFILE); 
				}
				break;
			case TK_REAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(TK_REAL);
				 $$ = newnode (O_REAL); 
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

	public static class Param_kind_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_VAL() { return getToken(MiLenguajeParser.TK_VAL, 0); }
		public TerminalNode TK_VAR() { return getToken(MiLenguajeParser.TK_VAR, 0); }
		public TerminalNode TK_RES() { return getToken(MiLenguajeParser.TK_RES, 0); }
		public TerminalNode TK_REF() { return getToken(MiLenguajeParser.TK_REF, 0); }
		public Param_kind_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_kind_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParam_kind_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParam_kind_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParam_kind_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_kind_optContext param_kind_opt() throws RecognitionException {
		Param_kind_optContext _localctx = new Param_kind_optContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_param_kind_opt);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LBRACKET:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
			case TK_STRING:
			case TK_ENUM:
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				vacio();
				}
				break;
			case TK_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(TK_VAL);
				}
				break;
			case TK_VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(TK_VAR);
				}
				break;
			case TK_RES:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(TK_RES);
				}
				break;
			case TK_REF:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(TK_REF);
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

	public static class String_defContext extends ParserRuleContext {
		public TerminalNode TK_STRING() { return getToken(MiLenguajeParser.TK_STRING, 0); }
		public TerminalNode TK_LBRACKET() { return getToken(MiLenguajeParser.TK_LBRACKET, 0); }
		public String_limContext string_lim() {
			return getRuleContext(String_limContext.class,0);
		}
		public TerminalNode TK_RBRACKET() { return getToken(MiLenguajeParser.TK_RBRACKET, 0); }
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public String_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterString_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitString_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitString_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_defContext string_def() throws RecognitionException {
		String_defContext _localctx = new String_defContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_string_def);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(TK_STRING);
				setState(248);
				match(TK_LBRACKET);
				setState(249);
				string_lim();
				setState(250);
				match(TK_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(TK_STRING);
				setState(253);
				match(TK_LPAREN);
				setState(254);
				string_lim();
				setState(255);
				match(TK_RPAREN);
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

	public static class String_limContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_ASTER() { return getToken(MiLenguajeParser.TK_ASTER, 0); }
		public String_limContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_lim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterString_lim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitString_lim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitString_lim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_limContext string_lim() throws RecognitionException {
		String_limContext _localctx = new String_limContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_string_lim);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				expr();
				}
				break;
			case TK_ASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(TK_ASTER);
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

	public static class Obj_declContext extends ParserRuleContext {
		public Var_or_constContext var_or_const() {
			return getRuleContext(Var_or_constContext.class,0);
		}
		public Var_def_lpContext var_def_lp() {
			return getRuleContext(Var_def_lpContext.class,0);
		}
		public Obj_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterObj_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitObj_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitObj_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Obj_declContext obj_decl() throws RecognitionException {
		Obj_declContext _localctx = new Obj_declContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_obj_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			var_or_const();
			setState(264);
			var_def_lp(0);
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

	public static class Enum_defContext extends ParserRuleContext {
		public TerminalNode TK_ENUM() { return getToken(MiLenguajeParser.TK_ENUM, 0); }
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public Id_lpContext id_lp() {
			return getRuleContext(Id_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public Enum_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterEnum_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitEnum_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitEnum_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_defContext enum_def() throws RecognitionException {
		Enum_defContext _localctx = new Enum_defContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_enum_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(TK_ENUM);
			setState(267);
			match(TK_LPAREN);
			setState(268);
			id_lp(0);
			setState(269);
			match(TK_RPAREN);
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

	public static class Var_or_constContext extends ParserRuleContext {
		public TerminalNode TK_VAR() { return getToken(MiLenguajeParser.TK_VAR, 0); }
		public TerminalNode TK_CONST() { return getToken(MiLenguajeParser.TK_CONST, 0); }
		public Var_or_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_or_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterVar_or_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitVar_or_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVar_or_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_or_constContext var_or_const() throws RecognitionException {
		Var_or_constContext _localctx = new Var_or_constContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_var_or_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==TK_VAR || _la==TK_CONST) ) {
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

	public static class Var_def_lpContext extends ParserRuleContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public Var_def_lpContext var_def_lp() {
			return getRuleContext(Var_def_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(MiLenguajeParser.TK_COMMA, 0); }
		public Var_def_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterVar_def_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitVar_def_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVar_def_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_def_lpContext var_def_lp() throws RecognitionException {
		return var_def_lp(0);
	}

	private Var_def_lpContext var_def_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Var_def_lpContext _localctx = new Var_def_lpContext(_ctx, _parentState);
		Var_def_lpContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_var_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(274);
			var_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Var_def_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_var_def_lp);
					setState(276);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(277);
					match(TK_COMMA);
					setState(278);
					var_def();
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Var_defContext extends ParserRuleContext {
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public Var_attContext var_att() {
			return getRuleContext(Var_attContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			id_subs_lp(0);
			setState(285);
			var_att();
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

	public static class Var_attContext extends ParserRuleContext {
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(MiLenguajeParser.TK_SEPARATOR, 0); }
		public Var_attContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_att; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterVar_att(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitVar_att(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVar_att(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_attContext var_att() throws RecognitionException {
		Var_attContext _localctx = new Var_attContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_var_att);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(TK_COLON);
				setState(288);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(TK_COLON);
				setState(290);
				type();
				setState(291);
				match(TK_ASSIGN);
				setState(292);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(TK_ASSIGN);
				setState(295);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				match(TK_SEPARATOR);
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

	public static class Id_subs_lpContext extends ParserRuleContext {
		public Id_subsContext id_subs() {
			return getRuleContext(Id_subsContext.class,0);
		}
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(MiLenguajeParser.TK_COMMA, 0); }
		public Id_subs_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_subs_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterId_subs_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitId_subs_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitId_subs_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_subs_lpContext id_subs_lp() throws RecognitionException {
		return id_subs_lp(0);
	}

	private Id_subs_lpContext id_subs_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Id_subs_lpContext _localctx = new Id_subs_lpContext(_ctx, _parentState);
		Id_subs_lpContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_id_subs_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(300);
			id_subs();
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_subs_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_subs_lp);
					setState(302);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(303);
					match(TK_COMMA);
					setState(304);
					id_subs();
					}
					} 
				}
				setState(309);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Id_subsContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public Id_subsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_subs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterId_subs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitId_subs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitId_subs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_subsContext id_subs() throws RecognitionException {
		Id_subsContext _localctx = new Id_subsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_id_subs);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(TK_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(TK_ID);
				setState(312);
				subscripts();
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

	public static class SubscriptsContext extends ParserRuleContext {
		public Bracketed_listContext bracketed_list() {
			return getRuleContext(Bracketed_listContext.class,0);
		}
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public SubscriptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscripts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSubscripts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSubscripts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSubscripts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptsContext subscripts() throws RecognitionException {
		SubscriptsContext _localctx = new SubscriptsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_subscripts);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				bracketed_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				bracketed_list();
				setState(317);
				subscripts();
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

	public static class Bracketed_listContext extends ParserRuleContext {
		public TerminalNode TK_LBRACKET() { return getToken(MiLenguajeParser.TK_LBRACKET, 0); }
		public Bound_lpContext bound_lp() {
			return getRuleContext(Bound_lpContext.class,0);
		}
		public TerminalNode TK_RBRACKET() { return getToken(MiLenguajeParser.TK_RBRACKET, 0); }
		public Bracketed_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketed_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBracketed_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBracketed_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBracketed_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracketed_listContext bracketed_list() throws RecognitionException {
		Bracketed_listContext _localctx = new Bracketed_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_bracketed_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(TK_LBRACKET);
			setState(322);
			bound_lp(0);
			setState(323);
			match(TK_RBRACKET);
			 $$ = $2; 
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

	public static class Bound_lpContext extends ParserRuleContext {
		public BoundsContext bounds() {
			return getRuleContext(BoundsContext.class,0);
		}
		public Bound_lpContext bound_lp() {
			return getRuleContext(Bound_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(MiLenguajeParser.TK_COMMA, 0); }
		public Bound_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBound_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBound_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBound_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bound_lpContext bound_lp() throws RecognitionException {
		return bound_lp(0);
	}

	private Bound_lpContext bound_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bound_lpContext _localctx = new Bound_lpContext(_ctx, _parentState);
		Bound_lpContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_bound_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(327);
			bounds();
			}
			_ctx.stop = _input.LT(-1);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bound_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bound_lp);
					setState(329);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(330);
					match(TK_COMMA);
					setState(331);
					bounds();
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class BoundsContext extends ParserRuleContext {
		public List<BoundContext> bound() {
			return getRuleContexts(BoundContext.class);
		}
		public BoundContext bound(int i) {
			return getRuleContext(BoundContext.class,i);
		}
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public BoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundsContext bounds() throws RecognitionException {
		BoundsContext _localctx = new BoundsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_bounds);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				bound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				bound();
				setState(339);
				match(TK_COLON);
				setState(340);
				bound();
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

	public static class BoundContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_ASTER() { return getToken(MiLenguajeParser.TK_ASTER, 0); }
		public BoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundContext bound() throws RecognitionException {
		BoundContext _localctx = new BoundContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_bound);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				expr();
				}
				break;
			case TK_ASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(TK_ASTER);
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

	public static class Id_lpContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Id_lpContext id_lp() {
			return getRuleContext(Id_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(MiLenguajeParser.TK_COMMA, 0); }
		public Id_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterId_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitId_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitId_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_lpContext id_lp() throws RecognitionException {
		return id_lp(0);
	}

	private Id_lpContext id_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Id_lpContext _localctx = new Id_lpContext(_ctx, _parentState);
		Id_lpContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_id_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(349);
			match(TK_ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_lp);
					setState(351);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(352);
					match(TK_COMMA);
					setState(353);
					match(TK_ID);
					}
					} 
				}
				setState(358);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__1);
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
		public FaltaContext falta() {
			return getRuleContext(FaltaContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			falta();
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

	public static class FaltaContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public FaltaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFalta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFalta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFalta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaltaContext falta() throws RecognitionException {
		FaltaContext _localctx = new FaltaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_falta);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				vacio();
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

	public static class VacioContext extends ParserRuleContext {
		public VacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterVacio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitVacio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVacio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VacioContext vacio() throws RecognitionException {
		VacioContext _localctx = new VacioContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_vacio);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class OtroContext extends ParserRuleContext {
		public OtroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOtro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOtro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOtro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtroContext otro() throws RecognitionException {
		OtroContext _localctx = new OtroContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_otro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
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
		case 19:
			return import_list_sempred((Import_listContext)_localctx, predIndex);
		case 32:
			return var_def_lp_sempred((Var_def_lpContext)_localctx, predIndex);
		case 35:
			return id_subs_lp_sempred((Id_subs_lpContext)_localctx, predIndex);
		case 39:
			return bound_lp_sempred((Bound_lpContext)_localctx, predIndex);
		case 42:
			return id_lp_sempred((Id_lpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean import_list_sempred(Import_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean var_def_lp_sempred(Var_def_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean id_subs_lp_sempred(Id_subs_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bound_lp_sempred(Bound_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean id_lp_sempred(Id_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0176\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\5\3j\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\5\b\u0080\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u008b\n\t\3\n\3\n\5\n\u008f\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u00a0\n\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u00a9\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00b3\n\21\3\22\3\22\3\22\5\22\u00b8\n\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00c6\n\25\f\25\16\25"+
		"\u00c9\13\25\3\26\3\26\5\26\u00cd\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u00da\n\30\3\31\3\31\3\31\3\31\5\31\u00e0"+
		"\n\31\3\32\3\32\3\32\5\32\u00e5\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u00f1\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u00f8\n"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0104\n\35"+
		"\3\36\3\36\5\36\u0108\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\7\"\u011a\n\"\f\"\16\"\u011d\13\"\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\5$\u012c\n$\3%\3%\3%\3%\3%\3%\7%\u0134\n%\f%\16%\u0137"+
		"\13%\3&\3&\3&\5&\u013c\n&\3\'\3\'\3\'\3\'\5\'\u0142\n\'\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\7)\u014f\n)\f)\16)\u0152\13)\3*\3*\3*\3*\3*\5*\u0159"+
		"\n*\3+\3+\5+\u015d\n+\3,\3,\3,\3,\3,\3,\7,\u0165\n,\f,\16,\u0168\13,\3"+
		"-\3-\3.\3.\3/\3/\5/\u0170\n/\3\60\3\60\3\61\3\61\3\61\2\7(BHPV\62\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`\2\4\4\2\31\31%%\3\2\6\7\2\u016f\2b\3\2\2\2\4i\3\2\2\2\6k\3\2"+
		"\2\2\bp\3\2\2\2\nr\3\2\2\2\ft\3\2\2\2\16\177\3\2\2\2\20\u008a\3\2\2\2"+
		"\22\u008e\3\2\2\2\24\u0090\3\2\2\2\26\u0093\3\2\2\2\30\u0097\3\2\2\2\32"+
		"\u0099\3\2\2\2\34\u009f\3\2\2\2\36\u00a8\3\2\2\2 \u00b2\3\2\2\2\"\u00b7"+
		"\3\2\2\2$\u00b9\3\2\2\2&\u00bc\3\2\2\2(\u00bf\3\2\2\2*\u00cc\3\2\2\2,"+
		"\u00ce\3\2\2\2.\u00d9\3\2\2\2\60\u00df\3\2\2\2\62\u00e4\3\2\2\2\64\u00f0"+
		"\3\2\2\2\66\u00f7\3\2\2\28\u0103\3\2\2\2:\u0107\3\2\2\2<\u0109\3\2\2\2"+
		">\u010c\3\2\2\2@\u0111\3\2\2\2B\u0113\3\2\2\2D\u011e\3\2\2\2F\u012b\3"+
		"\2\2\2H\u012d\3\2\2\2J\u013b\3\2\2\2L\u0141\3\2\2\2N\u0143\3\2\2\2P\u0148"+
		"\3\2\2\2R\u0158\3\2\2\2T\u015c\3\2\2\2V\u015e\3\2\2\2X\u0169\3\2\2\2Z"+
		"\u016b\3\2\2\2\\\u016f\3\2\2\2^\u0171\3\2\2\2`\u0173\3\2\2\2bc\5\4\3\2"+
		"c\3\3\2\2\2dj\5\6\4\2ej\5\b\5\2fj\5\n\6\2gj\5\f\7\2hj\5Z.\2id\3\2\2\2"+
		"ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\5\3\2\2\2kl\7\24\2\2lm\7(\2"+
		"\2mn\5\24\13\2no\5\20\t\2o\7\3\2\2\2pq\5\\/\2q\t\3\2\2\2rs\5\\/\2s\13"+
		"\3\2\2\2tu\7\26\2\2uv\7(\2\2vw\7\16\2\2wx\5\\/\2xy\7\17\2\2yz\5\\/\2z"+
		"{\5Z.\2{|\7\3\2\2|\r\3\2\2\2}\u0080\5\"\22\2~\u0080\5$\23\2\177}\3\2\2"+
		"\2\177~\3\2\2\2\u0080\17\3\2\2\2\u0081\u008b\5^\60\2\u0082\u0083\7\25"+
		"\2\2\u0083\u0084\7\'\2\2\u0084\u008b\5\22\n\2\u0085\u0086\7\25\2\2\u0086"+
		"\u0087\7\'\2\2\u0087\u0088\5\22\n\2\u0088\u0089\7\34\2\2\u0089\u008b\3"+
		"\2\2\2\u008a\u0081\3\2\2\2\u008a\u0082\3\2\2\2\u008a\u0085\3\2\2\2\u008b"+
		"\21\3\2\2\2\u008c\u008f\5^\60\2\u008d\u008f\5\30\r\2\u008e\u008c\3\2\2"+
		"\2\u008e\u008d\3\2\2\2\u008f\23\3\2\2\2\u0090\u0091\5\16\b\2\u0091\u0092"+
		"\5\26\f\2\u0092\25\3\2\2\2\u0093\u0094\7\t\2\2\u0094\u0095\5\16\b\2\u0095"+
		"\u0096\5\26\f\2\u0096\27\3\2\2\2\u0097\u0098\5\32\16\2\u0098\31\3\2\2"+
		"\2\u0099\u009a\7\16\2\2\u009a\u009b\5\34\17\2\u009b\u009c\7\17\2\2\u009c"+
		"\33\3\2\2\2\u009d\u00a0\5^\60\2\u009e\u00a0\5\36\20\2\u009f\u009d\3\2"+
		"\2\2\u009f\u009e\3\2\2\2\u00a0\35\3\2\2\2\u00a1\u00a9\5 \21\2\u00a2\u00a3"+
		"\5 \21\2\u00a3\u00a4\7\t\2\2\u00a4\u00a9\3\2\2\2\u00a5\u00a6\5 \21\2\u00a6"+
		"\u00a7\7\t\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a2\3\2"+
		"\2\2\u00a8\u00a5\3\2\2\2\u00a9\37\3\2\2\2\u00aa\u00ab\5\66\34\2\u00ab"+
		"\u00ac\5\60\31\2\u00ac\u00b3\3\2\2\2\u00ad\u00ae\5\66\34\2\u00ae\u00af"+
		"\5H%\2\u00af\u00b0\7\22\2\2\u00b0\u00b1\5\60\31\2\u00b1\u00b3\3\2\2\2"+
		"\u00b2\u00aa\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b3!\3\2\2\2\u00b4\u00b8\5"+
		"^\60\2\u00b5\u00b8\5*\26\2\u00b6\u00b8\5&\24\2\u00b7\u00b4\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8#\3\2\2\2\u00b9\u00ba\7#\2\2\u00ba"+
		"\u00bb\5(\25\2\u00bb%\3\2\2\2\u00bc\u00bd\7$\2\2\u00bd\u00be\5(\25\2\u00be"+
		"\'\3\2\2\2\u00bf\u00c0\b\25\1\2\u00c0\u00c1\7\'\2\2\u00c1\u00c7\3\2\2"+
		"\2\u00c2\u00c3\f\3\2\2\u00c3\u00c4\7\20\2\2\u00c4\u00c6\7\'\2\2\u00c5"+
		"\u00c2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8)\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\5,\27\2\u00cb\u00cd"+
		"\5<\37\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd+\3\2\2\2\u00ce"+
		"\u00cf\7\27\2\2\u00cf\u00d0\7\'\2\2\u00d0\u00d1\7\23\2\2\u00d1\u00d2\5"+
		"\60\31\2\u00d2\u00d3\5.\30\2\u00d3-\3\2\2\2\u00d4\u00da\5^\60\2\u00d5"+
		"\u00d6\7\f\2\2\u00d6\u00d7\7\'\2\2\u00d7\u00d8\7\r\2\2\u00d8\u00da\b\30"+
		"\1\2\u00d9\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da/\3\2\2\2\u00db\u00dc"+
		"\5L\'\2\u00dc\u00dd\5\62\32\2\u00dd\u00e0\3\2\2\2\u00de\u00e0\5\62\32"+
		"\2\u00df\u00db\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\61\3\2\2\2\u00e1\u00e5"+
		"\5\64\33\2\u00e2\u00e5\58\35\2\u00e3\u00e5\5> \2\u00e4\u00e1\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\63\3\2\2\2\u00e6\u00e7\7\35\2"+
		"\2\u00e7\u00f1\b\33\1\2\u00e8\u00e9\7\37\2\2\u00e9\u00f1\b\33\1\2\u00ea"+
		"\u00eb\7\36\2\2\u00eb\u00f1\b\33\1\2\u00ec\u00ed\7!\2\2\u00ed\u00f1\b"+
		"\33\1\2\u00ee\u00ef\7 \2\2\u00ef\u00f1\b\33\1\2\u00f0\u00e6\3\2\2\2\u00f0"+
		"\u00e8\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\65\3\2\2\2\u00f2\u00f8\5^\60\2\u00f3\u00f8\7\30\2\2\u00f4\u00f8"+
		"\7\31\2\2\u00f5\u00f8\7\32\2\2\u00f6\u00f8\7\33\2\2\u00f7\u00f2\3\2\2"+
		"\2\u00f7\u00f3\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\67\3\2\2\2\u00f9\u00fa\7\"\2\2\u00fa\u00fb\7\n\2\2\u00fb"+
		"\u00fc\5:\36\2\u00fc\u00fd\7\13\2\2\u00fd\u0104\3\2\2\2\u00fe\u00ff\7"+
		"\"\2\2\u00ff\u0100\7\16\2\2\u0100\u0101\5:\36\2\u0101\u0102\7\17\2\2\u0102"+
		"\u0104\3\2\2\2\u0103\u00f9\3\2\2\2\u0103\u00fe\3\2\2\2\u01049\3\2\2\2"+
		"\u0105\u0108\5X-\2\u0106\u0108\7\21\2\2\u0107\u0105\3\2\2\2\u0107\u0106"+
		"\3\2\2\2\u0108;\3\2\2\2\u0109\u010a\5@!\2\u010a\u010b\5B\"\2\u010b=\3"+
		"\2\2\2\u010c\u010d\7&\2\2\u010d\u010e\7\16\2\2\u010e\u010f\5V,\2\u010f"+
		"\u0110\7\17\2\2\u0110?\3\2\2\2\u0111\u0112\t\2\2\2\u0112A\3\2\2\2\u0113"+
		"\u0114\b\"\1\2\u0114\u0115\5D#\2\u0115\u011b\3\2\2\2\u0116\u0117\f\3\2"+
		"\2\u0117\u0118\7\20\2\2\u0118\u011a\5D#\2\u0119\u0116\3\2\2\2\u011a\u011d"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011cC\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u011f\5H%\2\u011f\u0120\5F$\2\u0120E\3\2\2\2\u0121"+
		"\u0122\7\22\2\2\u0122\u012c\5\60\31\2\u0123\u0124\7\22\2\2\u0124\u0125"+
		"\5\60\31\2\u0125\u0126\7\b\2\2\u0126\u0127\5X-\2\u0127\u012c\3\2\2\2\u0128"+
		"\u0129\7\b\2\2\u0129\u012c\5X-\2\u012a\u012c\7\t\2\2\u012b\u0121\3\2\2"+
		"\2\u012b\u0123\3\2\2\2\u012b\u0128\3\2\2\2\u012b\u012a\3\2\2\2\u012cG"+
		"\3\2\2\2\u012d\u012e\b%\1\2\u012e\u012f\5J&\2\u012f\u0135\3\2\2\2\u0130"+
		"\u0131\f\3\2\2\u0131\u0132\7\20\2\2\u0132\u0134\5J&\2\u0133\u0130\3\2"+
		"\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"I\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013c\7\'\2\2\u0139\u013a\7\'\2\2"+
		"\u013a\u013c\5L\'\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013cK\3\2"+
		"\2\2\u013d\u0142\5N(\2\u013e\u013f\5N(\2\u013f\u0140\5L\'\2\u0140\u0142"+
		"\3\2\2\2\u0141\u013d\3\2\2\2\u0141\u013e\3\2\2\2\u0142M\3\2\2\2\u0143"+
		"\u0144\7\n\2\2\u0144\u0145\5P)\2\u0145\u0146\7\13\2\2\u0146\u0147\b(\1"+
		"\2\u0147O\3\2\2\2\u0148\u0149\b)\1\2\u0149\u014a\5R*\2\u014a\u0150\3\2"+
		"\2\2\u014b\u014c\f\3\2\2\u014c\u014d\7\20\2\2\u014d\u014f\5R*\2\u014e"+
		"\u014b\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151Q\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0159\5T+\2\u0154\u0155"+
		"\5T+\2\u0155\u0156\7\22\2\2\u0156\u0157\5T+\2\u0157\u0159\3\2\2\2\u0158"+
		"\u0153\3\2\2\2\u0158\u0154\3\2\2\2\u0159S\3\2\2\2\u015a\u015d\5X-\2\u015b"+
		"\u015d\7\21\2\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015dU\3\2\2\2"+
		"\u015e\u015f\b,\1\2\u015f\u0160\7\'\2\2\u0160\u0166\3\2\2\2\u0161\u0162"+
		"\f\3\2\2\u0162\u0163\7\20\2\2\u0163\u0165\7\'\2\2\u0164\u0161\3\2\2\2"+
		"\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167W\3"+
		"\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7\4\2\2\u016aY\3\2\2\2\u016b\u016c"+
		"\5\\/\2\u016c[\3\2\2\2\u016d\u0170\7\5\2\2\u016e\u0170\5^\60\2\u016f\u016d"+
		"\3\2\2\2\u016f\u016e\3\2\2\2\u0170]\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"_\3\2\2\2\u0173\u0174\t\3\2\2\u0174a\3\2\2\2\35i\177\u008a\u008e\u009f"+
		"\u00a8\u00b2\u00b7\u00c7\u00cc\u00d9\u00df\u00e4\u00f0\u00f7\u0103\u0107"+
		"\u011b\u012b\u0135\u013b\u0141\u0150\u0158\u015c\u0166\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}