/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Fer
 */
public class Trenes {

    public static void main(String[] args) {

        int nPasajeros = 0;
        int nVagones = 0;
        int id = 0;

        int[][] matrizTrenes
                = {
                    {1, 20, 20, 20, 20},
                    {2, 25, 25, 25, 25},
                    {3, 0, 0, 0, 0},
                    {4, 50, 0, 50, 0}
                };

        Map<Integer, Tren> trenesMap = new TreeMap<>();

        for (int i = 0; i < matrizTrenes.length; i++) {

            nPasajeros = 0;
            nVagones = 0;

            for (int j = 0; j < matrizTrenes[i].length; j++) {

                if (j == 0) { //Si se situa en la primera columna 

                    id = matrizTrenes[i][j]; //Asigno el numero al id del tren

                } else {

                    if (matrizTrenes[i][j] > 0) { //Si el valor es mayor que 0

                        nVagones++; //Recuento del numero vagones

                        nPasajeros += matrizTrenes[i][j]; //Recuento del numero de pasajeros
                    }

                }

            }

            Tren auxTren = new Tren(id, nVagones, nPasajeros); //Asigno valores al tren

            trenesMap.put(id, auxTren); //Lo meto en el map

        }

        //Imprimo la lista de los trenes metidos en el map
        for (Integer Key : trenesMap.keySet()) {
            
            System.out.printf("Clave: %s -- Tren: %s %n ", Key, trenesMap.get(Key));
            
        }

    }

}
