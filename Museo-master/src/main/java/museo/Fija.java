/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.List;

/**
 *
 * @author Fer
 */
final public class Fija extends Sala {

    private String estado;

    public Fija(String estado, String nombre, int codigoSala, List<Obra> listadoObras, Sensor sensorTemperatura, Sensor sensorHumedad) {
        super(nombre, codigoSala, listadoObras, sensorTemperatura, sensorHumedad);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Fija{" + "estado=" + estado + '}';
    }

    

}
