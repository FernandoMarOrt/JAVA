/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_ejercicios;

/**
 *
 * @author Fer
 */
public class ejercicio1 {
    
    public static void main(String[] args) {
        
         int [] numeros = {1,2,3,4,5,6};
         int total = 0;
         
        for (int i = 0; i<numeros.length; i++){
            
            total += numeros[i];
            
            
            
        }
        
        System.out.println("total: " + total);
    }
    
}
