//Autor: JAPR
//Fecha: 27/01/26
//Los Reyes Godos
// 1. Pide la cantidad de reyes que se van a introducir.
// 2. Lee los nombres de los reyes y guárdalos en un array.
// 3. Muestra los nombres añadiendo su ordinal (1º, 2º...) según el orden de aparición.
//    Ejemplo: Felipe, Carlos, Felipe -> Felipe 1º, Carlos 1º, Felipe 2º.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja5Ejercicio20 {

    // Método main o puerta de entrad
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos la cantidad de reyes
        int cantidadReyes;

        // Preguntamos cuantos reyes van a ser
        System.out.println("Introduzca la cantidad de reyes que va a introducir: ");
        cantidadReyes = scanner.nextInt();

        // Limpiamos el buffer del scanner
        scanner.nextLine();

        // Declaramos el tamaño del array en base a la cantidad de reyes
        String nombreReyes[] = new String[cantidadReyes];

        // Pedimos los nombres de los reyes y los guardamos en el array nombreReyes[]
        for (int i = 0; i < cantidadReyes; i++) {
            System.out.printf("Nombre del rey %d: \n", i + 1);
            nombreReyes[i] = scanner.nextLine();
        }

        // Contamos la cantidad de veces que se repite el nombre del rey
        for (int i = 0; i < cantidadReyes; i++) {
            int orden = 0;
            for (int j = 0; j <= i; j++) {
                if (nombreReyes[i].equals(nombreReyes[j])) {
                    orden++;
                }
            }
            // Imprimimos el nombre junto al índice
            System.out.println(nombreReyes[i] + " " + orden + "º");

        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
