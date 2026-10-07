//Autor: JAPR
//Fecha: 30/01/26
//Escribe un programa que muestre 50 números enteros aleatorios comprendidos entre el -100 y el 200 ambos incluidos 
// y separados por espacios. Muestra luego el máximo de los pares el mínimo de los impares y la media de todos los números generados.

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio19 {

    public static void main(String[] args) {

        // Variables/Arrays
        int numeros[] = new int[50];
        int parMayor = -101;
        int imparMenor = 201;
        int total = 0;
        double media;

        // Mostramos original y clasificamos en pares e impares
        System.out.println("--NÚMEROS ALEATORIOS ENTRE -100 Y 200--");
        for (int i = 0; i < 50; i++) {
            numeros[i] = (int) (Math.random() * 301) - 100;
            System.out.printf("%d ", numeros[i]);
            if (numeros[i] % 2 == 0) {
                 if (numeros[i] > parMayor) {
                parMayor = numeros[i];
            }
            } else {
                if (numeros[i] < imparMenor) {
                imparMenor = numeros[i];
            }
            }
            total += numeros[i];
        }
        System.out.println();
       
        System.out.println("PAR MAYOR: " + parMayor);

        System.out.println("IMPAR MENOR: " + imparMenor);

        media = (double)total / 50;
        System.out.println("MEDIA DE TODOS LOS NÚMEROS GENERADOS: " + media);
    }
}
