//Autor: JAPR
//Fecha: 10/Mar/2026
//Lógica de la app y menú de usuario

package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionBiblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Usamos un ArrayList para guardar objetos de tipo Libro
        ArrayList<Libro> listaLibros = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ BIBLIOTECA ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por título");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Mostrar todos los libros");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer después de leer un número

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String t = sc.nextLine();
                    System.out.print("Autor: ");
                    String a = sc.nextLine();
                    System.out.print("ISBN: ");
                    String i = sc.nextLine();
                    listaLibros.add(new Libro(t, a, i));
                    System.out.println("✅ Libro agregado con éxito.");
                    break;

                case 2:
                    System.out.print("Introduce el título (o parte de él): ");
                    String busquedaT = sc.nextLine();
                    boolean encontradoT = false;
                    for (Libro l : listaLibros) {
                        // contains() permite buscar texto dentro de otro texto
                        if (l.getTitulo().toLowerCase().contains(busquedaT.toLowerCase())) {
                            System.out.println(l);
                            encontradoT = true;
                        }
                    }
                    if (!encontradoT) System.out.println("❌ No se encontraron libros.");
                    break;

                case 3:
                    System.out.print("Introduce el autor: ");
                    String busquedaA = sc.nextLine();
                    boolean encontradoA = false;
                    for (Libro l : listaLibros) {
                        if (l.getAutor().equalsIgnoreCase(busquedaA)) {
                            System.out.println("Primer libro encontrado: " + l);
                            encontradoA = true;
                            break; // El enunciado dice "el primer libro que encuentre"
                        }
                    }
                    if (!encontradoA) System.out.println("❌ Autor no encontrado.");
                    break;

                case 4:
                    System.out.println("--- LISTADO COMPLETO ---");
                    if (listaLibros.isEmpty()) {
                        System.out.println("La biblioteca está vacía.");
                    } else {
                        for (Libro l : listaLibros) System.out.println(l);
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}