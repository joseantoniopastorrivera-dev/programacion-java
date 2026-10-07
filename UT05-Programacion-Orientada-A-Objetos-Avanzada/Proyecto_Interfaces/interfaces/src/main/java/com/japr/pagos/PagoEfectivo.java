package com.japr.pagos;

public class PagoEfectivo implements Pago {

    private String tipoMoneda;

    public PagoEfectivo(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Se ha cobrado en efectivo " + cantidad + " " + tipoMoneda + ".");
    }

}
