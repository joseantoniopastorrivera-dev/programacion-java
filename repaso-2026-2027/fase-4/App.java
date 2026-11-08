import java.util.Random;
import java.util.Scanner;

// FASE 4: partimos de la Fase 3 y cambiamos:
//   a) La bonificación por profesión pasa de if..else if..else a SWITCH.
//   b) Las estadísticas se escriben en ROJO (tercio bajo del rango),
//      AMARILLO (tercio medio) o VERDE (tercio alto).
//   c) Ficha más estética: colores, tabulaciones y líneas de símbolos.
public class App {

    public static void main(String[] args) {

        final double ALTURA_MIN = 1.40;
        final double ALTURA_MAX = 2.20;
        final double PESO_MIN = 40.0;
        final double PESO_MAX = 150.0;
        final int STAT_MIN = 1;
        final int STAT_MAX = 20;
        final int BONIFICACION = 5;

        // ---------------------------------------------------------------
        // COLORES ANSI
        // ---------------------------------------------------------------
        // Son secuencias especiales que la consola interpreta como "cambia
        // el color del texto". "\u001B" es el carácter ESC (escape).
        // ESC[31m = rojo, ESC[33m = amarillo, ESC[32m = verde, ESC[0m = vuelve
        // al color normal. Hay que poner RESET después de cada texto coloreado;
        // si no, todo lo que se escriba después seguiría en ese color.
        final String RESET = "\u001B[0m";
        final String ROJO = "\u001B[31m";
        final String AMARILLO = "\u001B[33m";
        final String VERDE = "\u001B[32m";
        final String CIAN = "\u001B[36m"; // solo decorativo, para títulos

        // ---------------------------------------------------------------
        // LÍMITES DE LOS TERCIOS
        // ---------------------------------------------------------------
        // El rango 1..20 tiene 20 valores (MAX - MIN + 1). Un tercio son
        // 20 / 3 = 6 (división ENTERA, porque ambos son int: se pierden los
        // decimales).
        //   LIMITE_BAJO  = 1 + 20/3     = 1 + 6  = 7   -> 1..6   rojo
        //   LIMITE_MEDIO = 1 + 2*20/3   = 1 + 13 = 14  -> 7..13  amarillo
        //                                              -> 14..20 verde
        // Calcularlo a partir de las constantes hace que, si cambia el rango,
        // los tercios se recalculen solos.
        final int LIMITE_BAJO = STAT_MIN + (STAT_MAX - STAT_MIN + 1) / 3;
        final int LIMITE_MEDIO = STAT_MIN + 2 * (STAT_MAX - STAT_MIN + 1) / 3;

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int opcionFinal;

        do {
            System.out.println();
            System.out.println(CIAN + "==================================================" + RESET);
            System.out.println(CIAN + "\t\tGENERADOR DE FICHAS RPG" + RESET);
            System.out.println(CIAN + "==================================================" + RESET);
            System.out.println();

            // 1) NOMBRE
            System.out.print("Escribe el nombre de tu personaje: ");
            String nombre = sc.nextLine();

            // 2) ORIGEN, en bucle hasta que sea válido
            int opcionOrigen;
            do {
                System.out.println();
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

            // Esta traducción se queda con if..else if: el enunciado pide
            // cambiar "alguna" estructura a switch, no todas.
            String origen;
            if (opcionOrigen == 1) {
                origen = "Elfo";
            } else if (opcionOrigen == 2) {
                origen = "Enano";
            } else {
                origen = "Orco";
            }

            // 3) PROFESIÓN
            int opcionProfesion;
            do {
                System.out.println();
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

            String profesion;
            if (opcionProfesion == 1) {
                profesion = "Guerrero";
            } else if (opcionProfesion == 2) {
                profesion = "Mago";
            } else {
                profesion = "Arquero";
            }

            // 4) VALORES ALEATORIOS (igual que en la Fase 3)
            double altura = ALTURA_MIN + aleatorio.nextDouble() * (ALTURA_MAX - ALTURA_MIN);
            double peso = PESO_MIN + aleatorio.nextDouble() * (PESO_MAX - PESO_MIN);
            int fuerza = aleatorio.nextInt(STAT_MAX - STAT_MIN + 1) + STAT_MIN;
            int destreza = aleatorio.nextInt(STAT_MAX - STAT_MIN + 1) + STAT_MIN;
            int magia = aleatorio.nextInt(STAT_MAX - STAT_MIN + 1) + STAT_MIN;

            // -----------------------------------------------------------
            // 5) BONIFICACIÓN CON SWITCH (cambio pedido en esta fase)
            // -----------------------------------------------------------
            // switch compara UNA variable con varios valores concretos. Es más
            // legible que una cadena de if..else if cuando todas las
            // comparaciones son "¿es igual a...?". Desde Java 7 admite String
            // (internamente usa equals, así que compara el texto).
            System.out.println();
            switch (profesion) {
                case "Guerrero":
                    fuerza += BONIFICACION;
                    System.out.println("Bonificación de Guerrero: +" + BONIFICACION + " a la Fuerza.");
                    // break sale del switch. Sin él, la ejecución "caería" al
                    // siguiente case (fall-through) y aplicaría también su bonus.
                    break;
                case "Mago":
                    magia += BONIFICACION;
                    System.out.println("Bonificación de Mago: +" + BONIFICACION + " a la Magia.");
                    break;
                case "Arquero":
                    destreza += BONIFICACION;
                    System.out.println("Bonificación de Arquero: +" + BONIFICACION + " a la Destreza.");
                    break;
                default:
                    // No debería ocurrir nunca (la profesión ya está validada),
                    // pero un default deja claro que hemos pensado en ello.
                    System.out.println("Profesión sin bonificación.");
            }

            // -----------------------------------------------------------
            // 6) COLOR DE CADA ESTADÍSTICA SEGÚN SU TERCIO
            // -----------------------------------------------------------
            // Guardamos en una variable el código de color que toca.
            // Por debajo de LIMITE_BAJO -> rojo; por debajo de LIMITE_MEDIO ->
            // amarillo; el resto (incluido lo que pase de 20 por el bonus) -> verde.
            // Aquí NO usamos switch porque son RANGOS (<), no valores exactos.
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
            // 7) FICHA ESTÉTICA
            // -----------------------------------------------------------
            // "\t" es un tabulador: alinea los valores en columna.
            System.out.println();
            System.out.println(CIAN + "==================================================" + RESET);
            System.out.println(CIAN + "\t\tFICHA DEL PERSONAJE" + RESET);
            System.out.println(CIAN + "==================================================" + RESET);
            System.out.println(" Nombre:\t" + nombre);
            System.out.println(" Origen:\t" + origen);
            System.out.println(" Profesión:\t" + profesion);
            System.out.printf(" Altura:\t%.2f m%n", altura);
            System.out.printf(" Peso:\t\t%.2f kg%n", peso);
            System.out.println("--------------------------------------------------");
            System.out.println(" ESTADÍSTICAS");
            System.out.println("--------------------------------------------------");
            // color + valor + RESET: solo el número sale coloreado.
            System.out.println(" Fuerza:\t" + colorFuerza + fuerza + RESET);
            System.out.println(" Destreza:\t" + colorDestreza + destreza + RESET);
            System.out.println(" Magia:\t\t" + colorMagia + magia + RESET);
            System.out.println(CIAN + "==================================================" + RESET);

            // 8) ¿MANTENER O REHACER?
            do {
                System.out.println();
                System.out.println("¿Qué quieres hacer con esta ficha? (1-2)");
                System.out.println("\t1.- Mantenerla y terminar");
                System.out.println("\t2.- Rehacerla desde cero");
                System.out.print("Opción: ");
                opcionFinal = sc.nextInt();
                if (opcionFinal < 1 || opcionFinal > 2) {
                    System.out.println(ROJO + "Opción no válida. Debe ser 1 o 2." + RESET);
                }
            } while (opcionFinal < 1 || opcionFinal > 2);

            // Limpia el Enter que deja nextInt() (ver explicación en Fase 3).
            sc.nextLine();

        } while (opcionFinal == 2);

        System.out.println(VERDE + "¡Ficha guardada! Que comience la aventura." + RESET);
        sc.close();
    }
}
