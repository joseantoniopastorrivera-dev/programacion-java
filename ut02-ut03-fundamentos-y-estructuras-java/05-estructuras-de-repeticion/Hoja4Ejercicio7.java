//Autor: JAPR
//Fecha: 03/01/26
//Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. 
// El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” 
// y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio7 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        int pass = 1234, intento;
        boolean acertado = false;

        // Bucle 4 cifras
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduzca la combinación (Intento: "+ (i +1) + " de 4): ");
                intento = scanner.nextInt();
            if (intento == pass) {  
                System.out.println("Contraseña acertada.");
                acertado = true;
                break; 
            } else {
                System.out.println("Contraseña incorrecta, pruebe de nuevo.");
            }
        }

        //Caso 4 fallos
        if (!acertado) {
            System.out.println("Has agotado los intentos. Caja bloqueada.");
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
