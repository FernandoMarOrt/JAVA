/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnexoIITarea4;

/**
 *
 * @author Fer
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelPrincipal extends JPanel implements ActionListener {

    // Atributos de la clase (privados)
    private PanelBotones botonera;
    private JTextArea areaTexto;
    private int tipoOperacion;
    private double numero1;
    private double numero2;

    // Constructor
    public PanelPrincipal() {
        initComponents();
        tipoOperacion = -1; // No hay operaciones en la calculadora
    }

    // Se inicializan los componentes gráficos y se colocan en el panel
    private void initComponents() {
        // Creamos el panel de botones
        botonera = new PanelBotones();
        // Creamos el área de texto
        areaTexto = new JTextArea(10, 50);
        areaTexto.setEditable(false);
        areaTexto.setBackground(Color.white);

        //Establecemos layout del panel principal
        this.setLayout(new BorderLayout());
        // Colocamos la botonera y el área texto
        this.add(areaTexto, BorderLayout.NORTH);
        this.add(botonera, BorderLayout.SOUTH);

        for (JButton boton : this.botonera.getgrupoBotones()) {
            boton.addActionListener(this);
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Se obtiene el objeto que desencadena el evento
        Object o = ae.getSource();
        // Si es un botón
        if (o instanceof JButton) {
            System.out.println(((JButton) o).getText());
            areaTexto.setText(((JButton) o).getText());
            String textoBoton = ((JButton) o).getText();

            // Si el botón presionado es un número
            if (textoBoton.matches("\\d")) {
                
                
                
                String textoActual = areaTexto.getText();
                areaTexto.setText(textoActual + textoBoton);
                
                
            } else if (textoBoton.matches("[+\\-*/]")) { // Si el botón presionado es una operación
                
                
                
                tipoOperacion = textoBoton.charAt(0);
                numero1 = Double.parseDouble(areaTexto.getText());
                areaTexto.setText("");
                
                
            } else if (textoBoton.equals("=")) { // Si el botón presionado es el botón de igual
                numero2 = Double.parseDouble(areaTexto.getText());
                double resultado = 0;

                switch (tipoOperacion) {
                    case '+':
                        resultado = numero1 + numero2;
                        break;
                    case '-':
                        resultado = numero1 - numero2;
                        break;
                    case '*':
                        resultado = numero1 * numero2;
                        break;
                    case '/':
                        resultado = numero1 / numero2;
                        break;
                }

                areaTexto.setText(Double.toString(resultado));
            } // Si el botón presionado es el botón de borrar
            else if (textoBoton.equals("C")) {
                areaTexto.setText("");
            }
        }

    }
}
