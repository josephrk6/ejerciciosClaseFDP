/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD2;

//BIBLIOTECA O LIBRERIA
import java.util.Scanner;


/**
 *
 * @author JOSEPHRK6
 */
public class Examen1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double califExamen, califEjercicios, califInvestigacion, calFinal;
        System.out.println("CALCULAR CALIFICACION DE LA UNIDAD 2 DE MATEMATICAS DISCRETAS");
        System.out.println("Ingrese la calificacion del Examen: ");
        califExamen = sc.nextInt();
        System.out.println("Ingrese la calificacion de los Ejercicios: ");
        califEjercicios = sc.nextInt();
        System.out.println("Ingrese la calificacion de la Investigacion: ");
        califInvestigacion = sc.nextInt();
        calFinal=califExamen*0.4+califEjercicios*0.35+califInvestigacion*0.25;
        System.out.println("La Calificacion Final de la Unidad es: "+calFinal);
    }
}
