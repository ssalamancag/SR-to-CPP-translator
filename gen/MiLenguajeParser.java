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
		RULE_quantifier = 11, RULE_quantifier1 = 12, RULE_quantifier2 = 13, RULE_quantifier3 = 14, 
		RULE_direction = 15, RULE_direction1 = 16, RULE_direction2 = 17, RULE_step_opt = 18, 
		RULE_such_that_opt = 19, RULE_return_spec_null = 20, RULE_param_names = 21, 
		RULE_return_name_opt = 22, RULE_spec_stmt = 23, RULE_spec_body = 24, RULE_spec_body_comp = 25, 
		RULE_maybe_params = 26, RULE_spec_stmt_ls = 27, RULE_body_stmt_ls = 28, 
		RULE_body_stmt = 29, RULE_separator_optional = 30, RULE_body_only = 31, 
		RULE_initial_block = 32, RULE_final_block = 33, RULE_final_opt = 34, RULE_initial_opt = 35, 
		RULE_stmt = 36, RULE_function_stmt = 37, RULE_stop_stmt = 38, RULE_forward_stmt = 39, 
		RULE_send_stmt = 40, RULE_explicit_call = 41, RULE_v_stmt = 42, RULE_input_stmt = 43, 
		RULE_in_cmd_lp = 44, RULE_in_cmd = 45, RULE_in_spec = 46, RULE_in_op = 47, 
		RULE_sched_expr_opt = 48, RULE_sync_expr_opt = 49, RULE_receive_stmt = 50, 
		RULE_p_stmt = 51, RULE_concurrent_stmt = 52, RULE_concurrent_cmd_lp = 53, 
		RULE_concurrent_cmd = 54, RULE_separator_opt = 55, RULE_concurrent_invocation = 56, 
		RULE_post_processing_opt = 57, RULE_invocation = 58, RULE_exit_code_opt = 59, 
		RULE_destroy_stmt = 60, RULE_begin_end = 61, RULE_if_stmt = 62, RULE_do_stmt = 63, 
		RULE_do_stmt1 = 64, RULE_do_stmt2 = 65, RULE_for_all_stmt = 66, RULE_for_all_stmt1 = 67, 
		RULE_for_all_stmt2 = 68, RULE_for_all_stmt3 = 69, RULE_guarded_cmd_lp = 70, 
		RULE_guarded_cmd = 71, RULE_guarded_cmd1 = 72, RULE_else_cmd_opt = 73, 
		RULE_paren_list = 74, RULE_paren_item_ls = 75, RULE_expr_lp = 76, RULE_comp_params = 77, 
		RULE_parameters = 78, RULE_param_spec_ls = 79, RULE_param_spec_lp = 80, 
		RULE_param_spec = 81, RULE_common_stmt = 82, RULE_extend_clause = 83, 
		RULE_import_clause = 84, RULE_import_list = 85, RULE_decl = 86, RULE_type_decl = 87, 
		RULE_type_restriction = 88, RULE_op_decl = 89, RULE_oper_def_lp = 90, 
		RULE_oper_def = 91, RULE_colon_opt = 92, RULE_op_or_ext = 93, RULE_optype_decl = 94, 
		RULE_sem_decl = 95, RULE_sem_def_lp = 96, RULE_sem_def = 97, RULE_sem_init = 98, 
		RULE_eq_opt = 99, RULE_type = 100, RULE_unsub_type = 101, RULE_pointer_def = 102, 
		RULE_union_def = 103, RULE_record_def = 104, RULE_capability_def = 105, 
		RULE_cap_for = 106, RULE_qualified_id = 107, RULE_basic_type = 108, RULE_basic_type1 = 109, 
		RULE_basic_type2 = 110, RULE_basic_type3 = 111, RULE_basic_type4 = 112, 
		RULE_basic_type5 = 113, RULE_field_lp = 114, RULE_field = 115, RULE_param_kind_opt = 116, 
		RULE_string_def = 117, RULE_string_lim = 118, RULE_obj_decl = 119, RULE_enum_def = 120, 
		RULE_var_or_const = 121, RULE_var_or_const_var = 122, RULE_var_or_const_const = 123, 
		RULE_var_def_lp = 124, RULE_var_def = 125, RULE_var_att = 126, RULE_var_att1 = 127, 
		RULE_var_att2 = 128, RULE_id_subs_lp = 129, RULE_id_subs = 130, RULE_id_subsID = 131, 
		RULE_id_lp = 132, RULE_skip_stmt = 133, RULE_exit_stmt = 134, RULE_next_stmt = 135, 
		RULE_return_stmt = 136, RULE_reply_stmt = 137, RULE_expr = 138, RULE_expr_num = 139, 
		RULE_expr1 = 140, RULE_expr2 = 141, RULE_expr3 = 142, RULE_expr4 = 143, 
		RULE_expr5 = 144, RULE_expr6 = 145, RULE_expr7 = 146, RULE_expr8 = 147, 
		RULE_expr9 = 148, RULE_expr10 = 149, RULE_expr11 = 150, RULE_expr12 = 151, 
		RULE_expr13 = 152, RULE_expr14 = 153, RULE_expr15 = 154, RULE_expr16 = 155, 
		RULE_expr17 = 156, RULE_expr18 = 157, RULE_expr19 = 158, RULE_expr20 = 159, 
		RULE_expr21 = 160, RULE_expr22 = 161, RULE_expr23 = 162, RULE_expr24 = 163, 
		RULE_expr25 = 164, RULE_expr26 = 165, RULE_expr27 = 166, RULE_expr28 = 167, 
		RULE_expr29 = 168, RULE_expr30 = 169, RULE_expr31 = 170, RULE_expr32 = 171, 
		RULE_expr33 = 172, RULE_expr34 = 173, RULE_expr35 = 174, RULE_expr36 = 175, 
		RULE_expr37 = 176, RULE_expr38 = 177, RULE_expr39 = 178, RULE_expr40 = 179, 
		RULE_expr41 = 180, RULE_expr42 = 181, RULE_expr43 = 182, RULE_literal = 183, 
		RULE_create_expr = 184, RULE_create_call = 185, RULE_rsrc_name = 186, 
		RULE_location_opt = 187, RULE_constructor = 188, RULE_constr_item_lp = 189, 
		RULE_constr_item = 190, RULE_prefix_expr = 191, RULE_paren_expr = 192, 
		RULE_new_item = 193, RULE_sem_proto = 194, RULE_op_prototype = 195, RULE_op_restriction_opt = 196, 
		RULE_prototype = 197, RULE_return_spec_opt = 198, RULE_subscripts_opt = 199, 
		RULE_subscripts = 200, RULE_bracketed_list = 201, RULE_bound_lp = 202, 
		RULE_bounds = 203, RULE_bound = 204, RULE_op_restriction = 205, RULE_end_id = 206, 
		RULE_id_opt = 207, RULE_block = 208, RULE_block_items = 209, RULE_block_items_ = 210, 
		RULE_block_item = 211, RULE_block_item1 = 212, RULE_id_ls = 213, RULE_falta = 214, 
		RULE_vacio = 215;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "componet", "global", "comp_label", "resource_specification", 
			"resource_body", "proc", "process", "procedure", "quantifiers_opt", "quantifier_lp", 
			"quantifier", "quantifier1", "quantifier2", "quantifier3", "direction", 
			"direction1", "direction2", "step_opt", "such_that_opt", "return_spec_null", 
			"param_names", "return_name_opt", "spec_stmt", "spec_body", "spec_body_comp", 
			"maybe_params", "spec_stmt_ls", "body_stmt_ls", "body_stmt", "separator_optional", 
			"body_only", "initial_block", "final_block", "final_opt", "initial_opt", 
			"stmt", "function_stmt", "stop_stmt", "forward_stmt", "send_stmt", "explicit_call", 
			"v_stmt", "input_stmt", "in_cmd_lp", "in_cmd", "in_spec", "in_op", "sched_expr_opt", 
			"sync_expr_opt", "receive_stmt", "p_stmt", "concurrent_stmt", "concurrent_cmd_lp", 
			"concurrent_cmd", "separator_opt", "concurrent_invocation", "post_processing_opt", 
			"invocation", "exit_code_opt", "destroy_stmt", "begin_end", "if_stmt", 
			"do_stmt", "do_stmt1", "do_stmt2", "for_all_stmt", "for_all_stmt1", "for_all_stmt2", 
			"for_all_stmt3", "guarded_cmd_lp", "guarded_cmd", "guarded_cmd1", "else_cmd_opt", 
			"paren_list", "paren_item_ls", "expr_lp", "comp_params", "parameters", 
			"param_spec_ls", "param_spec_lp", "param_spec", "common_stmt", "extend_clause", 
			"import_clause", "import_list", "decl", "type_decl", "type_restriction", 
			"op_decl", "oper_def_lp", "oper_def", "colon_opt", "op_or_ext", "optype_decl", 
			"sem_decl", "sem_def_lp", "sem_def", "sem_init", "eq_opt", "type", "unsub_type", 
			"pointer_def", "union_def", "record_def", "capability_def", "cap_for", 
			"qualified_id", "basic_type", "basic_type1", "basic_type2", "basic_type3", 
			"basic_type4", "basic_type5", "field_lp", "field", "param_kind_opt", 
			"string_def", "string_lim", "obj_decl", "enum_def", "var_or_const", "var_or_const_var", 
			"var_or_const_const", "var_def_lp", "var_def", "var_att", "var_att1", 
			"var_att2", "id_subs_lp", "id_subs", "id_subsID", "id_lp", "skip_stmt", 
			"exit_stmt", "next_stmt", "return_stmt", "reply_stmt", "expr", "expr_num", 
			"expr1", "expr2", "expr3", "expr4", "expr5", "expr6", "expr7", "expr8", 
			"expr9", "expr10", "expr11", "expr12", "expr13", "expr14", "expr15", 
			"expr16", "expr17", "expr18", "expr19", "expr20", "expr21", "expr22", 
			"expr23", "expr24", "expr25", "expr26", "expr27", "expr28", "expr29", 
			"expr30", "expr31", "expr32", "expr33", "expr34", "expr35", "expr36", 
			"expr37", "expr38", "expr39", "expr40", "expr41", "expr42", "expr43", 
			"literal", "create_expr", "create_call", "rsrc_name", "location_opt", 
			"constructor", "constr_item_lp", "constr_item", "prefix_expr", "paren_expr", 
			"new_item", "sem_proto", "op_prototype", "op_restriction_opt", "prototype", 
			"return_spec_opt", "subscripts_opt", "subscripts", "bracketed_list", 
			"bound_lp", "bounds", "bound", "op_restriction", "end_id", "id_opt", 
			"block", "block_items", "block_items_", "block_item", "block_item1", 
			"id_ls", "falta", "vacio"
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
			setState(432);
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
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_GLOBAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				global();
				}
				break;
			case TK_RESOURCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				resource_specification();
				}
				break;
			case EOF:
			case TK_BODY:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				resource_body();
				}
				break;
			case TK_PROC:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
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
				setState(438);
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
			setState(441);
			match(TK_GLOBAL);
			setState(442);
			match(TK_ID);
			setState(443);
			spec_stmt_ls(0);
			setState(444);
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
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_GLOBAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(TK_GLOBAL);
				setState(447);
				match(TK_ID);
				}
				break;
			case TK_RESOURCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(TK_RESOURCE);
				setState(449);
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
			setState(452);
			match(TK_RESOURCE);
			setState(453);
			match(TK_ID);
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(454);
				parameters();
				}
				break;
			}
			setState(457);
			spec_stmt_ls(0);
			setState(458);
			spec_body();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_END) {
				{
				setState(459);
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
			setState(462);
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
			setState(464);
			match(TK_PROC);
			setState(465);
			match(TK_ID);
			setState(466);
			param_names();
			setState(467);
			spec_stmt_ls(0);
			setState(468);
			spec_body();
			setState(469);
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
			setState(471);
			match(TK_PROCESS);
			setState(472);
			match(TK_ID);
			setState(473);
			return_spec_null();
			setState(474);
			quantifiers_opt();
			setState(475);
			block();
			setState(476);
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
			setState(478);
			match(TK_PROCEDURE);
			setState(479);
			match(TK_ID);
			setState(480);
			prototype();
			setState(481);
			block();
			setState(482);
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
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(TK_LPAREN);
				setState(486);
				quantifier_lp(0);
				setState(487);
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
			setState(492);
			quantifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(499);
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
					setState(494);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(495);
					match(TK_COMMA);
					setState(496);
					quantifier();
					}
					} 
				}
				setState(501);
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
		public Quantifier1Context quantifier1() {
			return getRuleContext(Quantifier1Context.class,0);
		}
		public Quantifier2Context quantifier2() {
			return getRuleContext(Quantifier2Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public Quantifier3Context quantifier3() {
			return getRuleContext(Quantifier3Context.class,0);
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
			setState(502);
			quantifier1();
			setState(503);
			quantifier2();
			setState(504);
			expr(0);
			setState(505);
			direction();
			setState(506);
			quantifier3();
			setState(507);
			step_opt();
			setState(508);
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

	public static class Quantifier1Context extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Quantifier1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterQuantifier1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitQuantifier1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitQuantifier1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier1Context quantifier1() throws RecognitionException {
		Quantifier1Context _localctx = new Quantifier1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_quantifier1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
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

	public static class Quantifier2Context extends ParserRuleContext {
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
		public Quantifier2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterQuantifier2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitQuantifier2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitQuantifier2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier2Context quantifier2() throws RecognitionException {
		Quantifier2Context _localctx = new Quantifier2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_quantifier2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(TK_ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quantifier3Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Quantifier3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterQuantifier3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitQuantifier3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitQuantifier3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quantifier3Context quantifier3() throws RecognitionException {
		Quantifier3Context _localctx = new Quantifier3Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_quantifier3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
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

	public static class DirectionContext extends ParserRuleContext {
		public Direction1Context direction1() {
			return getRuleContext(Direction1Context.class,0);
		}
		public Direction2Context direction2() {
			return getRuleContext(Direction2Context.class,0);
		}
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
		enterRule(_localctx, 30, RULE_direction);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_TO:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				direction1();
				}
				break;
			case TK_DOWNTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				direction2();
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

	public static class Direction1Context extends ParserRuleContext {
		public TerminalNode TK_TO() { return getToken(MiLenguajeParser.TK_TO, 0); }
		public Direction1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDirection1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDirection1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDirection1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Direction1Context direction1() throws RecognitionException {
		Direction1Context _localctx = new Direction1Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_direction1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(TK_TO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Direction2Context extends ParserRuleContext {
		public TerminalNode TK_DOWNTO() { return getToken(MiLenguajeParser.TK_DOWNTO, 0); }
		public Direction2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDirection2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDirection2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDirection2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Direction2Context direction2() throws RecognitionException {
		Direction2Context _localctx = new Direction2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_direction2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(TK_DOWNTO);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_step_opt);
		try {
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(TK_BY);
				setState(526);
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
		enterRule(_localctx, 38, RULE_such_that_opt);
		try {
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				match(TK_SUCHTHAT);
				setState(531);
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
		enterRule(_localctx, 40, RULE_return_spec_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
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
		enterRule(_localctx, 42, RULE_param_names);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(TK_LPAREN);
			setState(537);
			id_ls();
			setState(538);
			match(TK_RPAREN);
			setState(539);
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
		enterRule(_localctx, 44, RULE_return_name_opt);
		try {
			setState(544);
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
				setState(541);
				vacio();
				}
				break;
			case TK_RETURNS:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(TK_RETURNS);
				setState(543);
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
		enterRule(_localctx, 46, RULE_spec_stmt);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				common_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				extend_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(548);
				body_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(549);
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
		enterRule(_localctx, 48, RULE_spec_body);
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case TK_END:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				vacio();
				}
				break;
			case TK_BODY:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(TK_BODY);
				setState(554);
				match(TK_ID);
				setState(555);
				maybe_params();
				setState(556);
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
		enterRule(_localctx, 50, RULE_spec_body_comp);
		try {
			setState(564);
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
				setState(560);
				body_stmt_ls(0);
				setState(561);
				end_id();
				}
				break;
			case TK_SEPARATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
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
		enterRule(_localctx, 52, RULE_maybe_params);
		try {
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				comp_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_spec_stmt_ls, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(571);
			spec_stmt();
			}
			_ctx.stop = _input.LT(-1);
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(580);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new Spec_stmt_lsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_spec_stmt_ls);
						setState(573);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(575);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TK_SEPARATOR) {
							{
							setState(574);
							match(TK_SEPARATOR);
							}
						}

						setState(577);
						spec_stmt();
						}
						break;
					case 2:
						{
						_localctx = new Spec_stmt_lsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_spec_stmt_ls);
						setState(578);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(579);
						spec_stmt();
						}
						break;
					}
					} 
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_body_stmt_ls, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(586);
			body_stmt();
			}
			_ctx.stop = _input.LT(-1);
			setState(595);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Body_stmt_lsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_body_stmt_ls);
					setState(588);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TK_SEPARATOR) {
						{
						setState(589);
						match(TK_SEPARATOR);
						}
					}

					setState(592);
					body_stmt();
					}
					} 
				}
				setState(597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 58, RULE_body_stmt);
		try {
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				common_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(600);
				body_only();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(601);
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
		enterRule(_localctx, 60, RULE_separator_optional);
		try {
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SEPARATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				match(TK_SEPARATOR);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
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
		enterRule(_localctx, 62, RULE_body_only);
		try {
			setState(614);
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
				setState(608);
				stmt();
				}
				break;
			case TK_PROC:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				proc();
				}
				break;
			case TK_PROCESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(610);
				process();
				}
				break;
			case TK_PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(611);
				procedure();
				}
				break;
			case TK_INITIAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(612);
				initial_block();
				}
				break;
			case TK_FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(613);
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
		enterRule(_localctx, 64, RULE_initial_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(TK_INITIAL);
			setState(617);
			block();
			setState(618);
			match(TK_END);
			setState(619);
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
		enterRule(_localctx, 66, RULE_final_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(TK_FINAL);
			setState(622);
			block();
			setState(623);
			match(TK_END);
			setState(624);
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
		enterRule(_localctx, 68, RULE_final_opt);
		try {
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
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
		enterRule(_localctx, 70, RULE_initial_opt);
		try {
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
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
		enterRule(_localctx, 72, RULE_stmt);
		try {
			setState(654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SKIP:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				skip_stmt();
				}
				break;
			case TK_STOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				stop_stmt();
				}
				break;
			case TK_EXIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(636);
				exit_stmt();
				}
				break;
			case TK_NEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(637);
				next_stmt();
				}
				break;
			case TK_RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(638);
				return_stmt();
				}
				break;
			case TK_REPLY:
				enterOuterAlt(_localctx, 6);
				{
				setState(639);
				reply_stmt();
				}
				break;
			case TK_ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(640);
				function_stmt();
				}
				break;
			case TK_FORWARD:
				enterOuterAlt(_localctx, 8);
				{
				setState(641);
				forward_stmt();
				}
				break;
			case TK_SEND:
				enterOuterAlt(_localctx, 9);
				{
				setState(642);
				send_stmt();
				}
				break;
			case TK_CALL:
				enterOuterAlt(_localctx, 10);
				{
				setState(643);
				explicit_call();
				}
				break;
			case TK_DESTROY:
				enterOuterAlt(_localctx, 11);
				{
				setState(644);
				destroy_stmt();
				}
				break;
			case TK_BEGIN:
				enterOuterAlt(_localctx, 12);
				{
				setState(645);
				begin_end();
				}
				break;
			case TK_IF:
				enterOuterAlt(_localctx, 13);
				{
				setState(646);
				if_stmt();
				}
				break;
			case TK_DO:
				enterOuterAlt(_localctx, 14);
				{
				setState(647);
				do_stmt();
				}
				break;
			case TK_FA:
				enterOuterAlt(_localctx, 15);
				{
				setState(648);
				for_all_stmt();
				}
				break;
			case TK_V:
				enterOuterAlt(_localctx, 16);
				{
				setState(649);
				v_stmt();
				}
				break;
			case TK_IN:
				enterOuterAlt(_localctx, 17);
				{
				setState(650);
				input_stmt();
				}
				break;
			case TK_RECEIVE:
				enterOuterAlt(_localctx, 18);
				{
				setState(651);
				receive_stmt();
				}
				break;
			case TK_P:
				enterOuterAlt(_localctx, 19);
				{
				setState(652);
				p_stmt();
				}
				break;
			case TK_CO:
				enterOuterAlt(_localctx, 20);
				{
				setState(653);
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
		enterRule(_localctx, 74, RULE_function_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(TK_ID);
			setState(657);
			match(TK_LPAREN);
			setState(658);
			bound_lp(0);
			setState(659);
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
		enterRule(_localctx, 76, RULE_stop_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(TK_STOP);
			setState(662);
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
		enterRule(_localctx, 78, RULE_forward_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(TK_FORWARD);
			setState(665);
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
		enterRule(_localctx, 80, RULE_send_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(TK_SEND);
			setState(668);
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
		enterRule(_localctx, 82, RULE_explicit_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(TK_CALL);
			setState(671);
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
		enterRule(_localctx, 84, RULE_v_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(TK_V);
			setState(674);
			match(TK_LPAREN);
			setState(675);
			expr(0);
			setState(676);
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
		enterRule(_localctx, 86, RULE_input_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(TK_IN);
			setState(679);
			in_cmd_lp(0);
			setState(680);
			else_cmd_opt();
			setState(681);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_in_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(684);
			in_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new In_cmd_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_in_cmd_lp);
					setState(686);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(687);
					match(TK_SQUARE);
					setState(688);
					in_cmd();
					}
					} 
				}
				setState(693);
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
		enterRule(_localctx, 90, RULE_in_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			quantifiers_opt();
			setState(695);
			in_spec();
			setState(696);
			sync_expr_opt();
			setState(697);
			sched_expr_opt();
			setState(698);
			match(TK_ARROW);
			setState(699);
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
		enterRule(_localctx, 92, RULE_in_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			in_op();
			setState(702);
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
		enterRule(_localctx, 94, RULE_in_op);
		try {
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				qualified_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				qualified_id();
				setState(706);
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
		enterRule(_localctx, 96, RULE_sched_expr_opt);
		try {
			setState(713);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ARROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				vacio();
				}
				break;
			case TK_BY:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				match(TK_BY);
				setState(712);
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
		enterRule(_localctx, 98, RULE_sync_expr_opt);
		try {
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ARROW:
			case TK_BY:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				vacio();
				}
				break;
			case TK_AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				match(TK_AND);
				setState(717);
				expr(0);
				}
				break;
			case TK_SUCHTHAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(718);
				match(TK_SUCHTHAT);
				setState(719);
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
		enterRule(_localctx, 100, RULE_receive_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(TK_RECEIVE);
			setState(723);
			expr(0);
			setState(724);
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
		enterRule(_localctx, 102, RULE_p_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(TK_P);
			setState(727);
			match(TK_LPAREN);
			setState(728);
			expr(0);
			setState(729);
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
		enterRule(_localctx, 104, RULE_concurrent_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(TK_CO);
			setState(732);
			concurrent_cmd_lp(0);
			setState(733);
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
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_concurrent_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(736);
			concurrent_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(743);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Concurrent_cmd_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_concurrent_cmd_lp);
					setState(738);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(739);
					match(TK_PARALLEL);
					setState(740);
					concurrent_cmd();
					}
					} 
				}
				setState(745);
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
		enterRule(_localctx, 108, RULE_concurrent_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			quantifiers_opt();
			setState(747);
			separator_opt(0);
			setState(748);
			concurrent_invocation();
			setState(749);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_separator_opt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(752);
			vacio();
			}
			_ctx.stop = _input.LT(-1);
			setState(758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Separator_optContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_separator_opt);
					setState(754);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(755);
					match(TK_SEPARATOR);
					}
					} 
				}
				setState(760);
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
		enterRule(_localctx, 112, RULE_concurrent_invocation);
		try {
			setState(764);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				explicit_call();
				}
				break;
			case TK_SEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
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
				setState(763);
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
		enterRule(_localctx, 114, RULE_post_processing_opt);
		try {
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				match(TK_ARROW);
				setState(768);
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
		enterRule(_localctx, 116, RULE_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			expr(0);
			setState(772);
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
		enterRule(_localctx, 118, RULE_exit_code_opt);
		try {
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				match(TK_LPAREN);
				setState(776);
				expr(0);
				setState(777);
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
		enterRule(_localctx, 120, RULE_destroy_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(TK_DESTROY);
			setState(782);
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
		enterRule(_localctx, 122, RULE_begin_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(TK_BEGIN);
			setState(785);
			block();
			setState(786);
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
		enterRule(_localctx, 124, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(TK_IF);
			setState(789);
			guarded_cmd_lp(0);
			setState(790);
			else_cmd_opt();
			setState(791);
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
		public Do_stmt1Context do_stmt1() {
			return getRuleContext(Do_stmt1Context.class,0);
		}
		public Guarded_cmd_lpContext guarded_cmd_lp() {
			return getRuleContext(Guarded_cmd_lpContext.class,0);
		}
		public Else_cmd_optContext else_cmd_opt() {
			return getRuleContext(Else_cmd_optContext.class,0);
		}
		public Do_stmt2Context do_stmt2() {
			return getRuleContext(Do_stmt2Context.class,0);
		}
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
		enterRule(_localctx, 126, RULE_do_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			do_stmt1();
			setState(794);
			guarded_cmd_lp(0);
			setState(795);
			else_cmd_opt();
			setState(796);
			do_stmt2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_stmt1Context extends ParserRuleContext {
		public TerminalNode TK_DO() { return getToken(MiLenguajeParser.TK_DO, 0); }
		public Do_stmt1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_stmt1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDo_stmt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDo_stmt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDo_stmt1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_stmt1Context do_stmt1() throws RecognitionException {
		Do_stmt1Context _localctx = new Do_stmt1Context(_ctx, getState());
		enterRule(_localctx, 128, RULE_do_stmt1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(TK_DO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_stmt2Context extends ParserRuleContext {
		public TerminalNode TK_OD() { return getToken(MiLenguajeParser.TK_OD, 0); }
		public Do_stmt2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_stmt2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDo_stmt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDo_stmt2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDo_stmt2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_stmt2Context do_stmt2() throws RecognitionException {
		Do_stmt2Context _localctx = new Do_stmt2Context(_ctx, getState());
		enterRule(_localctx, 130, RULE_do_stmt2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
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
		public For_all_stmt1Context for_all_stmt1() {
			return getRuleContext(For_all_stmt1Context.class,0);
		}
		public Quantifier_lpContext quantifier_lp() {
			return getRuleContext(Quantifier_lpContext.class,0);
		}
		public For_all_stmt2Context for_all_stmt2() {
			return getRuleContext(For_all_stmt2Context.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_all_stmt3Context for_all_stmt3() {
			return getRuleContext(For_all_stmt3Context.class,0);
		}
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
		enterRule(_localctx, 132, RULE_for_all_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			for_all_stmt1();
			setState(803);
			quantifier_lp(0);
			setState(804);
			for_all_stmt2();
			setState(805);
			block();
			setState(806);
			for_all_stmt3();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_all_stmt1Context extends ParserRuleContext {
		public TerminalNode TK_FA() { return getToken(MiLenguajeParser.TK_FA, 0); }
		public For_all_stmt1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_all_stmt1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFor_all_stmt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFor_all_stmt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFor_all_stmt1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_all_stmt1Context for_all_stmt1() throws RecognitionException {
		For_all_stmt1Context _localctx = new For_all_stmt1Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_for_all_stmt1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(TK_FA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_all_stmt2Context extends ParserRuleContext {
		public TerminalNode TK_ARROW() { return getToken(MiLenguajeParser.TK_ARROW, 0); }
		public For_all_stmt2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_all_stmt2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFor_all_stmt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFor_all_stmt2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFor_all_stmt2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_all_stmt2Context for_all_stmt2() throws RecognitionException {
		For_all_stmt2Context _localctx = new For_all_stmt2Context(_ctx, getState());
		enterRule(_localctx, 136, RULE_for_all_stmt2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(TK_ARROW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_all_stmt3Context extends ParserRuleContext {
		public TerminalNode TK_AF() { return getToken(MiLenguajeParser.TK_AF, 0); }
		public For_all_stmt3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_all_stmt3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFor_all_stmt3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFor_all_stmt3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFor_all_stmt3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_all_stmt3Context for_all_stmt3() throws RecognitionException {
		For_all_stmt3Context _localctx = new For_all_stmt3Context(_ctx, getState());
		enterRule(_localctx, 138, RULE_for_all_stmt3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
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
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_guarded_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(815);
			guarded_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(822);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Guarded_cmd_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_guarded_cmd_lp);
					setState(817);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(818);
					match(TK_SQUARE);
					setState(819);
					guarded_cmd();
					}
					} 
				}
				setState(824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		public Guarded_cmd1Context guarded_cmd1() {
			return getRuleContext(Guarded_cmd1Context.class,0);
		}
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
		enterRule(_localctx, 142, RULE_guarded_cmd);
		try {
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(825);
				expr(0);
				setState(826);
				match(TK_OR_);
				setState(827);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				expr(0);
				setState(830);
				guarded_cmd1();
				setState(831);
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

	public static class Guarded_cmd1Context extends ParserRuleContext {
		public TerminalNode TK_ARROW() { return getToken(MiLenguajeParser.TK_ARROW, 0); }
		public Guarded_cmd1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarded_cmd1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterGuarded_cmd1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitGuarded_cmd1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitGuarded_cmd1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guarded_cmd1Context guarded_cmd1() throws RecognitionException {
		Guarded_cmd1Context _localctx = new Guarded_cmd1Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_guarded_cmd1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(TK_ARROW);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 146, RULE_else_cmd_opt);
		try {
			setState(842);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NI:
			case TK_FI:
			case TK_OD:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				vacio();
				}
				break;
			case TK_SQUARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				match(TK_SQUARE);
				setState(839);
				match(TK_ELSE);
				setState(840);
				match(TK_ARROW);
				setState(841);
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
		enterRule(_localctx, 148, RULE_paren_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(TK_LPAREN);
			setState(845);
			paren_item_ls();
			setState(846);
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
		enterRule(_localctx, 150, RULE_paren_item_ls);
		try {
			setState(850);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
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
				setState(849);
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
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_expr_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(853);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(860);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_lp);
					setState(855);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(856);
					match(TK_COMMA);
					setState(857);
					expr(0);
					}
					} 
				}
				setState(862);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		enterRule(_localctx, 154, RULE_comp_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
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
		enterRule(_localctx, 156, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			match(TK_LPAREN);
			setState(866);
			param_spec_ls();
			setState(867);
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
		enterRule(_localctx, 158, RULE_param_spec_ls);
		try {
			setState(871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
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
				setState(870);
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
		enterRule(_localctx, 160, RULE_param_spec_lp);
		try {
			setState(881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				param_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				param_spec();
				setState(875);
				match(TK_SEPARATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(877);
				param_spec();
				setState(878);
				match(TK_SEPARATOR);
				setState(879);
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
		enterRule(_localctx, 162, RULE_param_spec);
		try {
			setState(891);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				param_kind_opt();
				setState(884);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(886);
				param_kind_opt();
				setState(887);
				id_subs_lp(0);
				setState(888);
				match(TK_COLON);
				setState(889);
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
		enterRule(_localctx, 164, RULE_common_stmt);
		try {
			setState(895);
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
				setState(893);
				decl();
				}
				break;
			case TK_IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(894);
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
		enterRule(_localctx, 166, RULE_extend_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(TK_EXTEND);
			setState(898);
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
		enterRule(_localctx, 168, RULE_import_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(TK_IMPORT);
			setState(901);
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
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_import_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(904);
			match(TK_ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(911);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Import_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_import_list);
					setState(906);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(907);
					match(TK_COMMA);
					setState(908);
					match(TK_ID);
					}
					} 
				}
				setState(913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		enterRule(_localctx, 172, RULE_decl);
		try {
			setState(919);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				type_decl();
				}
				break;
			case TK_VAR:
			case TK_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				obj_decl();
				}
				break;
			case TK_OPTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(916);
				optype_decl();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 4);
				{
				setState(917);
				sem_decl();
				}
				break;
			case TK_EXTERNAL:
			case TK_OP:
				enterOuterAlt(_localctx, 5);
				{
				setState(918);
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
		enterRule(_localctx, 174, RULE_type_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(TK_TYPE);
			setState(922);
			match(TK_ID);
			setState(923);
			match(TK_EQ);
			setState(924);
			type();
			setState(925);
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
		enterRule(_localctx, 176, RULE_type_restriction);
		try {
			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(928);
				match(TK_LBRACE);
				setState(929);
				match(TK_ID);
				setState(930);
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
		enterRule(_localctx, 178, RULE_op_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			op_or_ext();
			setState(934);
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
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_oper_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(937);
			oper_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Oper_def_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_oper_def_lp);
					setState(939);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(940);
					match(TK_COMMA);
					setState(941);
					oper_def();
					}
					} 
				}
				setState(946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		enterRule(_localctx, 182, RULE_oper_def);
		try {
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				id_subs_lp(0);
				setState(948);
				op_prototype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				id_subs_lp(0);
				setState(951);
				colon_opt();
				setState(952);
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
		enterRule(_localctx, 184, RULE_colon_opt);
		try {
			setState(958);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				vacio();
				}
				break;
			case TK_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(957);
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
		enterRule(_localctx, 186, RULE_op_or_ext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
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
		enterRule(_localctx, 188, RULE_optype_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(TK_OPTYPE);
			setState(963);
			match(TK_ID);
			setState(964);
			eq_opt();
			setState(965);
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
		enterRule(_localctx, 190, RULE_sem_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(TK_SEM);
			setState(968);
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
		int _startState = 192;
		enterRecursionRule(_localctx, 192, RULE_sem_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(971);
			sem_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(978);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sem_def_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sem_def_lp);
					setState(973);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(974);
					match(TK_COMMA);
					setState(975);
					sem_def();
					}
					} 
				}
				setState(980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 194, RULE_sem_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			id_subs();
			setState(982);
			sem_proto();
			setState(983);
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
		enterRule(_localctx, 196, RULE_sem_init);
		try {
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(985);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				match(TK_ASSIGN);
				setState(987);
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
		enterRule(_localctx, 198, RULE_eq_opt);
		try {
			setState(992);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				vacio();
				}
				break;
			case TK_EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
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
		enterRule(_localctx, 200, RULE_type);
		try {
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				subscripts();
				setState(995);
				unsub_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				unsub_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(998);
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
		enterRule(_localctx, 202, RULE_unsub_type);
		try {
			setState(1009);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1001);
				basic_type();
				}
				break;
			case TK_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1002);
				string_def();
				}
				break;
			case TK_ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(1003);
				enum_def();
				}
				break;
			case TK_PTR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1004);
				pointer_def();
				}
				break;
			case TK_REC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1005);
				record_def();
				}
				break;
			case TK_UNION:
				enterOuterAlt(_localctx, 6);
				{
				setState(1006);
				union_def();
				}
				break;
			case TK_CAP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1007);
				capability_def();
				}
				break;
			case TK_ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(1008);
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
		enterRule(_localctx, 204, RULE_pointer_def);
		try {
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				match(TK_PTR);
				setState(1012);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
				match(TK_PTR);
				setState(1014);
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
		enterRule(_localctx, 206, RULE_union_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(TK_UNION);
			setState(1018);
			match(TK_LPAREN);
			setState(1019);
			field_lp();
			setState(1020);
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
		enterRule(_localctx, 208, RULE_record_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			match(TK_REC);
			setState(1023);
			match(TK_LPAREN);
			setState(1024);
			field_lp();
			setState(1025);
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
		enterRule(_localctx, 210, RULE_capability_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(TK_CAP);
			setState(1028);
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
		enterRule(_localctx, 212, RULE_cap_for);
		try {
			setState(1035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				qualified_id();
				}
				break;
			case TK_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1031);
				op_prototype();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 3);
				{
				setState(1032);
				match(TK_SEM);
				setState(1033);
				sem_proto();
				}
				break;
			case TK_VM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1034);
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
		enterRule(_localctx, 214, RULE_qualified_id);
		try {
			setState(1041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1037);
				match(TK_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1038);
				match(TK_ID);
				setState(1039);
				match(TK_PERIOD);
				setState(1040);
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
		public Basic_type1Context basic_type1() {
			return getRuleContext(Basic_type1Context.class,0);
		}
		public Basic_type2Context basic_type2() {
			return getRuleContext(Basic_type2Context.class,0);
		}
		public Basic_type3Context basic_type3() {
			return getRuleContext(Basic_type3Context.class,0);
		}
		public Basic_type4Context basic_type4() {
			return getRuleContext(Basic_type4Context.class,0);
		}
		public Basic_type5Context basic_type5() {
			return getRuleContext(Basic_type5Context.class,0);
		}
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
		enterRule(_localctx, 216, RULE_basic_type);
		try {
			setState(1048);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
				basic_type1();
				}
				break;
			case TK_BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				basic_type2();
				}
				break;
			case TK_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1045);
				basic_type3();
				}
				break;
			case TK_FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1046);
				basic_type4();
				}
				break;
			case TK_REAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1047);
				basic_type5();
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

	public static class Basic_type1Context extends ParserRuleContext {
		public TerminalNode TK_INT() { return getToken(MiLenguajeParser.TK_INT, 0); }
		public Basic_type1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBasic_type1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBasic_type1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBasic_type1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_type1Context basic_type1() throws RecognitionException {
		Basic_type1Context _localctx = new Basic_type1Context(_ctx, getState());
		enterRule(_localctx, 218, RULE_basic_type1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			match(TK_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Basic_type2Context extends ParserRuleContext {
		public TerminalNode TK_BOOL() { return getToken(MiLenguajeParser.TK_BOOL, 0); }
		public Basic_type2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBasic_type2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBasic_type2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBasic_type2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_type2Context basic_type2() throws RecognitionException {
		Basic_type2Context _localctx = new Basic_type2Context(_ctx, getState());
		enterRule(_localctx, 220, RULE_basic_type2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			match(TK_BOOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Basic_type3Context extends ParserRuleContext {
		public TerminalNode TK_CHAR() { return getToken(MiLenguajeParser.TK_CHAR, 0); }
		public Basic_type3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBasic_type3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBasic_type3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBasic_type3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_type3Context basic_type3() throws RecognitionException {
		Basic_type3Context _localctx = new Basic_type3Context(_ctx, getState());
		enterRule(_localctx, 222, RULE_basic_type3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			match(TK_CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Basic_type4Context extends ParserRuleContext {
		public TerminalNode TK_FILE() { return getToken(MiLenguajeParser.TK_FILE, 0); }
		public Basic_type4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBasic_type4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBasic_type4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBasic_type4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_type4Context basic_type4() throws RecognitionException {
		Basic_type4Context _localctx = new Basic_type4Context(_ctx, getState());
		enterRule(_localctx, 224, RULE_basic_type4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(TK_FILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Basic_type5Context extends ParserRuleContext {
		public TerminalNode TK_REAL() { return getToken(MiLenguajeParser.TK_REAL, 0); }
		public Basic_type5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBasic_type5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBasic_type5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBasic_type5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_type5Context basic_type5() throws RecognitionException {
		Basic_type5Context _localctx = new Basic_type5Context(_ctx, getState());
		enterRule(_localctx, 226, RULE_basic_type5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(TK_REAL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 228, RULE_field_lp);
		try {
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1060);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1061);
				field();
				setState(1062);
				match(TK_SEPARATOR);
				setState(1063);
				field_lp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1065);
				field();
				setState(1066);
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
		enterRule(_localctx, 230, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
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
		enterRule(_localctx, 232, RULE_param_kind_opt);
		try {
			setState(1077);
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
				setState(1072);
				vacio();
				}
				break;
			case TK_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				match(TK_VAL);
				}
				break;
			case TK_VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1074);
				match(TK_VAR);
				}
				break;
			case TK_RES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1075);
				match(TK_RES);
				}
				break;
			case TK_REF:
				enterOuterAlt(_localctx, 5);
				{
				setState(1076);
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
		enterRule(_localctx, 234, RULE_string_def);
		try {
			setState(1089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1079);
				match(TK_STRING);
				setState(1080);
				match(TK_LBRACKET);
				setState(1081);
				string_lim();
				setState(1082);
				match(TK_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				match(TK_STRING);
				setState(1085);
				match(TK_LPAREN);
				setState(1086);
				string_lim();
				setState(1087);
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
		enterRule(_localctx, 236, RULE_string_lim);
		try {
			setState(1093);
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
				setState(1091);
				expr(0);
				}
				break;
			case TK_ASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
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
		enterRule(_localctx, 238, RULE_obj_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			var_or_const();
			setState(1096);
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
		enterRule(_localctx, 240, RULE_enum_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			match(TK_ENUM);
			setState(1099);
			match(TK_LPAREN);
			setState(1100);
			id_lp(0);
			setState(1101);
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
		enterRule(_localctx, 242, RULE_var_or_const);
		try {
			setState(1105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
				var_or_const_var();
				}
				break;
			case TK_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(1104);
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
		enterRule(_localctx, 244, RULE_var_or_const_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
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
		enterRule(_localctx, 246, RULE_var_or_const_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
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
		int _startState = 248;
		enterRecursionRule(_localctx, 248, RULE_var_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1112);
			var_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(1119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Var_def_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_var_def_lp);
					setState(1114);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1115);
					match(TK_COMMA);
					setState(1116);
					var_def();
					}
					} 
				}
				setState(1121);
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
		enterRule(_localctx, 250, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			id_subs_lp(0);
			setState(1123);
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
		public Var_att2Context var_att2() {
			return getRuleContext(Var_att2Context.class,0);
		}
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_att1Context var_att1() {
			return getRuleContext(Var_att1Context.class,0);
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
		enterRule(_localctx, 252, RULE_var_att);
		try {
			setState(1133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				var_att2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1126);
				match(TK_COLON);
				setState(1127);
				type();
				setState(1128);
				match(TK_ASSIGN);
				setState(1129);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1131);
				var_att1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1132);
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

	public static class Var_att1Context extends ParserRuleContext {
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_att1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_att1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterVar_att1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitVar_att1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVar_att1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_att1Context var_att1() throws RecognitionException {
		Var_att1Context _localctx = new Var_att1Context(_ctx, getState());
		enterRule(_localctx, 254, RULE_var_att1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(TK_ASSIGN);
			setState(1136);
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

	public static class Var_att2Context extends ParserRuleContext {
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_att2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_att2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterVar_att2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitVar_att2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitVar_att2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_att2Context var_att2() throws RecognitionException {
		Var_att2Context _localctx = new Var_att2Context(_ctx, getState());
		enterRule(_localctx, 256, RULE_var_att2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			match(TK_COLON);
			setState(1139);
			type();
			}
		}
		catch (RecognitionException re) {
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
		int _startState = 258;
		enterRecursionRule(_localctx, 258, RULE_id_subs_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1142);
			id_subs();
			}
			_ctx.stop = _input.LT(-1);
			setState(1149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_subs_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_subs_lp);
					setState(1144);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1145);
					match(TK_COMMA);
					setState(1146);
					id_subs();
					}
					} 
				}
				setState(1151);
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
		enterRule(_localctx, 260, RULE_id_subs);
		try {
			setState(1155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1152);
				id_subsID();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				match(TK_ID);
				setState(1154);
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
		enterRule(_localctx, 262, RULE_id_subsID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
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
		int _startState = 264;
		enterRecursionRule(_localctx, 264, RULE_id_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1160);
			match(TK_ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(1167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_lp);
					setState(1162);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1163);
					match(TK_COMMA);
					setState(1164);
					match(TK_ID);
					}
					} 
				}
				setState(1169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		enterRule(_localctx, 266, RULE_skip_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
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
		enterRule(_localctx, 268, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
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
		enterRule(_localctx, 270, RULE_next_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
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
		enterRule(_localctx, 272, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
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
		enterRule(_localctx, 274, RULE_reply_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
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
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr_numContext expr_num() {
			return getRuleContext(Expr_numContext.class,0);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
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
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Constr_item_lpContext constr_item_lp() {
			return getRuleContext(Constr_item_lpContext.class,0);
		}
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public Prefix_exprContext prefix_expr() {
			return getRuleContext(Prefix_exprContext.class,0);
		}
		public Create_exprContext create_expr() {
			return getRuleContext(Create_exprContext.class,0);
		}
		public Expr11Context expr11() {
			return getRuleContext(Expr11Context.class,0);
		}
		public Expr12Context expr12() {
			return getRuleContext(Expr12Context.class,0);
		}
		public Expr13Context expr13() {
			return getRuleContext(Expr13Context.class,0);
		}
		public Expr14Context expr14() {
			return getRuleContext(Expr14Context.class,0);
		}
		public Expr15Context expr15() {
			return getRuleContext(Expr15Context.class,0);
		}
		public Expr16Context expr16() {
			return getRuleContext(Expr16Context.class,0);
		}
		public Expr17Context expr17() {
			return getRuleContext(Expr17Context.class,0);
		}
		public Expr18Context expr18() {
			return getRuleContext(Expr18Context.class,0);
		}
		public Expr19Context expr19() {
			return getRuleContext(Expr19Context.class,0);
		}
		public Expr20Context expr20() {
			return getRuleContext(Expr20Context.class,0);
		}
		public Expr21Context expr21() {
			return getRuleContext(Expr21Context.class,0);
		}
		public Expr22Context expr22() {
			return getRuleContext(Expr22Context.class,0);
		}
		public Expr23Context expr23() {
			return getRuleContext(Expr23Context.class,0);
		}
		public Expr24Context expr24() {
			return getRuleContext(Expr24Context.class,0);
		}
		public Expr25Context expr25() {
			return getRuleContext(Expr25Context.class,0);
		}
		public Expr26Context expr26() {
			return getRuleContext(Expr26Context.class,0);
		}
		public Expr27Context expr27() {
			return getRuleContext(Expr27Context.class,0);
		}
		public Expr28Context expr28() {
			return getRuleContext(Expr28Context.class,0);
		}
		public Expr29Context expr29() {
			return getRuleContext(Expr29Context.class,0);
		}
		public Expr30Context expr30() {
			return getRuleContext(Expr30Context.class,0);
		}
		public Expr31Context expr31() {
			return getRuleContext(Expr31Context.class,0);
		}
		public Expr32Context expr32() {
			return getRuleContext(Expr32Context.class,0);
		}
		public Expr33Context expr33() {
			return getRuleContext(Expr33Context.class,0);
		}
		public Expr34Context expr34() {
			return getRuleContext(Expr34Context.class,0);
		}
		public Expr35Context expr35() {
			return getRuleContext(Expr35Context.class,0);
		}
		public Expr36Context expr36() {
			return getRuleContext(Expr36Context.class,0);
		}
		public Expr37Context expr37() {
			return getRuleContext(Expr37Context.class,0);
		}
		public Expr38Context expr38() {
			return getRuleContext(Expr38Context.class,0);
		}
		public Expr39Context expr39() {
			return getRuleContext(Expr39Context.class,0);
		}
		public Expr40Context expr40() {
			return getRuleContext(Expr40Context.class,0);
		}
		public Expr41Context expr41() {
			return getRuleContext(Expr41Context.class,0);
		}
		public Expr42Context expr42() {
			return getRuleContext(Expr42Context.class,0);
		}
		public Expr43Context expr43() {
			return getRuleContext(Expr43Context.class,0);
		}
		public Paren_listContext paren_list() {
			return getRuleContext(Paren_listContext.class,0);
		}
		public Expr5Context expr5() {
			return getRuleContext(Expr5Context.class,0);
		}
		public Expr6Context expr6() {
			return getRuleContext(Expr6Context.class,0);
		}
		public Expr7Context expr7() {
			return getRuleContext(Expr7Context.class,0);
		}
		public Expr8Context expr8() {
			return getRuleContext(Expr8Context.class,0);
		}
		public Expr9Context expr9() {
			return getRuleContext(Expr9Context.class,0);
		}
		public Bound_lpContext bound_lp() {
			return getRuleContext(Bound_lpContext.class,0);
		}
		public Expr10Context expr10() {
			return getRuleContext(Expr10Context.class,0);
		}
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
		int _startState = 276;
		enterRecursionRule(_localctx, 276, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(1181);
				expr1();
				}
				break;
			case 2:
				{
				setState(1182);
				expr_num();
				}
				break;
			case 3:
				{
				setState(1183);
				expr2();
				}
				break;
			case 4:
				{
				setState(1184);
				literal();
				}
				break;
			case 5:
				{
				setState(1185);
				constructor();
				setState(1186);
				expr(43);
				}
				break;
			case 6:
				{
				setState(1188);
				expr3();
				setState(1189);
				constr_item_lp(0);
				setState(1190);
				expr4();
				}
				break;
			case 7:
				{
				setState(1192);
				prefix_expr();
				}
				break;
			case 8:
				{
				setState(1193);
				create_expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1350);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1196);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1197);
						expr11();
						setState(1198);
						expr(36);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1200);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1201);
						expr12();
						setState(1202);
						expr(35);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1204);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1205);
						expr13();
						setState(1206);
						expr(33);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1208);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1209);
						expr14();
						setState(1210);
						expr(32);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1212);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1213);
						expr15();
						setState(1214);
						expr(31);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1216);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1217);
						expr16();
						setState(1218);
						expr(30);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1220);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1221);
						expr17();
						setState(1222);
						expr(29);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1224);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1225);
						expr18();
						setState(1226);
						expr(28);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1228);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1229);
						expr19();
						setState(1230);
						expr(27);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1232);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1233);
						expr20();
						setState(1234);
						expr(26);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1236);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1237);
						expr21();
						setState(1238);
						expr(25);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1240);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1241);
						expr22();
						setState(1242);
						expr(24);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1244);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1245);
						expr23();
						setState(1246);
						expr(23);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1248);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1249);
						expr24();
						setState(1250);
						expr(22);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1252);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1253);
						expr25();
						setState(1254);
						expr(21);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1256);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1257);
						expr26();
						setState(1258);
						expr(20);
						}
						break;
					case 17:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1260);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1261);
						expr27();
						setState(1262);
						expr(19);
						}
						break;
					case 18:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1264);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1265);
						expr28();
						setState(1266);
						expr(18);
						}
						break;
					case 19:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1268);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1269);
						expr29();
						setState(1270);
						expr(17);
						}
						break;
					case 20:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1272);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1273);
						expr30();
						setState(1274);
						expr(16);
						}
						break;
					case 21:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1276);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1277);
						expr31();
						setState(1278);
						expr(15);
						}
						break;
					case 22:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1280);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1281);
						expr32();
						setState(1282);
						expr(14);
						}
						break;
					case 23:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1284);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1285);
						expr33();
						setState(1286);
						expr(13);
						}
						break;
					case 24:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1288);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1289);
						expr34();
						setState(1290);
						expr(12);
						}
						break;
					case 25:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1292);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1293);
						expr35();
						setState(1294);
						expr(11);
						}
						break;
					case 26:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1296);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1297);
						expr36();
						setState(1298);
						expr(10);
						}
						break;
					case 27:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1300);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1301);
						expr37();
						setState(1302);
						expr(9);
						}
						break;
					case 28:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1304);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1305);
						expr38();
						setState(1306);
						expr(8);
						}
						break;
					case 29:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1308);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1309);
						expr39();
						setState(1310);
						expr(7);
						}
						break;
					case 30:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1312);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1313);
						expr40();
						setState(1314);
						expr(6);
						}
						break;
					case 31:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1316);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1317);
						expr41();
						setState(1318);
						expr(5);
						}
						break;
					case 32:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1320);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1321);
						expr42();
						setState(1322);
						expr(4);
						}
						break;
					case 33:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1324);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1325);
						expr43();
						setState(1326);
						expr(3);
						}
						break;
					case 34:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1328);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(1329);
						paren_list();
						}
						break;
					case 35:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1330);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(1331);
						expr5();
						}
						break;
					case 36:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1332);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(1333);
						expr6();
						}
						break;
					case 37:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1334);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(1335);
						expr7();
						}
						break;
					case 38:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1336);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(1337);
						expr8();
						setState(1338);
						expr1();
						}
						break;
					case 39:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1340);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(1341);
						expr9();
						setState(1342);
						bound_lp(0);
						setState(1343);
						expr10();
						}
						break;
					case 40:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1345);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(1346);
						expr12();
						setState(1347);
						expr(0);
						setState(1348);
						constructor();
						}
						break;
					}
					} 
				}
				setState(1354);
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
		enterRule(_localctx, 278, RULE_expr_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1355);
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

	public static class Expr1Context extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 280, RULE_expr1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
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

	public static class Expr2Context extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(MiLenguajeParser.CADENA, 0); }
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 282, RULE_expr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			match(CADENA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr3Context extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 284, RULE_expr3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			match(TK_LPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr4Context extends ParserRuleContext {
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr4Context expr4() throws RecognitionException {
		Expr4Context _localctx = new Expr4Context(_ctx, getState());
		enterRule(_localctx, 286, RULE_expr4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
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

	public static class Expr5Context extends ParserRuleContext {
		public TerminalNode TK_INCR() { return getToken(MiLenguajeParser.TK_INCR, 0); }
		public Expr5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr5Context expr5() throws RecognitionException {
		Expr5Context _localctx = new Expr5Context(_ctx, getState());
		enterRule(_localctx, 288, RULE_expr5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			match(TK_INCR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr6Context extends ParserRuleContext {
		public TerminalNode TK_DECR() { return getToken(MiLenguajeParser.TK_DECR, 0); }
		public Expr6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr6Context expr6() throws RecognitionException {
		Expr6Context _localctx = new Expr6Context(_ctx, getState());
		enterRule(_localctx, 290, RULE_expr6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			match(TK_DECR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr7Context extends ParserRuleContext {
		public TerminalNode TK_HAT() { return getToken(MiLenguajeParser.TK_HAT, 0); }
		public Expr7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr7Context expr7() throws RecognitionException {
		Expr7Context _localctx = new Expr7Context(_ctx, getState());
		enterRule(_localctx, 292, RULE_expr7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			match(TK_HAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr8Context extends ParserRuleContext {
		public TerminalNode TK_PERIOD() { return getToken(MiLenguajeParser.TK_PERIOD, 0); }
		public Expr8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr8Context expr8() throws RecognitionException {
		Expr8Context _localctx = new Expr8Context(_ctx, getState());
		enterRule(_localctx, 294, RULE_expr8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			match(TK_PERIOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr9Context extends ParserRuleContext {
		public TerminalNode TK_LBRACKET() { return getToken(MiLenguajeParser.TK_LBRACKET, 0); }
		public Expr9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr9(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr9Context expr9() throws RecognitionException {
		Expr9Context _localctx = new Expr9Context(_ctx, getState());
		enterRule(_localctx, 296, RULE_expr9);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			match(TK_LBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr10Context extends ParserRuleContext {
		public TerminalNode TK_RBRACKET() { return getToken(MiLenguajeParser.TK_RBRACKET, 0); }
		public Expr10Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr10; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr10(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr10(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr10Context expr10() throws RecognitionException {
		Expr10Context _localctx = new Expr10Context(_ctx, getState());
		enterRule(_localctx, 298, RULE_expr10);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
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

	public static class Expr11Context extends ParserRuleContext {
		public TerminalNode TK_EXPON() { return getToken(MiLenguajeParser.TK_EXPON, 0); }
		public Expr11Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr11; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr11(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr11(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr11Context expr11() throws RecognitionException {
		Expr11Context _localctx = new Expr11Context(_ctx, getState());
		enterRule(_localctx, 300, RULE_expr11);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			match(TK_EXPON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr12Context extends ParserRuleContext {
		public TerminalNode TK_ASTER() { return getToken(MiLenguajeParser.TK_ASTER, 0); }
		public Expr12Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr12; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr12(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr12(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr12(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr12Context expr12() throws RecognitionException {
		Expr12Context _localctx = new Expr12Context(_ctx, getState());
		enterRule(_localctx, 302, RULE_expr12);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			match(TK_ASTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr13Context extends ParserRuleContext {
		public TerminalNode TK_DIV() { return getToken(MiLenguajeParser.TK_DIV, 0); }
		public Expr13Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr13; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr13(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr13(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr13(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr13Context expr13() throws RecognitionException {
		Expr13Context _localctx = new Expr13Context(_ctx, getState());
		enterRule(_localctx, 304, RULE_expr13);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			match(TK_DIV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr14Context extends ParserRuleContext {
		public TerminalNode TK_MOD() { return getToken(MiLenguajeParser.TK_MOD, 0); }
		public Expr14Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr14; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr14(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr14(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr14(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr14Context expr14() throws RecognitionException {
		Expr14Context _localctx = new Expr14Context(_ctx, getState());
		enterRule(_localctx, 306, RULE_expr14);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			match(TK_MOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr15Context extends ParserRuleContext {
		public TerminalNode TK_REMDR() { return getToken(MiLenguajeParser.TK_REMDR, 0); }
		public Expr15Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr15; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr15(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr15(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr15(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr15Context expr15() throws RecognitionException {
		Expr15Context _localctx = new Expr15Context(_ctx, getState());
		enterRule(_localctx, 308, RULE_expr15);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			match(TK_REMDR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr16Context extends ParserRuleContext {
		public TerminalNode TK_PLUS() { return getToken(MiLenguajeParser.TK_PLUS, 0); }
		public Expr16Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr16; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr16(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr16Context expr16() throws RecognitionException {
		Expr16Context _localctx = new Expr16Context(_ctx, getState());
		enterRule(_localctx, 310, RULE_expr16);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			match(TK_PLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr17Context extends ParserRuleContext {
		public TerminalNode TK_MINUS() { return getToken(MiLenguajeParser.TK_MINUS, 0); }
		public Expr17Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr17; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr17(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr17(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr17(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr17Context expr17() throws RecognitionException {
		Expr17Context _localctx = new Expr17Context(_ctx, getState());
		enterRule(_localctx, 312, RULE_expr17);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			match(TK_MINUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr18Context extends ParserRuleContext {
		public TerminalNode TK_CONCAT() { return getToken(MiLenguajeParser.TK_CONCAT, 0); }
		public Expr18Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr18; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr18(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr18(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr18(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr18Context expr18() throws RecognitionException {
		Expr18Context _localctx = new Expr18Context(_ctx, getState());
		enterRule(_localctx, 314, RULE_expr18);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			match(TK_CONCAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr19Context extends ParserRuleContext {
		public TerminalNode TK_EQ() { return getToken(MiLenguajeParser.TK_EQ, 0); }
		public Expr19Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr19; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr19(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr19(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr19(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr19Context expr19() throws RecognitionException {
		Expr19Context _localctx = new Expr19Context(_ctx, getState());
		enterRule(_localctx, 316, RULE_expr19);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			match(TK_EQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr20Context extends ParserRuleContext {
		public TerminalNode TK_NE() { return getToken(MiLenguajeParser.TK_NE, 0); }
		public Expr20Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr20; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr20(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr20(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr20(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr20Context expr20() throws RecognitionException {
		Expr20Context _localctx = new Expr20Context(_ctx, getState());
		enterRule(_localctx, 318, RULE_expr20);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			match(TK_NE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr21Context extends ParserRuleContext {
		public TerminalNode TK_GE() { return getToken(MiLenguajeParser.TK_GE, 0); }
		public Expr21Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr21; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr21(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr21(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr21(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr21Context expr21() throws RecognitionException {
		Expr21Context _localctx = new Expr21Context(_ctx, getState());
		enterRule(_localctx, 320, RULE_expr21);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			match(TK_GE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr22Context extends ParserRuleContext {
		public TerminalNode TK_LE() { return getToken(MiLenguajeParser.TK_LE, 0); }
		public Expr22Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr22; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr22(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr22(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr22(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr22Context expr22() throws RecognitionException {
		Expr22Context _localctx = new Expr22Context(_ctx, getState());
		enterRule(_localctx, 322, RULE_expr22);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			match(TK_LE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr23Context extends ParserRuleContext {
		public TerminalNode TK_GT() { return getToken(MiLenguajeParser.TK_GT, 0); }
		public Expr23Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr23; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr23(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr23(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr23(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr23Context expr23() throws RecognitionException {
		Expr23Context _localctx = new Expr23Context(_ctx, getState());
		enterRule(_localctx, 324, RULE_expr23);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			match(TK_GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr24Context extends ParserRuleContext {
		public TerminalNode TK_LT() { return getToken(MiLenguajeParser.TK_LT, 0); }
		public Expr24Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr24; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr24(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr24(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr24(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr24Context expr24() throws RecognitionException {
		Expr24Context _localctx = new Expr24Context(_ctx, getState());
		enterRule(_localctx, 326, RULE_expr24);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			match(TK_LT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr25Context extends ParserRuleContext {
		public TerminalNode TK_AND() { return getToken(MiLenguajeParser.TK_AND, 0); }
		public Expr25Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr25; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr25(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr25(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr25(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr25Context expr25() throws RecognitionException {
		Expr25Context _localctx = new Expr25Context(_ctx, getState());
		enterRule(_localctx, 328, RULE_expr25);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			match(TK_AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr26Context extends ParserRuleContext {
		public TerminalNode TK_OR() { return getToken(MiLenguajeParser.TK_OR, 0); }
		public Expr26Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr26; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr26(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr26(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr26(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr26Context expr26() throws RecognitionException {
		Expr26Context _localctx = new Expr26Context(_ctx, getState());
		enterRule(_localctx, 330, RULE_expr26);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			match(TK_OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr27Context extends ParserRuleContext {
		public TerminalNode TK_OR_() { return getToken(MiLenguajeParser.TK_OR_, 0); }
		public Expr27Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr27; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr27(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr27(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr27(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr27Context expr27() throws RecognitionException {
		Expr27Context _localctx = new Expr27Context(_ctx, getState());
		enterRule(_localctx, 332, RULE_expr27);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			match(TK_OR_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr28Context extends ParserRuleContext {
		public TerminalNode TK_XOR() { return getToken(MiLenguajeParser.TK_XOR, 0); }
		public Expr28Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr28; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr28(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr28(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr28(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr28Context expr28() throws RecognitionException {
		Expr28Context _localctx = new Expr28Context(_ctx, getState());
		enterRule(_localctx, 334, RULE_expr28);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			match(TK_XOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr29Context extends ParserRuleContext {
		public TerminalNode TK_RSHIFT() { return getToken(MiLenguajeParser.TK_RSHIFT, 0); }
		public Expr29Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr29; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr29(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr29(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr29(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr29Context expr29() throws RecognitionException {
		Expr29Context _localctx = new Expr29Context(_ctx, getState());
		enterRule(_localctx, 336, RULE_expr29);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			match(TK_RSHIFT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr30Context extends ParserRuleContext {
		public TerminalNode TK_LSHIFT() { return getToken(MiLenguajeParser.TK_LSHIFT, 0); }
		public Expr30Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr30; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr30(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr30(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr30(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr30Context expr30() throws RecognitionException {
		Expr30Context _localctx = new Expr30Context(_ctx, getState());
		enterRule(_localctx, 338, RULE_expr30);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			match(TK_LSHIFT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr31Context extends ParserRuleContext {
		public TerminalNode TK_SWAP() { return getToken(MiLenguajeParser.TK_SWAP, 0); }
		public Expr31Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr31; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr31(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr31(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr31(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr31Context expr31() throws RecognitionException {
		Expr31Context _localctx = new Expr31Context(_ctx, getState());
		enterRule(_localctx, 340, RULE_expr31);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			match(TK_SWAP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr32Context extends ParserRuleContext {
		public TerminalNode TK_ASSIGN() { return getToken(MiLenguajeParser.TK_ASSIGN, 0); }
		public Expr32Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr32; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr32(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr32Context expr32() throws RecognitionException {
		Expr32Context _localctx = new Expr32Context(_ctx, getState());
		enterRule(_localctx, 342, RULE_expr32);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			match(TK_ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr33Context extends ParserRuleContext {
		public TerminalNode TK_AUG_PLUS() { return getToken(MiLenguajeParser.TK_AUG_PLUS, 0); }
		public Expr33Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr33; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr33(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr33(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr33(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr33Context expr33() throws RecognitionException {
		Expr33Context _localctx = new Expr33Context(_ctx, getState());
		enterRule(_localctx, 344, RULE_expr33);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			match(TK_AUG_PLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr34Context extends ParserRuleContext {
		public TerminalNode TK_AUG_MINUS() { return getToken(MiLenguajeParser.TK_AUG_MINUS, 0); }
		public Expr34Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr34; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr34(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr34(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr34(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr34Context expr34() throws RecognitionException {
		Expr34Context _localctx = new Expr34Context(_ctx, getState());
		enterRule(_localctx, 346, RULE_expr34);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			match(TK_AUG_MINUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr35Context extends ParserRuleContext {
		public TerminalNode TK_AUG_ASTER() { return getToken(MiLenguajeParser.TK_AUG_ASTER, 0); }
		public Expr35Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr35; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr35(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr35(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr35(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr35Context expr35() throws RecognitionException {
		Expr35Context _localctx = new Expr35Context(_ctx, getState());
		enterRule(_localctx, 348, RULE_expr35);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			match(TK_AUG_ASTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr36Context extends ParserRuleContext {
		public TerminalNode TK_AUG_DIV() { return getToken(MiLenguajeParser.TK_AUG_DIV, 0); }
		public Expr36Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr36; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr36(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr36(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr36(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr36Context expr36() throws RecognitionException {
		Expr36Context _localctx = new Expr36Context(_ctx, getState());
		enterRule(_localctx, 350, RULE_expr36);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			match(TK_AUG_DIV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr37Context extends ParserRuleContext {
		public TerminalNode TK_AUG_REMDR() { return getToken(MiLenguajeParser.TK_AUG_REMDR, 0); }
		public Expr37Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr37; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr37(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr37(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr37(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr37Context expr37() throws RecognitionException {
		Expr37Context _localctx = new Expr37Context(_ctx, getState());
		enterRule(_localctx, 352, RULE_expr37);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(TK_AUG_REMDR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr38Context extends ParserRuleContext {
		public TerminalNode TK_AUG_EXPON() { return getToken(MiLenguajeParser.TK_AUG_EXPON, 0); }
		public Expr38Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr38; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr38(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr38(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr38(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr38Context expr38() throws RecognitionException {
		Expr38Context _localctx = new Expr38Context(_ctx, getState());
		enterRule(_localctx, 354, RULE_expr38);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			match(TK_AUG_EXPON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr39Context extends ParserRuleContext {
		public TerminalNode TK_AUG_OR() { return getToken(MiLenguajeParser.TK_AUG_OR, 0); }
		public Expr39Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr39; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr39(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr39(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr39(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr39Context expr39() throws RecognitionException {
		Expr39Context _localctx = new Expr39Context(_ctx, getState());
		enterRule(_localctx, 356, RULE_expr39);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			match(TK_AUG_OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr40Context extends ParserRuleContext {
		public TerminalNode TK_AUG_AND() { return getToken(MiLenguajeParser.TK_AUG_AND, 0); }
		public Expr40Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr40; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr40(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr40(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr40(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr40Context expr40() throws RecognitionException {
		Expr40Context _localctx = new Expr40Context(_ctx, getState());
		enterRule(_localctx, 358, RULE_expr40);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			match(TK_AUG_AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr41Context extends ParserRuleContext {
		public TerminalNode TK_AUG_CONCAT() { return getToken(MiLenguajeParser.TK_AUG_CONCAT, 0); }
		public Expr41Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr41; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr41(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr41(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr41(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr41Context expr41() throws RecognitionException {
		Expr41Context _localctx = new Expr41Context(_ctx, getState());
		enterRule(_localctx, 360, RULE_expr41);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			match(TK_AUG_CONCAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr42Context extends ParserRuleContext {
		public TerminalNode TK_AUG_RSHIFT() { return getToken(MiLenguajeParser.TK_AUG_RSHIFT, 0); }
		public Expr42Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr42; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr42(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr42(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr42(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr42Context expr42() throws RecognitionException {
		Expr42Context _localctx = new Expr42Context(_ctx, getState());
		enterRule(_localctx, 362, RULE_expr42);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			match(TK_AUG_RSHIFT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr43Context extends ParserRuleContext {
		public TerminalNode TK_AUG_LSHIFT() { return getToken(MiLenguajeParser.TK_AUG_LSHIFT, 0); }
		public Expr43Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr43; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpr43(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpr43(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpr43(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr43Context expr43() throws RecognitionException {
		Expr43Context _localctx = new Expr43Context(_ctx, getState());
		enterRule(_localctx, 364, RULE_expr43);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(TK_AUG_LSHIFT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 366, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
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
		enterRule(_localctx, 368, RULE_create_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(TK_CREATE);
			setState(1446);
			create_call();
			setState(1447);
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
		enterRule(_localctx, 370, RULE_create_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			rsrc_name();
			setState(1450);
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
		enterRule(_localctx, 372, RULE_rsrc_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
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
		enterRule(_localctx, 374, RULE_location_opt);
		try {
			setState(1457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1454);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1455);
				match(TK_ON);
				setState(1456);
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
		enterRule(_localctx, 376, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			match(TK_LPAREN);
			setState(1460);
			constr_item_lp(0);
			setState(1461);
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
		int _startState = 378;
		enterRecursionRule(_localctx, 378, RULE_constr_item_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1464);
			constr_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(1471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Constr_item_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constr_item_lp);
					setState(1466);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1467);
					match(TK_COMMA);
					setState(1468);
					constr_item();
					}
					} 
				}
				setState(1473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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
		enterRule(_localctx, 380, RULE_constr_item);
		try {
			setState(1480);
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
				setState(1474);
				expr(0);
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1475);
				match(TK_LBRACKET);
				setState(1476);
				expr(0);
				setState(1477);
				match(TK_RBRACKET);
				setState(1478);
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
		enterRule(_localctx, 382, RULE_prefix_expr);
		try {
			setState(1519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1482);
				match(TK_NOT);
				setState(1483);
				expr(0);
				}
				break;
			case TK_PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1484);
				match(TK_PLUS);
				setState(1485);
				expr(0);
				}
				break;
			case TK_MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1486);
				match(TK_MINUS);
				setState(1487);
				expr(0);
				}
				break;
			case TK_ADDR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1488);
				match(TK_ADDR);
				setState(1489);
				expr(0);
				}
				break;
			case TK_QMARK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1490);
				match(TK_QMARK);
				setState(1491);
				expr(0);
				}
				break;
			case TK_INCR:
				enterOuterAlt(_localctx, 6);
				{
				setState(1492);
				match(TK_INCR);
				setState(1493);
				expr(0);
				}
				break;
			case TK_DECR:
				enterOuterAlt(_localctx, 7);
				{
				setState(1494);
				match(TK_DECR);
				setState(1495);
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
				setState(1496);
				basic_type();
				setState(1497);
				paren_expr();
				}
				break;
			case TK_STRING:
				enterOuterAlt(_localctx, 9);
				{
				setState(1499);
				match(TK_STRING);
				setState(1500);
				paren_expr();
				setState(1501);
				match(TK_NOT);
				}
				break;
			case TK_LOW:
				enterOuterAlt(_localctx, 10);
				{
				setState(1503);
				match(TK_LOW);
				setState(1504);
				match(TK_LPAREN);
				setState(1505);
				type();
				setState(1506);
				match(TK_RPAREN);
				}
				break;
			case TK_HIGH:
				enterOuterAlt(_localctx, 11);
				{
				setState(1508);
				match(TK_HIGH);
				setState(1509);
				match(TK_LPAREN);
				setState(1510);
				type();
				setState(1511);
				match(TK_RPAREN);
				}
				break;
			case TK_NEW:
				enterOuterAlt(_localctx, 12);
				{
				setState(1513);
				match(TK_NEW);
				setState(1514);
				match(TK_LPAREN);
				setState(1515);
				subscripts_opt();
				setState(1516);
				new_item();
				setState(1517);
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
		enterRule(_localctx, 384, RULE_paren_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			match(TK_LPAREN);
			setState(1522);
			expr(0);
			setState(1523);
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
		enterRule(_localctx, 386, RULE_new_item);
		try {
			setState(1530);
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
				setState(1525);
				unsub_type();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1526);
				match(TK_SEM);
				setState(1527);
				sem_proto();
				}
				break;
			case TK_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1528);
				match(TK_OP);
				setState(1529);
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
		enterRule(_localctx, 388, RULE_sem_proto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
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
		enterRule(_localctx, 390, RULE_op_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			prototype();
			setState(1535);
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
		enterRule(_localctx, 392, RULE_op_restriction_opt);
		try {
			setState(1542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1537);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1538);
				match(TK_LBRACE);
				setState(1539);
				op_restriction();
				setState(1540);
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
		enterRule(_localctx, 394, RULE_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			parameters();
			setState(1545);
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
		enterRule(_localctx, 396, RULE_return_spec_opt);
		try {
			setState(1558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1547);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1548);
				match(TK_RETURNS);
				setState(1549);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1550);
				match(TK_RETURNS);
				setState(1551);
				id_subs();
				setState(1552);
				match(TK_COLON);
				setState(1553);
				type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1555);
				match(TK_RETURNS);
				setState(1556);
				match(TK_ID);
				setState(1557);
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
		enterRule(_localctx, 398, RULE_subscripts_opt);
		try {
			setState(1562);
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
				setState(1560);
				vacio();
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1561);
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
		enterRule(_localctx, 400, RULE_subscripts);
		try {
			setState(1568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1564);
				bracketed_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1565);
				bracketed_list();
				setState(1566);
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
		enterRule(_localctx, 402, RULE_bracketed_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			match(TK_LBRACKET);
			setState(1571);
			bound_lp(0);
			setState(1572);
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
		int _startState = 404;
		enterRecursionRule(_localctx, 404, RULE_bound_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1575);
			bounds();
			}
			_ctx.stop = _input.LT(-1);
			setState(1582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bound_lpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bound_lp);
					setState(1577);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1578);
					match(TK_COMMA);
					setState(1579);
					bounds();
					}
					} 
				}
				setState(1584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
		enterRule(_localctx, 406, RULE_bounds);
		try {
			setState(1590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1585);
				bound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1586);
				bound();
				setState(1587);
				match(TK_COLON);
				setState(1588);
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
		enterRule(_localctx, 408, RULE_bound);
		try {
			setState(1596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1592);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1593);
				match(TK_ASTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1594);
				vacio();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1595);
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
		enterRule(_localctx, 410, RULE_op_restriction);
		try {
			setState(1606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1598);
				match(TK_CALL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1599);
				match(TK_SEND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1600);
				match(TK_CALL);
				setState(1601);
				match(TK_COMMA);
				setState(1602);
				match(TK_SEND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1603);
				match(TK_SEND);
				setState(1604);
				match(TK_COMMA);
				setState(1605);
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
		enterRule(_localctx, 412, RULE_end_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			match(TK_END);
			setState(1609);
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
		enterRule(_localctx, 414, RULE_id_opt);
		try {
			setState(1613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1611);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1612);
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
		enterRule(_localctx, 416, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1615);
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
		enterRule(_localctx, 418, RULE_block_items);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			block_item();
			setState(1618);
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
		enterRule(_localctx, 420, RULE_block_items_);
		int _la;
		try {
			setState(1627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_SEPARATOR) {
					{
					setState(1620);
					match(TK_SEPARATOR);
					}
				}

				setState(1623);
				block_item();
				setState(1624);
				block_items_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1626);
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
		public Block_item1Context block_item1() {
			return getRuleContext(Block_item1Context.class,0);
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
		enterRule(_localctx, 422, RULE_block_item);
		try {
			setState(1633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1629);
				decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1630);
				stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1631);
				block_item1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1632);
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

	public static class Block_item1Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Block_item1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_item1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBlock_item1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBlock_item1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBlock_item1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_item1Context block_item1() throws RecognitionException {
		Block_item1Context _localctx = new Block_item1Context(_ctx, getState());
		enterRule(_localctx, 424, RULE_block_item1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
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
		enterRule(_localctx, 426, RULE_id_ls);
		try {
			setState(1639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1637);
				id_lp(0);
				}
				break;
			case TK_RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1638);
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
		enterRule(_localctx, 428, RULE_falta);
		try {
			setState(1643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(1641);
				match(T__0);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1642);
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
		enterRule(_localctx, 430, RULE_vacio);
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
		case 27:
			return spec_stmt_ls_sempred((Spec_stmt_lsContext)_localctx, predIndex);
		case 28:
			return body_stmt_ls_sempred((Body_stmt_lsContext)_localctx, predIndex);
		case 44:
			return in_cmd_lp_sempred((In_cmd_lpContext)_localctx, predIndex);
		case 53:
			return concurrent_cmd_lp_sempred((Concurrent_cmd_lpContext)_localctx, predIndex);
		case 55:
			return separator_opt_sempred((Separator_optContext)_localctx, predIndex);
		case 70:
			return guarded_cmd_lp_sempred((Guarded_cmd_lpContext)_localctx, predIndex);
		case 76:
			return expr_lp_sempred((Expr_lpContext)_localctx, predIndex);
		case 85:
			return import_list_sempred((Import_listContext)_localctx, predIndex);
		case 90:
			return oper_def_lp_sempred((Oper_def_lpContext)_localctx, predIndex);
		case 96:
			return sem_def_lp_sempred((Sem_def_lpContext)_localctx, predIndex);
		case 124:
			return var_def_lp_sempred((Var_def_lpContext)_localctx, predIndex);
		case 129:
			return id_subs_lp_sempred((Id_subs_lpContext)_localctx, predIndex);
		case 132:
			return id_lp_sempred((Id_lpContext)_localctx, predIndex);
		case 138:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 189:
			return constr_item_lp_sempred((Constr_item_lpContext)_localctx, predIndex);
		case 202:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008a\u0672\4\2\t"+
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
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\5\3\u01ba\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u01c5"+
		"\n\5\3\6\3\6\3\6\5\6\u01ca\n\6\3\6\3\6\3\6\5\6\u01cf\n\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u01ec\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u01f4\n\f\f\f\16\f\u01f7\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u0209\n\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\5\24\u0212\n\24\3\25\3\25\3\25\5\25\u0217\n\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u0223\n\30\3\31\3\31"+
		"\3\31\3\31\5\31\u0229\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0231\n"+
		"\32\3\33\3\33\3\33\3\33\5\33\u0237\n\33\3\34\3\34\5\34\u023b\n\34\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0242\n\35\3\35\3\35\3\35\7\35\u0247\n\35\f"+
		"\35\16\35\u024a\13\35\3\36\3\36\3\36\3\36\3\36\5\36\u0251\n\36\3\36\7"+
		"\36\u0254\n\36\f\36\16\36\u0257\13\36\3\37\3\37\3\37\3\37\5\37\u025d\n"+
		"\37\3 \3 \5 \u0261\n \3!\3!\3!\3!\3!\3!\5!\u0269\n!\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3$\3$\5$\u0277\n$\3%\3%\5%\u027b\n%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0291\n&\3\'\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-"+
		"\3-\3.\3.\3.\3.\3.\3.\7.\u02b4\n.\f.\16.\u02b7\13.\3/\3/\3/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u02c7\n\61\3\62\3\62\3\62\5"+
		"\62\u02cc\n\62\3\63\3\63\3\63\3\63\3\63\5\63\u02d3\n\63\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\7\67\u02e8\n\67\f\67\16\67\u02eb\13\67\38\38\38\38\38\39\3"+
		"9\39\39\39\79\u02f7\n9\f9\169\u02fa\139\3:\3:\3:\5:\u02ff\n:\3;\3;\3;"+
		"\5;\u0304\n;\3<\3<\3<\3=\3=\3=\3=\3=\5=\u030e\n=\3>\3>\3>\3?\3?\3?\3?"+
		"\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3F"+
		"\3F\3G\3G\3H\3H\3H\3H\3H\3H\7H\u0337\nH\fH\16H\u033a\13H\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\5I\u0344\nI\3J\3J\3K\3K\3K\3K\3K\5K\u034d\nK\3L\3L\3L\3L\3"+
		"M\3M\5M\u0355\nM\3N\3N\3N\3N\3N\3N\7N\u035d\nN\fN\16N\u0360\13N\3O\3O"+
		"\3P\3P\3P\3P\3Q\3Q\5Q\u036a\nQ\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0374\nR\3S"+
		"\3S\3S\3S\3S\3S\3S\3S\5S\u037e\nS\3T\3T\5T\u0382\nT\3U\3U\3U\3V\3V\3V"+
		"\3W\3W\3W\3W\3W\3W\7W\u0390\nW\fW\16W\u0393\13W\3X\3X\3X\3X\3X\5X\u039a"+
		"\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u03a6\nZ\3[\3[\3[\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\7\\\u03b1\n\\\f\\\16\\\u03b4\13\\\3]\3]\3]\3]\3]\3]\3]\5]\u03bd"+
		"\n]\3^\3^\5^\u03c1\n^\3_\3_\3`\3`\3`\3`\3`\3a\3a\3a\3b\3b\3b\3b\3b\3b"+
		"\7b\u03d3\nb\fb\16b\u03d6\13b\3c\3c\3c\3c\3d\3d\3d\5d\u03df\nd\3e\3e\5"+
		"e\u03e3\ne\3f\3f\3f\3f\3f\5f\u03ea\nf\3g\3g\3g\3g\3g\3g\3g\3g\5g\u03f4"+
		"\ng\3h\3h\3h\3h\5h\u03fa\nh\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3k\3k\3k\3l"+
		"\3l\3l\3l\3l\5l\u040e\nl\3m\3m\3m\3m\5m\u0414\nm\3n\3n\3n\3n\3n\5n\u041b"+
		"\nn\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3t\3t\3t\3t\3t\3t\5t\u042f\nt"+
		"\3u\3u\3v\3v\3v\3v\3v\5v\u0438\nv\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\5w\u0444"+
		"\nw\3x\3x\5x\u0448\nx\3y\3y\3y\3z\3z\3z\3z\3z\3{\3{\5{\u0454\n{\3|\3|"+
		"\3}\3}\3~\3~\3~\3~\3~\3~\7~\u0460\n~\f~\16~\u0463\13~\3\177\3\177\3\177"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u0470\n\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u047e\n\u0083\f\u0083"+
		"\16\u0083\u0481\13\u0083\3\u0084\3\u0084\3\u0084\5\u0084\u0486\n\u0084"+
		"\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\7\u0086"+
		"\u0490\n\u0086\f\u0086\16\u0086\u0493\13\u0086\3\u0087\3\u0087\3\u0088"+
		"\3\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\5\u008c\u04ad\n\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c\u0549"+
		"\n\u008c\f\u008c\16\u008c\u054c\13\u008c\3\u008d\3\u008d\3\u008e\3\u008e"+
		"\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0093"+
		"\3\u0093\3\u0094\3\u0094\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0099\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009c"+
		"\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a5"+
		"\3\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9"+
		"\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ae"+
		"\3\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2"+
		"\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b7"+
		"\3\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\5\u00bd"+
		"\u05b4\n\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00bf\7\u00bf\u05c0\n\u00bf\f\u00bf\16\u00bf\u05c3"+
		"\13\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u05cb"+
		"\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c1\5\u00c1\u05f2\n\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u05fd\n\u00c3\3\u00c4"+
		"\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\5\u00c6\u0609\n\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8"+
		"\u0619\n\u00c8\3\u00c9\3\u00c9\5\u00c9\u061d\n\u00c9\3\u00ca\3\u00ca\3"+
		"\u00ca\3\u00ca\5\u00ca\u0623\n\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3"+
		"\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\7\u00cc\u062f\n\u00cc\f"+
		"\u00cc\16\u00cc\u0632\13\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\5\u00cd\u0639\n\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u063f\n"+
		"\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\5\u00cf\u0649\n\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d1\3\u00d1\5\u00d1"+
		"\u0650\n\u00d1\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d4\5\u00d4"+
		"\u0658\n\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u065e\n\u00d4\3"+
		"\u00d5\3\u00d5\3\u00d5\3\u00d5\5\u00d5\u0664\n\u00d5\3\u00d6\3\u00d6\3"+
		"\u00d7\3\u00d7\5\u00d7\u066a\n\u00d7\3\u00d8\3\u00d8\5\u00d8\u066e\n\u00d8"+
		"\3\u00d9\3\u00d9\3\u00d9\2\23\268:Zlp\u008e\u009a\u00ac\u00b6\u00c2\u00fa"+
		"\u0104\u010a\u0116\u017c\u0196\u00da\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170"+
		"\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188"+
		"\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0"+
		"\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\2\5\4\2\4\4MM\3\2OU\4"+
		"\2||\u0086\u0086\2\u0667\2\u01b2\3\2\2\2\4\u01b9\3\2\2\2\6\u01bb\3\2\2"+
		"\2\b\u01c4\3\2\2\2\n\u01c6\3\2\2\2\f\u01d0\3\2\2\2\16\u01d2\3\2\2\2\20"+
		"\u01d9\3\2\2\2\22\u01e0\3\2\2\2\24\u01eb\3\2\2\2\26\u01ed\3\2\2\2\30\u01f8"+
		"\3\2\2\2\32\u0200\3\2\2\2\34\u0202\3\2\2\2\36\u0204\3\2\2\2 \u0208\3\2"+
		"\2\2\"\u020a\3\2\2\2$\u020c\3\2\2\2&\u0211\3\2\2\2(\u0216\3\2\2\2*\u0218"+
		"\3\2\2\2,\u021a\3\2\2\2.\u0222\3\2\2\2\60\u0228\3\2\2\2\62\u0230\3\2\2"+
		"\2\64\u0236\3\2\2\2\66\u023a\3\2\2\28\u023c\3\2\2\2:\u024b\3\2\2\2<\u025c"+
		"\3\2\2\2>\u0260\3\2\2\2@\u0268\3\2\2\2B\u026a\3\2\2\2D\u026f\3\2\2\2F"+
		"\u0276\3\2\2\2H\u027a\3\2\2\2J\u0290\3\2\2\2L\u0292\3\2\2\2N\u0297\3\2"+
		"\2\2P\u029a\3\2\2\2R\u029d\3\2\2\2T\u02a0\3\2\2\2V\u02a3\3\2\2\2X\u02a8"+
		"\3\2\2\2Z\u02ad\3\2\2\2\\\u02b8\3\2\2\2^\u02bf\3\2\2\2`\u02c6\3\2\2\2"+
		"b\u02cb\3\2\2\2d\u02d2\3\2\2\2f\u02d4\3\2\2\2h\u02d8\3\2\2\2j\u02dd\3"+
		"\2\2\2l\u02e1\3\2\2\2n\u02ec\3\2\2\2p\u02f1\3\2\2\2r\u02fe\3\2\2\2t\u0303"+
		"\3\2\2\2v\u0305\3\2\2\2x\u030d\3\2\2\2z\u030f\3\2\2\2|\u0312\3\2\2\2~"+
		"\u0316\3\2\2\2\u0080\u031b\3\2\2\2\u0082\u0320\3\2\2\2\u0084\u0322\3\2"+
		"\2\2\u0086\u0324\3\2\2\2\u0088\u032a\3\2\2\2\u008a\u032c\3\2\2\2\u008c"+
		"\u032e\3\2\2\2\u008e\u0330\3\2\2\2\u0090\u0343\3\2\2\2\u0092\u0345\3\2"+
		"\2\2\u0094\u034c\3\2\2\2\u0096\u034e\3\2\2\2\u0098\u0354\3\2\2\2\u009a"+
		"\u0356\3\2\2\2\u009c\u0361\3\2\2\2\u009e\u0363\3\2\2\2\u00a0\u0369\3\2"+
		"\2\2\u00a2\u0373\3\2\2\2\u00a4\u037d\3\2\2\2\u00a6\u0381\3\2\2\2\u00a8"+
		"\u0383\3\2\2\2\u00aa\u0386\3\2\2\2\u00ac\u0389\3\2\2\2\u00ae\u0399\3\2"+
		"\2\2\u00b0\u039b\3\2\2\2\u00b2\u03a5\3\2\2\2\u00b4\u03a7\3\2\2\2\u00b6"+
		"\u03aa\3\2\2\2\u00b8\u03bc\3\2\2\2\u00ba\u03c0\3\2\2\2\u00bc\u03c2\3\2"+
		"\2\2\u00be\u03c4\3\2\2\2\u00c0\u03c9\3\2\2\2\u00c2\u03cc\3\2\2\2\u00c4"+
		"\u03d7\3\2\2\2\u00c6\u03de\3\2\2\2\u00c8\u03e2\3\2\2\2\u00ca\u03e9\3\2"+
		"\2\2\u00cc\u03f3\3\2\2\2\u00ce\u03f9\3\2\2\2\u00d0\u03fb\3\2\2\2\u00d2"+
		"\u0400\3\2\2\2\u00d4\u0405\3\2\2\2\u00d6\u040d\3\2\2\2\u00d8\u0413\3\2"+
		"\2\2\u00da\u041a\3\2\2\2\u00dc\u041c\3\2\2\2\u00de\u041e\3\2\2\2\u00e0"+
		"\u0420\3\2\2\2\u00e2\u0422\3\2\2\2\u00e4\u0424\3\2\2\2\u00e6\u042e\3\2"+
		"\2\2\u00e8\u0430\3\2\2\2\u00ea\u0437\3\2\2\2\u00ec\u0443\3\2\2\2\u00ee"+
		"\u0447\3\2\2\2\u00f0\u0449\3\2\2\2\u00f2\u044c\3\2\2\2\u00f4\u0453\3\2"+
		"\2\2\u00f6\u0455\3\2\2\2\u00f8\u0457\3\2\2\2\u00fa\u0459\3\2\2\2\u00fc"+
		"\u0464\3\2\2\2\u00fe\u046f\3\2\2\2\u0100\u0471\3\2\2\2\u0102\u0474\3\2"+
		"\2\2\u0104\u0477\3\2\2\2\u0106\u0485\3\2\2\2\u0108\u0487\3\2\2\2\u010a"+
		"\u0489\3\2\2\2\u010c\u0494\3\2\2\2\u010e\u0496\3\2\2\2\u0110\u0498\3\2"+
		"\2\2\u0112\u049a\3\2\2\2\u0114\u049c\3\2\2\2\u0116\u04ac\3\2\2\2\u0118"+
		"\u054d\3\2\2\2\u011a\u054f\3\2\2\2\u011c\u0551\3\2\2\2\u011e\u0553\3\2"+
		"\2\2\u0120\u0555\3\2\2\2\u0122\u0557\3\2\2\2\u0124\u0559\3\2\2\2\u0126"+
		"\u055b\3\2\2\2\u0128\u055d\3\2\2\2\u012a\u055f\3\2\2\2\u012c\u0561\3\2"+
		"\2\2\u012e\u0563\3\2\2\2\u0130\u0565\3\2\2\2\u0132\u0567\3\2\2\2\u0134"+
		"\u0569\3\2\2\2\u0136\u056b\3\2\2\2\u0138\u056d\3\2\2\2\u013a\u056f\3\2"+
		"\2\2\u013c\u0571\3\2\2\2\u013e\u0573\3\2\2\2\u0140\u0575\3\2\2\2\u0142"+
		"\u0577\3\2\2\2\u0144\u0579\3\2\2\2\u0146\u057b\3\2\2\2\u0148\u057d\3\2"+
		"\2\2\u014a\u057f\3\2\2\2\u014c\u0581\3\2\2\2\u014e\u0583\3\2\2\2\u0150"+
		"\u0585\3\2\2\2\u0152\u0587\3\2\2\2\u0154\u0589\3\2\2\2\u0156\u058b\3\2"+
		"\2\2\u0158\u058d\3\2\2\2\u015a\u058f\3\2\2\2\u015c\u0591\3\2\2\2\u015e"+
		"\u0593\3\2\2\2\u0160\u0595\3\2\2\2\u0162\u0597\3\2\2\2\u0164\u0599\3\2"+
		"\2\2\u0166\u059b\3\2\2\2\u0168\u059d\3\2\2\2\u016a\u059f\3\2\2\2\u016c"+
		"\u05a1\3\2\2\2\u016e\u05a3\3\2\2\2\u0170\u05a5\3\2\2\2\u0172\u05a7\3\2"+
		"\2\2\u0174\u05ab\3\2\2\2\u0176\u05ae\3\2\2\2\u0178\u05b3\3\2\2\2\u017a"+
		"\u05b5\3\2\2\2\u017c\u05b9\3\2\2\2\u017e\u05ca\3\2\2\2\u0180\u05f1\3\2"+
		"\2\2\u0182\u05f3\3\2\2\2\u0184\u05fc\3\2\2\2\u0186\u05fe\3\2\2\2\u0188"+
		"\u0600\3\2\2\2\u018a\u0608\3\2\2\2\u018c\u060a\3\2\2\2\u018e\u0618\3\2"+
		"\2\2\u0190\u061c\3\2\2\2\u0192\u0622\3\2\2\2\u0194\u0624\3\2\2\2\u0196"+
		"\u0628\3\2\2\2\u0198\u0638\3\2\2\2\u019a\u063e\3\2\2\2\u019c\u0648\3\2"+
		"\2\2\u019e\u064a\3\2\2\2\u01a0\u064f\3\2\2\2\u01a2\u0651\3\2\2\2\u01a4"+
		"\u0653\3\2\2\2\u01a6\u065d\3\2\2\2\u01a8\u0663\3\2\2\2\u01aa\u0665\3\2"+
		"\2\2\u01ac\u0669\3\2\2\2\u01ae\u066d\3\2\2\2\u01b0\u066f\3\2\2\2\u01b2"+
		"\u01b3\5\4\3\2\u01b3\3\3\2\2\2\u01b4\u01ba\5\6\4\2\u01b5\u01ba\5\n\6\2"+
		"\u01b6\u01ba\5\f\7\2\u01b7\u01ba\5\16\b\2\u01b8\u01ba\5\u01a2\u00d2\2"+
		"\u01b9\u01b4\3\2\2\2\u01b9\u01b5\3\2\2\2\u01b9\u01b6\3\2\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba\5\3\2\2\2\u01bb\u01bc\7f\2\2\u01bc"+
		"\u01bd\7\u0086\2\2\u01bd\u01be\58\35\2\u01be\u01bf\5\62\32\2\u01bf\7\3"+
		"\2\2\2\u01c0\u01c1\7f\2\2\u01c1\u01c5\7\u0086\2\2\u01c2\u01c3\7g\2\2\u01c3"+
		"\u01c5\7\u0086\2\2\u01c4\u01c0\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\t\3\2"+
		"\2\2\u01c6\u01c7\7g\2\2\u01c7\u01c9\7\u0086\2\2\u01c8\u01ca\5\u009eP\2"+
		"\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc"+
		"\58\35\2\u01cc\u01ce\5\62\32\2\u01cd\u01cf\5\u019e\u00d0\2\u01ce\u01cd"+
		"\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\13\3\2\2\2\u01d0\u01d1\5\62\32\2\u01d1"+
		"\r\3\2\2\2\u01d2\u01d3\7i\2\2\u01d3\u01d4\7\u0086\2\2\u01d4\u01d5\5,\27"+
		"\2\u01d5\u01d6\58\35\2\u01d6\u01d7\5\62\32\2\u01d7\u01d8\5\u019e\u00d0"+
		"\2\u01d8\17\3\2\2\2\u01d9\u01da\7C\2\2\u01da\u01db\7\u0086\2\2\u01db\u01dc"+
		"\5*\26\2\u01dc\u01dd\5\24\13\2\u01dd\u01de\5\u01a2\u00d2\2\u01de\u01df"+
		"\5\u019e\u00d0\2\u01df\21\3\2\2\2\u01e0\u01e1\7D\2\2\u01e1\u01e2\7\u0086"+
		"\2\2\u01e2\u01e3\5\u018c\u00c7\2\u01e3\u01e4\5\u01a2\u00d2\2\u01e4\u01e5"+
		"\5\u019e\u00d0\2\u01e5\23\3\2\2\2\u01e6\u01ec\5\u01b0\u00d9\2\u01e7\u01e8"+
		"\7\20\2\2\u01e8\u01e9\5\26\f\2\u01e9\u01ea\7\21\2\2\u01ea\u01ec\3\2\2"+
		"\2\u01eb\u01e6\3\2\2\2\u01eb\u01e7\3\2\2\2\u01ec\25\3\2\2\2\u01ed\u01ee"+
		"\b\f\1\2\u01ee\u01ef\5\30\r\2\u01ef\u01f5\3\2\2\2\u01f0\u01f1\f\3\2\2"+
		"\u01f1\u01f2\7\22\2\2\u01f2\u01f4\5\30\r\2\u01f3\u01f0\3\2\2\2\u01f4\u01f7"+
		"\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\27\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f8\u01f9\5\32\16\2\u01f9\u01fa\5\34\17\2\u01fa\u01fb"+
		"\5\u0116\u008c\2\u01fb\u01fc\5 \21\2\u01fc\u01fd\5\36\20\2\u01fd\u01fe"+
		"\5&\24\2\u01fe\u01ff\5(\25\2\u01ff\31\3\2\2\2\u0200\u0201\7\u0086\2\2"+
		"\u0201\33\3\2\2\2\u0202\u0203\7\n\2\2\u0203\35\3\2\2\2\u0204\u0205\5\u0116"+
		"\u008c\2\u0205\37\3\2\2\2\u0206\u0209\5\"\22\2\u0207\u0209\5$\23\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209!\3\2\2\2\u020a\u020b\7F\2\2\u020b"+
		"#\3\2\2\2\u020c\u020d\7H\2\2\u020d%\3\2\2\2\u020e\u0212\5\u01b0\u00d9"+
		"\2\u020f\u0210\7E\2\2\u0210\u0212\5\u0116\u008c\2\u0211\u020e\3\2\2\2"+
		"\u0211\u020f\3\2\2\2\u0212\'\3\2\2\2\u0213\u0217\5\u01b0\u00d9\2\u0214"+
		"\u0215\7G\2\2\u0215\u0217\5\u0116\u008c\2\u0216\u0213\3\2\2\2\u0216\u0214"+
		"\3\2\2\2\u0217)\3\2\2\2\u0218\u0219\5\u01b0\u00d9\2\u0219+\3\2\2\2\u021a"+
		"\u021b\7\20\2\2\u021b\u021c\5\u01ac\u00d7\2\u021c\u021d\7\21\2\2\u021d"+
		"\u021e\5.\30\2\u021e-\3\2\2\2\u021f\u0223\5\u01b0\u00d9\2\u0220\u0221"+
		"\7z\2\2\u0221\u0223\7\u0086\2\2\u0222\u021f\3\2\2\2\u0222\u0220\3\2\2"+
		"\2\u0223/\3\2\2\2\u0224\u0229\5\u00a6T\2\u0225\u0229\5\u00a8U\2\u0226"+
		"\u0229\5<\37\2\u0227\u0229\5\u00aeX\2\u0228\u0224\3\2\2\2\u0228\u0225"+
		"\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0227\3\2\2\2\u0229\61\3\2\2\2\u022a"+
		"\u0231\5\u01b0\u00d9\2\u022b\u022c\7h\2\2\u022c\u022d\7\u0086\2\2\u022d"+
		"\u022e\5\66\34\2\u022e\u022f\5\64\33\2\u022f\u0231\3\2\2\2\u0230\u022a"+
		"\3\2\2\2\u0230\u022b\3\2\2\2\u0231\63\3\2\2\2\u0232\u0233\5:\36\2\u0233"+
		"\u0234\5\u019e\u00d0\2\u0234\u0237\3\2\2\2\u0235\u0237\7o\2\2\u0236\u0232"+
		"\3\2\2\2\u0236\u0235\3\2\2\2\u0237\65\3\2\2\2\u0238\u023b\5\u009cO\2\u0239"+
		"\u023b\5\u01b0\u00d9\2\u023a\u0238\3\2\2\2\u023a\u0239\3\2\2\2\u023b\67"+
		"\3\2\2\2\u023c\u023d\b\35\1\2\u023d\u023e\5\60\31\2\u023e\u0248\3\2\2"+
		"\2\u023f\u0241\f\4\2\2\u0240\u0242\7\13\2\2\u0241\u0240\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0247\5\60\31\2\u0244\u0245\f"+
		"\3\2\2\u0245\u0247\5\60\31\2\u0246\u023f\3\2\2\2\u0246\u0244\3\2\2\2\u0247"+
		"\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u02499\3\2\2\2"+
		"\u024a\u0248\3\2\2\2\u024b\u024c\b\36\1\2\u024c\u024d\5<\37\2\u024d\u0255"+
		"\3\2\2\2\u024e\u0250\f\3\2\2\u024f\u0251\7\13\2\2\u0250\u024f\3\2\2\2"+
		"\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\5<\37\2\u0253\u024e"+
		"\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		";\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u025d\5\u00a6T\2\u0259\u025d\5\u0116"+
		"\u008c\2\u025a\u025d\5@!\2\u025b\u025d\5\u00a8U\2\u025c\u0258\3\2\2\2"+
		"\u025c\u0259\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025b\3\2\2\2\u025d=\3"+
		"\2\2\2\u025e\u0261\7\13\2\2\u025f\u0261\5\u01b0\u00d9\2\u0260\u025e\3"+
		"\2\2\2\u0260\u025f\3\2\2\2\u0261?\3\2\2\2\u0262\u0269\5J&\2\u0263\u0269"+
		"\5\16\b\2\u0264\u0269\5\20\t\2\u0265\u0269\5\22\n\2\u0266\u0269\5B\"\2"+
		"\u0267\u0269\5D#\2\u0268\u0262\3\2\2\2\u0268\u0263\3\2\2\2\u0268\u0264"+
		"\3\2\2\2\u0268\u0265\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0267\3\2\2\2\u0269"+
		"A\3\2\2\2\u026a\u026b\7\u0084\2\2\u026b\u026c\5\u01a2\u00d2\2\u026c\u026d"+
		"\7e\2\2\u026d\u026e\5H%\2\u026eC\3\2\2\2\u026f\u0270\7\u0085\2\2\u0270"+
		"\u0271\5\u01a2\u00d2\2\u0271\u0272\7e\2\2\u0272\u0273\5F$\2\u0273E\3\2"+
		"\2\2\u0274\u0277\5\u01b0\u00d9\2\u0275\u0277\7\u0085\2\2\u0276\u0274\3"+
		"\2\2\2\u0276\u0275\3\2\2\2\u0277G\3\2\2\2\u0278\u027b\5\u01b0\u00d9\2"+
		"\u0279\u027b\7\u0084\2\2\u027a\u0278\3\2\2\2\u027a\u0279\3\2\2\2\u027b"+
		"I\3\2\2\2\u027c\u0291\5\u010c\u0087\2\u027d\u0291\5N(\2\u027e\u0291\5"+
		"\u010e\u0088\2\u027f\u0291\5\u0110\u0089\2\u0280\u0291\5\u0112\u008a\2"+
		"\u0281\u0291\5\u0114\u008b\2\u0282\u0291\5L\'\2\u0283\u0291\5P)\2\u0284"+
		"\u0291\5R*\2\u0285\u0291\5T+\2\u0286\u0291\5z>\2\u0287\u0291\5|?\2\u0288"+
		"\u0291\5~@\2\u0289\u0291\5\u0080A\2\u028a\u0291\5\u0086D\2\u028b\u0291"+
		"\5V,\2\u028c\u0291\5X-\2\u028d\u0291\5f\64\2\u028e\u0291\5h\65\2\u028f"+
		"\u0291\5j\66\2\u0290\u027c\3\2\2\2\u0290\u027d\3\2\2\2\u0290\u027e\3\2"+
		"\2\2\u0290\u027f\3\2\2\2\u0290\u0280\3\2\2\2\u0290\u0281\3\2\2\2\u0290"+
		"\u0282\3\2\2\2\u0290\u0283\3\2\2\2\u0290\u0284\3\2\2\2\u0290\u0285\3\2"+
		"\2\2\u0290\u0286\3\2\2\2\u0290\u0287\3\2\2\2\u0290\u0288\3\2\2\2\u0290"+
		"\u0289\3\2\2\2\u0290\u028a\3\2\2\2\u0290\u028b\3\2\2\2\u0290\u028c\3\2"+
		"\2\2\u0290\u028d\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u028f\3\2\2\2\u0291"+
		"K\3\2\2\2\u0292\u0293\7\u0086\2\2\u0293\u0294\7\20\2\2\u0294\u0295\5\u0196"+
		"\u00cc\2\u0295\u0296\7\21\2\2\u0296M\3\2\2\2\u0297\u0298\7~\2\2\u0298"+
		"\u0299\5x=\2\u0299O\3\2\2\2\u029a\u029b\7`\2\2\u029b\u029c\5v<\2\u029c"+
		"Q\3\2\2\2\u029d\u029e\7a\2\2\u029e\u029f\5v<\2\u029fS\3\2\2\2\u02a0\u02a1"+
		"\7b\2\2\u02a1\u02a2\5v<\2\u02a2U\3\2\2\2\u02a3\u02a4\7=\2\2\u02a4\u02a5"+
		"\7\20\2\2\u02a5\u02a6\5\u0116\u008c\2\u02a6\u02a7\7\21\2\2\u02a7W\3\2"+
		"\2\2\u02a8\u02a9\7>\2\2\u02a9\u02aa\5Z.\2\u02aa\u02ab\5\u0094K\2\u02ab"+
		"\u02ac\7?\2\2\u02acY\3\2\2\2\u02ad\u02ae\b.\1\2\u02ae\u02af\5\\/\2\u02af"+
		"\u02b5\3\2\2\2\u02b0\u02b1\f\3\2\2\u02b1\u02b2\7\27\2\2\u02b2\u02b4\5"+
		"\\/\2\u02b3\u02b0\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6[\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02b9\5\24\13"+
		"\2\u02b9\u02ba\5^\60\2\u02ba\u02bb\5d\63\2\u02bb\u02bc\5b\62\2\u02bc\u02bd"+
		"\7\26\2\2\u02bd\u02be\5\u01a2\u00d2\2\u02be]\3\2\2\2\u02bf\u02c0\5`\61"+
		"\2\u02c0\u02c1\5,\27\2\u02c1_\3\2\2\2\u02c2\u02c7\5\u00d8m\2\u02c3\u02c4"+
		"\5\u00d8m\2\u02c4\u02c5\5\u0192\u00ca\2\u02c5\u02c7\3\2\2\2\u02c6\u02c2"+
		"\3\2\2\2\u02c6\u02c3\3\2\2\2\u02c7a\3\2\2\2\u02c8\u02cc\5\u01b0\u00d9"+
		"\2\u02c9\u02ca\7E\2\2\u02ca\u02cc\5\u0116\u008c\2\u02cb\u02c8\3\2\2\2"+
		"\u02cb\u02c9\3\2\2\2\u02ccc\3\2\2\2\u02cd\u02d3\5\u01b0\u00d9\2\u02ce"+
		"\u02cf\7$\2\2\u02cf\u02d3\5\u0116\u008c\2\u02d0\u02d1\7G\2\2\u02d1\u02d3"+
		"\5\u0116\u008c\2\u02d2\u02cd\3\2\2\2\u02d2\u02ce\3\2\2\2\u02d2\u02d0\3"+
		"\2\2\2\u02d3e\3\2\2\2\u02d4\u02d5\79\2\2\u02d5\u02d6\5\u0116\u008c\2\u02d6"+
		"\u02d7\5\u0096L\2\u02d7g\3\2\2\2\u02d8\u02d9\7:\2\2\u02d9\u02da\7\20\2"+
		"\2\u02da\u02db\5\u0116\u008c\2\u02db\u02dc\7\21\2\2\u02dci\3\2\2\2\u02dd"+
		"\u02de\7;\2\2\u02de\u02df\5l\67\2\u02df\u02e0\7<\2\2\u02e0k\3\2\2\2\u02e1"+
		"\u02e2\b\67\1\2\u02e2\u02e3\5n8\2\u02e3\u02e9\3\2\2\2\u02e4\u02e5\f\3"+
		"\2\2\u02e5\u02e6\7\5\2\2\u02e6\u02e8\5n8\2\u02e7\u02e4\3\2\2\2\u02e8\u02eb"+
		"\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02eam\3\2\2\2\u02eb"+
		"\u02e9\3\2\2\2\u02ec\u02ed\5\24\13\2\u02ed\u02ee\5p9\2\u02ee\u02ef\5r"+
		":\2\u02ef\u02f0\5t;\2\u02f0o\3\2\2\2\u02f1\u02f2\b9\1\2\u02f2\u02f3\5"+
		"\u01b0\u00d9\2\u02f3\u02f8\3\2\2\2\u02f4\u02f5\f\3\2\2\u02f5\u02f7\7\13"+
		"\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8"+
		"\u02f9\3\2\2\2\u02f9q\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02ff\5T+\2\u02fc"+
		"\u02ff\5R*\2\u02fd\u02ff\5\u0116\u008c\2\u02fe\u02fb\3\2\2\2\u02fe\u02fc"+
		"\3\2\2\2\u02fe\u02fd\3\2\2\2\u02ffs\3\2\2\2\u0300\u0304\5\u01b0\u00d9"+
		"\2\u0301\u0302\7\26\2\2\u0302\u0304\5\u01a2\u00d2\2\u0303\u0300\3\2\2"+
		"\2\u0303\u0301\3\2\2\2\u0304u\3\2\2\2\u0305\u0306\5\u0116\u008c\2\u0306"+
		"\u0307\5\u0096L\2\u0307w\3\2\2\2\u0308\u030e\5\u01b0\u00d9\2\u0309\u030a"+
		"\7\20\2\2\u030a\u030b\5\u0116\u008c\2\u030b\u030c\7\21\2\2\u030c\u030e"+
		"\3\2\2\2\u030d\u0308\3\2\2\2\u030d\u0309\3\2\2\2\u030ey\3\2\2\2\u030f"+
		"\u0310\7c\2\2\u0310\u0311\5\u0116\u008c\2\u0311{\3\2\2\2\u0312\u0313\7"+
		"d\2\2\u0313\u0314\5\u01a2\u00d2\2\u0314\u0315\7e\2\2\u0315}\3\2\2\2\u0316"+
		"\u0317\7W\2\2\u0317\u0318\5\u008eH\2\u0318\u0319\5\u0094K\2\u0319\u031a"+
		"\7X\2\2\u031a\177\3\2\2\2\u031b\u031c\5\u0082B\2\u031c\u031d\5\u008eH"+
		"\2\u031d\u031e\5\u0094K\2\u031e\u031f\5\u0084C\2\u031f\u0081\3\2\2\2\u0320"+
		"\u0321\7Y\2\2\u0321\u0083\3\2\2\2\u0322\u0323\7Z\2\2\u0323\u0085\3\2\2"+
		"\2\u0324\u0325\5\u0088E\2\u0325\u0326\5\26\f\2\u0326\u0327\5\u008aF\2"+
		"\u0327\u0328\5\u01a2\u00d2\2\u0328\u0329\5\u008cG\2\u0329\u0087\3\2\2"+
		"\2\u032a\u032b\7A\2\2\u032b\u0089\3\2\2\2\u032c\u032d\7\26\2\2\u032d\u008b"+
		"\3\2\2\2\u032e\u032f\7B\2\2\u032f\u008d\3\2\2\2\u0330\u0331\bH\1\2\u0331"+
		"\u0332\5\u0090I\2\u0332\u0338\3\2\2\2\u0333\u0334\f\3\2\2\u0334\u0335"+
		"\7\27\2\2\u0335\u0337\5\u0090I\2\u0336\u0333\3\2\2\2\u0337\u033a\3\2\2"+
		"\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u008f\3\2\2\2\u033a\u0338"+
		"\3\2\2\2\u033b\u033c\5\u0116\u008c\2\u033c\u033d\7@\2\2\u033d\u033e\5"+
		"\u01a2\u00d2\2\u033e\u0344\3\2\2\2\u033f\u0340\5\u0116\u008c\2\u0340\u0341"+
		"\5\u0092J\2\u0341\u0342\5\u01a2\u00d2\2\u0342\u0344\3\2\2\2\u0343\u033b"+
		"\3\2\2\2\u0343\u033f\3\2\2\2\u0344\u0091\3\2\2\2\u0345\u0346\7\26\2\2"+
		"\u0346\u0093\3\2\2\2\u0347\u034d\5\u01b0\u00d9\2\u0348\u0349\7\27\2\2"+
		"\u0349\u034a\7V\2\2\u034a\u034b\7\26\2\2\u034b\u034d\5\u01a2\u00d2\2\u034c"+
		"\u0347\3\2\2\2\u034c\u0348\3\2\2\2\u034d\u0095\3\2\2\2\u034e\u034f\7\20"+
		"\2\2\u034f\u0350\5\u0098M\2\u0350\u0351\7\21\2\2\u0351\u0097\3\2\2\2\u0352"+
		"\u0355\5\u01b0\u00d9\2\u0353\u0355\5\u009aN\2\u0354\u0352\3\2\2\2\u0354"+
		"\u0353\3\2\2\2\u0355\u0099\3\2\2\2\u0356\u0357\bN\1\2\u0357\u0358\5\u0116"+
		"\u008c\2\u0358\u035e\3\2\2\2\u0359\u035a\f\3\2\2\u035a\u035b\7\22\2\2"+
		"\u035b\u035d\5\u0116\u008c\2\u035c\u0359\3\2\2\2\u035d\u0360\3\2\2\2\u035e"+
		"\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u009b\3\2\2\2\u0360\u035e\3\2"+
		"\2\2\u0361\u0362\5\u009eP\2\u0362\u009d\3\2\2\2\u0363\u0364\7\20\2\2\u0364"+
		"\u0365\5\u00a0Q\2\u0365\u0366\7\21\2\2\u0366\u009f\3\2\2\2\u0367\u036a"+
		"\5\u01b0\u00d9\2\u0368\u036a\5\u00a2R\2\u0369\u0367\3\2\2\2\u0369\u0368"+
		"\3\2\2\2\u036a\u00a1\3\2\2\2\u036b\u0374\5\u00a4S\2\u036c\u036d\5\u00a4"+
		"S\2\u036d\u036e\7\13\2\2\u036e\u0374\3\2\2\2\u036f\u0370\5\u00a4S\2\u0370"+
		"\u0371\7\13\2\2\u0371\u0372\5\u00a2R\2\u0372\u0374\3\2\2\2\u0373\u036b"+
		"\3\2\2\2\u0373\u036c\3\2\2\2\u0373\u036f\3\2\2\2\u0374\u00a3\3\2\2\2\u0375"+
		"\u0376\5\u00eav\2\u0376\u0377\5\u00caf\2\u0377\u037e\3\2\2\2\u0378\u0379"+
		"\5\u00eav\2\u0379\u037a\5\u0104\u0083\2\u037a\u037b\7\24\2\2\u037b\u037c"+
		"\5\u00caf\2\u037c\u037e\3\2\2\2\u037d\u0375\3\2\2\2\u037d\u0378\3\2\2"+
		"\2\u037e\u00a5\3\2\2\2\u037f\u0382\5\u00aeX\2\u0380\u0382\5\u00aaV\2\u0381"+
		"\u037f\3\2\2\2\u0381\u0380\3\2\2\2\u0382\u00a7\3\2\2\2\u0383\u0384\7v"+
		"\2\2\u0384\u0385\5\u00acW\2\u0385\u00a9\3\2\2\2\u0386\u0387\7w\2\2\u0387"+
		"\u0388\5\u00acW\2\u0388\u00ab\3\2\2\2\u0389\u038a\bW\1\2\u038a\u038b\7"+
		"\u0086\2\2\u038b\u0391\3\2\2\2\u038c\u038d\f\3\2\2\u038d\u038e\7\22\2"+
		"\2\u038e\u0390\7\u0086\2\2\u038f\u038c\3\2\2\2\u0390\u0393\3\2\2\2\u0391"+
		"\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u00ad\3\2\2\2\u0393\u0391\3\2"+
		"\2\2\u0394\u039a\5\u00b0Y\2\u0395\u039a\5\u00f0y\2\u0396\u039a\5\u00be"+
		"`\2\u0397\u039a\5\u00c0a\2\u0398\u039a\5\u00b4[\2\u0399\u0394\3\2\2\2"+
		"\u0399\u0395\3\2\2\2\u0399\u0396\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u0398"+
		"\3\2\2\2\u039a\u00af\3\2\2\2\u039b\u039c\7j\2\2\u039c\u039d\7\u0086\2"+
		"\2\u039d\u039e\7\25\2\2\u039e\u039f\5\u00caf\2\u039f\u03a0\5\u00b2Z\2"+
		"\u03a0\u00b1\3\2\2\2\u03a1\u03a6\5\u01b0\u00d9\2\u03a2\u03a3\7\16\2\2"+
		"\u03a3\u03a4\7\u0086\2\2\u03a4\u03a6\7\17\2\2\u03a5\u03a1\3\2\2\2\u03a5"+
		"\u03a2\3\2\2\2\u03a6\u00b3\3\2\2\2\u03a7\u03a8\5\u00bc_\2\u03a8\u03a9"+
		"\5\u00b6\\\2\u03a9\u00b5\3\2\2\2\u03aa\u03ab\b\\\1\2\u03ab\u03ac\5\u00b8"+
		"]\2\u03ac\u03b2\3\2\2\2\u03ad\u03ae\f\3\2\2\u03ae\u03af\7\22\2\2\u03af"+
		"\u03b1\5\u00b8]\2\u03b0\u03ad\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0"+
		"\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u00b7\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5"+
		"\u03b6\5\u0104\u0083\2\u03b6\u03b7\5\u0188\u00c5\2\u03b7\u03bd\3\2\2\2"+
		"\u03b8\u03b9\5\u0104\u0083\2\u03b9\u03ba\5\u00ba^\2\u03ba\u03bb\5\u00d8"+
		"m\2\u03bb\u03bd\3\2\2\2\u03bc\u03b5\3\2\2\2\u03bc\u03b8\3\2\2\2\u03bd"+
		"\u00b9\3\2\2\2\u03be\u03c1\5\u01b0\u00d9\2\u03bf\u03c1\7\24\2\2\u03c0"+
		"\u03be\3\2\2\2\u03c0\u03bf\3\2\2\2\u03c1\u00bb\3\2\2\2\u03c2\u03c3\t\2"+
		"\2\2\u03c3\u00bd\3\2\2\2\u03c4\u03c5\78\2\2\u03c5\u03c6\7\u0086\2\2\u03c6"+
		"\u03c7\5\u00c8e\2\u03c7\u03c8\5\u0188\u00c5\2\u03c8\u00bf\3\2\2\2\u03c9"+
		"\u03ca\7L\2\2\u03ca\u03cb\5\u00c2b\2\u03cb\u00c1\3\2\2\2\u03cc\u03cd\b"+
		"b\1\2\u03cd\u03ce\5\u00c4c\2\u03ce\u03d4\3\2\2\2\u03cf\u03d0\f\3\2\2\u03d0"+
		"\u03d1\7\22\2\2\u03d1\u03d3\5\u00c4c\2\u03d2\u03cf\3\2\2\2\u03d3\u03d6"+
		"\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u00c3\3\2\2\2\u03d6"+
		"\u03d4\3\2\2\2\u03d7\u03d8\5\u0106\u0084\2\u03d8\u03d9\5\u0186\u00c4\2"+
		"\u03d9\u03da\5\u00c6d\2\u03da\u00c5\3\2\2\2\u03db\u03df\5\u01b0\u00d9"+
		"\2\u03dc\u03dd\7\n\2\2\u03dd\u03df\5\u0116\u008c\2\u03de\u03db\3\2\2\2"+
		"\u03de\u03dc\3\2\2\2\u03df\u00c7\3\2\2\2\u03e0\u03e3\5\u01b0\u00d9\2\u03e1"+
		"\u03e3\7\25\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e1\3\2\2\2\u03e3\u00c9\3"+
		"\2\2\2\u03e4\u03e5\5\u0192\u00ca\2\u03e5\u03e6\5\u00ccg\2\u03e6\u03ea"+
		"\3\2\2\2\u03e7\u03ea\5\u00ccg\2\u03e8\u03ea\5J&\2\u03e9\u03e4\3\2\2\2"+
		"\u03e9\u03e7\3\2\2\2\u03e9\u03e8\3\2\2\2\u03ea\u00cb\3\2\2\2\u03eb\u03f4"+
		"\5\u00dan\2\u03ec\u03f4\5\u00ecw\2\u03ed\u03f4\5\u00f2z\2\u03ee\u03f4"+
		"\5\u00ceh\2\u03ef\u03f4\5\u00d2j\2\u03f0\u03f4\5\u00d0i\2\u03f1\u03f4"+
		"\5\u00d4k\2\u03f2\u03f4\5\u00d8m\2\u03f3\u03eb\3\2\2\2\u03f3\u03ec\3\2"+
		"\2\2\u03f3\u03ed\3\2\2\2\u03f3\u03ee\3\2\2\2\u03f3\u03ef\3\2\2\2\u03f3"+
		"\u03f0\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f2\3\2\2\2\u03f4\u00cd\3\2"+
		"\2\2\u03f5\u03f6\7\177\2\2\u03f6\u03fa\5\u00caf\2\u03f7\u03f8\7\177\2"+
		"\2\u03f8\u03fa\7\u0082\2\2\u03f9\u03f5\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa"+
		"\u00cf\3\2\2\2\u03fb\u03fc\7\u0081\2\2\u03fc\u03fd\7\20\2\2\u03fd\u03fe"+
		"\5\u00e6t\2\u03fe\u03ff\7\21\2\2\u03ff\u00d1\3\2\2\2\u0400\u0401\7\u0080"+
		"\2\2\u0401\u0402\7\20\2\2\u0402\u0403\5\u00e6t\2\u0403\u0404\7\21\2\2"+
		"\u0404\u00d3\3\2\2\2\u0405\u0406\7\u0083\2\2\u0406\u0407\5\u00d6l\2\u0407"+
		"\u00d5\3\2\2\2\u0408\u040e\5\u00d8m\2\u0409\u040e\5\u0188\u00c5\2\u040a"+
		"\u040b\7L\2\2\u040b\u040e\5\u0186\u00c4\2\u040c\u040e\7|\2\2\u040d\u0408"+
		"\3\2\2\2\u040d\u0409\3\2\2\2\u040d\u040a\3\2\2\2\u040d\u040c\3\2\2\2\u040e"+
		"\u00d7\3\2\2\2\u040f\u0414\7\u0086\2\2\u0410\u0411\7\u0086\2\2\u0411\u0412"+
		"\7\6\2\2\u0412\u0414\7\u0086\2\2\u0413\u040f\3\2\2\2\u0413\u0410\3\2\2"+
		"\2\u0414\u00d9\3\2\2\2\u0415\u041b\5\u00dco\2\u0416\u041b\5\u00dep\2\u0417"+
		"\u041b\5\u00e0q\2\u0418\u041b\5\u00e2r\2\u0419\u041b\5\u00e4s\2\u041a"+
		"\u0415\3\2\2\2\u041a\u0416\3\2\2\2\u041a\u0417\3\2\2\2\u041a\u0418\3\2"+
		"\2\2\u041a\u0419\3\2\2\2\u041b\u00db\3\2\2\2\u041c\u041d\7q\2\2\u041d"+
		"\u00dd\3\2\2\2\u041e\u041f\7p\2\2\u041f\u00df\3\2\2\2\u0420\u0421\7r\2"+
		"\2\u0421\u00e1\3\2\2\2\u0422\u0423\7t\2\2\u0423\u00e3\3\2\2\2\u0424\u0425"+
		"\7s\2\2\u0425\u00e5\3\2\2\2\u0426\u042f\5\u00e8u\2\u0427\u0428\5\u00e8"+
		"u\2\u0428\u0429\7\13\2\2\u0429\u042a\5\u00e6t\2\u042a\u042f\3\2\2\2\u042b"+
		"\u042c\5\u00e8u\2\u042c\u042d\7\13\2\2\u042d\u042f\3\2\2\2\u042e\u0426"+
		"\3\2\2\2\u042e\u0427\3\2\2\2\u042e\u042b\3\2\2\2\u042f\u00e7\3\2\2\2\u0430"+
		"\u0431\5\u00fa~\2\u0431\u00e9\3\2\2\2\u0432\u0438\5\u01b0\u00d9\2\u0433"+
		"\u0438\7k\2\2\u0434\u0438\7l\2\2\u0435\u0438\7m\2\2\u0436\u0438\7n\2\2"+
		"\u0437\u0432\3\2\2\2\u0437\u0433\3\2\2\2\u0437\u0434\3\2\2\2\u0437\u0435"+
		"\3\2\2\2\u0437\u0436\3\2\2\2\u0438\u00eb\3\2\2\2\u0439\u043a\7u\2\2\u043a"+
		"\u043b\7\f\2\2\u043b\u043c\5\u00eex\2\u043c\u043d\7\r\2\2\u043d\u0444"+
		"\3\2\2\2\u043e\u043f\7u\2\2\u043f\u0440\7\20\2\2\u0440\u0441\5\u00eex"+
		"\2\u0441\u0442\7\21\2\2\u0442\u0444\3\2\2\2\u0443\u0439\3\2\2\2\u0443"+
		"\u043e\3\2\2\2\u0444\u00ed\3\2\2\2\u0445\u0448\5\u0116\u008c\2\u0446\u0448"+
		"\7\23\2\2\u0447\u0445\3\2\2\2\u0447\u0446\3\2\2\2\u0448\u00ef\3\2\2\2"+
		"\u0449\u044a\5\u00f4{\2\u044a\u044b\5\u00fa~\2\u044b\u00f1\3\2\2\2\u044c"+
		"\u044d\7y\2\2\u044d\u044e\7\20\2\2\u044e\u044f\5\u010a\u0086\2\u044f\u0450"+
		"\7\21\2\2\u0450\u00f3\3\2\2\2\u0451\u0454\5\u00f6|\2\u0452\u0454\5\u00f8"+
		"}\2\u0453\u0451\3\2\2\2\u0453\u0452\3\2\2\2\u0454\u00f5\3\2\2\2\u0455"+
		"\u0456\7l\2\2\u0456\u00f7\3\2\2\2\u0457\u0458\7x\2\2\u0458\u00f9\3\2\2"+
		"\2\u0459\u045a\b~\1\2\u045a\u045b\5\u00fc\177\2\u045b\u0461\3\2\2\2\u045c"+
		"\u045d\f\3\2\2\u045d\u045e\7\22\2\2\u045e\u0460\5\u00fc\177\2\u045f\u045c"+
		"\3\2\2\2\u0460\u0463\3\2\2\2\u0461\u045f\3\2\2\2\u0461\u0462\3\2\2\2\u0462"+
		"\u00fb\3\2\2\2\u0463\u0461\3\2\2\2\u0464\u0465\5\u0104\u0083\2\u0465\u0466"+
		"\5\u00fe\u0080\2\u0466\u00fd\3\2\2\2\u0467\u0470\5\u0102\u0082\2\u0468"+
		"\u0469\7\24\2\2\u0469\u046a\5\u00caf\2\u046a\u046b\7\n\2\2\u046b\u046c"+
		"\5\u0116\u008c\2\u046c\u0470\3\2\2\2\u046d\u0470\5\u0100\u0081\2\u046e"+
		"\u0470\7\13\2\2\u046f\u0467\3\2\2\2\u046f\u0468\3\2\2\2\u046f\u046d\3"+
		"\2\2\2\u046f\u046e\3\2\2\2\u0470\u00ff\3\2\2\2\u0471\u0472\7\n\2\2\u0472"+
		"\u0473\5\u0116\u008c\2\u0473\u0101\3\2\2\2\u0474\u0475\7\24\2\2\u0475"+
		"\u0476\5\u00caf\2\u0476\u0103\3\2\2\2\u0477\u0478\b\u0083\1\2\u0478\u0479"+
		"\5\u0106\u0084\2\u0479\u047f\3\2\2\2\u047a\u047b\f\3\2\2\u047b\u047c\7"+
		"\22\2\2\u047c\u047e\5\u0106\u0084\2\u047d\u047a\3\2\2\2\u047e\u0481\3"+
		"\2\2\2\u047f\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0105\3\2\2\2\u0481"+
		"\u047f\3\2\2\2\u0482\u0486\5\u0108\u0085\2\u0483\u0484\7\u0086\2\2\u0484"+
		"\u0486\5\u0192\u00ca\2\u0485\u0482\3\2\2\2\u0485\u0483\3\2\2\2\u0486\u0107"+
		"\3\2\2\2\u0487\u0488\7\u0086\2\2\u0488\u0109\3\2\2\2\u0489\u048a\b\u0086"+
		"\1\2\u048a\u048b\7\u0086\2\2\u048b\u0491\3\2\2\2\u048c\u048d\f\3\2\2\u048d"+
		"\u048e\7\22\2\2\u048e\u0490\7\u0086\2\2\u048f\u048c\3\2\2\2\u0490\u0493"+
		"\3\2\2\2\u0491\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u010b\3\2\2\2\u0493"+
		"\u0491\3\2\2\2\u0494\u0495\7[\2\2\u0495\u010d\3\2\2\2\u0496\u0497\7\\"+
		"\2\2\u0497\u010f\3\2\2\2\u0498\u0499\7]\2\2\u0499\u0111\3\2\2\2\u049a"+
		"\u049b\7^\2\2\u049b\u0113\3\2\2\2\u049c\u049d\7_\2\2\u049d\u0115\3\2\2"+
		"\2\u049e\u049f\b\u008c\1\2\u049f\u04ad\5\u011a\u008e\2\u04a0\u04ad\5\u0118"+
		"\u008d\2\u04a1\u04ad\5\u011c\u008f\2\u04a2\u04ad\5\u0170\u00b9\2\u04a3"+
		"\u04a4\5\u017a\u00be\2\u04a4\u04a5\5\u0116\u008c-\u04a5\u04ad\3\2\2\2"+
		"\u04a6\u04a7\5\u011e\u0090\2\u04a7\u04a8\5\u017c\u00bf\2\u04a8\u04a9\5"+
		"\u0120\u0091\2\u04a9\u04ad\3\2\2\2\u04aa\u04ad\5\u0180\u00c1\2\u04ab\u04ad"+
		"\5\u0172\u00ba\2\u04ac\u049e\3\2\2\2\u04ac\u04a0\3\2\2\2\u04ac\u04a1\3"+
		"\2\2\2\u04ac\u04a2\3\2\2\2\u04ac\u04a3\3\2\2\2\u04ac\u04a6\3\2\2\2\u04ac"+
		"\u04aa\3\2\2\2\u04ac\u04ab\3\2\2\2\u04ad\u054a\3\2\2\2\u04ae\u04af\f%"+
		"\2\2\u04af\u04b0\5\u012e\u0098\2\u04b0\u04b1\5\u0116\u008c&\u04b1\u0549"+
		"\3\2\2\2\u04b2\u04b3\f$\2\2\u04b3\u04b4\5\u0130\u0099\2\u04b4\u04b5\5"+
		"\u0116\u008c%\u04b5\u0549\3\2\2\2\u04b6\u04b7\f\"\2\2\u04b7\u04b8\5\u0132"+
		"\u009a\2\u04b8\u04b9\5\u0116\u008c#\u04b9\u0549\3\2\2\2\u04ba\u04bb\f"+
		"!\2\2\u04bb\u04bc\5\u0134\u009b\2\u04bc\u04bd\5\u0116\u008c\"\u04bd\u0549"+
		"\3\2\2\2\u04be\u04bf\f \2\2\u04bf\u04c0\5\u0136\u009c\2\u04c0\u04c1\5"+
		"\u0116\u008c!\u04c1\u0549\3\2\2\2\u04c2\u04c3\f\37\2\2\u04c3\u04c4\5\u0138"+
		"\u009d\2\u04c4\u04c5\5\u0116\u008c \u04c5\u0549\3\2\2\2\u04c6\u04c7\f"+
		"\36\2\2\u04c7\u04c8\5\u013a\u009e\2\u04c8\u04c9\5\u0116\u008c\37\u04c9"+
		"\u0549\3\2\2\2\u04ca\u04cb\f\35\2\2\u04cb\u04cc\5\u013c\u009f\2\u04cc"+
		"\u04cd\5\u0116\u008c\36\u04cd\u0549\3\2\2\2\u04ce\u04cf\f\34\2\2\u04cf"+
		"\u04d0\5\u013e\u00a0\2\u04d0\u04d1\5\u0116\u008c\35\u04d1\u0549\3\2\2"+
		"\2\u04d2\u04d3\f\33\2\2\u04d3\u04d4\5\u0140\u00a1\2\u04d4\u04d5\5\u0116"+
		"\u008c\34\u04d5\u0549\3\2\2\2\u04d6\u04d7\f\32\2\2\u04d7\u04d8\5\u0142"+
		"\u00a2\2\u04d8\u04d9\5\u0116\u008c\33\u04d9\u0549\3\2\2\2\u04da\u04db"+
		"\f\31\2\2\u04db\u04dc\5\u0144\u00a3\2\u04dc\u04dd\5\u0116\u008c\32\u04dd"+
		"\u0549\3\2\2\2\u04de\u04df\f\30\2\2\u04df\u04e0\5\u0146\u00a4\2\u04e0"+
		"\u04e1\5\u0116\u008c\31\u04e1\u0549\3\2\2\2\u04e2\u04e3\f\27\2\2\u04e3"+
		"\u04e4\5\u0148\u00a5\2\u04e4\u04e5\5\u0116\u008c\30\u04e5\u0549\3\2\2"+
		"\2\u04e6\u04e7\f\26\2\2\u04e7\u04e8\5\u014a\u00a6\2\u04e8\u04e9\5\u0116"+
		"\u008c\27\u04e9\u0549\3\2\2\2\u04ea\u04eb\f\25\2\2\u04eb\u04ec\5\u014c"+
		"\u00a7\2\u04ec\u04ed\5\u0116\u008c\26\u04ed\u0549\3\2\2\2\u04ee\u04ef"+
		"\f\24\2\2\u04ef\u04f0\5\u014e\u00a8\2\u04f0\u04f1\5\u0116\u008c\25\u04f1"+
		"\u0549\3\2\2\2\u04f2\u04f3\f\23\2\2\u04f3\u04f4\5\u0150\u00a9\2\u04f4"+
		"\u04f5\5\u0116\u008c\24\u04f5\u0549\3\2\2\2\u04f6\u04f7\f\22\2\2\u04f7"+
		"\u04f8\5\u0152\u00aa\2\u04f8\u04f9\5\u0116\u008c\23\u04f9\u0549\3\2\2"+
		"\2\u04fa\u04fb\f\21\2\2\u04fb\u04fc\5\u0154\u00ab\2\u04fc\u04fd\5\u0116"+
		"\u008c\22\u04fd\u0549\3\2\2\2\u04fe\u04ff\f\20\2\2\u04ff\u0500\5\u0156"+
		"\u00ac\2\u0500\u0501\5\u0116\u008c\21\u0501\u0549\3\2\2\2\u0502\u0503"+
		"\f\17\2\2\u0503\u0504\5\u0158\u00ad\2\u0504\u0505\5\u0116\u008c\20\u0505"+
		"\u0549\3\2\2\2\u0506\u0507\f\16\2\2\u0507\u0508\5\u015a\u00ae\2\u0508"+
		"\u0509\5\u0116\u008c\17\u0509\u0549\3\2\2\2\u050a\u050b\f\r\2\2\u050b"+
		"\u050c\5\u015c\u00af\2\u050c\u050d\5\u0116\u008c\16\u050d\u0549\3\2\2"+
		"\2\u050e\u050f\f\f\2\2\u050f\u0510\5\u015e\u00b0\2\u0510\u0511\5\u0116"+
		"\u008c\r\u0511\u0549\3\2\2\2\u0512\u0513\f\13\2\2\u0513\u0514\5\u0160"+
		"\u00b1\2\u0514\u0515\5\u0116\u008c\f\u0515\u0549\3\2\2\2\u0516\u0517\f"+
		"\n\2\2\u0517\u0518\5\u0162\u00b2\2\u0518\u0519\5\u0116\u008c\13\u0519"+
		"\u0549\3\2\2\2\u051a\u051b\f\t\2\2\u051b\u051c\5\u0164\u00b3\2\u051c\u051d"+
		"\5\u0116\u008c\n\u051d\u0549\3\2\2\2\u051e\u051f\f\b\2\2\u051f\u0520\5"+
		"\u0166\u00b4\2\u0520\u0521\5\u0116\u008c\t\u0521\u0549\3\2\2\2\u0522\u0523"+
		"\f\7\2\2\u0523\u0524\5\u0168\u00b5\2\u0524\u0525\5\u0116\u008c\b\u0525"+
		"\u0549\3\2\2\2\u0526\u0527\f\6\2\2\u0527\u0528\5\u016a\u00b6\2\u0528\u0529"+
		"\5\u0116\u008c\7\u0529\u0549\3\2\2\2\u052a\u052b\f\5\2\2\u052b\u052c\5"+
		"\u016c\u00b7\2\u052c\u052d\5\u0116\u008c\6\u052d\u0549\3\2\2\2\u052e\u052f"+
		"\f\4\2\2\u052f\u0530\5\u016e\u00b8\2\u0530\u0531\5\u0116\u008c\5\u0531"+
		"\u0549\3\2\2\2\u0532\u0533\f.\2\2\u0533\u0549\5\u0096L\2\u0534\u0535\f"+
		"*\2\2\u0535\u0549\5\u0122\u0092\2\u0536\u0537\f)\2\2\u0537\u0549\5\u0124"+
		"\u0093\2\u0538\u0539\f(\2\2\u0539\u0549\5\u0126\u0094\2\u053a\u053b\f"+
		"\'\2\2\u053b\u053c\5\u0128\u0095\2\u053c\u053d\5\u011a\u008e\2\u053d\u0549"+
		"\3\2\2\2\u053e\u053f\f&\2\2\u053f\u0540\5\u012a\u0096\2\u0540\u0541\5"+
		"\u0196\u00cc\2\u0541\u0542\5\u012c\u0097\2\u0542\u0549\3\2\2\2\u0543\u0544"+
		"\f#\2\2\u0544\u0545\5\u0130\u0099\2\u0545\u0546\5\u0116\u008c\2\u0546"+
		"\u0547\5\u017a\u00be\2\u0547\u0549\3\2\2\2\u0548\u04ae\3\2\2\2\u0548\u04b2"+
		"\3\2\2\2\u0548\u04b6\3\2\2\2\u0548\u04ba\3\2\2\2\u0548\u04be\3\2\2\2\u0548"+
		"\u04c2\3\2\2\2\u0548\u04c6\3\2\2\2\u0548\u04ca\3\2\2\2\u0548\u04ce\3\2"+
		"\2\2\u0548\u04d2\3\2\2\2\u0548\u04d6\3\2\2\2\u0548\u04da\3\2\2\2\u0548"+
		"\u04de\3\2\2\2\u0548\u04e2\3\2\2\2\u0548\u04e6\3\2\2\2\u0548\u04ea\3\2"+
		"\2\2\u0548\u04ee\3\2\2\2\u0548\u04f2\3\2\2\2\u0548\u04f6\3\2\2\2\u0548"+
		"\u04fa\3\2\2\2\u0548\u04fe\3\2\2\2\u0548\u0502\3\2\2\2\u0548\u0506\3\2"+
		"\2\2\u0548\u050a\3\2\2\2\u0548\u050e\3\2\2\2\u0548\u0512\3\2\2\2\u0548"+
		"\u0516\3\2\2\2\u0548\u051a\3\2\2\2\u0548\u051e\3\2\2\2\u0548\u0522\3\2"+
		"\2\2\u0548\u0526\3\2\2\2\u0548\u052a\3\2\2\2\u0548\u052e\3\2\2\2\u0548"+
		"\u0532\3\2\2\2\u0548\u0534\3\2\2\2\u0548\u0536\3\2\2\2\u0548\u0538\3\2"+
		"\2\2\u0548\u053a\3\2\2\2\u0548\u053e\3\2\2\2\u0548\u0543\3\2\2\2\u0549"+
		"\u054c\3\2\2\2\u054a\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u0117\3\2"+
		"\2\2\u054c\u054a\3\2\2\2\u054d\u054e\7\u0088\2\2\u054e\u0119\3\2\2\2\u054f"+
		"\u0550\7\u0086\2\2\u0550\u011b\3\2\2\2\u0551\u0552\7\u0087\2\2\u0552\u011d"+
		"\3\2\2\2\u0553\u0554\7\20\2\2\u0554\u011f\3\2\2\2\u0555\u0556\7\21\2\2"+
		"\u0556\u0121\3\2\2\2\u0557\u0558\7\7\2\2\u0558\u0123\3\2\2\2\u0559\u055a"+
		"\7\b\2\2\u055a\u0125\3\2\2\2\u055b\u055c\7\t\2\2\u055c\u0127\3\2\2\2\u055d"+
		"\u055e\7\6\2\2\u055e\u0129\3\2\2\2\u055f\u0560\7\f\2\2\u0560\u012b\3\2"+
		"\2\2\u0561\u0562\7\r\2\2\u0562\u012d\3\2\2\2\u0563\u0564\7\30\2\2\u0564"+
		"\u012f\3\2\2\2\u0565\u0566\7\23\2\2\u0566\u0131\3\2\2\2\u0567\u0568\7"+
		"\31\2\2\u0568\u0133\3\2\2\2\u0569\u056a\7\32\2\2\u056a\u0135\3\2\2\2\u056b"+
		"\u056c\7\33\2\2\u056c\u0137\3\2\2\2\u056d\u056e\7\34\2\2\u056e\u0139\3"+
		"\2\2\2\u056f\u0570\7\35\2\2\u0570\u013b\3\2\2\2\u0571\u0572\7\36\2\2\u0572"+
		"\u013d\3\2\2\2\u0573\u0574\7\25\2\2\u0574\u013f\3\2\2\2\u0575\u0576\7"+
		"\37\2\2\u0576\u0141\3\2\2\2\u0577\u0578\7 \2\2\u0578\u0143\3\2\2\2\u0579"+
		"\u057a\7!\2\2\u057a\u0145\3\2\2\2\u057b\u057c\7\"\2\2\u057c\u0147\3\2"+
		"\2\2\u057d\u057e\7#\2\2\u057e\u0149\3\2\2\2\u057f\u0580\7$\2\2\u0580\u014b"+
		"\3\2\2\2\u0581\u0582\7%\2\2\u0582\u014d\3\2\2\2\u0583\u0584\7@\2\2\u0584"+
		"\u014f\3\2\2\2\u0585\u0586\7&\2\2\u0586\u0151\3\2\2\2\u0587\u0588\7\'"+
		"\2\2\u0588\u0153\3\2\2\2\u0589\u058a\7(\2\2\u058a\u0155\3\2\2\2\u058b"+
		"\u058c\7)\2\2\u058c\u0157\3\2\2\2\u058d\u058e\7\n\2\2\u058e\u0159\3\2"+
		"\2\2\u058f\u0590\7*\2\2\u0590\u015b\3\2\2\2\u0591\u0592\7+\2\2\u0592\u015d"+
		"\3\2\2\2\u0593\u0594\7,\2\2\u0594\u015f\3\2\2\2\u0595\u0596\7-\2\2\u0596"+
		"\u0161\3\2\2\2\u0597\u0598\7.\2\2\u0598\u0163\3\2\2\2\u0599\u059a\7/\2"+
		"\2\u059a\u0165\3\2\2\2\u059b\u059c\7\60\2\2\u059c\u0167\3\2\2\2\u059d"+
		"\u059e\7\61\2\2\u059e\u0169\3\2\2\2\u059f\u05a0\7\62\2\2\u05a0\u016b\3"+
		"\2\2\2\u05a1\u05a2\7\63\2\2\u05a2\u016d\3\2\2\2\u05a3\u05a4\7\64\2\2\u05a4"+
		"\u016f\3\2\2\2\u05a5\u05a6\t\3\2\2\u05a6\u0171\3\2\2\2\u05a7\u05a8\7{"+
		"\2\2\u05a8\u05a9\5\u0174\u00bb\2\u05a9\u05aa\5\u0178\u00bd\2\u05aa\u0173"+
		"\3\2\2\2\u05ab\u05ac\5\u0176\u00bc\2\u05ac\u05ad\5\u0096L\2\u05ad\u0175"+
		"\3\2\2\2\u05ae\u05af\t\4\2\2\u05af\u0177\3\2\2\2\u05b0\u05b4\5\u01b0\u00d9"+
		"\2\u05b1\u05b2\7}\2\2\u05b2\u05b4\5\u0116\u008c\2\u05b3\u05b0\3\2\2\2"+
		"\u05b3\u05b1\3\2\2\2\u05b4\u0179\3\2\2\2\u05b5\u05b6\7\20\2\2\u05b6\u05b7"+
		"\5\u017c\u00bf\2\u05b7\u05b8\7\21\2\2\u05b8\u017b\3\2\2\2\u05b9\u05ba"+
		"\b\u00bf\1\2\u05ba\u05bb\5\u017e\u00c0\2\u05bb\u05c1\3\2\2\2\u05bc\u05bd"+
		"\f\3\2\2\u05bd\u05be\7\22\2\2\u05be\u05c0\5\u017e\u00c0\2\u05bf\u05bc"+
		"\3\2\2\2\u05c0\u05c3\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2"+
		"\u017d\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c4\u05cb\5\u0116\u008c\2\u05c5\u05c6"+
		"\7\f\2\2\u05c6\u05c7\5\u0116\u008c\2\u05c7\u05c8\7\r\2\2\u05c8\u05c9\5"+
		"\u0116\u008c\2\u05c9\u05cb\3\2\2\2\u05ca\u05c4\3\2\2\2\u05ca\u05c5\3\2"+
		"\2\2\u05cb\u017f\3\2\2\2\u05cc\u05cd\7\65\2\2\u05cd\u05f2\5\u0116\u008c"+
		"\2\u05ce\u05cf\7\34\2\2\u05cf\u05f2\5\u0116\u008c\2\u05d0\u05d1\7\35\2"+
		"\2\u05d1\u05f2\5\u0116\u008c\2\u05d2\u05d3\7\66\2\2\u05d3\u05f2\5\u0116"+
		"\u008c\2\u05d4\u05d5\7\67\2\2\u05d5\u05f2\5\u0116\u008c\2\u05d6\u05d7"+
		"\7\7\2\2\u05d7\u05f2\5\u0116\u008c\2\u05d8\u05d9\7\b\2\2\u05d9\u05f2\5"+
		"\u0116\u008c\2\u05da\u05db\5\u00dan\2\u05db\u05dc\5\u0182\u00c2\2\u05dc"+
		"\u05f2\3\2\2\2\u05dd\u05de\7u\2\2\u05de\u05df\5\u0182\u00c2\2\u05df\u05e0"+
		"\7\65\2\2\u05e0\u05f2\3\2\2\2\u05e1\u05e2\7I\2\2\u05e2\u05e3\7\20\2\2"+
		"\u05e3\u05e4\5\u00caf\2\u05e4\u05e5\7\21\2\2\u05e5\u05f2\3\2\2\2\u05e6"+
		"\u05e7\7J\2\2\u05e7\u05e8\7\20\2\2\u05e8\u05e9\5\u00caf\2\u05e9\u05ea"+
		"\7\21\2\2\u05ea\u05f2\3\2\2\2\u05eb\u05ec\7K\2\2\u05ec\u05ed\7\20\2\2"+
		"\u05ed\u05ee\5\u0190\u00c9\2\u05ee\u05ef\5\u0184\u00c3\2\u05ef\u05f0\7"+
		"\21\2\2\u05f0\u05f2\3\2\2\2\u05f1\u05cc\3\2\2\2\u05f1\u05ce\3\2\2\2\u05f1"+
		"\u05d0\3\2\2\2\u05f1\u05d2\3\2\2\2\u05f1\u05d4\3\2\2\2\u05f1\u05d6\3\2"+
		"\2\2\u05f1\u05d8\3\2\2\2\u05f1\u05da\3\2\2\2\u05f1\u05dd\3\2\2\2\u05f1"+
		"\u05e1\3\2\2\2\u05f1\u05e6\3\2\2\2\u05f1\u05eb\3\2\2\2\u05f2\u0181\3\2"+
		"\2\2\u05f3\u05f4\7\20\2\2\u05f4\u05f5\5\u0116\u008c\2\u05f5\u05f6\7\21"+
		"\2\2\u05f6\u0183\3\2\2\2\u05f7\u05fd\5\u00ccg\2\u05f8\u05f9\7L\2\2\u05f9"+
		"\u05fd\5\u0186\u00c4\2\u05fa\u05fb\7M\2\2\u05fb\u05fd\5\u0188\u00c5\2"+
		"\u05fc\u05f7\3\2\2\2\u05fc\u05f8\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fd\u0185"+
		"\3\2\2\2\u05fe\u05ff\5\u01b0\u00d9\2\u05ff\u0187\3\2\2\2\u0600\u0601\5"+
		"\u018c\u00c7\2\u0601\u0602\5\u018a\u00c6\2\u0602\u0189\3\2\2\2\u0603\u0609"+
		"\5\u01b0\u00d9\2\u0604\u0605\7\16\2\2\u0605\u0606\5\u019c\u00cf\2\u0606"+
		"\u0607\7\17\2\2\u0607\u0609\3\2\2\2\u0608\u0603\3\2\2\2\u0608\u0604\3"+
		"\2\2\2\u0609\u018b\3\2\2\2\u060a\u060b\5\u009eP\2\u060b\u060c\5\u018e"+
		"\u00c8\2\u060c\u018d\3\2\2\2\u060d\u0619\5\u01b0\u00d9\2\u060e\u060f\7"+
		"z\2\2\u060f\u0619\5\u00caf\2\u0610\u0611\7z\2\2\u0611\u0612\5\u0106\u0084"+
		"\2\u0612\u0613\7\24\2\2\u0613\u0614\5\u00caf\2\u0614\u0619\3\2\2\2\u0615"+
		"\u0616\7z\2\2\u0616\u0617\7\u0086\2\2\u0617\u0619\7N\2\2\u0618\u060d\3"+
		"\2\2\2\u0618\u060e\3\2\2\2\u0618\u0610\3\2\2\2\u0618\u0615\3\2\2\2\u0619"+
		"\u018f\3\2\2\2\u061a\u061d\5\u01b0\u00d9\2\u061b\u061d\5\u0192\u00ca\2"+
		"\u061c\u061a\3\2\2\2\u061c\u061b\3\2\2\2\u061d\u0191\3\2\2\2\u061e\u0623"+
		"\5\u0194\u00cb\2\u061f\u0620\5\u0194\u00cb\2\u0620\u0621\5\u0192\u00ca"+
		"\2\u0621\u0623\3\2\2\2\u0622\u061e\3\2\2\2\u0622\u061f\3\2\2\2\u0623\u0193"+
		"\3\2\2\2\u0624\u0625\7\f\2\2\u0625\u0626\5\u0196\u00cc\2\u0626\u0627\7"+
		"\r\2\2\u0627\u0195\3\2\2\2\u0628\u0629\b\u00cc\1\2\u0629\u062a\5\u0198"+
		"\u00cd\2\u062a\u0630\3\2\2\2\u062b\u062c\f\3\2\2\u062c\u062d\7\22\2\2"+
		"\u062d\u062f\5\u0198\u00cd\2\u062e\u062b\3\2\2\2\u062f\u0632\3\2\2\2\u0630"+
		"\u062e\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0197\3\2\2\2\u0632\u0630\3\2"+
		"\2\2\u0633\u0639\5\u019a\u00ce\2\u0634\u0635\5\u019a\u00ce\2\u0635\u0636"+
		"\7\24\2\2\u0636\u0637\5\u019a\u00ce\2\u0637\u0639\3\2\2\2\u0638\u0633"+
		"\3\2\2\2\u0638\u0634\3\2\2\2\u0639\u0199\3\2\2\2\u063a\u063f\5\u0116\u008c"+
		"\2\u063b\u063f\7\23\2\2\u063c\u063f\5\u01b0\u00d9\2\u063d\u063f\5J&\2"+
		"\u063e\u063a\3\2\2\2\u063e\u063b\3\2\2\2\u063e\u063c\3\2\2\2\u063e\u063d"+
		"\3\2\2\2\u063f\u019b\3\2\2\2\u0640\u0649\7b\2\2\u0641\u0649\7a\2\2\u0642"+
		"\u0643\7b\2\2\u0643\u0644\7\22\2\2\u0644\u0649\7a\2\2\u0645\u0646\7a\2"+
		"\2\u0646\u0647\7\22\2\2\u0647\u0649\7b\2\2\u0648\u0640\3\2\2\2\u0648\u0641"+
		"\3\2\2\2\u0648\u0642\3\2\2\2\u0648\u0645\3\2\2\2\u0649\u019d\3\2\2\2\u064a"+
		"\u064b\7e\2\2\u064b\u064c\5\u01a0\u00d1\2\u064c\u019f\3\2\2\2\u064d\u0650"+
		"\5\u01b0\u00d9\2\u064e\u0650\7\u0086\2\2\u064f\u064d\3\2\2\2\u064f\u064e"+
		"\3\2\2\2\u0650\u01a1\3\2\2\2\u0651\u0652\5\u01a4\u00d3\2\u0652\u01a3\3"+
		"\2\2\2\u0653\u0654\5\u01a8\u00d5\2\u0654\u0655\5\u01a6\u00d4\2\u0655\u01a5"+
		"\3\2\2\2\u0656\u0658\7\13\2\2\u0657\u0656\3\2\2\2\u0657\u0658\3\2\2\2"+
		"\u0658\u0659\3\2\2\2\u0659\u065a\5\u01a8\u00d5\2\u065a\u065b\5\u01a6\u00d4"+
		"\2\u065b\u065e\3\2\2\2\u065c\u065e\5\u01b0\u00d9\2\u065d\u0657\3\2\2\2"+
		"\u065d\u065c\3\2\2\2\u065e\u01a7\3\2\2\2\u065f\u0664\5\u00aeX\2\u0660"+
		"\u0664\5J&\2\u0661\u0664\5\u01aa\u00d6\2\u0662\u0664\5\u00aaV\2\u0663"+
		"\u065f\3\2\2\2\u0663\u0660\3\2\2\2\u0663\u0661\3\2\2\2\u0663\u0662\3\2"+
		"\2\2\u0664\u01a9\3\2\2\2\u0665\u0666\5\u0116\u008c\2\u0666\u01ab\3\2\2"+
		"\2\u0667\u066a\5\u010a\u0086\2\u0668\u066a\5\u01b0\u00d9\2\u0669\u0667"+
		"\3\2\2\2\u0669\u0668\3\2\2\2\u066a\u01ad\3\2\2\2\u066b\u066e\7\3\2\2\u066c"+
		"\u066e\5\u01b0\u00d9\2\u066d\u066b\3\2\2\2\u066d\u066c\3\2\2\2\u066e\u01af"+
		"\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u01b1\3\2\2\2\\\u01b9\u01c4\u01c9\u01ce"+
		"\u01eb\u01f5\u0208\u0211\u0216\u0222\u0228\u0230\u0236\u023a\u0241\u0246"+
		"\u0248\u0250\u0255\u025c\u0260\u0268\u0276\u027a\u0290\u02b5\u02c6\u02cb"+
		"\u02d2\u02e9\u02f8\u02fe\u0303\u030d\u0338\u0343\u034c\u0354\u035e\u0369"+
		"\u0373\u037d\u0381\u0391\u0399\u03a5\u03b2\u03bc\u03c0\u03d4\u03de\u03e2"+
		"\u03e9\u03f3\u03f9\u040d\u0413\u041a\u042e\u0437\u0443\u0447\u0453\u0461"+
		"\u046f\u047f\u0485\u0491\u04ac\u0548\u054a\u05b3\u05c1\u05ca\u05f1\u05fc"+
		"\u0608\u0618\u061c\u0622\u0630\u0638\u063e\u0648\u064f\u0657\u065d\u0663"+
		"\u0669\u066d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}