// Autor: JAPR
// Fecha: 27/01/26
// Array Cincuerizado
// 1. Rellena un array de 15 elementos con aleatorios (0-500).
// 2. Muestra el original.
// 3. "Cincueriza": Si no es múltiplo de 5, cámbialo por el siguiente múltiplo de 5.
// 4. Muestra el resultado.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Nombre de la clase
public class Hoja5Ejercicio21Mejorado {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Declaramos los arrays y variables necesarios
        int numeros[] = new int[15];

        // Rellenamos el array con números aleatorios y lo mostramos
        System.out.print("--ARRAY ORIGINAL--\n");
        for (int i = 0; i < 15; i++) {
            numeros[i] = (int) (Math.random() * 501);
            System.out.printf("%d ", numeros[i]);
        }

        // Bucle que recorra todo el array y circurice
        for (int i = 0; i < 15; i++) {
            int resto = numeros[i] % 5;

            if (resto != 0) {
                int loQueFalta = 5 - resto;
                numeros[i] = numeros[i] + loQueFalta;
            }
        }

        // Mostramos el array cincuerizado
        System.out.println("\n\n--ARRAY CINCUERIZADO--");
        for (int i = 0; i < 15; i++) {
            System.out.printf("%d ", numeros[i]);
        }
    }
}
