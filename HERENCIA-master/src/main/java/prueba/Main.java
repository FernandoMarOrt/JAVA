/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author fer
 */
public class Main {

    public static void main(String[] args) {

        Map<Silla, Integer> map = new TreeMap<>();

        Silla s1 = new Silla(23, "Silla1");
        Silla s2 = new Silla(24, "ZSilla2");
        Silla s3 = new Silla(23, "ASilla3");
        Silla s4 = new Silla(25, "GSilla4");

        map.put(s1, 23);
        map.put(s2, 24);
        map.put(s3, 23);
        map.put(s4, 25);

        for (Map.Entry<Silla, Integer> entry : map.entrySet()) {

            Silla key = entry.getKey();
            Integer val = entry.getValue();

            System.out.println("Key " + key + "\t Value: " + val);

        }

        List<Silla> listaSillas = new ArrayList<>();

        listaSillas.add(s1);
        listaSillas.add(s2);
        listaSillas.add(s3);
        listaSillas.add(s4);

        System.out.println("Lista de sillas segun el orden de insercion");

        listaSillas.forEach(s -> System.out.println("Nombre " + s.getNombre()));

        System.out.println("Lista de sillas segun el orden natural");

        Collections.sort(listaSillas);

        listaSillas.forEach(s -> System.out.println("Nombre " + s.getNombre()));

        System.out.println("Lista de sillas segun el peso");

        //La variable criterio es de tipo criteriopeso , object , comparator
        CriterioPeso criterio = new CriterioPeso();

//        Collections.sort(listaSillas, criterio);

//  TODO ESTO SE RESUME EN LO DE ABAJO CON LA LAMBDA
//        Collections.sort(listaSillas, new Comparator<Silla>() {
//            @Override
//            public int compare(Silla o1, Silla o2) {
//
//                return Double.compare(o1.peso, o2.peso);
//
//            }
//        });
//        
        
        Collections.sort(listaSillas,(si1,si2)->Double.compare(si1.peso, si2.peso));

        listaSillas.forEach(s -> System.out.println("Nombre " + s.getNombre()));

    }

}
