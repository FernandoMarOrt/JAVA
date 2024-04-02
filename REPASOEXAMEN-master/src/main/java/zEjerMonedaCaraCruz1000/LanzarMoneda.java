package zEjerMonedaCaraCruz1000;

import java.util.Random;

/**
 *
 * @author alvaro
 */
public class LanzarMoneda {

    //ATRIBUTO
    boolean[] moneda = new boolean[1000];

    //RELLENAR ARRAY CON TIRADAS DE MONEDA
    public void rellenar() {
        Random alea = new Random();

        //RELLENAR CON TRUE FALSE ALEATORIO
        for (int i = 0; i < this.moneda.length; i++) {
            this.moneda[i] = alea.nextBoolean();
        }
    }

    //VER CUANTAS CARAS(TRUE) HAN SALIDO
    public int cantidadCaras() {
        int cantidad = 0;

        for (int i = 0; i < this.moneda.length; i++) {
            if (this.moneda[i]) {
                cantidad++;
            }
        }

        return cantidad;
    }

    //VER CUANTAS CRUCES(FALSE) HAN SALIDO
    public int cantidadCruces() {
        int cantidad = 0;

        for (int i = 0; i < this.moneda.length; i++) {
            if (!this.moneda[i]) {
                cantidad++;
            }
        }

        return cantidad;
    }

    //IMPRIMIR DATOS 
    public void mostrarDatos() {

        for (int i = 0; i < this.moneda.length; i++) {
            System.out.print("Lanzamiento " + (i + 1) + ": ");
            if (this.moneda[i]) {
                System.out.print("cara\n");
            } else {
                System.out.print("cruz\n");
            }

        }
    }
    
    
}
