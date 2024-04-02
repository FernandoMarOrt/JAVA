package Arrays;

import java.util.Arrays;

/**
 *
 * @author alvaro
 */
public class MetodosArrays {

    public static void main(String[] args) {

        double[] lista = new double[20];
        boolean copia = false;

        //RELLENAR TODAS LAS POSICIONES DEL ARRAY CON 7,5
        System.out.println("### RELLENAR TODAS LAS POSICIONES DEL ARRAY CON 7,5 ###");
        //##
        Arrays.fill(lista, 0, 20, 7.5);
        //##
        for (double d : lista) {
            System.out.print(d + "-");
        }

        //HACER UNA COPIA DEL ARRAY A OTRO
        System.out.println("\n\n### HACER UNA COPIA DEL ARRAY A OTRO ###");
        //##
        double[] copiaListas = Arrays.copyOf(lista, 20);
        //##
        for (double d : copiaListas) {
            System.out.print(d + "-");
        }

        //COMPARAR AMBOS ARRAYS
        System.out.println("\n\n### COMPARAR AMBOS ARRAYS ###");
        //##
        copia = Arrays.equals(lista, copiaListas);
        //##
        System.out.println("¿Són los arrays iguales?: " + copia);

        //METER 6.3 EN UNA POSICION
        System.out.println("\n\n### METER 6.3 EN UNA POSICION ###");
        //##
        copiaListas[6] = 6.3;
        //##
        for (double d : copiaListas) {
            System.out.print(d + "-");
        }

        //COMPARAR AMBOS ARRAYS AGAIN
        System.out.println("\n\n### COMPARAR AMBOS ARRAYS AGAIN ###");
        //##
        copia = Arrays.equals(lista, copiaListas);
        //##
        System.out.println("¿Són los arrays iguales?: " + copia);
        
        
    }
}
