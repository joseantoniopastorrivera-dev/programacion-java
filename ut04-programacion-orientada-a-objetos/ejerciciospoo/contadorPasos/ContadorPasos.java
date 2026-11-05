// Autor: JAPR
// Fecha: 16/01/26
// Ejercicio: Contador de Pasos (POO)

package contadorPasos; //Indica que está en la carpeta ContadorPasos

public class ContadorPasos {

    // 1. ATRIBUTOS
    // Guardamos quién es el dueño y cuántos pasos lleva
    private String propietario;
    private int totalPasos;

    // 2. CONSTRUCTOR
    // Al crear el contador, los pasos empiezan siempre en 0 
    public ContadorPasos(String propietario) {
        this.propietario = propietario;
        this.totalPasos = 0; 
    }

    // 3. MÉTODOS DE ACCIÓN

    // A. Añadir pasos (Caminar) 
    public void caminar(int pasosNuevos) {
        // Validación: No se pueden dar pasos negativos 
        if (pasosNuevos > 0) {
            this.totalPasos += pasosNuevos; // Acumulamos (+=)
            System.out.println(" -> " + propietario + " ha caminado " + pasosNuevos + " pasos.");
        } else {
            System.out.println("Error: No puedes caminar pasos negativos.");
        }
    }

    // B. Consultar pasos
    public int getPasos() {
        return totalPasos;
    }

    // C. Reiniciar contador
    public void reiniciar() {
        this.totalPasos = 0;
        System.out.println(" -> Contador de " + propietario + " puesto a CERO.");
    }

    // D. Mostrar estado
    @Override
    public String toString() {
        return "Pulsera de " + propietario + " | Pasos totales: " + totalPasos;
    }
}