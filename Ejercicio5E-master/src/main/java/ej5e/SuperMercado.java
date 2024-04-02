/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5e;

/**
 *
 * @author Usuario
 */
public class SuperMercado {

    public static void main(String[] args) {

        Cinta cinta = new Cinta();
        Caja cajaA = new Caja(cinta);
        

        //Productos que estan en el supermercado 
        Productos natillas = new Productos("natillas   ", 3, 3, 4);
        Productos leche = new Productos("leche      ", 0.9, 2, 10);
        Productos champu = new Productos("champu     ", 3.5, 1, 21);
        Productos servilletas = new Productos("servilletas", 0.75, 2, 21);

        //Añado los producto a la cinta de la cajaA
        cinta.añadirProductos(natillas);
        cinta.añadirProductos(leche);
        cinta.añadirProductos(champu);
        cinta.añadirProductos(servilletas);
        
        //Imprimo el ticket generado en la cajaA
        System.out.println(generarTicket(cajaA));  

    }

    //Metodo para generar un ticket de supermercado 
    public static Ticket generarTicket(Caja c) {

        return c.generarTicket();

    }

}
