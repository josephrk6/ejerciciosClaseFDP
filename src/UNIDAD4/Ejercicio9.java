/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSEPHRK6
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int matriz[][], filas, columnas, sumaFilas, sumaColumnas, suma=0;
        
        filas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas: "));
        columnas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas: "));
        
        matriz=new int[filas][columnas];
        
        //Ingresando valores a la matriz
        System.out.println("Ingrese los datos a la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Elemento ["+i+"]["+j+"]: ");
                matriz[i][j]=lector.nextInt();
            }
        }
        
        //Sumando los valores de la matriz por FILA
        for (int i = 0; i < filas; i++) {
            sumaFilas=0;
            for (int j = 0; j < columnas; j++) {
                sumaFilas+=matriz[i][j];
            }
            System.out.println("La suma de la fila "+i+" es: "+sumaFilas);
        }
        
        //Sumando los valores de la matriz por COLUMNA
        for (int i = 0; i < columnas; i++) {
            sumaColumnas=0;
            for (int j = 0; j < filas; j++) {
                sumaColumnas+=matriz[i][j];
            }
            System.out.println("La suma de la columna "+i+" es: "+sumaColumnas);
        }
        
        //Sumando TODOS los valores de la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma+=matriz[i][j];
            }
        }
        
        System.out.println("La suma de todos los valores contenidos en la matriz es: "+suma);
    }
}
