//Autor: JAPR
//Fecha: 02/01/2026
//Asignatura que hay a primera hora.

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja3Ejercicio1 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos la variable necesaria.
        String dia;

        // Pedimos el día de la semana por pantalla.
        System.out.println(
                "Introduce el día de la semana y se le indicará cual es la asignatura que hay a primera hora (ej: lunes): ");
        // Añadimos .toLowerCase() para convertir lo que escriba el usuario en
        // minúscula.
        // Así si el usuario escribre Lunes o LUNES el programa lo entiende igual.
        dia = scanner.next().toLowerCase();

        // Describimos cada caso de lunes a domingo.
        if (dia.equals("lunes")) {
            System.out.println("El lunes a primera hora toca Sistemas Informáticos con Miguel Ángel.");
        } else if (dia.equals("martes")) {
            System.out.println("El martes a primera hora toca Programación con Ruth.");
        } else if (dia.equals("miercoles")) {
            System.out.println("El miércoles a primera hora toca Bases de Datos con Julián.");
        } else if (dia.equals("jueves")) {
            System.out.println("El jueves a primera hora toca Entornos de desarrollo con Daniel.");
        } else if (dia.equals("viernes")) {
            System.out.println("El viernes a primera hora toca Lenguaje de Marcas con María Isabel");
        } else if (dia.equals("sabado") || dia.equals("domingo")) {
            System.out.println("Es fin de semana, no hay clase.");
        } else {
            System.out.println("Error: Eso no parece un día de la semana válido.");
        }
        //Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}
