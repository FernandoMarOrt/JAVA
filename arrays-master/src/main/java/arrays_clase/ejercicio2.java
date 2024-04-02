/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt JorgeHernandezPuertas to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_clase;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class ejercicio2 {

    //rellenar array char desde A hasta Z 
    //generar un array de ese tamaño y rellenar de posiciones validas aleatorios
    //cogiendo las posiciones del primer array generar otro y despues pasarlo
    // a string el resultado en plan 1 2 3 4 pues el resultado: EBGH
    
    
    public static void main(String[] args) {
      
        int tamaño = leerTeclado();
        
        char[] arrayAZ = arrayAZ(tamaño);
        
        
        
        
    }
    
    
     //Leo el numero por teclado
    public static int leerTeclado() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuantos strings quieres generar?");

        int numero = teclado.nextInt();

        return numero;
    }
    
    
    //Relleno el array desde la A hasta la Z
    public static char[] arrayAZ(int tamaño){
        
        
        
        int contador = 65;
        
        char[] numeros = new char[tamaño];
        
        for(int i = 0; i < tamaño; i++) {
            
            numeros[i] = (char) contador;
            contador++;
        }
        
        return numeros;
    }

}
