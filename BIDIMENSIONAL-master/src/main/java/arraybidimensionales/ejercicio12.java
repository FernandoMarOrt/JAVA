/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraybidimensionales;

/**
 *
 * @author fer
 */
public class ejercicio12 {

    public static void main(String[] args) {

        //Creo el array bidimensional de 2x3
        String[][] arraybi = {{"j", "z"},
        {"a", "b", "c"},};
        

//        for (int i = 0; i < arraybi.length; i++) {
//
//            for (int j = 0; j < arraybi[i].length; j++) {
//
//                System.out.println(arraybi[i][j]);
//
//            }
//        }

        //Llamo al metodo e imprime el array
        imprimirMatriz(arraybi);

    }
    
    //Metodo que imprime la matriz que es pasada como parametro
    public static void imprimirMatriz(String[][] aux) {

        for (int i = 0; i < aux.length; i++) {

            for (int j = 0; j < aux[i].length; j++) {

                System.out.println(aux[i][j]);

            }
        }

    }

}
