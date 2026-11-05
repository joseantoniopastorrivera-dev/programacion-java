//Autor: JAPR
//Fecha: 14/Feb/2026
//Clase testeo de biblioteca

import java.util.Scanner;

public class TestBiblioteca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---INICIANDO SISTEMA DE BIBLIOTECA---");

        // Creamos la biblioteca
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca de mierda", "Calle falsa 123", "012-345-678", 1000);

        // Creamos libros
        Libro libro1 = new Libro("Título1", "autor1", "ISBN1", 1);
        Libro libro2 = new Libro("Título2", "Autor2", "ISBN2", 2);
        Libro libro3 = new Libro("Título3", "Autor3", "ISBN3", 3);
        Libro libro4 = new Libro("Título4", "Autor4", "ISBN4", 4);
        Libro libro5 = new Libro("Título5", "Autor5", "ISBN5", 5);

        // Creamos usuarios
        Usuario usuario1 = new Usuario("Jose", "Pastor", "Rivera", "01234567A", "111-111-111", "email1@email.com",
                "Calle Mayor, 1");
        Usuario usuario2 = new Usuario("Dani", "El Puto", "Amo", "98765432B", "222-222-222", "email2@gmail.com",
                "Calle Menor, 2");

                //PRUEBAS
                //Usuario1 se lleva 3 libros
                miBiblioteca.prestarLibro(usuario1, libro1);
                miBiblioteca.prestarLibro(usuario1, libro2);
                miBiblioteca.prestarLibro(usuario1, libro3);

                //Al cuarto debería de dar error
                miBiblioteca.prestarLibro(usuario1, libro4);

                //Usuario2 se lleva el libro que no ha podido llevarse usuario1
                miBiblioteca.prestarLibro(usuario2, libro4);

                //Usuario1 devuelve un libro
                miBiblioteca.devolverLibro(usuario1, libro3);

                //Usuario1 se lleva otro libro ahora que tiene un hueco disponible
                miBiblioteca.prestarLibro(usuario1, libro5);

        scanner.close();
    }

}
