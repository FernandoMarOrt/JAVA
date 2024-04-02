/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5B;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class CatalogoAlquileres {

    private List<Alquiler> lista3;

    //EL constructor recibe el tamaño del catalogo e inicializa la estructura
    // de datos con vehiculos aleatorios
    public CatalogoAlquileres(int tamanio) {

        tamanio = Math.abs(tamanio); //el tamaño dle constructor

        this.lista3 = new ArrayList<>(tamanio);

    }

    public String toString() {

        String tmp = "";

        for (Alquiler a : this.lista3) {

            tmp += a.toString() + "\n";
        }

        return tmp;
    }

    public void añadirAlquiler(Alquiler a) {

        this.lista3.add(a);

    }

    public Alquiler buscarAlquiler(int id) {

        Alquiler aux = new Alquiler();

        aux.setAlquilerID(id);

        int posicion = buscarAlquiler(aux);

        return (posicion >= 0) ? this.lista3.get(posicion) : null; //Si la posicion es menor que 0 devolvera false

    }

    public int getNumeroAlquileres() { //me dice el numero de clientes que hay en el catalogo NO EL TAMAÑO
        return this.lista3.size();
    }

    public List<Alquiler> getListaAlquileres() {
        return lista3;
    }

    public boolean borrarAlquiler(Alquiler a) {

        int pos = buscarAlquiler(a);

        if (pos >= 0) {
            this.lista3.remove(pos);
            return true; //SI encuentra y borra el cliente existosamente devuelve true
        }

        return false; //Si no consigue borrarlo devuelve false

    }

    //ESTO ES UNA BUSQUEDA SECUENCIAL
    private int buscarAlquiler(Alquiler a) {

        if (a != null) {

            for (int i = 0; i < this.lista3.size(); i++) {

                //MIRA SI EL CLIENTE QUE LE PASO ES IGUAL A UNO DEL ARRAY
                //LE PUSIMOS QUE MIRE EL BASTIDOR
                if (a.equals(this.lista3.get(i))) {

                    return i;
                }

            }
        }

        return -1;

    }

}
