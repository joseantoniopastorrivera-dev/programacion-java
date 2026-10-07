//Autor: JAPR
//Fecha: 25/01/26
//Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año y 
// que muestre a continuación un diagrama de barras horizontales con esos datos. 
//Las barras del diagrama se  pueden dibujar a base de asteriscos o cualquier otro carácter.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja5Ejercicio8 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Encendemos el Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos los Arrays
        int[] temperatura_media_mes = new int[12];
        String[] nombreMeses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };

        // Presentación programa
        System.out.println(
                "Este programa muestra por pantalla un gráfico de barras de las temperaturas medias de cada mes del año.");
        System.out.println();

        // Pedimos los datos por teclado
        // Bucle
        for (int i = 0; i < 12; i++) {
            System.out.print("Introduzca la temperatura de " + nombreMeses[i] + ": ");
            temperatura_media_mes[i] = scanner.nextInt();
        }
        System.out.println();

        // Pedimos el caracter para mostrar en las barras de temperatura
        System.out.println("Introduzca el caracter deseado para dibujar la tabla: ");
        char caracter = scanner.next().charAt(0);
        System.out.println();

        // VERSION 1
        // Imprimimos por pantalla las temperaturas medias y las barras alineadas a la
        // derecha
        System.out.println("---TEMPERATURA MEDIA DE CADA MES DEL AÑO---\nAlineación a la derecha.");

        // Bucle para escribir los nombres de los meses
        for (int i = 0; i < 12; i++) {
            System.out.printf("%12s | ", nombreMeses[i]); // Alineados a la derecha

            // Bucle para escribir los caracteres y crear las barras de la tabla
            for (int k = 0; k < temperatura_media_mes[i]; k++) {
                System.out.print(caracter);
            }
            // Temperatura despues de cada barra
            System.out.printf(" | %d ºC.", temperatura_media_mes[i]);

            // Salto de linea
            System.out.println();
        }
        System.out.println();

        // VERSIÓN 2
        // Imprimimos por pantalla las temperaturas medias y las barras alineadas a la
        // izquierda
        System.out.println("---TEMPERATURA MEDIA DE CADA MES DEL AÑO---\nAlineación a la izquierda.");

        // Bucle para escribir los nombres de los meses
        for (int i = 0; i < 12; i++) {
            System.out.printf("%-12s | ", nombreMeses[i]); // Alineados a la izquieda(mejor)

            // Bucle para escribir los caracteres y crear las barras de la tabla
            for (int j = 0; j < temperatura_media_mes[i]; j++) {
                System.out.print(caracter);
            }
            // Temperatura despues de cada barra
            System.out.printf(" | %d ºC.", temperatura_media_mes[i]);

            // Salto de linea
            System.out.println();
        }
        System.out.println();

        // VERSIÓN 3(PRO)
        // Imprimimos por pantalla las temperaturas medias y las barras alineadas a la
        // izquierda
        System.out.println("Alineación izquierda del texto + Columna de datos fija(máx 50ºC).");

        // Declaramos las variables necesarias para que se quede alineada la temperatura
        // en ºC después de las barras
        int anchoMaximo = 50;

        // Bucle para escribir los nombres de los meses
        for (int i = 0; i < 12; i++) {
            System.out.printf("%-12s | ", nombreMeses[i]); // Alineados a la izquieda(mejor)

            // Bucle para escribir los caracteres y crear las barras de la tabla
            for (int j = 0; j < temperatura_media_mes[i]; j++) {
                System.out.print(caracter);
            }
            // Temperatura despues de cada barra alineada
            int huecosVacios = anchoMaximo - temperatura_media_mes[i];
            for (int k = 0; k < huecosVacios; k++) {
                System.out.print(" ");
            }
            System.out.printf(" | %d ºC.", temperatura_media_mes[i]);

            // Salto de linea
            System.out.println();
        }

        // Apagamos el Scanner
        scanner.close();
    }
}
