/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author fer
 */
public abstract class Empleado implements Comparable<Empleado> {

    private String nombreE;
    private String nif;

    public Empleado(String nombreE, String nif) {
        this.nombreE = nombreE;
        this.nif = nif;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nif);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public int compareTo(Empleado o) {

        return this.nif.compareToIgnoreCase(o.nif);
    }

}
