package Secuenciales;

import javax.swing.JOptionPane;

public class EJ05 {
    
    //Cada grupo de clase de un centro educativo tiene 30 horas de clase a la semana. 
    //Calcula el número de profesores que se necesitan, 
    //teniendo en cuenta que un profesor imparte un número de horas de clase a la semana, 
    //que se debe pedir al usuario, junto con el número total de grupos que tiene el centro escolar.
    
    public static void main(String[] args) {
        
        final int HORASGRUPODECLASE = 30; //Declaro las horas del grupo como constante
        
        int numeroHorasProfesores;
        int numeroGrupos;
 
        String numeroHorasProfesoresString = JOptionPane.showInputDialog(" Introduce el numero de horas que imparte un profesor a la semana");
        numeroHorasProfesores = Integer.parseInt(numeroHorasProfesoresString);
        
        String numeroGruposString = JOptionPane.showInputDialog(" Introduce el numero de grupos que hay en total");
        numeroGrupos = Integer.parseInt(numeroGruposString);
        
        int numeroProfesores = (HORASGRUPODECLASE * numeroGrupos) /numeroHorasProfesores; //Realizo la operacion para saber el numero de 
              
        JOptionPane.showMessageDialog(null, "Se necesitan: " + numeroProfesores + " profesores"); //Muestro la solucion por una pantalla de texto
        
    }
    
}