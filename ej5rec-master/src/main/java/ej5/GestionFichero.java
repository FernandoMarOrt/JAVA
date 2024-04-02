/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fer
 */
public class GestionFichero {

    public static void main(String[] args) throws IOException {

        Personaje p = leerFicheroJson("starwars.json");

        System.out.println(p.toString());

        System.out.println("¿Quieres cambiar el color de pelo del personaje?");
        String cambiarPelo = teclado.nextLine();
        

        if (cambiarPelo.equalsIgnoreCase("si")) {

            System.out.println("¿Dime el color de pelo que le quieres poner a tu personaje");
            String colorPelo = teclado.nextLine();

            p.setHairColor(colorPelo);
        }
        
        

        System.out.println("¿Quieres cambiar el color de ojos del personaje?");
        String cambiarColorOjo = teclado.nextLine();
        

        if (cambiarColorOjo.equalsIgnoreCase("si")) {

            System.out.println("¿Dime el color de ojos que le quieres poner a tu personaje");
            String colorOjo = teclado.nextLine();

            p.setEyeColor(colorOjo);
        }
        
        
        
        
        generarArchivoJSON("personajeCambios.json", p);
        
        

    }

    public static Scanner teclado = new Scanner(System.in);

    public static Personaje leerFicheroJson(String nomFichero) throws IOException {

        Personaje p;

        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());

        p = mapeador.readValue(new File(nomFichero), Personaje.class);

        return p;
    }
    
      public static void generarArchivoJSON(String nomFichero, Personaje p) throws IOException {

        ObjectMapper mapeador = new ObjectMapper();

        mapeador.registerModule(new JavaTimeModule());

        //Formato del Json
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        mapeador.writeValue(new File(nomFichero), p);

    }

}
