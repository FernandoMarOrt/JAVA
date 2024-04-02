/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author fer
 */
@Entity
@Table(name = "habitacion")
@NamedQueries({
    @NamedQuery(name = "Habitacion.findAll", query = "SELECT h FROM Habitacion h"),
    @NamedQuery(name = "Habitacion.findById", query = "SELECT h FROM Habitacion h WHERE h.id = :id"),
    @NamedQuery(name = "Habitacion.findByNumeroHabitacion", query = "SELECT h FROM Habitacion h WHERE h.numeroHabitacion = :numero_habitacion"),
    @NamedQuery(name = "Habitacion.findByIDHabitacion", query = "SELECT h FROM Habitacion h WHERE h.id = :id"),
    @NamedQuery(name = "Habitacion.findByNumeroCamas", query = "SELECT h FROM Habitacion h WHERE h.numeroCamas = :numeroCamas"),
    @NamedQuery(name = "Habitacion.findByPiso", query = "SELECT h FROM Habitacion h WHERE h.piso = :piso"),
    @NamedQuery(name = "Habitacion.findByAireAcondicionado", query = "SELECT h FROM Habitacion h WHERE h.aireAcondicionado = :aireAcondicionado"),
    @NamedQuery(name = "Habitacion.findByCalefaccion", query = "SELECT h FROM Habitacion h WHERE h.calefaccion = :calefaccion")})
public class Habitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numero_habitacion")
    private int numeroHabitacion;
    @Basic(optional = false)
    @Column(name = "numero_camas")
    private int numeroCamas;
    @Column(name = "piso")
    private Integer piso;
    @Column(name = "aire_acondicionado")
    private Boolean aireAcondicionado;
    @Basic(optional = false)
    @Column(name = "calefaccion")
    private boolean calefaccion;
    @OneToMany(mappedBy = "habitacion")
    private List<Reserva> reservaList;

    public Habitacion() {
    }

    public Habitacion(Integer id) {
        this.id = id;
    }

    public Habitacion(Integer id, int numeroHabitacion, int numeroCamas, boolean calefaccion) {
        this.id = id;
        this.numeroHabitacion = numeroHabitacion;
        this.numeroCamas = numeroCamas;
        this.calefaccion = calefaccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public Boolean getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(Boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean getCalefaccion() {
        return calefaccion;
    }

    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public List<Reserva> getReservaList() {
        return reservaList;
    }

    public void setReservaList(List<Reserva> reservaList) {
        this.reservaList = reservaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Habitacion)) {
            return false;
        }
        Habitacion other = (Habitacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(id);
        sb.append(";");
        sb.append(numeroHabitacion);
        sb.append(";");
        sb.append(numeroCamas);
        sb.append(";");
        sb.append(piso);
        sb.append(";");
        sb.append(aireAcondicionado);
        sb.append(";");
        sb.append(calefaccion);
//        sb.append(";");
//        sb.append(reservasToString());

        return sb.toString();
    }

    private String reservasToString() {
        StringBuilder tmp = new StringBuilder();
        for (Reserva reserva : reservaList) {
            tmp.append(reserva.getId()).append(" ");
        }

        return tmp.length() == 0 ? tmp.toString() : tmp.toString() + "\b\b";
    }

}
