import java.io.File;
import java.util.Scanner;

public class LeerFichero02xd {
    public static void main(String[] args) {
        try {
            File file = new File("Persona.java");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                System.out.println(linea);// Muestro por pantalla el contenido
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error al leer el fichero" + e.toString());
        }
    }
}
