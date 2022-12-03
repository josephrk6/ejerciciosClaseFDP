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
public class Ejercicio10 {
    public static void main(String[] args) {
        //Programa que recibe un número en sistema binario, octal y hexadecimal
        // y lo convierte a su equivalente en sistema decimal
        Scanner lector = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero en sistema binario: ");
        numero = lector.nextInt(2);
        System.out.println("Su equivalente en sistema decimal es: "+numero);
        
        System.out.println("\n\nIngrese un numero en sistema octal: ");
        numero = lector.nextInt(8);
        System.out.println("Su equivalente en sistema decimal es: "+numero);
        
        System.out.println("\n\nIngrese un numero en sistema hexadecimal: ");
        numero = lector.nextInt(16);
        System.out.println("Su equivalente en sistema decimal es: "+numero);
    }
}
