/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos2;

import java.time.LocalDate;

/**
 *
 * @author fer
 */
public class Alquiler {
    
    private int alquilerID;
    private Clientes clientes;
    private Vehiculo vehiculo;
    private LocalDate fechaINicio;
    private int duracionDias;
    
    private static int contador = 0;

    public Alquiler(Clientes clientes, Vehiculo vehiculo, LocalDate fechaINicio, int duracionDias) {
        this.clientes = clientes;
        this.vehiculo = vehiculo;
        this.fechaINicio = fechaINicio;
        this.duracionDias = duracionDias;
        contador++;
        this.alquilerID = contador;
    }

    public void setAlquilerID(int id) {
        this.alquilerID = id;
    }
    
    public Alquiler(){
        
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaINicio() {
        return fechaINicio;
    }

    public void setFechaINicio(LocalDate fechaINicio) {
        this.fechaINicio = fechaINicio;
    }

    public int getAlquilerID() {
        return alquilerID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alquiler{");
        sb.append("alquilerID=").append(alquilerID);
        sb.append(", clientes=").append(clientes.getNif()); //Le digo que del cliente me de solo el dni
        sb.append(", vehiculo=").append(vehiculo.getBastidor()); //Le digo que del vehiculo me de solo el bastidor
        sb.append(", fechaINicio=").append(fechaINicio);
        sb.append(", duracionDias=").append(duracionDias);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.alquilerID;
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
        final Alquiler other = (Alquiler) obj;
        return this.alquilerID == other.alquilerID;
    }
    
    

    
    
}
