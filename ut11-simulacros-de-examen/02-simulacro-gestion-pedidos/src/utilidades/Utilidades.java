/**
 * Clase de utilidades para leer distintos tipos de datos por consola.
 * Proporciona métodos para leer números enteros, cadenas y números decimales con validación.
 */
package utilidades;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utilidades {

    /**
     * Solicita al usuario un número entero dentro de un rango específico.
     *
     * @param frase Mensaje a mostrar al usuario
     * @param min   Valor mínimo permitido
     * @param max   Valor máximo permitido
     * @return Número entero introducido por el usuario dentro del rango
     */
    public static int pedirNumeroEntero(String frase, int min, int max) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = -1;
        do {
            System.out.print(frase + " " + min + " y " + max + " ");
            try {
                opcion = Integer.parseInt(br.readLine());
                if (opcion > max || opcion < min)
                    System.out.println("Número fuera de rango");
            } catch (Exception e) {
                System.out.println("Entrada no válida. Introduce un número entero.");
                opcion = -1;
            }
        } while (opcion > max || opcion < min);
        return opcion;
    }

    /**
     * Lee un número entero desde consola dentro de un rango específico,
     * sin mensaje previo. Útil para validaciones dentro de menús.
     *
     * @param min Valor mínimo permitido
     * @param max Valor máximo permitido
     * @return Número entero dentro del rango
     */
    public static int leerNumeroEntero(int min, int max) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = -1;
        do {
            try {
                opcion = Integer.parseInt(br.readLine());
                if (opcion > max || opcion < min)
                    System.out.println("Número fuera de rango");
            } catch (Exception e) {
                System.out.println("Entrada no válida. Introduce un número entero.");
                opcion = -1;
            }
        } while (opcion > max || opcion < min);
        return opcion;
    }

    /**
     * Solicita al usuario un número entero positivo sin límite superior.
     *
     * @param frase Mensaje a mostrar al usuario
     * @return Número entero positivo introducido por el usuario
     */
    public static int pedirNumeroEntero(String frase) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = -1;
        do {
            System.out.print(frase + ": ");
            try {
                opcion = Integer.parseInt(br.readLine());
                if (opcion < 0)
                    System.out.println("Introduzca un número positivo");
            } catch (Exception e) {
                System.out.println("Entrada no válida. Introduce un número entero.");
                opcion = -1;
            }
        } while (opcion < 0);
        return opcion;
    }

    /**
     * Solicita al usuario una cadena de texto no vacía.
     *
     * @param frase Mensaje a mostrar al usuario
     * @return Cadena de texto introducida por el usuario
     */
    public static String pedirString(String frase) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String opcion = "";
        do {
            System.out.print(frase + ": ");
            try {
                opcion = br.readLine();
                if (opcion.equals(""))
                    System.out.println("Introduzca algo");
            } catch (Exception e) {
                System.out.println("Entrada no válida");
                opcion = "";
            }
        } while (opcion.equals(""));
        return opcion;
    }

    /**
     * Solicita al usuario un número decimal positivo (float).
     *
     * @param frase Mensaje a mostrar al usuario
     * @return Número decimal positivo introducido por el usuario
     */
    public static float pedirFloat(String frase) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float opcion = -1f;
        do {
            System.out.print(frase + ": ");
            try {
                opcion = Float.parseFloat(br.readLine());
                if (opcion < 0f)
                    System.out.println("Introduzca un número positivo");
            } catch (Exception e) {
                System.out.println("Entrada no válida. Introduce un número decimal.");
                opcion = -1f;
            }
        } while (opcion < 0f);
        return opcion;
    }

    /**
     * Solicita al usuario una cadena que cumpla con un patrón específico (expresión
     * regular).
     *
     * @param frase        Mensaje que se muestra al usuario
     * @param patron       Expresión regular que debe cumplir la entrada
     * @param mensajeError Mensaje a mostrar si no se cumple el patrón
     * @return Cadena que cumple con el patrón
     */
    public static String pedirStringConPatron(String frase, String patron, String mensajeError) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String opcion = "";
        do {
            System.out.print(frase + ": ");
            try {
                opcion = br.readLine();
                if (!opcion.matches(patron)) {
                    System.out.println("\u001B[31m" + mensajeError + "\u001B[0m");
                    opcion = "";
                }
            } catch (Exception e) {
                System.out.println("Entrada no válida");
                opcion = "";
            }
        } while (opcion.equals(""));
        return opcion;
    }

}
