// Autor: JAPR (y su Copiloto IA)
// Fecha: Vuelta al cole
// Objetivo: Tablero de ajedrez básico usando Matrices y Funciones.

package Hoja8_Juegos;

import java.util.Scanner;

public class AjedrezSandBox {

    // 1. VARIABLE GLOBAL: EL TABLERO
    // La declaramos fuera del main (static) para que todas las funciones puedan tocarlo.
    // Es una matriz de 8x8 de caracteres.
    static char[][] tablero = new char[8][8];

    // Puerta de entrada principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean juegoActivo = true;

        // Llamamos a la función que coloca las piezas al principio
        inicializarTablero();

        System.out.println("--- BIENVENIDO AL AJEDREZ JAPR ---");
        System.out.println("Instrucciones: Introduce coordenadas tipo 'a2' o 'e7'.");
        System.out.println("Para salir escribe 'salir'.");

        // BUCLE DEL JUEGO
        while (juegoActivo) {
            
            // 1. Pintamos la situación actual
            pintarTablero();

            // 2. Pedimos origen
            System.out.print("\n¿Qué pieza quieres mover? (ej: a2): ");
            String entradaOrigen = scanner.next();

            if (entradaOrigen.equalsIgnoreCase("salir")) {
                juegoActivo = false;
                break; // Rompemos el bucle
            }

            // 3. Pedimos destino
            System.out.print("¿A dónde la quieres mover? (ej: a4): ");
            String entradaDestino = scanner.next();

            // 4. TRADUCCIÓN: De "a2" a [6][0]
            // Usamos una función auxiliar que hemos creado abajo
            int[] posOrigen = traducirCoordenadas(entradaOrigen);
            int[] posDestino = traducirCoordenadas(entradaDestino);

            // Verificamos que las coordenadas sean válidas (que no se haya salido del tablero)
            if (posOrigen != null && posDestino != null) {
                moverPieza(posOrigen, posDestino);
            } else {
                System.out.println("❌ Coordenadas incorrectas. Inténtalo de nuevo.");
            }
        }
        
        scanner.close();
        System.out.println("Juego terminado.");
    }

    // --- FUNCIONES (LOS OBREROS DEL CÓDIGO) ---

    // FUNCIÓN 1: Rellena el tablero con las piezas iniciales
    public static void inicializarTablero() {
        // Rellenamos todo con espacios vacíos (puntos o espacios)
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = '·'; // Un punto representa casilla vacía
            }
        }

        // Colocamos PEONES (P = Blanco, p = negro)
        for (int j = 0; j < 8; j++) {
            tablero[1][j] = 'p'; // Fila 1 (Negras)
            tablero[6][j] = 'P'; // Fila 6 (Blancas)
        }

        // Colocamos PIEZAS NOBLES (Simplificado: T=Torre, C=Caballo, A=Alfil, Q=Reina, K=Rey)
        // Negras (Fila 0)
        tablero[0][0] = 't'; tablero[0][1] = 'c'; tablero[0][2] = 'a'; tablero[0][3] = 'q';
        tablero[0][4] = 'k'; tablero[0][5] = 'a'; tablero[0][6] = 'c'; tablero[0][7] = 't';
        
        // Blancas (Fila 7)
        tablero[7][0] = 'T'; tablero[7][1] = 'C'; tablero[7][2] = 'A'; tablero[7][3] = 'Q';
        tablero[7][4] = 'K'; tablero[7][5] = 'A'; tablero[7][6] = 'C'; tablero[7][7] = 'T';
    }

    // FUNCIÓN 2: Dibuja el tablero en pantalla
    public static void pintarTablero() {
        System.out.println("\n  a b c d e f g h"); // Cabecera de letras
        System.out.println("  ---------------");
        
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + "|"); // Imprimimos número de fila a la izquierda (8 arriba, 1 abajo)
            
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            
            System.out.println("|" + (8 - i)); // Número de fila a la derecha
        }
        System.out.println("  ---------------");
        System.out.println("  a b c d e f g h");
    }

    // FUNCIÓN 3: Mueve la pieza en la memoria
    public static void moverPieza(int[] origen, int[] destino) {
        int filaO = origen[0];
        int colO = origen[1];
        int filaD = destino[0];
        int colD = destino[1];

        // Verificamos si hay pieza en el origen
        if (tablero[filaO][colO] == '·') {
            System.out.println("⚠️ No hay ninguna pieza en esa posición.");
            return;
        }

        // MOVIMIENTO:
        // 1. Copiamos la pieza al destino
        tablero[filaD][colD] = tablero[filaO][colO];
        // 2. Vaciamos el origen
        tablero[filaO][colO] = '·';
        
        System.out.println("✅ Movimiento realizado.");
    }

    // FUNCIÓN 4: Traduce "a2" a coordenadas de array [6][0]
    public static int[] traducirCoordenadas(String entrada) {
        // entrada es tipo "a2"
        if (entrada.length() != 2) return null;

        char letra = entrada.charAt(0); // 'a'
        char numero = entrada.charAt(1); // '2'

        // Convertimos columna (Letra) a índice (0-7)
        // 'a' - 'a' = 0, 'b' - 'a' = 1...
        int columna = letra - 'a';

        // Convertimos fila (Número) a índice (0-7)
        // En ajedrez el 8 está arriba (índice 0) y el 1 abajo (índice 7)
        // Character.getNumericValue('2') devuelve el entero 2.
        int fila = 8 - Character.getNumericValue(numero);

        // Validamos que esté dentro del tablero
        if (fila >= 0 && fila < 8 && columna >= 0 && columna < 8) {
            return new int[]{fila, columna}; // Devolvemos un array pequeñito con las 2 coordenadas
        } else {
            return null; // Error
        }
    }
}