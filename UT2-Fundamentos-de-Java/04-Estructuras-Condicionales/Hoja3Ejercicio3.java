//Autor: JAPR
//Fecha: 02/01/26
//Escribe un programa en que dado un número del 1 a 7 escriba
//el correspondiente nombre del día de la semana.

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el Scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja3Ejercicio3 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos la variable necesaria.
        int numero;

        // Preguntamos por pantalla el número y lo guardamos en la variable numero.
        System.out.println("Introduzca un número del 1 al 7(ambos incluídos): ");
        numero = scanner.nextInt();

        // Analizamos dicha variable usando switch.
        switch (numero) {
            case 1:
                System.out.println("El número 1 corresponde al lunes, feliz lunes.");
                break;

            case 2:
                System.out.println("El número 2 corresponde al martes, feliz martes.");
                break;

            case 3:
                System.out.println("El número 3 corresponde al miércoles, feliz miércoles.");
                break;

            case 4:
                System.out.println("El número 4 corresponde al jueves, feliz jueves.");
                break;

            case 5:
                System.out.println("El número 5 corresponde al viernes, feliz viernes.");
                break;

            case 6:
                System.out.println("El número 6 corresponde al sábado, feliz sábado.");
                break;

            case 7:
                System.out.println("El número 7 corresponde al domingo, feliz domingo.");
                break;

            default:
                System.out.println("ERROR: El número no corresponde a ningún día de la semana.");
                break;
        }
        // Cerramos el Scanner para liberar memoria.
        scanner.close();
    }

}
