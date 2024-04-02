package Vecinas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author fer
 */
public class DIAGONAL2 {

    public static void main(String[] args) {

        int[][] matriz = {
            {4, 6, 3, 2},
            {5, 9, 7, 6},
            {4, 4, 1, 1},
            {0, 3, 6, 8}

        };

        mostrar(matriz);

        System.out.println("");

        List<Integer> diagonal = elementosDiagonalPrincipal(matriz); //Devuelve la primera diagonal en una lista

        diagonal.forEach(System.out::println);
//        elementosDiagonalPrincipal(matriz).forEach(System.out::println);

        System.out.println(Arrays.toString(elementosDiagonalSecundaria(matriz))); //Devuelve la segunda diagonal un array

        System.out.println("");

//        casillasVecinas(0, 0, matriz);
        
        List<Casilla> listacasillas = casillasVecinas(2, 2, matriz);
        
        for (Casilla casilla : listacasillas) {
            
            System.out.println(casilla);
        }

    }

    public static List<Integer> elementosDiagonalPrincipal(int[][] m) {

        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < m.length; i++) {

            lista.add(m[i][i]);

        }

        return lista;

    }

    public static int[] elementosDiagonalSecundaria(int[][] m) {

        int[] array = new int[m.length];

        for (int i = 0; i < m.length; i++) {

            array[i] = (m[i][m.length - 1 - i]);

        }

        return array;

    }

    public static void mostrar(int[][] m) {

        //A la derecha la informacion que voya  mostrar
        // a iz quierda un variable del tipo que voy a mostrar en este caso matriz de enteros
        for (int[] fila : m) { //Por cada elemento que hay en la fila lo imprimo 

            for (int valor : fila) {

                System.out.print(valor + " ");
            }

            System.out.println("");
        }

    }

    public static List<Casilla> casillasVecinas(int fila, int columna, int[][] m) {

        List<Casilla> lista = new ArrayList<>();

        if (filaValida(fila, m) && columnaValida(columna, m)) {

            //Hacemos que no se salga de la fila
            for (int i = fila - 1; i <= fila + 1; i++) {

                //Si la fila no es valida no la muestra
                if (filaValida(i, m)) {

                    //Hacemos que no se salga de la columna
                    for (int j = columna - 1; j <= columna + 1; j++) {
                        
                        //Si la columna no es valida no la muestra

                        if (columnaValida(j, m)) {

                            if (i == fila && j == columna) {

                                continue;

                            } else {

                                System.out.println("casilla " + i + " " + j);
                                lista.add(new Casilla(i, j, m[i][j]));

                            }
                        }

                    }
                }

            }
        }

        return lista;
    }

    public static boolean filaValida(int fila, int[][] matriz) {

        return fila >= 0 && fila < matriz.length;
    }

    public static boolean columnaValida(int columna, int[][] matriz) {

        return columna >= 0 && columna < matriz.length;
    }
}
