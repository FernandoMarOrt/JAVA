package Secuenciales;

import javax.swing.JOptionPane;

public class EJ10 {
    
    //Una empresa constructora se dedica a realizar bloques de pisos en parcelas como las que figuran en la imagen de la derecha. 
    //Necesitan saber el área de la parcela según las medidas A, B y C. 
    //Realiza el ejercicio usando JOption para solicitar y mostrar datos al usuario.

    
    public static void main(String[] args) {
        
        //Declaro las variables
        
        double valorA;
        double valorB;
        double valorC;
        
        //Pido los valores de las variables a rellenar
        String valorAString = JOptionPane.showInputDialog(" Introduce el valor de A");
        valorA = Double.parseDouble(valorAString);
        
        String valorBString = JOptionPane.showInputDialog(" Introduce el valor de B");
        valorB = Double.parseDouble(valorBString);
        
        String valorCString = JOptionPane.showInputDialog(" Introduce el valor de C");
        valorC = Double.parseDouble(valorCString);
        
        
        double trianguloArea = ((valorA - valorC) * valorB) / 2; //Realiza el area del triangulo || valorA - valorC es para determinar el lado del triangulo
        double rectanguloArea = valorB * valorC; //Realizar el area del rectangulo
        double areaTotal = trianguloArea + rectanguloArea; //Sumo las areas para calcular el area total de la parcela
              
        JOptionPane.showMessageDialog(null, "El area total de la parcela es: " + areaTotal); //Muestro la solucion por una pantalla de texto
        
    }
    
}