//Autor: JAPR
//Fecha: 07/01/26
//Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados por espacios.
//El programa pedirá entonces por teclado dos valores y a continuación cambiará todas las  ocurrencias del primer valor 
//por el segundo en la lista generada anteriormente. Los números que se han cambiado deben aparecer entrecomillados.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja5Ejercicio7 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        int numeros[] = new int[100];

        // Generamos los valores random para el array y los imprimimos con un espacio
        // entre cada uno y los imprimimos
        System.out.println("Lista original de números: ");
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int) (Math.random() * 21);
            System.out.print(numeros[i] + " ");
        }
        // Salto de línea estético
        System.out.println();

        // Pedimos por teclado los números
        System.out.println("Introduzca el número que desea sustituir: ");
        int valorViejo = scanner.nextInt();
        System.out.println("Introduza el nuevo número: ");
        int valorNuevo = scanner.nextInt();

        // Imprimimos el resultado de la nueva lista
        System.out.println("Nueva lista de números: ");
        for (int i = 0; i < 100; i++) {
            if (numeros[i] == valorViejo) {
                System.out.print("\"" + valorNuevo + "\" ");
                numeros[i] = valorNuevo;
            } else {
                System.out.print(numeros[i] + " ");
            }
        }
        //Salto de línea estético
        System.out.println();

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }

}
