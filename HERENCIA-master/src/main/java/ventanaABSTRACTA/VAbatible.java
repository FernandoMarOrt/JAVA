/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanaABSTRACTA;

/**
 *
 * @author fer
 */
public class VAbatible extends Ventana {
    
    private int gradosApertura;

    public VAbatible(int gradosApertura, boolean estado) {
        super(estado);
        this.gradosApertura = gradosApertura;
    }

    public VAbatible() {
        
        
    }

    
    public int getGradosApertura() {
        return gradosApertura;
    }

    public void setGradosApertura(int gradosApertura) {
        this.gradosApertura = gradosApertura;
    }

    @Override
    public String toString() {
        return "VAbatible{" + "gradosApertura=" + gradosApertura + '}';
    }

    @Override
    public void abrir(int numero) {
        
        //Hay que indicar que esta abierta y ademas LOS GRADOS DE APERTURA SE CALCULAN DIVIENDO EL NUMERO ENTRE 2
        super.setEstado(true);
        
        this.gradosApertura = numero/2;
    }

    @Override
    public void cerrar(int numero) {
      
    }
    
    
    
}
