//Autor: JAPR
//Fecha: 30/01/26
//Escribe un programa que muestre por pantalla 100 números enteros separados por un espacio. 
//Los números deben estar generados de forma aleatoria en un rango entre 10 y 200 ambos incluidos. 
//Los primos deben aparecer entre almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio25 {

    public static void main(String[] args) {

        int numeros[] = new int[100];
        System.out.println("--NÚMEROS ALEATORIOS RESALTANDO PRIMOS CON ALMOHADILLAS--");
        for (int i = 0; i < 100; i++) {
            int numeroRandom = (int) (Math.random() * 191) + 10;
            numeros[i] = numeroRandom;
            boolean esPrimo = true;
            for (int j = (numeroRandom - 1); j > 1; j--) {
                if (numeroRandom % j == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                System.out.print("#" + numeros[i] + "# ");
            } else if (numeroRandom % 5 == 0) {
                System.out.print("[" + numeros[i] + "] ");
            } else {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
