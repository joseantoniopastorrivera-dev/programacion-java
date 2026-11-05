//Ejercicio 12: Evaluar expresiones con operadores relacionales y booleanos

public class Ejercicio12 {
    public static void main(String[] args) {
        int p = 20, q = 10, r = 5, s = 2;

        System.out.println("p + q * r > s = " + (p + q * r > s));
        System.out.println("p / q + r <= s = " + (p / q + r <= s));
        System.out.println("p - q == r * s = " + (p - q == r * s));
        System.out.println("p > q || r < s && p == r = " + (p > q || r < s && p == r));
    }
}