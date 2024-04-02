/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Fer
 */
public class Pictoricos extends Conservador {

    public Pictoricos(int id, String nombreE, String nif) {
        super(id, nombreE, nif);
    }

    @Override
    public void restaurarObra(Obra obra) {
        
         if (obra instanceof Pintura) {

            System.out.println("La obra se ha restaurado");

        } else {

            System.out.println("No puede restaurar una obra de tipo escultura");
        }
        
    }
    
}
