//Autor: JAPR
//Fecha: 10/Mar/2026
//Programa Principal

package banco;

public class PruebaBanco {
    public static void main(String[] args) {
        // 1. Creación de objetos (Esto ya lo tienes)
        Banco miBanco = new Banco("Santander", "SAN001", "Madrid");
        
        CuentaCorriente cc = new CuentaCorriente("ES1234", miBanco, "10/02/2026", 1000.0, "4500-1234");
        cc.agregarCliente("JAPR");
        
        CuentaPlazoFijo cpf = new CuentaPlazoFijo("ES9999", miBanco, "17/02/2026", 5000.0, 5);
        cpf.agregarCliente("JAPR");

        // 2. AQUÍ ES DONDE AÑADES EL USO (Para quitar el amarillo)
        System.out.println("\n--- RESULTADOS DEL BANCO ---");
        
        // Usamos cc (Cuenta Corriente)
        System.out.println("Cuenta Corriente " + cc.numero + ":");
        System.out.println("Saldo con intereses: " + cc.calcularInteres() + "€");

        System.out.println("-----------------------------");

        // Usamos cpf (Cuenta Plazo Fijo)
        System.out.println("Cuenta Plazo Fijo " + cpf.numero + ":");
        System.out.println("Saldo final tras " + "5 años: " + cpf.calcularInteres() + "€");
    }
}
