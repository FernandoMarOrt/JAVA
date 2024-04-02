package fernando;

//leer una palabra por teclado y hasta que no ponga salir no salgo
import java.util.Scanner;
//poner al reves la palabra que me de
public class InversorPalabras {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
       

        String palabra;
        String palabraInvertida = "";

        do {

            System.out.println("Dime una palabra");
            palabra = teclado.nextLine();

            for (int i = palabra.length() - 1; i >= 0; i--) {
                palabraInvertida += palabra.charAt(i);
            }

            System.out.println(palabraInvertida);

        } while (!palabra.equalsIgnoreCase("Salir"));

    }

}
