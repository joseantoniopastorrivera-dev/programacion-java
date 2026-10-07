
import java.io.*;

/**
 * Ejemplo de escritura de fichero utilizando la clase PrintWriter
 */

public class EscribirFichero01 {
    public static void main(String[] args) {
        String cadena1 = "Esto es un ejemplo";
        String cadena2 = "de escritura de un fichero";
        try {
            PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("salida.txt")));
            salida.println(cadena1);
            salida.println(cadena2);
            salida.close();
            System.out.println("Fichero escrito correctamente");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error al escribir el fichero" + e.toString());
        }
    }
}
