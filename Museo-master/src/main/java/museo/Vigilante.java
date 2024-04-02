/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author fer
 */
final public class Vigilante extends Empleado {

    public Vigilante(String nombreE, String nif) {
        super(nombreE, nif);
    }

    public static void Vigilar(Vigilante vigilante) {

        System.out.println("El vigilante esta vigilando");
    }

}
