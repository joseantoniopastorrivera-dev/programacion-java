//Autor: JAPR
//Fecha: 02/01/2026
//Asignatura a primera hora versión mejorada.

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja3Ejercicio1Mejorado {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos la variable necesaria.
        String dia;

        // Preguntamos por el día de la semana.
        System.out.println("Introduzca el día de la semana y se le dirá la asignatura que hay a primera hora: ");
        // Guardamos la variable en día y añadimos el .toLowerCase() para que entienda
        // si escribimos Lunes o LUNES igualmente.
        dia = scanner.next().toLowerCase();

        // Switch analiza la variable dia.
        switch (dia) {
            case "lunes":
                System.out.println("El lunes a primera hora hay Sistemas Informáticos con Miguel Ángel.");
                // Freno, salimos del switch.
                break;

            case "martes":
                System.out.println("El martes a primera hora toca Programación con Ruth.");
                break;

            // Aceptamos con y sin tilde para que no haya errores.
            case "miercoles":
            case "miércoles":
                System.out.println("El miércoles a primera hora toca Bases de Datos con Julian.");
                break;

            case "jueves":
                System.out.println("El jueves a primera hora toca Entornos de Desarrollo con Daniel.");
                break;

            case "viernes":
                System.out.println("El viernes a primera hora toca Lenguaje de Marcas con María Isabel.");
                break;
            // caso es fin de semana.
            case "sabado":
            case "sábado":
            case "domingo":
                System.out.println("Es fin de semana, no hay clase.");
                break;

            // Cuando no coincide con ningún caso de los anteriores.
            default:
                System.out.println("Error: Eso no parece ningún día de la semana.");
        }
        // Apagamos el scanner para liberar memoria.
        scanner.close();

    }
}
