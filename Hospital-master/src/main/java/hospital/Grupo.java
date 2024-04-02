/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package hospital;

import java.util.Random;

/**
 *
 * @author fer
 */
public enum Grupo {

    C(17.5), D(18.0), E(18.5);

    private Grupo(double irpf) {
        this.irpf = irpf;
    }

    protected double irpf;
    
    
     public static Grupo getAleatorio(){
        
        Random numeroRandom = new Random();
        
        Grupo [] grupos = Grupo.values();
        
        //Posicion aleatorio de donde ira la voz
        int posicionRandom = numeroRandom.nextInt(0,grupos.length);
        
        return grupos[posicionRandom];
    }

}
