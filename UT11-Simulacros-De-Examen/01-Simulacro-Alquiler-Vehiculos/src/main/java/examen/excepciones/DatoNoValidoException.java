package examen.excepciones;

public class DatoNoValidoException extends Exception{
    public DatoNoValidoException(String mensaje){
        super(mensaje);
    }
}
