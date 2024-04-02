/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacionbusqueda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author fer
 */
public class ordenacionbusqueda {

    public static void main(String[] args) {

        List<pais> paises = new ArrayList<>();
       
        paises.add(new pais("España", 46, 505_400, "Euro"));
        
        paises.add(new pais("Portugal", 23, 25_400, "Euro"));
        
        paises.add(new pais("Estados Unidos", 146, 1_505_400, "Dolar Americano"));
        
        paises.add(new pais("Italia", 46, 505_400, "Euro"));
        
        
        
        paises.forEach(System.out::println);
        
        
        //Collection: 
        
        
            //Ordenaciones (sort)
            
                //implementacion <<Comparable>>
                
                //<<Comparator>>
                
                
            //Busqueda (binarySearch)
            
                //implementacion <<Comparable>>
                
                //<<Comparator>>
                
                
        
        //Ordenar por moneda
        //Ordenacion usando orden natural , requiere que pais(la clase) implemente comparatos
        Collections.sort(paises);
        
        System.out.println("");
        paises.forEach(System.out::println);
        System.out.println("");
        
        
        //Operacion con comparator proporcionamos el criterio mediante una lambda
        //Comparar y ordenar los pais por poblacion 
        Comparator<pais> criterioPoblacion = (p1,p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion());
        
        Collections.sort(paises,criterioPoblacion.reversed()); //lo ordenada al reves
        
//        Collections.sort(paises, (p1,p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion()));
        
        paises.forEach(System.out::println);
        
        
        //ORDENADA POR NOMBLE despues por poblacion
        Comparator<pais> criterioNOmbre = (p1,p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre());
        
        
        Collections.sort(paises, criterioNOmbre.thenComparing(criterioPoblacion));
    }

}
