/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c;

import java.util.Objects;

/**
 *
 * @author Fer
 */
public abstract class Animal implements Comparable<Animal>{
    
    protected int numeroPatas;
    
    protected String nombre;

    public Animal(int numeroPatas, String nombre) {
        this.numeroPatas = numeroPatas;
        this.nombre = nombre;
    }

    
    public abstract void saltar();//Metodo abstracto

    public int getNumeroPatas() {
        
        return numeroPatas;
        
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + ", nombre=" + nombre + '}';
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
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
        final Animal other = (Animal) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

   
    
  

    
    
    
    
}
