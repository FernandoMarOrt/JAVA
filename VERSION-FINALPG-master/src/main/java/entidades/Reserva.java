/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author fer
 */
@Entity
@Table(name = "reserva")
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r"),
    @NamedQuery(name = "Reserva.findById", query = "SELECT r FROM Reserva r WHERE r.id = :id"),
    @NamedQuery(name = "Reserva.findByFechaEntrada", query = "SELECT r FROM Reserva r WHERE r.fechaEntrada = :fechaEntrada"),
    @NamedQuery(name = "Reserva.findByFechaFin", query = "SELECT r FROM Reserva r WHERE r.fechaFin = :fechaFin"),
    @NamedQuery(name = "Reserva.findByNumeroDias", query = "SELECT r FROM Reserva r WHERE r.numeroDias = :numeroDias"),
    @NamedQuery(name = "Reserva.findByPrecio", query = "SELECT r FROM Reserva r WHERE r.precio = :precio"),
    @NamedQuery(name = "Reserva.findByClienteEnReserva", query = "SELECT c FROM Reserva c WHERE c.id = :id"),
    @NamedQuery(name = "Reserva.findByIDreserva", query = "SELECT r FROM Reserva r WHERE r.id = :id")})
    
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fecha_entrada")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrada;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Column(name = "numero_dias")
    private Integer numeroDias;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;

    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente cliente;

    @JoinColumn(name = "id_habitacion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Habitacion habitacion;

    public Reserva() {
    }

    public Reserva(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    // Método añadido, no generado por el IDE al crear la entidad JPA
    public LocalDate getFechaEntradaLocalDate() {
        return new Date(this.fechaEntrada.getTime()).
                toInstant().
                atZone(ZoneId.systemDefault()).
                toLocalDate();
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    // Método añadido, no generado por el IDE al crear la entidad JPA
    public void setFechaEntradaLocalDate(LocalDate fecha) {
        this.fechaEntrada = Date.from(fecha.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    // Método añadido, no generado por el IDE al crear la entidad JPA
    public LocalDate getFechaFinLocalDate() {
        return new Date(this.fechaFin.getTime()).
                toInstant().
                atZone(ZoneId.systemDefault()).
                toLocalDate();
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    // Método añadido, no generado por el IDE al crear la entidad JPA
    public void setFechaFinLocalDate(LocalDate fecha) {
        this.fechaFin = Date.from(fecha.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public Integer getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(Integer numeroDias) {
        this.numeroDias = numeroDias;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente idCliente) {
        this.cliente = idCliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion idHabitacion) {
        this.habitacion = idHabitacion;
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
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
;
        sb.append(id);
        sb.append(";");
        sb.append(getFechaEntradaLocalDate());
        sb.append(";");
        sb.append(getFechaFinLocalDate());
        sb.append(";");
        sb.append(numeroDias);
        sb.append(";");
        sb.append(precio);
        
//        sb.append(", cliente=");
        if (cliente != null) {
            sb.append(";");
            sb.append(cliente.getId()); // Evito llamadas concatenadas
        }

//        sb.append(", habitacion=");
        if (habitacion != null) {
            sb.append(";");
            sb.append(habitacion.getId()); // Evito llamadas concatenadas
        }

//        sb.append("]");
        return sb.toString();
    }

}
