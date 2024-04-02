/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tc6fer;

/**
 *
 * @author fer
 */
final public class LibroDigital extends Libro implements SeDescarga {
    
    private double numKBytes;

    public LibroDigital(double numKBytes, String isbn, String codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numKBytes = numKBytes;
    }

    public double getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(double numKBytes) {
        this.numKBytes = numKBytes;
    }

     @Override
    public String toString() {
        return super.toString() + "numKBytes=" + numKBytes + '}';
    }

    @Override
    public void descargar() {
        
        System.out.println("http://fernando.daw/" + LibroDigital.this.hashCode());
    }

    @Override
    public void tirarLibro() {
        System.out.println("Tira el libro a la papelera virtual");
    }
    
    
    
}
