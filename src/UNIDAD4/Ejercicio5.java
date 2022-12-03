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
public class Ejercicio5 {
    public static void main(String[] args) {
        String[] pokemones = {"treecko","totodile","cyndaquil","torkoal","torchic","psyduck","wobbuffet"};
        int i=1;
        for (String pokemon : pokemones) {
            System.out.println(i+". "+pokemon);
            i++;
        }
    }
}
