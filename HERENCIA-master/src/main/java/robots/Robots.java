/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package robots;

/**
 *
 * @author fer
 */
public record Robots(int numeroSerie, int vida) implements Comparable<Robots> {

    @Override
    public int compareTo(Robots o) {
        
        return Integer.compare(this.numeroSerie, o.numeroSerie);
    }

}
