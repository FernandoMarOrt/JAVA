/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ERICK
 */
public class JPanelImage extends JLabel {
    private int x, y;
    
    private String ruta;
    
    public JPanelImage(JPanel panel, String ruta){
        this.ruta = ruta;
        this.x = panel.getWidth();
        this.y = panel.getHeight();
        this.setSize(x, y);                
    }
    
    public void paint(Graphics g){
        ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        g.drawImage(img.getImage(), x, y, null);
    }
    
}
