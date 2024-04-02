package daw;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioB {

    public static void main(String[] args) {

        int tronco = 2; //Le doy un valor al tronco 

        int copaAltitud = copaAltitud(); //Solicito y creo la altura de la copa del arbol

        //Igualo la matriz arbol al metodo para rellenar el arbol
        String[][] arbol = rellenarCopaArbol(copaAltitud, 2);

        //Imprimo el arbol
        imprimirMatriz(arbol);

    }

    //Metodo para pedir la altitud de la copa del arbol controlando
    //que sea mayor que  2 y menor que 10 y que sea un numero entero
    private static int copaAltitud() {

        Scanner teclado = new Scanner(System.in);

        int copaAltitud = 0;

        do {

            try {

                System.out.println("Introduce la altitud de la copa del arbol");
                copaAltitud = teclado.nextInt();
                
                //Si la altura es superior a 10 o menor a 2 se le notifica al usuario
                if (copaAltitud < 2 || copaAltitud > 10) {

                    System.out.println("La altura del arbol tiene que estar entre 2 y 10");

                }
                
            //Si la altura no es un numero entero se le notifica al usuario
            } catch (InputMismatchException ime) {

                System.out.println("La altura del arbol tiene que ser un numero entero");

            }

        } while (copaAltitud < 2 || copaAltitud > 10);

        return copaAltitud;
    }

    private static String[][] rellenarCopaArbol(int copaAltitud, int tronco) {

        //Creo una matriz arbol
        
        //1º Parentesis el numero de filas que sera igual a: 2 de altura base del tronco + la altitud del usuario
        
        //2º Parentesis el ancho es decir las columnas al ancho siempre es la altitud 
        //que me de el usuario multiplicado por 2 (ya que empieza a contar desde 0 el ancho de la matriz)
        String[][] arbol = new String[(tronco + copaAltitud)][(copaAltitud * tronco)];

        //Recorro la matriz y relleno la copa con los caracteres " " como espacio y * como relleno de la matriz
        for (int i = 0; i < arbol.length - tronco; i++) {

            for (int j = 0; j < arbol[i].length; j++) {

                if (j < copaAltitud - i || j > (copaAltitud + i)) {

                    arbol[i][j] = " ";

                } else {

                    arbol[i][j] = "*";
                }

            }
        }

        //Relleno la parte del tronco 
        
        //Recorro la matriz y relleno la copa con los caracteres " " como espacio y * como relleno de la matriz
        for (int i = arbol.length - tronco; i < arbol.length; i++) {

     
            for (int j = 0; j < arbol[i].length; j++) {

                if (j != copaAltitud) {

                    arbol[i][j] = " ";

                } else {

                    arbol[i][j] = "*";

                }

            }
        }

        return arbol; //Devuelvo la matriz de arbol ya rellena
    }

    //Metodo para imprimir la matriz
    private static void imprimirMatriz(String[][] arbol) {

        for (int i = 0; i < arbol.length; i++) {

            for (int j = 0; j < arbol[i].length; j++) {

                System.out.print(arbol[i][j]);

            }

            System.out.println("");//Mete un salto
        }
    }
}
