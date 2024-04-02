package zEjerMonedaCaraCruz1000;

/**
 *
 * @author alvaro
 */
public class prueba {
    
    public static void main(String[] args) {
        
        LanzarMoneda moneda = new LanzarMoneda();
        
        moneda.rellenar();
        
        moneda.mostrarDatos();
        
        int cantidadCaras = moneda.cantidadCaras();
        int cantidadCruces = moneda.cantidadCruces();
        System.out.println("\n-------------------------------------");
        System.out.println("Cantidad caras: " + cantidadCaras);
        System.out.println("Cantidad cruces: " + cantidadCruces);
    }
}
