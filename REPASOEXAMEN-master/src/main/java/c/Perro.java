/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c;

/**
 *
 * @author Fer
 */
public class Perro extends Animal {

    private int anios;

    public Perro(int anios, int numeroPatas, String nombre) {
        super(numeroPatas, nombre);
        this.anios = anios;
    }

    @Override
    public void saltar() {

        System.out.println("El perro salta hacia delante");

    }

    public void ladrar() {

        System.out.println(" el perro con " + anios + " te esta ladrando");

    }

    @Override
    public String toString() {
        return "Perro{" + "anios=" + anios +  " nombre=" + super.nombre +  '}';
    }

    @Override
    public int compareTo(Animal a) {
        
        return super.nombre.compareToIgnoreCase(a.nombre);
        
    }

}
