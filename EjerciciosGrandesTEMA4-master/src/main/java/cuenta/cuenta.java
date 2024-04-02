package cuenta;

import org.apache.commons.lang3.RandomStringUtils;


public class cuenta {
    
    //
    private String ncuenta; //20 digitos aleatorio 
    private String nif;
    private String nombre;
    private double saldo;
    private double interes; //interes del 0.1 y 3
    
    //Constructor
    public cuenta(String ncuenta, String nif, String nombre, double saldo, double interes) {
        this.ncuenta = ncuenta;
        this.nif = nif;
        this.nombre = nombre;
        this.saldo = saldo;
        this.interes = interes;
    }
    
    //Constructor por defecto
    public cuenta() {
    }
    
    
    private static String ncuenta() {
        
        String ncuenta = RandomStringUtils.randomNumeric(20);
        
        return ncuenta;
        
    }

    //Metodos getters y setters 
    public String getNcuenta() {
        return ncuenta;
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

    @Override
    public String toString() {
        return "cuenta{" + "ncuenta=" + ncuenta + ", nif=" + nif + ", nombre=" + nombre + ", saldo=" + saldo + ", interes=" + interes + '}';
    }
    
    
    
       
}
