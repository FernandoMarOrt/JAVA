/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafetera;

/**
 *
 * @author Fer
 */
public class Prueba {
    
    
    public static void main(String[] args) {
        
        Cafetera c = new Cafetera();
        Persona Fer = new Persona(20, "Fernando");
        
        System.out.println("Valores iniciales de la cafetera:");
        System.out.println(c);
        System.out.println();
        
        System.out.println("Lleno la cafetera");
        c.llenarCafetera();
        System.out.println(c);
        System.out.println();
        
        System.out.println("Sirvo una taza de cafe");
        c.servirTaza(300);
        System.out.println(c);
        System.out.println();
        
        System.out.println("Vacio la cafetera");
        c.vaciarCafetera();
        System.out.println(c);
        System.out.println();
        
        System.out.println("Agrego 500 de cafe a la cafetera");
        c.agregarCafe(500);
        System.out.println(c);
        System.out.println();
        
        System.out.println("Sirvo una taza de cafe pero esta vez se pasa"
                + " de la cantidad");
        c.servirTaza(600);
        System.out.println(c);
        System.out.println();
        
        //Se pasa de la capacidad maxima
        System.out.println("Agrego 1200 de cafe a la cafetera");
        c.agregarCafe(1200);
        System.out.println(c);
        System.out.println();
        
        
        System.out.println("Fernando bebe 500 de cafe");
        Fer.beberCafe(c, 500);
        System.out.println(c);
        System.out.println();
        
        System.out.println("Fernando hace cafe");
        Fer.hacerCafe(c);
        System.out.println(c);
        System.out.println();
    }
    
}
