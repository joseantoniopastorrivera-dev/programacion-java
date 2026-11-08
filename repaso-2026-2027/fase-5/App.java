import java.util.Random;
import java.util.Scanner;

// FASE 5: partimos de la Fase 4 y cambiamos la ORGANIZACIÓN del programa:
//   a) Un bucle que se repite permanentemente. En cada vuelta se escribe la
//      ficha completa y el menú de opciones.
//   b) Solo se ejecuta la opción elegida y se vuelve al principio del bucle.
//   c) El programa solo termina con la opción "Salir".
//   d) Junto a cada estadística, una línea de asteriscos (tantos como su
//      valor), en el mismo color que el valor.
public class App {

    public static void main(String[] args) {

        final double ALTURA_MIN = 1.40;
        final double ALTURA_MAX = 2.20;
        final double PESO_MIN = 40.0;
        final double PESO_MAX = 150.0;
        final int STAT_MIN = 1;
        final int STAT_MAX = 20;
        final int BONIFICACION = 5;

        final String RESET = "\u001B[0m";
        final String ROJO = "\u001B[31m";
        final String AMARILLO = "\u001B[33m";
        final String VERDE = "\u001B[32m";
        final String CIAN = "\u001B[36m";

        // Tercios del rango 1..20: 1-6 rojo, 7-13 amarillo, 14-20 verde.
        final int LIMITE_BAJO = STAT_MIN + (STAT_MAX - STAT_MIN + 1) / 3;
        final int LIMITE_MEDIO = STAT_MIN + 2 * (STAT_MAX - STAT_MIN + 1) / 3;

        // Línea separadora guardada en una constante para no repetirla.
        final String LINEA = "===================================================================";

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        // ---------------------------------------------------------------
        // ESTADO INICIAL DE LA FICHA
        // ---------------------------------------------------------------
        // Ahora las variables se declaran ANTES del bucle, porque tienen que
        // conservar su valor entre una vuelta y la siguiente (si las
        // declarásemos dentro, se perderían en cada vuelta).
        // Como en el ejemplo del enunciado, al empezar el nombre, origen y
        // profesión no están elegidos y se muestran como "--".
        String nombre = "--";
        String origen = "--";
        String profesion = "--";

        // Altura y peso se generan al azar una vez, como en la Fase 3.
        double altura = ALTURA_MIN + aleatorio.nextDouble() * (ALTURA_MAX - ALTURA_MIN);
        double peso = PESO_MIN + aleatorio.nextDouble() * (PESO_MAX - PESO_MIN);

        // Guardamos las estadísticas SIN bonificación ("base"). La
        // bonificación se suma en cada vuelta al mostrar la ficha, según la
        // profesión que haya EN ESE MOMENTO. ¿Por qué? Porque ahora el jugador
        // puede cambiar de profesión varias veces: si sumáramos el +5 al
        // elegirla, al cambiar de Guerrero a Mago habría que acordarse de
        // quitar el +5 de Fuerza. Calculándolo siempre desde la base, nunca
        // se acumulan bonificaciones.
        int fuerzaBase = aleatorio.nextInt(STAT_MAX - STAT_MIN + 1) + STAT_MIN;
        int destrezaBase = aleatorio.nextInt(STAT_MAX - STAT_MIN + 1) + STAT_MIN;
        int magiaBase = aleatorio.nextInt(STAT_MAX - STAT_MIN + 1) + STAT_MIN;

        // Opción del menú. Fuera del bucle porque la usa la condición del while.
        int opcion;

        // ===============================================================
        // BUCLE PRINCIPAL: se repite hasta que se elija "5.- Salir".
        // ===============================================================
        // do-while: la ficha y el menú se muestran al menos una vez.
        do {
            // -----------------------------------------------------------
            // A) VALORES FINALES = base + bonificación de la profesión actual
            // -----------------------------------------------------------
            int fuerza = fuerzaBase;
            int destreza = destrezaBase;
            int magia = magiaBase;
            // Texto que informa de la bonificación en la ficha.
            String textoBonificacion;

            switch (profesion) {
                case "Guerrero":
                    fuerza += BONIFICACION;
                    textoBonificacion = "+" + BONIFICACION + " a la Fuerza (Guerrero)";
                    break;
                case "Mago":
                    magia += BONIFICACION;
                    textoBonificacion = "+" + BONIFICACION + " a la Magia (Mago)";
                    break;
                case "Arquero":
                    destreza += BONIFICACION;
                    textoBonificacion = "+" + BONIFICACION + " a la Destreza (Arquero)";
                    break;
                default:
                    // Profesión "--" (aún sin elegir): no hay bonificación.
                    textoBonificacion = "ninguna (elige una profesión)";
            }

            // -----------------------------------------------------------
            // B) COLOR DE CADA ESTADÍSTICA SEGÚN SU TERCIO (Fase 4)
            // -----------------------------------------------------------
            String colorFuerza;
            if (fuerza < LIMITE_BAJO) {
                colorFuerza = ROJO;
            } else if (fuerza < LIMITE_MEDIO) {
                colorFuerza = AMARILLO;
            } else {
                colorFuerza = VERDE;
            }

            String colorDestreza;
            if (destreza < LIMITE_BAJO) {
                colorDestreza = ROJO;
            } else if (destreza < LIMITE_MEDIO) {
                colorDestreza = AMARILLO;
            } else {
                colorDestreza = VERDE;
            }

            String colorMagia;
            if (magia < LIMITE_BAJO) {
                colorMagia = ROJO;
            } else if (magia < LIMITE_MEDIO) {
                colorMagia = AMARILLO;
            } else {
                colorMagia = VERDE;
            }

            // -----------------------------------------------------------
            // C) FICHA COMPLETA (formato del ejemplo del enunciado)
            // -----------------------------------------------------------
            System.out.println();
            System.out.println(CIAN + LINEA + RESET);
            System.out.println(CIAN + "\t\t\tGENERADOR DE FICHAS RPG" + RESET);
            System.out.println(CIAN + LINEA + RESET);
            // Nombre, origen y profesión en la misma línea, como en el ejemplo.
            System.out.println("Nombre: " + nombre + "\t\tOrigen: " + origen + "\t\tProfesión: " + profesion);
            System.out.printf("Altura: %.2f m\t\tPeso: %.2f kg%n", altura, peso);
            System.out.println("Bonificación: " + textoBonificacion);
            System.out.println();

            // Fuerza: etiqueta, valor en color y asteriscos en el mismo color.
            // print (no println) para que los asteriscos sigan en la misma línea.
            System.out.print("Fuerza:\t\t" + colorFuerza + fuerza + "\t");
            // Bucle for: se repite "fuerza" veces y en cada vuelta pinta un "*".
            // Como el rango es 1-20 (máx. 25 con bonus) caben en pantalla y
            // ponemos tantos asteriscos como valor. Con un rango 1-100 habría
            // que dividir (fuerza / 10) para que fuesen proporcionales.
            for (int i = 0; i < fuerza; i++) {
                System.out.print("*");
            }
            // Al terminar la línea, RESET y salto de línea.
            System.out.println(RESET);

            System.out.print("Destreza:\t" + colorDestreza + destreza + "\t");
            for (int i = 0; i < destreza; i++) {
                System.out.print("*");
            }
            System.out.println(RESET);

            System.out.print("Magia:\t\t" + colorMagia + magia + "\t");
            for (int i = 0; i < magia; i++) {
                System.out.print("*");
            }
            System.out.println(RESET);

            // -----------------------------------------------------------
            // D) MENÚ
            // -----------------------------------------------------------
            System.out.println(CIAN + LINEA + RESET);
            System.out.println("MENÚ");
            System.out.println("1.- Cambiar nombre.");
            System.out.println("2.- Cambiar origen.");
            System.out.println("3.- Cambiar profesión.");
            System.out.println("4.- Hacer nuevas tiradas aleatorias de las estadísticas.");
            System.out.println("5.- Salir del programa.");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            // Limpiamos el Enter que deja nextInt(): si no, en la opción 1 el
            // nextLine() del nombre leería una línea vacía al instante.
            sc.nextLine();
            System.out.println(CIAN + LINEA + RESET);

            // -----------------------------------------------------------
            // E) EJECUTAR SOLO LA OPCIÓN ELEGIDA
            // -----------------------------------------------------------
            // switch: cada case es una opción del menú. Tras ejecutarla, el
            // break sale del switch, llegamos al final del do y se vuelve a
            // mostrar la ficha (salvo que sea la 5).
            switch (opcion) {
                case 1:
                    System.out.print("Escribe el nuevo nombre: ");
                    nombre = sc.nextLine();
                    break;

                case 2:
                    // Mismo bucle de validación que en las fases 3 y 4.
                    int opcionOrigen;
                    do {
                        System.out.println("Elige el origen de tu personaje (1-3):");
                        System.out.println("\t1.- Elfo");
                        System.out.println("\t2.- Enano");
                        System.out.println("\t3.- Orco");
                        System.out.print("Opción: ");
                        opcionOrigen = sc.nextInt();
                        if (opcionOrigen < 1 || opcionOrigen > 3) {
                            System.out.println(ROJO + "Opción no válida. Debe ser 1, 2 o 3." + RESET);
                        }
                    } while (opcionOrigen < 1 || opcionOrigen > 3);

                    if (opcionOrigen == 1) {
                        origen = "Elfo";
                    } else if (opcionOrigen == 2) {
                        origen = "Enano";
                    } else {
                        origen = "Orco";
                    }
                    break;

                case 3:
                    int opcionProfesion;
                    do {
                        System.out.println("Elige la profesión de tu personaje (1-3):");
                        System.out.println("\t1.- Guerrero (+" + BONIFICACION + " Fuerza)");
                        System.out.println("\t2.- Mago (+" + BONIFICACION + " Magia)");
                        System.out.println("\t3.- Arquero (+" + BONIFICACION + " Destreza)");
                        System.out.print("Opción: ");
                        opcionProfesion = sc.nextInt();
                        if (opcionProfesion < 1 || opcionProfesion > 3) {
                            System.out.println(ROJO + "Opción no válida. Debe ser 1, 2 o 3." + RESET);
                        }
                    } while (opcionProfesion < 1 || opcionProfesion > 3);

                    if (opcionProfesion == 1) {
                        profesion = "Guerrero";
                    } else if (opcionProfesion == 2) {
                        profesion = "Mago";
                    } else {
                        profesion = "Arquero";
                    }
                    // La bonificación la aplica el apartado A) en la siguiente
                    // vuelta, y la ficha informa de ella en "Bonificación:".
                    break;

                case 4:
                    // Nuevas tiradas: solo cambian las bases. La bonificación
                    // se volverá a sumar al mostrar la ficha.
                    fuerzaBase = aleatorio.nextInt(STAT_MAX - STAT_MIN + 1) + STAT_MIN;
                    destrezaBase = aleatorio.nextInt(STAT_MAX - STAT_MIN + 1) + STAT_MIN;
                    magiaBase = aleatorio.nextInt(STAT_MAX - STAT_MIN + 1) + STAT_MIN;
                    System.out.println("Se han vuelto a tirar los dados de las estadísticas.");
                    break;

                case 5:
                    System.out.println(VERDE + "¡Hasta la próxima aventura!" + RESET);
                    break;

                default:
                    // Cualquier otro número: avisamos y el bucle vuelve a
                    // mostrar ficha y menú (así se repite la pregunta).
                    System.out.println(ROJO + "Opción no válida. Elige un número del 1 al 5." + RESET);
            }

        } while (opcion != 5); // Solo la opción 5 rompe el bucle.

        sc.close();
    }
}
