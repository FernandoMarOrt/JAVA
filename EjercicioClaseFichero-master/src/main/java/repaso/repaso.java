/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

import javax.swing.JOptionPane;

/**
 *
 * @author fer
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class repaso {

    public static void main(String[] args) {
        String nombreArchivo = "frase.txt";
        String linea = "";

        try {
            FileWriter fw = new FileWriter(nombreArchivo);
            BufferedWriter bw = new BufferedWriter(fw);

            do{ 
                linea = JOptionPane.showInputDialog(null, "Escribe una frase (Escribe TERMINAR para salir): ");
                if(!linea.equalsIgnoreCase("terminar")){
                    bw.write(linea);
                    bw.newLine();
                }
            } while(!linea.equalsIgnoreCase("terminar"));

            
            bw.close();
            fw.close();

            JOptionPane.showMessageDialog(null, "Se han escrito las líneas en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
        }
    }
}


