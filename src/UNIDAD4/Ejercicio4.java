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
public class Ejercicio4 {
    public static void main(String[] args) {
        //Programa que determina cual es el número mayor almacenado en el arreglo
        Scanner lector = new Scanner(System.in);
        int[] estaturaAlumnos = new int[10];
        int estaturaMayor;
        
        //Ciclo FOR para rellenar el arreglo
        for (int i = 0; i < estaturaAlumnos.length; i++) {
            System.out.println("Ingresa la estatura del alumno "+(i+1));
            estaturaAlumnos[i]=lector.nextInt();
        }
        
        //Ciclo FOR para comparar los numeros
        estaturaMayor=estaturaAlumnos[0];
        for (int i = 1; i < estaturaAlumnos.length; i++) {
            if (estaturaAlumnos[i]>estaturaMayor)
                estaturaMayor=estaturaAlumnos[i];
        }
        
        System.out.println("La mayor estatura de un alumno es: "+estaturaMayor);
    }
}
