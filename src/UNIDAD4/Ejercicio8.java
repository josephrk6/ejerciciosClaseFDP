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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int matriz[][], filas, columnas;
        
        /*
        * JOptionPane.showInputDialog 
        * Esta instrucción es una función que muestra una ventana con una caja de texto y dos botones: 
           Aceptar y Cancelar.
        * Si oprimimos Aceptar, entonces el valor escrito en el recuadro se recibe como si fuera un texto,
           es decir, de tipo String (sin importar si el valor es númerico).
        * Si oprimimos Cancelar, el valor que se recibe es null.
        */
        
        /*
        * Integer.parseInt
           Esta instrucción CONVIERTE una cadena de texto (STRING) EN un número ENTERO.
        */
        
        filas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas: "));
        columnas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas: "));
        
        /*
        Esto también se puede hacer de la forma "tradicional" que venimos manejando desde la 2da unidad
        y también sería válido
        System.out.println("Ingrese el número de filas:");
        filas=lector.nextInt();
        System.out.println("Ingrese el número de columnas:");
        columnas=lector.nextInt();
        */
        
        matriz=new int[filas][columnas];
        
        System.out.println("Ingrese los datos a la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Elemento ["+i+"]["+j+"]: ");
                matriz[i][j]=lector.nextInt();
            }
        }
    }
}
