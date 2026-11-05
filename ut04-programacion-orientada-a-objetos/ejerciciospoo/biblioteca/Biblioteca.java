public class Biblioteca {

    // Atributos
    private String nombre;
    private String direccion;
    private String telefono;
    private int totalLibros;

    // Constructor
    public Biblioteca(String nombre, String direccion, String telefono, int totalLibros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.totalLibros = totalLibros;
    }

    // Método para prestar libro
    public void prestarLibro(Usuario usuario, Libro libro) {
        System.out.println(
                "\nSolicitud de préstamo: " + usuario.getNombreCompleto() + " pide '" + libro.getTitulo() + "'");

        // Comprobamos si el usuario ya tiene tres libros prestados
        if (usuario.getCantidadLibros() < 3) {
            usuario.añadirLibro(libro);
            System.out.println("ÉXITO, libro prestado correctamente.");
        } else {
            System.out.println("ERROR, el usuario ya tiene 3 libros prestados.");
        }
    }

    // Método para devolver el libro
    public void devolverLibro(Usuario usuario, Libro libro) {
        System.out.println("\nDevolución de: " + usuario.getNombreCompleto() + " | Libro: '" + libro.getTitulo() + "'");
        usuario.quitarLibro(libro);
        System.out.println("Éxito, libro devuelto y registrado en el sistema.");
    }

}
