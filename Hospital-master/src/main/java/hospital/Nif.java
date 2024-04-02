/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author fer
 */
public class Nif {

    private String numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public Nif() {
        this.numero = RandomStringUtils.randomNumeric(8);
        this.letra = calcularLetra();
        this.fechaCaducidad = LocalDate.now();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
    

    private char calcularLetra() {

        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int calculo = Integer.parseInt(numero) % 23;

        char letra = letrasDNI[calculo];

        return letra;
    }

    public LocalDate renovar(LocalDate fechaSolicitudRenovacion) {

        LocalDate fechaRenovada = fechaSolicitudRenovacion.plusYears(10);
        setFechaCaducidad(fechaRenovada);

        return fechaRenovada;
        
        
    }

    @Override
    public String toString() {
        return "Nif{" + numero + letra + '}';
    }
    
    

}
