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
public class Museo {

    private String nombre;
    private String direccion;
    private List<Empleado> listaEmpleados;
    private List<Sala> listaSalas;

    public Museo(String nombre, String direccion, List<Empleado> listaEmpleados, List<Sala> listaSalas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaEmpleados = listaEmpleados;
        this.listaSalas = listaSalas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Sala> getListaSalas() {
        return listaSalas;
    }

    public void setListaSalas(List<Sala> listaSalas) {
        this.listaSalas = listaSalas;
    }

   
    
    public void contratarEmpleado(Empleado emp) {
        
        this.listaEmpleados.add(emp);
        
    }
    
    public void despedirEmpleado(Empleado emp) {
        
        this.listaEmpleados.remove(emp);
        
    }
    
    
    public void añadirSala(Sala sala) {
        
        this.listaSalas.add(sala);
        
    }
    
    public void quitarSala(Sala sala) {
        
        this.listaSalas.remove(sala);
        
    }
    
    
    

}
