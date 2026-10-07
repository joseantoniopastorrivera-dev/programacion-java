//Autor: JAPR
//Fecha: 10/Mar/2026
//Ciclista, líneas de km hasta 'fin'

package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lineasKilometros = new ArrayList<>();
        String entrada;

        System.out.println("Introduce los 7 valores de la semana (o 'fin' para terminar):");
        while (!(entrada = scanner.nextLine()).equalsIgnoreCase("fin")) {
            lineasKilometros.add(entrada);
        }

        // Procesar cada cadena guardada
        for (String linea : lineasKilometros) {
            String[] partes = linea.split(" "); // Divide la cadena por los espacios
            int[] semana = new int[7];
            
            for (int i = 0; i < partes.length && i < 7; i++) {
                semana[i] = Integer.parseInt(partes[i]); // Convierte texto a número
            }
            
            // Ejemplo: mostrar el primer día de cada semana procesada
            System.out.println("Km procesados del lunes: " + semana[0]);

            scanner.close();
        }
    }
}
