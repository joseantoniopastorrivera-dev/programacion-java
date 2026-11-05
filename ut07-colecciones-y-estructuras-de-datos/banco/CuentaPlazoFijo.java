//Autor: JAPR
//Fecha: 10/Mar/2026
//Clase hija CuentaPlazoFijo.java

package banco;

class CuentaPlazoFijo extends Cuenta {
    private int años;
    private final double INTERES = 0.035; // 3.5%

    public CuentaPlazoFijo(String num, Banco b, String fecha, double saldo, int años) {
        super(num, b, fecha, saldo);
        this.años = años;
    }

    @Override
    public double calcularInteres() {
        return saldo + (saldo * INTERES) * años;
    }
}
