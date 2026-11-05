//Autor: JAPR
//Fecha: 14/Feb/2026
//Clase GestionVehiculos.java

import java.util.Scanner;

public class GestionVehiculos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Vehiculo[] flota = new Vehiculo[5];
        int contadorVehiculos = 0;
        int opcion = 0;

        do {
            System.out.println("---MENÚ DE GESTIÓN DE VEHÍCULOS--");
            System.out.println("1. Dar de alta un vehículo.");
            System.out.println("2. Buscar un vehículo por matrícula.");
            System.out.println("3. Mostrar todos los datos de un vehículo.");
            System.out.println("0. Salir.");
            System.out.println("Elija una opción.");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Dar de alta un vehículo
                    if (contadorVehiculos < 5) {
                        System.out.println("--NUEVO VEHÍCULO--");
                        System.out.println("Marca: ");
                        String marca = scanner.nextLine();
                        System.out.println("Modelo: ");
                        String modelo = scanner.nextLine();
                        System.out.println("Matrícula: ");
                        String matricula = scanner.nextLine();

                        System.out.println("¿Qué tipo de vehículo es?");
                        System.out.println("1. Coche | 2. Moto | 3.Camión");
                        int tipo = scanner.nextInt();
                        scanner.nextLine();

                        if (tipo == 1) {
                            System.out.println("Número de puertas: ");
                            int numeroPuertas = scanner.nextInt();
                            flota[contadorVehiculos] = new Coche(marca, modelo, matricula, numeroPuertas);
                            contadorVehiculos++;
                            System.out.println("Coche registrado con éxito.");
                        } else if (tipo == 2) {
                            System.out.println("Tipo de moto(ej: scooter, deportiva):");
                            String tipoMoto = scanner.nextLine();
                            flota[contadorVehiculos] = new Moto(marca, modelo, matricula, tipoMoto);
                            contadorVehiculos++;
                            System.out.println("Moto registrada con éxito.");
                        } else if (tipo == 3) {
                            System.out.println("Capacidad de carga: ");
                            double capacidadCarga = scanner.nextDouble();
                            flota[contadorVehiculos] = new Camion(marca, modelo, matricula, capacidadCarga);
                            contadorVehiculos++;
                            System.out.println("Camión registrado con éxito.");
                        } else {
                            System.out.println("Tipo no válido.");
                        }
                    } else {
                        System.out.println("ERROR, el garaje está lleno.");
                    }
                    break;

                case 2:
                    // Buscar por matrícula
                    System.out.println("\nIntroduce la matrícula para buscar: ");
                    String matriculaBuscada = scanner.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < contadorVehiculos; i++) {
                        if (flota[i].getMatricula().equalsIgnoreCase(matriculaBuscada)) {
                            System.out.println("Vehículo encontrado: ");
                            System.out.println(flota[i].toString());
                            flota[i].acelerar();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No hay ningún vehículo con esa matrícula.");
                    }
                    break;

                case 3:
                    // Mostrar datos de un vehículo
                    System.out.println("\n--FLOTA DE VEHÍCULOS--");
                    if (contadorVehiculos == 0) {
                        System.out.println("El garaje está vacío.");
                    } else {
                        for (int i = 0; i < contadorVehiculos; i++) {
                            System.out.println((i + 1) + ". " + flota[i].toString());
                        }
                    }
                    break;

                    case 0:
                        System.out.println("\nSaliendo del programa..¡Hasta pronto!");
                        break;

                        default:
                            System.out.println("Opción incorrecta. Elige un número del 0 al 3.");
            }

        } while (opcion != 0);

        scanner.close();
    }

}
