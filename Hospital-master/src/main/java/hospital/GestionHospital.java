/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Fer
 */
public class GestionHospital {

    private Hospital hospital;

    public GestionHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public static void main(String[] args) {

        List<Empleado> listaEmpleados = new ArrayList();
        List<Paciente> listaPacientes = new ArrayList();

        Hospital hospital01 = new Hospital("Hospital01", "Calle ceuta 23", 100, listaEmpleados, listaPacientes);

        //Contrato 5 empleados
        hospital01.contratarEmpleado(crearMedico());
        hospital01.contratarEmpleado(crearMedico());

        hospital01.contratarEmpleado(crearAdministrativo());
        hospital01.contratarEmpleado(crearAdministrativo());
        hospital01.contratarEmpleado(crearAdministrativo());

        System.out.println("Imprimo la lista de los empleados");
        System.out.println("");
        listaEmpleados.forEach(System.out::println);

        //Ingreso a 5 pacientes 
        hospital01.ingresarPaciente(crearPaciente());
        hospital01.ingresarPaciente(crearPaciente());
        hospital01.ingresarPaciente(crearPaciente());
        hospital01.ingresarPaciente(crearPaciente());
        hospital01.ingresarPaciente(crearPaciente());

        System.out.println("");
        System.out.println("Imprimo la lista de los empleados");
        System.out.println("");
        listaPacientes.forEach(System.out::println);

        System.out.println("");
        Medico medico1 = crearMedico();
        Paciente paciente1 = crearPaciente();

        medico1.tratar(paciente1, "Pancetamol");

        System.out.println("");
        for (Empleado e : listaEmpleados) { //Conversion explicita

            if (e instanceof Medico) {

                Medico medico = (Medico) e;

                System.out.println("El irpf del administrativo es " + String.format("%.2f", medico.calcularIRPF()));

            } else if (e instanceof Administrativo) {

                Administrativo administrativo = (Administrativo) e;

                System.out.println("El irpf del administrativo es " + String.format("%.2f", administrativo.calcularIRPF()));

            }

        }
        

        System.out.println("");
        System.out.println("Dni sin renovar " + paciente1.getNif().getFechaCaducidad());
        System.out.println("");
        paciente1.renovarNIF(LocalDate.now());

        System.out.println("Dni renovado " + paciente1.getNif().getFechaCaducidad());

    }

    public static Administrativo crearAdministrativo() {

        Random numeroRandom = new Random();

        Nif nif = new Nif();
        String nombre = RandomStringUtils.randomAlphabetic(5);
        String apellido = RandomStringUtils.randomAlphabetic(8);
        double salario = numeroRandom.nextInt(1000, 3001);
        String numeroSeguridadSocial = RandomStringUtils.randomNumeric(9);

        return new Administrativo(Grupo.getAleatorio(), numeroSeguridadSocial, salario, nombre, apellido, nif);

    }

    public static Medico crearMedico() {

        Random numeroRandom = new Random();

        Nif nif = new Nif();
        String nombre = RandomStringUtils.randomAlphabetic(5);
        String apellido = RandomStringUtils.randomAlphabetic(8);
        double salario = numeroRandom.nextInt(1000, 3001);
        String numeroSeguridadSocial = RandomStringUtils.randomNumeric(9);

        String[] especialidades = {"cirugia", "pediatria", "neumologia", "ginecologia"};
        String especialidad = especialidades[numeroRandom.nextInt(0, especialidades.length)];

        return new Medico(especialidad, numeroSeguridadSocial, salario, nombre, apellido, nif);

    }

    public static Paciente crearPaciente() {

        Nif nif = new Nif();
        String nombre = RandomStringUtils.randomAlphabetic(5);
        String apellido = RandomStringUtils.randomAlphabetic(8);

        return new Paciente(nombre, apellido, nif);

    }

}
