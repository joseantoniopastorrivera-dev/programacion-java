//Autor: JAPR
//Fecha: 28/01/26
//Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.

//Carpeta a la que pertenece
package Hoja6_NumerosAleatorios;

//Nombre de la clase
public class Hoja6Ejercicio4 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Declaramos el array de los 20 números
        int numeros[] = new int[20];

        // Generamos los números aleatorios entre 0 y 10
        for (int i = 0; i < 20; i++) {
            numeros[i] = (int) (Math.random() * 10) + 1;
            System.out.printf("%d ", numeros[i]);
        }
    }
}
