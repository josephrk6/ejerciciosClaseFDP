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
public class Ejercicio8 {
    public static void main(String[] args) {
        //Programa que calcula el área de un círculo
        Scanner lector = new Scanner (System.in);
        double radio, area;
        System.out.println("Ingrese el valor del radio: ");
        radio = lector.nextDouble();
        area = Math.PI*Math.pow(radio, 2);
        System.out.println("=== El area del circulo es: "+area);
    }
}
