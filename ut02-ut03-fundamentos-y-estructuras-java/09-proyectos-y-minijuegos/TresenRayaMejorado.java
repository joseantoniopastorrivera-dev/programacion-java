package Hoja8_Juegos;

import java.util.Scanner;

public class TresenRayaMejorado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creamos el tablero y lo rellenamos de espacios en blanco.
        char tablero[][] = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }

        // Variables
        char jugadorActual = 'X';
        boolean hayGanador = false;
        boolean empate = false;
        // Para comprobar si el tablero se llena (máx 9 movimientos)
        int movimientos = 0;

        // Buble principal del juego
        while (!hayGanador && !empate) {

            // Dibujamamos el tablero
            System.out.println("\n    0   1   2");
            System.out.println("  +-----------+");
            System.out.println("0 | " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
            System.out.println("  +-----------+");
            System.out.println("1 | " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
            System.out.println("  +-----------+");
            System.out.println("2 | " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
            System.out.println("  +-----------+");

            // Pedimos coordenadas
            System.out.println("\nTurno de jugador " + jugadorActual);
            int fila, columna;

            while (true) {
                System.out.println("Introduzca fila(0-2): ");
                fila = scanner.nextInt();
                System.out.println("Introduzca columna(0-2): ");
                columna = scanner.nextInt();

                // Validamos que la coordenada sea válida y esté vacía
                if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
                    // Posición válida. Salimos del bucle para pedir los datos
                    break;
                } else {
                    System.out.println("Movimiento inválido o casilla ocupada. Pruebe de nuevo.");
                }
            }

            // Actualizamos el tablero
            tablero[fila][columna] = jugadorActual;
            movimientos++;

            // Comprobamos si hay un ganador
            // Comprobamos las filas
            if (tablero[fila][0] == jugadorActual && tablero[fila][1] == jugadorActual
                    && tablero[fila][2] == jugadorActual) {
                hayGanador = true;
                // Comprobamos las columnas
            } else if (tablero[0][columna] == jugadorActual && tablero[1][columna] == jugadorActual
                    && tablero[2][columna] == jugadorActual) {
                hayGanador = true;
                // Comprobamos las diagonales
                // Diagonal desde tablero[0][0]
            } else if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual
                    && tablero[2][2] == jugadorActual) {
                hayGanador = true;
                // Diagonal desde tablero[0][2]
            } else if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual
                    && tablero[2][0] == jugadorActual) {
                hayGanador = true;
            }

            // Cambiamos de turno o terminamos
            // Si hay ganador
            if (hayGanador) {
                System.out.println("\nFELICIDADES, ha ganado el jugador " + jugadorActual);
                // Si no quedan casillas vacías
            } else if (movimientos == 9) {
                empate = true;
                System.out.println("\nEMPATE, el tablero está lleno.");
                // Cambiamos de jugador actual. De 'X' a 'O' o viceversa
            } else {
                if (jugadorActual == 'X') {
                    jugadorActual = 'O';
                } else {
                    jugadorActual = 'X';
                }
            }
        }

        // Mostramos el tablero final
        System.out.println("\nTABLERO FINAL: ");
        System.out.println("\n    0   1   2");
        System.out.println("  +-----------+");
        System.out.println("0 | " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |");
        System.out.println("  +-----------+");
        System.out.println("1 | " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |");
        System.out.println("  +-----------+");
        System.out.println("2 | " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |");
        System.out.println("  +-----------+");

        scanner.close();
    }
}
