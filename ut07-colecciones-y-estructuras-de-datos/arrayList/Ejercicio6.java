//Autor: JAPR
//Fecha: 10/Mar/2026
//Array list de luchadores

package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Leer la cantidad de luchadores (L)
        System.out.print("Introduce la cantidad de luchadores: ");
        int L = scanner.nextInt();
        
        // 2. Creamos un ArrayList para guardar vectores de 2 posiciones [peso, altura]
        // También podrías usar un ArrayList de una clase "Luchador", pero esto es más rápido para el examen
        ArrayList<int[]> listaLuchadores = new ArrayList<>();

        System.out.println("Introduce el peso(g) y la altura(cm) de cada luchador:");

        for (int i = 0; i < L; i++) {
            System.out.println("Luchador " + (i + 1) + ":");
            int peso = scanner.nextInt();
            int altura = scanner.nextInt();
            
            // Guardamos los dos datos en un mini-vector y lo añadimos a la lista
            int[] datosLuchador = {peso, altura};
            listaLuchadores.add(datosLuchador);
        }

        // 3. Mostrar los resultados procesados
        System.out.println("\n--- LISTADO DE LUCHADORES ---");
        for (int i = 0; i < listaLuchadores.size(); i++) {
            int[] actual = listaLuchadores.get(i);
            System.out.println("Luchador #" + (i + 1) + " -> Peso: " + actual[0] + "g, Altura: " + actual[1] + "cm");
        }

        scanner.close();
    }
}