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
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,dias, horas, min;
        System.out.println("Ingrese los segundos ");
        num=sc.nextInt();      
        
        dias = num/86400;
        System.out.println("Dias = "+dias);
        
        num = num % 86400; //Obtener el residuo
        System.out.println(">>> Valor de num = " + num);
        
        horas = num/3600;
        System.out.println("Horas = " + horas);
        
        num = num %3600;
        System.out.println(">>> Valor de num = " + num);
        
        min = num/60;
        System.out.println("Minutos = " + min);
        
        num = num % 60;
        System.out.println(">>> Valor de num = " + num);
        
        System.out.println(dias+"dia(s)  "+horas+"hr(s)  "+min+"min(s)  "+num+"seg");
    }
}



//        dias=num/86400;
//        horas=(num-(86400*dias))/3600;
//        min=(num-(86400*dias + horas*3600))/60;
//        seg=num-(86400*dias + horas*3600 + min*60);
        //System.out.println(dias+"dias "+horas+"hrs "+min+"min "+seg+"seg");