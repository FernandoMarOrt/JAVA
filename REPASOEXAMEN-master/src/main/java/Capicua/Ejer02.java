package Capicua;

import java.util.Random;

/**
 *
 * @author alvaro
 */
public class Ejer02 {

    //RELLENAR UN ARRAY CON TODAS LAS LETRAS MAYUSCULAS
    //GENERAR UN TAMAÑO ALEATORIO ENTRE 15 Y 26 SIN LA Ñ
    
    //CREAR UN ARRAY DE ESE TAMAÑO Y RELLENARLO CON POSICIONES VALIDAS
    //GENERAR UN STRING CON LOS VALORES DE LAS POSICIONES
    
    //PREGUNTAR CUANTOS ARRAYS QUIERE HACER Y GUARDARLOS EN OTRO STRING
    public static void main(String[] args) {
        Random alea = new Random();

        System.out.println("¿Cuántas palabras raras quieres crear?");           //HACERLO PARA QUE EL USUSARIO TE PIDA LA CANTIDAD DE PALABRAS Y GUARDARLS EN UN ARRAY
        
        
        //NUMREO ENTRE 15 Y 26
        int numAlea = alea.nextInt(15, 25);
        int aleatorio;
        char letra = 65;
        String palabraNueva;

        char[] letras = new char[26];

        //RELLENAR EL ARRAY CON LETRAS
        for (int i = 0; i < numAlea; i++) {
            letras[i] = letra;
            letra++;
        }

        //PONER LETRAS ALEATORIAS EN OTRO ARRAY
        char[] palabra = new char[numAlea];

        for (int i = 0; i < palabra.length; i++) {

            aleatorio = alea.nextInt(0, palabra.length + 1);

            palabra[i] = letras[aleatorio];

        }

        //PASAR A STRING 
        palabraNueva = String.valueOf(palabra);

        System.out.println(palabraNueva);

    }
}
