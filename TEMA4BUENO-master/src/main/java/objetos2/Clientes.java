/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos2;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Fer
 */
public class Clientes {

    private NombresClientes nombre;
    private ApellidosClientes apellido;
    private String nif;
    private static int contador = 0;
    
    private String nombre2;
    private String apellido2;
    private String nif2;

    public Clientes() {
        
        this.nombre = NombresClientes.getAleatorio();
        this.apellido = ApellidosClientes.getAleatorio();
        contador++;
        this.nif = String.valueOf(contador);
//        this.nif = RandomStringUtils.randomNumeric(8) + RandomStringUtils.randomAlphabetic(1);
        
    }

    public Clientes(String nombre2, String apellido2, String nif2) {
        this.nombre2 = nombre2;
        this.apellido2 = apellido2;
        this.nif2 = nif2;
    }

   
    
    
    


    public NombresClientes getNombre() {
        return nombre;
    }

    public void setNombre(NombresClientes nombre) {
        this.nombre = nombre;
    }

    public ApellidosClientes getApellido() {
        return apellido;
    }

    public void setApellido(ApellidosClientes apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nif);
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
        final Clientes other = (Clientes) obj;
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + '}';
    }
    
    
    
    

}
