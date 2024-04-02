/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author fer
 */
public class Casa {
    
    private Puerta puerta;
    private ArrayList<Ventana> ventanas;
    private ArrayList<Calefactor> calefactores;

    //Si no tiene calecfactor
    public Casa(Puerta p, Ventana v) {
        puerta = p;
        ventanas = new ArrayList<>();
        ventanas.add(v);
        calefactores = new ArrayList<>();
    }
    
    //Si si tiene calefactor 
    public Casa(Puerta p, Ventana v, ArrayList<Calefactor> lista ) {
        puerta = p;
        ventanas = new ArrayList<>();
        ventanas.add(v);
        calefactores = lista;

    }
    
  

}
