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
public class ejercicio5 {

    public static void main(String[] args) {

        int[] numeros = new int[10];

        leerValores(numeros);
        contarPositivos(numeros);
        contarPositivos(numeros);
        contarCeros(numeros);
        imprimirArray(numeros);
        contarCeros(numeros);
        calcularNegativos(numeros);
        calcularPositivos(numeros);
        System.out.println("Numeros de positivos " + contarPositivos(numeros));
        System.out.println("Numeros de negativos " + contarNegativos(numeros));
        System.out.println("Numeros de ceros " + contarCeros(numeros));

    }

    //Leer valores por teclado y almacenarlos 
    public static void leerValores(int[] aux) {

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < aux.length; i++) {

            System.out.println("Dime el numero entero " + (i + 1));
            aux[i] = teclado.nextInt();

        }

    }

    //cuenta el numero de positivos 
    public static int contarPositivos(int[] aux) {

        int Npositivos = 0;

        for (int i = 0; i < aux.length; i++) {

            if (aux[i] > 0) {

                Npositivos++;
            }

        }

        return Npositivos;

    }

    //cuenta el numero de negativos
    public static int contarNegativos(int[] aux) {

        int Nnegativos = 0;

        for (int i = 0; i < aux.length; i++) {

            if (aux[i] < 0) {

                Nnegativos++;
            }

        }

        return Nnegativos;

    }

    //cuenta el numero de ceros
    public static int contarCeros(int[] aux) {

        int Nceros = 0;

        for (int i = 0; i < aux.length; i++) {

            if (aux[i] == 0) {

                Nceros++;
            }

        }

        return Nceros;

    }

    ///Imprimir array
    public static void imprimirArray(int[] aux) {

        for (int i = 0; i < aux.length; i++) {

            System.out.println("Numeros: " + aux[i]);

        }

    }

    //calcular la media de positivos
    public static void calcularPositivos(int[] aux) {

        int totalPositivos = 0;
        double mediaPositivos = 0;

        for (int i = 0; i < aux.length; i++) {

            if (aux[i] > 0) {

                totalPositivos += aux[i];

            }

        }

        mediaPositivos = totalPositivos / contarPositivos(aux);

        System.out.println("La media de los numeros positivos es " + mediaPositivos);

    }
    //calcular la media de negativos
    public static void calcularNegativos(int[] aux) {

        int totalNegativos = 0;
        double mediaNegativos = 0;

        for (int i = 0; i < aux.length; i++) {

            if (aux[i] < 0) {

                totalNegativos += aux[i];

            }

        }

        mediaNegativos = totalNegativos / contarNegativos(aux);
        System.out.println("La media de los numeros negativos es " + mediaNegativos);

    }

}
