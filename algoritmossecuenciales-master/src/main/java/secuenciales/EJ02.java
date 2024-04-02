//Algoritmo que lea por teclaod el radio de una circunferencia y calcule
//Longitud , área y el volumen de una esfera
package secuenciales;

import java.util.Scanner;

public class EJ02 {

    public static void main(String[] args) {

        double radioCircunferencia;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el valor del radio de una circunferencia");

        radioCircunferencia = teclado.nextDouble();

        //Dejamos asignado el valor de pi 
        final double PI = Math.PI;
        
        //Realizo las operaciones 

        double longitudCircunferencia = (2 * PI) * radioCircunferencia;
        double areaCircunferencia = PI * Math.pow(radioCircunferencia, 2); //Se eleva el radio al cuadrado
        double volumenEsfera = (4 / 3.0) * PI * Math.pow(radioCircunferencia, 3); //Se eleva el radio el cubo

        System.out.println(" La longitud de la circunferencia es: " + longitudCircunferencia);
        System.out.println(" El area de la circunferencia es: " + areaCircunferencia);
        System.out.println(" El volumen de la esfera es: " + volumenEsfera);

    }

}
