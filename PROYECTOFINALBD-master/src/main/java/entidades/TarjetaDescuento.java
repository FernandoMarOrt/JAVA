/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author fer
 */
@Entity
@Table(name = "tarjeta_descuento")
@NamedQueries({
    @NamedQuery(name = "TarjetaDescuento.findAll", query = "SELECT t FROM TarjetaDescuento t"),
    @NamedQuery(name = "TarjetaDescuento.findById", query = "SELECT t FROM TarjetaDescuento t WHERE t.id = :id"),
    @NamedQuery(name = "TarjetaDescuento.findByFecha", query = "SELECT t FROM TarjetaDescuento t WHERE t.fechaCaducidad = :fecha_caducidad"),
    @NamedQuery(name = "TarjetaDescuento.findByFechaTarjetaDescuento", query = "SELECT t FROM TarjetaDescuento t WHERE t.fechaCaducidad = :fecha_caducidad"),
    @NamedQuery(name = "TarjetaDescuento.findByIDTarjetaDescuento", query = "SELECT t FROM TarjetaDescuento t WHERE t.id = :id")})

public class TarjetaDescuento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fecha_caducidad")
    @Temporal(TemporalType.DATE)
    private Date fechaCaducidad;

    @OneToOne(mappedBy = "idtarjetaD")
    private Cliente cliente;

    public TarjetaDescuento() {
    }

    public TarjetaDescuento(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }
    // Método añadido, no generado por el IDE al crear la entidad JPA

    public LocalDate getFechaCaducidadLocalDate() {
        return new Date(this.fechaCaducidad.getTime()).
                toInstant().
                atZone(ZoneId.systemDefault()).
                toLocalDate();
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    // Método añadido, no generado por el IDE al crear la entidad JPA
    public void setFechaCaducidadLocalDate(LocalDate fechaCaducidad) {
        this.fechaCaducidad = Date.from(fechaCaducidad.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        if (!(object instanceof TarjetaDescuento)) {
            return false;
        }
        TarjetaDescuento other = (TarjetaDescuento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        // Si toString de tarjetaBancaria llama a toString de Cliente
        // se genera una excepción StackOverFlow al desbordarse la pila de llamadas
        // ya que las llamadas se encadenan sin fin

        // Para evitar llamadas concatenadas entre objetos relacionados voy
        // a usar el atributo nombre del cliente, no el toString completo.
//        String nombre = (this.cliente != null) ? this.cliente.getNombre() : "";

        StringBuilder sb = new StringBuilder();
//        sb.append("TarjetaDescuento [id=");
        sb.append(id);
        sb.append(";");
        sb.append(getFechaCaducidadLocalDate());
        return sb.toString();
    }

}
