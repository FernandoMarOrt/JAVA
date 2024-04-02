/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos2;

import java.time.LocalDate;

/**
 *
 * @author fer
 */
public class AlquilerVehiculos {

    public static void main(String[] args) {
        
        
        CatalogoVehiculos cv = new CatalogoVehiculos(5);
        CatalogoClientes cc = new CatalogoClientes(5);

        Clientes c = cc.buscarCliente("3");
        
        Vehiculo v = cv.buscarVehiculo("4");
        
        System.out.println(c);

       
        System.out.println(v);

        Alquiler a = new Alquiler(c, v, LocalDate.now(), 8);
        
        System.out.println(a);
        
        CatalogoAlquileres ca = new CatalogoAlquileres(10);
        ca.añadirAlquiler(a);
        
        System.out.println("Lista de alquileres ");
        System.out.println(ca);

    }

}
