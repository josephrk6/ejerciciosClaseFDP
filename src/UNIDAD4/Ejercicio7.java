/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;

import java.util.Scanner;

/**
 *
 * @author JOSEPHRK6
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        //DECLARACIÓN DE LA MATRIZ
        //Los dos pares de corchetes indican que la variable "alumnos" es una matriz.
        //En este caso se indica que se está declarando una matriz llamada "alumnos"
        //cuyo tamaño es de 4 filas * 5 columnas (por lo tanto puede contener 20 elementos)
        //y los elementos (o información) que se pueden guardar en la matriz 
        //son de tipo String (cadena o texto)
        String[][] alumnos = new String[4][5];
        
        //DECLARACIÓN DE MATRIZ CON ELEMENTOS
        String[][] profesores = {{"Jose Juan","Cesar","Ivan"},
                                            {"Briseida","Miguel","Kenya"},
                                            {"Marcos","Nancy","Maria"}};
        
        //DECLARACIÓN DE MATRIZ CON TAMAÑO PERSONALIZADO
        int[][] respuestas_eval_docente;
        int filas, columnas;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de la matriz");
        filas=lector.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz");
        columnas=lector.nextInt();
        respuestas_eval_docente = new int[filas][columnas];
        
        //IMPRIMIR CONTENIDO DE UNA MATRIZ CUADRADA
        System.out.println("\nImpresion de matriz de nombres de Profesores");
        for (int i = 0; i < profesores.length; i++) {
            for (int j = 0; j < profesores.length; j++) {
                System.out.print(profesores[i][j]+"   ");
            }
            System.out.println("");
        }
        
        //IMPRIMIR CONTENIDO DE UNA MATRIZ RECTANGULAR
        System.out.println("\nImpresion de matriz de nombres de Alumnos");
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < alumnos[i].length; j++) {
                System.out.print(alumnos[i][j]+"   ");
            }
            System.out.println("");
        }
        
        //IMPRIMIR CONTENIDO DE UNA MATRIZ DE TAMAÑO PERSONALIZADO
        System.out.println("\nImpresion de matriz de Respuestas de Evaluacion Docente");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(respuestas_eval_docente[i][j]+"   ");
            }
            System.out.println("");
        }
    }
}
