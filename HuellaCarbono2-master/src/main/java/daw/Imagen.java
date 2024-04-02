/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author ERICK
 */
public class Imagen extends JPanel{
    private Image imagen;
    
    public void paint (Graphics g){
        imagen = new ImageIcon(getClass().getResource("image/bosque.jpg")).getImage();
        
        g.drawImage(imagen, 0, 0,getWidth(), getHeight(), this);
        
        setOpaque(false); // fondo transparente
        
        super.paint(g);
    }
    
}
