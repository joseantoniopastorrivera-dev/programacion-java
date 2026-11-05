// Autor: JAPR
// Fecha: 27/01/26
// Insertar un número en un array ordenado
// 1. Genera un array de 12 números aleatorios (0-200).
// 2. Muestra el array original con sus índices.
// 3. Pide un número nuevo y la posición donde insertarlo (0-11).
// 4. Desplaza los elementos a la derecha para hacer hueco (el último se pierde).
// 5. Muestra el array resultante.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja5Ejercicio19 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables y arrays necesarios
        int numeros[] = new int[12];
        int aux[] = new int[12];
        int nuevoNumero;
        int indice;

        // Generamos el array aleatorio
        for (int i = 0; i < 12; i++) {
            numeros[i] = (int) (Math.random() * 201);
        }

        // Mostramos por pantalla el array original
        System.out.print("--ARRAY ORIGINAL--\n");
        System.out.print("ÍNDICE: ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("\t%3d ", i);
        }
        System.out.println();
        System.out.print("VALOR: \t");
        for (int i = 0; i < 12; i++) {
            System.out.printf("\t%3d ", numeros[i]);
        }
        System.out.println("\n");

        // Pedimos nuevo número y posición dentro del array
        System.out.println("Introduzca el nuevo número: ");
        nuevoNumero = scanner.nextInt();

        System.out.println("\nIntroduzca la posición (índice) que quiere que ocupe: ");
        indice = scanner.nextInt();

        // Verificamos que la posición es válida
        if (indice < 0 || indice > 11) {
            System.out.println("ERROR, introduzca un índice válido.");
            scanner.close();
            return;
        } else {
            // Llenamos del principio del array aux[] al índice seleccionado por el usuario
            for (int i = 0; i < indice; i++) {
                aux[i] = numeros[i];
            }
            // Introducimos el nuevo valor en la posición seleccionada por el usuario
            aux[indice] = nuevoNumero;

            // Rellenamos el resto del array
            for (int i = (indice + 1); i < 12; i++) {
                aux[i] = numeros[i - 1];
            }
        }

        // Imprimimos el resultado por pantalla
        System.out.print("--ARRAY NUEVO--\n");
        System.out.print("ÍNDICE: ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("\t%3d ", i);
        }
        System.out.println();
        System.out.print("VALOR: \t");
        for (int i = 0; i < 12; i++) {
            System.out.printf("\t%3d ", aux[i]);
        }
        System.out.println("\n");
        // Apagamos el scanner
        scanner.close();
    }
}
