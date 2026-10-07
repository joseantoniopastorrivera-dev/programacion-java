//Nombre: JAPR
//Fecha: 26/01/25
// Realiza un programa que lea 10 números por teclado. 
// A continuación pedirá dos posiciones (inicial y final). 
// El programa debe colocar el número de la posición inicial en la posición final, 
// rotando el resto de números para que no se pierda ninguno.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja5Ejercicio12 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables y arrays necesarios
        int numeros[] = new int[10];
        int posicionInicial;
        int posicionFinal;
        int aux[] = new int[10];

        // Pedimos los datos del array
        System.out.println("A continuación, se le pedirán lo datos del array original");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Introduzca el dato de la posición %d del array: ", i);
            numeros[i] = scanner.nextInt();
        }

        // Mostramos el array original como pide el enunciado
        System.out.println("-----ARRAY ORIGINAL-----");
        for (int i = 0; i < 10; i++) {
            System.out.printf("ÍNDICE %d\tVALOR: %d\n", i, numeros[i]);
        }

        // Pedimos la posición inicial y final
        System.out.println("Introduzca el valor de la posición (índice) del array 'inicial': ");
        posicionInicial = scanner.nextInt();

        System.out.println("Introduzca el valor de la posición(índice) del array 'final': ");
        posicionFinal = scanner.nextInt();

        // Comprobamos que 'inicial' y 'final' están entre 0 y 9 además que 'inicial' es
        // menor que 'final'
        if (posicionInicial < 0 || posicionInicial > 9 || posicionFinal < 0 || posicionFinal > 9
                || posicionInicial > posicionFinal) {
            System.out.println("ERROR, seleccione valores correctos");
        } else {
            // Movemos 'inicial' a 'final'
            aux[posicionFinal] = numeros[posicionInicial];

            // Rellenamos desde la posición nueva al final del array
            for (int i = (posicionFinal + 1); i < 10; i++) {
                aux[i] = numeros[i - 1];
            }

            // Movemos el último valor del array original al primero del auxiliar
            aux[0] = numeros[9];

            //Rellenamos desde la posición 1 hasta la 'inicial'
            for (int i = 1; i < (posicionInicial + 1); i++) {
                aux[i] = numeros[i - 1];
            }

            //Rellenamos el medio del array
            for (int i = (posicionInicial + 1); i < posicionFinal; i++) {
                aux[i] = numeros[i];
            }
        }

        //Imprimimos el resultado
        System.out.println("----ARRAY FINAL----");
        for(int i = 0; i < 10; i++) {
            System.out.printf("ÍNDICE %d\tVALOR: %d\n", i, aux[i]);
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
