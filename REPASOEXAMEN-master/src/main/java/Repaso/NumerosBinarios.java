/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso;

/**
 *
 * @author Fer
 */
import java.util.Random;
import java.util.Scanner;

public class NumerosBinarios {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero entero");

        int tamanio = teclado.nextInt();

        int[][] matriz = rellenarMatriz(tamanio); // Relleno la matriz

        imprimirMatriz(matriz); // Imprimo matriz

        int[] coordenadas = encontrarCasilla(matriz); // Busco por el metodo la casilla

        //If por si sale nulo la coordenada al no encontrarla
        if (coordenadas != null) {

            System.out.println("La primera casilla se encuentra en: (" + coordenadas[0] + "," + coordenadas[1] + ")");

        } else {

            System.out.println("No hay ninguna casilla");
        }
    }

    // Genero matriz NxN con números aleatorios entre 0 y 1
    public static int[][] rellenarMatriz(int tamanio) {

        int[][] matriz = new int[tamanio][tamanio];

        Random numeroAleatorio = new Random();

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                int nAleatorio;

                nAleatorio = numeroAleatorio.nextInt(0, 1 + 1);

                matriz[i][j] = nAleatorio;
            }
        }
        return matriz;
    }

    // Buscar primera casilla con valor cero y uno en las esquinas
    public static int[] encontrarCasilla(int[][] matriz) {

        int[] coordenadas = new int[2];

        for (int i = 1; i < matriz.length - 1; i++) {

            for (int j = 1; j < matriz[i].length - 1; j++) {

                if (matriz[i][j] == 0 && matriz[i - 1][j - 1] == 1 && matriz[i - 1][j + 1] == 1 && matriz[i + 1][j - 1] == 1 && matriz[i + 1][j + 1] == 1) {

                    coordenadas[0] = i;

                    coordenadas[1] = j;
                    return coordenadas;
                }
            }
        }
        return null; //Devuelvo null si no encuentro ninguna casilla 
    }

    // Imprimo la matriz
    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");

            }

            System.out.println();
        }
    }
}
