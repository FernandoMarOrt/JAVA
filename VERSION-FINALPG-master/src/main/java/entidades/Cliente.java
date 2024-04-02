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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author fer
 */
@Entity
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findById", query = "SELECT c FROM Cliente c WHERE c.id = :id"),
    @NamedQuery(name = "Cliente.findByNombre", query = "SELECT c FROM Cliente c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Cliente.findByApellidos", query = "SELECT c FROM Cliente c WHERE c.apellidos = :apellidos"),
    @NamedQuery(name = "Cliente.findByDni", query = "SELECT c FROM Cliente c WHERE c.dni = :dni"),
    @NamedQuery(name = "Cliente.findByActivo", query = "SELECT c FROM Cliente c WHERE c.activo = :activo")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @Column(name = "dni")
    private String dni;
    @Column(name = "activo")
    private Boolean activo;

    // Asociación bidireccional entre Cliente y TarjetaBancaria
    // Un cliente tiene una tarjeta (@OneToOne) y una tarjeta sólo es de un cliente
    // La anotación JoinColumn indica a JPA el atributo de la tabla
    // Cliente que debe usar para realizar el JOIN con la tabla de TarjetaBancaria
    // Cliente es la entidad propietaria de la relación al tener la clave ajena de
    // Tarjeta
    @JoinColumn(name = "id_tarjetaD", referencedColumnName = "id")
    @OneToOne
    private TarjetaDescuento idtarjetaD;

    // Asociación bidireccional entre Cliente y Alquiler
    // Un cliente puede realizar muchos alquileres
    // Con esta anotación y este atributo se pueden recuperar los alquileres
    // de este cliente
    // mappedBy indica el atributo asociado en la clase Alquiler
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
    private List<Reserva> reservaList;

    public Cliente() {
    }

    public Cliente(Integer id) {
        this.id = id;
    }

    public Cliente(Integer id, String dni) {
        this.id = id;
        this.dni = dni;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public TarjetaDescuento getIdtarjetaD() {
        return idtarjetaD;
    }

    public void setIdtarjetaD(TarjetaDescuento idtarjetaD) {
        this.idtarjetaD = idtarjetaD;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "entidades.Cliente[ id=" + id + " ]";
//    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();


        sb.append(id);
        sb.append(";");
        sb.append(apellidos);
        sb.append(";");
        sb.append(dni);
        sb.append(";");
        sb.append(nombre);
//        sb.append(";");
//        sb.append(ReservasToString());

        if (idtarjetaD != null) {
            sb.append(";");
            sb.append(idtarjetaD.getId()); //si tiene tarjeta descuento la imprimo
        }

//        sb.append("]"); //Si no la tiene, no aparecera
        return sb.toString();

    }

    private String ReservasToString() {
        StringBuilder tmp = new StringBuilder();
        for (Reserva reserva : reservaList) {
            tmp.append(reserva.getId()).append(" ");
        }
        return tmp.toString();
    }

}
