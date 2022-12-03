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
public class Ejercicio5 {
    public static void main(String[] args) {
        //CONVERTIR LIBRAS A KILOS - TEAM JORGELUIS-MIGUEL_A-BETHZAIDA
        Scanner lector= new Scanner(System.in);
        double libras, kilos;
        System.out.println("Ingrese la cantidad de libras");
        libras = lector.nextDouble();
        kilos= libras*0.454;
        System.out.println("Su equivalencia es: "+ kilos+" kilos");
        
    }
}
