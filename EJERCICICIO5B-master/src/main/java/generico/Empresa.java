/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generico;

import rentacarlista.*;
import java.time.LocalDate;
import java.util.ArrayList;
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
    private CatalogoVehiculos CatalogoV;

    public Empresa() {
        this.cif = RandomStringUtils.randomAlphabetic(1) + RandomStringUtils.randomNumeric(7) + RandomStringUtils.randomAlphabetic(1);
        this.nombre = RandomStringUtils.randomAlphabetic(5);
        this.CatalagoA = new CatalogoAlquileres(0);
        this.CatalogoC = new CatalogoClientes(0);
        this.CatalogoV = new CatalogoVehiculos(0);
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
        return CatalogoV;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa{" + "cif=" + cif + ", nombre=" + nombre + "\n" + ", CatalagoA=" + CatalagoA + "\n" + ", CatalogoC=" + CatalogoC + ", VehiculoV=" + CatalogoV + '}';
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
        this.CatalogoC.añadirElemento(c);
    }

    public void buscarCliente(Clientes c) {
        this.CatalogoC.buscarCliente(c.getNif());
    }

    public Clientes buscarCliente2(String nif) {

        return this.CatalogoC.buscarCliente(nif);
    }

    public Vehiculo buscarVehiculo2(String bastidor) {

        return this.CatalogoV.buscarVehiculo(bastidor);
    }

    public void buscarAlquiler(Alquiler a) {
        this.CatalagoA.buscarElemento(a);//Poner el id de alquiler

    }

    public void registrarVehiculo(Vehiculo v) {
        this.CatalogoV.añadirElemento(v);
    }

    public void registrarAlquiler(Alquiler a) {
        this.CatalagoA.añadirElemento(a);
    }

    public void buscarVehiculo(Vehiculo v) {
        this.CatalogoV.buscarVehiculo(v.getBastidor());
    }

    //METODO QUE BUSCAR UN VEHICULO Y SI EXISTE EL CLIENTE 
    public void alquilarVehiculo(Vehiculo v, Clientes c, LocalDate fecha, int dias) {

        if (this.CatalogoV.buscarVehiculo(v.getBastidor()) != null && this.CatalogoC.buscarCliente(c.getNif()) != null && v.isDisponible() != true) {

            Alquiler alqui1 = new Alquiler(c, v, fecha, dias);

            v.setDisponible(true);

            this.CatalagoA.añadirElemento(alqui1);

        }

    }

    public void recibirAlquiler(Alquiler a) {

        if (this.CatalagoA.buscarAlquiler(a.getAlquilerID()) != null) {

            a.getVehiculo().setDisponible(false);

        }

    }

    //FUNCIONALIDADES EXTRA EJERCICIO 5C RENTACAR CON LISTAS 
    //Devolver una lista con todos Alquileres de un cliente, usando su NIF.
    public ArrayList devolverAlqClienteNif(String nif) {

        //Creo una nueva lista para almacenar los alquileres correspondientes
        ArrayList<Alquiler> alquileresNifC = new ArrayList();

        //Recorro el catalogo de los clientes
        for (int i = 0; i < this.CatalogoC.getLista().size(); i++) {

            //Si en el catalogo alquiler hay un dni igual que en el de catalogo clientes
            //se añadira a la nueva lista creada mas arriba 
            if (this.CatalagoA.lista.equals(this.CatalogoC.buscarCliente(nif))) {

                alquileresNifC.add(CatalagoA.getLista().get(i));
            }

        }

        //Devuelvo la nueva lista
        return alquileresNifC;

    }

    //Devolver una lista con todos Alquileres de un vehiculo, usando su bastidor.
    public ArrayList devolverAlqVehiculoNif(String bastidor) {

        //Creo una nueva lista para almacenar los alquileres correspondientes
        ArrayList<Alquiler> alquileresNifV = new ArrayList();

        //Recorro el catalogo de los vehiculos
        for (int i = 0; i < this.CatalogoV.getLista().size(); i++) {

            //Si en el catalogo alquiler hay un bastidor igual que en el de catalogo vehiculo
            //se añadira a la nueva lista creada mas arriba 
            if (this.CatalagoA.lista.equals(this.CatalogoV.buscarVehiculo(bastidor))) {

                alquileresNifV.add(CatalagoA.getLista().get(i));
            }

        }

        //Devuelvo la nueva lista
        return alquileresNifV;

    }

    //Borrar un alquiler por id.
    public void borrarAlquilerID(int AlquilerID) {

        this.CatalagoA.getLista().remove(AlquilerID);
    }

    //Borrar un cliente del catálogo, si no tiene alquileres grabados.
    public void borrarClienteSinAlq(Clientes c) {

        //Añado en la clase CatalogoAlquileres un metodo para buscar un cliente
        //Y lo uso aqui
        boolean ClienteTieneAlquiler = this.CatalagoA.ClienteTieneAlquiler(c.getNif());

        if (!ClienteTieneAlquiler) {

            this.CatalogoC.getLista().remove(c);

        }

    }

    //Borrar un vehículo del catálogo, si no tiene alquileres grabados.
    public void borrarVehiculoSinAlq(Vehiculo v) {
        
        //Añado en la clase CatalogoAlquileres un metodo para buscar un vehiculo
        //Y lo uso aqui , si 
        boolean VehiculoTieneAlquiler = this.CatalagoA.VehiculoTieneAlquiler(v.getBastidor());

        if (!VehiculoTieneAlquiler) {

            this.CatalogoV.getLista().remove(v);

        }

    }
    
    //Obtener la lista de vehículos que deben ser devueltos en una fecha dada.
    
    public ArrayList devolverVehiculos(LocalDate fecha){
        
        ArrayList<Vehiculo> devolverVehiculos = new ArrayList();
        
        //Recorro la lista de alquileres y si hay una fecha en ella 
        //de un vehiculo igual a la que pasamos añado ese vehiculo asociado
        //al alquiler a la nueva lista creada
        for (Alquiler alq1 : this.CatalagoA.lista) {
            
            if(alq1.getFechaINicio().equals(fecha)) {
                
                devolverVehiculos.add(alq1.getVehiculo());
                
            }
            
        }
        
        //Devuelvo la nueva lista
        return devolverVehiculos;
    }
}
