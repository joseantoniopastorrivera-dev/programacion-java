package com.japr.pagos;

public class TestPago {

    public static void main(String[] args) {

        System.out.println("--- INICIANDO PASARELA DE PAGOS ---");

       PagoEfectivo pago1 = new PagoEfectivo("euros");
       PagoTarjeta pago2 = new PagoTarjeta("000000000");
       PagoPayPal pago3 = new PagoPayPal("222222222aaa");
        System.out.println("Pago en efectivo: ");
        pago1.procesarPago(50.25);
        System.out.println("Pago con tarjeta: ");
        pago2.procesarPago(121.89);
        System.out.println("Pago con PayPal: ");
        pago3.procesarPago(345.27);

    }
}
