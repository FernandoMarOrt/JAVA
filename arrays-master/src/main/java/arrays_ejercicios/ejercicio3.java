/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_ejercicios;

import java.util.Arrays;

/**
 *
 * @author fer
 */
public class ejercicio3 {

    public static void main(String[] args) {

        //array de tamaño 20
        double[] numeros = new double[20];
        boolean iguales = false;
        
        //Rellena el array con el valor 7.5 en todas sus posiciones.
        System.out.println("Rellena el array con el valor 7.5 en todas sus posiciones.");
        
        Arrays.fill(numeros, 0, 20, 7.5);
        
        
        for (double i : numeros ) {
            System.out.print(i + "|");
        }

        
        
        //Realiza una copia del array anterior en un nuevo array.
        double[] numeros2 = Arrays.copyOf(numeros, 20);
        
           
        
        //Imprime ambos arrays. No se usa clase Arrays
        System.out.println("");
        System.out.println("Imprime ambos arrays. No se usa clase Arrays");
        
        System.out.println("Array original");
        for (double i : numeros) {
            System.out.print(i + "|");
        }
        
        System.out.println("");
        System.out.println("Array copia");
        for (double i : numeros2) {
            System.out.print(i + "|");
        }
        
        

        //Compara ambos arrays, mostrando si son iguales.
        System.out.println("");
        System.out.println("");
        System.out.println("Compara ambos arrays, mostrando si son iguales.");
 
        iguales = Arrays.equals(numeros, numeros);

        System.out.println("¿El array numeros es igual a el array numeros2? " + iguales);




        //Introduce el valor 6.3 en una posición aleatoria válida de uno de los arrays. No se usa clase Arrays
        System.out.println("");
        System.out.println("Introduce el valor 6.3 en una posición aleatoria válida de uno de los arrays.");
 
        numeros[0] = 6.3;

        for (double i : numeros) {
            System.out.print(i + "|");
        }
        
        
        
         //Imprime ambos arrays.
        System.out.println("");
        System.out.println("");
        System.out.println("Imprime ambos arrays. No se usa clase Arrays");
        
        System.out.println("Array original");
        for (double i : numeros) {
            System.out.print(i + "|");
        }
        
        System.out.println("");
        System.out.println("Array copia");
        for (double i : numeros2) {
            System.out.print(i + "|");
        }

        //Vuelve a compararlos, indicando si son iguales o no.
        System.out.println("");
        System.out.println("");
        System.out.println("Vuelve a compararlos, indicando si son iguales o no.");
        //##
        iguales = Arrays.equals(numeros, numeros2);
        //##
        System.out.println("¿Són los arrays iguales?: " + iguales);
        
    }
    

}
