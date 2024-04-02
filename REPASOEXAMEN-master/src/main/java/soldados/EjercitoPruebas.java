/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soldados;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author fer
 */
public class EjercitoPruebas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Set<Soldado> soldados = new HashSet<>();

        Ejercito ejercito = new Ejercito();

        //Metodo para alistar soldados
        ejercito.alistarSoldado(soldados);

        //Metodo para imprimir soldados en forma de arraylist
        ejercito.imprimirSoldados(soldados);

        //Comprueba si el ejercito esta vacio
        boolean ejercitoVacio = ejercito.ejercitoVacio(soldados);

        if (ejercitoVacio) {

            System.out.println("El ejercito esta vacio");

        } else {

            System.out.println("El ejercito tiene soldados");
        }

        //Comprueba si el soldado esta alistado en el ejercito
        boolean estaSoldado = ejercito.soldadoEstaEjercito(soldados);

        if (estaSoldado) {

            System.out.println("El soldado esta alistado en el ejercito");

        } else {

            System.out.println("El soldado no esta alistado en el ejercito");
        }

        //Desmatricular un soldado del ejercito
        ejercito.desmatricularSoldado(soldados);

        //Imprime los soldados en forma de arraylist
        ejercito.imprimirSoldados(soldados);

    }

}
