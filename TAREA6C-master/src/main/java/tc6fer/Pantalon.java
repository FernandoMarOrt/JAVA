/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tc6fer;

/**
 *
 * @author fer
 */
final public class Pantalon extends Ropa {

    private String talla;

    public Pantalon(String talla, String marca, String codigo, double precio, double iva, String descripcion) {
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return super.toString() + " talla=" + talla + '}';
    }

    @Override
    public void enviar(String direccion) {

        System.out.println("Direccion de envio: " + direccion + " y la informacion de la ropa es: " + super.toString());

    }

}
