//Autor: JAPR
//Fecha: 27/01/26
//Programa de gestión de mesas de un restaurante.
// 1. Inicializa 10 mesas con ocupación aleatoria (0-4 personas).
// 2. Pide el número de comensales.
// 3. Busca mesa vacía (0) o con hueco (si caben).
// 4. Actualiza la mesa y muestra el estado del restaurante.
// 5. Se repite hasta introducir -1.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja5Ejercicio15 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables y arrays necesarios
        int mesas[] = new int[10];
        int comensales;

        // Creamos el array de las mesas y lo llenamos de datos random(1, 2, 3 o 4)
        for (int i = 0; i < 10; i++) {
            mesas[i] = (int) (Math.random() * 5);
        }

        while (true) {
            // Mostramos las mesas y comensales
            System.out.print("Mesa nº:\t");
            for (int i = 0; i < 10; i++) {
                System.out.printf(" %2d", (i + 1));
            }
            System.out.println();

            System.out.print("Comensales:\t");
            for (int i = 0; i < 10; i++) {
                System.out.printf(" %2d", mesas[i]);
            }
            System.out.println("\n");

            // AFORO COMPLETO
            //Primero vamos sumando los comensales de cada mesa en la variable ocupacionTotal
            int ocupacionTotal = 0;
            for (int i = 0; i < 10; i++) {
                ocupacionTotal += mesas[i];
            }

            //Si hay 40 personas cerramos el chiringuito en vez de seguir preguntando cuanta gente son los siguientes clientes
            if (ocupacionTotal == 40) {
                System.out.println("Estamos llenos y no cabe nadie más, cerramos el sistema automáticamente.");
                break;
            }



            // Pedimos el número de comensales
            System.out.println("Introduzca el número de comensales(-1 para salir del programa): ");
            comensales = scanner.nextInt();

            // Salida del programa
            if (comensales == -1) {
                break;
            }
            // Caso se introduce un número de comensales negativo
            if (comensales < -1 || comensales == 0) {
                System.out.println("ERROR, introduzca un valor de comensales válido.");

                // Caso se introduce un número de comensales > 4
            } else if (comensales > 4) {
                System.out.println("Lo siento pero no atendemos grupos de más de 4..");
            } else {

                // Lógica de búsqueda
                boolean sentado = false;

                // Búsqueda de mesa vacía
                for (int i = 0; i < 10; i++) {
                    if (mesas[i] == 0) {
                        mesas[i] = comensales;
                        System.out.printf("Su mesa es la número %d: \n", i + 1);
                        sentado = true;
                        break; // Dejamos de buscar
                    }
                }

                // Segundo si se pueden sentar en una mesa medio-ocupada (sólo si no he se han
                // sentado ya)
                if (!sentado) {
                    for (int i = 0; i < 10; i++) {
                        if (mesas[i] + comensales <= 4) {
                            mesas[i] = mesas[i] + comensales;
                            System.out.printf("Tendrán que compartir mesa. Es la número: %d \n", i + 1);
                            sentado = true;
                            break;
                        }
                    }
                }

                // Mensaje de error si no hay sitio
                if (!sentado) {
                    System.out.println("Lo siento, en estos momentos no tenemos hueco para uds.");
                }
            }
        } // Cierre del while

        // Cerramos el scanner para liberar memoria
        System.out.println("Gracias por su visita.");
        scanner.close();
    }
}
