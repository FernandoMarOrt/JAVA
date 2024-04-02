/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "height",
    "mass",
    "hair_color",
    "skin_color",
    "eye_color",
    "birth_year",
    "gender",
    "homeworld",
    "films",
    "species",
    "vehicles",
    "starships",
    "url"
})
@Generated("jsonschema2pojo")
public class Personaje {

    @JsonProperty("name")
    private String name;
    @JsonProperty("height")
    private String height;
    @JsonProperty("mass")
    private String mass;
    @JsonProperty("hair_color")
    private String hairColor;
    @JsonProperty("skin_color")
    private String skinColor;
    @JsonProperty("eye_color")
    private String eyeColor;
    @JsonProperty("birth_year")
    private String birthYear;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("homeworld")
    private String homeworld;
    @JsonProperty("films")
    private List<String> films;
    @JsonProperty("species")
    private List<Object> species;
    @JsonProperty("vehicles")
    private List<Object> vehicles;
    @JsonProperty("starships")
    private List<String> starships;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Personaje() {
    }

    /**
     *
     * @param films
     * @param homeworld
     * @param gender
     * @param skinColor
     * @param mass
     * @param vehicles
     * @param url
     * @param eyeColor
     * @param birthYear
     * @param species
     * @param starships
     * @param name
     * @param hairColor
     * @param height
     */
    public Personaje(String name, String height, String mass, String hairColor, String skinColor, String eyeColor, String birthYear, String gender, String homeworld, List<String> films, List<Object> species, List<Object> vehicles, List<String> starships, String url) {
        super();
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hairColor = hairColor;
        this.skinColor = skinColor;
        this.eyeColor = eyeColor;
        this.birthYear = birthYear;
        this.gender = gender;
        this.homeworld = homeworld;
        this.films = films;
        this.species = species;
        this.vehicles = vehicles;
        this.starships = starships;
        this.url = url;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Personaje withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    public Personaje withHeight(String height) {
        this.height = height;
        return this;
    }

    @JsonProperty("mass")
    public String getMass() {
        return mass;
    }

    @JsonProperty("mass")
    public void setMass(String mass) {
        this.mass = mass;
    }

    public Personaje withMass(String mass) {
        this.mass = mass;
        return this;
    }

    @JsonProperty("hair_color")
    public String getHairColor() {
        return hairColor;
    }

    @JsonProperty("hair_color")
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public Personaje withHairColor(String hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    @JsonProperty("skin_color")
    public String getSkinColor() {
        return skinColor;
    }

    @JsonProperty("skin_color")
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public Personaje withSkinColor(String skinColor) {
        this.skinColor = skinColor;
        return this;
    }

    @JsonProperty("eye_color")
    public String getEyeColor() {
        return eyeColor;
    }

    @JsonProperty("eye_color")
    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Personaje withEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        return this;
    }

    @JsonProperty("birth_year")
    public String getBirthYear() {
        return birthYear;
    }

    @JsonProperty("birth_year")
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public Personaje withBirthYear(String birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Personaje withGender(String gender) {
        this.gender = gender;
        return this;
    }

    @JsonProperty("homeworld")
    public String getHomeworld() {
        return homeworld;
    }

    @JsonProperty("homeworld")
    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public Personaje withHomeworld(String homeworld) {
        this.homeworld = homeworld;
        return this;
    }

    @JsonProperty("films")
    public List<String> getFilms() {
        return films;
    }

    @JsonProperty("films")
    public void setFilms(List<String> films) {
        this.films = films;
    }

    public Personaje withFilms(List<String> films) {
        this.films = films;
        return this;
    }

    @JsonProperty("species")
    public List<Object> getSpecies() {
        return species;
    }

    @JsonProperty("species")
    public void setSpecies(List<Object> species) {
        this.species = species;
    }

    public Personaje withSpecies(List<Object> species) {
        this.species = species;
        return this;
    }

    @JsonProperty("vehicles")
    public List<Object> getVehicles() {
        return vehicles;
    }

    @JsonProperty("vehicles")
    public void setVehicles(List<Object> vehicles) {
        this.vehicles = vehicles;
    }

    public Personaje withVehicles(List<Object> vehicles) {
        this.vehicles = vehicles;
        return this;
    }

    @JsonProperty("starships")
    public List<String> getStarships() {
        return starships;
    }

    @JsonProperty("starships")
    public void setStarships(List<String> starships) {
        this.starships = starships;
    }

    public Personaje withStarships(List<String> starships) {
        this.starships = starships;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Personaje withUrl(String url) {
        this.url = url;
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

    public Personaje withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Personaje.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null) ? "<null>" : this.height));
        sb.append(',');
        sb.append("mass");
        sb.append('=');
        sb.append(((this.mass == null) ? "<null>" : this.mass));
        sb.append(',');
        sb.append("hairColor");
        sb.append('=');
        sb.append(((this.hairColor == null) ? "<null>" : this.hairColor));
        sb.append(',');
        sb.append("skinColor");
        sb.append('=');
        sb.append(((this.skinColor == null) ? "<null>" : this.skinColor));
        sb.append(',');
        sb.append("eyeColor");
        sb.append('=');
        sb.append(((this.eyeColor == null) ? "<null>" : this.eyeColor));
        sb.append(',');
        sb.append("birthYear");
        sb.append('=');
        sb.append(((this.birthYear == null) ? "<null>" : this.birthYear));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null) ? "<null>" : this.gender));
        sb.append(',');
        sb.append("homeworld");
        sb.append('=');
        sb.append(((this.homeworld == null) ? "<null>" : this.homeworld));
        sb.append(',');
        sb.append("films");
        sb.append('=');
        sb.append(((this.films == null) ? "<null>" : this.films));
        sb.append(',');
        sb.append("species");
        sb.append('=');
        sb.append(((this.species == null) ? "<null>" : this.species));
        sb.append(',');
        sb.append("vehicles");
        sb.append('=');
        sb.append(((this.vehicles == null) ? "<null>" : this.vehicles));
        sb.append(',');
        sb.append("starships");
        sb.append('=');
        sb.append(((this.starships == null) ? "<null>" : this.starships));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null) ? "<null>" : this.url));
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
        result = ((result * 31) + ((this.films == null) ? 0 : this.films.hashCode()));
        result = ((result * 31) + ((this.homeworld == null) ? 0 : this.homeworld.hashCode()));
        result = ((result * 31) + ((this.gender == null) ? 0 : this.gender.hashCode()));
        result = ((result * 31) + ((this.skinColor == null) ? 0 : this.skinColor.hashCode()));
        result = ((result * 31) + ((this.mass == null) ? 0 : this.mass.hashCode()));
        result = ((result * 31) + ((this.vehicles == null) ? 0 : this.vehicles.hashCode()));
        result = ((result * 31) + ((this.url == null) ? 0 : this.url.hashCode()));
        result = ((result * 31) + ((this.eyeColor == null) ? 0 : this.eyeColor.hashCode()));
        result = ((result * 31) + ((this.birthYear == null) ? 0 : this.birthYear.hashCode()));
        result = ((result * 31) + ((this.species == null) ? 0 : this.species.hashCode()));
        result = ((result * 31) + ((this.starships == null) ? 0 : this.starships.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.hairColor == null) ? 0 : this.hairColor.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.height == null) ? 0 : this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Personaje) == false) {
            return false;
        }
        Personaje rhs = ((Personaje) other);
        return ((((((((((((((((this.films == rhs.films) || ((this.films != null) && this.films.equals(rhs.films))) && ((this.homeworld == rhs.homeworld) || ((this.homeworld != null) && this.homeworld.equals(rhs.homeworld)))) && ((this.gender == rhs.gender) || ((this.gender != null) && this.gender.equals(rhs.gender)))) && ((this.skinColor == rhs.skinColor) || ((this.skinColor != null) && this.skinColor.equals(rhs.skinColor)))) && ((this.mass == rhs.mass) || ((this.mass != null) && this.mass.equals(rhs.mass)))) && ((this.vehicles == rhs.vehicles) || ((this.vehicles != null) && this.vehicles.equals(rhs.vehicles)))) && ((this.url == rhs.url) || ((this.url != null) && this.url.equals(rhs.url)))) && ((this.eyeColor == rhs.eyeColor) || ((this.eyeColor != null) && this.eyeColor.equals(rhs.eyeColor)))) && ((this.birthYear == rhs.birthYear) || ((this.birthYear != null) && this.birthYear.equals(rhs.birthYear)))) && ((this.species == rhs.species) || ((this.species != null) && this.species.equals(rhs.species)))) && ((this.starships == rhs.starships) || ((this.starships != null) && this.starships.equals(rhs.starships)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.hairColor == rhs.hairColor) || ((this.hairColor != null) && this.hairColor.equals(rhs.hairColor)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.height == rhs.height) || ((this.height != null) && this.height.equals(rhs.height))));
    }

}
