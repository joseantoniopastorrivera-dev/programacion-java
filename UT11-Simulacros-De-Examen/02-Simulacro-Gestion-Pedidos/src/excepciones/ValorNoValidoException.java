package excepciones;
/**
 * Excepción personalizada que se lanza cuando se detecta un valor no válido en las operaciones.
 */
public class ValorNoValidoException extends Exception {

    /**
     * Constructor de la excepción que permite indicar un mensaje personalizado.
     * 
     * @param mensaje Mensaje que describe el error producido.
     */
    public ValorNoValidoException(String mensaje) {
        super(mensaje);
    }
}
