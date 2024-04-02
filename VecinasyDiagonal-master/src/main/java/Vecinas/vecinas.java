/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vecinas;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fer
 */
public class vecinas {

    public static void main(String[] args) {

        int[][] vecinas = new int[5][5];

        rellenarAleatorio(vecinas);

        imprimirMatriz(vecinas);

        imprimirVecinos(vecinas, pedirFila(vecinas), pedirColumna(vecinas));
    }

    private static void rellenarAleatorio(int[][] vecinas) {

        Scanner teclado = new Scanner(System.in);

        Random numeroAleatorio = new Random();

        for (int i = 0; i < vecinas.length; i++) {

            for (int j = 0; j < vecinas[i].length; j++) {

                //Genero un numero aleatorio entre 0 y 20
                int nAleatorio = numeroAleatorio.nextInt(0, 10 + 1);

                vecinas[i][j] = nAleatorio;

            }

        }

    }

    private static void imprimirMatriz(int[][] vecinas) {

        for (int i = 0; i < vecinas.length; i++) {

            for (int j = 0; j < vecinas[i].length; j++) {

                System.out.print(vecinas[i][j] + " | ");

            }

            System.out.println("");

        }

    }

    //Pido y controlo el numero que sera introducido como fila
    private static int pedirFila(int[][] vecinas) {

        Scanner teclado = new Scanner(System.in);

        int fila = 0;

        do {

            try {

                System.out.println("Dime una fila");
                fila = teclado.nextInt();

                if (fila < 0 || fila >= vecinas.length) {

                    System.out.println("Dime una fila valida de la matriz por favor");

                }

            } catch (InputMismatchException ime) {

                System.out.println("Dime una fila valida de la matriz por favor");

            }

        } while (fila < 0 || fila >= vecinas.length);

        return fila;

    }

    //Pido y controlo el numero que sera introducido como columna
    private static int pedirColumna(int[][] vecinas) {

        Scanner teclado = new Scanner(System.in);

        int columna = 0;

        do {

            try {

                System.out.println("Dime una columna");
                columna = teclado.nextInt();

                if (columna < 0 || columna >= vecinas.length) {

                    System.out.println("Dime una columna valida de la matriz por favor");

                }

            } catch (InputMismatchException ime) {

                System.out.println("Dime una columna valida de la matriz por favor");

            }

        } while (columna < 0 || columna >= vecinas.length);

        return columna;

    }

    private static void imprimirVecinos(int[][] vecinas, int fila, int columna) {

        for (int i = (fila - 1); i <= (fila + 1); i++) {

            for (int j = (columna - 1); j <= (columna + 1); j++) {

                //Numero que buscamos. Si esta dentro de la matriz de vecinas
                if (i >= 0 && i < vecinas.length && j >= 0 && j < vecinas[0].length) {
                    
                    //Imprime el adyacente
                    if (i != fila || j != columna) {

                        System.out.print(vecinas[i][j] + " | ");

                    } else {

                        //Pongo un ! donde me dieron la coordenada
                        System.out.print("!" + " | ");
                    }

                }
            }

            System.out.println(""); //Pongo un espacio
        }

    }

}