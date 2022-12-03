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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte semestre, promedio; //byte -127 hasta 128
        System.out.println("Programa que evalua las condiciones de un alumno para otorgarle una beca");
        System.out.println("Ingresa tu semestre: ");
        semestre = entrada.nextByte();
        System.out.println("Ingresa tu promedio de calificación: ");
        promedio = entrada.nextByte();
        
        // Operador OR (o) se representa con ||
        // Con este operador cuando alguna de las condiciones sea Verdadera se ejecuta el código
        // que se corresponde con esta sección
        // El código de la sección Falsa se ejecuta SÓLO cuando ambas condciones son falsas
        // Además, se puede observar que hay 2 condiciones anidadas
        if((semestre>=4 && semestre<=8) || promedio>=90)
            //VERDADERO
            System.out.println("Felicidades. Eres merecedor de una beca.");
        else
            //FALSO
            System.out.println("Lo lamento, intentalo el proximo semestre.");
    }
}
