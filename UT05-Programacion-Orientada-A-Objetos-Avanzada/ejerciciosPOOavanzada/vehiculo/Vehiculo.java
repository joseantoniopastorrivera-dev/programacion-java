//Autor: JAPR
//Fecha: 14/Feb/2026
//Clase Padre Vehiculo.java

public class Vehiculo {

    // Atributos
    private String marca;
    private String modelo;
    private String matricula;

    // Constructor
    public Vehiculo(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Métodos
    public void acelerar() {
        System.out.println("El vehículo marca: '" + marca + "' | Modelo: '" + modelo + "' está acelerando.");
    }

    // Override
    @Override
    public String toString() {
        return "Marca: " + marca + " | Modelo: " + modelo + " | Matrícula: " + matricula;
    }
}