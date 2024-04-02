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
 * @author fer
 */
public class CatalogoVehiculos {

    
    private List<Vehiculo> lista; //ES UN ATRIBUTO DE INSTANCIA YA QUE PUEDE HABER VARIOS POR ESO NO ES STATIC

    //EL constructor recibe el tamaño del catalogo e inicializa la estructura
    // de datos con vehiculos aleatorios
    public CatalogoVehiculos(int tamanio) {

        tamanio = Math.abs(tamanio); //el tamaño dle constructor

        this.lista = new ArrayList<>(tamanio);


        //Una vez  creada la estructura de datos le doy valor a cada elemento
        for (int i = 0; i < tamanio; i++) {

            this.lista.add(new Vehiculo());

        }

    }

//    public void mostrarCatalogo() {
//
//        for (Vehiculo v : listaVehiculos) {
//
//            System.out.println(v);
////
////        }
//
//    }
    @Override
    public String toString() {

        String tmp = "";

        for (Vehiculo v : this.lista) {

                tmp += v.toString() + "\n";
    
        }

        return tmp;
    }

    public void añadirVehiculo(Vehiculo v) {

        this.lista.add(v);

    }

    public int getNumeroVehiculos() { //me dice el numero de vehiculos que hay en el catalogo NO EL TAMAÑO
        return this.lista.size();
    }

    public List<Vehiculo> getLista() {
        return lista;
    }

 

    
    //busco vehiculo por posicion valida
    public boolean borrarVehiculo(Vehiculo v) {

        int pos = buscarVehiculo(v);

        if (pos >= 0) {

            this.lista.remove(pos); //borro el objeto
            return true; //SI encuentra y borra el vehiculo existosamente devuelve true
        }

        return false; //Si no consigue borrarlo devuelve false

    }

    //ESTO ES UNA BUSQUEDA SECUENCIAL
    public int buscarVehiculo(Vehiculo v) {

        for (int i = 0; i < this.lista.size(); i++) {

            //MIRA SI EL VEHICULO QUE LE PASO ES IGUAL A UNO DEL ARRAY
            //LE PUSIMOS QUE MIRE EL BASTIDOR
            if (v.equals(this.lista.get(i))) {

                return i;
            }

        }

        return -1;

    }

    public Vehiculo buscarVehiculo(String bastidor) {

        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor);
        int posicion = buscarVehiculo(aux);
        
        return (posicion >= 0) ? this.lista.get(posicion) : null; //Si la posicion es menor que 0 devolvera false

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
