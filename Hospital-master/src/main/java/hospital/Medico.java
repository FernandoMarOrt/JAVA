/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author fer
 */
public class Medico extends Empleado implements Nadador {

    private String especialidad;

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellido, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellido, nif);
        this.especialidad = especialidad;
    }

    

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    

    @Override
    public double calcularIRPF() {

        double irpf = 0;

        if (especialidad.equalsIgnoreCase("cirugia")) {

            irpf = this.getSalario() * 0.25;

        } else {

            irpf = this.getSalario() * 0.235;
        }

        return irpf;

    }

    public void tratar(Paciente paciente, String medicina) {

        System.out.println("El medico " + Medico.this.nombre + " trata a " + paciente.nombre + " con la medicina " + medicina);

    }

    @Override
    public void nadar() {
        System.out.println("El medico esta nadando");
    }

    @Override
    public String toString() {
        return "Medico{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + ", numeroSeguridadSocial=" + numeroSeguridadSocial + ", salario=" + salario + ", especialidad=" + especialidad + '}';
        
    }

}
