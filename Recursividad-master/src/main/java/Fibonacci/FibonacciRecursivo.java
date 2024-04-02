/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fibonacci;

/**
 *
 * @author fer
 */
public class FibonacciRecursivo {

    public static void main(String[] args) {

        System.out.println(fibonacciRecursivo(5));

    }

    public static int fibonacciRecursivo(int n) {

        if (n < 2) {

            return n;

        } else {

            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);

        }

    }

}
