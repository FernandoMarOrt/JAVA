package Matrices;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Avion {

    public static void main(String[] args) {

        int opcMenu;
        String ocupado = "X";

        String[][] avion = new String[25][4];
        quitarNull(avion);

        do {
            opcMenu = leerOpc();

            switch (opcMenu) {
                case 1:
                    System.out.println("ESCOJA UNO DE LOS ASIENTOS:");
                    mostrar(avion);

                    reseAsien(avion);

                    break;
                case 2:
                    System.out.println("ESCOJA UNO DE LOS ASIENTOS:");
                    mostrar(avion);

                    cancAsien(avion);
                    break;
                case 3:
                    System.out.println("ASIENTOS DISPONIBLES:");
                    mostrar(avion);
                    break;
                case 4:
                    System.out.println("AGUR");
                    break;
                //NO SALE EN EL MENU, RESERVA 25 ASIENTOS ALEATORIOS
                case 5:
                    System.out.println("RESERVAS ALEATORIAS:");
                    rellenoAlea(avion);
                    mostrar(avion);
                    break;

            }

        } while (opcMenu != 4);

    }

    public static Scanner teclado = new Scanner(System.in);
    public static Random alea = new Random();

    //MOSTRAR MATRIZ
    public static void mostrar(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            if ((i + 1) < 10) {                         //PARA QUE SALGAN RECTAS LAS LINEAS
                System.out.print((i + 1) + "  | ");
            } else {
                System.out.print((i + 1) + " | ");
            }
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("|\n");
        }
    }

    //MOSTRAR MENU
    public static void mostrarMenu() {
        System.out.println("""
                           
                           ---------------------------
                                     VUELING
                           ---------------------------
                               1. RESERVAR ASIENTO
                               2. CANCELAR ASIENTO
                               3. MOSTRAR ASIENTOS
                               4. SALIR
                           ---------------------------
                           
                           Escoja una opción:""");
    }

    //LEER LA OPCION DEL MENU
    public static int leerOpc() {
        int numero = 1;
        boolean repetir = true;
        do {
            try {
                do {
                    mostrarMenu();
                    numero = teclado.nextInt();

                    if (numero < 0 || numero > 5) {
                        System.out.println("Escribe un numero entre 1 y 4");
                    }
                } while (numero < 0 || numero > 5);

                repetir = false;

            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("Escribe un numero");
            }

        } while (repetir);      // ESTO ESTA FEO

        return numero;
    }

    //RELLENAR EL AVION PARA QUE TODOS ESTEN LIBRES
    public static void quitarNull(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = "O";
            }
        }
    }

    //RESERVAR ASIENTO
    public static void reseAsien(String[][] avion) {

        System.out.println("¿En que fila desea estar?");
        int fila = filtrarFila();
        System.out.println("¿En que columna desea estar?");
        int columna = filtrarColumn();

        if (avion[fila - 1][columna - 1].equals("X")) {
            System.out.println("El asiento ya esta ocupado :(");
        } else {
            avion[fila - 1][columna - 1] = "X";     //-1 PQ AL EMPEZAR DE CERO SE PONE EN OTRA
            System.out.println("Reservado con exito");
        }

    }

    //CANCELAR ASIENTO
    public static void cancAsien(String[][] avion) {

        System.out.println("¿En que fila esta ubicado el asiento?");
        int fila = filtrarFila();
        System.out.println("¿En que columna esta ubicado el asiento?");
        int columna = filtrarColumn();

        if (avion[fila - 1][columna - 1].equals("O")) {
            System.out.println("Este asiento estaba libre, se habrá equivocado :)");
        } else {
            avion[fila - 1][columna - 1] = "O";     //-1 PQ AL EMPEZAR DE CERO SE PONE EN OTRA
            System.out.println("Cancelado con exito");
        }

    }
    
    //FILTRAR FILA PARA QUE NO HAYA ERRORES
    private static int filtrarFila() {
        int numero = 1;
        boolean repetir = true;
        do {
            try {
                do {
                    numero = teclado.nextInt();

                    if (numero < 1 || numero > 25) {
                        System.out.println("Las filas van del 1 al 25");
                    }
                } while (numero < 1 || numero > 25);

                repetir = false;

            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("Escriba un número");
            }

        } while (repetir);

        return numero;
    }
    
    //FILTRAR COLUMNA PARA QUE NO HAYA ERRORES
    private static int filtrarColumn() {
        int numero = 1;
        boolean repetir = true;
        do {
            try {
                do {
                    numero = teclado.nextInt();

                    if (numero < 1 || numero > 4) {
                        System.out.println("Las columnas van del 1 al 4");
                    }
                } while (numero < 1 || numero > 4);

                repetir = false;

            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("Escriba un número");
            }

        } while (repetir);

        return numero;
    }
    
    public static void rellenoAlea(String[][] avion){
        int fila = 0;
        int colu = 0;
        
        for (int i = 0; i < 25; i++) {
            fila = alea.nextInt(0, 24 + 1);
            colu = alea.nextInt(0, 3 + 1);
            
            avion[fila][colu] = "X";
        }
    }
}
