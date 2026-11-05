//Autor: JAPR
//Fecha: 03/01/26
//Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá ser una letra,
// un número o un símbolo como *, +, -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si 
// el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja3Ejercicio15 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        int opcion, altura;
        char c;
        String entrada;

        // Selección del caracter.
        System.out.println("Introduzca el carácter de relleno(ej: *, +, $): ");
        entrada = scanner.next();
        c = entrada.charAt(0);// Cogemos la primera letra

        // Pedimos la altura.
        System.out.println("Introduzca la altura que desea para la piramide(ej: 1, 3, 5, 7, 9..)");
        altura = scanner.nextInt();

        // Menú de direcciones.
        System.out.println("Introduzca la dirección del vértice:\n" +
                "1. Arriba.\n" +
                "2. Abajo.\n" +
                "3. Izquierda.\n" +
                "4. Derecha.\n");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:// Arriba
                for (int i = 1; i <= altura; i++) {
                    // Espacios en blanco
                    for (int j = 1; j <= altura - i; j++) {
                        System.out.print(" ");
                    }
                    // Caracteres impares(1, 3, 5, 7...)
                    for (int k = 1; k <= (2 * i) - 1; k++) {
                        System.out.print(c);
                    }

                    System.out.println();
                }
                break;

            case 2: // Abajo
                for (int i = altura; i >= 1; i--) {
                    // Espacios en blanco
                    for (int j = 1; j <= altura - i; j++) {
                        System.out.print(" ");
                    }
                    // Caracteres impares
                    for (int k = 1; k <= (2 * i) - 1; k++) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
                break;

            case 3:// Izquierda
                // Parte Superior (creciente)
                for (int i = 1; i <= altura; i++) {
                    // Espacios
                    for (int j = 1; j <= altura - i; j++) {
                        System.out.print(" ");
                    }
                    // Caracteres
                    for (int k = 1; k <= i; k++) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
                //Parte inferior (decreciente)
                for (int i = altura - 1; i >= 1; i--) {
                    //Espacios
                    for (int j = 1; j <= altura - i;  j++){
                        System.out.print(" ");
                    }
                    //Caracteres
                    for (int k = 1; k <= i; k++) {
                        System.out.print(c);
                    }
                    System.out.println();
                }
                break;

                case 4://Derecha
                //Parte superior(creciente) - espacios iniciales
                for (int i = 1; i <= altura; i++){
                    for (int k = 1; k <= i; k++){
                        System.out.print(c);
                    }
                    System.out.println();
                }
                //Parte inferior (decreciente)
                for(int i = altura -1; i >= 1; i--) {
                    for (int k = 1; k <= i; k++) {
                        System.out.print(c);
                         }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Opción incorrecta.");

        }
         // Apagamos el scanner para liberar memoria.
                scanner.close();
    }
}
