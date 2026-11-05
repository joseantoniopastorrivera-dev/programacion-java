/*Ejercicio 11: Operadores bit a bit*/

public class Ejercicio11 {
    public static void main(String[] args) {
        int a = 5;  // 0101 en binario
        int b = 3;  // 0011 en binario

        System.out.println("a & b = " + (a & b));  // AND bit a bit
        System.out.println("a | b = " + (a | b));  // OR bit a bit
        System.out.println("a ^ b = " + (a ^ b));  // XOR bit a bit
        System.out.println("~a = " + (~a));        // NOT bit a bit
    }
}