package Secuenciales;

import javax.swing.JOptionPane;

public class EJ11 {
    
    //Se requiere obtener el área de la figura, a partir de R y H. Realiza un algoritmo para resolver el problema.
    
    public static void main(String[] args) {
        
        //Declaro las variables
        double valorR;
        double valorH;
        
        //Pregunto el valor de las variables
        String valorRString = JOptionPane.showInputDialog(" Introduce el valor de R");
        valorR = Double.parseDouble(valorRString);
        
        String valorHString = JOptionPane.showInputDialog(" Introduce el valor de H");
        valorH = Double.parseDouble(valorHString);
        
        final double PI = Math.PI; //Igualo la variable PI al valor de PI
        
        double semicirculoArea = (PI * Math.pow(valorR, 2))/2; //Calculo la area del semicirculo
        double trianguloAltura = Math.sqrt(Math.pow(valorH, 3) - Math.pow(valorR, 2)); //Calculo la altura del triangulo
        double trianguloArea = ((valorR * 2) * trianguloAltura)/2; //Calculo el area del triangulo
        double areaTotal = semicirculoArea + trianguloArea; //Sumo las 2 areas para determinar el area total de la figura
              
        //Muestro la solucion por una pantalla de texto y le aplica el Math.round para que salgan solo 2 decimales
        JOptionPane.showMessageDialog(null, "El area total de la figura es: " + Math.round(areaTotal * 100d) / 100d); 
        
    }
    
}