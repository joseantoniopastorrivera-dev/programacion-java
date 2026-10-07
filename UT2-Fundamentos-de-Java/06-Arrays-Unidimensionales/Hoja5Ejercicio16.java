//Autor: JAPR
//Fecha: 27/01/26
//Array de 20 números (0-400). Resaltar múltiplos de 5 o 7.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja5Ejercicio16 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables y arrays necesarios
        int numeros[] = new int[20];
        int multiplo;

        // Generamos el array con numeros aleatorios
        for (int i = 0; i < 20; i++) {
            numeros[i] = (int) (Math.random() * 401);
        }

        // Mostramos el array generado aleatoriamente por pantalla
        System.out.println("----ARRAY DE NUMEROS ALEATORIOS----");
        for (int i = 0; i < 20; i++) {
            System.out.printf("%d ", numeros[i]);
        }

        // Salto de línea estético
        System.out.println("\n");

        // Preguntamos que se quiere resaltar
        System.out.println("Indique si desea resaltar los múltiplos de 5 o 7: ");
        multiplo = scanner.nextInt();

        // Desechamos cualquier opción que no sea 5 o 7
        if (multiplo != 5 && multiplo != 7) {
            System.out.println("ERROR, introduzca un valor válido.");
            // Divisible entre 5
        } else if (multiplo == 5) {
            for (int i = 0; i < 20; i++) {
                if (numeros[i] % 5 != 0) {
                    System.out.printf("%d ", numeros[i]);
                } else {
                    System.out.printf("[%d] ", numeros[i]);
                }
            }
        } else {
            for (int i = 0; i < 20; i++) {
                if (numeros[i] % 7 != 0) {
                    System.out.printf("%d ", numeros[i]);
                } else {
                    System.out.printf("[%d] ", numeros[i]);
                }
            }
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
