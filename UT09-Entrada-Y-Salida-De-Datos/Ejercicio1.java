import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Ejercicio1 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("ejercicio01.txt")) {
            fw.write("Fecha y hora actual: " + LocalDateTime.now());
            System.out.println("Fichero creado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }
}