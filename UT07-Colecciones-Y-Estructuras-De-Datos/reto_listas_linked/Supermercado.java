//Autor: JAPR
//Fecha: 10/Mar/2026
//Supermercado.java

package reto_listas_linked;

import java.util.LinkedList;

public class Supermercado {
    public static void main(String[] args) {
        // LinkedList permite usar métodos como addFirst o removeLast
        LinkedList<String> cola = new LinkedList<>();

        // Llegan clientes (Cola: el primero que entra es el primero que sale)
        cola.addLast("Cliente 1");
        cola.addLast("Cliente 2");
        
        // Llega un VIP y se pone el primero de la fila
        cola.addFirst("Cliente VIP");

        System.out.println("Fila actual: " + cola);

        // Atendemos al primero de la fila
        String atendido = cola.removeFirst();
        System.out.println("Atendiendo a: " + atendido);
        System.out.println("Quedan en espera: " + cola);
    }
}
