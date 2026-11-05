public class Camion extends Vehiculo {

    // Atributos
    private double capacidadCarga;

    // Constructor
    public Camion(String marca, String modelo,String matricula, double capacidadCarga) {
        super(marca, modelo, matricula);
        this.capacidadCarga = capacidadCarga;

    }

    // Getters y Setters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    // Métodos
    @Override
    public void acelerar() {
        System.out.println("El camión " + getMarca() + " " + getModelo() + " con capacidad de carga " + capacidadCarga
                + " acelera de pena.");
    }

    @Override
    public String toString() {
        return super.toString() + " | Capacidad de carga: "
                + capacidadCarga;
    }
}
