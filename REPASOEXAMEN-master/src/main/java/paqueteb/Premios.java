/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.Random;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Fer
 */
public class Premios {

    private SortedMap<String, Double> lista;

    public Premios() {

        this.lista = new TreeMap<>();

        for (int i = 0; i < 1000; i++) {

            lista.put(new Numeros().getLoteriaNumero(), new GenerarPremios().numeroAleatorio());
        }

    }

    public SortedMap<String, Double> getLista() {
        return lista;
    }

    public Double consultarPremio(String key) {

        return lista.get(key);
    }

    public void verNumeros() {

        for (String key : lista.keySet()) {
            System.out.printf("Numero: %s Premiado con: %s€ %n ", key, lista.get(key));
        }

    }

    public double numeroAleatorio() {

        Random numeroAleatorio = new Random();
        double nAleatorio = numeroAleatorio.nextInt(0, 100 + 1);

        return nAleatorio;
    }

}
