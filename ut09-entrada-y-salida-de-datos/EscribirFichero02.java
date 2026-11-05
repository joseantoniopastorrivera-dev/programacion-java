import java.io.*;

/* Ejemplo que escribe 10 líneas en un fichero
 */
public class EscribirFichero02 {
    public static void main(String[] args) {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter("mensaje2.txt");
            pw = new PrintWriter(fichero);
            for (int i = 1; i <= 10; i++) {
                pw.println("Línea " + i);
            }
            fichero.close();
            System.out.println("Fichero escrito correctamente");
        } catch (IOException e) {

            System.out.println("Error al escribir el fichero" + e.toString());
        } catch (Exception e) {
            System.out.println("Error al escribir el fichero" + e.toString());
        }
    }
}
