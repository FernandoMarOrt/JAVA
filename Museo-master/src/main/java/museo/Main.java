/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Fer
 */
public class Main {

    public static void main(String[] args) {

        List<Empleado> listaEmpleados = new ArrayList<>();
        List<Sala> listaSalas = new ArrayList<>();

        Museo museo = new Museo("Museo1", "Direccion Inventada", listaEmpleados, listaSalas);

        Obra obra1 = new Pintura("Pintura1", 1, "AutorPintura");
        Obra obra2 = new Escultura("Escultura2", 2, "AutorEscultura");

        List<Obra> listaObras1 = new ArrayList<>();
        List<Obra> listaObras2 = new ArrayList<>();

        listaObras1.add(obra1);
        listaObras2.add(obra2);

        Sensor sensorTemperatura = new Temperatura(1);
        Sensor sensorHumedad = new Humedad(2);

        Sala sala1 = new Fija("Buena", "Sala1", 1, listaObras1, sensorTemperatura, sensorHumedad);//Sala con obra de pintura
        Sala sala2 = new Fija("Buena", "Sala2", 2, listaObras2, sensorTemperatura, sensorHumedad);//Sala con obra de escultura

        museo.añadirSala(sala1);
        museo.añadirSala(sala2);

        Set<Obra> museoObras = new HashSet<>();

        museoObras.add(obra1);
        museoObras.add(obra2);

        Empleado empleado1 = new Escultorico(1, "Escultorico", "12345678A");
        Empleado empleado2 = new Pictoricos(2, "Pictorico", "12345678B");

        museo.contratarEmpleado(empleado1);
        museo.contratarEmpleado(empleado2);

        System.out.println("Obra que es de pintura");
        ((Pictoricos) empleado2).restaurarObra(obra1);

        System.out.println("");
        System.out.println("Obra que es de escultura");
        ((Pictoricos) empleado2).restaurarObra(obra2);
    }

}
