//Autor: JAPR
//Fecha: 26/01/26
//Generar 100 números aleatorios (0-500). 
//Preguntar al usuario: "¿Qué quieres destacar? (1 - Mínimo, 2 - Máximo)".
//Mostrar la lista y rodear el elegido con asteriscos dobles.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Importamos el array
import java.util.Scanner;

//Nombre de la clase
public class Hoja5Ejercicio13 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables y arrays necesarios
        int numeros[] = new int[100];
        int eleccion;
        int aux;
        int posicion = 0;

        // Generamos el array de numeros aleatorios
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int) (Math.random() * 501);
            System.out.print(numeros[i] + " ");
        }

        // Salto de línea estético
        System.out.println("\n");

        // Preguntamos si quiere el menor o mayor
        System.out.println(
                "Indique con '1' si quiere resaltar el número menor o con '2' si quiere resaltar el mayor número de todos: ");
        eleccion = scanner.nextInt();

        // Salto de línea estético
        System.out.println();

        // Inicializamos aux
        aux = numeros[0];

        // Excluimos cualquier número fuera de 1 o 2
        if (eleccion != 1 && eleccion != 2) {
            System.out.println("ERROR, introduzca un valor válido.");
            scanner.close();//Cerramos el scanner en caso de ERROR
            return;//Detenemos el programa aquí en caso de ERROR

            // Si elige resaltar el 'menor'. Localizamos menor
        } else if (eleccion == 1) {
            for (int i = 0; i < 100; i++) {
                if (numeros[i] <= aux) {
                    aux = numeros[i];
                    posicion = i;
                }
            }
            // Si elige resaltar el 'mayor'. Localizamos mayor
        } else {
            for (int i = 0; i < 100; i++) {
                if (numeros[i] >= aux) {
                    aux = numeros[i];
                    posicion = i;
                }
            }
        }

        // RESULTADO
        //Resaltamos el 'mayor' o 'menor'
        System.out.println("--- RESULTADO (Destacando el " + aux + ") ---");
        
        // Imprimimos el resultado hasta el 'menor' o 'mayor'
        for (int i = 0; i < posicion; i++) {
            System.out.printf("%d ", numeros[i]);
        }

        // Imprimos el 'menor' o 'mayor'
        System.out.printf("**%d** ", numeros[posicion]);

        // Imprimimos el resultado desde 'menor' o 'mayor' hasta el final
        for (int i = (posicion + 1); i < 100; i++) {
            System.out.printf("%d ", numeros[i]);
        }

        // Apagamos el scanner para liberar memoria
        scanner.close();
    }
}
