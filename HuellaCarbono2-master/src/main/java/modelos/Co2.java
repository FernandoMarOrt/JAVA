
package modelos;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "grid",
    "renewable"
})
@Generated("jsonschema2pojo")
public class Co2 {

    @JsonProperty("grid")
    private Grid grid;
    @JsonProperty("renewable")
    private Renewable renewable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Co2() {
    }

    /**
     * 
     * @param grid
     * @param renewable
     */
    public Co2(Grid grid, Renewable renewable) {
        super();
        this.grid = grid;
        this.renewable = renewable;
    }

    @JsonProperty("grid")
    public Grid getGrid() {
        return grid;
    }

    @JsonProperty("grid")
    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public Co2 withGrid(Grid grid) {
        this.grid = grid;
        return this;
    }

    @JsonProperty("renewable")
    public Renewable getRenewable() {
        return renewable;
    }

    @JsonProperty("renewable")
    public void setRenewable(Renewable renewable) {
        this.renewable = renewable;
    }

    public Co2 withRenewable(Renewable renewable) {
        this.renewable = renewable;
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

    public Co2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Co2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("grid");
        sb.append('=');
        sb.append(((this.grid == null)?"<null>":this.grid));
        sb.append(',');
        sb.append("renewable");
        sb.append('=');
        sb.append(((this.renewable == null)?"<null>":this.renewable));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
