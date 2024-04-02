package secuenciales;

import java.util.Scanner;

public class EJ03 {

    public static void main(String[] args) {
        
        //Declaro las variables con las que voy a almacenar las notas
        float nota1;
        float nota2;
        float nota3;
        
        //Creacion del objeto Scanner llamado teclado
        // a partir de la entrada estandar del sistema
        
        Scanner teclado = new Scanner(System.in);
        
        
        //Pregunto las 3 notas y las guardo en sus respectivas variables
        System.out.println("Dime la primera nota");
        nota1 = teclado.nextFloat();
        System.out.println("Dime segunda nota");
        nota2 = teclado.nextFloat();
        System.out.println("Dime la tercera nota");
        nota3 = teclado.nextFloat();
        
        //Hago el calculo de la media 
        float media = (nota1+nota2+nota3)/3;
        
        //Imprimo por pantalla el resultado con un texto
        
        System.out.println("La media de las 3 notas es: " + media);
    
    }

}