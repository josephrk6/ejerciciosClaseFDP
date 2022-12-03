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
public class Ejercicio3 {
    public static void main(String[] args) {
        //Programa que realiza una resta - ALEJANDRO Y CRISTIAN
        Scanner leer = new Scanner (System.in);
        int valor1, valor2, resultado;
        System.out.println("Ingrese el primero numero:");
        valor1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        valor2 = leer.nextInt();
        resultado = valor1 - valor2;
        System.out.print("El resultado de la resta es: "+resultado);
    }
}
