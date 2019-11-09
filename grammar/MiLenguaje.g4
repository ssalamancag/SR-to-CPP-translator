grammar MiLenguaje;

intit_component: componet;
componet: global
        | resource_specification
        | resource_body
        | proc
        | block
        ;
global: TK_GLOBAL TK_ID spec_stmt_ls spec_body;

resource_specification: falta;

resource_body: falta;

proc: TK_PROC ID TK_LPAREN falta TK_RPAREN falta block 'end'
    ;


spec_stmt:
	    common_stmt
	|   extend_clause
	//|   body_only
	;

spec_body:
        vacio
	|   TK_BODY TK_ID maybe_params body_stmt_ls end_id
	|   TK_BODY TK_ID maybe_params TK_SEPARATE
	;

maybe_params:
	    vacio
	|   comp_params
	;

spec_stmt_ls:
        spec_stmt
        | spec_stmt_ls TK_SEPARATOR? spec_stmt
    ;

body_stmt_ls:
	    body_stmt
	|   body_stmt_ls TK_SEPARATOR body_stmt
	;

body_stmt:
	    common_stmt
	|   expr
	|   body_only
	|   extend_clause
	;

body_only:
	    stmt
	|   proc
	|   process
	|   procedure
	|   initial_block
	|   final_block
	;

stmt:
	    skip_stmt
	|   stop_stmt
	|   exit_stmt
	|   next_stmt
	|   return_stmt
	|   reply_stmt
	|   forward_stmt
	|   send_stmt
	|   explicit_call
	|   destroy_stmt
	|   begin_end
	|   if_stmt
	|   do_stmt
	/*|   for_all_stmt
	|   v_stmt
	|   input_stmt
	|   receive_stmt
	|   p_stmt
	|   concurrent_stmt
	*/
	;

stop_stmt:
	    TK_STOP exit_code_opt
	;

exit_code_opt:
	    vacio
	|   TK_LPAREN expr TK_RPAREN
	;
forward_stmt:
	    TK_FORWARD invocation
	    ;

send_stmt:
	    TK_SEND invocation
	    ;

explicit_call:
	    TK_CALL invocation
    ;

destroy_stmt:
	    TK_DESTROY expr
	    ;

begin_end:
	    TK_BEGIN block TK_END
	    ;

if_stmt:
	    TK_IF guarded_cmd_lp else_cmd_opt TK_FI
	    ;

do_stmt:
	    TK_DO guarded_cmd_lp else_cmd_opt TK_OD
	;

guarded_cmd_lp:
	    guarded_cmd
	|   guarded_cmd_lp TK_SQUARE guarded_cmd
	;

guarded_cmd:
	    expr TK_ARROW block
	;

else_cmd_opt:
	    vacio
	|   TK_SQUARE TK_ELSE TK_ARROW block
	;

invocation:
	    expr paren_list
	    ;


paren_list:
	    TK_LPAREN paren_item_ls TK_RPAREN
	    ;

paren_item_ls:
	    vacio
	|   expr_lp
	;

expr_lp:
	    expr
	|   expr_lp TK_COMMA expr
	;

comp_params:
	    parameters
	;

parameters:
	    TK_LPAREN param_spec_ls TK_RPAREN
	;

param_spec_ls:
	    vacio
	|   param_spec_lp
	;

param_spec_lp:
	    param_spec
	|   param_spec TK_SEPARATOR
	|   param_spec TK_SEPARATOR
	;

param_spec:
	    param_kind_opt type
	|   param_kind_opt id_subs_lp TK_COLON type
	;

common_stmt:
    // vacio |
          decl
	|   import_clause
	;

extend_clause:
    TK_EXTEND import_list
    ;

import_clause:
    TK_IMPORT import_list
    ;

import_list:
	    TK_ID
	|   import_list TK_COMMA TK_ID
	;

decl:
	    type_decl
	|   obj_decl
	/*|   optype_decl
	|   sem_decl
	|   op_decl
	*/;

type_decl: TK_TYPE TK_ID TK_EQ type type_restriction
    	    ;
type_restriction:
        vacio
	|   TK_LBRACE TK_ID TK_RBRACE
	;

type:
	    subscripts unsub_type
	|   unsub_type
	;

unsub_type:
	    basic_type
	|   string_def
	|   enum_def
	/*|   pointer_def
	|   record_def
	|   union_def
	|   capability_def
	|   qualified_id*/
	;

basic_type:
	    TK_BOOL
	|   TK_CHAR
	|   TK_INT
	|   TK_FILE
	|   TK_REAL
	;

param_kind_opt:
	    vacio
	|   TK_VAL
	|   TK_VAR
	|   TK_RES
	|   TK_REF
	;

string_def:
	    TK_STRING TK_LBRACKET string_lim TK_RBRACKET
	|   TK_STRING TK_LPAREN string_lim TK_RPAREN
	;

string_lim:
         expr
    |    TK_ASTER
    ;

obj_decl:
	    var_or_const var_def_lp
	;

enum_def:
        TK_ENUM TK_LPAREN id_lp TK_RPAREN
        ;

var_or_const:
         TK_VAR
     |   TK_CONST
    ;

var_def_lp:
        var_def
      | var_def_lp TK_COMMA var_def
      ;

var_def:
        id_subs_lp var_att
        ;

var_att:
	    TK_COLON type
	|   TK_COLON type TK_ASSIGN expr
	|   TK_ASSIGN expr
	|   TK_SEPARATOR
	;

id_subs_lp:
        id_subs
      | id_subs_lp TK_COMMA id_subs
      ;

id_subs:
            TK_ID
        |   TK_ID subscripts
        ;
subscripts:
	    bracketed_list
	|   bracketed_list subscripts
	;

bracketed_list:
	    TK_LBRACKET bound_lp TK_RBRACKET	{ $$ = $2; }
	;
bound_lp:
	    bounds
	|   bound_lp TK_COMMA bounds
	;

bounds:
	    bound
	|   bound TK_COLON bound
	;
bound:
        expr
     |  TK_ASTER;

id_lp:
        TK_ID
    |   id_lp TK_COMMA TK_ID
    ;

skip_stmt:
	    TK_SKIP
	    ;

exit_stmt:
	    TK_EXIT
	    ;

next_stmt:
	    TK_NEXT
	    ;

return_stmt:
	    TK_RETURN
	    ;
reply_stmt:
	    TK_REPLY
	    ;
expr: 'expresion';
block: falta;

falta: 'falta implementar'
        | vacio ;


vacio: ;

TK_ASSIGN: ':=';
TK_SEPARATOR: ';';
TK_LBRACKET: '[';
TK_RBRACKET: ']';
TK_LBRACE: '{';
TK_RBRACE: '}';
TK_LPAREN: '(';
TK_RPAREN: ')';
TK_COMMA: ',';
TK_ASTER: '*';
TK_COLON: ':';
TK_EQ: '=';
TK_ARROW: '->';
TK_SQUARE: '[]';
//////////////////////////////////////////
TK_ELSE: 'else';
TK_IF: 'if';
TK_FI: 'fi';
TK_DO: 'do';
TK_OD: 'od';
TK_SKIP: 'skip';
TK_EXIT: 'exit';
TK_NEXT: 'next';
TK_RETURN: 'return';
TK_REPLY: 'reply';
TK_FORWARD: 'forward';
TK_SEND: 'send';
TK_CALL: 'call';
TK_DESTROY: 'destroy';
TK_BEGIN: 'begin';
TK_END: 'emd';
TK_GLOBAL: 'global';
TK_BODY: 'body';
TK_PROC: 'proc';
TK_TYPE: 'type';
TK_VAL: 'val';
TK_VAR: 'var';
TK_RES: 'res';
TK_REF: 'ref';
TK_SEPARATE: 'separate';
TK_BOOL: 'bool';
TK_INT: 'int';
TK_CHAR: 'char';
TK_REAL: 'real';
TK_FILE: 'file';
TK_STRING: 'string';
TK_EXTEND: 'extend';
TK_IMPORT: 'import';
TK_CONST: 'const';
TK_ENUM: 'enum';

TK_ID: [a-zA-Z]+ ;
ESP : [ \t\r\n]+ -> skip ;
LINE_COMMENT: '#' ~[\n]+ -> skip;