/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;

import java.util.Scanner;

/**
 *
 * @author JOSEPHRK6
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        double[] calificaciones = {100,70,85.5,70,100,100};
        double suma=0;
                
        for (int i = 0; i < calificaciones.length; i++) {
            suma+=calificaciones[i];
        }
        System.out.println("La suma de las calificaciones es: "+suma);
        System.out.println("El promedio de las calificaciones es: "+(suma/calificaciones.length));
    }
}
