package Secuenciales;

import javax.swing.JOptionPane;

public class EJ04 {
    
    //Uber establece un precio mínimo por servicio de 1,25€ fijos y además 8 céntimos por Km recorrido. 
    //Elabora un programa que lea el número de km a recorrer y proporcione el presupuesto
    
    public static void main(String[] args) {
        
        final double SERVICIOFIJO =1.25; //Declaro el servicio como constante
        final double PRECIOKM = 0.08; // Declaroe el precio km tambien como constante
        
        double kilometros;
 
        String kilometrosString = JOptionPane.showInputDialog(" Introduce los kilometros que has recorrido");
        kilometros = Double.parseDouble(kilometrosString);
        
        double presupuesto = (kilometros * PRECIOKM) + SERVICIOFIJO; //Realiza la operacion para calcular el presupuesto
              
        JOptionPane.showMessageDialog(null, "Tu presupuesto es: " + presupuesto + "€" ); //Muestro la solucion por una pantalla de texto
        
    }
    
}