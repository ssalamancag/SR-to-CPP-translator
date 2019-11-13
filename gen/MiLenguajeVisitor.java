// Generated from C:/Users/acer/Google Drive/CESAR/3. UNAL/2. MATERIAS/28. LENGUAJES DE PROGRAMACIÓN/SR-to-CPP-translator/grammar\MiLenguaje.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#comp_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_label(MiLenguajeParser.Comp_labelContext ctx);
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess(MiLenguajeParser.ProcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(MiLenguajeParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#quantifiers_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiers_opt(MiLenguajeParser.Quantifiers_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#quantifier_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier_lp(MiLenguajeParser.Quantifier_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(MiLenguajeParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#quantifier1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier1(MiLenguajeParser.Quantifier1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#quantifier2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier2(MiLenguajeParser.Quantifier2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#quantifier3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier3(MiLenguajeParser.Quantifier3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(MiLenguajeParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#direction1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection1(MiLenguajeParser.Direction1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#direction2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection2(MiLenguajeParser.Direction2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#step_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep_opt(MiLenguajeParser.Step_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#such_that_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuch_that_opt(MiLenguajeParser.Such_that_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#return_spec_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_spec_null(MiLenguajeParser.Return_spec_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#param_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_names(MiLenguajeParser.Param_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#return_name_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_name_opt(MiLenguajeParser.Return_name_optContext ctx);
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#initial_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_block(MiLenguajeParser.Initial_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#final_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_block(MiLenguajeParser.Final_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#final_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinal_opt(MiLenguajeParser.Final_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#initial_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_opt(MiLenguajeParser.Initial_optContext ctx);
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#forward_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward_stmt(MiLenguajeParser.Forward_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#send_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSend_stmt(MiLenguajeParser.Send_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#explicit_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_call(MiLenguajeParser.Explicit_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#v_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitV_stmt(MiLenguajeParser.V_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#input_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_stmt(MiLenguajeParser.Input_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#in_cmd_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_cmd_lp(MiLenguajeParser.In_cmd_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#in_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_cmd(MiLenguajeParser.In_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#in_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_spec(MiLenguajeParser.In_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#in_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_op(MiLenguajeParser.In_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sched_expr_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSched_expr_opt(MiLenguajeParser.Sched_expr_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sync_expr_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSync_expr_opt(MiLenguajeParser.Sync_expr_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#receive_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceive_stmt(MiLenguajeParser.Receive_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#p_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_stmt(MiLenguajeParser.P_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#concurrent_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_stmt(MiLenguajeParser.Concurrent_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#concurrent_cmd_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_cmd_lp(MiLenguajeParser.Concurrent_cmd_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#concurrent_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_cmd(MiLenguajeParser.Concurrent_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#separator_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparator_opt(MiLenguajeParser.Separator_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#concurrent_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcurrent_invocation(MiLenguajeParser.Concurrent_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#post_processing_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_processing_opt(MiLenguajeParser.Post_processing_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(MiLenguajeParser.InvocationContext ctx);
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#for_all_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_all_stmt(MiLenguajeParser.For_all_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#for_all_stmt1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_all_stmt1(MiLenguajeParser.For_all_stmt1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#for_all_stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_all_stmt2(MiLenguajeParser.For_all_stmt2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#for_all_stmt3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_all_stmt3(MiLenguajeParser.For_all_stmt3Context ctx);
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#guarded_cmd1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuarded_cmd1(MiLenguajeParser.Guarded_cmd1Context ctx);
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#op_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_decl(MiLenguajeParser.Op_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#oper_def_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_def_lp(MiLenguajeParser.Oper_def_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#oper_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper_def(MiLenguajeParser.Oper_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#colon_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon_opt(MiLenguajeParser.Colon_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#op_or_ext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_or_ext(MiLenguajeParser.Op_or_extContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#optype_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptype_decl(MiLenguajeParser.Optype_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sem_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem_decl(MiLenguajeParser.Sem_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sem_def_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem_def_lp(MiLenguajeParser.Sem_def_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sem_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem_def(MiLenguajeParser.Sem_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sem_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem_init(MiLenguajeParser.Sem_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#eq_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_opt(MiLenguajeParser.Eq_optContext ctx);
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#pointer_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_def(MiLenguajeParser.Pointer_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#union_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_def(MiLenguajeParser.Union_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#record_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_def(MiLenguajeParser.Record_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#capability_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapability_def(MiLenguajeParser.Capability_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#cap_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCap_for(MiLenguajeParser.Cap_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#qualified_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_id(MiLenguajeParser.Qualified_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#basic_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_type(MiLenguajeParser.Basic_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#basic_type1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_type1(MiLenguajeParser.Basic_type1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#basic_type2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_type2(MiLenguajeParser.Basic_type2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#basic_type3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_type3(MiLenguajeParser.Basic_type3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#basic_type4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_type4(MiLenguajeParser.Basic_type4Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#basic_type5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_type5(MiLenguajeParser.Basic_type5Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#field_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_lp(MiLenguajeParser.Field_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(MiLenguajeParser.FieldContext ctx);
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#var_or_const_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_or_const_var(MiLenguajeParser.Var_or_const_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#var_or_const_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_or_const_const(MiLenguajeParser.Var_or_const_constContext ctx);
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#var_att1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_att1(MiLenguajeParser.Var_att1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#var_att2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_att2(MiLenguajeParser.Var_att2Context ctx);
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#id_subsID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_subsID(MiLenguajeParser.Id_subsIDContext ctx);
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_num(MiLenguajeParser.Expr_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(MiLenguajeParser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(MiLenguajeParser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr3(MiLenguajeParser.Expr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr4(MiLenguajeParser.Expr4Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr5(MiLenguajeParser.Expr5Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr6(MiLenguajeParser.Expr6Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr7(MiLenguajeParser.Expr7Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr8(MiLenguajeParser.Expr8Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr9(MiLenguajeParser.Expr9Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr10}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr10(MiLenguajeParser.Expr10Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr11}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr11(MiLenguajeParser.Expr11Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr12}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr12(MiLenguajeParser.Expr12Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr13}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr13(MiLenguajeParser.Expr13Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr14}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr14(MiLenguajeParser.Expr14Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr15}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr15(MiLenguajeParser.Expr15Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr16}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr16(MiLenguajeParser.Expr16Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr17}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr17(MiLenguajeParser.Expr17Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr18}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr18(MiLenguajeParser.Expr18Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr19}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr19(MiLenguajeParser.Expr19Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr20}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr20(MiLenguajeParser.Expr20Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr21}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr21(MiLenguajeParser.Expr21Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr22}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr22(MiLenguajeParser.Expr22Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr23}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr23(MiLenguajeParser.Expr23Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr24}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr24(MiLenguajeParser.Expr24Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr25}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr25(MiLenguajeParser.Expr25Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr26}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr26(MiLenguajeParser.Expr26Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr27}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr27(MiLenguajeParser.Expr27Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr28}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr28(MiLenguajeParser.Expr28Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr29}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr29(MiLenguajeParser.Expr29Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr30}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr30(MiLenguajeParser.Expr30Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr31}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr31(MiLenguajeParser.Expr31Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr32}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr32(MiLenguajeParser.Expr32Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr33}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr33(MiLenguajeParser.Expr33Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr34}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr34(MiLenguajeParser.Expr34Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr35}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr35(MiLenguajeParser.Expr35Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr36}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr36(MiLenguajeParser.Expr36Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr37}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr37(MiLenguajeParser.Expr37Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr38}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr38(MiLenguajeParser.Expr38Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr39}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr39(MiLenguajeParser.Expr39Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr40}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr40(MiLenguajeParser.Expr40Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr41}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr41(MiLenguajeParser.Expr41Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr42}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr42(MiLenguajeParser.Expr42Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr43}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr43(MiLenguajeParser.Expr43Context ctx);
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#block_items_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_items_(MiLenguajeParser.Block_items_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item(MiLenguajeParser.Block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#id_ls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_ls(MiLenguajeParser.Id_lsContext ctx);
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