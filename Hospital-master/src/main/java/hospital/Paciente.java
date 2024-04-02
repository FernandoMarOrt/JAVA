/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.Random;

/**
 *
 * @author fer
 */
public class Paciente extends Persona implements Nadador {

    public Paciente(String nombre, String apellido, Nif nif) {
        super(nombre, apellido, nif);
    }

    public void tomarMedicina(String medicina) {

        Random random = new Random();
        double nAleatorio = random.nextInt(0, 2);

        if (nAleatorio == 1) {

            System.out.println("El paciente se ha tomada la medicina " + medicina + " y se ha curado");

        } else {

            System.out.println("El paciente se ha tomada la medicina " + medicina + " y no se ha curado");

        }

    }

    @Override
    public void nadar() {
        System.out.println("El paciente esta nadando");
    }

    @Override
    public String toString() {

        return "Paciente{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + '}';

    }

}
