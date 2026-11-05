package examen.modelo;

public class Coche extends Vehiculo{
    public static final long serialVersionUID = 1L;

    private String puertas;
    private String combustible;

    public Coche(String codigo, String marca, String modelo, int anio, boolean disponible, String puertas, String combustible){
        super(codigo, marca, modelo, anio, disponible);
        this.puertas=puertas;
        this.combustible=combustible;
    }

    @Override
    public String getTipo(){
        return "Coche";
    }
    
    @Override
    public String getDato1(){
        return puertas;
    }

    @Override
    public String getDato2(){
        return combustible;
    }

    @Override
    public double getCosteDiario(){
        return 50.0;
    }

    @Override
    public int getDiasMaximos(){
        return 30;
    }

    @Override
    public double getPenalizacionDia(){
        return 75.0;
    }
}
