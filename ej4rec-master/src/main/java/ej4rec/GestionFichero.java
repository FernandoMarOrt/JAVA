/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4rec;

import com.fasterxml.jackson.databind.ObjectMapper;
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

        int opcion;
        List<Elefante> listaElefantes;

        System.out.println("Dime que fichero de los siguientes quieres leer");
        listarDirectorio("json/");
        String casoALeer = teclado.nextLine();
        CasoPrueba caso = leerFicheroJson("json/" + casoALeer + ".json");

        do {

            menu();
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1 ->
                    System.out.println("Peso soportado en el archivo: " + casoALeer + ": " + caso.getPeso());

                case 2 -> {
                    listaElefantes = caso.getElefantes();
                    volverPositivos(listaElefantes);
                    listaElefantes.forEach(System.out::println);
                }

                case 3 -> {
                    listaElefantes = caso.getElefantes();
                    volverPositivos(listaElefantes);
                    columpiar(listaElefantes, caso);
                }

            }

        } while (opcion != 4);

    }

    public static void menu() {

        System.out.println("Dime una opcion");

        String menu = """
                      
                        1.Peso que soporta la tela
                        2.Lista de elefantes, con su nombre y peso. Si algún elefante tiene peso negativo, se considera peso positivo.
                        3.Nombres de los elefantes que se pudieron columpiar antes de que se rompiera la tela, suponiendo el orden de llegada el mismo que el que tiene el fichero. En caso de que no se pueda columpiar ninguno, se mostrará "Ninguno".
                        4.Salir
                      
                      """;

        System.out.println(menu);

    }

    public static List<Elefante> volverPositivos(List<Elefante> lista) {
        for (int i = 0; i < lista.size(); i++) {

            int valor = lista.get(i).getPeso();

            if (valor < 0) {
                lista.get(i).setPeso(Math.abs(valor));
            }
        }
        return lista;
    }

    public static void columpiar(List<Elefante> listaElefantes, CasoPrueba caso) {

        int contador = 0;
        int totalPeso = 0;

        for (Elefante e : listaElefantes) {

            totalPeso += e.getPeso();

            if (totalPeso > caso.getPeso()) {

                break;

            } else {
                contador++;

                if (contador > 0) {

                    System.out.println(e.getNombre());
                }
            }

        }

        if (contador == 0) {
            System.out.println("Ninguno");
        }

    }

    public static Scanner teclado = new Scanner(System.in);

    public static CasoPrueba leerFicheroJson(String nomFichero) throws IOException {

        CasoPrueba caso;

        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());

        caso = mapeador.readValue(new File(nomFichero), CasoPrueba.class);

        return caso;
    }

    public static void listarDirectorio(String ruta) {

        File f = new File(ruta);
        if (f.exists()) {
            // Obtiene los ficheros y directorios dentro de f y los 
            // devuelve en un array
            File[] ficheros = f.listFiles();
            for (File file2 : ficheros) {

                System.out.println(file2.getName());
            }
        } else {
            System.out.println("El directorio a listar no existe");
        }
    }

}
