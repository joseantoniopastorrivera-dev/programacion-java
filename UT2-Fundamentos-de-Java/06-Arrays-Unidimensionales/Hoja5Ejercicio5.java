//Autor: JAPR
//Fecha: 07/01/26
//Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos junto con las palabras
//“máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja5Ejercicio5 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        int numero[] = new int[10];
        int maximo = 0, minimo = 0;

        // Pedimos por teclado usando un bucle
        for (int i = 0; i < 10; i++) {
            System.out.printf("Introduce el número %d de 10: ", (i + 1));
            numero[i] = scanner.nextInt();
        }

        // Calculamos máximo y mínimo
        maximo = numero[0];
        minimo = numero[0];

        //Recorremos el array
        for(int i = 0; i < 10; i++){
            if (numero[i] < minimo) {
                minimo = numero[i];
            }
            if (numero[i] > maximo) {
                maximo = numero[i];
            }
        }

        //Mostramos el resultado por pantalla
        System.out.println("\nLista de números: ");

        for (int i = 0; i < 10; i++) {
        System.out.print(numero[i]);
        if (numero[i] == maximo) {
            System.out.print(" Máximo");
        }
        if (numero[i] == minimo) {
            System.out.print(" Mínimo.");
        }
        System.out.println();
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }

}
