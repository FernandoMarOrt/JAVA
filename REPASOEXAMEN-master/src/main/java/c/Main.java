/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Fer
 */
public class Main {

    public static void main(String[] args) {

        List<Animal> animales = new ArrayList<>();

        animales.add(new Perro(5, 4, "APerro1"));
        animales.add(new Perro(6, 4, "CPerro2"));
        animales.add(new Perro(7, 4, "BPerro3"));

        animales.add(new Lobo(5, 4, "GLobo1"));
        animales.add(new Lobo(6, 4, "FLobo2"));
        animales.add(new Lobo(7, 4, "ELobo3"));

        //Polimorfismo
        for (Animal a : animales) {

            a.saltar();

        }

        for (Animal a : animales) { //Conversion explicita

            if (a instanceof Lobo) {

                Lobo lobo = (Lobo) a;

                lobo.numeroCrias();

            } else if (a instanceof Perro) {

                Perro perro = (Perro) a;

                perro.ladrar();

            }
        }

        animales.sort((a1, a2) -> a1.getNombre().compareTo(a2.getNombre())); //Ordeno a los animales por el nombre

        for (Animal a : animales) { //Lista ordenada

            System.out.println(a);

        }
        
        
        //Busqueda binaria
        Animal buscado = new Perro(7, 4, "BPerro3");
        
        int posicion = Collections.binarySearch(animales, buscado);
        
        System.out.println(buscado + " esta en la posicion de la lista: " + posicion);

    }
}
