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
public class Ejericicio6 {

    public static void main(String[] args) {

        boolean iguales = false;

        int numeros[] = {1, 2, 3};
        int numeros1[] = {1, 2, 3};
        int numeros2[] = {1, 2, 2};
        int numeros3[] = {1, 2, 3, 4};

        iguales = Arrays.equals(numeros, numeros1);

        System.out.println("¿El array 1,2,3 y el array 1,2,3 son iguales? " + iguales);

        iguales = Arrays.equals(numeros, numeros3);

        System.out.println("¿El array 1,2,3 y el array 1,2,3,4 son iguales? " + iguales);

        iguales = Arrays.equals(numeros, numeros2);

        System.out.println("¿El array 1,2,3 y el array 1,2,2 son iguales? " + iguales);

        System.out.println("");
        System.out.println("");

        //METODO PROPIO
        System.out.println("¿El array 1,2,3 y el array 1,2,3 son iguales?  " + compararArray(numeros, numeros1));
        System.out.println("¿El array 1,2,3 y el array 1,2,3,4 son iguales? " + compararArray(numeros, numeros3));
        System.out.println("¿El array 1,2,3 y el array 1,2,2 son iguales? " + compararArray(numeros1, numeros2));

    }

    public static boolean compararArray(int[] aux, int[] aux2) {

        boolean iguales2 = false;

        if (aux.length == aux2.length) {

            for (int i = 0; i < aux.length; i++) {

                if (aux[i] != aux2[i]) {

                    iguales2 = false;

                } else {
                    iguales2 = true;
                }
            }

        }

        return iguales2;
    }
}
