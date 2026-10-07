//Autor: JAPR
//Fecha: 10/Mar/2026
//Cantidades separadas por espacios hasta cero

package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> cajero = new ArrayList<>();
        int cantidad;

        System.out.println("Introduce cantidades (termina con 0):");
        do {
            cantidad = scanner.nextInt();
            if (cantidad != 0) {
                cajero.add(cantidad);
            }
        } while (cantidad != 0);

        System.out.println("Cantidades guardadas: " + cajero);

        scanner.close();
    }
}
