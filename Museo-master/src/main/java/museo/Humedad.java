/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Fer
 */
final public class Humedad extends Sensor {

    private final double MAX_HUMEDAD = 30;
    private final double MIN_HUMEDAD = 5;

    public Humedad(int id) {
        super(id);
    }

    public double getMAX_HUMEDAD() {
        return MAX_HUMEDAD;
    }

    public double getMIN_HUMEDAD() {
        return MIN_HUMEDAD;
    }

    @Override
    public String toString() {
        return "Humedad{" + "MAX_HUMEDAD=" + MAX_HUMEDAD + ", MIN_HUMEDAD=" + MIN_HUMEDAD + '}';
    }
    
    public void max_hum(double humedad) {

        if (humedad > this.MAX_HUMEDAD) {
            Alarma();
        }
    }

    public void min_hum(double humedad) {

        if (humedad < this.MIN_HUMEDAD) {
            Alarma();
        }
    }

    @Override
    public void Alarma() {
        
        System.out.println("La alarma de humedad esta sonando");
    }

}
