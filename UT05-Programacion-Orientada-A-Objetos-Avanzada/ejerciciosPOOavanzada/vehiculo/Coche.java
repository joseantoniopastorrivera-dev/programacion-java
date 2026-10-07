//Autor: JAPR
//Fecha: 14/Feb/2026
//Clase hija Coche.java

public class Coche extends Vehiculo {

    // Atributos
    private int numeroPuertas;

    // Constructor
    public Coche(String marca, String modelo, String matricula, int numeroPuertas) {
        super(marca, modelo, matricula);
        this.numeroPuertas = numeroPuertas;
    }

    // Getters y Setters
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    // Sobreescribir el método del padre
    @Override
    public void acelerar() {
        System.out.println("El coche " + getMarca() + " acelera pisando el acelerador a tope.");
    }

@Override
public String toString(){
    return super.toString()+"| Número de puertas: "+numeroPuertas;
}

}
