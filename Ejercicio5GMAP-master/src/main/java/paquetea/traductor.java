/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author fer
 */
public class traductor implements Comparable<traductor>{

    private String palabraEspaniol;
    private String palabraExtranjera;

    public traductor(String palabraEspaniol, String palabraExtranjera) {
        this.palabraEspaniol = palabraEspaniol;
        this.palabraExtranjera = palabraExtranjera;
    }
    
    

    public traductor() {
    }

    public String getPalabraEspaniol() {
        return palabraEspaniol;
    }

    public void setPalabraEspaniol(String palabraEspaniol) {
        this.palabraEspaniol = palabraEspaniol;
    }

    public String getPalabraExtranjera() {
        return palabraExtranjera;
    }

    public void setPalabraExtranjera(String palabraExtranjera) {
        this.palabraExtranjera = palabraExtranjera;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.palabraExtranjera);
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
        final traductor other = (traductor) obj;
        return Objects.equals(this.palabraExtranjera, other.palabraExtranjera);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("traductor{");
        sb.append("palabraEspaniol=").append(palabraEspaniol);
        sb.append(", palabraExtranjera=").append(palabraExtranjera);
        sb.append('}');
        return sb.toString();
    }
    
    

    @Override
    public int compareTo(traductor o) {
        return this.palabraExtranjera.compareToIgnoreCase(o.getPalabraExtranjera());
    }
    
    
    public void guardarEntrada(String palabraExtranjera, String palabraEspanol){
        
        SortedMap<String, traductor> traduccion = new TreeMap<>();
        
        traduccion.put(palabraExtranjera, new traductor(palabraEspaniol, palabraExtranjera));
        
    }
    
    
    
}
