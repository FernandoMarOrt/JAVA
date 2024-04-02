package RellenarPorTecladoUnObjeto;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Ejemp {
    
    private static Scanner teclado = new Scanner(System.in);

    public static Serie leerTecladoSerie() {
        Serie serie;
        //PEDIR CADA DATO
        System.out.println("TITULO: ");
        String tituloSerie = teclado.nextLine();

        System.out.println("GENERO: ");
        String generoSerie = teclado.nextLine();

        System.out.println("SINOPSIS: ");
        String sinopsisSerie = teclado.nextLine();

        System.out.println("PRODUCTORA: ");
        String productoraSerie = teclado.nextLine();

        System.out.println("TEMPORADAS: ");
        int temporadasSeries = teclado.nextInt();

        System.out.println("LIKES: ");
        int likesSerie = teclado.nextInt();

        teclado.nextLine();
        //INSTANCIACION DEL OBJETO CON EL CONSTRUCTOR
        serie = new Serie(tituloSerie, generoSerie, sinopsisSerie,
                productoraSerie, temporadasSeries, likesSerie);

        return serie;
    }
}
