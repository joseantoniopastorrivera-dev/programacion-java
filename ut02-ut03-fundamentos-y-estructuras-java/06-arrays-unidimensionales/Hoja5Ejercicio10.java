//Autor: JAPR
//Fecha: 25/01/26
//Generar 20 números aleatorios y ordenar pares primero, impares después.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Nombre de la clase
public class Hoja5Ejercicio10 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Declaramos los arrays y variables necesarios
        int numerosAleatorios[] = new int[20];
        int pares[] = new int[20];
        int impares[] = new int[20];
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int definitivo[] = new int[20];
        int contador = 0;

        // Bucle para rellenar el array
        for (int i = 0; i < 20; i++) {
            numerosAleatorios[i] = (int) (Math.random() * 101);
            if (numerosAleatorios[i] % 2 == 0) {
                pares[cantidadPares] = numerosAleatorios[i];
                cantidadPares++;
            } else {
                impares[cantidadImpares] = numerosAleatorios[i];
                cantidadImpares++;
            }
        }

        // Imprimimos el resultado
        System.out.println("ARRAY NÚMEROS ALEATORIOS ORIGINALES: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(numerosAleatorios[i] + " ");
        }
        System.out.println();

        System.out.println("ARRAY NÚMEROS PARES: ");
        for (int i = 0; i < cantidadPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        System.out.println("ARRAY NÚMEROS IMPARES: ");
        for (int i = 0; i < cantidadImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();

        System.out.println("ARRAY NÚMEROS PARES + IMPARES: ");
        for (int i = 0; i < cantidadPares; i++) {
            definitivo[i] = pares[i];
        }
        for (int i = cantidadPares; i < 20; i++) {
            definitivo[i] = impares[contador];
            contador++;
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(definitivo[i] + " ");
        }

    }
}
