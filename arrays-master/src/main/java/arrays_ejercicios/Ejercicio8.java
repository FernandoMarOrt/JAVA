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
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int tamanio;

        //Pregunto por el numero entero que sera el tamaño del array
        System.out.println("Dime un numero entero");

        tamanio = teclado.nextInt();

        int[] numeros = new int[tamanio];

        //Bucle para rellenar el array de los numeros que quiere el usuario
        for (int i = 0; i < tamanio; i++) {

            System.out.println("Dime un numero para la posicion" + (i + 1));

            numeros[i] = teclado.nextInt();

        }
        
        
        //Imprimo los asteriscos
        
        for (int i = 0; i < numeros.length; i++) {

            
            for (int j = 0; j < numeros[i]; j++) {

                System.out.print("*");

            }
            
            System.out.println("");

        }

    }

}
