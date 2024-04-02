package Secuenciales;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EJ12 {

    /*el vendedor tiene un sueldo base más un 10% extra por comisión de sus ventas
    el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones
    por las tres ventas que realiza en el mes 
    y también el total que recibirá, tomando en cuenta su sueldo base y las comisiones.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salarioBase;
        double venta1;
        double venta2;
        double venta3;

        // Solicitud de datos al usuario
        String salarioBaseString = JOptionPane.showInputDialog("Introduce tu salario base");
        salarioBase = Double.parseDouble(salarioBaseString);

        System.out.print("Indica el importe de la primera venta: ");
        venta1 = scanner.nextDouble();

        // Solicitud de datos al usuario
        System.out.print("Indica el importe de la segunda venta: ");
        venta2 = scanner.nextDouble();

        System.out.print("Indica el importe de la tercera venta: ");
        venta3 = scanner.nextDouble();

        // Realizamos Cálculos 
        double comision = 0.1 * (venta1 + venta2 + venta3); //Hago la comision de las 3 ventas
        double salarioTotal = salarioBase + comision; //Calculo el salario total

        // Mostramos en pantalla los resultados de la suma del salio base 
        //+ las comisiones y ponemos que salgan 2 decimales
        String resultados = """
                          El sueldo total a recibir es      %.2f
                          Equivalente al salario base       %.2f
    // Solicitud de datos al usuario
                          """.formatted(salarioTotal, salarioBase);

        System.out.println(resultados);

        //Muestro la comision por un panel de texto
        JOptionPane.showMessageDialog(null, "Tus comisiones han sido " + comision + "€");

    }
}
