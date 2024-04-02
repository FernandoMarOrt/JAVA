package Matrices;

/**
 *
 * @author alvaro
 */
public class Explic {
    
     public static void main(String[] args) {
        
        //CREACIÓN CON PARAMETROS DADOS
        //int[][] matriz = new int[3][3];           //3 FILAS y 4 COLUMNAS

        //CREACION LLENO
        int[][] array2D = {{99, 42, 74, 83, 100},
        {90, 91, 72, 88, 95},
        {88, 61, 74, 89, 96},
        {61, 89, 82, 98, 93},
        {93, 73, 75, 78, 99},};

        //CREACION ALEATORIA
        int[][] samples;
        samples = new int[6][];                   //DEFINe 6 ARRAYS DE INT
        samples[2] = new int[6];
        samples[5] = new int[101];

        //CREACION CON LONGITUDES VARIABLES
        int[][] array = {{1, 9, 4}, {0, 2}, {0, 1, 2, 3, 4}};

        //MOSTRAR LONGITUD
        System.out.println(array.length);
        System.out.println(array[2].length);
        System.out.println(array[2][2]);

        //RECORRER TODA LA MATRIZ
        System.out.println("RECORRIDO DE TODA LA MATRIZ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.print("}\n");
        }
        
        System.out.println("************************************************");
        System.out.println("CUBOOOOOOOOOO");
        
        int[][][] matriz = new int[3][3][3];
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("/");
                for (int k = 0; k < matriz[i][j].length; k++) {
                    System.out.print(matriz[i][j][k]);
                }
                System.out.print("/");
            }
            System.out.print("|\n");
        }

    }
}
