/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentacarlista;

import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.util.Scanner;

/**
 *
 * @author fer
 */
public class Menu {

    public static void main(String[] args) {

        int opcion = 0;
        boolean repetir = false;

        Empresa rentacar = new Empresa();
        rentacar.setNombre("Rentacar");

        Scanner teclado = new Scanner(System.in);

        do {
            
            System.out.println("""
                           Selecciona una de estas opciones por favor:
                           1.Dar de alta a clientes
                           2.Dar de alta a vehiculos 
                           3.Realizar alquiler
                           4.Mostrar catalogos
                           5.Salir
                           """);

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Ha elegido dar de alta un cliente");
                    //llamo a los metodos registrar cliente y le meto dentro el 
                    //metodo datos cliente para crear uno con datos por el teclado
                    rentacar.registrarCliente(datosCliente());

                    break;
                case 2:

                    System.out.println("Ha elegido dar de alta un vehiculo");
                    //llamo a los metodos registrar vehiculo y le meto dentro el 
                    //metodo datos vehiculo para crear uno con datos por el teclado
                    rentacar.registrarVehiculo(datosVehiculo());

                    break;
                case 3:
                    System.out.println("Ha elegido dar de alta un vehiculo");
                    //llamo a los metodos registrar alquiler y le meto dentro el 
                    //metodo datos alquiler para crear uno con datos por el teclado
                    rentacar.registrarAlquiler(alquilerConDatos(rentacar));

                    break;

                case 4:

                    System.out.println("Ha elegido mostar catalogos");
                    System.out.println(rentacar);

                    break;

            }

        } while (opcion != 5);

    }

     //Rellena con datos introducidos por teclados un cliente
    public static Clientes datosCliente() {

        Clientes clientes1 = CatalogoClientes.clienteConDatos();

        return clientes1;

    }

    //Rellena con datos introducidos por teclados un vehiculo
    public static Vehiculo datosVehiculo() {

        Vehiculo vehiculo1 = CatalogoVehiculos.vehiculoConDatos();

        return vehiculo1;

    }

    //Crea un nuevo alquiler a partir de unos datos introducidos por teclado
    public static Alquiler alquilerConDatos(Empresa empresa1) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime el dni de algunos de los siguientes clientes " + empresa1.getCatalogoC());
        String nif = teclado.nextLine();

        System.out.println("Dime el bastidor de algunos de los siguientes vehiculos " + empresa1.getVehiculoV());
        String bastidor = teclado.nextLine();

        System.out.println("Dime la duracion del alquiler");
        int duracionDias = teclado.nextInt();

        Alquiler alquiler1 = new Alquiler(empresa1.buscarCliente2(nif), empresa1.buscarVehiculo2(bastidor), LocalDate.now(), duracionDias);

        return alquiler1;
    }

}
