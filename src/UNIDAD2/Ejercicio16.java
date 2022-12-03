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
public class Ejercicio16 {
    public static void main(String[] args) {
        //Programa que obtiene la cantidad de segundos en base a una cantidad de días, horas y minutos
        /*
        3 dias
                3*24*60*60 = 
        8 horas
                8*60*60 =
        26 min
                26*60 =
        totalDeSegundos =
        */
        Scanner sc = new Scanner(System.in);
        int dias, horas, min, dias_segundos, horas_segundos, min_segundos, total;
        System.out.println("Ingrese numeros de dias:" );
        dias=sc.nextInt();
        System.out.println("Ingrese el numero de horas: ");
        horas=sc.nextInt();
        System.out.println("Ingrese el numero de Minutos: ");
        min=sc.nextInt();

        dias_segundos=dias*24*60*60; //dias*86400
        horas_segundos=horas*60*60; // horas*3600
        min_segundos=min*60;

        total=dias_segundos+horas_segundos+min_segundos;
        
        System.out.println("Su equivalencia en segundos es: "+total);
    }
}
