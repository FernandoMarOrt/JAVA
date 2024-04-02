/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Scanner;

/**
 *
 * Me sirve de conexion entre el main y mi clase serie
 */
public class ServicioSerie {

    private static Scanner teclado = new Scanner(System.in);

    //Leer por teclado los datos de una serie y devuelve el objeto creado
    public static Serie leerTecladoSerie() {

        //Creamos el objeto de tipo serie
        Serie serie;

        //Leer por teclado e instanciar
        System.out.println("Nombre de la serie");
        String nombreSerie = teclado.nextLine();

        System.out.println("Genero de la serie");
        String generoSerie = teclado.nextLine();

        System.out.println("Productor de la serie");
        String productorSerie = teclado.nextLine();

        System.out.println("Numero de temporadas de la serie");
        int numtemporadasSerie = teclado.nextInt();

        System.out.println("Likes de la serie");
        int likesSerie = teclado.nextInt();

        System.out.println("Sinopsis de la serie");
        String sinopsisSerie = teclado.nextLine();

        //Instanciamos el objetos
        serie = new Serie(nombreSerie, generoSerie, sinopsisSerie, numtemporadasSerie, productorSerie, likesSerie);

        //Devolvemos el tipo de serie 
        return serie;

    }

    public static void darLike(Serie serie) {
        
        System.out.println("Te ha gustado la serie " + serie.getTitulo() + " ?");
        
        String respuesta = teclado.nextLine();
        
        if (respuesta.equalsIgnoreCase("si")) {
            
            serie.darLike();
        }

    }

}
