package p21fernando;

import javax.swing.JOptionPane;

/*Modifica el ejercicio anterior para que la lectura de datos y
la salida por pantalla usen diálogos JOptionPane.
Además, en esta parte, se debe preguntar cuánto se va a cobrar por reparación 
cada día de la semana (double) y luego preguntar cuántas reparaciones
se han hecho cada día (int). Una vez leídos los datos, calcula lo que
se cobra cada día y al final de la semana, guardando los datos en tipos float.
Usa un text block, limitando la salida a 1 decimal, para usarlo en un 
JOptionPane
que muestre la información de salida.
Guarda el resultado de evaluar si se ha cobrado al final de la semana 
más de 1000€, 
mostrando el resultado por consola*/
public class PARTEB {

    public static void main(String[] args) {

        //Declaro primero todas las variables que voy 
        //a necesitar para preguntar
        //cuantas reparaciones hacen cada dia
        int reparacionesLunes, reparacionesMartes, reparacionesMiercoles,
                reparacionesJueves, reparacionesViernes;

        //Declaro las variables que necesito para guardar el precio
        //de reparacion de cada dia 
        double pReparacionLunes, pReparacionMartes, pReparacionMiercoles,
                pReparacionJueves, pReparacionViernes;

        //Pregunto primero por el precio de reparacion de cada dia
        String pReparacionLunesString = JOptionPane.showInputDialog(
                "Dime el precio de reparaciones de el lunes");
        pReparacionLunes = Double.parseDouble(pReparacionLunesString);

        String pReparacionMartesString = JOptionPane.showInputDialog(
                "Dime el precio de reparaciones de el martes");
        pReparacionMartes = Double.parseDouble(pReparacionMartesString);

        String pReparacionMiercolesString = JOptionPane.showInputDialog(
                "Dime el precio de reparaciones de el miercoles");
        pReparacionMiercoles = Double.parseDouble(pReparacionMiercolesString);

        String pReparacionJuevesString = JOptionPane.showInputDialog(
                "Dime el precio de reparaciones de el jueves");
        pReparacionJueves = Double.parseDouble(pReparacionJuevesString);

        String pReparacionViernesString = JOptionPane.showInputDialog(
                "Dime el precio de reparaciones de el viernes");
        pReparacionViernes = Double.parseDouble(pReparacionViernesString);

        //Preguntos despues por las reparaciones que se han hecho cada dia 
        String reparacionesLunesString = JOptionPane.showInputDialog(
                "Dime el numero de reparaciones que "
                + "has realizado el lunes");
        reparacionesLunes = Integer.parseInt(reparacionesLunesString);

        String reparacionesMartesString = JOptionPane.showInputDialog(
                "Dime el numero de reparaciones que "
                + "has realizado el martes");
        reparacionesMartes = Integer.parseInt(reparacionesMartesString);

        String reparacionesMiercolesString = JOptionPane.showInputDialog(
                "Dime el numero de reparaciones que "
                + "has realizado el miercoles");
        reparacionesMiercoles = Integer.parseInt(reparacionesMiercolesString);

        String reparacionesJuevesString = JOptionPane.showInputDialog(
                "Dime el numero de reparaciones que "
                + "has realizado el jueves");
        reparacionesJueves = Integer.parseInt(reparacionesJuevesString);

        String reparacionesViernesString = JOptionPane.showInputDialog(
                "Dime el numero de reparaciones que "
                + "has realizado el viernes");
        reparacionesViernes = Integer.parseInt(reparacionesViernesString);

        //Realizo las operaciones para calcular el total de cada dia
        float totalLunes = (float) (reparacionesLunes * pReparacionLunes); //
        float totalMartes = (float) (reparacionesMartes * pReparacionMartes);
        float totalMiercoles = (float) (reparacionesMiercoles
                * pReparacionMiercoles);
        float totalJueves = (float) (reparacionesJueves * pReparacionJueves);
        float totalViernes = (float) (reparacionesViernes * pReparacionViernes);

        //Realizo la operacion para calcular el total de 
        //lo que han ganado en la semana
        float totalSemana = totalLunes + totalMartes
                + totalMiercoles + totalJueves + totalViernes;

        //Compruebo si al final de la semana se ha cobrado mas de 1000€
        boolean cobradoMas1000 = totalSemana > 1000;

        //Muestro los resultados en este caso por un text block 
        //Y ajusto el formato del texto para que solo salga 1 decimal 
        String resultados = """
                          El lunes han cobrado un total de:             %.1f€
                          El martes han cobrado un total de:            %.1f€
                          El miercoles han cobrado un total de:         %.1f€
                          El jueves han cobrado un total de:            %.1f€
                          El viernes han cobrado un total de:           %.1f€ 
                          Al final de la semana han ganado un total de: %.1f€

                          """.formatted(totalLunes, totalMartes,
                totalMiercoles, totalJueves, totalViernes,
                totalSemana);

        //Finalmente muestro el resultado por una ventana de texto
        //con Joption y text block
        JOptionPane.showMessageDialog(null, resultados);

        //Imprimo por consola el resultado de la variable si ha 
        //cobrado mas de 1000€ en la semana
        System.out.println("Se ha cobrado al final de la semana mas de 1000€: "
                + cobradoMas1000);

    }
}
