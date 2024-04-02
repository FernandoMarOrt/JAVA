/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Fer
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        SortedMap<String, Ejercito> conjunto = new TreeMap<>();

        //Añado 3 ejercitos al conjunto 
        conjunto.put("A", new Ejercito("Ejercito A"));

        conjunto.put("B", new Ejercito("Ejercito B"));

        conjunto.put("C", new Ejercito("Ejercito C"));

        
        System.out.println("Obtengo todos los ejercitos:");
        obtenerEjercitos(conjunto);
        
        System.out.println("");
        
        
        System.out.println("Dime un ejercito que mostrar A , B o C");
        String identificador = teclado.nextLine();
        
        ejercitoIdentificador(conjunto, identificador);

    }

    public static void obtenerEjercitos(SortedMap<String, Ejercito> conjunto) {

        List<Ejercito> conjunto2 = new ArrayList(conjunto.values());

        System.out.println(conjunto2);

    }

    public static void ejercitoIdentificador(SortedMap<String, Ejercito> conjunto, String identificador) {

        System.out.println(conjunto.get(identificador));

    }

}
