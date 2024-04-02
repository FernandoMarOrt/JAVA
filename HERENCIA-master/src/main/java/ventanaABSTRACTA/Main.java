/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanaABSTRACTA;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author fer
 */
public class Main {

    public static void main(String[] args) {

        Ventana v1 = new VAbatible(90, true);

        Ventana v2 = new VCorredera(50, true);
        
        Set<Ventana> conjuntoVentanas = new HashSet<>();
        
        conjuntoVentanas.add(v2);
        conjuntoVentanas.add(v1);
        
        for (Ventana v : conjuntoVentanas) {
            
            v.abrir(100);
            
        }

    }

}
