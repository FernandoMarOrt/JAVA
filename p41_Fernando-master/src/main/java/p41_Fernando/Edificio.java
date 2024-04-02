/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p41_Fernando;

import java.time.LocalDate;

/**
 *
 * @author fer
 */
public class Edificio {

    public static void main(String[] args) {

        Elevador elevador1 = new Elevador(98265384, "Balay", 7, 700, LocalDate.now(), LocalDate.now(), "0", "Parado");
        Elevador elevador2 = new Elevador(486312859, "Boss", 13, 100000, LocalDate.now(), LocalDate.now(), "0", "Parado");
        

    }

    public static LocalDate fechaRevision(Elevador elevador1) {

        LocalDate proximaRevision = elevador1.getFechaUltimaRevision().plusMonths(6);

        return proximaRevision;
    }

}
