//Ejercicio 13: Evaluar expresiones con operadores combinados

public class Ejercicio13 {
    public static void main(String[] args) {
        int m = 7, n = 3, o = 4;

        System.out.println("m * n + o > n = " + (m * n + o > n));
        System.out.println("m % n + o < m = " + (m % n + o < m));
        System.out.println("m - n >= o * n = " + (m - n >= o * n));
        System.out.println("m != n && o > n || m < o = " + (m != n && o > n || m < o));
    }
}