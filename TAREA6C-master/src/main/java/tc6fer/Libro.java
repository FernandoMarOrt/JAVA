/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tc6fer;

import java.util.Objects;

/**
 *
 * @author fer
 */
public abstract class Libro extends Producto implements Comparable<Libro> {
    
    private String isbn;

    public Libro(String isbn, String codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    final public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.isbn);
        return hash;
    }

    @Override
    final public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.isbn, other.isbn);
    }
    
    @Override
    public int compareTo(Libro l) {
        
        return this.isbn.compareToIgnoreCase(l.getIsbn());
        
    }
    
    public abstract void tirarLibro();

    @Override
    public String toString() {
        return super.toString() + " isbn=" + isbn + '}';
    }
    
    
    
}
