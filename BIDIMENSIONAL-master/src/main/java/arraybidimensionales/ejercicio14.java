/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraybidimensionales;

import java.util.Random;

/**
 *
 * @author fer
 */
public class ejercicio14 {

    public static void main(String[] args) {

        int[][] arraybi = new int[3][3];

        Random numeroAleatorio = new Random();

        

        //Rellenar aleatoriamente todas las casillas de la matriz con números enteros entre 1 y 100
        for (int i = 0; i < arraybi.length; i++) {

            for (int j = 0; j < arraybi[i].length; j++) {
                
                int nAleatorio = numeroAleatorio.nextInt(1, 100 + 1);

                arraybi[i][j] = nAleatorio;

            }

        }
        
        
        //Imprimo el array por consola
        for (int i = 0; i < arraybi.length; i++) {

            for (int j = 0; j < arraybi[i].length; j++) {

                System.out.println(arraybi[i][j]);

            }

        }

        //Calcular la media de todos los valores
        //Calcular el valor mínimo y el máximo de todos los valores
        
        double media = 0;
        
        int maximo = 0;
        
        int minimo = 101;
        
        for (int i = 0; i < arraybi.length; i++) {

            for (int j = 0; j < arraybi[i].length; j++) {

                media += arraybi[i][j];
                
                if(arraybi[i][j] > maximo) {
                    
                    maximo = arraybi[i][j];
                    
                }
                
               
                 if(arraybi[i][j] < minimo) {
                    
                    minimo = arraybi[i][j];
                    
                }
                

            }

        }

        media = media / (arraybi.length * arraybi.length);
        
        System.out.println("La media es: " + media);
        
        System.out.println("El minimo es: " + minimo);
        
        System.out.println("El maximo es: " + maximo);
        
    }
}
