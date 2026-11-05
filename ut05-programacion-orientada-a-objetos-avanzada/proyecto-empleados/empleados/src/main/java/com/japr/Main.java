//Autor: JAPR
//Fecha: 15/Feb/2026
//Clase Main.java gestión de empleados

package com.japr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Empleado[] empleados = new Empleado[20];
        int contador = 0;
        int opcion = 0;

        do {
            System.out.println("---GESTIÓN DE RECURSOS HUMANOS---");
            System.out.println("1. Añadir un empleado fijo.");
            System.out.println("2. Añadir un empleado por horas.");
            System.out.println("3. Añadir un empleado comercial.");
            System.out.println("4. Listar empleados.");
            System.out.println("5. Mostar el coste total de las nóminas.");
            System.out.println("6. Buscar empleados por DNI y mostrar sus datos.");
            System.out.println("0. Salir.");
            System.out.println("Introduzca una opción.");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    if (contador < 20) {
                        System.out.println("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.println("DNI: ");
                        String dni = scanner.nextLine();
                        System.out.println("Salario base: ");
                        double salarioBase = scanner.nextDouble();
                        System.out.println("Plus mensual: ");
                        double plus = scanner.nextDouble();
                        scanner.nextLine();

                        empleados[contador] = new EmpleadoFijo(nombre, dni, salarioBase, plus);
                        contador++;
                        System.out.println("Empleado fijo registrado con éxito.");
                        System.out.println();
                    } else {
                        System.out.println("Plantilla completa(máx 20 empleados).");
                        System.out.println();
                    }
                    break;

                case 2:
                    if (contador < 20) {
                        System.out.println("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.println("DNI: ");
                        String dni = scanner.nextLine();
                        System.out.println("Salario base: ");
                        double salarioBase = scanner.nextDouble();
                        System.out.println("Número de horas: ");
                        double numHoras = scanner.nextDouble();
                        System.out.println("Precio por hora: ");
                        double precioHora = scanner.nextDouble();
                        scanner.nextLine();

                        empleados[contador] = new EmpleadoHoras(nombre, dni, salarioBase, numHoras, precioHora);
                        contador++;
                        System.out.println("Empleado por horas registrado con éxito.");
                        System.out.println();
                    } else {
                        System.out.println("Plantilla completa(máx 20 empleados).");
                        System.out.println();

                    }
                    break;

                case 3:
                    if (contador < 20) {
                        System.out.println("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.println("DNI: ");
                        String dni = scanner.nextLine();
                        System.out.println("Salario base: ");
                        double salarioBase = scanner.nextDouble();
                        System.out.println("Número de ventas: ");
                        int ventas = scanner.nextInt();
                        System.out.println("Porcentaje por venta(ej: 15%).");
                        double porcentaje = scanner.nextDouble();

                        empleados[contador] = new EmpleadoComercial(nombre, dni, salarioBase, ventas, porcentaje);
                        contador++;
                        System.out.println("Empleado comercial registrado con éxito.");
                        System.out.println();
                    } else {
                        System.out.println("Plantilla completa(máx 20 empleados).");
                        System.out.println();
                    }
                    break;

                case 4:
                    if (contador == 0) {
                        System.out.println(
                                "No hay ningún empleado registrado en el sistema, registre al menos uno para poder ver su información.");
                        System.out.println();
                    } else {
                        System.out.println("---LISTADO COMPLETO DE EMPLEADOS---");
                        for (int i = 0; i < contador; i++) {
                            System.out.println(empleados[i]);
                            System.out.println();
                        }
                    }
                    break;

                case 5:
                    System.out.println("--COSTE TOTAL DE LAS NÓMINAS--");
                    double totalNominas = 0;
                    for (int i = 0; i < contador; i++) {
                        totalNominas = totalNominas + empleados[i].calcularSalario();
                    }
                    System.out.println("Total: " + totalNominas + " euros.");
                    System.out.println();
                    break;

                case 6:
                    System.out.println("DNI: ");
                    String dniBuscado = scanner.nextLine();
                    boolean encontrado = false;
                    int i = 0;
                    while (i < contador && !encontrado) {
                        if (empleados[i].getDni().equalsIgnoreCase(dniBuscado)) {
                            System.out.println("Empleado encontrado:");
                            System.out.println(empleados[i].toString());
                            System.out.println();

                            encontrado = true;
                        }
                        i++;
                    }
                    if (!encontrado) {
                        System.out.println("No hay ningún empleado con el DNI " + dniBuscado);
                        System.out.println();

                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa.. ¡Hasta Pronto!");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    System.out.println();

            }

        }

        while (opcion != 0);

        scanner.close();
    }

}
