//Autor: JAPR
//Fecha: 14/Feb/2026
//Clase hija Flauta.java

public class Flauta extends Instrumento {

    // Atributos
    // Constructor
    public Flauta(String nombre) {
        super(nombre, "Viento");
    }

    // Getters y Setters
    // Métodos
    @Override
    public void tocar() {
        System.out.println("La " + getNombre() + " se toca soplando aire a través de un cilindro con agujeros.");
    }

}
