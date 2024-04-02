/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class Loteria {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        Premios loteria = new Premios();

        System.out.println("Dime que boleto tienes: ");
        String numeroLoteria = teclado.nextLine();

        double boletoGanador = loteria.consultarPremio(numeroLoteria);
        
        if(boletoGanador > 0) {
            
            System.out.println("Enhorabuena le han tocado " + boletoGanador + "€");
            
        } else {
            
            System.out.println("Lo siento su boleto no ha sido premiado");
            
        }
        
        

        //Para ver la lista de todos los numeros
        //loteria.verNumeros();
    }

}
