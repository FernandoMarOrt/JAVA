/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Concierto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class PROBANDO {

   public static void main(String[] args) {
    String nombreArchivo = "concierto.txt";
    String separador = "";

    int[][] matriz = generarMatrizFichero(nombreArchivo, separador);

    // Imprimir la matriz
    for (int fila = 0; fila < matriz.length; fila++) {
        for (int columna = 0; columna < matriz[fila].length; columna++) {
            System.out.print(matriz[fila][columna] + " ");
        }
        System.out.println();
    }
}

    public static int[][] generarMatrizFichero(String nomFichero, String separador) {
        String idFichero = nomFichero;
        String[] tokens;
        String linea = "";
        int contador = 0;
        int[][] matriz = null;

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                datosFichero.nextLine();
                contador++;
            }

            matriz = new int[contador][];
            datosFichero.close();

            Scanner datosFichero2 = new Scanner(new File(idFichero), "UTF-8");

            int fila = 0;
            while (datosFichero2.hasNextLine()) {
                linea = datosFichero2.nextLine();
                tokens = linea.split(separador);

                matriz[fila] = new int[tokens.length]; // Crear las columnas de la matriz con la longitud de los tokens

                for (int columna = 0; columna < tokens.length; columna++) {
                    char c = tokens[columna].charAt(0);
                    if (c == 'R') {
                        matriz[fila][columna] = 1; // 1 representa 'R'
                    } else if (c == 'L') {
                        matriz[fila][columna] = 0; // 0 representa 'L'
                    } else if (c == 'X') {
                        matriz[fila][columna] = -1; // -1 representa 'X'
                    }
                }

                fila++; // Contar filas
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return matriz;
    }

}
