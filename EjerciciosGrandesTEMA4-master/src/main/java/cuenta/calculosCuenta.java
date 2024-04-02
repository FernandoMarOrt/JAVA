package cuenta;

import java.util.Scanner;


public class calculosCuenta {
    
    private static Scanner teclado = new Scanner(System.in);
    
    public static double ingresarDInero(cuenta cuenta) {
        
        double cantidad = 0;
        
        System.out.println("***Dinero Actual: " + cuenta.getSaldo() + " ****");
        
        System.out.println("¿Cuanto dinero quieres ingresar?");
        
        double dineroIngresar = teclado.nextDouble();
        
        //Hacer calculo para ingresar dinero en cuenta
        return cantidad;
        
    }
    
    public static void ingresarIntereses(cuenta cuenta) {
        
        System.out.println("***Dinero Actual: " + cuenta.getSaldo() + " ****");
        
        System.out.println("¿Cuanto dinero quieres ingresar?");
        
        double dineroIngresar = teclado.nextDouble();
        
        //Hacer calculo para ingresar dinero en cuenta
        
    }
    
    
    
}
