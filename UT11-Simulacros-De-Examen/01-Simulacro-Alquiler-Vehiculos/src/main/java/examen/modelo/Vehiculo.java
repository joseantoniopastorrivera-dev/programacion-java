package examen.modelo;

import java.io.Serializable;

//Superclase abstracta que define comportamiento de cualquier vehículo.
public abstract class Vehiculo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String codigo;
    private String marca;
    private String modelo;
    private int anio;
    private boolean disponible;

    public Vehiculo(String codigo, String marca, String modelo, int anio, boolean disponible) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.disponible = disponible;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Métodos polimórficos (obligamos a las hijas a implementarlos)
    public abstract String getTipo();

    public abstract String getDato1();

    public abstract String getDato2();

    public abstract double getCosteDiario();

    public abstract int getDiasMaximos();

    public abstract double getPenalizacionDia();

    @Override
    public String toString() {
        return String.format("Código: %-13s | Tipo: %-9s | Marca: %-10s | Modelo: %-12s | Año: %d", codigo,
                this.getTipo(), marca, modelo, anio);
    }

}
