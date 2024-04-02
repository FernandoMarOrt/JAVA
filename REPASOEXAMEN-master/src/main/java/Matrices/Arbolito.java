package Matrices;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Arbolito {

    public static void main(String[] args) {

        int altura = alturArbol();

        String[][] arbolito = crearArbolito(altura);

        mostrarArbolito(arbolito);

    }

    private static Scanner teclado = new Scanner(System.in);
    
    // FILTRA LA ALTURA DEL ARBOL ENTRE 2 Y 10
    public static int alturArbol() {
        int alt = 2;

        do {
            try {
                do {
                    System.out.println("Indique la altura del arbol");
                    alt = teclado.nextInt();

                    if (alt < 2 || alt > 10) {
                        System.out.println("La altura debe ser entre 2 y 10");
                    }

                } while (alt < 2 || alt > 10);

            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("Escribe un numero");
            }

        } while (alt < 2 || alt > 10);

        return alt;
    }

    // MUESTRA EL ARBOLITO EN TODO SU EXPLENDOR
    public static void mostrarArbolito(String[][] matriz) {
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static String[][] crearArbolito(int altura) {

        // CREA EL ARBOLITO // +2 PARA EL TRONCO  // DUPLICO Y RESTO 1 A LA ALTURA PARA LAS COLUMNAS
        String[][] arbolito = new String[altura + 2][altura * 2 - 1];

        // RESTO A LA ALTURA PARA Q NO SE VAYA PARA EL LADO :) (PQ EMPIEZA POR 0)
        altura--;

        // CREACION DEL ARBOLITO // -2 DEL TRONCO
        for (int i = 0; i < arbolito.length - 2; i++) {
            for (int j = 0; j < arbolito[i].length; j++) {

                // SI LA COLUMNA ES < Q LA ALTURA - LA FILA O
                // LA COLUMNA ES > Q LA ALTURA + LA FILA
                // IJ NO VALE NADA, SI NO VALE 1
                // PERFILA EL ARBOL BASICAMENTE
                if (j < (altura - i) || j > (altura + i)) {
                    arbolito[i][j] = " ";
                } else {
                    arbolito[i][j] = "1";
                }

            }
        }

        // EMPIEZA DESDE EL FINAL -2 HASTA HACER LOS DOS QUE FALTAN 
        // TRONCO
        for (int i = arbolito.length - 2; i < arbolito.length; i++) {
            for (int j = 0; j < arbolito[i].length; j++) {

                // SI ES DIFERENTE A LA ALTURA NO PONE NADA
                // LA ALTURA ES EL CENTRO DEL ARBOL
                if (j != altura) {
                    arbolito[i][j] = " ";
                } else {
                    arbolito[i][j] = "1";
                }
                
            }
        }

        return arbolito;
    }
}
