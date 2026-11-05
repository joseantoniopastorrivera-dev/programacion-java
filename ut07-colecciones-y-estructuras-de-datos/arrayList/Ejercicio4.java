//Autor: JAPR
//Fecha: 10/Mar/2026
//Centro numérico. Números por línea hasta -1

package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> centroNumerico = new ArrayList<>();
        int num = 0;

        System.out.println("Introduce números uno por línea (termina con -1):");
        while (num != -1) {
            num = scanner.nextInt();
            if (num != -1) {
                centroNumerico.add(num);
            }
        }
        System.out.println("Lista final: " + centroNumerico);

        scanner.close();
    }
}