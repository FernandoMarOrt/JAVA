/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_ejercicios;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int Npersonas;        
        int total = 0;
        double media;
        int mediaEncima = 0;
        int mediaDebajo = 0;

        System.out.println("Cuantas personas quieres que le mida la altura");
        Npersonas = teclado.nextInt();

        int[] alturaPersonas = new int[Npersonas];

        for (int i = 0; i < alturaPersonas.length; i++) {
            
            
            System.out.println("Indica la altura de la " + (i + 1) + "º persona:");
            alturaPersonas[i] = teclado.nextInt();
            
            i = Math.abs(i);
            
            total += alturaPersonas[i];
            
            
        }
        

        media = total / Npersonas;
        
        for (int i = 0; i < alturaPersonas.length; i++) {
            
            
            if(alturaPersonas[i] > media) {
                mediaEncima++;
                
            } else if (alturaPersonas[i] < media) {
                mediaDebajo++;
                
            }
            
            
        }
        
        System.out.println("La media de altura es " + media);
        System.out.println("Hay " + mediaEncima + " personas por encima de la media");
        System.out.println("Hay " + mediaDebajo + " personas por debajo de la media");

    }
}
