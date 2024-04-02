/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author fer
 */
public class Main {

    public static void main(String[] args) {
        String ficheroLeer = "concierto.txt";
        int columnas = 0;
        int filas = 0;

        // Leo todo el archivo y cuento el numero de filas y columas para hacer la matriz
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(ficheroLeer));
            
            String linea;
            
            while ((linea = br.readLine()) != null) {
                
                columnas++; //cuento todas las columnas que tiene el txt
                
                if (linea.length() > filas) {
                    
                    filas = linea.length(); //
                    
                }
            }
            
            br.close();
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        // Creo el array de char de asientos del txt
        char[][] asientosConcierto = new char[columnas][filas];

        // Leo el archivo de nuevo y guardo los asientos en el array
        try {
            BufferedReader br = new BufferedReader(new FileReader(ficheroLeer));
            
            String linea;
            
            int fila = 0;
            
            while ((linea = br.readLine()) != null) {
                
                //Recorro la linea del txt 
                for (int columna = 0; columna < linea.length(); columna++) {
                    
                    char c = linea.charAt(columna); //voy cogiendo los caracteres y segun sean L , R o X
                    
                    if (c == 'L' || c == 'R' || c == 'X') {
                        
                        asientosConcierto[fila][columna] = c; //Asigno cada letra a su asiento segun el txt
                    }
                }
                fila++; //contador para la fla 
            }
            br.close(); //Cierro el buffer
        } catch (IOException e) {
            
            e.printStackTrace();
            
        }

        // Imprimo el array de asientos ya generado
        for (int i = 0; i < columnas; i++) {
            
            for (int j = 0; j < filas; j++) {
                System.out.print(asientosConcierto[i][j] + " ");
            }
            System.out.println();
        }
    }
}
