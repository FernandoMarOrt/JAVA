/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5e;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Ticket {

    private LocalDate fecha;
    private Cinta cinta;
    private LocalDateTime fecha2;

    public Ticket(Cinta cinta) {
        this.fecha = LocalDate.now();
        this.cinta = cinta;
        this.fecha2 = LocalDateTime.now();
    }

    

    public LocalDate getFecha() {
        
        return fecha;
    }
    
    
    public String toString() { //COMO SALDRIA ACTUALMENTE EL TICKET
        
        //En la fecha he utilizado el DateTimeFormatter, donde he sacado la informacion: https://cutt.ly/E2QJeer he acortado el url ya que era muy largo
        
        String resultado;
        
        resultado = "----------------------------------------------------------------------------------------\n"
                
                + "                            Supermercados Mercadowna                         \n\n"
                
                + "Fecha: " + fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "             Hora: " + fecha2.getHour() + "." + fecha2.getMinute() + "\n"
                
                + "----------------------------------------------------------------------------------------\n"
                
                + "Producto              Precio            Cantidad            IVA           Precio sin IVA\n"
                
                + "----------------------------------------------------------------------------------------\n"
                
                + cinta //Imprime la lista de productos que tenemos en la cinta
                
                + "----------------------------------------------------------------------------------------\n"
                
                + "Nº prod. iva 4%:  " + cinta.productosIVA4() +  "             Precio sin IVA: " + cinta.productosPrecioIVA4() + "             Precio con IVA: " + (cinta.productosPrecioIVA4() * 1.04) + "\n"
                
                + "Nº prod. iva 10%: " + cinta.productosIVA10() + "             Precio sin IVA: " + cinta.productosPrecioIVA10() + "             Precio con IVA: " + String.format("%.2f",(cinta.productosPrecioIVA10() * 1.1)) + "\n"
                
                + "Nº prod. iva 21%: " + cinta.productosIVA21() + "             Precio sin IVA: " + cinta.productosPrecioIVA21() + "             Precio con IVA: " + (cinta.productosPrecioIVA21() * 1.21) + "\n"

                + "----------------------------------------------------------------------------------------\n"
                
                + "Total a pagar: " + cinta.totalAPagar() + " --" + " Gracias por su visita\n"
                
                + "----------------------------------------------------------------------------------------\n";
        
        return resultado;
        
    }



}
