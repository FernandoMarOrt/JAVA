package ejercicioclase;

import org.apache.commons.lang3.RandomStringUtils;

public class Cuenta {

    //atributos
    private String nCuenta; //tiene 20 digitos aleatorios
    private String nif;
    private String nombre;
    private double saldo;
    private double interes; //Debe estar entre 0.1 y 3

    //constructor con el numero de cuenta aleatoria
    public Cuenta(String nif, String nombre, double saldo, double interes) {
        this.nCuenta = generarCuenta();
        this.nif = nif;
        this.nombre = nombre;
        this.saldo = saldo;
        this.interes = interes;

        //Si el interes es menor que 0.1 o mayor que 3 
        //inicializo interes a 0.1 si no lo dejo como estaba
        if (interes < 0.1 || interes > 3) {
            this.interes = 0.1;

        } else {
            this.interes = interes;
        }
    }

    public Cuenta() {
        this.nCuenta = generarCuenta();
    }

    //metodos getters y setters
    public String getnCeunta() {
        return nCuenta;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    //genera un numero de cuenta aleatorio de 20 digitos 
    private String generarCuenta() {
        String cuenta;
        cuenta = RandomStringUtils.randomNumeric(20);
        return cuenta;
    }

    //Metodo to string
    @Override
    public String toString() {
        return "Cuenta{" + "nCeunta=" + nCuenta + ", nif=" + nif + ", nombre=" + nombre + ", saldo=" + saldo + ", interes=" + interes + '}';
    }

}
