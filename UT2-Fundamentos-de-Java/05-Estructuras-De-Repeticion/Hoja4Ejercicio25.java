//Fecha: 06/01/26
//Autor: JAPR
//Realiza un programa que pida un número por teclado y que luego muestre ese número al revés. 
//Ejemplo: Si metes 1234, debe salir 4321

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio25 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        int reves = 0;

        // Pedimos el número por teclado
        System.out.println("Introduzca el número: ");
        int num = scanner.nextInt();

        // Bucle para cambiar los numeros
        while (num > 0) {
            // Obtenemos la última cifra
            int x = (num % 10);
            reves = (reves * 10) + x;
            num = num / 10;
        }
        System.out.printf("Número dado la vuelta: %d", reves);

        // Apagamos el scanner para liberar memoria
        scanner.close();
    }
}
