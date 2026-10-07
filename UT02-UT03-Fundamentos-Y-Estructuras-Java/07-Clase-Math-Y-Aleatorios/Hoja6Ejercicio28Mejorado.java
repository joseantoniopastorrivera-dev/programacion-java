// Autor: JAPR
// Fecha: 30/01/26


package Hoja6_NumerosAleatorios;

import java.util.Scanner;

public class Hoja6Ejercicio28Mejorado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el tamaño del array: ");
        int tamaño = scanner.nextInt();
        
        int[] numeros = new int[tamaño];
        int[] resultado = new int[tamaño]; // Único array auxiliar necesario

        // 1. GENERAR Y MOSTRAR ORIGINAL
        System.out.println("\n-- ARRAY ORIGINAL --");
        System.out.print("Índice:\t");
        for (int i = 0; i < tamaño; i++) System.out.print(i + "\t");
        System.out.println();
        
        System.out.print("Valor:\t");
        for (int i = 0; i < tamaño; i++) {
            numeros[i] = (int) (Math.random() * 201);
            System.out.print(numeros[i] + "\t");
        }
        System.out.println("\n");

        // 2. LÓGICA OPTIMIZADA (DOS PUNTEROS)
        // Puntero 'izquierda' empieza al principio (0)
        // Puntero 'derecha' empieza al final (tamaño - 1)
        int izquierda = 0;
        int derecha = tamaño - 1;

        for (int i = 0; i < tamaño; i++) {
            // Si la posición original es PAR (0, 2, 4...), lo ponemos a la IZQUIERDA
            if (i % 2 == 0) {
                resultado[izquierda] = numeros[i];
                izquierda++; // Avanzamos el puntero izquierdo
            } 
            // Si la posición original es IMPAR (1, 3, 5...), lo ponemos a la DERECHA
            else {
                resultado[derecha] = numeros[i];
                derecha--;   // Retrocedemos el puntero derecho
            }
        }

        // 3. MOSTRAR RESULTADO
        System.out.println("-- ARRAY RESULTADO --");
        System.out.print("Índice:\t");
        for (int i = 0; i < tamaño; i++) System.out.print(i + "\t");
        System.out.println();
        
        System.out.print("Valor:\t");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(resultado[i] + "\t");
        }
        System.out.println();

        scanner.close();
    }
}