/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD5;

import java.util.Scanner;

/**
 *
 * @author JOSEPHRK6
 */

public class Ejercicio1 {
    static int suma(){
        Scanner lector = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("\nSuma de dos numeros");
        System.out.println("Ingrese el primer numero:");
        numero1=lector.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero2=lector.nextInt();
        return numero1+numero2;
    }

    static int resta(int num1, int num2){
        return num1-num2;
    }
    
    static void multiplicacion(){
        Scanner lector = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("\nSuma de dos numeros");
        System.out.println("Ingrese el primer numero:");
        numero1=lector.nextInt();
        System.out.println("Ingrese el segundo numero:");
        numero2=lector.nextInt();
        System.out.println("El resultado de la multiplicación es: "+(numero1*numero2)+"\n");
    }
    
    static void division(int num1, int num2){
        System.out.println("El resultado de la división es: "+(num1/num2)+"\n");
    }
    
    static String saludo(String nombre){
        return "\nHola "+nombre+", espero que tengas un buen dia. Elige alguna de las operaciones\n";
    }
    
    static byte seleccionarOperacion(){
        Scanner lector = new Scanner(System.in);
        byte operacion;
        System.out.println("""
                           OPERACIONES
                           1. Suma de dos numeros
                           2. Resta de dos numeros
                           3. Multiplicacion de dos numeros
                           4. Division de dos numeros
                           0. Salir""");
        System.out.println("Ingrese el numero de operacion que desea realizar");
        operacion=lector.nextByte();
        return operacion;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombre;
        byte operacion;
        int resultado, numero1, numero2;
        
        System.out.println("Ingresa tu nombre:");
        nombre=lector.nextLine();
        System.out.println(saludo(nombre)); //Se invoca al método "saludo"
        
        do {
            operacion=seleccionarOperacion(); //Se invoca al método "seleccionarOperacion"
            
            switch (operacion) {
                case 0:
                    System.out.println("Hackeando la NASA... ah no te creas.\n\nEjecución terminada...");
                    break;
                case 1:
                    resultado=suma(); //Se invoca al método "suma" de tipo int
                    System.out.println("El resultado de la suma es: "+resultado+"\n");
                    break;
                case 2:
                    System.out.println("\nResta de dos numeros");
                    System.out.println("Ingrese el primer numero:");
                    numero1=lector.nextInt();
                    System.out.println("Ingrese el segundo numero:");
                    numero2=lector.nextInt();
                    resultado=resta(numero1,numero2); //Se invoca al método "resta" de tipo int
                    System.out.println("El resultado de la resta es: "+resultado+"\n");
                    break;
                case 3:
                    multiplicacion(); //Se invoca al método "multiplicación" de "tipo" void
                    break;
                case 4:
                    System.out.println("\nResta de dos numeros");
                    System.out.println("Ingrese el primer numero:");
                    numero1=lector.nextInt();
                    System.out.println("Ingrese el segundo numero:");
                    numero2=lector.nextInt();
                    division(numero1, numero2); //Se invoca al método "división" de "tipo" void
                    break;
                default:
                    System.out.println(nombre+" el numero de operacion no es valido.\n");
            }
        } while (operacion!=0);
    }
}
