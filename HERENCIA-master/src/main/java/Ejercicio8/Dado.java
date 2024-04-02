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
public class Dado extends Azar {

    public Dado() {
        super(6);
    }

    @Override
    public int lanzar() {

        return new Random().nextInt(1, posibilidades + 1);

    }
    
    public void metodoDado(){
        System.out.println("Dado");
    }

}
