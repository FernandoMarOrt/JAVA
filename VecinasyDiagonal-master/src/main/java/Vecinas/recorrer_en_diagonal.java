/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vecinas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fer
 */
public class recorrer_en_diagonal {

    public static void main(String[] args) {

        int[][] diagonal = new int[5][5];

        rellenarAleatorio(diagonal);

        imprimirMatriz(diagonal);

        System.out.println("");
        System.out.println("Diagonal1");

        imprimirMatrizDiagonal1(diagonal);

        System.out.println("");
        System.out.println("Diagonal2");

        imprimirMatrizDiagonal2(diagonal);

    }

    private static void rellenarAleatorio(int[][] diagonal) {

        Scanner teclado = new Scanner(System.in);

        Random numeroAleatorio = new Random();

        for (int i = 0; i < diagonal.length; i++) {

            for (int j = 0; j < diagonal[i].length; j++) {

                //Genero un numero aleatorio entre 0 y 10
                int nAleatorio = numeroAleatorio.nextInt(0, 8 + 1);

                diagonal[i][j] = nAleatorio;

            }

        }

    }

    private static void imprimirMatriz(int[][] diagonal) {

        for (int i = 0; i < diagonal.length; i++) {

            for (int j = 0; j < diagonal[i].length; j++) {

                System.out.print(diagonal[i][j] + " | ");

            }

            System.out.println("");

        }

    }

    private static void imprimirMatrizDiagonal1(int[][] diagonal) {

        for (int i = 0; i < diagonal.length; i++) {

            for (int j = 0; j < diagonal[i].length; j++) {

                System.out.print(diagonal[i][j] + " | ");

                if (i < diagonal.length - 1) {

                    i++;

                }

                System.out.println("");

            }

        }
    }

    private static void imprimirMatrizDiagonal2(int[][] diagonal) {

        for (int i = 0; i < diagonal.length; i++) {

            for (int j = diagonal[i].length - 1; j >= 0; j--) {

                System.out.print(diagonal[i][j] + " | ");

                if (i < diagonal.length - 1) {

                    i++;

                }

                System.out.println("");

            }

        }
    }

}
