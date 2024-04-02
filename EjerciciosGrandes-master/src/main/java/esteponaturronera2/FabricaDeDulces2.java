package esteponaturronera2;

import javax.swing.JOptionPane;

public class FabricaDeDulces2 {

    public static void main(String[] args) {

        //Variables que voy a utilizar
        String menu = "";
        double materiaPrima;
        double costeProduccion;
        final double LIMITE_INFERIOR_OBRA = 0.5;
        final double LIMITE_SUPERIOR_OBRA = 0.9;
        final double BENEFICIO_VENTAS = 2500;
        final double LIMITE_INFERIOR = 0.1;
        final double LIMITE_SUPERIOR = 1;
        double precioVentaUnitario;
        double unidades_A_Producir;
        double costeManoObra;
        String resultado;
        String codigoProducto = "";
        String coste_Mano_ObraString;

        String palabraSalir = "";

        do {
            //Muestro el primer menu de todos
            menu = JOptionPane.showInputDialog(
                    "****************************************************\n"
                    + "1 Calculos para ver viabilidad de los productos\n"
                    + "2 Salir\n"
                    + "****************************************************");

            menu = menu.toUpperCase();

            switch (menu) {
                case "1":

                    //Muestra el menu de los codigos y en caso de que se 
                    //introduzca un dato erroneo se repetira el menu hasta
                    //que se introduzca correctamente
                    do {

                        codigoProducto = JOptionPane.showInputDialog(
                                "Introduce uno de los codigos de los "
                                + "dulces en mayusculas:\n"
                                + " M1 (Mantecados de Limón)"
                                + "\n P1 (Polvorones)\n"
                                + " T1 (Turrón de chocolate)\n "
                                + "T2 (Turrón clásico)\n"
                                + " M2 (Mazapanes)");

                        //Transformo el dato que nos de el usuario a 
                        //mayusculas para que sea mas facil de manejar
                        codigoProducto = codigoProducto.toUpperCase();

                        if (codigoProducto.equalsIgnoreCase("m1")
                                || codigoProducto.equalsIgnoreCase(
                                        "p1")
                                || codigoProducto.equalsIgnoreCase(
                                        "t1")
                                || codigoProducto.equalsIgnoreCase(
                                        "t2")
                                || codigoProducto.equalsIgnoreCase(
                                        "m2")) {

                            do {//Valido el valor de la materia prima y si no es 
                               //correcto se volvera a repetir la pregunta hasta
                                //que se introduzca correctamente

                                String materiaPrimaString
                                        = JOptionPane.showInputDialog(
                                                "Dime el coste"
                                                + " de la materia prima ");
                                materiaPrima = Double.parseDouble(
                                        materiaPrimaString);

                            } while (materiaPrima < LIMITE_INFERIOR
                                    || materiaPrima > LIMITE_SUPERIOR);

                            //Si el coste de mano de obra rompe el limite ya
                            //sea inferior o superior se repite hasta que
                            //se introduzca correctamente
                            do {
                                coste_Mano_ObraString
                                        = JOptionPane.showInputDialog(
                                                "Dime el coste de"
                                                + " la mano de obra ");
                                costeManoObra = Double.parseDouble(
                                        coste_Mano_ObraString);

                            } while (costeManoObra < LIMITE_INFERIOR_OBRA
                                    || costeManoObra > LIMITE_SUPERIOR_OBRA);

                            //CALCULOS
                            //Calculo de el coste de produccion
                            costeProduccion = materiaPrima + costeManoObra;

                            if (codigoProducto.equals("M1")
                                    || codigoProducto.equals("P1")
                                    || codigoProducto.equals("M2")) {

                                precioVentaUnitario = costeProduccion
                                        + (0.5 * costeProduccion);

                            } else {

                                precioVentaUnitario = costeProduccion
                                        + (0.65 * costeProduccion);

                            }

                            //Calculo de las unidades a producir
                            //para que sea rentable
                            unidades_A_Producir = BENEFICIO_VENTAS
                                    / (precioVentaUnitario - costeProduccion);

                            //Agrupo el resultado en un textblock
                            //y le doy formato al texto para salgan 2 decimales
                            resultado
                                    = """
                                Coste de produccion unitario:               %.2f
                                Precio de venta unitario:                   %.2f
                                Unidades a producir para que sea rentable:  %.2f
                                """.formatted(costeProduccion,
                                            precioVentaUnitario,
                                            unidades_A_Producir);

                            switch (codigoProducto) {
                                case "M1":
                                    //muestro el resultado con un JOption
                                    JOptionPane.showMessageDialog(
                                            null,resultado);

                                    break;
                                case "P1":
                                    //muestro el resultado con un JOption
                                    JOptionPane.showMessageDialog(
                                            null,resultado);

                                    break;
                                case "T1":
                                    //muestro el resultado con un JOption
                                    JOptionPane.showMessageDialog(
                                            null,resultado);

                                    break;
                                case "T2":
                                    //muestro el resultado con un JOption
                                    JOptionPane.showMessageDialog(
                                            null,resultado);

                                    break;
                                case "M2":
                                    //muestro el resultado con un JOption
                                    JOptionPane.showMessageDialog(
                                            null,resultado);

                                    break;
                            }
                        }
                        //Codigos del menu
                    } while (!(codigoProducto.equalsIgnoreCase("M1")
                            || codigoProducto.equalsIgnoreCase("P1")
                            || codigoProducto.equalsIgnoreCase("T1")
                            || codigoProducto.equalsIgnoreCase("T2")
                            || codigoProducto.equalsIgnoreCase("M2")
                            || 
                            codigoProducto.equalsIgnoreCase("SALIR")));
            }

        } while (!menu.equalsIgnoreCase("SALIR") &&
                (!codigoProducto.equalsIgnoreCase("SALIR")));
        //Al escribir salir en el case 2 saldra completamente del programa
    }

}
