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
public class Ejercicio9 {
    public static void main(String[] args) {
        //Buscador de Novio
        //Edad, estatura y BTS
        Scanner entrada = new Scanner(System.in);
        int edadEl, edadElla, estatura;
        String artistaFavorito;
        System.out.println("Programa para buscarle novio a una chica toxica");
        System.out.println("Ingrese la edad de la chica:");
        edadElla = entrada.nextInt();
        System.out.println("Ingrese la edad del candidato:");
        edadEl = entrada.nextInt();
        System.out.println("Ingrese la estatura (en centimetros) del candidato:");
        estatura = entrada.nextInt();
        System.out.println("Ingrese el grupo favorito del candidato:");
        artistaFavorito = entrada.next();
        
        // && equivale a AND(Y) ----- AMPERSAND (&)
        //artistaFavorito == "Timberrinche"
        if (edadEl>edadElla && estatura>=180 && artistaFavorito.equals("Timberrinche")) {
            //VERDADERO
            System.out.println("El chico es tu candidato ideal");
            System.out.println("El chico es mayor que tu por: "+(edadEl-edadElla)+" años");
        }
        else
            System.out.println("Sigue buscando candidatos en Tinder");
    }
}
