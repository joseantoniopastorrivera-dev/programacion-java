package examen.modelo;

public class Moto extends Vehiculo{
    private static final long serialVersionUID = 1L;

    private String cilindrada;
    private String tieneBaul;

    public Moto (String codigo, String marca, String modelo, int anio, boolean disponible, String cilindrada, String tieneBaul){
        super(codigo, marca, modelo, anio, disponible);
        this.cilindrada=cilindrada;
        this.tieneBaul=tieneBaul;
    }

    @Override
    public String getTipo(){
        return "Moto";
    }

    @Override
    public String getDato1(){
        return cilindrada;
    }

    @Override
    public String getDato2(){
        return tieneBaul;
    }

    @Override
    public double getCosteDiario(){
        return 30.0;
    }

    @Override
    public int getDiasMaximos(){
        return 15;
    }

    @Override
    public double getPenalizacionDia(){
        return 50.0;
    }
    
}
