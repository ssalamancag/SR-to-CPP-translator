// Generated from C:/Users/sebastian/Desktop/Estudio/universidad/2019-2/lenguajes/test2/grammar\MiLenguaje.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#intit_component}.
	 * @param ctx the parse tree
	 */
	void enterIntit_component(MiLenguajeParser.Intit_componentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#intit_component}.
	 * @param ctx the parse tree
	 */
	void exitIntit_component(MiLenguajeParser.Intit_componentContext ctx);
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
	 * Enter a parse tree produced by {@link MiLenguajeParser#spec_stmt_ls_1}.
	 * @param ctx the parse tree
	 */
	void enterSpec_stmt_ls_1(MiLenguajeParser.Spec_stmt_ls_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#spec_stmt_ls_1}.
	 * @param ctx the parse tree
	 */
	void exitSpec_stmt_ls_1(MiLenguajeParser.Spec_stmt_ls_1Context ctx);
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
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#otro}.
	 * @param ctx the parse tree
	 */
	void enterOtro(MiLenguajeParser.OtroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#otro}.
	 * @param ctx the parse tree
	 */
	void exitOtro(MiLenguajeParser.OtroContext ctx);
}