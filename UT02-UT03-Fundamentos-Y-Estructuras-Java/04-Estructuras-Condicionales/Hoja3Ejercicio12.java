//Autor: JAPR
//Fecha: 03/01/26
//Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que 
//se imparten en el curso. Cada pregunta acertada sumará un punto.
//El programa mostrará al final la calificación obtenida.

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja3Ejercicio12 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        int nota = 0;
        String respuesta = "";

        // Primera pregunta.
        System.out.println("Indique que asignatura se imparte en el grado (a, b, c ó d): \n" +
                "a)Matemáticas.\n" + "b)Lengua.\n" + "c)Sistemas Informáticos.\n" + "d)Inglés.");
        respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("c")) {
            nota = nota + 1;
            System.out.println("Respuesta correcta.");
        } else {
            System.out.println("ERROR: Respuesta incorrecta.");
        }

        // Segunda pregunta.
        System.out.println("Indique que asignatura se imparte en el grado (a, b, c ó d): \n" + "a)Francés.\n"
                + "b)Programación.\n" + "c)Conocimiento del Medio.\n" + "d)Historia del Arte.");
        respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("b")) {
            nota = nota + 1;
            System.out.println("Respuesta correcta.");
        } else {
            System.out.println("ERROR: Respuesta incorrecta.");
        }

        // Tercera pregunta.
        System.out.println("Indique que asignatura se imparte en el grado (a, b, c ó d): \n" + "a)Bases de Datos.\n"
                + "b)Chino.\n" + "c)Literatura.\n" + "d)Lenguas antiguas.");
        respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("a")) {
            nota = nota + 1;
            System.out.println("Respuesta correcta.");
        } else {
            System.out.println("ERROR: Respuesta incorrecta.");
        }

        // Cuarta pregunta.
        System.out.println("Indique que asignatura se imparte en el grado (a, b, c ó d): \n" + "a)Ruso.\n"
                + "b)Ampliación de Matemáticas.\n" + "c)Dibujo Técnico.\n" + "d)Entornos de Desarrollo.");
                respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("d")) {
            nota = nota + 1;
            System.out.println("Respuesta correcta.");
        } else {
            System.out.println("ERROR: Respuesta incorrecta.");
        }

        // Quinta pregunta.
        System.out.println("Indique que asignatura se imparte en el grado (a, b, c ó d): \n" + "a)Danés.\n"
                + "b)Ampliación de Lengua.\n" + "c)Lenguaje de Marcas.\n" + "d)Religión.");
                respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("c")) {
            nota = nota + 1;
            System.out.println("Respuesta correcta.");
        } else {
            System.out.println("ERROR: Respuesta incorrecta.");
        }

        // Sexta pregunta.
        System.out.println("Indique que asignatura se imparte en el grado (a, b, c ó d): \n" + "a)Italiano.\n"
                + "b)Itinerario Personal para la Empleabilidad.\n" + "c)Historia de las Religiones.\n" + "d)Física.");
                respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("b")) {
            nota = nota + 1;
            System.out.println("Respuesta correcta.");
        } else {
            System.out.println("ERROR: Respuesta incorrecta.");
        }

        // Séptima pregunta.
        System.out.println(
                "Indique que asignatura se imparte en el grado (a, b, c ó d): \n" + "a)Fundamentos de Programación.\n"
                        + "b)Ampliación de Física.\n" + "c)Dibujo Artístico.\n" + "d)Integración Social.");
                        respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("a")) {
            nota = nota + 1;
            System.out.println("Respuesta correcta.");
        } else {
            System.out.println("ERROR: Respuesta incorrecta.");
        }

        // Octava pregunta.
        System.out.println("Indique que asignatura se imparte en el grado (a, b, c ó d): \n" + "a)Croata.\n"
                + "b)Ampliación de Química.\n" + "c)Química.\n" + "d)Acceso a Datos.");
                respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("d")) {
            nota = nota + 1;
            System.out.println("Respuesta correcta.");
        } else {
            System.out.println("ERROR: Respuesta incorrecta.");
        }

        // Novena pregunta.
        System.out.println(
                "Indique que asignatura se imparte en el grado (a, b, c ó d): \n" + "a)Sistemas de Gestión Empresarial.\n"
                        + "b)Ampliación de Francés.\n" + "c)Dibujo con Carboncillo.\n" + "d)Psicología.");
                        respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("a")) {
            nota = nota + 1;
            System.out.println("Respuesta correcta.");
        } else {
            System.out.println("ERROR: Respuesta incorrecta.");
        }

        // Décima pregunta.
        System.out.println("Indique que asignatura se imparte en el grado (a, b, c ó d): \n"
                + "a)Empresa e Iniciativa Emprendedora.\n"
                + "b)Biología.\n" + "c)Historia de España.\n" + "d)Ética.");
                respuesta = scanner.next().toLowerCase();
        if (respuesta.equals("a")) {
            nota = nota + 1;
            System.out.println("Respuesta correcta.");
        } else {
            System.out.println("ERROR: Respuesta incorrecta.");
        }

        // Imprimimos el resultado.
        System.out.println("Su nota es: " + nota);

        // Cerramos el scanner para liberar memoria.
        scanner.close();
    }

}
