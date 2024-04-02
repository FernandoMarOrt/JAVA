/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Fer
 */
public class Traductor {

    private SortedMap<String, String> diccionario;

    public Traductor() {
        this.diccionario = new TreeMap<>();
    }

    public SortedMap<String, String> getTraduccion() {
        return diccionario;
    }

    public void setTraduccion(SortedMap<String, String> traduccion) {
        this.diccionario = traduccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Traductor{");
        sb.append("diccionario=").append(diccionario);
        sb.append('}');
        return sb.toString();
    }
    
    
    

    public void imprimirPalabras() {

        for (String key : diccionario.keySet()) {
            System.out.printf("%s --> %s %n", key, diccionario.get(key));
        }

    }

    public void entradaGuardar(String palabraEX, String palabraES) {

        this.diccionario.put(palabraEX, palabraES);

    }

    public void entradaBorrar(String palabraEX) {

        this.diccionario.remove(palabraEX);
    }

    public void entradaModificar(String palabraEX, String palabraESOld, String palabraESNew) {

        this.diccionario.replace(palabraEX, palabraESOld, palabraESNew);

    }

    public void palabrasEX() {

        List<String> palabrasEX = new ArrayList<>(this.diccionario.keySet());
        
        System.out.println(palabrasEX);
    }

    public void palabrasES() {
        List<String> palabrasES = new ArrayList<>(this.diccionario.values());

        System.out.println(palabrasES);
    }

    public void traducirPalabra(String palabraEX) {

        System.out.println("La traduccion de " + palabraEX + " es " + diccionario.get(palabraEX));

    }

}
