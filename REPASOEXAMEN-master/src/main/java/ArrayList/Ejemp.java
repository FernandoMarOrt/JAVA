package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class Ejemp {
    
    public static void main(String[] args) {
        //CREACION
        ArrayList <Integer> listasEnteros = new ArrayList<>();
        
        //AÑADIR
        listasEnteros.add(10);
        listasEnteros.add(9);
        listasEnteros.add(8);
        listasEnteros.add(7);
        listasEnteros.add(6);
        
        //DEVOLVER NUMERO DE ELEMENTOS EN LA LISTA
        System.out.println("Tamaño: " + listasEnteros.size() + "\n");
        
        //MOSTRAR   SE HACE CON UN GET      TAMBIEN SE PUEDE HACER CON FOR EACH
        listasEnteros.forEach(System.out::println);
        
        for (int i = 0; i < listasEnteros.size(); i++) {
            System.out.println("Elemento " + (i+1) + ": " + listasEnteros.get(i));
            //System.out.println("Poscicion " + i + ": " + listasEnteros.get(i));
        }
        
        
        //VER SI CONTIENE UN NUMERO O LO Q SEA
        if (listasEnteros.contains(7)) {
            System.out.println("El 7 esta en la lista");
        }
        
        //BUSCAR ALGO PARA DEVOLVER POSICION
        int posicion = listasEnteros.indexOf(6);
        System.out.println(posicion);
        
        //BORRAR UN ELEMENTO
        listasEnteros.remove(4);    //BORRA UNO Y ACOPLA TODO EL ARRAY  SI NO ENCUENTRA EL INDEX TE SALTA EXCEPCION OUTOFBOUND
        
        //BORRAR OBJETOS
        Integer numero = 10;
        listasEnteros.remove(numero);
        
        
        //SET PARA CAMBIAR EL ELEMNTO EN EL INDEX Q INDIQUES        MACHACA EL OTRO NUMERO
        listasEnteros.set(0, 200);
        listasEnteros.forEach(System.out::println);
        
    }
}
