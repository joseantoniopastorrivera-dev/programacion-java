package AlgoritmosOrdenacion;

import java.util.Arrays;

public class TestAlgoritmosOrdenacion {

    public static void main(String[] args) {
        // Array base desordenado
        int[] original = { 8, 3, 5, 1, 9, 2, 7, 4, 6 };
        
        System.out.println("ARRAY ORIGINAL: " + Arrays.toString(original));

        // --- PRUEBA 1: BURBUJA ---
        int[] copia1 = original.clone(); // Usamos clon para no romper el original
        System.out.println("\n--- MÉTODO BURBUJA ---");
        Burbuja.ordenar(copia1); // Llamamos a la clase Burbuja
        System.out.println("Ordenado: " + Arrays.toString(copia1));

        // --- PRUEBA 2: SELECCIÓN ---
        int[] copia2 = original.clone();
        System.out.println("\n--- MÉTODO SELECCIÓN ---");
        Seleccion.ordenar(copia2); // Llamamos a la clase Seleccion
        System.out.println("Ordenado: " + Arrays.toString(copia2));

        // --- PRUEBA 3: INSERCIÓN ---
        int[] copia3 = original.clone();
        System.out.println("\n--- MÉTODO INSERCIÓN ---");
        Insercion.ordenar(copia3); // Llamamos a la clase Insercion
        System.out.println("Ordenado: " + Arrays.toString(copia3));

        // --- PRUEBA 4: MEZCLA ---
        int[] copia4 = original.clone();
        System.out.println("\n--- MÉTODO MEZCLA ---");
        Mezcla.ordenar(copia4); // Llamamos a la clase Mezcla
        System.out.println("Ordenado: " + Arrays.toString(copia4));
    }
}