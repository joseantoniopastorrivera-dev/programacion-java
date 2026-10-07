//Autor: JAPR
//Fecha: 14/Feb/2026
//Clase hija Bateria.java

public class Bateria extends Instrumento {

    public Bateria(String nombre) {
        super(nombre, "Percusión");
    }

    @Override
    public void tocar() {
        System.out.println("La " + getNombre() + " se toca golpeando cosas para que suenen.");
    }
}
