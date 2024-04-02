package Utilidades;

import controladores.exceptions.IllegalOrphanException;

import entidades.Reserva;
import entidades.Cliente;
import entidades.TarjetaDescuento;
import entidades.Habitacion;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import controladores.ClienteJpaController;
import controladores.HabitacionJpaController;
import controladores.ReservaJpaController;
import controladores.TarjetaDescuentoJpaController;
import controladores.exceptions.NonexistentEntityException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fer
 */
public class CRUD {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("HOTELPG");
    private static final HabitacionJpaController hc = new HabitacionJpaController(emf);
    private static final ReservaJpaController rc = new ReservaJpaController(emf);
    private static final TarjetaDescuentoJpaController tc = new TarjetaDescuentoJpaController(emf);
    private static final ClienteJpaController cc = new ClienteJpaController(emf);

    public static Date localToDate(LocalDate fecha) {
        return Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDate dateToLocal(Date fecha) {

        Instant instant = fecha.toInstant();
        return instant.atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static boolean compararFechas(LocalDate fechaFin, String fechaInicio) {

        boolean disponible = false;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate fechaInicioL = LocalDate.parse(fechaInicio, formato);

        if (fechaFin.isAfter(fechaInicioL)) {
            disponible = false; // En esta fecha la habitacion esta ocupada es decir 0 significa que la habitacion esta ocupada

        } else if (fechaFin.isBefore(fechaInicioL)) {

            disponible = true;  //La habitacion esta disponible

        } else {
            disponible = false; //Esto significaria que las fechas son iguales por lo cual no esta dispnible
        }

        return disponible;
    }

    public static void crearHabitacionConReservas(Reserva res) {
        //Creación de un vehículo con un alquiler que existe en la BD
        // Si hay algún alquiler a null en la lista lanza excepción
        var h1 = new Habitacion();
        h1.setAireAcondicionado(true);
        h1.setCalefaccion(true);
        h1.setNumeroCamas(4);
        h1.setNumeroHabitacion(45);
        h1.setPiso(20);

        List<Reserva> listaReserva = new ArrayList<>();
        listaReserva.add(res);
        h1.setReservaList(listaReserva);
        hc.create(h1);
        Reserva r1 = new Reserva();

    }

    public static void borrarCliente(Integer id) throws IllegalOrphanException, NonexistentEntityException {
    
        cc.destroy(id);
    }

    //CREACIONES
    public static void crearTarjetaD(String fechaCaducidadS) {
        // Creación de una tarjeta
        TarjetaDescuento t = new TarjetaDescuento();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Date fechaCaducidad = localToDate(LocalDate.parse(fechaCaducidadS, formato));
        t.setFechaCaducidad(fechaCaducidad);
        tc.create(t);
    }

    public static void crearCliente(String nombre, String apellidos, String dni) { //Creacion de cliente sin tarjetas descuento

        var c = new Cliente();
        c.setNombre(nombre);
        c.setApellidos(apellidos);
        c.setDni(dni);
        c.setActivo(true);
        cc.create(c);
    }

    public static void crearClienteConTarjetaD(TarjetaDescuento t, String nombre, String apellidos, String dni) { //Creacion de cliente con tarjeta descuento

        var c = new Cliente();
        c.setNombre(nombre);
        c.setApellidos(apellidos);
        c.setDni(dni);
        c.setIdtarjetaD(t);
        cc.create(c);
    }

    public static void crearHabitacion(boolean aireA, boolean calefaccion, int nCamas, int nHabitacion, int piso) {
        var h1 = new Habitacion();
        h1.setAireAcondicionado(aireA);
        h1.setCalefaccion(calefaccion);
        h1.setNumeroCamas(nCamas);
        h1.setNumeroHabitacion(nHabitacion);
        h1.setPiso(piso);
        hc.create(h1); // Ya no hay excepción

    }

    public static void crearReserva(Cliente c, Habitacion h, String fechaEntradaL, String fechaSalidaL) {
        // Creación de un alquiler, durante 3 días desde hoy
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Double precio;

        Reserva r = new Reserva();

        r.setCliente(c);
        r.setHabitacion(h);

        //Pasos los string de las fechas a localdate para sacar el numero de dias
        r.setNumeroDias((int) ChronoUnit.DAYS.between(LocalDate.parse(fechaEntradaL, formato), LocalDate.parse(fechaSalidaL, formato)));
        precio = (r.getNumeroDias() * 10.25); //El precio del dia sera de 10.25
        
        if(c.getIdtarjetaD() != null){
            
            precio = precio * 0.90;
        }
        
        r.setPrecio(precio);

        Date fechaEntrada = localToDate(LocalDate.parse(fechaEntradaL, formato)); //Despues los paso a date para poner la fecha de entrada y salida
        Date fechaSalida = localToDate(LocalDate.parse(fechaSalidaL, formato));
        r.setFechaEntrada(fechaEntrada);
        r.setFechaFin(fechaSalida);

        rc.create(r);

    }

    //MODIFICACIONES
    public static void modificarCliente(Cliente c, String nombre, String apellidos, String dni, TarjetaDescuento tarjetaD) throws NonexistentEntityException, Exception {
        // Para editar un vehículo, primero se busca, se hacen los cambios
        // y finalmente se llama al controlador;

        if (c != null) {

            c.setNombre(nombre);
            c.setApellidos(apellidos);
            c.setDni(dni);
            c.setIdtarjetaD((tarjetaD));

        }
        cc.edit(c);
    }

    public static void modificarClienteSinTarjeta(Cliente c, String nombre, String apellidos, String dni) throws NonexistentEntityException, Exception {
        // Para editar un vehículo, primero se busca, se hacen los cambios
        // y finalmente se llama al controlador;

        if (c != null) {

            c.setNombre(nombre);
            c.setApellidos(apellidos);
            c.setDni(dni);

        }
        cc.edit(c);
    }

    public static void modificarHabitacion(Habitacion h, int nHabitacion, int nCamas, int piso, boolean aireA, boolean calefaccion) throws NonexistentEntityException, Exception {

        if (h != null) {

            h.setNumeroHabitacion(nHabitacion);
            h.setNumeroCamas(nCamas);
            h.setPiso(piso);
            h.setAireAcondicionado(aireA);
            h.setCalefaccion(calefaccion);

        }
        hc.edit(h);
    }

    public static void modficarReserva(Reserva r, Cliente c, Habitacion h, String fechaEntradaL, String fechaSalidaL) throws NonexistentEntityException, Exception {

        if (r != null) {

            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            r.setCliente(c);
            r.setHabitacion(h);

            //Pasos los string de las fechas a localdate para sacar el numero de dias
            r.setNumeroDias((int) ChronoUnit.DAYS.between(LocalDate.parse(fechaEntradaL, formato2), LocalDate.parse(fechaSalidaL, formato2)));
            r.setPrecio(r.getNumeroDias() * 10.25); //El precio del dia sera de 10.25

            Date fechaEntrada = localToDate(LocalDate.parse(fechaEntradaL, formato)); //Despues los paso a date para poner la fecha de entrada y salida
            Date fechaSalida = localToDate(LocalDate.parse(fechaEntradaL, formato));
            r.setFechaEntrada(fechaEntrada);
            r.setFechaFin(fechaSalida);

        }
        rc.edit(r);
    }

    public static void modificarTarjeta(TarjetaDescuento t, String fechaCaducidadL) throws NonexistentEntityException, Exception {

        if (t != null) {

            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            Date fechaCaducidad = localToDate(LocalDate.parse(fechaCaducidadL, formato));
            t.setFechaCaducidad(fechaCaducidad);

        }

        tc.edit(t);
    }

    public static void main(String[] args) throws NonexistentEntityException, Exception {

        // CONSULTAR LAS TABLAS PARA COMPROBAR REGISTROS
        // Creación de una tarjeta
//        crearTarjetaD();
//        System.out.println("CREACIÓN DE UNA TARJETA BANCARIA --------------");
//        Consultas.mostrarTarjetasDescuento();
//        
        // Creación de un cliente, sin tarjeta
//        System.out.println("CREACIÓN DE UN CLIENTE NUEVO --------------");
//        crearCliente();
//        Consultas.mostrarClientes();
//        
        // Creación de un cliente, asignandole la tarejeta anterior
        // Para ello busco la tarjeta y se la paso al método
//        System.out.println("CREACIÓN DE UN CLIENTE CON UNA TARJETA EXISTENTE EN LA BD --------------");
//        TarjetaDescuento t = tc.findByIDTarjetaDescuento(26);
//        crearClienteConTarjetaD(t);
//        Consultas.mostrarClientes();
//        System.out.println("CREACIÓN DE UN VEHICULO CON UN ALQUILER EXISTENTE EN LA BD --------------");
//        // Creación de un vehículo, al que se le asigna un alquiler existente
//        // Busco un alquiler y se lo asigno a este vehículo, por lo que 
//        // al vehículo que tenga el alquiler 3 se le quita. De esto se 
//        // encarga el controlador JPA.
//        Reserva res = rc.findReserva(21); // Existe
//        crearHabitacionConReservas(res);
//        Consultas.mostrarHabitaciones();
//        System.out.println("CREACIÓN DE UN ALQUILER, A PARTIR DE UN CLIENTE Y UN VEHÍCULO EXISTENTES --------------");
//
////        Cliente c = cc.findCliente(28);
//        Habitacion h = hc.findHabitacion(25);
////        crearReserva(c, h);
////        Consultas.mostrarReservas();
////        
//        System.out.println("MODIFICACIÓN DE UN VEHÍCULO --------------");
//        // Primero se busca el vehículo a modificar en la BD
//        h = hc.findByIDHabitacion(25);
//        modificarHabitacion(h);
//        Consultas.mostrarHabitaciones();
//        
//        System.out.println("BORRADO DE UN CLIENTE --------------");
//        //borrarCliente(10000); // No existe --> NonexistentEntityException
//        //borrarCliente(1); // Existe pero tiene alquileres activos --> IllegalOrphanException
//        Cliente paraBorrar = cc.findByNif("99999999A"); // Ernesto Mate
//        borrarCliente(paraBorrar.getId());
//        Consultas.mostrarClientes();
    }

}
