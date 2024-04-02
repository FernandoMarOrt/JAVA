package daw;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class EjercicioA {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int opcion;
        int tamanio;
        int[][] matrizA;
        Coordenada coordenada;
        
        //Menu que se va a mostrar al usuario
        String menu = """
                   
                   1-Introducir numeros por el usuario
                   2-Numeros aleatorios 
                   3-Salir
                      
                   """;
        
        do {//Si la opcion es 3 se sale del programa
            //Imprimo el menu y leo la opcion
            System.out.println(menu);
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:

                    //Llamo al metodo para pedir tamanio al usuario
                    tamanio = pedirTamanio();

                    //Creo la matriz con el tamanio preguntado anteriormente
                    matrizA = new int[tamanio][tamanio];

                    //Relleno la matriz con valores que me da el usuario
                    rellenarConUsuario(matrizA);

                    //Imprimo la matriz ya rellena
                    imprimirMatriz(matrizA);
                    
                    //Igualo el objeto coordenada a el resultado obtenido del metodo
                    coordenada = coordenadaNumero(matrizA);
                    
                    //Imprimo la coordenada
                    System.out.println("El numero se encuentra en la posicion " + coordenada.getFila() + ", " + coordenada.getColumna());
                    
                    break;
                
                case 2:

                    //Llamo al metodo para pedir tamanio al usuario
                    tamanio = pedirTamanio();

                    //Creo la matriz con el tamanio preguntado anteriormente
                    matrizA = new int[tamanio][tamanio];

                    //Relleno la matriz con valores aleatorios entre 0 y 20
                    rellenarAleatorio(matrizA);

                    //Imprimo la matriz ya rellena
                    imprimirMatriz(matrizA);
                    
                    //Igualo el objeto coordenada a el resultado obtenido del metodo
                    coordenada = coordenadaNumero(matrizA);
                    
                    //Imprimo la coordenada
                    System.out.println("El numero se encuentra en la posicion " + coordenada.getFila() + ", " + coordenada.getColumna());
                    
                    break;
                
            }
            
        } while (opcion != 3);
        
    }
    
    private static int pedirTamanio() { //Metodo para pedir el tamanio de la matriz

        Scanner teclado = new Scanner(System.in);
        
        int tamanio = 0;
        
        do {
            
            try {
                
                System.out.println("Dime un numero entero entre 3 y 6");
                tamanio = teclado.nextInt();

                //Si el tamaño es menor que 3 y mayor que 6 se le preguntara
                //al usuario otra vez por los valores hasta que los introduzca
                //correctamente
                if (tamanio < 3 || tamanio > 6) {
                    
                    System.out.println("Por favor elige un numero entero entre 3 y 6");
                }

                //Captura la excepcion por si el usuario no mete un valor entero
            } catch (InputMismatchException ime) {
                
                System.out.println("Por favor elige un numero entero entre 3 y 6");
                
            }
            
            teclado.nextLine();
            
        } while (tamanio < 3 || tamanio > 6);
        
        return tamanio; //Devuelvo el tamanio de la matriz
    }

    //Relleno la matriz con numeros aleatorios entre 0 y 20
    private static void rellenarAleatorio(int[][] matrizA) {
        
        Scanner teclado = new Scanner(System.in);
        
        Random numeroAleatorio = new Random();
        
        for (int i = 0; i < matrizA.length; i++) {
            
            for (int j = 0; j < matrizA[i].length; j++) {

                //Genero un numero aleatorio entre 0 y 20
                int nAleatorio = numeroAleatorio.nextInt(0, 20 + 1);
                
                matrizA[i][j] = nAleatorio;
                
            }
            
        }
        
    }

    //Relleno la matriz con numeros que me va introduciendo el usuario 
    private static void rellenarConUsuario(int[][] matrizA) {
        
        Scanner teclado = new Scanner(System.in);
        
        boolean repetir = true;
        
        for (int i = 0; i < matrizA.length; i++) {
            
            for (int j = 0; j < matrizA[i].length; j++) {
                
                do {

                    //Captura la excepcion por si el usuario no mete un numero entero
                    try {
                        
                        System.out.println("Introduce un numero en la posicion: " + i + "| " + j);
                        
                        matrizA[i][j] = teclado.nextInt();
                        
                        repetir = false;
                        
                    } catch (InputMismatchException ime) {
                        
                        System.out.println("Por favor introduce un numero entero");
                        
                    }
                    
                } while (repetir);
            }
        }
        
    }

    //Metodo para imprimir la matriz creada
    private static void imprimirMatriz(int[][] matrizA) {
        
        for (int i = 0; i < matrizA.length; i++) {
            
            for (int j = 0; j < matrizA[i].length; j++) {
                
                if (j != matrizA[i].length - 1) {
                    
                    System.out.print( matrizA[i][j] + "|");
                    
                } else {
                    
                    System.out.println( matrizA[i][j] + "|");
                }
                
            }
            
        }
        
    }
    
    // Método para comprobar si es el mayor numero de su fila
    private static Coordenada mayorFila(int fila, int[][] matrizA) {

        //Nueva cordenada con los valores de fila y columna -1
        Coordenada coordenada = new Coordenada(-1, -1);
        
        int mayorFila = 0;
        
        for (int i = 0; i < matrizA.length; i++) {
            
            if (matrizA[fila][i] >= mayorFila) {

                //Igualo el valor de mayorFila al numero que supere su valor
                mayorFila = matrizA[fila][i];

                //Le doy el valor del indice donde he encontrado el mayor
                //numero a el objeto coordenada
                coordenada.setFila(fila);
                coordenada.setColumna(i);
                
            }
            
        }
        
        return coordenada;
    }
    
    
    // Método para comprobar si es el menor numero de su columna
    private static boolean esMenor(Coordenada coordenada, int[][] matrizA) {
        
        boolean esMenor = true;
        
        int aux = matrizA[coordenada.getFila()][coordenada.getColumna()];
        
        for (int i = 0; i < matrizA[coordenada.getFila()].length; i++) {
            
            if (matrizA[i][coordenada.getColumna()] < aux) {
                
                esMenor = false;
 
            }
        }
        
        return esMenor;
    }
    
    //Comprueba si todo coincide y si no devuelve el objeto coordenada con los valores -1 y -1
    private static Coordenada coordenadaNumero(int[][] matrizA) {
        
        Coordenada coordenada = new Coordenada(-1, -1);
        
        for (int i = 0; i < matrizA.length; i++) {
            
            coordenada = mayorFila(i, matrizA);
            
            if (!esMenor(coordenada, matrizA)) {
                
                if (i == matrizA.length - 1) {
                    
                    coordenada.setFila(-1);
                    
                    coordenada.setColumna(-1);
                    
                }
            } 
            
        }
        
        return coordenada;
    }
}
