package org.example;
import java.util.Scanner;

/**
 * Cambia euros a dólares (el cambio se pide por teclado).
 * @version 1.0
 * @author Carlos Costas
 */

public class Boletin2_3 {
    public static void main(String[] args) {
        String cambio, euros;
        double dolares;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce o cambio dolar-euro do dia de hoxe:");
        cambio = entradaTeclado.next();
        System.out.println("Introduce a cantidade de euros a cambiar:");
        euros = entradaTeclado.next();
        dolares = Double.parseDouble (euros)/ Double.parseDouble (cambio);
        System.out.println(dolares +"dolares de cambio, por"+ euros+ "euros.");
        entradaTeclado.close();
    }
}