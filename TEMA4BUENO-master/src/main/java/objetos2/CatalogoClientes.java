/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class CatalogoClientes {

    private int numeroClientes;

    private Clientes[] listaClientes;

    //EL constructor recibe el tamaño del catalogo e inicializa la estructura
    // de datos con vehiculos aleatorios
    public CatalogoClientes(int tamanio) {

        tamanio = Math.abs(tamanio); //el tamaño dle constructor

        this.numeroClientes = tamanio; //va a ser el numeor de vehiculo

        this.listaClientes = new Clientes[tamanio];

        //Una vez  creada la estructura de datos le doy valor a cada elemento
        for (int i = 0; i < listaClientes.length; i++) {

            this.listaClientes[i] = new Clientes();

        }

    }

    public String toString() {

        String tmp = "";

        for (Clientes c : listaClientes) {

            if (c != null) {

                tmp += c.toString() + "\n";

            }
        }

        return tmp;
    }

    public void añadirClientes(Clientes c) {

        //Si hay hueco se inserta en el hueco
        if (this.numeroClientes < this.listaClientes.length) {

            for (int i = 0; i < this.listaClientes.length; i++) {

                if (this.listaClientes[i] == null) {

                    this.listaClientes[i] = c;
                    this.numeroClientes++;

                    System.out.println("Guardando clientes en la posicion" + i);
                    break;

                }

            }

        } else { //SI NO , METO UN ESPACIO MAS 

            this.numeroClientes++;//SUMA UN ESPACIO AL CATALOGO

            this.listaClientes = Arrays.copyOf(listaClientes, this.numeroClientes);
//          this.listaVehiculos = Arrays.copyOf(listaClientes, this.numeroClientes*2); //ARRAY NUEVO CON EL DOBLE DE ESPACIOS QUE EL ANTERIOR

            this.listaClientes[this.numeroClientes - 1] = c;

        }

    }

    public Clientes buscarCliente(String nif) {

        Clientes aux = new Clientes();
        aux.setNif(nif);
        int posicion = buscarClientes(aux);
        return (posicion >= 0) ? this.listaClientes[posicion] : null; //Si la posicion es menor que 0 devolvera false

    }

    public int getNumeroClientes() { //me dice el numero de clientes que hay en el catalogo NO EL TAMAÑO
        return numeroClientes;
    }

    public Clientes[] getListaClientes() {
        return listaClientes;
    }

    public boolean borrarclientes(Clientes c) {

        int pos = buscarClientes(c);

        if (pos >= 0) {

            this.listaClientes[pos] = null; //Es como borrarlo
            this.numeroClientes--;
            return true; //SI encuentra y borra el cliente existosamente devuelve true
        }

        return false; //Si no consigue borrarlo devuelve false

    }

    //ESTO ES UNA BUSQUEDA SECUENCIAL
    private int buscarClientes(Clientes c) {

        if (c != null) {

            for (int i = 0; i < this.listaClientes.length; i++) {

                //MIRA SI EL CLIENTE QUE LE PASO ES IGUAL A UNO DEL ARRAY
                //LE PUSIMOS QUE MIRE EL BASTIDOR
                if (this.listaClientes[i] != null && c.equals(this.listaClientes[i])) {

                    return i;
                }

            }
        }

        return -1;

    }

    public static Clientes clienteConDatos() {

        Scanner teclado = new Scanner(System.in);
        
        
        
        System.out.println("Dime el nif del cliente");
        
        String nif2 = teclado.nextLine();
        
        System.out.println("Dime el nombre del cliente");
        
        String nombre2 = teclado.nextLine();
        
        System.out.println("Dime el apellido del cliente");
        
        String apellido2 = teclado.nextLine();
        
        Clientes c = new Clientes(nombre2, apellido2, nif2);
        
        return c;
    }

}
