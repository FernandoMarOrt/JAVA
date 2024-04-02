/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorial;

/**
 *
 * @author fer
 */
public class ejercicioFactorialIterativo {

    public static void main(String[] args) {

//        int n = 0;
//
//        int aux = n+1;
//
//        for (int i = 0; i < 10; i++) {
//
//            n = (aux * (aux - 1)) * (aux - 2);
//
//            aux++;
//
//            if (n == 1 || n == 0) {
//
//                System.out.println(1);
//                
//
//            } else {
//
//                System.out.println(n);
//            }
//
//        }
//        
//        
        System.out.println("");
        System.out.println("Version 2:");
        //Version vico:
        factorialIterativo(5);
        
        
    }
    
    
    public static void factorialIterativo(int n) {
        
        int resultado = 1;
        
        int numero = Math.abs(n);
        
        for (int i = 0; i <= numero; i++) {
            
            resultado*=i;
            System.out.println(resultado);
            
        }
        
        
    }
}
