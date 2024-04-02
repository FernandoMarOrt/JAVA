/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5C;

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
    
    //Devolver una lista con todos Alquileres de un vehiculo, usando su nif.
    public ArrayList<Alquiler> devolverAlquilerNif (String nif) {

        //Devuelvo la nueva lista del metodo creado en catalogo alquileres
        return this.CatalagoA.obtenerAlquilerC(nif);

    }
    
    //Devolver una lista con todos Alquileres de un vehiculo, usando su bastidor.
    public ArrayList devolverAlquilerBastidor(String bastidor) {

        //Devuelvo la nueva lista del metodo creado en catalogo alquileres
        return this.CatalagoA.obtenerAlquilerV(bastidor);

    }

    
    //Borrar un alquiler por id.
    public void borrarAlquilerID(int AlquilerID) {
        
         

        //Borro el alquiler por id 
        this.CatalagoA.lista.remove(this.CatalagoA.buscarAlquiler(AlquilerID));
    }

    
    
    
    //Borrar un cliente del catálogo, si no tiene alquileres grabados.
    public void borrarClienteSinAlq(String nif) {

        //Añado en la clase CatalogoAlquileres un metodo para buscar un cliente
        //Y lo uso aqui
        boolean ClienteTieneAlquiler = this.CatalagoA.ClienteTieneAlquiler(nif);

        if (!ClienteTieneAlquiler) {

            this.CatalogoC.getLista().remove(buscarCliente2(nif));

        }

    }
    
    
    
    

    //Borrar un vehículo del catálogo, si no tiene alquileres grabados.
    public void borrarVehiculoSinAlq(String bastidor) {
        
        //Añado en la clase CatalogoAlquileres un metodo para buscar un vehiculo
        //Y lo uso aqui 
        boolean VehiculoTieneAlquiler = this.CatalagoA.VehiculoTieneAlquiler(bastidor);

        if (!VehiculoTieneAlquiler) {

            this.CatalogoV.getLista().remove(buscarVehiculo2(bastidor));

        }

    }
    
    //Obtener la lista de vehículos que deben ser devueltos en una fecha dada.
    
    public ArrayList devolverVehiculosFecha (LocalDate fecha){
        
        ArrayList<Vehiculo> devolverVehiculosFecha = new ArrayList();
        
        //Recorro la lista de alquileres y si hay una fecha en ella 
        //de un vehiculo igual a la que pasamos añado ese vehiculo asociado
        //al alquiler a la nueva lista creada
        for (Alquiler alq1 : this.CatalagoA.lista) {
            
            //le sumo los dias a la fecha y el resultado lo comparo con al fecha dada para ver su si son iguales
            if(alq1.getFechaINicio().plusDays(alq1.getDuracionDias()).equals(fecha)) {
                
                devolverVehiculosFecha.add(alq1.getVehiculo()); //Si son iguales las fecha las añado a la lista creada
                
            }
            
        }
        
        //Devuelvo la nueva lista
        return devolverVehiculosFecha;
    }
}
