/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Fer
 */
public abstract class Conservador extends Empleado implements Restauradores {

    private int id;

    public Conservador(int id, String nombreE, String nif) {
        super(nombreE, nif);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Conservador{" + "id=" + id + '}';
    }

}
