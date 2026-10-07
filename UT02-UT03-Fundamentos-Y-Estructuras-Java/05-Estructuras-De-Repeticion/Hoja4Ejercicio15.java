//AUtor:JAPR
//Fecha: 05/01/26
//Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
//saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido.
//Ejemplo: Si metes Base = 2 y Exponente = 5.
//Salida: 2, 4, 8, 16, 32 (Que corresponden a 2^1, 2^2, 2^3, 2^4, 2^5).

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio15 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        //Declaramos las variables necesarias
        int exponente;
        double base, resultado = 1;

        //Pedimos los datos
        System.out.println("Introduce la base deseada: ");
        base = scanner.nextDouble();
        System.out.println("Introduce el exponente deseado: ");
        exponente = scanner.nextInt();

        //Valoramos si el exponente es positivo o no
        if (exponente <= 0) {
            System.out.println("ERROR: El exponente debe ser mayor que cero.");
        } else {
            for (int i = 1; i <= exponente; i++){
                resultado = resultado * base;
                System.out.printf("%.2f ", resultado);
            }
        }
        //Cerramos el scanne para liberar memoria
        scanner.close();
    }
}
