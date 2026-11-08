import java.util.Scanner;

// FASE 2: partimos de la Fase 1 y añadimos:
//   a) Al pedir cada dato, indicamos los valores o el rango válido.
//   b) Si el dato no es válido: avisamos del error, NO mostramos la ficha
//      y terminamos el programa.
//   c) Bonificación de una estadística según la profesión, informando de
//      ello antes de mostrar la ficha.
public class App {

    public static void main(String[] args) {

        // ---------------------------------------------------------------
        // CONSTANTES: los límites de los rangos válidos.
        // ---------------------------------------------------------------
        // "final" significa que su valor no puede cambiar después.
        // Las escribimos en MAYÚSCULAS por convenio de Java para constantes.
        // Ventaja: si mañana el rango de estadísticas pasa a ser 1-100,
        // solo cambiamos un número aquí y no en cada if y cada mensaje.
        final double ALTURA_MIN = 1.40;
        final double ALTURA_MAX = 2.20;
        final double PESO_MIN = 40.0;
        final double PESO_MAX = 150.0;
        final int STAT_MIN = 1;
        final int STAT_MAX = 20;
        // Puntos que suma la bonificación de profesión.
        final int BONIFICACION = 5;

        Scanner sc = new Scanner(System.in);

        System.out.println("===== GENERADOR DE FICHAS RPG =====");
        System.out.println();

        // ---------------------------------------------------------------
        // 1) NOMBRE
        // ---------------------------------------------------------------
        // El nombre es texto libre: no tiene rango, así que no se valida.
        System.out.print("Escribe el nombre de tu personaje: ");
        String nombre = sc.nextLine();

        // ---------------------------------------------------------------
        // 2) ORIGEN
        // ---------------------------------------------------------------
        System.out.println();
        // Indicamos el rango válido en la propia pregunta: "(1-3)".
        System.out.println("Elige el origen de tu personaje (1-3):");
        System.out.println("1.- Elfo");
        System.out.println("2.- Enano");
        System.out.println("3.- Orco");
        System.out.print("Opción: ");
        int opcionOrigen = sc.nextInt();

        // VALIDACIÓN: si está fuera del rango 1-3 es un error.
        // Usamos "||" (O lógico): basta con que una condición se cumpla.
        if (opcionOrigen < 1 || opcionOrigen > 3) {
            System.out.println("ERROR: el origen debe ser 1, 2 o 3. Fin del programa.");
            // "return" dentro de main termina el método main y, con él,
            // el programa. Así no se pregunta nada más ni se muestra la ficha.
            // Lo preferimos a System.exit(0) porque es más limpio: sale de
            // main de forma normal.
            sc.close();
            return;
        }

        // Si llegamos aquí, la opción es 1, 2 o 3 seguro.
        String origen;
        if (opcionOrigen == 1) {
            origen = "Elfo";
        } else if (opcionOrigen == 2) {
            origen = "Enano";
        } else {
            origen = "Orco";
        }

        // ---------------------------------------------------------------
        // 3) PROFESIÓN (misma idea que el origen)
        // ---------------------------------------------------------------
        System.out.println();
        System.out.println("Elige la profesión de tu personaje (1-3):");
        System.out.println("1.- Guerrero (+" + BONIFICACION + " Fuerza)");
        System.out.println("2.- Mago (+" + BONIFICACION + " Magia)");
        System.out.println("3.- Arquero (+" + BONIFICACION + " Destreza)");
        System.out.print("Opción: ");
        int opcionProfesion = sc.nextInt();

        if (opcionProfesion < 1 || opcionProfesion > 3) {
            System.out.println("ERROR: la profesión debe ser 1, 2 o 3. Fin del programa.");
            sc.close();
            return;
        }

        String profesion;
        if (opcionProfesion == 1) {
            profesion = "Guerrero";
        } else if (opcionProfesion == 2) {
            profesion = "Mago";
        } else {
            profesion = "Arquero";
        }

        // ---------------------------------------------------------------
        // 4) ALTURA Y PESO
        // ---------------------------------------------------------------
        System.out.println();
        // Usamos las constantes en el mensaje para que el rango que se
        // muestra sea siempre el mismo que se comprueba. Usamos printf con
        // %.2f porque formatea con el idioma del sistema: escribe "1,40"
        // (con coma), igual que hay que teclearlo. Con "+" saldría "1.4".
        System.out.printf("Altura en metros (%.2f - %.2f): ", ALTURA_MIN, ALTURA_MAX);
        double altura = sc.nextDouble();
        if (altura < ALTURA_MIN || altura > ALTURA_MAX) {
            System.out.printf("ERROR: la altura debe estar entre %.2f y %.2f. Fin del programa.%n", ALTURA_MIN, ALTURA_MAX);
            sc.close();
            return;
        }

        System.out.printf("Peso en kg (%.2f - %.2f): ", PESO_MIN, PESO_MAX);
        double peso = sc.nextDouble();
        if (peso < PESO_MIN || peso > PESO_MAX) {
            System.out.printf("ERROR: el peso debe estar entre %.2f y %.2f. Fin del programa.%n", PESO_MIN, PESO_MAX);
            sc.close();
            return;
        }

        // ---------------------------------------------------------------
        // 5) ESTADÍSTICAS
        // ---------------------------------------------------------------
        System.out.println();
        System.out.println("Introduce las estadísticas (" + STAT_MIN + "-" + STAT_MAX + "):");

        System.out.print("Fuerza: ");
        int fuerza = sc.nextInt();
        if (fuerza < STAT_MIN || fuerza > STAT_MAX) {
            System.out.println("ERROR: la fuerza debe estar entre " + STAT_MIN + " y " + STAT_MAX + ". Fin del programa.");
            sc.close();
            return;
        }

        System.out.print("Destreza: ");
        int destreza = sc.nextInt();
        if (destreza < STAT_MIN || destreza > STAT_MAX) {
            System.out.println("ERROR: la destreza debe estar entre " + STAT_MIN + " y " + STAT_MAX + ". Fin del programa.");
            sc.close();
            return;
        }

        System.out.print("Magia: ");
        int magia = sc.nextInt();
        if (magia < STAT_MIN || magia > STAT_MAX) {
            System.out.println("ERROR: la magia debe estar entre " + STAT_MIN + " y " + STAT_MAX + ". Fin del programa.");
            sc.close();
            return;
        }

        // ---------------------------------------------------------------
        // 6) BONIFICACIÓN POR PROFESIÓN
        // ---------------------------------------------------------------
        // Se aplica DESPUÉS de asignar los valores, como dice el enunciado.
        // Comparamos Strings con equals(), nunca con "==": "==" compara si
        // son el mismo objeto en memoria, no si tienen el mismo texto.
        System.out.println();
        if (profesion.equals("Guerrero")) {
            // "+=" es la forma corta de: fuerza = fuerza + BONIFICACION;
            fuerza += BONIFICACION;
            System.out.println("Bonificación de Guerrero: +" + BONIFICACION + " a la Fuerza.");
        } else if (profesion.equals("Mago")) {
            magia += BONIFICACION;
            System.out.println("Bonificación de Mago: +" + BONIFICACION + " a la Magia.");
        } else {
            destreza += BONIFICACION;
            System.out.println("Bonificación de Arquero: +" + BONIFICACION + " a la Destreza.");
        }
        // Nota: con la bonificación una estadística puede pasar de 20
        // (por ejemplo 18 + 5 = 23). Es intencionado: es un extra por encima
        // de lo que puede elegir el jugador.

        // ---------------------------------------------------------------
        // 7) FICHA COMPLETA (solo llegamos aquí si todo era válido)
        // ---------------------------------------------------------------
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

        sc.close();
    }
}
