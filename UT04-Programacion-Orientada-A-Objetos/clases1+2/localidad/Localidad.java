//Autor: JAPR
//Fecha: 03/02/26
//Clase de Localidad 

package localidad;

public class Localidad {

    // 1.Atributos
    private String nombre;
    private String provincia;
    private int numHabitantes;
    private double distanciaACapital;
    private double superficie;
    private double rentaPerCapita;

    // 2.Constructor
    public Localidad(String nombre, String provincia, int numHabitantes, double distanciaACapital,
            double superficie, double rentaPerCapita) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.numHabitantes = numHabitantes;
        this.distanciaACapital = distanciaACapital;
        this.superficie = superficie;
        this.rentaPerCapita = rentaPerCapita;
    }

    // 3.Getters y Setters (Métodos para asignar y obtener valor)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public double getDistanciaACapital() {
        return distanciaACapital;
    }

    public void setDistanciaACapital(double distanciaACapital) {
        this.distanciaACapital = distanciaACapital;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getRentaPerCapita() {
        return rentaPerCapita;
    }

    public void setRentaPerCapita(double rentaPerCapita) {
        this.rentaPerCapita = rentaPerCapita;
    }

    // 4.Métodos de los ejercicios
    // HOJA 1
    // EJERCICIO 3
    // Comprobar quien tiene más población
    public boolean tieneMasPoblacion(Localidad otraLocalidad) {
        if (this.numHabitantes > otraLocalidad.getNumHabitantes()) {
            return true;
        } else {
            return false;
        }
    }

    // AMPLIACIÓN EJERCICIO 3
    // Comprobar quien está mas lejos
    public boolean estaMasLejos(Localidad otraLocalidad) {
        if (this.distanciaACapital > otraLocalidad.getDistanciaACapital()) {
            return true;
        } else {
            return false;
        }
    }

    // EJERCICIO 4
    // Calcular densidad de población
    public double densidadDePoblacion() {
        // Al dividir un 'int' entre un 'double', Java devuelve un double
        double densidad = this.numHabitantes / this.superficie;
        return densidad;
    }

    // EJERCICIO 8
    // Calcular la renta potencial (renta per capita * poblacion)
    public double rentaPotencial() {
        double rentaPotencialDouble = this.numHabitantes * this.rentaPerCapita;
        return rentaPotencialDouble;
    }


}
