/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Fer
 */
final public class Temperatura extends Sensor {

    private final double MAX_TEM = 35;
    private final double MIN_TEM = 10;

    public Temperatura(int id) {
        super(id);
    }

    public double getMAX_TEM() {
        return MAX_TEM;
    }

    public double getMIN_TEM() {
        return MIN_TEM;
    }

    public void max_tem(double temperatura) {

        if (temperatura > this.MAX_TEM) {
            Alarma();
        }
    }

    public void min_tem(double temperatura) {

        if (temperatura < this.MIN_TEM) {
            Alarma();
        }
    }

    @Override
    public String toString() {
        return "Temperatura{" + "MAX_TEM=" + MAX_TEM + ", MIN_TEM=" + MIN_TEM + '}';
    }
    
    

    @Override
    public void Alarma() {
        System.out.println("Esta sonando la alarma de temperatura");
    }

}
