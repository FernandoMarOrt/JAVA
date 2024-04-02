/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarlista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fer
 */


//Clase generica
public class CatalogoG<T> {
    
    private List<T> lista;
    
    
  
    public CatalogoG(int tamanio) {

        tamanio = Math.abs(tamanio); //el tamaño dle constructor

        this.lista = new ArrayList<>(tamanio);
        //lista size en este punto es 

        //Una vez  creada la estructura de datos le doy valor a cada elemento
        //for (int i = 0; i < tamanio; i++) {

            //this.lista.add(new Vehiculo());

        //}

    }


    @Override
    public String toString() {

        String tmp = "";

        for (T t : this.lista) {//T sera la clase y t el objeto creado

                tmp += t.toString() + "\n";//cojo el to string del objeto t
    
        }

        return tmp;
    }

    public void añadirElemento(T elemento) {

        this.lista.add(elemento);

    }

    public int getNumeroElementos() { //me dice el numero de vehiculos que hay en el catalogo NO EL TAMAÑO y elementos sera lo que yo quiera obtener
        return this.lista.size();
    }
//
//    public List<T> getLista() {
//        return CatalogoG;
//    }

 

   
    //ESTO ES UNA BUSQUEDA SECUENCIAL
    public int buscarElemento(T elemento) {//Elemento  se cambia por el tipo de dato

        for (int i = 0; i < this.lista.size(); i++) {

            //MIRA SI EL VEHICULO QUE LE PASO ES IGUAL A UNO DEL ARRAY
            //LE PUSIMOS QUE MIRE EL BASTIDOR
            if (elemento.equals(this.lista.get(i))) {

                return i;
            }

        }

        return -1;

    }

      //busco vehiculo por posicion valida
    public boolean borrarElemento(T elemento) {

        int pos = buscarElemento(elemento);

        if (pos >= 0) {

            this.lista.remove(pos); //borro el objeto
            return true; //SI encuentra y borra el vehiculo existosamente devuelve true
        }

        return false; //Si no consigue borrarlo devuelve false

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
