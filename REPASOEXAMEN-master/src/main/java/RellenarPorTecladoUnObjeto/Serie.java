package RellenarPorTecladoUnObjeto;

import java.util.Objects;

/**
 *
 * @author alvaro
 */
public class Serie {
    
    //ATRIBUTOS DE CLASE (STATIC)
    
    //ATRIBUTO DE INSTANCIA (NO STATIC)
    private String titulo;
    private String genero;
    private String sinopsis;
    private String productor;
    private int nTemporadas;
    private int nLikes;
    
    //CONSTRUCTOR
    public Serie(String titulo, String genero, String sinopsis, String productor, int nTemporadas, int nLikes) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.productor = productor;
        this.nTemporadas = nTemporadas;
        this.nLikes = nLikes;
    }

    public Serie(String titulo, String genero, String sinopsis, String productor, int nTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.productor = productor;
        this.nTemporadas = nTemporadas;
    }
    
    public Serie() {
        //TODO QUEDA POR DEFECTO
    }
    
    //GETTER SETTER

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

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public int getnTemporadas() {
        return nTemporadas;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    //MEOTDO DAR LIKE
    public void darLike(){
        this.nLikes++;
    }
    
    //METODO TOOSTRING
    @Override
    public String toString() {
        return "Serie:" + "\ntitulo = " + titulo + "\nenero = " + genero + "\nsinopsis = " + sinopsis + "\nproductor = " + productor + "\nTemporadas = " + nTemporadas + "\nLIKES = " + nLikes + "\n";
    }
    
    //EQUALS , HASHCODE

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.titulo);
        hash = 53 * hash + Objects.hashCode(this.genero);
        hash = 53 * hash + Objects.hashCode(this.sinopsis);
        hash = 53 * hash + Objects.hashCode(this.productor);
        hash = 53 * hash + this.nTemporadas;
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
   
        final Serie other = (Serie) obj;
   
        if (this.nTemporadas != other.nTemporadas) {
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
