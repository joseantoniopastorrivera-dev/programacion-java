//Autor: JAPR
//Fecha: 14/Feb/2026
//Clase hija Guitarra.java

public class Guitarra extends Instrumento {

    // Atributos

    // Constructor
    public Guitarra(String nombre) {
        super(nombre, "Cuerda");
    }

    // Getters y Setters

    // Métodos
    @Override
    public void tocar() {
        System.out
                .println("La " + getNombre() + " se toca rasgueando o punteando sus cuerdas con los dedos o una púa.");
    }
}
