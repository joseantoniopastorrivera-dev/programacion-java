//Autor: JAPR
//Fecha: 28/01/26
//Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
// Muestra también el máximo, el mínimo y la media de esos números.

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio5 {

    public static void main(String[] args) {

        // Variables/Arrays
        int numeros[] = new int[50];
        int min = 199;
        int max = 100;
        int suma = 0;

        // Rellenamos array
        for (int i = 0; i < 50; i++) {
            numeros[i] = (int) (Math.random() * 100) + 100;
            // Imprimimos original
            System.out.printf("%3d ", numeros[i]);
            // Máximo
            if (numeros[i] <= min) {
                min = numeros[i];
                // Mínimo
            } else if (numeros[i] >= max) {
                max = numeros[i];
            }
            // Suma
            suma = suma + numeros[i];
        }

        // Imprimimos el resultado final
        System.out.println("\n--SOLUCIÓN--");
        System.out.println("El máximo es: " + max);
        System.out.println("El mínimo es: " + min);
        System.out.println("LA suma es: " + suma);
        // Array con los datos resaltados
        for (int i = 0; i < 50; i++) {
            // Resaltamos el máximo
            if (numeros[i] == max) {
                System.out.printf("MÁXIMO->%3d<-MÁXIMO ", max);
            } else if (numeros[i] == min) {
                System.out.printf("MÍNIMO->%3d<-MÍNIMO ", min);
            } else
                System.out.printf("%d ", numeros[i]);
        }
    }
}
