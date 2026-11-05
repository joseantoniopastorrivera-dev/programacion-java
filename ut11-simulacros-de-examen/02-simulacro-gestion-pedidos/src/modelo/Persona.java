package modelo;

/**
 * Clase que representa a una persona de contacto con nombre, apellidos y correo electrónico.
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private String email;

    /**
     * Constructor vacío. Necesario para algunas operaciones como serialización o frameworks que requieren un constructor por defecto.
     */
    public Persona() {}

    /**
     * Constructor con parámetros.
     *
     * @param nombre    Nombre de la persona
     * @param apellidos Apellidos de la persona
     * @param dni       No se utiliza en esta versión pero estaba en la firma original
     * @param telefono  No se utiliza en esta versión pero estaba en la firma original
     * @param email     Correo electrónico de la persona
     */
    public Persona(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    /**
     * Devuelve el nombre de la persona.
     * @return Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     * @param nombre Nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve los apellidos de la persona.
     * @return Apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos de la persona.
     * @param apellidos Apellidos a establecer
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Devuelve el correo electrónico de la persona.
     * @return Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico de la persona.
     * @param email Email a establecer
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Devuelve una representación en cadena del objeto Persona.
     * @return Cadena con nombre, apellidos y email
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + "]";
    }
}
