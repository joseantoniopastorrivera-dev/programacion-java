package com.japr.pagos;

public class PagoPayPal implements Pago {

    private String numCuenta;

    public PagoPayPal(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Se ha cobrado " + cantidad
                + " a traves de una transferencia desde su cuenta de PayPal con número identificador de cuenta '"
                + numCuenta + "'.");
    }

}
