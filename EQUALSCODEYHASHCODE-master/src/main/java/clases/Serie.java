/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Objects;

/*
Titulo , Genero("Accion , comedia , scifi , drama"), sinopsis , numtemporadas 
productor 
*/
//Declaracion de la clase
public class Serie {
    
    //Atributos de clase (static)
    
    //ATRIBUTOS de instancia (NO STATIC)
    private String titulo;
    private String genero;
    private String sinopsis;
    private int numtemporadas;
    private String productor;
    private int numeroLikes;

    public Serie(String titulo, String genero, String sinopsis, int numtemporadas, String productor) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.numtemporadas = numtemporadas;
        this.productor = productor;
    }

    public Serie(String titulo, String genero, String sinopsis, int numtemporadas, String productor, int numeroLikes) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.numtemporadas = numtemporadas;
        this.productor = productor;
        this.numeroLikes = numeroLikes;
    }
    
    
    
    

    public Serie() {
        
        //Objetos apuntan null (es decir se inicializa al valor por defecto
        //Objetos a null
        //Numeros a 0
        //Boolean a false
        //DOuble a 0.0
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getNumtemporadas() {
        return numtemporadas;
    }

    public void setNumtemporadas(int numtemporadas) {
        this.numtemporadas = numtemporadas;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", genero=" + genero + ", sinopsis=" + sinopsis + ", numtemporadas=" + numtemporadas + ", productor=" + productor + ", numeroLikes=" + numeroLikes + '}';
    }

    //Hacemos que cuando den like sume +1
   public void darLike() {
       
       
       this.numeroLikes++;
       
   }
   
       public int getLikes() {
        return this.numeroLikes;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.titulo);
        hash = 67 * hash + Objects.hashCode(this.genero);
        hash = 67 * hash + Objects.hashCode(this.sinopsis);
        hash = 67 * hash + this.numtemporadas;
        hash = 67 * hash + Objects.hashCode(this.productor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //Significa basicamente si Serie s1 es igual a new Serie()
            return true;
        }
        if (obj == null) { //Si el objeto es nulo ya no son iguales
            return false;
        }
        if (getClass() != obj.getClass()) {//Aqui se da cuenta de que esta comprando objetos de la misma clase
            return false;
        }
        final Serie other = (Serie) obj; //Casting a obj y lo fuerza a ser de tipo serie para comparar sus atributos
        if (this.numtemporadas != other.numtemporadas) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.sinopsis, other.sinopsis)) {
            return false;
        }
        return Objects.equals(this.productor, other.productor);
    }
    
    
    
    
    
}
