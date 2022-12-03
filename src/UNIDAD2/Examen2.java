/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD2;

import java.util.Scanner;

/**
 *
 * @author JOSEPHRK6
 */
public class Examen2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final double VALOR_PUNTOS=0.12;
        double saldoFinal, saldoInicial, puntos, equivPuntos;
        System.out.println("Ingrese el saldo inicial: ");
        saldoInicial=lector.nextDouble();
        System.out.println("Ingrese los puntos acumulados: ");
        puntos=lector.nextDouble();
        equivPuntos=puntos*VALOR_PUNTOS;
        saldoFinal=saldoInicial-equivPuntos;
        System.out.println("Sus puntos acumulados equivalen a: $ "+equivPuntos+" pesos");
        System.out.println("Despues de aplicar los puntos acumulados, su Saldo Final es: "+saldoFinal);
    }
}
