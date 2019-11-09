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
	 * Visit a parse tree produced by {@link MiLenguajeParser#intit_component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntit_component(MiLenguajeParser.Intit_componentContext ctx);
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#spec_stmt_ls_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_stmt_ls_1(MiLenguajeParser.Spec_stmt_ls_1Context ctx);
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
	 * Visit a parse tree produced by {@link MiLenguajeParser#id_lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_lp(MiLenguajeParser.Id_lpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MiLenguajeParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiLenguajeParser.BlockContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#otro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtro(MiLenguajeParser.OtroContext ctx);
}