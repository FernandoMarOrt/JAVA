package Secuenciales;

import javax.swing.JOptionPane;

public class EJ07 {
    
    //Conversor de euros a dolares
    
    public static void main(String[] args) {
        
        final double VALORDOLAR = 0.98; //Declaro el valor del dolar como constante
        
        double euros;
 
        String eurosString = JOptionPane.showInputDialog(" Introduce la cantidad de euros que quieres convertir");
        euros = Double.parseDouble(eurosString);
        
        double dolares = euros * VALORDOLAR; //Hago la conversion de euros a dolares
              
        JOptionPane.showMessageDialog(null, euros + "€ son " + dolares + "$" ); //Muestro la solucion por una pantalla de texto
        
    }
    
}