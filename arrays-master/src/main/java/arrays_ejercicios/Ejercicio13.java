/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int tamanio2;


        int[] numeros = new int[3];

        //Bucle para rellenar el array de los numeros que quiere el usuario
        for (int i = 0; i < 3; i++) {

            do {

                System.out.println("Dime un numero para la posicion " + (i + 1));

                numeros[i] = teclado.nextInt();

                if (numeros[i] > 20 || numeros[i] < 1) {

                    System.out.println("Introduce un numero entre 1 y 20");
                }

            } while (numeros[i] > 20 || numeros[i] < 1);

        }

        //Imprimo los asteriscos
        for (int i = 0; i < 3; i++) {

            System.out.print(i+1 + ": ");
            
            for (int j = 0; j < 3; j++) {
                
                if(numeros[1] == numeros[i]) {
                    System.out.print("*");
                }

            }

            
            
            
            
            
            
            
            
            
            
            System.out.println("");

        }
    }
}
