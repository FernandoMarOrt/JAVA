package esteponaturronera;

import javax.swing.JOptionPane;

public class Esteponaturronera {

    public static void main(String[] args) {

        //Declaro todas las variables que voy a utilizar
        double materiaPrima;
        final double COSTEMANOOBRA_M1_T1 = 0.15;
        final double COSTEMANOOBRA_M2_T2_P1 = 0.22;
        double costeProduccion;
        final double BENEFICIO_VENTAS = 2500;
        final double LIMITE_INFERIOR = 0.1;
        final double LIMITE_SUPERIOR = 1;
        double precioVentaUnitario;
        double unidades_A_Producir;
        String resultado;

        //Enseño el menu con las opciones
        String codigoProducto = JOptionPane.showInputDialog(
                "Introduce uno de los codigos de los dulces en mayusculas:\n"
                + " M1 (Mantecados de Limón)\n P1 (Polvorones)\n"
                + " T1 (Turrón de chocolate)\n T2 (Turrón clásico)\n"
                + " M2 (Mazapanes)");
        
        //Transformo el dato que nos de el usuario a mayusculas para que sea
        //mas facil de manejar
        codigoProducto = codigoProducto.toUpperCase();
        
        //Si el codigo que introduce el usuario es distinto a los que estan
        //predeterminados se acaba el codigo y le dice al usuario que el codigo
        // es incorrecto
        if (codigoProducto.equals("M1")
                || codigoProducto.equals("P1")
                || codigoProducto.equals("T1")
                || codigoProducto.equals("T2")
                || codigoProducto.equals("M2")) {
            
            //Pregunto por el coste de la materia prima
            String materiaPrimaString = JOptionPane.showInputDialog(
                    "Dime el coste de la materia prima ");
            materiaPrima = Double.parseDouble(materiaPrimaString);

            //valida el coste de la materia prima 
            //si no se cumple acaba el codigo
            if (materiaPrima >= LIMITE_INFERIOR
                    && materiaPrima <= LIMITE_SUPERIOR) {
                
                //menu de codigos 
                switch (codigoProducto) {
                    case "M1":
                        //Calculo de el coste de produccion
                        costeProduccion = materiaPrima + COSTEMANOOBRA_M1_T1;
                        //Calculo del precio de venta unitario
                        precioVentaUnitario = costeProduccion
                                + (0.5 * costeProduccion);
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
                        //muestro el resultado con un JOption
                        JOptionPane.showMessageDialog(null,
                                resultado);

                        break;
                    case "P1":
                        //Calculo de el coste de produccion
                        costeProduccion = materiaPrima + COSTEMANOOBRA_M2_T2_P1;
                        //Calculo del precio de venta unitario
                        precioVentaUnitario = costeProduccion
                                + (0.5 * costeProduccion);
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
                        //muestro el resultado con un JOption
                        JOptionPane.showMessageDialog(null,
                                resultado);

                        break;
                    case "T1":
                        //Calculo de el coste de produccion
                        costeProduccion = materiaPrima + COSTEMANOOBRA_M1_T1;
                        //Calculo del precio de venta unitario
                        precioVentaUnitario = costeProduccion
                                + (0.65 * costeProduccion);
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
                        //muestro el resultado con un JOption
                        JOptionPane.showMessageDialog(null,
                                resultado);

                        break;
                    case "T2":
                        //Calculo de el coste de produccion
                        costeProduccion = materiaPrima + COSTEMANOOBRA_M2_T2_P1;
                        //Calculo del precio de venta unitario
                        precioVentaUnitario = costeProduccion
                                + (0.65 * costeProduccion);
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
                        //muestro el resultado con un JOption
                        JOptionPane.showMessageDialog(null,
                                resultado);

                        break;
                    case "M2":
                        //Calculo de el coste de produccion
                        costeProduccion = materiaPrima + COSTEMANOOBRA_M2_T2_P1;
                        //Calculo del precio de venta unitario
                        precioVentaUnitario = costeProduccion
                                + (0.5 * costeProduccion);
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
                        //muestro el resultado con un JOption
                        JOptionPane.showMessageDialog(null,
                                resultado);

                        break;
                }

            } else {

                JOptionPane.showMessageDialog(null,
                        "El precio de la materia prima es incorrecto");
            }

        } else {

            JOptionPane.showMessageDialog(null,
                    "El codigo introducido no existe");
        }
    }
}
