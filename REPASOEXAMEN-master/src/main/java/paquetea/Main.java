/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

/**
 *
 * @author Fer
 */
public class Main {

    public static void main(String[] args) {

        Traductor diccionario = new Traductor();

        //Guardo 10 entradas en mi diccionario
        diccionario.entradaGuardar("red", "rojo");
        diccionario.entradaGuardar("blue", "azul");
        diccionario.entradaGuardar("green", "verde");
        diccionario.entradaGuardar("yellow", "amarillo");
        diccionario.entradaGuardar("book", "libro");
        diccionario.entradaGuardar("hello", "hola");
        diccionario.entradaGuardar("bye", "adios");
        diccionario.entradaGuardar("chair", "silla");
        diccionario.entradaGuardar("table", "mesa");
        diccionario.entradaGuardar("pink", "rosa");

        //Las imprimo para comprobar si se han guardado bien
        diccionario.imprimirPalabras();

        //Imprimo las palabras en espaniol
        System.out.println("");
        System.out.println("Palabras en espaniol:");
        diccionario.palabrasES();

        //Imprimo las palabras extranjeras
        System.out.println("");
        System.out.println("Palabras extranjeras");
        diccionario.palabrasEX();

        //Borro una entrada
        diccionario.entradaBorrar("red");

        //Compruebo si se ha borrado
        System.out.println("");
        diccionario.imprimirPalabras();

        //Modifico una entrada
        diccionario.entradaModificar("blue", "azul", "modificada");

        //Compruebo si se ha modificado
        System.out.println("");
        diccionario.imprimirPalabras();
        
        //Veo la traduccion de yellow
        System.out.println("");
        diccionario.traducirPalabra("yellow");

    }

}
