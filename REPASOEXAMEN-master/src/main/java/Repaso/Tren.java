/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso;

/**
 *
 * @author Fer
 */
public class Tren {
    
    private int id;
    private int numeroVagones;
    private int numeroPasajeros;

    public Tren(int id, int numeroVagones, int numeroPasajeros) {
        this.id = id;
        this.numeroVagones = numeroVagones;
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroVagones() {
        return numeroVagones;
    }

    public void setNumeroVagones(int numeroVagones) {
        this.numeroVagones = numeroVagones;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tren other = (Tren) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Tren{" + "id=" + id + ", numeroVagones=" + numeroVagones + ", numeroPasajeros=" + numeroPasajeros + '}';
    }
    
    
    
    
}
