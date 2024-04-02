package Utilidades;

import controladores.ClienteJpaController;
import controladores.HabitacionJpaController;
import controladores.ReservaJpaController;
import controladores.TarjetaDescuentoJpaController;
import controladores.exceptions.NonexistentEntityException;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fer
 */
public class Consultas {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("HOTELPG");
    private static final HabitacionJpaController hc = new HabitacionJpaController(emf);
    private static final ReservaJpaController rc = new ReservaJpaController(emf);
    private static final TarjetaDescuentoJpaController tc = new TarjetaDescuentoJpaController(emf);
    private static final ClienteJpaController cc = new ClienteJpaController(emf);

    public static void main(String[] args) throws NonexistentEntityException, Exception {

        // Consultas de las tablas completas
//        mostrarHabitaciones();
//        mostrarClientes();
//        mostrarTarjetasDescuento();
//        mostrarReservas();

        System.out.println(cc.findCliente(29).getIdtarjetaD().getId());
        
        
//        // Número de registros de la tablas
//        System.out.println("Número de tuplas tabla Cliente: " + cc.getClienteCount());
//
//        // Obtiene 3 habitaciones, saltándose el primero
//        // usando el método findVehiculoEntities(maxResult, firstResult)
//        System.out.println("************************");
//        hc.findHabitacionEntities(3, 1).forEach(System.out::println);
//        System.out.println("************************");
//
//        // Obtención de entidades por ID. Si no existe el ID, devuelve null
//        var habitacion = hc.findHabitacion(21);
//        System.out.println(habitacion);
//
//        System.out.println("************************");
//        var cliente = cc.findCliente(22);
//        System.out.println(cliente);
//
//        System.out.println("************************");
//        var tarjetaD = tc.findTarjetaDescuento(21);
//        System.out.println(tarjetaD);
//
//        System.out.println("************************");
//        var reserva = rc.findReserva(21);
//        System.out.println(reserva);
//        System.out.println("************************");
//
//        // Búsqueda de una entidad usando Named Query   //Habitacion
//        // Si no existe ninguna entidad que cumple, lanza excepción NoResultException
//        System.out.println(" ----- Búsqueda de numero de habitacion por named query ---------- ");
//        habitacion = hc.findByNumeroHabitacion(26);
//        System.out.println(habitacion);
//
//        System.out.println(" ----- Búsqueda de id de habitacion por named query ---------- ");
//        habitacion = hc.findByIDHabitacion(21);
//        System.out.println(habitacion);
//
//        // Búsqueda de una entidad usando Named Query   //Cliente
//        // Si no existe ninguna entidad que cumple, lanza excepción NoResultException
//        System.out.println(" ----- Búsqueda de dni de cliente por named query ---------- ");
//        cliente = cc.findByNif("22222222B");
//        System.out.println(cliente);
//
//        System.out.println(" ----- Búsqueda del nombre de cliente por named query ---------- ");
//        cliente = cc.findByNombre("Ernesto");
//        System.out.println(cliente);
//
//        // Búsqueda de una entidad usando Named Query   //Reserva
//        // Si no existe ninguna entidad que cumple, lanza excepción NoResultException
//        System.out.println(" ----- Búsqueda de id de reserva por named query ---------- ");
//        reserva = rc.findByIDreserva(25);
//        System.out.println(reserva);
//
//        System.out.println(" ----- Búsqueda de dni de cliente en reserva por named query ---------- ");
//        reserva = rc.findByClienteEnReserva(24);
//        System.out.println(reserva);
//
//        // Búsqueda de una entidad usando Named Query   //TarjetaDescuento
//        // Si no existe ninguna entidad que cumple, lanza excepción NoResultException
//        System.out.println(" ----- Búsqueda de id de tarjetaDescuento por named query ---------- ");
//        tarjetaD = tc.findByIDTarjetaDescuento(23);
//        System.out.println(tarjetaD);
//
//        System.out.println(" ----- Búsqueda de fecha de tarjetaDescuento por named query ---------- ");
//        tarjetaD = tc.findByIDTarjetaDescuento("2023-01-01");
//        System.out.println(tarjetaD);
        
        

        /*PARA VOLCAR DESPUES LOS DATOS DEL CSV A LA BASE DE DATOS TIENES
        QUE PASARLO A LISTA DESPUES RECORRER LA LISTA CON UN FOR Y ASIGNAR COMO HICISTES EN EL EXAMEN CON EL INDEX.GETDATO
        A UN OBJETO E IR AÑADIENDOLO DENTRO DEL BUCLE CON EL METODO DE CREAR LAS ENTIDADES probar esto*/
    }

    public static void mostrarHabitaciones() {
        System.out.println("--------- Listado de Habitaciones -------------");
        hc.findHabitacionEntities().forEach(System.out::println);
        System.out.println("--------------------------------------------");

    }

    public static void mostrarClientes() {
        System.out.println("--------- Listado de Clientes -------------");
        cc.findClienteEntities().forEach(System.out::println);
        System.out.println("--------------------------------------------");
    }

    public static void mostrarReservas() {
        System.out.println("--------- Listado de Reservas -------------");
        rc.findReservaEntities().forEach(System.out::println);
        System.out.println("--------------------------------------------");
    }

    public static void mostrarTarjetasDescuento() {
        System.out.println("--------- Listado de TarjetasDescuento -------------");
        tc.findTarjetaDescuentoEntities().forEach(System.out::println);
        System.out.println("--------------------------------------------");
    }

}
