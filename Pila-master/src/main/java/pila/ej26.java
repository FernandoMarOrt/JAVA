/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author fer
 */
public class ej26 {

    public static void main(String[] args) {

        Pila<String> pilaString = new Pila(3);
        Pila<Cancion> pilaCancion = new Pila(5);

        //Creo 5 canciones para meterlas luego en la pila de canciones
        Cancion cancion1 = new Cancion("Nombre1", "Genero1", 1);
        Cancion cancion2 = new Cancion("Nombre2", "Genero2", 2);
        Cancion cancion3 = new Cancion("Nombre3", "Genero3", 3);
        Cancion cancion4 = new Cancion("Nombre4", "Genero4", 4);
        Cancion cancion5 = new Cancion("Nombre5", "Genero5", 5);
        Cancion cancionA = new Cancion("NombreA", "GeneroA", 6);
        Cancion cancionB = new Cancion("NombreB", "GeneroB", 7);
        Cancion cancionC = new Cancion("NombreC", "GeneroC", 8);

        //Apilo los elementos en ambas pilas
        //Pila String
        pilaString.pilaPush("String1");
        pilaString.pilaPush("String2");
        pilaString.pilaPush("String3");

        //Pila Canciones
        pilaCancion.pilaPush(cancion1);
        pilaCancion.pilaPush(cancion2);
        pilaCancion.pilaPush(cancion3);
        pilaCancion.pilaPush(cancion4);
        pilaCancion.pilaPush(cancion5);

        //Muestro el contenido de ambas pilas
        System.out.println("Pila String");

        pilaString.pilaMostrarElementos();

        System.out.println("");

        System.out.println("Pila Canciones");

        pilaCancion.pilaMostrarElementos();

        //Desapilo elementos
        System.out.println("");
        System.out.println("DESAPILANDO");
        pilaCancion.pilaPop();

        pilaString.pilaPop();

        System.out.println("Pila String");

        pilaString.pilaMostrarElementos();

        System.out.println("");

        System.out.println("Pila Canciones");

        pilaCancion.pilaMostrarElementos();

        //Saber si la pila esta vacia
        System.out.println("");

        System.out.println("SABER SI LAS PILAS ESTAN VACIAS");

        System.out.println("Esta vacia la pila de string " + pilaCancion.pilaVacia());

        System.out.println("Esta vacia la pila de canciones " + pilaString.pilaVacia());

        //Saber si la pìla esta llena
        System.out.println("");

        System.out.println("SABER SI LAS PILAS ESTAN LLENAS");

        pilaString.pilaPush("String3"); //AÑADO 1 ELEMENTO A LA PILA STRING PARA QUE DIGA QUE ESTA LLENA

        System.out.println("Esta llena la pila de canciones " + pilaCancion.pilaLlena());

        System.out.println("Esta llena la pila de string " + pilaString.pilaLlena());

        //Saber el numero de elementos de la pila
        System.out.println("");

        System.out.println("SABER EL NUMERO DE ELEMENTOS DE LAS PILAS");

        System.out.println("Cuantos elementos tiene la pila de canciones " + pilaCancion.pilaNElmentos());

        System.out.println("Cuantos elementos tiene la pila de string " + pilaString.pilaNElmentos());

        //Rellenar pila con elementos de array
        String[] arrayString = {"StringA", "StringB", "StringC"};
        Cancion[] arrayCancion = {cancionA, cancionB, cancionC};

        pilaCancion.rellenar(arrayCancion);

        pilaString.rellenar(arrayString);

        System.out.println("Pila String");

        pilaString.pilaMostrarElementos();

        System.out.println("");

        System.out.println("Pila Canciones");

        pilaCancion.pilaMostrarElementos();

        //SACAR ELEMENTOS DE LA PILA EN UN ARRAY DE OBJETOS
        Object[] arrayString2 = pilaString.sacarElementos();
        Object[] arrayCancion2 = pilaCancion.sacarElementos();

        System.out.println("Pila String");

        pilaString.pilaMostrarElementos();

        System.out.println("");

        System.out.println("Pila Canciones");

        pilaCancion.pilaMostrarElementos();

        System.out.println("Array String");
        System.out.println("");
        for (Object aux : arrayString2) {
            System.out.print(aux + " ");
        }

        System.out.println("Array Cancion");
        System.out.println("");
        for (Object aux : arrayCancion2) {
            System.out.print(aux + " ");
        }

    }

}
