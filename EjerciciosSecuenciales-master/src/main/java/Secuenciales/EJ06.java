package Secuenciales;

import javax.swing.JOptionPane;

public class EJ06 {
    
    //Tres personas deciden invertir su dinero para formar una empresa. 
    //Cada una de ellas invierte una cantidad distinta, que debes solicitar al usuario por teclado.
    //Implementa un algoritmo que imprima el porcentaje que invierte cada uno con respecto al total de la inversión.
    
    public static void main(String[] args) {
        //Declaro las variables con las que voy a guardar datos
        double cantidadPersona1;
        double cantidadPersona2;
        double cantidadPersona3;
        
        //Pregunto todos los datos
        String cantidadPersona1String = JOptionPane.showInputDialog(" Introduce la cantidad de dinero que ha invertido la primera persona");
        cantidadPersona1 = Double.parseDouble(cantidadPersona1String);
        
        String cantidadPersona2String = JOptionPane.showInputDialog(" Introduce la cantidad de dinero que ha invertido la segunda persona");
        cantidadPersona2 = Double.parseDouble(cantidadPersona2String);
        
        String cantidadPersona3String = JOptionPane.showInputDialog(" Introduce la cantidad de dinero que ha invertido la tercera persona");
        cantidadPersona3 = Double.parseDouble(cantidadPersona3String);
        
        double totalInversion = cantidadPersona1 + cantidadPersona2 + cantidadPersona3; //Calculo el total invertido
        double porcentajeP1 = (cantidadPersona1 * 100) / totalInversion; //Calculo el porcentaje invertido con una regla de 3 de la persona 1
        double porcentajeP2 = (cantidadPersona2 * 100) / totalInversion; //Calculo el porcentaje invertido con una regla de 3 de la persona 2
        double porcentajeP3 = (cantidadPersona3 * 100) / totalInversion; //Calculo el porcentaje invertido con una regla de 3 de la persona 3
        
        //Imprimo por una pantalla el resultado y aplico el Math.round para sacar solo 2 decimales
        JOptionPane.showMessageDialog(null, "La persona 1 ha invertido un " + Math.round(porcentajeP1 * 100d) / 100d + "%"); 
        JOptionPane.showMessageDialog(null, "La persona 2 ha invertido un " + Math.round(porcentajeP2 * 100d) / 100d + "%");
        JOptionPane.showMessageDialog(null, "La persona 3 ha invertido un " + Math.round(porcentajeP3 * 100d) / 100d + "%");
        
    }
    
}