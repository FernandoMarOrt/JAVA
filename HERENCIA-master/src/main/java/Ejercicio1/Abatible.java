/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author fer
 */
public class Abatible extends Ventana {

    public Abatible(Persiana p) {
        super(p);
    }

    @Override
    public void Abrir() {

        System.out.println("Se ha abierto la Ventana Abatible");

    }

    @Override
    public void Cerrar() {

        System.out.println("Se ha cerrado la Ventana Abatible");

    }

}
