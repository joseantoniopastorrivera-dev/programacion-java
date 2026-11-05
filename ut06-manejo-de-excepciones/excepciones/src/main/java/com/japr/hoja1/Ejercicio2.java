package com.japr.hoja1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

    // Método pedir filas
    public static int pedirFilas(Scanner scanner) {
        int filas = 0;
        boolean datoCorrecto = false;

        while (!datoCorrecto) {
            try {
                System.out.println("Introduce el número de filas(entre 2 y 4): ");
                filas = scanner.nextInt();
                if (filas < 2 || filas > 4) {
                    throw new IllegalArgumentException("Error, el tamaño debe ser entre 2 y 4.");
                }
                datoCorrecto = true;
            } catch (InputMismatchException error) {
                System.out.println("Error, debes introducir un número entero.");
                scanner.nextLine();
            } catch (IllegalArgumentException error) {
                System.out.println(error.getMessage());
            }
        }
        return filas;
    }

    // Método para pedir colummas
    public static int pedirColumnas(Scanner scanner) {
        int columnas = 0;
        boolean datoCorrecto = false;
        while (!datoCorrecto) {
            try {
                System.out.println("Introduzca el número de columnas(entre 2 y 4): ");
                columnas = scanner.nextInt();
                if (columnas < 2 || columnas > 4) {
                    throw new IllegalArgumentException("Error, el tamaño debe ser entre 2 y 4.");
                }
                datoCorrecto = true;
            } catch (InputMismatchException error) {
                System.out.println("Error, debes introducir un número entero.");
                scanner.nextLine();
            } catch (IllegalArgumentException error) {
                System.out.println(error.getMessage());
            }
        }
        return columnas;
    }

    // Método cargar array
    public static void cargarArray(int[][] matriz, Scanner scanner) {
        System.out.println("\n--VAMOS A CARGAR EL ARRAY--");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                boolean valido = false;
                while (!valido) {
                    try {
                        System.out.println("Introduce el valor numérico para la posición [" + i + "][" + j + "].");
                        matriz[i][j] = scanner.nextInt();
                        valido = true;
                    } catch (InputMismatchException error) {
                        System.out.println("Error, introduce un número entero.");
                        scanner.nextLine();
                    }
                }
            }
        }
    }

    // Método mostrar array
    public static void mostrarArray(int[][] matriz) {
        System.out.println("\n--- CONTENIDO DEL ARRAY BIDIOMENSIONAL ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Salto de línea al terminar cada fila
        }
    }

    // Método main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== INICIANDO PROGRAMA 2 ===");
        int filas = pedirFilas(scanner);
        int columnas = pedirColumnas(scanner);

        int[][] miMatriz = new int[filas][columnas];

        cargarArray(miMatriz, scanner);

        mostrarArray(miMatriz);

        scanner.close();
        System.out.println("Programa completado con éxito.");
    }

}
