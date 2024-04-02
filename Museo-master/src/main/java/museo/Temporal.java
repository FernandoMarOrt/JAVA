/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Fer
 */
final public class Temporal extends Sala {

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Temporal(LocalDate fechaInicio, LocalDate fechaFin, String nombre, int codigoSala, List<Obra> listadoObras, Sensor sensorTemperatura, Sensor sensorHumedad) {
        super(nombre, codigoSala, listadoObras, sensorTemperatura, sensorHumedad);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Temporal{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }

}
