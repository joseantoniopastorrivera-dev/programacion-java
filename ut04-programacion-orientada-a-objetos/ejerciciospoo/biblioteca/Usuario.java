//Autor: JAPR
//Fecha: 14/Feb/2026
//Clase Usuario

public class Usuario {

    // Atributos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String telefono;
    private String email;
    private String direccion;

    // Atributos clave
    private Libro[] librosPrestados;
    private int cantidadLibros;

    // Constructor
    public Usuario(String nombre, String apellido1, String apellido2, String dni, String telefono, String email,
            String direccion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;

        // Inicializamos el array con un máximo de 3 huecos
        this.librosPrestados = new Libro[3];
        this.cantidadLibros = 0;
    }

    // Getters y Setters
    public String getNombreCompleto() {
        return nombre + " " + apellido1 + " " + apellido2;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    // Métodos de gestión de libros(LLamados por Biblioteca.java)
    public void añadirLibro(Libro libro) {
        for (int i = 0; i < librosPrestados.length; i++) {
            if (librosPrestados[i] == null) {
                librosPrestados[i] = libro;
                cantidadLibros++;
                break;
            }
        }
    }

    public void quitarLibro(Libro libro) {
        for (int i = 0; i < librosPrestados.length; i++) {
            // Buscamos el libro por su isbn y lo borramos
            if (librosPrestados[i] != null && librosPrestados[i].getNumIsbn().equals(libro.getNumIsbn())) {
                librosPrestados[i] = null;
                cantidadLibros--;
                break;
            }
        }
    }

}
