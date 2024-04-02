package Matrices;

import java.util.Random;

/**
 *
 * @author alvaro
 */
public class MinimoMaximo {

    public static void main(String[] args) {

        //CREACION
        int[][] matriz = new int[3][3];

        //RELLENAR ALEATORIAMENTE
        rellenarAlea(matriz);

        //MOSTRAR
        mostrar(matriz);

        //CALCULAR MEDIA
        double media = calcularMedia(matriz);
        System.out.println("\nLA MEDIA ES DE: " + String.format("%.2f", media));

        //CALCULAR MINIMO Y MAXIMO
        minYmax(matriz);

    }

    //RELLENAR CON ALEATORIOS
    public static void rellenarAlea(int[][] matriz) {
        Random alea = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = alea.nextInt(1, 100 + 1);
            }
        }
    }

    //CALCULAR LA MEDIA
    public static double calcularMedia(int[][] matriz) {

        double media = 0;
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                contador++;
                media += matriz[i][j];
            }
        }

        return media / contador;

    }
    

    //CALCULAR MIN Y MAX
    public static void minYmax(int[][] matriz){
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("EL VALOR MINIMO ES: " + menor);
        System.out.println("EL VALOR MAXIMO ES: " + mayor);
        
    }
    
    //MOSTRAR MATRIZ
    public static void mostrar(int[][] matriz) {
        System.out.println("RECORRIDO DE TODA LA MATRIZ:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("{");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + ",");
            }
            System.out.print("}\n");
        }
    }
}
