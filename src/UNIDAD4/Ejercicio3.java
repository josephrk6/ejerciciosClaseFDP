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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] temperaturas ={35,28,32,27,30};
        int dato, vecesEncont=0;
        boolean encontrado=false;
        System.out.println("Ingresa el valor a buscar: ");
        dato = lector.nextInt();
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i]==dato) {
                encontrado=true; //Esta variable actua como una BANDERA
                System.out.println("El dato "+dato+" se encuentra en la posición "+i+" del arreglo");
                break;
            }
        }
        
        //Al finalizar el ciclo podemos comprobar el valor con que finaliza la variable BANDERA
        if (encontrado==true) 
            System.out.println("El dato fue encontrado");
        else
            System.out.println("No se encontro el dato");
        
        // +===================================================================+
        
        double[] calificaciones = {100,70,85.5,70,100,100};
        String posiciones="";
        System.out.println("Ingresa el valor a buscar: ");
        dato = lector.nextInt();
        for (int i = 0; i < calificaciones.length; i++) {
            if (calificaciones[i]==dato) {
                vecesEncont++;
                posiciones+=i+", ";
            }
        }
        System.out.println("El dato "+dato+" se encontro "+vecesEncont+" veces en las posiciones "+posiciones+" del arreglo");
    }
}
