package Arrays;

import java.util.Arrays;

/**
 *
 * @author alvaro
 */
public class BusquedaArrays {

    public static void main(String[] args) {

        //BUSQUEDA SECUENCIAL
        int array[] = {1, 5, 2, 9, 45, 4, 10};
        int indice = busquqedaSecuencial(45, array);        //SI NO LO ENCUENTRA SALE -1

        if (indice < 0) {
            System.out.println("No se ha encontrado el numero");
        } else {
            System.out.println("El numero: " + array[indice] + " está en la posicion: " + indice);
        }

        //BUSQUEDA BINARIA, MAS RAPIDA, EL ARRAY TIENE Q ESTAR ORDENADO         LO UNICO Q IMPORTA
        System.out.println("Busqueda con binary Search");
        Arrays.sort(array);

        int posicion = Arrays.binarySearch(array, 45);

        System.out.println(posicion);

    }

    public static int busquqedaSecuencial(int numeroBuscar, int[] array) {
        int indice = -1;

        //RECORRER EL ARRAY COMPLETO
        for (int i = 0; i < array.length; i++) {

            if (array[i] == numeroBuscar) {
                indice = i;
                break;              //PARA QUE NO SIGA
            }
        }

        return indice;
    }
}
