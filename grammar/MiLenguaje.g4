grammar MiLenguaje;

inicio: componet ;
componet: global
        | resource_specification
        | resource_body
        | proc
        | block
        ;
global: TK_GLOBAL TK_ID spec_stmt_ls spec_body;

comp_label:
            TK_GLOBAL TK_ID
        |   TK_RESOURCE TK_ID
        ;

resource_specification: TK_RESOURCE TK_ID parameters? spec_stmt_ls spec_body end_id?;

resource_body: spec_body;

proc: TK_PROC TK_ID param_names spec_stmt_ls spec_body end_id
    ;

process:
	    TK_PROCESS TK_ID return_spec_null quantifiers_opt
		block
	    end_id
	;

procedure:
        TK_PROCEDURE TK_ID prototype block end_id
    ;

quantifiers_opt:
	    vacio
	|   TK_LPAREN quantifier_lp TK_RPAREN
	;

quantifier_lp:
	    quantifier
	|   quantifier_lp TK_COMMA quantifier
	;

quantifier:
	    TK_ID TK_ASSIGN expr direction expr step_opt such_that_opt
	;

direction:
	    TK_TO
	|   TK_DOWNTO
	;

step_opt:
	    vacio
	|   TK_BY expr
	;
such_that_opt:
	    vacio
	|   TK_SUCHTHAT expr
	;

return_spec_null:
        vacio
        ;

param_names:
	    TK_LPAREN id_ls TK_RPAREN return_name_opt
	;

return_name_opt:
	    vacio
	|   TK_RETURNS TK_ID
	;

spec_stmt:
	    common_stmt
	|   extend_clause
	|   body_stmt
	|   decl
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
        | spec_stmt_ls spec_stmt
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
	|   process
	|   procedure
	|   initial_block
	|   final_block
	;

initial_block:

	    TK_INITIAL block TK_END initial_opt
	;

final_block:
	    TK_FINAL block TK_END final_opt
	    ;

final_opt:
	    vacio
	|   TK_FINAL
	;

initial_opt:
	    vacio
	|   TK_INITIAL
	;

stmt:
	    skip_stmt
	|   stop_stmt
	|   exit_stmt
	|   next_stmt
	|   return_stmt
	|   reply_stmt
	|   function_stmt
	|   forward_stmt
	|   send_stmt
	|   explicit_call
	|   destroy_stmt
	|   begin_end
	|   if_stmt
	|   do_stmt
	|   for_all_stmt
	|   v_stmt
	|   input_stmt
	|   receive_stmt
	|   p_stmt
	|   concurrent_stmt
	;

function_stmt:
        TK_ID TK_LPAREN bound_lp TK_RPAREN
        ;

stop_stmt:
	    TK_STOP exit_code_opt
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

v_stmt:
	    TK_V TK_LPAREN expr TK_RPAREN
	    ;

input_stmt:
	    TK_IN in_cmd_lp else_cmd_opt TK_NI
	    ;


in_cmd_lp:
	    in_cmd
	|   in_cmd_lp TK_SQUARE in_cmd
	;

in_cmd:
	    quantifiers_opt in_spec sync_expr_opt sched_expr_opt TK_ARROW block
	;

in_spec:
	    in_op param_names
	    ;

in_op:
	    qualified_id
	|   qualified_id subscripts
	;

sched_expr_opt:
	    vacio
	|   TK_BY expr
	;
sync_expr_opt:
	    vacio
	|   TK_AND expr
	|   TK_SUCHTHAT expr
	;

receive_stmt:
	    TK_RECEIVE expr paren_list
	    ;

p_stmt:
	    TK_P TK_LPAREN expr TK_RPAREN
	    ;

concurrent_stmt:
	    TK_CO concurrent_cmd_lp TK_OC
	    ;

concurrent_cmd_lp:
	    concurrent_cmd
	|   concurrent_cmd_lp TK_PARALLEL concurrent_cmd
	;

concurrent_cmd:
	quantifiers_opt separator_opt concurrent_invocation post_processing_opt
	;

separator_opt:
	    vacio
	|   separator_opt TK_SEPARATOR
	;

concurrent_invocation:
	    explicit_call
	|   send_stmt
	|   expr
	;

post_processing_opt:
	    vacio
	|   TK_ARROW block
	;


invocation:
	    expr paren_list
	    ;

exit_code_opt:
	    vacio
	|   TK_LPAREN expr TK_RPAREN
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

for_all_stmt:
        TK_FA quantifier_lp TK_ARROW block TK_AF
    ;
guarded_cmd_lp:
	    guarded_cmd
	|   guarded_cmd_lp TK_SQUARE guarded_cmd
	;

guarded_cmd:
	        expr TK_OR_ block
	    |   expr TK_ARROW block
	;

else_cmd_opt:
	    vacio
	|   TK_SQUARE TK_ELSE TK_ARROW block
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
	|   param_spec TK_SEPARATOR param_spec_lp
	;

param_spec:
	    param_kind_opt type
	|   param_kind_opt id_subs_lp TK_COLON type
	;

common_stmt:
    // vacio |  NO QUITAR ESTE COMENTARIO
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
	|   optype_decl
	|   sem_decl
	|   op_decl
	;

type_decl: TK_TYPE TK_ID TK_EQ type type_restriction
    	    ;
type_restriction:
        vacio
	|   TK_LBRACE TK_ID TK_RBRACE
	;

op_decl:
	    op_or_ext oper_def_lp
	    ;

oper_def_lp:
	    oper_def
	|   oper_def_lp TK_COMMA oper_def
	;

oper_def:
	    id_subs_lp op_prototype
	|   id_subs_lp colon_opt qualified_id
	;

colon_opt:
	    vacio
	|   TK_COLON
	;


op_or_ext:
	    TK_OP
	|   TK_EXTERNAL
	;

optype_decl:
	    TK_OPTYPE TK_ID eq_opt op_prototype
	    ;

sem_decl:
	    TK_SEM sem_def_lp
	    ;

sem_def_lp:
	    sem_def
	|   sem_def_lp TK_COMMA sem_def
	;

sem_def:
	    id_subs sem_proto sem_init
	    ;

sem_init:
	    vacio
	|   TK_ASSIGN expr
	;

eq_opt:
	    vacio
	|   TK_EQ
	;

type:
	    subscripts unsub_type
	|   unsub_type
	|   stmt
	;

unsub_type:
	    basic_type
	|   string_def
	|   enum_def
	|   pointer_def
	|   record_def
	|   union_def
	|   capability_def
	|   qualified_id
	;
pointer_def:
	    TK_PTR type
	|   TK_PTR TK_ANY
	;

union_def:
	    TK_UNION TK_LPAREN field_lp TK_RPAREN
	;

record_def:
	    TK_REC TK_LPAREN field_lp TK_RPAREN
	    ;

capability_def:
	   TK_CAP cap_for
	;

cap_for:
	    qualified_id
	|   op_prototype
	|   TK_SEM sem_proto
	|   TK_VM
	;

qualified_id:
	    TK_ID
	|   TK_ID TK_PERIOD TK_ID
	;

basic_type:
            TK_BOOL
        |   TK_CHAR
        |   basic_type1
        |   TK_FILE
        |   TK_REAL
        ;

basic_type1 : TK_INT;

field_lp:
            field
        |   field TK_SEPARATOR field_lp
        |   field TK_SEPARATOR
        ;

field:
            var_def_lp
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
         var_or_const_var
     |   var_or_const_const
    ;

var_or_const_var: TK_VAR;

var_or_const_const: TK_CONST;

var_def_lp:
        var_def
      | var_def_lp TK_COMMA var_def
      ;

var_def:
        id_subs_lp var_att
        ;

var_att:
	    var_att2
	|   TK_COLON type TK_ASSIGN expr
	|   var_att1
	|   TK_SEPARATOR
	;

var_att1: TK_ASSIGN expr;
var_att2: TK_COLON type;

id_subs_lp:
        id_subs
      | id_subs_lp TK_COMMA id_subs
      ;

id_subs:
            id_subsID
        |   TK_ID subscripts
        ;

id_subsID : TK_ID;

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
	|   expr_num
	|   CADENA
	|   literal
	|   expr paren_list
	|   constructor expr
	|   TK_LPAREN constr_item_lp TK_RPAREN
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
    |   expr TK_ASTER	expr    constructor
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
    |   expr TK_OR_		expr
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
	|   create_expr
	;

expr_num: NUM;

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
	    TK_ID
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
	|   subscripts
	;

subscripts:
	    bracketed_list
	|   bracketed_list subscripts
	;

bracketed_list:
	    TK_LBRACKET bound_lp TK_RBRACKET
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
     |  vacio
     | stmt
     ;

op_restriction:
	    TK_CALL
	|   TK_SEND
	|   TK_CALL TK_COMMA TK_SEND
	|   TK_SEND TK_COMMA TK_CALL
	;

end_id:
	    TK_END id_opt
	;

id_opt:
	    vacio
	|   TK_ID
	;

block:
	    block_items
	;
/*
block_items:
	    block_item
	|   block_items TK_SEPARATOR block_item

	;
*/

block_items:
        block_item block_items_
        ;
block_items_:
        TK_SEPARATOR? block_item block_items_
    |   vacio
    ;
block_item:
	  //  vacio  |
	   decl
	|   stmt
	|   expr
	|   import_clause
	;

id_ls:
        id_lp
    |   vacio
    ;

falta: 'falta implementar'
        | vacio ;


vacio: ;

TK_EXTERNAL: 'external';
TK_PARALLEL: '//';
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
TK_OPTYPE: 'optype';
TK_RECEIVE: 'receive';
TK_P: 'p';
TK_CO: 'co';
TK_OC: 'oc';
TK_V: 'v';
TK_IN: 'in';
TK_NI: 'ni';
TK_OR_: 'or';
TK_FA: 'fa';
TK_AF: 'af';
TK_PROCESS: 'process';
TK_PROCEDURE: 'procedure';
TK_BY: 'by';
TK_TO: 'to';
TK_SUCHTHAT: 'suchthat';
TK_DOWNTO: 'downto';
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
TK_RESOURCE: 'resource';
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
TK_PTR: 'ptr';
TK_REC: 'rec';
TK_UNION: 'union';
TK_ANY: 'any';
TK_CAP: 'cap';
TK_INITIAL: 'initial';
TK_FINAL: 'final';

TK_ID: [a-zA-Z][a-zA-Z0-9_]* ;
CADENA: ('"' .*? '"' | '“' .*? '”' | '\'' .*? '\'');
NUM:( '-'?[0-9]+ | '-'?[0-9]+( | [.][0-9]+) ) ;
ESP : [ \t\r\n]+ -> skip ;
LINE_COMMENT: '#' ~[\n]+ -> skip;