/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author fer
 */
public class Calefactor {

    private Integer temperatura;

    public Calefactor() {
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getTemperatura() {
        return temperatura;
    }
    
    

    public void Encender() {

        System.out.println("Se ha encendido el calefactor");

    }

    public void Apagar() {

        System.out.println("Se ha apagado el calefactor");

    }

    public void FijarTemperatura(Integer temperatura) {

        this.temperatura = temperatura;

    }

}
