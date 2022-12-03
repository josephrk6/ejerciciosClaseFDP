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
public class EnsayoExamen {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double calificacion1, calificacion2, calificacion3, promedio;
        System.out.println("Ingresa la primera calificación: ");
        calificacion1 = lector.nextDouble();
        System.out.println("Ingresa la segunda calificación: ");
        calificacion2 = lector.nextDouble();
        System.out.println("Ingresa la tercera calificación: ");
        calificacion3 = lector.nextDouble();
        promedio=(calificacion1+calificacion2+calificacion3)/3;
        System.out.println("El promedio de las calificaciones es: "+promedio);
    }
}

//promedio=calificacion1+calificacion2+calificacion3/3;
//        double x,y,z,a,b;
//        x=3.0/2.0+10.0-3.0;
//        y=7;
//        z=6*2/8+Math.pow(2, 8);
//        a=x*y+1-(z%y*4);
//        b=(Math.sqrt(a)+z)*2/25;
//        System.out.println("Valor de x: "+x+
//                                "\nValor de y: "+y+
//                                "\nValor de z: "+z+
//                                "\nValor de a: "+a+
//                                "\nValor de b: "+b); 
//        

//y=3/2+10-3;
//        Scanner lector = new Scanner(System.in);
//        double calificacion1, calificacion2, calificacion3, promedio;
//        System.out.println("Ingresa la primera calificación: ");
//        calificacion1 = lector.nextDouble();
//        System.out.println("Ingresa la segunda calificación: ");
//        calificacion2 = lector.nextDouble();
//        System.out.println("Ingresa la tercera calificación: ");
//        calificacion3 = lector.nextDouble();
//        promedio=(calificacion1+calificacion2+calificacion3)/3;
//        //promedio=calificacion1+calificacion2+calificacion3/3;
//        System.out.println("El promedio de las calificaciones es: "+promedio);