//Autor: JAPR
//Fecha: 01/02/26
//El pequeño Roberto tenía como mascota un pececillo dentro de una pecera.
//Los Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que le hagan compañía al pez.
//Realiza un programa que pinte por pantalla la pecera con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. 
//Por una cuestión de física elemental, ninguno de los animales puede coincidir en la misma posición. 
//Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo serán de 4 unidades.

package Hoja6_NumerosAleatorios;

import java.util.Scanner;

public class Hoja6Ejercicio30 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int altura, anchura;

        do {
            System.out.println("Introduzca el alto de la pecera(min: 4): ");
            altura = scanner.nextInt();

            System.out.println("Introduzca el ancho de la pecera(min: 4): ");
            anchura = scanner.nextInt();
        } while (altura < 4 || anchura < 4);

        char pecera[][] = new char[altura][anchura];

        System.out.println("--PECERA VACÍA--");
        // Pintamos los bordes de la pecera y el agua de dentro
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if (j == 0 || j == (anchura - 1) || i == (altura - 1)) {
                    pecera[i][j] = '*';
                } else {
                    pecera[i][j] = ' ';
                }
                System.out.print(pecera[i][j]);
            }
            System.out.println();
        }

        // Añadimos el pez (que ya estaba de antes) como 'P', el caballito como '$' y la
        // caracola como '@'
        int altoPez = (int) (Math.random() * ((altura - 2) - 0 + 1));
        int anchoPez = (int) (Math.random() * ((anchura - 2) - 1 + 1)) + 1;
        pecera[altoPez][anchoPez] = 'P';

        int altoCaballito, anchoCaballito, altoCaracola, anchoCaracola;

        do {
            altoCaballito = (int) (Math.random() * ((altura - 2) - 0 + 1));
            anchoCaballito = (int) (Math.random() * ((anchura - 2) - 1 + 1)) + 1;
        } while (altoCaballito == altoPez && anchoCaballito == anchoPez);
        pecera[altoCaballito][anchoCaballito] = '$';

        do {
            altoCaracola = (int) (Math.random() * ((altura - 2) - 0 + 1));
            anchoCaracola = (int) (Math.random() * ((anchura - 2) - 1 + 1)) + 1;
        } while ((altoCaracola == altoPez && anchoCaracola == anchoPez)
                || (altoCaracola == altoCaballito && anchoCaracola == anchoCaballito));
        pecera[altoCaracola][anchoCaracola] = '@';

        //Pintamos el resultado
        System.out.print("--PECERA CON MASCOTAS--\n");
         for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print(pecera[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}