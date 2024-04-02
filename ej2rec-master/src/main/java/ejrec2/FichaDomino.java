/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejrec2;

/**
 *
 * @author fer
 */
public class FichaDomino {

    private int numero1;
    private int numero2;

    public FichaDomino(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public FichaDomino() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numero1;
        hash = 97 * hash + this.numero2;
        return hash;
    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final FichaDomino other = (FichaDomino) obj;
//        if (this.numero1 != other.numero1) {
//            return false;
//        }
//        return this.numero2 == other.numero2;
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FichaDomino other = (FichaDomino) obj;
        return (numero1 == other.numero1 && numero2 == other.numero2)
                || (numero1 == other.numero2 && numero2 == other.numero1); // Considerar fichas simétricas como iguales
    }

 

    @Override
    public String toString() {
        return numero1 + "-" + numero2;
    }

}
