/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JOSEPHRK6
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        //Declaración del arreglo
        int[] numeros = new int[5];
        
        //Asignación directa de los valores
        numeros[0]=120;
        numeros[1]=37;
        numeros[2]=15;
        numeros[3]=28;
        numeros[4]=11;
        
        //Otra forma de declarar el arreglo
        int[] numeros2 = {100,70,65,208,23,11};
        
        //Siguiente forma de declarar el vector
        int[] numeros3;
        Scanner lector = new Scanner(System.in);
        int tamanio;
        System.out.println("Ingrese el tamaño del arreglo:");
        tamanio=lector.nextInt();
        numeros3 = new int[tamanio];
        
        //IMPRIMIR O MOSTRAR EL CONTENIDO DEL VECTOR
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numeros2));
        System.out.println(Arrays.toString(numeros3));
        
        //IMPRIMIR O MOSTRAR EL CONTENIDO DEL VECTOR UTILIZANDO CICLOS
        System.out.println("Impresion del vector <numeros>");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" | ");
        }
        
        System.out.println("\n\nImpresion del vector <numeros2>");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i]+" - ");
        }
        
        System.out.println("\n\nImpresion del vector <numeros3>");
        for (int i = 0; i < numeros3.length; i++) {
            System.out.print(numeros3[i]+" ~ ");
        }
    }
}

//int [] arreglo = {3,5,8,10,11};
//System.out.println(""+Arrays.toString(arreglo));