//Autor: JAPR
//Fecha: 30/01/26
//Realiza un programa que pinte por pantalla una cuba con cierta cantidad de agua. 
//La capacidad será indicada por el usuario. La cuba se llenará con una cantidad aleatoria de agua que puede ir 
// entre 0 y la capacidad máxima que pueda admitir. El ancho de la cuba no varía.

package Hoja6_NumerosAleatorios;

import java.util.Scanner;

public class Hoja6Ejercicio20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique la capacidad de la cuba en litros: ");
        int capacidad = scanner.nextInt();

        int agua = (int) (Math.random() * capacidad - 0 + 1) + 0;

        char cubo[][] = new char[capacidad + 1][6];

        for (int i = 0; i < capacidad + 1; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 0 || i == capacidad || j == 5) {
                    cubo[i][j] = '*';
                } else {
                    if (i >= (capacidad - agua) && i < capacidad) {
                        cubo[i][j] = '=';
                    } else {
                        cubo[i][j] = ' ';
                    }
                }
            }
        }

        System.out.println("\nEl cubo tiene una capacidad de " + capacidad + " con " + agua + " litros de agua dentro.");
        for (int i = 0; i < capacidad + 1; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(cubo[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
