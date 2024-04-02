package ejercicioclase;

import java.util.Scanner;

public class CalculosCuenta {

    public static Scanner teclado = new Scanner(System.in);

    //ingresa dinero a la cuenta
    public static void ingresarDinero(Cuenta cuenta, double cantidad) {

        System.out.println("En la cuenta tienes un saldo de: " + cuenta.getSaldo());

        System.out.println("La cantidad que vas a ingresar es de: " + cantidad);

        cuenta.setSaldo(cuenta.getSaldo() + cantidad);

        System.out.println("Tu saldo ahora es de: " + cuenta.getSaldo() + "\n");

    }

    //retiro un dinero de la cuenta 
    public static void retirarDinero(Cuenta cuenta, double cantidad) {

        System.out.println("Tu saldo actual es de: " + cuenta.getSaldo());

        System.out.println("La cantidad que vas a retirar es de: " + cantidad);

        //filtro el dinero para que no sea superior a la cantidad de la cuenta
            if (cantidad > cuenta.getSaldo()) {
                System.out.println("Debes retirar dinero que tengas");
            } else {
                cuenta.setSaldo(cuenta.getSaldo() - cantidad);
            }

        System.out.println("Tu saldo ahora es de: " + cuenta.getSaldo() + "\n");
    }

    //ingresa los interes a la cuenta 
    public static void ingresarInteres(Cuenta cuenta) {
        double saldoCuenta;

        //calculo el saldo de la cuenta con los intereses
        saldoCuenta = cuenta.getSaldo() + cuenta.getSaldo() * cuenta.getInteres();
        cuenta.setSaldo(saldoCuenta);

        System.out.println("Tu saldo es de " + saldoCuenta + "\n");

    }
}
