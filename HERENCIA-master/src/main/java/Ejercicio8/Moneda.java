/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

import java.util.Random;

/**
 *
 * @author fer
 */
public class Moneda extends Azar {

    public Moneda() {
        super(2);
    }

    @Override
    public int lanzar() {

        return  new Random().nextInt(1, posibilidades + 1);
                
    }

    
    
}
