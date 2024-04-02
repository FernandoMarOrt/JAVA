package cajas;

public class CajaCarton {

    //ATRIBUTOS 
    private double ancho;
    private double alto;
    private double largo;
    private double peso;

    //CONSTRUCTOR
    public CajaCarton(double ancho, double alto, double largo, double peso) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
    }

    //METODOS ABRIR Y CERRAR 
    public void abrir() {

    }

    public void cerrar() {

    }

    //METODOS GETTERS Y SETTERS
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Genero el metodo polimorfico toString
    @Override
    public String toString() {
        return "CajaCarton{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + ", peso=" + peso + '}';
    }

}
