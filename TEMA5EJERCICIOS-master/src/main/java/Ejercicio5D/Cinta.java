/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5D;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cinta {

    //Creo una lista que va a contener productos
    private ArrayList<Productos> cinta;

    public Cinta() {

        this.cinta = new ArrayList();

    }

    //Metodo para añadir un producto a la cinta
    public void añadirProductos(Productos paux) {

        this.cinta.add(paux);

    }

    //Metodo para quitar un producto de la cinta
    public void quitarProductos(Productos paux) {

        this.cinta.remove(paux);

    }

    //Metodo para saber si la cinta esta vacia
    //Si esta vacia devolvera true , si no lo esta devolvera false
    public boolean vacia() {

        if (this.cinta.size() == 0) {

            return true;

        } else {

            return false;
        }

    }

    @Override 
    //Modifico el tostring para que los productos de la cinta
    //A la hora de imprimirlos salgan debajo unos de otros 
    public String toString() {

        String cintaString = "";

        for (Productos paux : cinta) { 
            cintaString += paux.nombre() + "            "
                    + paux.precio() + "                 "
                    + paux.cantidad() + "              "
                    + paux.iva() + "%" + "              "
                    + paux.precio() * paux.cantidad() + "  \n";//Precio sin iva

        }

        return cintaString;
    }

    //CALCULAMOS EL NUMERO DE PRODUCTOS CON IVA DEL 4% , 10% Y 21%
    public int productosIVA4() {

        int contarIVA4 = 0;
        
        ArrayList<Productos> contarIVA = new ArrayList();

        for (Productos paux : cinta) {

            if (paux.iva() == 4) {

                contarIVA.add(paux);
                
            }

        }
        return contarIVA4;
    }
    
    public int productosIVA10() {

        int contarIVA10 = 0;

        for (Productos paux : cinta) {

            if (paux.iva() == 10) {

                contarIVA10 += paux.cantidad();
            }

        }

        return contarIVA10;
    }
    
    public int productosIVA21() {

        int contarIVA21 = 0;

        for (Productos paux : cinta) {

            if (paux.iva() == 21) {

                contarIVA21 += paux.cantidad();
            }

        }

        return contarIVA21;
    }
    
    
    
    
    //CALCULAMOS EL PRECIO DE LOS PRODUCTOS CON IVA DE 4% , 10% Y 21%
    public double productosPrecioIVA4() {

        double precioIVA4 = 0;

        for (Productos paux : cinta) {

            if (paux.iva() == 4) {

                precioIVA4 += (paux.precio() * paux.cantidad());
            }

        }
        return precioIVA4;
    }
    
   
    public double productosPrecioIVA10() {

        double precioIVA10 = 0;

        for (Productos paux : cinta) {

            if (paux.iva() == 10) {

                precioIVA10 += (paux.precio() * paux.cantidad());
            }

        }
        return precioIVA10;
    }
    
    public double productosPrecioIVA21() {

        double precioIVA21 = 0;

        for (Productos paux : cinta) {

            if (paux.iva() == 21) {

                precioIVA21 += (paux.precio() * paux.cantidad());
            }

        }
        return precioIVA21;
    }
  
    
    
    
    //METODO PARA CALCULAR EL TOTAL A PAGAR
    public double totalAPagar() {
        
        double total = 0;
        
        total = (
                (productosPrecioIVA4() +(productosPrecioIVA4() * 0.04)) +
                (productosPrecioIVA10() +(productosPrecioIVA10() * 0.1)) +
                (productosPrecioIVA21() +(productosPrecioIVA21() * 0.21))
                );
        
        return total;
        
    }

}
