/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fer
 */
public class Main {

    public static void main(String[] args) {
        
        List<Azar> objetoAzar  = new ArrayList<>();
        
        
        objetoAzar.add(new Moneda());  //Conversion implicita (no se ve en el codigo)
        objetoAzar.add(new Dado()); //Conversion implicita
        
        for (Azar a : objetoAzar) {
            
            System.out.println("Lanzamiento " +  a.lanzar());
            
            //Variable a eres un Dado? eso lo que significa instanceof
            
            if(a instanceof Dado){
                
                ((Dado) a).metodoDado(); //Conversion explicita (se ve en el codigo )
            }
            
        }
        
        

        Azar dado1 = new Dado();
        Azar moneda = new Moneda();
        
        System.out.println("Dado:");

        System.out.println(" Lanzamiento dado 1: " + dado1.lanzar());
        System.out.println(" Lanzamiento dado 2: " + dado1.lanzar());
        System.out.println(" Lanzamiento dado 3: " + dado1.lanzar());
        
        
        System.out.println("");
        System.out.println("Moneda:");
        
        System.out.println(" Lanzamiento moneda 1: " + moneda.lanzar());
        System.out.println(" Lanzamiento moneda 1: " + moneda.lanzar());
        System.out.println(" Lanzamiento moneda 1: " + moneda.lanzar());

    }

}
