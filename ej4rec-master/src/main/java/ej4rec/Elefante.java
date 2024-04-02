/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4rec;

/**
 *
 * @author fer
 */
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nombre",
    "peso"
})
@Generated("jsonschema2pojo")
public class Elefante {

    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("peso")
    private Integer peso;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Elefante() {
    }

    /**
     *
     * @param peso
     * @param nombre
     */
    public Elefante(String nombre, Integer peso) {
        super();
        this.nombre = nombre;
        this.peso = peso;
    }

    @JsonProperty("nombre")
    public String getNombre() {
        return nombre;
    }

    @JsonProperty("nombre")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Elefante withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @JsonProperty("peso")
    public Integer getPeso() {
        return peso;
    }

    @JsonProperty("peso")
    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Elefante withPeso(Integer peso) {
        this.peso = peso;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Elefante withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Elefante.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nombre");
        sb.append('=');
        sb.append(((this.nombre == null) ? "<null>" : this.nombre));
        sb.append(',');
        sb.append("peso");
        sb.append('=');
        sb.append(((this.peso == null) ? "<null>" : this.peso));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.nombre == null) ? 0 : this.nombre.hashCode()));
        result = ((result * 31) + ((this.peso == null) ? 0 : this.peso.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Elefante) == false) {
            return false;
        }
        Elefante rhs = ((Elefante) other);
        return ((((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties))) && ((this.nombre == rhs.nombre) || ((this.nombre != null) && this.nombre.equals(rhs.nombre)))) && ((this.peso == rhs.peso) || ((this.peso != null) && this.peso.equals(rhs.peso))));
    }

}
