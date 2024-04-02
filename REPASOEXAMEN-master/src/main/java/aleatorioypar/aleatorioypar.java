/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aleatorioypar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class aleatorioypar {
    
     private static void rellenarAleatorio(int[][] matrizA) {
        
        Scanner teclado = new Scanner(System.in);
        
        Random numeroAleatorio = new Random();
        
        for (int i = 0; i < matrizA.length; i++) {
            
            for (int j = 0; j < matrizA[i].length; j++) {

                //Genero un numero aleatorio entre 0 y 20
                int nAleatorio = numeroAleatorio.nextInt(0, 20 + 1);
                
                matrizA[i][j] = nAleatorio;
                
            }
            
        }
        
    }
     
     public static boolean esPar(int numero) {
    if (numero % 2 == 0) {
        return true;
    } else {
        return false;
    }
}
    
}
