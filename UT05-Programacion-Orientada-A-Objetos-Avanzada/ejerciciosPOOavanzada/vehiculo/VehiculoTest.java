public class VehiculoTest {

    public static void main(String[] args) {

        System.out.println("---GESTIÓN DE LA FLOTA DE VEHÍCULOS---");

        // Creamos un objeto de cada tipo
        Coche miCoche = new Coche("Renault", "Clio", "0000BBB", 5);
        Moto miMoto = new Moto("Kawasaki", "Ninja", "1111CCC", "Deportiva");
        Camion miCamion = new Camion("Citroen", "Jumper", "2222DDD", 2500);

        Vehiculo[] flota = new Vehiculo[3];
        flota[0] = miCoche;
        flota[1] = miMoto;
        flota[2] = miCamion;

        System.out.println("---Información y prueba de motor---");

        for (int i = 0; i < flota.length; i++) {
            System.out.println("Vehículo " + (i + 1) + ": ");
            System.out.println(flota[i].toString());
            flota[i].acelerar();
        }
    }
}
