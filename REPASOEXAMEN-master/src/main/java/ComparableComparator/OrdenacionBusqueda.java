package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author alvaro
 */
public class OrdenacionBusqueda {

    public static void main(String[] args) {

        List<Pais> paises = new ArrayList<>();

        paises.add(new Pais("España", 46, 505_400, "Euro"));
        paises.add(new Pais("Portugal", 23, 25_400, "Euro"));
        paises.add(new Pais("USA", 146, 1_505_400, "Dolar"));
        paises.add(new Pais("Italia", 46, 505_400, "Euro"));

        paises.forEach(System.out::println);

        /*
        ************************************************************************
                                        ORDENACION
        ************************************************************************
        */
        
        
        System.out.println("ORDENADO POR NOMBRE:");

        //  COLLECTION PARA LISTAS   //  HAY Q METER LA INTERFAZ COMPARETO EN PAIS
        // USANDO COMPARABLE
        Collections.sort(paises);
        paises.forEach(System.out::println);

        // ORDENAR POR POBLACION USANDO COMPARATOR
        // PONEMOS EL CRITERIO CON UNA LAMBDA
        Collections.sort(paises, (p1, p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion()));
        System.out.println("ORDENADO POR POBLACION DE MENOR A MAYOR:");
        paises.forEach(System.out::println);

        // OTRA FORMA DE HACERLO CREANDO UN CRITERIO    
        Comparator<Pais> criterioPoblacion = (p1, p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion());
        Collections.sort(paises, criterioPoblacion.reversed()); // DE MAYOR A MENOR
        System.out.println("ORDENADO POR POBLACION DE MAYOR A MENOR:");
        paises.forEach(System.out::println);

        // HACERLO POR SUPERFICIE
        Collections.sort(paises, (p1, p2) -> Long.compare(p1.getSuperficie(), p2.getSuperficie()));
        System.out.println("ORDENADO POR SUPERFICIE:");
        paises.forEach(System.out::println);

        // DOS CRITERIOS DE ORDENACION       NOMBRE Y POBLACION         CONCATENACION
        Comparator<Pais> criterioNombre = (p1, p2) -> (p1.getNombre().compareToIgnoreCase(p2.getNombre()));
        Collections.sort(paises, criterioNombre.thenComparing(criterioPoblacion));
        
        
        
        /*
        ************************************************************************
                                        BUSQUEDA
        ************************************************************************
        */
        
        
        System.out.println("""
                           
                           ************************************************************************
                                                         BUSQUEDA
                           ************************************************************************
                           """);
        
        // POR ORDEN NATURAL
        
        // LA LISTA DEBE ESTAR ORDENADA SEGUN EL CRITERIO DE ORDEN 
        // (ES EL METODO Q SE CREA NUEVO EN LA CLASE PAIS, CON EL IMPLEMENTS COMPARABLE)
        // EN ESTE CASO EL NOMBRE
        Collections.sort(paises);
        System.out.println("Ordenada por orden natural (nombre):");
        paises.forEach(System.out::println);
        
        // BUSCAMOS PORTUGAL
        Pais objBuscar = new Pais();
        
        // CREAMOS UN OBJETO CON EL NOMBRE DEL Q BUSCAREMOS
        objBuscar.setNombre("portugal");    // LISTA ORDENADA POR NOMBRE, BUSQUEDA POR NOMBRE, KEY ES NOMBRE
        
        int posicion = Collections.binarySearch(paises, objBuscar); // NO SE LE PASA EL CRITERIO X SER COMPARABLE, YA SABE Q ESTA ORDENADA POR NOMBRE
        
        System.out.println("Portugale esta en la posicion: "+posicion);
        
        // SI INENTO BUSCAR EN LA LISTA CON UN VALOR Q NO ES NOMBRE 
        // SE PUEDE OBTENER UNA POSICION ERRONEA                    // NO SE PUEDE BUSCAR POR OTRO CRITERIO DIFERENTE AL NATURAL
        objBuscar.setNombre("");
        objBuscar.setPoblacion(23);
        
        posicion = Collections.binarySearch(paises, objBuscar);
        System.out.println("Fallo por la busqueda: "+posicion);
        
        
        
        // SI ORDENO POR UN CRITERIO Y BUSCO POR OTRO EL RESULTADO ES INESPERADO
        // (SI ORDENO POR NOMBRE Y BUSCO POR POBLACION)
        
        posicion = Collections.binarySearch(paises, objBuscar,criterioPoblacion); // COMPARATOR
        System.out.println("Fallo por la busqueda con otro criterio: "+posicion);
        
        
        // ORDENACION Y BUSQUEDA POR POBLACION
        System.out.println("\nOrdenacion y busqueda por poblacion:");
        Collections.sort(paises, criterioPoblacion);
        paises.forEach(System.out::println);
        
        // BUSCAMOS 146
        Pais objetoBuscar = new Pais();
        objetoBuscar.setPoblacion(146);
        //                                       LISTA     OBJETO Q BUSCAMOS    CRITERIO
        posicion = Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);
        
        System.out.println("El país q de la busqueda es: " + paises.get(posicion));
    }
}
