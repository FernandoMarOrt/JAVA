package JOption;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class JOptionBasic {

    public static void main(String[] args) {

        //VARIABLE
        String nombre;
        double peso;
        String pesoString;
        int edad;
        String edadString;

        
        //LEER DATOS CON JOPTION STRING
        nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        //MOSTRAR DATOS
        JOptionPane.showMessageDialog(null, "Tu nombre es " + nombre);

        
        //LEER DATOS NUMERICOS DECIMALES
        pesoString = JOptionPane.showInputDialog("Escribe tu peso");
        peso=Double.parseDouble(pesoString);                                //TRANSFORAR STRING EN DOUBLE
        JOptionPane.showMessageDialog(null, "Pesas " + peso*10); //ASI SE PUEDEN HACER OPERACIONES
        
        //LEER DATOS NUMERICOS ENTEROS
        edadString = JOptionPane.showInputDialog("Escribe tu edad");
        edad=Integer.parseInt(edadString);
        JOptionPane.showMessageDialog(null, "Tienes " + edad);
        
    }
}
