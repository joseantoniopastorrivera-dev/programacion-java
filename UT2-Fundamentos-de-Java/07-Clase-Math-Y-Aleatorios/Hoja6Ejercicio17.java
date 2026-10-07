//Autor: JAPR
//Fecha: 29/01/26
//Realiza un programa que pinte por pantalla una pecera con un pececito dentro. 
// Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo serán de 4 unidades. 
// No hay que comprobar que los datos se introducen correctamente; podemos suponer que el usuario los introduce bien. 
// Dentro de la pecera hay que colocar de forma aleatoria un pececito, que puede estar situado en cualquiera de las posiciones 
// que quedan en el hueco que forma el rectángulo.

package Hoja6_NumerosAleatorios;

import java.util.Scanner;

public class Hoja6Ejercicio17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ancho, alto;

        do {
            System.out.println("Introduzca el alto de la pecera(min 4): ");
            alto = scanner.nextInt();
        } while (alto < 4);

        do {
            System.out.println("Introduzca el ancho de la pecera(min 4): ");
            ancho = scanner.nextInt();
        } while (ancho < 4);

        char pecera[][] = new char[alto][ancho];

        System.out.println("Introduzca el caracter deseado para pintar los bordes de la pecera: ");
        char bordes = scanner.next().charAt(0);

        System.out.println("Introduce el caracter para representar al pez: ");
        char pez = scanner.next().charAt(0);

        // Rellenamos la pecera(Sin pez)
        for (int i = 0; i < alto; i++) {// Recorremos filas(vertical)
            for (int j = 0; j < ancho; j++) {// Recorremos columnas(horizontal)
                if (i == 0 || i == (alto - 1) || j == 0 || j == (ancho - 1)) {
                    pecera[i][j] = bordes;
                } else {
                    pecera[i][j] = ' ';
                }
            }
        }
        // Añadimos el pez
        int pezFila = (int) (Math.random() * (alto - 2)) + 1;
        int pezColumna = (int) (Math.random() * (ancho - 2)) + 1;
        pecera[pezFila][pezColumna] = pez;

        // SOLUCIÓN
        System.out.println("\n--PECERA--");
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(pecera[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
