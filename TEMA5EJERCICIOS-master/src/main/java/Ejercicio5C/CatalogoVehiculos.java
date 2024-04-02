/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5C;

import java.util.Scanner;

/**
 *
 * @author fer
 */
public class CatalogoVehiculos extends CatalogoGenerico<Vehiculo> {

    public CatalogoVehiculos(int tamanio) {
        super(tamanio);
    }


    
    
    //Se pone en esta clase ya que es unico y no generico
    public Vehiculo buscarVehiculo(String bastidor) {
        // 
        Vehiculo aux = new Vehiculo();
        
        aux.setBastidor(bastidor); //
        
        int posicion = this.buscarElemento(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
    
    
     //Metodo para registrar un vehiculo con datos por teclado
    public static Vehiculo vehiculoConDatos() {

        Scanner teclado = new Scanner(System.in);

        boolean disponible = false; //Asumo que como se registrar un coche no va a estar ocupado

        System.out.println("Dime el bastidor");
        String bastidor = teclado.nextLine();

        System.out.println("Dime la matricula");
        String matricula = teclado.nextLine();
        
       
        System.out.println("Dime el color");
        String color = teclado.nextLine();

        System.out.println("Dime el modelo");
        String modelo = teclado.nextLine();

        System.out.println("Dime la tarifa");
        double tarifa = teclado.nextDouble();

        Vehiculo vehiculo1 = new Vehiculo(bastidor, matricula, disponible, tarifa, color, modelo);

        return vehiculo1;
    }
    
}
