/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5D;

import java.util.ArrayList;

public class Caja {
    
    private int cajaID;
    private Cinta cinta;

    
    //Constructor de la caja el cual le paso un objeto de tipo cinta
    public Caja(Cinta cinta) {
        this.cajaID = 1;
        this.cinta = cinta;
    }
      
    //Getter de caja id y de la cinta
    public int getCajaID() {
        return cajaID;
    }

    public Cinta getCinta() {
        return cinta;
    }

    
    //Metodo to string de la caja
    @Override
    public String toString() {
        return "Caja{" + "cajaID=" + cajaID + ", cinta=" + cinta + '}';
    }

   
    //Genera un ticket a partir de los productos que tiene la cinta
    public Ticket generarTicket() {

        Ticket t = new Ticket(this.cinta);

        return t;
    }
    
    
}
