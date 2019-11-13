import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class TranslateToCpp extends MiLenguajeBaseListener {

    // Flujo de escritura en el archivo
    BufferedWriter br;

    // Estructura de C++
    ArrayList<StringBuilder> imports;          // Lineas de Importaciones
    StringBuilder namespace;                   // Linea Namespace
    ArrayList<StringBuilder> globals;          // Lista de clases de variables globales
    ArrayList<StringBuilder> speficications;   // Lista de clases de recursos de especficación
    ArrayList<StringBuilder> bodies;           // Lista de clases de recursos de cuerpo
    ArrayList<StringBuilder> functions;        // Lista de funciones
    StringBuilder main;                        // Función principal

    // Apuntador
    Stack<StringBuilder> pointer;

    // Variables auxiliares
    String aux;

    // Constructor
    public TranslateToCpp() {
        try {

            // Crear objeto de escritura
            FileWriter writer = new FileWriter("output/salida.txt");
            // Crear objeto de escritura directa
            br = new BufferedWriter(writer);

            // Instanciar estructura C++
            imports = new ArrayList<>();
            imports.add(new StringBuilder("#include <pthread.h>"));
            namespace = new StringBuilder("using namespace std;");
            globals = new ArrayList<StringBuilder>();
            speficications = new ArrayList<StringBuilder>();
            bodies = new ArrayList<StringBuilder>();
            functions = new ArrayList<StringBuilder>();
            main = new StringBuilder("");
            pointer = new Stack<StringBuilder>();
            pointer.add(main);

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    // Escribir estructura final en archivo
    public void write(){
        try {

            // Escribir importaciones
            for (Object imprt: imports) {
                br.write(imprt +"\n");
            }
            if (imports.size() > 0) br.write("\n");

            // Escribir namespace
            br.write(namespace + "\n\n");

            // Escribir globales
            for (Object global: globals) {
                br.write(global.toString() +"\n");
            }

            // Escribir sepecificaciones
            for (Object function: speficications) {
                br.write(function.toString() + "\n");
            }

            // Escribir cuerpos
            for (Object function: bodies) {
                br.write(function.toString() + "\n");
            }

            // Escribir funciones
            for (Object class1: functions) {
                br.write(class1.toString() + "\n");
            }

            // Escribir Main
            br.write(main.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Reemplazar ultima coincidencia
    public void replaceLast(String old, String new1){
        if (pointer.peek().toString().contains(old)){
            int pos = pointer.peek().lastIndexOf(old);
            pointer.peek().replace(pos, pos + old.length(), new1);
        }
    }

    public String space() {
        int i = 0;
        String cadena = pointer.peek().toString();
        if (pointer.peek().toString().contains("\n")){
            int pos = pointer.peek().lastIndexOf("\n");
            cadena = cadena.substring(pos + 1);
        }
        for (i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ' && cadena.charAt(i) != '\t') {
                return cadena.substring(0, i);
            }
        }
        return "";
    }

    public String lessSpace() {
        return space().substring(0, space().length() - 1);
    }

    @Override public void enterInicio(MiLenguajeParser.InicioContext ctx) {
        pointer.peek().append("int main() {\n\t");

    }

    @Override public void exitInicio(MiLenguajeParser.InicioContext ctx) {
        pointer.pop().append("\n}\n");
        write();
    }

    @Override public void enterGlobal(MiLenguajeParser.GlobalContext ctx) {
        globals.add(new StringBuilder("class " + ctx.TK_ID() + "{\n\tpublic:\n\t\t"));
        pointer.add(globals.get(globals.size()-1));
    }

    @Override public void exitGlobal(MiLenguajeParser.GlobalContext ctx) {
        pointer.pop().append("\n}\n");
    }

    @Override public void enterResource_specification(MiLenguajeParser.Resource_specificationContext ctx) {
        speficications.add(new StringBuilder("class " + ctx.TK_ID() + "{\n\tpublic:\n\t\t"));
        pointer.add(speficications.get(speficications.size()-1));
    }

    @Override public void exitResource_specification(MiLenguajeParser.Resource_specificationContext ctx) {
        pointer.pop().append("\n}\n");
    }

    @Override public void enterSpec_body(MiLenguajeParser.Spec_bodyContext ctx) {
        bodies.add(new StringBuilder("class body" + ctx.TK_ID() + "(" + ") {\n\tpublic:\n\t\t"));
        pointer.add(bodies.get(bodies.size()-1));
    }

    @Override public void exitSpec_body(MiLenguajeParser.Spec_bodyContext ctx) {
        pointer.pop().append("\n}\n");
    }

    public void enterVar_or_const_var(MiLenguajeParser.Var_or_const_varContext ctx) {
        pointer.peek().append(ctx.TK_VAR() + " ");
    }

    public void enterVar_or_const_const(MiLenguajeParser.Var_or_const_constContext ctx) {
        pointer.peek().append(ctx.TK_CONST() + " ");
    }

    @Override public void enterId_subsID(MiLenguajeParser.Id_subsIDContext ctx) {
        pointer.peek().append(ctx.TK_ID() + " ");
    }

    @Override public void enterVar_att1(MiLenguajeParser.Var_att1Context ctx) {
        pointer.peek().append("=" + " ");
    }

    @Override public void enterExpr_num(MiLenguajeParser.Expr_numContext ctx) {
        replaceLast("var","int");
        pointer.peek().append(ctx.NUM() + " ");
    }

    @Override public void enterVar_att2(MiLenguajeParser.Var_att2Context ctx) {
    }

    @Override public void enterBasic_type1(MiLenguajeParser.Basic_type1Context ctx) {
        replaceLast("var","int");
    }

    @Override public void enterBasic_type2(MiLenguajeParser.Basic_type2Context ctx) {
        replaceLast("var","bool");
    }

    @Override public void enterBasic_type3(MiLenguajeParser.Basic_type3Context ctx) {
        replaceLast("var","char");
    }

    @Override public void enterBasic_type5(MiLenguajeParser.Basic_type5Context ctx) {
        replaceLast("var","float");
    }

    @Override public void enterExpr1(MiLenguajeParser.Expr1Context ctx) {
        if(ctx.TK_ID().toString().equals("write") || ctx.TK_ID().toString().equals("writes") ){
            pointer.peek().append("cout <<");
        }else if(ctx.TK_ID().toString().equals("read")){
            pointer.peek().append("cin  >>");
        }
        else{
            pointer.peek().append(ctx.TK_ID() + " ");
        }

    }

    @Override public void enterExpr2(MiLenguajeParser.Expr2Context ctx) {
        pointer.peek().append(ctx.CADENA() + " ");
    }

    @Override public void enterExpr3(MiLenguajeParser.Expr3Context ctx) {
        pointer.peek().append(ctx.TK_LPAREN() + " ");
    }

    @Override public void enterExpr4(MiLenguajeParser.Expr4Context ctx) {
        pointer.peek().append(ctx.TK_RPAREN() + " ");
    }

    @Override public void enterExpr5(MiLenguajeParser.Expr5Context ctx) {
        pointer.peek().append(ctx.TK_INCR() + " ");
    }

    @Override public void enterExpr6(MiLenguajeParser.Expr6Context ctx) {
        pointer.peek().append(ctx.TK_DECR() + " ");
    }

    @Override public void enterExpr7(MiLenguajeParser.Expr7Context ctx) {
        pointer.peek().append(ctx.TK_HAT() + " ");
    }

    @Override public void enterExpr8(MiLenguajeParser.Expr8Context ctx) {
        pointer.peek().append(ctx.TK_PERIOD() + " ");
    }

    @Override public void enterExpr9(MiLenguajeParser.Expr9Context ctx) {
        pointer.peek().append(ctx.TK_LBRACKET() + " ");
    }

    @Override public void enterExpr10(MiLenguajeParser.Expr10Context ctx) {
        pointer.peek().append(ctx.TK_RBRACKET() + " ");
    }

    @Override public void enterExpr11(MiLenguajeParser.Expr11Context ctx) {
        pointer.peek().append(ctx.TK_EXPON() + " ");
    }

    @Override public void enterExpr12(MiLenguajeParser.Expr12Context ctx) {
        pointer.peek().append(ctx.TK_ASTER() + " ");
    }

    @Override public void enterExpr13(MiLenguajeParser.Expr13Context ctx) {
        pointer.peek().append(ctx.TK_DIV() + " ");
    }

    @Override public void enterExpr14(MiLenguajeParser.Expr14Context ctx) {
        pointer.peek().append(ctx.TK_MOD() + " ");
    }

    @Override public void enterExpr15(MiLenguajeParser.Expr15Context ctx) {
        pointer.peek().append(ctx.TK_REMDR() + " ");
    }

    @Override public void enterExpr16(MiLenguajeParser.Expr16Context ctx) {
        pointer.peek().append(ctx.TK_PLUS() + " ");
    }

    @Override public void enterExpr17(MiLenguajeParser.Expr17Context ctx) {
        pointer.peek().append(ctx.TK_MINUS() + " ");
    }

    @Override public void enterExpr18(MiLenguajeParser.Expr18Context ctx) {
        pointer.peek().append(ctx.TK_CONCAT() + " ");
    }

    @Override public void enterExpr19(MiLenguajeParser.Expr19Context ctx) {
        pointer.peek().append(ctx.TK_EQ() + " ");
    }

    @Override public void enterExpr20(MiLenguajeParser.Expr20Context ctx) {
        pointer.peek().append(ctx.TK_NE() + " ");
    }

    @Override public void enterExpr21(MiLenguajeParser.Expr21Context ctx) {
        pointer.peek().append(ctx.TK_GE() + " ");
    }

    @Override public void enterExpr22(MiLenguajeParser.Expr22Context ctx) {
        pointer.peek().append(ctx.TK_LE() + " ");
    }

    @Override public void enterExpr23(MiLenguajeParser.Expr23Context ctx) {
        pointer.peek().append(ctx.TK_GT() + " ");
    }

    @Override public void enterExpr24(MiLenguajeParser.Expr24Context ctx) {
        pointer.peek().append(ctx.TK_LT() + " ");
    }

    @Override public void enterExpr25(MiLenguajeParser.Expr25Context ctx) {
        pointer.peek().append(ctx.TK_AND() + " ");
    }

    @Override public void enterExpr26(MiLenguajeParser.Expr26Context ctx) {
        pointer.peek().append(ctx.TK_OR() + " ");
    }

    @Override public void enterExpr27(MiLenguajeParser.Expr27Context ctx) {
        pointer.peek().append(ctx.TK_OR_() + " ");
    }

    @Override public void enterExpr28(MiLenguajeParser.Expr28Context ctx) {
        pointer.peek().append(ctx.TK_XOR() + " ");
    }

    @Override public void enterExpr29(MiLenguajeParser.Expr29Context ctx) {
        pointer.peek().append(ctx.TK_RSHIFT() + " ");
    }

    @Override public void enterExpr30(MiLenguajeParser.Expr30Context ctx) {
        pointer.peek().append(ctx.TK_LSHIFT() + " ");
    }

    @Override public void enterExpr31(MiLenguajeParser.Expr31Context ctx) {
        pointer.peek().append(ctx.TK_SWAP() + " ");
    }

    @Override public void enterExpr32(MiLenguajeParser.Expr32Context ctx) {
        pointer.peek().append("=" + " ");
    }

    @Override public void enterExpr33(MiLenguajeParser.Expr33Context ctx) {
        pointer.peek().append(ctx.TK_AUG_PLUS() + " ");
    }

    @Override public void enterExpr34(MiLenguajeParser.Expr34Context ctx) {
        pointer.peek().append(ctx.TK_AUG_MINUS() + " ");
    }

    @Override public void enterExpr35(MiLenguajeParser.Expr35Context ctx) {
        pointer.peek().append(ctx.TK_AUG_ASTER() + " ");
    }

    @Override public void enterExpr36(MiLenguajeParser.Expr36Context ctx) {
        pointer.peek().append(ctx.TK_AUG_DIV() + " ");
    }

    @Override public void enterExpr37(MiLenguajeParser.Expr37Context ctx) {
        pointer.peek().append(ctx.TK_AUG_REMDR() + " ");
    }

    @Override public void enterExpr38(MiLenguajeParser.Expr38Context ctx) {
        pointer.peek().append(ctx.TK_AUG_EXPON() + " ");
    }

    @Override public void enterExpr39(MiLenguajeParser.Expr39Context ctx) {
        pointer.peek().append(ctx.TK_AUG_OR() + " ");
    }

    @Override public void enterExpr40(MiLenguajeParser.Expr40Context ctx) {
        pointer.peek().append(ctx.TK_AUG_AND() + " ");
    }

    @Override public void enterExpr41(MiLenguajeParser.Expr41Context ctx) {
        pointer.peek().append(ctx.TK_AUG_CONCAT() + " ");
    }

    @Override public void enterExpr42(MiLenguajeParser.Expr42Context ctx) {
        pointer.peek().append(ctx.TK_AUG_RSHIFT() + " ");
    }

    @Override public void enterExpr43(MiLenguajeParser.Expr43Context ctx) {
        pointer.peek().append(ctx.TK_AUG_LSHIFT() + " ");
    }

    @Override public void exitSpec_stmt_ls(MiLenguajeParser.Spec_stmt_lsContext ctx) {
        pointer.peek().append(";\n" + space());
    }

    @Override public void exitBody_stmt_ls(MiLenguajeParser.Body_stmt_lsContext ctx) {
        pointer.peek().append(";\n" + space());
    }

    @Override public void enterFor_all_stmt1(MiLenguajeParser.For_all_stmt1Context ctx) {
        pointer.peek().append("for" + " ( var ");
    }

    @Override public void enterFor_all_stmt2(MiLenguajeParser.For_all_stmt2Context ctx) {
        pointer.peek().append(")" + " {\n" + space() + "\t");
    }

    @Override public void enterFor_all_stmt3(MiLenguajeParser.For_all_stmt3Context ctx) {
        pointer.peek().append("\n" + lessSpace() + "}" + "\n");
    }

    @Override public void enterQuantifier1(MiLenguajeParser.Quantifier1Context ctx) {
        aux = ctx.TK_ID().toString();
        pointer.peek().append(ctx.TK_ID() + " ");
    }

    @Override public void enterQuantifier2(MiLenguajeParser.Quantifier2Context ctx) {
        pointer.peek().append("= ");
    }

    @Override public void enterDirection1(MiLenguajeParser.Direction1Context ctx) {
        pointer.peek().append("; " + aux + " <= ");
    }

    @Override public void exitQuantifier3(MiLenguajeParser.Quantifier3Context ctx) {
        pointer.peek().append("; " + aux + "++ ");
    }

    @Override public void enterParameters(MiLenguajeParser.ParametersContext ctx){
        pointer.peek().append(ctx.TK_LPAREN());
    }

    @Override public void exitParameters(MiLenguajeParser.ParametersContext ctx){
        pointer.peek().append(ctx.TK_RPAREN());
    }

    @Override public void enterIf_stmt(MiLenguajeParser.If_stmtContext ctx){
        pointer.peek().append(ctx.TK_IF() + "(" );
    }

    @Override public void exitIf_stmt(MiLenguajeParser.If_stmtContext ctx){
        pointer.peek().append("}");
    }

    @Override public void enterV_stmt(MiLenguajeParser.V_stmtContext ctx){
        pointer.peek().append(ctx.TK_V() + "(" );
    }

    @Override public void exitV_stmt(MiLenguajeParser.V_stmtContext ctx){
        pointer.peek().append(")" );
    }

    @Override public void enterFunction_stmt(MiLenguajeParser.Function_stmtContext ctx){
        if(ctx.TK_ID().toString().equals("write")){
            pointer.peek().append("cout <<");
        }else if(ctx.TK_ID().toString().equals("read")){
            pointer.peek().append("cin  >>");
        }
        else{
            pointer.peek().append(ctx.TK_ID() + "(" );
        }
    }

    @Override public void exitFunction_stmt(MiLenguajeParser.Function_stmtContext ctx){
        if(!ctx.TK_ID().toString().equals("write") && !ctx.TK_ID().toString().equals("read")){
            pointer.peek().append(")");
        }
    }

    @Override public void enterGuarded_cmd1(MiLenguajeParser.Guarded_cmd1Context ctx){
        pointer.peek().append("){");
    }
    @Override public void enterProc(MiLenguajeParser.ProcContext ctx){
        functions.add(new StringBuilder("void  " + ctx.TK_ID() ));
        pointer.add(functions.get(functions.size()-1));
    }

    @Override public void exitProc(MiLenguajeParser.ProcContext ctx){
        pointer.pop().append("\n}\n");
    }

    @Override public void enterParam_names(MiLenguajeParser.Param_namesContext ctx){
        pointer.peek().append(ctx.TK_LPAREN());
    }

    @Override public void exitParam_names(MiLenguajeParser.Param_namesContext ctx){
        pointer.peek().append(ctx.TK_RPAREN()+ "{\n");
    }

    @Override public void enterId_lp(MiLenguajeParser.Id_lpContext ctx){
        pointer.peek().append(ctx.TK_ID());
    }
    @Override public void visitTerminal(TerminalNode node) {

        /*switch (node.getSymbol().getType()) {
            case MiLenguajeParser.TK_INT:
                pointer.peek().append(node.getSymbol().getText() + " ");
            case MiLenguajeParser.TK_ID:
                pointer.peek().append(node.getSymbol().getText() + " ");
        }*/
    }

}
