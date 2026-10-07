//Autor: JAPR
//Fecha: 30/01/26
//Realiza un programa que sea capaz de recolocar los números de un array de fuera hacia adentro. 
//En primer lugar, el programa pedirá al usuario el tamaño del array.
//A continuación generará un array con ese tamaño con números enteros aleatorios entre 0 y 200 ambos incluidos.
//Seguidamente el programa irá colocando desde fuera hacia adentro los números de tal forma que 
// el primero se coloca en la primera posición, el segundo en la última, el tercero en la segunda, 
// el cuarto en la penúltima, el quinto en la tercera, en sexto en la antepenúltima, etc.
// Se debe mostrar por pantalla tanto el array original como el array resultado.

package Hoja6_NumerosAleatorios;

import java.util.Scanner;

public class Hoja6Ejercicio28 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el tamaño del array: ");
        int tamaño = scanner.nextInt();
        int numeros[] = new int[tamaño];

        // ARRAY ORIGINAL
        System.out.println("--ARRAY ORIGINAL--");
        System.out.print("ÍNDICE: ");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(i + "\t ");
        }
        System.out.println();
        System.out.print("VALOR:  ");
        for (int i = 0; i < tamaño; i++) {
            int numeroRandom = (int) (Math.random() * 201);
            numeros[i] = numeroRandom;
            System.out.print(numeros[i] + "\t ");
        }

        // RELLENAMOS LOS ARRAY AUXILIARES
        int aux[] = new int[tamaño];
        int numerosAuxImpares[] = new int[tamaño / 2];
        // Caso del array original par
        if (tamaño % 2 == 0) {
            int numerosAuxPares[] = new int[tamaño / 2];
            for (int i = 0; i < tamaño / 2; i++) {
                numerosAuxPares[i] = numeros[2 * i];
                numerosAuxImpares[i] = numeros[(2 * i) + 1];
            }
            // Rellenamos el array final aux con los pares e impares
            for (int i = 0; i < (tamaño / 2); i++) {
                aux[i] = numerosAuxPares[i];
            }
            for (int i = 0; i < (tamaño / 2); i++) {
                aux[tamaño - 1 - i] = numerosAuxImpares[i];
            }

            // Caso del array original impar
        } else {
            int numerosAuxPares[] = new int[(tamaño / 2) + 1];
            for (int i = 0; i < ((tamaño / 2) + 1); i++) {
                numerosAuxPares[i] = numeros[2 * i];
                if (i < numerosAuxImpares.length) {
                    numerosAuxImpares[i] = numeros[(2 * i) + 1];
                }
            }

            // Rellenamos el array final aux con los pares e impares
            for (int i = 0; i < (tamaño / 2) + 1; i++) {
                aux[i] = numerosAuxPares[i];
            }
            for (int i = 0; i < (tamaño / 2); i++) {
                aux[tamaño - 1 - i] = numerosAuxImpares[i];
            }
        }

        System.out.println("\n");
        // ARRAY MODIFICADO
        System.out.println("--ARRAY MODIFICADO--");
        System.out.print("ÍNDICE: ");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(i + "\t ");
        }
        System.out.println();
        System.out.print("VALOR:  ");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(aux[i] + "\t ");
        }
        scanner.close();
    }
}
