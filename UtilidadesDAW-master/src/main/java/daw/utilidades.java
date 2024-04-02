package daw;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class utilidades {


    public static Scanner flujo = new Scanner(System.in);

    public static void leerEnteroSinErrores() {

        int numero;

        do {
            try {
                System.out.println("Introduce la calificación: ");
                numero = flujo.nextInt();
                break; // Si llegamos hasta aquí significa que no hay error
            } catch (InputMismatchException ime) {
                System.out.println("Debe introducir un entero: ");
                flujo.nextLine(); // Limpia los posibles datos que hay en el buffer
            }
        } while (true);

    }

    public static void leerEnteroEnUnRango() {

        int numero, maximo, minimo;

        System.out.println("Dime el numero maximo");
        maximo = flujo.nextInt();

        System.out.println("Introduce el numero minimo ");
        minimo = flujo.nextInt();

        do {

            System.out.println("Introduce un numero ");
            numero = flujo.nextInt();

        } while (numero > maximo || numero < minimo);

    }

    public static void comprobarEnteroEnUnRango() {

        int numero, maximo, minimo;

        System.out.println("Dime el numero entero maximo del rango");
        maximo = flujo.nextInt();

        System.out.println("Introduce el numero entero minimo del rango ");
        minimo = flujo.nextInt();

        System.out.println("Introduce un numero  ");
        numero = flujo.nextInt();

        if (numero < minimo || numero > maximo) {

            System.out.println("El numero " + numero + " no esta en el rango");
        } else {

            System.out.println("El numero " + numero + " esta en el rango");

        }

    }

    public static void generadorAleatorioEnUnRango() {

        
        Random numAleatorio = new Random();
        
        int maximo, minimo;
        
        System.out.println("Dime el numero entero maximo del rango");
        maximo = flujo.nextInt();

        System.out.println("Introduce el numero entero minimo del rango ");
        minimo = flujo.nextInt();
        
        int numero = numAleatorio.nextInt((maximo+1)-minimo) + minimo;
        
        

    }

}
