// Autor: JAPR
// Fecha: 16/01/26
// Ejercicio: Gestión de Tarjeta de Transporte Público (Abono)

package tarjetaTransporte; //Indica que está en la carpeta Transporte

public class TarjetaTransporte {

    // 1. ATRIBUTOS
    // Guardamos código, titular y el dinero que tiene dentro
    private String codigo;
    private String titular;
    private double saldo;

    // 2. CONSTRUCTOR
    // Obligamos a crear la tarjeta con sus datos básicos.
    // Asumimos que se puede comprar con saldo 0 o con una carga inicial.
    public TarjetaTransporte(String codigo, String titular, double saldoInicial) {
        this.codigo = codigo;
        this.titular = titular;
        
        // Validación inicial: Si intentan crearla con -50 euros, lo ponemos a 0.
        if (saldoInicial < 0) {
            System.out.println("⚠️ Aviso: No se puede iniciar con saldo negativo. Se ha puesto a 0.");
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    // 3. MÉTODOS DE OPERACIÓN

    // A. Recargar Saldo
    public void recargar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.printf(" -> Recarga exitosa de %.2f €. Saldo actual: %.2f €\n", cantidad, this.saldo);
        } else {
            System.out.println("❌ Error: La cantidad a recargar debe ser positiva.");
        }
    }

    // B. Realizar un Viaje (Consumir saldo)
    // Recibe el precio del viaje y comprueba si podemos pagarlo.
    public void realizarViaje(double precioViaje) {
        // Validación 1: El saldo debe ser suficiente
        if (this.saldo >= precioViaje) {
            this.saldo -= precioViaje;
            System.out.printf("🚌 Viaje realizado (%.2f €). Restan: %.2f €\n", precioViaje, this.saldo);
        } else {
            // Validación 2: Saldo insuficiente
            System.out.printf("⛔ DENEGADO: Saldo insuficiente (%.2f €) para un viaje de %.2f €.\n", this.saldo, precioViaje);
        }
    }

    // C. Consultar Saldo
    public double getSaldo() {
        return saldo;
    }

    // D. Mostrar Información (Código, Titular y Saldo)
    @Override
    public String toString() {
        return "---------------------------------\n" +
               " TARJETA TRANSPORTE\n" +
               " Titular: " + titular + "\n" +
               " Código:  " + codigo + "\n" +
               " Saldo:   " + String.format("%.2f €", saldo) + "\n" +
               "---------------------------------";
    }
}