package Secuenciales;

import java.util.Scanner;

public class EJ08 {

    public static void main(String[] args) {
        
        //En un hospital existen tres áreas: Ginecología, Pediatría y Traumatología. 
        //El presupuesto anual del hospital se reparte de la siguiente forma: 
        //Ginecología 40%, Traumatología 30%, Pediatría 30%. 
        //Obtener la cantidad de dinero que recibirá cada área, para cualquier cantidad de presupuesto.
        
        double presupuesto;
        double ginecologiaPorcentaje = 0.4; //40% = 0.4 Una formas rapida en vez de hacer la cuenta de 3
        double pediatriaPorcentaje = 0.3;  //30% = 0.3 Una formas rapida en vez de hacer la cuenta de 3
        double traumatologiaPorcentaje = 0.3;  //30% = 0.3 Una formas rapida en vez de hacer la cuenta de 3

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el presupuesto anual");
        presupuesto = teclado.nextDouble();
        
        //Realizo las operaciones para saber que los porcentajes de dinero de cada area
        double ginecologia = ginecologiaPorcentaje * presupuesto;
        double pediatria = pediatriaPorcentaje * presupuesto;
        double traumatologia = traumatologiaPorcentaje * presupuesto;
        
        //Imprimo los resultados por pantalla
        
        System.out.println("Presupuesto de ginecologia: " + ginecologia);
        System.out.println("Presupuesto de pediatria: " + pediatria);
        System.out.println("Presupuesto de traumatologia: " + traumatologia);
          
        
    }

}
