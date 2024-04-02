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
public class pruebas {

    public static void main(String[] args) {

        int numeros[] = {6, 5, 3, 1, 2};

        int pos = busquedaSecuencial(numeros, 10);

        System.out.println("EL 10 esta en la posicion " + pos);

        pos = busquedaSecuencial(numeros, 3);

        System.out.println("El 3 esta en la posicion " + pos);

        if (pos >= 0) {

            System.out.println("El elemento de la posicion " + pos + " es " + numeros[pos]);

        }
        
        Arrays.sort(numeros);//SIEMPRE QUE SE BUSCA SE ORDENA ANTES SIEMPRE
        int posicion = Arrays.binarySearch(numeros, 5);
        System.out.println(posicion);

    }

    //Si hay varios devuelve la primera
    //Si no existe devuelve -1
    public static int busquedaSecuencial(int[] array, int numeroBuscar) {

        int indice = -1;

        //Recorremos el array completo
        for (int i = 0; i < array.length; i++) {

            if (numeroBuscar == array[i]) { //Lo he encontrado 

                indice = i; //guarda la posicion para devolverlo
                break; //Cuando lo encuentro PARO EL BUCLE CON BREAK

            }

        }

        return indice;

    }
}
