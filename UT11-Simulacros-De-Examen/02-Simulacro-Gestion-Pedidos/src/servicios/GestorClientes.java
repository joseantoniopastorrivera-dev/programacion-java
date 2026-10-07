
/**
 * Clase de utilidad para gestionar clientes de forma interactiva.
 * Permite añadir nuevos clientes con validación de CIF duplicado.
 * @author Ruth Lospitao
 * @version 1.0
 */
package servicios;

import java.util.Map;

import modelo.Cliente;
import modelo.Persona;
import utilidades.Utilidades;

public class GestorClientes {

    /**
     * Añade un cliente a la colección, comprobando que no se repita el CIF.
     *
     * @param clientes Mapa con clave CIF y valor Cliente
     */
    public static void anadirCliente(Map<String, Cliente> clientes) {

        String cif = Utilidades.pedirStringConPatron(
                "CIF del cliente",
                "^[A-Z]\\d{8}$", // Ejemplo: B12345678
                "Formato de CIF no válido (ej. B12345678)").toUpperCase();
        if (clientes.containsKey(cif)) {
            System.out.println("\u001B[31m Ya existe un cliente con ese CIF.\u001B[0m");

        } else {

            Cliente nuevoCliente = crearClienteDesdeConsola(cif);
            clientes.put(cif, nuevoCliente);
            System.out.println("\u001B[32m Cliente añadido correctamente.\u001B[0m");
        }
    }

    /**
     * Solicita los datos del cliente y crea un objeto Cliente con su persona de
     * contacto.
     *
     * @param cif CIF único del cliente
     * @return Objeto Cliente construido a partir de la entrada del usuario
     */
    private static Cliente crearClienteDesdeConsola(String cif) {
        String nombre = Utilidades.pedirString("Nombre o razón social");
        String direccion = Utilidades.pedirString("Dirección");

        String telefono = Utilidades.pedirStringConPatron(
                "Teléfono del cliente",
                "^\\d{9,12}$",
                "Teléfono no válido. Introduce entre 9 y 12 dígitos.");

        Persona contacto = crearPersonaContacto();
        return new Cliente(cif, nombre, direccion, contacto, telefono);
    }

    /**
     * Solicita los datos de la persona de contacto y construye un objeto Persona.
     *
     * @return Persona de contacto asociada al cliente
     */
    private static Persona crearPersonaContacto() {
        String nomContacto = Utilidades.pedirString("Nombre de contacto");
        String apellidos = Utilidades.pedirString("Apellidos");

        String email = Utilidades.pedirStringConPatron(
                "Email de contacto",
                "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$",
                "Formato de correo electrónico no válido. Intente de nuevo.");
        return new Persona(nomContacto, apellidos, email);
    }
}
