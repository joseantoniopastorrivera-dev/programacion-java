package AlgoritmosOrdenacion;

public class Seleccion {
    /*
     * Algoritmo de Selección
     * - Busca el menor elemento de toda la lista.
     * - Lo intercambia con la posición actual (i).
     * - Hace menos intercambios que la burbuja.
     */
    public static void ordenar(int[] numeros) {
        int posicionMenor;
        int auxiliar;
        
        for (int i = 0; i < numeros.length; i++) {
            // Suponemos que el menor está en la posición actual
            posicionMenor = i;
            
            // Buscamos si hay alguien menor en el resto del array
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[posicionMenor]) {
                    posicionMenor = j;
                }
            }
            
            // Intercambiamos el elemento actual con el menor encontrado
            auxiliar = numeros[i];
            numeros[i] = numeros[posicionMenor];
            numeros[posicionMenor] = auxiliar;
        }
    }
}