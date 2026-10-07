package AlgoritmosOrdenacion;

public class Insercion {
    /*
     * Algoritmo Inserción
     * - La parte izquierda del array se considera ya ordenada.
     * - Toma un elemento y lo inserta en su hueco correcto desplazando los demás.
     */
    public static void ordenar(int[] numeros) {
        int actual;   // Valor que vamos a insertar
        int posicion; // Posición donde se insertará

        // Comenzamos desde el segundo elemento (el primero ya se considera ordenado)
        for (int i = 1; i < numeros.length; i++) {
            actual = numeros[i];
            posicion = i;

            /*
             * Mientras no lleguemos al inicio y el elemento de la izquierda
             * sea mayor que el actual, desplazamos hacia la derecha.
             */
            while (posicion > 0 && numeros[posicion - 1] > actual) {
                numeros[posicion] = numeros[posicion - 1];
                posicion--;
            }
            // Insertamos el valor en el hueco que hemos abierto
            numeros[posicion] = actual;
        }
    }
}