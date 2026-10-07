//Autor: JAPR
//Fecha: 14/Feb/2026
//Clase madre Instrumento.java

public class Instrumento {

    // Atributos
    private String nombre;
    private String tipo;

    // Constructor
    public Instrumento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Métodos
    // Método genérico para tocar el instrumento
    public void tocar() {
        System.out.println("Haciendo sonar el instrumento: " + nombre);
    }

    // Método para mostrar la información básica
    @Override
    public String toString() {
        return "Instrumento: " + nombre + " | Tipo: " + tipo;
    }

}
