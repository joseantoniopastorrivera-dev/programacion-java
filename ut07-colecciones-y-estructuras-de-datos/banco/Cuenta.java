//Autor: JAPR
//Fecha: 10/Mar/2026
//Clase abstracta Cuenta.java

package banco;

import java.util.ArrayList;

public abstract class Cuenta {
    protected String numero;
    protected Banco banco; // Asociación/Composición
    protected String fechaApertura;
    protected ArrayList<String> clientes; // Una cuenta tiene uno o varios clientes
    protected double saldo;

    public Cuenta(String numero, Banco banco, String fechaApertura, double saldo) {
        this.numero = numero;
        this.banco = banco;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(String cliente) {
        this.clientes.add(cliente);
    }

    // Método abstracto: cada hijo lo calculará a su manera
    public abstract double calcularInteres();
}
