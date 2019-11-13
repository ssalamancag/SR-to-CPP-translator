import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {

            // crear un analizador léxico que se alimenta a partir de la entrada (archivo  o consola)
            MiLenguajeLexer lexer;
            /*if (args.length>0)
                lexer = new MiLenguajeLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new MiLenguajeLexer(CharStreams.fromStream(System.in));*/
            lexer = new MiLenguajeLexer(CharStreams.fromFileName("input/2.txt"));

            // Crear objeto que realiza el reorrido de tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Crear analizador sintáctico (Nombre de la gramatica + Parser)
            MiLenguajeParser parser = new MiLenguajeParser(tokens);

            // Crear objeto que realiza el reorrido de la gramatica desde la regla inicial (parcer. + nombre de la regla inicial de la gramatica + ())
            ParseTree tree = parser.inicio();

            // Crear objeto que realiza acciones en el recorrido de la gramatica
            ParseTreeWalker walker = new ParseTreeWalker();

            // Realizar recorrido con las acciones de traducción de la clase en la gramatica dada
            TranslateToCpp t = new TranslateToCpp();
            walker.walk(t, tree);
            t.br.close();


    }
}
