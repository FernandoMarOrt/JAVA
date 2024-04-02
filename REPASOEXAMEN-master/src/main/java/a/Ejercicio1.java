/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import javax.swing.JOptionPane;

/**
 *
 * @author Fer
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        String numero = "";
        boolean esNumero = false;

        do{
            
            numero = JOptionPane.showInputDialog("Dime un numero:");

            try {
                
                Integer.parseInt(numero);
                
                esNumero = true;
                
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Introduce un numero valido");
                
            }
            
        }while(!esNumero);

        char[] numerosChar = numero.toCharArray();

        if (esCapicua(numerosChar, 0, numerosChar.length - 1)) {
            
            JOptionPane.showMessageDialog(null, "El número " + numero + " es capicua.");
            
        } else {
            
            JOptionPane.showMessageDialog(null, "El número " + numero + " no es capicua.");
        }
    }

    public static boolean esCapicua(char[] numerosChar, int inicio, int fin) {
        
        if (inicio >= fin) {
            
            return true;
        }

        if (numerosChar[inicio] != numerosChar[fin]) {
            
            return false;
            
        }

        return esCapicua(numerosChar, inicio + 1, fin - 1);
    }
}