/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author fer
 */
final public class Monitor extends Empleado {

    public Monitor(String nombreE, String nif) {
        super(nombreE, nif);
    }

    public static void Monitorear(Monitor monitor) {

        System.out.println("El monitor esta monitoreando");
    }

}
