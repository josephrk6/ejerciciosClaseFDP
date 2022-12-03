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
public class Examen3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double lado, altura, apotema, volumenPrisma;
        System.out.println("Ingrese el valor del lado del hexagono: ");
        lado=lector.nextDouble();
        System.out.println("Ingrese el valor de la apotema del hexagono: ");
        apotema=lector.nextDouble();
        System.out.println("Ingrese la altura del prisma hexagonal: ");
        altura=lector.nextDouble();
        volumenPrisma=lado*6*apotema/2*altura;
        System.out.println("El volumen del prisma hexagonal es: "+volumenPrisma);
    }
}
