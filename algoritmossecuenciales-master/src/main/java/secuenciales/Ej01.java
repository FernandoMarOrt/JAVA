package secuenciales;

import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        
        //Algoritmo que lea por teclado una cantidad de grados centígrados y
        //los pase a grados Fahrenheit
        
        double gradosCentigrados ,gradosFahrenheit;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una cantidad de grados centígrados");
        gradosCentigrados = teclado.nextDouble();
        
        //Operacion para pasar de grados centigrados a fahrenheit
        gradosFahrenheit = (gradosCentigrados * 1.8) + 32; 
        
        System.out.println( gradosCentigrados + "º grados centigrados son " 
                + gradosFahrenheit + " grados fahrenheit");
                
    }

}