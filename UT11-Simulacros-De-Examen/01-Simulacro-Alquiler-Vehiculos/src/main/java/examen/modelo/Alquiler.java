package examen.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Alquiler implements Serializable {
    private static final long serialVersionUID = 1L;

    private String idAlquiler;
    private String nombreCliente;
    private Vehiculo vehiculo;
    private LocalDate fechaAlquiler;
    private LocalDate fechaPrevistaDevolucion;
    private LocalDate fechaRealDevolucion;

    public Alquiler(String idAlquiler, String nombreCliente, Vehiculo vehiculo, LocalDate fechaAlquiler,
            LocalDate fechaPrevistaDevolucion, LocalDate fechaRealDevolucion) {
        this.idAlquiler = idAlquiler;
        this.nombreCliente = nombreCliente;
        this.vehiculo = vehiculo;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaPrevistaDevolucion = fechaPrevistaDevolucion;
        this.fechaRealDevolucion = null;
    }

    // Método para saber el estado actual del alquiler
    public String getEstado() {
        if (fechaRealDevolucion == null) {
            return "Pendiente";
        } else {
            return "Devuelto";
        }
    }

    //Getters y Setters
    public String getIdAlquiler(){
        return idAlquiler;
    }

    public void setIdAlquiler(String idAlquiler){
        this.idAlquiler=idAlquiler;
    }

    public String getNombreCliente(){
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente){
        this.nombreCliente=nombreCliente;
    }

    public Vehiculo getVehiculo(){
        return vehiculo;
    } 

    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo=vehiculo;
    }

    public LocalDate getFechaAlquiler(){
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler){
        this.fechaAlquiler=fechaAlquiler;
    }

    public LocalDate getFechaPrevistaDevolucion(){
        return fechaPrevistaDevolucion;
    }

    public void setFechaPrevistaDevolucion(LocalDate fechaPrevistaDevolucion){
        this.fechaPrevistaDevolucion=fechaPrevistaDevolucion;
    }

    public LocalDate getFechaRealDevolucion(){
        return fechaRealDevolucion;
    }

    public void setFechaRealDevolucion(LocalDate fechaRealDevolucion){
        this.fechaRealDevolucion=fechaRealDevolucion;
    }

}
