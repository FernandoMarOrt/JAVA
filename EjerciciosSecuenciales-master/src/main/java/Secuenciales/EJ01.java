package Secuenciales;

import java.util.Scanner;

public class EJ01 {

    public static void main(String[] args) {
        
        //Algoritmo que lea por teclado una cantidad de grados centígrados y
        //los pase a grados Fahrenheit
        
        double gradosCentigrados ,gradosFahrenheit;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una cantidad de grados centígrados");
        gradosCentigrados = teclado.nextDouble();
        
        gradosFahrenheit = (gradosCentigrados * 1.8) + 32; //Operacion para pasar de grados centigrados a fahrenheit 
        
        System.out.println( gradosCentigrados + "º grados centigrados son " + gradosFahrenheit + " grados fahrenheit");
          
        
    }

}
