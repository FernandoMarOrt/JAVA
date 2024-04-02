/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas1;

import java.util.ArrayList;

/**
 *
 * @author fer
 * 
 * 
 * 
 */



//Solo se admiten obejtos
public class ListasNumeros {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        
        listaEnteros.add(10);
        listaEnteros.add(9);
        listaEnteros.add(8);
        listaEnteros.add(7);
        listaEnteros.add(6);
        
        
        
        System.out.println("Tamaño de la lista: " + listaEnteros.size());
        
        for (int i = 0; i < listaEnteros.size(); i++) {
            
            
            System.out.println("Elemento " + (i+1) + " => " + listaEnteros.get(i));
            
            
            
        }
        
        
        if(listaEnteros.contains(7)){
            
            System.out.println("el 7 esta en la lista");
        }
        
        Integer numero = 10; //Le digo que es un numero y lo paso abajo
        listaEnteros.remove(numero); //Para eliminarlo
        
        int posicion = listaEnteros.indexOf(7);
        
        System.out.println("el 7 esta en la posicion " + posicion); //OJO PIOJO DICE POSICION ES DECIR DESDE EL 0
        
        listaEnteros.add(100);
        
        listaEnteros.forEach(System.out::println); //Imprimo toda la lista
        
        
        System.out.println("***********************************************");
        
        
        for (Integer num : listaEnteros) {
            
            System.out.print(" " + num);
            
            
        }
        
        System.out.println("");
        System.out.println("***********************************************");
        
        
        listaEnteros.set(0, 200);
   
        for (Integer num : listaEnteros) {
            
            System.out.print(" " + num);
            
            
        }
        
    }
    
}
