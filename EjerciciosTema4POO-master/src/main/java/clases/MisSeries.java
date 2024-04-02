/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author fer
 */
public class MisSeries {
    
    public static void main(String[] args) {
        Serie simpson = new Serie("Los Simpson\n", "Comedia", "Serie de dibujos animados", 1000, "Fox");
                
        System.out.println(simpson);
        Serie house = new Serie();
        
        System.out.println(house);
        Serie prisonBreak = new Serie("PrisonBreak", "Accion", "SeriePadre", 5, "AMC", 12000000);
        
        
        //Crear un objeto serie leyendo los datos por teclado
        
        Serie peakeBlinders = ServicioSerie.leerTecladoSerie();
        System.out.println(peakeBlinders);
        
        
        ServicioSerie.darLike(prisonBreak);
        System.out.println(prisonBreak);
        ServicioSerie.darLike(peakeBlinders);
        System.out.println(peakeBlinders);
        
        
    }
    
  
    
}
