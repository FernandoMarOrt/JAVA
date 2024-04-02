package secuenciales;

import javax.swing.JOptionPane;

public class EJ04 {
    
    public static void main(String[] args) {
        
        final double SERVICIOFIJO =1.25;
        final double PRECIOKM = 0.08;
        
        double kilometros;
 
        String kilometrosString = JOptionPane.showInputDialog(" Introduce los kilometros que has recorrido");
        kilometros = Double.parseDouble(kilometrosString);
        
    }
    
}
