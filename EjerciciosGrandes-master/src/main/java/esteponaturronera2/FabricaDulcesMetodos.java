package esteponaturronera2;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class FabricaDulcesMetodos {

    public static void main(String[] args) {

        String opcion = "", codigoProducto = "", codigo = "";
        double materiaPrima, costeManoObra, costeProduccion,
                precioVentaUnitario, unidades_A_Producir;
        do {

            opcion = pedirOpcion(); // Opcion es "salir" o "calcular"

            // Si no es salir, pido el código de producto
            if (!opcion.equalsIgnoreCase("salir")) {

                // Pedir y filtrar código del producto
                codigoProducto = pedirCodigoProducto(); // Código m1,p1,t1,salir

                // Si ćodigo producto no es salir, realizo los cálculos
                if (!codigoProducto.equalsIgnoreCase("salir")) {

                    // Solicitar y filtrar materia prima  
                    materiaPrima = materiaPrimaLeerYFiltrar();

                    // Solicitar y filtrar mano de obra
                    costeManoObra = ManoDeObraLeerYFiltrar();

                    // Calcular coste de producción
                    costeProduccion = calcularCosteProduccion(materiaPrima,
                            costeManoObra);

                    // Calcular precio venta unitario
                    precioVentaUnitario = calcularPrecioVentaU(costeProduccion,
                            codigo);

                    // Calcular unidades hasta llegar al beneficio
                    unidades_A_Producir = unidadesBeneficio(precioVentaUnitario,
                            costeProduccion);

                    // Mostrar toda la información
                    resultados(precioVentaUnitario, costeProduccion,
                            unidades_A_Producir);

                } else { // Si es salir
                    opcion = "salir";
                }
            }

        } while (opcion.equalsIgnoreCase("calcular"));

    }


    
    // Métodos para mostrar códigos de productos
    // y filtrarlos hasta que sean correctos
    public static String pedirCodigoProducto() {
        String codigo;
        do {
            codigo = mostrarMenuCodigos();
        } while (!esCodigoProductoValido(codigo));
        return codigo;
    }


    
    //Valido los codigos 
    public static boolean esCodigoProductoValido(String codigo) {

        return (codigo.equalsIgnoreCase("m1")
                || codigo.equalsIgnoreCase("p1")
                || codigo.equalsIgnoreCase("t1")
                || codigo.equalsIgnoreCase("t2")
                || codigo.equalsIgnoreCase("m2")
                || codigo.equalsIgnoreCase("salir"));
    }
    


    //Metodo para mostrar el menu de codigos
    public static String mostrarMenuCodigos() {
        String texto = """
                       Introduce el código del producto:
                        M1 - Matecados
                        T1 - Turrón de chocolate
                        P1 - Polvorones
                        T2 - Turron clasico
                        M2 - Mazapanes
                       """;
        String opcion = JOptionPane.showInputDialog(texto);
        return opcion;
    }
    
    
    
    

    // Métodos para mostrar opciones generales del programa
    // y filtrarlas hasta que sean correctas
    public static boolean esOpcionMenuInicialValida(String opcion) {

        return opcion.equalsIgnoreCase("salir")
                || opcion.equalsIgnoreCase("calcular");
    }
    
    
    

    //Metodo para el menu principal
    public static String mostrarMenu() {
        String texto = """
                        Escribe calcular para calcular
                        Escribe salir para terminar
                       """;
        String opcion = JOptionPane.showInputDialog(texto);
        return opcion;
    }
    
 

    //Valido las opciones del menu
    public static String pedirOpcion() {
        String opcion;
        do {
            opcion = mostrarMenu();
        } while (!esOpcionMenuInicialValida(opcion));
        return opcion;
    }

    
    
 
    //Valido el valor de la materia prima y si no es 
    //correcto se volvera a repetir la pregunta hasta
    //que se introduzca correctamente
    public static double materiaPrimaLeerYFiltrar() {
        double materiaPrima = 0;
        final double LIMITE_INFERIOR = 0.1;
        final double LIMITE_SUPERIOR = 1;

        do {

            String materiaPrimaString
                    = JOptionPane.showInputDialog(
                            "Dime el coste"
                            + " de la materia prima ");

            try { //Utilizo el try catch por si el usuario metiera una letra
                //Le saltara un mensaje pidiendo que introduzca un numero
                materiaPrima = Double.parseDouble(
                        materiaPrimaString);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,
                        "Debe introducir un numero por favor");
            }

        } while (materiaPrima < LIMITE_INFERIOR
                || materiaPrima > LIMITE_SUPERIOR);

        return materiaPrima;

    }

    
    

    
    public static double ManoDeObraLeerYFiltrar() {

        //Si el coste de mano de obra rompe el limite ya
        //sea inferior o superior se repite hasta que
        //se introduzca correctamente
        double costeManoObra = 0;
        final double LIMITE_INFERIOR_OBRA = 0.5;
        final double LIMITE_SUPERIOR_OBRA = 0.9;
        do {

            String coste_Mano_ObraString
                    = JOptionPane.showInputDialog(
                            "Dime el coste de"
                            + " la mano de obra ");

            try { //Utilizo el try catch por si el usuario metiera una letra
                //Le saltara un mensaje pidiendo que introduzca un numero
                costeManoObra = Double.parseDouble(
                        coste_Mano_ObraString);

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,
                        "Debe introducir un numero por favor");
            }

        } while (costeManoObra < LIMITE_INFERIOR_OBRA
                || costeManoObra > LIMITE_SUPERIOR_OBRA);

        return costeManoObra;
    }

    

    
    //Calcular el coste de produccion utilizando los 2 metodos anteriores
    public static double calcularCosteProduccion(double materiaPrima,
            double costeManoObra) {

        double costeProduccion;

        costeProduccion = materiaPrima + costeManoObra;

        return costeProduccion;
    }


    
    //Calculo el precio de venta unitario
    public static double calcularPrecioVentaU(double costeProduccion,
            String codigo) {

        double precioVentaUnitario;

        if (codigo.equals("M1")
                || codigo.equals("P1")
                || codigo.equals("M2")) {

            precioVentaUnitario = costeProduccion
                    + (0.5 * costeProduccion);

        } else {

            precioVentaUnitario = costeProduccion
                    + (0.65 * costeProduccion);

        }

        return precioVentaUnitario;
    }
    


    //Calculo las unidades a producir para que sea rentable
    public static double unidadesBeneficio(double precioVentaUnitario,
            double costeProduccion) {

        double unidades_A_Producir;

        final double BENEFICIO_VENTAS = 2500;

        unidades_A_Producir = BENEFICIO_VENTAS
                / (precioVentaUnitario - costeProduccion);

        return unidades_A_Producir;

    }

    

    //Muestro finalmente todo los resultados
    public static String resultados(double precioVentaUnitario,
            double costeProduccion, double unidades_A_Producir) {

        String resultado
                = """
                                Coste de produccion unitario:               %.2f
                                Precio de venta unitario:                   %.2f
                                Unidades a producir para que sea rentable:  %.2f
                                """.formatted(precioVentaUnitario,
                        costeProduccion,
                        unidades_A_Producir);
        JOptionPane.showMessageDialog(null, resultado);
        return resultado;

    }

}
