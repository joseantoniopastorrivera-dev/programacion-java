package examen.utils;

import java.util.Scanner;

public class InputReader {
    private static Scanner sc = new Scanner(System.in);

    public static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public static int leerEnteroMinimo(String mensaje, int min) {
        int numero = -1;
        boolean valido = false;
        do {
            System.out.print(mensaje);
            try {
                numero = Integer.parseInt(sc.nextLine().trim());
                if (numero >= min) {
                    valido = true;
                } else {
                    System.out.println(Ansi.RED + "Error: el número debe ser igual o mayor que " + min + Ansi.RESET);

                }
            } catch (NumberFormatException e) {
                System.out.println(Ansi.RED + "Error: debe introducir un número entero válido." + Ansi.RESET);
            }
        } while (!valido);
        return numero;
    }

    public static boolean leerBooleano(String mensaje) {
        String input;
        do {
            System.out.print(mensaje);
            input = sc.nextLine().trim().toLowerCase();
            if (input.equals("si") || input.equals("sí") || input.equals("s") || input.equals("true")) {
                return true;
            } else if (input.equals("no") || input.equals("n") || input.equals("false")) {
                return false;
            } else {
                System.out.println(Ansi.RED + "Error: por favor responda 'si' o 'no'." + Ansi.RESET);
            }
        } while (true);
    }
}
