//Autor: JAPR
//Fecha: 01/02/26
//Realiza  “JuegoAlex”. Las reglas son las siguientes:
//Al comenzar la partida, el jugador introduce la cantidad de dinero que quiere apostar. 
//Se muestra la tirada aleatoria de dos dados. 
//Si entre los dos dados suman 7 u 11, el jugador gana la misma cantidad que apostó y termina la partida. 
// Por ej. si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. 
// Si entre los dos dados suman 2, 3 o 12, el jugador pierde todo su dinero y termina la partida. 
// Si no se da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego entra en una segunda etapa. 
// En esta etapa, el jugador buscará volver a obtener ese número en los dados. 
// Si consigue repetir ese número, gana. Si sale un 7, pierde. Si sale otro número, tiene que seguir tirando.

package Hoja6_NumerosAleatorios;

import java.util.Scanner;

public class Hoja6Ejercicio31 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double dineroInicial;
        double apuesta;
        double dineroActual = 0;
        do {
            System.out.println("Introduzca la cantidad de dinero que tiene para jugar: ");
            dineroInicial = scanner.nextDouble();
        } while (dineroInicial <= 0);

        do {
            System.out.println("Introduzca la cantidad de dinero que desea apostar: ");
            apuesta = scanner.nextDouble();
            if (apuesta > dineroInicial) {
                System.out.println("No puede apostar más dinero del que tiene.");
            }
        } while (apuesta <= 0 || apuesta > dineroInicial);

        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        int suma1 = dado1 + dado2;
        int suma2;

        System.out.printf("--PRIMERA TIRADA--\nDado 1: %d\nDado 2: %d\nSuma: %d", dado1, dado2, suma1);

        if (suma1 == 7 || suma1 == 11) {
            System.out.println("\nHa doblado su apuesta.");
            dineroActual = dineroInicial + apuesta;
        } else if (suma1 == 2 || suma1 == 3 || suma1 == 12) {
            System.out.println("\nHa perdido su apuesta.");
            dineroActual = dineroInicial - apuesta;
        } else {
            System.out.printf(
                    "\nEntramos en la fase 2 del juego, la suma de su tirada es: %d.\nEn caso de volver a obtener dicho valor doblará su apuesta, en caso de obtener un 7 perderá la apuesta.",
                    suma1);
            int contadorTiradas = 1;
            do {
                dado1 = (int) (Math.random() * 6) + 1;
                dado2 = (int) (Math.random() * 6) + 1;
                suma2 = dado1 + dado2;
                System.out.printf("\n--SEGUNDA FASE DEL JUEGO(TIRADA %d)--\nDado 1: %d\nDado 2: %d\nSuma: %d",
                        contadorTiradas, dado1, dado2, suma2);
                if (suma1 == suma2) {
                    dineroActual = dineroInicial + apuesta;
                    System.out.println("\nHa doblado su apuesta.");
                } else if (suma2 == 7) {
                    dineroActual = dineroInicial - apuesta;
                    System.out.println("\nHa perdido su apuesta.");
                } else {
                    System.out.println("\nLa suma de los dados no coincice, volvemos a tirar.");
                }
                contadorTiradas++;
            } while (suma1 != suma2 && suma2 != 7);

        }

        System.out.println("\nDinero inicial: " + dineroInicial);
        System.out.println("Apuesta: " + apuesta);
        System.out.println("Dinero actual: " + dineroActual);

        scanner.close();
    }
}