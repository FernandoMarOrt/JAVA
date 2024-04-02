package Secuenciales;

import javax.swing.JOptionPane;

public class EJ09 {
    
    //Programa que pida el precio de un artículo y calcule su valor aplicándole un 21% de IVA
    
    public static void main(String[] args) {
        
        final double IVA = 1.21; //Declaro como constante y lo inicializo 100% + 21% (IVA) = 121% = 1.21
        
        double precioArticulo;
 
        String precioArticuloString = JOptionPane.showInputDialog(" Introduce el precio del articulo");
        precioArticulo = Double.parseDouble(precioArticuloString);
        
        double precioConIVA = precioArticulo * IVA; //Calculo el precio con IVA
              
        JOptionPane.showMessageDialog(null, "El precio del articulo con iva es de " + precioConIVA + "€"); //Muestro la solucion por una pantalla de texto
        
    }
    
}