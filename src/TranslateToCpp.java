import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TranslateToCpp extends MiLenguajeBaseListener {

    // Flujo de escritura en el archivo
    BufferedWriter br;

    // Estructura de C++
    ArrayList<String> imports;      // Lineas de Importaciones
    String namespace;               // Linea Namespace
    ArrayList<String> globals;      // Lista variables globales
    ArrayList<String> functions;    // Lista funciones
    String main;                    // Función principal

    // Constructor
    public TranslateToCpp() {
        try {

            // Crear objeto de escritura
            FileWriter writer = new FileWriter("output/salida.txt");
            // Crear objeto de escritura directa
            br = new BufferedWriter(writer);

            // Instanciar estructura C++
            imports = new ArrayList<>();
            namespace = "using namespace std;";
            globals = new ArrayList<String>();
            functions = new ArrayList<String>();
            main = "int main() {\n\t";

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    // Escribir en archivo
    public void write(String text){
        try {

            // Escribir importaciones
            for (String imprt: imports) {
                br.write("\n" + imprt);
            }
            br.write(text);

            // Escribir namespace
            br.write("\n" + namespace);

            // Escribir variables globales
            for (String global: globals) {
                br.write("\n" + global);
            }
            br.write(text);

            // Escribir funciones
            for (String function: functions) {
                br.write("\n" + function);
            }
            br.write(text);

            // Escribir Main
            br.write("\n" + namespace);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
