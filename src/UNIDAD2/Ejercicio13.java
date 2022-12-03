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
public class Ejercicio13 {
    public static void main(String[] args) {
        //Programa que calcula el nuevo salario con un incremento del 25%
        Scanner lector=new Scanner(System.in);
        double salario;
        System.out.println("Ingrese el salario:");
        salario=lector.nextDouble();
        salario=salario*1.25;
        System.out.println("Su salario con un incremento del 25% es: "+salario);
    } 
}
