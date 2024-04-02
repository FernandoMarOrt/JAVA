/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos2;

import java.time.LocalDate;
import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author fer
 */
public class Empresa {

    private String cif;
    private String nombre;

    private CatalogoAlquileres CatalagoA;
    private CatalogoClientes CatalogoC;
    private CatalogoVehiculos VehiculoV;

    public Empresa() {
        this.cif = RandomStringUtils.randomAlphabetic(1) + RandomStringUtils.randomNumeric(7) + RandomStringUtils.randomAlphabetic(1);
        this.nombre = RandomStringUtils.randomAlphabetic(5);
        this.CatalagoA = new CatalogoAlquileres(10);
        this.CatalogoC = new CatalogoClientes(10);
        this.VehiculoV = new CatalogoVehiculos(10);
    }

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public CatalogoAlquileres getCatalagoA() {
        return CatalagoA;
    }

    public CatalogoClientes getCatalogoC() {
        return CatalogoC;
    }

    public CatalogoVehiculos getVehiculoV() {
        return VehiculoV;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa{" + "cif=" + cif + ", nombre=" + nombre + "\n" + ", CatalagoA=" + CatalagoA + "\n" + ", CatalogoC=" + CatalogoC + ", VehiculoV=" + VehiculoV + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.cif);
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
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.cif, other.cif);
    }

    public void registrarCliente(Clientes c) {
        this.CatalogoC.añadirClientes(c);
    }

    public void buscarCliente(Clientes c) {
        this.CatalogoC.buscarCliente(c.getNif());
    }
    
    public void buscarAlquiler(Alquiler a) {
        this.CatalagoA.buscarAlquiler(a.getAlquilerID());
        
    }

    public void registrarVehiculo(Vehiculo v) {
        this.VehiculoV.añadirVehiculo(v);
    }

    public void buscarVehiculo(Vehiculo v) {
        this.VehiculoV.buscarVehiculo(v.getBastidor());
    }

    //METODO QUE BUSCAR UN VEHICULO Y SI EXISTE EL CLIENTE 
    public void alquilarVehiculo(Vehiculo v, Clientes c, LocalDate fecha, int dias) {

        if (this.VehiculoV.buscarVehiculo(v.getBastidor()) != null && this.CatalogoC.buscarCliente(c.getNif()) != null && v.isDisponible() != true) {

            Alquiler alqui1 = new Alquiler(c, v, fecha, dias);

            v.setDisponible(true);
            
            this.CatalagoA.añadirAlquiler(alqui1);

        }

    }
    
    
    public void recibirAlquiler(Alquiler a) {
        
        if (this.CatalagoA.buscarAlquiler(a.getAlquilerID()) != null) {
            
            a.getVehiculo().setDisponible(false);
            
        }

    }

    //Recibir vehiculo de un alquiler
    //Busca el alquiler en la lista y pone el vehiculo en la lista
}
