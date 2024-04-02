package objetos;

import java.util.Scanner;
import java.util.Set;

public class MisVehiculos {
    
    public static void main(String[] args) {
        
        //Instancia de la clase escaner
        //Llamada teclado
        Scanner teclado = new Scanner (System.in); //OTRO OBJETO
        
        //Instancia de la clase vehiculo llamado v1
        //Todas las clases empiezan por mayuscula
        Vehiculo v1 = new Vehiculo(); //OTRO OBJETO V1
        
        v1.setMatricula("1234RRR");
        
        v1.setColor("verde");
        
        System.out.println("Matricula de v1 " + v1.getMatricula());
        System.out.println("Modelo de v1 " + v1.getModelo()); //Saldra null ya que no le hemmos asignado valor
        
        
        Vehiculo ferrari = new Vehiculo(); //ESTO ES UN OBJETO FERRARI
        ferrari.setColor("Rosa chicle");
        ferrari.setModelo("tetarrosa");
        ferrari.setMarca("Ferrari");
        
        System.out.println("Color del ferrari" + ferrari.getColor());
        
        
        
        
        
        
        //TODO LO DE ARRIBA SE RESUME EN ESTO:
        
        
        //NEW RESERVA UNA MEMORIA UN CACHO
        //si me pongo entre los parentesis y le doy a "ctrl espacio" se auto rellena y solo le voy cambiando los valores
        Vehiculo mercedes = new Vehiculo("111AAA", "12345",
                "MERCEDES", "A1", "NEGRO",
                23.5, true);//new Vehiculo() seria el constructor ES NECESARIO
        //TIENEN QUE IR EN ORDEN LOS DATOS COMO SI FUER AUN TEXT BLOCK CON LAS VARIABLES
        
        System.out.println("Mercedes tarifa" +  mercedes.getTarifa() );
        
        //Vehiculo jeep = new Vehiculo("234234234", "gris", "asdfghj");
        
        //System.out.println("jeep marca" + jeep.getMarca());
        //Saldra null ya que no le he dado valor en este constructor
        
        //Este en cambio si tendra porque esta arriba
        //System.out.println("jeep matricula" + jeep.getMatricula());
        //System.out.println("jeep matricula" + jeep.getMatricula());
        
        
        //jeep.setMatricula("ASVDSDGG");
        
        
        
        
        System.out.println(mercedes.toString());
        System.out.println(mercedes);//Este es igual al de arriba
        System.out.println(v1);
        
        //HACER EJERCICIOS 7 8 9 INTRODUCCION 
                
     
    }
    
}
