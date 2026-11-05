package AlgoritmosOrdenacion;

public class Burbuja {
    /*
     * Algoritmo de la burbuja
     * - Compara elementos consecutivos.
     * - Si están en mal orden, los intercambia.
     * - El más grande "burbujea" hasta el final.
     */
    public static void ordenar(int[] numeros) {
        int auxiliar;
        // Recorremos los elementos del vector
        for (int i = 0; i < numeros.length - 1; i++) {
            // En cada pasada comparamos elementos consecutivos
            for (int j = 0; j < numeros.length - 1; j++) {
                // Comparamos
                if (numeros[j] > numeros[j + 1]) { // Si el actual es mayor que el siguiente
                    auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
                }
            }
        }
    }
}