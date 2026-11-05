// Ejercicio 18: Casting entre tipos de datos

public class Ejercicio18 {
    public static void main(String[] args) {
        double valorDouble = 9.78;
        int valorInt = (int) valorDouble;
        System.out.println("Double: " + valorDouble);
        System.out.println("Int (casted): " + valorInt);

        float valorFloat = 4.5f;
        byte valorByte = (byte) valorFloat;
        int valorInt2 = (int) valorFloat;
        System.out.println("Float: " + valorFloat);
        System.out.println("Byte (casted): " + valorByte);
        System.out.println("Int (casted): " + valorInt2);

        long valorLong = 100000L;
        int valorInt3 = (int) valorLong;
        byte valorByte2 = (byte) valorLong;
        System.out.println("Long: " + valorLong);
        System.out.println("Int (casted): " + valorInt3);
        System.out.println("Byte (casted): " + valorByte2);

        int valorInt4 = 65;
        char valorChar = (char) valorInt4;
        System.out.println("Int: " + valorInt4);
        System.out.println("Char (casted): " + valorChar);

        int valorInt5 = 10;
        double valorDouble2 = 5.5;
        int resultado = (int) (valorInt5 + valorDouble2);
        System.out.println("Resultado de la suma (casted a int): " + resultado);
    }
}