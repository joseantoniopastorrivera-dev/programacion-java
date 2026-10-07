//Autor: JAPR
//Fecha: 05/01/26
//Realiza un programa que pinte una pirámide hueca por pantalla. La altura se debe pedir por teclado. 
//El carácter con el que se pinta la pirámide también se debe pedir por teclado.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio20 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        int altura;

        // Pedimos los datos por pantalla
        System.out.println("Introduzca el caracter deseado: ");
        char c = scanner.next().charAt(0);
        System.out.println("Introduzca la altura deseada: ");
        altura = scanner.nextInt();

        // Bucles 
        for (int i = 1; i <= altura; i++) {// BUCLE principal
            for (int j = 1; j <= (altura - i); j++) {// Bucle espacios
                System.out.print(" ");
            }
            for (int k = 1; k <= ((i * 2) - 1); k++){//Bucle de caracteres
                if (k == 1){//Borde izquierdo
                    System.out.print(c);
                } else if (k == (i * 2) - 1){//Borde derecho
                    System.out.print(c);
                } else if (i == altura){//Base de la piramide
                    System.out.print(c);
                } else {
                    System.out.print(" ");//Espacios en blanco del medio de la pirámide
                }
            }
            System.out.println();
        }

        // Cerramos el scanner
        scanner.close();
    }
}
