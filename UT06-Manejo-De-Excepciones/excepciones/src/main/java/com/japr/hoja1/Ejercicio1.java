package com.japr.hoja1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        boolean datoCorrecto = false;

        System.out.println("---PRUEBA DE TRY/CATCH---");

        while (!datoCorrecto) {
            try {
                System.out.println("Por favor introduce un número entero: ");
                numero = scanner.nextInt();
                datoCorrecto = true;
            } catch (InputMismatchException error) {
                System.out.println("ERROR, no has introducido un número entero.");
                scanner.nextLine();
            }
        }
        System.out.println("Coseguido, has introducido un número entero por teclado.");
        scanner.close();
    }

}
