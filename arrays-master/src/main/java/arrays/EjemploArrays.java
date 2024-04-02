/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author fer
 */
public class EjemploArrays {
    
    public static void main(String[] args) {
        
        //numeros[0] = 1, numeros[1] = 2..... numeros[11] = 12,
        int [] numeros = {1,2,3,4,5,6,7,8,9,10,11,12};
        
        
        System.out.println("Elemento de indice 5: " + numeros[5]);
        
        
        //Puedo recorrer cualquier elemento dentro del rango 0 y numeros.length -1
//        System.out.println("Elemento de indice -1 " + numeros[12]);
        
        
        
        System.out.println("Tamaño del arrayz: " + numeros.length);
        
        //IMPRIMIMOS POR CONSOLA TODOS LOS ELEMENTOS DEL ARRAYZ
        
        for (int i = 0; i<numeros.length; i++){
            
            System.out.println(" - " + numeros[i]);
        }
        
//        
//        for (int i = 0; i < numeros.length; i++) {//CONTROL ESPACIO LA 3 OPCION EMPEZANDO POR ABAJO
//            int numero = numeros[i];
//            
//        }
        
        
        //foreach
        
        System.out.println("-----------------------------------------");
        
        
        //foreach la izquirda recibe el dato (int aux) y la parte derecha la estructura de datos (numeros)
        for(int aux:numeros) {
            
            System.out.println(" - " + aux);
        }
        
        
        
        
        
        //cambio la posicion 5 del arrayz al valor 90
        
        
        System.out.println("-------------------------");
        numeros[5] = 90;
        
        System.out.println(""  + numeros[5]);
        
        
    }
    
}
