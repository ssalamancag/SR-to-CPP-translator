import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TranslateToCpp extends MiLenguajeBaseListener {

    BufferedWriter br;

    public TranslateToCpp() {

        try {

            // Crear objeto de escritura
            FileWriter writer = new FileWriter("output/salida.txt");
            // Crear objeto de escritura directa
            br = new BufferedWriter(writer);

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    // Escribir en archivo
    public void write(String text){
        try {
            br.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Al visitar terminal
    @Override public void visitTerminal(TerminalNode node) {
        write(node.getSymbol().getText());
    }


}
