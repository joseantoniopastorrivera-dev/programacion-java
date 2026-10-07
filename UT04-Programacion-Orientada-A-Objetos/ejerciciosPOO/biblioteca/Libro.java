//Autor: JAPR
//Fecha: 14/Feb/2026
//Clase Libro

public class Libro {

    // Atributos
    private String titulo;
    private String autor;
    private String numero_isbn;
    private float precio;

    // Constructor
    public Libro(String titulo, String autor, String numero_isbn, float precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_isbn = numero_isbn;
        this.precio = precio;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNumIsbn() {
        return numero_isbn;
    }

    public void setNumIsbn(String num_isbn) {
        this.numero_isbn = num_isbn;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // Método Override
    @Override
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor + " | ISBN: " + numero_isbn + " Precio: " + precio;
    }
}