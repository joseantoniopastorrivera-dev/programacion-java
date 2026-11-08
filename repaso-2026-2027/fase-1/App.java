// Importamos Scanner, la clase de la librería estándar que lee lo que el
// usuario escribe por teclado. Sin este import, Java no sabría qué es "Scanner".
import java.util.Scanner;

// La clase se llama App porque el enunciado pide entregar "App.java":
// en Java el nombre de la clase pública debe coincidir con el del fichero.
public class App {

    // main es el punto de entrada: es lo primero que ejecuta la JVM.
    public static void main(String[] args) {

        // Creamos UN solo Scanner conectado a System.in (el teclado).
        // Lo reutilizamos para todas las preguntas: crear varios sobre
        // System.in da problemas al cerrarlos.
        Scanner sc = new Scanner(System.in);

        // Título del programa, para que el jugador sepa dónde está.
        System.out.println("===== GENERADOR DE FICHAS RPG =====");
        System.out.println();

        // ---------------------------------------------------------------
        // 1) NOMBRE DEL PERSONAJE
        // ---------------------------------------------------------------
        // print (sin "ln") deja el cursor en la misma línea, así el jugador
        // escribe justo detrás de la pregunta.
        System.out.print("Escribe el nombre de tu personaje: ");
        // nextLine() lee la línea entera, con espacios incluidos
        // ("Aragorn hijo de Arathorn"). next() solo leería la primera palabra.
        String nombre = sc.nextLine();

        // ---------------------------------------------------------------
        // 2) ORIGEN (3 opciones)
        // ---------------------------------------------------------------
        // Mostramos un menú numerado: es más cómodo escribir "2" que "Enano"
        // y evita problemas de mayúsculas o tildes.
        System.out.println();
        System.out.println("Elige el origen de tu personaje:");
        System.out.println("1.- Elfo");
        System.out.println("2.- Enano");
        System.out.println("3.- Orco");
        System.out.print("Opción: ");
        // nextInt() lee un número entero. En esta fase el enunciado dice que
        // confiamos en el jugador, así que no comprobamos si es válido.
        int opcionOrigen = sc.nextInt();

        // Traducimos el número elegido al texto del origen.
        // Declaramos la variable antes del if para poder usarla después.
        String origen;
        if (opcionOrigen == 1) {
            origen = "Elfo";
        } else if (opcionOrigen == 2) {
            origen = "Enano";
        } else {
            // Si no es 1 ni 2 tiene que ser 3, porque confiamos en el jugador.
            // Usar "else" (y no "else if (== 3)") garantiza que la variable
            // siempre queda inicializada; si no, el compilador se queja.
            origen = "Orco";
        }

        // ---------------------------------------------------------------
        // 3) PROFESIÓN (3 opciones) - mismo esquema que el origen
        // ---------------------------------------------------------------
        System.out.println();
        System.out.println("Elige la profesión de tu personaje:");
        System.out.println("1.- Guerrero");
        System.out.println("2.- Mago");
        System.out.println("3.- Arquero");
        System.out.print("Opción: ");
        int opcionProfesion = sc.nextInt();

        String profesion;
        if (opcionProfesion == 1) {
            profesion = "Guerrero";
        } else if (opcionProfesion == 2) {
            profesion = "Mago";
        } else {
            profesion = "Arquero";
        }

        // ---------------------------------------------------------------
        // 4) ALTURA Y PESO (con decimales -> double)
        // ---------------------------------------------------------------
        System.out.println();
        // Avisamos de la coma: Scanner usa el idioma del sistema (español),
        // y en español el separador decimal es la coma. Si se escribe 1.75
        // en vez de 1,75 salta una excepción (InputMismatchException).
        System.out.print("Altura de tu personaje en metros (con coma, ej: 1,75): ");
        // double porque el enunciado pide "valores decimales".
        double altura = sc.nextDouble();

        System.out.print("Peso de tu personaje en kg (con coma, ej: 70,5): ");
        double peso = sc.nextDouble();

        // ---------------------------------------------------------------
        // 5) TRES ESTADÍSTICAS NUMÉRICAS (enteros)
        // ---------------------------------------------------------------
        System.out.println();
        System.out.println("Introduce las estadísticas de tu personaje:");
        System.out.print("Fuerza: ");
        int fuerza = sc.nextInt();
        System.out.print("Destreza: ");
        int destreza = sc.nextInt();
        System.out.print("Magia: ");
        int magia = sc.nextInt();

        // ---------------------------------------------------------------
        // 6) FICHA COMPLETA
        // ---------------------------------------------------------------
        // Solo se escribe cuando ya se han respondido todas las preguntas,
        // tal como pide el enunciado.
        System.out.println();
        System.out.println("===== FICHA DEL PERSONAJE =====");
        // Concatenamos texto y variables con "+".
        System.out.println("Nombre: " + nombre);
        System.out.println("Origen: " + origen);
        System.out.println("Profesión: " + profesion);
        // printf permite dar formato: %.2f = número decimal con 2 decimales,
        // %n = salto de línea. Así 1.7 se ve como "1,70".
        System.out.printf("Altura: %.2f m%n", altura);
        System.out.printf("Peso: %.2f kg%n", peso);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Destreza: " + destreza);
        System.out.println("Magia: " + magia);
        System.out.println("===============================");

        // Cerramos el Scanner al terminar: es buena práctica liberar recursos.
        sc.close();
    }
}
