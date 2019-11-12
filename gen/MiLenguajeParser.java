// Generated from C:/Users/acer/Google Drive/CESAR/3. UNAL/2. MATERIAS/28. LENGUAJES DE PROGRAMACIÓN/SR-to-CPP-translator/grammar\MiLenguaje.g4 by ANTLR 4.7.2
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
		T__0=1, TK_EXTERNAL=2, TK_PARALLEL=3, TK_PERIOD=4, TK_INCR=5, TK_DECR=6, 
		TK_HAT=7, TK_ASSIGN=8, TK_SEPARATOR=9, TK_LBRACKET=10, TK_RBRACKET=11, 
		TK_LBRACE=12, TK_RBRACE=13, TK_LPAREN=14, TK_RPAREN=15, TK_COMMA=16, TK_ASTER=17, 
		TK_COLON=18, TK_EQ=19, TK_ARROW=20, TK_SQUARE=21, TK_EXPON=22, TK_DIV=23, 
		TK_MOD=24, TK_REMDR=25, TK_PLUS=26, TK_MINUS=27, TK_CONCAT=28, TK_NE=29, 
		TK_GE=30, TK_LE=31, TK_GT=32, TK_LT=33, TK_AND=34, TK_OR=35, TK_XOR=36, 
		TK_RSHIFT=37, TK_LSHIFT=38, TK_SWAP=39, TK_AUG_PLUS=40, TK_AUG_MINUS=41, 
		TK_AUG_ASTER=42, TK_AUG_DIV=43, TK_AUG_REMDR=44, TK_AUG_EXPON=45, TK_AUG_OR=46, 
		TK_AUG_AND=47, TK_AUG_CONCAT=48, TK_AUG_RSHIFT=49, TK_AUG_LSHIFT=50, TK_NOT=51, 
		TK_ADDR=52, TK_QMARK=53, TK_OPTYPE=54, TK_RECEIVE=55, TK_P=56, TK_CO=57, 
		TK_OC=58, TK_V=59, TK_IN=60, TK_NI=61, TK_OR_=62, TK_FA=63, TK_AF=64, 
		TK_PROCESS=65, TK_PROCEDURE=66, TK_BY=67, TK_TO=68, TK_SUCHTHAT=69, TK_DOWNTO=70, 
		TK_LOW=71, TK_HIGH=72, TK_NEW=73, TK_SEM=74, TK_OP=75, TK_BOGUS=76, TK_ILIT=77, 
		TK_RLIT=78, TK_CLIT=79, TK_SLIT=80, TK_NLIT=81, TK_BLIT=82, TK_FLIT=83, 
		TK_ELSE=84, TK_IF=85, TK_FI=86, TK_DO=87, TK_OD=88, TK_SKIP=89, TK_EXIT=90, 
		TK_NEXT=91, TK_RETURN=92, TK_REPLY=93, TK_FORWARD=94, TK_SEND=95, TK_CALL=96, 
		TK_DESTROY=97, TK_BEGIN=98, TK_END=99, TK_GLOBAL=100, TK_RESOURCE=101, 
		TK_BODY=102, TK_PROC=103, TK_TYPE=104, TK_VAL=105, TK_VAR=106, TK_RES=107, 
		TK_REF=108, TK_SEPARATE=109, TK_BOOL=110, TK_INT=111, TK_CHAR=112, TK_REAL=113, 
		TK_FILE=114, TK_STRING=115, TK_EXTEND=116, TK_IMPORT=117, TK_CONST=118, 
		TK_ENUM=119, TK_RETURNS=120, TK_CREATE=121, TK_VM=122, TK_ON=123, TK_STOP=124, 
		TK_PTR=125, TK_REC=126, TK_UNION=127, TK_ANY=128, TK_CAP=129, TK_INITIAL=130, 
		TK_FINAL=131, TK_ID=132, CADENA=133, NUM=134, ESP=135, LINE_COMMENT=136;
	public static final int
		RULE_inicio = 0, RULE_componet = 1, RULE_global = 2, RULE_comp_label = 3, 
		RULE_resource_specification = 4, RULE_resource_body = 5, RULE_proc = 6, 
		RULE_process = 7, RULE_procedure = 8, RULE_quantifiers_opt = 9, RULE_quantifier_lp = 10, 
		RULE_quantifier = 11, RULE_direction = 12, RULE_step_opt = 13, RULE_such_that_opt = 14, 
		RULE_return_spec_null = 15, RULE_param_names = 16, RULE_return_name_opt = 17, 
		RULE_spec_stmt = 18, RULE_spec_body = 19, RULE_spec_body_comp = 20, RULE_maybe_params = 21, 
		RULE_spec_stmt_ls = 22, RULE_body_stmt_ls = 23, RULE_body_stmt = 24, RULE_separator_optional = 25, 
		RULE_body_only = 26, RULE_initial_block = 27, RULE_final_block = 28, RULE_final_opt = 29, 
		RULE_initial_opt = 30, RULE_stmt = 31, RULE_function_stmt = 32, RULE_stop_stmt = 33, 
		RULE_forward_stmt = 34, RULE_send_stmt = 35, RULE_explicit_call = 36, 
		RULE_v_stmt = 37, RULE_input_stmt = 38, RULE_in_cmd_lp = 39, RULE_in_cmd = 40, 
		RULE_in_spec = 41, RULE_in_op = 42, RULE_sched_expr_opt = 43, RULE_sync_expr_opt = 44, 
		RULE_receive_stmt = 45, RULE_p_stmt = 46, RULE_concurrent_stmt = 47, RULE_concurrent_cmd_lp = 48, 
		RULE_concurrent_cmd = 49, RULE_separator_opt = 50, RULE_concurrent_invocation = 51, 
		RULE_post_processing_opt = 52, RULE_invocation = 53, RULE_exit_code_opt = 54, 
		RULE_destroy_stmt = 55, RULE_begin_end = 56, RULE_if_stmt = 57, RULE_do_stmt = 58, 
		RULE_for_all_stmt = 59, RULE_guarded_cmd_lp = 60, RULE_guarded_cmd = 61, 
		RULE_else_cmd_opt = 62, RULE_paren_list = 63, RULE_paren_item_ls = 64, 
		RULE_expr_lp = 65, RULE_comp_params = 66, RULE_parameters = 67, RULE_param_spec_ls = 68, 
		RULE_param_spec_lp = 69, RULE_param_spec = 70, RULE_common_stmt = 71, 
		RULE_extend_clause = 72, RULE_import_clause = 73, RULE_import_list = 74, 
		RULE_decl = 75, RULE_type_decl = 76, RULE_type_restriction = 77, RULE_op_decl = 78, 
		RULE_oper_def_lp = 79, RULE_oper_def = 80, RULE_colon_opt = 81, RULE_op_or_ext = 82, 
		RULE_optype_decl = 83, RULE_sem_decl = 84, RULE_sem_def_lp = 85, RULE_sem_def = 86, 
		RULE_sem_init = 87, RULE_eq_opt = 88, RULE_type = 89, RULE_unsub_type = 90, 
		RULE_pointer_def = 91, RULE_union_def = 92, RULE_record_def = 93, RULE_capability_def = 94, 
		RULE_cap_for = 95, RULE_qualified_id = 96, RULE_basic_type = 97, RULE_field_lp = 98, 
		RULE_field = 99, RULE_param_kind_opt = 100, RULE_string_def = 101, RULE_string_lim = 102, 
		RULE_obj_decl = 103, RULE_enum_def = 104, RULE_var_or_const = 105, RULE_var_or_const_var = 106, 
		RULE_var_or_const_const = 107, RULE_var_def_lp = 108, RULE_var_def = 109, 
		RULE_var_att = 110, RULE_var_att_assign_expr = 111, RULE_id_subs_lp = 112, 
		RULE_id_subs = 113, RULE_id_subsID = 114, RULE_id_lp = 115, RULE_skip_stmt = 116, 
		RULE_exit_stmt = 117, RULE_next_stmt = 118, RULE_return_stmt = 119, RULE_reply_stmt = 120, 
		RULE_expr = 121, RULE_expr_num = 122, RULE_literal = 123, RULE_create_expr = 124, 
		RULE_create_call = 125, RULE_rsrc_name = 126, RULE_location_opt = 127, 
		RULE_constructor = 128, RULE_constr_item_lp = 129, RULE_constr_item = 130, 
		RULE_prefix_expr = 131, RULE_paren_expr = 132, RULE_new_item = 133, RULE_sem_proto = 134, 
		RULE_op_prototype = 135, RULE_op_restriction_opt = 136, RULE_prototype = 137, 
		RULE_return_spec_opt = 138, RULE_subscripts_opt = 139, RULE_subscripts = 140, 
		RULE_bracketed_list = 141, RULE_bound_lp = 142, RULE_bounds = 143, RULE_bound = 144, 
		RULE_op_restriction = 145, RULE_end_id = 146, RULE_id_opt = 147, RULE_block = 148, 
		RULE_block_items = 149, RULE_block_items_ = 150, RULE_block_item = 151, 
		RULE_id_ls = 152, RULE_falta = 153, RULE_vacio = 154;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "componet", "global", "comp_label", "resource_specification", 
			"resource_body", "proc", "process", "procedure", "quantifiers_opt", "quantifier_lp", 
			"quantifier", "direction", "step_opt", "such_that_opt", "return_spec_null", 
			"param_names", "return_name_opt", "spec_stmt", "spec_body", "spec_body_comp", 
			"maybe_params", "spec_stmt_ls", "body_stmt_ls", "body_stmt", "separator_optional", 
			"body_only", "initial_block", "final_block", "final_opt", "initial_opt", 
			"stmt", "function_stmt", "stop_stmt", "forward_stmt", "send_stmt", "explicit_call", 
			"v_stmt", "input_stmt", "in_cmd_lp", "in_cmd", "in_spec", "in_op", "sched_expr_opt", 
			"sync_expr_opt", "receive_stmt", "p_stmt", "concurrent_stmt", "concurrent_cmd_lp", 
			"concurrent_cmd", "separator_opt", "concurrent_invocation", "post_processing_opt", 
			"invocation", "exit_code_opt", "destroy_stmt", "begin_end", "if_stmt", 
			"do_stmt", "for_all_stmt", "guarded_cmd_lp", "guarded_cmd", "else_cmd_opt", 
			"paren_list", "paren_item_ls", "expr_lp", "comp_params", "parameters", 
			"param_spec_ls", "param_spec_lp", "param_spec", "common_stmt", "extend_clause", 
			"import_clause", "import_list", "decl", "type_decl", "type_restriction", 
			"op_decl", "oper_def_lp", "oper_def", "colon_opt", "op_or_ext", "optype_decl", 
			"sem_decl", "sem_def_lp", "sem_def", "sem_init", "eq_opt", "type", "unsub_type", 
			"pointer_def", "union_def", "record_def", "capability_def", "cap_for", 
			"qualified_id", "basic_type", "field_lp", "field", "param_kind_opt", 
			"string_def", "string_lim", "obj_decl", "enum_def", "var_or_const", "var_or_const_var", 
			"var_or_const_const", "var_def_lp", "var_def", "var_att", "var_att_assign_expr", 
			"id_subs_lp", "id_subs", "id_subsID", "id_lp", "skip_stmt", "exit_stmt", 
			"next_stmt", "return_stmt", "reply_stmt", "expr", "expr_num", "literal", 
			"create_expr", "create_call", "rsrc_name", "location_opt", "constructor", 
			"constr_item_lp", "constr_item", "prefix_expr", "paren_expr", "new_item", 
			"sem_proto", "op_prototype", "op_restriction_opt", "prototype", "return_spec_opt", 
			"subscripts_opt", "subscripts", "bracketed_list", "bound_lp", "bounds", 
			"bound", "op_restriction", "end_id", "id_opt", "block", "block_items", 
			"block_items_", "block_item", "id_ls", "falta", "vacio"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'falta implementar'", "'external'", "'//'", "'.'", "'++'", "'--'", 
			"'^'", "':='", "';'", "'['", "']'", "'{'", "'}'", "'('", "')'", "','", 
			"'*'", "':'", "'='", "'->'", "'[]'", "'**'", "'/'", "'mod'", "'%'", "'+'", 
			"'-'", "'||'", "'!='", "'>='", "'<='", "'>'", "'<'", "'&'", "'|'", "'xor'", 
			"'>>'", "'<<'", "':=:'", "'+:='", "'-:='", "'*:='", "'/:='", "'%:='", 
			"'**:='", "'|:='", "'&:='", "'||:='", "'>>:='", "'<<:='", "'~'", "'@'", 
			"'?'", "'optype'", "'receive'", "'p'", "'co'", "'oc'", "'v'", "'in'", 
			"'ni'", "'or'", "'fa'", "'af'", "'process'", "'procedure'", "'by'", "'to'", 
			"'suchthat'", "'downto'", "'low'", "'high'", "'new'", "'sem'", "'op'", 
			"'bogus'", "'ilit'", "'rlit'", "'Clit'", "'Slit'", "'nlit'", "'blit'", 
			"'flit'", "'else'", "'if'", "'fi'", "'do'", "'od'", "'skip'", "'exit'", 
			"'next'", "'return'", "'reply'", "'forward'", "'send'", "'call'", "'destroy'", 
			"'begin'", "'end'", "'global'", "'resource'", "'body'", "'proc'", "'type'", 
			"'val'", "'var'", "'res'", "'ref'", "'separate'", "'bool'", "'int'", 
			"'char'", "'real'", "'file'", "'string'", "'extend'", "'import'", "'const'", 
			"'enum'", "'returns'", "'create'", "'vm'", "'on'", "'stop'", "'ptr'", 
			"'rec'", "'union'", "'any'", "'cap'", "'initial'", "'final'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TK_EXTERNAL", "TK_PARALLEL", "TK_PERIOD", "TK_INCR", "TK_DECR", 
			"TK_HAT", "TK_ASSIGN", "TK_SEPARATOR", "TK_LBRACKET", "TK_RBRACKET", 
			"TK_LBRACE", "TK_RBRACE", "TK_LPAREN", "TK_RPAREN", "TK_COMMA", "TK_ASTER", 
			"TK_COLON", "TK_EQ", "TK_ARROW", "TK_SQUARE", "TK_EXPON", "TK_DIV", "TK_MOD", 
			"TK_REMDR", "TK_PLUS", "TK_MINUS", "TK_CONCAT", "TK_NE", "TK_GE", "TK_LE", 
			"TK_GT", "TK_LT", "TK_AND", "TK_OR", "TK_XOR", "TK_RSHIFT", "TK_LSHIFT", 
			"TK_SWAP", "TK_AUG_PLUS", "TK_AUG_MINUS", "TK_AUG_ASTER", "TK_AUG_DIV", 
			"TK_AUG_REMDR", "TK_AUG_EXPON", "TK_AUG_OR", "TK_AUG_AND", "TK_AUG_CONCAT", 
			"TK_AUG_RSHIFT", "TK_AUG_LSHIFT", "TK_NOT", "TK_ADDR", "TK_QMARK", "TK_OPTYPE", 
			"TK_RECEIVE", "TK_P", "TK_CO", "TK_OC", "TK_V", "TK_IN", "TK_NI", "TK_OR_", 
			"TK_FA", "TK_AF", "TK_PROCESS", "TK_PROCEDURE", "TK_BY", "TK_TO", "TK_SUCHTHAT", 
			"TK_DOWNTO", "TK_LOW", "TK_HIGH", "TK_NEW", "TK_SEM", "TK_OP", "TK_BOGUS", 
			"TK_ILIT", "TK_RLIT", "TK_CLIT", "TK_SLIT", "TK_NLIT", "TK_BLIT", "TK_FLIT", 
			"TK_ELSE", "TK_IF", "TK_FI", "TK_DO", "TK_OD", "TK_SKIP", "TK_EXIT", 
			"TK_NEXT", "TK_RETURN", "TK_REPLY", "TK_FORWARD", "TK_SEND", "TK_CALL", 
			"TK_DESTROY", "TK_BEGIN", "TK_END", "TK_GLOBAL", "TK_RESOURCE", "TK_BODY", 
			"TK_PROC", "TK_TYPE", "TK_VAL", "TK_VAR", "TK_RES", "TK_REF", "TK_SEPARATE", 
			"TK_BOOL", "TK_INT", "TK_CHAR", "TK_REAL", "TK_FILE", "TK_STRING", "TK_EXTEND", 
			"TK_IMPORT", "TK_CONST", "TK_ENUM", "TK_RETURNS", "TK_CREATE", "TK_VM", 
			"TK_ON", "TK_STOP", "TK_PTR", "TK_REC", "TK_UNION", "TK_ANY", "TK_CAP", 
			"TK_INITIAL", "TK_FINAL", "TK_ID", "CADENA", "NUM", "ESP", "LINE_COMMENT"
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

	public static class InicioContext extends ParserRuleContext {
		public ComponetContext componet() {
			return getRuleContext(ComponetContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_GLOBAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				global();
				}
				break;
			case TK_RESOURCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				resource_specification();
				}
				break;
			case EOF:
			case TK_BODY:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				resource_body();
				}
				break;
			case TK_PROC:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				proc();
				}
				break;
			case TK_EXTERNAL:
			case TK_INCR:
			case TK_DECR:
			case TK_LPAREN:
			case TK_PLUS:
			case TK_MINUS:
			case TK_NOT:
			case TK_ADDR:
			case TK_QMARK:
			case TK_OPTYPE:
			case TK_RECEIVE:
			case TK_P:
			case TK_CO:
			case TK_V:
			case TK_IN:
			case TK_FA:
			case TK_LOW:
			case TK_HIGH:
			case TK_NEW:
			case TK_SEM:
			case TK_OP:
			case TK_ILIT:
			case TK_RLIT:
			case TK_CLIT:
			case TK_SLIT:
			case TK_NLIT:
			case TK_BLIT:
			case TK_FLIT:
			case TK_IF:
			case TK_DO:
			case TK_SKIP:
			case TK_EXIT:
			case TK_NEXT:
			case TK_RETURN:
			case TK_REPLY:
			case TK_FORWARD:
			case TK_SEND:
			case TK_CALL:
			case TK_DESTROY:
			case TK_BEGIN:
			case TK_TYPE:
			case TK_VAR:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
			case TK_STRING:
			case TK_IMPORT:
			case TK_CONST:
			case TK_CREATE:
			case TK_STOP:
			case TK_ID:
			case CADENA:
			case NUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				block();
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

	public static class GlobalContext extends ParserRuleContext {
		public TerminalNode TK_GLOBAL() { return getToken(MiLenguajeParser.TK_GLOBAL, 0); }
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
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
			setState(319);
			match(TK_GLOBAL);
			setState(320);
			match(TK_ID);
			setState(321);
			spec_stmt_ls(0);
			setState(322);
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

	public static class Comp_labelContext extends ParserRuleContext {
		public TerminalNode TK_GLOBAL() { return getToken(MiLenguajeParser.TK_GLOBAL, 0); }
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public TerminalNode TK_RESOURCE() { return getToken(MiLenguajeParser.TK_RESOURCE, 0); }
		public Comp_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterComp_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitComp_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitComp_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_labelContext comp_label() throws RecognitionException {
		Comp_labelContext _localctx = new Comp_labelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comp_label);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_GLOBAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(TK_GLOBAL);
				setState(325);
				match(TK_ID);
				}
				break;
			case TK_RESOURCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(TK_RESOURCE);
				setState(327);
				match(TK_ID);
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

	public static class Resource_specificationContext extends ParserRuleContext {
		public TerminalNode TK_RESOURCE() { return getToken(MiLenguajeParser.TK_RESOURCE, 0); }
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Spec_stmt_lsContext spec_stmt_ls() {
			return getRuleContext(Spec_stmt_lsContext.class,0);
		}
		public Spec_bodyContext spec_body() {
			return getRuleContext(Spec_bodyContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
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
		enterRule(_localctx, 8, RULE_resource_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(TK_RESOURCE);
			setState(331);
			match(TK_ID);
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(332);
				parameters();
				}
				break;
			}
			setState(335);
			spec_stmt_ls(0);
			setState(336);
			spec_body();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_END) {
				{
				setState(337);
				end_id();
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

	public static class Resource_bodyContext extends ParserRuleContext {
		public Spec_bodyContext spec_body() {
			return getRuleContext(Spec_bodyContext.class,0);
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
		enterRule(_localctx, 10, RULE_resource_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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

	public static class ProcContext extends ParserRuleContext {
		public TerminalNode TK_PROC() { return getToken(MiLenguajeParser.TK_PROC, 0); }
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Param_namesContext param_names() {
			return getRuleContext(Param_namesContext.class,0);
		}
		public Spec_stmt_lsContext spec_stmt_ls() {
			return getRuleContext(Spec_stmt_lsContext.class,0);
		}
		public Spec_bodyContext spec_body() {
			return getRuleContext(Spec_bodyContext.class,0);
		}
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
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
		enterRule(_localctx, 12, RULE_proc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(TK_PROC);
			setState(343);
			match(TK_ID);
			setState(344);
			param_names();
			setState(345);
			spec_stmt_ls(0);
			setState(346);
			spec_body();
			setState(347);
			end_id();
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

	public static class ProcessContext extends ParserRuleContext {
		public TerminalNode TK_PROCESS() { return getToken(MiLenguajeParser.TK_PROCESS, 0); }
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Return_spec_nullContext return_spec_null() {
			return getRuleContext(Return_spec_nullContext.class,0);
		}
		public Quantifiers_optContext quantifiers_opt() {
			return getRuleContext(Quantifiers_optContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_process);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(TK_PROCESS);
			setState(350);
			match(TK_ID);
			setState(351);
			return_spec_null();
			setState(352);
			quantifiers_opt();
			setState(353);
			block();
			setState(354);
			end_id();
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode TK_PROCEDURE() { return getToken(MiLenguajeParser.TK_PROCEDURE, 0); }
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public PrototypeContext prototype() {
			return getRuleContext(PrototypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(TK_PROCEDURE);
			setState(357);
			match(TK_ID);
			setState(358);
			prototype();
			setState(359);
			block();
			setState(360);
			end_id();
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

	public static class Quantifiers_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public Quantifier_lpContext quantifier_lp() {
			return getRuleContext(Quantifier_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public Quantifiers_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiers_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterQuantifiers_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitQuantifiers_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitQuantifiers_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifiers_optContext quantifiers_opt() throws RecognitionException {
		Quantifiers_optContext _localctx = new Quantifiers_optContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_quantifiers_opt);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(TK_LPAREN);
				setState(364);
				quantifier_lp(0);
				setState(365);
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

	public static class Quantifier_lpContext extends ParserRuleContext {
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public Quantifier_lpContext quantifier_lp() {
			return getRuleContext(Quantifier_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(MiLenguajeParser.TK_COMMA, 0); }
		public Quantifier_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterQuantifier_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitQuantifier_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitQuantifier_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier_lpContext quantifier_lp() throws RecognitionException {
		return quantifier_lp(0);
	}

	private Quantifier_lpContext quantifier_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Quantifier_lpContext _localctx = new Quantifier_lpContext(_ctx, _parentState);
		Quantifier_lpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_quantifier_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(370);
			quantifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Quantifier_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_quantifier_lp);
					setState(372);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(373);
					match(TK_COMMA);
					setState(374);
					quantifier();
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public Step_optContext step_opt() {
			return getRuleContext(Step_optContext.class,0);
		}
		public Such_that_optContext such_that_opt() {
			return getRuleContext(Such_that_optContext.class,0);
		}
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_quantifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(TK_ID);
			setState(381);
			match(TK_ASSIGN);
			setState(382);
			expr(0);
			setState(383);
			direction();
			setState(384);
			expr(0);
			setState(385);
			step_opt();
			setState(386);
			such_that_opt();
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

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode TK_TO() { return getToken(MiLenguajeParser.TK_TO, 0); }
		public TerminalNode TK_DOWNTO() { return getToken(MiLenguajeParser.TK_DOWNTO, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !(_la==TK_TO || _la==TK_DOWNTO) ) {
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

	public static class Step_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_BY() { return getToken(MiLenguajeParser.TK_BY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Step_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterStep_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitStep_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitStep_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Step_optContext step_opt() throws RecognitionException {
		Step_optContext _localctx = new Step_optContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_step_opt);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(TK_BY);
				setState(392);
				expr(0);
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

	public static class Such_that_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_SUCHTHAT() { return getToken(MiLenguajeParser.TK_SUCHTHAT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Such_that_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_such_that_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSuch_that_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSuch_that_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSuch_that_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Such_that_optContext such_that_opt() throws RecognitionException {
		Such_that_optContext _localctx = new Such_that_optContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_such_that_opt);
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(TK_SUCHTHAT);
				setState(397);
				expr(0);
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

	public static class Return_spec_nullContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public Return_spec_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_spec_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterReturn_spec_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitReturn_spec_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitReturn_spec_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_spec_nullContext return_spec_null() throws RecognitionException {
		Return_spec_nullContext _localctx = new Return_spec_nullContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_return_spec_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			vacio();
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

	public static class Param_namesContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public Id_lsContext id_ls() {
			return getRuleContext(Id_lsContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public Return_name_optContext return_name_opt() {
			return getRuleContext(Return_name_optContext.class,0);
		}
		public Param_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParam_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParam_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParam_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_namesContext param_names() throws RecognitionException {
		Param_namesContext _localctx = new Param_namesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_param_names);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(TK_LPAREN);
			setState(403);
			id_ls();
			setState(404);
			match(TK_RPAREN);
			setState(405);
			return_name_opt();
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

	public static class Return_name_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_RETURNS() { return getToken(MiLenguajeParser.TK_RETURNS, 0); }
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Return_name_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_name_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterReturn_name_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitReturn_name_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitReturn_name_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_name_optContext return_name_opt() throws RecognitionException {
		Return_name_optContext _localctx = new Return_name_optContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_return_name_opt);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_EXTERNAL:
			case TK_INCR:
			case TK_DECR:
			case TK_LPAREN:
			case TK_ARROW:
			case TK_PLUS:
			case TK_MINUS:
			case TK_AND:
			case TK_NOT:
			case TK_ADDR:
			case TK_QMARK:
			case TK_OPTYPE:
			case TK_RECEIVE:
			case TK_P:
			case TK_CO:
			case TK_V:
			case TK_IN:
			case TK_FA:
			case TK_PROCESS:
			case TK_PROCEDURE:
			case TK_BY:
			case TK_SUCHTHAT:
			case TK_LOW:
			case TK_HIGH:
			case TK_NEW:
			case TK_SEM:
			case TK_OP:
			case TK_ILIT:
			case TK_RLIT:
			case TK_CLIT:
			case TK_SLIT:
			case TK_NLIT:
			case TK_BLIT:
			case TK_FLIT:
			case TK_IF:
			case TK_DO:
			case TK_SKIP:
			case TK_EXIT:
			case TK_NEXT:
			case TK_RETURN:
			case TK_REPLY:
			case TK_FORWARD:
			case TK_SEND:
			case TK_CALL:
			case TK_DESTROY:
			case TK_BEGIN:
			case TK_PROC:
			case TK_TYPE:
			case TK_VAR:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
			case TK_STRING:
			case TK_EXTEND:
			case TK_IMPORT:
			case TK_CONST:
			case TK_CREATE:
			case TK_STOP:
			case TK_INITIAL:
			case TK_FINAL:
			case TK_ID:
			case CADENA:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				vacio();
				}
				break;
			case TK_RETURNS:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(TK_RETURNS);
				setState(409);
				match(TK_ID);
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

	public static class Spec_stmtContext extends ParserRuleContext {
		public Common_stmtContext common_stmt() {
			return getRuleContext(Common_stmtContext.class,0);
		}
		public Extend_clauseContext extend_clause() {
			return getRuleContext(Extend_clauseContext.class,0);
		}
		public Body_stmtContext body_stmt() {
			return getRuleContext(Body_stmtContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
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
		enterRule(_localctx, 36, RULE_spec_stmt);
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				common_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				extend_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				body_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				decl();
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

	public static class Spec_bodyContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_BODY() { return getToken(MiLenguajeParser.TK_BODY, 0); }
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Maybe_paramsContext maybe_params() {
			return getRuleContext(Maybe_paramsContext.class,0);
		}
		public Spec_body_compContext spec_body_comp() {
			return getRuleContext(Spec_body_compContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_spec_body);
		try {
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case TK_END:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				vacio();
				}
				break;
			case TK_BODY:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(TK_BODY);
				setState(420);
				match(TK_ID);
				setState(421);
				maybe_params();
				setState(422);
				spec_body_comp();
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

	public static class Spec_body_compContext extends ParserRuleContext {
		public Body_stmt_lsContext body_stmt_ls() {
			return getRuleContext(Body_stmt_lsContext.class,0);
		}
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public TerminalNode TK_SEPARATE() { return getToken(MiLenguajeParser.TK_SEPARATE, 0); }
		public Spec_body_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_body_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSpec_body_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSpec_body_comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSpec_body_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_body_compContext spec_body_comp() throws RecognitionException {
		Spec_body_compContext _localctx = new Spec_body_compContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_spec_body_comp);
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_EXTERNAL:
			case TK_INCR:
			case TK_DECR:
			case TK_LPAREN:
			case TK_PLUS:
			case TK_MINUS:
			case TK_NOT:
			case TK_ADDR:
			case TK_QMARK:
			case TK_OPTYPE:
			case TK_RECEIVE:
			case TK_P:
			case TK_CO:
			case TK_V:
			case TK_IN:
			case TK_FA:
			case TK_PROCESS:
			case TK_PROCEDURE:
			case TK_LOW:
			case TK_HIGH:
			case TK_NEW:
			case TK_SEM:
			case TK_OP:
			case TK_ILIT:
			case TK_RLIT:
			case TK_CLIT:
			case TK_SLIT:
			case TK_NLIT:
			case TK_BLIT:
			case TK_FLIT:
			case TK_IF:
			case TK_DO:
			case TK_SKIP:
			case TK_EXIT:
			case TK_NEXT:
			case TK_RETURN:
			case TK_REPLY:
			case TK_FORWARD:
			case TK_SEND:
			case TK_CALL:
			case TK_DESTROY:
			case TK_BEGIN:
			case TK_PROC:
			case TK_TYPE:
			case TK_VAR:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
			case TK_STRING:
			case TK_EXTEND:
			case TK_IMPORT:
			case TK_CONST:
			case TK_CREATE:
			case TK_STOP:
			case TK_INITIAL:
			case TK_FINAL:
			case TK_ID:
			case CADENA:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				body_stmt_ls(0);
				setState(427);
				end_id();
				}
				break;
			case TK_SEPARATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(TK_SEPARATE);
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

	public static class Maybe_paramsContext extends ParserRuleContext {
		public Comp_paramsContext comp_params() {
			return getRuleContext(Comp_paramsContext.class,0);
		}
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
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
		enterRule(_localctx, 42, RULE_maybe_params);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				comp_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
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

	public static class Spec_stmt_lsContext extends ParserRuleContext {
		public Spec_stmtContext spec_stmt() {
			return getRuleContext(Spec_stmtContext.class,0);
		}
		public Spec_stmt_lsContext spec_stmt_ls() {
			return getRuleContext(Spec_stmt_lsContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(MiLenguajeParser.TK_SEPARATOR, 0); }
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
		return spec_stmt_ls(0);
	}

	private Spec_stmt_lsContext spec_stmt_ls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Spec_stmt_lsContext _localctx = new Spec_stmt_lsContext(_ctx, _parentState);
		Spec_stmt_lsContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_spec_stmt_ls, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(437);
			spec_stmt();
			}
			_ctx.stop = _input.LT(-1);
			setState(448);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(446);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Spec_stmt_lsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_spec_stmt_ls);
						setState(439);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(441);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TK_SEPARATOR) {
							{
							setState(440);
							match(TK_SEPARATOR);
							}
						}

						setState(443);
						spec_stmt();
						}
						break;
					case 2:
						{
						_localctx = new Spec_stmt_lsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_spec_stmt_ls);
						setState(444);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(445);
						spec_stmt();
						}
						break;
					}
					} 
				}
				setState(450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Body_stmt_lsContext extends ParserRuleContext {
		public Body_stmtContext body_stmt() {
			return getRuleContext(Body_stmtContext.class,0);
		}
		public Body_stmt_lsContext body_stmt_ls() {
			return getRuleContext(Body_stmt_lsContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(MiLenguajeParser.TK_SEPARATOR, 0); }
		public Body_stmt_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_stmt_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBody_stmt_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBody_stmt_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBody_stmt_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_stmt_lsContext body_stmt_ls() throws RecognitionException {
		return body_stmt_ls(0);
	}

	private Body_stmt_lsContext body_stmt_ls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Body_stmt_lsContext _localctx = new Body_stmt_lsContext(_ctx, _parentState);
		Body_stmt_lsContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_body_stmt_ls, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(452);
			body_stmt();
			}
			_ctx.stop = _input.LT(-1);
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Body_stmt_lsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_body_stmt_ls);
					setState(454);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TK_SEPARATOR) {
						{
						setState(455);
						match(TK_SEPARATOR);
						}
					}

					setState(458);
					body_stmt();
					}
					} 
				}
				setState(463);
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

	public static class Body_stmtContext extends ParserRuleContext {
		public Common_stmtContext common_stmt() {
			return getRuleContext(Common_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Body_onlyContext body_only() {
			return getRuleContext(Body_onlyContext.class,0);
		}
		public Extend_clauseContext extend_clause() {
			return getRuleContext(Extend_clauseContext.class,0);
		}
		public Body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBody_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBody_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBody_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_stmtContext body_stmt() throws RecognitionException {
		Body_stmtContext _localctx = new Body_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_body_stmt);
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				common_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				body_only();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				extend_clause();
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

	public static class Separator_optionalContext extends ParserRuleContext {
		public TerminalNode TK_SEPARATOR() { return getToken(MiLenguajeParser.TK_SEPARATOR, 0); }
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public Separator_optionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator_optional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSeparator_optional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSeparator_optional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSeparator_optional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Separator_optionalContext separator_optional() throws RecognitionException {
		Separator_optionalContext _localctx = new Separator_optionalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_separator_optional);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SEPARATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(TK_SEPARATOR);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				vacio();
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

	public static class Body_onlyContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public Initial_blockContext initial_block() {
			return getRuleContext(Initial_blockContext.class,0);
		}
		public Final_blockContext final_block() {
			return getRuleContext(Final_blockContext.class,0);
		}
		public Body_onlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_only; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBody_only(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBody_only(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBody_only(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_onlyContext body_only() throws RecognitionException {
		Body_onlyContext _localctx = new Body_onlyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_body_only);
		try {
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RECEIVE:
			case TK_P:
			case TK_CO:
			case TK_V:
			case TK_IN:
			case TK_FA:
			case TK_IF:
			case TK_DO:
			case TK_SKIP:
			case TK_EXIT:
			case TK_NEXT:
			case TK_RETURN:
			case TK_REPLY:
			case TK_FORWARD:
			case TK_SEND:
			case TK_CALL:
			case TK_DESTROY:
			case TK_BEGIN:
			case TK_STOP:
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				stmt();
				}
				break;
			case TK_PROC:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				proc();
				}
				break;
			case TK_PROCESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				process();
				}
				break;
			case TK_PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(477);
				procedure();
				}
				break;
			case TK_INITIAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(478);
				initial_block();
				}
				break;
			case TK_FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(479);
				final_block();
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

	public static class Initial_blockContext extends ParserRuleContext {
		public TerminalNode TK_INITIAL() { return getToken(MiLenguajeParser.TK_INITIAL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TK_END() { return getToken(MiLenguajeParser.TK_END, 0); }
		public Initial_optContext initial_opt() {
			return getRuleContext(Initial_optContext.class,0);
		}
		public Initial_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterInitial_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitInitial_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitInitial_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_blockContext initial_block() throws RecognitionException {
		Initial_blockContext _localctx = new Initial_blockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_initial_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(TK_INITIAL);
			setState(483);
			block();
			setState(484);
			match(TK_END);
			setState(485);
			initial_opt();
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

	public static class Final_blockContext extends ParserRuleContext {
		public TerminalNode TK_FINAL() { return getToken(MiLenguajeParser.TK_FINAL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TK_END() { return getToken(MiLenguajeParser.TK_END, 0); }
		public Final_optContext final_opt() {
			return getRuleContext(Final_optContext.class,0);
		}
		public Final_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_final_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFinal_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFinal_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFinal_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Final_blockContext final_block() throws RecognitionException {
		Final_blockContext _localctx = new Final_blockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_final_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(TK_FINAL);
			setState(488);
			block();
			setState(489);
			match(TK_END);
			setState(490);
			final_opt();
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

	public static class Final_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_FINAL() { return getToken(MiLenguajeParser.TK_FINAL, 0); }
		public Final_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_final_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFinal_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFinal_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFinal_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Final_optContext final_opt() throws RecognitionException {
		Final_optContext _localctx = new Final_optContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_final_opt);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				match(TK_FINAL);
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

	public static class Initial_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_INITIAL() { return getToken(MiLenguajeParser.TK_INITIAL, 0); }
		public Initial_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterInitial_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitInitial_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitInitial_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_optContext initial_opt() throws RecognitionException {
		Initial_optContext _localctx = new Initial_optContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_initial_opt);
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(TK_INITIAL);
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

	public static class StmtContext extends ParserRuleContext {
		public Skip_stmtContext skip_stmt() {
			return getRuleContext(Skip_stmtContext.class,0);
		}
		public Stop_stmtContext stop_stmt() {
			return getRuleContext(Stop_stmtContext.class,0);
		}
		public Exit_stmtContext exit_stmt() {
			return getRuleContext(Exit_stmtContext.class,0);
		}
		public Next_stmtContext next_stmt() {
			return getRuleContext(Next_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Reply_stmtContext reply_stmt() {
			return getRuleContext(Reply_stmtContext.class,0);
		}
		public Function_stmtContext function_stmt() {
			return getRuleContext(Function_stmtContext.class,0);
		}
		public Forward_stmtContext forward_stmt() {
			return getRuleContext(Forward_stmtContext.class,0);
		}
		public Send_stmtContext send_stmt() {
			return getRuleContext(Send_stmtContext.class,0);
		}
		public Explicit_callContext explicit_call() {
			return getRuleContext(Explicit_callContext.class,0);
		}
		public Destroy_stmtContext destroy_stmt() {
			return getRuleContext(Destroy_stmtContext.class,0);
		}
		public Begin_endContext begin_end() {
			return getRuleContext(Begin_endContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Do_stmtContext do_stmt() {
			return getRuleContext(Do_stmtContext.class,0);
		}
		public For_all_stmtContext for_all_stmt() {
			return getRuleContext(For_all_stmtContext.class,0);
		}
		public V_stmtContext v_stmt() {
			return getRuleContext(V_stmtContext.class,0);
		}
		public Input_stmtContext input_stmt() {
			return getRuleContext(Input_stmtContext.class,0);
		}
		public Receive_stmtContext receive_stmt() {
			return getRuleContext(Receive_stmtContext.class,0);
		}
		public P_stmtContext p_stmt() {
			return getRuleContext(P_stmtContext.class,0);
		}
		public Concurrent_stmtContext concurrent_stmt() {
			return getRuleContext(Concurrent_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stmt);
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SKIP:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				skip_stmt();
				}
				break;
			case TK_STOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				stop_stmt();
				}
				break;
			case TK_EXIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(502);
				exit_stmt();
				}
				break;
			case TK_NEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(503);
				next_stmt();
				}
				break;
			case TK_RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(504);
				return_stmt();
				}
				break;
			case TK_REPLY:
				enterOuterAlt(_localctx, 6);
				{
				setState(505);
				reply_stmt();
				}
				break;
			case TK_ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(506);
				function_stmt();
				}
				break;
			case TK_FORWARD:
				enterOuterAlt(_localctx, 8);
				{
				setState(507);
				forward_stmt();
				}
				break;
			case TK_SEND:
				enterOuterAlt(_localctx, 9);
				{
				setState(508);
				send_stmt();
				}
				break;
			case TK_CALL:
				enterOuterAlt(_localctx, 10);
				{
				setState(509);
				explicit_call();
				}
				break;
			case TK_DESTROY:
				enterOuterAlt(_localctx, 11);
				{
				setState(510);
				destroy_stmt();
				}
				break;
			case TK_BEGIN:
				enterOuterAlt(_localctx, 12);
				{
				setState(511);
				begin_end();
				}
				break;
			case TK_IF:
				enterOuterAlt(_localctx, 13);
				{
				setState(512);
				if_stmt();
				}
				break;
			case TK_DO:
				enterOuterAlt(_localctx, 14);
				{
				setState(513);
				do_stmt();
				}
				break;
			case TK_FA:
				enterOuterAlt(_localctx, 15);
				{
				setState(514);
				for_all_stmt();
				}
				break;
			case TK_V:
				enterOuterAlt(_localctx, 16);
				{
				setState(515);
				v_stmt();
				}
				break;
			case TK_IN:
				enterOuterAlt(_localctx, 17);
				{
				setState(516);
				input_stmt();
				}
				break;
			case TK_RECEIVE:
				enterOuterAlt(_localctx, 18);
				{
				setState(517);
				receive_stmt();
				}
				break;
			case TK_P:
				enterOuterAlt(_localctx, 19);
				{
				setState(518);
				p_stmt();
				}
				break;
			case TK_CO:
				enterOuterAlt(_localctx, 20);
				{
				setState(519);
				concurrent_stmt();
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

	public static class Function_stmtContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public Bound_lpContext bound_lp() {
			return getRuleContext(Bound_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public Function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFunction_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFunction_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFunction_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_stmtContext function_stmt() throws RecognitionException {
		Function_stmtContext _localctx = new Function_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(TK_ID);
			setState(523);
			match(TK_LPAREN);
			setState(524);
			bound_lp(0);
			setState(525);
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

	public static class Stop_stmtContext extends ParserRuleContext {
		public TerminalNode TK_STOP() { return getToken(MiLenguajeParser.TK_STOP, 0); }
		public Exit_code_optContext exit_code_opt() {
			return getRuleContext(Exit_code_optContext.class,0);
		}
		public Stop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterStop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitStop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitStop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stop_stmtContext stop_stmt() throws RecognitionException {
		Stop_stmtContext _localctx = new Stop_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stop_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(TK_STOP);
			setState(528);
			exit_code_opt();
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

	public static class Forward_stmtContext extends ParserRuleContext {
		public TerminalNode TK_FORWARD() { return getToken(MiLenguajeParser.TK_FORWARD, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public Forward_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forward_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterForward_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitForward_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitForward_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Forward_stmtContext forward_stmt() throws RecognitionException {
		Forward_stmtContext _localctx = new Forward_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forward_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(TK_FORWARD);
			setState(531);
			invocation();
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

	public static class Send_stmtContext extends ParserRuleContext {
		public TerminalNode TK_SEND() { return getToken(MiLenguajeParser.TK_SEND, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public Send_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_send_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSend_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSend_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSend_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Send_stmtContext send_stmt() throws RecognitionException {
		Send_stmtContext _localctx = new Send_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_send_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(TK_SEND);
			setState(534);
			invocation();
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

	public static class Explicit_callContext extends ParserRuleContext {
		public TerminalNode TK_CALL() { return getToken(MiLenguajeParser.TK_CALL, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public Explicit_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExplicit_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExplicit_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExplicit_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_callContext explicit_call() throws RecognitionException {
		Explicit_callContext _localctx = new Explicit_callContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_explicit_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(TK_CALL);
			setState(537);
			invocation();
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

	public static class V_stmtContext extends ParserRuleContext {
		public TerminalNode TK_V() { return getToken(MiLenguajeParser.TK_V, 0); }
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public V_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterV_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitV_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitV_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final V_stmtContext v_stmt() throws RecognitionException {
		V_stmtContext _localctx = new V_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_v_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(TK_V);
			setState(540);
			match(TK_LPAREN);
			setState(541);
			expr(0);
			setState(542);
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

	public static class Input_stmtContext extends ParserRuleContext {
		public TerminalNode TK_IN() { return getToken(MiLenguajeParser.TK_IN, 0); }
		public In_cmd_lpContext in_cmd_lp() {
			return getRuleContext(In_cmd_lpContext.class,0);
		}
		public Else_cmd_optContext else_cmd_opt() {
			return getRuleContext(Else_cmd_optContext.class,0);
		}
		public TerminalNode TK_NI() { return getToken(MiLenguajeParser.TK_NI, 0); }
		public Input_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterInput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitInput_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitInput_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_stmtContext input_stmt() throws RecognitionException {
		Input_stmtContext _localctx = new Input_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_input_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(TK_IN);
			setState(545);
			in_cmd_lp(0);
			setState(546);
			else_cmd_opt();
			setState(547);
			match(TK_NI);
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

	public static class In_cmd_lpContext extends ParserRuleContext {
		public In_cmdContext in_cmd() {
			return getRuleContext(In_cmdContext.class,0);
		}
		public In_cmd_lpContext in_cmd_lp() {
			return getRuleContext(In_cmd_lpContext.class,0);
		}
		public TerminalNode TK_SQUARE() { return getToken(MiLenguajeParser.TK_SQUARE, 0); }
		public In_cmd_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_cmd_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIn_cmd_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIn_cmd_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitIn_cmd_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_cmd_lpContext in_cmd_lp() throws RecognitionException {
		return in_cmd_lp(0);
	}

	private In_cmd_lpContext in_cmd_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		In_cmd_lpContext _localctx = new In_cmd_lpContext(_ctx, _parentState);
		In_cmd_lpContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_in_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(550);
			in_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new In_cmd_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_in_cmd_lp);
					setState(552);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(553);
					match(TK_SQUARE);
					setState(554);
					in_cmd();
					}
					} 
				}
				setState(559);
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

	public static class In_cmdContext extends ParserRuleContext {
		public Quantifiers_optContext quantifiers_opt() {
			return getRuleContext(Quantifiers_optContext.class,0);
		}
		public In_specContext in_spec() {
			return getRuleContext(In_specContext.class,0);
		}
		public Sync_expr_optContext sync_expr_opt() {
			return getRuleContext(Sync_expr_optContext.class,0);
		}
		public Sched_expr_optContext sched_expr_opt() {
			return getRuleContext(Sched_expr_optContext.class,0);
		}
		public TerminalNode TK_ARROW() { return getToken(MiLenguajeParser.TK_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public In_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIn_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIn_cmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitIn_cmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_cmdContext in_cmd() throws RecognitionException {
		In_cmdContext _localctx = new In_cmdContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_in_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			quantifiers_opt();
			setState(561);
			in_spec();
			setState(562);
			sync_expr_opt();
			setState(563);
			sched_expr_opt();
			setState(564);
			match(TK_ARROW);
			setState(565);
			block();
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

	public static class In_specContext extends ParserRuleContext {
		public In_opContext in_op() {
			return getRuleContext(In_opContext.class,0);
		}
		public Param_namesContext param_names() {
			return getRuleContext(Param_namesContext.class,0);
		}
		public In_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIn_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIn_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitIn_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_specContext in_spec() throws RecognitionException {
		In_specContext _localctx = new In_specContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_in_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			in_op();
			setState(568);
			param_names();
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

	public static class In_opContext extends ParserRuleContext {
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public In_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIn_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIn_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitIn_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_opContext in_op() throws RecognitionException {
		In_opContext _localctx = new In_opContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_in_op);
		try {
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				qualified_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				qualified_id();
				setState(572);
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

	public static class Sched_expr_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_BY() { return getToken(MiLenguajeParser.TK_BY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Sched_expr_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sched_expr_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSched_expr_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSched_expr_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSched_expr_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sched_expr_optContext sched_expr_opt() throws RecognitionException {
		Sched_expr_optContext _localctx = new Sched_expr_optContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_sched_expr_opt);
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ARROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				vacio();
				}
				break;
			case TK_BY:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				match(TK_BY);
				setState(578);
				expr(0);
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

	public static class Sync_expr_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_AND() { return getToken(MiLenguajeParser.TK_AND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_SUCHTHAT() { return getToken(MiLenguajeParser.TK_SUCHTHAT, 0); }
		public Sync_expr_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sync_expr_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSync_expr_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSync_expr_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSync_expr_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sync_expr_optContext sync_expr_opt() throws RecognitionException {
		Sync_expr_optContext _localctx = new Sync_expr_optContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sync_expr_opt);
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ARROW:
			case TK_BY:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				vacio();
				}
				break;
			case TK_AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				match(TK_AND);
				setState(583);
				expr(0);
				}
				break;
			case TK_SUCHTHAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				match(TK_SUCHTHAT);
				setState(585);
				expr(0);
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

	public static class Receive_stmtContext extends ParserRuleContext {
		public TerminalNode TK_RECEIVE() { return getToken(MiLenguajeParser.TK_RECEIVE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Paren_listContext paren_list() {
			return getRuleContext(Paren_listContext.class,0);
		}
		public Receive_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receive_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterReceive_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitReceive_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitReceive_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Receive_stmtContext receive_stmt() throws RecognitionException {
		Receive_stmtContext _localctx = new Receive_stmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_receive_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(TK_RECEIVE);
			setState(589);
			expr(0);
			setState(590);
			paren_list();
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

	public static class P_stmtContext extends ParserRuleContext {
		public TerminalNode TK_P() { return getToken(MiLenguajeParser.TK_P, 0); }
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public P_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterP_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitP_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitP_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_stmtContext p_stmt() throws RecognitionException {
		P_stmtContext _localctx = new P_stmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_p_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(TK_P);
			setState(593);
			match(TK_LPAREN);
			setState(594);
			expr(0);
			setState(595);
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

	public static class Concurrent_stmtContext extends ParserRuleContext {
		public TerminalNode TK_CO() { return getToken(MiLenguajeParser.TK_CO, 0); }
		public Concurrent_cmd_lpContext concurrent_cmd_lp() {
			return getRuleContext(Concurrent_cmd_lpContext.class,0);
		}
		public TerminalNode TK_OC() { return getToken(MiLenguajeParser.TK_OC, 0); }
		public Concurrent_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterConcurrent_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitConcurrent_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitConcurrent_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_stmtContext concurrent_stmt() throws RecognitionException {
		Concurrent_stmtContext _localctx = new Concurrent_stmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_concurrent_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(TK_CO);
			setState(598);
			concurrent_cmd_lp(0);
			setState(599);
			match(TK_OC);
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

	public static class Concurrent_cmd_lpContext extends ParserRuleContext {
		public Concurrent_cmdContext concurrent_cmd() {
			return getRuleContext(Concurrent_cmdContext.class,0);
		}
		public Concurrent_cmd_lpContext concurrent_cmd_lp() {
			return getRuleContext(Concurrent_cmd_lpContext.class,0);
		}
		public TerminalNode TK_PARALLEL() { return getToken(MiLenguajeParser.TK_PARALLEL, 0); }
		public Concurrent_cmd_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_cmd_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterConcurrent_cmd_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitConcurrent_cmd_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitConcurrent_cmd_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_cmd_lpContext concurrent_cmd_lp() throws RecognitionException {
		return concurrent_cmd_lp(0);
	}

	private Concurrent_cmd_lpContext concurrent_cmd_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Concurrent_cmd_lpContext _localctx = new Concurrent_cmd_lpContext(_ctx, _parentState);
		Concurrent_cmd_lpContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_concurrent_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(602);
			concurrent_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Concurrent_cmd_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_concurrent_cmd_lp);
					setState(604);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(605);
					match(TK_PARALLEL);
					setState(606);
					concurrent_cmd();
					}
					} 
				}
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class Concurrent_cmdContext extends ParserRuleContext {
		public Quantifiers_optContext quantifiers_opt() {
			return getRuleContext(Quantifiers_optContext.class,0);
		}
		public Separator_optContext separator_opt() {
			return getRuleContext(Separator_optContext.class,0);
		}
		public Concurrent_invocationContext concurrent_invocation() {
			return getRuleContext(Concurrent_invocationContext.class,0);
		}
		public Post_processing_optContext post_processing_opt() {
			return getRuleContext(Post_processing_optContext.class,0);
		}
		public Concurrent_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterConcurrent_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitConcurrent_cmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitConcurrent_cmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_cmdContext concurrent_cmd() throws RecognitionException {
		Concurrent_cmdContext _localctx = new Concurrent_cmdContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_concurrent_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			quantifiers_opt();
			setState(613);
			separator_opt(0);
			setState(614);
			concurrent_invocation();
			setState(615);
			post_processing_opt();
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

	public static class Separator_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public Separator_optContext separator_opt() {
			return getRuleContext(Separator_optContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(MiLenguajeParser.TK_SEPARATOR, 0); }
		public Separator_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSeparator_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSeparator_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSeparator_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Separator_optContext separator_opt() throws RecognitionException {
		return separator_opt(0);
	}

	private Separator_optContext separator_opt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Separator_optContext _localctx = new Separator_optContext(_ctx, _parentState);
		Separator_optContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_separator_opt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(618);
			vacio();
			}
			_ctx.stop = _input.LT(-1);
			setState(624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Separator_optContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_separator_opt);
					setState(620);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(621);
					match(TK_SEPARATOR);
					}
					} 
				}
				setState(626);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Concurrent_invocationContext extends ParserRuleContext {
		public Explicit_callContext explicit_call() {
			return getRuleContext(Explicit_callContext.class,0);
		}
		public Send_stmtContext send_stmt() {
			return getRuleContext(Send_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Concurrent_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concurrent_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterConcurrent_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitConcurrent_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitConcurrent_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Concurrent_invocationContext concurrent_invocation() throws RecognitionException {
		Concurrent_invocationContext _localctx = new Concurrent_invocationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_concurrent_invocation);
		try {
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				explicit_call();
				}
				break;
			case TK_SEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				send_stmt();
				}
				break;
			case TK_INCR:
			case TK_DECR:
			case TK_LPAREN:
			case TK_PLUS:
			case TK_MINUS:
			case TK_NOT:
			case TK_ADDR:
			case TK_QMARK:
			case TK_LOW:
			case TK_HIGH:
			case TK_NEW:
			case TK_ILIT:
			case TK_RLIT:
			case TK_CLIT:
			case TK_SLIT:
			case TK_NLIT:
			case TK_BLIT:
			case TK_FLIT:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
			case TK_STRING:
			case TK_CREATE:
			case TK_ID:
			case CADENA:
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				expr(0);
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

	public static class Post_processing_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_ARROW() { return getToken(MiLenguajeParser.TK_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Post_processing_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_processing_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterPost_processing_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitPost_processing_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitPost_processing_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Post_processing_optContext post_processing_opt() throws RecognitionException {
		Post_processing_optContext _localctx = new Post_processing_optContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_post_processing_opt);
		try {
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(TK_ARROW);
				setState(634);
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

	public static class InvocationContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Paren_listContext paren_list() {
			return getRuleContext(Paren_listContext.class,0);
		}
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			expr(0);
			setState(638);
			paren_list();
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

	public static class Exit_code_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public Exit_code_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_code_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExit_code_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExit_code_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExit_code_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_code_optContext exit_code_opt() throws RecognitionException {
		Exit_code_optContext _localctx = new Exit_code_optContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_exit_code_opt);
		try {
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				match(TK_LPAREN);
				setState(642);
				expr(0);
				setState(643);
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

	public static class Destroy_stmtContext extends ParserRuleContext {
		public TerminalNode TK_DESTROY() { return getToken(MiLenguajeParser.TK_DESTROY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Destroy_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destroy_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDestroy_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDestroy_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDestroy_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Destroy_stmtContext destroy_stmt() throws RecognitionException {
		Destroy_stmtContext _localctx = new Destroy_stmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_destroy_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(TK_DESTROY);
			setState(648);
			expr(0);
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

	public static class Begin_endContext extends ParserRuleContext {
		public TerminalNode TK_BEGIN() { return getToken(MiLenguajeParser.TK_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TK_END() { return getToken(MiLenguajeParser.TK_END, 0); }
		public Begin_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBegin_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBegin_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBegin_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_endContext begin_end() throws RecognitionException {
		Begin_endContext _localctx = new Begin_endContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_begin_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(TK_BEGIN);
			setState(651);
			block();
			setState(652);
			match(TK_END);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode TK_IF() { return getToken(MiLenguajeParser.TK_IF, 0); }
		public Guarded_cmd_lpContext guarded_cmd_lp() {
			return getRuleContext(Guarded_cmd_lpContext.class,0);
		}
		public Else_cmd_optContext else_cmd_opt() {
			return getRuleContext(Else_cmd_optContext.class,0);
		}
		public TerminalNode TK_FI() { return getToken(MiLenguajeParser.TK_FI, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(TK_IF);
			setState(655);
			guarded_cmd_lp(0);
			setState(656);
			else_cmd_opt();
			setState(657);
			match(TK_FI);
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

	public static class Do_stmtContext extends ParserRuleContext {
		public TerminalNode TK_DO() { return getToken(MiLenguajeParser.TK_DO, 0); }
		public Guarded_cmd_lpContext guarded_cmd_lp() {
			return getRuleContext(Guarded_cmd_lpContext.class,0);
		}
		public Else_cmd_optContext else_cmd_opt() {
			return getRuleContext(Else_cmd_optContext.class,0);
		}
		public TerminalNode TK_OD() { return getToken(MiLenguajeParser.TK_OD, 0); }
		public Do_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDo_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDo_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDo_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_stmtContext do_stmt() throws RecognitionException {
		Do_stmtContext _localctx = new Do_stmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_do_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(TK_DO);
			setState(660);
			guarded_cmd_lp(0);
			setState(661);
			else_cmd_opt();
			setState(662);
			match(TK_OD);
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

	public static class For_all_stmtContext extends ParserRuleContext {
		public TerminalNode TK_FA() { return getToken(MiLenguajeParser.TK_FA, 0); }
		public Quantifier_lpContext quantifier_lp() {
			return getRuleContext(Quantifier_lpContext.class,0);
		}
		public TerminalNode TK_ARROW() { return getToken(MiLenguajeParser.TK_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TK_AF() { return getToken(MiLenguajeParser.TK_AF, 0); }
		public For_all_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_all_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFor_all_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFor_all_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFor_all_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_all_stmtContext for_all_stmt() throws RecognitionException {
		For_all_stmtContext _localctx = new For_all_stmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_for_all_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(TK_FA);
			setState(665);
			quantifier_lp(0);
			setState(666);
			match(TK_ARROW);
			setState(667);
			block();
			setState(668);
			match(TK_AF);
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

	public static class Guarded_cmd_lpContext extends ParserRuleContext {
		public Guarded_cmdContext guarded_cmd() {
			return getRuleContext(Guarded_cmdContext.class,0);
		}
		public Guarded_cmd_lpContext guarded_cmd_lp() {
			return getRuleContext(Guarded_cmd_lpContext.class,0);
		}
		public TerminalNode TK_SQUARE() { return getToken(MiLenguajeParser.TK_SQUARE, 0); }
		public Guarded_cmd_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarded_cmd_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterGuarded_cmd_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitGuarded_cmd_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitGuarded_cmd_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guarded_cmd_lpContext guarded_cmd_lp() throws RecognitionException {
		return guarded_cmd_lp(0);
	}

	private Guarded_cmd_lpContext guarded_cmd_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Guarded_cmd_lpContext _localctx = new Guarded_cmd_lpContext(_ctx, _parentState);
		Guarded_cmd_lpContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_guarded_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(671);
			guarded_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Guarded_cmd_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_guarded_cmd_lp);
					setState(673);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(674);
					match(TK_SQUARE);
					setState(675);
					guarded_cmd();
					}
					} 
				}
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class Guarded_cmdContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_OR_() { return getToken(MiLenguajeParser.TK_OR_, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TK_ARROW() { return getToken(MiLenguajeParser.TK_ARROW, 0); }
		public Guarded_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarded_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterGuarded_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitGuarded_cmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitGuarded_cmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guarded_cmdContext guarded_cmd() throws RecognitionException {
		Guarded_cmdContext _localctx = new Guarded_cmdContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_guarded_cmd);
		try {
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				expr(0);
				setState(682);
				match(TK_OR_);
				setState(683);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				expr(0);
				setState(686);
				match(TK_ARROW);
				setState(687);
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

	public static class Else_cmd_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_SQUARE() { return getToken(MiLenguajeParser.TK_SQUARE, 0); }
		public TerminalNode TK_ELSE() { return getToken(MiLenguajeParser.TK_ELSE, 0); }
		public TerminalNode TK_ARROW() { return getToken(MiLenguajeParser.TK_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_cmd_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_cmd_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterElse_cmd_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitElse_cmd_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitElse_cmd_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_cmd_optContext else_cmd_opt() throws RecognitionException {
		Else_cmd_optContext _localctx = new Else_cmd_optContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_else_cmd_opt);
		try {
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NI:
			case TK_FI:
			case TK_OD:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				vacio();
				}
				break;
			case TK_SQUARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				match(TK_SQUARE);
				setState(693);
				match(TK_ELSE);
				setState(694);
				match(TK_ARROW);
				setState(695);
				block();
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

	public static class Paren_listContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public Paren_item_lsContext paren_item_ls() {
			return getRuleContext(Paren_item_lsContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public Paren_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParen_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParen_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParen_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paren_listContext paren_list() throws RecognitionException {
		Paren_listContext _localctx = new Paren_listContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_paren_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(TK_LPAREN);
			setState(699);
			paren_item_ls();
			setState(700);
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

	public static class Paren_item_lsContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public Expr_lpContext expr_lp() {
			return getRuleContext(Expr_lpContext.class,0);
		}
		public Paren_item_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren_item_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParen_item_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParen_item_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParen_item_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paren_item_lsContext paren_item_ls() throws RecognitionException {
		Paren_item_lsContext _localctx = new Paren_item_lsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_paren_item_ls);
		try {
			setState(704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				vacio();
				}
				break;
			case TK_INCR:
			case TK_DECR:
			case TK_LPAREN:
			case TK_PLUS:
			case TK_MINUS:
			case TK_NOT:
			case TK_ADDR:
			case TK_QMARK:
			case TK_LOW:
			case TK_HIGH:
			case TK_NEW:
			case TK_ILIT:
			case TK_RLIT:
			case TK_CLIT:
			case TK_SLIT:
			case TK_NLIT:
			case TK_BLIT:
			case TK_FLIT:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
			case TK_STRING:
			case TK_CREATE:
			case TK_ID:
			case CADENA:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				expr_lp(0);
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

	public static class Expr_lpContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_lpContext expr_lp() {
			return getRuleContext(Expr_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(MiLenguajeParser.TK_COMMA, 0); }
		public Expr_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_lpContext expr_lp() throws RecognitionException {
		return expr_lp(0);
	}

	private Expr_lpContext expr_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_lpContext _localctx = new Expr_lpContext(_ctx, _parentState);
		Expr_lpContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_expr_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(707);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_lp);
					setState(709);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(710);
					match(TK_COMMA);
					setState(711);
					expr(0);
					}
					} 
				}
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 132, RULE_comp_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
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
		enterRule(_localctx, 134, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(TK_LPAREN);
			setState(720);
			param_spec_ls();
			setState(721);
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
		enterRule(_localctx, 136, RULE_param_spec_ls);
		try {
			setState(725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				vacio();
				}
				break;
			case TK_LBRACKET:
			case TK_RECEIVE:
			case TK_P:
			case TK_CO:
			case TK_V:
			case TK_IN:
			case TK_FA:
			case TK_IF:
			case TK_DO:
			case TK_SKIP:
			case TK_EXIT:
			case TK_NEXT:
			case TK_RETURN:
			case TK_REPLY:
			case TK_FORWARD:
			case TK_SEND:
			case TK_CALL:
			case TK_DESTROY:
			case TK_BEGIN:
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
			case TK_STOP:
			case TK_PTR:
			case TK_REC:
			case TK_UNION:
			case TK_CAP:
			case TK_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
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
		public Param_spec_lpContext param_spec_lp() {
			return getRuleContext(Param_spec_lpContext.class,0);
		}
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
		enterRule(_localctx, 138, RULE_param_spec_lp);
		try {
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				param_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				param_spec();
				setState(729);
				match(TK_SEPARATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(731);
				param_spec();
				setState(732);
				match(TK_SEPARATOR);
				setState(733);
				param_spec_lp();
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
		enterRule(_localctx, 140, RULE_param_spec);
		try {
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				param_kind_opt();
				setState(738);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				param_kind_opt();
				setState(741);
				id_subs_lp(0);
				setState(742);
				match(TK_COLON);
				setState(743);
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
		enterRule(_localctx, 142, RULE_common_stmt);
		try {
			setState(749);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_EXTERNAL:
			case TK_OPTYPE:
			case TK_SEM:
			case TK_OP:
			case TK_TYPE:
			case TK_VAR:
			case TK_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				decl();
				}
				break;
			case TK_IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
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
		enterRule(_localctx, 144, RULE_extend_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(TK_EXTEND);
			setState(752);
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
		enterRule(_localctx, 146, RULE_import_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(TK_IMPORT);
			setState(755);
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
		int _startState = 148;
		enterRecursionRule(_localctx, 148, RULE_import_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(758);
			match(TK_ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Import_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_import_list);
					setState(760);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(761);
					match(TK_COMMA);
					setState(762);
					match(TK_ID);
					}
					} 
				}
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		public Optype_declContext optype_decl() {
			return getRuleContext(Optype_declContext.class,0);
		}
		public Sem_declContext sem_decl() {
			return getRuleContext(Sem_declContext.class,0);
		}
		public Op_declContext op_decl() {
			return getRuleContext(Op_declContext.class,0);
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
		enterRule(_localctx, 150, RULE_decl);
		try {
			setState(773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				type_decl();
				}
				break;
			case TK_VAR:
			case TK_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				obj_decl();
				}
				break;
			case TK_OPTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(770);
				optype_decl();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 4);
				{
				setState(771);
				sem_decl();
				}
				break;
			case TK_EXTERNAL:
			case TK_OP:
				enterOuterAlt(_localctx, 5);
				{
				setState(772);
				op_decl();
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
		enterRule(_localctx, 152, RULE_type_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(TK_TYPE);
			setState(776);
			match(TK_ID);
			setState(777);
			match(TK_EQ);
			setState(778);
			type();
			setState(779);
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
		enterRule(_localctx, 154, RULE_type_restriction);
		try {
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				match(TK_LBRACE);
				setState(783);
				match(TK_ID);
				setState(784);
				match(TK_RBRACE);
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

	public static class Op_declContext extends ParserRuleContext {
		public Op_or_extContext op_or_ext() {
			return getRuleContext(Op_or_extContext.class,0);
		}
		public Oper_def_lpContext oper_def_lp() {
			return getRuleContext(Oper_def_lpContext.class,0);
		}
		public Op_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOp_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOp_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOp_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_declContext op_decl() throws RecognitionException {
		Op_declContext _localctx = new Op_declContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_op_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			op_or_ext();
			setState(788);
			oper_def_lp(0);
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

	public static class Oper_def_lpContext extends ParserRuleContext {
		public Oper_defContext oper_def() {
			return getRuleContext(Oper_defContext.class,0);
		}
		public Oper_def_lpContext oper_def_lp() {
			return getRuleContext(Oper_def_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(MiLenguajeParser.TK_COMMA, 0); }
		public Oper_def_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper_def_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOper_def_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOper_def_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOper_def_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oper_def_lpContext oper_def_lp() throws RecognitionException {
		return oper_def_lp(0);
	}

	private Oper_def_lpContext oper_def_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Oper_def_lpContext _localctx = new Oper_def_lpContext(_ctx, _parentState);
		Oper_def_lpContext _prevctx = _localctx;
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_oper_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(791);
			oper_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(798);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Oper_def_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_oper_def_lp);
					setState(793);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(794);
					match(TK_COMMA);
					setState(795);
					oper_def();
					}
					} 
				}
				setState(800);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class Oper_defContext extends ParserRuleContext {
		public Id_subs_lpContext id_subs_lp() {
			return getRuleContext(Id_subs_lpContext.class,0);
		}
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public Colon_optContext colon_opt() {
			return getRuleContext(Colon_optContext.class,0);
		}
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public Oper_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOper_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOper_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOper_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oper_defContext oper_def() throws RecognitionException {
		Oper_defContext _localctx = new Oper_defContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_oper_def);
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				id_subs_lp(0);
				setState(802);
				op_prototype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				id_subs_lp(0);
				setState(805);
				colon_opt();
				setState(806);
				qualified_id();
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

	public static class Colon_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public Colon_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterColon_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitColon_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitColon_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Colon_optContext colon_opt() throws RecognitionException {
		Colon_optContext _localctx = new Colon_optContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_colon_opt);
		try {
			setState(812);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				vacio();
				}
				break;
			case TK_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				match(TK_COLON);
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

	public static class Op_or_extContext extends ParserRuleContext {
		public TerminalNode TK_OP() { return getToken(MiLenguajeParser.TK_OP, 0); }
		public TerminalNode TK_EXTERNAL() { return getToken(MiLenguajeParser.TK_EXTERNAL, 0); }
		public Op_or_extContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_or_ext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOp_or_ext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOp_or_ext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOp_or_ext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_or_extContext op_or_ext() throws RecognitionException {
		Op_or_extContext _localctx = new Op_or_extContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_op_or_ext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_la = _input.LA(1);
			if ( !(_la==TK_EXTERNAL || _la==TK_OP) ) {
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

	public static class Optype_declContext extends ParserRuleContext {
		public TerminalNode TK_OPTYPE() { return getToken(MiLenguajeParser.TK_OPTYPE, 0); }
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Eq_optContext eq_opt() {
			return getRuleContext(Eq_optContext.class,0);
		}
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public Optype_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optype_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOptype_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOptype_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOptype_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optype_declContext optype_decl() throws RecognitionException {
		Optype_declContext _localctx = new Optype_declContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_optype_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(TK_OPTYPE);
			setState(817);
			match(TK_ID);
			setState(818);
			eq_opt();
			setState(819);
			op_prototype();
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

	public static class Sem_declContext extends ParserRuleContext {
		public TerminalNode TK_SEM() { return getToken(MiLenguajeParser.TK_SEM, 0); }
		public Sem_def_lpContext sem_def_lp() {
			return getRuleContext(Sem_def_lpContext.class,0);
		}
		public Sem_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSem_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSem_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSem_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sem_declContext sem_decl() throws RecognitionException {
		Sem_declContext _localctx = new Sem_declContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_sem_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(TK_SEM);
			setState(822);
			sem_def_lp(0);
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

	public static class Sem_def_lpContext extends ParserRuleContext {
		public Sem_defContext sem_def() {
			return getRuleContext(Sem_defContext.class,0);
		}
		public Sem_def_lpContext sem_def_lp() {
			return getRuleContext(Sem_def_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(MiLenguajeParser.TK_COMMA, 0); }
		public Sem_def_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_def_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSem_def_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSem_def_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSem_def_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sem_def_lpContext sem_def_lp() throws RecognitionException {
		return sem_def_lp(0);
	}

	private Sem_def_lpContext sem_def_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Sem_def_lpContext _localctx = new Sem_def_lpContext(_ctx, _parentState);
		Sem_def_lpContext _prevctx = _localctx;
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_sem_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(825);
			sem_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(832);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sem_def_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sem_def_lp);
					setState(827);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(828);
					match(TK_COMMA);
					setState(829);
					sem_def();
					}
					} 
				}
				setState(834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class Sem_defContext extends ParserRuleContext {
		public Id_subsContext id_subs() {
			return getRuleContext(Id_subsContext.class,0);
		}
		public Sem_protoContext sem_proto() {
			return getRuleContext(Sem_protoContext.class,0);
		}
		public Sem_initContext sem_init() {
			return getRuleContext(Sem_initContext.class,0);
		}
		public Sem_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSem_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSem_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSem_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sem_defContext sem_def() throws RecognitionException {
		Sem_defContext _localctx = new Sem_defContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_sem_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			id_subs();
			setState(836);
			sem_proto();
			setState(837);
			sem_init();
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

	public static class Sem_initContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Sem_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSem_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSem_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSem_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sem_initContext sem_init() throws RecognitionException {
		Sem_initContext _localctx = new Sem_initContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_sem_init);
		try {
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				match(TK_ASSIGN);
				setState(841);
				expr(0);
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

	public static class Eq_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_EQ() { return getToken(MiLenguajeParser.TK_EQ, 0); }
		public Eq_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterEq_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitEq_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitEq_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_optContext eq_opt() throws RecognitionException {
		Eq_optContext _localctx = new Eq_optContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_eq_opt);
		try {
			setState(846);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				vacio();
				}
				break;
			case TK_EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				match(TK_EQ);
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
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
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
		enterRule(_localctx, 178, RULE_type);
		try {
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				subscripts();
				setState(849);
				unsub_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(851);
				unsub_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(852);
				stmt();
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
		public Pointer_defContext pointer_def() {
			return getRuleContext(Pointer_defContext.class,0);
		}
		public Record_defContext record_def() {
			return getRuleContext(Record_defContext.class,0);
		}
		public Union_defContext union_def() {
			return getRuleContext(Union_defContext.class,0);
		}
		public Capability_defContext capability_def() {
			return getRuleContext(Capability_defContext.class,0);
		}
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
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
		enterRule(_localctx, 180, RULE_unsub_type);
		try {
			setState(863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(855);
				basic_type();
				}
				break;
			case TK_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(856);
				string_def();
				}
				break;
			case TK_ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(857);
				enum_def();
				}
				break;
			case TK_PTR:
				enterOuterAlt(_localctx, 4);
				{
				setState(858);
				pointer_def();
				}
				break;
			case TK_REC:
				enterOuterAlt(_localctx, 5);
				{
				setState(859);
				record_def();
				}
				break;
			case TK_UNION:
				enterOuterAlt(_localctx, 6);
				{
				setState(860);
				union_def();
				}
				break;
			case TK_CAP:
				enterOuterAlt(_localctx, 7);
				{
				setState(861);
				capability_def();
				}
				break;
			case TK_ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(862);
				qualified_id();
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

	public static class Pointer_defContext extends ParserRuleContext {
		public TerminalNode TK_PTR() { return getToken(MiLenguajeParser.TK_PTR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TK_ANY() { return getToken(MiLenguajeParser.TK_ANY, 0); }
		public Pointer_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterPointer_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitPointer_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitPointer_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pointer_defContext pointer_def() throws RecognitionException {
		Pointer_defContext _localctx = new Pointer_defContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_pointer_def);
		try {
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				match(TK_PTR);
				setState(866);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				match(TK_PTR);
				setState(868);
				match(TK_ANY);
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

	public static class Union_defContext extends ParserRuleContext {
		public TerminalNode TK_UNION() { return getToken(MiLenguajeParser.TK_UNION, 0); }
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public Field_lpContext field_lp() {
			return getRuleContext(Field_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public Union_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterUnion_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitUnion_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitUnion_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_defContext union_def() throws RecognitionException {
		Union_defContext _localctx = new Union_defContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_union_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(TK_UNION);
			setState(872);
			match(TK_LPAREN);
			setState(873);
			field_lp();
			setState(874);
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

	public static class Record_defContext extends ParserRuleContext {
		public TerminalNode TK_REC() { return getToken(MiLenguajeParser.TK_REC, 0); }
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public Field_lpContext field_lp() {
			return getRuleContext(Field_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public Record_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterRecord_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitRecord_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitRecord_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Record_defContext record_def() throws RecognitionException {
		Record_defContext _localctx = new Record_defContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_record_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(TK_REC);
			setState(877);
			match(TK_LPAREN);
			setState(878);
			field_lp();
			setState(879);
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

	public static class Capability_defContext extends ParserRuleContext {
		public TerminalNode TK_CAP() { return getToken(MiLenguajeParser.TK_CAP, 0); }
		public Cap_forContext cap_for() {
			return getRuleContext(Cap_forContext.class,0);
		}
		public Capability_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capability_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterCapability_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitCapability_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitCapability_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capability_defContext capability_def() throws RecognitionException {
		Capability_defContext _localctx = new Capability_defContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_capability_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(TK_CAP);
			setState(882);
			cap_for();
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

	public static class Cap_forContext extends ParserRuleContext {
		public Qualified_idContext qualified_id() {
			return getRuleContext(Qualified_idContext.class,0);
		}
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public TerminalNode TK_SEM() { return getToken(MiLenguajeParser.TK_SEM, 0); }
		public Sem_protoContext sem_proto() {
			return getRuleContext(Sem_protoContext.class,0);
		}
		public TerminalNode TK_VM() { return getToken(MiLenguajeParser.TK_VM, 0); }
		public Cap_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cap_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterCap_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitCap_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitCap_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cap_forContext cap_for() throws RecognitionException {
		Cap_forContext _localctx = new Cap_forContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_cap_for);
		try {
			setState(889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				qualified_id();
				}
				break;
			case TK_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				op_prototype();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 3);
				{
				setState(886);
				match(TK_SEM);
				setState(887);
				sem_proto();
				}
				break;
			case TK_VM:
				enterOuterAlt(_localctx, 4);
				{
				setState(888);
				match(TK_VM);
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

	public static class Qualified_idContext extends ParserRuleContext {
		public List<TerminalNode> TK_ID() { return getTokens(MiLenguajeParser.TK_ID); }
		public TerminalNode TK_ID(int i) {
			return getToken(MiLenguajeParser.TK_ID, i);
		}
		public TerminalNode TK_PERIOD() { return getToken(MiLenguajeParser.TK_PERIOD, 0); }
		public Qualified_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterQualified_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitQualified_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitQualified_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_idContext qualified_id() throws RecognitionException {
		Qualified_idContext _localctx = new Qualified_idContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_qualified_id);
		try {
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				match(TK_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				match(TK_ID);
				setState(893);
				match(TK_PERIOD);
				setState(894);
				match(TK_ID);
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
		enterRule(_localctx, 194, RULE_basic_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			_la = _input.LA(1);
			if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (TK_BOOL - 110)) | (1L << (TK_INT - 110)) | (1L << (TK_CHAR - 110)) | (1L << (TK_REAL - 110)) | (1L << (TK_FILE - 110)))) != 0)) ) {
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

	public static class Field_lpContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(MiLenguajeParser.TK_SEPARATOR, 0); }
		public Field_lpContext field_lp() {
			return getRuleContext(Field_lpContext.class,0);
		}
		public Field_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterField_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitField_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitField_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_lpContext field_lp() throws RecognitionException {
		Field_lpContext _localctx = new Field_lpContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_field_lp);
		try {
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				field();
				setState(901);
				match(TK_SEPARATOR);
				setState(902);
				field_lp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(904);
				field();
				setState(905);
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

	public static class FieldContext extends ParserRuleContext {
		public Var_def_lpContext var_def_lp() {
			return getRuleContext(Var_def_lpContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
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
		enterRule(_localctx, 200, RULE_param_kind_opt);
		try {
			setState(916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LBRACKET:
			case TK_RECEIVE:
			case TK_P:
			case TK_CO:
			case TK_V:
			case TK_IN:
			case TK_FA:
			case TK_IF:
			case TK_DO:
			case TK_SKIP:
			case TK_EXIT:
			case TK_NEXT:
			case TK_RETURN:
			case TK_REPLY:
			case TK_FORWARD:
			case TK_SEND:
			case TK_CALL:
			case TK_DESTROY:
			case TK_BEGIN:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
			case TK_STRING:
			case TK_ENUM:
			case TK_STOP:
			case TK_PTR:
			case TK_REC:
			case TK_UNION:
			case TK_CAP:
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(911);
				vacio();
				}
				break;
			case TK_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(TK_VAL);
				}
				break;
			case TK_VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(913);
				match(TK_VAR);
				}
				break;
			case TK_RES:
				enterOuterAlt(_localctx, 4);
				{
				setState(914);
				match(TK_RES);
				}
				break;
			case TK_REF:
				enterOuterAlt(_localctx, 5);
				{
				setState(915);
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
		enterRule(_localctx, 202, RULE_string_def);
		try {
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				match(TK_STRING);
				setState(919);
				match(TK_LBRACKET);
				setState(920);
				string_lim();
				setState(921);
				match(TK_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				match(TK_STRING);
				setState(924);
				match(TK_LPAREN);
				setState(925);
				string_lim();
				setState(926);
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
		enterRule(_localctx, 204, RULE_string_lim);
		try {
			setState(932);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_INCR:
			case TK_DECR:
			case TK_LPAREN:
			case TK_PLUS:
			case TK_MINUS:
			case TK_NOT:
			case TK_ADDR:
			case TK_QMARK:
			case TK_LOW:
			case TK_HIGH:
			case TK_NEW:
			case TK_ILIT:
			case TK_RLIT:
			case TK_CLIT:
			case TK_SLIT:
			case TK_NLIT:
			case TK_BLIT:
			case TK_FLIT:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
			case TK_STRING:
			case TK_CREATE:
			case TK_ID:
			case CADENA:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				expr(0);
				}
				break;
			case TK_ASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
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
		enterRule(_localctx, 206, RULE_obj_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			var_or_const();
			setState(935);
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
		enterRule(_localctx, 208, RULE_enum_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(TK_ENUM);
			setState(938);
			match(TK_LPAREN);
			setState(939);
			id_lp(0);
			setState(940);
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
		public Var_or_const_varContext var_or_const_var() {
			return getRuleContext(Var_or_const_varContext.class,0);
		}
		public Var_or_const_constContext var_or_const_const() {
			return getRuleContext(Var_or_const_constContext.class,0);
		}
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
		enterRule(_localctx, 210, RULE_var_or_const);
		try {
			setState(944);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				var_or_const_var();
				}
				break;
			case TK_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				var_or_const_const();
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

	public static class Var_or_const_varContext extends ParserRuleContext {
		public TerminalNode TK_VAR() { return getToken(MiLenguajeParser.TK_VAR, 0); }
		public Var_or_const_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_or_const_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterVar_or_const_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitVar_or_const_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVar_or_const_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_or_const_varContext var_or_const_var() throws RecognitionException {
		Var_or_const_varContext _localctx = new Var_or_const_varContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_var_or_const_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(TK_VAR);
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

	public static class Var_or_const_constContext extends ParserRuleContext {
		public TerminalNode TK_CONST() { return getToken(MiLenguajeParser.TK_CONST, 0); }
		public Var_or_const_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_or_const_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterVar_or_const_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitVar_or_const_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVar_or_const_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_or_const_constContext var_or_const_const() throws RecognitionException {
		Var_or_const_constContext _localctx = new Var_or_const_constContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_var_or_const_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(TK_CONST);
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
		int _startState = 216;
		enterRecursionRule(_localctx, 216, RULE_var_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(951);
			var_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(958);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Var_def_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_var_def_lp);
					setState(953);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(954);
					match(TK_COMMA);
					setState(955);
					var_def();
					}
					} 
				}
				setState(960);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		enterRule(_localctx, 218, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			id_subs_lp(0);
			setState(962);
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
		public Var_att_assign_exprContext var_att_assign_expr() {
			return getRuleContext(Var_att_assign_exprContext.class,0);
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
		enterRule(_localctx, 220, RULE_var_att);
		try {
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				match(TK_COLON);
				setState(965);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(966);
				match(TK_COLON);
				setState(967);
				type();
				setState(968);
				match(TK_ASSIGN);
				setState(969);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(971);
				var_att_assign_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(972);
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

	public static class Var_att_assign_exprContext extends ParserRuleContext {
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_att_assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_att_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterVar_att_assign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitVar_att_assign_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVar_att_assign_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_att_assign_exprContext var_att_assign_expr() throws RecognitionException {
		Var_att_assign_exprContext _localctx = new Var_att_assign_exprContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_var_att_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			match(TK_ASSIGN);
			setState(976);
			expr(0);
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
		int _startState = 224;
		enterRecursionRule(_localctx, 224, RULE_id_subs_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(979);
			id_subs();
			}
			_ctx.stop = _input.LT(-1);
			setState(986);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_subs_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_subs_lp);
					setState(981);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(982);
					match(TK_COMMA);
					setState(983);
					id_subs();
					}
					} 
				}
				setState(988);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		public Id_subsIDContext id_subsID() {
			return getRuleContext(Id_subsIDContext.class,0);
		}
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
		enterRule(_localctx, 226, RULE_id_subs);
		try {
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				id_subsID();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				match(TK_ID);
				setState(991);
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

	public static class Id_subsIDContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Id_subsIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_subsID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterId_subsID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitId_subsID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitId_subsID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_subsIDContext id_subsID() throws RecognitionException {
		Id_subsIDContext _localctx = new Id_subsIDContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_id_subsID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(TK_ID);
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
		int _startState = 230;
		enterRecursionRule(_localctx, 230, RULE_id_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(997);
			match(TK_ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(1004);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_lp);
					setState(999);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1000);
					match(TK_COMMA);
					setState(1001);
					match(TK_ID);
					}
					} 
				}
				setState(1006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class Skip_stmtContext extends ParserRuleContext {
		public TerminalNode TK_SKIP() { return getToken(MiLenguajeParser.TK_SKIP, 0); }
		public Skip_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSkip_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSkip_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSkip_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Skip_stmtContext skip_stmt() throws RecognitionException {
		Skip_stmtContext _localctx = new Skip_stmtContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_skip_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(TK_SKIP);
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

	public static class Exit_stmtContext extends ParserRuleContext {
		public TerminalNode TK_EXIT() { return getToken(MiLenguajeParser.TK_EXIT, 0); }
		public Exit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_stmtContext exit_stmt() throws RecognitionException {
		Exit_stmtContext _localctx = new Exit_stmtContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			match(TK_EXIT);
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

	public static class Next_stmtContext extends ParserRuleContext {
		public TerminalNode TK_NEXT() { return getToken(MiLenguajeParser.TK_NEXT, 0); }
		public Next_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterNext_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitNext_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitNext_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_stmtContext next_stmt() throws RecognitionException {
		Next_stmtContext _localctx = new Next_stmtContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_next_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			match(TK_NEXT);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode TK_RETURN() { return getToken(MiLenguajeParser.TK_RETURN, 0); }
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			match(TK_RETURN);
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

	public static class Reply_stmtContext extends ParserRuleContext {
		public TerminalNode TK_REPLY() { return getToken(MiLenguajeParser.TK_REPLY, 0); }
		public Reply_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reply_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterReply_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitReply_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitReply_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reply_stmtContext reply_stmt() throws RecognitionException {
		Reply_stmtContext _localctx = new Reply_stmtContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_reply_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(TK_REPLY);
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
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Expr_numContext expr_num() {
			return getRuleContext(Expr_numContext.class,0);
		}
		public TerminalNode CADENA() { return getToken(MiLenguajeParser.CADENA, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public Constr_item_lpContext constr_item_lp() {
			return getRuleContext(Constr_item_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public Prefix_exprContext prefix_expr() {
			return getRuleContext(Prefix_exprContext.class,0);
		}
		public Create_exprContext create_expr() {
			return getRuleContext(Create_exprContext.class,0);
		}
		public TerminalNode TK_EXPON() { return getToken(MiLenguajeParser.TK_EXPON, 0); }
		public TerminalNode TK_ASTER() { return getToken(MiLenguajeParser.TK_ASTER, 0); }
		public TerminalNode TK_DIV() { return getToken(MiLenguajeParser.TK_DIV, 0); }
		public TerminalNode TK_MOD() { return getToken(MiLenguajeParser.TK_MOD, 0); }
		public TerminalNode TK_REMDR() { return getToken(MiLenguajeParser.TK_REMDR, 0); }
		public TerminalNode TK_PLUS() { return getToken(MiLenguajeParser.TK_PLUS, 0); }
		public TerminalNode TK_MINUS() { return getToken(MiLenguajeParser.TK_MINUS, 0); }
		public TerminalNode TK_CONCAT() { return getToken(MiLenguajeParser.TK_CONCAT, 0); }
		public TerminalNode TK_EQ() { return getToken(MiLenguajeParser.TK_EQ, 0); }
		public TerminalNode TK_NE() { return getToken(MiLenguajeParser.TK_NE, 0); }
		public TerminalNode TK_GE() { return getToken(MiLenguajeParser.TK_GE, 0); }
		public TerminalNode TK_LE() { return getToken(MiLenguajeParser.TK_LE, 0); }
		public TerminalNode TK_GT() { return getToken(MiLenguajeParser.TK_GT, 0); }
		public TerminalNode TK_LT() { return getToken(MiLenguajeParser.TK_LT, 0); }
		public TerminalNode TK_AND() { return getToken(MiLenguajeParser.TK_AND, 0); }
		public TerminalNode TK_OR() { return getToken(MiLenguajeParser.TK_OR, 0); }
		public TerminalNode TK_OR_() { return getToken(MiLenguajeParser.TK_OR_, 0); }
		public TerminalNode TK_XOR() { return getToken(MiLenguajeParser.TK_XOR, 0); }
		public TerminalNode TK_RSHIFT() { return getToken(MiLenguajeParser.TK_RSHIFT, 0); }
		public TerminalNode TK_LSHIFT() { return getToken(MiLenguajeParser.TK_LSHIFT, 0); }
		public TerminalNode TK_SWAP() { return getToken(MiLenguajeParser.TK_SWAP, 0); }
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
		public TerminalNode TK_AUG_PLUS() { return getToken(MiLenguajeParser.TK_AUG_PLUS, 0); }
		public TerminalNode TK_AUG_MINUS() { return getToken(MiLenguajeParser.TK_AUG_MINUS, 0); }
		public TerminalNode TK_AUG_ASTER() { return getToken(MiLenguajeParser.TK_AUG_ASTER, 0); }
		public TerminalNode TK_AUG_DIV() { return getToken(MiLenguajeParser.TK_AUG_DIV, 0); }
		public TerminalNode TK_AUG_REMDR() { return getToken(MiLenguajeParser.TK_AUG_REMDR, 0); }
		public TerminalNode TK_AUG_EXPON() { return getToken(MiLenguajeParser.TK_AUG_EXPON, 0); }
		public TerminalNode TK_AUG_OR() { return getToken(MiLenguajeParser.TK_AUG_OR, 0); }
		public TerminalNode TK_AUG_AND() { return getToken(MiLenguajeParser.TK_AUG_AND, 0); }
		public TerminalNode TK_AUG_CONCAT() { return getToken(MiLenguajeParser.TK_AUG_CONCAT, 0); }
		public TerminalNode TK_AUG_RSHIFT() { return getToken(MiLenguajeParser.TK_AUG_RSHIFT, 0); }
		public TerminalNode TK_AUG_LSHIFT() { return getToken(MiLenguajeParser.TK_AUG_LSHIFT, 0); }
		public Paren_listContext paren_list() {
			return getRuleContext(Paren_listContext.class,0);
		}
		public TerminalNode TK_INCR() { return getToken(MiLenguajeParser.TK_INCR, 0); }
		public TerminalNode TK_DECR() { return getToken(MiLenguajeParser.TK_DECR, 0); }
		public TerminalNode TK_HAT() { return getToken(MiLenguajeParser.TK_HAT, 0); }
		public TerminalNode TK_PERIOD() { return getToken(MiLenguajeParser.TK_PERIOD, 0); }
		public TerminalNode TK_LBRACKET() { return getToken(MiLenguajeParser.TK_LBRACKET, 0); }
		public Bound_lpContext bound_lp() {
			return getRuleContext(Bound_lpContext.class,0);
		}
		public TerminalNode TK_RBRACKET() { return getToken(MiLenguajeParser.TK_RBRACKET, 0); }
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 242;
		enterRecursionRule(_localctx, 242, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(1018);
				match(TK_ID);
				}
				break;
			case 2:
				{
				setState(1019);
				expr_num();
				}
				break;
			case 3:
				{
				setState(1020);
				match(CADENA);
				}
				break;
			case 4:
				{
				setState(1021);
				literal();
				}
				break;
			case 5:
				{
				setState(1022);
				constructor();
				setState(1023);
				expr(43);
				}
				break;
			case 6:
				{
				setState(1025);
				match(TK_LPAREN);
				setState(1026);
				constr_item_lp(0);
				setState(1027);
				match(TK_RPAREN);
				}
				break;
			case 7:
				{
				setState(1029);
				prefix_expr();
				}
				break;
			case 8:
				{
				setState(1030);
				create_expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1033);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1034);
						match(TK_EXPON);
						setState(1035);
						expr(36);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1036);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1037);
						match(TK_ASTER);
						setState(1038);
						expr(35);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1039);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1040);
						match(TK_DIV);
						setState(1041);
						expr(33);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1042);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1043);
						match(TK_MOD);
						setState(1044);
						expr(32);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1045);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1046);
						match(TK_REMDR);
						setState(1047);
						expr(31);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1048);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1049);
						match(TK_PLUS);
						setState(1050);
						expr(30);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1051);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1052);
						match(TK_MINUS);
						setState(1053);
						expr(29);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1054);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1055);
						match(TK_CONCAT);
						setState(1056);
						expr(28);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1057);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1058);
						match(TK_EQ);
						setState(1059);
						expr(27);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1060);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1061);
						match(TK_NE);
						setState(1062);
						expr(26);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1063);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1064);
						match(TK_GE);
						setState(1065);
						expr(25);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1066);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1067);
						match(TK_LE);
						setState(1068);
						expr(24);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1069);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1070);
						match(TK_GT);
						setState(1071);
						expr(23);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1072);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1073);
						match(TK_LT);
						setState(1074);
						expr(22);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1075);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1076);
						match(TK_AND);
						setState(1077);
						expr(21);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1078);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1079);
						match(TK_OR);
						setState(1080);
						expr(20);
						}
						break;
					case 17:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1081);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1082);
						match(TK_OR_);
						setState(1083);
						expr(19);
						}
						break;
					case 18:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1084);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1085);
						match(TK_XOR);
						setState(1086);
						expr(18);
						}
						break;
					case 19:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1087);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1088);
						match(TK_RSHIFT);
						setState(1089);
						expr(17);
						}
						break;
					case 20:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1090);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1091);
						match(TK_LSHIFT);
						setState(1092);
						expr(16);
						}
						break;
					case 21:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1093);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1094);
						match(TK_SWAP);
						setState(1095);
						expr(15);
						}
						break;
					case 22:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1096);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1097);
						match(TK_ASSIGN);
						setState(1098);
						expr(14);
						}
						break;
					case 23:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1099);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1100);
						match(TK_AUG_PLUS);
						setState(1101);
						expr(13);
						}
						break;
					case 24:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1102);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1103);
						match(TK_AUG_MINUS);
						setState(1104);
						expr(12);
						}
						break;
					case 25:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1105);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1106);
						match(TK_AUG_ASTER);
						setState(1107);
						expr(11);
						}
						break;
					case 26:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1108);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1109);
						match(TK_AUG_DIV);
						setState(1110);
						expr(10);
						}
						break;
					case 27:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1111);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1112);
						match(TK_AUG_REMDR);
						setState(1113);
						expr(9);
						}
						break;
					case 28:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1114);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1115);
						match(TK_AUG_EXPON);
						setState(1116);
						expr(8);
						}
						break;
					case 29:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1117);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1118);
						match(TK_AUG_OR);
						setState(1119);
						expr(7);
						}
						break;
					case 30:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1120);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1121);
						match(TK_AUG_AND);
						setState(1122);
						expr(6);
						}
						break;
					case 31:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1123);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1124);
						match(TK_AUG_CONCAT);
						setState(1125);
						expr(5);
						}
						break;
					case 32:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1126);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1127);
						match(TK_AUG_RSHIFT);
						setState(1128);
						expr(4);
						}
						break;
					case 33:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1129);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1130);
						match(TK_AUG_LSHIFT);
						setState(1131);
						expr(3);
						}
						break;
					case 34:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1132);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(1133);
						paren_list();
						}
						break;
					case 35:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1134);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(1135);
						match(TK_INCR);
						}
						break;
					case 36:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1136);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(1137);
						match(TK_DECR);
						}
						break;
					case 37:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1138);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(1139);
						match(TK_HAT);
						}
						break;
					case 38:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1140);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(1141);
						match(TK_PERIOD);
						setState(1142);
						match(TK_ID);
						}
						break;
					case 39:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1143);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(1144);
						match(TK_LBRACKET);
						setState(1145);
						bound_lp(0);
						setState(1146);
						match(TK_RBRACKET);
						}
						break;
					case 40:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1148);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(1149);
						match(TK_ASTER);
						setState(1150);
						expr(0);
						setState(1151);
						constructor();
						}
						break;
					}
					} 
				}
				setState(1157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class Expr_numContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(MiLenguajeParser.NUM, 0); }
		public Expr_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_numContext expr_num() throws RecognitionException {
		Expr_numContext _localctx = new Expr_numContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_expr_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			match(NUM);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode TK_ILIT() { return getToken(MiLenguajeParser.TK_ILIT, 0); }
		public TerminalNode TK_RLIT() { return getToken(MiLenguajeParser.TK_RLIT, 0); }
		public TerminalNode TK_BLIT() { return getToken(MiLenguajeParser.TK_BLIT, 0); }
		public TerminalNode TK_CLIT() { return getToken(MiLenguajeParser.TK_CLIT, 0); }
		public TerminalNode TK_SLIT() { return getToken(MiLenguajeParser.TK_SLIT, 0); }
		public TerminalNode TK_NLIT() { return getToken(MiLenguajeParser.TK_NLIT, 0); }
		public TerminalNode TK_FLIT() { return getToken(MiLenguajeParser.TK_FLIT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (TK_ILIT - 77)) | (1L << (TK_RLIT - 77)) | (1L << (TK_CLIT - 77)) | (1L << (TK_SLIT - 77)) | (1L << (TK_NLIT - 77)) | (1L << (TK_BLIT - 77)) | (1L << (TK_FLIT - 77)))) != 0)) ) {
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

	public static class Create_exprContext extends ParserRuleContext {
		public TerminalNode TK_CREATE() { return getToken(MiLenguajeParser.TK_CREATE, 0); }
		public Create_callContext create_call() {
			return getRuleContext(Create_callContext.class,0);
		}
		public Location_optContext location_opt() {
			return getRuleContext(Location_optContext.class,0);
		}
		public Create_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterCreate_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitCreate_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitCreate_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_exprContext create_expr() throws RecognitionException {
		Create_exprContext _localctx = new Create_exprContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_create_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(TK_CREATE);
			setState(1163);
			create_call();
			setState(1164);
			location_opt();
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

	public static class Create_callContext extends ParserRuleContext {
		public Rsrc_nameContext rsrc_name() {
			return getRuleContext(Rsrc_nameContext.class,0);
		}
		public Paren_listContext paren_list() {
			return getRuleContext(Paren_listContext.class,0);
		}
		public Create_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterCreate_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitCreate_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitCreate_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_callContext create_call() throws RecognitionException {
		Create_callContext _localctx = new Create_callContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_create_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			rsrc_name();
			setState(1167);
			paren_list();
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

	public static class Rsrc_nameContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public TerminalNode TK_VM() { return getToken(MiLenguajeParser.TK_VM, 0); }
		public Rsrc_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rsrc_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterRsrc_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitRsrc_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitRsrc_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rsrc_nameContext rsrc_name() throws RecognitionException {
		Rsrc_nameContext _localctx = new Rsrc_nameContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_rsrc_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			_la = _input.LA(1);
			if ( !(_la==TK_VM || _la==TK_ID) ) {
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

	public static class Location_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_ON() { return getToken(MiLenguajeParser.TK_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Location_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterLocation_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitLocation_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitLocation_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Location_optContext location_opt() throws RecognitionException {
		Location_optContext _localctx = new Location_optContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_location_opt);
		try {
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1171);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1172);
				match(TK_ON);
				setState(1173);
				expr(0);
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

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public Constr_item_lpContext constr_item_lp() {
			return getRuleContext(Constr_item_lpContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			match(TK_LPAREN);
			setState(1177);
			constr_item_lp(0);
			setState(1178);
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

	public static class Constr_item_lpContext extends ParserRuleContext {
		public Constr_itemContext constr_item() {
			return getRuleContext(Constr_itemContext.class,0);
		}
		public Constr_item_lpContext constr_item_lp() {
			return getRuleContext(Constr_item_lpContext.class,0);
		}
		public TerminalNode TK_COMMA() { return getToken(MiLenguajeParser.TK_COMMA, 0); }
		public Constr_item_lpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_item_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterConstr_item_lp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitConstr_item_lp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitConstr_item_lp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constr_item_lpContext constr_item_lp() throws RecognitionException {
		return constr_item_lp(0);
	}

	private Constr_item_lpContext constr_item_lp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Constr_item_lpContext _localctx = new Constr_item_lpContext(_ctx, _parentState);
		Constr_item_lpContext _prevctx = _localctx;
		int _startState = 258;
		enterRecursionRule(_localctx, 258, RULE_constr_item_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1181);
			constr_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(1188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Constr_item_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constr_item_lp);
					setState(1183);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1184);
					match(TK_COMMA);
					setState(1185);
					constr_item();
					}
					} 
				}
				setState(1190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class Constr_itemContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TK_LBRACKET() { return getToken(MiLenguajeParser.TK_LBRACKET, 0); }
		public TerminalNode TK_RBRACKET() { return getToken(MiLenguajeParser.TK_RBRACKET, 0); }
		public Constr_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterConstr_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitConstr_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitConstr_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constr_itemContext constr_item() throws RecognitionException {
		Constr_itemContext _localctx = new Constr_itemContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_constr_item);
		try {
			setState(1197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_INCR:
			case TK_DECR:
			case TK_LPAREN:
			case TK_PLUS:
			case TK_MINUS:
			case TK_NOT:
			case TK_ADDR:
			case TK_QMARK:
			case TK_LOW:
			case TK_HIGH:
			case TK_NEW:
			case TK_ILIT:
			case TK_RLIT:
			case TK_CLIT:
			case TK_SLIT:
			case TK_NLIT:
			case TK_BLIT:
			case TK_FLIT:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
			case TK_STRING:
			case TK_CREATE:
			case TK_ID:
			case CADENA:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1191);
				expr(0);
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1192);
				match(TK_LBRACKET);
				setState(1193);
				expr(0);
				setState(1194);
				match(TK_RBRACKET);
				setState(1195);
				expr(0);
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

	public static class Prefix_exprContext extends ParserRuleContext {
		public TerminalNode TK_NOT() { return getToken(MiLenguajeParser.TK_NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_PLUS() { return getToken(MiLenguajeParser.TK_PLUS, 0); }
		public TerminalNode TK_MINUS() { return getToken(MiLenguajeParser.TK_MINUS, 0); }
		public TerminalNode TK_ADDR() { return getToken(MiLenguajeParser.TK_ADDR, 0); }
		public TerminalNode TK_QMARK() { return getToken(MiLenguajeParser.TK_QMARK, 0); }
		public TerminalNode TK_INCR() { return getToken(MiLenguajeParser.TK_INCR, 0); }
		public TerminalNode TK_DECR() { return getToken(MiLenguajeParser.TK_DECR, 0); }
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Paren_exprContext paren_expr() {
			return getRuleContext(Paren_exprContext.class,0);
		}
		public TerminalNode TK_STRING() { return getToken(MiLenguajeParser.TK_STRING, 0); }
		public TerminalNode TK_LOW() { return getToken(MiLenguajeParser.TK_LOW, 0); }
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public TerminalNode TK_HIGH() { return getToken(MiLenguajeParser.TK_HIGH, 0); }
		public TerminalNode TK_NEW() { return getToken(MiLenguajeParser.TK_NEW, 0); }
		public Subscripts_optContext subscripts_opt() {
			return getRuleContext(Subscripts_optContext.class,0);
		}
		public New_itemContext new_item() {
			return getRuleContext(New_itemContext.class,0);
		}
		public Prefix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterPrefix_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitPrefix_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitPrefix_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_exprContext prefix_expr() throws RecognitionException {
		Prefix_exprContext _localctx = new Prefix_exprContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_prefix_expr);
		try {
			setState(1236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1199);
				match(TK_NOT);
				setState(1200);
				expr(0);
				}
				break;
			case TK_PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1201);
				match(TK_PLUS);
				setState(1202);
				expr(0);
				}
				break;
			case TK_MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1203);
				match(TK_MINUS);
				setState(1204);
				expr(0);
				}
				break;
			case TK_ADDR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1205);
				match(TK_ADDR);
				setState(1206);
				expr(0);
				}
				break;
			case TK_QMARK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1207);
				match(TK_QMARK);
				setState(1208);
				expr(0);
				}
				break;
			case TK_INCR:
				enterOuterAlt(_localctx, 6);
				{
				setState(1209);
				match(TK_INCR);
				setState(1210);
				expr(0);
				}
				break;
			case TK_DECR:
				enterOuterAlt(_localctx, 7);
				{
				setState(1211);
				match(TK_DECR);
				setState(1212);
				expr(0);
				}
				break;
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1213);
				basic_type();
				setState(1214);
				paren_expr();
				}
				break;
			case TK_STRING:
				enterOuterAlt(_localctx, 9);
				{
				setState(1216);
				match(TK_STRING);
				setState(1217);
				paren_expr();
				setState(1218);
				match(TK_NOT);
				}
				break;
			case TK_LOW:
				enterOuterAlt(_localctx, 10);
				{
				setState(1220);
				match(TK_LOW);
				setState(1221);
				match(TK_LPAREN);
				setState(1222);
				type();
				setState(1223);
				match(TK_RPAREN);
				}
				break;
			case TK_HIGH:
				enterOuterAlt(_localctx, 11);
				{
				setState(1225);
				match(TK_HIGH);
				setState(1226);
				match(TK_LPAREN);
				setState(1227);
				type();
				setState(1228);
				match(TK_RPAREN);
				}
				break;
			case TK_NEW:
				enterOuterAlt(_localctx, 12);
				{
				setState(1230);
				match(TK_NEW);
				setState(1231);
				match(TK_LPAREN);
				setState(1232);
				subscripts_opt();
				setState(1233);
				new_item();
				setState(1234);
				match(TK_RPAREN);
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

	public static class Paren_exprContext extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public Paren_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParen_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParen_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParen_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paren_exprContext paren_expr() throws RecognitionException {
		Paren_exprContext _localctx = new Paren_exprContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_paren_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			match(TK_LPAREN);
			setState(1239);
			expr(0);
			setState(1240);
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

	public static class New_itemContext extends ParserRuleContext {
		public Unsub_typeContext unsub_type() {
			return getRuleContext(Unsub_typeContext.class,0);
		}
		public TerminalNode TK_SEM() { return getToken(MiLenguajeParser.TK_SEM, 0); }
		public Sem_protoContext sem_proto() {
			return getRuleContext(Sem_protoContext.class,0);
		}
		public TerminalNode TK_OP() { return getToken(MiLenguajeParser.TK_OP, 0); }
		public Op_prototypeContext op_prototype() {
			return getRuleContext(Op_prototypeContext.class,0);
		}
		public New_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterNew_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitNew_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitNew_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_itemContext new_item() throws RecognitionException {
		New_itemContext _localctx = new New_itemContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_new_item);
		try {
			setState(1247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
			case TK_STRING:
			case TK_ENUM:
			case TK_PTR:
			case TK_REC:
			case TK_UNION:
			case TK_CAP:
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1242);
				unsub_type();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1243);
				match(TK_SEM);
				setState(1244);
				sem_proto();
				}
				break;
			case TK_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1245);
				match(TK_OP);
				setState(1246);
				op_prototype();
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

	public static class Sem_protoContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public Sem_protoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sem_proto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSem_proto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSem_proto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSem_proto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sem_protoContext sem_proto() throws RecognitionException {
		Sem_protoContext _localctx = new Sem_protoContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_sem_proto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			vacio();
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

	public static class Op_prototypeContext extends ParserRuleContext {
		public PrototypeContext prototype() {
			return getRuleContext(PrototypeContext.class,0);
		}
		public Op_restriction_optContext op_restriction_opt() {
			return getRuleContext(Op_restriction_optContext.class,0);
		}
		public Op_prototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_prototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOp_prototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOp_prototype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOp_prototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_prototypeContext op_prototype() throws RecognitionException {
		Op_prototypeContext _localctx = new Op_prototypeContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_op_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			prototype();
			setState(1252);
			op_restriction_opt();
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

	public static class Op_restriction_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_LBRACE() { return getToken(MiLenguajeParser.TK_LBRACE, 0); }
		public Op_restrictionContext op_restriction() {
			return getRuleContext(Op_restrictionContext.class,0);
		}
		public TerminalNode TK_RBRACE() { return getToken(MiLenguajeParser.TK_RBRACE, 0); }
		public Op_restriction_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_restriction_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOp_restriction_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOp_restriction_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOp_restriction_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_restriction_optContext op_restriction_opt() throws RecognitionException {
		Op_restriction_optContext _localctx = new Op_restriction_optContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_op_restriction_opt);
		try {
			setState(1259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1254);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1255);
				match(TK_LBRACE);
				setState(1256);
				op_restriction();
				setState(1257);
				match(TK_RBRACE);
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

	public static class PrototypeContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Return_spec_optContext return_spec_opt() {
			return getRuleContext(Return_spec_optContext.class,0);
		}
		public PrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterPrototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitPrototype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitPrototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrototypeContext prototype() throws RecognitionException {
		PrototypeContext _localctx = new PrototypeContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			parameters();
			setState(1262);
			return_spec_opt();
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

	public static class Return_spec_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_RETURNS() { return getToken(MiLenguajeParser.TK_RETURNS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Id_subsContext id_subs() {
			return getRuleContext(Id_subsContext.class,0);
		}
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public TerminalNode TK_BOGUS() { return getToken(MiLenguajeParser.TK_BOGUS, 0); }
		public Return_spec_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_spec_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterReturn_spec_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitReturn_spec_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitReturn_spec_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_spec_optContext return_spec_opt() throws RecognitionException {
		Return_spec_optContext _localctx = new Return_spec_optContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_return_spec_opt);
		try {
			setState(1275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1265);
				match(TK_RETURNS);
				setState(1266);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1267);
				match(TK_RETURNS);
				setState(1268);
				id_subs();
				setState(1269);
				match(TK_COLON);
				setState(1270);
				type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1272);
				match(TK_RETURNS);
				setState(1273);
				match(TK_ID);
				setState(1274);
				match(TK_BOGUS);
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

	public static class Subscripts_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public SubscriptsContext subscripts() {
			return getRuleContext(SubscriptsContext.class,0);
		}
		public Subscripts_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscripts_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSubscripts_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSubscripts_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSubscripts_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscripts_optContext subscripts_opt() throws RecognitionException {
		Subscripts_optContext _localctx = new Subscripts_optContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_subscripts_opt);
		try {
			setState(1279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SEM:
			case TK_OP:
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
			case TK_STRING:
			case TK_ENUM:
			case TK_PTR:
			case TK_REC:
			case TK_UNION:
			case TK_CAP:
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1277);
				vacio();
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1278);
				subscripts();
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
		enterRule(_localctx, 280, RULE_subscripts);
		try {
			setState(1285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1281);
				bracketed_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1282);
				bracketed_list();
				setState(1283);
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
		enterRule(_localctx, 282, RULE_bracketed_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			match(TK_LBRACKET);
			setState(1288);
			bound_lp(0);
			setState(1289);
			match(TK_RBRACKET);
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
		int _startState = 284;
		enterRecursionRule(_localctx, 284, RULE_bound_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1292);
			bounds();
			}
			_ctx.stop = _input.LT(-1);
			setState(1299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bound_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bound_lp);
					setState(1294);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1295);
					match(TK_COMMA);
					setState(1296);
					bounds();
					}
					} 
				}
				setState(1301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		enterRule(_localctx, 286, RULE_bounds);
		try {
			setState(1307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1302);
				bound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1303);
				bound();
				setState(1304);
				match(TK_COLON);
				setState(1305);
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
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
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
		enterRule(_localctx, 288, RULE_bound);
		try {
			setState(1313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1310);
				match(TK_ASTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1311);
				vacio();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1312);
				stmt();
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

	public static class Op_restrictionContext extends ParserRuleContext {
		public TerminalNode TK_CALL() { return getToken(MiLenguajeParser.TK_CALL, 0); }
		public TerminalNode TK_SEND() { return getToken(MiLenguajeParser.TK_SEND, 0); }
		public TerminalNode TK_COMMA() { return getToken(MiLenguajeParser.TK_COMMA, 0); }
		public Op_restrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_restriction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOp_restriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOp_restriction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOp_restriction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_restrictionContext op_restriction() throws RecognitionException {
		Op_restrictionContext _localctx = new Op_restrictionContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_op_restriction);
		try {
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1315);
				match(TK_CALL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1316);
				match(TK_SEND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1317);
				match(TK_CALL);
				setState(1318);
				match(TK_COMMA);
				setState(1319);
				match(TK_SEND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1320);
				match(TK_SEND);
				setState(1321);
				match(TK_COMMA);
				setState(1322);
				match(TK_CALL);
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

	public static class End_idContext extends ParserRuleContext {
		public TerminalNode TK_END() { return getToken(MiLenguajeParser.TK_END, 0); }
		public Id_optContext id_opt() {
			return getRuleContext(Id_optContext.class,0);
		}
		public End_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterEnd_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitEnd_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitEnd_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_idContext end_id() throws RecognitionException {
		End_idContext _localctx = new End_idContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_end_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			match(TK_END);
			setState(1326);
			id_opt();
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

	public static class Id_optContext extends ParserRuleContext {
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Id_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterId_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitId_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitId_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_optContext id_opt() throws RecognitionException {
		Id_optContext _localctx = new Id_optContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_id_opt);
		try {
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1328);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1329);
				match(TK_ID);
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

	public static class BlockContext extends ParserRuleContext {
		public Block_itemsContext block_items() {
			return getRuleContext(Block_itemsContext.class,0);
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
		enterRule(_localctx, 296, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			block_items();
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

	public static class Block_itemsContext extends ParserRuleContext {
		public Block_itemContext block_item() {
			return getRuleContext(Block_itemContext.class,0);
		}
		public Block_items_Context block_items_() {
			return getRuleContext(Block_items_Context.class,0);
		}
		public Block_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBlock_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBlock_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBlock_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_itemsContext block_items() throws RecognitionException {
		Block_itemsContext _localctx = new Block_itemsContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_block_items);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			block_item();
			setState(1335);
			block_items_();
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

	public static class Block_items_Context extends ParserRuleContext {
		public Block_itemContext block_item() {
			return getRuleContext(Block_itemContext.class,0);
		}
		public Block_items_Context block_items_() {
			return getRuleContext(Block_items_Context.class,0);
		}
		public TerminalNode TK_SEPARATOR() { return getToken(MiLenguajeParser.TK_SEPARATOR, 0); }
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public Block_items_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_items_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBlock_items_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBlock_items_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBlock_items_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_items_Context block_items_() throws RecognitionException {
		Block_items_Context _localctx = new Block_items_Context(_ctx, getState());
		enterRule(_localctx, 300, RULE_block_items_);
		int _la;
		try {
			setState(1344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_SEPARATOR) {
					{
					setState(1337);
					match(TK_SEPARATOR);
					}
				}

				setState(1340);
				block_item();
				setState(1341);
				block_items_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1343);
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

	public static class Block_itemContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Import_clauseContext import_clause() {
			return getRuleContext(Import_clauseContext.class,0);
		}
		public Block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBlock_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBlock_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBlock_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_itemContext block_item() throws RecognitionException {
		Block_itemContext _localctx = new Block_itemContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_block_item);
		try {
			setState(1350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1346);
				decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1347);
				stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1348);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1349);
				import_clause();
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

	public static class Id_lsContext extends ParserRuleContext {
		public Id_lpContext id_lp() {
			return getRuleContext(Id_lpContext.class,0);
		}
		public VacioContext vacio() {
			return getRuleContext(VacioContext.class,0);
		}
		public Id_lsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_ls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterId_ls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitId_ls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitId_ls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_lsContext id_ls() throws RecognitionException {
		Id_lsContext _localctx = new Id_lsContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_id_ls);
		try {
			setState(1354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1352);
				id_lp(0);
				}
				break;
			case TK_RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1353);
				vacio();
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
		enterRule(_localctx, 306, RULE_falta);
		try {
			setState(1358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(1356);
				match(T__0);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				vacio();
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
		enterRule(_localctx, 308, RULE_vacio);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return quantifier_lp_sempred((Quantifier_lpContext)_localctx, predIndex);
		case 22:
			return spec_stmt_ls_sempred((Spec_stmt_lsContext)_localctx, predIndex);
		case 23:
			return body_stmt_ls_sempred((Body_stmt_lsContext)_localctx, predIndex);
		case 39:
			return in_cmd_lp_sempred((In_cmd_lpContext)_localctx, predIndex);
		case 48:
			return concurrent_cmd_lp_sempred((Concurrent_cmd_lpContext)_localctx, predIndex);
		case 50:
			return separator_opt_sempred((Separator_optContext)_localctx, predIndex);
		case 60:
			return guarded_cmd_lp_sempred((Guarded_cmd_lpContext)_localctx, predIndex);
		case 65:
			return expr_lp_sempred((Expr_lpContext)_localctx, predIndex);
		case 74:
			return import_list_sempred((Import_listContext)_localctx, predIndex);
		case 79:
			return oper_def_lp_sempred((Oper_def_lpContext)_localctx, predIndex);
		case 85:
			return sem_def_lp_sempred((Sem_def_lpContext)_localctx, predIndex);
		case 108:
			return var_def_lp_sempred((Var_def_lpContext)_localctx, predIndex);
		case 112:
			return id_subs_lp_sempred((Id_subs_lpContext)_localctx, predIndex);
		case 115:
			return id_lp_sempred((Id_lpContext)_localctx, predIndex);
		case 121:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 129:
			return constr_item_lp_sempred((Constr_item_lpContext)_localctx, predIndex);
		case 142:
			return bound_lp_sempred((Bound_lpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean quantifier_lp_sempred(Quantifier_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean spec_stmt_ls_sempred(Spec_stmt_lsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean body_stmt_ls_sempred(Body_stmt_lsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean in_cmd_lp_sempred(In_cmd_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean concurrent_cmd_lp_sempred(Concurrent_cmd_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean separator_opt_sempred(Separator_optContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean guarded_cmd_lp_sempred(Guarded_cmd_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_lp_sempred(Expr_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean import_list_sempred(Import_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean oper_def_lp_sempred(Oper_def_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sem_def_lp_sempred(Sem_def_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean var_def_lp_sempred(Var_def_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean id_subs_lp_sempred(Id_subs_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean id_lp_sempred(Id_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 35);
		case 16:
			return precpred(_ctx, 34);
		case 17:
			return precpred(_ctx, 32);
		case 18:
			return precpred(_ctx, 31);
		case 19:
			return precpred(_ctx, 30);
		case 20:
			return precpred(_ctx, 29);
		case 21:
			return precpred(_ctx, 28);
		case 22:
			return precpred(_ctx, 27);
		case 23:
			return precpred(_ctx, 26);
		case 24:
			return precpred(_ctx, 25);
		case 25:
			return precpred(_ctx, 24);
		case 26:
			return precpred(_ctx, 23);
		case 27:
			return precpred(_ctx, 22);
		case 28:
			return precpred(_ctx, 21);
		case 29:
			return precpred(_ctx, 20);
		case 30:
			return precpred(_ctx, 19);
		case 31:
			return precpred(_ctx, 18);
		case 32:
			return precpred(_ctx, 17);
		case 33:
			return precpred(_ctx, 16);
		case 34:
			return precpred(_ctx, 15);
		case 35:
			return precpred(_ctx, 14);
		case 36:
			return precpred(_ctx, 13);
		case 37:
			return precpred(_ctx, 12);
		case 38:
			return precpred(_ctx, 11);
		case 39:
			return precpred(_ctx, 10);
		case 40:
			return precpred(_ctx, 9);
		case 41:
			return precpred(_ctx, 8);
		case 42:
			return precpred(_ctx, 7);
		case 43:
			return precpred(_ctx, 6);
		case 44:
			return precpred(_ctx, 5);
		case 45:
			return precpred(_ctx, 4);
		case 46:
			return precpred(_ctx, 3);
		case 47:
			return precpred(_ctx, 2);
		case 48:
			return precpred(_ctx, 44);
		case 49:
			return precpred(_ctx, 40);
		case 50:
			return precpred(_ctx, 39);
		case 51:
			return precpred(_ctx, 38);
		case 52:
			return precpred(_ctx, 37);
		case 53:
			return precpred(_ctx, 36);
		case 54:
			return precpred(_ctx, 33);
		}
		return true;
	}
	private boolean constr_item_lp_sempred(Constr_item_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bound_lp_sempred(Bound_lpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008a\u0555\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u0140\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u014b\n\5\3\6\3\6\3\6\5\6\u0150\n\6\3\6\3"+
		"\6\3\6\5\6\u0155\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u0172"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u017a\n\f\f\f\16\f\u017d\13\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\5\17\u018c\n\17\3"+
		"\20\3\20\3\20\5\20\u0191\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\5\23\u019d\n\23\3\24\3\24\3\24\3\24\5\24\u01a3\n\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u01ab\n\25\3\26\3\26\3\26\3\26\5\26\u01b1"+
		"\n\26\3\27\3\27\5\27\u01b5\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u01bc\n"+
		"\30\3\30\3\30\3\30\7\30\u01c1\n\30\f\30\16\30\u01c4\13\30\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u01cb\n\31\3\31\7\31\u01ce\n\31\f\31\16\31\u01d1\13"+
		"\31\3\32\3\32\3\32\3\32\5\32\u01d7\n\32\3\33\3\33\5\33\u01db\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u01e3\n\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\5\37\u01f1\n\37\3 \3 \5 \u01f5\n \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u020b\n!\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\7)\u022e\n)\f)\16)\u0231\13)\3*"+
		"\3*\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\5,\u0241\n,\3-\3-\3-\5-\u0246"+
		"\n-\3.\3.\3.\3.\3.\5.\u024d\n.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0262\n\62\f\62"+
		"\16\62\u0265\13\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\7"+
		"\64\u0271\n\64\f\64\16\64\u0274\13\64\3\65\3\65\3\65\5\65\u0279\n\65\3"+
		"\66\3\66\3\66\5\66\u027e\n\66\3\67\3\67\3\67\38\38\38\38\38\58\u0288\n"+
		"8\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3"+
		"=\3>\3>\3>\3>\3>\3>\7>\u02a7\n>\f>\16>\u02aa\13>\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\5?\u02b4\n?\3@\3@\3@\3@\3@\5@\u02bb\n@\3A\3A\3A\3A\3B\3B\5B\u02c3"+
		"\nB\3C\3C\3C\3C\3C\3C\7C\u02cb\nC\fC\16C\u02ce\13C\3D\3D\3E\3E\3E\3E\3"+
		"F\3F\5F\u02d8\nF\3G\3G\3G\3G\3G\3G\3G\3G\5G\u02e2\nG\3H\3H\3H\3H\3H\3"+
		"H\3H\3H\5H\u02ec\nH\3I\3I\5I\u02f0\nI\3J\3J\3J\3K\3K\3K\3L\3L\3L\3L\3"+
		"L\3L\7L\u02fe\nL\fL\16L\u0301\13L\3M\3M\3M\3M\3M\5M\u0308\nM\3N\3N\3N"+
		"\3N\3N\3N\3O\3O\3O\3O\5O\u0314\nO\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u031f"+
		"\nQ\fQ\16Q\u0322\13Q\3R\3R\3R\3R\3R\3R\3R\5R\u032b\nR\3S\3S\5S\u032f\n"+
		"S\3T\3T\3U\3U\3U\3U\3U\3V\3V\3V\3W\3W\3W\3W\3W\3W\7W\u0341\nW\fW\16W\u0344"+
		"\13W\3X\3X\3X\3X\3Y\3Y\3Y\5Y\u034d\nY\3Z\3Z\5Z\u0351\nZ\3[\3[\3[\3[\3"+
		"[\5[\u0358\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0362\n\\\3]\3]\3]\3"+
		"]\5]\u0368\n]\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3`\3`\3`\3a\3a\3a\3a\3a\5"+
		"a\u037c\na\3b\3b\3b\3b\5b\u0382\nb\3c\3c\3d\3d\3d\3d\3d\3d\3d\3d\5d\u038e"+
		"\nd\3e\3e\3f\3f\3f\3f\3f\5f\u0397\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g"+
		"\u03a3\ng\3h\3h\5h\u03a7\nh\3i\3i\3i\3j\3j\3j\3j\3j\3k\3k\5k\u03b3\nk"+
		"\3l\3l\3m\3m\3n\3n\3n\3n\3n\3n\7n\u03bf\nn\fn\16n\u03c2\13n\3o\3o\3o\3"+
		"p\3p\3p\3p\3p\3p\3p\3p\3p\5p\u03d0\np\3q\3q\3q\3r\3r\3r\3r\3r\3r\7r\u03db"+
		"\nr\fr\16r\u03de\13r\3s\3s\3s\5s\u03e3\ns\3t\3t\3u\3u\3u\3u\3u\3u\7u\u03ed"+
		"\nu\fu\16u\u03f0\13u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3{\3{\3{\3{\3"+
		"{\3{\3{\3{\3{\3{\3{\3{\5{\u040a\n{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3"+
		"{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3"+
		"{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3"+
		"{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3"+
		"{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3"+
		"{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\7{\u0484\n{\f{\16{\u0487"+
		"\13{\3|\3|\3}\3}\3~\3~\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0081"+
		"\3\u0081\3\u0081\5\u0081\u0499\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u04a5\n\u0083"+
		"\f\u0083\16\u0083\u04a8\13\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\5\u0084\u04b0\n\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u04d7\n\u0085\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087"+
		"\u04e2\n\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\5\u008a\u04ee\n\u008a\3\u008b\3\u008b\3\u008b"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\5\u008c\u04fe\n\u008c\3\u008d\3\u008d\5\u008d\u0502\n"+
		"\u008d\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0508\n\u008e\3\u008f\3"+
		"\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\7\u0090\u0514\n\u0090\f\u0090\16\u0090\u0517\13\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\5\u0091\u051e\n\u0091\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\5\u0092\u0524\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\5\u0093\u052e\n\u0093\3\u0094\3\u0094\3\u0094"+
		"\3\u0095\3\u0095\5\u0095\u0535\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097"+
		"\3\u0097\3\u0098\5\u0098\u053d\n\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\5\u0098\u0543\n\u0098\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0549\n"+
		"\u0099\3\u009a\3\u009a\5\u009a\u054d\n\u009a\3\u009b\3\u009b\5\u009b\u0551"+
		"\n\u009b\3\u009c\3\u009c\3\u009c\2\23\26.\60Pbfz\u0084\u0096\u00a0\u00ac"+
		"\u00da\u00e2\u00e8\u00f4\u0104\u011e\u009d\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126"+
		"\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\2\7\4\2FFHH\4\2\4\4M"+
		"M\3\2pt\3\2OU\4\2||\u0086\u0086\2\u0582\2\u0138\3\2\2\2\4\u013f\3\2\2"+
		"\2\6\u0141\3\2\2\2\b\u014a\3\2\2\2\n\u014c\3\2\2\2\f\u0156\3\2\2\2\16"+
		"\u0158\3\2\2\2\20\u015f\3\2\2\2\22\u0166\3\2\2\2\24\u0171\3\2\2\2\26\u0173"+
		"\3\2\2\2\30\u017e\3\2\2\2\32\u0186\3\2\2\2\34\u018b\3\2\2\2\36\u0190\3"+
		"\2\2\2 \u0192\3\2\2\2\"\u0194\3\2\2\2$\u019c\3\2\2\2&\u01a2\3\2\2\2(\u01aa"+
		"\3\2\2\2*\u01b0\3\2\2\2,\u01b4\3\2\2\2.\u01b6\3\2\2\2\60\u01c5\3\2\2\2"+
		"\62\u01d6\3\2\2\2\64\u01da\3\2\2\2\66\u01e2\3\2\2\28\u01e4\3\2\2\2:\u01e9"+
		"\3\2\2\2<\u01f0\3\2\2\2>\u01f4\3\2\2\2@\u020a\3\2\2\2B\u020c\3\2\2\2D"+
		"\u0211\3\2\2\2F\u0214\3\2\2\2H\u0217\3\2\2\2J\u021a\3\2\2\2L\u021d\3\2"+
		"\2\2N\u0222\3\2\2\2P\u0227\3\2\2\2R\u0232\3\2\2\2T\u0239\3\2\2\2V\u0240"+
		"\3\2\2\2X\u0245\3\2\2\2Z\u024c\3\2\2\2\\\u024e\3\2\2\2^\u0252\3\2\2\2"+
		"`\u0257\3\2\2\2b\u025b\3\2\2\2d\u0266\3\2\2\2f\u026b\3\2\2\2h\u0278\3"+
		"\2\2\2j\u027d\3\2\2\2l\u027f\3\2\2\2n\u0287\3\2\2\2p\u0289\3\2\2\2r\u028c"+
		"\3\2\2\2t\u0290\3\2\2\2v\u0295\3\2\2\2x\u029a\3\2\2\2z\u02a0\3\2\2\2|"+
		"\u02b3\3\2\2\2~\u02ba\3\2\2\2\u0080\u02bc\3\2\2\2\u0082\u02c2\3\2\2\2"+
		"\u0084\u02c4\3\2\2\2\u0086\u02cf\3\2\2\2\u0088\u02d1\3\2\2\2\u008a\u02d7"+
		"\3\2\2\2\u008c\u02e1\3\2\2\2\u008e\u02eb\3\2\2\2\u0090\u02ef\3\2\2\2\u0092"+
		"\u02f1\3\2\2\2\u0094\u02f4\3\2\2\2\u0096\u02f7\3\2\2\2\u0098\u0307\3\2"+
		"\2\2\u009a\u0309\3\2\2\2\u009c\u0313\3\2\2\2\u009e\u0315\3\2\2\2\u00a0"+
		"\u0318\3\2\2\2\u00a2\u032a\3\2\2\2\u00a4\u032e\3\2\2\2\u00a6\u0330\3\2"+
		"\2\2\u00a8\u0332\3\2\2\2\u00aa\u0337\3\2\2\2\u00ac\u033a\3\2\2\2\u00ae"+
		"\u0345\3\2\2\2\u00b0\u034c\3\2\2\2\u00b2\u0350\3\2\2\2\u00b4\u0357\3\2"+
		"\2\2\u00b6\u0361\3\2\2\2\u00b8\u0367\3\2\2\2\u00ba\u0369\3\2\2\2\u00bc"+
		"\u036e\3\2\2\2\u00be\u0373\3\2\2\2\u00c0\u037b\3\2\2\2\u00c2\u0381\3\2"+
		"\2\2\u00c4\u0383\3\2\2\2\u00c6\u038d\3\2\2\2\u00c8\u038f\3\2\2\2\u00ca"+
		"\u0396\3\2\2\2\u00cc\u03a2\3\2\2\2\u00ce\u03a6\3\2\2\2\u00d0\u03a8\3\2"+
		"\2\2\u00d2\u03ab\3\2\2\2\u00d4\u03b2\3\2\2\2\u00d6\u03b4\3\2\2\2\u00d8"+
		"\u03b6\3\2\2\2\u00da\u03b8\3\2\2\2\u00dc\u03c3\3\2\2\2\u00de\u03cf\3\2"+
		"\2\2\u00e0\u03d1\3\2\2\2\u00e2\u03d4\3\2\2\2\u00e4\u03e2\3\2\2\2\u00e6"+
		"\u03e4\3\2\2\2\u00e8\u03e6\3\2\2\2\u00ea\u03f1\3\2\2\2\u00ec\u03f3\3\2"+
		"\2\2\u00ee\u03f5\3\2\2\2\u00f0\u03f7\3\2\2\2\u00f2\u03f9\3\2\2\2\u00f4"+
		"\u0409\3\2\2\2\u00f6\u0488\3\2\2\2\u00f8\u048a\3\2\2\2\u00fa\u048c\3\2"+
		"\2\2\u00fc\u0490\3\2\2\2\u00fe\u0493\3\2\2\2\u0100\u0498\3\2\2\2\u0102"+
		"\u049a\3\2\2\2\u0104\u049e\3\2\2\2\u0106\u04af\3\2\2\2\u0108\u04d6\3\2"+
		"\2\2\u010a\u04d8\3\2\2\2\u010c\u04e1\3\2\2\2\u010e\u04e3\3\2\2\2\u0110"+
		"\u04e5\3\2\2\2\u0112\u04ed\3\2\2\2\u0114\u04ef\3\2\2\2\u0116\u04fd\3\2"+
		"\2\2\u0118\u0501\3\2\2\2\u011a\u0507\3\2\2\2\u011c\u0509\3\2\2\2\u011e"+
		"\u050d\3\2\2\2\u0120\u051d\3\2\2\2\u0122\u0523\3\2\2\2\u0124\u052d\3\2"+
		"\2\2\u0126\u052f\3\2\2\2\u0128\u0534\3\2\2\2\u012a\u0536\3\2\2\2\u012c"+
		"\u0538\3\2\2\2\u012e\u0542\3\2\2\2\u0130\u0548\3\2\2\2\u0132\u054c\3\2"+
		"\2\2\u0134\u0550\3\2\2\2\u0136\u0552\3\2\2\2\u0138\u0139\5\4\3\2\u0139"+
		"\3\3\2\2\2\u013a\u0140\5\6\4\2\u013b\u0140\5\n\6\2\u013c\u0140\5\f\7\2"+
		"\u013d\u0140\5\16\b\2\u013e\u0140\5\u012a\u0096\2\u013f\u013a\3\2\2\2"+
		"\u013f\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e"+
		"\3\2\2\2\u0140\5\3\2\2\2\u0141\u0142\7f\2\2\u0142\u0143\7\u0086\2\2\u0143"+
		"\u0144\5.\30\2\u0144\u0145\5(\25\2\u0145\7\3\2\2\2\u0146\u0147\7f\2\2"+
		"\u0147\u014b\7\u0086\2\2\u0148\u0149\7g\2\2\u0149\u014b\7\u0086\2\2\u014a"+
		"\u0146\3\2\2\2\u014a\u0148\3\2\2\2\u014b\t\3\2\2\2\u014c\u014d\7g\2\2"+
		"\u014d\u014f\7\u0086\2\2\u014e\u0150\5\u0088E\2\u014f\u014e\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\5.\30\2\u0152\u0154\5("+
		"\25\2\u0153\u0155\5\u0126\u0094\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\13\3\2\2\2\u0156\u0157\5(\25\2\u0157\r\3\2\2\2\u0158\u0159"+
		"\7i\2\2\u0159\u015a\7\u0086\2\2\u015a\u015b\5\"\22\2\u015b\u015c\5.\30"+
		"\2\u015c\u015d\5(\25\2\u015d\u015e\5\u0126\u0094\2\u015e\17\3\2\2\2\u015f"+
		"\u0160\7C\2\2\u0160\u0161\7\u0086\2\2\u0161\u0162\5 \21\2\u0162\u0163"+
		"\5\24\13\2\u0163\u0164\5\u012a\u0096\2\u0164\u0165\5\u0126\u0094\2\u0165"+
		"\21\3\2\2\2\u0166\u0167\7D\2\2\u0167\u0168\7\u0086\2\2\u0168\u0169\5\u0114"+
		"\u008b\2\u0169\u016a\5\u012a\u0096\2\u016a\u016b\5\u0126\u0094\2\u016b"+
		"\23\3\2\2\2\u016c\u0172\5\u0136\u009c\2\u016d\u016e\7\20\2\2\u016e\u016f"+
		"\5\26\f\2\u016f\u0170\7\21\2\2\u0170\u0172\3\2\2\2\u0171\u016c\3\2\2\2"+
		"\u0171\u016d\3\2\2\2\u0172\25\3\2\2\2\u0173\u0174\b\f\1\2\u0174\u0175"+
		"\5\30\r\2\u0175\u017b\3\2\2\2\u0176\u0177\f\3\2\2\u0177\u0178\7\22\2\2"+
		"\u0178\u017a\5\30\r\2\u0179\u0176\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\27\3\2\2\2\u017d\u017b\3\2\2\2\u017e"+
		"\u017f\7\u0086\2\2\u017f\u0180\7\n\2\2\u0180\u0181\5\u00f4{\2\u0181\u0182"+
		"\5\32\16\2\u0182\u0183\5\u00f4{\2\u0183\u0184\5\34\17\2\u0184\u0185\5"+
		"\36\20\2\u0185\31\3\2\2\2\u0186\u0187\t\2\2\2\u0187\33\3\2\2\2\u0188\u018c"+
		"\5\u0136\u009c\2\u0189\u018a\7E\2\2\u018a\u018c\5\u00f4{\2\u018b\u0188"+
		"\3\2\2\2\u018b\u0189\3\2\2\2\u018c\35\3\2\2\2\u018d\u0191\5\u0136\u009c"+
		"\2\u018e\u018f\7G\2\2\u018f\u0191\5\u00f4{\2\u0190\u018d\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\37\3\2\2\2\u0192\u0193\5\u0136\u009c\2\u0193!\3\2"+
		"\2\2\u0194\u0195\7\20\2\2\u0195\u0196\5\u0132\u009a\2\u0196\u0197\7\21"+
		"\2\2\u0197\u0198\5$\23\2\u0198#\3\2\2\2\u0199\u019d\5\u0136\u009c\2\u019a"+
		"\u019b\7z\2\2\u019b\u019d\7\u0086\2\2\u019c\u0199\3\2\2\2\u019c\u019a"+
		"\3\2\2\2\u019d%\3\2\2\2\u019e\u01a3\5\u0090I\2\u019f\u01a3\5\u0092J\2"+
		"\u01a0\u01a3\5\62\32\2\u01a1\u01a3\5\u0098M\2\u01a2\u019e\3\2\2\2\u01a2"+
		"\u019f\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\'\3\2\2\2"+
		"\u01a4\u01ab\5\u0136\u009c\2\u01a5\u01a6\7h\2\2\u01a6\u01a7\7\u0086\2"+
		"\2\u01a7\u01a8\5,\27\2\u01a8\u01a9\5*\26\2\u01a9\u01ab\3\2\2\2\u01aa\u01a4"+
		"\3\2\2\2\u01aa\u01a5\3\2\2\2\u01ab)\3\2\2\2\u01ac\u01ad\5\60\31\2\u01ad"+
		"\u01ae\5\u0126\u0094\2\u01ae\u01b1\3\2\2\2\u01af\u01b1\7o\2\2\u01b0\u01ac"+
		"\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1+\3\2\2\2\u01b2\u01b5\5\u0086D\2\u01b3"+
		"\u01b5\5\u0136\u009c\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5-"+
		"\3\2\2\2\u01b6\u01b7\b\30\1\2\u01b7\u01b8\5&\24\2\u01b8\u01c2\3\2\2\2"+
		"\u01b9\u01bb\f\4\2\2\u01ba\u01bc\7\13\2\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c1\5&\24\2\u01be\u01bf\f\3\2\2\u01bf"+
		"\u01c1\5&\24\2\u01c0\u01b9\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c4\3\2"+
		"\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3/\3\2\2\2\u01c4\u01c2"+
		"\3\2\2\2\u01c5\u01c6\b\31\1\2\u01c6\u01c7\5\62\32\2\u01c7\u01cf\3\2\2"+
		"\2\u01c8\u01ca\f\3\2\2\u01c9\u01cb\7\13\2\2\u01ca\u01c9\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\5\62\32\2\u01cd\u01c8\3"+
		"\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\61\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d7\5\u0090I\2\u01d3\u01d7\5\u00f4"+
		"{\2\u01d4\u01d7\5\66\34\2\u01d5\u01d7\5\u0092J\2\u01d6\u01d2\3\2\2\2\u01d6"+
		"\u01d3\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\63\3\2\2"+
		"\2\u01d8\u01db\7\13\2\2\u01d9\u01db\5\u0136\u009c\2\u01da\u01d8\3\2\2"+
		"\2\u01da\u01d9\3\2\2\2\u01db\65\3\2\2\2\u01dc\u01e3\5@!\2\u01dd\u01e3"+
		"\5\16\b\2\u01de\u01e3\5\20\t\2\u01df\u01e3\5\22\n\2\u01e0\u01e3\58\35"+
		"\2\u01e1\u01e3\5:\36\2\u01e2\u01dc\3\2\2\2\u01e2\u01dd\3\2\2\2\u01e2\u01de"+
		"\3\2\2\2\u01e2\u01df\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3"+
		"\67\3\2\2\2\u01e4\u01e5\7\u0084\2\2\u01e5\u01e6\5\u012a\u0096\2\u01e6"+
		"\u01e7\7e\2\2\u01e7\u01e8\5> \2\u01e89\3\2\2\2\u01e9\u01ea\7\u0085\2\2"+
		"\u01ea\u01eb\5\u012a\u0096\2\u01eb\u01ec\7e\2\2\u01ec\u01ed\5<\37\2\u01ed"+
		";\3\2\2\2\u01ee\u01f1\5\u0136\u009c\2\u01ef\u01f1\7\u0085\2\2\u01f0\u01ee"+
		"\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1=\3\2\2\2\u01f2\u01f5\5\u0136\u009c"+
		"\2\u01f3\u01f5\7\u0084\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5"+
		"?\3\2\2\2\u01f6\u020b\5\u00eav\2\u01f7\u020b\5D#\2\u01f8\u020b\5\u00ec"+
		"w\2\u01f9\u020b\5\u00eex\2\u01fa\u020b\5\u00f0y\2\u01fb\u020b\5\u00f2"+
		"z\2\u01fc\u020b\5B\"\2\u01fd\u020b\5F$\2\u01fe\u020b\5H%\2\u01ff\u020b"+
		"\5J&\2\u0200\u020b\5p9\2\u0201\u020b\5r:\2\u0202\u020b\5t;\2\u0203\u020b"+
		"\5v<\2\u0204\u020b\5x=\2\u0205\u020b\5L\'\2\u0206\u020b\5N(\2\u0207\u020b"+
		"\5\\/\2\u0208\u020b\5^\60\2\u0209\u020b\5`\61\2\u020a\u01f6\3\2\2\2\u020a"+
		"\u01f7\3\2\2\2\u020a\u01f8\3\2\2\2\u020a\u01f9\3\2\2\2\u020a\u01fa\3\2"+
		"\2\2\u020a\u01fb\3\2\2\2\u020a\u01fc\3\2\2\2\u020a\u01fd\3\2\2\2\u020a"+
		"\u01fe\3\2\2\2\u020a\u01ff\3\2\2\2\u020a\u0200\3\2\2\2\u020a\u0201\3\2"+
		"\2\2\u020a\u0202\3\2\2\2\u020a\u0203\3\2\2\2\u020a\u0204\3\2\2\2\u020a"+
		"\u0205\3\2\2\2\u020a\u0206\3\2\2\2\u020a\u0207\3\2\2\2\u020a\u0208\3\2"+
		"\2\2\u020a\u0209\3\2\2\2\u020bA\3\2\2\2\u020c\u020d\7\u0086\2\2\u020d"+
		"\u020e\7\20\2\2\u020e\u020f\5\u011e\u0090\2\u020f\u0210\7\21\2\2\u0210"+
		"C\3\2\2\2\u0211\u0212\7~\2\2\u0212\u0213\5n8\2\u0213E\3\2\2\2\u0214\u0215"+
		"\7`\2\2\u0215\u0216\5l\67\2\u0216G\3\2\2\2\u0217\u0218\7a\2\2\u0218\u0219"+
		"\5l\67\2\u0219I\3\2\2\2\u021a\u021b\7b\2\2\u021b\u021c\5l\67\2\u021cK"+
		"\3\2\2\2\u021d\u021e\7=\2\2\u021e\u021f\7\20\2\2\u021f\u0220\5\u00f4{"+
		"\2\u0220\u0221\7\21\2\2\u0221M\3\2\2\2\u0222\u0223\7>\2\2\u0223\u0224"+
		"\5P)\2\u0224\u0225\5~@\2\u0225\u0226\7?\2\2\u0226O\3\2\2\2\u0227\u0228"+
		"\b)\1\2\u0228\u0229\5R*\2\u0229\u022f\3\2\2\2\u022a\u022b\f\3\2\2\u022b"+
		"\u022c\7\27\2\2\u022c\u022e\5R*\2\u022d\u022a\3\2\2\2\u022e\u0231\3\2"+
		"\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230Q\3\2\2\2\u0231\u022f"+
		"\3\2\2\2\u0232\u0233\5\24\13\2\u0233\u0234\5T+\2\u0234\u0235\5Z.\2\u0235"+
		"\u0236\5X-\2\u0236\u0237\7\26\2\2\u0237\u0238\5\u012a\u0096\2\u0238S\3"+
		"\2\2\2\u0239\u023a\5V,\2\u023a\u023b\5\"\22\2\u023bU\3\2\2\2\u023c\u0241"+
		"\5\u00c2b\2\u023d\u023e\5\u00c2b\2\u023e\u023f\5\u011a\u008e\2\u023f\u0241"+
		"\3\2\2\2\u0240\u023c\3\2\2\2\u0240\u023d\3\2\2\2\u0241W\3\2\2\2\u0242"+
		"\u0246\5\u0136\u009c\2\u0243\u0244\7E\2\2\u0244\u0246\5\u00f4{\2\u0245"+
		"\u0242\3\2\2\2\u0245\u0243\3\2\2\2\u0246Y\3\2\2\2\u0247\u024d\5\u0136"+
		"\u009c\2\u0248\u0249\7$\2\2\u0249\u024d\5\u00f4{\2\u024a\u024b\7G\2\2"+
		"\u024b\u024d\5\u00f4{\2\u024c\u0247\3\2\2\2\u024c\u0248\3\2\2\2\u024c"+
		"\u024a\3\2\2\2\u024d[\3\2\2\2\u024e\u024f\79\2\2\u024f\u0250\5\u00f4{"+
		"\2\u0250\u0251\5\u0080A\2\u0251]\3\2\2\2\u0252\u0253\7:\2\2\u0253\u0254"+
		"\7\20\2\2\u0254\u0255\5\u00f4{\2\u0255\u0256\7\21\2\2\u0256_\3\2\2\2\u0257"+
		"\u0258\7;\2\2\u0258\u0259\5b\62\2\u0259\u025a\7<\2\2\u025aa\3\2\2\2\u025b"+
		"\u025c\b\62\1\2\u025c\u025d\5d\63\2\u025d\u0263\3\2\2\2\u025e\u025f\f"+
		"\3\2\2\u025f\u0260\7\5\2\2\u0260\u0262\5d\63\2\u0261\u025e\3\2\2\2\u0262"+
		"\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264c\3\2\2\2"+
		"\u0265\u0263\3\2\2\2\u0266\u0267\5\24\13\2\u0267\u0268\5f\64\2\u0268\u0269"+
		"\5h\65\2\u0269\u026a\5j\66\2\u026ae\3\2\2\2\u026b\u026c\b\64\1\2\u026c"+
		"\u026d\5\u0136\u009c\2\u026d\u0272\3\2\2\2\u026e\u026f\f\3\2\2\u026f\u0271"+
		"\7\13\2\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2"+
		"\u0272\u0273\3\2\2\2\u0273g\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0279\5"+
		"J&\2\u0276\u0279\5H%\2\u0277\u0279\5\u00f4{\2\u0278\u0275\3\2\2\2\u0278"+
		"\u0276\3\2\2\2\u0278\u0277\3\2\2\2\u0279i\3\2\2\2\u027a\u027e\5\u0136"+
		"\u009c\2\u027b\u027c\7\26\2\2\u027c\u027e\5\u012a\u0096\2\u027d\u027a"+
		"\3\2\2\2\u027d\u027b\3\2\2\2\u027ek\3\2\2\2\u027f\u0280\5\u00f4{\2\u0280"+
		"\u0281\5\u0080A\2\u0281m\3\2\2\2\u0282\u0288\5\u0136\u009c\2\u0283\u0284"+
		"\7\20\2\2\u0284\u0285\5\u00f4{\2\u0285\u0286\7\21\2\2\u0286\u0288\3\2"+
		"\2\2\u0287\u0282\3\2\2\2\u0287\u0283\3\2\2\2\u0288o\3\2\2\2\u0289\u028a"+
		"\7c\2\2\u028a\u028b\5\u00f4{\2\u028bq\3\2\2\2\u028c\u028d\7d\2\2\u028d"+
		"\u028e\5\u012a\u0096\2\u028e\u028f\7e\2\2\u028fs\3\2\2\2\u0290\u0291\7"+
		"W\2\2\u0291\u0292\5z>\2\u0292\u0293\5~@\2\u0293\u0294\7X\2\2\u0294u\3"+
		"\2\2\2\u0295\u0296\7Y\2\2\u0296\u0297\5z>\2\u0297\u0298\5~@\2\u0298\u0299"+
		"\7Z\2\2\u0299w\3\2\2\2\u029a\u029b\7A\2\2\u029b\u029c\5\26\f\2\u029c\u029d"+
		"\7\26\2\2\u029d\u029e\5\u012a\u0096\2\u029e\u029f\7B\2\2\u029fy\3\2\2"+
		"\2\u02a0\u02a1\b>\1\2\u02a1\u02a2\5|?\2\u02a2\u02a8\3\2\2\2\u02a3\u02a4"+
		"\f\3\2\2\u02a4\u02a5\7\27\2\2\u02a5\u02a7\5|?\2\u02a6\u02a3\3\2\2\2\u02a7"+
		"\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9{\3\2\2\2"+
		"\u02aa\u02a8\3\2\2\2\u02ab\u02ac\5\u00f4{\2\u02ac\u02ad\7@\2\2\u02ad\u02ae"+
		"\5\u012a\u0096\2\u02ae\u02b4\3\2\2\2\u02af\u02b0\5\u00f4{\2\u02b0\u02b1"+
		"\7\26\2\2\u02b1\u02b2\5\u012a\u0096\2\u02b2\u02b4\3\2\2\2\u02b3\u02ab"+
		"\3\2\2\2\u02b3\u02af\3\2\2\2\u02b4}\3\2\2\2\u02b5\u02bb\5\u0136\u009c"+
		"\2\u02b6\u02b7\7\27\2\2\u02b7\u02b8\7V\2\2\u02b8\u02b9\7\26\2\2\u02b9"+
		"\u02bb\5\u012a\u0096\2\u02ba\u02b5\3\2\2\2\u02ba\u02b6\3\2\2\2\u02bb\177"+
		"\3\2\2\2\u02bc\u02bd\7\20\2\2\u02bd\u02be\5\u0082B\2\u02be\u02bf\7\21"+
		"\2\2\u02bf\u0081\3\2\2\2\u02c0\u02c3\5\u0136\u009c\2\u02c1\u02c3\5\u0084"+
		"C\2\u02c2\u02c0\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3\u0083\3\2\2\2\u02c4"+
		"\u02c5\bC\1\2\u02c5\u02c6\5\u00f4{\2\u02c6\u02cc\3\2\2\2\u02c7\u02c8\f"+
		"\3\2\2\u02c8\u02c9\7\22\2\2\u02c9\u02cb\5\u00f4{\2\u02ca\u02c7\3\2\2\2"+
		"\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u0085"+
		"\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d0\5\u0088E\2\u02d0\u0087\3\2\2"+
		"\2\u02d1\u02d2\7\20\2\2\u02d2\u02d3\5\u008aF\2\u02d3\u02d4\7\21\2\2\u02d4"+
		"\u0089\3\2\2\2\u02d5\u02d8\5\u0136\u009c\2\u02d6\u02d8\5\u008cG\2\u02d7"+
		"\u02d5\3\2\2\2\u02d7\u02d6\3\2\2\2\u02d8\u008b\3\2\2\2\u02d9\u02e2\5\u008e"+
		"H\2\u02da\u02db\5\u008eH\2\u02db\u02dc\7\13\2\2\u02dc\u02e2\3\2\2\2\u02dd"+
		"\u02de\5\u008eH\2\u02de\u02df\7\13\2\2\u02df\u02e0\5\u008cG\2\u02e0\u02e2"+
		"\3\2\2\2\u02e1\u02d9\3\2\2\2\u02e1\u02da\3\2\2\2\u02e1\u02dd\3\2\2\2\u02e2"+
		"\u008d\3\2\2\2\u02e3\u02e4\5\u00caf\2\u02e4\u02e5\5\u00b4[\2\u02e5\u02ec"+
		"\3\2\2\2\u02e6\u02e7\5\u00caf\2\u02e7\u02e8\5\u00e2r\2\u02e8\u02e9\7\24"+
		"\2\2\u02e9\u02ea\5\u00b4[\2\u02ea\u02ec\3\2\2\2\u02eb\u02e3\3\2\2\2\u02eb"+
		"\u02e6\3\2\2\2\u02ec\u008f\3\2\2\2\u02ed\u02f0\5\u0098M\2\u02ee\u02f0"+
		"\5\u0094K\2\u02ef\u02ed\3\2\2\2\u02ef\u02ee\3\2\2\2\u02f0\u0091\3\2\2"+
		"\2\u02f1\u02f2\7v\2\2\u02f2\u02f3\5\u0096L\2\u02f3\u0093\3\2\2\2\u02f4"+
		"\u02f5\7w\2\2\u02f5\u02f6\5\u0096L\2\u02f6\u0095\3\2\2\2\u02f7\u02f8\b"+
		"L\1\2\u02f8\u02f9\7\u0086\2\2\u02f9\u02ff\3\2\2\2\u02fa\u02fb\f\3\2\2"+
		"\u02fb\u02fc\7\22\2\2\u02fc\u02fe\7\u0086\2\2\u02fd\u02fa\3\2\2\2\u02fe"+
		"\u0301\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0097\3\2"+
		"\2\2\u0301\u02ff\3\2\2\2\u0302\u0308\5\u009aN\2\u0303\u0308\5\u00d0i\2"+
		"\u0304\u0308\5\u00a8U\2\u0305\u0308\5\u00aaV\2\u0306\u0308\5\u009eP\2"+
		"\u0307\u0302\3\2\2\2\u0307\u0303\3\2\2\2\u0307\u0304\3\2\2\2\u0307\u0305"+
		"\3\2\2\2\u0307\u0306\3\2\2\2\u0308\u0099\3\2\2\2\u0309\u030a\7j\2\2\u030a"+
		"\u030b\7\u0086\2\2\u030b\u030c\7\25\2\2\u030c\u030d\5\u00b4[\2\u030d\u030e"+
		"\5\u009cO\2\u030e\u009b\3\2\2\2\u030f\u0314\5\u0136\u009c\2\u0310\u0311"+
		"\7\16\2\2\u0311\u0312\7\u0086\2\2\u0312\u0314\7\17\2\2\u0313\u030f\3\2"+
		"\2\2\u0313\u0310\3\2\2\2\u0314\u009d\3\2\2\2\u0315\u0316\5\u00a6T\2\u0316"+
		"\u0317\5\u00a0Q\2\u0317\u009f\3\2\2\2\u0318\u0319\bQ\1\2\u0319\u031a\5"+
		"\u00a2R\2\u031a\u0320\3\2\2\2\u031b\u031c\f\3\2\2\u031c\u031d\7\22\2\2"+
		"\u031d\u031f\5\u00a2R\2\u031e\u031b\3\2\2\2\u031f\u0322\3\2\2\2\u0320"+
		"\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u00a1\3\2\2\2\u0322\u0320\3\2"+
		"\2\2\u0323\u0324\5\u00e2r\2\u0324\u0325\5\u0110\u0089\2\u0325\u032b\3"+
		"\2\2\2\u0326\u0327\5\u00e2r\2\u0327\u0328\5\u00a4S\2\u0328\u0329\5\u00c2"+
		"b\2\u0329\u032b\3\2\2\2\u032a\u0323\3\2\2\2\u032a\u0326\3\2\2\2\u032b"+
		"\u00a3\3\2\2\2\u032c\u032f\5\u0136\u009c\2\u032d\u032f\7\24\2\2\u032e"+
		"\u032c\3\2\2\2\u032e\u032d\3\2\2\2\u032f\u00a5\3\2\2\2\u0330\u0331\t\3"+
		"\2\2\u0331\u00a7\3\2\2\2\u0332\u0333\78\2\2\u0333\u0334\7\u0086\2\2\u0334"+
		"\u0335\5\u00b2Z\2\u0335\u0336\5\u0110\u0089\2\u0336\u00a9\3\2\2\2\u0337"+
		"\u0338\7L\2\2\u0338\u0339\5\u00acW\2\u0339\u00ab\3\2\2\2\u033a\u033b\b"+
		"W\1\2\u033b\u033c\5\u00aeX\2\u033c\u0342\3\2\2\2\u033d\u033e\f\3\2\2\u033e"+
		"\u033f\7\22\2\2\u033f\u0341\5\u00aeX\2\u0340\u033d\3\2\2\2\u0341\u0344"+
		"\3\2\2\2\u0342\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u00ad\3\2\2\2\u0344"+
		"\u0342\3\2\2\2\u0345\u0346\5\u00e4s\2\u0346\u0347\5\u010e\u0088\2\u0347"+
		"\u0348\5\u00b0Y\2\u0348\u00af\3\2\2\2\u0349\u034d\5\u0136\u009c\2\u034a"+
		"\u034b\7\n\2\2\u034b\u034d\5\u00f4{\2\u034c\u0349\3\2\2\2\u034c\u034a"+
		"\3\2\2\2\u034d\u00b1\3\2\2\2\u034e\u0351\5\u0136\u009c\2\u034f\u0351\7"+
		"\25\2\2\u0350\u034e\3\2\2\2\u0350\u034f\3\2\2\2\u0351\u00b3\3\2\2\2\u0352"+
		"\u0353\5\u011a\u008e\2\u0353\u0354\5\u00b6\\\2\u0354\u0358\3\2\2\2\u0355"+
		"\u0358\5\u00b6\\\2\u0356\u0358\5@!\2\u0357\u0352\3\2\2\2\u0357\u0355\3"+
		"\2\2\2\u0357\u0356\3\2\2\2\u0358\u00b5\3\2\2\2\u0359\u0362\5\u00c4c\2"+
		"\u035a\u0362\5\u00ccg\2\u035b\u0362\5\u00d2j\2\u035c\u0362\5\u00b8]\2"+
		"\u035d\u0362\5\u00bc_\2\u035e\u0362\5\u00ba^\2\u035f\u0362\5\u00be`\2"+
		"\u0360\u0362\5\u00c2b\2\u0361\u0359\3\2\2\2\u0361\u035a\3\2\2\2\u0361"+
		"\u035b\3\2\2\2\u0361\u035c\3\2\2\2\u0361\u035d\3\2\2\2\u0361\u035e\3\2"+
		"\2\2\u0361\u035f\3\2\2\2\u0361\u0360\3\2\2\2\u0362\u00b7\3\2\2\2\u0363"+
		"\u0364\7\177\2\2\u0364\u0368\5\u00b4[\2\u0365\u0366\7\177\2\2\u0366\u0368"+
		"\7\u0082\2\2\u0367\u0363\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u00b9\3\2\2"+
		"\2\u0369\u036a\7\u0081\2\2\u036a\u036b\7\20\2\2\u036b\u036c\5\u00c6d\2"+
		"\u036c\u036d\7\21\2\2\u036d\u00bb\3\2\2\2\u036e\u036f\7\u0080\2\2\u036f"+
		"\u0370\7\20\2\2\u0370\u0371\5\u00c6d\2\u0371\u0372\7\21\2\2\u0372\u00bd"+
		"\3\2\2\2\u0373\u0374\7\u0083\2\2\u0374\u0375\5\u00c0a\2\u0375\u00bf\3"+
		"\2\2\2\u0376\u037c\5\u00c2b\2\u0377\u037c\5\u0110\u0089\2\u0378\u0379"+
		"\7L\2\2\u0379\u037c\5\u010e\u0088\2\u037a\u037c\7|\2\2\u037b\u0376\3\2"+
		"\2\2\u037b\u0377\3\2\2\2\u037b\u0378\3\2\2\2\u037b\u037a\3\2\2\2\u037c"+
		"\u00c1\3\2\2\2\u037d\u0382\7\u0086\2\2\u037e\u037f\7\u0086\2\2\u037f\u0380"+
		"\7\6\2\2\u0380\u0382\7\u0086\2\2\u0381\u037d\3\2\2\2\u0381\u037e\3\2\2"+
		"\2\u0382\u00c3\3\2\2\2\u0383\u0384\t\4\2\2\u0384\u00c5\3\2\2\2\u0385\u038e"+
		"\5\u00c8e\2\u0386\u0387\5\u00c8e\2\u0387\u0388\7\13\2\2\u0388\u0389\5"+
		"\u00c6d\2\u0389\u038e\3\2\2\2\u038a\u038b\5\u00c8e\2\u038b\u038c\7\13"+
		"\2\2\u038c\u038e\3\2\2\2\u038d\u0385\3\2\2\2\u038d\u0386\3\2\2\2\u038d"+
		"\u038a\3\2\2\2\u038e\u00c7\3\2\2\2\u038f\u0390\5\u00dan\2\u0390\u00c9"+
		"\3\2\2\2\u0391\u0397\5\u0136\u009c\2\u0392\u0397\7k\2\2\u0393\u0397\7"+
		"l\2\2\u0394\u0397\7m\2\2\u0395\u0397\7n\2\2\u0396\u0391\3\2\2\2\u0396"+
		"\u0392\3\2\2\2\u0396\u0393\3\2\2\2\u0396\u0394\3\2\2\2\u0396\u0395\3\2"+
		"\2\2\u0397\u00cb\3\2\2\2\u0398\u0399\7u\2\2\u0399\u039a\7\f\2\2\u039a"+
		"\u039b\5\u00ceh\2\u039b\u039c\7\r\2\2\u039c\u03a3\3\2\2\2\u039d\u039e"+
		"\7u\2\2\u039e\u039f\7\20\2\2\u039f\u03a0\5\u00ceh\2\u03a0\u03a1\7\21\2"+
		"\2\u03a1\u03a3\3\2\2\2\u03a2\u0398\3\2\2\2\u03a2\u039d\3\2\2\2\u03a3\u00cd"+
		"\3\2\2\2\u03a4\u03a7\5\u00f4{\2\u03a5\u03a7\7\23\2\2\u03a6\u03a4\3\2\2"+
		"\2\u03a6\u03a5\3\2\2\2\u03a7\u00cf\3\2\2\2\u03a8\u03a9\5\u00d4k\2\u03a9"+
		"\u03aa\5\u00dan\2\u03aa\u00d1\3\2\2\2\u03ab\u03ac\7y\2\2\u03ac\u03ad\7"+
		"\20\2\2\u03ad\u03ae\5\u00e8u\2\u03ae\u03af\7\21\2\2\u03af\u00d3\3\2\2"+
		"\2\u03b0\u03b3\5\u00d6l\2\u03b1\u03b3\5\u00d8m\2\u03b2\u03b0\3\2\2\2\u03b2"+
		"\u03b1\3\2\2\2\u03b3\u00d5\3\2\2\2\u03b4\u03b5\7l\2\2\u03b5\u00d7\3\2"+
		"\2\2\u03b6\u03b7\7x\2\2\u03b7\u00d9\3\2\2\2\u03b8\u03b9\bn\1\2\u03b9\u03ba"+
		"\5\u00dco\2\u03ba\u03c0\3\2\2\2\u03bb\u03bc\f\3\2\2\u03bc\u03bd\7\22\2"+
		"\2\u03bd\u03bf\5\u00dco\2\u03be\u03bb\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0"+
		"\u03be\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u00db\3\2\2\2\u03c2\u03c0\3\2"+
		"\2\2\u03c3\u03c4\5\u00e2r\2\u03c4\u03c5\5\u00dep\2\u03c5\u00dd\3\2\2\2"+
		"\u03c6\u03c7\7\24\2\2\u03c7\u03d0\5\u00b4[\2\u03c8\u03c9\7\24\2\2\u03c9"+
		"\u03ca\5\u00b4[\2\u03ca\u03cb\7\n\2\2\u03cb\u03cc\5\u00f4{\2\u03cc\u03d0"+
		"\3\2\2\2\u03cd\u03d0\5\u00e0q\2\u03ce\u03d0\7\13\2\2\u03cf\u03c6\3\2\2"+
		"\2\u03cf\u03c8\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03ce\3\2\2\2\u03d0\u00df"+
		"\3\2\2\2\u03d1\u03d2\7\n\2\2\u03d2\u03d3\5\u00f4{\2\u03d3\u00e1\3\2\2"+
		"\2\u03d4\u03d5\br\1\2\u03d5\u03d6\5\u00e4s\2\u03d6\u03dc\3\2\2\2\u03d7"+
		"\u03d8\f\3\2\2\u03d8\u03d9\7\22\2\2\u03d9\u03db\5\u00e4s\2\u03da\u03d7"+
		"\3\2\2\2\u03db\u03de\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd"+
		"\u00e3\3\2\2\2\u03de\u03dc\3\2\2\2\u03df\u03e3\5\u00e6t\2\u03e0\u03e1"+
		"\7\u0086\2\2\u03e1\u03e3\5\u011a\u008e\2\u03e2\u03df\3\2\2\2\u03e2\u03e0"+
		"\3\2\2\2\u03e3\u00e5\3\2\2\2\u03e4\u03e5\7\u0086\2\2\u03e5\u00e7\3\2\2"+
		"\2\u03e6\u03e7\bu\1\2\u03e7\u03e8\7\u0086\2\2\u03e8\u03ee\3\2\2\2\u03e9"+
		"\u03ea\f\3\2\2\u03ea\u03eb\7\22\2\2\u03eb\u03ed\7\u0086\2\2\u03ec\u03e9"+
		"\3\2\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"\u00e9\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03f2\7[\2\2\u03f2\u00eb\3\2"+
		"\2\2\u03f3\u03f4\7\\\2\2\u03f4\u00ed\3\2\2\2\u03f5\u03f6\7]\2\2\u03f6"+
		"\u00ef\3\2\2\2\u03f7\u03f8\7^\2\2\u03f8\u00f1\3\2\2\2\u03f9\u03fa\7_\2"+
		"\2\u03fa\u00f3\3\2\2\2\u03fb\u03fc\b{\1\2\u03fc\u040a\7\u0086\2\2\u03fd"+
		"\u040a\5\u00f6|\2\u03fe\u040a\7\u0087\2\2\u03ff\u040a\5\u00f8}\2\u0400"+
		"\u0401\5\u0102\u0082\2\u0401\u0402\5\u00f4{-\u0402\u040a\3\2\2\2\u0403"+
		"\u0404\7\20\2\2\u0404\u0405\5\u0104\u0083\2\u0405\u0406\7\21\2\2\u0406"+
		"\u040a\3\2\2\2\u0407\u040a\5\u0108\u0085\2\u0408\u040a\5\u00fa~\2\u0409"+
		"\u03fb\3\2\2\2\u0409\u03fd\3\2\2\2\u0409\u03fe\3\2\2\2\u0409\u03ff\3\2"+
		"\2\2\u0409\u0400\3\2\2\2\u0409\u0403\3\2\2\2\u0409\u0407\3\2\2\2\u0409"+
		"\u0408\3\2\2\2\u040a\u0485\3\2\2\2\u040b\u040c\f%\2\2\u040c\u040d\7\30"+
		"\2\2\u040d\u0484\5\u00f4{&\u040e\u040f\f$\2\2\u040f\u0410\7\23\2\2\u0410"+
		"\u0484\5\u00f4{%\u0411\u0412\f\"\2\2\u0412\u0413\7\31\2\2\u0413\u0484"+
		"\5\u00f4{#\u0414\u0415\f!\2\2\u0415\u0416\7\32\2\2\u0416\u0484\5\u00f4"+
		"{\"\u0417\u0418\f \2\2\u0418\u0419\7\33\2\2\u0419\u0484\5\u00f4{!\u041a"+
		"\u041b\f\37\2\2\u041b\u041c\7\34\2\2\u041c\u0484\5\u00f4{ \u041d\u041e"+
		"\f\36\2\2\u041e\u041f\7\35\2\2\u041f\u0484\5\u00f4{\37\u0420\u0421\f\35"+
		"\2\2\u0421\u0422\7\36\2\2\u0422\u0484\5\u00f4{\36\u0423\u0424\f\34\2\2"+
		"\u0424\u0425\7\25\2\2\u0425\u0484\5\u00f4{\35\u0426\u0427\f\33\2\2\u0427"+
		"\u0428\7\37\2\2\u0428\u0484\5\u00f4{\34\u0429\u042a\f\32\2\2\u042a\u042b"+
		"\7 \2\2\u042b\u0484\5\u00f4{\33\u042c\u042d\f\31\2\2\u042d\u042e\7!\2"+
		"\2\u042e\u0484\5\u00f4{\32\u042f\u0430\f\30\2\2\u0430\u0431\7\"\2\2\u0431"+
		"\u0484\5\u00f4{\31\u0432\u0433\f\27\2\2\u0433\u0434\7#\2\2\u0434\u0484"+
		"\5\u00f4{\30\u0435\u0436\f\26\2\2\u0436\u0437\7$\2\2\u0437\u0484\5\u00f4"+
		"{\27\u0438\u0439\f\25\2\2\u0439\u043a\7%\2\2\u043a\u0484\5\u00f4{\26\u043b"+
		"\u043c\f\24\2\2\u043c\u043d\7@\2\2\u043d\u0484\5\u00f4{\25\u043e\u043f"+
		"\f\23\2\2\u043f\u0440\7&\2\2\u0440\u0484\5\u00f4{\24\u0441\u0442\f\22"+
		"\2\2\u0442\u0443\7\'\2\2\u0443\u0484\5\u00f4{\23\u0444\u0445\f\21\2\2"+
		"\u0445\u0446\7(\2\2\u0446\u0484\5\u00f4{\22\u0447\u0448\f\20\2\2\u0448"+
		"\u0449\7)\2\2\u0449\u0484\5\u00f4{\21\u044a\u044b\f\17\2\2\u044b\u044c"+
		"\7\n\2\2\u044c\u0484\5\u00f4{\20\u044d\u044e\f\16\2\2\u044e\u044f\7*\2"+
		"\2\u044f\u0484\5\u00f4{\17\u0450\u0451\f\r\2\2\u0451\u0452\7+\2\2\u0452"+
		"\u0484\5\u00f4{\16\u0453\u0454\f\f\2\2\u0454\u0455\7,\2\2\u0455\u0484"+
		"\5\u00f4{\r\u0456\u0457\f\13\2\2\u0457\u0458\7-\2\2\u0458\u0484\5\u00f4"+
		"{\f\u0459\u045a\f\n\2\2\u045a\u045b\7.\2\2\u045b\u0484\5\u00f4{\13\u045c"+
		"\u045d\f\t\2\2\u045d\u045e\7/\2\2\u045e\u0484\5\u00f4{\n\u045f\u0460\f"+
		"\b\2\2\u0460\u0461\7\60\2\2\u0461\u0484\5\u00f4{\t\u0462\u0463\f\7\2\2"+
		"\u0463\u0464\7\61\2\2\u0464\u0484\5\u00f4{\b\u0465\u0466\f\6\2\2\u0466"+
		"\u0467\7\62\2\2\u0467\u0484\5\u00f4{\7\u0468\u0469\f\5\2\2\u0469\u046a"+
		"\7\63\2\2\u046a\u0484\5\u00f4{\6\u046b\u046c\f\4\2\2\u046c\u046d\7\64"+
		"\2\2\u046d\u0484\5\u00f4{\5\u046e\u046f\f.\2\2\u046f\u0484\5\u0080A\2"+
		"\u0470\u0471\f*\2\2\u0471\u0484\7\7\2\2\u0472\u0473\f)\2\2\u0473\u0484"+
		"\7\b\2\2\u0474\u0475\f(\2\2\u0475\u0484\7\t\2\2\u0476\u0477\f\'\2\2\u0477"+
		"\u0478\7\6\2\2\u0478\u0484\7\u0086\2\2\u0479\u047a\f&\2\2\u047a\u047b"+
		"\7\f\2\2\u047b\u047c\5\u011e\u0090\2\u047c\u047d\7\r\2\2\u047d\u0484\3"+
		"\2\2\2\u047e\u047f\f#\2\2\u047f\u0480\7\23\2\2\u0480\u0481\5\u00f4{\2"+
		"\u0481\u0482\5\u0102\u0082\2\u0482\u0484\3\2\2\2\u0483\u040b\3\2\2\2\u0483"+
		"\u040e\3\2\2\2\u0483\u0411\3\2\2\2\u0483\u0414\3\2\2\2\u0483\u0417\3\2"+
		"\2\2\u0483\u041a\3\2\2\2\u0483\u041d\3\2\2\2\u0483\u0420\3\2\2\2\u0483"+
		"\u0423\3\2\2\2\u0483\u0426\3\2\2\2\u0483\u0429\3\2\2\2\u0483\u042c\3\2"+
		"\2\2\u0483\u042f\3\2\2\2\u0483\u0432\3\2\2\2\u0483\u0435\3\2\2\2\u0483"+
		"\u0438\3\2\2\2\u0483\u043b\3\2\2\2\u0483\u043e\3\2\2\2\u0483\u0441\3\2"+
		"\2\2\u0483\u0444\3\2\2\2\u0483\u0447\3\2\2\2\u0483\u044a\3\2\2\2\u0483"+
		"\u044d\3\2\2\2\u0483\u0450\3\2\2\2\u0483\u0453\3\2\2\2\u0483\u0456\3\2"+
		"\2\2\u0483\u0459\3\2\2\2\u0483\u045c\3\2\2\2\u0483\u045f\3\2\2\2\u0483"+
		"\u0462\3\2\2\2\u0483\u0465\3\2\2\2\u0483\u0468\3\2\2\2\u0483\u046b\3\2"+
		"\2\2\u0483\u046e\3\2\2\2\u0483\u0470\3\2\2\2\u0483\u0472\3\2\2\2\u0483"+
		"\u0474\3\2\2\2\u0483\u0476\3\2\2\2\u0483\u0479\3\2\2\2\u0483\u047e\3\2"+
		"\2\2\u0484\u0487\3\2\2\2\u0485\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486"+
		"\u00f5\3\2\2\2\u0487\u0485\3\2\2\2\u0488\u0489\7\u0088\2\2\u0489\u00f7"+
		"\3\2\2\2\u048a\u048b\t\5\2\2\u048b\u00f9\3\2\2\2\u048c\u048d\7{\2\2\u048d"+
		"\u048e\5\u00fc\177\2\u048e\u048f\5\u0100\u0081\2\u048f\u00fb\3\2\2\2\u0490"+
		"\u0491\5\u00fe\u0080\2\u0491\u0492\5\u0080A\2\u0492\u00fd\3\2\2\2\u0493"+
		"\u0494\t\6\2\2\u0494\u00ff\3\2\2\2\u0495\u0499\5\u0136\u009c\2\u0496\u0497"+
		"\7}\2\2\u0497\u0499\5\u00f4{\2\u0498\u0495\3\2\2\2\u0498\u0496\3\2\2\2"+
		"\u0499\u0101\3\2\2\2\u049a\u049b\7\20\2\2\u049b\u049c\5\u0104\u0083\2"+
		"\u049c\u049d\7\21\2\2\u049d\u0103\3\2\2\2\u049e\u049f\b\u0083\1\2\u049f"+
		"\u04a0\5\u0106\u0084\2\u04a0\u04a6\3\2\2\2\u04a1\u04a2\f\3\2\2\u04a2\u04a3"+
		"\7\22\2\2\u04a3\u04a5\5\u0106\u0084\2\u04a4\u04a1\3\2\2\2\u04a5\u04a8"+
		"\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u0105\3\2\2\2\u04a8"+
		"\u04a6\3\2\2\2\u04a9\u04b0\5\u00f4{\2\u04aa\u04ab\7\f\2\2\u04ab\u04ac"+
		"\5\u00f4{\2\u04ac\u04ad\7\r\2\2\u04ad\u04ae\5\u00f4{\2\u04ae\u04b0\3\2"+
		"\2\2\u04af\u04a9\3\2\2\2\u04af\u04aa\3\2\2\2\u04b0\u0107\3\2\2\2\u04b1"+
		"\u04b2\7\65\2\2\u04b2\u04d7\5\u00f4{\2\u04b3\u04b4\7\34\2\2\u04b4\u04d7"+
		"\5\u00f4{\2\u04b5\u04b6\7\35\2\2\u04b6\u04d7\5\u00f4{\2\u04b7\u04b8\7"+
		"\66\2\2\u04b8\u04d7\5\u00f4{\2\u04b9\u04ba\7\67\2\2\u04ba\u04d7\5\u00f4"+
		"{\2\u04bb\u04bc\7\7\2\2\u04bc\u04d7\5\u00f4{\2\u04bd\u04be\7\b\2\2\u04be"+
		"\u04d7\5\u00f4{\2\u04bf\u04c0\5\u00c4c\2\u04c0\u04c1\5\u010a\u0086\2\u04c1"+
		"\u04d7\3\2\2\2\u04c2\u04c3\7u\2\2\u04c3\u04c4\5\u010a\u0086\2\u04c4\u04c5"+
		"\7\65\2\2\u04c5\u04d7\3\2\2\2\u04c6\u04c7\7I\2\2\u04c7\u04c8\7\20\2\2"+
		"\u04c8\u04c9\5\u00b4[\2\u04c9\u04ca\7\21\2\2\u04ca\u04d7\3\2\2\2\u04cb"+
		"\u04cc\7J\2\2\u04cc\u04cd\7\20\2\2\u04cd\u04ce\5\u00b4[\2\u04ce\u04cf"+
		"\7\21\2\2\u04cf\u04d7\3\2\2\2\u04d0\u04d1\7K\2\2\u04d1\u04d2\7\20\2\2"+
		"\u04d2\u04d3\5\u0118\u008d\2\u04d3\u04d4\5\u010c\u0087\2\u04d4\u04d5\7"+
		"\21\2\2\u04d5\u04d7\3\2\2\2\u04d6\u04b1\3\2\2\2\u04d6\u04b3\3\2\2\2\u04d6"+
		"\u04b5\3\2\2\2\u04d6\u04b7\3\2\2\2\u04d6\u04b9\3\2\2\2\u04d6\u04bb\3\2"+
		"\2\2\u04d6\u04bd\3\2\2\2\u04d6\u04bf\3\2\2\2\u04d6\u04c2\3\2\2\2\u04d6"+
		"\u04c6\3\2\2\2\u04d6\u04cb\3\2\2\2\u04d6\u04d0\3\2\2\2\u04d7\u0109\3\2"+
		"\2\2\u04d8\u04d9\7\20\2\2\u04d9\u04da\5\u00f4{\2\u04da\u04db\7\21\2\2"+
		"\u04db\u010b\3\2\2\2\u04dc\u04e2\5\u00b6\\\2\u04dd\u04de\7L\2\2\u04de"+
		"\u04e2\5\u010e\u0088\2\u04df\u04e0\7M\2\2\u04e0\u04e2\5\u0110\u0089\2"+
		"\u04e1\u04dc\3\2\2\2\u04e1\u04dd\3\2\2\2\u04e1\u04df\3\2\2\2\u04e2\u010d"+
		"\3\2\2\2\u04e3\u04e4\5\u0136\u009c\2\u04e4\u010f\3\2\2\2\u04e5\u04e6\5"+
		"\u0114\u008b\2\u04e6\u04e7\5\u0112\u008a\2\u04e7\u0111\3\2\2\2\u04e8\u04ee"+
		"\5\u0136\u009c\2\u04e9\u04ea\7\16\2\2\u04ea\u04eb\5\u0124\u0093\2\u04eb"+
		"\u04ec\7\17\2\2\u04ec\u04ee\3\2\2\2\u04ed\u04e8\3\2\2\2\u04ed\u04e9\3"+
		"\2\2\2\u04ee\u0113\3\2\2\2\u04ef\u04f0\5\u0088E\2\u04f0\u04f1\5\u0116"+
		"\u008c\2\u04f1\u0115\3\2\2\2\u04f2\u04fe\5\u0136\u009c\2\u04f3\u04f4\7"+
		"z\2\2\u04f4\u04fe\5\u00b4[\2\u04f5\u04f6\7z\2\2\u04f6\u04f7\5\u00e4s\2"+
		"\u04f7\u04f8\7\24\2\2\u04f8\u04f9\5\u00b4[\2\u04f9\u04fe\3\2\2\2\u04fa"+
		"\u04fb\7z\2\2\u04fb\u04fc\7\u0086\2\2\u04fc\u04fe\7N\2\2\u04fd\u04f2\3"+
		"\2\2\2\u04fd\u04f3\3\2\2\2\u04fd\u04f5\3\2\2\2\u04fd\u04fa\3\2\2\2\u04fe"+
		"\u0117\3\2\2\2\u04ff\u0502\5\u0136\u009c\2\u0500\u0502\5\u011a\u008e\2"+
		"\u0501\u04ff\3\2\2\2\u0501\u0500\3\2\2\2\u0502\u0119\3\2\2\2\u0503\u0508"+
		"\5\u011c\u008f\2\u0504\u0505\5\u011c\u008f\2\u0505\u0506\5\u011a\u008e"+
		"\2\u0506\u0508\3\2\2\2\u0507\u0503\3\2\2\2\u0507\u0504\3\2\2\2\u0508\u011b"+
		"\3\2\2\2\u0509\u050a\7\f\2\2\u050a\u050b\5\u011e\u0090\2\u050b\u050c\7"+
		"\r\2\2\u050c\u011d\3\2\2\2\u050d\u050e\b\u0090\1\2\u050e\u050f\5\u0120"+
		"\u0091\2\u050f\u0515\3\2\2\2\u0510\u0511\f\3\2\2\u0511\u0512\7\22\2\2"+
		"\u0512\u0514\5\u0120\u0091\2\u0513\u0510\3\2\2\2\u0514\u0517\3\2\2\2\u0515"+
		"\u0513\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u011f\3\2\2\2\u0517\u0515\3\2"+
		"\2\2\u0518\u051e\5\u0122\u0092\2\u0519\u051a\5\u0122\u0092\2\u051a\u051b"+
		"\7\24\2\2\u051b\u051c\5\u0122\u0092\2\u051c\u051e\3\2\2\2\u051d\u0518"+
		"\3\2\2\2\u051d\u0519\3\2\2\2\u051e\u0121\3\2\2\2\u051f\u0524\5\u00f4{"+
		"\2\u0520\u0524\7\23\2\2\u0521\u0524\5\u0136\u009c\2\u0522\u0524\5@!\2"+
		"\u0523\u051f\3\2\2\2\u0523\u0520\3\2\2\2\u0523\u0521\3\2\2\2\u0523\u0522"+
		"\3\2\2\2\u0524\u0123\3\2\2\2\u0525\u052e\7b\2\2\u0526\u052e\7a\2\2\u0527"+
		"\u0528\7b\2\2\u0528\u0529\7\22\2\2\u0529\u052e\7a\2\2\u052a\u052b\7a\2"+
		"\2\u052b\u052c\7\22\2\2\u052c\u052e\7b\2\2\u052d\u0525\3\2\2\2\u052d\u0526"+
		"\3\2\2\2\u052d\u0527\3\2\2\2\u052d\u052a\3\2\2\2\u052e\u0125\3\2\2\2\u052f"+
		"\u0530\7e\2\2\u0530\u0531\5\u0128\u0095\2\u0531\u0127\3\2\2\2\u0532\u0535"+
		"\5\u0136\u009c\2\u0533\u0535\7\u0086\2\2\u0534\u0532\3\2\2\2\u0534\u0533"+
		"\3\2\2\2\u0535\u0129\3\2\2\2\u0536\u0537\5\u012c\u0097\2\u0537\u012b\3"+
		"\2\2\2\u0538\u0539\5\u0130\u0099\2\u0539\u053a\5\u012e\u0098\2\u053a\u012d"+
		"\3\2\2\2\u053b\u053d\7\13\2\2\u053c\u053b\3\2\2\2\u053c\u053d\3\2\2\2"+
		"\u053d\u053e\3\2\2\2\u053e\u053f\5\u0130\u0099\2\u053f\u0540\5\u012e\u0098"+
		"\2\u0540\u0543\3\2\2\2\u0541\u0543\5\u0136\u009c\2\u0542\u053c\3\2\2\2"+
		"\u0542\u0541\3\2\2\2\u0543\u012f\3\2\2\2\u0544\u0549\5\u0098M\2\u0545"+
		"\u0549\5@!\2\u0546\u0549\5\u00f4{\2\u0547\u0549\5\u0094K\2\u0548\u0544"+
		"\3\2\2\2\u0548\u0545\3\2\2\2\u0548\u0546\3\2\2\2\u0548\u0547\3\2\2\2\u0549"+
		"\u0131\3\2\2\2\u054a\u054d\5\u00e8u\2\u054b\u054d\5\u0136\u009c\2\u054c"+
		"\u054a\3\2\2\2\u054c\u054b\3\2\2\2\u054d\u0133\3\2\2\2\u054e\u0551\7\3"+
		"\2\2\u054f\u0551\5\u0136\u009c\2\u0550\u054e\3\2\2\2\u0550\u054f\3\2\2"+
		"\2\u0551\u0135\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0137\3\2\2\2Z\u013f"+
		"\u014a\u014f\u0154\u0171\u017b\u018b\u0190\u019c\u01a2\u01aa\u01b0\u01b4"+
		"\u01bb\u01c0\u01c2\u01ca\u01cf\u01d6\u01da\u01e2\u01f0\u01f4\u020a\u022f"+
		"\u0240\u0245\u024c\u0263\u0272\u0278\u027d\u0287\u02a8\u02b3\u02ba\u02c2"+
		"\u02cc\u02d7\u02e1\u02eb\u02ef\u02ff\u0307\u0313\u0320\u032a\u032e\u0342"+
		"\u034c\u0350\u0357\u0361\u0367\u037b\u0381\u038d\u0396\u03a2\u03a6\u03b2"+
		"\u03c0\u03cf\u03dc\u03e2\u03ee\u0409\u0483\u0485\u0498\u04a6\u04af\u04d6"+
		"\u04e1\u04ed\u04fd\u0501\u0507\u0515\u051d\u0523\u052d\u0534\u053c\u0542"+
		"\u0548\u054c\u0550";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}