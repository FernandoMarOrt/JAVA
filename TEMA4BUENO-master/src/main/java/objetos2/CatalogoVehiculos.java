/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos2;

import java.util.Arrays;

/**
 *
 * @author fer
 */
public class CatalogoVehiculos {

    private int numeroVehiculos;

    private Vehiculo[] listaVehiculos;

    //EL constructor recibe el tamaño del catalogo e inicializa la estructura
    // de datos con vehiculos aleatorios
    public CatalogoVehiculos(int tamanio) {

        tamanio = Math.abs(tamanio); //el tamaño dle constructor

        this.numeroVehiculos = tamanio; //va a ser el numeor de vehiculo

        this.listaVehiculos = new Vehiculo[tamanio];

        //Una vez  creada la estructura de datos le doy valor a cada elemento
        for (int i = 0; i < listaVehiculos.length; i++) {

            this.listaVehiculos[i] = new Vehiculo();

        }

    }

//    public void mostrarCatalogo() {
//
//        for (Vehiculo v : listaVehiculos) {
//
//            System.out.println(v);
////
////        }
//
//    }
    public String toString() {

        String tmp = "";

        for (Vehiculo v : listaVehiculos) {
            
            if (v != null) {
                
                tmp += v.toString() + "\n";

            }
        }

        return tmp;
    }
    
    
    
    
    
    public void añadirVehiculo(Vehiculo v) {
        
        //Si hay hueco se inserta en el hueco
        if(this.numeroVehiculos < this.listaVehiculos.length) {
            
            for (int i = 0; i < this.listaVehiculos.length; i++) {
                
                
                if(this.listaVehiculos[i] ==  null){
                    
                    this.listaVehiculos[i] = v;
                    this.numeroVehiculos++;
                    
                    System.out.println("GUARDANDO VEHICULOS EN POSICION" + i) ;
                    break;
                    
                } 
                
                
            }
            
        } else { //SI NO , METO UN ESPACIO MAS 
            
            this.numeroVehiculos++;//SUMA UN ESPACIO AL CATALOGO
            
            this.listaVehiculos = Arrays.copyOf(listaVehiculos, this.numeroVehiculos); 
//          this.listaVehiculos = Arrays.copyOf(listaVehiculos, this.numeroVehiculos*2); //ARRAY NUEVO CON EL DOBLE DE ESPACIOS QUE EL ANTERIOR

            this.listaVehiculos[this.numeroVehiculos-1] = v;
            
        }
        
        
    }
    
    
    
    

    public int getNumeroVehiculos() { //me dice el numero de vehiculos que hay en el catalogo NO EL TAMAÑO
        return numeroVehiculos;
    }

    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }

//    public void borrarVehiculo(Vehiculo v) {
//
//        int pos = buscarVehiculo(v);
//
//        if (pos >= 0) {
//
//            this.listaVehiculos[pos] = null; //Es como borrarlo
//
//        }
//
//    }
    public boolean borrarVehiculo(Vehiculo v) {

        int pos = buscarVehiculo(v);

        if (pos >= 0) {

            this.listaVehiculos[pos] = null; //Es como borrarlo
            this.numeroVehiculos--;
            return true; //SI encuentra y borra el vehiculo existosamente devuelve true
        }

        return false; //Si no consigue borrarlo devuelve false

    }

    //ESTO ES UNA BUSQUEDA SECUENCIAL
    public int buscarVehiculo(Vehiculo v) {

        for (int i = 0; i < this.listaVehiculos.length; i++) {

            //MIRA SI EL VEHICULO QUE LE PASO ES IGUAL A UNO DEL ARRAY
            //LE PUSIMOS QUE MIRE EL BASTIDOR
            if (v.equals(this.listaVehiculos[i])) {

                return i;
            }

        }

        return -1;

    }
    
    
    public Vehiculo buscarVehiculo(String bastidor){
        
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);
        int posicion = buscarVehiculo(aux);
        return (posicion>=0) ? this.listaVehiculos[posicion]:null; //Si la posicion es menor que 0 devolvera false
        
    }
    

}
