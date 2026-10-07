//Autor: JAPR
//Fecha: 10/Mar/2026
//Entidad que representa libro en el sistema

package biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    // Getters para poder buscar por estos campos
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor + " | ISBN: " + isbn;
    }
}