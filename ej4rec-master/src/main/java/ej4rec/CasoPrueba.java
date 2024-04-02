/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4rec;

import java.util.List;

/**
 *
 * @author fer
 */
import java.util.LinkedHashMap;
import java.util.List;
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
    "peso",
    "elefantes"
})
@Generated("jsonschema2pojo")
public class CasoPrueba {

    @JsonProperty("peso")
    private Integer peso;
    @JsonProperty("elefantes")
    private List<Elefante> elefantes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public CasoPrueba() {
    }

    /**
     *
     * @param elefantes
     * @param peso
     */
    public CasoPrueba(Integer peso, List<Elefante> elefantes) {
        super();
        this.peso = peso;
        this.elefantes = elefantes;
    }

    @JsonProperty("peso")
    public Integer getPeso() {
        return peso;
    }

    @JsonProperty("peso")
    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public CasoPrueba withPeso(Integer peso) {
        this.peso = peso;
        return this;
    }

    @JsonProperty("elefantes")
    public List<Elefante> getElefantes() {
        return elefantes;
    }

    @JsonProperty("elefantes")
    public void setElefantes(List<Elefante> elefantes) {
        this.elefantes = elefantes;
    }

    public CasoPrueba withElefantes(List<Elefante> elefantes) {
        this.elefantes = elefantes;
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

    public CasoPrueba withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CasoPrueba.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("peso");
        sb.append('=');
        sb.append(((this.peso == null) ? "<null>" : this.peso));
        sb.append(',');
        sb.append("elefantes");
        sb.append('=');
        sb.append(((this.elefantes == null) ? "<null>" : this.elefantes));
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
        result = ((result * 31) + ((this.elefantes == null) ? 0 : this.elefantes.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.peso == null) ? 0 : this.peso.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CasoPrueba) == false) {
            return false;
        }
        CasoPrueba rhs = ((CasoPrueba) other);
        return ((((this.elefantes == rhs.elefantes) || ((this.elefantes != null) && this.elefantes.equals(rhs.elefantes))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.peso == rhs.peso) || ((this.peso != null) && this.peso.equals(rhs.peso))));
    }

}
