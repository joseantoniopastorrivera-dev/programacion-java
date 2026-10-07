//Autor: JAPR
//Fecha: 06/01/269
//Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana.
//No se tendrán en cuenta los minutos ni los segundos.
//El día de la semana se puede pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”).
// Se debe comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior al primero.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

public class Hoja4Ejercicio30 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        int hora1, hora2, dia1 = 0, dia2 = 0, horas = 0, horasTotal1 = 0, horasTotal2 = 0;
        String diaTexto1, diaTexto2;
        boolean datosValidos = true;// Variable para comprobar datos

        // Pedimos los datos del día1
        System.out.println("Introduzca el primer dia de la semana (ej: 1, lunes, 2, martes..): ");
        diaTexto1 = scanner.next().toLowerCase();

        // Truco para que nos coja las tildes
        diaTexto1 = diaTexto1.replace("á", "a");
        diaTexto1 = diaTexto1.replace("é", "e");
        diaTexto1 = diaTexto1.replace("í", "i");
        diaTexto1 = diaTexto1.replace("ó", "o");
        diaTexto1 = diaTexto1.replace("ú", "u");

        // Pedimos los datos de la hora1
        System.out.println("Introduzca la hora del primer día (ej: 0 - 23): ");
        hora1 = scanner.nextInt();

        // Convertidor día 1
        switch (diaTexto1) {
            case "1":
            case "lunes":
                dia1 = 1;
                break;
            case "2":
            case "martes":
                dia1 = 2;
                break;
            case "3":
            case "miercoles":
            case "miércoles":
                dia1 = 3;
                break;
            case "4":
            case "jueves":
                dia1 = 4;
                break;
            case "5":
            case "viernes":
                dia1 = 5;
                break;
            case "6":
            case "sabado":
            case "sábado":
                dia1 = 6;
                break;
            case "7":
            case "domingo":
                dia1 = 7;
                break;
            default:
                datosValidos = false;
        }
        // Pedimos datos día2
        System.out.println("Introduzca el segundo día de la semana (ej: 1, lunes, 2, martes..): ");
        diaTexto2 = scanner.next().toLowerCase();

        // Truco para que nos coja las tildes
        diaTexto2 = diaTexto2.replace("á", "a");
        diaTexto2 = diaTexto2.replace("é", "e");
        diaTexto2 = diaTexto2.replace("í", "i");
        diaTexto2 = diaTexto2.replace("ó", "o");
        diaTexto2 = diaTexto2.replace("ú", "u");

        //Pedimos datos hora2
        System.out.println("Introduzca la hora del segundo día (ej:0 - 23): ");
        hora2 = scanner.nextInt();

        // Convertidor día 2
        switch (diaTexto2) {
            case "1":
            case "lunes":
                dia2 = 1;
                break;
            case "2":
            case "martes":
                dia2 = 2;
                break;
            case "3":
            case "miercoles":
            case "miércoles":
                dia2 = 3;
                break;
            case "4":
            case "jueves":
                dia2 = 4;
                break;
            case "5":
            case "viernes":
                dia2 = 5;
                break;
            case "6":
            case "sabado":
            case "sábado":
                dia2 = 6;
                break;
            case "7":
            case "domingo":
                dia2 = 7;
                break;
            default:
                datosValidos = false;
        }

        // Comprobamos si los datos introducidos son válidos
        if (datosValidos == false) {
            System.out.println("ERROR: Introduzca un día válido.");
        } else if (hora1 < 0 || hora1 > 23 || hora2 < 0 || hora2 > 23) {
            System.out.println("ERROR: Introduzca un rango de horas válido.");
        } else {
            // Convertimos a horas todo
            horasTotal1 = ((dia1 - 1) * 24) + hora1;
            horasTotal2 = ((dia2 - 1) * 24) + hora2;
            horas = horasTotal2 - horasTotal1;
            // Comprobamos que el día 2 sea posterior al 1
            if (horasTotal2 <= horasTotal1) {
                System.out.println("ERROR: La segunda fecha debe ser posterior a la primera.");
            } else {
                // Imprimimos el resultado
                System.out.printf(
                        "La diferencia de horas entre el día %d hora %d y el día %d y hora %d es de: %d horas.",
                        dia1,
                        hora1, dia2, hora2, horas);
            }
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }

}
