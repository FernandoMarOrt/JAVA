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
public class CatalogoClientes extends CatalogoGenerico<Clientes> {

    public CatalogoClientes(int tamanio) {
        super(tamanio);
    }
    
    public Clientes buscarCliente(String nif) {

        Clientes aux = new Clientes();
        aux.setNif(nif);
        int posicion = buscarElemento(aux);
        
        return (posicion >= 0) ? this.lista.get(posicion) : null; //Si la posicion es menor que 0 devolvera false

    }
    
    public static Clientes clienteConDatos() {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dime el nif del cliente");
        
        String nif = teclado.nextLine();
        
        System.out.println("Dime el nombre del cliente");
        
        String nombre = teclado.nextLine();
        
        System.out.println("Dime el apellido del cliente");
        
        String apellido = teclado.nextLine();
        
        Clientes cliente1 = new Clientes(nombre, apellido, nif);
        
        return cliente1;
    }
    
    
}
