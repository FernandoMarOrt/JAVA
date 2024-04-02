/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robots;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author fer
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Robots> lista = getListaRobores(20);

        lista.forEach(System.out::println);

        //Ordenar por vida
        Collections.sort(lista, (r1, r2) -> Integer.compare(r1.vida(), r2.vida()));

        System.out.println("Ordenados por vida");

        lista.forEach(System.out::println);

        //Ordenar por vida de menor a mayor
        Comparator<Robots> menorMayor = (r1, r2) -> Integer.compare(r1.vida(), r2.vida());

        Collections.sort(lista, menorMayor);

        System.out.println("Ordenados por vida de menor a mayor");

        lista.forEach(System.out::println);
        
        Collections.sort(lista, (r2, r1) -> Integer.compare(r1.vida(), r2.vida()));//Ordenar de mayor vida a menor

        System.out.println("Robots con mas del 50% de vida");

        for (Robots robots : lista) {
            if (robots.vida() >= 50) {

                System.out.println(robots);
            }
        }

        System.out.println("USANDO API STREAM ROBOTS CON 50% MAS DE VIDA");
        lista.stream()
                .filter(r -> r.vida() >= 50) //Solo va a imprimir los que tiene 50%mas de vida
                .forEach(r -> System.out.println(r)); //Los imprime 

        System.out.println("3 Robots con mayor porcentaje de vida ");

        lista.stream()
                .limit(3) //Me coje los 3 primeros de la lista 
                .forEach(r -> System.out.println(r.numeroSerie()));//Los imprime

    }

    public static ArrayList<Robots> getListaRobores(int num) {

        var listaRobots = new ArrayList<Robots>();

        Random random = new Random();

        if (num <= 0) {

            throw new IllegalArgumentException("El numero de robots a crear no es valido");
        }

        for (int i = 0; i < num; i++) {

            listaRobots.add(new Robots(random.nextInt(0, 5000), random.nextInt(1, 101)));

        }

        return listaRobots;
    }

}
