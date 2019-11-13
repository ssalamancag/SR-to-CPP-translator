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
		RULE_process = 7, RULE_procedure = 8, RULE_procedure1 = 9, RULE_procedure2 = 10, 
		RULE_procedure3 = 11, RULE_quantifiers_opt = 12, RULE_quantifier_lp = 13, 
		RULE_quantifier = 14, RULE_quantifier1 = 15, RULE_quantifier2 = 16, RULE_quantifier3 = 17, 
		RULE_direction = 18, RULE_direction1 = 19, RULE_direction2 = 20, RULE_step_opt = 21, 
		RULE_such_that_opt = 22, RULE_return_spec_null = 23, RULE_param_names = 24, 
		RULE_return_name_opt = 25, RULE_spec_stmt = 26, RULE_spec_body = 27, RULE_spec_body1 = 28, 
		RULE_spec_body_comp = 29, RULE_maybe_params = 30, RULE_spec_stmt_ls = 31, 
		RULE_body_stmt_ls = 32, RULE_body_stmt = 33, RULE_separator_optional = 34, 
		RULE_body_only = 35, RULE_initial_block = 36, RULE_final_block = 37, RULE_final_opt = 38, 
		RULE_initial_opt = 39, RULE_stmt = 40, RULE_function_stmt = 41, RULE_function_stmt1 = 42, 
		RULE_function_stmt2 = 43, RULE_function_stmt3 = 44, RULE_stop_stmt = 45, 
		RULE_forward_stmt = 46, RULE_send_stmt = 47, RULE_explicit_call = 48, 
		RULE_v_stmt = 49, RULE_input_stmt = 50, RULE_in_cmd_lp = 51, RULE_in_cmd = 52, 
		RULE_in_spec = 53, RULE_in_op = 54, RULE_sched_expr_opt = 55, RULE_sync_expr_opt = 56, 
		RULE_receive_stmt = 57, RULE_p_stmt = 58, RULE_concurrent_stmt = 59, RULE_concurrent_cmd_lp = 60, 
		RULE_concurrent_cmd = 61, RULE_separator_opt = 62, RULE_concurrent_invocation = 63, 
		RULE_post_processing_opt = 64, RULE_invocation = 65, RULE_exit_code_opt = 66, 
		RULE_destroy_stmt = 67, RULE_begin_end = 68, RULE_if_stmt = 69, RULE_if_stmt1 = 70, 
		RULE_if_stmt2 = 71, RULE_do_stmt = 72, RULE_do_stmt1 = 73, RULE_do_stmt2 = 74, 
		RULE_for_all_stmt = 75, RULE_for_all_stmt1 = 76, RULE_for_all_stmt2 = 77, 
		RULE_for_all_stmt3 = 78, RULE_guarded_cmd_lp = 79, RULE_guarded_cmd_lp1 = 80, 
		RULE_guarded_cmd = 81, RULE_guarded_cmd1 = 82, RULE_else_cmd_opt = 83, 
		RULE_paren_list = 84, RULE_paren_list1 = 85, RULE_paren_list2 = 86, RULE_paren_item_ls = 87, 
		RULE_expr_lp = 88, RULE_comp_params = 89, RULE_parameters = 90, RULE_param_spec_ls = 91, 
		RULE_param_spec_lp = 92, RULE_param_spec = 93, RULE_param_spec1 = 94, 
		RULE_common_stmt = 95, RULE_extend_clause = 96, RULE_import_clause = 97, 
		RULE_import_list = 98, RULE_decl = 99, RULE_type_decl = 100, RULE_type_restriction = 101, 
		RULE_op_decl = 102, RULE_oper_def_lp = 103, RULE_oper_def = 104, RULE_colon_opt = 105, 
		RULE_op_or_ext = 106, RULE_optype_decl = 107, RULE_sem_decl = 108, RULE_sem_def_lp = 109, 
		RULE_sem_def = 110, RULE_sem_init = 111, RULE_eq_opt = 112, RULE_type = 113, 
		RULE_unsub_type = 114, RULE_pointer_def = 115, RULE_union_def = 116, RULE_record_def = 117, 
		RULE_capability_def = 118, RULE_cap_for = 119, RULE_qualified_id = 120, 
		RULE_basic_type = 121, RULE_basic_type1 = 122, RULE_basic_type2 = 123, 
		RULE_basic_type3 = 124, RULE_basic_type4 = 125, RULE_basic_type5 = 126, 
		RULE_field_lp = 127, RULE_field = 128, RULE_param_kind_opt = 129, RULE_string_def = 130, 
		RULE_string_lim = 131, RULE_obj_decl = 132, RULE_enum_def = 133, RULE_var_or_const = 134, 
		RULE_var_or_const_var = 135, RULE_var_or_const_const = 136, RULE_var_def_lp = 137, 
		RULE_var_def = 138, RULE_var_att = 139, RULE_var_att1 = 140, RULE_var_att2 = 141, 
		RULE_id_subs_lp = 142, RULE_id_subs = 143, RULE_id_subsID = 144, RULE_id_lp = 145, 
		RULE_skip_stmt = 146, RULE_exit_stmt = 147, RULE_next_stmt = 148, RULE_return_stmt = 149, 
		RULE_reply_stmt = 150, RULE_expr = 151, RULE_expr_num = 152, RULE_expr1 = 153, 
		RULE_expr2 = 154, RULE_expr3 = 155, RULE_expr4 = 156, RULE_expr5 = 157, 
		RULE_expr6 = 158, RULE_expr7 = 159, RULE_expr8 = 160, RULE_expr9 = 161, 
		RULE_expr10 = 162, RULE_expr11 = 163, RULE_expr12 = 164, RULE_expr13 = 165, 
		RULE_expr14 = 166, RULE_expr15 = 167, RULE_expr16 = 168, RULE_expr17 = 169, 
		RULE_expr18 = 170, RULE_expr19 = 171, RULE_expr20 = 172, RULE_expr21 = 173, 
		RULE_expr22 = 174, RULE_expr23 = 175, RULE_expr24 = 176, RULE_expr25 = 177, 
		RULE_expr26 = 178, RULE_expr27 = 179, RULE_expr28 = 180, RULE_expr29 = 181, 
		RULE_expr30 = 182, RULE_expr31 = 183, RULE_expr32 = 184, RULE_expr33 = 185, 
		RULE_expr34 = 186, RULE_expr35 = 187, RULE_expr36 = 188, RULE_expr37 = 189, 
		RULE_expr38 = 190, RULE_expr39 = 191, RULE_expr40 = 192, RULE_expr41 = 193, 
		RULE_expr42 = 194, RULE_expr43 = 195, RULE_literal = 196, RULE_create_expr = 197, 
		RULE_create_call = 198, RULE_rsrc_name = 199, RULE_location_opt = 200, 
		RULE_constructor = 201, RULE_constr_item_lp = 202, RULE_constr_item = 203, 
		RULE_prefix_expr = 204, RULE_paren_expr = 205, RULE_new_item = 206, RULE_sem_proto = 207, 
		RULE_op_prototype = 208, RULE_op_restriction_opt = 209, RULE_prototype = 210, 
		RULE_return_spec_opt = 211, RULE_subscripts_opt = 212, RULE_subscripts = 213, 
		RULE_bracketed_list = 214, RULE_bound_lp = 215, RULE_bounds = 216, RULE_bound = 217, 
		RULE_op_restriction = 218, RULE_end_id = 219, RULE_id_opt = 220, RULE_block = 221, 
		RULE_block_items = 222, RULE_block_items_ = 223, RULE_block_item = 224, 
		RULE_block_item1 = 225, RULE_id_ls = 226, RULE_falta = 227, RULE_vacio = 228;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "componet", "global", "comp_label", "resource_specification", 
			"resource_body", "proc", "process", "procedure", "procedure1", "procedure2", 
			"procedure3", "quantifiers_opt", "quantifier_lp", "quantifier", "quantifier1", 
			"quantifier2", "quantifier3", "direction", "direction1", "direction2", 
			"step_opt", "such_that_opt", "return_spec_null", "param_names", "return_name_opt", 
			"spec_stmt", "spec_body", "spec_body1", "spec_body_comp", "maybe_params", 
			"spec_stmt_ls", "body_stmt_ls", "body_stmt", "separator_optional", "body_only", 
			"initial_block", "final_block", "final_opt", "initial_opt", "stmt", "function_stmt", 
			"function_stmt1", "function_stmt2", "function_stmt3", "stop_stmt", "forward_stmt", 
			"send_stmt", "explicit_call", "v_stmt", "input_stmt", "in_cmd_lp", "in_cmd", 
			"in_spec", "in_op", "sched_expr_opt", "sync_expr_opt", "receive_stmt", 
			"p_stmt", "concurrent_stmt", "concurrent_cmd_lp", "concurrent_cmd", "separator_opt", 
			"concurrent_invocation", "post_processing_opt", "invocation", "exit_code_opt", 
			"destroy_stmt", "begin_end", "if_stmt", "if_stmt1", "if_stmt2", "do_stmt", 
			"do_stmt1", "do_stmt2", "for_all_stmt", "for_all_stmt1", "for_all_stmt2", 
			"for_all_stmt3", "guarded_cmd_lp", "guarded_cmd_lp1", "guarded_cmd", 
			"guarded_cmd1", "else_cmd_opt", "paren_list", "paren_list1", "paren_list2", 
			"paren_item_ls", "expr_lp", "comp_params", "parameters", "param_spec_ls", 
			"param_spec_lp", "param_spec", "param_spec1", "common_stmt", "extend_clause", 
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
			setState(458);
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
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_GLOBAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				global();
				}
				break;
			case TK_RESOURCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				resource_specification();
				}
				break;
			case TK_END:
			case TK_BODY:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				resource_body();
				}
				break;
			case TK_PROC:
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
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
				setState(464);
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
			setState(467);
			match(TK_GLOBAL);
			setState(468);
			match(TK_ID);
			setState(469);
			spec_stmt_ls(0);
			setState(470);
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
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_GLOBAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(TK_GLOBAL);
				setState(473);
				match(TK_ID);
				}
				break;
			case TK_RESOURCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(TK_RESOURCE);
				setState(475);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(TK_RESOURCE);
			setState(479);
			match(TK_ID);
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(480);
				parameters();
				}
				break;
			}
			setState(483);
			spec_stmt_ls(0);
			setState(484);
			spec_body();
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(485);
				end_id();
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
			setState(488);
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
			setState(490);
			match(TK_PROC);
			setState(491);
			match(TK_ID);
			setState(492);
			param_names();
			setState(493);
			spec_stmt_ls(0);
			setState(494);
			spec_body();
			setState(495);
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
			setState(497);
			match(TK_PROCESS);
			setState(498);
			match(TK_ID);
			setState(499);
			return_spec_null();
			setState(500);
			quantifiers_opt();
			setState(501);
			block();
			setState(502);
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
		public Procedure1Context procedure1() {
			return getRuleContext(Procedure1Context.class,0);
		}
		public Procedure2Context procedure2() {
			return getRuleContext(Procedure2Context.class,0);
		}
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
			setState(504);
			procedure1();
			setState(505);
			procedure2();
			setState(506);
			prototype();
			setState(507);
			block();
			setState(508);
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

	public static class Procedure1Context extends ParserRuleContext {
		public TerminalNode TK_PROCEDURE() { return getToken(MiLenguajeParser.TK_PROCEDURE, 0); }
		public Procedure1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterProcedure1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitProcedure1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitProcedure1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure1Context procedure1() throws RecognitionException {
		Procedure1Context _localctx = new Procedure1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_procedure1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(TK_PROCEDURE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Procedure2Context extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Procedure2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterProcedure2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitProcedure2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitProcedure2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure2Context procedure2() throws RecognitionException {
		Procedure2Context _localctx = new Procedure2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_procedure2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
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

	public static class Procedure3Context extends ParserRuleContext {
		public End_idContext end_id() {
			return getRuleContext(End_idContext.class,0);
		}
		public Procedure3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterProcedure3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitProcedure3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitProcedure3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Procedure3Context procedure3() throws RecognitionException {
		Procedure3Context _localctx = new Procedure3Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_procedure3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
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
		enterRule(_localctx, 24, RULE_quantifiers_opt);
		try {
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(TK_LPAREN);
				setState(518);
				quantifier_lp(0);
				setState(519);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_quantifier_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(524);
			quantifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(531);
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
					setState(526);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(527);
					match(TK_COMMA);
					setState(528);
					quantifier();
					}
					} 
				}
				setState(533);
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
		enterRule(_localctx, 28, RULE_quantifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			quantifier1();
			setState(535);
			quantifier2();
			setState(536);
			expr(0);
			setState(537);
			direction();
			setState(538);
			quantifier3();
			setState(539);
			step_opt();
			setState(540);
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
		enterRule(_localctx, 30, RULE_quantifier1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
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
		enterRule(_localctx, 32, RULE_quantifier2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
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
		enterRule(_localctx, 34, RULE_quantifier3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
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
		enterRule(_localctx, 36, RULE_direction);
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_TO:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				direction1();
				}
				break;
			case TK_DOWNTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
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
		enterRule(_localctx, 38, RULE_direction1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
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
		enterRule(_localctx, 40, RULE_direction2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
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
		enterRule(_localctx, 42, RULE_step_opt);
		try {
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(TK_BY);
				setState(558);
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
		enterRule(_localctx, 44, RULE_such_that_opt);
		try {
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				match(TK_SUCHTHAT);
				setState(563);
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
		enterRule(_localctx, 46, RULE_return_spec_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
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
		enterRule(_localctx, 48, RULE_param_names);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(TK_LPAREN);
			setState(569);
			id_ls();
			setState(570);
			match(TK_RPAREN);
			setState(571);
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
		enterRule(_localctx, 50, RULE_return_name_opt);
		try {
			setState(576);
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
				setState(573);
				vacio();
				}
				break;
			case TK_RETURNS:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(TK_RETURNS);
				setState(575);
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
		enterRule(_localctx, 52, RULE_spec_stmt);
		try {
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				common_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				extend_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(580);
				body_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(581);
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
		public TerminalNode TK_END() { return getToken(MiLenguajeParser.TK_END, 0); }
		public ComponetContext componet() {
			return getRuleContext(ComponetContext.class,0);
		}
		public Spec_body1Context spec_body1() {
			return getRuleContext(Spec_body1Context.class,0);
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
		enterRule(_localctx, 54, RULE_spec_body);
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_END:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				match(TK_END);
				setState(585);
				componet();
				}
				break;
			case TK_BODY:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				spec_body1();
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

	public static class Spec_body1Context extends ParserRuleContext {
		public TerminalNode TK_BODY() { return getToken(MiLenguajeParser.TK_BODY, 0); }
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Maybe_paramsContext maybe_params() {
			return getRuleContext(Maybe_paramsContext.class,0);
		}
		public Spec_body_compContext spec_body_comp() {
			return getRuleContext(Spec_body_compContext.class,0);
		}
		public Spec_body1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_body1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSpec_body1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSpec_body1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSpec_body1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_body1Context spec_body1() throws RecognitionException {
		Spec_body1Context _localctx = new Spec_body1Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_spec_body1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(TK_BODY);
			setState(590);
			match(TK_ID);
			setState(591);
			maybe_params();
			setState(592);
			spec_body_comp();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_spec_body_comp);
		try {
			setState(598);
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
				setState(594);
				body_stmt_ls(0);
				setState(595);
				end_id();
				}
				break;
			case TK_SEPARATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
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
		enterRule(_localctx, 60, RULE_maybe_params);
		try {
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				comp_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_spec_stmt_ls, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(605);
			spec_stmt();
			}
			_ctx.stop = _input.LT(-1);
			setState(616);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(614);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new Spec_stmt_lsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_spec_stmt_ls);
						setState(607);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(609);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TK_SEPARATOR) {
							{
							setState(608);
							match(TK_SEPARATOR);
							}
						}

						setState(611);
						spec_stmt();
						}
						break;
					case 2:
						{
						_localctx = new Spec_stmt_lsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_spec_stmt_ls);
						setState(612);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(613);
						spec_stmt();
						}
						break;
					}
					} 
				}
				setState(618);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_body_stmt_ls, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(620);
			body_stmt();
			}
			_ctx.stop = _input.LT(-1);
			setState(629);
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
					setState(622);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TK_SEPARATOR) {
						{
						setState(623);
						match(TK_SEPARATOR);
						}
					}

					setState(626);
					body_stmt();
					}
					} 
				}
				setState(631);
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
		enterRule(_localctx, 66, RULE_body_stmt);
		try {
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				common_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(634);
				body_only();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(635);
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
		enterRule(_localctx, 68, RULE_separator_optional);
		try {
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SEPARATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				match(TK_SEPARATOR);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
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
		enterRule(_localctx, 70, RULE_body_only);
		try {
			setState(648);
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
				setState(642);
				stmt();
				}
				break;
			case TK_PROC:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				proc();
				}
				break;
			case TK_PROCESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				process();
				}
				break;
			case TK_PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(645);
				procedure();
				}
				break;
			case TK_INITIAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(646);
				initial_block();
				}
				break;
			case TK_FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(647);
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
		enterRule(_localctx, 72, RULE_initial_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(TK_INITIAL);
			setState(651);
			block();
			setState(652);
			match(TK_END);
			setState(653);
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
		enterRule(_localctx, 74, RULE_final_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(TK_FINAL);
			setState(656);
			block();
			setState(657);
			match(TK_END);
			setState(658);
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
		enterRule(_localctx, 76, RULE_final_opt);
		try {
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
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
		enterRule(_localctx, 78, RULE_initial_opt);
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
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
		enterRule(_localctx, 80, RULE_stmt);
		try {
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SKIP:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				skip_stmt();
				}
				break;
			case TK_STOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				stop_stmt();
				}
				break;
			case TK_EXIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				exit_stmt();
				}
				break;
			case TK_NEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(671);
				next_stmt();
				}
				break;
			case TK_RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(672);
				return_stmt();
				}
				break;
			case TK_REPLY:
				enterOuterAlt(_localctx, 6);
				{
				setState(673);
				reply_stmt();
				}
				break;
			case TK_ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(674);
				function_stmt();
				}
				break;
			case TK_FORWARD:
				enterOuterAlt(_localctx, 8);
				{
				setState(675);
				forward_stmt();
				}
				break;
			case TK_SEND:
				enterOuterAlt(_localctx, 9);
				{
				setState(676);
				send_stmt();
				}
				break;
			case TK_CALL:
				enterOuterAlt(_localctx, 10);
				{
				setState(677);
				explicit_call();
				}
				break;
			case TK_DESTROY:
				enterOuterAlt(_localctx, 11);
				{
				setState(678);
				destroy_stmt();
				}
				break;
			case TK_BEGIN:
				enterOuterAlt(_localctx, 12);
				{
				setState(679);
				begin_end();
				}
				break;
			case TK_IF:
				enterOuterAlt(_localctx, 13);
				{
				setState(680);
				if_stmt();
				}
				break;
			case TK_DO:
				enterOuterAlt(_localctx, 14);
				{
				setState(681);
				do_stmt();
				}
				break;
			case TK_FA:
				enterOuterAlt(_localctx, 15);
				{
				setState(682);
				for_all_stmt();
				}
				break;
			case TK_V:
				enterOuterAlt(_localctx, 16);
				{
				setState(683);
				v_stmt();
				}
				break;
			case TK_IN:
				enterOuterAlt(_localctx, 17);
				{
				setState(684);
				input_stmt();
				}
				break;
			case TK_RECEIVE:
				enterOuterAlt(_localctx, 18);
				{
				setState(685);
				receive_stmt();
				}
				break;
			case TK_P:
				enterOuterAlt(_localctx, 19);
				{
				setState(686);
				p_stmt();
				}
				break;
			case TK_CO:
				enterOuterAlt(_localctx, 20);
				{
				setState(687);
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
		public Function_stmt1Context function_stmt1() {
			return getRuleContext(Function_stmt1Context.class,0);
		}
		public Function_stmt2Context function_stmt2() {
			return getRuleContext(Function_stmt2Context.class,0);
		}
		public Bound_lpContext bound_lp() {
			return getRuleContext(Bound_lpContext.class,0);
		}
		public Function_stmt3Context function_stmt3() {
			return getRuleContext(Function_stmt3Context.class,0);
		}
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
		enterRule(_localctx, 82, RULE_function_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			function_stmt1();
			setState(691);
			function_stmt2();
			setState(692);
			bound_lp(0);
			setState(693);
			function_stmt3();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_stmt1Context extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(MiLenguajeParser.TK_ID, 0); }
		public Function_stmt1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_stmt1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFunction_stmt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFunction_stmt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFunction_stmt1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_stmt1Context function_stmt1() throws RecognitionException {
		Function_stmt1Context _localctx = new Function_stmt1Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_function_stmt1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
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

	public static class Function_stmt2Context extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public Function_stmt2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_stmt2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFunction_stmt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFunction_stmt2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFunction_stmt2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_stmt2Context function_stmt2() throws RecognitionException {
		Function_stmt2Context _localctx = new Function_stmt2Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_function_stmt2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
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

	public static class Function_stmt3Context extends ParserRuleContext {
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public Function_stmt3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_stmt3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFunction_stmt3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFunction_stmt3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitFunction_stmt3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_stmt3Context function_stmt3() throws RecognitionException {
		Function_stmt3Context _localctx = new Function_stmt3Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_function_stmt3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
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
		enterRule(_localctx, 90, RULE_stop_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(TK_STOP);
			setState(702);
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
		enterRule(_localctx, 92, RULE_forward_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(TK_FORWARD);
			setState(705);
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
		enterRule(_localctx, 94, RULE_send_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(TK_SEND);
			setState(708);
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
		enterRule(_localctx, 96, RULE_explicit_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(TK_CALL);
			setState(711);
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
		enterRule(_localctx, 98, RULE_v_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(TK_V);
			setState(714);
			match(TK_LPAREN);
			setState(715);
			expr(0);
			setState(716);
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
		enterRule(_localctx, 100, RULE_input_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(TK_IN);
			setState(719);
			in_cmd_lp(0);
			setState(720);
			else_cmd_opt();
			setState(721);
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
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_in_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(724);
			in_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(731);
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
					setState(726);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(727);
					match(TK_SQUARE);
					setState(728);
					in_cmd();
					}
					} 
				}
				setState(733);
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
		enterRule(_localctx, 104, RULE_in_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			quantifiers_opt();
			setState(735);
			in_spec();
			setState(736);
			sync_expr_opt();
			setState(737);
			sched_expr_opt();
			setState(738);
			match(TK_ARROW);
			setState(739);
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
		enterRule(_localctx, 106, RULE_in_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			in_op();
			setState(742);
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
		enterRule(_localctx, 108, RULE_in_op);
		try {
			setState(748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				qualified_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				qualified_id();
				setState(746);
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
		enterRule(_localctx, 110, RULE_sched_expr_opt);
		try {
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ARROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				vacio();
				}
				break;
			case TK_BY:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				match(TK_BY);
				setState(752);
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
		enterRule(_localctx, 112, RULE_sync_expr_opt);
		try {
			setState(760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ARROW:
			case TK_BY:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				vacio();
				}
				break;
			case TK_AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				match(TK_AND);
				setState(757);
				expr(0);
				}
				break;
			case TK_SUCHTHAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(758);
				match(TK_SUCHTHAT);
				setState(759);
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
		enterRule(_localctx, 114, RULE_receive_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(TK_RECEIVE);
			setState(763);
			expr(0);
			setState(764);
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
		enterRule(_localctx, 116, RULE_p_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(TK_P);
			setState(767);
			match(TK_LPAREN);
			setState(768);
			expr(0);
			setState(769);
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
		enterRule(_localctx, 118, RULE_concurrent_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(TK_CO);
			setState(772);
			concurrent_cmd_lp(0);
			setState(773);
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
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_concurrent_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(776);
			concurrent_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(783);
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
					setState(778);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(779);
					match(TK_PARALLEL);
					setState(780);
					concurrent_cmd();
					}
					} 
				}
				setState(785);
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
		enterRule(_localctx, 122, RULE_concurrent_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			quantifiers_opt();
			setState(787);
			separator_opt(0);
			setState(788);
			concurrent_invocation();
			setState(789);
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
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_separator_opt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(792);
			vacio();
			}
			_ctx.stop = _input.LT(-1);
			setState(798);
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
					setState(794);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(795);
					match(TK_SEPARATOR);
					}
					} 
				}
				setState(800);
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
		enterRule(_localctx, 126, RULE_concurrent_invocation);
		try {
			setState(804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				explicit_call();
				}
				break;
			case TK_SEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
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
				setState(803);
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
		enterRule(_localctx, 128, RULE_post_processing_opt);
		try {
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				match(TK_ARROW);
				setState(808);
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
		enterRule(_localctx, 130, RULE_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			expr(0);
			setState(812);
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
		enterRule(_localctx, 132, RULE_exit_code_opt);
		try {
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				match(TK_LPAREN);
				setState(816);
				expr(0);
				setState(817);
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
		enterRule(_localctx, 134, RULE_destroy_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(TK_DESTROY);
			setState(822);
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
		enterRule(_localctx, 136, RULE_begin_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(TK_BEGIN);
			setState(825);
			block();
			setState(826);
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
		public If_stmt1Context if_stmt1() {
			return getRuleContext(If_stmt1Context.class,0);
		}
		public Guarded_cmd_lpContext guarded_cmd_lp() {
			return getRuleContext(Guarded_cmd_lpContext.class,0);
		}
		public Else_cmd_optContext else_cmd_opt() {
			return getRuleContext(Else_cmd_optContext.class,0);
		}
		public If_stmt2Context if_stmt2() {
			return getRuleContext(If_stmt2Context.class,0);
		}
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
		enterRule(_localctx, 138, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			if_stmt1();
			setState(829);
			guarded_cmd_lp(0);
			setState(830);
			else_cmd_opt();
			setState(831);
			if_stmt2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmt1Context extends ParserRuleContext {
		public TerminalNode TK_IF() { return getToken(MiLenguajeParser.TK_IF, 0); }
		public If_stmt1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIf_stmt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIf_stmt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitIf_stmt1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmt1Context if_stmt1() throws RecognitionException {
		If_stmt1Context _localctx = new If_stmt1Context(_ctx, getState());
		enterRule(_localctx, 140, RULE_if_stmt1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(TK_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmt2Context extends ParserRuleContext {
		public TerminalNode TK_FI() { return getToken(MiLenguajeParser.TK_FI, 0); }
		public If_stmt2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIf_stmt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIf_stmt2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitIf_stmt2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmt2Context if_stmt2() throws RecognitionException {
		If_stmt2Context _localctx = new If_stmt2Context(_ctx, getState());
		enterRule(_localctx, 142, RULE_if_stmt2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
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
		enterRule(_localctx, 144, RULE_do_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			do_stmt1();
			setState(838);
			guarded_cmd_lp(0);
			setState(839);
			else_cmd_opt();
			setState(840);
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
		enterRule(_localctx, 146, RULE_do_stmt1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
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
		enterRule(_localctx, 148, RULE_do_stmt2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
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
		enterRule(_localctx, 150, RULE_for_all_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			for_all_stmt1();
			setState(847);
			quantifier_lp(0);
			setState(848);
			for_all_stmt2();
			setState(849);
			block();
			setState(850);
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
		enterRule(_localctx, 152, RULE_for_all_stmt1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
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
		enterRule(_localctx, 154, RULE_for_all_stmt2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
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
		enterRule(_localctx, 156, RULE_for_all_stmt3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
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
		public Guarded_cmd_lp1Context guarded_cmd_lp1() {
			return getRuleContext(Guarded_cmd_lp1Context.class,0);
		}
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
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_guarded_cmd_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(859);
			guarded_cmd();
			}
			_ctx.stop = _input.LT(-1);
			setState(867);
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
					setState(861);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(862);
					guarded_cmd_lp1();
					setState(863);
					guarded_cmd();
					}
					} 
				}
				setState(869);
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

	public static class Guarded_cmd_lp1Context extends ParserRuleContext {
		public TerminalNode TK_SQUARE() { return getToken(MiLenguajeParser.TK_SQUARE, 0); }
		public Guarded_cmd_lp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guarded_cmd_lp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterGuarded_cmd_lp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitGuarded_cmd_lp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitGuarded_cmd_lp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guarded_cmd_lp1Context guarded_cmd_lp1() throws RecognitionException {
		Guarded_cmd_lp1Context _localctx = new Guarded_cmd_lp1Context(_ctx, getState());
		enterRule(_localctx, 160, RULE_guarded_cmd_lp1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(TK_SQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
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
		enterRule(_localctx, 162, RULE_guarded_cmd);
		try {
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				expr(0);
				setState(873);
				match(TK_OR_);
				setState(874);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
				expr(0);
				setState(877);
				guarded_cmd1();
				setState(878);
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
		enterRule(_localctx, 164, RULE_guarded_cmd1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
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
		enterRule(_localctx, 166, RULE_else_cmd_opt);
		try {
			setState(889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NI:
			case TK_FI:
			case TK_OD:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				vacio();
				}
				break;
			case TK_SQUARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				match(TK_SQUARE);
				setState(886);
				match(TK_ELSE);
				setState(887);
				match(TK_ARROW);
				setState(888);
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
		public Paren_list1Context paren_list1() {
			return getRuleContext(Paren_list1Context.class,0);
		}
		public Paren_item_lsContext paren_item_ls() {
			return getRuleContext(Paren_item_lsContext.class,0);
		}
		public Paren_list2Context paren_list2() {
			return getRuleContext(Paren_list2Context.class,0);
		}
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
		enterRule(_localctx, 168, RULE_paren_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			paren_list1();
			setState(892);
			paren_item_ls();
			setState(893);
			paren_list2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Paren_list1Context extends ParserRuleContext {
		public TerminalNode TK_LPAREN() { return getToken(MiLenguajeParser.TK_LPAREN, 0); }
		public Paren_list1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren_list1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParen_list1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParen_list1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParen_list1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paren_list1Context paren_list1() throws RecognitionException {
		Paren_list1Context _localctx = new Paren_list1Context(_ctx, getState());
		enterRule(_localctx, 170, RULE_paren_list1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
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

	public static class Paren_list2Context extends ParserRuleContext {
		public TerminalNode TK_RPAREN() { return getToken(MiLenguajeParser.TK_RPAREN, 0); }
		public Paren_list2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paren_list2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParen_list2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParen_list2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParen_list2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paren_list2Context paren_list2() throws RecognitionException {
		Paren_list2Context _localctx = new Paren_list2Context(_ctx, getState());
		enterRule(_localctx, 172, RULE_paren_list2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
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
		enterRule(_localctx, 174, RULE_paren_item_ls);
		try {
			setState(901);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
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
				setState(900);
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
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_expr_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(904);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(911);
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
					setState(906);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(907);
					match(TK_COMMA);
					setState(908);
					expr(0);
					}
					} 
				}
				setState(913);
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
		enterRule(_localctx, 178, RULE_comp_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
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
		enterRule(_localctx, 180, RULE_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(TK_LPAREN);
			setState(917);
			param_spec_ls();
			setState(918);
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
		enterRule(_localctx, 182, RULE_param_spec_ls);
		try {
			setState(922);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
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
				setState(921);
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
		enterRule(_localctx, 184, RULE_param_spec_lp);
		try {
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(924);
				param_spec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				param_spec();
				setState(926);
				match(TK_SEPARATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(928);
				param_spec();
				setState(929);
				match(TK_SEPARATOR);
				setState(930);
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
		public Param_spec1Context param_spec1() {
			return getRuleContext(Param_spec1Context.class,0);
		}
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
		enterRule(_localctx, 186, RULE_param_spec);
		try {
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				param_kind_opt();
				setState(935);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(937);
				param_kind_opt();
				setState(938);
				id_subs_lp(0);
				setState(939);
				param_spec1();
				setState(940);
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

	public static class Param_spec1Context extends ParserRuleContext {
		public TerminalNode TK_COLON() { return getToken(MiLenguajeParser.TK_COLON, 0); }
		public Param_spec1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_spec1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParam_spec1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParam_spec1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParam_spec1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_spec1Context param_spec1() throws RecognitionException {
		Param_spec1Context _localctx = new Param_spec1Context(_ctx, getState());
		enterRule(_localctx, 188, RULE_param_spec1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			match(TK_COLON);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 190, RULE_common_stmt);
		try {
			setState(948);
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
				setState(946);
				decl();
				}
				break;
			case TK_IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(947);
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
		enterRule(_localctx, 192, RULE_extend_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(950);
			match(TK_EXTEND);
			setState(951);
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
		enterRule(_localctx, 194, RULE_import_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			match(TK_IMPORT);
			setState(954);
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
		int _startState = 196;
		enterRecursionRule(_localctx, 196, RULE_import_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(957);
			match(TK_ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(964);
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
					setState(959);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(960);
					match(TK_COMMA);
					setState(961);
					match(TK_ID);
					}
					} 
				}
				setState(966);
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
		enterRule(_localctx, 198, RULE_decl);
		try {
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				type_decl();
				}
				break;
			case TK_VAR:
			case TK_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(968);
				obj_decl();
				}
				break;
			case TK_OPTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(969);
				optype_decl();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 4);
				{
				setState(970);
				sem_decl();
				}
				break;
			case TK_EXTERNAL:
			case TK_OP:
				enterOuterAlt(_localctx, 5);
				{
				setState(971);
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
		enterRule(_localctx, 200, RULE_type_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(TK_TYPE);
			setState(975);
			match(TK_ID);
			setState(976);
			match(TK_EQ);
			setState(977);
			type();
			setState(978);
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
		enterRule(_localctx, 202, RULE_type_restriction);
		try {
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(980);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(981);
				match(TK_LBRACE);
				setState(982);
				match(TK_ID);
				setState(983);
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
		enterRule(_localctx, 204, RULE_op_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			op_or_ext();
			setState(987);
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
		int _startState = 206;
		enterRecursionRule(_localctx, 206, RULE_oper_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(990);
			oper_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(997);
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
					setState(992);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(993);
					match(TK_COMMA);
					setState(994);
					oper_def();
					}
					} 
				}
				setState(999);
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
		enterRule(_localctx, 208, RULE_oper_def);
		try {
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1000);
				id_subs_lp(0);
				setState(1001);
				op_prototype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				id_subs_lp(0);
				setState(1004);
				colon_opt();
				setState(1005);
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
		enterRule(_localctx, 210, RULE_colon_opt);
		try {
			setState(1011);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009);
				vacio();
				}
				break;
			case TK_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1010);
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
		enterRule(_localctx, 212, RULE_op_or_ext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
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
		enterRule(_localctx, 214, RULE_optype_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(TK_OPTYPE);
			setState(1016);
			match(TK_ID);
			setState(1017);
			eq_opt();
			setState(1018);
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
		enterRule(_localctx, 216, RULE_sem_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(TK_SEM);
			setState(1021);
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
		int _startState = 218;
		enterRecursionRule(_localctx, 218, RULE_sem_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1024);
			sem_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(1031);
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
					setState(1026);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1027);
					match(TK_COMMA);
					setState(1028);
					sem_def();
					}
					} 
				}
				setState(1033);
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
		enterRule(_localctx, 220, RULE_sem_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			id_subs();
			setState(1035);
			sem_proto();
			setState(1036);
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
		enterRule(_localctx, 222, RULE_sem_init);
		try {
			setState(1041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1038);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1039);
				match(TK_ASSIGN);
				setState(1040);
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
		enterRule(_localctx, 224, RULE_eq_opt);
		try {
			setState(1045);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
				vacio();
				}
				break;
			case TK_EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
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
		enterRule(_localctx, 226, RULE_type);
		try {
			setState(1052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047);
				subscripts();
				setState(1048);
				unsub_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1050);
				unsub_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1051);
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
		enterRule(_localctx, 228, RULE_unsub_type);
		try {
			setState(1062);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOL:
			case TK_INT:
			case TK_CHAR:
			case TK_REAL:
			case TK_FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				basic_type();
				}
				break;
			case TK_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				string_def();
				}
				break;
			case TK_ENUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(1056);
				enum_def();
				}
				break;
			case TK_PTR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1057);
				pointer_def();
				}
				break;
			case TK_REC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1058);
				record_def();
				}
				break;
			case TK_UNION:
				enterOuterAlt(_localctx, 6);
				{
				setState(1059);
				union_def();
				}
				break;
			case TK_CAP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1060);
				capability_def();
				}
				break;
			case TK_ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(1061);
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
		enterRule(_localctx, 230, RULE_pointer_def);
		try {
			setState(1068);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				match(TK_PTR);
				setState(1065);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				match(TK_PTR);
				setState(1067);
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
		enterRule(_localctx, 232, RULE_union_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			match(TK_UNION);
			setState(1071);
			match(TK_LPAREN);
			setState(1072);
			field_lp();
			setState(1073);
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
		enterRule(_localctx, 234, RULE_record_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(TK_REC);
			setState(1076);
			match(TK_LPAREN);
			setState(1077);
			field_lp();
			setState(1078);
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
		enterRule(_localctx, 236, RULE_capability_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			match(TK_CAP);
			setState(1081);
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
		enterRule(_localctx, 238, RULE_cap_for);
		try {
			setState(1088);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1083);
				qualified_id();
				}
				break;
			case TK_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				op_prototype();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 3);
				{
				setState(1085);
				match(TK_SEM);
				setState(1086);
				sem_proto();
				}
				break;
			case TK_VM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1087);
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
		enterRule(_localctx, 240, RULE_qualified_id);
		try {
			setState(1094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1090);
				match(TK_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1091);
				match(TK_ID);
				setState(1092);
				match(TK_PERIOD);
				setState(1093);
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
		enterRule(_localctx, 242, RULE_basic_type);
		try {
			setState(1101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				basic_type1();
				}
				break;
			case TK_BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1097);
				basic_type2();
				}
				break;
			case TK_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1098);
				basic_type3();
				}
				break;
			case TK_FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1099);
				basic_type4();
				}
				break;
			case TK_REAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1100);
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
		enterRule(_localctx, 244, RULE_basic_type1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
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
		enterRule(_localctx, 246, RULE_basic_type2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
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
		enterRule(_localctx, 248, RULE_basic_type3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
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
		enterRule(_localctx, 250, RULE_basic_type4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
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
		enterRule(_localctx, 252, RULE_basic_type5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
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
		enterRule(_localctx, 254, RULE_field_lp);
		try {
			setState(1121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1113);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				field();
				setState(1115);
				match(TK_SEPARATOR);
				setState(1116);
				field_lp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1118);
				field();
				setState(1119);
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
		enterRule(_localctx, 256, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1123);
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
		enterRule(_localctx, 258, RULE_param_kind_opt);
		try {
			setState(1130);
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
				setState(1125);
				vacio();
				}
				break;
			case TK_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1126);
				match(TK_VAL);
				}
				break;
			case TK_VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1127);
				match(TK_VAR);
				}
				break;
			case TK_RES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1128);
				match(TK_RES);
				}
				break;
			case TK_REF:
				enterOuterAlt(_localctx, 5);
				{
				setState(1129);
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
		enterRule(_localctx, 260, RULE_string_def);
		try {
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1132);
				match(TK_STRING);
				setState(1133);
				match(TK_LBRACKET);
				setState(1134);
				string_lim();
				setState(1135);
				match(TK_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1137);
				match(TK_STRING);
				setState(1138);
				match(TK_LPAREN);
				setState(1139);
				string_lim();
				setState(1140);
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
		enterRule(_localctx, 262, RULE_string_lim);
		try {
			setState(1146);
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
				setState(1144);
				expr(0);
				}
				break;
			case TK_ASTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1145);
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
		enterRule(_localctx, 264, RULE_obj_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			var_or_const();
			setState(1149);
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
		enterRule(_localctx, 266, RULE_enum_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(TK_ENUM);
			setState(1152);
			match(TK_LPAREN);
			setState(1153);
			id_lp(0);
			setState(1154);
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
		enterRule(_localctx, 268, RULE_var_or_const);
		try {
			setState(1158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1156);
				var_or_const_var();
				}
				break;
			case TK_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(1157);
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
		enterRule(_localctx, 270, RULE_var_or_const_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
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
		enterRule(_localctx, 272, RULE_var_or_const_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
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
		int _startState = 274;
		enterRecursionRule(_localctx, 274, RULE_var_def_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1165);
			var_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(1172);
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
					setState(1167);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1168);
					match(TK_COMMA);
					setState(1169);
					var_def();
					}
					} 
				}
				setState(1174);
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
		enterRule(_localctx, 276, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			id_subs_lp(0);
			setState(1176);
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
		enterRule(_localctx, 278, RULE_var_att);
		try {
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1178);
				var_att2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
				match(TK_COLON);
				setState(1180);
				type();
				setState(1181);
				match(TK_ASSIGN);
				setState(1182);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1184);
				var_att1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1185);
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
		enterRule(_localctx, 280, RULE_var_att1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			match(TK_ASSIGN);
			setState(1189);
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
		enterRule(_localctx, 282, RULE_var_att2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			match(TK_COLON);
			setState(1192);
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
		int _startState = 284;
		enterRecursionRule(_localctx, 284, RULE_id_subs_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1195);
			id_subs();
			}
			_ctx.stop = _input.LT(-1);
			setState(1202);
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
					setState(1197);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1198);
					match(TK_COMMA);
					setState(1199);
					id_subs();
					}
					} 
				}
				setState(1204);
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
		enterRule(_localctx, 286, RULE_id_subs);
		try {
			setState(1208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1205);
				id_subsID();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1206);
				match(TK_ID);
				setState(1207);
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
		enterRule(_localctx, 288, RULE_id_subsID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
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
		int _startState = 290;
		enterRecursionRule(_localctx, 290, RULE_id_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1213);
			match(TK_ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(1220);
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
					setState(1215);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1216);
					match(TK_COMMA);
					setState(1217);
					match(TK_ID);
					}
					} 
				}
				setState(1222);
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
		enterRule(_localctx, 292, RULE_skip_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
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
		enterRule(_localctx, 294, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
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
		enterRule(_localctx, 296, RULE_next_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
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
		enterRule(_localctx, 298, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
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
		enterRule(_localctx, 300, RULE_reply_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
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
		int _startState = 302;
		enterRecursionRule(_localctx, 302, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(1234);
				expr1();
				}
				break;
			case 2:
				{
				setState(1235);
				expr_num();
				}
				break;
			case 3:
				{
				setState(1236);
				expr2();
				}
				break;
			case 4:
				{
				setState(1237);
				literal();
				}
				break;
			case 5:
				{
				setState(1238);
				constructor();
				setState(1239);
				expr(43);
				}
				break;
			case 6:
				{
				setState(1241);
				expr3();
				setState(1242);
				constr_item_lp(0);
				setState(1243);
				expr4();
				}
				break;
			case 7:
				{
				setState(1245);
				prefix_expr();
				}
				break;
			case 8:
				{
				setState(1246);
				create_expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1403);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1249);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1250);
						expr11();
						setState(1251);
						expr(36);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1253);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1254);
						expr12();
						setState(1255);
						expr(35);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1257);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1258);
						expr13();
						setState(1259);
						expr(33);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1261);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1262);
						expr14();
						setState(1263);
						expr(32);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1265);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1266);
						expr15();
						setState(1267);
						expr(31);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1269);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1270);
						expr16();
						setState(1271);
						expr(30);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1273);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1274);
						expr17();
						setState(1275);
						expr(29);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1277);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1278);
						expr18();
						setState(1279);
						expr(28);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1281);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1282);
						expr19();
						setState(1283);
						expr(27);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1285);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1286);
						expr20();
						setState(1287);
						expr(26);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1289);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1290);
						expr21();
						setState(1291);
						expr(25);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1293);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1294);
						expr22();
						setState(1295);
						expr(24);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1297);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1298);
						expr23();
						setState(1299);
						expr(23);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1301);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1302);
						expr24();
						setState(1303);
						expr(22);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1305);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1306);
						expr25();
						setState(1307);
						expr(21);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1309);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1310);
						expr26();
						setState(1311);
						expr(20);
						}
						break;
					case 17:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1313);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1314);
						expr27();
						setState(1315);
						expr(19);
						}
						break;
					case 18:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1317);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1318);
						expr28();
						setState(1319);
						expr(18);
						}
						break;
					case 19:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1321);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1322);
						expr29();
						setState(1323);
						expr(17);
						}
						break;
					case 20:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1325);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1326);
						expr30();
						setState(1327);
						expr(16);
						}
						break;
					case 21:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1329);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1330);
						expr31();
						setState(1331);
						expr(15);
						}
						break;
					case 22:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1333);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1334);
						expr32();
						setState(1335);
						expr(14);
						}
						break;
					case 23:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1337);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1338);
						expr33();
						setState(1339);
						expr(13);
						}
						break;
					case 24:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1341);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1342);
						expr34();
						setState(1343);
						expr(12);
						}
						break;
					case 25:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1345);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1346);
						expr35();
						setState(1347);
						expr(11);
						}
						break;
					case 26:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1349);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1350);
						expr36();
						setState(1351);
						expr(10);
						}
						break;
					case 27:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1353);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1354);
						expr37();
						setState(1355);
						expr(9);
						}
						break;
					case 28:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1357);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1358);
						expr38();
						setState(1359);
						expr(8);
						}
						break;
					case 29:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1361);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1362);
						expr39();
						setState(1363);
						expr(7);
						}
						break;
					case 30:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1365);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1366);
						expr40();
						setState(1367);
						expr(6);
						}
						break;
					case 31:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1369);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1370);
						expr41();
						setState(1371);
						expr(5);
						}
						break;
					case 32:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1373);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1374);
						expr42();
						setState(1375);
						expr(4);
						}
						break;
					case 33:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1377);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1378);
						expr43();
						setState(1379);
						expr(3);
						}
						break;
					case 34:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1381);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(1382);
						paren_list();
						}
						break;
					case 35:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1383);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(1384);
						expr5();
						}
						break;
					case 36:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1385);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(1386);
						expr6();
						}
						break;
					case 37:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1387);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(1388);
						expr7();
						}
						break;
					case 38:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1389);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(1390);
						expr8();
						setState(1391);
						expr1();
						}
						break;
					case 39:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1393);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(1394);
						expr9();
						setState(1395);
						bound_lp(0);
						setState(1396);
						expr10();
						}
						break;
					case 40:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1398);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(1399);
						expr12();
						setState(1400);
						expr(0);
						setState(1401);
						constructor();
						}
						break;
					}
					} 
				}
				setState(1407);
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
		enterRule(_localctx, 304, RULE_expr_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
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
		enterRule(_localctx, 306, RULE_expr1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
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
		enterRule(_localctx, 308, RULE_expr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
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
		enterRule(_localctx, 310, RULE_expr3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
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
		enterRule(_localctx, 312, RULE_expr4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
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
		enterRule(_localctx, 314, RULE_expr5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
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
		enterRule(_localctx, 316, RULE_expr6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
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
		enterRule(_localctx, 318, RULE_expr7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
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
		enterRule(_localctx, 320, RULE_expr8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
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
		enterRule(_localctx, 322, RULE_expr9);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
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
		enterRule(_localctx, 324, RULE_expr10);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
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
		enterRule(_localctx, 326, RULE_expr11);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
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
		enterRule(_localctx, 328, RULE_expr12);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
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
		enterRule(_localctx, 330, RULE_expr13);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
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
		enterRule(_localctx, 332, RULE_expr14);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
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
		enterRule(_localctx, 334, RULE_expr15);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
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
		enterRule(_localctx, 336, RULE_expr16);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
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
		enterRule(_localctx, 338, RULE_expr17);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
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
		enterRule(_localctx, 340, RULE_expr18);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
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
		enterRule(_localctx, 342, RULE_expr19);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
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
		enterRule(_localctx, 344, RULE_expr20);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
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
		enterRule(_localctx, 346, RULE_expr21);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
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
		enterRule(_localctx, 348, RULE_expr22);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
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
		enterRule(_localctx, 350, RULE_expr23);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
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
		enterRule(_localctx, 352, RULE_expr24);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
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
		enterRule(_localctx, 354, RULE_expr25);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
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
		enterRule(_localctx, 356, RULE_expr26);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
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
		enterRule(_localctx, 358, RULE_expr27);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
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
		enterRule(_localctx, 360, RULE_expr28);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
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
		enterRule(_localctx, 362, RULE_expr29);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
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
		enterRule(_localctx, 364, RULE_expr30);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
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
		enterRule(_localctx, 366, RULE_expr31);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
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
		enterRule(_localctx, 368, RULE_expr32);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
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
		enterRule(_localctx, 370, RULE_expr33);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
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
		enterRule(_localctx, 372, RULE_expr34);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
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
		enterRule(_localctx, 374, RULE_expr35);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
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
		enterRule(_localctx, 376, RULE_expr36);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
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
		enterRule(_localctx, 378, RULE_expr37);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
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
		enterRule(_localctx, 380, RULE_expr38);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
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
		enterRule(_localctx, 382, RULE_expr39);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
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
		enterRule(_localctx, 384, RULE_expr40);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
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
		enterRule(_localctx, 386, RULE_expr41);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
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
		enterRule(_localctx, 388, RULE_expr42);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
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
		enterRule(_localctx, 390, RULE_expr43);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
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
		enterRule(_localctx, 392, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
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
		enterRule(_localctx, 394, RULE_create_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			match(TK_CREATE);
			setState(1499);
			create_call();
			setState(1500);
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
		enterRule(_localctx, 396, RULE_create_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
			rsrc_name();
			setState(1503);
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
		enterRule(_localctx, 398, RULE_rsrc_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
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
		enterRule(_localctx, 400, RULE_location_opt);
		try {
			setState(1510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1507);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1508);
				match(TK_ON);
				setState(1509);
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
		enterRule(_localctx, 402, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			match(TK_LPAREN);
			setState(1513);
			constr_item_lp(0);
			setState(1514);
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
		int _startState = 404;
		enterRecursionRule(_localctx, 404, RULE_constr_item_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1517);
			constr_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(1524);
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
					setState(1519);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1520);
					match(TK_COMMA);
					setState(1521);
					constr_item();
					}
					} 
				}
				setState(1526);
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
		enterRule(_localctx, 406, RULE_constr_item);
		try {
			setState(1533);
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
				setState(1527);
				expr(0);
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1528);
				match(TK_LBRACKET);
				setState(1529);
				expr(0);
				setState(1530);
				match(TK_RBRACKET);
				setState(1531);
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
		enterRule(_localctx, 408, RULE_prefix_expr);
		try {
			setState(1572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1535);
				match(TK_NOT);
				setState(1536);
				expr(0);
				}
				break;
			case TK_PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1537);
				match(TK_PLUS);
				setState(1538);
				expr(0);
				}
				break;
			case TK_MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1539);
				match(TK_MINUS);
				setState(1540);
				expr(0);
				}
				break;
			case TK_ADDR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1541);
				match(TK_ADDR);
				setState(1542);
				expr(0);
				}
				break;
			case TK_QMARK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1543);
				match(TK_QMARK);
				setState(1544);
				expr(0);
				}
				break;
			case TK_INCR:
				enterOuterAlt(_localctx, 6);
				{
				setState(1545);
				match(TK_INCR);
				setState(1546);
				expr(0);
				}
				break;
			case TK_DECR:
				enterOuterAlt(_localctx, 7);
				{
				setState(1547);
				match(TK_DECR);
				setState(1548);
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
				setState(1549);
				basic_type();
				setState(1550);
				paren_expr();
				}
				break;
			case TK_STRING:
				enterOuterAlt(_localctx, 9);
				{
				setState(1552);
				match(TK_STRING);
				setState(1553);
				paren_expr();
				setState(1554);
				match(TK_NOT);
				}
				break;
			case TK_LOW:
				enterOuterAlt(_localctx, 10);
				{
				setState(1556);
				match(TK_LOW);
				setState(1557);
				match(TK_LPAREN);
				setState(1558);
				type();
				setState(1559);
				match(TK_RPAREN);
				}
				break;
			case TK_HIGH:
				enterOuterAlt(_localctx, 11);
				{
				setState(1561);
				match(TK_HIGH);
				setState(1562);
				match(TK_LPAREN);
				setState(1563);
				type();
				setState(1564);
				match(TK_RPAREN);
				}
				break;
			case TK_NEW:
				enterOuterAlt(_localctx, 12);
				{
				setState(1566);
				match(TK_NEW);
				setState(1567);
				match(TK_LPAREN);
				setState(1568);
				subscripts_opt();
				setState(1569);
				new_item();
				setState(1570);
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
		enterRule(_localctx, 410, RULE_paren_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			match(TK_LPAREN);
			setState(1575);
			expr(0);
			setState(1576);
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
		enterRule(_localctx, 412, RULE_new_item);
		try {
			setState(1583);
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
				setState(1578);
				unsub_type();
				}
				break;
			case TK_SEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1579);
				match(TK_SEM);
				setState(1580);
				sem_proto();
				}
				break;
			case TK_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1581);
				match(TK_OP);
				setState(1582);
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
		enterRule(_localctx, 414, RULE_sem_proto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
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
		enterRule(_localctx, 416, RULE_op_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			prototype();
			setState(1588);
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
		enterRule(_localctx, 418, RULE_op_restriction_opt);
		try {
			setState(1595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1590);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1591);
				match(TK_LBRACE);
				setState(1592);
				op_restriction();
				setState(1593);
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
		enterRule(_localctx, 420, RULE_prototype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			parameters();
			setState(1598);
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
		enterRule(_localctx, 422, RULE_return_spec_opt);
		try {
			setState(1611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1600);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1601);
				match(TK_RETURNS);
				setState(1602);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1603);
				match(TK_RETURNS);
				setState(1604);
				id_subs();
				setState(1605);
				match(TK_COLON);
				setState(1606);
				type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1608);
				match(TK_RETURNS);
				setState(1609);
				match(TK_ID);
				setState(1610);
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
		enterRule(_localctx, 424, RULE_subscripts_opt);
		try {
			setState(1615);
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
				setState(1613);
				vacio();
				}
				break;
			case TK_LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1614);
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
		enterRule(_localctx, 426, RULE_subscripts);
		try {
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1617);
				bracketed_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1618);
				bracketed_list();
				setState(1619);
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
		enterRule(_localctx, 428, RULE_bracketed_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			match(TK_LBRACKET);
			setState(1624);
			bound_lp(0);
			setState(1625);
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
		int _startState = 430;
		enterRecursionRule(_localctx, 430, RULE_bound_lp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1628);
			bounds();
			}
			_ctx.stop = _input.LT(-1);
			setState(1635);
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
					setState(1630);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1631);
					match(TK_COMMA);
					setState(1632);
					bounds();
					}
					} 
				}
				setState(1637);
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
		enterRule(_localctx, 432, RULE_bounds);
		try {
			setState(1643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1638);
				bound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1639);
				bound();
				setState(1640);
				match(TK_COLON);
				setState(1641);
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
		enterRule(_localctx, 434, RULE_bound);
		try {
			setState(1649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1645);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1646);
				match(TK_ASTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1647);
				vacio();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1648);
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
		enterRule(_localctx, 436, RULE_op_restriction);
		try {
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1651);
				match(TK_CALL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1652);
				match(TK_SEND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1653);
				match(TK_CALL);
				setState(1654);
				match(TK_COMMA);
				setState(1655);
				match(TK_SEND);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1656);
				match(TK_SEND);
				setState(1657);
				match(TK_COMMA);
				setState(1658);
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
		enterRule(_localctx, 438, RULE_end_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			match(TK_END);
			setState(1662);
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
		enterRule(_localctx, 440, RULE_id_opt);
		try {
			setState(1666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1664);
				vacio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1665);
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
		enterRule(_localctx, 442, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
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
		enterRule(_localctx, 444, RULE_block_items);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			block_item();
			setState(1671);
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
		enterRule(_localctx, 446, RULE_block_items_);
		int _la;
		try {
			setState(1680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TK_SEPARATOR) {
					{
					setState(1673);
					match(TK_SEPARATOR);
					}
				}

				setState(1676);
				block_item();
				setState(1677);
				block_items_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1679);
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
		enterRule(_localctx, 448, RULE_block_item);
		try {
			setState(1686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1682);
				decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1683);
				stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1684);
				block_item1();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1685);
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
		enterRule(_localctx, 450, RULE_block_item1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
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
		enterRule(_localctx, 452, RULE_id_ls);
		try {
			setState(1692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1690);
				id_lp(0);
				}
				break;
			case TK_RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1691);
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
		enterRule(_localctx, 454, RULE_falta);
		try {
			setState(1696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(1694);
				match(T__0);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1695);
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
		enterRule(_localctx, 456, RULE_vacio);
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
		case 13:
			return quantifier_lp_sempred((Quantifier_lpContext)_localctx, predIndex);
		case 31:
			return spec_stmt_ls_sempred((Spec_stmt_lsContext)_localctx, predIndex);
		case 32:
			return body_stmt_ls_sempred((Body_stmt_lsContext)_localctx, predIndex);
		case 51:
			return in_cmd_lp_sempred((In_cmd_lpContext)_localctx, predIndex);
		case 60:
			return concurrent_cmd_lp_sempred((Concurrent_cmd_lpContext)_localctx, predIndex);
		case 62:
			return separator_opt_sempred((Separator_optContext)_localctx, predIndex);
		case 79:
			return guarded_cmd_lp_sempred((Guarded_cmd_lpContext)_localctx, predIndex);
		case 88:
			return expr_lp_sempred((Expr_lpContext)_localctx, predIndex);
		case 98:
			return import_list_sempred((Import_listContext)_localctx, predIndex);
		case 103:
			return oper_def_lp_sempred((Oper_def_lpContext)_localctx, predIndex);
		case 109:
			return sem_def_lp_sempred((Sem_def_lpContext)_localctx, predIndex);
		case 137:
			return var_def_lp_sempred((Var_def_lpContext)_localctx, predIndex);
		case 142:
			return id_subs_lp_sempred((Id_subs_lpContext)_localctx, predIndex);
		case 145:
			return id_lp_sempred((Id_lpContext)_localctx, predIndex);
		case 151:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 202:
			return constr_item_lp_sempred((Constr_item_lpContext)_localctx, predIndex);
		case 215:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008a\u06a7\4\2\t"+
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
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u01d4\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u01df\n\5"+
		"\3\6\3\6\3\6\5\6\u01e4\n\6\3\6\3\6\3\6\5\6\u01e9\n\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u020c\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\7\17\u0214\n\17\f\17\16\17\u0217\13\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\5\24\u0229\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\5\27\u0232"+
		"\n\27\3\30\3\30\3\30\5\30\u0237\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\5\33\u0243\n\33\3\34\3\34\3\34\3\34\5\34\u0249\n\34\3"+
		"\35\3\35\3\35\5\35\u024e\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\5\37\u0259\n\37\3 \3 \5 \u025d\n \3!\3!\3!\3!\3!\5!\u0264\n!\3!"+
		"\3!\3!\7!\u0269\n!\f!\16!\u026c\13!\3\"\3\"\3\"\3\"\3\"\5\"\u0273\n\""+
		"\3\"\7\"\u0276\n\"\f\"\16\"\u0279\13\"\3#\3#\3#\3#\5#\u027f\n#\3$\3$\5"+
		"$\u0283\n$\3%\3%\3%\3%\3%\3%\5%\u028b\n%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3(\3(\5(\u0299\n(\3)\3)\5)\u029d\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u02b3\n*\3+\3+\3+\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\7\65\u02dc\n\65\f\65\16\65\u02df\13\65\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\38\38\38\38\58\u02ef\n8\39\39\39\59\u02f4\n9\3"+
		":\3:\3:\3:\3:\5:\u02fb\n:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>\3"+
		">\3>\3>\3>\3>\7>\u0310\n>\f>\16>\u0313\13>\3?\3?\3?\3?\3?\3@\3@\3@\3@"+
		"\3@\7@\u031f\n@\f@\16@\u0322\13@\3A\3A\3A\5A\u0327\nA\3B\3B\3B\5B\u032c"+
		"\nB\3C\3C\3C\3D\3D\3D\3D\3D\5D\u0336\nD\3E\3E\3E\3F\3F\3F\3F\3G\3G\3G"+
		"\3G\3G\3H\3H\3I\3I\3J\3J\3J\3J\3J\3K\3K\3L\3L\3M\3M\3M\3M\3M\3M\3N\3N"+
		"\3O\3O\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u0364\nQ\fQ\16Q\u0367\13Q\3R\3R\3"+
		"S\3S\3S\3S\3S\3S\3S\3S\5S\u0373\nS\3T\3T\3U\3U\3U\3U\3U\5U\u037c\nU\3"+
		"V\3V\3V\3V\3W\3W\3X\3X\3Y\3Y\5Y\u0388\nY\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u0390\n"+
		"Z\fZ\16Z\u0393\13Z\3[\3[\3\\\3\\\3\\\3\\\3]\3]\5]\u039d\n]\3^\3^\3^\3"+
		"^\3^\3^\3^\3^\5^\u03a7\n^\3_\3_\3_\3_\3_\3_\3_\3_\5_\u03b1\n_\3`\3`\3"+
		"a\3a\5a\u03b7\na\3b\3b\3b\3c\3c\3c\3d\3d\3d\3d\3d\3d\7d\u03c5\nd\fd\16"+
		"d\u03c8\13d\3e\3e\3e\3e\3e\5e\u03cf\ne\3f\3f\3f\3f\3f\3f\3g\3g\3g\3g\5"+
		"g\u03db\ng\3h\3h\3h\3i\3i\3i\3i\3i\3i\7i\u03e6\ni\fi\16i\u03e9\13i\3j"+
		"\3j\3j\3j\3j\3j\3j\5j\u03f2\nj\3k\3k\5k\u03f6\nk\3l\3l\3m\3m\3m\3m\3m"+
		"\3n\3n\3n\3o\3o\3o\3o\3o\3o\7o\u0408\no\fo\16o\u040b\13o\3p\3p\3p\3p\3"+
		"q\3q\3q\5q\u0414\nq\3r\3r\5r\u0418\nr\3s\3s\3s\3s\3s\5s\u041f\ns\3t\3"+
		"t\3t\3t\3t\3t\3t\3t\5t\u0429\nt\3u\3u\3u\3u\5u\u042f\nu\3v\3v\3v\3v\3"+
		"v\3w\3w\3w\3w\3w\3x\3x\3x\3y\3y\3y\3y\3y\5y\u0443\ny\3z\3z\3z\3z\5z\u0449"+
		"\nz\3{\3{\3{\3{\3{\5{\u0450\n{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\3"+
		"\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\5\u0081\u0464\n\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\5\u0083\u046d\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u0479\n\u0084\3\u0085"+
		"\3\u0085\5\u0085\u047d\n\u0085\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\5\u0088\u0489\n\u0088\3\u0089"+
		"\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\7\u008b\u0495\n\u008b\f\u008b\16\u008b\u0498\13\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\5\u008d\u04a5\n\u008d\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u04b3\n\u0090"+
		"\f\u0090\16\u0090\u04b6\13\u0090\3\u0091\3\u0091\3\u0091\5\u0091\u04bb"+
		"\n\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\7\u0093\u04c5\n\u0093\f\u0093\16\u0093\u04c8\13\u0093\3\u0094\3\u0094"+
		"\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u04e2\n\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\7\u0099"+
		"\u057e\n\u0099\f\u0099\16\u0099\u0581\13\u0099\3\u009a\3\u009a\3\u009b"+
		"\3\u009b\3\u009c\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e\3\u009f\3\u009f"+
		"\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a4"+
		"\3\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ad"+
		"\3\u00ad\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1"+
		"\3\u00b2\3\u00b2\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b6"+
		"\3\u00b6\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00ba\3\u00ba"+
		"\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00bf"+
		"\3\u00bf\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c3\3\u00c3"+
		"\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca"+
		"\5\u00ca\u05e9\n\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\7\u00cc\u05f5\n\u00cc\f\u00cc\16\u00cc"+
		"\u05f8\13\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd"+
		"\u0600\n\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0627\n\u00ce\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0632\n\u00d0"+
		"\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\3\u00d3"+
		"\3\u00d3\5\u00d3\u063e\n\u00d3\3\u00d4\3\u00d4\3\u00d4\3\u00d5\3\u00d5"+
		"\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\5\u00d5\u064e\n\u00d5\3\u00d6\3\u00d6\5\u00d6\u0652\n\u00d6\3\u00d7\3"+
		"\u00d7\3\u00d7\3\u00d7\5\u00d7\u0658\n\u00d7\3\u00d8\3\u00d8\3\u00d8\3"+
		"\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\7\u00d9\u0664\n"+
		"\u00d9\f\u00d9\16\u00d9\u0667\13\u00d9\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\5\u00da\u066e\n\u00da\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db"+
		"\u0674\n\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\5\u00dc\u067e\n\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de"+
		"\5\u00de\u0685\n\u00de\3\u00df\3\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e1"+
		"\5\u00e1\u068d\n\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0693\n"+
		"\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\5\u00e2\u0699\n\u00e2\3\u00e3\3"+
		"\u00e3\3\u00e4\3\u00e4\5\u00e4\u069f\n\u00e4\3\u00e5\3\u00e5\5\u00e5\u06a3"+
		"\n\u00e5\3\u00e6\3\u00e6\3\u00e6\2\23\34@Bhz~\u00a0\u00b2\u00c6\u00d0"+
		"\u00dc\u0114\u011e\u0124\u0130\u0196\u01b0\u00e7\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
		"\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154"+
		"\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c"+
		"\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184"+
		"\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c"+
		"\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4"+
		"\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\2\5"+
		"\4\2\4\4MM\3\2OU\4\2||\u0086\u0086\2\u068f\2\u01cc\3\2\2\2\4\u01d3\3\2"+
		"\2\2\6\u01d5\3\2\2\2\b\u01de\3\2\2\2\n\u01e0\3\2\2\2\f\u01ea\3\2\2\2\16"+
		"\u01ec\3\2\2\2\20\u01f3\3\2\2\2\22\u01fa\3\2\2\2\24\u0200\3\2\2\2\26\u0202"+
		"\3\2\2\2\30\u0204\3\2\2\2\32\u020b\3\2\2\2\34\u020d\3\2\2\2\36\u0218\3"+
		"\2\2\2 \u0220\3\2\2\2\"\u0222\3\2\2\2$\u0224\3\2\2\2&\u0228\3\2\2\2(\u022a"+
		"\3\2\2\2*\u022c\3\2\2\2,\u0231\3\2\2\2.\u0236\3\2\2\2\60\u0238\3\2\2\2"+
		"\62\u023a\3\2\2\2\64\u0242\3\2\2\2\66\u0248\3\2\2\28\u024d\3\2\2\2:\u024f"+
		"\3\2\2\2<\u0258\3\2\2\2>\u025c\3\2\2\2@\u025e\3\2\2\2B\u026d\3\2\2\2D"+
		"\u027e\3\2\2\2F\u0282\3\2\2\2H\u028a\3\2\2\2J\u028c\3\2\2\2L\u0291\3\2"+
		"\2\2N\u0298\3\2\2\2P\u029c\3\2\2\2R\u02b2\3\2\2\2T\u02b4\3\2\2\2V\u02b9"+
		"\3\2\2\2X\u02bb\3\2\2\2Z\u02bd\3\2\2\2\\\u02bf\3\2\2\2^\u02c2\3\2\2\2"+
		"`\u02c5\3\2\2\2b\u02c8\3\2\2\2d\u02cb\3\2\2\2f\u02d0\3\2\2\2h\u02d5\3"+
		"\2\2\2j\u02e0\3\2\2\2l\u02e7\3\2\2\2n\u02ee\3\2\2\2p\u02f3\3\2\2\2r\u02fa"+
		"\3\2\2\2t\u02fc\3\2\2\2v\u0300\3\2\2\2x\u0305\3\2\2\2z\u0309\3\2\2\2|"+
		"\u0314\3\2\2\2~\u0319\3\2\2\2\u0080\u0326\3\2\2\2\u0082\u032b\3\2\2\2"+
		"\u0084\u032d\3\2\2\2\u0086\u0335\3\2\2\2\u0088\u0337\3\2\2\2\u008a\u033a"+
		"\3\2\2\2\u008c\u033e\3\2\2\2\u008e\u0343\3\2\2\2\u0090\u0345\3\2\2\2\u0092"+
		"\u0347\3\2\2\2\u0094\u034c\3\2\2\2\u0096\u034e\3\2\2\2\u0098\u0350\3\2"+
		"\2\2\u009a\u0356\3\2\2\2\u009c\u0358\3\2\2\2\u009e\u035a\3\2\2\2\u00a0"+
		"\u035c\3\2\2\2\u00a2\u0368\3\2\2\2\u00a4\u0372\3\2\2\2\u00a6\u0374\3\2"+
		"\2\2\u00a8\u037b\3\2\2\2\u00aa\u037d\3\2\2\2\u00ac\u0381\3\2\2\2\u00ae"+
		"\u0383\3\2\2\2\u00b0\u0387\3\2\2\2\u00b2\u0389\3\2\2\2\u00b4\u0394\3\2"+
		"\2\2\u00b6\u0396\3\2\2\2\u00b8\u039c\3\2\2\2\u00ba\u03a6\3\2\2\2\u00bc"+
		"\u03b0\3\2\2\2\u00be\u03b2\3\2\2\2\u00c0\u03b6\3\2\2\2\u00c2\u03b8\3\2"+
		"\2\2\u00c4\u03bb\3\2\2\2\u00c6\u03be\3\2\2\2\u00c8\u03ce\3\2\2\2\u00ca"+
		"\u03d0\3\2\2\2\u00cc\u03da\3\2\2\2\u00ce\u03dc\3\2\2\2\u00d0\u03df\3\2"+
		"\2\2\u00d2\u03f1\3\2\2\2\u00d4\u03f5\3\2\2\2\u00d6\u03f7\3\2\2\2\u00d8"+
		"\u03f9\3\2\2\2\u00da\u03fe\3\2\2\2\u00dc\u0401\3\2\2\2\u00de\u040c\3\2"+
		"\2\2\u00e0\u0413\3\2\2\2\u00e2\u0417\3\2\2\2\u00e4\u041e\3\2\2\2\u00e6"+
		"\u0428\3\2\2\2\u00e8\u042e\3\2\2\2\u00ea\u0430\3\2\2\2\u00ec\u0435\3\2"+
		"\2\2\u00ee\u043a\3\2\2\2\u00f0\u0442\3\2\2\2\u00f2\u0448\3\2\2\2\u00f4"+
		"\u044f\3\2\2\2\u00f6\u0451\3\2\2\2\u00f8\u0453\3\2\2\2\u00fa\u0455\3\2"+
		"\2\2\u00fc\u0457\3\2\2\2\u00fe\u0459\3\2\2\2\u0100\u0463\3\2\2\2\u0102"+
		"\u0465\3\2\2\2\u0104\u046c\3\2\2\2\u0106\u0478\3\2\2\2\u0108\u047c\3\2"+
		"\2\2\u010a\u047e\3\2\2\2\u010c\u0481\3\2\2\2\u010e\u0488\3\2\2\2\u0110"+
		"\u048a\3\2\2\2\u0112\u048c\3\2\2\2\u0114\u048e\3\2\2\2\u0116\u0499\3\2"+
		"\2\2\u0118\u04a4\3\2\2\2\u011a\u04a6\3\2\2\2\u011c\u04a9\3\2\2\2\u011e"+
		"\u04ac\3\2\2\2\u0120\u04ba\3\2\2\2\u0122\u04bc\3\2\2\2\u0124\u04be\3\2"+
		"\2\2\u0126\u04c9\3\2\2\2\u0128\u04cb\3\2\2\2\u012a\u04cd\3\2\2\2\u012c"+
		"\u04cf\3\2\2\2\u012e\u04d1\3\2\2\2\u0130\u04e1\3\2\2\2\u0132\u0582\3\2"+
		"\2\2\u0134\u0584\3\2\2\2\u0136\u0586\3\2\2\2\u0138\u0588\3\2\2\2\u013a"+
		"\u058a\3\2\2\2\u013c\u058c\3\2\2\2\u013e\u058e\3\2\2\2\u0140\u0590\3\2"+
		"\2\2\u0142\u0592\3\2\2\2\u0144\u0594\3\2\2\2\u0146\u0596\3\2\2\2\u0148"+
		"\u0598\3\2\2\2\u014a\u059a\3\2\2\2\u014c\u059c\3\2\2\2\u014e\u059e\3\2"+
		"\2\2\u0150\u05a0\3\2\2\2\u0152\u05a2\3\2\2\2\u0154\u05a4\3\2\2\2\u0156"+
		"\u05a6\3\2\2\2\u0158\u05a8\3\2\2\2\u015a\u05aa\3\2\2\2\u015c\u05ac\3\2"+
		"\2\2\u015e\u05ae\3\2\2\2\u0160\u05b0\3\2\2\2\u0162\u05b2\3\2\2\2\u0164"+
		"\u05b4\3\2\2\2\u0166\u05b6\3\2\2\2\u0168\u05b8\3\2\2\2\u016a\u05ba\3\2"+
		"\2\2\u016c\u05bc\3\2\2\2\u016e\u05be\3\2\2\2\u0170\u05c0\3\2\2\2\u0172"+
		"\u05c2\3\2\2\2\u0174\u05c4\3\2\2\2\u0176\u05c6\3\2\2\2\u0178\u05c8\3\2"+
		"\2\2\u017a\u05ca\3\2\2\2\u017c\u05cc\3\2\2\2\u017e\u05ce\3\2\2\2\u0180"+
		"\u05d0\3\2\2\2\u0182\u05d2\3\2\2\2\u0184\u05d4\3\2\2\2\u0186\u05d6\3\2"+
		"\2\2\u0188\u05d8\3\2\2\2\u018a\u05da\3\2\2\2\u018c\u05dc\3\2\2\2\u018e"+
		"\u05e0\3\2\2\2\u0190\u05e3\3\2\2\2\u0192\u05e8\3\2\2\2\u0194\u05ea\3\2"+
		"\2\2\u0196\u05ee\3\2\2\2\u0198\u05ff\3\2\2\2\u019a\u0626\3\2\2\2\u019c"+
		"\u0628\3\2\2\2\u019e\u0631\3\2\2\2\u01a0\u0633\3\2\2\2\u01a2\u0635\3\2"+
		"\2\2\u01a4\u063d\3\2\2\2\u01a6\u063f\3\2\2\2\u01a8\u064d\3\2\2\2\u01aa"+
		"\u0651\3\2\2\2\u01ac\u0657\3\2\2\2\u01ae\u0659\3\2\2\2\u01b0\u065d\3\2"+
		"\2\2\u01b2\u066d\3\2\2\2\u01b4\u0673\3\2\2\2\u01b6\u067d\3\2\2\2\u01b8"+
		"\u067f\3\2\2\2\u01ba\u0684\3\2\2\2\u01bc\u0686\3\2\2\2\u01be\u0688\3\2"+
		"\2\2\u01c0\u0692\3\2\2\2\u01c2\u0698\3\2\2\2\u01c4\u069a\3\2\2\2\u01c6"+
		"\u069e\3\2\2\2\u01c8\u06a2\3\2\2\2\u01ca\u06a4\3\2\2\2\u01cc\u01cd\5\4"+
		"\3\2\u01cd\3\3\2\2\2\u01ce\u01d4\5\6\4\2\u01cf\u01d4\5\n\6\2\u01d0\u01d4"+
		"\5\f\7\2\u01d1\u01d4\5\16\b\2\u01d2\u01d4\5\u01bc\u00df\2\u01d3\u01ce"+
		"\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4\5\3\2\2\2\u01d5\u01d6\7f\2\2\u01d6\u01d7\7\u0086"+
		"\2\2\u01d7\u01d8\5@!\2\u01d8\u01d9\58\35\2\u01d9\7\3\2\2\2\u01da\u01db"+
		"\7f\2\2\u01db\u01df\7\u0086\2\2\u01dc\u01dd\7g\2\2\u01dd\u01df\7\u0086"+
		"\2\2\u01de\u01da\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\t\3\2\2\2\u01e0\u01e1"+
		"\7g\2\2\u01e1\u01e3\7\u0086\2\2\u01e2\u01e4\5\u00b6\\\2\u01e3\u01e2\3"+
		"\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\5@!\2\u01e6"+
		"\u01e8\58\35\2\u01e7\u01e9\5\u01b8\u00dd\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9"+
		"\3\2\2\2\u01e9\13\3\2\2\2\u01ea\u01eb\58\35\2\u01eb\r\3\2\2\2\u01ec\u01ed"+
		"\7i\2\2\u01ed\u01ee\7\u0086\2\2\u01ee\u01ef\5\62\32\2\u01ef\u01f0\5@!"+
		"\2\u01f0\u01f1\58\35\2\u01f1\u01f2\5\u01b8\u00dd\2\u01f2\17\3\2\2\2\u01f3"+
		"\u01f4\7C\2\2\u01f4\u01f5\7\u0086\2\2\u01f5\u01f6\5\60\31\2\u01f6\u01f7"+
		"\5\32\16\2\u01f7\u01f8\5\u01bc\u00df\2\u01f8\u01f9\5\u01b8\u00dd\2\u01f9"+
		"\21\3\2\2\2\u01fa\u01fb\5\24\13\2\u01fb\u01fc\5\26\f\2\u01fc\u01fd\5\u01a6"+
		"\u00d4\2\u01fd\u01fe\5\u01bc\u00df\2\u01fe\u01ff\5\u01b8\u00dd\2\u01ff"+
		"\23\3\2\2\2\u0200\u0201\7D\2\2\u0201\25\3\2\2\2\u0202\u0203\7\u0086\2"+
		"\2\u0203\27\3\2\2\2\u0204\u0205\5\u01b8\u00dd\2\u0205\31\3\2\2\2\u0206"+
		"\u020c\5\u01ca\u00e6\2\u0207\u0208\7\20\2\2\u0208\u0209\5\34\17\2\u0209"+
		"\u020a\7\21\2\2\u020a\u020c\3\2\2\2\u020b\u0206\3\2\2\2\u020b\u0207\3"+
		"\2\2\2\u020c\33\3\2\2\2\u020d\u020e\b\17\1\2\u020e\u020f\5\36\20\2\u020f"+
		"\u0215\3\2\2\2\u0210\u0211\f\3\2\2\u0211\u0212\7\22\2\2\u0212\u0214\5"+
		"\36\20\2\u0213\u0210\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\35\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u0219\5 \21"+
		"\2\u0219\u021a\5\"\22\2\u021a\u021b\5\u0130\u0099\2\u021b\u021c\5&\24"+
		"\2\u021c\u021d\5$\23\2\u021d\u021e\5,\27\2\u021e\u021f\5.\30\2\u021f\37"+
		"\3\2\2\2\u0220\u0221\7\u0086\2\2\u0221!\3\2\2\2\u0222\u0223\7\n\2\2\u0223"+
		"#\3\2\2\2\u0224\u0225\5\u0130\u0099\2\u0225%\3\2\2\2\u0226\u0229\5(\25"+
		"\2\u0227\u0229\5*\26\2\u0228\u0226\3\2\2\2\u0228\u0227\3\2\2\2\u0229\'"+
		"\3\2\2\2\u022a\u022b\7F\2\2\u022b)\3\2\2\2\u022c\u022d\7H\2\2\u022d+\3"+
		"\2\2\2\u022e\u0232\5\u01ca\u00e6\2\u022f\u0230\7E\2\2\u0230\u0232\5\u0130"+
		"\u0099\2\u0231\u022e\3\2\2\2\u0231\u022f\3\2\2\2\u0232-\3\2\2\2\u0233"+
		"\u0237\5\u01ca\u00e6\2\u0234\u0235\7G\2\2\u0235\u0237\5\u0130\u0099\2"+
		"\u0236\u0233\3\2\2\2\u0236\u0234\3\2\2\2\u0237/\3\2\2\2\u0238\u0239\5"+
		"\u01ca\u00e6\2\u0239\61\3\2\2\2\u023a\u023b\7\20\2\2\u023b\u023c\5\u01c6"+
		"\u00e4\2\u023c\u023d\7\21\2\2\u023d\u023e\5\64\33\2\u023e\63\3\2\2\2\u023f"+
		"\u0243\5\u01ca\u00e6\2\u0240\u0241\7z\2\2\u0241\u0243\7\u0086\2\2\u0242"+
		"\u023f\3\2\2\2\u0242\u0240\3\2\2\2\u0243\65\3\2\2\2\u0244\u0249\5\u00c0"+
		"a\2\u0245\u0249\5\u00c2b\2\u0246\u0249\5D#\2\u0247\u0249\5\u00c8e\2\u0248"+
		"\u0244\3\2\2\2\u0248\u0245\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0247\3\2"+
		"\2\2\u0249\67\3\2\2\2\u024a\u024b\7e\2\2\u024b\u024e\5\4\3\2\u024c\u024e"+
		"\5:\36\2\u024d\u024a\3\2\2\2\u024d\u024c\3\2\2\2\u024e9\3\2\2\2\u024f"+
		"\u0250\7h\2\2\u0250\u0251\7\u0086\2\2\u0251\u0252\5> \2\u0252\u0253\5"+
		"<\37\2\u0253;\3\2\2\2\u0254\u0255\5B\"\2\u0255\u0256\5\u01b8\u00dd\2\u0256"+
		"\u0259\3\2\2\2\u0257\u0259\7o\2\2\u0258\u0254\3\2\2\2\u0258\u0257\3\2"+
		"\2\2\u0259=\3\2\2\2\u025a\u025d\5\u00b4[\2\u025b\u025d\5\u01ca\u00e6\2"+
		"\u025c\u025a\3\2\2\2\u025c\u025b\3\2\2\2\u025d?\3\2\2\2\u025e\u025f\b"+
		"!\1\2\u025f\u0260\5\66\34\2\u0260\u026a\3\2\2\2\u0261\u0263\f\4\2\2\u0262"+
		"\u0264\7\13\2\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3"+
		"\2\2\2\u0265\u0269\5\66\34\2\u0266\u0267\f\3\2\2\u0267\u0269\5\66\34\2"+
		"\u0268\u0261\3\2\2\2\u0268\u0266\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268"+
		"\3\2\2\2\u026a\u026b\3\2\2\2\u026bA\3\2\2\2\u026c\u026a\3\2\2\2\u026d"+
		"\u026e\b\"\1\2\u026e\u026f\5D#\2\u026f\u0277\3\2\2\2\u0270\u0272\f\3\2"+
		"\2\u0271\u0273\7\13\2\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0276\5D#\2\u0275\u0270\3\2\2\2\u0276\u0279\3\2\2"+
		"\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278C\3\2\2\2\u0279\u0277"+
		"\3\2\2\2\u027a\u027f\5\u00c0a\2\u027b\u027f\5\u0130\u0099\2\u027c\u027f"+
		"\5H%\2\u027d\u027f\5\u00c2b\2\u027e\u027a\3\2\2\2\u027e\u027b\3\2\2\2"+
		"\u027e\u027c\3\2\2\2\u027e\u027d\3\2\2\2\u027fE\3\2\2\2\u0280\u0283\7"+
		"\13\2\2\u0281\u0283\5\u01ca\u00e6\2\u0282\u0280\3\2\2\2\u0282\u0281\3"+
		"\2\2\2\u0283G\3\2\2\2\u0284\u028b\5R*\2\u0285\u028b\5\16\b\2\u0286\u028b"+
		"\5\20\t\2\u0287\u028b\5\22\n\2\u0288\u028b\5J&\2\u0289\u028b\5L\'\2\u028a"+
		"\u0284\3\2\2\2\u028a\u0285\3\2\2\2\u028a\u0286\3\2\2\2\u028a\u0287\3\2"+
		"\2\2\u028a\u0288\3\2\2\2\u028a\u0289\3\2\2\2\u028bI\3\2\2\2\u028c\u028d"+
		"\7\u0084\2\2\u028d\u028e\5\u01bc\u00df\2\u028e\u028f\7e\2\2\u028f\u0290"+
		"\5P)\2\u0290K\3\2\2\2\u0291\u0292\7\u0085\2\2\u0292\u0293\5\u01bc\u00df"+
		"\2\u0293\u0294\7e\2\2\u0294\u0295\5N(\2\u0295M\3\2\2\2\u0296\u0299\5\u01ca"+
		"\u00e6\2\u0297\u0299\7\u0085\2\2\u0298\u0296\3\2\2\2\u0298\u0297\3\2\2"+
		"\2\u0299O\3\2\2\2\u029a\u029d\5\u01ca\u00e6\2\u029b\u029d\7\u0084\2\2"+
		"\u029c\u029a\3\2\2\2\u029c\u029b\3\2\2\2\u029dQ\3\2\2\2\u029e\u02b3\5"+
		"\u0126\u0094\2\u029f\u02b3\5\\/\2\u02a0\u02b3\5\u0128\u0095\2\u02a1\u02b3"+
		"\5\u012a\u0096\2\u02a2\u02b3\5\u012c\u0097\2\u02a3\u02b3\5\u012e\u0098"+
		"\2\u02a4\u02b3\5T+\2\u02a5\u02b3\5^\60\2\u02a6\u02b3\5`\61\2\u02a7\u02b3"+
		"\5b\62\2\u02a8\u02b3\5\u0088E\2\u02a9\u02b3\5\u008aF\2\u02aa\u02b3\5\u008c"+
		"G\2\u02ab\u02b3\5\u0092J\2\u02ac\u02b3\5\u0098M\2\u02ad\u02b3\5d\63\2"+
		"\u02ae\u02b3\5f\64\2\u02af\u02b3\5t;\2\u02b0\u02b3\5v<\2\u02b1\u02b3\5"+
		"x=\2\u02b2\u029e\3\2\2\2\u02b2\u029f\3\2\2\2\u02b2\u02a0\3\2\2\2\u02b2"+
		"\u02a1\3\2\2\2\u02b2\u02a2\3\2\2\2\u02b2\u02a3\3\2\2\2\u02b2\u02a4\3\2"+
		"\2\2\u02b2\u02a5\3\2\2\2\u02b2\u02a6\3\2\2\2\u02b2\u02a7\3\2\2\2\u02b2"+
		"\u02a8\3\2\2\2\u02b2\u02a9\3\2\2\2\u02b2\u02aa\3\2\2\2\u02b2\u02ab\3\2"+
		"\2\2\u02b2\u02ac\3\2\2\2\u02b2\u02ad\3\2\2\2\u02b2\u02ae\3\2\2\2\u02b2"+
		"\u02af\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b1\3\2\2\2\u02b3S\3\2\2\2"+
		"\u02b4\u02b5\5V,\2\u02b5\u02b6\5X-\2\u02b6\u02b7\5\u01b0\u00d9\2\u02b7"+
		"\u02b8\5Z.\2\u02b8U\3\2\2\2\u02b9\u02ba\7\u0086\2\2\u02baW\3\2\2\2\u02bb"+
		"\u02bc\7\20\2\2\u02bcY\3\2\2\2\u02bd\u02be\7\21\2\2\u02be[\3\2\2\2\u02bf"+
		"\u02c0\7~\2\2\u02c0\u02c1\5\u0086D\2\u02c1]\3\2\2\2\u02c2\u02c3\7`\2\2"+
		"\u02c3\u02c4\5\u0084C\2\u02c4_\3\2\2\2\u02c5\u02c6\7a\2\2\u02c6\u02c7"+
		"\5\u0084C\2\u02c7a\3\2\2\2\u02c8\u02c9\7b\2\2\u02c9\u02ca\5\u0084C\2\u02ca"+
		"c\3\2\2\2\u02cb\u02cc\7=\2\2\u02cc\u02cd\7\20\2\2\u02cd\u02ce\5\u0130"+
		"\u0099\2\u02ce\u02cf\7\21\2\2\u02cfe\3\2\2\2\u02d0\u02d1\7>\2\2\u02d1"+
		"\u02d2\5h\65\2\u02d2\u02d3\5\u00a8U\2\u02d3\u02d4\7?\2\2\u02d4g\3\2\2"+
		"\2\u02d5\u02d6\b\65\1\2\u02d6\u02d7\5j\66\2\u02d7\u02dd\3\2\2\2\u02d8"+
		"\u02d9\f\3\2\2\u02d9\u02da\7\27\2\2\u02da\u02dc\5j\66\2\u02db\u02d8\3"+
		"\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de"+
		"i\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e1\5\32\16\2\u02e1\u02e2\5l\67"+
		"\2\u02e2\u02e3\5r:\2\u02e3\u02e4\5p9\2\u02e4\u02e5\7\26\2\2\u02e5\u02e6"+
		"\5\u01bc\u00df\2\u02e6k\3\2\2\2\u02e7\u02e8\5n8\2\u02e8\u02e9\5\62\32"+
		"\2\u02e9m\3\2\2\2\u02ea\u02ef\5\u00f2z\2\u02eb\u02ec\5\u00f2z\2\u02ec"+
		"\u02ed\5\u01ac\u00d7\2\u02ed\u02ef\3\2\2\2\u02ee\u02ea\3\2\2\2\u02ee\u02eb"+
		"\3\2\2\2\u02efo\3\2\2\2\u02f0\u02f4\5\u01ca\u00e6\2\u02f1\u02f2\7E\2\2"+
		"\u02f2\u02f4\5\u0130\u0099\2\u02f3\u02f0\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4"+
		"q\3\2\2\2\u02f5\u02fb\5\u01ca\u00e6\2\u02f6\u02f7\7$\2\2\u02f7\u02fb\5"+
		"\u0130\u0099\2\u02f8\u02f9\7G\2\2\u02f9\u02fb\5\u0130\u0099\2\u02fa\u02f5"+
		"\3\2\2\2\u02fa\u02f6\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fbs\3\2\2\2\u02fc"+
		"\u02fd\79\2\2\u02fd\u02fe\5\u0130\u0099\2\u02fe\u02ff\5\u00aaV\2\u02ff"+
		"u\3\2\2\2\u0300\u0301\7:\2\2\u0301\u0302\7\20\2\2\u0302\u0303\5\u0130"+
		"\u0099\2\u0303\u0304\7\21\2\2\u0304w\3\2\2\2\u0305\u0306\7;\2\2\u0306"+
		"\u0307\5z>\2\u0307\u0308\7<\2\2\u0308y\3\2\2\2\u0309\u030a\b>\1\2\u030a"+
		"\u030b\5|?\2\u030b\u0311\3\2\2\2\u030c\u030d\f\3\2\2\u030d\u030e\7\5\2"+
		"\2\u030e\u0310\5|?\2\u030f\u030c\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f"+
		"\3\2\2\2\u0311\u0312\3\2\2\2\u0312{\3\2\2\2\u0313\u0311\3\2\2\2\u0314"+
		"\u0315\5\32\16\2\u0315\u0316\5~@\2\u0316\u0317\5\u0080A\2\u0317\u0318"+
		"\5\u0082B\2\u0318}\3\2\2\2\u0319\u031a\b@\1\2\u031a\u031b\5\u01ca\u00e6"+
		"\2\u031b\u0320\3\2\2\2\u031c\u031d\f\3\2\2\u031d\u031f\7\13\2\2\u031e"+
		"\u031c\3\2\2\2\u031f\u0322\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2"+
		"\2\2\u0321\177\3\2\2\2\u0322\u0320\3\2\2\2\u0323\u0327\5b\62\2\u0324\u0327"+
		"\5`\61\2\u0325\u0327\5\u0130\u0099\2\u0326\u0323\3\2\2\2\u0326\u0324\3"+
		"\2\2\2\u0326\u0325\3\2\2\2\u0327\u0081\3\2\2\2\u0328\u032c\5\u01ca\u00e6"+
		"\2\u0329\u032a\7\26\2\2\u032a\u032c\5\u01bc\u00df\2\u032b\u0328\3\2\2"+
		"\2\u032b\u0329\3\2\2\2\u032c\u0083\3\2\2\2\u032d\u032e\5\u0130\u0099\2"+
		"\u032e\u032f\5\u00aaV\2\u032f\u0085\3\2\2\2\u0330\u0336\5\u01ca\u00e6"+
		"\2\u0331\u0332\7\20\2\2\u0332\u0333\5\u0130\u0099\2\u0333\u0334\7\21\2"+
		"\2\u0334\u0336\3\2\2\2\u0335\u0330\3\2\2\2\u0335\u0331\3\2\2\2\u0336\u0087"+
		"\3\2\2\2\u0337\u0338\7c\2\2\u0338\u0339\5\u0130\u0099\2\u0339\u0089\3"+
		"\2\2\2\u033a\u033b\7d\2\2\u033b\u033c\5\u01bc\u00df\2\u033c\u033d\7e\2"+
		"\2\u033d\u008b\3\2\2\2\u033e\u033f\5\u008eH\2\u033f\u0340\5\u00a0Q\2\u0340"+
		"\u0341\5\u00a8U\2\u0341\u0342\5\u0090I\2\u0342\u008d\3\2\2\2\u0343\u0344"+
		"\7W\2\2\u0344\u008f\3\2\2\2\u0345\u0346\7X\2\2\u0346\u0091\3\2\2\2\u0347"+
		"\u0348\5\u0094K\2\u0348\u0349\5\u00a0Q\2\u0349\u034a\5\u00a8U\2\u034a"+
		"\u034b\5\u0096L\2\u034b\u0093\3\2\2\2\u034c\u034d\7Y\2\2\u034d\u0095\3"+
		"\2\2\2\u034e\u034f\7Z\2\2\u034f\u0097\3\2\2\2\u0350\u0351\5\u009aN\2\u0351"+
		"\u0352\5\34\17\2\u0352\u0353\5\u009cO\2\u0353\u0354\5\u01bc\u00df\2\u0354"+
		"\u0355\5\u009eP\2\u0355\u0099\3\2\2\2\u0356\u0357\7A\2\2\u0357\u009b\3"+
		"\2\2\2\u0358\u0359\7\26\2\2\u0359\u009d\3\2\2\2\u035a\u035b\7B\2\2\u035b"+
		"\u009f\3\2\2\2\u035c\u035d\bQ\1\2\u035d\u035e\5\u00a4S\2\u035e\u0365\3"+
		"\2\2\2\u035f\u0360\f\3\2\2\u0360\u0361\5\u00a2R\2\u0361\u0362\5\u00a4"+
		"S\2\u0362\u0364\3\2\2\2\u0363\u035f\3\2\2\2\u0364\u0367\3\2\2\2\u0365"+
		"\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u00a1\3\2\2\2\u0367\u0365\3\2"+
		"\2\2\u0368\u0369\7\27\2\2\u0369\u00a3\3\2\2\2\u036a\u036b\5\u0130\u0099"+
		"\2\u036b\u036c\7@\2\2\u036c\u036d\5\u01bc\u00df\2\u036d\u0373\3\2\2\2"+
		"\u036e\u036f\5\u0130\u0099\2\u036f\u0370\5\u00a6T\2\u0370\u0371\5\u01bc"+
		"\u00df\2\u0371\u0373\3\2\2\2\u0372\u036a\3\2\2\2\u0372\u036e\3\2\2\2\u0373"+
		"\u00a5\3\2\2\2\u0374\u0375\7\26\2\2\u0375\u00a7\3\2\2\2\u0376\u037c\5"+
		"\u01ca\u00e6\2\u0377\u0378\7\27\2\2\u0378\u0379\7V\2\2\u0379\u037a\7\26"+
		"\2\2\u037a\u037c\5\u01bc\u00df\2\u037b\u0376\3\2\2\2\u037b\u0377\3\2\2"+
		"\2\u037c\u00a9\3\2\2\2\u037d\u037e\5\u00acW\2\u037e\u037f\5\u00b0Y\2\u037f"+
		"\u0380\5\u00aeX\2\u0380\u00ab\3\2\2\2\u0381\u0382\7\20\2\2\u0382\u00ad"+
		"\3\2\2\2\u0383\u0384\7\21\2\2\u0384\u00af\3\2\2\2\u0385\u0388\5\u01ca"+
		"\u00e6\2\u0386\u0388\5\u00b2Z\2\u0387\u0385\3\2\2\2\u0387\u0386\3\2\2"+
		"\2\u0388\u00b1\3\2\2\2\u0389\u038a\bZ\1\2\u038a\u038b\5\u0130\u0099\2"+
		"\u038b\u0391\3\2\2\2\u038c\u038d\f\3\2\2\u038d\u038e\7\22\2\2\u038e\u0390"+
		"\5\u0130\u0099\2\u038f\u038c\3\2\2\2\u0390\u0393\3\2\2\2\u0391\u038f\3"+
		"\2\2\2\u0391\u0392\3\2\2\2\u0392\u00b3\3\2\2\2\u0393\u0391\3\2\2\2\u0394"+
		"\u0395\5\u00b6\\\2\u0395\u00b5\3\2\2\2\u0396\u0397\7\20\2\2\u0397\u0398"+
		"\5\u00b8]\2\u0398\u0399\7\21\2\2\u0399\u00b7\3\2\2\2\u039a\u039d\5\u01ca"+
		"\u00e6\2\u039b\u039d\5\u00ba^\2\u039c\u039a\3\2\2\2\u039c\u039b\3\2\2"+
		"\2\u039d\u00b9\3\2\2\2\u039e\u03a7\5\u00bc_\2\u039f\u03a0\5\u00bc_\2\u03a0"+
		"\u03a1\7\13\2\2\u03a1\u03a7\3\2\2\2\u03a2\u03a3\5\u00bc_\2\u03a3\u03a4"+
		"\7\13\2\2\u03a4\u03a5\5\u00ba^\2\u03a5\u03a7\3\2\2\2\u03a6\u039e\3\2\2"+
		"\2\u03a6\u039f\3\2\2\2\u03a6\u03a2\3\2\2\2\u03a7\u00bb\3\2\2\2\u03a8\u03a9"+
		"\5\u0104\u0083\2\u03a9\u03aa\5\u00e4s\2\u03aa\u03b1\3\2\2\2\u03ab\u03ac"+
		"\5\u0104\u0083\2\u03ac\u03ad\5\u011e\u0090\2\u03ad\u03ae\5\u00be`\2\u03ae"+
		"\u03af\5\u00e4s\2\u03af\u03b1\3\2\2\2\u03b0\u03a8\3\2\2\2\u03b0\u03ab"+
		"\3\2\2\2\u03b1\u00bd\3\2\2\2\u03b2\u03b3\7\24\2\2\u03b3\u00bf\3\2\2\2"+
		"\u03b4\u03b7\5\u00c8e\2\u03b5\u03b7\5\u00c4c\2\u03b6\u03b4\3\2\2\2\u03b6"+
		"\u03b5\3\2\2\2\u03b7\u00c1\3\2\2\2\u03b8\u03b9\7v\2\2\u03b9\u03ba\5\u00c6"+
		"d\2\u03ba\u00c3\3\2\2\2\u03bb\u03bc\7w\2\2\u03bc\u03bd\5\u00c6d\2\u03bd"+
		"\u00c5\3\2\2\2\u03be\u03bf\bd\1\2\u03bf\u03c0\7\u0086\2\2\u03c0\u03c6"+
		"\3\2\2\2\u03c1\u03c2\f\3\2\2\u03c2\u03c3\7\22\2\2\u03c3\u03c5\7\u0086"+
		"\2\2\u03c4\u03c1\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6"+
		"\u03c7\3\2\2\2\u03c7\u00c7\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9\u03cf\5\u00ca"+
		"f\2\u03ca\u03cf\5\u010a\u0086\2\u03cb\u03cf\5\u00d8m\2\u03cc\u03cf\5\u00da"+
		"n\2\u03cd\u03cf\5\u00ceh\2\u03ce\u03c9\3\2\2\2\u03ce\u03ca\3\2\2\2\u03ce"+
		"\u03cb\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cd\3\2\2\2\u03cf\u00c9\3\2"+
		"\2\2\u03d0\u03d1\7j\2\2\u03d1\u03d2\7\u0086\2\2\u03d2\u03d3\7\25\2\2\u03d3"+
		"\u03d4\5\u00e4s\2\u03d4\u03d5\5\u00ccg\2\u03d5\u00cb\3\2\2\2\u03d6\u03db"+
		"\5\u01ca\u00e6\2\u03d7\u03d8\7\16\2\2\u03d8\u03d9\7\u0086\2\2\u03d9\u03db"+
		"\7\17\2\2\u03da\u03d6\3\2\2\2\u03da\u03d7\3\2\2\2\u03db\u00cd\3\2\2\2"+
		"\u03dc\u03dd\5\u00d6l\2\u03dd\u03de\5\u00d0i\2\u03de\u00cf\3\2\2\2\u03df"+
		"\u03e0\bi\1\2\u03e0\u03e1\5\u00d2j\2\u03e1\u03e7\3\2\2\2\u03e2\u03e3\f"+
		"\3\2\2\u03e3\u03e4\7\22\2\2\u03e4\u03e6\5\u00d2j\2\u03e5\u03e2\3\2\2\2"+
		"\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u00d1"+
		"\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03eb\5\u011e\u0090\2\u03eb\u03ec\5"+
		"\u01a2\u00d2\2\u03ec\u03f2\3\2\2\2\u03ed\u03ee\5\u011e\u0090\2\u03ee\u03ef"+
		"\5\u00d4k\2\u03ef\u03f0\5\u00f2z\2\u03f0\u03f2\3\2\2\2\u03f1\u03ea\3\2"+
		"\2\2\u03f1\u03ed\3\2\2\2\u03f2\u00d3\3\2\2\2\u03f3\u03f6\5\u01ca\u00e6"+
		"\2\u03f4\u03f6\7\24\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f4\3\2\2\2\u03f6"+
		"\u00d5\3\2\2\2\u03f7\u03f8\t\2\2\2\u03f8\u00d7\3\2\2\2\u03f9\u03fa\78"+
		"\2\2\u03fa\u03fb\7\u0086\2\2\u03fb\u03fc\5\u00e2r\2\u03fc\u03fd\5\u01a2"+
		"\u00d2\2\u03fd\u00d9\3\2\2\2\u03fe\u03ff\7L\2\2\u03ff\u0400\5\u00dco\2"+
		"\u0400\u00db\3\2\2\2\u0401\u0402\bo\1\2\u0402\u0403\5\u00dep\2\u0403\u0409"+
		"\3\2\2\2\u0404\u0405\f\3\2\2\u0405\u0406\7\22\2\2\u0406\u0408\5\u00de"+
		"p\2\u0407\u0404\3\2\2\2\u0408\u040b\3\2\2\2\u0409\u0407\3\2\2\2\u0409"+
		"\u040a\3\2\2\2\u040a\u00dd\3\2\2\2\u040b\u0409\3\2\2\2\u040c\u040d\5\u0120"+
		"\u0091\2\u040d\u040e\5\u01a0\u00d1\2\u040e\u040f\5\u00e0q\2\u040f\u00df"+
		"\3\2\2\2\u0410\u0414\5\u01ca\u00e6\2\u0411\u0412\7\n\2\2\u0412\u0414\5"+
		"\u0130\u0099\2\u0413\u0410\3\2\2\2\u0413\u0411\3\2\2\2\u0414\u00e1\3\2"+
		"\2\2\u0415\u0418\5\u01ca\u00e6\2\u0416\u0418\7\25\2\2\u0417\u0415\3\2"+
		"\2\2\u0417\u0416\3\2\2\2\u0418\u00e3\3\2\2\2\u0419\u041a\5\u01ac\u00d7"+
		"\2\u041a\u041b\5\u00e6t\2\u041b\u041f\3\2\2\2\u041c\u041f\5\u00e6t\2\u041d"+
		"\u041f\5R*\2\u041e\u0419\3\2\2\2\u041e\u041c\3\2\2\2\u041e\u041d\3\2\2"+
		"\2\u041f\u00e5\3\2\2\2\u0420\u0429\5\u00f4{\2\u0421\u0429\5\u0106\u0084"+
		"\2\u0422\u0429\5\u010c\u0087\2\u0423\u0429\5\u00e8u\2\u0424\u0429\5\u00ec"+
		"w\2\u0425\u0429\5\u00eav\2\u0426\u0429\5\u00eex\2\u0427\u0429\5\u00f2"+
		"z\2\u0428\u0420\3\2\2\2\u0428\u0421\3\2\2\2\u0428\u0422\3\2\2\2\u0428"+
		"\u0423\3\2\2\2\u0428\u0424\3\2\2\2\u0428\u0425\3\2\2\2\u0428\u0426\3\2"+
		"\2\2\u0428\u0427\3\2\2\2\u0429\u00e7\3\2\2\2\u042a\u042b\7\177\2\2\u042b"+
		"\u042f\5\u00e4s\2\u042c\u042d\7\177\2\2\u042d\u042f\7\u0082\2\2\u042e"+
		"\u042a\3\2\2\2\u042e\u042c\3\2\2\2\u042f\u00e9\3\2\2\2\u0430\u0431\7\u0081"+
		"\2\2\u0431\u0432\7\20\2\2\u0432\u0433\5\u0100\u0081\2\u0433\u0434\7\21"+
		"\2\2\u0434\u00eb\3\2\2\2\u0435\u0436\7\u0080\2\2\u0436\u0437\7\20\2\2"+
		"\u0437\u0438\5\u0100\u0081\2\u0438\u0439\7\21\2\2\u0439\u00ed\3\2\2\2"+
		"\u043a\u043b\7\u0083\2\2\u043b\u043c\5\u00f0y\2\u043c\u00ef\3\2\2\2\u043d"+
		"\u0443\5\u00f2z\2\u043e\u0443\5\u01a2\u00d2\2\u043f\u0440\7L\2\2\u0440"+
		"\u0443\5\u01a0\u00d1\2\u0441\u0443\7|\2\2\u0442\u043d\3\2\2\2\u0442\u043e"+
		"\3\2\2\2\u0442\u043f\3\2\2\2\u0442\u0441\3\2\2\2\u0443\u00f1\3\2\2\2\u0444"+
		"\u0449\7\u0086\2\2\u0445\u0446\7\u0086\2\2\u0446\u0447\7\6\2\2\u0447\u0449"+
		"\7\u0086\2\2\u0448\u0444\3\2\2\2\u0448\u0445\3\2\2\2\u0449\u00f3\3\2\2"+
		"\2\u044a\u0450\5\u00f6|\2\u044b\u0450\5\u00f8}\2\u044c\u0450\5\u00fa~"+
		"\2\u044d\u0450\5\u00fc\177\2\u044e\u0450\5\u00fe\u0080\2\u044f\u044a\3"+
		"\2\2\2\u044f\u044b\3\2\2\2\u044f\u044c\3\2\2\2\u044f\u044d\3\2\2\2\u044f"+
		"\u044e\3\2\2\2\u0450\u00f5\3\2\2\2\u0451\u0452\7q\2\2\u0452\u00f7\3\2"+
		"\2\2\u0453\u0454\7p\2\2\u0454\u00f9\3\2\2\2\u0455\u0456\7r\2\2\u0456\u00fb"+
		"\3\2\2\2\u0457\u0458\7t\2\2\u0458\u00fd\3\2\2\2\u0459\u045a\7s\2\2\u045a"+
		"\u00ff\3\2\2\2\u045b\u0464\5\u0102\u0082\2\u045c\u045d\5\u0102\u0082\2"+
		"\u045d\u045e\7\13\2\2\u045e\u045f\5\u0100\u0081\2\u045f\u0464\3\2\2\2"+
		"\u0460\u0461\5\u0102\u0082\2\u0461\u0462\7\13\2\2\u0462\u0464\3\2\2\2"+
		"\u0463\u045b\3\2\2\2\u0463\u045c\3\2\2\2\u0463\u0460\3\2\2\2\u0464\u0101"+
		"\3\2\2\2\u0465\u0466\5\u0114\u008b\2\u0466\u0103\3\2\2\2\u0467\u046d\5"+
		"\u01ca\u00e6\2\u0468\u046d\7k\2\2\u0469\u046d\7l\2\2\u046a\u046d\7m\2"+
		"\2\u046b\u046d\7n\2\2\u046c\u0467\3\2\2\2\u046c\u0468\3\2\2\2\u046c\u0469"+
		"\3\2\2\2\u046c\u046a\3\2\2\2\u046c\u046b\3\2\2\2\u046d\u0105\3\2\2\2\u046e"+
		"\u046f\7u\2\2\u046f\u0470\7\f\2\2\u0470\u0471\5\u0108\u0085\2\u0471\u0472"+
		"\7\r\2\2\u0472\u0479\3\2\2\2\u0473\u0474\7u\2\2\u0474\u0475\7\20\2\2\u0475"+
		"\u0476\5\u0108\u0085\2\u0476\u0477\7\21\2\2\u0477\u0479\3\2\2\2\u0478"+
		"\u046e\3\2\2\2\u0478\u0473\3\2\2\2\u0479\u0107\3\2\2\2\u047a\u047d\5\u0130"+
		"\u0099\2\u047b\u047d\7\23\2\2\u047c\u047a\3\2\2\2\u047c\u047b\3\2\2\2"+
		"\u047d\u0109\3\2\2\2\u047e\u047f\5\u010e\u0088\2\u047f\u0480\5\u0114\u008b"+
		"\2\u0480\u010b\3\2\2\2\u0481\u0482\7y\2\2\u0482\u0483\7\20\2\2\u0483\u0484"+
		"\5\u0124\u0093\2\u0484\u0485\7\21\2\2\u0485\u010d\3\2\2\2\u0486\u0489"+
		"\5\u0110\u0089\2\u0487\u0489\5\u0112\u008a\2\u0488\u0486\3\2\2\2\u0488"+
		"\u0487\3\2\2\2\u0489\u010f\3\2\2\2\u048a\u048b\7l\2\2\u048b\u0111\3\2"+
		"\2\2\u048c\u048d\7x\2\2\u048d\u0113\3\2\2\2\u048e\u048f\b\u008b\1\2\u048f"+
		"\u0490\5\u0116\u008c\2\u0490\u0496\3\2\2\2\u0491\u0492\f\3\2\2\u0492\u0493"+
		"\7\22\2\2\u0493\u0495\5\u0116\u008c\2\u0494\u0491\3\2\2\2\u0495\u0498"+
		"\3\2\2\2\u0496\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0115\3\2\2\2\u0498"+
		"\u0496\3\2\2\2\u0499\u049a\5\u011e\u0090\2\u049a\u049b\5\u0118\u008d\2"+
		"\u049b\u0117\3\2\2\2\u049c\u04a5\5\u011c\u008f\2\u049d\u049e\7\24\2\2"+
		"\u049e\u049f\5\u00e4s\2\u049f\u04a0\7\n\2\2\u04a0\u04a1\5\u0130\u0099"+
		"\2\u04a1\u04a5\3\2\2\2\u04a2\u04a5\5\u011a\u008e\2\u04a3\u04a5\7\13\2"+
		"\2\u04a4\u049c\3\2\2\2\u04a4\u049d\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a4\u04a3"+
		"\3\2\2\2\u04a5\u0119\3\2\2\2\u04a6\u04a7\7\n\2\2\u04a7\u04a8\5\u0130\u0099"+
		"\2\u04a8\u011b\3\2\2\2\u04a9\u04aa\7\24\2\2\u04aa\u04ab\5\u00e4s\2\u04ab"+
		"\u011d\3\2\2\2\u04ac\u04ad\b\u0090\1\2\u04ad\u04ae\5\u0120\u0091\2\u04ae"+
		"\u04b4\3\2\2\2\u04af\u04b0\f\3\2\2\u04b0\u04b1\7\22\2\2\u04b1\u04b3\5"+
		"\u0120\u0091\2\u04b2\u04af\3\2\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2\3\2"+
		"\2\2\u04b4\u04b5\3\2\2\2\u04b5\u011f\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7"+
		"\u04bb\5\u0122\u0092\2\u04b8\u04b9\7\u0086\2\2\u04b9\u04bb\5\u01ac\u00d7"+
		"\2\u04ba\u04b7\3\2\2\2\u04ba\u04b8\3\2\2\2\u04bb\u0121\3\2\2\2\u04bc\u04bd"+
		"\7\u0086\2\2\u04bd\u0123\3\2\2\2\u04be\u04bf\b\u0093\1\2\u04bf\u04c0\7"+
		"\u0086\2\2\u04c0\u04c6\3\2\2\2\u04c1\u04c2\f\3\2\2\u04c2\u04c3\7\22\2"+
		"\2\u04c3\u04c5\7\u0086\2\2\u04c4\u04c1\3\2\2\2\u04c5\u04c8\3\2\2\2\u04c6"+
		"\u04c4\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u0125\3\2\2\2\u04c8\u04c6\3\2"+
		"\2\2\u04c9\u04ca\7[\2\2\u04ca\u0127\3\2\2\2\u04cb\u04cc\7\\\2\2\u04cc"+
		"\u0129\3\2\2\2\u04cd\u04ce\7]\2\2\u04ce\u012b\3\2\2\2\u04cf\u04d0\7^\2"+
		"\2\u04d0\u012d\3\2\2\2\u04d1\u04d2\7_\2\2\u04d2\u012f\3\2\2\2\u04d3\u04d4"+
		"\b\u0099\1\2\u04d4\u04e2\5\u0134\u009b\2\u04d5\u04e2\5\u0132\u009a\2\u04d6"+
		"\u04e2\5\u0136\u009c\2\u04d7\u04e2\5\u018a\u00c6\2\u04d8\u04d9\5\u0194"+
		"\u00cb\2\u04d9\u04da\5\u0130\u0099-\u04da\u04e2\3\2\2\2\u04db\u04dc\5"+
		"\u0138\u009d\2\u04dc\u04dd\5\u0196\u00cc\2\u04dd\u04de\5\u013a\u009e\2"+
		"\u04de\u04e2\3\2\2\2\u04df\u04e2\5\u019a\u00ce\2\u04e0\u04e2\5\u018c\u00c7"+
		"\2\u04e1\u04d3\3\2\2\2\u04e1\u04d5\3\2\2\2\u04e1\u04d6\3\2\2\2\u04e1\u04d7"+
		"\3\2\2\2\u04e1\u04d8\3\2\2\2\u04e1\u04db\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1"+
		"\u04e0\3\2\2\2\u04e2\u057f\3\2\2\2\u04e3\u04e4\f%\2\2\u04e4\u04e5\5\u0148"+
		"\u00a5\2\u04e5\u04e6\5\u0130\u0099&\u04e6\u057e\3\2\2\2\u04e7\u04e8\f"+
		"$\2\2\u04e8\u04e9\5\u014a\u00a6\2\u04e9\u04ea\5\u0130\u0099%\u04ea\u057e"+
		"\3\2\2\2\u04eb\u04ec\f\"\2\2\u04ec\u04ed\5\u014c\u00a7\2\u04ed\u04ee\5"+
		"\u0130\u0099#\u04ee\u057e\3\2\2\2\u04ef\u04f0\f!\2\2\u04f0\u04f1\5\u014e"+
		"\u00a8\2\u04f1\u04f2\5\u0130\u0099\"\u04f2\u057e\3\2\2\2\u04f3\u04f4\f"+
		" \2\2\u04f4\u04f5\5\u0150\u00a9\2\u04f5\u04f6\5\u0130\u0099!\u04f6\u057e"+
		"\3\2\2\2\u04f7\u04f8\f\37\2\2\u04f8\u04f9\5\u0152\u00aa\2\u04f9\u04fa"+
		"\5\u0130\u0099 \u04fa\u057e\3\2\2\2\u04fb\u04fc\f\36\2\2\u04fc\u04fd\5"+
		"\u0154\u00ab\2\u04fd\u04fe\5\u0130\u0099\37\u04fe\u057e\3\2\2\2\u04ff"+
		"\u0500\f\35\2\2\u0500\u0501\5\u0156\u00ac\2\u0501\u0502\5\u0130\u0099"+
		"\36\u0502\u057e\3\2\2\2\u0503\u0504\f\34\2\2\u0504\u0505\5\u0158\u00ad"+
		"\2\u0505\u0506\5\u0130\u0099\35\u0506\u057e\3\2\2\2\u0507\u0508\f\33\2"+
		"\2\u0508\u0509\5\u015a\u00ae\2\u0509\u050a\5\u0130\u0099\34\u050a\u057e"+
		"\3\2\2\2\u050b\u050c\f\32\2\2\u050c\u050d\5\u015c\u00af\2\u050d\u050e"+
		"\5\u0130\u0099\33\u050e\u057e\3\2\2\2\u050f\u0510\f\31\2\2\u0510\u0511"+
		"\5\u015e\u00b0\2\u0511\u0512\5\u0130\u0099\32\u0512\u057e\3\2\2\2\u0513"+
		"\u0514\f\30\2\2\u0514\u0515\5\u0160\u00b1\2\u0515\u0516\5\u0130\u0099"+
		"\31\u0516\u057e\3\2\2\2\u0517\u0518\f\27\2\2\u0518\u0519\5\u0162\u00b2"+
		"\2\u0519\u051a\5\u0130\u0099\30\u051a\u057e\3\2\2\2\u051b\u051c\f\26\2"+
		"\2\u051c\u051d\5\u0164\u00b3\2\u051d\u051e\5\u0130\u0099\27\u051e\u057e"+
		"\3\2\2\2\u051f\u0520\f\25\2\2\u0520\u0521\5\u0166\u00b4\2\u0521\u0522"+
		"\5\u0130\u0099\26\u0522\u057e\3\2\2\2\u0523\u0524\f\24\2\2\u0524\u0525"+
		"\5\u0168\u00b5\2\u0525\u0526\5\u0130\u0099\25\u0526\u057e\3\2\2\2\u0527"+
		"\u0528\f\23\2\2\u0528\u0529\5\u016a\u00b6\2\u0529\u052a\5\u0130\u0099"+
		"\24\u052a\u057e\3\2\2\2\u052b\u052c\f\22\2\2\u052c\u052d\5\u016c\u00b7"+
		"\2\u052d\u052e\5\u0130\u0099\23\u052e\u057e\3\2\2\2\u052f\u0530\f\21\2"+
		"\2\u0530\u0531\5\u016e\u00b8\2\u0531\u0532\5\u0130\u0099\22\u0532\u057e"+
		"\3\2\2\2\u0533\u0534\f\20\2\2\u0534\u0535\5\u0170\u00b9\2\u0535\u0536"+
		"\5\u0130\u0099\21\u0536\u057e\3\2\2\2\u0537\u0538\f\17\2\2\u0538\u0539"+
		"\5\u0172\u00ba\2\u0539\u053a\5\u0130\u0099\20\u053a\u057e\3\2\2\2\u053b"+
		"\u053c\f\16\2\2\u053c\u053d\5\u0174\u00bb\2\u053d\u053e\5\u0130\u0099"+
		"\17\u053e\u057e\3\2\2\2\u053f\u0540\f\r\2\2\u0540\u0541\5\u0176\u00bc"+
		"\2\u0541\u0542\5\u0130\u0099\16\u0542\u057e\3\2\2\2\u0543\u0544\f\f\2"+
		"\2\u0544\u0545\5\u0178\u00bd\2\u0545\u0546\5\u0130\u0099\r\u0546\u057e"+
		"\3\2\2\2\u0547\u0548\f\13\2\2\u0548\u0549\5\u017a\u00be\2\u0549\u054a"+
		"\5\u0130\u0099\f\u054a\u057e\3\2\2\2\u054b\u054c\f\n\2\2\u054c\u054d\5"+
		"\u017c\u00bf\2\u054d\u054e\5\u0130\u0099\13\u054e\u057e\3\2\2\2\u054f"+
		"\u0550\f\t\2\2\u0550\u0551\5\u017e\u00c0\2\u0551\u0552\5\u0130\u0099\n"+
		"\u0552\u057e\3\2\2\2\u0553\u0554\f\b\2\2\u0554\u0555\5\u0180\u00c1\2\u0555"+
		"\u0556\5\u0130\u0099\t\u0556\u057e\3\2\2\2\u0557\u0558\f\7\2\2\u0558\u0559"+
		"\5\u0182\u00c2\2\u0559\u055a\5\u0130\u0099\b\u055a\u057e\3\2\2\2\u055b"+
		"\u055c\f\6\2\2\u055c\u055d\5\u0184\u00c3\2\u055d\u055e\5\u0130\u0099\7"+
		"\u055e\u057e\3\2\2\2\u055f\u0560\f\5\2\2\u0560\u0561\5\u0186\u00c4\2\u0561"+
		"\u0562\5\u0130\u0099\6\u0562\u057e\3\2\2\2\u0563\u0564\f\4\2\2\u0564\u0565"+
		"\5\u0188\u00c5\2\u0565\u0566\5\u0130\u0099\5\u0566\u057e\3\2\2\2\u0567"+
		"\u0568\f.\2\2\u0568\u057e\5\u00aaV\2\u0569\u056a\f*\2\2\u056a\u057e\5"+
		"\u013c\u009f\2\u056b\u056c\f)\2\2\u056c\u057e\5\u013e\u00a0\2\u056d\u056e"+
		"\f(\2\2\u056e\u057e\5\u0140\u00a1\2\u056f\u0570\f\'\2\2\u0570\u0571\5"+
		"\u0142\u00a2\2\u0571\u0572\5\u0134\u009b\2\u0572\u057e\3\2\2\2\u0573\u0574"+
		"\f&\2\2\u0574\u0575\5\u0144\u00a3\2\u0575\u0576\5\u01b0\u00d9\2\u0576"+
		"\u0577\5\u0146\u00a4\2\u0577\u057e\3\2\2\2\u0578\u0579\f#\2\2\u0579\u057a"+
		"\5\u014a\u00a6\2\u057a\u057b\5\u0130\u0099\2\u057b\u057c\5\u0194\u00cb"+
		"\2\u057c\u057e\3\2\2\2\u057d\u04e3\3\2\2\2\u057d\u04e7\3\2\2\2\u057d\u04eb"+
		"\3\2\2\2\u057d\u04ef\3\2\2\2\u057d\u04f3\3\2\2\2\u057d\u04f7\3\2\2\2\u057d"+
		"\u04fb\3\2\2\2\u057d\u04ff\3\2\2\2\u057d\u0503\3\2\2\2\u057d\u0507\3\2"+
		"\2\2\u057d\u050b\3\2\2\2\u057d\u050f\3\2\2\2\u057d\u0513\3\2\2\2\u057d"+
		"\u0517\3\2\2\2\u057d\u051b\3\2\2\2\u057d\u051f\3\2\2\2\u057d\u0523\3\2"+
		"\2\2\u057d\u0527\3\2\2\2\u057d\u052b\3\2\2\2\u057d\u052f\3\2\2\2\u057d"+
		"\u0533\3\2\2\2\u057d\u0537\3\2\2\2\u057d\u053b\3\2\2\2\u057d\u053f\3\2"+
		"\2\2\u057d\u0543\3\2\2\2\u057d\u0547\3\2\2\2\u057d\u054b\3\2\2\2\u057d"+
		"\u054f\3\2\2\2\u057d\u0553\3\2\2\2\u057d\u0557\3\2\2\2\u057d\u055b\3\2"+
		"\2\2\u057d\u055f\3\2\2\2\u057d\u0563\3\2\2\2\u057d\u0567\3\2\2\2\u057d"+
		"\u0569\3\2\2\2\u057d\u056b\3\2\2\2\u057d\u056d\3\2\2\2\u057d\u056f\3\2"+
		"\2\2\u057d\u0573\3\2\2\2\u057d\u0578\3\2\2\2\u057e\u0581\3\2\2\2\u057f"+
		"\u057d\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0131\3\2\2\2\u0581\u057f\3\2"+
		"\2\2\u0582\u0583\7\u0088\2\2\u0583\u0133\3\2\2\2\u0584\u0585\7\u0086\2"+
		"\2\u0585\u0135\3\2\2\2\u0586\u0587\7\u0087\2\2\u0587\u0137\3\2\2\2\u0588"+
		"\u0589\7\20\2\2\u0589\u0139\3\2\2\2\u058a\u058b\7\21\2\2\u058b\u013b\3"+
		"\2\2\2\u058c\u058d\7\7\2\2\u058d\u013d\3\2\2\2\u058e\u058f\7\b\2\2\u058f"+
		"\u013f\3\2\2\2\u0590\u0591\7\t\2\2\u0591\u0141\3\2\2\2\u0592\u0593\7\6"+
		"\2\2\u0593\u0143\3\2\2\2\u0594\u0595\7\f\2\2\u0595\u0145\3\2\2\2\u0596"+
		"\u0597\7\r\2\2\u0597\u0147\3\2\2\2\u0598\u0599\7\30\2\2\u0599\u0149\3"+
		"\2\2\2\u059a\u059b\7\23\2\2\u059b\u014b\3\2\2\2\u059c\u059d\7\31\2\2\u059d"+
		"\u014d\3\2\2\2\u059e\u059f\7\32\2\2\u059f\u014f\3\2\2\2\u05a0\u05a1\7"+
		"\33\2\2\u05a1\u0151\3\2\2\2\u05a2\u05a3\7\34\2\2\u05a3\u0153\3\2\2\2\u05a4"+
		"\u05a5\7\35\2\2\u05a5\u0155\3\2\2\2\u05a6\u05a7\7\36\2\2\u05a7\u0157\3"+
		"\2\2\2\u05a8\u05a9\7\25\2\2\u05a9\u0159\3\2\2\2\u05aa\u05ab\7\37\2\2\u05ab"+
		"\u015b\3\2\2\2\u05ac\u05ad\7 \2\2\u05ad\u015d\3\2\2\2\u05ae\u05af\7!\2"+
		"\2\u05af\u015f\3\2\2\2\u05b0\u05b1\7\"\2\2\u05b1\u0161\3\2\2\2\u05b2\u05b3"+
		"\7#\2\2\u05b3\u0163\3\2\2\2\u05b4\u05b5\7$\2\2\u05b5\u0165\3\2\2\2\u05b6"+
		"\u05b7\7%\2\2\u05b7\u0167\3\2\2\2\u05b8\u05b9\7@\2\2\u05b9\u0169\3\2\2"+
		"\2\u05ba\u05bb\7&\2\2\u05bb\u016b\3\2\2\2\u05bc\u05bd\7\'\2\2\u05bd\u016d"+
		"\3\2\2\2\u05be\u05bf\7(\2\2\u05bf\u016f\3\2\2\2\u05c0\u05c1\7)\2\2\u05c1"+
		"\u0171\3\2\2\2\u05c2\u05c3\7\n\2\2\u05c3\u0173\3\2\2\2\u05c4\u05c5\7*"+
		"\2\2\u05c5\u0175\3\2\2\2\u05c6\u05c7\7+\2\2\u05c7\u0177\3\2\2\2\u05c8"+
		"\u05c9\7,\2\2\u05c9\u0179\3\2\2\2\u05ca\u05cb\7-\2\2\u05cb\u017b\3\2\2"+
		"\2\u05cc\u05cd\7.\2\2\u05cd\u017d\3\2\2\2\u05ce\u05cf\7/\2\2\u05cf\u017f"+
		"\3\2\2\2\u05d0\u05d1\7\60\2\2\u05d1\u0181\3\2\2\2\u05d2\u05d3\7\61\2\2"+
		"\u05d3\u0183\3\2\2\2\u05d4\u05d5\7\62\2\2\u05d5\u0185\3\2\2\2\u05d6\u05d7"+
		"\7\63\2\2\u05d7\u0187\3\2\2\2\u05d8\u05d9\7\64\2\2\u05d9\u0189\3\2\2\2"+
		"\u05da\u05db\t\3\2\2\u05db\u018b\3\2\2\2\u05dc\u05dd\7{\2\2\u05dd\u05de"+
		"\5\u018e\u00c8\2\u05de\u05df\5\u0192\u00ca\2\u05df\u018d\3\2\2\2\u05e0"+
		"\u05e1\5\u0190\u00c9\2\u05e1\u05e2\5\u00aaV\2\u05e2\u018f\3\2\2\2\u05e3"+
		"\u05e4\t\4\2\2\u05e4\u0191\3\2\2\2\u05e5\u05e9\5\u01ca\u00e6\2\u05e6\u05e7"+
		"\7}\2\2\u05e7\u05e9\5\u0130\u0099\2\u05e8\u05e5\3\2\2\2\u05e8\u05e6\3"+
		"\2\2\2\u05e9\u0193\3\2\2\2\u05ea\u05eb\7\20\2\2\u05eb\u05ec\5\u0196\u00cc"+
		"\2\u05ec\u05ed\7\21\2\2\u05ed\u0195\3\2\2\2\u05ee\u05ef\b\u00cc\1\2\u05ef"+
		"\u05f0\5\u0198\u00cd\2\u05f0\u05f6\3\2\2\2\u05f1\u05f2\f\3\2\2\u05f2\u05f3"+
		"\7\22\2\2\u05f3\u05f5\5\u0198\u00cd\2\u05f4\u05f1\3\2\2\2\u05f5\u05f8"+
		"\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u0197\3\2\2\2\u05f8"+
		"\u05f6\3\2\2\2\u05f9\u0600\5\u0130\u0099\2\u05fa\u05fb\7\f\2\2\u05fb\u05fc"+
		"\5\u0130\u0099\2\u05fc\u05fd\7\r\2\2\u05fd\u05fe\5\u0130\u0099\2\u05fe"+
		"\u0600\3\2\2\2\u05ff\u05f9\3\2\2\2\u05ff\u05fa\3\2\2\2\u0600\u0199\3\2"+
		"\2\2\u0601\u0602\7\65\2\2\u0602\u0627\5\u0130\u0099\2\u0603\u0604\7\34"+
		"\2\2\u0604\u0627\5\u0130\u0099\2\u0605\u0606\7\35\2\2\u0606\u0627\5\u0130"+
		"\u0099\2\u0607\u0608\7\66\2\2\u0608\u0627\5\u0130\u0099\2\u0609\u060a"+
		"\7\67\2\2\u060a\u0627\5\u0130\u0099\2\u060b\u060c\7\7\2\2\u060c\u0627"+
		"\5\u0130\u0099\2\u060d\u060e\7\b\2\2\u060e\u0627\5\u0130\u0099\2\u060f"+
		"\u0610\5\u00f4{\2\u0610\u0611\5\u019c\u00cf\2\u0611\u0627\3\2\2\2\u0612"+
		"\u0613\7u\2\2\u0613\u0614\5\u019c\u00cf\2\u0614\u0615\7\65\2\2\u0615\u0627"+
		"\3\2\2\2\u0616\u0617\7I\2\2\u0617\u0618\7\20\2\2\u0618\u0619\5\u00e4s"+
		"\2\u0619\u061a\7\21\2\2\u061a\u0627\3\2\2\2\u061b\u061c\7J\2\2\u061c\u061d"+
		"\7\20\2\2\u061d\u061e\5\u00e4s\2\u061e\u061f\7\21\2\2\u061f\u0627\3\2"+
		"\2\2\u0620\u0621\7K\2\2\u0621\u0622\7\20\2\2\u0622\u0623\5\u01aa\u00d6"+
		"\2\u0623\u0624\5\u019e\u00d0\2\u0624\u0625\7\21\2\2\u0625\u0627\3\2\2"+
		"\2\u0626\u0601\3\2\2\2\u0626\u0603\3\2\2\2\u0626\u0605\3\2\2\2\u0626\u0607"+
		"\3\2\2\2\u0626\u0609\3\2\2\2\u0626\u060b\3\2\2\2\u0626\u060d\3\2\2\2\u0626"+
		"\u060f\3\2\2\2\u0626\u0612\3\2\2\2\u0626\u0616\3\2\2\2\u0626\u061b\3\2"+
		"\2\2\u0626\u0620\3\2\2\2\u0627\u019b\3\2\2\2\u0628\u0629\7\20\2\2\u0629"+
		"\u062a\5\u0130\u0099\2\u062a\u062b\7\21\2\2\u062b\u019d\3\2\2\2\u062c"+
		"\u0632\5\u00e6t\2\u062d\u062e\7L\2\2\u062e\u0632\5\u01a0\u00d1\2\u062f"+
		"\u0630\7M\2\2\u0630\u0632\5\u01a2\u00d2\2\u0631\u062c\3\2\2\2\u0631\u062d"+
		"\3\2\2\2\u0631\u062f\3\2\2\2\u0632\u019f\3\2\2\2\u0633\u0634\5\u01ca\u00e6"+
		"\2\u0634\u01a1\3\2\2\2\u0635\u0636\5\u01a6\u00d4\2\u0636\u0637\5\u01a4"+
		"\u00d3\2\u0637\u01a3\3\2\2\2\u0638\u063e\5\u01ca\u00e6\2\u0639\u063a\7"+
		"\16\2\2\u063a\u063b\5\u01b6\u00dc\2\u063b\u063c\7\17\2\2\u063c\u063e\3"+
		"\2\2\2\u063d\u0638\3\2\2\2\u063d\u0639\3\2\2\2\u063e\u01a5\3\2\2\2\u063f"+
		"\u0640\5\u00b6\\\2\u0640\u0641\5\u01a8\u00d5\2\u0641\u01a7\3\2\2\2\u0642"+
		"\u064e\5\u01ca\u00e6\2\u0643\u0644\7z\2\2\u0644\u064e\5\u00e4s\2\u0645"+
		"\u0646\7z\2\2\u0646\u0647\5\u0120\u0091\2\u0647\u0648\7\24\2\2\u0648\u0649"+
		"\5\u00e4s\2\u0649\u064e\3\2\2\2\u064a\u064b\7z\2\2\u064b\u064c\7\u0086"+
		"\2\2\u064c\u064e\7N\2\2\u064d\u0642\3\2\2\2\u064d\u0643\3\2\2\2\u064d"+
		"\u0645\3\2\2\2\u064d\u064a\3\2\2\2\u064e\u01a9\3\2\2\2\u064f\u0652\5\u01ca"+
		"\u00e6\2\u0650\u0652\5\u01ac\u00d7\2\u0651\u064f\3\2\2\2\u0651\u0650\3"+
		"\2\2\2\u0652\u01ab\3\2\2\2\u0653\u0658\5\u01ae\u00d8\2\u0654\u0655\5\u01ae"+
		"\u00d8\2\u0655\u0656\5\u01ac\u00d7\2\u0656\u0658\3\2\2\2\u0657\u0653\3"+
		"\2\2\2\u0657\u0654\3\2\2\2\u0658\u01ad\3\2\2\2\u0659\u065a\7\f\2\2\u065a"+
		"\u065b\5\u01b0\u00d9\2\u065b\u065c\7\r\2\2\u065c\u01af\3\2\2\2\u065d\u065e"+
		"\b\u00d9\1\2\u065e\u065f\5\u01b2\u00da\2\u065f\u0665\3\2\2\2\u0660\u0661"+
		"\f\3\2\2\u0661\u0662\7\22\2\2\u0662\u0664\5\u01b2\u00da\2\u0663\u0660"+
		"\3\2\2\2\u0664\u0667\3\2\2\2\u0665\u0663\3\2\2\2\u0665\u0666\3\2\2\2\u0666"+
		"\u01b1\3\2\2\2\u0667\u0665\3\2\2\2\u0668\u066e\5\u01b4\u00db\2\u0669\u066a"+
		"\5\u01b4\u00db\2\u066a\u066b\7\24\2\2\u066b\u066c\5\u01b4\u00db\2\u066c"+
		"\u066e\3\2\2\2\u066d\u0668\3\2\2\2\u066d\u0669\3\2\2\2\u066e\u01b3\3\2"+
		"\2\2\u066f\u0674\5\u0130\u0099\2\u0670\u0674\7\23\2\2\u0671\u0674\5\u01ca"+
		"\u00e6\2\u0672\u0674\5R*\2\u0673\u066f\3\2\2\2\u0673\u0670\3\2\2\2\u0673"+
		"\u0671\3\2\2\2\u0673\u0672\3\2\2\2\u0674\u01b5\3\2\2\2\u0675\u067e\7b"+
		"\2\2\u0676\u067e\7a\2\2\u0677\u0678\7b\2\2\u0678\u0679\7\22\2\2\u0679"+
		"\u067e\7a\2\2\u067a\u067b\7a\2\2\u067b\u067c\7\22\2\2\u067c\u067e\7b\2"+
		"\2\u067d\u0675\3\2\2\2\u067d\u0676\3\2\2\2\u067d\u0677\3\2\2\2\u067d\u067a"+
		"\3\2\2\2\u067e\u01b7\3\2\2\2\u067f\u0680\7e\2\2\u0680\u0681\5\u01ba\u00de"+
		"\2\u0681\u01b9\3\2\2\2\u0682\u0685\5\u01ca\u00e6\2\u0683\u0685\7\u0086"+
		"\2\2\u0684\u0682\3\2\2\2\u0684\u0683\3\2\2\2\u0685\u01bb\3\2\2\2\u0686"+
		"\u0687\5\u01be\u00e0\2\u0687\u01bd\3\2\2\2\u0688\u0689\5\u01c2\u00e2\2"+
		"\u0689\u068a\5\u01c0\u00e1\2\u068a\u01bf\3\2\2\2\u068b\u068d\7\13\2\2"+
		"\u068c\u068b\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u068f"+
		"\5\u01c2\u00e2\2\u068f\u0690\5\u01c0\u00e1\2\u0690\u0693\3\2\2\2\u0691"+
		"\u0693\5\u01ca\u00e6\2\u0692\u068c\3\2\2\2\u0692\u0691\3\2\2\2\u0693\u01c1"+
		"\3\2\2\2\u0694\u0699\5\u00c8e\2\u0695\u0699\5R*\2\u0696\u0699\5\u01c4"+
		"\u00e3\2\u0697\u0699\5\u00c4c\2\u0698\u0694\3\2\2\2\u0698\u0695\3\2\2"+
		"\2\u0698\u0696\3\2\2\2\u0698\u0697\3\2\2\2\u0699\u01c3\3\2\2\2\u069a\u069b"+
		"\5\u0130\u0099\2\u069b\u01c5\3\2\2\2\u069c\u069f\5\u0124\u0093\2\u069d"+
		"\u069f\5\u01ca\u00e6\2\u069e\u069c\3\2\2\2\u069e\u069d\3\2\2\2\u069f\u01c7"+
		"\3\2\2\2\u06a0\u06a3\7\3\2\2\u06a1\u06a3\5\u01ca\u00e6\2\u06a2\u06a0\3"+
		"\2\2\2\u06a2\u06a1\3\2\2\2\u06a3\u01c9\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5"+
		"\u01cb\3\2\2\2\\\u01d3\u01de\u01e3\u01e8\u020b\u0215\u0228\u0231\u0236"+
		"\u0242\u0248\u024d\u0258\u025c\u0263\u0268\u026a\u0272\u0277\u027e\u0282"+
		"\u028a\u0298\u029c\u02b2\u02dd\u02ee\u02f3\u02fa\u0311\u0320\u0326\u032b"+
		"\u0335\u0365\u0372\u037b\u0387\u0391\u039c\u03a6\u03b0\u03b6\u03c6\u03ce"+
		"\u03da\u03e7\u03f1\u03f5\u0409\u0413\u0417\u041e\u0428\u042e\u0442\u0448"+
		"\u044f\u0463\u046c\u0478\u047c\u0488\u0496\u04a4\u04b4\u04ba\u04c6\u04e1"+
		"\u057d\u057f\u05e8\u05f6\u05ff\u0626\u0631\u063d\u064d\u0651\u0657\u0665"+
		"\u066d\u0673\u067d\u0684\u068c\u0692\u0698\u069e\u06a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}