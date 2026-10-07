//Autor: JAPR
//Fecha: 05/Feb/2026
//Clase Lampara.java

package lampara;

public class Lampara {

    // 1.Atributos
    private boolean encendida;
    private int intensidad;

    // 2.Constructor
    public Lampara() {
        this.encendida = false;
        this.intensidad = 0;
    }

    // 3.Getters y Setters básicos
    public boolean getEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }

    // MÉTODO DEL VOLTAJE
    public void setIntensidad(double voltaje) {
        if (voltaje < 1.5) {
            this.intensidad = 0;
        } else if (voltaje > 12.5) {
            this.intensidad = 100;
        } else {
            // Regla de tres:
            // El rango total de voltaje es 11 (12.5 - 1.5)
            // Restamos el mínimo (1.5) para empezar desde 0
            double calculo = ((voltaje - 1.5) * 100) / 11;
            // Lo convertimos en int
            this.intensidad = (int) calculo;
        }
    }

    // Método toString (Para mostrar el estado bonito)
    // Sobreescribimos el método original de Java
    @Override
    public String toString() {
        String estadoLuz;
        // Convertimos true/false como ONN/OFF
        if (this.encendida) {
            estadoLuz = "ON";
        } else {
            estadoLuz = "OFF";
        }
        return "Luz: " + estadoLuz + ", Intensidad: " + this.intensidad;
    }
}
