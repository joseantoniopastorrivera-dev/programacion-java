//Autor: JAPR
//Fecha: 10/Mar/2026
//Clase hija CuentaCorriente.java

package banco;

public class CuentaCorriente extends Cuenta {
    private String numTarjeta; // Antes salía en amarillo
    private final double INTERES = 0.015;

    public CuentaCorriente(String num, Banco b, String fecha, double saldo, String tarjeta) {
        super(num, b, fecha, saldo);
        this.numTarjeta = tarjeta;
    }

    @Override
    public double calcularInteres() {
        return saldo + (saldo * INTERES);
    }

    // AÑADE ESTO: Al usar la variable aquí, el amarillo desaparecerá
    @Override
    public String toString() {
        return "Cuenta Corriente nio: " + numero + " | Tarjeta: " + numTarjeta;
    }
}
