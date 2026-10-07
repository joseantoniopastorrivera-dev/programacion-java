package modelo;

/**
 * Clase que representa a un cliente.
 * Contiene información fiscal, de contacto y de localización.
 */
public class Cliente {
    private String cif;
    private String nombre;
    private String direccion;
    private Persona personaContacto;
    private String telefono;

    /**
     * Constructor vacío. Necesario para ciertas operaciones como frameworks o serialización.
     */
    public Cliente() {}

    /**
     * Constructor con todos los atributos.
     *
     * @param cif              CIF del cliente (identificador fiscal)
     * @param nombre           Nombre o razón social del cliente
     * @param direccion        Dirección física del cliente
     * @param personaContacto  Persona de contacto asociada al cliente
     * @param telefono         Teléfono principal del cliente
     */
    public Cliente(String cif, String nombre, String direccion, Persona personaContacto, String telefono) {
        this.cif = cif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.personaContacto = personaContacto;
        this.telefono = telefono;
    }

    /**
     * Obtiene el CIF del cliente.
     *
     * @return CIF del cliente
     */
    public String getCif() {
        return cif;
    }

    /**
     * Establece el CIF del cliente.
     *
     * @param cif CIF a establecer
     */
    public void setCif(String cif) {
        this.cif = cif;
    }

    /**
     * Obtiene el nombre o razón social del cliente.
     *
     * @return Nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre o razón social del cliente.
     *
     * @param nombre Nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección del cliente.
     *
     * @return Dirección del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del cliente.
     *
     * @param direccion Dirección a establecer
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene la persona de contacto del cliente.
     *
     * @return Objeto Persona asociado al cliente
     */
    public Persona getPersonaContacto() {
        return personaContacto;
    }

    /**
     * Establece la persona de contacto del cliente.
     *
     * @param personaContacto Persona de contacto a establecer
     */
    public void setPersonaContacto(Persona personaContacto) {
        this.personaContacto = personaContacto;
    }

    /**
     * Obtiene el teléfono del cliente.
     *
     * @return Teléfono del cliente
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del cliente.
     *
     * @param telefono Teléfono a establecer
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve una representación en texto del cliente, incluyendo datos básicos y de contacto.
     *
     * @return Cadena descriptiva del cliente
     */
    @Override
    public String toString() {
        return "Cliente: " + nombre +
                " (CIF: " + cif + ")\n" +
                "Dirección: " + direccion + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Contacto: " + personaContacto;
    }
}
