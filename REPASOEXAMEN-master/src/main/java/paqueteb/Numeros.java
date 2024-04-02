/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

/**
 *
 * @author Fer
 */
public class Numeros {

    private String loteriaNumero;

    private static int aux = 1;

    public Numeros() {

        if (aux < 10) {

            this.loteriaNumero = "000" + String.valueOf(aux);

        } else if (aux >= 10 && aux < 100) {

            this.loteriaNumero = "00" + String.valueOf(aux);

        } else if (aux >= 100 && aux < 1000) {

            this.loteriaNumero = "0" + String.valueOf(aux);

        } else {

            this.loteriaNumero = String.valueOf(aux);
        }

        aux++;

    }

    public String getLoteriaNumero() {
        return loteriaNumero;
    }

}
