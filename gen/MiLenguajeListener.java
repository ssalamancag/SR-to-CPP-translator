// Generated from C:/Users/sebastian/Desktop/SR-to-CPP-translator/grammar\MiLenguaje.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(MiLenguajeParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(MiLenguajeParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#componet}.
	 * @param ctx the parse tree
	 */
	void enterComponet(MiLenguajeParser.ComponetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#componet}.
	 * @param ctx the parse tree
	 */
	void exitComponet(MiLenguajeParser.ComponetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(MiLenguajeParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(MiLenguajeParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#comp_label}.
	 * @param ctx the parse tree
	 */
	void enterComp_label(MiLenguajeParser.Comp_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#comp_label}.
	 * @param ctx the parse tree
	 */
	void exitComp_label(MiLenguajeParser.Comp_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#resource_specification}.
	 * @param ctx the parse tree
	 */
	void enterResource_specification(MiLenguajeParser.Resource_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#resource_specification}.
	 * @param ctx the parse tree
	 */
	void exitResource_specification(MiLenguajeParser.Resource_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#resource_body}.
	 * @param ctx the parse tree
	 */
	void enterResource_body(MiLenguajeParser.Resource_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#resource_body}.
	 * @param ctx the parse tree
	 */
	void exitResource_body(MiLenguajeParser.Resource_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(MiLenguajeParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(MiLenguajeParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#process}.
	 * @param ctx the parse tree
	 */
	void enterProcess(MiLenguajeParser.ProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#process}.
	 * @param ctx the parse tree
	 */
	void exitProcess(MiLenguajeParser.ProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(MiLenguajeParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(MiLenguajeParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#quantifiers_opt}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiers_opt(MiLenguajeParser.Quantifiers_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#quantifiers_opt}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiers_opt(MiLenguajeParser.Quantifiers_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#quantifier_lp}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier_lp(MiLenguajeParser.Quantifier_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#quantifier_lp}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier_lp(MiLenguajeParser.Quantifier_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(MiLenguajeParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(MiLenguajeParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#quantifier1}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier1(MiLenguajeParser.Quantifier1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#quantifier1}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier1(MiLenguajeParser.Quantifier1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#quantifier2}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier2(MiLenguajeParser.Quantifier2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#quantifier2}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier2(MiLenguajeParser.Quantifier2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#quantifier3}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier3(MiLenguajeParser.Quantifier3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#quantifier3}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier3(MiLenguajeParser.Quantifier3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(MiLenguajeParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(MiLenguajeParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#direction1}.
	 * @param ctx the parse tree
	 */
	void enterDirection1(MiLenguajeParser.Direction1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#direction1}.
	 * @param ctx the parse tree
	 */
	void exitDirection1(MiLenguajeParser.Direction1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#direction2}.
	 * @param ctx the parse tree
	 */
	void enterDirection2(MiLenguajeParser.Direction2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#direction2}.
	 * @param ctx the parse tree
	 */
	void exitDirection2(MiLenguajeParser.Direction2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#step_opt}.
	 * @param ctx the parse tree
	 */
	void enterStep_opt(MiLenguajeParser.Step_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#step_opt}.
	 * @param ctx the parse tree
	 */
	void exitStep_opt(MiLenguajeParser.Step_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#such_that_opt}.
	 * @param ctx the parse tree
	 */
	void enterSuch_that_opt(MiLenguajeParser.Such_that_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#such_that_opt}.
	 * @param ctx the parse tree
	 */
	void exitSuch_that_opt(MiLenguajeParser.Such_that_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#return_spec_null}.
	 * @param ctx the parse tree
	 */
	void enterReturn_spec_null(MiLenguajeParser.Return_spec_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#return_spec_null}.
	 * @param ctx the parse tree
	 */
	void exitReturn_spec_null(MiLenguajeParser.Return_spec_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#param_names}.
	 * @param ctx the parse tree
	 */
	void enterParam_names(MiLenguajeParser.Param_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#param_names}.
	 * @param ctx the parse tree
	 */
	void exitParam_names(MiLenguajeParser.Param_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#return_name_opt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_name_opt(MiLenguajeParser.Return_name_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#return_name_opt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_name_opt(MiLenguajeParser.Return_name_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#spec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSpec_stmt(MiLenguajeParser.Spec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#spec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSpec_stmt(MiLenguajeParser.Spec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#spec_body}.
	 * @param ctx the parse tree
	 */
	void enterSpec_body(MiLenguajeParser.Spec_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#spec_body}.
	 * @param ctx the parse tree
	 */
	void exitSpec_body(MiLenguajeParser.Spec_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#spec_body_comp}.
	 * @param ctx the parse tree
	 */
	void enterSpec_body_comp(MiLenguajeParser.Spec_body_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#spec_body_comp}.
	 * @param ctx the parse tree
	 */
	void exitSpec_body_comp(MiLenguajeParser.Spec_body_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#maybe_params}.
	 * @param ctx the parse tree
	 */
	void enterMaybe_params(MiLenguajeParser.Maybe_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#maybe_params}.
	 * @param ctx the parse tree
	 */
	void exitMaybe_params(MiLenguajeParser.Maybe_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#spec_stmt_ls}.
	 * @param ctx the parse tree
	 */
	void enterSpec_stmt_ls(MiLenguajeParser.Spec_stmt_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#spec_stmt_ls}.
	 * @param ctx the parse tree
	 */
	void exitSpec_stmt_ls(MiLenguajeParser.Spec_stmt_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#body_stmt_ls}.
	 * @param ctx the parse tree
	 */
	void enterBody_stmt_ls(MiLenguajeParser.Body_stmt_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#body_stmt_ls}.
	 * @param ctx the parse tree
	 */
	void exitBody_stmt_ls(MiLenguajeParser.Body_stmt_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBody_stmt(MiLenguajeParser.Body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBody_stmt(MiLenguajeParser.Body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#separator_optional}.
	 * @param ctx the parse tree
	 */
	void enterSeparator_optional(MiLenguajeParser.Separator_optionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#separator_optional}.
	 * @param ctx the parse tree
	 */
	void exitSeparator_optional(MiLenguajeParser.Separator_optionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#body_only}.
	 * @param ctx the parse tree
	 */
	void enterBody_only(MiLenguajeParser.Body_onlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#body_only}.
	 * @param ctx the parse tree
	 */
	void exitBody_only(MiLenguajeParser.Body_onlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#initial_block}.
	 * @param ctx the parse tree
	 */
	void enterInitial_block(MiLenguajeParser.Initial_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#initial_block}.
	 * @param ctx the parse tree
	 */
	void exitInitial_block(MiLenguajeParser.Initial_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#final_block}.
	 * @param ctx the parse tree
	 */
	void enterFinal_block(MiLenguajeParser.Final_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#final_block}.
	 * @param ctx the parse tree
	 */
	void exitFinal_block(MiLenguajeParser.Final_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#final_opt}.
	 * @param ctx the parse tree
	 */
	void enterFinal_opt(MiLenguajeParser.Final_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#final_opt}.
	 * @param ctx the parse tree
	 */
	void exitFinal_opt(MiLenguajeParser.Final_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#initial_opt}.
	 * @param ctx the parse tree
	 */
	void enterInitial_opt(MiLenguajeParser.Initial_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#initial_opt}.
	 * @param ctx the parse tree
	 */
	void exitInitial_opt(MiLenguajeParser.Initial_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MiLenguajeParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MiLenguajeParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunction_stmt(MiLenguajeParser.Function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunction_stmt(MiLenguajeParser.Function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#stop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterStop_stmt(MiLenguajeParser.Stop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#stop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitStop_stmt(MiLenguajeParser.Stop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#forward_stmt}.
	 * @param ctx the parse tree
	 */
	void enterForward_stmt(MiLenguajeParser.Forward_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#forward_stmt}.
	 * @param ctx the parse tree
	 */
	void exitForward_stmt(MiLenguajeParser.Forward_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#send_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSend_stmt(MiLenguajeParser.Send_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#send_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSend_stmt(MiLenguajeParser.Send_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#explicit_call}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_call(MiLenguajeParser.Explicit_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#explicit_call}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_call(MiLenguajeParser.Explicit_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#v_stmt}.
	 * @param ctx the parse tree
	 */
	void enterV_stmt(MiLenguajeParser.V_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#v_stmt}.
	 * @param ctx the parse tree
	 */
	void exitV_stmt(MiLenguajeParser.V_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#v_stmt1}.
	 * @param ctx the parse tree
	 */
	void enterV_stmt1(MiLenguajeParser.V_stmt1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#v_stmt1}.
	 * @param ctx the parse tree
	 */
	void exitV_stmt1(MiLenguajeParser.V_stmt1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput_stmt(MiLenguajeParser.Input_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput_stmt(MiLenguajeParser.Input_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#in_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void enterIn_cmd_lp(MiLenguajeParser.In_cmd_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#in_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void exitIn_cmd_lp(MiLenguajeParser.In_cmd_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#in_cmd}.
	 * @param ctx the parse tree
	 */
	void enterIn_cmd(MiLenguajeParser.In_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#in_cmd}.
	 * @param ctx the parse tree
	 */
	void exitIn_cmd(MiLenguajeParser.In_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#in_spec}.
	 * @param ctx the parse tree
	 */
	void enterIn_spec(MiLenguajeParser.In_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#in_spec}.
	 * @param ctx the parse tree
	 */
	void exitIn_spec(MiLenguajeParser.In_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#in_op}.
	 * @param ctx the parse tree
	 */
	void enterIn_op(MiLenguajeParser.In_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#in_op}.
	 * @param ctx the parse tree
	 */
	void exitIn_op(MiLenguajeParser.In_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sched_expr_opt}.
	 * @param ctx the parse tree
	 */
	void enterSched_expr_opt(MiLenguajeParser.Sched_expr_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sched_expr_opt}.
	 * @param ctx the parse tree
	 */
	void exitSched_expr_opt(MiLenguajeParser.Sched_expr_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sync_expr_opt}.
	 * @param ctx the parse tree
	 */
	void enterSync_expr_opt(MiLenguajeParser.Sync_expr_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sync_expr_opt}.
	 * @param ctx the parse tree
	 */
	void exitSync_expr_opt(MiLenguajeParser.Sync_expr_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#receive_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReceive_stmt(MiLenguajeParser.Receive_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#receive_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReceive_stmt(MiLenguajeParser.Receive_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#p_stmt}.
	 * @param ctx the parse tree
	 */
	void enterP_stmt(MiLenguajeParser.P_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#p_stmt}.
	 * @param ctx the parse tree
	 */
	void exitP_stmt(MiLenguajeParser.P_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#concurrent_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_stmt(MiLenguajeParser.Concurrent_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#concurrent_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_stmt(MiLenguajeParser.Concurrent_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#concurrent_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_cmd_lp(MiLenguajeParser.Concurrent_cmd_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#concurrent_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_cmd_lp(MiLenguajeParser.Concurrent_cmd_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#concurrent_cmd}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_cmd(MiLenguajeParser.Concurrent_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#concurrent_cmd}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_cmd(MiLenguajeParser.Concurrent_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#separator_opt}.
	 * @param ctx the parse tree
	 */
	void enterSeparator_opt(MiLenguajeParser.Separator_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#separator_opt}.
	 * @param ctx the parse tree
	 */
	void exitSeparator_opt(MiLenguajeParser.Separator_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#concurrent_invocation}.
	 * @param ctx the parse tree
	 */
	void enterConcurrent_invocation(MiLenguajeParser.Concurrent_invocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#concurrent_invocation}.
	 * @param ctx the parse tree
	 */
	void exitConcurrent_invocation(MiLenguajeParser.Concurrent_invocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#post_processing_opt}.
	 * @param ctx the parse tree
	 */
	void enterPost_processing_opt(MiLenguajeParser.Post_processing_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#post_processing_opt}.
	 * @param ctx the parse tree
	 */
	void exitPost_processing_opt(MiLenguajeParser.Post_processing_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#invocation}.
	 * @param ctx the parse tree
	 */
	void enterInvocation(MiLenguajeParser.InvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#invocation}.
	 * @param ctx the parse tree
	 */
	void exitInvocation(MiLenguajeParser.InvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#exit_code_opt}.
	 * @param ctx the parse tree
	 */
	void enterExit_code_opt(MiLenguajeParser.Exit_code_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#exit_code_opt}.
	 * @param ctx the parse tree
	 */
	void exitExit_code_opt(MiLenguajeParser.Exit_code_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#destroy_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDestroy_stmt(MiLenguajeParser.Destroy_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#destroy_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDestroy_stmt(MiLenguajeParser.Destroy_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#begin_end}.
	 * @param ctx the parse tree
	 */
	void enterBegin_end(MiLenguajeParser.Begin_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#begin_end}.
	 * @param ctx the parse tree
	 */
	void exitBegin_end(MiLenguajeParser.Begin_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(MiLenguajeParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(MiLenguajeParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#do_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDo_stmt(MiLenguajeParser.Do_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#do_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDo_stmt(MiLenguajeParser.Do_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#do_stmt1}.
	 * @param ctx the parse tree
	 */
	void enterDo_stmt1(MiLenguajeParser.Do_stmt1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#do_stmt1}.
	 * @param ctx the parse tree
	 */
	void exitDo_stmt1(MiLenguajeParser.Do_stmt1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#do_stmt2}.
	 * @param ctx the parse tree
	 */
	void enterDo_stmt2(MiLenguajeParser.Do_stmt2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#do_stmt2}.
	 * @param ctx the parse tree
	 */
	void exitDo_stmt2(MiLenguajeParser.Do_stmt2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#for_all_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_all_stmt(MiLenguajeParser.For_all_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#for_all_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_all_stmt(MiLenguajeParser.For_all_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#for_all_stmt1}.
	 * @param ctx the parse tree
	 */
	void enterFor_all_stmt1(MiLenguajeParser.For_all_stmt1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#for_all_stmt1}.
	 * @param ctx the parse tree
	 */
	void exitFor_all_stmt1(MiLenguajeParser.For_all_stmt1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#for_all_stmt2}.
	 * @param ctx the parse tree
	 */
	void enterFor_all_stmt2(MiLenguajeParser.For_all_stmt2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#for_all_stmt2}.
	 * @param ctx the parse tree
	 */
	void exitFor_all_stmt2(MiLenguajeParser.For_all_stmt2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#for_all_stmt3}.
	 * @param ctx the parse tree
	 */
	void enterFor_all_stmt3(MiLenguajeParser.For_all_stmt3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#for_all_stmt3}.
	 * @param ctx the parse tree
	 */
	void exitFor_all_stmt3(MiLenguajeParser.For_all_stmt3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#guarded_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void enterGuarded_cmd_lp(MiLenguajeParser.Guarded_cmd_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#guarded_cmd_lp}.
	 * @param ctx the parse tree
	 */
	void exitGuarded_cmd_lp(MiLenguajeParser.Guarded_cmd_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#guarded_cmd}.
	 * @param ctx the parse tree
	 */
	void enterGuarded_cmd(MiLenguajeParser.Guarded_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#guarded_cmd}.
	 * @param ctx the parse tree
	 */
	void exitGuarded_cmd(MiLenguajeParser.Guarded_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#guarded_cmd1}.
	 * @param ctx the parse tree
	 */
	void enterGuarded_cmd1(MiLenguajeParser.Guarded_cmd1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#guarded_cmd1}.
	 * @param ctx the parse tree
	 */
	void exitGuarded_cmd1(MiLenguajeParser.Guarded_cmd1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#else_cmd_opt}.
	 * @param ctx the parse tree
	 */
	void enterElse_cmd_opt(MiLenguajeParser.Else_cmd_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#else_cmd_opt}.
	 * @param ctx the parse tree
	 */
	void exitElse_cmd_opt(MiLenguajeParser.Else_cmd_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#paren_list}.
	 * @param ctx the parse tree
	 */
	void enterParen_list(MiLenguajeParser.Paren_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#paren_list}.
	 * @param ctx the parse tree
	 */
	void exitParen_list(MiLenguajeParser.Paren_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#paren_item_ls}.
	 * @param ctx the parse tree
	 */
	void enterParen_item_ls(MiLenguajeParser.Paren_item_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#paren_item_ls}.
	 * @param ctx the parse tree
	 */
	void exitParen_item_ls(MiLenguajeParser.Paren_item_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr_lp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_lp(MiLenguajeParser.Expr_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr_lp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_lp(MiLenguajeParser.Expr_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#comp_params}.
	 * @param ctx the parse tree
	 */
	void enterComp_params(MiLenguajeParser.Comp_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#comp_params}.
	 * @param ctx the parse tree
	 */
	void exitComp_params(MiLenguajeParser.Comp_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MiLenguajeParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MiLenguajeParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#param_spec_ls}.
	 * @param ctx the parse tree
	 */
	void enterParam_spec_ls(MiLenguajeParser.Param_spec_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#param_spec_ls}.
	 * @param ctx the parse tree
	 */
	void exitParam_spec_ls(MiLenguajeParser.Param_spec_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#param_spec_lp}.
	 * @param ctx the parse tree
	 */
	void enterParam_spec_lp(MiLenguajeParser.Param_spec_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#param_spec_lp}.
	 * @param ctx the parse tree
	 */
	void exitParam_spec_lp(MiLenguajeParser.Param_spec_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#param_spec}.
	 * @param ctx the parse tree
	 */
	void enterParam_spec(MiLenguajeParser.Param_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#param_spec}.
	 * @param ctx the parse tree
	 */
	void exitParam_spec(MiLenguajeParser.Param_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#common_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommon_stmt(MiLenguajeParser.Common_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#common_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommon_stmt(MiLenguajeParser.Common_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#extend_clause}.
	 * @param ctx the parse tree
	 */
	void enterExtend_clause(MiLenguajeParser.Extend_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#extend_clause}.
	 * @param ctx the parse tree
	 */
	void exitExtend_clause(MiLenguajeParser.Extend_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#import_clause}.
	 * @param ctx the parse tree
	 */
	void enterImport_clause(MiLenguajeParser.Import_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#import_clause}.
	 * @param ctx the parse tree
	 */
	void exitImport_clause(MiLenguajeParser.Import_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#import_list}.
	 * @param ctx the parse tree
	 */
	void enterImport_list(MiLenguajeParser.Import_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#import_list}.
	 * @param ctx the parse tree
	 */
	void exitImport_list(MiLenguajeParser.Import_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MiLenguajeParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MiLenguajeParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl(MiLenguajeParser.Type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl(MiLenguajeParser.Type_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#type_restriction}.
	 * @param ctx the parse tree
	 */
	void enterType_restriction(MiLenguajeParser.Type_restrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#type_restriction}.
	 * @param ctx the parse tree
	 */
	void exitType_restriction(MiLenguajeParser.Type_restrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#op_decl}.
	 * @param ctx the parse tree
	 */
	void enterOp_decl(MiLenguajeParser.Op_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#op_decl}.
	 * @param ctx the parse tree
	 */
	void exitOp_decl(MiLenguajeParser.Op_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#oper_def_lp}.
	 * @param ctx the parse tree
	 */
	void enterOper_def_lp(MiLenguajeParser.Oper_def_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#oper_def_lp}.
	 * @param ctx the parse tree
	 */
	void exitOper_def_lp(MiLenguajeParser.Oper_def_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#oper_def}.
	 * @param ctx the parse tree
	 */
	void enterOper_def(MiLenguajeParser.Oper_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#oper_def}.
	 * @param ctx the parse tree
	 */
	void exitOper_def(MiLenguajeParser.Oper_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#colon_opt}.
	 * @param ctx the parse tree
	 */
	void enterColon_opt(MiLenguajeParser.Colon_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#colon_opt}.
	 * @param ctx the parse tree
	 */
	void exitColon_opt(MiLenguajeParser.Colon_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#op_or_ext}.
	 * @param ctx the parse tree
	 */
	void enterOp_or_ext(MiLenguajeParser.Op_or_extContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#op_or_ext}.
	 * @param ctx the parse tree
	 */
	void exitOp_or_ext(MiLenguajeParser.Op_or_extContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#optype_decl}.
	 * @param ctx the parse tree
	 */
	void enterOptype_decl(MiLenguajeParser.Optype_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#optype_decl}.
	 * @param ctx the parse tree
	 */
	void exitOptype_decl(MiLenguajeParser.Optype_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sem_decl}.
	 * @param ctx the parse tree
	 */
	void enterSem_decl(MiLenguajeParser.Sem_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sem_decl}.
	 * @param ctx the parse tree
	 */
	void exitSem_decl(MiLenguajeParser.Sem_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sem_def_lp}.
	 * @param ctx the parse tree
	 */
	void enterSem_def_lp(MiLenguajeParser.Sem_def_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sem_def_lp}.
	 * @param ctx the parse tree
	 */
	void exitSem_def_lp(MiLenguajeParser.Sem_def_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sem_def}.
	 * @param ctx the parse tree
	 */
	void enterSem_def(MiLenguajeParser.Sem_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sem_def}.
	 * @param ctx the parse tree
	 */
	void exitSem_def(MiLenguajeParser.Sem_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sem_init}.
	 * @param ctx the parse tree
	 */
	void enterSem_init(MiLenguajeParser.Sem_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sem_init}.
	 * @param ctx the parse tree
	 */
	void exitSem_init(MiLenguajeParser.Sem_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#eq_opt}.
	 * @param ctx the parse tree
	 */
	void enterEq_opt(MiLenguajeParser.Eq_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#eq_opt}.
	 * @param ctx the parse tree
	 */
	void exitEq_opt(MiLenguajeParser.Eq_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiLenguajeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiLenguajeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#unsub_type}.
	 * @param ctx the parse tree
	 */
	void enterUnsub_type(MiLenguajeParser.Unsub_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#unsub_type}.
	 * @param ctx the parse tree
	 */
	void exitUnsub_type(MiLenguajeParser.Unsub_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#pointer_def}.
	 * @param ctx the parse tree
	 */
	void enterPointer_def(MiLenguajeParser.Pointer_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#pointer_def}.
	 * @param ctx the parse tree
	 */
	void exitPointer_def(MiLenguajeParser.Pointer_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#union_def}.
	 * @param ctx the parse tree
	 */
	void enterUnion_def(MiLenguajeParser.Union_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#union_def}.
	 * @param ctx the parse tree
	 */
	void exitUnion_def(MiLenguajeParser.Union_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#record_def}.
	 * @param ctx the parse tree
	 */
	void enterRecord_def(MiLenguajeParser.Record_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#record_def}.
	 * @param ctx the parse tree
	 */
	void exitRecord_def(MiLenguajeParser.Record_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#capability_def}.
	 * @param ctx the parse tree
	 */
	void enterCapability_def(MiLenguajeParser.Capability_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#capability_def}.
	 * @param ctx the parse tree
	 */
	void exitCapability_def(MiLenguajeParser.Capability_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#cap_for}.
	 * @param ctx the parse tree
	 */
	void enterCap_for(MiLenguajeParser.Cap_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#cap_for}.
	 * @param ctx the parse tree
	 */
	void exitCap_for(MiLenguajeParser.Cap_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#qualified_id}.
	 * @param ctx the parse tree
	 */
	void enterQualified_id(MiLenguajeParser.Qualified_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#qualified_id}.
	 * @param ctx the parse tree
	 */
	void exitQualified_id(MiLenguajeParser.Qualified_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type(MiLenguajeParser.Basic_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#basic_type}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type(MiLenguajeParser.Basic_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#basic_type1}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type1(MiLenguajeParser.Basic_type1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#basic_type1}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type1(MiLenguajeParser.Basic_type1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#basic_type2}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type2(MiLenguajeParser.Basic_type2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#basic_type2}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type2(MiLenguajeParser.Basic_type2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#basic_type3}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type3(MiLenguajeParser.Basic_type3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#basic_type3}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type3(MiLenguajeParser.Basic_type3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#basic_type4}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type4(MiLenguajeParser.Basic_type4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#basic_type4}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type4(MiLenguajeParser.Basic_type4Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#basic_type5}.
	 * @param ctx the parse tree
	 */
	void enterBasic_type5(MiLenguajeParser.Basic_type5Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#basic_type5}.
	 * @param ctx the parse tree
	 */
	void exitBasic_type5(MiLenguajeParser.Basic_type5Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#field_lp}.
	 * @param ctx the parse tree
	 */
	void enterField_lp(MiLenguajeParser.Field_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#field_lp}.
	 * @param ctx the parse tree
	 */
	void exitField_lp(MiLenguajeParser.Field_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(MiLenguajeParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(MiLenguajeParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#param_kind_opt}.
	 * @param ctx the parse tree
	 */
	void enterParam_kind_opt(MiLenguajeParser.Param_kind_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#param_kind_opt}.
	 * @param ctx the parse tree
	 */
	void exitParam_kind_opt(MiLenguajeParser.Param_kind_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#string_def}.
	 * @param ctx the parse tree
	 */
	void enterString_def(MiLenguajeParser.String_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#string_def}.
	 * @param ctx the parse tree
	 */
	void exitString_def(MiLenguajeParser.String_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#string_lim}.
	 * @param ctx the parse tree
	 */
	void enterString_lim(MiLenguajeParser.String_limContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#string_lim}.
	 * @param ctx the parse tree
	 */
	void exitString_lim(MiLenguajeParser.String_limContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#obj_decl}.
	 * @param ctx the parse tree
	 */
	void enterObj_decl(MiLenguajeParser.Obj_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#obj_decl}.
	 * @param ctx the parse tree
	 */
	void exitObj_decl(MiLenguajeParser.Obj_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#enum_def}.
	 * @param ctx the parse tree
	 */
	void enterEnum_def(MiLenguajeParser.Enum_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#enum_def}.
	 * @param ctx the parse tree
	 */
	void exitEnum_def(MiLenguajeParser.Enum_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#var_or_const}.
	 * @param ctx the parse tree
	 */
	void enterVar_or_const(MiLenguajeParser.Var_or_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#var_or_const}.
	 * @param ctx the parse tree
	 */
	void exitVar_or_const(MiLenguajeParser.Var_or_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#var_or_const_var}.
	 * @param ctx the parse tree
	 */
	void enterVar_or_const_var(MiLenguajeParser.Var_or_const_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#var_or_const_var}.
	 * @param ctx the parse tree
	 */
	void exitVar_or_const_var(MiLenguajeParser.Var_or_const_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#var_or_const_const}.
	 * @param ctx the parse tree
	 */
	void enterVar_or_const_const(MiLenguajeParser.Var_or_const_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#var_or_const_const}.
	 * @param ctx the parse tree
	 */
	void exitVar_or_const_const(MiLenguajeParser.Var_or_const_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#var_def_lp}.
	 * @param ctx the parse tree
	 */
	void enterVar_def_lp(MiLenguajeParser.Var_def_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#var_def_lp}.
	 * @param ctx the parse tree
	 */
	void exitVar_def_lp(MiLenguajeParser.Var_def_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(MiLenguajeParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(MiLenguajeParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#var_att}.
	 * @param ctx the parse tree
	 */
	void enterVar_att(MiLenguajeParser.Var_attContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#var_att}.
	 * @param ctx the parse tree
	 */
	void exitVar_att(MiLenguajeParser.Var_attContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#var_att1}.
	 * @param ctx the parse tree
	 */
	void enterVar_att1(MiLenguajeParser.Var_att1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#var_att1}.
	 * @param ctx the parse tree
	 */
	void exitVar_att1(MiLenguajeParser.Var_att1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#var_att2}.
	 * @param ctx the parse tree
	 */
	void enterVar_att2(MiLenguajeParser.Var_att2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#var_att2}.
	 * @param ctx the parse tree
	 */
	void exitVar_att2(MiLenguajeParser.Var_att2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#id_subs_lp}.
	 * @param ctx the parse tree
	 */
	void enterId_subs_lp(MiLenguajeParser.Id_subs_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#id_subs_lp}.
	 * @param ctx the parse tree
	 */
	void exitId_subs_lp(MiLenguajeParser.Id_subs_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#id_subs}.
	 * @param ctx the parse tree
	 */
	void enterId_subs(MiLenguajeParser.Id_subsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#id_subs}.
	 * @param ctx the parse tree
	 */
	void exitId_subs(MiLenguajeParser.Id_subsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#id_subsID}.
	 * @param ctx the parse tree
	 */
	void enterId_subsID(MiLenguajeParser.Id_subsIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#id_subsID}.
	 * @param ctx the parse tree
	 */
	void exitId_subsID(MiLenguajeParser.Id_subsIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#id_lp}.
	 * @param ctx the parse tree
	 */
	void enterId_lp(MiLenguajeParser.Id_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#id_lp}.
	 * @param ctx the parse tree
	 */
	void exitId_lp(MiLenguajeParser.Id_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#skip_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSkip_stmt(MiLenguajeParser.Skip_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#skip_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSkip_stmt(MiLenguajeParser.Skip_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExit_stmt(MiLenguajeParser.Exit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExit_stmt(MiLenguajeParser.Exit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#next_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNext_stmt(MiLenguajeParser.Next_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#next_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNext_stmt(MiLenguajeParser.Next_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(MiLenguajeParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(MiLenguajeParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#reply_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReply_stmt(MiLenguajeParser.Reply_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#reply_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReply_stmt(MiLenguajeParser.Reply_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MiLenguajeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MiLenguajeParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr_num}.
	 * @param ctx the parse tree
	 */
	void enterExpr_num(MiLenguajeParser.Expr_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr_num}.
	 * @param ctx the parse tree
	 */
	void exitExpr_num(MiLenguajeParser.Expr_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(MiLenguajeParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(MiLenguajeParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(MiLenguajeParser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(MiLenguajeParser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterExpr3(MiLenguajeParser.Expr3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitExpr3(MiLenguajeParser.Expr3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterExpr4(MiLenguajeParser.Expr4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitExpr4(MiLenguajeParser.Expr4Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr5}.
	 * @param ctx the parse tree
	 */
	void enterExpr5(MiLenguajeParser.Expr5Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr5}.
	 * @param ctx the parse tree
	 */
	void exitExpr5(MiLenguajeParser.Expr5Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr6}.
	 * @param ctx the parse tree
	 */
	void enterExpr6(MiLenguajeParser.Expr6Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr6}.
	 * @param ctx the parse tree
	 */
	void exitExpr6(MiLenguajeParser.Expr6Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr7}.
	 * @param ctx the parse tree
	 */
	void enterExpr7(MiLenguajeParser.Expr7Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr7}.
	 * @param ctx the parse tree
	 */
	void exitExpr7(MiLenguajeParser.Expr7Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr8}.
	 * @param ctx the parse tree
	 */
	void enterExpr8(MiLenguajeParser.Expr8Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr8}.
	 * @param ctx the parse tree
	 */
	void exitExpr8(MiLenguajeParser.Expr8Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr9}.
	 * @param ctx the parse tree
	 */
	void enterExpr9(MiLenguajeParser.Expr9Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr9}.
	 * @param ctx the parse tree
	 */
	void exitExpr9(MiLenguajeParser.Expr9Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr10}.
	 * @param ctx the parse tree
	 */
	void enterExpr10(MiLenguajeParser.Expr10Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr10}.
	 * @param ctx the parse tree
	 */
	void exitExpr10(MiLenguajeParser.Expr10Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr11}.
	 * @param ctx the parse tree
	 */
	void enterExpr11(MiLenguajeParser.Expr11Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr11}.
	 * @param ctx the parse tree
	 */
	void exitExpr11(MiLenguajeParser.Expr11Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr12}.
	 * @param ctx the parse tree
	 */
	void enterExpr12(MiLenguajeParser.Expr12Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr12}.
	 * @param ctx the parse tree
	 */
	void exitExpr12(MiLenguajeParser.Expr12Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr13}.
	 * @param ctx the parse tree
	 */
	void enterExpr13(MiLenguajeParser.Expr13Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr13}.
	 * @param ctx the parse tree
	 */
	void exitExpr13(MiLenguajeParser.Expr13Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr14}.
	 * @param ctx the parse tree
	 */
	void enterExpr14(MiLenguajeParser.Expr14Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr14}.
	 * @param ctx the parse tree
	 */
	void exitExpr14(MiLenguajeParser.Expr14Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr15}.
	 * @param ctx the parse tree
	 */
	void enterExpr15(MiLenguajeParser.Expr15Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr15}.
	 * @param ctx the parse tree
	 */
	void exitExpr15(MiLenguajeParser.Expr15Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr16}.
	 * @param ctx the parse tree
	 */
	void enterExpr16(MiLenguajeParser.Expr16Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr16}.
	 * @param ctx the parse tree
	 */
	void exitExpr16(MiLenguajeParser.Expr16Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr17}.
	 * @param ctx the parse tree
	 */
	void enterExpr17(MiLenguajeParser.Expr17Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr17}.
	 * @param ctx the parse tree
	 */
	void exitExpr17(MiLenguajeParser.Expr17Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr18}.
	 * @param ctx the parse tree
	 */
	void enterExpr18(MiLenguajeParser.Expr18Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr18}.
	 * @param ctx the parse tree
	 */
	void exitExpr18(MiLenguajeParser.Expr18Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr19}.
	 * @param ctx the parse tree
	 */
	void enterExpr19(MiLenguajeParser.Expr19Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr19}.
	 * @param ctx the parse tree
	 */
	void exitExpr19(MiLenguajeParser.Expr19Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr20}.
	 * @param ctx the parse tree
	 */
	void enterExpr20(MiLenguajeParser.Expr20Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr20}.
	 * @param ctx the parse tree
	 */
	void exitExpr20(MiLenguajeParser.Expr20Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr21}.
	 * @param ctx the parse tree
	 */
	void enterExpr21(MiLenguajeParser.Expr21Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr21}.
	 * @param ctx the parse tree
	 */
	void exitExpr21(MiLenguajeParser.Expr21Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr22}.
	 * @param ctx the parse tree
	 */
	void enterExpr22(MiLenguajeParser.Expr22Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr22}.
	 * @param ctx the parse tree
	 */
	void exitExpr22(MiLenguajeParser.Expr22Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr23}.
	 * @param ctx the parse tree
	 */
	void enterExpr23(MiLenguajeParser.Expr23Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr23}.
	 * @param ctx the parse tree
	 */
	void exitExpr23(MiLenguajeParser.Expr23Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr24}.
	 * @param ctx the parse tree
	 */
	void enterExpr24(MiLenguajeParser.Expr24Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr24}.
	 * @param ctx the parse tree
	 */
	void exitExpr24(MiLenguajeParser.Expr24Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr25}.
	 * @param ctx the parse tree
	 */
	void enterExpr25(MiLenguajeParser.Expr25Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr25}.
	 * @param ctx the parse tree
	 */
	void exitExpr25(MiLenguajeParser.Expr25Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr26}.
	 * @param ctx the parse tree
	 */
	void enterExpr26(MiLenguajeParser.Expr26Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr26}.
	 * @param ctx the parse tree
	 */
	void exitExpr26(MiLenguajeParser.Expr26Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr27}.
	 * @param ctx the parse tree
	 */
	void enterExpr27(MiLenguajeParser.Expr27Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr27}.
	 * @param ctx the parse tree
	 */
	void exitExpr27(MiLenguajeParser.Expr27Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr28}.
	 * @param ctx the parse tree
	 */
	void enterExpr28(MiLenguajeParser.Expr28Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr28}.
	 * @param ctx the parse tree
	 */
	void exitExpr28(MiLenguajeParser.Expr28Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr29}.
	 * @param ctx the parse tree
	 */
	void enterExpr29(MiLenguajeParser.Expr29Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr29}.
	 * @param ctx the parse tree
	 */
	void exitExpr29(MiLenguajeParser.Expr29Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr30}.
	 * @param ctx the parse tree
	 */
	void enterExpr30(MiLenguajeParser.Expr30Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr30}.
	 * @param ctx the parse tree
	 */
	void exitExpr30(MiLenguajeParser.Expr30Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr31}.
	 * @param ctx the parse tree
	 */
	void enterExpr31(MiLenguajeParser.Expr31Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr31}.
	 * @param ctx the parse tree
	 */
	void exitExpr31(MiLenguajeParser.Expr31Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr32}.
	 * @param ctx the parse tree
	 */
	void enterExpr32(MiLenguajeParser.Expr32Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr32}.
	 * @param ctx the parse tree
	 */
	void exitExpr32(MiLenguajeParser.Expr32Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr33}.
	 * @param ctx the parse tree
	 */
	void enterExpr33(MiLenguajeParser.Expr33Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr33}.
	 * @param ctx the parse tree
	 */
	void exitExpr33(MiLenguajeParser.Expr33Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr34}.
	 * @param ctx the parse tree
	 */
	void enterExpr34(MiLenguajeParser.Expr34Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr34}.
	 * @param ctx the parse tree
	 */
	void exitExpr34(MiLenguajeParser.Expr34Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr35}.
	 * @param ctx the parse tree
	 */
	void enterExpr35(MiLenguajeParser.Expr35Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr35}.
	 * @param ctx the parse tree
	 */
	void exitExpr35(MiLenguajeParser.Expr35Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr36}.
	 * @param ctx the parse tree
	 */
	void enterExpr36(MiLenguajeParser.Expr36Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr36}.
	 * @param ctx the parse tree
	 */
	void exitExpr36(MiLenguajeParser.Expr36Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr37}.
	 * @param ctx the parse tree
	 */
	void enterExpr37(MiLenguajeParser.Expr37Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr37}.
	 * @param ctx the parse tree
	 */
	void exitExpr37(MiLenguajeParser.Expr37Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr38}.
	 * @param ctx the parse tree
	 */
	void enterExpr38(MiLenguajeParser.Expr38Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr38}.
	 * @param ctx the parse tree
	 */
	void exitExpr38(MiLenguajeParser.Expr38Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr39}.
	 * @param ctx the parse tree
	 */
	void enterExpr39(MiLenguajeParser.Expr39Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr39}.
	 * @param ctx the parse tree
	 */
	void exitExpr39(MiLenguajeParser.Expr39Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr40}.
	 * @param ctx the parse tree
	 */
	void enterExpr40(MiLenguajeParser.Expr40Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr40}.
	 * @param ctx the parse tree
	 */
	void exitExpr40(MiLenguajeParser.Expr40Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr41}.
	 * @param ctx the parse tree
	 */
	void enterExpr41(MiLenguajeParser.Expr41Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr41}.
	 * @param ctx the parse tree
	 */
	void exitExpr41(MiLenguajeParser.Expr41Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr42}.
	 * @param ctx the parse tree
	 */
	void enterExpr42(MiLenguajeParser.Expr42Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr42}.
	 * @param ctx the parse tree
	 */
	void exitExpr42(MiLenguajeParser.Expr42Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expr43}.
	 * @param ctx the parse tree
	 */
	void enterExpr43(MiLenguajeParser.Expr43Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expr43}.
	 * @param ctx the parse tree
	 */
	void exitExpr43(MiLenguajeParser.Expr43Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MiLenguajeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MiLenguajeParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#create_expr}.
	 * @param ctx the parse tree
	 */
	void enterCreate_expr(MiLenguajeParser.Create_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#create_expr}.
	 * @param ctx the parse tree
	 */
	void exitCreate_expr(MiLenguajeParser.Create_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#create_call}.
	 * @param ctx the parse tree
	 */
	void enterCreate_call(MiLenguajeParser.Create_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#create_call}.
	 * @param ctx the parse tree
	 */
	void exitCreate_call(MiLenguajeParser.Create_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#rsrc_name}.
	 * @param ctx the parse tree
	 */
	void enterRsrc_name(MiLenguajeParser.Rsrc_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#rsrc_name}.
	 * @param ctx the parse tree
	 */
	void exitRsrc_name(MiLenguajeParser.Rsrc_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#location_opt}.
	 * @param ctx the parse tree
	 */
	void enterLocation_opt(MiLenguajeParser.Location_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#location_opt}.
	 * @param ctx the parse tree
	 */
	void exitLocation_opt(MiLenguajeParser.Location_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(MiLenguajeParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(MiLenguajeParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#constr_item_lp}.
	 * @param ctx the parse tree
	 */
	void enterConstr_item_lp(MiLenguajeParser.Constr_item_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#constr_item_lp}.
	 * @param ctx the parse tree
	 */
	void exitConstr_item_lp(MiLenguajeParser.Constr_item_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#constr_item}.
	 * @param ctx the parse tree
	 */
	void enterConstr_item(MiLenguajeParser.Constr_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#constr_item}.
	 * @param ctx the parse tree
	 */
	void exitConstr_item(MiLenguajeParser.Constr_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#prefix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_expr(MiLenguajeParser.Prefix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#prefix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_expr(MiLenguajeParser.Prefix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#paren_expr}.
	 * @param ctx the parse tree
	 */
	void enterParen_expr(MiLenguajeParser.Paren_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#paren_expr}.
	 * @param ctx the parse tree
	 */
	void exitParen_expr(MiLenguajeParser.Paren_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#new_item}.
	 * @param ctx the parse tree
	 */
	void enterNew_item(MiLenguajeParser.New_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#new_item}.
	 * @param ctx the parse tree
	 */
	void exitNew_item(MiLenguajeParser.New_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sem_proto}.
	 * @param ctx the parse tree
	 */
	void enterSem_proto(MiLenguajeParser.Sem_protoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sem_proto}.
	 * @param ctx the parse tree
	 */
	void exitSem_proto(MiLenguajeParser.Sem_protoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#op_prototype}.
	 * @param ctx the parse tree
	 */
	void enterOp_prototype(MiLenguajeParser.Op_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#op_prototype}.
	 * @param ctx the parse tree
	 */
	void exitOp_prototype(MiLenguajeParser.Op_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#op_restriction_opt}.
	 * @param ctx the parse tree
	 */
	void enterOp_restriction_opt(MiLenguajeParser.Op_restriction_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#op_restriction_opt}.
	 * @param ctx the parse tree
	 */
	void exitOp_restriction_opt(MiLenguajeParser.Op_restriction_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#prototype}.
	 * @param ctx the parse tree
	 */
	void enterPrototype(MiLenguajeParser.PrototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#prototype}.
	 * @param ctx the parse tree
	 */
	void exitPrototype(MiLenguajeParser.PrototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#return_spec_opt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_spec_opt(MiLenguajeParser.Return_spec_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#return_spec_opt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_spec_opt(MiLenguajeParser.Return_spec_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#subscripts_opt}.
	 * @param ctx the parse tree
	 */
	void enterSubscripts_opt(MiLenguajeParser.Subscripts_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#subscripts_opt}.
	 * @param ctx the parse tree
	 */
	void exitSubscripts_opt(MiLenguajeParser.Subscripts_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void enterSubscripts(MiLenguajeParser.SubscriptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void exitSubscripts(MiLenguajeParser.SubscriptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#bracketed_list}.
	 * @param ctx the parse tree
	 */
	void enterBracketed_list(MiLenguajeParser.Bracketed_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#bracketed_list}.
	 * @param ctx the parse tree
	 */
	void exitBracketed_list(MiLenguajeParser.Bracketed_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#bound_lp}.
	 * @param ctx the parse tree
	 */
	void enterBound_lp(MiLenguajeParser.Bound_lpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#bound_lp}.
	 * @param ctx the parse tree
	 */
	void exitBound_lp(MiLenguajeParser.Bound_lpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#bounds}.
	 * @param ctx the parse tree
	 */
	void enterBounds(MiLenguajeParser.BoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#bounds}.
	 * @param ctx the parse tree
	 */
	void exitBounds(MiLenguajeParser.BoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#bound}.
	 * @param ctx the parse tree
	 */
	void enterBound(MiLenguajeParser.BoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#bound}.
	 * @param ctx the parse tree
	 */
	void exitBound(MiLenguajeParser.BoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#op_restriction}.
	 * @param ctx the parse tree
	 */
	void enterOp_restriction(MiLenguajeParser.Op_restrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#op_restriction}.
	 * @param ctx the parse tree
	 */
	void exitOp_restriction(MiLenguajeParser.Op_restrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#end_id}.
	 * @param ctx the parse tree
	 */
	void enterEnd_id(MiLenguajeParser.End_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#end_id}.
	 * @param ctx the parse tree
	 */
	void exitEnd_id(MiLenguajeParser.End_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#id_opt}.
	 * @param ctx the parse tree
	 */
	void enterId_opt(MiLenguajeParser.Id_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#id_opt}.
	 * @param ctx the parse tree
	 */
	void exitId_opt(MiLenguajeParser.Id_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiLenguajeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiLenguajeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#block_items}.
	 * @param ctx the parse tree
	 */
	void enterBlock_items(MiLenguajeParser.Block_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#block_items}.
	 * @param ctx the parse tree
	 */
	void exitBlock_items(MiLenguajeParser.Block_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#block_items_}.
	 * @param ctx the parse tree
	 */
	void enterBlock_items_(MiLenguajeParser.Block_items_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#block_items_}.
	 * @param ctx the parse tree
	 */
	void exitBlock_items_(MiLenguajeParser.Block_items_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#block_item}.
	 * @param ctx the parse tree
	 */
	void enterBlock_item(MiLenguajeParser.Block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#block_item}.
	 * @param ctx the parse tree
	 */
	void exitBlock_item(MiLenguajeParser.Block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#block_item1}.
	 * @param ctx the parse tree
	 */
	void enterBlock_item1(MiLenguajeParser.Block_item1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#block_item1}.
	 * @param ctx the parse tree
	 */
	void exitBlock_item1(MiLenguajeParser.Block_item1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#id_ls}.
	 * @param ctx the parse tree
	 */
	void enterId_ls(MiLenguajeParser.Id_lsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#id_ls}.
	 * @param ctx the parse tree
	 */
	void exitId_ls(MiLenguajeParser.Id_lsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#falta}.
	 * @param ctx the parse tree
	 */
	void enterFalta(MiLenguajeParser.FaltaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#falta}.
	 * @param ctx the parse tree
	 */
	void exitFalta(MiLenguajeParser.FaltaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#vacio}.
	 * @param ctx the parse tree
	 */
	void enterVacio(MiLenguajeParser.VacioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#vacio}.
	 * @param ctx the parse tree
	 */
	void exitVacio(MiLenguajeParser.VacioContext ctx);
}