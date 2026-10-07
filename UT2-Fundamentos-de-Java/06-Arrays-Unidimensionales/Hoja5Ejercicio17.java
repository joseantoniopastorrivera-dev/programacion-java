//Autor: JAPR
//Fecha: 27/01/26
//Ejercicio 17
// 1. Generar 10 números aleatorios (0-100) y mostrarlos.
// 2. Pedir al usuario que elija uno (validando que exista en el array).
// 3. Rotar el array a la derecha repetidamente hasta que el número elegido 
//    esté en la primera posición (índice 0).

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja5Ejercicio17 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos arrays y variables necesarias
        int numeros[] = new int[10];
        int aux[] = new int[10];
        int eleccion;
        int posicion = 0;
        int indiceAux = 0;

        // Generamos el array de números aleatorios(0-400)
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 101);
        }

        boolean existe = false;
        do {
            System.out.printf("---ARRAY ACTUAL---\n");
            for (int i = 0; i < 10; i++) {
                System.out.printf("%d ", numeros[i]);
            }

            // Salto de línea
            System.out.println("\n");

            // Pedimos el número
            System.out.println("Introduzca el número el cual desea rotar: ");
            eleccion = scanner.nextInt();

            // Comprobamos si existe y guardamos su posición
            existe = false;
            for (int i = 0; i < 10; i++) {
                if (numeros[i] == eleccion) {
                    posicion = i;
                    existe = true;
                    break; // Encontrado, salimos del for
                }
            }
            if (!existe) {
                System.out.println("ERROR, el número no está en la lista.");
            }
        } while (!existe);// Repetimos si no existe

        // Rellenamos el principio del array aux[] con el final de numeros[]
        for (int i = posicion; i < 10; i++) {
            aux[indiceAux] = numeros[i];
            indiceAux++;
        }

        // Rellenamos el final de aux[] con el principio de numeros[]
        for (int i = 0; i < posicion; i++) {
            aux[indiceAux] = numeros[i];
            indiceAux++;
        }

        // Imprimimos el resultado
        System.out.println("\n---ARRAY ROTADO---");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", aux[i]);
        }

        // Salto de linea estético
        System.out.println();

        // Apagamos el scanner para liberar memoria
        scanner.close();
    }
}
