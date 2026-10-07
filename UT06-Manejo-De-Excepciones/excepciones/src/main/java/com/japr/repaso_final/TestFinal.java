// Autor: JAPR
// Fecha: 17/Feb/2026
// Repaso final: Creación de objetos y ejecución de métodos
// Referencia Chuletario: Líneas 231-232

package com.japr.repaso_final;

public class TestFinal {
    public static void main(String[] args) { // Método estático [cite: 235, 243]
        
        System.out.println("--- EJECUTANDO REPASO FINAL ---");

        // 1. Crear un objeto usando el Enum [cite: 232, 308]
        Empleado emp = new Empleado("JAPR", Cargo.MANAGER);
        
        // 2. Probar el toString sobrescrito
        System.out.println(emp.toString());

        // 3. Probar la SOBRECARGA
        // Java decide qué método usar según los datos que le pasas entre paréntesis [cite: 273]
        double sueldoSimple = emp.calcularSueldo(2500); // Llama a la versión de 1 parámetro
        double sueldoBono = emp.calcularSueldo(2500, 400); // Llama a la versión de 2 parámetros

        System.out.println("Sueldo sin bono: " + sueldoSimple + "euros.");
        System.out.println("Sueldo con bono extra: " + sueldoBono + "euros.");
    }
}