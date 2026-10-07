package contadorPasos; //Indica que está en la carpeta ContadorPasos

public class TestContadorPasos {
    public static void main(String[] args) {
        
        // 1. Crear el contador
        System.out.println("--- INICIANDO SISTEMA ---");
        ContadorPasos miPulsera = new ContadorPasos("JAPR");
        
        // Estado inicial
        System.out.println(miPulsera.toString()); // Debería ser 0

        // 2. Simular actividad [cite: 389]
        System.out.println("\n--- SALIMOS A CAMINAR ---");
        miPulsera.caminar(2000); // Caminata mañanera
        miPulsera.caminar(150);  // Ir a comprar el pan
        miPulsera.caminar(5000); // Paseo por la tarde

        // 3. Consultar estado intermedio
        System.out.println("\n" + miPulsera.toString());

        // 4. Intentar hacer trampas (pasos negativos)
        System.out.println("\n--- INTENTO DE ERROR ---");
        miPulsera.caminar(-500); // El programa debe protegerse
        System.out.println("Estado actual: " + miPulsera.getPasos());

        // 5. Reiniciar contador [cite: 390]
        System.out.println("\n--- DÍA SIGUIENTE (REINICIO) ---");
        miPulsera.reiniciar();
        System.out.println(miPulsera.toString());
    }
}