/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author fer
 */
public class Administrativo extends Empleado {

    private Grupo grupo;

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellido, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellido, nif);
        this.grupo = grupo;
    }

    
    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void registrarDocumento(String nombreDoc) {

        System.out.println("El administrativo " + this.getNombre() + " " + this.getApellido() + " y registro el documento " + nombreDoc + " con hashcode " + nombreDoc.hashCode());

    }

    @Override
    public double calcularIRPF() {

        double irpf = 0;

        if (grupo == grupo.C) {

            irpf = (grupo.C.irpf / 100) * this.getSalario();

        } else if (grupo == grupo.D) {

            irpf = (grupo.D.irpf / 100) * this.getSalario();

        } else if (grupo == grupo.E) {

            irpf = (grupo.E.irpf / 100) * this.getSalario();

        }

        return irpf;

    }

    @Override
    public String toString() {
        return "Administrativo{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + ", numeroSeguridadSocial=" + numeroSeguridadSocial + ", salario=" + salario  + ", grupo=" + grupo + '}';
    }
    
    

}
