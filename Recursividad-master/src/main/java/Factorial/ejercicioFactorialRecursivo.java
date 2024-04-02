/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorial;

/**
 *
 * @author fer
 */
public class ejercicioFactorialRecursivo {

    public static void main(String[] args) {

        
        
        

    }



    public static int factorialRecursivo2(int n) {

        int numero = Math.abs(n);

        if (numero == 0 || numero == 1) {
            
            return 1;

        }else {
            
            
            return numero * factorialRecursivo2(numero-1);
            
        }
        
        

    }

}
