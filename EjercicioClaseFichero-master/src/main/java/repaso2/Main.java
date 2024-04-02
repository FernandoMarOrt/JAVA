/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fer
 */
public class Main {

    /*pasar este fichero txt con este contenido "23S" "Estepona - Manilva" 07:10 12:15 18:00 a una lista de objetos autobuses*/
    public static void main(String[] args) {

        List<Autobus> listaAutobuses = generarListaFichero("autobuses.txt", " ");

        listaAutobuses.forEach(System.out::println);

    }

    public static List<Autobus> generarListaFichero(String nomFichero, String separador) {

        List<Autobus> listaAutobuses = new ArrayList<>();

        String codigo = "";
        String origen = "";
        String destino = "";
        List<String> Horasllegada = new ArrayList<>();

        String idFichero = nomFichero;
        String[] tokens;
        String linea;

        Autobus a = null;

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();// Guarda la línea completa en un String

                tokens = linea.split(separador); //Se guarda cada elemento en funcion de el separador

                for (int i = 0; i < tokens.length; i++) {

                    tokens[i] = tokens[i].replaceAll("-", "\""); //quito la -

                }

                codigo = tokens[0];
                origen = tokens[1];
                destino = tokens[3];

                Horasllegada.add(destino);

                a = new Autobus(codigo, origen, destino, Horasllegada);

                //Si contiene 0 (Deportivo)
                listaAutobuses.add(a);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return listaAutobuses;

    }
//    




}
