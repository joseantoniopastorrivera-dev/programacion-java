//Autor: JAPR
//Fecha: 10/Mar/2026
//Almacenar números del 0 al 9

package arrayList;
import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        // Usamos un bucle for para llenar la lista
        for (int i = 0; i <= 9; i++) {
            numeros.add(i);
        }
        System.out.println("Números del 0 al 9: " + numeros);
    }
}