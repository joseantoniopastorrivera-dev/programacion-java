package examen.modelo;

public class Furgoneta extends Vehiculo {
    private static final long serialVersionUID = 1L;

    private String carga;
    private String volumen;

    public Furgoneta(String codigo, String marca, String modelo, int anio, boolean disponible, String carga,
            String volumen) {
        super(codigo, marca, modelo, anio, disponible);
        this.carga = carga;
        this.volumen = volumen;
    }

    @Override
    public String getTipo() {
        return "Furgoneta";
    }

    @Override
    public String getDato1() {
        return carga;
    }

    @Override
    public String getDato2() {
        return volumen;
    }

    @Override
    public double getCosteDiario() {
        return 80.0;
    }

    @Override
    public int getDiasMaximos() {
        return 7;
    }

    @Override
    public double getPenalizacionDia() {
        return 120.0;
    }

}
