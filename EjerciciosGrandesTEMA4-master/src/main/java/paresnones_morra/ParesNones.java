package paresnones_morra;

import java.util.InputMismatchException;
import java.util.Random;
import javax.swing.JOptionPane;

public class ParesNones {

    public static void main(String[] args) {
        String menu = "", paresNones, resultado;
        int numeroMaquina, elegirDedos, sumaDedos;
        final int minimo = 0;
        final int maximo = 10;

        //Bucle para elegir jugar o salir , cuando elige salir se sale
        //completamente del programa
        do {

            //Muestra el menu
            menu = pedirOpcion();

            if (!menu.equalsIgnoreCase("salir")) {

                //Elegimos pares o nones
                paresNones = elegirParesNones();

                //Decidimos cuantos dedos vamos a sacar
                elegirDedos = elegirDedos(minimo, maximo);

                //Generamos un numero de dedos a la maquina
                numeroMaquina = maquinaDedos(minimo, maximo);

                //Suma todos los dedos 
                sumaDedos = sumaDedos(elegirDedos, numeroMaquina);

                //Mostramos finalmente el resultado
                resultado(paresNones, sumaDedos);

            }

        } while (menu.equalsIgnoreCase("jugar"));

    }

    //VALIDO EL MENU INICIAL
    public static boolean opcionMenuInicialValida(String menu) {

        return menu.equalsIgnoreCase("salir")
                || menu.equalsIgnoreCase("jugar");
    }

    //MUESTRO EL MENU DEL JUEGO
    public static String mostrarMenu() {
        String texto = """
                   ************************
                       -JUGAR
                       -SALIR
                   ************************    
                       """;
        String menu = JOptionPane.showInputDialog(texto);
        return menu;
    }

    //Se repite hasta que el usuario ponga jugar o salir
    public static String pedirOpcion() {
        String menu;
        do {
            menu = mostrarMenu();

            //Si el usuario introduce algo distinto a jugar o salir le saldra
            //un mensaje de aviso
            if (!menu.equalsIgnoreCase("jugar")
                    && !menu.equalsIgnoreCase("salir")) {

                JOptionPane.showMessageDialog(null,
                        "Escribe JUGAR o SALIR por favor");
            }

        } while (!opcionMenuInicialValida(menu));

        return menu;
    }

    //Elegimos si queremos ser pares o nones
    public static String elegirParesNones() {

        String paresNones = "";

        do { //Se va a repetir hasta que el usuario ponga pares o nones

            paresNones = JOptionPane.showInputDialog(
                    "Elige que quieres ser pares o nones");

            //Si el usuario introduce algo distinto a pares o nones le saldra
            //un mensaje de aviso 
            if (!paresNones.equalsIgnoreCase("pares")
                    && !paresNones.equalsIgnoreCase("nones")) {

                JOptionPane.showMessageDialog(null,
                        "Escribe PARES o NONES por favor");
            }

        } while (!paresNones.equalsIgnoreCase("pares")
                && (!paresNones.equalsIgnoreCase("nones")));

        return paresNones;
    }

    //Elegimos cuantos dedos vamos a sacar
    public static int elegirDedos(final int minimo, final int maximo) {

        int elegirDedos;

        do {

            do { //Se repite hasta que introduzca un numero entero valido 
                String elegirDedosString = JOptionPane.showInputDialog(
                        "Cuantos dedos vas a sacar entre 0 y 10");
                try {

                    elegirDedos = Integer.parseInt(
                            elegirDedosString);
                    break;

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,
                            "Debe introducir un numero entero por favor");
                }

            } while (true);

            //Si el usuario introduce algo distinto a 0 o 10 le saldra
            //un mensaje de aviso 
            if (elegirDedos < minimo || elegirDedos > maximo) {

                JOptionPane.showMessageDialog(null,
                        "Escribe un numero del 0 al 10 por favor");
            }

        } while (elegirDedos < minimo || elegirDedos > maximo);
        //Se repite el bucle hasta que el usuario introduzca un numero dentro
        //Del rango de minimo y maximo

        return elegirDedos;
    }

    //La maquina elige los dedos que va a sacar
    public static int maquinaDedos(final int minimo, final int maximo) {

        Random numAleatorio = new Random();

        int numeroMaquina = numAleatorio.nextInt(minimo, maximo + 1);

        return numeroMaquina;
    }

    //Calcula la suma de los dedos de la maquina y del usuario
    public static int sumaDedos(int elegirDedos, int numeroMaquina) {

        int sumaDedos;

        sumaDedos = elegirDedos + numeroMaquina;

        return sumaDedos;

    }

    //Calcula si el jugador a resultado ganador o perdedor 
    public static void resultado(String paresNones, int sumaDedos) {

        if (paresNones.equalsIgnoreCase("pares")) {

            if (sumaDedos % 2 == 0) { //Si la suma de dedos es par:

                JOptionPane.showMessageDialog(null,
                        "Has ganado!!! La suma de los numeros es " + sumaDedos);

            } else {

                JOptionPane.showMessageDialog(null,
                        "Has pedido!!! La suma de los numeros es " + sumaDedos);

            }

        } else if (paresNones.equalsIgnoreCase("nones")) {

            if (sumaDedos % 2 == 1) { //Si la suma de dedos es impar 

                JOptionPane.showMessageDialog(null,
                        "Has ganado!!! La suma de los numeros es " + sumaDedos);

            } else {

                JOptionPane.showMessageDialog(null,
                        "Has pedido!!! La suma de los numeros es " + sumaDedos);

            }

        }

    }
}
