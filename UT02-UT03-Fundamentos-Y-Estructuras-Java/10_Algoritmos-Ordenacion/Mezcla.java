package AlgoritmosOrdenacion;

public class Mezcla {
    /*
     * Algoritmo Ordenación Mezcla (Merge Sort)
     * - Paso 1: Divide el array en mitades recursivamente.
     * - Paso 2: Ordena cada mitad.
     * - Paso 3: Fusiona las mitades ordenadas.
     */
    public static void ordenar(int[] numeros) {
        if (numeros.length > 1) {
            int mitad = numeros.length / 2;

            // --- Paso 1: División ---
            int[] izquierda = new int[mitad];
            int[] derecha = new int[numeros.length - mitad];

            // Copiamos datos a los subarrays
            for (int i = 0; i < mitad; i++) {
                izquierda[i] = numeros[i];
            }
            for (int i = mitad; i < numeros.length; i++) {
                derecha[i - mitad] = numeros[i];
            }

            // --- Paso 2: Recursividad ---
            ordenar(izquierda);
            ordenar(derecha);

            // --- Paso 3: Fusión ---
            mezclar(numeros, izquierda, derecha);
        }
    }

    // Método auxiliar privado para juntar dos arrays ordenados
    private static void mezclar(int[] resultado, int[] izquierda, int[] derecha) {
        int i = 0; // índice de izquierda
        int j = 0; // índice de derecha
        int k = 0; // índice de resultado (array final)

        // Mientras haya elementos en ambos lados, comparamos y rellenamos
        while (i < izquierda.length && j < derecha.length) {
            if (izquierda[i] <= derecha[j]) {
                resultado[k] = izquierda[i];
                i++;
            } else {
                resultado[k] = derecha[j];
                j++;
            }
            k++;
        }

        // Copiamos los sobrantes de la izquierda
        while (i < izquierda.length) {
            resultado[k] = izquierda[i];
            i++;
            k++;
        }

        // Copiamos los sobrantes de la derecha
        while (j < derecha.length) {
            resultado[k] = derecha[j];
            j++;
            k++;
        }
    }
}