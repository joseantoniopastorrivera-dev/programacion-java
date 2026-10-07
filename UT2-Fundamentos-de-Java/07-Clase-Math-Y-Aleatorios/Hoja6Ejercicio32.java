//Autor: JAPR
//Fecha: 01/02/26
//Realiza un programa que pinte un sendero aleatorio.
//Los bordes se pintan con el carácter “|”. 
//La anchura del sendero siempre es la misma, los dos caracteres del borde más cuatro caracteres en medio,
// en total 6 caracteres (incluyendo espacios).
//A cada metro, el sendero puede continuar recto, girar un carácter a la izquierda o girar un carácter a la derecha, 
// por supuesto de forma aleatoria.
//Por cada metro de sendero - representado por una línea - puede que haya un obstáculo o puede que no, 
// la probabilidad es del 50%. La posición del obstáculo es aleatoria dentro de la línea. 
//En caso de existir un obstáculo en un metro de sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter O), 
// la probabilidad de que salga uno u otro es la misma. 
// Recuerda que nunca habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.

package Hoja6_NumerosAleatorios;

import java.util.Scanner;

public class Hoja6Ejercicio32 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Definimos el tamaño del sendero
        System.out.println("Introduzca la longitud del sendero: ");
        int longitud = scanner.nextInt();
        int ancho = 6 + (2 * (longitud - 1));
        char sendero[][] = new char[longitud][ancho];
        int indiceSendero = 0;

        System.out.println("--SENDERO--");
        for (int i = 0; i < longitud; i++) {
            int obstaculo = (int) (Math.random() * 2);
            char plantaPiedra[] = { '*', 'O' };
            int posicionObstaculo = (int) (Math.random() * 4);
            int tipoObstaculo = (int) (Math.random() * 2);
            for (int j = 0; j < ancho; j++) {
                // Rellenamos espacios en blanco
                if (j < longitud - 1 + indiceSendero || j > longitud - 1 + indiceSendero + 5) {
                    sendero[i][j] = ' ';
                    // Rellenamos los bordes del sendero
                } else if (j == longitud - 1 + indiceSendero || j == longitud - 1 + 5 + indiceSendero) {
                    sendero[i][j] = '|';
                    // Rellenamos lo de dentro del sendero
                } else {
                    // Calculamos si hay obstaculo o no en ese metro de sendero
                    // No hay obstáculo
                    if (obstaculo == 0) {
                        sendero[i][j] = ' ';
                        // Sí hay obstáculo
                    } else {
                        if (j == longitud + indiceSendero + posicionObstaculo) {
                            sendero[i][longitud + indiceSendero + posicionObstaculo] = plantaPiedra[tipoObstaculo];
                        } else {
                            sendero[i][j] = ' ';
                        }
                    }
                }
                System.out.print(sendero[i][j]);
            }
            System.out.println();
            int indiceSenderoRandom = (int) (Math.random() * 3);
            if (indiceSenderoRandom == 0) {
                indiceSendero--;
            } else if (indiceSenderoRandom == 2) {
                indiceSendero++;
            }
        }
        scanner.close();
    }
}