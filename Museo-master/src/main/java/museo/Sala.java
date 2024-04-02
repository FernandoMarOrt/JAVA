/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.List;

/**
 *
 * @author fer
 */
public abstract class Sala {

    private String nombre;
    private int codigoSala;
    private List<Obra> listadoObras;
    private Sensor sensorTemperatura;
    private Sensor sensorHumedad;

    public Sala(String nombre, int codigoSala, List<Obra> listadoObras, Sensor sensorTemperatura, Sensor sensorHumedad) {
        this.nombre = nombre;
        this.codigoSala = codigoSala;
        this.listadoObras = listadoObras;
        this.sensorTemperatura = sensorTemperatura;
        this.sensorHumedad = sensorHumedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(int codigoSala) {
        this.codigoSala = codigoSala;
    }

    public List<Obra> getListadoObras() {
        return listadoObras;
    }

    public void setListadoObras(List<Obra> listadoObras) {
        this.listadoObras = listadoObras;
    }

    public Sensor getSensorTemperatura() {
        return sensorTemperatura;
    }

    public void setSensorTemperatura(Sensor sensorTemperatura) {
        this.sensorTemperatura = sensorTemperatura;
    }

    public Sensor getSensorHumedad() {
        return sensorHumedad;
    }

    public void setSensorHumedad(Sensor sensorHumedad) {
        this.sensorHumedad = sensorHumedad;
    }

    @Override
    public String toString() {
        return "Sala{" + "nombre=" + nombre + ", codigoSala=" + codigoSala + ", listadoObras=" + listadoObras + ", sensorTemperatura=" + sensorTemperatura + ", sensorHumedad=" + sensorHumedad + '}';
    }
    
    

}
