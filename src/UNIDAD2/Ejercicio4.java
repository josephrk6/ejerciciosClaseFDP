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
public class Ejercicio4 {
    public static void main(String[] args) {
        //programa que calcula la edad - MONTSERRATH, SAMANTHA, JORGE
        Scanner sc=new Scanner(System.in);
        int nacimiento, actual, edad;
        System.out.println("ingrese año de nacimiento:");
        nacimiento=sc.nextInt();
        System.out.println("ingrese año actual:");
        actual=sc.nextInt();
        edad=actual-nacimiento;
        System.out.println("Su edad es: "+edad);
    }
}
