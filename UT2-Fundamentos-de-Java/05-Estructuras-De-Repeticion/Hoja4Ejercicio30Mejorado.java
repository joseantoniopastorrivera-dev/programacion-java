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

public class Hoja4Ejercicio30Mejorado {

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

        // Pedimos los datos de la hora1
        System.out.println("Introduzca la hora del primer día (ej: 0 - 23): ");
        hora1 = scanner.nextInt();

        // Convertidor día 1
        if(diaTexto1.equals("1") || diaTexto1.startsWith("l")){
            dia1 = 1;
        } else if (diaTexto1.equals("2") || diaTexto1.startsWith("ma")){
            dia1 = 2;
        } else if (diaTexto1.equals("3") || diaTexto1.startsWith("mi")){
            dia1 = 3;
        } else if (diaTexto1.equals("4") || diaTexto1.startsWith("j")){
            dia1 = 4;
        } else if (diaTexto1.equals("5") || diaTexto1.startsWith("v")){
            dia1 = 5;
        } else if (diaTexto1.equals("6") || diaTexto1.startsWith("s")) {
            dia1 = 6;
        } else if (diaTexto1.equals("7") ||diaTexto1.startsWith("d")) {
            dia1 = 7;
        } else datosValidos = false;

        // Pedimos datos día2
        System.out.println("Introduzca el segundo día de la semana (ej: 1, lunes, 2, martes..): ");
        diaTexto2 = scanner.next().toLowerCase();

        //Pedimos datos hora2
        System.out.println("Introduzca la hora del segundo día (ej:0 - 23): ");
        hora2 = scanner.nextInt();

        // Convertidor día 2
        if(diaTexto2.equals("1") || diaTexto2.startsWith("l")){
            dia2 = 1;
        } else if (diaTexto2.equals("2") || diaTexto2.startsWith("ma")){
            dia2 = 2;
        } else if (diaTexto2.equals("3") || diaTexto2.startsWith("mi")){
            dia2 = 3;
        } else if (diaTexto2.equals("4") || diaTexto2.startsWith("j")){
            dia2 = 4;
        } else if (diaTexto2.equals("5") || diaTexto2.startsWith("v")){
            dia2 = 5;
        } else if (diaTexto2.equals("6") || diaTexto2.startsWith("s")) {
            dia2 = 6;
        } else if (diaTexto2.equals("7") ||diaTexto2.startsWith("d")) {
            dia2 = 7;
        } else datosValidos = false;

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
