public class Moto extends Vehiculo {

    // Atributos
    private String tipo;

    // Constructor
    public Moto(String marca, String modelo,String matricula, String tipo) {
        super(marca, modelo, matricula);
        this.tipo = tipo;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Sobreescribir el método padre
    @Override
    public void acelerar() {
        System.out.println(
                "La moto " + getMarca() + " " + getModelo() + " del tipo" + getTipo() + " acerelera que da miedo.");
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: " + tipo;
    }
}
