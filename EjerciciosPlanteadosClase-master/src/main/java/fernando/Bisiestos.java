package fernando;

//Bucle hasta que el usuario introduzca el 0
import java.util.Scanner;

//SI introduce un año negativo se vuelve positivo
//Una vez hecho esto decir si es bisiesto
//El año tiene que ser para que sea bisiesto tiene que ser divisible por 4
//y no divisible por 100 o divisible por 400
public class Bisiestos {

    public static void main(String[] args) {

        int año;

        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("Dime un año");
            año = teclado.nextInt();

            if (año < 0) {

                año = (año * -1);

            }

            if (año > 0) {

                if ((año % 4) == 0 && (año % 100 != 0) || (año % 400 == 0)) {

                    System.out.println("El año " + año + " es bisiesto");

                } else {

                    System.out.println("El año " + año + " no es bisiesto");
                }
            } else {
                System.out.println("Termina el programa");
            }

        } while (año != 0);

    }
}
