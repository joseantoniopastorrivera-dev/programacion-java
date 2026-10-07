package tarjetaTransporte; //Indica que está en la carpeta Transporte

public class TestTarjetaTransporte {
    public static void main(String[] args) {
        
        System.out.println("--- EMISIÓN DE TARJETA ---");
        // Creamos la tarjeta de Pepe con 5 euros iniciales
        TarjetaTransporte miAbono = new TarjetaTransporte("MAD-001", "Pepe Pérez", 5.00);
        System.out.println(miAbono.toString());

        // 1. Primer Viaje (Metro: 1.50€)
        System.out.println("\n--- VIAJE 1 (Metro) ---");
        miAbono.realizarViaje(1.50);

        // 2. Segundo Viaje (Cercanías: 3.00€)
        System.out.println("\n--- VIAJE 2 (Cercanías) ---");
        miAbono.realizarViaje(3.00); 
        // 5.00 - 1.50 - 3.00 = 0.50€ restantes.

        // 3. Intento fallido (Autobús: 1.50€)
        System.out.println("\n--- VIAJE 3 (Bus) ---");
        // Solo nos quedan 0.50€, debería fallar.
        miAbono.realizarViaje(1.50);

        // 4. Recarga de emergencia
        System.out.println("\n--- RECARGA ---");
        miAbono.recargar(10.00);

        // 5. Intento exitoso tras recarga
        System.out.println("\n--- REINTENTO VIAJE 3 ---");
        miAbono.realizarViaje(1.50);

        // Estado final
        System.out.println("\n" + miAbono.toString());
    }
}