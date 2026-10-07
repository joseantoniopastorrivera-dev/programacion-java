package Hoja8_Juegos;

import java.util.Scanner;

public class AjedrezSandBoxMejorado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Definimos el tablero y lo rellenamos
        // Se considera que las blancas estan en i == (6-7) y las negras en i == (0-1)
        char tablero[][] = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // Pintamos los peones de las blancas
                if (i == 6) {
                    tablero[i][j] = 'P';
                    // Pintamos los peones de las negras
                } else if (i == 1) {
                    tablero[i][j] = 'p';
                    // Pintamos las torres de las blancas
                } else if ((i == 7 && j == 0) || (i == 7 && j == 7)) {
                    tablero[i][j] = 'T';
                    // Pintamos las torres de las negras
                } else if ((i == 0 && j == 0) || (i == 0 && j == 7)) {
                    tablero[i][j] = 't';
                    // Pintamos los caballos de las blancas
                } else if ((i == 7 && j == 1) || (i == 7 && j == 6)) {
                    tablero[i][j] = 'C';
                    // Pintamos los caballos de las negras
                } else if ((i == 0 && j == 1) || (i == 0 && j == 6)) {
                    tablero[i][j] = 'c';
                    // Pintamos los alfiles de las blancas
                } else if ((i == 7 && j == 2) || (i == 7 && j == 5)) {
                    tablero[i][j] = 'A';
                    // Pintamos los alfiles de las negras
                } else if ((i == 0 && j == 2) || (i == 0 && j == 5)) {
                    tablero[i][j] = 'a';
                    // Pintamos la reina de las blancas
                } else if (i == 7 && j == 3) {
                    tablero[i][j] = 'Q';
                    // Pintamos la reina de las negras
                } else if (i == 0 && j == 3) {
                    tablero[i][j] = 'q';
                    // Pintamos el rey de las blancas
                } else if (i == 7 && j == 4) {
                    tablero[i][j] = 'K';
                    // Pintamos el rey de las negras
                } else if (i == 0 && j == 4) {
                    tablero[i][j] = 'k';
                } else {
                    tablero[i][j] = '·';
                }
            }
        }

        // Variables
        String jugadorActual = "blancas";
        boolean hayGanador = false;

        while (!hayGanador) {
            // Dibujamos el tablero
            System.out.println("\n    0   1   2   3   4   5   6   7");
            System.out.println("  +-------------------------------+");

            for (int i = 0; i < 8; i++) {
                // Imprimimos número de fila y borde
                System.out.print(i + " | ");
                for (int j = 0; j < 8; j++) {
                    // Imprimimos la pieza
                    System.out.print(tablero[i][j] + " | ");
                }
                // Al terminar la fila, salto de línea y separador
                System.out.println("\n  +-------------------------------+");
            }

            // Pedimos coordenadas
            int fila, columna, filaAux, columnaAux;
            while (true) {
                System.out.println("\nTurno de las " + jugadorActual);
                System.out.println("Introduzca fila de origen: ");
                fila = scanner.nextInt();
                System.out.println("Introduzca columna de origen: ");
                columna = scanner.nextInt();
                System.out.println("Introduzca fila donde desea mover: ");
                filaAux = scanner.nextInt();
                System.out.println("Introduzca columna donde desea mover: ");
                columnaAux = scanner.nextInt();
                // Validamos que la coordenada sea válida y esté vacía
                if (fila >= 0 && fila < 8 && columna >= 0 && columna < 8 && filaAux >= 0 && filaAux < 8
                        && columnaAux >= 0
                        && columnaAux < 8 && tablero[fila][columna] != '·') {
                    // Aviso si has comido una pieza
                    if (tablero[filaAux][columnaAux] != '·') {
                        System.out.println("¡Has comido una pieza (" + tablero[filaAux][columnaAux] + ")!");
                    }
                    // Posición válida, hacemos break para pedir datos
                    break;
                } else {
                    System.out.println("Movimiento inválido, pruebe otra vez.");
                }
            }

            // Actualizamos el tablero
            tablero[filaAux][columnaAux] = tablero[fila][columna];
            tablero[fila][columna] = '·';

            // Comprobamos si hay reyes en el tablero
            boolean reyBlancoVivo = false;
            boolean reyNegroVivo = false;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (tablero[i][j] == 'K') {
                        reyBlancoVivo = true;
                    } else if (tablero[i][j] == 'k') {
                        reyNegroVivo = true;
                    }
                }
            }

            //Comprobamos si hay ganador
            if (!reyBlancoVivo) {
                hayGanador = true;
                System.out.println("¡JAQUE MATE! Ganan las negras.");
            } else if (!reyNegroVivo) {
                hayGanador = true;
                System.out.println("¡JAQUE MATE! Ganan las blancas.");
            } else {
                if (jugadorActual.equals("blancas")) {
                    jugadorActual = "negras";
                } else {
                    jugadorActual = "blancas";
                }
            }
        }
        scanner.close();
    }
}
