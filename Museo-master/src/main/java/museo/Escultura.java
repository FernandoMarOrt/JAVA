/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Fer
 */
public class Escultura extends Obra {

    private String nombre;

    public Escultura(String nombre, int id, String autor) {
        super(id, autor);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estatua{" + "nombre=" + nombre + '}';
    }

    @Override
    public void comentarios() {
        System.out.println("Comentarios de la estatua");
    }

}
