/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejrec2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author fer
 */
public class GestionFichero {

    public static void main(String[] args) {

        List<FichaDomino> listaFicha = generarListaFichero("domino.txt", "-");

        listaFicha.forEach(System.out::println);

    }

//    public static List<FichaDomino> generarListaFichero(String nomFichero, String separador) {
//        List<FichaDomino> listaFicha = new ArrayList<>();
//        List<FichaDomino> listaFicha2 = new ArrayList<>();
//
//        String idFichero = nomFichero;
//        String[] tokens;
//        String linea = "";
//
//        FichaDomino f = null;
//
//        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
//            while (datosFichero.hasNextLine()) {
//
//                linea = datosFichero.nextLine(); // Guarda la línea completa en un String
//
//                linea = linea.replaceAll(" ", "");
//
//                if (!linea.isEmpty()) { // Ignorar líneas vacías
//
//                    tokens = linea.split(separador); // Se guarda cada elemento en función del separador
//
//                    int valor1 = Integer.parseInt(tokens[0]);
//                    int valor2 = Integer.parseInt(tokens[1]);
//
//                    f = new FichaDomino(valor1, valor2);
//
//                    if (valor1 > 6 || valor2 > 6) {
//
//                    } else {
//
//                        listaFicha.add(f);
//                        listaFicha2.add(f);
//                        
//
//                    }
//
//                }
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//
//        for (int i = 0; i < listaFicha.size(); i++) {
//        if (listaFicha.get(i).equals(listaFicha2.get(i))) {
//            
//            listaFicha.remove(i);
//            
//        }
//    }
//
//        return listaFicha;
//    }
    public static List<FichaDomino> generarListaFichero(String nomFichero, String separador) {
        List<FichaDomino> listaFicha = new ArrayList<>();
        Set<FichaDomino> fichasSet = new HashSet<>();

        String idFichero = nomFichero;
        String[] tokens;
        String linea = "";

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                linea = linea.replaceAll(" ", "");

                if (!linea.isEmpty()) {
                    tokens = linea.split(separador);

                    int valor1 = Integer.parseInt(tokens[0]);
                    int valor2 = Integer.parseInt(tokens[1]);

                    FichaDomino f = new FichaDomino(valor1, valor2);

                    if (valor1 <= 6 && valor2 <= 6) {
                        fichasSet.add(f);
                        fichasSet.add(new FichaDomino(valor2, valor1)); // Agregar ficha con valores invertidos
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        listaFicha.addAll(fichasSet);
        return listaFicha;
    }
}

