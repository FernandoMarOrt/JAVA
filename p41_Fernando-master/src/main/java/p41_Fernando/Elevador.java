package p41_Fernando;

import java.time.LocalDate;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author fer
 */
public class Elevador {

    private int numeroSerie; //De forma aleatoria
    private String fabricante;
    private int capacidadMaxima; //No puede ser menor que 0 o mayor que 10 
    private double pesoMaximo; //No puede ser menor que 0 o mayor que 800kg
    private LocalDate fechaFabricacion; //Durante la creacion fecha actual
    private LocalDate fechaUltimaRevision; //Durante la creacion fecha actual
    private String planta; //Su estado inicial sera null
    private String estado;
    //Si algun parametro durante la construccion del objeto, no esta correctamente
    //establecido se dejara con valores por defecto

    public Elevador(int numeroSerie, String fabricante, int capacidadMaxima, double pesoMaximo, LocalDate fechaFabricacion, LocalDate fechaUltimaRevision, String planta, String estado) {
        this.numeroSerie = NumeroSerie(); //Le doy el valor de 8 digitos aleatorio
        this.fabricante = fabricante;
        this.capacidadMaxima = capacidadMaxima;
        this.pesoMaximo = pesoMaximo;
        this.fechaFabricacion = LocalDate.now(); //La inicializo a la fecha actual
        this.fechaUltimaRevision = LocalDate.now(); //La inicializo a la fecha actual
        this.planta = null; //Hago que el estado inicial de la planta sea nulo
        this.estado = estado;
    }

    public Elevador() {
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public LocalDate getFechaUltimaRevision() {
        return fechaUltimaRevision;
    }

    public void setFechaUltimaRevision(LocalDate fechaUltimaRevision) {
        this.fechaUltimaRevision = fechaUltimaRevision;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Elevador{" + "numeroSerie=" + numeroSerie + ", fabricante=" + fabricante + ", capacidadMaxima=" + capacidadMaxima + ", pesoMaximo=" + pesoMaximo + ", fechaFabricacion=" + fechaFabricacion + ", fechaUltimaRevision=" + fechaUltimaRevision + ", planta=" + planta + ", estado=" + estado + '}';
    }

    //Genero un numero aleatorio de 8 digitos para el numero de serie
    private static int NumeroSerie() {

        int numeroSerieElevador;

        Random numAleatorio = new Random();

        numeroSerieElevador = numAleatorio.nextInt(00000000, 99999998 + 1);
        
        System.out.println(numeroSerieElevador);

        return numeroSerieElevador;

    }

    //Verifico que la capacidad no sea menor que 0 y mayor que 10
    public void verificarCapacidad() {

        if (this.capacidadMaxima < 0 || this.capacidadMaxima > 10) {

            this.capacidadMaxima = 0;

        }

    }

    //Vericio que el peso no sea inferior a 0 o mayor a 800kg
    public void verificarPeso() {

        if (this.pesoMaximo < 0 || this.pesoMaximo > 800) {

            this.pesoMaximo = 0;

        }
    }

    //Evalua si es posible el viaje del elevador 
    public boolean mover(int numeroViajeros, double pesoViajeros, int plantaAMover) {

        boolean mover = true;

        //Conviertoe el string de planta a un entero para poder evaluar si es posible el viaje 
        int plantaNumerica = Integer.parseInt(this.planta);

        //Si el numero de viajeros o la capacidad maxima son mayores de 
        //lo permitido o la planta es la misma o la planta es negativa
        //El viaje no sera posible de efectuar
        if (numeroViajeros > this.capacidadMaxima || pesoViajeros > this.pesoMaximo || plantaNumerica == plantaAMover || plantaAMover < 0) {

            mover = false;
        }

        //Actualiza el estado a subiendo o bajando en funcion de si la planta
        //a donde se desea mover es mayor a la que esta se actualizara a subiendo
        //si es menor a que esta se actualizara a bajando
        if (mover == true) {

            if (plantaAMover > plantaNumerica) {

                this.estado = "Subiendo";

            } else if (plantaAMover < plantaNumerica) {

                this.estado = "Bajando";

            }

        }

        return mover;
    }

}
