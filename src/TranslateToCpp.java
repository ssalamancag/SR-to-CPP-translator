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
        bodies.add(new StringBuilder("class body" + ctx.TK_ID() + "(" + ctx.TK_ID() +" " + ctx.TK_ID() + ") {\n\tpublic:\n\t\t"));
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
        // Reemplazar ultimo var por int
        int pos = pointer.peek().lastIndexOf("var");
        pointer.peek().replace(pos, pos + 3, "int");
        pointer.peek().append(ctx.NUM() + "; ");
    }

    @Override public void enterVar_att2(MiLenguajeParser.Var_att2Context ctx) {
        // Reemplazar ultimo var por int
        int pos = pointer.peek().lastIndexOf(" ");
        pointer.peek().replace(pos, pos + 1, "");
        pointer.peek().append(";");
    }

    @Override public void enterBasic_type1(MiLenguajeParser.Basic_type1Context ctx) {
        // Reemplazar ultimo var por int
        int pos = pointer.peek().lastIndexOf("var");
        pointer.peek().replace(pos, pos + 3, "int");
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
