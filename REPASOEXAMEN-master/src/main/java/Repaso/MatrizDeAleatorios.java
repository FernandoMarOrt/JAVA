/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Fer
 */
public class MatrizDeAleatorios {
    
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero entero");

        int tamanio = teclado.nextInt();
        
        int[][] matrix = rellenarMatriz(tamanio);
       
        imprimirMatriz(matrix);
    }
    
    public static int[][] rellenarMatriz(int tamanio) {
        
        int[][] matriz = new int[tamanio][tamanio]; //Creo la matriz
        
        Set<Integer> numeros = new HashSet<Integer>(); // Creo un Set para almacenar los numeros usados
        
        Random numeroAleatorio = new Random(); //RANDOM
        
        int elevar = (int) Math.pow(tamanio, 2); //Elevo el tamanio al cuadrado
        
        for (int i = 0; i < tamanio; i++) {
            
            for (int j = 0; j < tamanio; j++) {
                
                int nAleatorio;
                
                do {//Comprueba si el número ya se ha usado
                    
                    nAleatorio = numeroAleatorio.nextInt(1, elevar + 1);
                    
                } while (numeros.contains(nAleatorio)); 
                
                matriz[i][j] = nAleatorio;
                
                numeros.add(nAleatorio); // Agrego número usado al set
            }
        }
        
        return matriz;
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.print(matriz[i][j] + " | ");
            }
            
            System.out.println();
        }
    }
}
