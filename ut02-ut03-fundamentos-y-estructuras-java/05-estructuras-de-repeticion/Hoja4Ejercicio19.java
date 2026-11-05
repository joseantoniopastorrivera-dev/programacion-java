//Autor: JAPR
//Fecha: 05/01/26
//Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado. 
//El carácter con el que se pinta la pirámide también se debe pedir por teclado.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio19 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Encendemos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int altura;

        // Pedimos el caracter y altura
        System.out.println("Introduzca el caracter deseado: ");
        char c = scanner.next().charAt(0);
        System.out.println("Introduzca la altura deseada: ");
        altura = scanner.nextInt();

        //Bucle principal
        for (int i = 1; i <= altura; i++){
            for (int j = 1; j <= (altura - i); j++){//Bucle espacios
                System.out.print(" ");
            }
            for (int k = 1; k <= ((i * 2) -1); k++) {//Bucle caracteres
                System.out.print(c);
            }
            System.out.println();
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
