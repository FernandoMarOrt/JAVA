/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package objetos2;

import java.util.Random;

/**
 *
 * @author fer
 */
public enum Color {
    
    ROJO,AMARILLO,AZUL,VERDE,BLANCO,NEGRO;
    
    
    public static Color getAleatorio(){
        
        Random r = new Random();
        
        Color[] colores = Color.values();
        
        int posicion = r.nextInt(0,colores.length);
        
        return colores[posicion];
        
    }
    
}
