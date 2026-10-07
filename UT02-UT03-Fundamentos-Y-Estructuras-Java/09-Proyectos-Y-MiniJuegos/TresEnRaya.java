// Autor: JAPR
// Fecha: Vuelta a clase
// Objetivo: Tres en Raya

package Hoja8_Juegos;

import java.util.Scanner;

public class TresEnRaya {

    // 1. EL TABLERO (Variable Global)
    // Es una matriz de 3x3. ' ' = vacío, 'X' = Jugador 1, 'O' = Jugador 2
    static char[][] tablero = new char[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;
        char turnoActual = 'X'; // Empieza la X

        inicializarTablero();

        System.out.println("--- TRES EN RAYA ---");
        System.out.println("Coordenadas: Fila (0-2) y Columna (0-2)");

        // BUCLE PRINCIPAL DEL JUEGO
        while (!juegoTerminado) {

            pintarTablero();

            // 1. Pedir coordenadas
            System.out.println("Turno de " + turnoActual);
            int fila, col;

            // Validación básica para que no machaquen una casilla ocupada
            while (true) {
                System.out.print("Introduce fila (0, 1, 2): ");
                fila = scanner.nextInt();
                System.out.print("Introduce columna (0, 1, 2): ");
                col = scanner.nextInt();

                // Verificamos si es válido
                if (fila >= 0 && fila < 3 && col >= 0 && col < 3 && tablero[fila][col] == ' ') {
                    break; // Coordenada correcta y hueco libre -> Salimos del bucle de pedir
                } else {
                    System.out.println("⚠️ Casilla ocupada o inválida. Prueba otra vez.");
                }
            }

            // 2. Marcar la casilla
            tablero[fila][col] = turnoActual;

            // 3. Comprobar si alguien ha ganado
            if (hayGanador(turnoActual)) {
                pintarTablero();
                System.out.println("🎉 ¡ENHORABUENA! Ha ganado " + turnoActual);
                juegoTerminado = true;
            }
            // 4. Comprobar si hay empate (tablero lleno)
            else if (tableroLleno()) {
                pintarTablero();
                System.out.println("😐 ¡EMPATE! No quedan movimientos.");
                juegoTerminado = true;
            }
            // 5. Cambiar turno
            else {
                if (turnoActual == 'X') {
                    turnoActual = 'O';
                } else {
                    turnoActual = 'X';
                }
            }
        }
        scanner.close();
    }

    // --- FUNCIONES AUXILIARES ---

    // Rellena todo con espacios
    public static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    // Dibuja la cuadrícula
    public static void pintarTablero() {
        System.out.println("\n  0 1 2");
        System.out.println("  -----");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + "|");
            }
            System.out.println(); // Salto de línea
            System.out.println("  -----");
        }
    }

    // Lógica para saber si alguien gana
    public static boolean hayGanador(char ficha) {
        // Revisar Filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == ficha && tablero[i][1] == ficha && tablero[i][2] == ficha)
                return true;
        }
        // Revisar Columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == ficha && tablero[1][j] == ficha && tablero[2][j] == ficha)
                return true;
        }
        // Revisar Diagonales
        if (tablero[0][0] == ficha && tablero[1][1] == ficha && tablero[2][2] == ficha)
            return true;
        if (tablero[0][2] == ficha && tablero[1][1] == ficha && tablero[2][0] == ficha)
            return true;

        return false; // Nadie ha ganado aún
    }

    // Revisa si no quedan huecos vacíos
    public static boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ')
                    return false; // Si encuentro un hueco, NO está lleno
            }
        }
        return true; // No encontré huecos, está lleno
    }
}