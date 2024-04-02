package p21fernando;

import java.util.Scanner;

/*La tienda PCRoto se dedica a reparar dispositivos portátiles. 
De lunes a viernes 
reparan un montón de ordenadores y como son una tienda low cost, cobran lo mismo 
por todas las reparaciones.
La idea es que tu programa ayude a los dueños de la tienda a saber cuánto han 
cobrado cada día y al final de la semana, suponiendo que todas las reparaciones 
cuestan 32.6€ (double) y todas las semanas trabajan de lunes a viernes (5 días). 
Una vez leídos los datos del número de reparaciones que hay cada día (
de lunes a viernes) se deben mostrar los datos de lo que se ha cobrado cada día 
(float) y al final de la semana (float). T
en en cuenta que se debe limitar la salida 
por consola a 3 números decimales.
En esta parte todos los datos deben leerse por teclado usando Scanner y
mostrarse usando la consola.*/
public class PARTEA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        //Declaro primero todas las variables que voy a necesitar para preguntar
//        //cuantas reparaciones hacen cada dia
//        int reparacionesLunes, reparacionesMartes,
//                reparacionesMiercoles, reparacionesJueves, reparacionesViernes;
//
//        //Declaro una constante para el precio de reparaciones
//        final double PRECIOREPARACION = 32.6;
//
//        //Pregunto por consola los datos que voy a necesitar
//        System.out.print("Dime el numero de reparaciones que "
//                + "has realizado el lunes: ");
//        reparacionesLunes = scanner.nextInt();
//
//        System.out.print("Dime el numero de reparaciones que "
//                + "has realizado el martes: ");
//        reparacionesMartes = scanner.nextInt();
//
//        System.out.print("Dime el numero de reparaciones que "
//                + "has realizado el miercoles: ");
//        reparacionesMiercoles = scanner.nextInt();
//
//        System.out.print("Dime el numero de reparaciones que "
//                + "has realizado el jueves: ");
//        reparacionesJueves = scanner.nextInt();
//
//        System.out.print("Dime el numero de reparaciones que "
//                + "has realizado el viernes: ");
//        reparacionesViernes = scanner.nextInt();
//
//        //Realizo las operaciones para calcular el total de cada dia
//        float totalLunes = (float) (reparacionesLunes * PRECIOREPARACION);
//        float totalMartes = (float) (reparacionesMartes * PRECIOREPARACION);
//        float totalMiercoles = (float) (reparacionesMiercoles
//                * PRECIOREPARACION);
//        float totalJueves = (float) (reparacionesJueves * PRECIOREPARACION);
//        float totalViernes = (float) (reparacionesViernes * PRECIOREPARACION);
//
//        //Realizo la operacion para calcular el total de lo 
//        //que han ganado en la semana
//        float totalSemana = totalLunes + totalMartes + totalMiercoles
//                + totalJueves + totalViernes;
//
//        //Muestro los resultados en este caso por un text block 
//        //Y ajusto el formato del texto para que solo salgan 3 decimales 
//        String resultados = """
//                          El lunes han cobrado un total de:             %.3f€
//                          El martes han cobrado un total de:            %.3f€
//                          El miercoles han cobrado un total de:         %.3f€
//                          El jueves han cobrado un total de:            %.3f€
//                          EL viernes han cobrado un total de:           %.3f€ 
//                          Al final de la semana han ganado un total de: %.3f€
//
//                          """.formatted(totalLunes, totalMartes,
//                totalMiercoles, totalJueves,
//                totalViernes, totalSemana);
//
//        System.out.println(resultados); //Imprimo el resultado
        
        int prueba = 1;
        float total = (float) (prueba);
        System.out.println(total);

    }
}
