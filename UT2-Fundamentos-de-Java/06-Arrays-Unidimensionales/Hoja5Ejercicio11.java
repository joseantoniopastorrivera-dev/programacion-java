// Autor: JAPR
// Fecha: 25/01/26
// Objetivo: Generar 10 números, y mover los PRIMOS al principio.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja5Ejercicio11 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos Arrays y variables
        int numeros[] = new int[10];
        int primos[] = new int[10];
        int noPrimos[] = new int[10];
        int numerosOrdenados[] = new int[10];
        int contadorPrimos = 0;
        int contadorNoPrimos = 0;

        // Pedimos los datos por teclado y los guardamos en el Aaray
        for (int i = 0; i < 10; i++) {
            System.out.printf("Dato %d: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        // Comprobamos si son primos
        for (int i = 0; i < 10; i++) {
            boolean esPrimo = true;
            if (numeros[i] <= 1) {// Descartamos el cero y 1 porque no son primos
                esPrimo = false;
            } else {
                for (int j = (numeros[i] - 1); j > 1; j--) {// Este bucle inverso es el que comprueba si es primo
                    if (numeros[i] % j == 0) {
                        esPrimo = false;// Si no encuentra un divisor del número, entonces no es primo
                        break;// Forzamos la salida del bucle porque ya sabemos que no es primo
                    }
                }
            }
            // Asignamos el número en el array correspondiente
            if (esPrimo) {
                primos[contadorPrimos] = numeros[i];
                contadorPrimos++;
            } else {
                noPrimos[contadorNoPrimos] = numeros[i];
                contadorNoPrimos++;
            }
        }

        // Construimos el array final
        // Primero los primos como pide el ejercicio
        for (int i = 0; i < contadorPrimos; i++) {
            numerosOrdenados[i] = primos[i];
        }
        for (int i = 0; i < contadorNoPrimos; i++) {
            numerosOrdenados[i + contadorPrimos] = noPrimos[i];
        }

        // Mostramos el resultado final
        //Array original
        System.out.println("--ARRAY ORIGINAL--");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Índice %d\tDato pedido %d\n",i , numeros[i]);
        }
        //Array ordenado
        System.out.println("--ARRAY ORDENADO--");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Índice %d\tDato ordenado %d: %d\n", i, i + 1, numerosOrdenados[i]);
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
