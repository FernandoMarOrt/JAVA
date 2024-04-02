/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejrec2Fernando;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fer
 */
public class GestionFichero {

    public static void main(String[] args) {

        List<FichaDomino> listaFicha = generarListaFichero("domino.txt", "-");

        System.out.println("Lista de fichas sin repetir:"); 
        
        listaFicha.forEach(System.out::println);

        System.out.println("Domino completo:");

        List<FichaDomino> listaCompleta = FichaDomino.generarDominoCompleto();

        listaCompleta.forEach(System.out::println);

        generarFicheroTxT("dominoCompleto.txt", listaCompleta);

    }

    public static List<FichaDomino> generarListaFichero(String nomFichero, String separador) {
        List<FichaDomino> listaFicha = new ArrayList<>();
        List<FichaDomino> listaFicha2 = new ArrayList<>();

        String idFichero = nomFichero;
        String[] tokens;
        String linea = "";

        FichaDomino f = null;

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine(); // Guarda la línea completa en un String

                linea = linea.replaceAll(" ", "");

                if (!linea.isEmpty()) { // Ignorar líneas vacías

                    tokens = linea.split(separador); // Se guarda cada elemento en función del separador

                    int valor1 = Integer.parseInt(tokens[0]);
                    int valor2 = Integer.parseInt(tokens[1]);

                    f = new FichaDomino(valor1, valor2);

                    if (valor1 > 6 || valor2 > 6) {

                    } else {

                        listaFicha.add(f);

                    }

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        listaFicha2 = listaFicha;

        Iterator<FichaDomino> iterator = listaFicha.iterator();
        while (iterator.hasNext()) {

            FichaDomino ficha = iterator.next();

            int contadorRepeticiones = 0;

            for (FichaDomino ficha2 : listaFicha2) {

                if (ficha.getNumero1() == ficha.getNumero2()) {

                } else {

                    if (ficha.getNumero1() == ficha2.getNumero2() && ficha.getNumero2() == ficha2.getNumero1()) {

                        contadorRepeticiones++;

                        if (contadorRepeticiones > 0) {

                            iterator.remove(); // Elimino la ficha duplicada utilizando el iterador

                            break; // Salgo del bucle for si se elimina una ficha
                        }
                    }
                }
            }
        }

        return listaFicha;
    }

    public static void generarFicheroTxT(String nomFichero, List<FichaDomino> listaCompleta) {

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(nomFichero))) {

            for (FichaDomino f : listaCompleta) {

                flujo.write(f.getNumero1() + " - " + f.getNumero2());
                flujo.newLine();

            }

            flujo.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
