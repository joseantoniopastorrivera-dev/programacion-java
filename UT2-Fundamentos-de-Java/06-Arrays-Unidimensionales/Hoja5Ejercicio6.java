//Autor: JAPR
//Fecha: 07/01/26
//Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los elementos de ese array,
//es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. 
//El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente, muestra el contenido del array.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja5Ejercicio6 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos el array
        double numeros[] = new double[15];
        double aux;

        // Pedimos los datos por teclado
        for (int i = 0; i < 15; i++) {
            System.out.printf("Introduzca el número %d de 15 por teclado: ", (i + 1));
            numeros[i] = scanner.nextDouble();
            // Salto de línea estético
            System.out.println();
        }

        // Movemos los datos del array
        // Guardamos en una variable auxiliar el valor de la ultima posición
        aux = numeros[14];
        // Movemos el resto de valores
        for (int i = 14; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        // Recuperamos el valor de la posición 0 con aux
        numeros[0] = aux;

        // Imprimimos el resultado por pantalla
        System.out.println("Array con valores modificados: ");
        for (int i = 0; i < 15; i++) {
            System.out.println(numeros[i]);
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }

}
