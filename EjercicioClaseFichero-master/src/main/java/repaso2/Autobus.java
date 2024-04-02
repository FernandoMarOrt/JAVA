/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 *
 * @author fer
 */
public class Autobus {
    
    
    private String codigo;
    private String origen;
    private String destino;
    private List<String> Horasllegada;

    public Autobus(String codigo, String origen, String destino, List<String> Horasllegada) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.Horasllegada = Horasllegada;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public List<String> getHorasllegada() {
        return Horasllegada;
    }

    public void setHorasllegada(List<String> Horasllegada) {
        this.Horasllegada = Horasllegada;
    }

    @Override
    public String toString() {
        return codigo + "," + origen + "," + destino + "," + Horasllegada;
    }
    
    
}
