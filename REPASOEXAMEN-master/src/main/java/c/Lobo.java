/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c;

/**
 *
 * @author Fer
 */
public class Lobo extends Animal {

    private int crias;

    public Lobo(int crias, int numeroPatas, String nombre) {
        super(numeroPatas, nombre);
        this.crias = crias;
    }

    public void numeroCrias() {

        System.out.println("El lobo tiene " + crias + " crias");
    }

    @Override
    public void saltar() {

        System.out.println("El lobo salta hacia atras");

    }

    @Override
    public String toString() {
        return "Lobo{" + "crias=" + crias + " nombre=" + super.nombre + '}';
    }

    @Override
    public int compareTo(Animal a) {

        return super.nombre.compareToIgnoreCase(a.nombre);

    }

}
