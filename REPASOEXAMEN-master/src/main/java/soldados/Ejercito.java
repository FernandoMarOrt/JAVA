/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soldados;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author fer
 */
public class Ejercito {

    private Set<Soldado> ejercito;
    private int numeroSoldado;

    public Ejercito() {
        this.ejercito = new HashSet<>();
        this.numeroSoldado = numeroSoldado(ejercito);
    }

    public static Scanner teclado = new Scanner(System.in);

    //Metodo que dice el numero de soldados 
    public int numeroSoldado(Set<Soldado> ejercito) {

        return ejercito.size();
    }

    //Metood para alistar a un soldado
    public void alistarSoldado(Set<Soldado> ejercito) {

        System.out.println("Introduce el nif del soldado");
        String nif = teclado.nextLine();

        System.out.println("Introduce el nombre del soldado");
        String nombre = teclado.nextLine();

        System.out.println("Introduce el apellido1 del soldado");
        String apellido1 = teclado.nextLine();

        System.out.println("Introduce el apellido2 del soldado");
        String apellido2 = teclado.nextLine();

        System.out.println("Introduce la edad del soldado");
        int edad = teclado.nextInt();

        ejercito.add(new Soldado(nif, nombre, apellido1, apellido2, edad));

    }

    //Metodo para saber si el ejecito estaba vacia
    public boolean ejercitoVacio(Set<Soldado> ejercito) {

        return ejercito.isEmpty();
    }

    //Metodo para saber si el soldado esta en el ejercito
    public boolean soldadoEstaEjercito(Set<Soldado> ejercito) {

        teclado.nextLine();
        
        System.out.println("Introduce el nif del soldado");
        String nif = teclado.nextLine();

        
        
        return ejercito.contains(new Soldado(nif, "", "", "", 0));
        
        

    }
    
    
    public void imprimirSoldados(Set<Soldado> ejercito){
        
         List<Soldado> ejercitoAL = new ArrayList<>(ejercito);
         
         ejercitoAL.forEach(System.out::println);
        
    }
    

    //Metodo para desmatricular un soldado que esta en el ejercito
    public void desmatricularSoldado(Set<Soldado> ejercito) {

        System.out.println("Introduce el nif del soldado");
        String nif = teclado.nextLine();

        Soldado aux = new Soldado(nif, "", "", "", 0);

        if (ejercito.equals(aux.getNif())) {

            System.out.println("El soldado no se encuentra en el ejercito");
            
        } else {

            ejercito.remove(aux);

            System.out.println("Se ha desmatriculado con existo al soldado con el nif: " + nif);
        }

    }

}
