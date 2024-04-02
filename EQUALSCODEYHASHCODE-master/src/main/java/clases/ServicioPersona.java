/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class ServicioPersona {
    
    private static Scanner teclado = new Scanner(System.in);
    
    
    
    public static Persona datosPersona() {
        
        Persona persona;
        
        System.out.println("Dime tu nombre");
        String nombrePersona = teclado.nextLine();
        
        System.out.println("Dime tu edad");
        int edadPersona = teclado.nextInt();
        
        System.out.println("Dime tu sexo");
        char sexoPersona = teclado.next().charAt(0);

        System.out.println("Dime tu peso");
        int pesoPersona = teclado.nextInt();
        
        System.out.println("Dime tu altura");
        int alturaPersona = teclado.nextInt();
        
        
        persona = new Persona(nombrePersona, edadPersona, sexoPersona, pesoPersona, alturaPersona, nombrePersona);
        
        return persona;
    }
    
}
