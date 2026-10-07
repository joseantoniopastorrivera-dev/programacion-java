package com.japr.pagos;

public class PagoTarjeta implements Pago {

    private String numTarjeta;

    public PagoTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public void procesarPago(double cantidad) {
        System.out.println(
                "Se ha cobrado a través del datáfono " + cantidad + " euros al número de tarjeta " + numTarjeta + ".");
    }
}
