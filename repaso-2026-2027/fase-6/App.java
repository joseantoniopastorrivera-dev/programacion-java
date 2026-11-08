import java.util.Random;
import java.util.Scanner;

// FASE 6: partimos de la Fase 5 y cambiamos:
//   a) Un ARRAY con los orígenes disponibles y otro con las profesiones.
//      Se usan para MOSTRAR las opciones y para COMPROBAR que la elegida existe.
//   b) 6 orígenes y 8 profesiones.
//   c) Estadísticas en dos ARRAYS PARALELOS: uno con los nombres y otro con
//      los valores. Mismo tamaño; el índice i relaciona nombre y valor:
//      nombresEstadisticas[i] es el nombre de la estadística cuyo valor es
//      valoresEstadisticas[i].
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

        final int LIMITE_BAJO = STAT_MIN + (STAT_MAX - STAT_MIN + 1) / 3;
        final int LIMITE_MEDIO = STAT_MIN + 2 * (STAT_MAX - STAT_MIN + 1) / 3;

        final String LINEA = "===================================================================";

        // ---------------------------------------------------------------
        // ARRAYS DE OPCIONES (nuevo en esta fase)
        // ---------------------------------------------------------------
        // Un array guarda varios valores del mismo tipo bajo un único nombre,
        // y se accede a cada uno por su posición (índice), empezando en 0.
        // Con { ... } lo creamos y rellenamos a la vez; Java deduce el tamaño
        // (6 y 8) contando los elementos.
        // Ventaja frente a las fases anteriores: para añadir un origen nuevo
        // basta con escribirlo aquí. El menú y la validación usan .length y
        // se adaptan solos, sin tocar ningún if.
        final String[] ORIGENES = {"Elfo", "Enano", "Orco", "Humano", "Gnomo", "Mediano"};
        final String[] PROFESIONES = {"Guerrero", "Mago", "Arquero", "Pícaro",
                                      "Clérigo", "Paladín", "Bardo", "Druida"};

        // ---------------------------------------------------------------
        // ARRAYS PARALELOS DE ESTADÍSTICAS
        // ---------------------------------------------------------------
        // Posición:              0          1           2
        final String[] NOMBRES_ESTADISTICAS = {"Fuerza", "Destreza", "Magia"};
        // new int[n] crea un array de n enteros (todos a 0 al principio).
        // Usamos NOMBRES_ESTADISTICAS.length como tamaño para GARANTIZAR que
        // ambos arrays miden lo mismo, tal y como exige el enunciado.
        // Aquí guardamos los valores SIN bonificación (como "fuerzaBase" en la
        // Fase 5); el bonus se suma solo al mostrarlos.
        int[] valoresEstadisticas = new int[NOMBRES_ESTADISTICAS.length];

        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        String nombre = "--";
        String origen = "--";
        String profesion = "--";

        double altura = ALTURA_MIN + aleatorio.nextDouble() * (ALTURA_MAX - ALTURA_MIN);
        double peso = PESO_MIN + aleatorio.nextDouble() * (PESO_MAX - PESO_MIN);

        // Tirada inicial: un for recorre todas las posiciones del array.
        // i va de 0 a length-1 (por eso "<" y no "<="; con "<=" nos saldríamos
        // del array y saltaría ArrayIndexOutOfBoundsException).
        for (int i = 0; i < valoresEstadisticas.length; i++) {
            valoresEstadisticas[i] = aleatorio.nextInt(STAT_MAX - STAT_MIN + 1) + STAT_MIN;
        }

        int opcion;

        do {
            // -----------------------------------------------------------
            // A) ¿QUÉ ESTADÍSTICA BONIFICA LA PROFESIÓN ACTUAL?
            // -----------------------------------------------------------
            // En vez de sumar a una variable concreta (fuerza, magia...),
            // ahora guardamos el ÍNDICE de la estadística bonificada:
            // 0 = Fuerza, 1 = Destreza, 2 = Magia. -1 significa "ninguna"
            // (-1 nunca es un índice válido, por eso sirve como marca).
            int indiceBonificado;
            switch (profesion) {
                case "Guerrero":
                case "Paladín":
                    // Dos case seguidos sin break: ambos ejecutan lo mismo.
                    // Aquí el "fall-through" es intencionado.
                    indiceBonificado = 0; // Fuerza
                    break;
                case "Arquero":
                case "Pícaro":
                    indiceBonificado = 1; // Destreza
                    break;
                case "Mago":
                case "Clérigo":
                case "Bardo":
                case "Druida":
                    indiceBonificado = 2; // Magia
                    break;
                default:
                    indiceBonificado = -1; // "--": sin profesión, sin bonus
            }

            // -----------------------------------------------------------
            // B) FICHA COMPLETA
            // -----------------------------------------------------------
            System.out.println();
            System.out.println(CIAN + LINEA + RESET);
            System.out.println(CIAN + "\t\t\tGENERADOR DE FICHAS RPG" + RESET);
            System.out.println(CIAN + LINEA + RESET);
            System.out.println("Nombre: " + nombre + "\t\tOrigen: " + origen + "\t\tProfesión: " + profesion);
            System.out.printf("Altura: %.2f m\t\tPeso: %.2f kg%n", altura, peso);
            if (indiceBonificado == -1) {
                System.out.println("Bonificación: ninguna (elige una profesión)");
            } else {
                // El índice nos da el nombre de la estadística en el otro array.
                System.out.println("Bonificación: +" + BONIFICACION + " a "
                        + NOMBRES_ESTADISTICAS[indiceBonificado] + " (" + profesion + ")");
            }
            System.out.println();

            // UN SOLO BUCLE escribe todas las estadísticas. En la Fase 5
            // repetíamos el mismo bloque de código 3 veces; ahora, si
            // añadiésemos una 4ª estadística a los arrays, este bucle la
            // mostraría sin cambiar nada.
            for (int i = 0; i < NOMBRES_ESTADISTICAS.length; i++) {
                // Valor final = valor base + bonus (solo en la bonificada).
                int valor = valoresEstadisticas[i];
                if (i == indiceBonificado) {
                    valor += BONIFICACION;
                }

                // Color según el tercio (igual que en Fase 4 y 5).
                String color;
                if (valor < LIMITE_BAJO) {
                    color = ROJO;
                } else if (valor < LIMITE_MEDIO) {
                    color = AMARILLO;
                } else {
                    color = VERDE;
                }

                // printf con %-10s: escribe el texto alineado a la izquierda
                // ocupando 10 caracteres. Así "Fuerza", "Destreza" y "Magia"
                // quedan en columna sin calcular cuántos \t poner a cada una.
                System.out.printf("%-10s\t%s%d\t", NOMBRES_ESTADISTICAS[i] + ":", color, valor);
                // Bucle anidado para los asteriscos (j, porque i ya está en uso).
                for (int j = 0; j < valor; j++) {
                    System.out.print("*");
                }
                System.out.println(RESET);
            }

            // -----------------------------------------------------------
            // C) MENÚ
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
            sc.nextLine(); // limpia el Enter que deja nextInt()
            System.out.println(CIAN + LINEA + RESET);

            switch (opcion) {
                case 1:
                    System.out.print("Escribe el nuevo nombre: ");
                    nombre = sc.nextLine();
                    break;

                case 2:
                    int opcionOrigen;
                    do {
                        // El rango que se indica sale del tamaño del array.
                        System.out.println("Elige el origen de tu personaje (1-" + ORIGENES.length + "):");
                        // MOSTRAR las opciones recorriendo el array.
                        // Mostramos i + 1 porque al jugador le resulta natural
                        // empezar en 1, aunque el array empiece en 0.
                        for (int i = 0; i < ORIGENES.length; i++) {
                            System.out.println("\t" + (i + 1) + ".- " + ORIGENES[i]);
                        }
                        System.out.print("Opción: ");
                        opcionOrigen = sc.nextInt();
                        // COMPROBAR que ha elegido una opción del array: el
                        // número tiene que estar entre 1 y el tamaño del array.
                        if (opcionOrigen < 1 || opcionOrigen > ORIGENES.length) {
                            System.out.println(ROJO + "Opción no válida. Debe estar entre 1 y "
                                    + ORIGENES.length + "." + RESET);
                        }
                    } while (opcionOrigen < 1 || opcionOrigen > ORIGENES.length);

                    // Desaparece la cadena de if..else if de fases anteriores:
                    // el número elegido menos 1 ES la posición en el array.
                    origen = ORIGENES[opcionOrigen - 1];
                    break;

                case 3:
                    int opcionProfesion;
                    do {
                        System.out.println("Elige la profesión de tu personaje (1-" + PROFESIONES.length + "):");
                        for (int i = 0; i < PROFESIONES.length; i++) {
                            System.out.println("\t" + (i + 1) + ".- " + PROFESIONES[i]);
                        }
                        System.out.print("Opción: ");
                        opcionProfesion = sc.nextInt();
                        if (opcionProfesion < 1 || opcionProfesion > PROFESIONES.length) {
                            System.out.println(ROJO + "Opción no válida. Debe estar entre 1 y "
                                    + PROFESIONES.length + "." + RESET);
                        }
                    } while (opcionProfesion < 1 || opcionProfesion > PROFESIONES.length);

                    profesion = PROFESIONES[opcionProfesion - 1];
                    break;

                case 4:
                    // Nuevas tiradas: recorremos el array de valores.
                    for (int i = 0; i < valoresEstadisticas.length; i++) {
                        valoresEstadisticas[i] = aleatorio.nextInt(STAT_MAX - STAT_MIN + 1) + STAT_MIN;
                    }
                    System.out.println("Se han vuelto a tirar los dados de las estadísticas.");
                    break;

                case 5:
                    System.out.println(VERDE + "¡Hasta la próxima aventura!" + RESET);
                    break;

                default:
                    System.out.println(ROJO + "Opción no válida. Elige un número del 1 al 5." + RESET);
            }

        } while (opcion != 5);

        sc.close();
    }
}
