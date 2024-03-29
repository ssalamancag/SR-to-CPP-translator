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
        procedure1 procedure2 prototype block end_id
    ;

procedure1 : TK_PROCEDURE;
procedure2 : TK_ID;
procedure3 : end_id;

quantifiers_opt:
	    vacio
	|   TK_LPAREN quantifier_lp TK_RPAREN
	;

quantifier_lp:
	    quantifier
	|   quantifier_lp TK_COMMA quantifier
	;

quantifier:
	    quantifier1 quantifier2 expr direction quantifier3 step_opt such_that_opt
	;

quantifier1: TK_ID;
quantifier2: TK_ASSIGN;
quantifier3: expr;

direction:
	    direction1
	|   direction2
	;

direction1: TK_TO;
direction2: TK_DOWNTO;

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
	    v_stmt1 TK_LPAREN expr TK_RPAREN
	    ;

v_stmt1:
        TK_V
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
	    do_stmt1 guarded_cmd_lp else_cmd_opt do_stmt2
	;

do_stmt1 : TK_DO;
do_stmt2 : TK_OD;

for_all_stmt:
        for_all_stmt1 quantifier_lp for_all_stmt2 block for_all_stmt3
    ;

for_all_stmt1 : TK_FA;
for_all_stmt2 : TK_ARROW;
for_all_stmt3: TK_AF;

guarded_cmd_lp:
	    guarded_cmd
	|   guarded_cmd_lp TK_SQUARE guarded_cmd
	;

guarded_cmd:
	        expr TK_OR_ block
	    |   expr guarded_cmd1 block
	;

guarded_cmd1:  TK_ARROW
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
	|   param_kind_opt id_subs_lp param_spec1 type
	;

param_spec1 : TK_COLON;

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
            basic_type1
        |   basic_type2
        |   basic_type3
        |   basic_type4
        |   basic_type5
        ;

basic_type1 : TK_INT;
basic_type2 : TK_BOOL;
basic_type3 : TK_CHAR;
basic_type4 : TK_FILE;
basic_type5 : TK_REAL;

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
	    expr1
	|   expr_num
	|   expr2
	|   literal
	|   expr paren_list
	|   constructor expr
	|   expr3 constr_item_lp expr4
    //|   binary_expr
	|   prefix_expr
	////sufix
    |   expr expr5
    |   expr expr6
    |   expr expr7
    |   expr expr8 expr1
    |   expr expr9 bound_lp expr10
	// binary
    |   expr expr11	expr
    |   expr expr12	expr
    |   expr expr12	expr constructor
    |   expr expr13	expr
    |   expr expr14	expr
    |   expr expr15	expr
    |   expr expr16	expr
    |   expr expr17	expr
    |   expr expr18	expr
    |   expr expr19	expr
    |   expr expr20	expr
    |   expr expr21	expr
    |   expr expr22	expr
    |   expr expr23	expr
    |   expr expr24	expr
    |   expr expr25	expr
    |   expr expr26	expr
    |   expr expr27	expr
    |   expr expr28	expr
    |   expr expr29	expr
    |   expr expr30	expr
    |   expr expr31	expr
    |   expr expr32	expr
    |   expr expr33	expr
    |   expr expr34	expr
    |   expr expr35	expr
    |   expr expr36	expr
    |   expr expr37	expr
    |   expr expr38	expr
    |   expr expr39	expr
    |   expr expr40	expr
    |   expr expr41	expr
    |   expr expr42	expr
    |   expr expr43	expr
	|   create_expr
	;

expr_num: NUM;

expr1: TK_ID;
expr2: CADENA;
expr3: TK_LPAREN;
expr4: TK_RPAREN;
expr5: TK_INCR;
expr6: TK_DECR;
expr7: TK_HAT;
expr8: TK_PERIOD;
expr9: TK_LBRACKET;
expr10: TK_RBRACKET;
expr11: TK_EXPON;
expr12: TK_ASTER;
expr13: TK_DIV;
expr14: TK_MOD;
expr15: TK_REMDR;
expr16: TK_PLUS;
expr17: TK_MINUS;
expr18: TK_CONCAT;
expr19: TK_EQ;
expr20: TK_NE;
expr21: TK_GE;
expr22: TK_LE;
expr23: TK_GT;
expr24: TK_LT;
expr25: TK_AND;
expr26: TK_OR;
expr27: TK_OR_;
expr28: TK_XOR;
expr29: TK_RSHIFT;
expr30: TK_LSHIFT;
expr31: TK_SWAP;
expr32: TK_ASSIGN;
expr33: TK_AUG_PLUS;
expr34: TK_AUG_MINUS;
expr35: TK_AUG_ASTER;
expr36: TK_AUG_DIV;
expr37: TK_AUG_REMDR;
expr38: TK_AUG_EXPON;
expr39: TK_AUG_OR;
expr40: TK_AUG_AND;
expr41: TK_AUG_CONCAT;
expr42: TK_AUG_RSHIFT;
expr43: TK_AUG_LSHIFT;

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
	|   block_item1
	|   import_clause
	;

block_item1 : expr;

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