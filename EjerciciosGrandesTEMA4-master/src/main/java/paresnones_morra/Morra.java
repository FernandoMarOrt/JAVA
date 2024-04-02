package paresnones_morra;

import java.util.InputMismatchException;
import java.util.Random;
import javax.swing.JOptionPane;

public class Morra {

    public static void main(String[] args) {
        String menu = "", resultado;
        int numeroMaquina, elegirDedos, sumaDedos, adivinaDedos,
                numeroAdivinaMaquina, contadorVictorias = 0, contadorDerrotas = 0;
        final int minimo = 0;
        final int maximo = 5;
        final int minimoAdivina = 2;
        final int maximoAdivina = 10;

        //Bucle para elegir jugar o salir , cuando elige salir se sale
        //completamente del programa
        do {

            //Muestra el menu
            menu = pedirOpcion();

            if (!menu.equalsIgnoreCase("salir")) {

                for (int i = 1; i < 6; i++) {

                    //Decidimos cuantos dedos vamos a sacar
                    elegirDedos = elegirDedos(minimo, maximo);

                    //Generamos un numero de dedos a la maquina
                    numeroMaquina = maquinaDedos(minimo, maximo);

                    //Genero un numero aleatorio para la respuesta de la maquina
                    numeroAdivinaMaquina = maquinaAdivinaDedos(minimo,
                            maximo, numeroMaquina);

                    //Suma todos los dedos 
                    sumaDedos = sumaDedos(elegirDedos, numeroMaquina);

                    //Adivinar dedos 
                    adivinaDedos = adivinarDedos(minimoAdivina, maximoAdivina);

                    //Mostramos finalmente el resultado
                    resultadoRonda(i, elegirDedos, numeroMaquina, adivinaDedos,
                            numeroAdivinaMaquina, sumaDedos, contadorVictorias,
                            contadorDerrotas);
                }
            }

        } while (menu.equalsIgnoreCase("jugar"));

    } //VALIDO EL MENU INICIAL

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
        
        do {//Valida el menu incial
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

    //Elegimos cuantos dedos vamos a sacar
    public static int elegirDedos(final int minimo, final int maximo) {

        int elegirDedos;

        do {

            do { //Se repite hasta que introduzca un numero entero valido 
                String elegirDedosString = JOptionPane.showInputDialog(
                        "Cuantos dedos vas a sacar");
                
                try {//Valida que el dato sea un numero entero

                    elegirDedos = Integer.parseInt(
                            elegirDedosString);
                    break;

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,
                            "Debe introducir un numero entero por favor");
                }

            } while (true);

            //Si el usuario introduce algo distinto a pares o nones le saldra
            //un mensaje de aviso 
            if (elegirDedos < minimo || elegirDedos > maximo) {

                JOptionPane.showMessageDialog(null,
                        "Escribe un numero del 0 al 5 por favor");
            }

            //En el juego de la morra si sacan 0 dedos se le asignara 1
            if (elegirDedos == 0) {

                elegirDedos = 1;
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

        //En el juego de la morra si sacan 0 dedos se le asignara 1
        if (numeroMaquina == 0) {

            numeroMaquina = 1;
        }

        return numeroMaquina;
    }

    //La maquina genera un numero aleatorio el cual es el que trata de adivinar
    public static int maquinaAdivinaDedos(final int minimoAdivina,
            final int maximoAdivina, int numeroMaquina) {

        int numeroAdivinaMaquina = 0;

        //Hace que la maquinas siempre intente adivinar un numero mas alto del
        //que ha sacado anteriormente
        do {

            Random numAleatorio2 = new Random();

            numeroAdivinaMaquina = numAleatorio2.nextInt(minimoAdivina,
                    maximoAdivina + 1);

        } while (numeroAdivinaMaquina <= numeroMaquina);

        return numeroAdivinaMaquina;

    }

    //Calcula la suma de los dedos de la maquina y del usuario
    public static int sumaDedos(int elegirDedos, int numeroMaquina) {

        int sumaDedos;

        sumaDedos = elegirDedos + numeroMaquina;

        return sumaDedos;

    }

    //Pregunta al usuario para que adivine la suma de dedos
    public static int adivinarDedos(final int minimoAdivina,
            final int maximoAdivina) {
        int adivinaDedos = 0;

        do {
            do { //Se repite hasta que introduzca un numero entero valido 
                String adivinaDedosString = JOptionPane.showInputDialog(
                        "Intenta decirme cuantos dedos hemos sumado");
                try {

                    adivinaDedos = Integer.parseInt(
                            adivinaDedosString);
                    break;

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,
                            "Debe introducir un numero entero por favor");
                }

            } while (true);

            //Si el usuario introduce algo distinto a 0 o 10 le saldra
            //un mensaje de aviso 
            if (adivinaDedos < minimoAdivina || adivinaDedos > maximoAdivina) {

                JOptionPane.showMessageDialog(null,
                        "Venga te lo pongo facil intenta escribir "
                        + "un numero del 2 al 10 por favor");
            }

        } while (adivinaDedos < minimoAdivina || adivinaDedos > maximoAdivina);

        return adivinaDedos;
    }

    //Calcula si el jugador a resultado ganador o perdedor 
    public static void resultadoRonda(int i, int elegirDedos, int numeroMaquina,
            int adivinaDedos, int numeroAdivinaMaquina, int sumaDedos,
            int contadorVictorias, int contadorDerrotas) {

        //Hago un textoblock con las variables de los resultados
        String resultado = """
                           Ronda numero: %d
                           El jugador ha sacado  %d
                           La maquina ha sacado  %d
                           El jugador ha dicho   %d
                           La maquina ha dicho   %d   
                           La suma de dedos es   %d
                          """.formatted(i, elegirDedos,
                numeroMaquina,
                adivinaDedos, numeroAdivinaMaquina,
                sumaDedos);

        //Imprimo el resultado
        JOptionPane.showMessageDialog(null, resultado);

        //Si el usuario adivina los dedos gana y pierde la maquina
        if ((adivinaDedos == sumaDedos) && (numeroAdivinaMaquina != sumaDedos)) {

            JOptionPane.showMessageDialog(null,
                    "Has ganado!!! , la maquina pierde la ronda");

            contadorVictorias++;

            //Si la maquina adivina los dedos gana y pierde el usuario
        } else if ((adivinaDedos != sumaDedos
                && numeroAdivinaMaquina == sumaDedos)) {

            JOptionPane.showMessageDialog(null,
                    "Has perdido!!! , la maquina gana la ronda");

            contadorDerrotas++;

            //Si el usuario y la maquina adivinan los dedos los 2 ganan
        } else if ((adivinaDedos == sumaDedos
                && numeroAdivinaMaquina == sumaDedos)) {

            JOptionPane.showMessageDialog(null,
                    "Habeis ganado los 2 es un empate de ronda");

            //Si el usuario y la maquina no adivinan los dedos los 2 pierden
        } else if ((adivinaDedos != sumaDedos
                && numeroAdivinaMaquina != sumaDedos)) {

            JOptionPane.showMessageDialog(null, ""
                    + "Habeis perdido los 2 es un empate de ronda");

        }

        //Cuando termine las 5 rondas se decidira un ganador
        if (i == 5) {

            //Si el contadorVictorias es mayor que el de derrotas gana el usuario
            if (contadorVictorias > contadorDerrotas) {

                JOptionPane.showMessageDialog(null,
                        "El jugador ha ganado con " + contadorVictorias
                        + " victorias");

                //Si el contadorDerrotas es mayor que el de victorias gana la maquina
            } else if (contadorVictorias < contadorDerrotas) {

                JOptionPane.showMessageDialog(null,
                        "La maquina ha ganado con " + contadorDerrotas
                        + " victorias");

                //Si los 2 contadores llegan a 0 al final sera un empate    
            } else if (contadorVictorias == contadorDerrotas) {

                JOptionPane.showMessageDialog(null,
                        "Habeis empatado");
            }

        }

    }

}
