//Autor: JAPR
//Fecha: 30/01/26
//Realiza un programa que pinte una tableta de turrón con un bocado realizado de forma aleatoria.
// El ancho y el alto de la tableta se pide por teclado. El bocado se da alrededor del turrón, 
// obviamente no se puede dar un bocado por en medio de la tableta.

package Hoja6_NumerosAleatorios;

import java.util.Scanner;

public class Hoja6Ejercicio26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedimos altura
        System.out.println("Introduzca la altura de la tableta: ");
        int altura = scanner.nextInt();

        // Pedimos el ancho
        System.out.println("Introduzca el ancho de la tableta: ");
        int anchura = scanner.nextInt();

        // Definimos el array en base a los datos pedidos por pantalla
        // Tableta original
        System.out.println("--TABLETA ORIGINAL--");
        char tableta[][] = new char[altura][anchura];
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                tableta[i][j] = '*';
                System.out.print(tableta[i][j]);
            }
            System.out.println();
        }

        // Hacemos el mordisco
        //int num = (int)(Math.random() * (max - min + 1) + min);
        // 1 lo vamos a considerar tapa superior
        // 2 lo vamos a considerar tapa inferior
        // 3 lo vamos a considerar tapa derecha
        // 4 lo vamos a considerar tapa izquierda
        int ladoMordisco = (int) (Math.random() * 4) + 1;
        if (ladoMordisco == 1) {
            int mordisco1 = (int) ((Math.random() * ((anchura - 2) - (0) + 1)) + 0);
            tableta[0][mordisco1] = ' ';
        } else if (ladoMordisco == 2) {
            int mordisco2 = (int) ((Math.random() * ((anchura - 1) - (1) + 1)) + 1);
            tableta[altura - 1][mordisco2] = ' ';
        } else if (ladoMordisco == 3) {
            int mordisco3 = (int) ((Math.random() * ((altura - 2) - (0) + 1)) + 0);
            tableta[mordisco3][anchura - 1] = ' ';
        } else {
            int mordisco4 = (int) ((Math.random() * ((altura - 1) - (1) + 1)) + 1);
            tableta[mordisco4][0] = ' ';
        }

         // Tableta con mordisco
        System.out.println("--TABLETA MORDISQUEADA--");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print(tableta[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
