/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_clase;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class ejercicio1 {

    public static void main(String[] args) {

        //Leer un numero entero por teclado int------
        //decir si es capicuo
        //pasar el int a string
        //del string obtener un array de char[]
        //recorrer despues ese array por delante y por detras a la vez
        //Leo por teclado el numero
        String numCadena = String.valueOf(leerTeclado());

        char[] capicuos = arrayPartido(numCadena);

        boolean sonCapicuos = sonCapicuos(capicuos);

        if (sonCapicuos == true) {

            System.out.println("Son capicuos");
        } else if (sonCapicuos == false) {

            System.out.println("No son capicuos");

        }

    }

    //Leo el numero por teclado
    public static int leerTeclado() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero entero");

        int numero = teclado.nextInt();

        return numero;
    }

    
    //Asigno cada fragmento de numero a una posicion del array
    public static char[] arrayPartido(String numCadena) {
        
        //numCadena.toCharArray(); forma facil de hacer esto

        int tamaño = numCadena.length();

        char[] numeros = new char[tamaño];

        for (int i = 0; i < tamaño; i++) {

            numeros[i] = numCadena.charAt(i);
        }

        return numeros;
    }

    
    
    public static boolean sonCapicuos(char[] capicuos) {

        boolean sonCapicuos = false;

        int j = capicuos.length;

        for (int i = 0; i < capicuos.length; i++) {

            j--;

            if (capicuos[i] != capicuos[j]) {

                sonCapicuos = false;
                break;
                
            } else {

                sonCapicuos = true;
            }

        }

        return sonCapicuos;
    }

}
