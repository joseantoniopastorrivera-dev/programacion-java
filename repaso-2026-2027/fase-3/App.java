import java.util.Random;
import java.util.Scanner;

// FASE 3: partimos de la Fase 2 y cambiamos:
//   a) Todos los valores numéricos (altura, peso y estadísticas) se asignan
//      de forma ALEATORIA dentro de sus rangos. Ya no se le preguntan al jugador.
//   b) Si el jugador responde un dato no válido, REPETIMOS la pregunta en
//      bucle hasta que sea válido (antes terminábamos el programa).
//   c) Tras mostrar la ficha, preguntamos si la mantiene (fin) o si quiere
//      rehacerla desde cero (volvemos al principio).
public class App {

    public static void main(String[] args) {

        // Constantes de rangos (igual que en la Fase 2).
        final double ALTURA_MIN = 1.40;
        final double ALTURA_MAX = 2.20;
        final double PESO_MIN = 40.0;
        final double PESO_MAX = 150.0;
        final int STAT_MIN = 1;
        final int STAT_MAX = 20;
        final int BONIFICACION = 5;

        Scanner sc = new Scanner(System.in);
        // Random genera números aleatorios. Creamos UNO solo y lo reutilizamos:
        // crear uno nuevo cada vez es innecesario.
        Random aleatorio = new Random();

        // Variable para la respuesta final (1 = mantener, 2 = rehacer).
        // Se declara FUERA del bucle porque la condición del while la usa,
        // y la condición está fuera de las llaves del do { }.
        int opcionFinal;

        // BUCLE PRINCIPAL "volver a empezar desde cero".
        // Usamos do-while (y no while) porque la ficha se tiene que crear
        // AL MENOS UNA VEZ: primero se hace, y al final se pregunta si repetir.
        do {
            System.out.println();
            System.out.println("===== GENERADOR DE FICHAS RPG =====");
            System.out.println();

            // -----------------------------------------------------------
            // 1) NOMBRE
            // -----------------------------------------------------------
            System.out.print("Escribe el nombre de tu personaje: ");
            String nombre = sc.nextLine();

            // -----------------------------------------------------------
            // 2) ORIGEN, repitiendo la pregunta hasta que sea válido
            // -----------------------------------------------------------
            int opcionOrigen;
            // do-while: se pregunta una vez y se repite MIENTRAS sea inválido.
            do {
                System.out.println();
                System.out.println("Elige el origen de tu personaje (1-3):");
                System.out.println("1.- Elfo");
                System.out.println("2.- Enano");
                System.out.println("3.- Orco");
                System.out.print("Opción: ");
                opcionOrigen = sc.nextInt();
                // Si es inválido avisamos; el while hará que se repita.
                if (opcionOrigen < 1 || opcionOrigen > 3) {
                    System.out.println("Opción no válida. Debe ser 1, 2 o 3. Inténtalo de nuevo.");
                }
            } while (opcionOrigen < 1 || opcionOrigen > 3);

            String origen;
            if (opcionOrigen == 1) {
                origen = "Elfo";
            } else if (opcionOrigen == 2) {
                origen = "Enano";
            } else {
                origen = "Orco";
            }

            // -----------------------------------------------------------
            // 3) PROFESIÓN, mismo esquema
            // -----------------------------------------------------------
            int opcionProfesion;
            do {
                System.out.println();
                System.out.println("Elige la profesión de tu personaje (1-3):");
                System.out.println("1.- Guerrero (+" + BONIFICACION + " Fuerza)");
                System.out.println("2.- Mago (+" + BONIFICACION + " Magia)");
                System.out.println("3.- Arquero (+" + BONIFICACION + " Destreza)");
                System.out.print("Opción: ");
                opcionProfesion = sc.nextInt();
                if (opcionProfesion < 1 || opcionProfesion > 3) {
                    System.out.println("Opción no válida. Debe ser 1, 2 o 3. Inténtalo de nuevo.");
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

            // -----------------------------------------------------------
            // 4) VALORES NUMÉRICOS ALEATORIOS
            // -----------------------------------------------------------
            // nextDouble() devuelve un decimal en [0, 1) (incluye 0, no llega a 1).
            // Multiplicado por la anchura del rango da [0, ancho) y sumándole
            // el mínimo queda en [MIN, MAX). Ej: 1.40 + [0,1) * 0.80 -> [1.40, 2.20)
            double altura = ALTURA_MIN + aleatorio.nextDouble() * (ALTURA_MAX - ALTURA_MIN);
            double peso = PESO_MIN + aleatorio.nextDouble() * (PESO_MAX - PESO_MIN);

            // nextInt(n) devuelve un entero de 0 a n-1. Para 1..20 hay
            // 20 valores posibles = (MAX - MIN + 1). nextInt(20) da 0..19 y
            // sumando 1 queda 1..20. El "+ 1" es para que el MAX esté incluido.
            int fuerza = aleatorio.nextInt(STAT_MAX - STAT_MIN + 1) + STAT_MIN;
            int destreza = aleatorio.nextInt(STAT_MAX - STAT_MIN + 1) + STAT_MIN;
            int magia = aleatorio.nextInt(STAT_MAX - STAT_MIN + 1) + STAT_MIN;

            // -----------------------------------------------------------
            // 5) BONIFICACIÓN POR PROFESIÓN (igual que en la Fase 2)
            // -----------------------------------------------------------
            System.out.println();
            if (profesion.equals("Guerrero")) {
                fuerza += BONIFICACION;
                System.out.println("Bonificación de Guerrero: +" + BONIFICACION + " a la Fuerza.");
            } else if (profesion.equals("Mago")) {
                magia += BONIFICACION;
                System.out.println("Bonificación de Mago: +" + BONIFICACION + " a la Magia.");
            } else {
                destreza += BONIFICACION;
                System.out.println("Bonificación de Arquero: +" + BONIFICACION + " a la Destreza.");
            }

            // -----------------------------------------------------------
            // 6) FICHA COMPLETA
            // -----------------------------------------------------------
            System.out.println();
            System.out.println("===== FICHA DEL PERSONAJE =====");
            System.out.println("Nombre: " + nombre);
            System.out.println("Origen: " + origen);
            System.out.println("Profesión: " + profesion);
            System.out.printf("Altura: %.2f m%n", altura);
            System.out.printf("Peso: %.2f kg%n", peso);
            System.out.println("Fuerza: " + fuerza);
            System.out.println("Destreza: " + destreza);
            System.out.println("Magia: " + magia);
            System.out.println("===============================");

            // -----------------------------------------------------------
            // 7) ¿MANTENER O REHACER? (también validado en bucle)
            // -----------------------------------------------------------
            do {
                System.out.println();
                System.out.println("¿Qué quieres hacer con esta ficha? (1-2)");
                System.out.println("1.- Mantenerla y terminar");
                System.out.println("2.- Rehacerla desde cero");
                System.out.print("Opción: ");
                opcionFinal = sc.nextInt();
                if (opcionFinal < 1 || opcionFinal > 2) {
                    System.out.println("Opción no válida. Debe ser 1 o 2. Inténtalo de nuevo.");
                }
            } while (opcionFinal < 1 || opcionFinal > 2);

            // MUY IMPORTANTE: nextInt() lee el número pero deja en el buffer
            // el salto de línea (el Enter). Si volvemos a empezar, el siguiente
            // nextLine() (el del nombre) se "comería" ese Enter y el nombre
            // quedaría vacío sin dejar escribir. Con este nextLine() vacío
            // limpiamos el buffer.
            sc.nextLine();

        } while (opcionFinal == 2); // Se repite todo si eligió "rehacer".

        System.out.println("¡Ficha guardada! Que comience la aventura.");
        sc.close();
    }
}
