/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.Random;

/**
 *
 * @author Fer
 */
public class GenerarPremios {
    
    
    private double premio;

    public GenerarPremios() {
        this.premio = numeroAleatorio();
    }
    
 
    public double numeroAleatorio() {
        
        Random numeroAleatorio = new Random();
        double nAleatorio = numeroAleatorio.nextInt(0, 1000000 + 1);
        
        return nAleatorio;
    }
    
}
