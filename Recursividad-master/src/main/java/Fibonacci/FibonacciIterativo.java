/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fibonacci;

/**
 *
 * @author fer
 */
public class FibonacciIterativo {

    public static void main(String[] args) {

        int fn0 = 0;
        int fn1 = 1;
        int sumafn;

        for (int i = 0; i < 10; i++) {

            sumafn = fn0 + fn1;

            fn0 = fn1;

            fn1 = sumafn;

            System.out.println(sumafn);

        }
        
        
        System.out.println("Forma de vico");
        int n = fiboIterativo(5);
        
        System.out.println(n);

    }

    public static int fiboIterativo(int n) {

        int numero = Math.abs(n);

        int resultado = 0;

        int n1 = 0;

        int n2 = 1;

        for (int i = 0; i < numero; i++) {
            
            resultado = n1 + n2;
            
            n2 = n1;
            
            n1 = resultado;

        }
        
        return resultado;

    }

}
