/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarlista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class CatalogoClientes {

    private List<Clientes> lista2;

    //EL constructor recibe el tamaño del catalogo e inicializa la estructura
    // de datos con vehiculos aleatorios
    public CatalogoClientes(int tamanio) {

        tamanio = Math.abs(tamanio); //el tamaño dle constructor

        this.lista2 = new ArrayList<>(tamanio);
        
        //Una vez  creada la estructura de datos le doy valor a cada elemento
        for (int i = 0; i < tamanio; i++) {

            this.lista2.add(new Clientes());

        }

    }

    public String toString() {

        String tmp = "";

        for (Clientes c : this.lista2) {

                tmp += c.toString() + "\n";

        }

        return tmp;
    }

    public void añadirClientes(Clientes c) {

       this.lista2.add(c);

    }

    public Clientes buscarCliente(String nif) {

        Clientes aux = new Clientes();
        aux.setNif(nif);
        int posicion = buscarClientes(aux);
        return (posicion >= 0) ? this.lista2.get(posicion) : null; //Si la posicion es menor que 0 devolvera false

    }

    public int getNumeroClientes() { //me dice el numero de clientes que hay en el catalogo NO EL TAMAÑO
        return this.lista2.size();
    }

    public List<Clientes> getLista2() {
        return lista2;
    }

    
    public boolean borrarclientes(Clientes c) {

        int pos = buscarClientes(c);

        if (pos >= 0) {

            this.lista2.remove(pos);
            return true; //SI encuentra y borra el cliente existosamente devuelve true
        }

        return false; //Si no consigue borrarlo devuelve false

    }

    //ESTO ES UNA BUSQUEDA SECUENCIAL
    private int buscarClientes(Clientes c) {

        if (c != null) {

            for (int i = 0; i < this.lista2.size(); i++) {

                //MIRA SI EL CLIENTE QUE LE PASO ES IGUAL A UNO DEL ARRAY
                //LE PUSIMOS QUE MIRE EL BASTIDOR
                if (c.equals(this.lista2.get(i))) {

                    return i;
                }

            }
        }

        return -1;

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
