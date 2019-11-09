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

proc: TK_PROC TK_ID TK_LPAREN falta TK_RPAREN falta block 'end'
    ;


spec_stmt:
	    common_stmt
	|   extend_clause
	//|   body_only
	;

spec_body:
        vacio
	|   TK_BODY TK_ID maybe_params spec_body_comp
	;

spec_body_comp:
        body_stmt_ls end_id
    |   TK_SEPARATE
    ;

maybe_params:
	    comp_params
	|   vacio
	;

spec_stmt_ls:
        spec_stmt
        | spec_stmt_ls TK_SEPARATOR? spec_stmt
    ;

body_stmt_ls:
	    body_stmt
	|   body_stmt_ls TK_SEPARATOR? body_stmt
	;

body_stmt:
	    common_stmt
	|   expr
	|   body_only
	|   extend_clause
	;

separator_optional:
        TK_SEPARATOR
    |   vacio
    ;
body_only:
	    stmt
	|   proc
/*	|   process
	|   procedure
	|   initial_block
	|   final_block
*/
	;

stmt:
	    skip_stmt
	|   stop_stmt
	|   exit_stmt
	|   next_stmt
	|   return_stmt
	|   reply_stmt
	|   function_stmt
	//|   forward_stmt
	//|   send_stmt
	//|   explicit_call
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

function_stmt:
        TK_ID TK_LPAREN bound_lp TK_RPAREN
        ;
stop_stmt:
	    TK_STOP exit_code_opt
	;

exit_code_opt:
	    vacio
	|   TK_LPAREN expr TK_RPAREN
	;
	/*
forward_stmt:
	    TK_FORWARD invocation
	    ;

send_stmt:
	    TK_SEND invocation
	    ;

explicit_call:
	    TK_CALL invocation
    ;
*/
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
/*
invocation:
	    expr paren_list
	    ;

*/
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

expr:
	    TK_ID
	|   NUM
	|   literal
	//|   invocation
	|   constructor
	//|   binary_expr
	|   prefix_expr
	////sufix
    |   expr TK_INCR
    |   expr TK_DECR
    |   expr TK_HAT
    |   expr TK_PERIOD TK_ID
    |   expr TK_LBRACKET bound_lp TK_RBRACKET
	// binary
    |   expr TK_EXPON	expr
    |   expr TK_ASTER	expr
    |   expr TK_DIV		expr
    |   expr TK_MOD		expr
    |   expr TK_REMDR	expr
    |   expr TK_PLUS	expr
    |   expr TK_MINUS	expr
    |   expr TK_CONCAT	expr
    |   expr TK_EQ		expr
    |   expr TK_NE		expr
    |   expr TK_GE		expr
    |   expr TK_LE		expr
    |   expr TK_GT		expr
    |   expr TK_LT		expr
    |   expr TK_AND		expr
    |   expr TK_OR		expr
    |   expr TK_XOR		expr
    |   expr TK_RSHIFT	expr
    |   expr TK_LSHIFT	expr
    |   expr TK_SWAP	expr
    |   expr TK_ASSIGN	expr
    |   expr TK_AUG_PLUS	expr
    |   expr TK_AUG_MINUS	expr
    |   expr TK_AUG_ASTER	expr
    |   expr TK_AUG_DIV	expr
    |   expr TK_AUG_REMDR	expr
    |   expr TK_AUG_EXPON	expr
    |   expr TK_AUG_OR	expr
    |   expr TK_AUG_AND	expr
    |   expr TK_AUG_CONCAT	expr
    |   expr TK_AUG_RSHIFT	expr
    |   expr TK_AUG_LSHIFT	expr
	///
	|   create_expr
	;

literal:
	    TK_ILIT
	|   TK_RLIT
	|   TK_BLIT
	|   TK_CLIT
	|   TK_SLIT
	|   TK_NLIT
	|   TK_FLIT
	;

create_expr:
	    TK_CREATE create_call location_opt
	;

create_call:
	    rsrc_name paren_list
	    ;

rsrc_name:
	    TK_ID				{ $$ = $1; }
	|   TK_VM
	;

location_opt:
	    vacio
	|   TK_ON expr
	;
constructor:
	    TK_LPAREN constr_item_lp TK_RPAREN
	;

constr_item_lp:
	    constr_item
	|   constr_item_lp TK_COMMA constr_item
	;

constr_item:
	    expr
	|   TK_LBRACKET expr TK_RBRACKET expr
	;

prefix_expr:
	    TK_NOT	expr
	|   TK_PLUS	expr
	|   TK_MINUS	expr
	|   TK_ADDR	expr
	|   TK_QMARK expr
	|   TK_INCR expr
	|   TK_DECR expr
	|   basic_type paren_expr
	|   TK_STRING paren_expr  TK_NOT
	|   TK_LOW  TK_LPAREN type TK_RPAREN
	|   TK_HIGH TK_LPAREN type TK_RPAREN
	|   TK_NEW  TK_LPAREN subscripts_opt new_item TK_RPAREN
	;


paren_expr:
	    TK_LPAREN expr TK_RPAREN
	;

new_item:
	    unsub_type
	|   TK_SEM sem_proto
	|   TK_OP op_prototype
	;

sem_proto:
	    vacio
	   ;

op_prototype:
	    prototype op_restriction_opt
	    ;

op_restriction_opt:
	    vacio
	|   TK_LBRACE op_restriction TK_RBRACE
	;

prototype:
	    parameters return_spec_opt
	    ;

return_spec_opt:
	    vacio

	|   TK_RETURNS type
	|   TK_RETURNS id_subs TK_COLON type
	|   TK_RETURNS TK_ID TK_BOGUS
	;

subscripts_opt:
	    vacio
	|   subscripts				{ $$ = $1; }
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
     |  TK_ASTER
     ;

op_restriction:
	    TK_CALL
	|   TK_SEND
	|   TK_CALL TK_COMMA TK_SEND
	|   TK_SEND TK_COMMA TK_CALL
	;

end_id:
	    TK_END id_opt			{ $$ = $2; }
	;

id_opt:
	    vacio
	|   TK_ID
	;

block:
	    block_items
	;

block_items:
	    block_item
	|   block_items TK_SEPARATOR block_item
	;

block_item:
	    vacio
	|   decl
	|   stmt
	|   expr
	|   import_clause
	;

falta: 'falta implementar'
        | vacio ;


vacio: ;

TK_PERIOD: '.';
TK_INCR: '++';
TK_DECR: '--';
TK_HAT: '^';
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
TK_EXPON: '**';
TK_DIV: '/';
TK_MOD: 'mod';
TK_REMDR: '%';
TK_PLUS: '+';
TK_MINUS: '-';
TK_CONCAT: '||';
TK_NE: '!=';
TK_GE: '>=';
TK_LE: '<=';
TK_GT: '>';
TK_LT: '<';
TK_AND: '&';
TK_OR: '|';
TK_XOR: 'xor';
TK_RSHIFT: '>>';
TK_LSHIFT: '<<';
TK_SWAP: ':=:';
TK_AUG_PLUS: '+:=';
TK_AUG_MINUS: '-:=';
TK_AUG_ASTER: '*:=';
TK_AUG_DIV: '/:=';
TK_AUG_REMDR: '%:=';
TK_AUG_EXPON: '**:=';
TK_AUG_OR: '|:=';
TK_AUG_AND: '&:=';
TK_AUG_CONCAT: '||:=';
TK_AUG_RSHIFT: '>>:=';
TK_AUG_LSHIFT: '<<:=';
TK_NOT: '~';
TK_ADDR: '@';
TK_QMARK: '?';

//////////////////////////////////////////

TK_LOW: 'low';
TK_HIGH: 'high';
TK_NEW: 'new';
TK_SEM:'sem';
TK_OP: 'op';
TK_BOGUS: 'bogus';
TK_ILIT: 'ilit';
TK_RLIT: 'rlit';
TK_CLIT: 'Clit';
TK_SLIT: 'Slit';
TK_NLIT: 'nlit';
TK_BLIT: 'blit';
TK_FLIT: 'flit';
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
TK_END: 'end';
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
TK_RETURNS: 'returns';
TK_CREATE: 'create';
TK_VM: 'vm';
TK_ON: 'on';
TK_STOP: 'stop';

TK_ID: [a-zA-Z]+ ;
NUM:[0-9]+;
ESP : [ \t\r\n]+ -> skip ;
LINE_COMMENT: '#' ~[\n]+ -> skip;