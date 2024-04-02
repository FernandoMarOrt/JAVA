/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafetera;

/**
 *
 * @author fer
 */
public class Cafetera {
    
    private double capacidadMaxima;//cantidad maxima de cafe 
    private double cantidadActual;//cantidad actual de cafe que hay en la cafetera

    //Constructor por defecto/predeterminado sin parametros y modifico 
    public Cafetera() {
        
        this.capacidadMaxima = 1000; 
        this.cantidadActual = 0; //cafetera vacia 
        
    }
    
    //Igualo la capacidad de la cafetera actual a la maxima
    public Cafetera(double capacidadMaxima) {
        
        this.cantidadActual = capacidadMaxima;
        
    }
    
    //Si la cantidad actuals supera la capacidad maxima
    //La capacidad actual sera igual a la maxima
    public Cafetera(double capacidadMaxima, double cantidadActual) {
        
        if (cantidadActual > capacidadMaxima) {
            
            this.cantidadActual = capacidadMaxima;
        }
    }
    
    //Iguala la cantidad actual a la maxima 
    public void llenarCafetera() {
        
        this.cantidadActual = this.capacidadMaxima;
        
    }
    
    public void servirTaza(double cantidadAServir) {
        
        double cantidadDeTaza;
        
        //Si la cantidad a servir es mayor que la cantidad que queda
        //La cantidad de la taza sere lo que queda de la cafetera
        if(cantidadAServir > this.cantidadActual) {
            
            cantidadDeTaza = this.cantidadActual;
            
            this.cantidadActual = 0;
            
        }else {
            
            cantidadDeTaza = cantidadAServir;
            
            //Resta la cantidad a servir de la cantidad actual 
            this.cantidadActual  -= cantidadAServir;
            
        }
        
        
        
    }
    
    //Vacia la cafetera es decir iguala la cantidad actual a 0
    public void vaciarCafetera() {
        
        this.cantidadActual = 0;
        
    }
    
    public void agregarCafe(double cantidadAgregar) {
        
        //Si se le agrega mas de la cantidad maxima permitida
        //simplemente llegara al limite y la cantidad actual se igualara a la 
        //maxima
        if(cantidadAgregar > this.capacidadMaxima) {
            
            this.cantidadActual = this.capacidadMaxima;
        } else {
            
            this.cantidadActual =+ cantidadAgregar;
        }
        
        
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima +
                ", cantidadActual=" + cantidadActual + '}';
    }
    
    
    
}
