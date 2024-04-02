/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos2;

/**
 *
 * @author fer
 */
public class EjemploEmpresa {
    
    public static void main(String[] args) {
        
        Empresa empresaPrueba = new Empresa();
        
        Clientes c1 = new Clientes();
        Vehiculo v1 = new Vehiculo();
        
        empresaPrueba.registrarCliente(c1);
        empresaPrueba.registrarVehiculo(v1);
        
//        System.out.println(empresaPrueba);
//        
//        empresaPrueba.buscarCliente(c1);
//        
////        System.out.println("El cliente esta en la posicion: " + posicion);
//        
//        
//        empresaPrueba.buscarVehiculo(v1);
//        
        System.out.println("aaa" + v1.isDisponible());
        
    }
    
}
