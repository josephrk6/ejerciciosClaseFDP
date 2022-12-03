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
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double cateto1, cateto2, hipotenusa, area, perimetro;
        //Programa que obtiene el valor de la hipotenusa, área y perimetro de un triángulo rectángulo
        System.out.println("Valor del cateto 1: ");
        cateto1=lector.nextDouble();
        System.out.println("Valor del cateto 2: ");
        cateto2=lector.nextDouble();
        
        hipotenusa=Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2));
        area=cateto1*cateto2/2;
        perimetro=cateto1+cateto2+hipotenusa;
        
        System.out.println("=== RESULTADOS OBTENIDOS ===");
        System.out.println("Hipotenusa: "+hipotenusa);
        System.out.println("Área: "+area);
        System.out.println("Perimetro: "+perimetro);
    }
}
