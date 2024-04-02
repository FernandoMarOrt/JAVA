/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Fer
 */
public class Escultorico extends Conservador {

    public Escultorico(int id, String nombreE, String nif) {
        super(id, nombreE, nif);
    }

    @Override
    public void restaurarObra(Obra obra) {

        if (obra instanceof Escultura) {

            System.out.println("La obra se ha restaurado");

        } else {

            System.out.println("No puede restaurar una obra de tipo pintura");
        }
    }

}
