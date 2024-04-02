package clases;

import java.util.Random;

public class Persona {

    //ATRIBUTOS ENCAPSULADOS
    private String nombre;
    private int edad;
    private String nif;
    private char sexo = 'O';
    private int peso; //En kg
    private int altura; //En m

    //CONSTRUCTOR POR DEFECTO
    public Persona(String nombre, int edad, char sexo, int peso, int altura, String nif) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = asignarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.nif = generarNIF();

    }

    public Persona() {
    }

    //Si el sexo es algo distinto a H M u O filtrar sexo sera false
    private static boolean filtrarSexo(char sexo) {

        return (sexo == 'H' || sexo == 'M' || sexo == 'O');
    }

    private char asignarSexo(char sexo) {
        char sex = filtrarSexo(sexo) ? sexo : 'O';

        return sex;
    }

    private static String generarNIF() {

        int numeroNIF;
        int letra;
        String letraNIF = "";

        Random numAleatorio = new Random();

        numeroNIF = numAleatorio.nextInt(00000000, 99999998 + 1);

        letra = numeroNIF % 23;

        switch (letra) {
            case 0:
                letraNIF = "T";
                break;
            case 1:
                letraNIF = "R";
                break;
            case 2:
                letraNIF = "W";
                break;
            case 3:
                letraNIF = "A";
                break;
            case 4:
                letraNIF = "G";
                break;
            case 5:
                letraNIF = "M";
                break;
            case 6:
                letraNIF = "Y";
                break;
            case 7:
                letraNIF = "F";
                break;
            case 8:
                letraNIF = "P";
                break;
            case 9:
                letraNIF = "D";
                break;
            case 10:
                letraNIF = "X";
                break;
            case 11:
                letraNIF = "B";
                break;
            case 12:
                letraNIF = "N";
                break;
            case 13:
                letraNIF = "J";
                break;
            case 14:
                letraNIF = "Z";
                break;
            case 15:
                letraNIF = "S";
                break;
            case 16:
                letraNIF = "Q";
                break;
            case 17:
                letraNIF = "V";
                break;
            case 18:
                letraNIF = "H";
                break;
            case 19:
                letraNIF = "L";
                break;
            case 20:
                letraNIF = "C";
                break;
            case 21:
                letraNIF = "K";
                break;
            case 22:
                letraNIF = "E";
                break;
        }

        String nif = Integer.toString(numeroNIF);

        String nifFin = nif + letraNIF;

        return nifFin;

    }

    //NO hace falta meter datos porque ya los tiene el objeto
    public boolean esMayorEdad() {

        return this.edad >= 18;
    }

    public float calcularIMC() {

        return (float) (this.peso / Math.pow((this.altura / 100), 2));
    }

    //Le pasamos el metodo dar like de la otra clase 
    public void darLike(Serie serie) {

        serie.darLike();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", nif=" + nif + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

}
