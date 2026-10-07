//Autor: JAPR
//Fecha: 03/01/26
//Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja3Ejercicio10 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias.
        int dia, mes;
        String signo = "";

        // Preguntamos mes y dia.
        System.out.println("Introduzca el mes de nacimiento (1-12): ");
        mes = scanner.nextInt();
        System.out.println("Introduzca el día de nacimiento(1-31): ");
        dia = scanner.nextInt();

        // Mes de nacimiento.
        if (dia <= 0 || dia > 31) {
            System.out.println("ERROR: Escriba un día de nacimiento válido.");
        } else if (mes <= 0 || mes >= 13) {
            System.out.println("ERROR: Introduzca un mes de nacimiento válido.");
        } else {
            switch (mes) {
                case 1: // Enero
                {
                    if (dia <= 19) {
                        signo = "Capricornio";
                    } else {
                        signo = "Acuario";
                    }
                    break;
                }

                case 2:// Febrero
                {
                    if (dia <= 18) {
                        signo = "Acuario";
                    } else {
                        signo = "Piscis";
                    }
                    break;
                }

                case 3:// Marzo
                {
                    if (dia <= 20) {
                        signo = "Piscis";
                    } else {
                        signo = "Aries";
                    }
                    break;
                }

                case 4:// Abril
                {
                    if (dia <= 19) {
                        signo = "Aries";
                    } else {
                        signo = "Tauro";
                    }
                    break;
                }

                case 5:// Mayo
                {
                    if (dia <= 20) {
                        signo = "Tauro";
                    } else {
                        signo = "Géminis";
                    }
                    break;
                }

                case 6:// Junio
                {
                    if (dia <= 20) {
                        signo = "Géminis";
                    } else {
                        signo = "Cáncer";
                    }
                    break;
                }

                case 7:// Julio
                {
                    if (dia <= 22) {
                        signo = "Cáncer";
                    } else {
                        signo = "Leo";
                    }
                    break;
                }

                case 8:// Agosto
                {
                    if (dia <= 22) {
                        signo = "Leo";
                    } else {
                        signo = "Virgo";
                    }
                    break;
                }

                case 9:// Septiembre
                {
                    if (dia <= 22) {
                        signo = "Virgo";
                    } else {
                        signo = "Libra";
                    }
                    break;
                }

                case 10:// Octubre
                {
                    if (dia <= 22) {
                        signo = "Libra";
                    } else {
                        signo = "Escorpio";
                    }
                    break;
                }

                case 11:// Noviembre
                {
                    if (dia <= 21) {
                        signo = "Escorpio";
                    } else {
                        signo = "Sagitario";
                    }
                    break;
                }

                case 12:// Diciembre
                {
                    if (dia <= 21) {
                        signo = "Sagitario";
                    } else {
                        signo = "Capricornio";
                    }
                    break;
                }
            }
            // Imprimimos el resultado por pantalla
            System.out.println("Su signo del zodiaco es: " + signo);
        }

        // Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}
