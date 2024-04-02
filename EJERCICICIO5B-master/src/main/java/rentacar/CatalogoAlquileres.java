/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacar;

import rentacarlista.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class CatalogoAlquileres {

    private int numeroAlquileres;

    private Alquiler[] listaAlquileres;

    //EL constructor recibe el tamaño del catalogo e inicializa la estructura
    // de datos con vehiculos aleatorios
    public CatalogoAlquileres(int tamanio) {

        tamanio = Math.abs(tamanio); //el tamaño dle constructor

        this.numeroAlquileres = 0; //va a ser el numeor de vehiculo

        this.listaAlquileres = new Alquiler[tamanio];



    }
    
    


    public String toString() {

        String tmp = "";

        for (Alquiler a : listaAlquileres) {
            
            if (a != null) {
                
                tmp += a.toString() + "\n";

            }
        }

        return tmp;
    }
    
    
    
    
    
    public void añadirAlquiler(Alquiler a) {
        
        //Si hay hueco se inserta en el hueco
        if(this.numeroAlquileres < this.listaAlquileres.length) {
            
            for (int i = 0; i < this.listaAlquileres.length; i++) {
                
                
                if(this.listaAlquileres[i] ==  null){
                    
                    this.listaAlquileres[i] = a;
                    this.numeroAlquileres++;
                    

                    break;
                    
                } 
                
                
            }
            
        } else { //SI NO , METO UN ESPACIO MAS 
            
            this.numeroAlquileres++;//SUMA UN ESPACIO AL CATALOGO
            
            this.listaAlquileres = Arrays.copyOf(listaAlquileres, this.numeroAlquileres); 
//          this.listaVehiculos = Arrays.copyOf(listaAlquileres, this.numeroAlquileres*2); //ARRAY NUEVO CON EL DOBLE DE ESPACIOS QUE EL ANTERIOR

            this.listaAlquileres[this.numeroAlquileres-1] = a;
            
        }
        
        
    }
    
    
    public Alquiler buscarAlquiler(int id){
        
        Alquiler aux = new Alquiler();
        aux.setAlquilerID(id);
        int posicion = buscarAlquiler(aux);
        return (posicion>=0)?this.listaAlquileres[posicion]:null; //Si la posicion es menor que 0 devolvera false
        
    }
    

    public int getNumeroAlquileres() { //me dice el numero de clientes que hay en el catalogo NO EL TAMAÑO
        return numeroAlquileres;
    }

    public Alquiler[] getListaAlquileres() {
        return listaAlquileres;
    }
    
    


    public boolean borrarAlquiler(Alquiler a) {

        int pos = buscarAlquiler(a);
        
        if (pos >= 0) {

            this.listaAlquileres[pos] = null; //Es como borrarlo
            this.numeroAlquileres--;
            return true; //SI encuentra y borra el cliente existosamente devuelve true
        }

        return false; //Si no consigue borrarlo devuelve false

    }

    //ESTO ES UNA BUSQUEDA SECUENCIAL
    private int buscarAlquiler(Alquiler a) {

        
        
        if (a != null) {
            
        
            for (int i = 0; i < this.listaAlquileres.length; i++) {

                //MIRA SI EL CLIENTE QUE LE PASO ES IGUAL A UNO DEL ARRAY
                //LE PUSIMOS QUE MIRE EL BASTIDOR

                if (this.listaAlquileres[i] != null && a.equals(this.listaAlquileres[i])) {

                    return i;
                }

            }
        }

        return -1;

    }
    
    
    

}
