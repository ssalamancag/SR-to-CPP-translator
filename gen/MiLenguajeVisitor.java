// Generated from C:/Users/sebastian/Desktop/Estudio/universidad/2019-2/lenguajes/test2/grammar\MiLenguaje.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiLenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiLenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(MiLenguajeParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#componet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponet(MiLenguajeParser.ComponetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(MiLenguajeParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#resource_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_specification(MiLenguajeParser.Resource_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#resource_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_body(MiLenguajeParser.Resource_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(MiLenguajeParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#spec_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_stmt(MiLenguajeParser.Spec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#spec_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_body(MiLenguajeParser.Spec_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#spec_body_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_body_comp(MiLenguajeParser.Spec_body_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#maybe_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaybe_params(MiLenguajeParser.Maybe_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#spec_stmt_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_stmt_ls(MiLenguajeParser.Spec_stmt_lsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#body_stmt_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_stmt_ls(MiLenguajeParser.Body_stmt_lsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_stmt(MiLenguajeParser.Body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#separator_optional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparator_optional(MiLenguajeParser.Separator_optionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#body_only}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_only(MiLenguajeParser.Body_onlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MiLenguajeParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_stmt(MiLenguajeParser.Function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#stop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop_stmt(MiLenguajeParser.Stop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#exit_code_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_code_opt(MiLenguajeParser.Exit_code_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#destroy_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestroy_stmt(MiLenguajeParser.Destroy_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#begin_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end(MiLenguajeParser.Begin_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(MiLenguajeParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#do_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_stmt(MiLenguajeParser.Do_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#guarded_cmd_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuarded_cmd_lp(MiLenguajeParser.Guarded_cmd_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#guarded_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuarded_cmd(MiLenguajeParser.Guarded_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#else_cmd_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_cmd_opt(MiLenguajeParser.Else_cmd_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#paren_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_list(MiLenguajeParser.Paren_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#paren_item_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_item_ls(MiLenguajeParser.Paren_item_lsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_lp(MiLenguajeParser.Expr_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#comp_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_params(MiLenguajeParser.Comp_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(MiLenguajeParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#param_spec_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_spec_ls(MiLenguajeParser.Param_spec_lsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#param_spec_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_spec_lp(MiLenguajeParser.Param_spec_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#param_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_spec(MiLenguajeParser.Param_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#common_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_stmt(MiLenguajeParser.Common_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#extend_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtend_clause(MiLenguajeParser.Extend_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#import_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_clause(MiLenguajeParser.Import_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#import_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_list(MiLenguajeParser.Import_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MiLenguajeParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#type_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_decl(MiLenguajeParser.Type_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#type_restriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_restriction(MiLenguajeParser.Type_restrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiLenguajeParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#unsub_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsub_type(MiLenguajeParser.Unsub_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#basic_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_type(MiLenguajeParser.Basic_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#param_kind_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_kind_opt(MiLenguajeParser.Param_kind_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#string_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_def(MiLenguajeParser.String_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#string_lim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_lim(MiLenguajeParser.String_limContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#obj_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObj_decl(MiLenguajeParser.Obj_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#enum_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_def(MiLenguajeParser.Enum_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#var_or_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_or_const(MiLenguajeParser.Var_or_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#var_def_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def_lp(MiLenguajeParser.Var_def_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(MiLenguajeParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#var_att}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_att(MiLenguajeParser.Var_attContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#id_subs_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_subs_lp(MiLenguajeParser.Id_subs_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#id_subs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_subs(MiLenguajeParser.Id_subsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#id_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_lp(MiLenguajeParser.Id_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#skip_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip_stmt(MiLenguajeParser.Skip_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#exit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stmt(MiLenguajeParser.Exit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#next_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_stmt(MiLenguajeParser.Next_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(MiLenguajeParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#reply_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReply_stmt(MiLenguajeParser.Reply_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MiLenguajeParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MiLenguajeParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#create_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_expr(MiLenguajeParser.Create_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#create_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_call(MiLenguajeParser.Create_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#rsrc_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRsrc_name(MiLenguajeParser.Rsrc_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#location_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation_opt(MiLenguajeParser.Location_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(MiLenguajeParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#constr_item_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_item_lp(MiLenguajeParser.Constr_item_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#constr_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_item(MiLenguajeParser.Constr_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#prefix_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_expr(MiLenguajeParser.Prefix_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#paren_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_expr(MiLenguajeParser.Paren_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#new_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_item(MiLenguajeParser.New_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sem_proto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem_proto(MiLenguajeParser.Sem_protoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#op_prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_prototype(MiLenguajeParser.Op_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#op_restriction_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_restriction_opt(MiLenguajeParser.Op_restriction_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#prototype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrototype(MiLenguajeParser.PrototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#return_spec_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_spec_opt(MiLenguajeParser.Return_spec_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#subscripts_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscripts_opt(MiLenguajeParser.Subscripts_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#subscripts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscripts(MiLenguajeParser.SubscriptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#bracketed_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketed_list(MiLenguajeParser.Bracketed_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#bound_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBound_lp(MiLenguajeParser.Bound_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#bounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBounds(MiLenguajeParser.BoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBound(MiLenguajeParser.BoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#op_restriction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_restriction(MiLenguajeParser.Op_restrictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#end_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_id(MiLenguajeParser.End_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#id_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_opt(MiLenguajeParser.Id_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiLenguajeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#block_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_items(MiLenguajeParser.Block_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item(MiLenguajeParser.Block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#falta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalta(MiLenguajeParser.FaltaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#vacio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacio(MiLenguajeParser.VacioContext ctx);
}