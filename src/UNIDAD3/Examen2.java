/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD3;

import java.util.Scanner;

/**
 *
 * @author JOSEPHRK6
 */
public class Examen2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero1, numero2, minimo, maximo, i;   
        System.out.print("Introduce el primer número: ");
        numero1 = lector.nextInt();
        System.out.print("Introduce el segundo número: ");
        numero2 = lector.nextInt();
        if (numero1 < numero2) {
          minimo = numero1;
          maximo = numero2;
        } else {
          minimo = numero2;
          maximo = numero1;
        }
        i= minimo;
        while (i < maximo) {            
            if (i%2==0)
                System.out.print(i+"  "); 
            i++;
        }
    }
}

